package org.telegram.messenger.voip;

import android.app.Activity;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Icon;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioAttributes;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.media.MediaRouter;
import android.media.RingtoneManager;
import android.media.SoundPool;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.Settings;
import android.telecom.CallAudioState;
import android.telecom.Connection;
import android.telecom.DisconnectCause;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.LruCache;
import android.view.KeyEvent;
import android.widget.RemoteViews;
import android.widget.Toast;
import j$.util.Map;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.OpusDred;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.VoIPFeedbackActivity;
import org.telegram.ui.VoIPPermissionActivity;
import org.webrtc.MediaStreamTrack;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class VoIPService extends Service implements SensorEventListener, AudioManager.OnAudioFocusChangeListener, fn7, VoIPServiceState {
    public static final String ACTION_HEADSET_PLUG = "android.intent.action.HEADSET_PLUG";
    public static final int AUDIO_ROUTE_BLUETOOTH = 2;
    public static final int AUDIO_ROUTE_EARPIECE = 0;
    public static final int AUDIO_ROUTE_SPEAKER = 1;
    public static final int CALL_MIN_LAYER = 65;
    public static final int CAPTURE_DEVICE_CAMERA = 0;
    public static final int CAPTURE_DEVICE_SCREEN = 1;
    public static final int DISCARD_REASON_CONVERT = 5;
    public static final int DISCARD_REASON_DISCONNECT = 2;
    public static final int DISCARD_REASON_HANGUP = 1;
    public static final int DISCARD_REASON_LINE_BUSY = 4;
    public static final int DISCARD_REASON_MISSED = 3;
    private static final int ID_INCOMING_CALL_NOTIFICATION = 202;
    public static final int ID_INCOMING_CALL_PRENOTIFICATION = 203;
    private static final int ID_ONGOING_CALL_NOTIFICATION = 201;
    private static final int MAX_PENDING_SIGNALING_DATA = 256;
    private static final int PROXIMITY_SCREEN_OFF_WAKE_LOCK = 32;
    public static final int QUALITY_FULL = 2;
    public static final int QUALITY_MEDIUM = 1;
    public static final int QUALITY_SMALL = 0;
    private static final long RTMP_STREAM_OUTPUT = Long.MIN_VALUE;
    public static final int STATE_BUSY = 17;
    public static final int STATE_CREATING = 6;
    public static final int STATE_ENDED = 11;
    public static final int STATE_ESTABLISHED = 3;
    public static final int STATE_EXCHANGING_KEYS = 12;
    public static final int STATE_FAILED = 4;
    public static final int STATE_HANGING_UP = 10;
    public static final int STATE_RECONNECTING = 5;
    public static final int STATE_REQUESTING = 14;
    public static final int STATE_RINGING = 16;
    public static final int STATE_WAITING = 13;
    public static final int STATE_WAITING_INCOMING = 15;
    public static final int STATE_WAIT_INIT = 1;
    public static final int STATE_WAIT_INIT_ACK = 2;
    public static NativeInstance.AudioLevelsCallback audioLevelsCallback;
    public static TL_phone.PhoneCall callIShouldHavePutIntoIntent;
    private static Runnable setModeRunnable;
    private static VoIPService sharedInstance;
    private byte[] a_or_b;
    private boolean audioConfigured;
    private AudioDeviceCallback audioDeviceCallback;
    private byte[] authKey;
    private boolean bluetoothScoActive;
    private boolean bluetoothScoConnecting;
    private boolean broadcastListenerRejoining;
    private g01 broadcastListenerSession;
    private BluetoothAdapter btAdapter;
    private int callDiscardReason;
    private int callReqId;
    private long callStartTime;
    private TLRPC.Chat chat;
    private int checkRequestId;
    private int classGuid;
    private AudioManager.OnCommunicationDeviceChangedListener communicationDeviceListener;
    public ConferenceCall conference;
    private Runnable connectingSoundRunnable;
    public long convertingFromCallWithUserId;
    private NativeInstance convertingVoip;
    private PowerManager.WakeLock cpuWakelock;
    private boolean createGroupCall;
    public String currentBluetoothDeviceName;
    public boolean currentGroupModeStreaming;
    private Runnable delayedStartOutgoingCall;
    private boolean didDeleteConnectionServiceContact;
    private boolean endCallAfterRequest;
    boolean fetchingBluetoothDeviceName;
    private boolean forceRating;
    private int foregroundId;
    private Notification foregroundNotification;
    private boolean foregroundStarted;
    private byte[] g_a;
    private byte[] g_a_hash;
    private boolean gotMediaProjection;
    public vc2 groupCall;
    private volatile CountDownLatch groupCallBottomSheetLatch;
    private TLRPC.InputPeer groupCallPeer;
    private boolean hasAudioFocus;
    public boolean hasFewPeers;
    private boolean instantAccept;
    private long[] inviteUsers;
    private HashSet<Long> inviteUsersToConference;
    private boolean inviteUsersToConferenceVideo;
    private boolean isBtHeadsetConnected;
    private volatile boolean isCallEnded;
    private boolean isHeadsetPlugged;
    private boolean isOutgoing;
    private boolean isPrivateScreencast;
    private boolean isProximityNear;
    public boolean isRtmpStream;
    private boolean isVideoAvailable;
    private TLRPC.InputGroupCall joinConference;
    private TLRPC.GroupCall joinConferenceCall;
    private String joinHash;
    private long keyFingerprint;
    private String lastError;
    private int lastForegroundType;
    private TLRPC.GroupCall lastGroupCallUpdate;
    private String lastLogFilePath;
    private NetworkInfo lastNetInfo;
    private SensorEvent lastSensorEvent;
    private long lastTypingTimeSend;
    private Boolean mHasEarpiece;
    private boolean micMute;
    public boolean micSwitching;
    private Boolean muteOnStart;
    private TLRPC.TL_dataJSON myParams;
    private boolean needPlayEndSound;
    private boolean needRateCall;
    private boolean needSendDebugLog;
    private boolean needSwitchToBluetoothAfterScoActivates;
    private boolean notificationsDisabled;
    private Runnable onDestroyRunnable;
    private boolean playedConnectedSound;
    private boolean playingSound;
    private Instance.TrafficStats prevTrafficStats;
    public TL_phone.PhoneCall privateCall;
    private PowerManager.WakeLock proximityWakelock;
    private boolean reconnectScreenCapture;
    private MediaPlayer ringtonePlayer;
    private rr9 rtmpStreamPlayer;
    private boolean rtmpStreamPlayerStarted;
    private boolean rtmpStreamRejoining;
    private sr9 rtmpStreamVideoSinks;
    private int scheduleDate;
    private Runnable shortPollRunnable;
    private int signalBarCount;
    private NativeInstance signalingTarget;
    private long signalingTargetCallId;
    private SoundPool soundPool;
    private int spAllowTalkId;
    private int spBusyId;
    private int spConnectingId;
    private int spEndId;
    private int spFailedID;
    private int spPlayId;
    private int spRingbackID;
    private int spStartRecordId;
    private int spVoiceChatConnecting;
    private int spVoiceChatEndId;
    private int spVoiceChatStartId;
    private boolean speakerphoneStateToSet;
    private boolean startedRinging;
    private boolean switchingAccount;
    private boolean switchingCamera;
    private boolean switchingStream;
    private Runnable switchingStreamTimeoutRunnable;
    private CallConnection systemCallConnection;
    private Runnable timeoutRunnable;
    private boolean unmutedByHold;
    private Runnable updateNotificationRunnable;
    private TLRPC.User user;
    private Vibrator vibrator;
    public boolean videoCall;
    private boolean wasConnected;
    private boolean wasEstablished;
    public static final boolean USE_CONNECTION_SERVICE = isDeviceCompatibleWithConnectionServiceAPI();
    private static final Object sync = new Object();
    private int currentAccount = -1;
    private int currentState = 0;
    private boolean isFrontFaceCamera = true;
    private int previousAudioOutput = -1;
    private ArrayList<StateListener> stateListeners = new ArrayList<>();
    private int remoteVideoState = 0;
    private int[] mySource = new int[2];
    private NativeInstance[] tgVoip = new NativeInstance[2];
    private final Object signalingLock = new Object();
    private final ArrayList<TL_update.TL_updatePhoneCallSignalingData> pendingSignalingData = new ArrayList<>();
    private long[] captureDevice = new long[2];
    private int[] videoState = {0, 0};
    private int remoteAudioState = 1;
    private int audioRouteToSet = 2;
    public final SharedUIParams sharedUIParams = new SharedUIParams();
    private ArrayList<TL_phone.PhoneCall> pendingUpdates = new ArrayList<>();
    private Runnable afterSoundRunnable = new 1();
    private BluetoothProfile.ServiceListener serviceListener = new BluetoothProfile.ServiceListener() { // from class: org.telegram.messenger.voip.VoIPService.2
        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
            try {
                if (Build.VERSION.SDK_INT < 31) {
                    Iterator<BluetoothDevice> it = bluetoothProfile.getConnectedDevices().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        BluetoothDevice next = it.next();
                        if (bluetoothProfile.getConnectionState(next) == 2) {
                            VoIPService.this.currentBluetoothDeviceName = next.getName();
                            break;
                        }
                    }
                }
                BluetoothAdapter.getDefaultAdapter().closeProfileProxy(i, bluetoothProfile);
                VoIPService.this.fetchingBluetoothDeviceName = false;
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i) {
        }
    };
    private BroadcastReceiver receiver = new BroadcastReceiver() { // from class: org.telegram.messenger.voip.VoIPService.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int i = 0;
            if (VoIPService.ACTION_HEADSET_PLUG.equals(intent.getAction())) {
                VoIPService.this.isHeadsetPlugged = intent.getIntExtra("state", 0) == 1;
                if (VoIPService.this.isHeadsetPlugged && VoIPService.this.proximityWakelock != null && VoIPService.this.proximityWakelock.isHeld()) {
                    VoIPService.this.proximityWakelock.release();
                }
                if (VoIPService.this.isHeadsetPlugged) {
                    VoipAudioManager voipAudioManager = VoipAudioManager.get();
                    if (voipAudioManager.isSpeakerphoneOn()) {
                        VoIPService.this.previousAudioOutput = 0;
                    } else {
                        boolean isBluetoothOn = voipAudioManager.isBluetoothOn();
                        VoIPService voIPService = VoIPService.this;
                        if (isBluetoothOn) {
                            voIPService.previousAudioOutput = 2;
                        } else {
                            voIPService.previousAudioOutput = 1;
                        }
                    }
                    VoIPService.this.setAudioOutput(1);
                } else if (VoIPService.this.previousAudioOutput >= 0) {
                    VoIPService voIPService2 = VoIPService.this;
                    voIPService2.setAudioOutput(voIPService2.previousAudioOutput);
                    VoIPService.this.previousAudioOutput = -1;
                }
                VoIPService.this.isProximityNear = false;
                VoIPService.this.updateOutputGainControlState();
                return;
            }
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                VoIPService.this.updateNetworkType();
                return;
            }
            if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                if (f11.a) {
                    cc4.d("bt headset state = " + intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0));
                }
                VoIPService.this.updateBluetoothHeadsetState(intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0) == 2);
                return;
            }
            if (!"android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(intent.getAction())) {
                if ("android.intent.action.PHONE_STATE".equals(intent.getAction())) {
                    if (TelephonyManager.EXTRA_STATE_OFFHOOK.equals(intent.getStringExtra("state"))) {
                        VoIPService.this.hangUp();
                        return;
                    }
                    return;
                }
                if (!"android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
                    if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                        while (i < VoIPService.this.stateListeners.size()) {
                            ((StateListener) VoIPService.this.stateListeners.get(i)).onScreenOnChange(true);
                            i++;
                        }
                        return;
                    } else {
                        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                            for (int i2 = 0; i2 < VoIPService.this.stateListeners.size(); i2++) {
                                ((StateListener) VoIPService.this.stateListeners.get(i2)).onScreenOnChange(false);
                            }
                            return;
                        }
                        return;
                    }
                }
                if (VoIPService.this.currentState != 15 || VoIPService.this.user == null) {
                    return;
                }
                int ringerMode = ((AudioManager) VoIPService.this.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).getRingerMode();
                VoIPService voIPService3 = VoIPService.this;
                if (ringerMode == 0) {
                    voIPService3.stopRinging();
                    return;
                } else {
                    if (voIPService3.ringtonePlayer == null) {
                        VoIPService voIPService4 = VoIPService.this;
                        voIPService4.startRingtoneAndVibration(voIPService4.user.id);
                        return;
                    }
                    return;
                }
            }
            int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0);
            if (f11.a) {
                cc4.d("Bluetooth SCO state updated: " + intExtra);
            }
            if (intExtra == 0 && VoIPService.this.isBtHeadsetConnected && (Build.VERSION.SDK_INT < 31 ? !(VoIPService.this.btAdapter.isEnabled() && jve.d("android.permission.BLUETOOTH_CONNECT") && VoIPService.this.btAdapter.getProfileConnectionState(1) == 2) : VoipAudioManager.get().findBluetoothDevice() == null)) {
                VoIPService.this.updateBluetoothHeadsetState(false);
                return;
            }
            VoIPService.this.bluetoothScoConnecting = intExtra == 2;
            VoIPService.this.bluetoothScoActive = intExtra == 1;
            if (VoIPService.this.bluetoothScoActive) {
                VoIPService.this.fetchBluetoothDeviceName();
                if (VoIPService.this.needSwitchToBluetoothAfterScoActivates) {
                    VoIPService.this.needSwitchToBluetoothAfterScoActivates = false;
                    VoipAudioManager voipAudioManager2 = VoipAudioManager.get();
                    voipAudioManager2.setSpeakerphoneOn(false);
                    voipAudioManager2.setBluetoothOn(true);
                }
            }
            ArrayList arrayList = VoIPService.this.stateListeners;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((StateListener) obj).onAudioSettingsChanged();
            }
        }
    };
    private final HashMap<String, TLRPC.GroupCallParticipant> waitingFrameParticipant = new HashMap<>();
    private final LruCache<String, ProxyVideoSink> proxyVideoSinkLruCache = new LruCache<String, ProxyVideoSink>(6) { // from class: org.telegram.messenger.voip.VoIPService.4
        @Override // android.util.LruCache
        public void entryRemoved(boolean z, String str, ProxyVideoSink proxyVideoSink, ProxyVideoSink proxyVideoSink2) {
            super.entryRemoved(z, (boolean) str, proxyVideoSink, proxyVideoSink2);
            VoIPService.this.removeIncomingVideoOutput(proxyVideoSink);
        }
    };
    private ProxyVideoSink[] localSink = new ProxyVideoSink[2];
    private ProxyVideoSink[] remoteSink = new ProxyVideoSink[2];
    private ProxyVideoSink[] currentBackgroundSink = new ProxyVideoSink[2];
    private String[] currentBackgroundEndpointId = new String[2];
    private HashMap<String, ProxyVideoSink> remoteSinks = new HashMap<>();
    private final HashMap<String, Integer> broadcastVideoCeilings = new HashMap<>();
    private final Runnable destroyConvertingRunnable = new bmc(this, 0);

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    class 1 implements Runnable {
        public 1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0() {
            VoIPService.this.soundPool.release();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$run$1(AudioManager audioManager) {
            synchronized (VoIPService.sync) {
                if (VoIPService.setModeRunnable == null) {
                    return;
                }
                VoIPService.setModeRunnable = null;
                try {
                    audioManager.setMode(0);
                } catch (SecurityException e) {
                    if (f11.a) {
                        cc4.e("Error setting audio more to normal", e);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            AudioManager audioManager = (AudioManager) VoIPService.this.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            audioManager.abandonAudioFocus(VoIPService.this);
            audioManager.unregisterMediaButtonEventReceiver(new ComponentName(VoIPService.this, (Class<?>) VoIPMediaButtonReceiver.class));
            if (VoIPService.this.audioDeviceCallback != null) {
                audioManager.unregisterAudioDeviceCallback(VoIPService.this.audioDeviceCallback);
            }
            if (VoIPService.this.communicationDeviceListener != null) {
                audioManager.removeOnCommunicationDeviceChangedListener(VoIPService.this.communicationDeviceListener);
                VoIPService.this.communicationDeviceListener = null;
            }
            byte b = 0;
            if (!VoIPService.USE_CONNECTION_SERVICE && VoIPService.sharedInstance == null) {
                if (VoIPService.this.isBtHeadsetConnected) {
                    voipAudioManager.stopBluetooth();
                    voipAudioManager.setBluetoothOn(false);
                    VoIPService.this.bluetoothScoActive = false;
                    VoIPService.this.bluetoothScoConnecting = false;
                }
                voipAudioManager.setSpeakerphoneOn(false);
            }
            Utilities.e.c(new e(this, b));
            to3 to3Var = Utilities.e;
            e eVar = new e(audioManager, (byte) 1);
            VoIPService.setModeRunnable = eVar;
            to3Var.c(eVar);
        }
    }

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    class 10 implements Runnable {
        public 10() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0() {
            if (VoIPService.this.spPlayId == 0) {
                VoIPService voIPService = VoIPService.this;
                voIPService.spPlayId = voIPService.soundPool.play(VoIPService.this.spConnectingId, 1.0f, 1.0f, 0, -1, 1.0f);
            }
            if (VoIPService.this.spPlayId == 0) {
                hl.d3(this, 100L);
            } else {
                VoIPService.this.connectingSoundRunnable = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VoIPService.sharedInstance == null) {
                return;
            }
            Utilities.e.c(new e(this, (byte) 2));
        }
    }

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    class 5 implements VideoSink {
        final /* synthetic */ String val$endpointId;
        final /* synthetic */ boolean val$screencast;

        public 5(String str, boolean z) {
            this.val$endpointId = str;
            this.val$screencast = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFrame$0(String str, VideoSink videoSink, boolean z) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) VoIPService.this.waitingFrameParticipant.remove(str);
            ProxyVideoSink proxyVideoSink = (ProxyVideoSink) VoIPService.this.remoteSinks.get(str);
            if (proxyVideoSink != null && proxyVideoSink.target == videoSink && proxyVideoSink.hasExtras()) {
                proxyVideoSink.setTarget(null);
            } else if (proxyVideoSink != null && proxyVideoSink.target == videoSink) {
                VoIPService.this.proxyVideoSinkLruCache.put(str, proxyVideoSink);
                VoIPService.this.remoteSinks.remove(str);
                proxyVideoSink.setTarget(null);
            }
            if (groupCallParticipant != null) {
                if (z) {
                    groupCallParticipant.hasPresentationFrame = 2;
                } else {
                    groupCallParticipant.hasCameraFrame = 2;
                }
            }
            vc2 vc2Var = VoIPService.this.groupCall;
            if (vc2Var != null) {
                vc2Var.D();
            }
        }

        @Override // org.webrtc.VideoSink
        public void onFrame(VideoFrame videoFrame) {
            if (videoFrame == null || videoFrame.getBuffer().getHeight() == 0 || videoFrame.getBuffer().getWidth() == 0) {
                return;
            }
            final String str = this.val$endpointId;
            final boolean z = this.val$screencast;
            hl.c3(new Runnable() { // from class: org.telegram.messenger.voip.f
                @Override // java.lang.Runnable
                public final void run() {
                    VoIPService.5.this.lambda$onFrame$0(str, this, z);
                }
            });
        }
    }

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    class 6 implements lr9 {
        final /* synthetic */ vc2 val$call;

        public 6(vc2 vc2Var) {
            this.val$call = vc2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onRejoinRequested$1(vc2 vc2Var) {
            VoIPService voIPService = VoIPService.this;
            if (voIPService.groupCall == vc2Var) {
                voIPService.rtmpStreamRejoining = true;
                VoIPService.this.createGroupInstance(0, false, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onStreamChannels$0(vc2 vc2Var, ArrayList arrayList) {
            if (VoIPService.this.groupCall != vc2Var || vc2Var.B || arrayList.isEmpty()) {
                return;
            }
            vc2Var.g(arrayList);
            vc2Var.B = true;
        }

        @Override // lr9
        public void onRejoinRequested() {
            final vc2 vc2Var = this.val$call;
            hl.c3(new Runnable() { // from class: org.telegram.messenger.voip.g
                @Override // java.lang.Runnable
                public final void run() {
                    VoIPService.6.this.lambda$onRejoinRequested$1(vc2Var);
                }
            });
        }

        @Override // lr9
        public void onStreamChannels(final ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList) {
            final vc2 vc2Var = this.val$call;
            hl.c3(new Runnable() { // from class: org.telegram.messenger.voip.h
                @Override // java.lang.Runnable
                public final void run() {
                    VoIPService.6.this.lambda$onStreamChannels$0(vc2Var, arrayList);
                }
            });
        }
    }

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    public class CallConnection extends Connection {
        public CallConnection() {
            setConnectionProperties(128);
            setAudioModeIsVoip(true);
        }

        @Override // android.telecom.Connection
        public void onAnswer() {
            VoIPService.this.acceptIncomingCallFromNotification();
        }

        @Override // android.telecom.Connection
        public void onCallAudioStateChanged(CallAudioState callAudioState) {
            if (f11.a) {
                cc4.b("ConnectionService call audio state changed: " + callAudioState);
            }
            ArrayList arrayList = VoIPService.this.stateListeners;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((StateListener) obj).onAudioSettingsChanged();
            }
        }

        @Override // android.telecom.Connection
        public void onCallEvent(String str, Bundle bundle) {
            super.onCallEvent(str, bundle);
            if (f11.a) {
                cc4.b("ConnectionService onCallEvent " + str);
            }
        }

        @Override // android.telecom.Connection
        public void onDisconnect() {
            if (f11.a) {
                cc4.b("ConnectionService onDisconnect");
            }
            setDisconnected(new DisconnectCause(2));
            destroy();
            VoIPService.this.systemCallConnection = null;
            VoIPService.this.hangUp();
        }

        @Override // android.telecom.Connection
        public void onReject() {
            VoIPService.this.needPlayEndSound = false;
            VoIPService.this.declineIncomingCall(1, null);
        }

        @Override // android.telecom.Connection
        public void onShowIncomingCallUi() {
            VoIPService.this.startRinging();
        }

        @Override // android.telecom.Connection
        public void onSilence() {
            if (f11.a) {
                cc4.b("onSlience");
            }
            VoIPService.this.stopRinging();
        }

        @Override // android.telecom.Connection
        public void onStateChanged(int i) {
            super.onStateChanged(i);
            if (f11.a) {
                cc4.b("ConnectionService onStateChanged " + Connection.stateToString(i));
            }
            if (i == 4) {
                lv2.r(VoIPService.this.currentAccount).h();
                VoIPService.this.didDeleteConnectionServiceContact = true;
            }
        }
    }

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    public static class ProxyVideoSink implements VideoSink {
        private VideoSink background;
        private final ArrayList<VideoSink> extras = new ArrayList<>(1);
        private long nativeInstance;
        private VideoSink target;

        private static void setParentSink(VideoSink videoSink, VideoSink videoSink2) {
            if (videoSink instanceof bnb) {
                ((bnb) videoSink).setParentSink(videoSink2);
            }
        }

        public synchronized void addExtra(VideoSink videoSink) {
            if (!this.extras.contains(videoSink)) {
                this.extras.add(videoSink);
            }
        }

        public synchronized boolean hasExtras() {
            return !this.extras.isEmpty();
        }

        public synchronized boolean isUnused() {
            boolean z;
            if (this.target == null && this.background == null) {
                z = this.extras.isEmpty();
            }
            return z;
        }

        @Override // org.webrtc.VideoSink
        public synchronized void onFrame(VideoFrame videoFrame) {
            VideoSink videoSink = this.target;
            if (videoSink != null) {
                videoSink.onFrame(videoFrame);
            }
            VideoSink videoSink2 = this.background;
            if (videoSink2 != null) {
                videoSink2.onFrame(videoFrame);
            }
            for (int i = 0; i < this.extras.size(); i++) {
                this.extras.get(i).onFrame(videoFrame);
            }
        }

        public synchronized void removeBackground(VideoSink videoSink) {
            if (this.background == videoSink) {
                this.background = null;
            }
        }

        public synchronized void removeExtra(VideoSink videoSink) {
            this.extras.remove(videoSink);
        }

        public synchronized void removeTarget(VideoSink videoSink) {
            if (this.target == videoSink) {
                this.target = null;
            }
        }

        public synchronized void setBackground(VideoSink videoSink) {
            VideoSink videoSink2 = this.background;
            if (videoSink2 != null) {
                setParentSink(videoSink2, null);
            }
            this.background = videoSink;
            if (videoSink != null) {
                setParentSink(videoSink, this);
            }
        }

        public synchronized void setTarget(VideoSink videoSink) {
            VideoSink videoSink2 = this.target;
            if (videoSink2 != videoSink) {
                if (videoSink2 != null) {
                    setParentSink(videoSink2, null);
                }
                this.target = videoSink;
                if (videoSink != null) {
                    setParentSink(videoSink, this);
                }
            }
        }

        public synchronized void swap() {
            VideoSink videoSink;
            if (this.target != null && (videoSink = this.background) != null) {
                this.target = videoSink;
                this.background = null;
            }
        }
    }

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    public static class RequestedParticipant {
        public int audioSsrc;
        public TLRPC.GroupCallParticipant participant;
        public long userId;

        public RequestedParticipant(TLRPC.GroupCallParticipant groupCallParticipant, int i) {
            this.participant = groupCallParticipant;
            this.audioSsrc = i;
            this.userId = groupCallParticipant == null ? 0L : wf3.n(groupCallParticipant.peer);
        }
    }

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    /* loaded from: classes2.dex */
    public static class SharedUIParams {
        public boolean cameraAlertWasShowed;
        public boolean tapToVideoTooltipWasShowed;
        public boolean wasVideoCall;
    }

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    public interface StateListener {
        void onAudioSettingsChanged();

        void onCameraFirstFrameAvailable();

        void onCameraSwitch(boolean z);

        void onMediaStateUpdated(int i, int i2);

        void onScreenOnChange(boolean z);

        void onSignalBarsCountChanged(int i);

        void onStateChanged(int i);

        void onVideoAvailableChange(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void acceptIncomingCallFromNotification() {
        showNotification();
        if (checkSelfPermission("android.permission.RECORD_AUDIO") != 0 || (this.privateCall.video && checkSelfPermission("android.permission.CAMERA") != 0)) {
            try {
                PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) VoIPPermissionActivity.class).addFlags(TLObject.FLAG_28), 1107296256).send();
                return;
            } catch (Exception e) {
                if (f11.a) {
                    cc4.e("Error starting permission activity", e);
                    return;
                }
                return;
            }
        }
        acceptIncomingCall();
        try {
            PendingIntent.getActivity(this, 0, new Intent(this, getUIActivityClass()).setAction("voip"), 33554432).send();
        } catch (Exception e2) {
            if (f11.a) {
                cc4.e("Error starting incall activity", e2);
            }
        }
    }

    private void acknowledgeCall(boolean z) {
        TL_phone.PhoneCall phoneCall = this.privateCall;
        if (phoneCall == null) {
            if (f11.a) {
                cc4.l("Call is null, wtf");
            }
            stopSelf();
            return;
        }
        if (phoneCall instanceof TL_phone.TL_phoneCallDiscarded) {
            if (f11.a) {
                cc4.l("Call " + this.privateCall.id + " was discarded before the service started, stopping");
            }
            stopSelf();
            return;
        }
        if (f3f.b() && !f3f.a() && ((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (f11.a) {
                cc4.d("MIUI: no permission to show when locked but the screen is locked. ¯\\_(ツ)_/¯");
            }
            stopSelf();
            return;
        }
        TL_phone.receivedCall receivedcall = new TL_phone.receivedCall();
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        receivedcall.peer = tL_inputPhoneCall;
        TL_phone.PhoneCall phoneCall2 = this.privateCall;
        tL_inputPhoneCall.id = phoneCall2.id;
        tL_inputPhoneCall.access_hash = phoneCall2.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(receivedcall, new q81((byte) 12, this, z), 65536);
    }

    private PhoneAccountHandle addAccountToTelecomManager() {
        TelecomManager telecomManager = (TelecomManager) getSystemService("telecom");
        TLRPC.User f = yac.h(this.currentAccount).f();
        PhoneAccountHandle phoneAccountHandle = new PhoneAccountHandle(new ComponentName(this, (Class<?>) TelegramConnectionService.class), String.valueOf(f.id));
        telecomManager.registerPhoneAccount(new PhoneAccount.Builder(phoneAccountHandle, lv2.m(0, f.first_name, f.last_name)).setCapabilities(2048).setIcon(Icon.createWithResource(this, R.drawable.ic_launcher_dr)).setHighlightColor(-13851168).addSupportedUriScheme("sip").build());
        return phoneAccountHandle;
    }

    private long addIncomingVideoOutput(String str, TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo, ProxyVideoSink proxyVideoSink, long j) {
        if ("unified".equals(str) && isRtmpStreamCall() && getRtmpStreamPlayer() != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.rtmpStreamVideoSinks.a;
            if (proxyVideoSink == null || copyOnWriteArrayList.contains(proxyVideoSink)) {
                return RTMP_STREAM_OUTPUT;
            }
            copyOnWriteArrayList.add(proxyVideoSink);
            return RTMP_STREAM_OUTPUT;
        }
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance == null) {
            return 0L;
        }
        long addIncomingVideoOutput = nativeInstance.addIncomingVideoOutput(1, str, createSsrcGroups(tL_groupCallParticipantVideo), proxyVideoSink, j);
        hl.c3(new glc(this, (byte) 16));
        return addIncomingVideoOutput;
    }

    private void attachSignalingTarget(NativeInstance nativeInstance, long j) {
        synchronized (this.signalingLock) {
            this.signalingTarget = nativeInstance;
            this.signalingTargetCallId = j;
            int size = this.pendingSignalingData.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                TL_update.TL_updatePhoneCallSignalingData tL_updatePhoneCallSignalingData = this.pendingSignalingData.get(i2);
                if (tL_updatePhoneCallSignalingData.phone_call_id == j) {
                    nativeInstance.onSignalingDataReceive(tL_updatePhoneCallSignalingData.data);
                    i++;
                }
            }
            if (f11.a && !this.pendingSignalingData.isEmpty()) {
                cc4.b("delivered " + i + " of " + this.pendingSignalingData.size() + " signaling packets received before the call instance existed");
            }
            this.pendingSignalingData.clear();
        }
    }

    private void broadcastUnknownParticipants(long j, int[] iArr) {
        if (this.groupCall == null || this.tgVoip[0] == null) {
            return;
        }
        long selfId = getSelfId();
        int length = iArr.length;
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.groupCall.p.get(iArr[i]);
            if (groupCallParticipant == null && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.groupCall.q.get(iArr[i])) == null) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) this.groupCall.r.get(iArr[i]);
            }
            if (groupCallParticipant != null && r47.B1(groupCallParticipant.peer) != selfId && groupCallParticipant.source != 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(new RequestedParticipant(groupCallParticipant, iArr[i]));
            }
        }
        if (arrayList != null) {
            this.tgVoip[0].onMediaDescriptionAvailable(j, (RequestedParticipant[]) arrayList.toArray(new RequestedParticipant[0]));
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                RequestedParticipant requestedParticipant = (RequestedParticipant) arrayList.get(i2);
                boolean z = requestedParticipant.participant.muted_by_you;
                NativeInstance[] nativeInstanceArr = this.tgVoip;
                if (z) {
                    nativeInstanceArr[0].setVolume(requestedParticipant.audioSsrc, 0.0d);
                } else {
                    nativeInstanceArr[0].setVolume(requestedParticipant.audioSsrc, xc2.H(r0) / 10000.0d);
                }
            }
        }
    }

    private void callEnded() {
        if (f11.a) {
            cc4.b("Call " + getCallID() + " ended");
        }
        this.isCallEnded = true;
        if (this.groupCall != null && (!this.playedConnectedSound || this.onDestroyRunnable != null)) {
            this.needPlayEndSound = false;
        }
        hl.c3(new glc(this, (byte) 6));
        Utilities.e.c(new glc(this, (byte) 7));
        Runnable runnable = this.connectingSoundRunnable;
        if (runnable != null) {
            hl.r(runnable);
            this.connectingSoundRunnable = null;
        }
        int i = 700;
        if (this.needPlayEndSound) {
            this.playingSound = true;
            if (this.groupCall == null) {
                Utilities.e.c(new glc(this, (byte) 8));
            } else {
                Utilities.e.d(new glc(this, (byte) 9), 100L);
                i = 500;
            }
            hl.d3(this.afterSoundRunnable, i);
        }
        Runnable runnable2 = this.timeoutRunnable;
        if (runnable2 != null) {
            hl.r(runnable2);
            this.timeoutRunnable = null;
        }
        endConnectionServiceCall(this.needPlayEndSound ? i : 0L);
        stopSelf();
    }

    private void callFailed(String str) {
        CallConnection callConnection;
        if (this.privateCall != null) {
            if (f11.a) {
                cc4.b("Discarding failed call");
            }
            TL_phone.discardCall discardcall = new TL_phone.discardCall();
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            discardcall.peer = tL_inputPhoneCall;
            TL_phone.PhoneCall phoneCall = this.privateCall;
            tL_inputPhoneCall.access_hash = phoneCall.access_hash;
            tL_inputPhoneCall.id = phoneCall.id;
            discardcall.duration = (int) (getCallDuration() / 1000);
            NativeInstance nativeInstance = this.tgVoip[0];
            discardcall.connection_id = nativeInstance != null ? nativeInstance.getPreferredRelayId() : 0L;
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonDisconnect();
            cc4.d("discardCall " + discardcall.reason);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardcall, new xe2((byte) 13));
        }
        try {
            throw new Exception("Call " + getCallID() + " failed with error: " + str);
        } catch (Exception e) {
            cc4.g(e, true);
            this.lastError = str;
            hl.c3(new glc(this, (byte) 4));
            if (TextUtils.equals(str, Instance.ERROR_LOCALIZED) && this.soundPool != null) {
                this.playingSound = true;
                Utilities.e.c(new glc(this, (byte) 5));
                hl.d3(this.afterSoundRunnable, 1000L);
            }
            if (USE_CONNECTION_SERVICE && (callConnection = this.systemCallConnection) != null) {
                callConnection.setDisconnected(new DisconnectCause(1));
                this.systemCallConnection.destroy();
                this.systemCallConnection = null;
            }
            stopSelf();
        }
    }

    private void cancelGroupCheckShortPoll() {
        int[] iArr = this.mySource;
        if (iArr[1] == 0 && iArr[0] == 0) {
            if (this.checkRequestId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.checkRequestId, false);
                this.checkRequestId = 0;
            }
            Runnable runnable = this.shortPollRunnable;
            if (runnable != null) {
                hl.r(runnable);
                this.shortPollRunnable = null;
            }
        }
    }

    private void checkIsNear(boolean z) {
        if (z != this.isProximityNear) {
            if (f11.a) {
                cc4.b("proximity " + z);
            }
            this.isProximityNear = z;
            try {
                PowerManager.WakeLock wakeLock = this.proximityWakelock;
                if (z) {
                    wakeLock.acquire();
                } else {
                    wakeLock.release(1);
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkUpdateBluetoothHeadset() {
        BluetoothAdapter bluetoothAdapter;
        boolean z;
        if (USE_CONNECTION_SERVICE || (bluetoothAdapter = this.btAdapter) == null || !bluetoothAdapter.isEnabled()) {
            return;
        }
        try {
            MediaRouter mediaRouter = (MediaRouter) getSystemService("media_router");
            AudioManager audioManager = (AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            int i = Build.VERSION.SDK_INT;
            int i2 = 0;
            if (i >= 31) {
                AudioDeviceInfo findBluetoothDevice = VoipAudioManager.get().findBluetoothDevice();
                if (findBluetoothDevice != null) {
                    this.currentBluetoothDeviceName = findBluetoothDevice.getProductName().toString();
                    z = true;
                } else {
                    z = false;
                }
                updateBluetoothHeadsetState(z);
                ArrayList<StateListener> arrayList = this.stateListeners;
                int size = arrayList.size();
                while (i2 < size) {
                    StateListener stateListener = arrayList.get(i2);
                    i2++;
                    stateListener.onAudioSettingsChanged();
                }
                return;
            }
            if (i < 24) {
                updateBluetoothHeadsetState(this.btAdapter.getProfileConnectionState(1) == 2);
                ArrayList<StateListener> arrayList2 = this.stateListeners;
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    StateListener stateListener2 = arrayList2.get(i2);
                    i2++;
                    stateListener2.onAudioSettingsChanged();
                }
                return;
            }
            MediaRouter.RouteInfo selectedRoute = mediaRouter.getSelectedRoute(1);
            if (!jve.d("android.permission.BLUETOOTH_CONNECT") || selectedRoute.getDeviceType() != 3) {
                updateBluetoothHeadsetState(audioManager.isBluetoothA2dpOn());
                return;
            }
            updateBluetoothHeadsetState(this.btAdapter.getProfileConnectionState(1) == 2);
            ArrayList<StateListener> arrayList3 = this.stateListeners;
            int size3 = arrayList3.size();
            while (i2 < size3) {
                StateListener stateListener3 = arrayList3.get(i2);
                i2++;
                stateListener3.onAudioSettingsChanged();
            }
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    public static int compareLibraryVersions(String str, String str2) {
        String[] split = str == null ? new String[0] : str.split("\\.");
        String[] split2 = str2 == null ? new String[0] : str2.split("\\.");
        int max = Math.max(split.length, split2.length);
        int i = 0;
        while (i < max) {
            int intValue = i < split.length ? Utilities.z(split[i]).intValue() : 0;
            int intValue2 = i < split2.length ? Utilities.z(split2[i]).intValue() : 0;
            if (intValue != intValue2) {
                return Integer.compare(intValue, intValue2);
            }
            i++;
        }
        return 0;
    }

    private void configureDeviceForCall() {
        if (f11.a) {
            c00.q(this.audioRouteToSet, new StringBuilder("configureDeviceForCall, route to set = "));
        }
        byte b = 1;
        CallAudioDevice.setPlayoutUsage(hasRtmpStream() ? 1 : 2);
        CallAudioDevice.setPlayoutStreamType(hasRtmpStream() ? TLObject.FLAG_31 : 0);
        this.needPlayEndSound = true;
        AudioManager audioManager = (AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (!USE_CONNECTION_SERVICE) {
            Utilities.e.c(new amc(this, audioManager, b));
        }
        SensorManager sensorManager = (SensorManager) getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(8);
        if (defaultSensor != null) {
            try {
                this.proximityWakelock = ((PowerManager) getSystemService("power")).newWakeLock(32, "telegram-voip-prx");
                sensorManager.registerListener(this, defaultSensor, 3);
            } catch (Exception e) {
                if (f11.a) {
                    cc4.e("Error initializing proximity sensor", e);
                }
            }
        }
    }

    private int convertDataSavingMode(int i) {
        return i != 3 ? i : org.telegram.messenger.a.s() ? 1 : 0;
    }

    public static String convertStreamToString(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(readLine);
            sb.append("\n");
        }
    }

    private void createFirstGroupInstance() {
        if (isRtmpStreamCall()) {
            createGroupInstance(0, false, true);
        } else {
            OpusDred.whenReadyForGroupCall(this.currentAccount, new glc(this, (byte) 23));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createGroupInstance(int i, boolean z, boolean z2) {
        boolean z3;
        String valueOf;
        if (z) {
            this.mySource[i] = 0;
            if (i == 0) {
                this.switchingAccount = z;
            }
        }
        cancelGroupCheckShortPoll();
        if (i == 0) {
            this.wasConnected = false;
            if (this.tgVoip[i] == null && isRtmpStreamCall()) {
                int nextInt = (Utilities.b.nextInt() & ConnectionsManager.DEFAULT_DATACENTER_ID) | 1;
                startGroupCall(nextInt, qd4.n(nextInt, "{\"fingerprints\": [], \"ufrag\": \"\", \"pwd\": \"\", \"ssrc\": ", ", \"ssrc-groups\": []}"), true);
                return;
            }
        } else if (!this.wasConnected) {
            this.reconnectScreenCapture = true;
            return;
        }
        if (this.tgVoip[i] == null) {
            vc2 vc2Var = this.groupCall;
            if (vc2Var != null) {
                valueOf = String.valueOf(vc2Var.b.id);
            } else {
                TLRPC.InputGroupCall inputGroupCall = this.joinConference;
                valueOf = inputGroupCall instanceof TLRPC.TL_inputGroupCallSlug ? inputGroupCall.slug : inputGroupCall instanceof TLRPC.TL_inputGroupCall ? String.valueOf(inputGroupCall.id) : "0";
            }
            boolean[] zArr = {z2};
            boolean z4 = f11.a;
            this.tgVoip[i] = NativeInstance.makeGroup(xkc.d("voip_" + i + "_" + valueOf), this.captureDevice[i], i == 1, i == 0 && xea.E0, new bf((Object) this, i, (Object) zArr, (byte) 21), new zlc(this, i), new zlc(this, i), this.conference != null, i == 1 ? 0 : CallAudioDevice.getMode(this.currentAccount), GroupCallEngine.isReference(this.currentAccount), i == 1 ? OpusDred.GroupSettings.NONE : OpusDred.forGroupCall(this.currentAccount));
            this.tgVoip[i].setOnStateUpdatedListener(new zlc(this, i));
            if (i == 0) {
                this.tgVoip[i].setBroadcastStateCallback(new rlc(this));
            }
            z3 = true;
        } else {
            z3 = false;
        }
        this.tgVoip[i].resetGroupInstance(!z3, false);
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall != null && conferenceCall.getCallId() != -1) {
            this.tgVoip[i].setConferenceCallId(this.conference.getCallId());
        }
        if (i == 0) {
            dispatchStateChanged(1);
        }
    }

    private NativeInstance.SsrcGroup[] createSsrcGroups(TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo) {
        if (tL_groupCallParticipantVideo.source_groups.isEmpty()) {
            return null;
        }
        int size = tL_groupCallParticipantVideo.source_groups.size();
        NativeInstance.SsrcGroup[] ssrcGroupArr = new NativeInstance.SsrcGroup[size];
        for (int i = 0; i < size; i++) {
            ssrcGroupArr[i] = new NativeInstance.SsrcGroup();
            TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i);
            NativeInstance.SsrcGroup ssrcGroup = ssrcGroupArr[i];
            ssrcGroup.semantics = tL_groupCallParticipantVideoSourceGroup.semantics;
            ssrcGroup.ssrcs = new int[tL_groupCallParticipantVideoSourceGroup.sources.size()];
            int i2 = 0;
            while (true) {
                int[] iArr = ssrcGroupArr[i].ssrcs;
                if (i2 < iArr.length) {
                    iArr[i2] = tL_groupCallParticipantVideoSourceGroup.sources.get(i2).intValue();
                    i2++;
                }
            }
        }
        return ssrcGroupArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyConverting() {
        hl.r(this.destroyConvertingRunnable);
        if (this.convertingVoip != null) {
            cc4.e("destroyConverting!!", new Exception());
            this.callStartTime = 0L;
            a2b c = a2b.c(this.currentAccount);
            int statsNetworkType = getStatsNetworkType();
            int callDuration = ((int) (getCallDuration() / 1000)) % 5;
            int[] iArr = c.n;
            iArr[statsNetworkType] = iArr[statsNetworkType] + callDuration;
            c.m();
            onTgVoipPreStop();
            Instance.FinalState stop = this.convertingVoip.stop();
            updateTrafficStats(this.convertingVoip, stop.trafficStats);
            onTgVoipStop(stop);
            Instance.destroyInstance();
            this.convertingVoip = null;
            for (int i = 0; i < this.stateListeners.size(); i++) {
                this.stateListeners.get(i).onStateChanged(getCallState());
            }
            NativeInstance nativeInstance = this.tgVoip[0];
            if (nativeInstance != null) {
                nativeInstance.setMuteMicrophone(this.micMute);
            }
        }
    }

    private void detachSignalingTarget() {
        synchronized (this.signalingLock) {
            this.signalingTarget = null;
            this.signalingTargetCallId = 0L;
            this.pendingSignalingData.clear();
        }
    }

    private void dispatchStateChanged(int i) {
        CallConnection callConnection;
        if (f11.a) {
            cc4.b("== Call " + getCallID() + " state changed to " + i + " ==");
        }
        this.currentState = i;
        if (i == 3) {
            destroyConverting();
        }
        if (USE_CONNECTION_SERVICE && i == 3 && (callConnection = this.systemCallConnection) != null) {
            callConnection.setActive();
        }
        for (int i2 = 0; i2 < this.stateListeners.size(); i2++) {
            this.stateListeners.get(i2).onStateChanged(i);
        }
    }

    private void endConnectionServiceCall(long j) {
        if (USE_CONNECTION_SERVICE) {
            glc glcVar = new glc(this, (byte) 0);
            if (j > 0) {
                hl.d3(glcVar, j);
            } else {
                glcVar.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fetchBluetoothDeviceName() {
        if (this.fetchingBluetoothDeviceName) {
            return;
        }
        try {
            this.currentBluetoothDeviceName = null;
            this.fetchingBluetoothDeviceName = true;
            BluetoothAdapter.getDefaultAdapter().getProfileProxy(this, this.serviceListener, 1);
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    private NetworkInfo getActiveNetworkInfo() {
        return ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
    }

    private static int getCurrentForegroundType(ContextWrapper contextWrapper, boolean z) {
        if (Build.VERSION.SDK_INT < 29) {
            return jn7.C3;
        }
        int i = contextWrapper.checkSelfPermission("android.permission.CAMERA") == 0 ? 64 : 0;
        if (contextWrapper.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            i |= 128;
        }
        if (z) {
            i |= 32;
        }
        return i | 2;
    }

    private String[] getEmoji() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(this.authKey);
            byteArrayOutputStream.write(this.g_a);
        } catch (IOException unused) {
        }
        return EncryptionKeyEmojifier.emojifyForCall(Utilities.o(byteArrayOutputStream.size(), byteArrayOutputStream.toByteArray()));
    }

    private int getNetworkType() {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
        this.lastNetInfo = activeNetworkInfo;
        if (activeNetworkInfo == null) {
            return 0;
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            if (type != 1) {
                return type == 9 ? 7 : 0;
            }
            return 6;
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
                return 1;
            case 2:
            case 7:
                return 2;
            case 3:
            case 5:
                return 3;
            case 4:
            case 11:
            case 14:
            default:
                return 11;
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 15:
                return 4;
            case 13:
                return 5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap getRoundAvatarBitmap(Context context, int i, TLObject tLObject) {
        TLRPC.ChatPhoto chatPhoto;
        Bitmap bitmap = null;
        try {
        } catch (Throwable th) {
            cc4.g(th, true);
        }
        if (!(tLObject instanceof TLRPC.User)) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            if (chat != null && (chatPhoto = chat.photo) != null && chatPhoto.photo_small != null) {
                BitmapDrawable y = in5.z().y(chat.photo.photo_small);
                if (y != null) {
                    bitmap = y.getBitmap().copy(Bitmap.Config.ARGB_8888, true);
                } else {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inMutable = true;
                        xb4.G(i);
                        bitmap = BitmapFactory.decodeFile(xb4.J(chat.photo.photo_small, null, true, true).toString(), options);
                    } catch (Throwable th2) {
                        cc4.g(th2, true);
                    }
                }
            }
            if (bitmap == null) {
            }
            Canvas canvas = new Canvas(bitmap);
            Path path = new Path();
            path.addCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, Path.Direction.CW);
            path.toggleInverseFillType();
            Paint paint = new Paint(1);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.drawPath(path, paint);
            return bitmap;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_small != null) {
            BitmapDrawable y2 = in5.z().y(user.photo.photo_small);
            if (y2 != null) {
                bitmap = y2.getBitmap().copy(Bitmap.Config.ARGB_8888, true);
            } else {
                try {
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inMutable = true;
                    xb4.G(i);
                    bitmap = BitmapFactory.decodeFile(xb4.J(user.photo.photo_small, null, true, true).toString(), options2);
                } catch (Throwable th3) {
                    cc4.g(th3, true);
                }
            }
        }
        if (bitmap == null) {
            aob.S(context);
            rb0 rb0Var = tLObject instanceof TLRPC.User ? new rb0(0, (TLRPC.User) tLObject) : new rb0((TLRPC.Chat) tLObject);
            bitmap = Bitmap.createBitmap(hl.L(42.0f), hl.L(42.0f), Bitmap.Config.ARGB_8888);
            rb0Var.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
            rb0Var.draw(new Canvas(bitmap));
        }
        Canvas canvas2 = new Canvas(bitmap);
        Path path2 = new Path();
        path2.addCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, Path.Direction.CW);
        path2.toggleInverseFillType();
        Paint paint2 = new Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas2.drawPath(path2, paint2);
        return bitmap;
        cc4.g(th, true);
        if (bitmap == null) {
        }
        Canvas canvas22 = new Canvas(bitmap);
        Path path22 = new Path();
        path22.addCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, Path.Direction.CW);
        path22.toggleInverseFillType();
        Paint paint22 = new Paint(1);
        paint22.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas22.drawPath(path22, paint22);
        return bitmap;
    }

    private rr9 getRtmpStreamPlayer() {
        if (this.rtmpStreamPlayer == null && isRtmpStreamCall()) {
            vc2 vc2Var = this.groupCall;
            rr9 rr9Var = new rr9(this.currentAccount, vc2Var.h(vc2Var.a), getStreamDatacenterId(), new 6(vc2Var));
            this.rtmpStreamPlayer = rr9Var;
            rr9Var.k(org.telegram.messenger.a.o());
            sr9 sr9Var = new sr9();
            this.rtmpStreamVideoSinks = sr9Var;
            this.rtmpStreamPlayer.l(sr9Var, null);
        }
        return this.rtmpStreamPlayer;
    }

    public static VoIPService getSharedInstance() {
        return sharedInstance;
    }

    public static VoIPServiceState getSharedState() {
        VoIPService voIPService = sharedInstance;
        if (voIPService != null) {
            return voIPService;
        }
        VoIPGroupNotification.State state = VoIPGroupNotification.currentState;
        if (state != null) {
            return state;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return VoIPPreNotificationService.getState();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getStatsNetworkType() {
        NetworkInfo networkInfo = this.lastNetInfo;
        if (networkInfo == null || networkInfo.getType() != 0) {
            return 1;
        }
        return this.lastNetInfo.isRoaming() ? 2 : 0;
    }

    private int getStreamDatacenterId() {
        TLRPC.GroupCall groupCall;
        int i;
        vc2 vc2Var = this.groupCall;
        return (vc2Var == null || (groupCall = vc2Var.b) == null || (groupCall.flags & 16) == 0 || (i = groupCall.stream_dc_id) == 0) ? ConnectionsManager.DEFAULT_DATACENTER_ID : i;
    }

    public static String getStringFromFile(String str) {
        FileInputStream fileInputStream = new FileInputStream(new File(str));
        String convertStreamToString = convertStreamToString(fileInputStream);
        fileInputStream.close();
        return convertStreamToString;
    }

    private Class<? extends Activity> getUIActivityClass() {
        return LaunchActivity.class;
    }

    public static boolean hasRtmpStream() {
        return (getSharedInstance() == null || getSharedInstance().groupCall == null || !getSharedInstance().groupCall.b.rtmp_stream) ? false : true;
    }

    private void initializeAccountRelatedThings() {
        updateServerConfig();
        jn7.f(this.currentAccount).a(this, jn7.I2);
        ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0357  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void initiateActualEncryptedCall() {
        SharedPreferences sharedPreferences;
        HashSet hashSet;
        int i;
        boolean z;
        boolean z2;
        Runnable runnable = this.timeoutRunnable;
        if (runnable != null) {
            hl.r(runnable);
            this.timeoutRunnable = null;
        }
        try {
            if (f11.a) {
                cc4.b("InitCall: keyID=" + this.keyFingerprint);
            }
            sharedPreferences = uc7.s1(this.currentAccount).W3;
            Set<String> stringSet = sharedPreferences.getStringSet("calls_access_hashes", null);
            hashSet = stringSet != null ? new HashSet(stringSet) : new HashSet();
            hashSet.add(this.privateCall.id + " " + this.privateCall.access_hash + " " + System.currentTimeMillis());
        } catch (Exception e) {
            if (f11.a) {
            }
            callFailed();
            return;
        }
        while (true) {
            i = 2;
            if (hashSet.size() <= 20) {
                break;
            }
            Iterator it = hashSet.iterator();
            long j = Long.MAX_VALUE;
            String str = null;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String[] split = str2.split(" ");
                if (split.length < 2) {
                    it.remove();
                } else {
                    try {
                        long parseLong = Long.parseLong(split[2]);
                        if (parseLong < j) {
                            str = str2;
                            j = parseLong;
                        }
                    } catch (Exception unused) {
                        it.remove();
                    }
                }
            }
            if (str != null) {
                hashSet.remove(str);
            }
            if (f11.a) {
                cc4.e("error starting call", e);
            }
            callFailed();
            return;
        }
        sharedPreferences.edit().putStringSet("calls_access_hashes", hashSet).apply();
        int i2 = 0;
        try {
            z = AcousticEchoCanceler.isAvailable();
        } catch (Exception unused2) {
            z = false;
        }
        try {
            z2 = NoiseSuppressor.isAvailable();
        } catch (Exception unused3) {
            z2 = false;
        }
        SharedPreferences e1 = uc7.e1();
        uc7 s1 = uc7.s1(this.currentAccount);
        double d = s1.b3 / 1000.0d;
        double d2 = s1.c3 / 1000.0d;
        int convertDataSavingMode = convertDataSavingMode(e1.getInt("VoipDataSaving", xkc.c()));
        Instance.ServerConfig globalServerConfig = Instance.getGlobalServerConfig();
        boolean z3 = (z && globalServerConfig.useSystemAec) ? false : true;
        boolean z4 = (z2 && globalServerConfig.useSystemNs) ? false : true;
        boolean z5 = f11.a;
        String d3 = xkc.d("voip" + this.privateCall.id);
        String e2 = xkc.e("" + this.privateCall.id);
        TL_phone.PhoneCall phoneCall = this.privateCall;
        boolean z6 = phoneCall.p2p_allowed;
        boolean z7 = globalServerConfig.enableStunMarking;
        int i3 = phoneCall.protocol.max_layer;
        TLRPC.TL_dataJSON tL_dataJSON = phoneCall.custom_parameters;
        Instance.Config config = new Instance.Config(d, d2, convertDataSavingMode, z6, z3, z4, true, false, z7, d3, e2, i3, tL_dataJSON != null ? tL_dataJSON.data : "");
        this.lastLogFilePath = d3;
        String absolutePath = new File(org.telegram.messenger.a.b.getCacheDir(), "voip_persistent_state.json").getAbsolutePath();
        boolean z8 = e1.getBoolean("dbg_force_tcp_in_calls", false);
        int i4 = z8 ? 3 : 2;
        int size = this.privateCall.connections.size();
        Instance.Endpoint[] endpointArr = new Instance.Endpoint[size];
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (i5 < size) {
            TLRPC.PhoneConnection phoneConnection = this.privateCall.connections.get(i5);
            int i6 = i;
            int i7 = i2;
            boolean z9 = z8;
            endpointArr[i5] = new Instance.Endpoint(phoneConnection instanceof TLRPC.TL_phoneConnectionWebrtc, phoneConnection.id, phoneConnection.ip, phoneConnection.ipv6, phoneConnection.port, i4, phoneConnection.peer_tag, phoneConnection.turn, phoneConnection.stun, phoneConnection.username, phoneConnection.password, phoneConnection.tcp);
            if (phoneConnection instanceof TLRPC.TL_phoneConnection) {
                arrayList.add(Long.valueOf(((TLRPC.TL_phoneConnection) phoneConnection).id));
            }
            i5++;
            i = i6;
            z8 = z9;
            i2 = i7;
        }
        boolean z10 = z8;
        int i8 = i2;
        int i9 = i;
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            HashMap hashMap = new HashMap();
            int i10 = i8;
            while (i10 < arrayList.size()) {
                Long l = (Long) arrayList.get(i10);
                i10++;
                hashMap.put(l, Integer.valueOf(i10));
            }
            for (int i11 = i8; i11 < size; i11++) {
                Instance.Endpoint endpoint = endpointArr[i11];
                endpoint.reflectorId = ((Integer) Map.-EL.getOrDefault(hashMap, Long.valueOf(endpoint.id), Integer.valueOf(i8))).intValue();
            }
        }
        if (z10) {
            hl.c3(new glc(this, (byte) 17));
        }
        Instance.EncryptionKey encryptionKey = new Instance.EncryptionKey(this.authKey, this.isOutgoing);
        boolean z11 = compareLibraryVersions(this.privateCall.protocol.library_versions.get(i8), "2.7.7") >= 0;
        long j2 = this.captureDevice[0];
        if (j2 != 0 && !z11) {
            NativeInstance.destroyVideoCapturer(j2);
            this.captureDevice[0] = 0;
            this.videoState[0] = 0;
        }
        if (!this.isOutgoing) {
            if (this.videoCall && checkSelfPermission("android.permission.CAMERA") == 0) {
                this.captureDevice[0] = NativeInstance.createVideoCapturer(this.localSink[0], this.isFrontFaceCamera ? 1 : 0);
                this.videoState[0] = i9;
            } else {
                this.videoState[0] = 0;
            }
        }
        NativeInstance.setOwnAudioLevelMeter(true);
        this.tgVoip[0] = Instance.makeInstance(this.privateCall.protocol.library_versions.get(0), config, absolutePath, endpointArr, null, getNetworkType(), encryptionKey, this.remoteSink[0], this.captureDevice[0], new rlc(this), CallAudioDevice.getMode(this.currentAccount), OpusDred.weightsForPrivateCall(this.currentAccount));
        this.tgVoip[0].setOnStateUpdatedListener(new rlc(this));
        this.tgVoip[0].setOnSignalBarsUpdatedListener(new rlc(this));
        this.tgVoip[0].setOnSignalDataListener(new rlc(this));
        this.tgVoip[0].setOnRemoteMediaStateUpdatedListener(new rlc(this));
        this.tgVoip[0].setMuteMicrophone(this.micMute);
        attachSignalingTarget(this.tgVoip[0], this.privateCall.id);
        if (z11 != this.isVideoAvailable) {
            this.isVideoAvailable = z11;
            for (int i12 = 0; i12 < this.stateListeners.size(); i12++) {
                this.stateListeners.get(i12).onVideoAvailableChange(this.isVideoAvailable);
            }
        }
        hl.d3(new Runnable() { // from class: org.telegram.messenger.voip.VoIPService.9
            @Override // java.lang.Runnable
            public void run() {
                if (VoIPService.this.tgVoip[0] != null) {
                    VoIPService voIPService = VoIPService.this;
                    voIPService.updateTrafficStats(voIPService.tgVoip[0], null);
                    hl.d3(this, 5000L);
                }
            }
        }, 5000L);
    }

    public static boolean isAnyKindOfCallActive() {
        return (getSharedInstance() == null || getSharedInstance().getCallState() == 15) ? false : true;
    }

    private static boolean isDeviceCompatibleWithConnectionServiceAPI() {
        return false;
    }

    private boolean isFinished() {
        int i = this.currentState;
        return i == 11 || i == 4;
    }

    private boolean isRinging() {
        return this.currentState == 15;
    }

    private boolean isRtmpStreamCall() {
        TLRPC.GroupCall groupCall;
        vc2 vc2Var = this.groupCall;
        return (vc2Var == null || (groupCall = vc2Var.b) == null || !groupCall.rtmp_stream) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$acceptIncomingCall$100(jf7 jf7Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            callFailed();
            return;
        }
        TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
        if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
            byte[] bArr = messages_dhconfig.p;
            int i = messages_dhconfig.g;
            Pattern pattern = Utilities.a;
            if (!ConnectionsManager.native_isGoodPrime(bArr, i)) {
                if (f11.a) {
                    cc4.d("stopping VoIP service, bad prime");
                }
                callFailed();
                return;
            }
            byte[] bArr2 = messages_dhconfig.p;
            jf7Var.G();
            jf7Var.y = bArr2;
            int i2 = messages_dhconfig.g;
            jf7Var.G();
            jf7Var.E = i2;
            int i3 = messages_dhconfig.version;
            jf7Var.G();
            jf7Var.x = i3;
            jf7 Y = jf7.Y(this.currentAccount);
            jf7Var.G();
            int i4 = jf7Var.x;
            jf7Var.G();
            int i5 = jf7Var.E;
            jf7Var.G();
            Y.a.c(new aq1((Object) Y, i4, i5, (Object) jf7Var.y, (byte) 10));
        }
        byte[] bArr3 = new byte[256];
        for (int i6 = 0; i6 < 256; i6++) {
            bArr3[i6] = (byte) (((byte) (Utilities.b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i6]);
        }
        if (this.privateCall == null) {
            if (f11.a) {
                cc4.d("call is null");
            }
            callFailed();
            return;
        }
        this.a_or_b = bArr3;
        jf7Var.G();
        BigInteger valueOf = BigInteger.valueOf(jf7Var.E);
        jf7Var.G();
        BigInteger modPow = valueOf.modPow(new BigInteger(1, bArr3), new BigInteger(1, jf7Var.y));
        this.g_a_hash = this.privateCall.g_a_hash;
        byte[] byteArray = modPow.toByteArray();
        if (byteArray.length > 256) {
            byte[] bArr4 = new byte[256];
            System.arraycopy(byteArray, 1, bArr4, 0, 256);
            byteArray = bArr4;
        }
        TL_phone.acceptCall acceptcall = new TL_phone.acceptCall();
        acceptcall.g_b = byteArray;
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        acceptcall.peer = tL_inputPhoneCall;
        TL_phone.PhoneCall phoneCall = this.privateCall;
        tL_inputPhoneCall.id = phoneCall.id;
        tL_inputPhoneCall.access_hash = phoneCall.access_hash;
        TL_phone.TL_phoneCallProtocol tL_phoneCallProtocol = new TL_phone.TL_phoneCallProtocol();
        acceptcall.protocol = tL_phoneCallProtocol;
        tL_phoneCallProtocol.udp_reflector = true;
        tL_phoneCallProtocol.udp_p2p = true;
        tL_phoneCallProtocol.min_layer = 65;
        tL_phoneCallProtocol.max_layer = Instance.getConnectionMaxLayer();
        Collections.addAll(acceptcall.protocol.library_versions, NativeInstance.getAllVersions());
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(acceptcall, new hlc(this, (byte) 2), 65536);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$acceptIncomingCall$97() {
        jn7.e().k(jn7.v2, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$acceptIncomingCall$98(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            if (f11.a) {
                cc4.d("Error on phone.acceptCall: " + tL_error);
            }
            callFailed();
            return;
        }
        if (f11.a) {
            cc4.l("accept call ok! " + tLObject);
        }
        TL_phone.PhoneCall phoneCall = ((TL_phone.TL_phone_phoneCall) tLObject).phone_call;
        this.privateCall = phoneCall;
        if (phoneCall instanceof TL_phone.TL_phoneCallDiscarded) {
            onCallUpdated(phoneCall);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$acceptIncomingCall$99(TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new nlc(this, tL_error, tLObject, (byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$acknowledgeCall$12(TLObject tLObject, TLRPC.TL_error tL_error, boolean z) {
        if (sharedInstance != null) {
            if (f11.a) {
                cc4.l("receivedCall response = " + tLObject);
            }
            if (tL_error != null) {
                if (f11.a) {
                    cc4.d("error on receivedCall: " + tL_error);
                }
                stopSelf();
                return;
            }
            if (USE_CONNECTION_SERVICE) {
                lv2 r = lv2.r(this.currentAccount);
                TLRPC.User user = this.user;
                r.g(user.id, user.first_name, user.last_name);
                ((TelecomManager) getSystemService("telecom")).addNewIncomingCall(addAccountToTelecomManager(), qu6.j(1, "call_type"));
            }
            if (z) {
                startRinging();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$acknowledgeCall$13(boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new lb7((Object) this, (Object) tLObject, (Object) tL_error, z, (byte) 19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callEnded$120() {
        dispatchStateChanged(11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callEnded$121() {
        int i = this.spPlayId;
        if (i != 0) {
            this.soundPool.stop(i);
            this.spPlayId = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callEnded$122() {
        this.soundPool.play(this.spEndId, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callEnded$123() {
        this.soundPool.play(this.spVoiceChatEndId, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$callFailed$111(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (f11.a) {
                cc4.d("error on phone.discardCall: " + tL_error);
                return;
            }
            return;
        }
        if (f11.a) {
            cc4.b("phone.discardCall " + tLObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callFailed$112() {
        dispatchStateChanged(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callFailed$113() {
        this.soundPool.play(this.spFailedID, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$configureDeviceForCall$107() {
        if (MediaController.z().G()) {
            return;
        }
        MediaController.z().U(MediaController.z().v0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$configureDeviceForCall$108(AudioManager audioManager) {
        this.hasAudioFocus = audioManager.requestAudioFocus(this, 0, 2) == 1;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if (isBluetoothHeadsetConnected() && hasEarpiece()) {
            int i = this.audioRouteToSet;
            if (i == 0) {
                voipAudioManager.setBluetoothOn(false);
                voipAudioManager.setSpeakerphoneOn(false);
            } else if (i == 1) {
                voipAudioManager.setBluetoothOn(false);
                voipAudioManager.setSpeakerphoneOn(true);
            } else if (i == 2) {
                if (this.bluetoothScoActive) {
                    voipAudioManager.setBluetoothOn(true);
                    voipAudioManager.setSpeakerphoneOn(false);
                } else {
                    this.needSwitchToBluetoothAfterScoActivates = true;
                    try {
                        voipAudioManager.startBluetooth();
                    } catch (Throwable th) {
                        cc4.g(th, true);
                    }
                }
            }
        } else {
            boolean isBluetoothHeadsetConnected = isBluetoothHeadsetConnected();
            boolean z = this.speakerphoneStateToSet;
            if (isBluetoothHeadsetConnected) {
                voipAudioManager.setBluetoothOn(z);
            } else {
                voipAudioManager.setSpeakerphoneOn(z);
                if (this.speakerphoneStateToSet) {
                    this.audioRouteToSet = 1;
                } else {
                    this.audioRouteToSet = 0;
                }
                SensorEvent sensorEvent = this.lastSensorEvent;
                if (sensorEvent != null) {
                    onSensorChanged(sensorEvent);
                }
            }
        }
        updateOutputGainControlState();
        this.audioConfigured = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$configureDeviceForCall$109(AudioManager audioManager) {
        try {
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (!hasRtmpStream()) {
            audioManager.setMode(3);
            hl.c3(new amc(this, audioManager, (byte) 0));
        } else {
            audioManager.setMode(0);
            VoipAudioManager.get().setBluetoothOn(false);
            hl.c3(new osa((byte) 17));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$convertToConferenceCall$33() {
        startConferenceGroupCall(true, 0, null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createFirstGroupInstance$69() {
        int i;
        if (sharedInstance != this || this.tgVoip[0] != null || (i = this.currentState) == 11 || i == 10) {
            return;
        }
        createGroupInstance(0, false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createGroupInstance$70(int i, boolean[] zArr, int i2, String str) {
        if (i != 0) {
            startScreenCapture(i2, str);
            return;
        }
        if (this.conference != null) {
            startConferenceGroupCall(false, i2, str, !zArr[0]);
        } else {
            startGroupCall(i2, str, true);
        }
        zArr[0] = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$createGroupInstance$72(int i, int[] iArr, float[] fArr, boolean[] zArr) {
        vc2 vc2Var;
        boolean z;
        int i2;
        TLRPC.GroupCallParticipant groupCallParticipant;
        zh6 zh6Var;
        long j;
        long j2;
        boolean z2;
        int i3;
        if (sharedInstance == null || (vc2Var = this.groupCall) == null || i != 0) {
            return;
        }
        tc2 tc2Var = vc2Var.Q;
        zh6 zh6Var2 = vc2Var.P;
        int currentTime = ConnectionsManager.getInstance(vc2Var.C.a).getCurrentTime();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long uptimeMillis = SystemClock.uptimeMillis();
        int i4 = 1;
        int i5 = 0;
        jn7.f(vc2Var.C.a).k(jn7.B2, Long.valueOf(elapsedRealtime));
        boolean z3 = false;
        boolean z4 = false;
        ArrayList arrayList = null;
        while (true) {
            z = z3;
            if (i5 >= iArr.length) {
                break;
            }
            int i6 = iArr[i5];
            if (i6 == 0) {
                i2 = i5;
                groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.d.f(vc2Var.i());
            } else {
                i2 = i5;
                groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.p.get(i6);
            }
            if (groupCallParticipant != null) {
                boolean z5 = zArr[i2];
                groupCallParticipant.hasVoice = z5;
                z2 = z4;
                if (z5 || elapsedRealtime - groupCallParticipant.lastVoiceUpdateTime > 500) {
                    groupCallParticipant.hasVoiceDelayed = z5;
                    groupCallParticipant.lastVoiceUpdateTime = elapsedRealtime;
                }
                long B1 = r47.B1(groupCallParticipant.peer);
                float f = fArr[i2];
                j = elapsedRealtime;
                if (f > 0.1f) {
                    if (zArr[i2] && groupCallParticipant.lastTypingDate + 1 < currentTime) {
                        if (j != groupCallParticipant.lastVisibleDate) {
                            groupCallParticipant.active_date = currentTime;
                        }
                        groupCallParticipant.lastTypingDate = currentTime;
                        z = true;
                    }
                    groupCallParticipant.lastSpeakTime = uptimeMillis;
                    groupCallParticipant.amplitude = f;
                    if (zh6Var2.g(B1, null) == null) {
                        k5 k5Var = vc2Var.C;
                        if (B1 > 0) {
                            TLRPC.User X1 = uc7.s1(k5Var.a).X1(Long.valueOf(B1));
                            bs2.x(ik8.o(B1, "add to current speaking ", " "), X1 == null ? null : X1.first_name, "GroupCall");
                            j2 = uptimeMillis;
                        } else {
                            j2 = uptimeMillis;
                            TLRPC.Chat M0 = uc7.s1(k5Var.a).M0(Long.valueOf(-B1));
                            bs2.x(ik8.o(B1, "add to current speaking ", " "), M0 == null ? null : M0.title, "GroupCall");
                        }
                        zh6Var2.k(B1, groupCallParticipant);
                        z2 = true;
                    } else {
                        j2 = uptimeMillis;
                    }
                    zh6Var = zh6Var2;
                    i3 = currentTime;
                } else {
                    j2 = uptimeMillis;
                    if (j2 - groupCallParticipant.lastSpeakTime < 500 || zh6Var2.g(B1, null) == null) {
                        zh6Var = zh6Var2;
                        i3 = currentTime;
                    } else {
                        zh6Var2.l(B1);
                        k5 k5Var2 = vc2Var.C;
                        if (B1 > 0) {
                            TLRPC.User X12 = uc7.s1(k5Var2.a).X1(Long.valueOf(B1));
                            bs2.x(ik8.o(B1, "remove from speaking ", " "), X12 == null ? null : X12.first_name, "GroupCall");
                            zh6Var = zh6Var2;
                            i3 = currentTime;
                        } else {
                            uc7 s1 = uc7.s1(k5Var2.a);
                            zh6Var = zh6Var2;
                            i3 = currentTime;
                            TLRPC.Chat M02 = s1.M0(Long.valueOf(-B1));
                            bs2.x(ik8.o(B1, "remove from speaking ", " "), M02 == null ? null : M02.title, "GroupCall");
                        }
                        z2 = true;
                    }
                    groupCallParticipant.amplitude = 0.0f;
                }
            } else {
                zh6Var = zh6Var2;
                j = elapsedRealtime;
                j2 = uptimeMillis;
                z2 = z4;
                i3 = currentTime;
                if (iArr[i2] != 0) {
                    ArrayList arrayList2 = arrayList;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Long.valueOf(iArr[i2]));
                    arrayList = arrayList2;
                }
            }
            z3 = z;
            z4 = z2;
            i5 = i2 + 1;
            zh6Var2 = zh6Var;
            currentTime = i3;
            elapsedRealtime = j;
            uptimeMillis = j2;
        }
        zh6 zh6Var3 = zh6Var2;
        boolean z6 = z4;
        ArrayList arrayList3 = arrayList;
        if (arrayList3 != null) {
            vc2Var.m(arrayList3, false, null);
        }
        if (z) {
            vc2Var.B();
            jn7.f(vc2Var.C.a).k(jn7.w2, Long.valueOf(vc2Var.c), Long.valueOf(vc2Var.b.id), Boolean.FALSE);
        }
        if (z6) {
            if (zh6Var3.m() > 0) {
                hl.r(tc2Var);
                hl.d3(tc2Var, 550L);
            }
            jn7.f(vc2Var.C.a).k(jn7.y2, Long.valueOf(vc2Var.c), Long.valueOf(vc2Var.b.id), Boolean.FALSE);
        }
        float f2 = 0.0f;
        boolean z7 = false;
        int i7 = 0;
        while (i7 < iArr.length) {
            if (iArr[i7] == 0) {
                if (this.chat != null && this.lastTypingTimeSend < SystemClock.uptimeMillis() - 5000 && fArr[i7] > 0.1f && zArr[i7]) {
                    this.lastTypingTimeSend = SystemClock.uptimeMillis();
                    TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                    tL_messages_setTyping.action = new TLRPC.TL_speakingInGroupCallAction();
                    tL_messages_setTyping.peer = uc7.l1(this.chat);
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_setTyping, new xe2((byte) 12));
                }
                jn7 e = jn7.e();
                Object[] objArr = new Object[i4];
                objArr[0] = Float.valueOf(fArr[i7]);
                e.k(jn7.Q4, objArr);
            } else {
                f2 = Math.max(f2, fArr[i7]);
                z7 = true;
            }
            i7++;
            i4 = 1;
        }
        if (z7) {
            jn7.e().k(jn7.R4, Float.valueOf(f2));
            NativeInstance.AudioLevelsCallback audioLevelsCallback2 = audioLevelsCallback;
            if (audioLevelsCallback2 != null) {
                audioLevelsCallback2.run(iArr, fArr, zArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createGroupInstance$73(long j, int[] iArr, ArrayList arrayList) {
        if (sharedInstance == null || this.groupCall == null) {
            return;
        }
        broadcastUnknownParticipants(j, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$createGroupInstance$74(int i, long j, int[] iArr) {
        vc2 vc2Var;
        if (sharedInstance == null || (vc2Var = this.groupCall) == null || i != 0) {
            return;
        }
        ps0 ps0Var = new ps0((Object) this, j, (Object) iArr, (byte) 12);
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (vc2Var.p.get(iArr[i2]) == null && vc2Var.q.get(iArr[i2]) == null && vc2Var.r.get(iArr[i2]) == null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(Long.valueOf(iArr[i2]));
            }
        }
        if (arrayList != null) {
            vc2Var.m(arrayList, false, ps0Var);
        } else {
            ((VoIPService) ps0Var.c).lambda$createGroupInstance$73(ps0Var.b, (int[]) ps0Var.d, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createGroupInstance$77(boolean z, boolean z2) {
        hl.c3(new mz3(this, z, z2, (byte) 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$declineIncomingCall$101() {
        if (this.currentState == 10) {
            callEnded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$declineIncomingCall$102(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (f11.a) {
                cc4.d("error on phone.discardCall: " + tL_error);
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_updates) {
            uc7.s1(this.currentAccount).Y3((TLRPC.TL_updates) tLObject, false);
        }
        if (f11.a) {
            cc4.b("phone.discardCall " + tLObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$editCallMember$87(int i, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            uc7.s1(k5.a(i).a).Y3((TLRPC.Updates) tLObject, false);
        } else if (tL_error != null && "GROUPCALL_VIDEO_TOO_MUCH".equals(tL_error.text)) {
            this.groupCall.t();
        }
        if (runnable != null) {
            hl.c3(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$endConnectionServiceCall$124() {
        CallConnection callConnection = this.systemCallConnection;
        if (callConnection != null) {
            int i = this.callDiscardReason;
            if (i == 1) {
                callConnection.setDisconnected(new DisconnectCause(this.isOutgoing ? 2 : 6));
            } else if (i != 2) {
                if (i == 3) {
                    callConnection.setDisconnected(new DisconnectCause(this.isOutgoing ? 4 : 5));
                } else if (i != 4) {
                    callConnection.setDisconnected(new DisconnectCause(3));
                } else {
                    callConnection.setDisconnected(new DisconnectCause(7));
                }
            } else {
                callConnection.setDisconnected(new DisconnectCause(1));
            }
            this.systemCallConnection.destroy();
            this.systemCallConnection = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getConnectionAndStartCall$103() {
        this.delayedStartOutgoingCall = null;
        startOutgoingCall();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hangUp$4(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_updates) {
            uc7.s1(this.currentAccount).Y3((TLRPC.TL_updates) tLObject, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hangUp$5(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_updates) {
            uc7.s1(this.currentAccount).Y3((TLRPC.TL_updates) tLObject, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initiateActualEncryptedCall$81() {
        Toast.makeText(this, "This call uses TCP which will degrade its quality.", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initiateActualEncryptedCall$82(int[] iArr, float[] fArr, boolean[] zArr) {
        if (sharedInstance == null || this.privateCall == null) {
            return;
        }
        jn7.e().k(jn7.Q4, Float.valueOf(Math.max(fArr[0], NativeInstance.getOwnAudioLevel())));
        jn7.e().k(jn7.R4, Float.valueOf(fArr[1]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initiateActualEncryptedCall$83(int i, int i2) {
        this.remoteAudioState = i;
        this.remoteVideoState = i2;
        checkIsNear();
        for (int i3 = 0; i3 < this.stateListeners.size(); i3++) {
            this.stateListeners.get(i3).onMediaStateUpdated(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initiateActualEncryptedCall$84(int i, int i2) {
        hl.c3(new bt((Object) this, i, i2, (byte) 18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadResources$106() {
        SoundPool soundPool = new SoundPool(1, 0, 0);
        this.soundPool = soundPool;
        this.spConnectingId = soundPool.load(this, R.raw.voip_connecting, 1);
        this.spRingbackID = this.soundPool.load(this, R.raw.voip_ringback, 1);
        this.spFailedID = this.soundPool.load(this, R.raw.voip_failed, 1);
        this.spEndId = this.soundPool.load(this, R.raw.voip_end, 1);
        this.spBusyId = this.soundPool.load(this, R.raw.voip_busy, 1);
        this.spVoiceChatEndId = this.soundPool.load(this, R.raw.voicechat_leave, 1);
        this.spVoiceChatStartId = this.soundPool.load(this, R.raw.voicechat_join, 1);
        this.spVoiceChatConnecting = this.soundPool.load(this, R.raw.voicechat_connecting, 1);
        this.spAllowTalkId = this.soundPool.load(this, R.raw.voip_onallowtalk, 1);
        this.spStartRecordId = this.soundPool.load(this, R.raw.voip_recordstart, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBroadcastStateChanged$17(vc2 vc2Var, NativeInstance nativeInstance) {
        if (this.groupCall == vc2Var && this.tgVoip[0] == nativeInstance) {
            this.broadcastListenerRejoining = true;
            createGroupInstance(0, false, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBroadcastStateChanged$18(vc2 vc2Var, NativeInstance nativeInstance) {
        hl.c3(new b6c(this, vc2Var, nativeInstance, (byte) 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCallUpdated$19() {
        this.soundPool.play(this.spBusyId, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCallUpdated$20() {
        int i = this.spPlayId;
        if (i != 0) {
            this.soundPool.stop(i);
        }
        this.spPlayId = this.soundPool.play(this.spRingbackID, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCallUpdated$21() {
        this.timeoutRunnable = null;
        declineIncomingCall(3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnectionStateChanged$114() {
        int i = this.spPlayId;
        if (i != 0) {
            this.soundPool.stop(i);
            this.spPlayId = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnectionStateChanged$115() {
        int i = this.spPlayId;
        if (i != 0) {
            this.soundPool.stop(i);
        }
        this.spPlayId = this.soundPool.play(this.groupCall != null ? this.spVoiceChatConnecting : this.spConnectingId, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnectionStateChanged$116(int i) {
        if (this.convertingVoip != null) {
            return;
        }
        if (i == 3 && this.callStartTime == 0) {
            this.callStartTime = SystemClock.elapsedRealtime();
        }
        byte b = 4;
        if (i == 4) {
            callFailed();
            return;
        }
        if (i == 3) {
            Runnable runnable = this.connectingSoundRunnable;
            if (runnable != null) {
                hl.r(runnable);
                this.connectingSoundRunnable = null;
            }
            Utilities.e.c(new bmc(this, b));
            if (this.groupCall == null && !this.wasEstablished) {
                this.wasEstablished = true;
                if (!this.isProximityNear && !this.privateCall.video) {
                    try {
                        LaunchActivity.Q().getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                hl.d3(new Runnable() { // from class: org.telegram.messenger.voip.VoIPService.12
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VoIPService.this.tgVoip[0] != null) {
                            a2b c = a2b.c(VoIPService.this.currentAccount);
                            int statsNetworkType = VoIPService.this.getStatsNetworkType();
                            int[] iArr = c.n;
                            iArr[statsNetworkType] = iArr[statsNetworkType] + 5;
                            c.m();
                            hl.d3(this, 5000L);
                        }
                    }
                }, 5000L);
                boolean z = this.isOutgoing;
                int i2 = this.currentAccount;
                if (z) {
                    a2b.c(i2).i(getStatsNetworkType(), 0, 1);
                } else {
                    a2b.c(i2).g(getStatsNetworkType(), 0, 1);
                }
            }
        }
        byte b2 = 5;
        if (i == 5 && !this.isCallEnded) {
            Utilities.e.c(new bmc(this, b2));
        }
        dispatchStateChanged(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$105(AudioDeviceInfo audioDeviceInfo) {
        int i = 0;
        this.bluetoothScoConnecting = false;
        boolean isBluetoothDevice = VoipAudioManager.isBluetoothDevice(audioDeviceInfo);
        this.bluetoothScoActive = isBluetoothDevice;
        if (isBluetoothDevice) {
            this.needSwitchToBluetoothAfterScoActivates = false;
            this.currentBluetoothDeviceName = audioDeviceInfo.getProductName().toString();
        }
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        while (i < size) {
            StateListener stateListener = arrayList.get(i);
            i++;
            stateListener.onAudioSettingsChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onDestroy$94() {
        jn7.e().k(jn7.D2, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onDestroy$95(AudioManager audioManager) {
        synchronized (sync) {
            if (setModeRunnable == null) {
                return;
            }
            setModeRunnable = null;
            try {
                audioManager.setMode(0);
            } catch (SecurityException e) {
                if (f11.a) {
                    cc4.e("Error setting audio more to normal", e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDestroy$96() {
        SoundPool soundPool = this.soundPool;
        if (soundPool != null) {
            soundPool.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onGroupCallUpdated$16() {
        lambda$createGroupInstance$75(0, 1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSignalBarCountChanged$119(int i) {
        this.signalBarCount = i;
        for (int i2 = 0; i2 < this.stateListeners.size(); i2++) {
            this.stateListeners.get(i2).onSignalBarsCountChanged(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartCommand$1(Boolean bool) {
        if (sharedInstance == null || !bool.booleanValue()) {
            return;
        }
        setMicMute(false, false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartCommand$2() {
        this.delayedStartOutgoingCall = null;
        startOutgoingCall();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartCommand$3() {
        jn7.f(this.currentAccount).k(jn7.P4, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playAllowTalkSound$118() {
        this.soundPool.play(this.spAllowTalkId, 0.5f, 0.5f, 0, 0, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playConnectedSound$85() {
        this.soundPool.play(this.spVoiceChatStartId, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playStartRecordSound$117() {
        this.soundPool.play(this.spStartRecordId, 0.5f, 0.5f, 0, 0, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processAcceptedCall$22(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            callFailed();
        } else {
            this.privateCall = ((TL_phone.TL_phone_phoneCall) tLObject).phone_call;
            initiateActualEncryptedCall();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processAcceptedCall$23(TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new nlc(this, tL_error, tLObject, (byte) 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMicMute$0() {
        if (this.updateNotificationRunnable == null) {
            return;
        }
        this.updateNotificationRunnable = null;
        showNotification(getTitle(), getRoundAvatarBitmap(this, this.currentAccount, this.chat));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupCaptureDevice$14() {
        this.micSwitching = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startConferenceGroupCall$34(TLObject tLObject, k5 k5Var, TLRPC.TL_error tL_error) {
        boolean z = tLObject instanceof TLRPC.Updates;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (!z) {
            if (!(tLObject instanceof TL_phone.groupCall)) {
                jn7.f(this.currentAccount).k(jn7.M0, 6, tL_error.text);
                hangUp(0);
                return;
            }
            try {
                this.groupCallBottomSheetLatch.await(800L, timeUnit);
            } catch (InterruptedException e) {
                cc4.g(e, true);
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            this.groupCall.v(k5Var, 0L, groupcall);
            this.groupCall.l(true);
            uc7.s1(this.currentAccount).h4(0L, this.groupCall);
            this.conference.inputGroupCall = new TLRPC.TL_inputGroupCall();
            ConferenceCall conferenceCall = this.conference;
            TLRPC.InputGroupCall inputGroupCall = conferenceCall.inputGroupCall;
            TLRPC.GroupCall groupCall = groupcall.call;
            inputGroupCall.id = groupCall.id;
            inputGroupCall.access_hash = groupCall.access_hash;
            conferenceCall.groupCall = groupCall;
            startConferenceGroupCall(false, 0, null, false);
            HashSet<Long> hashSet = this.inviteUsersToConference;
            if (hashSet != null) {
                Iterator<Long> it = hashSet.iterator();
                while (it.hasNext()) {
                    long longValue = it.next().longValue();
                    vc2 vc2Var = this.groupCall;
                    if (vc2Var != null) {
                        vc2Var.a(longValue);
                    }
                }
            }
            mkc mkcVar = mkc.m1;
            if (mkcVar != null) {
                mkcVar.d();
            }
            j95.T0(LaunchActivity.H1, k5.a(this.currentAccount), null, null, false, null);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        uc7.s1(this.currentAccount).j4(updates.users, false);
        uc7.s1(this.currentAccount).c4(updates.chats, false);
        ArrayList z0 = uc7.z0(updates, TL_update.TL_updateGroupCall.class);
        int size = z0.size();
        TLRPC.GroupCall groupCall2 = null;
        int i = 0;
        while (i < size) {
            Object obj = z0.get(i);
            i++;
            groupCall2 = ((TL_update.TL_updateGroupCall) obj).call;
        }
        if (groupCall2 != null) {
            try {
                this.groupCallBottomSheetLatch.await(800L, timeUnit);
            } catch (InterruptedException e2) {
                cc4.g(e2, true);
            }
            this.groupCall.w(k5Var, groupCall2);
            this.groupCall.l(true);
            uc7.s1(this.currentAccount).h4(0L, this.groupCall);
            this.conference.inputGroupCall = new TLRPC.TL_inputGroupCall();
            ConferenceCall conferenceCall2 = this.conference;
            TLRPC.InputGroupCall inputGroupCall2 = conferenceCall2.inputGroupCall;
            inputGroupCall2.id = groupCall2.id;
            inputGroupCall2.access_hash = groupCall2.access_hash;
            atb.a(conferenceCall2.groupCall, groupCall2);
            conferenceCall2.groupCall = groupCall2;
            startConferenceGroupCall(false, 0, null, false);
            HashSet<Long> hashSet2 = this.inviteUsersToConference;
            if (hashSet2 != null) {
                Iterator<Long> it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    long longValue2 = it2.next().longValue();
                    vc2 vc2Var2 = this.groupCall;
                    if (vc2Var2 != null) {
                        vc2Var2.a(longValue2);
                    }
                }
            }
            mkc mkcVar2 = mkc.m1;
            if (mkcVar2 != null) {
                mkcVar2.d();
            }
            j95.T0(LaunchActivity.H1, k5.a(this.currentAccount), null, null, false, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$35(k5 k5Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new kta((Object) this, (Object) tLObject, (Object) k5Var, (Object) tL_error, (byte) 26));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$36(TLObject tLObject, int i, String str, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TL_phone.groupCall)) {
            if (tL_error != null) {
                jn7.f(this.currentAccount).k(jn7.M0, 6, tL_error.text);
                hangUp(0);
                return;
            }
            return;
        }
        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
        uc7.s1(this.currentAccount).j4(groupcall.users, false);
        uc7.s1(this.currentAccount).c4(groupcall.chats, false);
        this.groupCall.v(k5.a(this.currentAccount), 0L, groupcall);
        ConferenceCall conferenceCall = this.conference;
        conferenceCall.groupCall = groupcall.call;
        conferenceCall.inputGroupCall = this.joinConference;
        startConferenceGroupCall(false, i, str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$37(int i, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new kwc(i, str, this, tLObject, tL_error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startConferenceGroupCall$38() {
        jn7.e().k(jn7.v2, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$39(int i) {
        this.mySource[0] = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$40(TLRPC.GroupCallParticipant groupCallParticipant) {
        this.mySource[0] = groupCallParticipant.source;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startConferenceGroupCall$41(TLRPC.Updates updates, long j) {
        int i;
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
            if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                i = message.id;
            }
            i = 0;
        } else if (update instanceof TL_update.TL_updateMessageID) {
            i = ((TL_update.TL_updateMessageID) update).id;
        } else {
            if (updates.updates != null) {
                for (int i2 = 0; i2 < updates.updates.size(); i2++) {
                    TLRPC.Update update2 = updates.updates.get(i2);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                        if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                            i = message2.id;
                            break;
                        }
                    } else {
                        if (update2 instanceof TL_update.TL_updateMessageID) {
                            i = ((TL_update.TL_updateMessageID) update2).id;
                            break;
                        }
                    }
                }
            }
            i = 0;
        }
        vc2 vc2Var = this.groupCall;
        if (vc2Var == null || i == 0) {
            return;
        }
        HashMap hashMap = vc2Var.k;
        Long valueOf = Long.valueOf(j);
        uc2 uc2Var = new uc2();
        uc2Var.a = i;
        uc2Var.b = true;
        uc2Var.c = System.currentTimeMillis();
        hashMap.put(valueOf, uc2Var);
        jn7.f(this.currentAccount).k(jn7.w2, 0L, Long.valueOf(this.groupCall.b.id), Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$42(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.e S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        l46 l46Var = new l46(34, this.currentAccount, new w53(), S.getContext(), S);
        l46Var.u1(null, arrayList, arrayList2, arrayList3, str);
        l46Var.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startConferenceGroupCall$43(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            for (int i = 0; i < Math.min(arrayList.size(), vector.objects.size()); i++) {
                if (vector.objects.get(i) instanceof TL_account.requirementToContactPremium) {
                    arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i)).id));
                }
            }
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startConferenceGroupCall$44(ArrayList arrayList, ArrayList arrayList2, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new mlc(tLObject, arrayList, arrayList2, runnable, (byte) 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startConferenceGroupCall$45(HashSet hashSet, String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long longValue = l.longValue();
            vc2 vc2Var = this.groupCall;
            if (vc2Var != null) {
                vc2Var.u(longValue);
            }
            arrayList.add(uc7.s1(this.currentAccount).X1(l));
            ArrayList<TLRPC.InputUser> arrayList4 = getrequirementstocontact.id;
            uc7 s1 = uc7.s1(this.currentAccount);
            arrayList4.add(s1.q1(s1.X1(l)));
        }
        plc plcVar = new plc(this, arrayList, arrayList2, arrayList3, str, (byte) 1);
        if (yac.h(this.currentAccount).p()) {
            plcVar.run();
        } else {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getrequirementstocontact, new qn8((Object) arrayList, (Object) arrayList2, (Object) plcVar, (byte) 29));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$46(long j, HashSet hashSet, AtomicInteger atomicInteger, int i, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        VoIPService voIPService;
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            uc7.s1(this.currentAccount).Y3(updates, false);
            voIPService = this;
            hl.c3(new slc(voIPService, updates, j, (byte) 1));
        } else {
            voIPService = this;
            if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
                hashSet.add(Long.valueOf(j));
            }
        }
        if (atomicInteger.incrementAndGet() != i || hashSet.isEmpty()) {
            return;
        }
        hl.c3(new tlc(voIPService, hashSet, str, (byte) 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startConferenceGroupCall$47(TLObject tLObject, TL_phone.PhoneCall phoneCall, TL_phone.exportGroupCallInvite exportgroupcallinvite) {
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            TL_phone.exportedGroupCallInvite exportedgroupcallinvite = (TL_phone.exportedGroupCallInvite) tLObject;
            Uri parse = Uri.parse(exportedgroupcallinvite.link);
            boolean z = true;
            String str = parse.getPathSegments().get(parse.getPathSegments().size() - 1);
            TL_phone.discardCall discardcall = new TL_phone.discardCall();
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            discardcall.peer = tL_inputPhoneCall;
            tL_inputPhoneCall.access_hash = phoneCall.access_hash;
            tL_inputPhoneCall.id = phoneCall.id;
            TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall tL_phoneCallDiscardReasonMigrateConferenceCall = new TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall();
            discardcall.reason = tL_phoneCallDiscardReasonMigrateConferenceCall;
            tL_phoneCallDiscardReasonMigrateConferenceCall.slug = str;
            discardcall.duration = (int) (getCallDuration() / 1000);
            discardcall.connection_id = 0L;
            discardcall.video = this.inviteUsersToConferenceVideo;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardcall, null);
            String str2 = exportedgroupcallinvite.link;
            int size = this.inviteUsersToConference.size();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            HashSet hashSet = new HashSet();
            Iterator<Long> it = this.inviteUsersToConference.iterator();
            while (it.hasNext()) {
                Long next = it.next();
                long longValue = next.longValue();
                TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                uc7 s1 = uc7.s1(this.currentAccount);
                inviteconferencecallparticipant.user_id = s1.q1(s1.X1(next));
                inviteconferencecallparticipant.call = exportgroupcallinvite.call;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(inviteconferencecallparticipant, new llc(this, longValue, hashSet, atomicInteger, size, str2, (byte) 1));
                z = z;
            }
            this.privateCall = null;
            jn7 f = jn7.f(this.currentAccount);
            Long valueOf = Long.valueOf(this.groupCall.b.id);
            Object[] objArr = new Object[3];
            objArr[0] = 0L;
            objArr[z ? 1 : 0] = valueOf;
            objArr[2] = Boolean.FALSE;
            f.k(jn7.w2, objArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$48(TL_phone.PhoneCall phoneCall, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new kta((Object) this, (Object) tLObject, (Object) phoneCall, (Object) exportgroupcallinvite, (byte) 28));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startConferenceGroupCall$49(TLRPC.Updates updates, long j) {
        int i;
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
            if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                i = message.id;
            }
            i = 0;
        } else if (update instanceof TL_update.TL_updateMessageID) {
            i = ((TL_update.TL_updateMessageID) update).id;
        } else {
            if (updates.updates != null) {
                for (int i2 = 0; i2 < updates.updates.size(); i2++) {
                    TLRPC.Update update2 = updates.updates.get(i2);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                        if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                            i = message2.id;
                            break;
                        }
                    } else {
                        if (update2 instanceof TL_update.TL_updateMessageID) {
                            i = ((TL_update.TL_updateMessageID) update2).id;
                            break;
                        }
                    }
                }
            }
            i = 0;
        }
        vc2 vc2Var = this.groupCall;
        if (vc2Var == null || i == 0) {
            return;
        }
        HashMap hashMap = vc2Var.k;
        Long valueOf = Long.valueOf(j);
        uc2 uc2Var = new uc2();
        uc2Var.a = i;
        uc2Var.b = true;
        uc2Var.c = System.currentTimeMillis();
        hashMap.put(valueOf, uc2Var);
        jn7.f(this.currentAccount).k(jn7.w2, 0L, Long.valueOf(this.groupCall.b.id), Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$50(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.e S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        l46 l46Var = new l46(34, this.currentAccount, new w53(), S.getContext(), S);
        l46Var.u1(null, arrayList, arrayList2, arrayList3, str);
        l46Var.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startConferenceGroupCall$51(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            for (int i = 0; i < Math.min(arrayList.size(), vector.objects.size()); i++) {
                if (vector.objects.get(i) instanceof TL_account.requirementToContactPremium) {
                    arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i)).id));
                }
            }
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startConferenceGroupCall$52(ArrayList arrayList, ArrayList arrayList2, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new mlc(tLObject, arrayList, arrayList2, runnable, (byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startConferenceGroupCall$53(HashSet hashSet, String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long longValue = l.longValue();
            vc2 vc2Var = this.groupCall;
            if (vc2Var != null) {
                vc2Var.u(longValue);
            }
            arrayList.add(uc7.s1(this.currentAccount).X1(l));
            ArrayList<TLRPC.InputUser> arrayList4 = getrequirementstocontact.id;
            uc7 s1 = uc7.s1(this.currentAccount);
            arrayList4.add(s1.q1(s1.X1(l)));
        }
        plc plcVar = new plc(this, arrayList, arrayList2, arrayList3, str, (byte) 0);
        if (yac.h(this.currentAccount).p()) {
            plcVar.run();
        } else {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getrequirementstocontact, new qn8((Object) arrayList, (Object) arrayList2, (Object) plcVar, (byte) 28));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$54(long j, HashSet hashSet, AtomicInteger atomicInteger, int i, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = 0;
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            uc7.s1(this.currentAccount).Y3(updates, false);
            hl.c3(new slc(this, updates, j, (byte) 0));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j));
        }
        if (atomicInteger.incrementAndGet() != i || hashSet.isEmpty()) {
            return;
        }
        hl.c3(new tlc(this, hashSet, str, b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startConferenceGroupCall$55(ArrayList arrayList, boolean z) {
        boolean z2;
        TL_phone.PhoneCall phoneCall;
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall == null) {
            return;
        }
        conferenceCall.joined();
        int size = arrayList.size();
        int i = 0;
        while (true) {
            z2 = true;
            if (i >= size) {
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            this.conference.applyUpdate(0, (TL_update.TL_updateGroupCallChainBlocks) obj, true, null);
        }
        this.conference.forcePoll();
        this.groupCall.l(z);
        startGroupCheckShortpoll();
        long j = 0;
        if (this.captureDevice[1] != 0) {
            createGroupInstance(1, false, true);
        }
        for (int i2 = 0; i2 < 2; i2++) {
            NativeInstance nativeInstance = this.tgVoip[i2];
            if (nativeInstance != null) {
                nativeInstance.setConferenceCallId(this.conference.getCallId());
            }
        }
        hl.d3(this.destroyConvertingRunnable, 5000L);
        if (this.inviteUsersToConference != null && (phoneCall = this.privateCall) != null && this.groupCall != null) {
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.groupCall.b;
            tL_inputGroupCall.id = groupCall.id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new qn8((Object) this, (Object) phoneCall, (Object) exportgroupcallinvite, (byte) 27));
        }
        long[] jArr = this.inviteUsers;
        if (jArr == null) {
            return;
        }
        String str = this.groupCall.b.invite_link;
        int length = jArr.length;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        HashSet hashSet = new HashSet();
        long[] jArr2 = this.inviteUsers;
        int length2 = jArr2.length;
        int i3 = 0;
        while (true) {
            boolean z3 = z2;
            long j2 = j;
            if (i3 >= length2) {
                this.inviteUsers = null;
                jn7 f = jn7.f(this.currentAccount);
                Long valueOf = Long.valueOf(j2);
                Long valueOf2 = Long.valueOf(this.groupCall.b.id);
                Object[] objArr = new Object[3];
                objArr[0] = valueOf;
                objArr[z3 ? 1 : 0] = valueOf2;
                objArr[2] = Boolean.FALSE;
                f.k(jn7.w2, objArr);
                return;
            }
            long j3 = jArr2[i3];
            this.groupCall.a(j3);
            TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
            vc2 vc2Var = this.groupCall;
            inviteconferencecallparticipant.call = vc2Var.h(vc2Var.a);
            inviteconferencecallparticipant.user_id = uc7.s1(this.currentAccount).o1(j3);
            inviteconferencecallparticipant.video = this.videoCall;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(inviteconferencecallparticipant, new llc(this, j3, hashSet, atomicInteger, length, str, (byte) 0));
            i3++;
            j = j2;
            z2 = z3 ? 1 : 0;
            length2 = length2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startConferenceGroupCall$56(TLRPC.TL_error tL_error, String str) {
        if ("JOIN_AS_PEER_INVALID".equals(tL_error.text)) {
            hangUp(2);
            return;
        }
        if ("GROUPCALL_SSRC_DUPLICATE_MUCH".equals(tL_error.text)) {
            startConferenceGroupCall(false, 0, str, false);
            return;
        }
        if (tL_error.text.startsWith("CONF_WRITE_CHAIN_INVALID")) {
            stopSelf();
            return;
        }
        if (!"GROUPCALL_INVALID".equals(tL_error.text)) {
            jn7.f(this.currentAccount).k(jn7.M0, 6, tL_error.text);
            hangUp(0);
        } else {
            org.telegram.ui.ActionBar.e S = LaunchActivity.S();
            if (S != null) {
                d31.b0(S).Q(R.raw.linkbroken, 36, ob6.M0(2131751787, null)).j().s = false;
            }
            hangUp(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$57(int i, boolean z, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject == null) {
            hl.c3(new b6c(this, tL_error, str, (byte) 15));
            return;
        }
        hl.c3(new ilc(this, i, (byte) 3));
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        long selfId = getSelfId();
        ArrayList z0 = uc7.z0(updates, TL_update.TL_updateGroupCallChainBlocks.class);
        ArrayList y0 = uc7.y0(updates, TL_update.TL_updateGroupCall.class);
        int size = y0.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = y0.get(i2);
            i2++;
            TLRPC.GroupCall groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            vc2 vc2Var = this.groupCall;
            if (vc2Var != null) {
                vc2Var.w(k5.a(this.currentAccount), groupCall);
            }
            ConferenceCall conferenceCall = this.conference;
            if (conferenceCall != null) {
                atb.a(conferenceCall.groupCall, groupCall);
                conferenceCall.groupCall = groupCall;
            }
        }
        ArrayList y02 = uc7.y0(updates, TL_update.TL_updateGroupCallParticipants.class);
        int size2 = y02.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = y02.get(i3);
            i3++;
            TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) obj2;
            int size3 = tL_updateGroupCallParticipants.participants.size();
            int i4 = 0;
            while (true) {
                if (i4 < size3) {
                    TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i4);
                    if (r47.B1(groupCallParticipant.peer) == selfId) {
                        hl.c3(new jlc(this, groupCallParticipant, (byte) 1));
                        if (f11.a) {
                            c00.q(groupCallParticipant.source, new StringBuilder("join source = "));
                        }
                    } else {
                        i4++;
                    }
                }
            }
        }
        ArrayList y03 = uc7.y0(updates, TL_update.TL_updateGroupCallConnection.class);
        int size4 = y03.size();
        int i5 = 0;
        while (i5 < size4) {
            Object obj3 = y03.get(i5);
            i5++;
            TL_update.TL_updateGroupCallConnection tL_updateGroupCallConnection = (TL_update.TL_updateGroupCallConnection) obj3;
            if (!tL_updateGroupCallConnection.presentation) {
                this.myParams = tL_updateGroupCallConnection.params;
            }
        }
        uc7.s1(this.currentAccount).Y3(updates, false);
        hl.c3(new yn6((Object) this, (Object) z0, z, (byte) 29));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startConferenceGroupCall$58(String str, int i, boolean z) {
        TL_phone.joinGroupCall joingroupcall = new TL_phone.joinGroupCall();
        joingroupcall.muted = this.micMute;
        joingroupcall.video_stopped = this.videoState[0] != 2;
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall != null) {
            joingroupcall.call = conferenceCall.inputGroupCall;
            joingroupcall.flags |= 8;
            joingroupcall.public_key = conferenceCall.getMyPublicKey();
            joingroupcall.block = this.conference.getLastBlock();
        } else {
            vc2 vc2Var = this.groupCall;
            if (vc2Var != null) {
                joingroupcall.call = vc2Var.h(vc2Var.a);
            }
        }
        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
        joingroupcall.params = tL_dataJSON;
        tL_dataJSON.data = str;
        if (!TextUtils.isEmpty(this.joinHash)) {
            joingroupcall.invite_hash = this.joinHash;
            joingroupcall.flags |= 2;
        }
        TLRPC.InputPeer inputPeer = this.groupCallPeer;
        if (inputPeer != null) {
            joingroupcall.join_as = inputPeer;
        } else {
            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
            joingroupcall.join_as = tL_inputPeerUser;
            tL_inputPeerUser.user_id = yac.h(k5.a(this.currentAccount).a).e();
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(joingroupcall, new jk3(i, str, this, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$59(Runnable runnable) {
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall != null) {
            conferenceCall.generateAddSelfBlock();
            runnable.run();
            for (int i = 0; i < 2; i++) {
                NativeInstance nativeInstance = this.tgVoip[i];
                if (nativeInstance != null) {
                    nativeInstance.setConferenceCallId(this.conference.getCallId());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConnectingSound$86() {
        int i = this.spPlayId;
        if (i != 0) {
            this.soundPool.stop(i);
        }
        int play = this.soundPool.play(this.spConnectingId, 1.0f, 1.0f, 0, -1, 1.0f);
        this.spPlayId = play;
        if (play == 0) {
            10 r0 = new 10();
            this.connectingSoundRunnable = r0;
            hl.d3(r0, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGroupCall$24(TL_update.TL_updateGroupCall tL_updateGroupCall) {
        if (sharedInstance == null) {
            return;
        }
        TLRPC.GroupCall groupCall = this.groupCall.b;
        TLRPC.GroupCall groupCall2 = tL_updateGroupCall.call;
        groupCall.access_hash = groupCall2.access_hash;
        groupCall.id = groupCall2.id;
        uc7 s1 = uc7.s1(this.currentAccount);
        vc2 vc2Var = this.groupCall;
        s1.h4(vc2Var.c, vc2Var);
        startGroupCall(0, null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGroupCall$25(TLRPC.TL_error tL_error) {
        jn7.f(this.currentAccount).k(jn7.M0, 6, tL_error.text);
        hangUp(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startGroupCall$26(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject == null) {
            hl.c3(new klc(this, tL_error, (byte) 2));
            return;
        }
        try {
            this.groupCallBottomSheetLatch.await(800L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            cc4.g(e, true);
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        byte b = 0;
        int i = 0;
        while (true) {
            if (i >= updates.updates.size()) {
                break;
            }
            TLRPC.Update update = updates.updates.get(i);
            if (update instanceof TL_update.TL_updateGroupCall) {
                hl.c3(new vlc(this, (TL_update.TL_updateGroupCall) update, b));
                break;
            }
            i++;
        }
        uc7.s1(this.currentAccount).Y3(updates, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startGroupCall$27() {
        jn7.e().k(jn7.v2, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGroupCall$28(int i) {
        this.mySource[0] = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGroupCall$29(TLRPC.GroupCallParticipant groupCallParticipant) {
        this.mySource[0] = groupCallParticipant.source;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGroupCall$30(boolean z) {
        this.groupCall.l(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startGroupCall$31(TLRPC.TL_error tL_error) {
        TLRPC.ChatFull N0;
        if (!"JOIN_AS_PEER_INVALID".equals(tL_error.text)) {
            if ("GROUPCALL_SSRC_DUPLICATE_MUCH".equals(tL_error.text)) {
                createGroupInstance(0, false, false);
                return;
            }
            if ("GROUPCALL_INVALID".equals(tL_error.text) && this.chat != null) {
                uc7.s1(this.currentAccount).e3(0, this.chat.id, true);
            }
            jn7.f(this.currentAccount).k(jn7.M0, 6, tL_error.text);
            hangUp(0);
            return;
        }
        if (this.chat != null && (N0 = uc7.s1(this.currentAccount).N0(this.chat.id)) != null) {
            boolean z = N0 instanceof TLRPC.TL_chatFull;
            int i = N0.flags;
            if (z) {
                N0.flags = i & (-32769);
            } else {
                N0.flags = i & (-67108865);
            }
            N0.groupcall_default_join_as = null;
            bw5.C1 = null;
        }
        hangUp(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGroupCall$32(int i, boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = 0;
        if (tLObject == null) {
            hl.c3(new klc(this, tL_error, b));
            return;
        }
        hl.c3(new ilc(this, i, b));
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        long selfId = getSelfId();
        int size = updates.updates.size();
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.Update update = updates.updates.get(i2);
            if (update instanceof TL_update.TL_updateGroupCallParticipants) {
                TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) update;
                int size2 = tL_updateGroupCallParticipants.participants.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size2) {
                        TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i3);
                        if (r47.B1(groupCallParticipant.peer) == selfId) {
                            hl.c3(new jlc(this, groupCallParticipant, b));
                            if (f11.a) {
                                c00.q(groupCallParticipant.source, new StringBuilder("join source = "));
                            }
                        } else {
                            i3++;
                        }
                    }
                }
            } else if (update instanceof TL_update.TL_updateGroupCallConnection) {
                TL_update.TL_updateGroupCallConnection tL_updateGroupCallConnection = (TL_update.TL_updateGroupCallConnection) update;
                if (!tL_updateGroupCallConnection.presentation) {
                    this.myParams = tL_updateGroupCallConnection.params;
                }
            }
        }
        uc7.s1(this.currentAccount).Y3(updates, false);
        hl.c3(new q38((byte) 27, (Object) this, z));
        startGroupCheckShortpoll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGroupCheckShortpoll$64(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (this.shortPollRunnable == null || sharedInstance == null || this.groupCall == null) {
            return;
        }
        if (!(tLObject instanceof TL_phone.groupCall)) {
            if (tL_error == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                return;
            }
            stopSelf();
            return;
        }
        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
        uc7.s1(this.currentAccount).j4(groupcall.users, false);
        uc7.s1(this.currentAccount).c4(groupcall.chats, false);
        this.groupCall.w(k5.a(this.currentAccount), groupcall.call);
        this.groupCall.l(true);
        this.shortPollRunnable = null;
        this.checkRequestId = 0;
        startGroupCheckShortpoll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGroupCheckShortpoll$65(TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new nlc(this, tLObject, tL_error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGroupCheckShortpoll$66(TLRPC.TL_error tL_error, TLObject tLObject, TL_phone.checkGroupCall checkgroupcall) {
        boolean z;
        boolean z2;
        TLRPC.GroupCall groupCall;
        if (this.shortPollRunnable == null || sharedInstance == null || this.groupCall == null) {
            return;
        }
        byte b = 0;
        if (this.conference != null && tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text) && this.groupCall.h(true) != null && this.groupCall.h(false) != null) {
            TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
            getgroupcall.call = this.groupCall.h(false);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcall, new hlc(this, b));
            return;
        }
        this.shortPollRunnable = null;
        this.checkRequestId = 0;
        if (tLObject instanceof Vector) {
            ArrayList<Integer> intArray = ((Vector) tLObject).toIntArray();
            int i = this.mySource[0];
            z2 = (i == 0 || !checkgroupcall.sources.contains(Integer.valueOf(i)) || intArray.contains(Integer.valueOf(this.mySource[0]))) ? false : true;
            int i2 = this.mySource[1];
            if (i2 != 0 && checkgroupcall.sources.contains(Integer.valueOf(i2)) && !intArray.contains(Integer.valueOf(this.mySource[1]))) {
                z = true;
            }
            z = false;
        } else {
            if (tL_error == null || tL_error.code != 400) {
                z = false;
            } else {
                int i3 = this.mySource[1];
                if (i3 == 0 || !checkgroupcall.sources.contains(Integer.valueOf(i3))) {
                    z2 = true;
                    z = false;
                } else {
                    z = true;
                }
            }
            z2 = z;
        }
        if (z2) {
            createGroupInstance(0, false, false);
        }
        if (z) {
            createGroupInstance(1, false, false);
        }
        int[] iArr = this.mySource;
        if (iArr[1] == 0 && iArr[0] == 0 && ((groupCall = this.groupCall.b) == null || !groupCall.rtmp_stream)) {
            return;
        }
        startGroupCheckShortpoll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGroupCheckShortpoll$67(TL_phone.checkGroupCall checkgroupcall, TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new kta((Object) this, (Object) tL_error, (Object) tLObject, (Object) checkgroupcall, (byte) 25));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGroupCheckShortpoll$68() {
        vc2 vc2Var;
        TLRPC.GroupCall groupCall;
        if (this.shortPollRunnable == null || sharedInstance == null || (vc2Var = this.groupCall) == null) {
            return;
        }
        int[] iArr = this.mySource;
        int i = 0;
        if (iArr[0] == 0 && iArr[1] == 0 && ((groupCall = vc2Var.b) == null || !groupCall.rtmp_stream)) {
            return;
        }
        TL_phone.checkGroupCall checkgroupcall = new TL_phone.checkGroupCall();
        TLRPC.InputGroupCall h = this.groupCall.h(true);
        vc2 vc2Var2 = this.groupCall;
        if (h != null) {
            checkgroupcall.call = vc2Var2.h(true);
        } else {
            checkgroupcall.call = vc2Var2.h(false);
        }
        while (true) {
            int[] iArr2 = this.mySource;
            if (i >= iArr2.length) {
                this.checkRequestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(checkgroupcall, new isa(this, checkgroupcall, (byte) 24));
                return;
            }
            int i2 = iArr2[i];
            if (i2 != 0) {
                checkgroupcall.sources.add(Integer.valueOf(i2));
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startOutgoingCall$10(byte[] bArr, TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new kta((Object) this, (Object) tL_error, (Object) tLObject, (Object) bArr, (byte) 27));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startOutgoingCall$11(jf7 jf7Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        jf7 jf7Var2;
        this.callReqId = 0;
        if (this.endCallAfterRequest) {
            callEnded();
            return;
        }
        if (tL_error != null) {
            if (f11.a) {
                cc4.d("Error on getDhConfig " + tL_error);
            }
            callFailed();
            return;
        }
        TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
        if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
            byte[] bArr = messages_dhconfig.p;
            int i = messages_dhconfig.g;
            Pattern pattern = Utilities.a;
            if (!ConnectionsManager.native_isGoodPrime(bArr, i)) {
                callFailed();
                return;
            }
            byte[] bArr2 = messages_dhconfig.p;
            jf7Var.G();
            jf7Var.y = bArr2;
            int i2 = messages_dhconfig.g;
            jf7Var.G();
            jf7Var.E = i2;
            int i3 = messages_dhconfig.version;
            jf7Var.G();
            jf7Var.x = i3;
            jf7Var.G();
            int i4 = jf7Var.x;
            jf7Var.G();
            int i5 = jf7Var.E;
            jf7Var.G();
            jf7Var2 = jf7Var;
            jf7Var.a.c(new aq1((Object) jf7Var2, i4, i5, (Object) jf7Var.y, (byte) 10));
        } else {
            jf7Var2 = jf7Var;
        }
        byte[] bArr3 = new byte[256];
        for (int i6 = 0; i6 < 256; i6++) {
            bArr3[i6] = (byte) (((byte) (Utilities.b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i6]);
        }
        jf7Var2.G();
        BigInteger valueOf = BigInteger.valueOf(jf7Var2.E);
        BigInteger bigInteger = new BigInteger(1, bArr3);
        jf7Var2.G();
        byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, jf7Var2.y)).toByteArray();
        if (byteArray.length > 256) {
            byte[] bArr4 = new byte[256];
            System.arraycopy(byteArray, 1, bArr4, 0, 256);
            byteArray = bArr4;
        }
        TL_phone.requestCall requestcall = new TL_phone.requestCall();
        requestcall.user_id = uc7.s1(this.currentAccount).q1(this.user);
        TL_phone.TL_phoneCallProtocol tL_phoneCallProtocol = new TL_phone.TL_phoneCallProtocol();
        requestcall.protocol = tL_phoneCallProtocol;
        requestcall.video = this.videoCall;
        tL_phoneCallProtocol.udp_p2p = true;
        tL_phoneCallProtocol.udp_reflector = true;
        tL_phoneCallProtocol.min_layer = 65;
        tL_phoneCallProtocol.max_layer = Instance.getConnectionMaxLayer();
        Collections.addAll(requestcall.protocol.library_versions, NativeInstance.getAllVersions());
        this.g_a = byteArray;
        requestcall.g_a_hash = Utilities.o(byteArray.length, byteArray);
        requestcall.random_id = Utilities.b.nextInt();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(requestcall, new isa(this, bArr3, (byte) 25), 65536);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startOutgoingCall$6() {
        jn7.e().k(jn7.v2, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startOutgoingCall$7(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (f11.a) {
            if (tL_error != null) {
                cc4.d("error on phone.discardCall: " + tL_error);
            } else {
                cc4.b("phone.discardCall " + tLObject);
            }
        }
        hl.c3(new glc(this, (byte) 25));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startOutgoingCall$8() {
        this.timeoutRunnable = null;
        TL_phone.discardCall discardcall = new TL_phone.discardCall();
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        discardcall.peer = tL_inputPhoneCall;
        TL_phone.PhoneCall phoneCall = this.privateCall;
        tL_inputPhoneCall.access_hash = phoneCall.access_hash;
        tL_inputPhoneCall.id = phoneCall.id;
        discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonMissed();
        cc4.d("discardCall " + discardcall.reason);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardcall, new hlc(this, (byte) 1), 65536);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startOutgoingCall$9(TLRPC.TL_error tL_error, TLObject tLObject, byte[] bArr) {
        if (tL_error != null) {
            if (tL_error.code == 400 && "PARTICIPANT_VERSION_OUTDATED".equals(tL_error.text)) {
                callFailed(Instance.ERROR_PEER_OUTDATED);
                return;
            }
            int i = tL_error.code;
            if (i == 403) {
                callFailed(Instance.ERROR_PRIVACY);
                return;
            }
            if (i == 406) {
                callFailed(Instance.ERROR_LOCALIZED);
                return;
            }
            if (f11.a) {
                cc4.d("Error on phone.requestCall: " + tL_error);
            }
            callFailed();
            return;
        }
        this.privateCall = ((TL_phone.TL_phone_phoneCall) tLObject).phone_call;
        this.a_or_b = bArr;
        dispatchStateChanged(13);
        if (this.endCallAfterRequest) {
            hangUp();
            return;
        }
        if (this.pendingUpdates.size() > 0 && this.privateCall != null) {
            ArrayList<TL_phone.PhoneCall> arrayList = this.pendingUpdates;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_phone.PhoneCall phoneCall = arrayList.get(i2);
                i2++;
                onCallUpdated(phoneCall);
            }
            this.pendingUpdates.clear();
        }
        glc glcVar = new glc(this, (byte) 20);
        this.timeoutRunnable = glcVar;
        hl.d3(glcVar, uc7.s1(this.currentAccount).Z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startRingtoneAndVibration$93(MediaPlayer mediaPlayer) {
        try {
            this.ringtonePlayer.start();
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startScreenCapture$60(int i) {
        this.mySource[1] = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startScreenCapture$61(TLRPC.Updates updates) {
        if (this.tgVoip[1] != null) {
            long selfId = getSelfId();
            int size = updates.updates.size();
            for (int i = 0; i < size; i++) {
                TLRPC.Update update = updates.updates.get(i);
                if (update instanceof TL_update.TL_updateGroupCallConnection) {
                    TL_update.TL_updateGroupCallConnection tL_updateGroupCallConnection = (TL_update.TL_updateGroupCallConnection) update;
                    if (tL_updateGroupCallConnection.presentation) {
                        this.tgVoip[1].setJoinResponsePayload(tL_updateGroupCallConnection.params.data);
                    }
                } else if (update instanceof TL_update.TL_updateGroupCallParticipants) {
                    TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) update;
                    int size2 = tL_updateGroupCallParticipants.participants.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size2) {
                            TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i2);
                            if (r47.B1(groupCallParticipant.peer) == selfId) {
                                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.presentation;
                                if (tL_groupCallParticipantVideo != null) {
                                    if ((tL_groupCallParticipantVideo.flags & 2) != 0) {
                                        this.mySource[1] = tL_groupCallParticipantVideo.audio_source;
                                    } else {
                                        int size3 = tL_groupCallParticipantVideo.source_groups.size();
                                        for (int i3 = 0; i3 < size3; i3++) {
                                            TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = groupCallParticipant.presentation.source_groups.get(i3);
                                            if (tL_groupCallParticipantVideoSourceGroup.sources.size() > 0) {
                                                this.mySource[1] = tL_groupCallParticipantVideoSourceGroup.sources.get(0).intValue();
                                            }
                                        }
                                    }
                                }
                            } else {
                                i2++;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startScreenCapture$62(TLRPC.TL_error tL_error) {
        TLRPC.ChatFull N0;
        if ("GROUPCALL_VIDEO_TOO_MUCH".equals(tL_error.text)) {
            this.groupCall.t();
            return;
        }
        if (!"JOIN_AS_PEER_INVALID".equals(tL_error.text)) {
            if ("GROUPCALL_SSRC_DUPLICATE_MUCH".equals(tL_error.text)) {
                createGroupInstance(1, false, false);
                return;
            } else {
                if (!"GROUPCALL_INVALID".equals(tL_error.text) || this.chat == null) {
                    return;
                }
                uc7.s1(this.currentAccount).e3(0, this.chat.id, true);
                return;
            }
        }
        if (this.chat != null && (N0 = uc7.s1(this.currentAccount).N0(this.chat.id)) != null) {
            boolean z = N0 instanceof TLRPC.TL_chatFull;
            int i = N0.flags;
            if (z) {
                N0.flags = i & (-32769);
            } else {
                N0.flags = i & (-67108865);
            }
            N0.groupcall_default_join_as = null;
            bw5.C1 = null;
        }
        hangUp(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startScreenCapture$63(int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject == null) {
            hl.c3(new klc(this, tL_error, (byte) 1));
            return;
        }
        hl.c3(new ilc(this, i, (byte) 4));
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        hl.c3(new g9c(this, updates, (byte) 29));
        uc7.s1(this.currentAccount).Y3(updates, false);
        startGroupCheckShortpoll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopScreenCapture$15(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            uc7.s1(this.currentAccount).Y3((TLRPC.Updates) tLObject, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$switchToSpeaker$88(Boolean bool, Boolean bool2) {
        updateOutputGainControlState();
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StateListener stateListener = arrayList.get(i);
            i++;
            stateListener.onAudioSettingsChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$switchToSpeaker$89() {
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if ((isBluetoothHeadsetConnected() && hasEarpiece()) || this.isHeadsetPlugged || isSpeakerphoneOn()) {
            return;
        }
        voipAudioManager.setSpeakerphoneOn(true);
        voipAudioManager.isBluetoothAndSpeakerOnAsync(new ulc(this, (byte) 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleSpeakerphoneOrShowRouteSheet$90(DialogInterface dialogInterface, int i) {
        if (getSharedInstance() == null) {
            return;
        }
        setAudioOutput(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$toggleSpeakerphoneOrShowRouteSheet$91(nx0 nx0Var, Integer num, DialogInterface dialogInterface) {
        for (int i = 0; i < nx0Var.x0.size(); i++) {
            int i2 = aob.j5;
            nx0Var.x0(i, aob.w0(null, i2, false), aob.w0(null, i2, false));
        }
        if (num != null) {
            int w0 = aob.w0(null, aob.k5, false);
            nx0Var.x0(num.intValue(), w0, w0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleSpeakerphoneOrShowRouteSheet$92(Boolean bool, Boolean bool2) {
        updateOutputGainControlState();
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StateListener stateListener = arrayList.get(i);
            i++;
            stateListener.onAudioSettingsChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateBluetoothHeadsetState$110(VoipAudioManager voipAudioManager) {
        try {
            voipAudioManager.startBluetooth();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateConnectionState$78(int i) {
        if (this.switchingStreamTimeoutRunnable == null) {
            return;
        }
        this.switchingStream = false;
        lambda$createGroupInstance$75(i, 0, true);
        this.switchingStreamTimeoutRunnable = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateConnectionState$79() {
        int i = this.spPlayId;
        if (i != 0) {
            this.soundPool.stop(i);
        }
        this.spPlayId = this.soundPool.play(this.spVoiceChatConnecting, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateConnectionState$80() {
        int i = this.spPlayId;
        if (i != 0) {
            this.soundPool.stop(i);
            this.spPlayId = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateServerConfig$104(SharedPreferences sharedPreferences, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            String str = ((TLRPC.TL_dataJSON) tLObject).data;
            Instance.setGlobalServerConfig(str);
            sharedPreferences.edit().putString("voip_server_config", str).commit();
        }
    }

    private void loadResources() {
        CallAudioDevice.setPlayoutUsage(2);
        Utilities.e.c(new glc(this, (byte) 18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onBroadcastStateChanged, reason: merged with bridge method [inline-methods] */
    public void lambda$createGroupInstance$76(boolean z, boolean z2) {
        vc2 vc2Var;
        if (z2 || isRtmpStreamCall()) {
            return;
        }
        if (!z) {
            stopBroadcastListenerSession();
            return;
        }
        NativeInstance nativeInstance = this.tgVoip[0];
        if (this.broadcastListenerSession != null || nativeInstance == null || (vc2Var = this.groupCall) == null) {
            return;
        }
        g01 g01Var = new g01(this.currentAccount, vc2Var.h(vc2Var.a), getStreamDatacenterId(), nativeInstance, new o48((Object) this, (Object) vc2Var, (Object) nativeInstance, (byte) 21));
        this.broadcastListenerSession = g01Var;
        byte b = 6;
        g01Var.b.post(new xac(b, g01Var, org.telegram.messenger.a.o()));
        updateBroadcastVideoRequests();
        g01 g01Var2 = this.broadcastListenerSession;
        Handler handler = g01Var2.b;
        xz0 xz0Var = g01Var2.d;
        Objects.requireNonNull(xz0Var);
        handler.post(new gz0(xz0Var, b));
    }

    private void onTgVoipStop(Instance.FinalState finalState) {
        if (this.user == null || this.privateCall == null || finalState == null) {
            return;
        }
        if (TextUtils.isEmpty(finalState.debugLog)) {
            try {
                finalState.debugLog = getStringFromFile(xkc.e(String.valueOf(this.privateCall.id)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        uc7 s1 = uc7.s1(this.currentAccount);
        VoIPDebugToSend voIPDebugToSend = s1.f1;
        if (voIPDebugToSend == null) {
            voIPDebugToSend = new VoIPDebugToSend(this.currentAccount);
            s1.f1 = voIPDebugToSend;
        }
        VoIPDebugToSend voIPDebugToSend2 = voIPDebugToSend;
        TL_phone.PhoneCall phoneCall = this.privateCall;
        voIPDebugToSend2.push(phoneCall.id, phoneCall.access_hash, finalState, this.lastLogFilePath);
        this.lastLogFilePath = null;
        boolean z = this.needSendDebugLog;
        if (z) {
            s1.f1.done(this.privateCall.id, z);
            this.needSendDebugLog = false;
        }
    }

    private void processAcceptedCall() {
        byte[] bArr;
        dispatchStateChanged(12);
        jf7 Y = jf7.Y(this.currentAccount);
        Y.G();
        BigInteger bigInteger = new BigInteger(1, Y.y);
        BigInteger bigInteger2 = new BigInteger(1, this.privateCall.g_b);
        if (!Utilities.w(bigInteger2, bigInteger)) {
            if (f11.a) {
                cc4.l("stopping VoIP service, bad Ga and Gb");
            }
            callFailed();
            return;
        }
        byte[] byteArray = bigInteger2.modPow(new BigInteger(1, this.a_or_b), bigInteger).toByteArray();
        if (byteArray.length <= 256) {
            if (byteArray.length < 256) {
                bArr = new byte[256];
                System.arraycopy(byteArray, 0, bArr, 256 - byteArray.length, byteArray.length);
                for (int i = 0; i < 256 - byteArray.length; i++) {
                    bArr[i] = 0;
                }
            }
            byte[] n = Utilities.n(byteArray);
            byte[] bArr2 = new byte[8];
            System.arraycopy(n, n.length - 8, bArr2, 0, 8);
            long g = Utilities.g(bArr2);
            this.authKey = byteArray;
            this.keyFingerprint = g;
            TL_phone.confirmCall confirmcall = new TL_phone.confirmCall();
            confirmcall.g_a = this.g_a;
            confirmcall.key_fingerprint = g;
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            confirmcall.peer = tL_inputPhoneCall;
            TL_phone.PhoneCall phoneCall = this.privateCall;
            tL_inputPhoneCall.id = phoneCall.id;
            tL_inputPhoneCall.access_hash = phoneCall.access_hash;
            TL_phone.TL_phoneCallProtocol tL_phoneCallProtocol = new TL_phone.TL_phoneCallProtocol();
            confirmcall.protocol = tL_phoneCallProtocol;
            tL_phoneCallProtocol.max_layer = Instance.getConnectionMaxLayer();
            TL_phone.TL_phoneCallProtocol tL_phoneCallProtocol2 = confirmcall.protocol;
            tL_phoneCallProtocol2.min_layer = 65;
            tL_phoneCallProtocol2.udp_reflector = true;
            tL_phoneCallProtocol2.udp_p2p = true;
            Collections.addAll(tL_phoneCallProtocol2.library_versions, NativeInstance.getAllVersions());
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmcall, new hlc(this, (byte) 4));
        }
        bArr = new byte[256];
        System.arraycopy(byteArray, byteArray.length - 256, bArr, 0, 256);
        byteArray = bArr;
        byte[] n2 = Utilities.n(byteArray);
        byte[] bArr22 = new byte[8];
        System.arraycopy(n2, n2.length - 8, bArr22, 0, 8);
        long g2 = Utilities.g(bArr22);
        this.authKey = byteArray;
        this.keyFingerprint = g2;
        TL_phone.confirmCall confirmcall2 = new TL_phone.confirmCall();
        confirmcall2.g_a = this.g_a;
        confirmcall2.key_fingerprint = g2;
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall2 = new TLRPC.TL_inputPhoneCall();
        confirmcall2.peer = tL_inputPhoneCall2;
        TL_phone.PhoneCall phoneCall2 = this.privateCall;
        tL_inputPhoneCall2.id = phoneCall2.id;
        tL_inputPhoneCall2.access_hash = phoneCall2.access_hash;
        TL_phone.TL_phoneCallProtocol tL_phoneCallProtocol3 = new TL_phone.TL_phoneCallProtocol();
        confirmcall2.protocol = tL_phoneCallProtocol3;
        tL_phoneCallProtocol3.max_layer = Instance.getConnectionMaxLayer();
        TL_phone.TL_phoneCallProtocol tL_phoneCallProtocol22 = confirmcall2.protocol;
        tL_phoneCallProtocol22.min_layer = 65;
        tL_phoneCallProtocol22.udp_reflector = true;
        tL_phoneCallProtocol22.udp_p2p = true;
        Collections.addAll(tL_phoneCallProtocol22.library_versions, NativeInstance.getAllVersions());
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmcall2, new hlc(this, (byte) 4));
    }

    private void releaseRtmpStreamPlayer() {
        rr9 rr9Var = this.rtmpStreamPlayer;
        byte b = 0;
        if (rr9Var != null) {
            sr9 sr9Var = this.rtmpStreamVideoSinks;
            olc olcVar = sr9Var != null ? new olc(sr9Var, b) : null;
            if (!rr9Var.b.post(new kr9(rr9Var, olcVar, (byte) 1)) && olcVar != null) {
                olcVar.run();
            }
            this.rtmpStreamPlayer = null;
            this.rtmpStreamVideoSinks = null;
        }
        this.rtmpStreamPlayerStarted = false;
        this.rtmpStreamRejoining = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeIncomingVideoOutput(ProxyVideoSink proxyVideoSink) {
        if (proxyVideoSink.nativeInstance == RTMP_STREAM_OUTPUT) {
            sr9 sr9Var = this.rtmpStreamVideoSinks;
            if (sr9Var != null) {
                sr9Var.a.remove(proxyVideoSink);
            }
        } else {
            NativeInstance nativeInstance = this.tgVoip[0];
            if (nativeInstance != null) {
                nativeInstance.removeIncomingVideoOutput(proxyVideoSink.nativeInstance);
            }
        }
        hl.c3(new glc(this, (byte) 16));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00da  */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void showIncomingNotification(String str, TLObject tLObject, boolean z, int i) {
        int i2;
        int i3;
        Notification notification;
        boolean z2;
        Intent intent = new Intent(this, (Class<?>) LaunchActivity.class);
        intent.setAction("voip");
        Notification.Builder contentIntent = new Notification.Builder(this).setContentTitle(z ? ob6.M0(2131742949, null) : ob6.M0(2131742952, null)).setSmallIcon(R.drawable.call).setContentIntent(PendingIntent.getActivity(this, 0, intent, 33554432));
        if (Build.VERSION.SDK_INT >= 26) {
            SharedPreferences f1 = uc7.f1();
            int i4 = f1.getInt("calls_notification_channel", 0);
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("incoming_calls2" + i4);
            if (notificationChannel != null) {
                notificationManager.deleteNotificationChannel(notificationChannel.getId());
            }
            NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel("incoming_calls3" + i4);
            if (notificationChannel2 != null) {
                notificationManager.deleteNotificationChannel(notificationChannel2.getId());
            }
            NotificationChannel notificationChannel3 = notificationManager.getNotificationChannel("incoming_calls4" + i4);
            if (notificationChannel3 != null) {
                if (notificationChannel3.getImportance() < 4 || notificationChannel3.getSound() != null) {
                    if (f11.a) {
                        cc4.b("User messed up the notification channel; deleting it and creating a proper one");
                    }
                    notificationManager.deleteNotificationChannel("incoming_calls4" + i4);
                    i4++;
                    f1.edit().putInt("calls_notification_channel", i4).commit();
                } else {
                    z2 = false;
                    if (z2) {
                        AudioAttributes build = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(2).setUsage(2).build();
                        gk.g();
                        NotificationChannel notificationChannel4 = new NotificationChannel(uh9.k(i4, "incoming_calls4"), ob6.M0(2131748957, null), 4);
                        try {
                            notificationChannel4.setSound(null, build);
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                        notificationChannel4.setDescription(ob6.M0(2131748956, null));
                        notificationChannel4.enableVibration(false);
                        notificationChannel4.enableLights(false);
                        notificationChannel4.setBypassDnd(true);
                        try {
                            notificationManager.createNotificationChannel(notificationChannel4);
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                            stopSelf();
                            return;
                        }
                    }
                    contentIntent.setChannelId("incoming_calls4" + i4);
                }
            }
            z2 = true;
            if (z2) {
            }
            contentIntent.setChannelId("incoming_calls4" + i4);
        } else {
            contentIntent.setSound(null);
        }
        Intent intent2 = new Intent(this, (Class<?>) VoIPActionsReceiver.class);
        intent2.setAction(getPackageName() + ".DECLINE_CALL");
        intent2.putExtra("call_id", getCallID());
        String M0 = ob6.M0(2131743070, null);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 24 || i5 >= 31) {
            i2 = 0;
        } else {
            SpannableString spannableString = new SpannableString(M0);
            i2 = 0;
            spannableString.setSpan(new ForegroundColorSpan(-769226), 0, spannableString.length(), 0);
            M0 = spannableString;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(this, i2, intent2, 301989888);
        Intent intent3 = new Intent(this, (Class<?>) VoIPActionsReceiver.class);
        intent3.setAction(getPackageName() + ".ANSWER_CALL");
        String str2 = M0;
        intent3.putExtra("call_id", getCallID());
        String M02 = ob6.M0(2131743156, null);
        if (i5 < 24 || i5 >= 31) {
            i3 = 0;
        } else {
            SpannableString spannableString2 = new SpannableString(M02);
            i3 = 0;
            spannableString2.setSpan(new ForegroundColorSpan(-16733696), 0, spannableString2.length(), 0);
            M02 = spannableString2;
        }
        PendingIntent broadcast2 = PendingIntent.getBroadcast(this, i3, intent3, 301989888);
        contentIntent.setPriority(2);
        contentIntent.setShowWhen(i3);
        contentIntent.setColor(-13851168);
        contentIntent.setVibrate(new long[i3]);
        contentIntent.setCategory("call");
        contentIntent.setFullScreenIntent(PendingIntent.getActivity(this, i3, intent, 33554432), true);
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            if (!TextUtils.isEmpty(user.phone)) {
                contentIntent.addPerson("tel:" + user.phone);
            }
        }
        if (i5 >= 31) {
            Bitmap roundAvatarBitmap = getRoundAvatarBitmap(this, this.currentAccount, tLObject);
            String o = lv2.o(tLObject);
            if (TextUtils.isEmpty(o)) {
                o = "___";
            }
            contentIntent.setStyle(Notification.CallStyle.forIncomingCall(l35.a().setName(o).setIcon(Icon.createWithAdaptiveBitmap(roundAvatarBitmap)).build(), broadcast, broadcast2));
            notification = contentIntent.build();
        } else {
            contentIntent.addAction(R.drawable.ic_call_end_white_24dp, str2, broadcast);
            contentIntent.addAction(R.drawable.call, M02, broadcast2);
            contentIntent.setContentText(str);
            RemoteViews remoteViews = new RemoteViews(getPackageName(), ob6.a0 ? R.layout.call_notification_rtl : R.layout.call_notification);
            remoteViews.setTextViewText(R.id.name, str);
            remoteViews.setViewVisibility(R.id.subtitle, 8);
            if (yac.c() > 1) {
                TLRPC.User f = yac.h(this.currentAccount).f();
                remoteViews.setTextViewText(R.id.title, z ? ob6.a0("VoipInVideoCallBrandingWithName", null, 2131742948, lv2.m(0, f.first_name, f.last_name)) : ob6.a0("VoipInCallBrandingWithName", null, 2131742951, lv2.m(0, f.first_name, f.last_name)));
            } else {
                remoteViews.setTextViewText(R.id.title, ob6.M0(z ? 2131742949 : 2131742952, null));
            }
            Bitmap roundAvatarBitmap2 = getRoundAvatarBitmap(this, this.currentAccount, tLObject);
            remoteViews.setTextViewText(R.id.answer_text, ob6.M0(2131743156, null));
            remoteViews.setTextViewText(R.id.decline_text, ob6.M0(2131743070, null));
            remoteViews.setImageViewBitmap(R.id.photo, roundAvatarBitmap2);
            remoteViews.setOnClickPendingIntent(R.id.answer_btn, broadcast2);
            remoteViews.setOnClickPendingIntent(R.id.decline_btn, broadcast);
            contentIntent.setLargeIcon(roundAvatarBitmap2);
            notification = contentIntent.getNotification();
            notification.bigContentView = remoteViews;
            notification.headsUpContentView = remoteViews;
        }
        this.foregroundStarted = true;
        if (i5 >= 33) {
            this.foregroundId = 202;
            this.foregroundNotification = notification;
            int currentForegroundType = getCurrentForegroundType();
            this.lastForegroundType = currentForegroundType;
            startForeground(202, notification, currentForegroundType);
        } else {
            this.foregroundId = 202;
            this.foregroundNotification = notification;
            startForeground(202, notification);
        }
        startRingtoneAndVibration();
    }

    private void showNotification(String str, Bitmap bitmap) {
        Intent action = new Intent(this, (Class<?>) LaunchActivity.class).setAction(this.groupCall != null ? "voip_chat" : "voip");
        if (this.groupCall != null) {
            action.putExtra("currentAccount", this.currentAccount);
        }
        Notification.Builder contentIntent = new Notification.Builder(this).setContentText(str).setContentIntent(PendingIntent.getActivity(this, 50, action, 33554432));
        boolean isConference = isConference();
        int i = R.drawable.voicechat_active;
        if (isConference) {
            contentIntent.setContentTitle(ob6.M0(2131743078, null));
            if (isMicMute()) {
                i = R.drawable.voicechat_muted;
            }
            contentIntent.setSmallIcon(i);
        } else if (this.groupCall != null) {
            contentIntent.setContentTitle(ob6.M0(xc2.W(this.chat) ? 2131742947 : 2131742871, null));
            if (isMicMute()) {
                i = R.drawable.voicechat_muted;
            }
            contentIntent.setSmallIcon(i);
        } else {
            contentIntent.setContentTitle(ob6.M0(2131742917, null));
            contentIntent.setSmallIcon(R.drawable.call);
            contentIntent.setOngoing(true);
        }
        Intent intent = new Intent(this, (Class<?>) VoIPActionsReceiver.class);
        intent.setAction(getPackageName() + ".END_CALL");
        if (isConference()) {
            contentIntent.addAction(R.drawable.ic_call_end_white_24dp, ob6.M0(2131743075, null), PendingIntent.getBroadcast(this, 0, intent, 167772160));
        } else if (this.groupCall != null) {
            contentIntent.addAction(R.drawable.ic_call_end_white_24dp, ob6.M0(xc2.W(this.chat) ? 2131743123 : 2131743013, null), PendingIntent.getBroadcast(this, 0, intent, 167772160));
        } else {
            contentIntent.addAction(R.drawable.ic_call_end_white_24dp, ob6.M0(2131743064, null), PendingIntent.getBroadcast(this, 0, intent, 167772160));
        }
        contentIntent.setPriority(2);
        contentIntent.setShowWhen(false);
        if (Build.VERSION.SDK_INT >= 26) {
            contentIntent.setColor(-14143951);
            contentIntent.setColorized(true);
            ip7.c();
            contentIntent.setChannelId(ip7.k0);
        } else {
            contentIntent.setColor(-13851168);
        }
        if (!isConference() && bitmap != null) {
            contentIntent.setLargeIcon(bitmap);
        }
        try {
            if (this.foregroundStarted) {
                try {
                    stopForeground(true);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
            this.foregroundStarted = true;
            if (Build.VERSION.SDK_INT < 33) {
                this.foregroundId = 201;
                Notification notification = contentIntent.getNotification();
                this.foregroundNotification = notification;
                startForeground(201, notification);
                return;
            }
            this.foregroundId = 201;
            Notification notification2 = contentIntent.getNotification();
            this.foregroundNotification = notification2;
            int currentForegroundType = getCurrentForegroundType();
            this.lastForegroundType = currentForegroundType;
            startForeground(201, notification2, currentForegroundType);
        } catch (Exception e2) {
            if (bitmap == null || !(e2 instanceof IllegalArgumentException)) {
                return;
            }
            showNotification(str, null);
        }
    }

    private void startConferenceGroupCall(boolean z, int i, String str, boolean z2) {
        if (sharedInstance == this) {
            if (this.groupCallPeer == null) {
                this.groupCallPeer = uc7.n1(yac.h(this.currentAccount).f());
            }
            byte b = 1;
            if (z) {
                k5 a = k5.a(this.currentAccount);
                this.conference = new ConferenceCall(this.currentAccount, yac.h(a.a).e()) { // from class: org.telegram.messenger.voip.VoIPService.7
                    @Override // org.telegram.messenger.voip.ConferenceCall
                    public void gotCallId(long j) {
                        for (int i2 = 0; i2 < 2; i2++) {
                            if (VoIPService.this.tgVoip[i2] != null) {
                                VoIPService.this.tgVoip[i2].setConferenceCallId(j);
                            }
                        }
                    }
                };
                this.chat = null;
                vc2 vc2Var = new vc2();
                this.groupCall = vc2Var;
                vc2Var.b = new TLRPC.TL_groupCall();
                vc2 vc2Var2 = this.groupCall;
                TLRPC.GroupCall groupCall = vc2Var2.b;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                groupCall.rtmp_stream = this.isRtmpStream;
                vc2Var2.c = 0L;
                vc2Var2.C = k5.a(this.currentAccount);
                this.groupCall.y(this.groupCallPeer);
                this.groupCall.f();
                dispatchStateChanged(6);
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.b.nextInt();
                this.groupCallBottomSheetLatch = new CountDownLatch(1);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new isa(this, a, (byte) 26), 65536);
                return;
            }
            if (this.conference == null) {
                int i2 = this.currentAccount;
                ConferenceCall conferenceCall = new ConferenceCall(i2, yac.h(i2).e()) { // from class: org.telegram.messenger.voip.VoIPService.8
                    @Override // org.telegram.messenger.voip.ConferenceCall
                    public void gotCallId(long j) {
                        for (int i3 = 0; i3 < 2; i3++) {
                            if (VoIPService.this.tgVoip[i3] != null) {
                                VoIPService.this.tgVoip[i3].setConferenceCallId(j);
                            }
                        }
                    }
                };
                this.conference = conferenceCall;
                conferenceCall.inputGroupCall = this.joinConference;
            }
            if (this.groupCall == null) {
                vc2 vc2Var3 = new vc2();
                this.groupCall = vc2Var3;
                vc2Var3.a = true;
                vc2Var3.b = new TLRPC.TL_groupCall();
                TLRPC.GroupCall groupCall2 = this.groupCall.b;
                groupCall2.participants_count = 0;
                groupCall2.version = 1;
                groupCall2.can_start_video = true;
                groupCall2.can_change_join_muted = true;
                groupCall2.rtmp_stream = this.isRtmpStream;
                if (this.joinConference instanceof TLRPC.TL_inputGroupCallSlug) {
                    groupCall2.invite_link = "https://t.me/call/" + this.joinConference.slug;
                }
                vc2 vc2Var4 = this.groupCall;
                vc2Var4.c = 0L;
                vc2Var4.C = k5.a(this.currentAccount);
                this.groupCall.y(this.groupCallPeer);
                this.groupCall.f();
                TLRPC.GroupCall groupCall3 = this.joinConferenceCall;
                if (groupCall3 != null) {
                    this.conference.groupCall = groupCall3;
                    this.groupCall.w(k5.a(this.currentAccount), this.joinConferenceCall);
                    this.joinConferenceCall = null;
                }
            }
            if (this.conference.groupCall == null) {
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = this.joinConference;
                getgroupcall.limit = 10;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcall, new hb7((Object) this, i, (Object) str, (byte) 12));
                return;
            }
            if (str != null) {
                if (getSharedInstance() != null) {
                    if (this.groupCall == null && this.conference == null) {
                        return;
                    }
                    dispatchStateChanged(1);
                    if (f11.a) {
                        cc4.b("initital source = " + i);
                    }
                    ps1 ps1Var = new ps1((Object) this, (Object) str, i, z, (byte) 10);
                    if (z2) {
                        this.conference.reset();
                    }
                    this.conference.requestLastBlock(new vlc(this, ps1Var, b));
                    return;
                }
                return;
            }
            configureDeviceForCall();
            showNotification();
            hl.c3(new osa((byte) 13));
            if (this.convertingVoip != null && this.isPrivateScreencast) {
                long[] jArr = this.captureDevice;
                jArr[1] = jArr[0];
                jArr[0] = 0;
                setVideoState(true, this.videoState[0]);
                setVideoState(false, 0);
                this.videoState[0] = 0;
            }
            createFirstGroupInstance();
            long[] jArr2 = this.inviteUsers;
            if (jArr2 != null) {
                for (long j : jArr2) {
                    this.groupCall.a(j);
                }
            }
            mkc mkcVar = mkc.m1;
            if (mkcVar != null) {
                mkcVar.d();
            }
            j95.T0(LaunchActivity.H1, k5.a(yac.t0), null, null, false, null);
        }
    }

    private void startConnectingSound() {
        Utilities.e.c(new glc(this, (byte) 28));
    }

    private void startGroupCall(int i, String str, boolean z) {
        if (sharedInstance == this) {
            byte b = 2;
            if (this.createGroupCall) {
                vc2 vc2Var = new vc2();
                this.groupCall = vc2Var;
                vc2Var.b = new TLRPC.TL_groupCall();
                vc2 vc2Var2 = this.groupCall;
                TLRPC.GroupCall groupCall = vc2Var2.b;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                groupCall.rtmp_stream = this.isRtmpStream;
                vc2Var2.c = this.chat.id;
                vc2Var2.C = k5.a(this.currentAccount);
                this.groupCall.y(this.groupCallPeer);
                this.groupCall.f();
                dispatchStateChanged(6);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = uc7.l1(this.chat);
                creategroupcall.random_id = Utilities.b.nextInt();
                int i2 = this.scheduleDate;
                if (i2 != 0) {
                    creategroupcall.schedule_date = i2;
                    creategroupcall.flags |= 2;
                }
                if (this.isRtmpStream) {
                    creategroupcall.flags |= 4;
                }
                this.groupCallBottomSheetLatch = new CountDownLatch(1);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(creategroupcall, new hlc(this, (byte) 5), 65536);
                this.createGroupCall = false;
                return;
            }
            if (str == null) {
                if (this.groupCall == null && this.chat != null) {
                    vc2 g1 = uc7.s1(this.currentAccount).g1(this.chat.id, false, null);
                    this.groupCall = g1;
                    if (g1 != null) {
                        g1.y(this.groupCallPeer);
                    }
                }
                configureDeviceForCall();
                showNotification();
                hl.c3(new osa((byte) 15));
                createFirstGroupInstance();
                return;
            }
            if (getSharedInstance() == null || this.groupCall == null) {
                return;
            }
            dispatchStateChanged(1);
            if (f11.a) {
                cc4.b("initital source = " + i);
            }
            TL_phone.joinGroupCall joingroupcall = new TL_phone.joinGroupCall();
            joingroupcall.muted = this.micMute;
            joingroupcall.video_stopped = this.videoState[0] != 2;
            vc2 vc2Var3 = this.groupCall;
            joingroupcall.call = vc2Var3.h(vc2Var3.a);
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            joingroupcall.params = tL_dataJSON;
            tL_dataJSON.data = str;
            if (!TextUtils.isEmpty(this.joinHash)) {
                joingroupcall.invite_hash = this.joinHash;
                joingroupcall.flags |= 2;
            }
            TLRPC.InputPeer inputPeer = this.groupCallPeer;
            if (inputPeer != null) {
                joingroupcall.join_as = inputPeer;
            } else {
                TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                joingroupcall.join_as = tL_inputPeerUser;
                tL_inputPeerUser.user_id = yac.h(k5.a(this.currentAccount).a).e();
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(joingroupcall, new f65(this, i, z, b));
        }
    }

    private void startGroupCheckShortpoll() {
        vc2 vc2Var;
        TLRPC.GroupCall groupCall;
        if (this.shortPollRunnable != null || sharedInstance == null || (vc2Var = this.groupCall) == null) {
            return;
        }
        int[] iArr = this.mySource;
        if (iArr[0] == 0 && iArr[1] == 0 && ((groupCall = vc2Var.b) == null || !groupCall.rtmp_stream)) {
            return;
        }
        glc glcVar = new glc(this, (byte) 26);
        this.shortPollRunnable = glcVar;
        hl.d3(glcVar, 4000L);
    }

    private void startOutgoingCall() {
        CallConnection callConnection;
        if (USE_CONNECTION_SERVICE && (callConnection = this.systemCallConnection) != null) {
            callConnection.setDialing();
        }
        configureDeviceForCall();
        showNotification();
        startConnectingSound();
        dispatchStateChanged(14);
        hl.c3(new osa((byte) 14));
        Utilities.b.nextBytes(new byte[256]);
        TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
        tL_messages_getDhConfig.random_length = 256;
        jf7 Y = jf7.Y(this.currentAccount);
        Y.G();
        tL_messages_getDhConfig.version = Y.x;
        this.callReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDhConfig, new wlc(this, Y, (byte) 0), 65536);
    }

    private void startRatingActivity() {
        try {
            PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) VoIPFeedbackActivity.class).putExtra("call_id", this.privateCall.id).putExtra("call_access_hash", this.privateCall.access_hash).putExtra("call_video", this.privateCall.video).putExtra("account", this.currentAccount).addFlags(805306368), 33554432).send();
        } catch (Exception e) {
            if (f11.a) {
                cc4.e("Error starting incall activity", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startRinging() {
        CallConnection callConnection;
        if (this.currentState != 15) {
            if (USE_CONNECTION_SERVICE && (callConnection = this.systemCallConnection) != null) {
                callConnection.setRinging();
            }
            if (f11.a) {
                ik8.q(this.privateCall.id, new StringBuilder("starting ringing for call "));
            }
            dispatchStateChanged(15);
            boolean z = this.notificationsDisabled;
            TLRPC.User user = this.user;
            if (!z) {
                showIncomingNotification(lv2.m(0, user.first_name, user.last_name), this.user, this.privateCall.video, 0);
                if (f11.a) {
                    cc4.b("Showing incoming call notification");
                    return;
                }
                return;
            }
            startRingtoneAndVibration(user.id);
            if (f11.a) {
                cc4.b("Starting incall activity for incoming call");
            }
            try {
                PendingIntent.getActivity(this, 12345, new Intent(this, (Class<?>) LaunchActivity.class).setAction("voip"), 33554432).send();
            } catch (Exception e) {
                if (f11.a) {
                    cc4.e("Error starting incall activity", e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea A[Catch: all -> 0x0144, TryCatch #0 {, blocks: (B:8:0x0027, B:10:0x002b, B:13:0x002d, B:16:0x004b, B:18:0x0054, B:21:0x005d, B:25:0x0060, B:27:0x0072, B:29:0x008b, B:31:0x00a9, B:32:0x00d8, B:34:0x00ea, B:38:0x0106, B:40:0x010c, B:42:0x011a, B:45:0x0131, B:46:0x0140, B:53:0x0114, B:55:0x00fb, B:57:0x0090, B:59:0x0094, B:61:0x009e, B:62:0x00a4, B:63:0x0083, B:65:0x00cc, B:67:0x00d3), top: B:7:0x0027, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb A[Catch: all -> 0x0144, TryCatch #0 {, blocks: (B:8:0x0027, B:10:0x002b, B:13:0x002d, B:16:0x004b, B:18:0x0054, B:21:0x005d, B:25:0x0060, B:27:0x0072, B:29:0x008b, B:31:0x00a9, B:32:0x00d8, B:34:0x00ea, B:38:0x0106, B:40:0x010c, B:42:0x011a, B:45:0x0131, B:46:0x0140, B:53:0x0114, B:55:0x00fb, B:57:0x0090, B:59:0x0094, B:61:0x009e, B:62:0x00a4, B:63:0x0083, B:65:0x00cc, B:67:0x00d3), top: B:7:0x0027, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void startRingtoneAndVibration(long j) {
        int i;
        String string;
        Uri parse;
        boolean z;
        SharedPreferences sharedPreferences = uc7.s1(this.currentAccount).W3;
        AudioManager audioManager = (AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (audioManager.getRingerMode() == 0 || this.ringtonePlayer != null) {
            return;
        }
        synchronized (sync) {
            if (this.ringtonePlayer != null) {
                return;
            }
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.ringtonePlayer = mediaPlayer;
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: qlc
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    VoIPService.this.lambda$startRingtoneAndVibration$93(mediaPlayer2);
                }
            });
            this.ringtonePlayer.setLooping(true);
            int i2 = this.isHeadsetPlugged ? 0 : 2;
            this.ringtonePlayer.setAudioStreamType(i2);
            if (!USE_CONNECTION_SERVICE) {
                this.hasAudioFocus = audioManager.requestAudioFocus(this, i2, 2) == 1;
            }
            try {
                if (sharedPreferences.getBoolean("custom_" + j, false)) {
                    string = sharedPreferences.getString("ringtone_path_" + j, null);
                } else {
                    string = sharedPreferences.getString("CallsRingtonePath", null);
                }
            } catch (Exception e) {
                cc4.g(e, true);
                MediaPlayer mediaPlayer2 = this.ringtonePlayer;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.release();
                    this.ringtonePlayer = null;
                }
            }
            if (string == null) {
                parse = RingtoneManager.getDefaultUri(1);
            } else {
                Uri uri = Settings.System.DEFAULT_RINGTONE_URI;
                if (uri == null || !string.equalsIgnoreCase(uri.getPath())) {
                    parse = Uri.parse(string);
                    z = false;
                    cc4.b("start ringtone with " + z + " " + parse);
                    this.ringtonePlayer.setDataSource(this, parse);
                    this.ringtonePlayer.prepareAsync();
                    if (sharedPreferences.getBoolean("custom_" + j, false)) {
                        i = sharedPreferences.getInt("vibrate_calls", 0);
                    } else {
                        i = sharedPreferences.getInt("calls_vibrate_" + j, 0);
                    }
                    if ((i != 2 && i != 4 && (audioManager.getRingerMode() == 1 || audioManager.getRingerMode() == 2)) || (i == 4 && audioManager.getRingerMode() == 1)) {
                        Vibrator vibrator = (Vibrator) getSystemService("vibrator");
                        this.vibrator = vibrator;
                        vibrator.vibrate(new long[]{0, i == 1 ? 350L : i == 3 ? 1400L : 700L, 500}, 0);
                    }
                }
                parse = RingtoneManager.getDefaultUri(1);
            }
            z = true;
            cc4.b("start ringtone with " + z + " " + parse);
            this.ringtonePlayer.setDataSource(this, parse);
            this.ringtonePlayer.prepareAsync();
            if (sharedPreferences.getBoolean("custom_" + j, false)) {
            }
            if (i != 2) {
                Vibrator vibrator2 = (Vibrator) getSystemService("vibrator");
                this.vibrator = vibrator2;
                vibrator2.vibrate(new long[]{0, i == 1 ? 350L : i == 3 ? 1400L : 700L, 500}, 0);
            }
            Vibrator vibrator22 = (Vibrator) getSystemService("vibrator");
            this.vibrator = vibrator22;
            vibrator22.vibrate(new long[]{0, i == 1 ? 350L : i == 3 ? 1400L : 700L, 500}, 0);
        }
    }

    private void startRtmpStreamPlayer() {
        rr9 rtmpStreamPlayer = getRtmpStreamPlayer();
        if (rtmpStreamPlayer != null) {
            Handler handler = rtmpStreamPlayer.b;
            if (!this.rtmpStreamPlayerStarted) {
                this.rtmpStreamPlayerStarted = true;
                handler.post(new hq9(rtmpStreamPlayer, (byte) 3));
            } else if (this.rtmpStreamRejoining) {
                this.rtmpStreamRejoining = false;
                xz0 xz0Var = rtmpStreamPlayer.e;
                Objects.requireNonNull(xz0Var);
                handler.post(new gz0(xz0Var, (byte) 7));
            }
        }
    }

    private void startScreenCapture(int i, String str) {
        if (getSharedInstance() == null || this.groupCall == null) {
            return;
        }
        this.mySource[1] = 0;
        TL_phone.joinGroupCallPresentation joingroupcallpresentation = new TL_phone.joinGroupCallPresentation();
        vc2 vc2Var = this.groupCall;
        joingroupcallpresentation.call = vc2Var.h(vc2Var.a);
        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
        joingroupcallpresentation.params = tL_dataJSON;
        tL_dataJSON.data = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(joingroupcallpresentation, new b22(this, i, (byte) 9));
    }

    private void stopBroadcastListenerSession() {
        g01 g01Var = this.broadcastListenerSession;
        if (g01Var != null) {
            g01Var.k();
            this.broadcastListenerSession = null;
        }
        this.broadcastListenerRejoining = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateBluetoothHeadsetState(boolean z) {
        if (z != this.isBtHeadsetConnected) {
            if (f11.a) {
                cc4.b("updateBluetoothHeadsetState: " + z);
            }
            this.isBtHeadsetConnected = z;
            AudioManager audioManager = (AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            int i = 0;
            if (!z || isRinging() || this.currentState == 0) {
                this.bluetoothScoActive = false;
                this.bluetoothScoConnecting = false;
                voipAudioManager.setBluetoothOn(false);
            } else {
                byte b = 1;
                if (this.bluetoothScoActive) {
                    if (f11.a) {
                        cc4.b("SCO already active, setting audio routing");
                    }
                    if (!hasRtmpStream()) {
                        audioManager.setSpeakerphoneOn(false);
                        voipAudioManager.setBluetoothOn(true);
                    }
                } else {
                    if (f11.a) {
                        cc4.b("startBluetoothSco");
                    }
                    if (!hasRtmpStream()) {
                        this.needSwitchToBluetoothAfterScoActivates = true;
                        hl.d3(new olc(voipAudioManager, b), 500L);
                    }
                }
            }
            ArrayList<StateListener> arrayList = this.stateListeners;
            int size = arrayList.size();
            while (i < size) {
                StateListener stateListener = arrayList.get(i);
                i++;
                stateListener.onAudioSettingsChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateBroadcastVideoRequests() {
        if (this.broadcastListenerSession == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.remoteSinks.keySet()) {
            if (!"unified".equals(str)) {
                Integer num = this.broadcastVideoCeilings.get(str);
                arrayList.add(new uz0(str, num != null ? num.intValue() : 1));
            }
        }
        g01 g01Var = this.broadcastListenerSession;
        g01Var.getClass();
        g01Var.b.post(new a30(g01Var, new ArrayList(arrayList), (byte) 25));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateConnectionState, reason: merged with bridge method [inline-methods] */
    public void lambda$createGroupInstance$75(int i, int i2, boolean z) {
        if (i == 0) {
            byte b = 5;
            byte b2 = 1;
            dispatchStateChanged((i2 == 1 || this.switchingStream) ? 3 : 5);
            if (this.switchingStream && (i2 == 0 || (i2 == 1 && z))) {
                ilc ilcVar = new ilc(this, i, b);
                this.switchingStreamTimeoutRunnable = ilcVar;
                hl.d3(ilcVar, 3000L);
            }
            if (i2 == 0) {
                startGroupCheckShortpoll();
                if (!this.playedConnectedSound || this.spPlayId != 0 || this.switchingStream || this.switchingAccount) {
                    return;
                }
                Utilities.e.c(new bmc(this, b2));
                return;
            }
            cancelGroupCheckShortPoll();
            if (!z) {
                this.switchingStream = false;
                this.switchingAccount = false;
            }
            Runnable runnable = this.switchingStreamTimeoutRunnable;
            if (runnable != null) {
                hl.r(runnable);
                this.switchingStreamTimeoutRunnable = null;
            }
            if (this.playedConnectedSound) {
                Utilities.e.c(new bmc(this, (byte) 2));
                Runnable runnable2 = this.connectingSoundRunnable;
                if (runnable2 != null) {
                    hl.r(runnable2);
                    this.connectingSoundRunnable = null;
                }
            } else {
                playConnectedSound();
            }
            if (this.wasConnected) {
                return;
            }
            this.wasConnected = true;
            if (this.reconnectScreenCapture) {
                createGroupInstance(1, false, true);
                this.reconnectScreenCapture = false;
            }
            NativeInstance nativeInstance = this.tgVoip[0];
            if (nativeInstance != null && !this.micMute) {
                nativeInstance.setMuteMicrophone(false);
            }
            setParticipantsVolume();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNetworkType() {
        rr9 rr9Var = this.rtmpStreamPlayer;
        if (rr9Var != null) {
            rr9Var.k(org.telegram.messenger.a.o());
        }
        g01 g01Var = this.broadcastListenerSession;
        if (g01Var != null) {
            g01Var.b.post(new xac((byte) 6, g01Var, org.telegram.messenger.a.o()));
        }
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance == null) {
            this.lastNetInfo = getActiveNetworkInfo();
        } else {
            if (nativeInstance.isGroup()) {
                return;
            }
            this.tgVoip[0].setNetworkType(getNetworkType());
        }
    }

    private void updateServerConfig() {
        SharedPreferences sharedPreferences = uc7.s1(this.currentAccount).X3;
        Instance.setGlobalServerConfig(sharedPreferences.getString("voip_server_config", "{}"));
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_phone.getCallConfig(), new yp9(sharedPreferences, (byte) 24));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTrafficStats(NativeInstance nativeInstance, Instance.TrafficStats trafficStats) {
        if (nativeInstance != null) {
            if (trafficStats == null) {
                trafficStats = nativeInstance.getTrafficStats();
            }
            if (trafficStats != null) {
                long j = trafficStats.bytesSentWifi;
                Instance.TrafficStats trafficStats2 = this.prevTrafficStats;
                long j2 = j - (trafficStats2 != null ? trafficStats2.bytesSentWifi : 0L);
                long j3 = trafficStats.bytesReceivedWifi - (trafficStats2 != null ? trafficStats2.bytesReceivedWifi : 0L);
                long j4 = trafficStats.bytesSentMobile - (trafficStats2 != null ? trafficStats2.bytesSentMobile : 0L);
                long j5 = trafficStats.bytesReceivedMobile - (trafficStats2 != null ? trafficStats2.bytesReceivedMobile : 0L);
                this.prevTrafficStats = trafficStats;
                if (j2 > 0) {
                    a2b.c(this.currentAccount).h(1, 0, j2);
                }
                if (j3 > 0) {
                    a2b.c(this.currentAccount).f(1, 0, j3);
                }
                if (j4 > 0) {
                    a2b c = a2b.c(this.currentAccount);
                    NetworkInfo networkInfo = this.lastNetInfo;
                    c.h((networkInfo == null || !networkInfo.isRoaming()) ? 0 : 2, 0, j4);
                }
                if (j5 > 0) {
                    a2b c2 = a2b.c(this.currentAccount);
                    NetworkInfo networkInfo2 = this.lastNetInfo;
                    c2.f((networkInfo2 == null || !networkInfo2.isRoaming()) ? 0 : 2, 0, j5);
                }
            }
        }
    }

    @Override // org.telegram.messenger.voip.VoIPServiceState
    public void acceptIncomingCall() {
        updateCurrentForegroundType();
        uc7.s1(this.currentAccount).Z3 = false;
        stopRinging();
        showNotification();
        configureDeviceForCall();
        startConnectingSound();
        dispatchStateChanged(12);
        hl.c3(new osa((byte) 18));
        jf7 Y = jf7.Y(this.currentAccount);
        TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
        tL_messages_getDhConfig.random_length = 256;
        Y.G();
        tL_messages_getDhConfig.version = Y.x;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDhConfig, new wlc(this, Y, (byte) 1));
    }

    public void addExtraLocalSink(VideoSink videoSink) {
        ProxyVideoSink proxyVideoSink = this.localSink[0];
        if (proxyVideoSink != null) {
            proxyVideoSink.addExtra(videoSink);
        }
    }

    public boolean addExtraRemoteSink(TLRPC.GroupCallParticipant groupCallParticipant, boolean z, VideoSink videoSink) {
        String str = z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint;
        if (str == null || (this.tgVoip[0] == null && !isRtmpStreamCall())) {
            return false;
        }
        ProxyVideoSink proxyVideoSink = this.remoteSinks.get(str);
        if (proxyVideoSink == null) {
            proxyVideoSink = addRemoteSink(groupCallParticipant, z, null, null);
        }
        if (proxyVideoSink == null) {
            return false;
        }
        proxyVideoSink.addExtra(videoSink);
        return true;
    }

    public ProxyVideoSink addRemoteSink(TLRPC.GroupCallParticipant groupCallParticipant, boolean z, VideoSink videoSink, VideoSink videoSink2) {
        if (this.tgVoip[0] == null && !isRtmpStreamCall()) {
            return null;
        }
        String str = z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint;
        if (str == null) {
            return null;
        }
        ProxyVideoSink proxyVideoSink = this.remoteSinks.get(str);
        if (proxyVideoSink != null) {
            if (proxyVideoSink.target != videoSink) {
                if (proxyVideoSink.hasExtras()) {
                    proxyVideoSink.setTarget(videoSink);
                    if (videoSink2 != null) {
                        proxyVideoSink.setBackground(videoSink2);
                    }
                }
            }
            return proxyVideoSink;
        }
        proxyVideoSink = this.proxyVideoSinkLruCache.remove(str);
        if (proxyVideoSink == null) {
            proxyVideoSink = new ProxyVideoSink();
        }
        ProxyVideoSink proxyVideoSink2 = proxyVideoSink;
        if (videoSink != null) {
            proxyVideoSink2.setTarget(videoSink);
        }
        if (videoSink2 != null) {
            proxyVideoSink2.setBackground(videoSink2);
        }
        this.remoteSinks.put(str, proxyVideoSink2);
        proxyVideoSink2.nativeInstance = addIncomingVideoOutput(str, z ? groupCallParticipant.presentation : groupCallParticipant.video, proxyVideoSink2, wf3.n(groupCallParticipant.peer));
        return proxyVideoSink2;
    }

    public void callFailedFromConnectionService() {
        if (this.isOutgoing) {
            callFailed(Instance.ERROR_CONNECTION_SERVICE);
        } else {
            hangUp();
        }
    }

    public void checkVideoFrame(TLRPC.GroupCallParticipant groupCallParticipant, boolean z) {
        String str = z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint;
        if (str != null) {
            if (z) {
                if (groupCallParticipant.hasPresentationFrame != 0) {
                    return;
                }
            } else if (groupCallParticipant.hasCameraFrame != 0) {
                return;
            }
            if (this.proxyVideoSinkLruCache.get(str) != null || (this.remoteSinks.get(str) != null && this.waitingFrameParticipant.get(str) == null)) {
                if (z) {
                    groupCallParticipant.hasPresentationFrame = 2;
                    return;
                } else {
                    groupCallParticipant.hasCameraFrame = 2;
                    return;
                }
            }
            if (this.waitingFrameParticipant.containsKey(str)) {
                this.waitingFrameParticipant.put(str, groupCallParticipant);
                if (z) {
                    groupCallParticipant.hasPresentationFrame = 1;
                    return;
                } else {
                    groupCallParticipant.hasCameraFrame = 1;
                    return;
                }
            }
            if (z) {
                groupCallParticipant.hasPresentationFrame = 1;
            } else {
                groupCallParticipant.hasCameraFrame = 1;
            }
            this.waitingFrameParticipant.put(str, groupCallParticipant);
            addRemoteSink(groupCallParticipant, z, new 5(str, z), null);
        }
    }

    public void clearCamera() {
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance != null) {
            nativeInstance.clearVideoCapturer();
        }
        long j = this.captureDevice[0];
        if (j != 0) {
            NativeInstance.destroyVideoCapturer(j);
            this.captureDevice[0] = 0;
        }
    }

    public void clearRemoteSinks() {
        this.proxyVideoSinkLruCache.evictAll();
    }

    public void convertToConferenceCall(boolean z, HashSet<Long> hashSet) {
        TLRPC.User user = this.user;
        this.convertingFromCallWithUserId = user != null ? user.id : 0L;
        this.inviteUsersToConferenceVideo = z;
        this.inviteUsersToConference = hashSet;
        stopRinging();
        detachSignalingTarget();
        NativeInstance[] nativeInstanceArr = this.tgVoip;
        NativeInstance nativeInstance = nativeInstanceArr[0];
        if (nativeInstance != null) {
            this.prevTrafficStats = null;
            this.convertingVoip = nativeInstance;
            nativeInstanceArr[0] = null;
        }
        hl.c3(new glc(this, (byte) 15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public void createCaptureDevice(boolean z) {
        ?? r2;
        gkc gkcVar;
        if (z) {
            this.gotMediaProjection = true;
            updateCurrentForegroundType();
            r2 = 2;
        } else {
            r2 = this.isFrontFaceCamera;
        }
        if (this.groupCall == null) {
            if (!this.isPrivateScreencast && z) {
                setVideoState(false, 0);
            }
            this.isPrivateScreencast = z;
            NativeInstance nativeInstance = this.tgVoip[0];
            if (nativeInstance != null) {
                nativeInstance.clearVideoCapturer();
            }
            long j = this.captureDevice[0];
            if (j != 0) {
                NativeInstance.destroyVideoCapturer(j);
                this.captureDevice[0] = 0;
            }
        }
        if (!z) {
            long[] jArr = this.captureDevice;
            long j2 = jArr[z ? 1 : 0];
            if (j2 != 0 || this.tgVoip[z ? 1 : 0] == null) {
                NativeInstance nativeInstance2 = this.tgVoip[z ? 1 : 0];
                if (nativeInstance2 != null && j2 != 0) {
                    nativeInstance2.activateVideoCapturer(j2);
                }
                jArr = this.captureDevice;
                if (jArr[z ? 1 : 0] != 0) {
                    return;
                }
            }
            jArr[z ? 1 : 0] = NativeInstance.createVideoCapturer(this.localSink[z ? 1 : 0], r2);
            return;
        }
        if (this.groupCall != null) {
            long[] jArr2 = this.captureDevice;
            if (jArr2[z ? 1 : 0] == 0) {
                jArr2[z ? 1 : 0] = NativeInstance.createVideoCapturer(this.localSink[z ? 1 : 0], r2);
                createGroupInstance(1, false, true);
                setVideoState(true, 2);
                jn7.f(k5.a(this.currentAccount).a).k(jn7.z2, new Object[0]);
                return;
            }
            return;
        }
        requestVideoCall(true);
        setVideoState(true, 2);
        mkc mkcVar = mkc.m1;
        if (mkcVar == null || (gkcVar = mkcVar.o0) == null) {
            return;
        }
        gkcVar.a(true, true);
    }

    public void declineIncomingCall(int i, Runnable runnable) {
        if (this.groupCall != null) {
            stopScreenCapture();
        }
        stopRinging();
        this.callDiscardReason = i;
        int i2 = this.currentState;
        if (i2 == 14) {
            Runnable runnable2 = this.delayedStartOutgoingCall;
            if (runnable2 != null) {
                hl.r(runnable2);
                callEnded();
                return;
            } else {
                dispatchStateChanged(10);
                this.endCallAfterRequest = true;
                hl.d3(new glc(this, (byte) 24), 5000L);
                return;
            }
        }
        if (i2 == 10 || i2 == 11) {
            return;
        }
        dispatchStateChanged(10);
        if (this.privateCall == null) {
            this.onDestroyRunnable = runnable;
            callEnded();
            if (this.callReqId != 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.callReqId, false);
                this.callReqId = 0;
                return;
            }
            return;
        }
        TL_phone.discardCall discardcall = new TL_phone.discardCall();
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        discardcall.peer = tL_inputPhoneCall;
        TL_phone.PhoneCall phoneCall = this.privateCall;
        tL_inputPhoneCall.access_hash = phoneCall.access_hash;
        tL_inputPhoneCall.id = phoneCall.id;
        discardcall.duration = (int) (getCallDuration() / 1000);
        NativeInstance nativeInstance = this.tgVoip[0];
        discardcall.connection_id = nativeInstance != null ? nativeInstance.getPreferredRelayId() : 0L;
        byte b = 3;
        if (i == 2) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonDisconnect();
        } else if (i == 3) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonMissed();
        } else if (i == 4) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonBusy();
        } else if (i != 5) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonHangup();
        } else {
            TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall tL_phoneCallDiscardReasonMigrateConferenceCall = new TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall();
            discardcall.reason = tL_phoneCallDiscardReasonMigrateConferenceCall;
            tL_phoneCallDiscardReasonMigrateConferenceCall.slug = "";
        }
        cc4.d("discardCall " + discardcall.reason);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardcall, new hlc(this, b), 65536);
        this.onDestroyRunnable = runnable;
        callEnded();
    }

    @Override // fn7
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.I2) {
            callEnded();
        }
    }

    public void editCallMember(TLObject tLObject, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Runnable runnable) {
        TLRPC.InputPeer inputPeer;
        if (tLObject == null || this.groupCall == null) {
            return;
        }
        TL_phone.editGroupCallParticipant editgroupcallparticipant = new TL_phone.editGroupCallParticipant();
        vc2 vc2Var = this.groupCall;
        editgroupcallparticipant.call = vc2Var.h(vc2Var.a);
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            if (!lbc.D(user) || (inputPeer = this.groupCallPeer) == null) {
                editgroupcallparticipant.participant = uc7.n1(user);
                if (f11.a) {
                    StringBuilder sb = new StringBuilder("edit group call part id = ");
                    sb.append(editgroupcallparticipant.participant.user_id);
                    sb.append(" access_hash = ");
                    ik8.q(editgroupcallparticipant.participant.user_id, sb);
                }
            } else {
                editgroupcallparticipant.participant = inputPeer;
            }
        } else if (tLObject instanceof TLRPC.Chat) {
            editgroupcallparticipant.participant = uc7.l1((TLRPC.Chat) tLObject);
            if (f11.a) {
                StringBuilder sb2 = new StringBuilder("edit group call part id = ");
                TLRPC.InputPeer inputPeer2 = editgroupcallparticipant.participant;
                long j = inputPeer2.chat_id;
                if (j == 0) {
                    j = inputPeer2.channel_id;
                }
                sb2.append(j);
                sb2.append(" access_hash = ");
                ik8.q(editgroupcallparticipant.participant.access_hash, sb2);
            }
        }
        if (bool != null) {
            editgroupcallparticipant.muted = bool.booleanValue();
            editgroupcallparticipant.flags |= 1;
        }
        if (num != null) {
            editgroupcallparticipant.volume = num.intValue();
            editgroupcallparticipant.flags |= 2;
        }
        if (bool3 != null) {
            editgroupcallparticipant.raise_hand = bool3.booleanValue();
            editgroupcallparticipant.flags |= 4;
        }
        if (bool2 != null) {
            editgroupcallparticipant.video_stopped = bool2.booleanValue();
            editgroupcallparticipant.flags |= 8;
        }
        if (f11.a) {
            c00.q(editgroupcallparticipant.flags, new StringBuilder("edit group call flags = "));
        }
        int i = this.currentAccount;
        ConnectionsManager.getInstance(k5.a(i).a).sendRequest(editgroupcallparticipant, new hb7((Object) this, i, (Object) runnable, (byte) 13));
    }

    public void forceRating() {
        this.forceRating = true;
    }

    public int getAccount() {
        return this.currentAccount;
    }

    @Override // org.telegram.messenger.voip.VoIPServiceState
    public long getCallDuration() {
        if (this.callStartTime == 0) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - this.callStartTime;
    }

    public long getCallID() {
        TL_phone.PhoneCall phoneCall = this.privateCall;
        if (phoneCall != null) {
            return phoneCall.id;
        }
        return 0L;
    }

    @Override // org.telegram.messenger.voip.VoIPServiceState
    public int getCallState() {
        return this.currentState;
    }

    public long getCallerId() {
        TLRPC.User user = this.user;
        if (user != null) {
            return user.id;
        }
        TLRPC.Chat chat = this.chat;
        if (chat != null) {
            return -chat.id;
        }
        return 0L;
    }

    public TLRPC.Chat getChat() {
        return this.chat;
    }

    public CallConnection getConnectionAndStartCall() {
        if (this.systemCallConnection == null) {
            if (f11.a) {
                cc4.b("creating call connection");
            }
            CallConnection callConnection = new CallConnection();
            this.systemCallConnection = callConnection;
            callConnection.setInitializing();
            if (this.isOutgoing) {
                glc glcVar = new glc(this, (byte) 3);
                this.delayedStartOutgoingCall = glcVar;
                hl.d3(glcVar, 2000L);
            }
            this.systemCallConnection.setAddress(Uri.fromParts("tel", "+99084" + this.user.id, null), 1);
            CallConnection callConnection2 = this.systemCallConnection;
            TLRPC.User user = this.user;
            callConnection2.setCallerDisplayName(lv2.m(0, user.first_name, user.last_name), 1);
        }
        return this.systemCallConnection;
    }

    public int getCurrentAudioRoute() {
        if (!USE_CONNECTION_SERVICE) {
            if (!this.audioConfigured) {
                return this.audioRouteToSet;
            }
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            if (voipAudioManager.isBluetoothOn()) {
                return 2;
            }
            return voipAudioManager.isSpeakerphoneOn() ? 1 : 0;
        }
        CallConnection callConnection = this.systemCallConnection;
        if (callConnection != null && callConnection.getCallAudioState() != null) {
            int route = this.systemCallConnection.getCallAudioState().getRoute();
            if (route != 1) {
                if (route == 2) {
                    return 2;
                }
                if (route != 4) {
                    if (route == 8) {
                        return 1;
                    }
                }
            }
            return 0;
        }
        return this.audioRouteToSet;
    }

    public String getDebugString() {
        NativeInstance nativeInstance = this.tgVoip[0];
        return nativeInstance != null ? nativeInstance.getDebugInfo() : "";
    }

    public byte[] getEncryptionKey() {
        return this.authKey;
    }

    public byte[] getGA() {
        return this.g_a;
    }

    @Override // org.telegram.messenger.voip.VoIPServiceState
    public TLRPC.GroupCall getGroupCall() {
        vc2 vc2Var = this.groupCall;
        if (vc2Var != null) {
            return vc2Var.b;
        }
        return null;
    }

    public CountDownLatch getGroupCallBottomSheetLatch() {
        return this.groupCallBottomSheetLatch;
    }

    public long getGroupCallID() {
        TLRPC.GroupCall groupCall;
        vc2 vc2Var = this.groupCall;
        if (vc2Var == null || (groupCall = vc2Var.b) == null) {
            return 0L;
        }
        return groupCall.id;
    }

    public TLRPC.InputPeer getGroupCallPeer() {
        return this.groupCallPeer;
    }

    @Override // org.telegram.messenger.voip.VoIPServiceState
    public ArrayList<TLRPC.GroupCallParticipant> getGroupParticipants() {
        vc2 vc2Var = this.groupCall;
        if (vc2Var != null) {
            return vc2Var.e;
        }
        return null;
    }

    public String getLastError() {
        return this.lastError;
    }

    @Override // org.telegram.messenger.voip.VoIPServiceState
    public TL_phone.PhoneCall getPrivateCall() {
        return this.privateCall;
    }

    public int getRemoteAudioState() {
        return this.remoteAudioState;
    }

    public int getRemoteVideoState() {
        return this.remoteVideoState;
    }

    public long getSelfId() {
        TLRPC.InputPeer inputPeer = this.groupCallPeer;
        return inputPeer == null ? yac.h(this.currentAccount).n : inputPeer instanceof TLRPC.TL_inputPeerUser ? inputPeer.user_id : inputPeer instanceof TLRPC.TL_inputPeerChannel ? -inputPeer.channel_id : -inputPeer.chat_id;
    }

    public String getTitle() {
        TLRPC.User user = this.user;
        if (user != null) {
            return lv2.m(0, user.first_name, user.last_name);
        }
        TLRPC.Chat chat = this.chat;
        return chat != null ? chat.title : "";
    }

    @Override // org.telegram.messenger.voip.VoIPServiceState
    public TLRPC.User getUser() {
        return this.user;
    }

    public int getVideoState(boolean z) {
        return this.videoState[z ? 1 : 0];
    }

    public void handleNotificationAction(Intent intent) {
        if ((getPackageName() + ".END_CALL").equals(intent.getAction())) {
            stopForeground(true);
            hangUp();
            return;
        }
        if ((getPackageName() + ".DECLINE_CALL").equals(intent.getAction())) {
            stopForeground(true);
            declineIncomingCall(4, null);
            return;
        }
        if ((getPackageName() + ".ANSWER_CALL").equals(intent.getAction())) {
            acceptIncomingCallFromNotification();
        }
    }

    public void hangUp(int i, Runnable runnable) {
        TLRPC.ChatFull N0;
        int i2 = this.currentState;
        declineIncomingCall((i2 == 16 || (i2 == 13 && this.isOutgoing)) ? 3 : 1, runnable);
        if (this.groupCall == null || i == 2) {
            return;
        }
        if (i != 1) {
            TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
            vc2 vc2Var = this.groupCall;
            leavegroupcall.call = vc2Var.h(vc2Var.a);
            leavegroupcall.source = this.mySource[0];
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(leavegroupcall, new hlc(this, (byte) 8));
            return;
        }
        if (this.chat != null && (N0 = uc7.s1(this.currentAccount).N0(this.chat.id)) != null) {
            N0.flags &= -2097153;
            N0.call = null;
            jn7.f(this.currentAccount).k(jn7.w2, Long.valueOf(this.chat.id), Long.valueOf(this.groupCall.b.id), Boolean.FALSE);
        }
        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
        vc2 vc2Var2 = this.groupCall;
        discardgroupcall.call = vc2Var2.h(vc2Var2.a);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardgroupcall, new hlc(this, (byte) 7));
    }

    public boolean hasEarpiece() {
        Boolean bool;
        CallConnection callConnection;
        if (!USE_CONNECTION_SERVICE || (callConnection = this.systemCallConnection) == null || callConnection.getCallAudioState() == null) {
            if (((TelephonyManager) getSystemService("phone")).getPhoneType() == 0) {
                Boolean bool2 = this.mHasEarpiece;
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                try {
                    AudioManager audioManager = (AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    Method method = AudioManager.class.getMethod("getDevicesForStream", Integer.TYPE);
                    int i = AudioManager.class.getField("DEVICE_OUT_EARPIECE").getInt(null);
                    if ((((Integer) method.invoke(audioManager, 0)).intValue() & i) == i) {
                        bool = Boolean.TRUE;
                        this.mHasEarpiece = bool;
                    } else {
                        bool = Boolean.FALSE;
                        this.mHasEarpiece = bool;
                    }
                } catch (Throwable th) {
                    if (f11.a) {
                        cc4.e("Error while checking earpiece! ", th);
                    }
                    bool = Boolean.TRUE;
                    this.mHasEarpiece = bool;
                }
                return bool.booleanValue();
            }
        } else if ((this.systemCallConnection.getCallAudioState().getSupportedRouteMask() & 5) == 0) {
            return false;
        }
        return true;
    }

    public boolean hasRate() {
        return this.needRateCall || this.forceRating;
    }

    public boolean hasVideoCapturer() {
        return this.captureDevice[0] != 0;
    }

    public boolean isBluetoothHeadsetConnected() {
        CallConnection callConnection;
        return (!USE_CONNECTION_SERVICE || (callConnection = this.systemCallConnection) == null || callConnection.getCallAudioState() == null) ? this.isBtHeadsetConnected : (this.systemCallConnection.getCallAudioState().getSupportedRouteMask() & 2) != 0;
    }

    public boolean isBluetoothOn() {
        return VoipAudioManager.get().isBluetoothOn();
    }

    public boolean isBluetoothWillOn() {
        return this.needSwitchToBluetoothAfterScoActivates;
    }

    @Override // org.telegram.messenger.voip.VoIPServiceState
    public boolean isCallingVideo() {
        TL_phone.PhoneCall phoneCall = this.privateCall;
        if (phoneCall != null) {
            return phoneCall.video;
        }
        return false;
    }

    @Override // org.telegram.messenger.voip.VoIPServiceState
    public boolean isConference() {
        return (this.joinConference == null && this.conference == null) ? false : true;
    }

    public boolean isConverting() {
        return this.convertingVoip != null;
    }

    public boolean isFrontFaceCamera() {
        return this.isFrontFaceCamera;
    }

    public boolean isFullscreen(TLRPC.GroupCallParticipant groupCallParticipant, boolean z) {
        if (this.currentBackgroundSink[z ? 1 : 0] != null) {
            return TextUtils.equals(this.currentBackgroundEndpointId[z ? 1 : 0], z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
        }
        return false;
    }

    public boolean isHangingUp() {
        return this.currentState == 10;
    }

    public boolean isHeadsetPlugged() {
        return this.isHeadsetPlugged;
    }

    public boolean isJoined() {
        int i = this.currentState;
        return (i == 1 || i == 6) ? false : true;
    }

    public boolean isMicMute() {
        return this.micMute;
    }

    @Override // org.telegram.messenger.voip.VoIPServiceState
    public boolean isOutgoing() {
        return this.isOutgoing;
    }

    public boolean isScreencast() {
        return this.isPrivateScreencast;
    }

    public boolean isSpeakerphoneOn() {
        CallConnection callConnection;
        boolean z = USE_CONNECTION_SERVICE;
        if (z && (callConnection = this.systemCallConnection) != null && callConnection.getCallAudioState() != null) {
            int route = this.systemCallConnection.getCallAudioState().getRoute();
            return hasEarpiece() ? route == 8 : route == 2;
        }
        if (!this.audioConfigured || z) {
            return this.speakerphoneStateToSet;
        }
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        return hasEarpiece() ? voipAudioManager.isSpeakerphoneOn() : voipAudioManager.isBluetoothOn();
    }

    public boolean isSwitchingCamera() {
        return this.switchingCamera;
    }

    public boolean isSwitchingStream() {
        return this.switchingStream;
    }

    public boolean isVideoAvailable() {
        return this.isVideoAvailable;
    }

    public void migrateToChat(TLRPC.Chat chat) {
        this.chat = chat;
    }

    public boolean mutedByAdmin() {
        vc2 vc2Var = this.groupCall;
        if (vc2Var == null) {
            return false;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.d.f(getSelfId());
        return (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || xc2.w(14, this.chat)) ? false : true;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        if (i == 1) {
            this.hasAudioFocus = true;
        } else {
            this.hasAudioFocus = false;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCallUpdated(TL_phone.PhoneCall phoneCall) {
        byte[] bArr;
        long g;
        if (this.user == null) {
            return;
        }
        TL_phone.PhoneCall phoneCall2 = this.privateCall;
        if (phoneCall2 == null) {
            this.pendingUpdates.add(phoneCall);
            return;
        }
        if (phoneCall == null) {
            return;
        }
        if (phoneCall.id != phoneCall2.id) {
            if (f11.a) {
                cc4.l("onCallUpdated called with wrong call id (got " + phoneCall.id + ", expected " + this.privateCall.id + ")");
                return;
            }
            return;
        }
        if (phoneCall.access_hash == 0) {
            phoneCall.access_hash = phoneCall2.access_hash;
        }
        if (f11.a) {
            cc4.b("Call updated: " + phoneCall);
        }
        long j = this.privateCall.key_fingerprint;
        this.privateCall = phoneCall;
        if (phoneCall instanceof TL_phone.TL_phoneCallDiscarded) {
            this.needSendDebugLog = phoneCall.need_debug;
            this.needRateCall = phoneCall.need_rating;
            if (f11.a) {
                cc4.b("call discarded, stopping service");
            }
            VoIPDebugToSend voIPDebugToSend = uc7.s1(this.currentAccount).f1;
            if (voIPDebugToSend != null) {
                voIPDebugToSend.done(phoneCall.id, phoneCall.need_debug);
            }
            TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = phoneCall.reason;
            if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall)) {
                if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy)) {
                    callEnded();
                    return;
                }
                dispatchStateChanged(17);
                this.playingSound = true;
                Utilities.e.c(new glc(this, (byte) 10));
                hl.d3(this.afterSoundRunnable, 1500L);
                endConnectionServiceCall(1500L);
                stopSelf();
                return;
            }
            TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
            this.joinConference = tL_inputGroupCallSlug;
            tL_inputGroupCallSlug.slug = ((TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall) phoneCallDiscardReason).slug;
            stopRinging();
            detachSignalingTarget();
            NativeInstance[] nativeInstanceArr = this.tgVoip;
            NativeInstance nativeInstance = nativeInstanceArr[0];
            if (nativeInstance != null) {
                this.prevTrafficStats = null;
                this.convertingVoip = nativeInstance;
                nativeInstanceArr[0] = null;
            }
            startConferenceGroupCall(false, 0, null, false);
            return;
        }
        if (!(phoneCall instanceof TL_phone.TL_phoneCall) || this.authKey != null) {
            if ((phoneCall instanceof TL_phone.TL_phoneCallAccepted) && this.authKey == null) {
                processAcceptedCall();
                return;
            }
            byte b = 13;
            if (this.currentState != 13 || phoneCall.receive_date == 0) {
                return;
            }
            dispatchStateChanged(16);
            if (f11.a) {
                cc4.b("!!!!!! CALL RECEIVED");
            }
            Runnable runnable = this.connectingSoundRunnable;
            if (runnable != null) {
                hl.r(runnable);
                this.connectingSoundRunnable = null;
            }
            Utilities.e.c(new glc(this, (byte) 11));
            Runnable runnable2 = this.timeoutRunnable;
            if (runnable2 != null) {
                hl.r(runnable2);
                this.timeoutRunnable = null;
            }
            glc glcVar = new glc(this, b);
            this.timeoutRunnable = glcVar;
            hl.d3(glcVar, uc7.s1(this.currentAccount).a3);
            return;
        }
        byte[] bArr2 = phoneCall.g_a_or_b;
        if (bArr2 == null) {
            if (f11.a) {
                cc4.l("stopping VoIP service, Ga == null");
            }
            callFailed();
            return;
        }
        if (!Arrays.equals(this.g_a_hash, Utilities.o(bArr2.length, bArr2))) {
            if (f11.a) {
                cc4.l("stopping VoIP service, Ga hash doesn't match");
            }
            callFailed();
            return;
        }
        this.g_a = phoneCall.g_a_or_b;
        BigInteger bigInteger = new BigInteger(1, phoneCall.g_a_or_b);
        jf7 Y = jf7.Y(this.currentAccount);
        Y.G();
        BigInteger bigInteger2 = new BigInteger(1, Y.y);
        if (!Utilities.w(bigInteger, bigInteger2)) {
            if (f11.a) {
                cc4.l("stopping VoIP service, bad Ga and Gb (accepting)");
            }
            callFailed();
            return;
        }
        byte[] byteArray = bigInteger.modPow(new BigInteger(1, this.a_or_b), bigInteger2).toByteArray();
        if (byteArray.length <= 256) {
            if (byteArray.length < 256) {
                bArr = new byte[256];
                System.arraycopy(byteArray, 0, bArr, 256 - byteArray.length, byteArray.length);
                for (int i = 0; i < 256 - byteArray.length; i++) {
                    bArr[i] = 0;
                }
            }
            byte[] n = Utilities.n(byteArray);
            byte[] bArr3 = new byte[8];
            System.arraycopy(n, n.length - 8, bArr3, 0, 8);
            this.authKey = byteArray;
            g = Utilities.g(bArr3);
            this.keyFingerprint = g;
            if (g != phoneCall.key_fingerprint) {
                initiateActualEncryptedCall();
                return;
            }
            if (f11.a) {
                cc4.l("key fingerprints don't match");
            }
            callFailed();
            return;
        }
        bArr = new byte[256];
        System.arraycopy(byteArray, byteArray.length - 256, bArr, 0, 256);
        byteArray = bArr;
        byte[] n2 = Utilities.n(byteArray);
        byte[] bArr32 = new byte[8];
        System.arraycopy(n2, n2.length - 8, bArr32, 0, 8);
        this.authKey = byteArray;
        g = Utilities.g(bArr32);
        this.keyFingerprint = g;
        if (g != phoneCall.key_fingerprint) {
        }
    }

    public void onCameraFirstFrameAvailable() {
        for (int i = 0; i < this.stateListeners.size(); i++) {
            this.stateListeners.get(i).onCameraFirstFrameAvailable();
        }
    }

    public void onConnectionStateChanged(int i, boolean z) {
        hl.c3(new ilc(this, i, (byte) 2));
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (f11.a) {
            cc4.b("=============== VoIPService STARTING ===============");
        }
        byte b = 0;
        try {
            AudioManager audioManager = (AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            if (audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER") != null) {
                Instance.setBufferSize(Integer.parseInt(audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER")));
            } else {
                Instance.setBufferSize(AudioTrack.getMinBufferSize(48000, 4, 2) / 2);
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, "telegram-voip");
            this.cpuWakelock = newWakeLock;
            newWakeLock.acquire();
            this.btAdapter = audioManager.isBluetoothScoAvailableOffCall() ? BluetoothAdapter.getDefaultAdapter() : null;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            if (!USE_CONNECTION_SERVICE) {
                intentFilter.addAction(ACTION_HEADSET_PLUG);
                if (this.btAdapter != null) {
                    intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
                    intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
                }
                intentFilter.addAction("android.intent.action.PHONE_STATE");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.media.RINGER_MODE_CHANGED");
            }
            registerReceiver(this.receiver, intentFilter);
            fetchBluetoothDeviceName();
            if (this.audioDeviceCallback == null) {
                try {
                    this.audioDeviceCallback = new AudioDeviceCallback() { // from class: org.telegram.messenger.voip.VoIPService.11
                        @Override // android.media.AudioDeviceCallback
                        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                            VoIPService.this.checkUpdateBluetoothHeadset();
                        }

                        @Override // android.media.AudioDeviceCallback
                        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                            VoIPService.this.checkUpdateBluetoothHeadset();
                        }
                    };
                } catch (Throwable th) {
                    cc4.g(th, true);
                    this.audioDeviceCallback = null;
                }
            }
            AudioDeviceCallback audioDeviceCallback = this.audioDeviceCallback;
            if (audioDeviceCallback != null) {
                audioManager.registerAudioDeviceCallback(audioDeviceCallback, new Handler(Looper.getMainLooper()));
            }
            if (Build.VERSION.SDK_INT >= 31 && this.communicationDeviceListener == null) {
                AudioManager.OnCommunicationDeviceChangedListener onCommunicationDeviceChangedListener = new AudioManager.OnCommunicationDeviceChangedListener() { // from class: xlc
                    @Override // android.media.AudioManager.OnCommunicationDeviceChangedListener
                    public final void onCommunicationDeviceChanged(AudioDeviceInfo audioDeviceInfo) {
                        VoIPService.this.lambda$onCreate$105(audioDeviceInfo);
                    }
                };
                this.communicationDeviceListener = onCommunicationDeviceChangedListener;
                audioManager.addOnCommunicationDeviceChangedListener(new ic(b), onCommunicationDeviceChangedListener);
            }
            audioManager.registerMediaButtonEventReceiver(new ComponentName(this, (Class<?>) VoIPMediaButtonReceiver.class));
            checkUpdateBluetoothHeadset();
        } catch (Exception e) {
            if (f11.a) {
                cc4.e("error initializing voip controller", e);
            }
            callFailed();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            if (callIShouldHavePutIntoIntent == null) {
                ip7.c();
                bs2.q();
                Notification.Builder showWhen = new Notification.Builder(this, ip7.k0).setContentTitle(ob6.M0(2131743142, null)).setShowWhen(false);
                showWhen.setSmallIcon(R.drawable.call);
                this.foregroundStarted = true;
                if (i < 33) {
                    this.foregroundId = 201;
                    Notification build = showWhen.build();
                    this.foregroundNotification = build;
                    startForeground(201, build);
                    return;
                }
                this.foregroundId = 201;
                Notification build2 = showWhen.build();
                this.foregroundNotification = build2;
                int currentForegroundType = getCurrentForegroundType();
                this.lastForegroundType = currentForegroundType;
                startForeground(201, build2, currentForegroundType);
                return;
            }
            ip7.c();
            bs2.q();
            Notification.Builder showWhen2 = new Notification.Builder(this, ip7.k0).setContentTitle(ob6.M0(2131742917, null)).setShowWhen(false);
            if (this.groupCall != null) {
                showWhen2.setSmallIcon(isMicMute() ? R.drawable.voicechat_muted : R.drawable.voicechat_active);
            } else {
                showWhen2.setSmallIcon(R.drawable.call);
            }
            this.foregroundStarted = true;
            if (i < 33) {
                this.foregroundId = 201;
                Notification build3 = showWhen2.build();
                this.foregroundNotification = build3;
                startForeground(201, build3);
                return;
            }
            this.foregroundId = 201;
            Notification build4 = showWhen2.build();
            this.foregroundNotification = build4;
            int currentForegroundType2 = getCurrentForegroundType();
            this.lastForegroundType = currentForegroundType2;
            startForeground(201, build4, currentForegroundType2);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (f11.a) {
            cc4.b("=============== VoIPService STOPPING ===============");
        }
        byte b = 1;
        stopForeground(true);
        stopRinging();
        byte b2 = 0;
        if (this.currentAccount >= 0) {
            if (org.telegram.messenger.a.x || !org.telegram.messenger.a.w) {
                uc7.s1(this.currentAccount).Z3 = false;
            }
            jn7.f(this.currentAccount).n(this, jn7.I2);
        }
        SensorManager sensorManager = (SensorManager) getSystemService("sensor");
        if (sensorManager.getDefaultSensor(8) != null) {
            sensorManager.unregisterListener(this);
        }
        PowerManager.WakeLock wakeLock = this.proximityWakelock;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.proximityWakelock.release();
        }
        if (this.updateNotificationRunnable != null) {
            Utilities.e.a(this.updateNotificationRunnable);
            this.updateNotificationRunnable = null;
        }
        Runnable runnable = this.switchingStreamTimeoutRunnable;
        if (runnable != null) {
            hl.r(runnable);
            this.switchingStreamTimeoutRunnable = null;
        }
        unregisterReceiver(this.receiver);
        Runnable runnable2 = this.timeoutRunnable;
        if (runnable2 != null) {
            hl.r(runnable2);
            this.timeoutRunnable = null;
        }
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall != null) {
            conferenceCall.destroy();
        }
        super.onDestroy();
        sharedInstance = null;
        cc4.d("(5) set sharedInstance = null");
        Arrays.fill(this.mySource, 0);
        cancelGroupCheckShortPoll();
        hl.c3(new osa((byte) 16));
        detachSignalingTarget();
        if (this.tgVoip[0] != null) {
            a2b c = a2b.c(this.currentAccount);
            int statsNetworkType = getStatsNetworkType();
            int callDuration = ((int) (getCallDuration() / 1000)) % 5;
            int[] iArr = c.n;
            iArr[statsNetworkType] = iArr[statsNetworkType] + callDuration;
            c.m();
            onTgVoipPreStop();
            if (this.tgVoip[0].isGroup()) {
                NativeInstance nativeInstance = this.tgVoip[0];
                stopBroadcastListenerSession();
                to3 to3Var = Utilities.e;
                Objects.requireNonNull(nativeInstance);
                to3Var.c(new vp9(nativeInstance, b));
                releaseRtmpStreamPlayer();
            } else {
                NativeInstance.setOwnAudioLevelMeter(false);
                Instance.FinalState stop = this.tgVoip[0].stop();
                updateTrafficStats(this.tgVoip[0], stop.trafficStats);
                onTgVoipStop(stop);
            }
            this.prevTrafficStats = null;
            this.callStartTime = 0L;
            this.tgVoip[0] = null;
            Instance.destroyInstance();
        } else {
            releaseRtmpStreamPlayer();
        }
        destroyConverting();
        NativeInstance nativeInstance2 = this.tgVoip[1];
        if (nativeInstance2 != null) {
            Utilities.e.c(new vp9(nativeInstance2, b));
            this.tgVoip[1] = null;
        }
        int i = 0;
        while (true) {
            long[] jArr = this.captureDevice;
            if (i >= jArr.length) {
                break;
            }
            long j = jArr[i];
            if (j != 0) {
                NativeInstance.destroyVideoCapturer(j);
                this.captureDevice[i] = 0;
            }
            i++;
        }
        this.cpuWakelock.release();
        AudioManager audioManager = (AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (!this.playingSound) {
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            if (!USE_CONNECTION_SERVICE) {
                if (this.isBtHeadsetConnected || this.bluetoothScoActive || this.bluetoothScoConnecting) {
                    voipAudioManager.stopBluetooth();
                    voipAudioManager.setBluetoothOn(false);
                    voipAudioManager.setSpeakerphoneOn(false);
                    this.bluetoothScoActive = false;
                    this.bluetoothScoConnecting = false;
                }
                if (this.onDestroyRunnable == null) {
                    to3 to3Var2 = Utilities.e;
                    ylc ylcVar = new ylc(audioManager, b2);
                    setModeRunnable = ylcVar;
                    to3Var2.c(ylcVar);
                }
                audioManager.abandonAudioFocus(this);
            }
            try {
                audioManager.unregisterMediaButtonEventReceiver(new ComponentName(this, (Class<?>) VoIPMediaButtonReceiver.class));
            } catch (Exception e) {
                cc4.g(e, true);
            }
            AudioDeviceCallback audioDeviceCallback = this.audioDeviceCallback;
            if (audioDeviceCallback != null) {
                audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
            }
            AudioManager.OnCommunicationDeviceChangedListener onCommunicationDeviceChangedListener = this.communicationDeviceListener;
            if (onCommunicationDeviceChangedListener != null) {
                audioManager.removeOnCommunicationDeviceChangedListener(onCommunicationDeviceChangedListener);
                this.communicationDeviceListener = null;
            }
            Utilities.e.c(new glc(this, (byte) 27));
        }
        if (this.hasAudioFocus) {
            audioManager.abandonAudioFocus(this);
        }
        if (USE_CONNECTION_SERVICE) {
            if (!this.didDeleteConnectionServiceContact) {
                lv2.r(this.currentAccount).h();
            }
            CallConnection callConnection = this.systemCallConnection;
            if (callConnection != null && !this.playingSound) {
                callConnection.destroy();
            }
        }
        xkc.a = SystemClock.elapsedRealtime();
        setSinks(null, null);
        Runnable runnable3 = this.onDestroyRunnable;
        if (runnable3 != null) {
            runnable3.run();
        }
        int i2 = this.currentAccount;
        if (i2 >= 0) {
            ConnectionsManager.getInstance(i2).setAppPaused(true, false);
            if (xc2.T(this.chat)) {
                uc7.s1(this.currentAccount).j5(this.chat, this.classGuid, true, null);
            }
        }
    }

    public void onGroupCallParticipantsUpdate(TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants) {
        vc2 vc2Var = this.groupCall;
        if (vc2Var == null || vc2Var.b.id != tL_updateGroupCallParticipants.call.id) {
            return;
        }
        vc2Var.l.clear();
        this.groupCall.m.clear();
        if (this.conference != null) {
            this.groupCall.q(tL_updateGroupCallParticipants, false);
            this.conference.updateParticipants(this.groupCall.e, true);
            for (int i = 0; i < this.stateListeners.size(); i++) {
                this.stateListeners.get(i).onStateChanged(getCallState());
            }
            vc2 vc2Var2 = this.groupCall;
            vc2Var2.l.addAll(this.conference.getShadyLeftParticipants(vc2Var2.e));
            vc2 vc2Var3 = this.groupCall;
            vc2Var3.m.addAll(this.conference.getShadyJoiningParticipants(vc2Var3.e));
            jn7.f(this.currentAccount).k(jn7.w2, 0L, Long.valueOf(this.groupCall.b.id), Boolean.FALSE);
        }
        long selfId = getSelfId();
        int size = tL_updateGroupCallParticipants.participants.size();
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i2);
            if (groupCallParticipant.left) {
                int i3 = groupCallParticipant.source;
                if (i3 != 0 && i3 == this.mySource[0]) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < size; i5++) {
                        TLRPC.GroupCallParticipant groupCallParticipant2 = tL_updateGroupCallParticipants.participants.get(i5);
                        if (groupCallParticipant2.self || groupCallParticipant2.source == this.mySource[0]) {
                            i4++;
                        }
                    }
                    if (i4 > 1) {
                        hangUp(2);
                        return;
                    }
                }
            } else if (r47.B1(groupCallParticipant.peer) != selfId) {
                continue;
            } else {
                int i6 = groupCallParticipant.source;
                int i7 = this.mySource[0];
                if (i6 != i7 && i7 != 0 && i6 != 0) {
                    if (f11.a) {
                        StringBuilder sb = new StringBuilder("source mismatch my = ");
                        sb.append(this.mySource[0]);
                        sb.append(" psrc = ");
                        c00.q(groupCallParticipant.source, sb);
                    }
                    hangUp(2);
                    return;
                }
                if (xc2.T(this.chat) && this.currentGroupModeStreaming && groupCallParticipant.can_self_unmute) {
                    this.switchingStream = true;
                    createGroupInstance(0, false, true);
                }
                if (groupCallParticipant.muted) {
                    setMicMute(true, false, false);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f A[Catch: Exception -> 0x00c5, TRY_ENTER, TryCatch #1 {Exception -> 0x00c5, blocks: (B:41:0x006f, B:43:0x0075, B:47:0x007e, B:49:0x0083, B:51:0x008c, B:52:0x00c1, B:55:0x0097, B:57:0x009b, B:59:0x009f, B:62:0x00b4, B:63:0x00bc), top: B:39:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onGroupCallUpdated(TLRPC.GroupCall groupCall) {
        boolean optBoolean;
        NativeInstance nativeInstance;
        g01 g01Var;
        vc2 vc2Var = this.groupCall;
        if (vc2Var != null) {
            TLRPC.GroupCall groupCall2 = vc2Var.b;
            if (groupCall2.id == groupCall.id) {
                if (groupCall2 instanceof TLRPC.TL_groupCallDiscarded) {
                    hangUp(2);
                    return;
                }
                try {
                    if (this.myParams != null) {
                        try {
                            optBoolean = new JSONObject(this.myParams.data).optBoolean("stream");
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                        if (this.conference != null) {
                            this.groupCall.p(groupCall);
                        }
                        if ((this.currentState == 1 && optBoolean == this.currentGroupModeStreaming) || this.myParams == null) {
                            return;
                        }
                        boolean z = this.tgVoip[0] != null && isRtmpStreamCall();
                        nativeInstance = this.tgVoip[0];
                        if (nativeInstance != null && !z) {
                            this.lastGroupCallUpdate = groupCall;
                            return;
                        }
                        if (this.playedConnectedSound && optBoolean != this.currentGroupModeStreaming) {
                            this.switchingStream = true;
                        }
                        this.currentGroupModeStreaming = optBoolean;
                        if (!optBoolean) {
                            TLRPC.GroupCall groupCall3 = this.groupCall.b;
                            boolean z2 = groupCall3 != null && groupCall3.rtmp_stream;
                            if (nativeInstance != null) {
                                nativeInstance.prepareForStream(z2);
                            }
                            if (z2) {
                                startRtmpStreamPlayer();
                                if (this.tgVoip[0] == null) {
                                    hl.c3(new glc(this, (byte) 29));
                                }
                            } else if (this.broadcastListenerRejoining && (g01Var = this.broadcastListenerSession) != null) {
                                this.broadcastListenerRejoining = false;
                                Handler handler = g01Var.b;
                                xz0 xz0Var = g01Var.d;
                                Objects.requireNonNull(xz0Var);
                                handler.post(new gz0(xz0Var, (byte) 7));
                            }
                        } else if (nativeInstance != null) {
                            nativeInstance.setJoinResponsePayload(this.myParams.data);
                        } else {
                            cc4.d("engine-free stream answered with rtc");
                        }
                        dispatchStateChanged(2);
                        return;
                    }
                    if (!optBoolean) {
                    }
                    dispatchStateChanged(2);
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
                optBoolean = false;
                if (this.conference != null) {
                }
                if (this.currentState == 1) {
                }
                if (this.tgVoip[0] != null) {
                }
                nativeInstance = this.tgVoip[0];
                if (nativeInstance != null) {
                }
                if (this.playedConnectedSound) {
                    this.switchingStream = true;
                }
                this.currentGroupModeStreaming = optBoolean;
            }
        }
        this.lastGroupCallUpdate = groupCall;
    }

    public void onMediaButtonEvent(KeyEvent keyEvent) {
        if (keyEvent != null) {
            if ((keyEvent.getKeyCode() == 79 || keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 85) && keyEvent.getAction() == 1) {
                if (this.currentState == 15) {
                    acceptIncomingCall();
                } else {
                    setMicMute(!isMicMute(), false, true);
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        this.lastSensorEvent = sensorEvent;
        if (this.unmutedByHold || this.remoteVideoState == 2 || this.videoState[0] == 2 || sensorEvent.sensor.getType() != 8) {
            return;
        }
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if (this.audioRouteToSet != 0 || this.isHeadsetPlugged || voipAudioManager.isSpeakerphoneOn()) {
            return;
        }
        if (isBluetoothHeadsetConnected() && voipAudioManager.isBluetoothOn()) {
            return;
        }
        boolean z = sensorEvent.values[0] < Math.min(sensorEvent.sensor.getMaximumRange(), 3.0f);
        checkIsNear(z);
        jn7.e().k(jn7.J5, Boolean.valueOf(z));
    }

    public void onSignalBarCountChanged(int i) {
        hl.c3(new ilc(this, i, (byte) 1));
    }

    public void onSignalingData(TL_update.TL_updatePhoneCallSignalingData tL_updatePhoneCallSignalingData) {
        synchronized (this.signalingLock) {
            NativeInstance nativeInstance = this.signalingTarget;
            if (nativeInstance != null) {
                if (this.signalingTargetCallId == tL_updatePhoneCallSignalingData.phone_call_id) {
                    nativeInstance.onSignalingDataReceive(tL_updatePhoneCallSignalingData.data);
                }
            } else {
                if (this.pendingSignalingData.size() < 256) {
                    this.pendingSignalingData.add(tL_updatePhoneCallSignalingData);
                }
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (sharedInstance != null) {
            if (f11.a) {
                cc4.d("Tried to start the VoIP service when it's already started");
            }
            return 2;
        }
        int intExtra = intent.getIntExtra("account", -1);
        this.currentAccount = intExtra;
        if (intExtra == -1) {
            grb.i("No account specified when starting VoIP service");
            return 0;
        }
        this.classGuid = ConnectionsManager.generateClassGuid();
        OpusDred.prefetch(this.currentAccount);
        long longExtra = intent.getLongExtra("user_id", 0L);
        long longExtra2 = intent.getLongExtra("chat_id", 0L);
        this.createGroupCall = intent.getBooleanExtra("createGroupCall", false);
        byte[] byteArrayExtra = intent.getByteArrayExtra("joinConference");
        if (byteArrayExtra != null) {
            SerializedData serializedData = new SerializedData(byteArrayExtra);
            this.joinConference = TLRPC.InputGroupCall.TLdeserialize(serializedData, serializedData.readInt32(true), true);
        }
        if (intent.hasExtra("mute_on_start")) {
            this.muteOnStart = Boolean.valueOf(intent.getBooleanExtra("mute_on_start", false));
        }
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("joinConferenceCall");
        if (byteArrayExtra2 != null) {
            SerializedData serializedData2 = new SerializedData(byteArrayExtra2);
            this.joinConferenceCall = TLRPC.GroupCall.TLdeserialize(serializedData2, serializedData2.readInt32(true), true);
        }
        this.inviteUsers = intent.getLongArrayExtra("inviteUsers");
        this.hasFewPeers = intent.getBooleanExtra("hasFewPeers", false);
        this.isRtmpStream = intent.getBooleanExtra("isRtmpStream", false);
        this.joinHash = intent.getStringExtra("hash");
        long longExtra3 = intent.getLongExtra("peerChannelId", 0L);
        long longExtra4 = intent.getLongExtra("peerChatId", 0L);
        long longExtra5 = intent.getLongExtra("peerUserId", 0L);
        if (longExtra4 != 0) {
            TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
            this.groupCallPeer = tL_inputPeerChat;
            tL_inputPeerChat.chat_id = longExtra4;
            tL_inputPeerChat.access_hash = intent.getLongExtra("peerAccessHash", 0L);
        } else if (longExtra3 != 0) {
            TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
            this.groupCallPeer = tL_inputPeerChannel;
            tL_inputPeerChannel.channel_id = longExtra3;
            tL_inputPeerChannel.access_hash = intent.getLongExtra("peerAccessHash", 0L);
        } else if (longExtra5 != 0) {
            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
            this.groupCallPeer = tL_inputPeerUser;
            tL_inputPeerUser.user_id = longExtra5;
            tL_inputPeerUser.access_hash = intent.getLongExtra("peerAccessHash", 0L);
        }
        this.scheduleDate = intent.getIntExtra("scheduleDate", 0);
        this.isOutgoing = intent.getBooleanExtra("is_outgoing", false);
        this.videoCall = intent.getBooleanExtra("video_call", false);
        this.isVideoAvailable = intent.getBooleanExtra("can_video_call", false);
        this.notificationsDisabled = intent.getBooleanExtra("notifications_disabled", false);
        this.instantAccept = intent.getBooleanExtra("accept", false);
        boolean booleanExtra = intent.getBooleanExtra("openFragment", false);
        if (longExtra != 0) {
            this.user = uc7.s1(this.currentAccount).X1(Long.valueOf(longExtra));
        }
        if (longExtra2 != 0) {
            TLRPC.Chat M0 = uc7.s1(this.currentAccount).M0(Long.valueOf(longExtra2));
            this.chat = M0;
            if (xc2.T(M0)) {
                uc7.s1(this.currentAccount).j5(this.chat, this.classGuid, false, null);
            }
        }
        loadResources();
        int i3 = 0;
        while (true) {
            ProxyVideoSink[] proxyVideoSinkArr = this.localSink;
            if (i3 < proxyVideoSinkArr.length) {
                proxyVideoSinkArr[i3] = new ProxyVideoSink();
                this.remoteSink[i3] = new ProxyVideoSink();
                i3++;
            } else {
                try {
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
        this.isHeadsetPlugged = ((AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).isWiredHeadsetOn();
        if (this.chat != null && !this.createGroupCall && uc7.s1(this.currentAccount).g1(this.chat.id, false, null) == null) {
            cc4.l("VoIPService: trying to open group call without call " + this.chat.id);
            stopSelf();
            return 2;
        }
        if (this.videoCall) {
            if (checkSelfPermission("android.permission.CAMERA") == 0) {
                this.captureDevice[0] = NativeInstance.createVideoCapturer(this.localSink[0], this.isFrontFaceCamera ? 1 : 0);
                int[] iArr = this.videoState;
                if (longExtra2 != 0) {
                    iArr[0] = 1;
                } else {
                    iArr[0] = 2;
                }
            } else {
                this.videoState[0] = 1;
            }
            if (!this.isBtHeadsetConnected && !this.isHeadsetPlugged) {
                setAudioOutput(0);
            }
        }
        if (this.user == null && this.chat == null && this.joinConference == null) {
            if (f11.a) {
                cc4.l("VoIPService: user == null AND chat == null");
            }
            stopSelf();
            return 2;
        }
        sharedInstance = this;
        cc4.d("(4) set sharedInstance = this");
        synchronized (sync) {
            if (setModeRunnable != null) {
                Utilities.e.a(setModeRunnable);
                setModeRunnable = null;
            }
        }
        VoIPGroupNotification.hide(this);
        if (this.joinConference != null) {
            if (!uc7.e1().getBoolean("callmiconstart", true)) {
                this.micMute = true;
            } else if (!jve.d("android.permission.RECORD_AUDIO")) {
                this.micMute = true;
                jve.e(new String[]{"android.permission.RECORD_AUDIO"}, new m62(new sh9(this, (byte) 25), (byte) 3));
            }
            startConferenceGroupCall(false, 0, null, false);
            if (!this.isBtHeadsetConnected && !this.isHeadsetPlugged) {
                setAudioOutput(0);
            }
        } else if (this.isOutgoing) {
            if (this.user != null) {
                dispatchStateChanged(14);
                if (USE_CONNECTION_SERVICE) {
                    TelecomManager telecomManager = (TelecomManager) getSystemService("telecom");
                    Bundle bundle = new Bundle();
                    Bundle bundle2 = new Bundle();
                    bundle.putParcelable("android.telecom.extra.PHONE_ACCOUNT_HANDLE", addAccountToTelecomManager());
                    bundle2.putInt("call_type", 1);
                    bundle.putBundle("android.telecom.extra.OUTGOING_CALL_EXTRAS", bundle2);
                    lv2 r = lv2.r(this.currentAccount);
                    TLRPC.User user = this.user;
                    r.g(user.id, user.first_name, user.last_name);
                    telecomManager.placeCall(Uri.fromParts("tel", "+99084" + this.user.id, null), bundle);
                } else {
                    glc glcVar = new glc(this, (byte) 21);
                    this.delayedStartOutgoingCall = glcVar;
                    hl.d3(glcVar, 2000L);
                }
            } else {
                this.micMute = true;
                startGroupCall(0, null, false);
                if (!this.isBtHeadsetConnected && !this.isHeadsetPlugged) {
                    setAudioOutput(0);
                }
            }
            if (intent.getBooleanExtra("start_incall_activity", false)) {
                Intent addFlags = new Intent(this, (Class<?>) LaunchActivity.class).setAction(this.user != null ? "voip" : "voip_chat").addFlags(TLObject.FLAG_28);
                if (this.chat != null) {
                    addFlags.putExtra("currentAccount", this.currentAccount);
                }
                startActivity(addFlags);
            }
        } else {
            jn7.e().k(jn7.E2, new Object[0]);
            TL_phone.PhoneCall phoneCall = callIShouldHavePutIntoIntent;
            this.privateCall = phoneCall;
            boolean z = phoneCall != null && phoneCall.video;
            this.videoCall = z;
            if (z) {
                this.isVideoAvailable = true;
                if (!this.isBtHeadsetConnected && !this.isHeadsetPlugged) {
                    setAudioOutput(0);
                }
            }
            callIShouldHavePutIntoIntent = null;
            cc4.d("(3) set VoIPService.callIShouldHavePutIntoIntent = null");
            if (this.instantAccept) {
                this.instantAccept = false;
                acceptIncomingCall();
            } else if (USE_CONNECTION_SERVICE) {
                acknowledgeCall(false);
                showNotification();
            } else {
                acknowledgeCall(true);
            }
            if (booleanExtra) {
                Activity W = hl.W(this);
                if (W == null) {
                    W = LaunchActivity.H1;
                }
                if (W == null) {
                    W = hl.W(org.telegram.messenger.a.b);
                }
                if (W != null) {
                    mkc.n(W, this.currentAccount);
                }
            }
        }
        initializeAccountRelatedThings();
        hl.c3(new glc(this, (byte) 22));
        return 2;
    }

    public void playAllowTalkSound() {
        Utilities.e.c(new glc(this, (byte) 2));
    }

    public void playConnectedSound() {
        Utilities.e.c(new bmc(this, (byte) 3));
        this.playedConnectedSound = true;
    }

    public void playStartRecordSound() {
        Utilities.e.c(new glc(this, (byte) 1));
    }

    public void processMessageUpdate(r47 r47Var) {
        TLRPC.Message message;
        uc2 uc2Var;
        if (r47Var == null || (message = r47Var.k) == null || !(message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
            return;
        }
        long B0 = r47.B0(message);
        int e1 = r47Var.e1();
        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) r47Var.k.action;
        vc2 vc2Var = this.groupCall;
        if (vc2Var == null || (uc2Var = (uc2) vc2Var.k.get(Long.valueOf(B0))) == null || uc2Var.a != e1) {
            return;
        }
        boolean z = (tL_messageActionConferenceCall.missed || tL_messageActionConferenceCall.active) ? false : true;
        if (uc2Var.a() != z) {
            uc2Var.b = z;
            this.groupCall.k.put(Long.valueOf(B0), uc2Var);
            jn7.f(this.currentAccount).k(jn7.w2, 0L, Long.valueOf(this.groupCall.b.id), Boolean.FALSE);
        }
    }

    public void registerStateListener(StateListener stateListener) {
        if (this.stateListeners.contains(stateListener)) {
            return;
        }
        this.stateListeners.add(stateListener);
        int i = this.currentState;
        if (i != 0) {
            stateListener.onStateChanged(i);
        }
        int i2 = this.signalBarCount;
        if (i2 != 0) {
            stateListener.onSignalBarsCountChanged(i2);
        }
    }

    public void removeExtraLocalSink(VideoSink videoSink) {
        ProxyVideoSink proxyVideoSink = this.localSink[0];
        if (proxyVideoSink != null) {
            proxyVideoSink.removeExtra(videoSink);
        }
    }

    public void removeExtraRemoteSink(TLRPC.GroupCallParticipant groupCallParticipant, boolean z, VideoSink videoSink) {
        String str = z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint;
        ProxyVideoSink proxyVideoSink = this.remoteSinks.get(str);
        if (proxyVideoSink != null) {
            proxyVideoSink.removeExtra(videoSink);
            if (proxyVideoSink.isUnused()) {
                this.remoteSinks.remove(str);
                removeIncomingVideoOutput(proxyVideoSink);
            }
        }
    }

    public void removeRemoteSink(TLRPC.GroupCallParticipant groupCallParticipant, boolean z) {
        String str = z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint;
        ProxyVideoSink proxyVideoSink = this.remoteSinks.get(str);
        if (proxyVideoSink == null) {
            return;
        }
        if (proxyVideoSink.hasExtras()) {
            proxyVideoSink.setTarget(null);
            proxyVideoSink.setBackground(null);
        } else {
            this.remoteSinks.remove(str);
            removeIncomingVideoOutput(proxyVideoSink);
        }
    }

    public void requestFullScreen(TLRPC.GroupCallParticipant groupCallParticipant, boolean z, boolean z2) {
        String str = z2 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint;
        if (str != null) {
            if ("unified".equals(str) && isRtmpStreamCall()) {
                return;
            }
            this.broadcastVideoCeilings.put(str, Integer.valueOf(z ? 2 : 1));
            updateBroadcastVideoRequests();
            NativeInstance[] nativeInstanceArr = this.tgVoip;
            if (z) {
                nativeInstanceArr[0].setVideoEndpointQuality(str, 2);
            } else {
                nativeInstanceArr[0].setVideoEndpointQuality(str, 1);
            }
        }
    }

    public void requestVideoCall(boolean z) {
        int i = 0;
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance == null) {
            return;
        }
        if (!z) {
            long j = this.captureDevice[0];
            if (j != 0) {
                nativeInstance.setupOutgoingVideoCreated(j);
                this.isPrivateScreencast = z;
            }
        }
        ProxyVideoSink proxyVideoSink = this.localSink[0];
        if (z) {
            i = 2;
        } else if (this.isFrontFaceCamera) {
            i = 1;
        }
        nativeInstance.setupOutgoingVideo(proxyVideoSink, i);
        this.isPrivateScreencast = z;
    }

    public void sendCallRating(int i) {
        TL_phone.PhoneCall phoneCall = this.privateCall;
        long j = phoneCall.id;
        long j2 = phoneCall.access_hash;
        int i2 = this.currentAccount;
        int i3 = yac.t0;
        TL_phone.setCallRating setcallrating = new TL_phone.setCallRating();
        setcallrating.rating = i;
        setcallrating.comment = "";
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        setcallrating.peer = tL_inputPhoneCall;
        tL_inputPhoneCall.access_hash = j2;
        tL_inputPhoneCall.id = j;
        setcallrating.user_initiative = false;
        ConnectionsManager.getInstance(i2).sendRequest(setcallrating, new fw0(i3, (byte) 6));
    }

    public void setAudioOutput(int i) {
        CallConnection callConnection;
        if (f11.a) {
            cc4.b("setAudioOutput " + i);
        }
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        boolean z = USE_CONNECTION_SERVICE;
        int i2 = 0;
        if (!z || (callConnection = this.systemCallConnection) == null) {
            if (this.audioConfigured && !z) {
                if (i == 0) {
                    this.needSwitchToBluetoothAfterScoActivates = false;
                    if (this.bluetoothScoActive || this.bluetoothScoConnecting) {
                        voipAudioManager.stopBluetooth();
                        this.bluetoothScoActive = false;
                        this.bluetoothScoConnecting = false;
                    }
                    voipAudioManager.setBluetoothOn(false);
                    voipAudioManager.setSpeakerphoneOn(true);
                    this.audioRouteToSet = 1;
                } else if (i == 1) {
                    this.needSwitchToBluetoothAfterScoActivates = false;
                    if (this.bluetoothScoActive || this.bluetoothScoConnecting) {
                        voipAudioManager.stopBluetooth();
                        this.bluetoothScoActive = false;
                        this.bluetoothScoConnecting = false;
                    }
                    voipAudioManager.setSpeakerphoneOn(false);
                    voipAudioManager.setBluetoothOn(false);
                    this.audioRouteToSet = 0;
                } else if (i == 2) {
                    if (this.bluetoothScoActive) {
                        voipAudioManager.setBluetoothOn(true);
                        voipAudioManager.setSpeakerphoneOn(false);
                    } else {
                        this.needSwitchToBluetoothAfterScoActivates = true;
                        try {
                            voipAudioManager.startBluetooth();
                        } catch (Throwable th) {
                            cc4.g(th, true);
                        }
                    }
                    this.audioRouteToSet = 2;
                }
                updateOutputGainControlState();
            } else if (i == 0) {
                this.audioRouteToSet = 1;
                this.speakerphoneStateToSet = true;
            } else if (i == 1) {
                this.audioRouteToSet = 0;
                this.speakerphoneStateToSet = false;
            } else if (i == 2) {
                this.audioRouteToSet = 2;
                this.speakerphoneStateToSet = false;
            }
        } else if (i == 0) {
            callConnection.setAudioRoute(8);
        } else if (i == 1) {
            callConnection.setAudioRoute(5);
        } else if (i == 2) {
            callConnection.setAudioRoute(2);
        }
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        while (i2 < size) {
            StateListener stateListener = arrayList.get(i2);
            i2++;
            stateListener.onAudioSettingsChanged();
        }
    }

    public void setAudioRoute(int i) {
        if (i == 1) {
            setAudioOutput(0);
        } else if (i == 0) {
            setAudioOutput(1);
        } else if (i == 2) {
            setAudioOutput(2);
        }
    }

    public void setBackgroundSinks(VideoSink videoSink, VideoSink videoSink2) {
        this.localSink[0].setBackground(videoSink);
        this.remoteSink[0].setBackground(videoSink2);
    }

    public void setGroupCallHash(String str) {
        if (!this.currentGroupModeStreaming || TextUtils.isEmpty(str) || str.equals(this.joinHash)) {
            return;
        }
        this.joinHash = str;
        createGroupInstance(0, false, true);
    }

    public void setGroupCallPeer(TLRPC.InputPeer inputPeer) {
        vc2 vc2Var = this.groupCall;
        if (vc2Var != null) {
            this.groupCallPeer = inputPeer;
            vc2Var.y(inputPeer);
            TLRPC.ChatFull N0 = uc7.s1(this.currentAccount).N0(this.groupCall.c);
            if (N0 != null) {
                TLRPC.Peer peer = this.groupCall.J;
                N0.groupcall_default_join_as = peer;
                if (peer != null) {
                    boolean z = N0 instanceof TLRPC.TL_chatFull;
                    int i = N0.flags;
                    if (z) {
                        N0.flags = i | 32768;
                    } else {
                        N0.flags = i | 67108864;
                    }
                } else {
                    boolean z2 = N0 instanceof TLRPC.TL_chatFull;
                    int i2 = N0.flags;
                    if (z2) {
                        N0.flags = i2 & (-32769);
                    } else {
                        N0.flags = i2 & (-67108865);
                    }
                }
            }
            createGroupInstance(0, true, true);
            if (this.videoState[1] == 2) {
                createGroupInstance(1, true, true);
            }
        }
    }

    public void setLocalSink(VideoSink videoSink, boolean z) {
        if (z) {
            return;
        }
        this.localSink[0].setTarget(videoSink);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[LOOP:0: B:24:0x0071->B:25:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setMicMute(boolean z, boolean z2, boolean z3) {
        VoIPService voIPService;
        int i;
        NativeInstance nativeInstance;
        int size;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (this.micMute == z || this.micSwitching) {
            return;
        }
        this.micMute = z;
        vc2 vc2Var = this.groupCall;
        if (vc2Var != null) {
            if (!z3 && (groupCallParticipant = (TLRPC.GroupCallParticipant) vc2Var.d.f(getSelfId())) != null && groupCallParticipant.muted && !groupCallParticipant.can_self_unmute) {
                z3 = true;
            }
            if (z3) {
                voIPService = this;
                voIPService.editCallMember(yac.h(this.currentAccount).f(), Boolean.valueOf(z), null, null, null, null);
                to3 to3Var = Utilities.e;
                glc glcVar = new glc(voIPService, (byte) 12);
                voIPService.updateNotificationRunnable = glcVar;
                to3Var.c(glcVar);
                i = 0;
                voIPService.unmutedByHold = voIPService.micMute && z2;
                nativeInstance = voIPService.convertingVoip;
                if (nativeInstance == null) {
                    nativeInstance.setMuteMicrophone(z);
                } else {
                    NativeInstance nativeInstance2 = voIPService.tgVoip[0];
                    if (nativeInstance2 != null) {
                        nativeInstance2.setMuteMicrophone(z);
                    }
                }
                ArrayList<StateListener> arrayList = voIPService.stateListeners;
                size = arrayList.size();
                while (i < size) {
                    StateListener stateListener = arrayList.get(i);
                    i++;
                    stateListener.onAudioSettingsChanged();
                }
            }
        }
        voIPService = this;
        i = 0;
        voIPService.unmutedByHold = voIPService.micMute && z2;
        nativeInstance = voIPService.convertingVoip;
        if (nativeInstance == null) {
        }
        ArrayList<StateListener> arrayList2 = voIPService.stateListeners;
        size = arrayList2.size();
        while (i < size) {
        }
    }

    public void setNoiseSupressionEnabled(boolean z) {
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance == null) {
            return;
        }
        nativeInstance.setNoiseSuppressionEnabled(z);
    }

    public void setParticipantVolume(TLRPC.GroupCallParticipant groupCallParticipant, int i) {
        int i2;
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance == null) {
            rr9 rr9Var = this.rtmpStreamPlayer;
            if (rr9Var != null) {
                rr9Var.b.post(new jt(rr9Var, i / 10000.0f, (byte) 5));
                return;
            }
            return;
        }
        double d = i / 10000.0d;
        nativeInstance.setVolume(groupCallParticipant.source, d);
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.presentation;
        if (tL_groupCallParticipantVideo == null || (i2 = tL_groupCallParticipantVideo.audio_source) == 0) {
            return;
        }
        this.tgVoip[0].setVolume(i2, d);
    }

    public void setParticipantsVolume() {
        if (this.tgVoip[0] != null) {
            int m = this.groupCall.d.m();
            for (int i = 0; i < m; i++) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.groupCall.d.n(i);
                if (!groupCallParticipant.self && groupCallParticipant.source != 0 && (groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
                    if (groupCallParticipant.muted_by_you) {
                        setParticipantVolume(groupCallParticipant, 0);
                    } else {
                        setParticipantVolume(groupCallParticipant, xc2.H(groupCallParticipant));
                    }
                }
            }
        }
    }

    public void setRemoteSink(VideoSink videoSink, boolean z) {
        this.remoteSink[z ? 1 : 0].setTarget(videoSink);
    }

    public void setRtmpStreamVideoOutput(qr9 qr9Var, Runnable runnable) {
        rr9 rtmpStreamPlayer = getRtmpStreamPlayer();
        if (rtmpStreamPlayer == null) {
            if (runnable != null) {
                runnable.run();
            }
        } else {
            if (qr9Var == null) {
                qr9Var = this.rtmpStreamVideoSinks;
            }
            rtmpStreamPlayer.l(qr9Var, runnable);
        }
    }

    public void setSinks(VideoSink videoSink, boolean z, VideoSink videoSink2) {
        ProxyVideoSink proxyVideoSink = this.localSink[z ? 1 : 0];
        ProxyVideoSink proxyVideoSink2 = this.remoteSink[z ? 1 : 0];
        if (proxyVideoSink != null) {
            proxyVideoSink.setTarget(videoSink);
        }
        if (proxyVideoSink2 != null) {
            proxyVideoSink2.setTarget(videoSink2);
        }
    }

    public void setSwitchingCamera(boolean z, boolean z2) {
        this.switchingCamera = z;
        if (z) {
            return;
        }
        this.isFrontFaceCamera = z2;
        for (int i = 0; i < this.stateListeners.size(); i++) {
            this.stateListeners.get(i).onCameraSwitch(this.isFrontFaceCamera);
        }
    }

    public void setVideoState(boolean z, int i) {
        int i2;
        int i3 = 0;
        char c = this.groupCall != null ? z ? 1 : 0 : (char) 0;
        NativeInstance nativeInstance = this.tgVoip[c];
        if (nativeInstance != null) {
            this.videoState[c] = i;
            nativeInstance.setVideoState(i);
            long j = this.captureDevice[z ? 1 : 0];
            if (j != 0) {
                NativeInstance.setVideoStateCapturer(j, this.videoState[c]);
            }
            if (z) {
                return;
            }
            if (this.groupCall != null) {
                editCallMember(yac.h(this.currentAccount).f(), null, Boolean.valueOf(this.videoState[0] != 2), null, null, null);
            }
            checkIsNear();
            return;
        }
        long[] jArr = this.captureDevice;
        long j2 = jArr[z ? 1 : 0];
        if (j2 != 0) {
            this.videoState[c] = i;
            NativeInstance.setVideoStateCapturer(j2, i);
            return;
        }
        if (i != 2 || (i2 = this.currentState) == 17 || i2 == 11) {
            return;
        }
        ProxyVideoSink proxyVideoSink = this.localSink[c];
        if (z) {
            i3 = 2;
        } else if (this.isFrontFaceCamera) {
            i3 = 1;
        }
        jArr[z ? 1 : 0] = NativeInstance.createVideoCapturer(proxyVideoSink, i3);
        this.videoState[c] = 2;
    }

    public void setupCaptureDevice(boolean z, boolean z2) {
        NativeInstance nativeInstance;
        if (!z) {
            long j = this.captureDevice[z ? 1 : 0];
            if (j == 0 || (nativeInstance = this.tgVoip[z ? 1 : 0]) == null) {
                return;
            }
            nativeInstance.setupOutgoingVideoCreated(j);
            this.videoState[z ? 1 : 0] = 2;
        }
        if (this.micMute == z2) {
            setMicMute(!z2, false, false);
            this.micSwitching = true;
        }
        if (this.groupCall != null) {
            editCallMember(yac.h(this.currentAccount).f(), Boolean.valueOf(!z2), Boolean.valueOf(this.videoState[0] != 2), null, null, new glc(this, (byte) 19));
        }
    }

    @Override // org.telegram.messenger.voip.VoIPServiceState
    public void stopRinging() {
        synchronized (sync) {
            MediaPlayer mediaPlayer = this.ringtonePlayer;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                this.ringtonePlayer.release();
                this.ringtonePlayer = null;
            }
        }
        Vibrator vibrator = this.vibrator;
        if (vibrator != null) {
            vibrator.cancel();
            this.vibrator = null;
        }
    }

    public void stopScreenCapture() {
        if (this.groupCall != null) {
            byte b = 1;
            if (this.videoState[1] == 2) {
                TL_phone.leaveGroupCallPresentation leavegroupcallpresentation = new TL_phone.leaveGroupCallPresentation();
                vc2 vc2Var = this.groupCall;
                leavegroupcallpresentation.call = vc2Var.h(vc2Var.a);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(leavegroupcallpresentation, new hlc(this, (byte) 6));
                NativeInstance nativeInstance = this.tgVoip[1];
                if (nativeInstance != null) {
                    Utilities.e.c(new vp9(nativeInstance, b));
                }
                this.mySource[1] = 0;
                this.tgVoip[1] = null;
                long j = this.captureDevice[1];
                if (j != 0) {
                    NativeInstance.destroyVideoCapturer(j);
                }
                this.captureDevice[1] = 0;
                this.videoState[1] = 0;
                jn7.f(k5.a(this.currentAccount).a).k(jn7.z2, new Object[0]);
            }
        }
    }

    public void swapSinks() {
        this.localSink[0].swap();
        this.remoteSink[0].swap();
    }

    public void switchCamera() {
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance != null && nativeInstance.hasVideoCapturer() && !this.switchingCamera) {
            this.switchingCamera = true;
            this.tgVoip[0].switchCamera(!this.isFrontFaceCamera);
            return;
        }
        long j = this.captureDevice[0];
        if (j == 0 || this.switchingCamera) {
            return;
        }
        NativeInstance.switchCameraCapturer(j, !this.isFrontFaceCamera);
    }

    public void switchToSpeaker() {
        hl.d3(new glc(this, (byte) 14), 500L);
    }

    public void toggleSpeakerphoneOrShowRouteSheet(Context context, boolean z, Integer num) {
        CallConnection callConnection;
        int i = 0;
        byte b = 1;
        if (isBluetoothHeadsetConnected() && hasEarpiece()) {
            nx0 h = uh9.h(1, null, context, false);
            h.P = ob6.M0(2131742916, null);
            h.Q = true;
            h.Y = num;
            byte b2 = 4;
            h.X = num != null ? (byte) 4 : (byte) 0;
            String M0 = ob6.M0(2131743151, null);
            String M02 = ob6.M0(this.isHeadsetPlugged ? 2131743153 : 2131743154, null);
            String str = this.currentBluetoothDeviceName;
            if (str == null) {
                str = ob6.M0(2131743155, null);
            }
            CharSequence[] charSequenceArr = {M0, M02, str};
            int[] iArr = {R.drawable.msg_call_speaker, this.isHeadsetPlugged ? R.drawable.calls_menu_headset : R.drawable.msg_call_earpiece, R.drawable.msg_call_bluetooth};
            s20 s20Var = new s20(this, b2);
            h.M = charSequenceArr;
            h.N = iArr;
            h.L = s20Var;
            h.setOnShowListener(new j41(b, h, num));
            if (z) {
                if (Build.VERSION.SDK_INT >= 26) {
                    h.getWindow().setType(2038);
                } else {
                    h.getWindow().setType(2003);
                }
            }
            h.show();
            return;
        }
        boolean z2 = USE_CONNECTION_SERVICE;
        if (z2 && (callConnection = this.systemCallConnection) != null && callConnection.getCallAudioState() != null) {
            boolean hasEarpiece = hasEarpiece();
            CallConnection callConnection2 = this.systemCallConnection;
            if (hasEarpiece) {
                callConnection2.setAudioRoute(callConnection2.getCallAudioState().getRoute() != 8 ? 8 : 5);
            } else {
                callConnection2.setAudioRoute(callConnection2.getCallAudioState().getRoute() == 2 ? 5 : 2);
            }
        } else {
            if (this.audioConfigured && !z2) {
                VoipAudioManager voipAudioManager = VoipAudioManager.get();
                if (hasEarpiece()) {
                    voipAudioManager.setSpeakerphoneOn(!voipAudioManager.isSpeakerphoneOn());
                } else {
                    voipAudioManager.setBluetoothOn(!voipAudioManager.isBluetoothOn());
                }
                voipAudioManager.isBluetoothAndSpeakerOnAsync(new ulc(this, b));
                return;
            }
            this.speakerphoneStateToSet = !this.speakerphoneStateToSet;
        }
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        while (i < size) {
            StateListener stateListener = arrayList.get(i);
            i++;
            stateListener.onAudioSettingsChanged();
        }
    }

    public void unregisterStateListener(StateListener stateListener) {
        this.stateListeners.remove(stateListener);
    }

    public void updateCurrentForegroundType() {
        if (this.lastForegroundType == getCurrentForegroundType() || !this.foregroundStarted) {
            return;
        }
        stopForeground(true);
        int i = Build.VERSION.SDK_INT;
        int i2 = this.foregroundId;
        if (i < 33) {
            startForeground(i2, this.foregroundNotification);
            return;
        }
        Notification notification = this.foregroundNotification;
        int currentForegroundType = getCurrentForegroundType();
        this.lastForegroundType = currentForegroundType;
        startForeground(i2, notification, currentForegroundType);
    }

    public void updateOutputGainControlState() {
        hasRtmpStream();
    }

    public void setSinks(VideoSink videoSink, VideoSink videoSink2) {
        setSinks(videoSink, false, videoSink2);
    }

    private void onTgVoipPreStop() {
    }

    private int getCurrentForegroundType() {
        return getCurrentForegroundType(this, this.gotMediaProjection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createGroupInstance$71(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSignalingData(byte[] bArr) {
        if (this.privateCall == null) {
            return;
        }
        TL_phone.sendSignalingData sendsignalingdata = new TL_phone.sendSignalingData();
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        sendsignalingdata.peer = tL_inputPhoneCall;
        TL_phone.PhoneCall phoneCall = this.privateCall;
        tL_inputPhoneCall.access_hash = phoneCall.access_hash;
        tL_inputPhoneCall.id = phoneCall.id;
        sendsignalingdata.data = bArr;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendsignalingdata, null);
    }

    private void checkIsNear() {
        if (this.remoteVideoState == 2 || this.videoState[0] == 2) {
            checkIsNear(false);
        }
    }

    public void hangUp() {
        hangUp(0, null);
    }

    public void hangUp(int i) {
        hangUp(i, null);
    }

    public void hangUp(Runnable runnable) {
        hangUp(0, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callFailed() {
        NativeInstance nativeInstance = this.tgVoip[0];
        callFailed(nativeInstance != null ? nativeInstance.getLastError() : Instance.ERROR_UNKNOWN);
    }

    @Override // org.telegram.messenger.voip.VoIPServiceState
    public void declineIncomingCall() {
        declineIncomingCall(1, null);
    }

    public void toggleSpeakerphoneOrShowRouteSheet(Context context, boolean z) {
        toggleSpeakerphoneOrShowRouteSheet(context, z, null);
    }

    public void startRingtoneAndVibration() {
        if (this.startedRinging) {
            return;
        }
        startRingtoneAndVibration(this.user.id);
        this.startedRinging = true;
    }

    private void showNotification() {
        if (this.user != null) {
            showNotification(getTitle(), getRoundAvatarBitmap(this, this.currentAccount, this.user));
        } else {
            showNotification(getTitle(), getRoundAvatarBitmap(this, this.currentAccount, this.chat));
        }
    }
}
