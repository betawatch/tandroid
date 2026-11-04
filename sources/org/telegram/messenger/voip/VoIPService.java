package org.telegram.messenger.voip;

import ai.e3;
import ai.f3;
import android.app.Activity;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Person;
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
import android.util.Log;
import android.util.LruCache;
import android.view.KeyEvent;
import android.widget.RemoteViews;
import android.widget.Toast;
import b8.nf;
import ci.a2;
import ci.e1;
import ci.v6;
import ei.d1;
import gi.b3;
import ii.g2;
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
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import k2.p1;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.cs;
import org.telegram.messenger.g5;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.messenger.p3;
import org.telegram.messenger.p5;
import org.telegram.messenger.q3;
import org.telegram.messenger.qr;
import org.telegram.messenger.r2;
import org.telegram.messenger.r3;
import org.telegram.messenger.sr;
import org.telegram.messenger.t3;
import org.telegram.messenger.u10;
import org.telegram.messenger.us;
import org.telegram.messenger.vc;
import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.w7;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.lm;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.voip.n1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.VoIPFeedbackActivity;
import org.telegram.ui.VoIPPermissionActivity;
import org.telegram.ui.sb1;
import org.telegram.ui.x30;
import org.telegram.ui.zb1;
import org.webrtc.MediaStreamTrack;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.voiceengine.WebRtcAudioTrack;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class VoIPService extends Service implements SensorEventListener, AudioManager.OnAudioFocusChangeListener, cs, VoIPServiceState {
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
    private static final int PROXIMITY_SCREEN_OFF_WAKE_LOCK = 32;
    public static final int QUALITY_FULL = 2;
    public static final int QUALITY_MEDIUM = 1;
    public static final int QUALITY_SMALL = 0;
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
    public r3 groupCall;
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
    private int scheduleDate;
    private Runnable shortPollRunnable;
    private int signalBarCount;
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
    private long[] captureDevice = new long[2];
    private boolean[] destroyCaptureDevice = {true, true};
    private int[] videoState = {0, 0};
    private int remoteAudioState = 1;
    private int audioRouteToSet = 2;
    public final SharedUIParams sharedUIParams = new SharedUIParams();
    private ArrayList<TL_phone.PhoneCall> pendingUpdates = new ArrayList<>();
    private HashMap<String, Integer> currentStreamRequestTimestamp = new HashMap<>();
    private Runnable afterSoundRunnable = new 1();
    private BluetoothProfile.ServiceListener serviceListener = new BluetoothProfile.ServiceListener() { // from class: org.telegram.messenger.voip.VoIPService.2
        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i3, BluetoothProfile bluetoothProfile) {
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
                BluetoothAdapter.getDefaultAdapter().closeProfileProxy(i3, bluetoothProfile);
                VoIPService.this.fetchingBluetoothDeviceName = false;
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i3) {
        }
    };
    private BroadcastReceiver receiver = new BroadcastReceiver() { // from class: org.telegram.messenger.voip.VoIPService.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int i3 = 0;
            if (VoIPService.ACTION_HEADSET_PLUG.equals(intent.getAction())) {
                VoIPService.this.isHeadsetPlugged = intent.getIntExtra("state", 0) == 1;
                if (VoIPService.this.isHeadsetPlugged && VoIPService.this.proximityWakelock != null && VoIPService.this.proximityWakelock.isHeld()) {
                    VoIPService.this.proximityWakelock.release();
                }
                if (VoIPService.this.isHeadsetPlugged) {
                    VoipAudioManager voipAudioManager = VoipAudioManager.get();
                    if (voipAudioManager.isSpeakerphoneOn()) {
                        VoIPService.this.previousAudioOutput = 0;
                    } else if (voipAudioManager.isBluetoothOn()) {
                        VoIPService.this.previousAudioOutput = 2;
                    } else {
                        VoIPService.this.previousAudioOutput = 1;
                    }
                    VoIPService.this.setAudioOutput(1);
                } else if (VoIPService.this.previousAudioOutput >= 0) {
                    VoIPService voIPService = VoIPService.this;
                    voIPService.setAudioOutput(voIPService.previousAudioOutput);
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
                if (r2.a) {
                    a8.d("bt headset state = " + intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0));
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
                if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
                    if (VoIPService.this.currentState != 15 || VoIPService.this.user == null) {
                        return;
                    }
                    if (((AudioManager) VoIPService.this.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).getRingerMode() == 0) {
                        VoIPService.this.stopRinging();
                        return;
                    } else {
                        if (VoIPService.this.ringtonePlayer == null) {
                            VoIPService voIPService2 = VoIPService.this;
                            voIPService2.startRingtoneAndVibration(voIPService2.user.id);
                            return;
                        }
                        return;
                    }
                }
                if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                    while (i3 < VoIPService.this.stateListeners.size()) {
                        ((StateListener) VoIPService.this.stateListeners.get(i3)).onScreenOnChange(true);
                        i3++;
                    }
                    return;
                } else {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        for (int i10 = 0; i10 < VoIPService.this.stateListeners.size(); i10++) {
                            ((StateListener) VoIPService.this.stateListeners.get(i10)).onScreenOnChange(false);
                        }
                        return;
                    }
                    return;
                }
            }
            int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0);
            if (r2.a) {
                a8.d("Bluetooth SCO state updated: " + intExtra);
            }
            if (intExtra == 0 && VoIPService.this.isBtHeadsetConnected && (Build.VERSION.SDK_INT < 31 ? !(VoIPService.this.btAdapter.isEnabled() && nf.d("android.permission.BLUETOOTH_CONNECT") && VoIPService.this.btAdapter.getProfileConnectionState(1) == 2) : VoipAudioManager.get().findBluetoothDevice() == null)) {
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
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((StateListener) obj).onAudioSettingsChanged();
            }
        }
    };
    private final HashMap<String, TLRPC.GroupCallParticipant> waitingFrameParticipant = new HashMap<>();
    private final LruCache<String, ProxyVideoSink> proxyVideoSinkLruCache = new LruCache<String, ProxyVideoSink>(6) { // from class: org.telegram.messenger.voip.VoIPService.4
        @Override // android.util.LruCache
        public void entryRemoved(boolean z10, String str, ProxyVideoSink proxyVideoSink, ProxyVideoSink proxyVideoSink2) {
            super.entryRemoved(z10, (boolean) str, proxyVideoSink, proxyVideoSink2);
            VoIPService.this.tgVoip[0].removeIncomingVideoOutput(proxyVideoSink.nativeInstance);
        }
    };
    private ProxyVideoSink[] localSink = new ProxyVideoSink[2];
    private ProxyVideoSink[] remoteSink = new ProxyVideoSink[2];
    private ProxyVideoSink[] currentBackgroundSink = new ProxyVideoSink[2];
    private String[] currentBackgroundEndpointId = new String[2];
    private HashMap<String, ProxyVideoSink> remoteSinks = new HashMap<>();
    private final Runnable destroyConvertingRunnable = new n0(this, 0);

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public class 1 implements Runnable {
        public 1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0() {
            VoIPService.this.soundPool.release();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$run$1(AudioManager audioManager) {
            synchronized (VoIPService.sync) {
                try {
                    if (VoIPService.setModeRunnable == null) {
                        return;
                    }
                    Runnable unused = VoIPService.setModeRunnable = null;
                    try {
                        audioManager.setMode(0);
                    } catch (SecurityException e10) {
                        if (r2.a) {
                            a8.e("Error setting audio more to normal", e10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
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
            if (!VoIPService.USE_CONNECTION_SERVICE && VoIPService.sharedInstance == null) {
                if (VoIPService.this.isBtHeadsetConnected) {
                    voipAudioManager.stopBluetooth();
                    voipAudioManager.setBluetoothOn(false);
                    VoIPService.this.bluetoothScoActive = false;
                    VoIPService.this.bluetoothScoConnecting = false;
                }
                voipAudioManager.setSpeakerphoneOn(false);
            }
            int i3 = 0;
            Utilities.e.c(new p0(this, i3));
            Utilities.e.c(VoIPService.setModeRunnable = new q0(audioManager, i3));
        }
    }

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public class 5 implements VideoSink {
        final /* synthetic */ String val$endpointId;
        final /* synthetic */ boolean val$screencast;

        public 5(String str, boolean z10) {
            this.val$endpointId = str;
            this.val$screencast = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFrame$0(String str, VideoSink videoSink, boolean z10) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) VoIPService.this.waitingFrameParticipant.remove(str);
            ProxyVideoSink proxyVideoSink = (ProxyVideoSink) VoIPService.this.remoteSinks.get(str);
            if (proxyVideoSink != null && proxyVideoSink.target == videoSink) {
                VoIPService.this.proxyVideoSinkLruCache.put(str, proxyVideoSink);
                VoIPService.this.remoteSinks.remove(str);
                proxyVideoSink.setTarget(null);
            }
            if (groupCallParticipant != null) {
                if (z10) {
                    groupCallParticipant.hasPresentationFrame = 2;
                } else {
                    groupCallParticipant.hasCameraFrame = 2;
                }
            }
            r3 r3Var = VoIPService.this.groupCall;
            if (r3Var != null) {
                r3Var.B();
            }
        }

        @Override // org.webrtc.VideoSink
        public void onFrame(VideoFrame videoFrame) {
            if (videoFrame == null || videoFrame.getBuffer().getHeight() == 0 || videoFrame.getBuffer().getWidth() == 0) {
                return;
            }
            org.telegram.messenger.g0.h3(new r0(this, this.val$endpointId, this, this.val$screencast, 0));
        }

        @Override // org.webrtc.VideoSink
        public final /* synthetic */ void setParentSink(VideoSink videoSink) {
            org.webrtc.e0.a(this, videoSink);
        }
    }

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public class 9 implements Runnable {
        public 9() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0() {
            if (VoIPService.this.spPlayId == 0) {
                VoIPService voIPService = VoIPService.this;
                voIPService.spPlayId = voIPService.soundPool.play(VoIPService.this.spConnectingId, 1.0f, 1.0f, 0, -1, 1.0f);
            }
            if (VoIPService.this.spPlayId == 0) {
                org.telegram.messenger.g0.i3(this, 100L);
            } else {
                VoIPService.this.connectingSoundRunnable = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VoIPService.sharedInstance == null) {
                return;
            }
            Utilities.e.c(new p0(this, 1));
        }
    }

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
            if (r2.a) {
                a8.b("ConnectionService call audio state changed: " + callAudioState);
            }
            ArrayList arrayList = VoIPService.this.stateListeners;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((StateListener) obj).onAudioSettingsChanged();
            }
        }

        @Override // android.telecom.Connection
        public void onCallEvent(String str, Bundle bundle) {
            super.onCallEvent(str, bundle);
            if (r2.a) {
                a8.b("ConnectionService onCallEvent " + str);
            }
        }

        @Override // android.telecom.Connection
        public void onDisconnect() {
            if (r2.a) {
                a8.b("ConnectionService onDisconnect");
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
            if (r2.a) {
                a8.b("onSlience");
            }
            VoIPService.this.stopRinging();
        }

        @Override // android.telecom.Connection
        public void onStateChanged(int i3) {
            super.onStateChanged(i3);
            if (r2.a) {
                a8.b("ConnectionService onStateChanged " + Connection.stateToString(i3));
            }
            if (i3 == 4) {
                g5.r(VoIPService.this.currentAccount).h();
                VoIPService.this.didDeleteConnectionServiceContact = true;
            }
        }
    }

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public static class ProxyVideoSink implements VideoSink {
        private VideoSink background;
        private long nativeInstance;
        private VideoSink target;

        @Override // org.webrtc.VideoSink
        public synchronized void onFrame(VideoFrame videoFrame) {
            try {
                VideoSink videoSink = this.target;
                if (videoSink != null) {
                    videoSink.onFrame(videoFrame);
                }
                VideoSink videoSink2 = this.background;
                if (videoSink2 != null) {
                    videoSink2.onFrame(videoFrame);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized void removeBackground(VideoSink videoSink) {
            if (this.background == videoSink) {
                this.background = null;
            }
        }

        public synchronized void removeTarget(VideoSink videoSink) {
            if (this.target == videoSink) {
                this.target = null;
            }
        }

        public synchronized void setBackground(VideoSink videoSink) {
            try {
                VideoSink videoSink2 = this.background;
                if (videoSink2 != null) {
                    videoSink2.setParentSink(null);
                }
                this.background = videoSink;
                if (videoSink != null) {
                    videoSink.setParentSink(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // org.webrtc.VideoSink
        public final /* synthetic */ void setParentSink(VideoSink videoSink) {
            org.webrtc.e0.a(this, videoSink);
        }

        public synchronized void setTarget(VideoSink videoSink) {
            try {
                VideoSink videoSink2 = this.target;
                if (videoSink2 != videoSink) {
                    if (videoSink2 != null) {
                        videoSink2.setParentSink(null);
                    }
                    this.target = videoSink;
                    if (videoSink != null) {
                        videoSink.setParentSink(this);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
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

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public static class RequestedParticipant {
        public int audioSsrc;
        public TLRPC.GroupCallParticipant participant;
        public long userId;

        public RequestedParticipant(TLRPC.GroupCallParticipant groupCallParticipant, int i3) {
            this.participant = groupCallParticipant;
            this.audioSsrc = i3;
            this.userId = groupCallParticipant == null ? 0L : m5.o(groupCallParticipant.peer);
        }
    }

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public static class SharedUIParams {
        public boolean cameraAlertWasShowed;
        public boolean tapToVideoTooltipWasShowed;
        public boolean wasVideoCall;
    }

    /* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
    public interface StateListener {
        void onAudioSettingsChanged();

        void onCameraFirstFrameAvailable();

        void onCameraSwitch(boolean z10);

        void onMediaStateUpdated(int i3, int i10);

        void onScreenOnChange(boolean z10);

        void onSignalBarsCountChanged(int i3);

        void onStateChanged(int i3);

        void onVideoAvailableChange(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void acceptIncomingCallFromNotification() {
        showNotification();
        if (checkSelfPermission("android.permission.RECORD_AUDIO") != 0 || (this.privateCall.video && checkSelfPermission("android.permission.CAMERA") != 0)) {
            try {
                PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) VoIPPermissionActivity.class).addFlags(TLObject.FLAG_28), 1107296256).send();
                return;
            } catch (Exception e10) {
                if (r2.a) {
                    a8.e("Error starting permission activity", e10);
                    return;
                }
                return;
            }
        }
        acceptIncomingCall();
        try {
            PendingIntent.getActivity(this, 0, new Intent(this, getUIActivityClass()).setAction("voip"), 33554432).send();
        } catch (Exception e11) {
            if (r2.a) {
                a8.e("Error starting incall activity", e11);
            }
        }
    }

    private void acknowledgeCall(boolean z10) {
        TL_phone.PhoneCall phoneCall = this.privateCall;
        if (phoneCall == null) {
            if (r2.a) {
                a8.l("Call is null, wtf");
            }
            stopSelf();
            return;
        }
        if (phoneCall instanceof TL_phone.TL_phoneCallDiscarded) {
            if (r2.a) {
                a8.l("Call " + this.privateCall.id + " was discarded before the service started, stopping");
            }
            stopSelf();
            return;
        }
        if (sr.i() && !sr.g() && ((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (r2.a) {
                a8.d("MIUI: no permission to show when locked but the screen is locked. ¯\\_(ツ)_/¯");
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(receivedcall, new b3(1, this, z10), 65536);
    }

    private PhoneAccountHandle addAccountToTelecomManager() {
        TelecomManager telecomManager = (TelecomManager) getSystemService("telecom");
        TLRPC.User f10 = h10.i(this.currentAccount).f();
        PhoneAccountHandle phoneAccountHandle = new PhoneAccountHandle(new ComponentName(this, (Class<?>) TelegramConnectionService.class), "" + f10.id);
        telecomManager.registerPhoneAccount(new PhoneAccount.Builder(phoneAccountHandle, g5.m(0, f10.first_name, f10.last_name)).setCapabilities(2048).setIcon(Icon.createWithResource(this, R.drawable.ic_launcher_dr)).setHighlightColor(-13851168).addSupportedUriScheme("sip").build());
        return phoneAccountHandle;
    }

    private void broadcastUnknownParticipants(long j10, int[] iArr) {
        if (this.groupCall == null || this.tgVoip[0] == null) {
            return;
        }
        long selfId = getSelfId();
        int length = iArr.length;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < length; i3++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.groupCall.p.get(iArr[i3]);
            if (groupCallParticipant == null && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.groupCall.q.get(iArr[i3])) == null) {
                groupCallParticipant = (TLRPC.GroupCallParticipant) this.groupCall.r.get(iArr[i3]);
            }
            if (groupCallParticipant != null && zi.C1(groupCallParticipant.peer) != selfId && groupCallParticipant.source != 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(new RequestedParticipant(groupCallParticipant, iArr[i3]));
            }
        }
        if (arrayList != null) {
            this.tgVoip[0].onMediaDescriptionAvailable(j10, (RequestedParticipant[]) arrayList.toArray(new RequestedParticipant[0]));
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                RequestedParticipant requestedParticipant = (RequestedParticipant) arrayList.get(i10);
                if (requestedParticipant.participant.muted_by_you) {
                    this.tgVoip[0].setVolume(requestedParticipant.audioSsrc, 0.0d);
                } else {
                    this.tgVoip[0].setVolume(requestedParticipant.audioSsrc, t3.H(r0) / 10000.0d);
                }
            }
        }
    }

    private void callEnded() {
        if (r2.a) {
            a8.b("Call " + getCallID() + " ended");
        }
        this.isCallEnded = true;
        if (this.groupCall != null && (!this.playedConnectedSound || this.onDestroyRunnable != null)) {
            this.needPlayEndSound = false;
        }
        org.telegram.messenger.g0.h3(new q(this, 7));
        Utilities.e.c(new q(this, 8));
        Runnable runnable = this.connectingSoundRunnable;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.connectingSoundRunnable = null;
        }
        int i3 = 700;
        if (this.needPlayEndSound) {
            this.playingSound = true;
            if (this.groupCall == null) {
                Utilities.e.c(new q(this, 9));
            } else {
                Utilities.e.e(new q(this, 10), 100L);
                i3 = 500;
            }
            org.telegram.messenger.g0.i3(this.afterSoundRunnable, i3);
        }
        Runnable runnable2 = this.timeoutRunnable;
        if (runnable2 != null) {
            org.telegram.messenger.g0.r(runnable2);
            this.timeoutRunnable = null;
        }
        endConnectionServiceCall(this.needPlayEndSound ? i3 : 0L);
        stopSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callFailed() {
        NativeInstance nativeInstance = this.tgVoip[0];
        callFailed(nativeInstance != null ? nativeInstance.getLastError() : Instance.ERROR_UNKNOWN);
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
                org.telegram.messenger.g0.r(runnable);
                this.shortPollRunnable = null;
            }
        }
    }

    private void checkIsNear() {
        if (this.remoteVideoState == 2 || this.videoState[0] == 2) {
            checkIsNear(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkUpdateBluetoothHeadset() {
        BluetoothAdapter bluetoothAdapter;
        if (USE_CONNECTION_SERVICE || (bluetoothAdapter = this.btAdapter) == null || !bluetoothAdapter.isEnabled()) {
            return;
        }
        try {
            MediaRouter mediaRouter = (MediaRouter) getSystemService("media_router");
            AudioManager audioManager = (AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            int i3 = Build.VERSION.SDK_INT;
            int i10 = 0;
            if (i3 >= 31) {
                AudioDeviceInfo findBluetoothDevice = VoipAudioManager.get().findBluetoothDevice();
                if (findBluetoothDevice != null) {
                    this.currentBluetoothDeviceName = findBluetoothDevice.getProductName().toString();
                }
                updateBluetoothHeadsetState(findBluetoothDevice != null);
                ArrayList<StateListener> arrayList = this.stateListeners;
                int size = arrayList.size();
                while (i10 < size) {
                    StateListener stateListener = arrayList.get(i10);
                    i10++;
                    stateListener.onAudioSettingsChanged();
                }
                return;
            }
            if (i3 < 24) {
                updateBluetoothHeadsetState(this.btAdapter.getProfileConnectionState(1) == 2);
                ArrayList<StateListener> arrayList2 = this.stateListeners;
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    StateListener stateListener2 = arrayList2.get(i10);
                    i10++;
                    stateListener2.onAudioSettingsChanged();
                }
                return;
            }
            MediaRouter.RouteInfo selectedRoute = mediaRouter.getSelectedRoute(1);
            if (!nf.d("android.permission.BLUETOOTH_CONNECT") || selectedRoute.getDeviceType() != 3) {
                updateBluetoothHeadsetState(audioManager.isBluetoothA2dpOn());
                return;
            }
            updateBluetoothHeadsetState(this.btAdapter.getProfileConnectionState(1) == 2);
            ArrayList<StateListener> arrayList3 = this.stateListeners;
            int size3 = arrayList3.size();
            while (i10 < size3) {
                StateListener stateListener3 = arrayList3.get(i10);
                i10++;
                stateListener3.onAudioSettingsChanged();
            }
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    private void configureDeviceForCall() {
        if (r2.a) {
            p1.q(this.audioRouteToSet, new StringBuilder("configureDeviceForCall, route to set = "));
        }
        WebRtcAudioTrack.setAudioTrackUsageAttribute(hasRtmpStream() ? 1 : 2);
        WebRtcAudioTrack.setAudioStreamType(hasRtmpStream() ? TLObject.FLAG_31 : 0);
        this.needPlayEndSound = true;
        AudioManager audioManager = (AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (!USE_CONNECTION_SERVICE) {
            Utilities.e.c(new c0(this, audioManager, 1));
        }
        SensorManager sensorManager = (SensorManager) getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(8);
        if (defaultSensor != null) {
            try {
                this.proximityWakelock = ((PowerManager) getSystemService("power")).newWakeLock(32, "telegram-voip-prx");
                sensorManager.registerListener(this, defaultSensor, 3);
            } catch (Exception e10) {
                if (r2.a) {
                    a8.e("Error initializing proximity sensor", e10);
                }
            }
        }
    }

    private int convertDataSavingMode(int i3) {
        return i3 != 3 ? i3 : org.telegram.messenger.t0.t() ? 1 : 0;
    }

    public static String convertStreamToString(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return sb2.toString();
            }
            sb2.append(readLine);
            sb2.append("\n");
        }
    }

    private void createGroupInstance(int i3, boolean z10, boolean z11) {
        int i10;
        boolean z12;
        String str;
        int i11 = 0;
        if (z10) {
            this.mySource[i3] = 0;
            if (i3 == 0) {
                this.switchingAccount = z10;
            }
        }
        cancelGroupCheckShortPoll();
        int i12 = 1;
        if (i3 == 0) {
            this.wasConnected = false;
        } else if (!this.wasConnected) {
            this.reconnectScreenCapture = true;
            return;
        }
        if (this.tgVoip[i3] == null) {
            if (this.groupCall != null) {
                str = "" + this.groupCall.b.id;
            } else {
                TLRPC.InputGroupCall inputGroupCall = this.joinConference;
                if (inputGroupCall instanceof TLRPC.TL_inputGroupCallSlug) {
                    str = inputGroupCall.slug;
                } else if (inputGroupCall instanceof TLRPC.TL_inputGroupCall) {
                    str = "" + this.joinConference.id;
                } else {
                    str = "0";
                }
            }
            boolean[] zArr = {z11};
            boolean z13 = r2.a;
            String d = n1.d("voip_" + i3 + "_" + str);
            NativeInstance[] nativeInstanceArr = this.tgVoip;
            long j10 = this.captureDevice[i3];
            boolean z14 = i3 == 1;
            boolean z15 = i3 == 0 && az.I0;
            k2.y yVar = new k2.y(this, i3, zArr, 5);
            i10 = 1;
            int i13 = 5;
            nativeInstanceArr[i3] = NativeInstance.makeGroup(d, j10, z14, z15, yVar, new m0(this, i3, i11), new m0(this, i3, i12), new m0(this, i3, 2), new m0(this, i3, 3), new m0(this, i3, 4), this.conference != null);
            this.tgVoip[i3].setOnStateUpdatedListener(new m0(this, i3, i13));
            z12 = true;
        } else {
            i10 = 1;
            z12 = false;
        }
        this.tgVoip[i3].resetGroupInstance(!z12, false);
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall != null && conferenceCall.getCallId() != -1) {
            this.tgVoip[i3].setConferenceCallId(this.conference.getCallId());
        }
        if (this.captureDevice[i3] != 0) {
            this.destroyCaptureDevice[i3] = false;
        }
        if (i3 == 0) {
            dispatchStateChanged(i10);
        }
    }

    private NativeInstance.SsrcGroup[] createSsrcGroups(TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo) {
        if (tL_groupCallParticipantVideo.source_groups.isEmpty()) {
            return null;
        }
        int size = tL_groupCallParticipantVideo.source_groups.size();
        NativeInstance.SsrcGroup[] ssrcGroupArr = new NativeInstance.SsrcGroup[size];
        for (int i3 = 0; i3 < size; i3++) {
            ssrcGroupArr[i3] = new NativeInstance.SsrcGroup();
            TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i3);
            NativeInstance.SsrcGroup ssrcGroup = ssrcGroupArr[i3];
            ssrcGroup.semantics = tL_groupCallParticipantVideoSourceGroup.semantics;
            ssrcGroup.ssrcs = new int[tL_groupCallParticipantVideoSourceGroup.sources.size()];
            int i10 = 0;
            while (true) {
                int[] iArr = ssrcGroupArr[i3].ssrcs;
                if (i10 < iArr.length) {
                    iArr[i10] = tL_groupCallParticipantVideoSourceGroup.sources.get(i10).intValue();
                    i10++;
                }
            }
        }
        return ssrcGroupArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyConverting() {
        org.telegram.messenger.g0.r(this.destroyConvertingRunnable);
        if (this.convertingVoip == null) {
            return;
        }
        a8.e("destroyConverting!!", new Exception());
        this.callStartTime = 0L;
        bz e10 = bz.e(this.currentAccount);
        int statsNetworkType = getStatsNetworkType();
        int callDuration = ((int) (getCallDuration() / 1000)) % 5;
        int[] iArr = e10.n;
        iArr[statsNetworkType] = iArr[statsNetworkType] + callDuration;
        e10.m();
        onTgVoipPreStop();
        Instance.FinalState stop = this.convertingVoip.stop();
        updateTrafficStats(this.convertingVoip, stop.trafficStats);
        onTgVoipStop(stop);
        Instance.destroyInstance();
        this.convertingVoip = null;
        for (int i3 = 0; i3 < this.stateListeners.size(); i3++) {
            this.stateListeners.get(i3).onStateChanged(getCallState());
        }
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance != null) {
            nativeInstance.setMuteMicrophone(this.micMute);
        }
    }

    private void dispatchStateChanged(int i3) {
        CallConnection callConnection;
        if (r2.a) {
            a8.b("== Call " + getCallID() + " state changed to " + i3 + " ==");
        }
        this.currentState = i3;
        if (i3 == 3) {
            destroyConverting();
        }
        if (USE_CONNECTION_SERVICE && i3 == 3 && (callConnection = this.systemCallConnection) != null) {
            callConnection.setActive();
        }
        for (int i10 = 0; i10 < this.stateListeners.size(); i10++) {
            this.stateListeners.get(i10).onStateChanged(i3);
        }
    }

    private void endConnectionServiceCall(long j10) {
        if (USE_CONNECTION_SERVICE) {
            q qVar = new q(this, 15);
            if (j10 > 0) {
                org.telegram.messenger.g0.i3(qVar, j10);
            } else {
                qVar.run();
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
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    private NetworkInfo getActiveNetworkInfo() {
        return ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
    }

    private int getCurrentForegroundType() {
        return getCurrentForegroundType(this, this.gotMediaProjection);
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
                return type != 9 ? 0 : 7;
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap getRoundAvatarBitmap(Context context, int i3, TLObject tLObject) {
        TLRPC.ChatPhoto chatPhoto;
        Bitmap bitmap = null;
        try {
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        if (!(tLObject instanceof TLRPC.User)) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            if (chat != null && (chatPhoto = chat.photo) != null && chatPhoto.photo_small != null) {
                BitmapDrawable C = zb.D().C(chat.photo.photo_small);
                if (C != null) {
                    bitmap = C.getBitmap().copy(Bitmap.Config.ARGB_8888, true);
                } else {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inMutable = true;
                        w7.G(i3);
                        bitmap = BitmapFactory.decodeFile(w7.K(chat.photo.photo_small, null, true, true).toString(), options);
                    } catch (Throwable th3) {
                        a8.g(th3, true);
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
            BitmapDrawable C2 = zb.D().C(user.photo.photo_small);
            if (C2 != null) {
                bitmap = C2.getBitmap().copy(Bitmap.Config.ARGB_8888, true);
            } else {
                try {
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inMutable = true;
                    w7.G(i3);
                    bitmap = BitmapFactory.decodeFile(w7.K(user.photo.photo_small, null, true, true).toString(), options2);
                } catch (Throwable th4) {
                    a8.g(th4, true);
                }
            }
        }
        if (bitmap == null) {
            k6.T(context);
            u8 u8Var = tLObject instanceof TLRPC.User ? new u8(0, (TLRPC.User) tLObject) : new u8((TLRPC.Chat) tLObject);
            bitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(42.0f), Bitmap.Config.ARGB_8888);
            u8Var.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
            u8Var.draw(new Canvas(bitmap));
        }
        Canvas canvas2 = new Canvas(bitmap);
        Path path2 = new Path();
        path2.addCircle(bitmap.getWidth() / 2, bitmap.getHeight() / 2, bitmap.getWidth() / 2, Path.Direction.CW);
        path2.toggleInverseFillType();
        Paint paint2 = new Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas2.drawPath(path2, paint2);
        return bitmap;
        a8.g(th2, true);
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
        hs.f(this.currentAccount).b(this, hs.I2);
        ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0311 A[Catch: Exception -> 0x002a, TryCatch #1 {Exception -> 0x002a, blocks: (B:5:0x0014, B:7:0x0018, B:8:0x002d, B:10:0x003b, B:11:0x0046, B:12:0x006d, B:14:0x0076, B:15:0x0080, B:17:0x0086, B:33:0x0093, B:30:0x00a4, B:38:0x00aa, B:43:0x00ae, B:50:0x00c6, B:52:0x00f3, B:57:0x00ff, B:61:0x0109, B:64:0x014e, B:67:0x0184, B:69:0x0196, B:71:0x01d5, B:73:0x01e0, B:76:0x01e9, B:78:0x01f5, B:79:0x01ff, B:81:0x0205, B:85:0x0219, B:88:0x0236, B:89:0x0240, B:92:0x0262, B:95:0x026e, B:96:0x0279, B:98:0x027d, B:100:0x0281, B:102:0x0289, B:103:0x029e, B:104:0x02a4, B:106:0x0311, B:107:0x0314, B:109:0x031c, B:111:0x032c, B:117:0x014c, B:123:0x0041, B:20:0x0097), top: B:4:0x0014, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014c A[Catch: Exception -> 0x002a, TryCatch #1 {Exception -> 0x002a, blocks: (B:5:0x0014, B:7:0x0018, B:8:0x002d, B:10:0x003b, B:11:0x0046, B:12:0x006d, B:14:0x0076, B:15:0x0080, B:17:0x0086, B:33:0x0093, B:30:0x00a4, B:38:0x00aa, B:43:0x00ae, B:50:0x00c6, B:52:0x00f3, B:57:0x00ff, B:61:0x0109, B:64:0x014e, B:67:0x0184, B:69:0x0196, B:71:0x01d5, B:73:0x01e0, B:76:0x01e9, B:78:0x01f5, B:79:0x01ff, B:81:0x0205, B:85:0x0219, B:88:0x0236, B:89:0x0240, B:92:0x0262, B:95:0x026e, B:96:0x0279, B:98:0x027d, B:100:0x0281, B:102:0x0289, B:103:0x029e, B:104:0x02a4, B:106:0x0311, B:107:0x0314, B:109:0x031c, B:111:0x032c, B:117:0x014c, B:123:0x0041, B:20:0x0097), top: B:4:0x0014, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0196 A[Catch: Exception -> 0x002a, TryCatch #1 {Exception -> 0x002a, blocks: (B:5:0x0014, B:7:0x0018, B:8:0x002d, B:10:0x003b, B:11:0x0046, B:12:0x006d, B:14:0x0076, B:15:0x0080, B:17:0x0086, B:33:0x0093, B:30:0x00a4, B:38:0x00aa, B:43:0x00ae, B:50:0x00c6, B:52:0x00f3, B:57:0x00ff, B:61:0x0109, B:64:0x014e, B:67:0x0184, B:69:0x0196, B:71:0x01d5, B:73:0x01e0, B:76:0x01e9, B:78:0x01f5, B:79:0x01ff, B:81:0x0205, B:85:0x0219, B:88:0x0236, B:89:0x0240, B:92:0x0262, B:95:0x026e, B:96:0x0279, B:98:0x027d, B:100:0x0281, B:102:0x0289, B:103:0x029e, B:104:0x02a4, B:106:0x0311, B:107:0x0314, B:109:0x031c, B:111:0x032c, B:117:0x014c, B:123:0x0041, B:20:0x0097), top: B:4:0x0014, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f5 A[Catch: Exception -> 0x002a, TryCatch #1 {Exception -> 0x002a, blocks: (B:5:0x0014, B:7:0x0018, B:8:0x002d, B:10:0x003b, B:11:0x0046, B:12:0x006d, B:14:0x0076, B:15:0x0080, B:17:0x0086, B:33:0x0093, B:30:0x00a4, B:38:0x00aa, B:43:0x00ae, B:50:0x00c6, B:52:0x00f3, B:57:0x00ff, B:61:0x0109, B:64:0x014e, B:67:0x0184, B:69:0x0196, B:71:0x01d5, B:73:0x01e0, B:76:0x01e9, B:78:0x01f5, B:79:0x01ff, B:81:0x0205, B:85:0x0219, B:88:0x0236, B:89:0x0240, B:92:0x0262, B:95:0x026e, B:96:0x0279, B:98:0x027d, B:100:0x0281, B:102:0x0289, B:103:0x029e, B:104:0x02a4, B:106:0x0311, B:107:0x0314, B:109:0x031c, B:111:0x032c, B:117:0x014c, B:123:0x0041, B:20:0x0097), top: B:4:0x0014, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0236 A[Catch: Exception -> 0x002a, TryCatch #1 {Exception -> 0x002a, blocks: (B:5:0x0014, B:7:0x0018, B:8:0x002d, B:10:0x003b, B:11:0x0046, B:12:0x006d, B:14:0x0076, B:15:0x0080, B:17:0x0086, B:33:0x0093, B:30:0x00a4, B:38:0x00aa, B:43:0x00ae, B:50:0x00c6, B:52:0x00f3, B:57:0x00ff, B:61:0x0109, B:64:0x014e, B:67:0x0184, B:69:0x0196, B:71:0x01d5, B:73:0x01e0, B:76:0x01e9, B:78:0x01f5, B:79:0x01ff, B:81:0x0205, B:85:0x0219, B:88:0x0236, B:89:0x0240, B:92:0x0262, B:95:0x026e, B:96:0x0279, B:98:0x027d, B:100:0x0281, B:102:0x0289, B:103:0x029e, B:104:0x02a4, B:106:0x0311, B:107:0x0314, B:109:0x031c, B:111:0x032c, B:117:0x014c, B:123:0x0041, B:20:0x0097), top: B:4:0x0014, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x026c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027d A[Catch: Exception -> 0x002a, TryCatch #1 {Exception -> 0x002a, blocks: (B:5:0x0014, B:7:0x0018, B:8:0x002d, B:10:0x003b, B:11:0x0046, B:12:0x006d, B:14:0x0076, B:15:0x0080, B:17:0x0086, B:33:0x0093, B:30:0x00a4, B:38:0x00aa, B:43:0x00ae, B:50:0x00c6, B:52:0x00f3, B:57:0x00ff, B:61:0x0109, B:64:0x014e, B:67:0x0184, B:69:0x0196, B:71:0x01d5, B:73:0x01e0, B:76:0x01e9, B:78:0x01f5, B:79:0x01ff, B:81:0x0205, B:85:0x0219, B:88:0x0236, B:89:0x0240, B:92:0x0262, B:95:0x026e, B:96:0x0279, B:98:0x027d, B:100:0x0281, B:102:0x0289, B:103:0x029e, B:104:0x02a4, B:106:0x0311, B:107:0x0314, B:109:0x031c, B:111:0x032c, B:117:0x014c, B:123:0x0041, B:20:0x0097), top: B:4:0x0014, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void initiateActualEncryptedCall() {
        SharedPreferences sharedPreferences;
        HashSet hashSet;
        int i3;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        TLRPC.TL_dataJSON tL_dataJSON;
        int size;
        ArrayList arrayList;
        int i10;
        boolean z14;
        int i11;
        boolean z15;
        long j10;
        String str = "";
        Runnable runnable = this.timeoutRunnable;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.timeoutRunnable = null;
        }
        try {
            if (r2.a) {
                a8.b("InitCall: keyID=" + this.keyFingerprint);
            }
            sharedPreferences = hp.s1(this.currentAccount).d7;
            Set<String> stringSet = sharedPreferences.getStringSet("calls_access_hashes", null);
            hashSet = stringSet != null ? new HashSet(stringSet) : new HashSet();
            hashSet.add(this.privateCall.id + " " + this.privateCall.access_hash + " " + System.currentTimeMillis());
        } catch (Exception e10) {
            if (r2.a) {
            }
            callFailed();
            return;
        }
        while (true) {
            i3 = 2;
            if (hashSet.size() <= 20) {
                break;
            }
            Iterator it = hashSet.iterator();
            long j11 = Long.MAX_VALUE;
            String str2 = null;
            while (it.hasNext()) {
                String str3 = (String) it.next();
                String[] split = str3.split(" ");
                if (split.length < 2) {
                    it.remove();
                } else {
                    try {
                        long parseLong = Long.parseLong(split[2]);
                        if (parseLong < j11) {
                            str2 = str3;
                            j11 = parseLong;
                        }
                    } catch (Exception unused) {
                        it.remove();
                    }
                }
            }
            if (str2 != null) {
                hashSet.remove(str2);
            }
            if (r2.a) {
                a8.e("error starting call", e10);
            }
            callFailed();
            return;
        }
        sharedPreferences.edit().putStringSet("calls_access_hashes", hashSet).commit();
        int i12 = 0;
        try {
            z10 = AcousticEchoCanceler.isAvailable();
        } catch (Exception unused2) {
            z10 = false;
        }
        try {
            z11 = NoiseSuppressor.isAvailable();
        } catch (Exception unused3) {
            z11 = false;
        }
        SharedPreferences e12 = hp.e1();
        hp s12 = hp.s1(this.currentAccount);
        double d = s12.j3 / 1000.0d;
        double d10 = s12.k3 / 1000.0d;
        int convertDataSavingMode = convertDataSavingMode(e12.getInt("VoipDataSaving", n1.c()));
        Instance.ServerConfig globalServerConfig = Instance.getGlobalServerConfig();
        if (z10 && globalServerConfig.useSystemAec) {
            z12 = false;
            if (z11 && globalServerConfig.useSystemNs) {
                z13 = false;
                boolean z16 = r2.a;
                String d11 = n1.d("voip" + this.privateCall.id);
                String e11 = n1.e("" + this.privateCall.id);
                TL_phone.PhoneCall phoneCall = this.privateCall;
                boolean z17 = phoneCall.p2p_allowed;
                boolean z18 = globalServerConfig.enableStunMarking;
                int i13 = phoneCall.protocol.max_layer;
                tL_dataJSON = phoneCall.custom_parameters;
                if (tL_dataJSON == null) {
                    str = tL_dataJSON.data;
                }
                Instance.Config config = new Instance.Config(d, d10, convertDataSavingMode, z17, z12, z13, true, false, z18, d11, e11, i13, str);
                this.lastLogFilePath = d11;
                String absolutePath = new File(org.telegram.messenger.t0.b.getCacheDir(), "voip_persistent_state.json").getAbsolutePath();
                boolean z19 = e12.getBoolean("dbg_force_tcp_in_calls", false);
                int i14 = !z19 ? 3 : 2;
                size = this.privateCall.connections.size();
                Instance.Endpoint[] endpointArr = new Instance.Endpoint[size];
                arrayList = new ArrayList();
                i10 = 0;
                while (i10 < size) {
                    TLRPC.PhoneConnection phoneConnection = this.privateCall.connections.get(i10);
                    int i15 = i3;
                    int i16 = i12;
                    boolean z20 = z19;
                    endpointArr[i10] = new Instance.Endpoint(phoneConnection instanceof TLRPC.TL_phoneConnectionWebrtc, phoneConnection.id, phoneConnection.ip, phoneConnection.ipv6, phoneConnection.port, i14, phoneConnection.peer_tag, phoneConnection.turn, phoneConnection.stun, phoneConnection.username, phoneConnection.password, phoneConnection.tcp);
                    if (phoneConnection instanceof TLRPC.TL_phoneConnection) {
                        arrayList.add(Long.valueOf(((TLRPC.TL_phoneConnection) phoneConnection).id));
                    }
                    i10++;
                    i3 = i15;
                    z19 = z20;
                    i12 = i16;
                }
                z14 = z19;
                i11 = i12;
                int i17 = i3;
                if (!arrayList.isEmpty()) {
                    Collections.sort(arrayList);
                    HashMap hashMap = new HashMap();
                    int i18 = i11;
                    while (i18 < arrayList.size()) {
                        Long l10 = (Long) arrayList.get(i18);
                        i18++;
                        hashMap.put(l10, Integer.valueOf(i18));
                    }
                    for (int i19 = i11; i19 < size; i19++) {
                        Instance.Endpoint endpoint = endpointArr[i19];
                        endpoint.reflectorId = ((Integer) Map.-EL.getOrDefault(hashMap, Long.valueOf(endpoint.id), Integer.valueOf(i11))).intValue();
                    }
                }
                if (z14) {
                    org.telegram.messenger.g0.h3(new q(this, 18));
                }
                Instance.EncryptionKey encryptionKey = new Instance.EncryptionKey(this.authKey, this.isOutgoing);
                z15 = "2.7.7".compareTo(this.privateCall.protocol.library_versions.get(i11)) > 0 ? 1 : i11;
                j10 = this.captureDevice[i11];
                if (j10 != 0 && z15 == 0) {
                    NativeInstance.destroyVideoCapturer(j10);
                    this.captureDevice[i11] = 0;
                    this.videoState[i11] = i11;
                }
                if (!this.isOutgoing) {
                    if (this.videoCall && checkSelfPermission("android.permission.CAMERA") == 0) {
                        this.captureDevice[0] = NativeInstance.createVideoCapturer(this.localSink[0], this.isFrontFaceCamera ? 1 : 0);
                        this.videoState[0] = i17;
                    } else {
                        this.videoState[0] = 0;
                    }
                }
                this.tgVoip[0] = Instance.makeInstance(this.privateCall.protocol.library_versions.get(0), config, absolutePath, endpointArr, null, getNetworkType(), encryptionKey, this.remoteSink[0], this.captureDevice[0], new g0(this));
                this.tgVoip[0].setOnStateUpdatedListener(new g0(this));
                this.tgVoip[0].setOnSignalBarsUpdatedListener(new g0(this));
                this.tgVoip[0].setOnSignalDataListener(new g0(this));
                this.tgVoip[0].setOnRemoteMediaStateUpdatedListener(new g0(this));
                this.tgVoip[0].setMuteMicrophone(this.micMute);
                if (z15 != this.isVideoAvailable) {
                    this.isVideoAvailable = z15;
                    for (int i20 = 0; i20 < this.stateListeners.size(); i20++) {
                        this.stateListeners.get(i20).onVideoAvailableChange(this.isVideoAvailable);
                    }
                }
                this.destroyCaptureDevice[0] = false;
                org.telegram.messenger.g0.i3(new Runnable() { // from class: org.telegram.messenger.voip.VoIPService.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VoIPService.this.tgVoip[0] != null) {
                            VoIPService voIPService = VoIPService.this;
                            voIPService.updateTrafficStats(voIPService.tgVoip[0], null);
                            org.telegram.messenger.g0.i3(this, 5000L);
                        }
                    }
                }, 5000L);
            }
            z13 = true;
            boolean z162 = r2.a;
            String d112 = n1.d("voip" + this.privateCall.id);
            String e112 = n1.e("" + this.privateCall.id);
            TL_phone.PhoneCall phoneCall2 = this.privateCall;
            boolean z172 = phoneCall2.p2p_allowed;
            boolean z182 = globalServerConfig.enableStunMarking;
            int i132 = phoneCall2.protocol.max_layer;
            tL_dataJSON = phoneCall2.custom_parameters;
            if (tL_dataJSON == null) {
            }
            Instance.Config config2 = new Instance.Config(d, d10, convertDataSavingMode, z172, z12, z13, true, false, z182, d112, e112, i132, str);
            this.lastLogFilePath = d112;
            String absolutePath2 = new File(org.telegram.messenger.t0.b.getCacheDir(), "voip_persistent_state.json").getAbsolutePath();
            boolean z192 = e12.getBoolean("dbg_force_tcp_in_calls", false);
            if (!z192) {
            }
            size = this.privateCall.connections.size();
            Instance.Endpoint[] endpointArr2 = new Instance.Endpoint[size];
            arrayList = new ArrayList();
            i10 = 0;
            while (i10 < size) {
            }
            z14 = z192;
            i11 = i12;
            int i172 = i3;
            if (!arrayList.isEmpty()) {
            }
            if (z14) {
            }
            Instance.EncryptionKey encryptionKey2 = new Instance.EncryptionKey(this.authKey, this.isOutgoing);
            if ("2.7.7".compareTo(this.privateCall.protocol.library_versions.get(i11)) > 0) {
            }
            j10 = this.captureDevice[i11];
            if (j10 != 0) {
                NativeInstance.destroyVideoCapturer(j10);
                this.captureDevice[i11] = 0;
                this.videoState[i11] = i11;
            }
            if (!this.isOutgoing) {
            }
            this.tgVoip[0] = Instance.makeInstance(this.privateCall.protocol.library_versions.get(0), config2, absolutePath2, endpointArr2, null, getNetworkType(), encryptionKey2, this.remoteSink[0], this.captureDevice[0], new g0(this));
            this.tgVoip[0].setOnStateUpdatedListener(new g0(this));
            this.tgVoip[0].setOnSignalBarsUpdatedListener(new g0(this));
            this.tgVoip[0].setOnSignalDataListener(new g0(this));
            this.tgVoip[0].setOnRemoteMediaStateUpdatedListener(new g0(this));
            this.tgVoip[0].setMuteMicrophone(this.micMute);
            if (z15 != this.isVideoAvailable) {
            }
            this.destroyCaptureDevice[0] = false;
            org.telegram.messenger.g0.i3(new Runnable() { // from class: org.telegram.messenger.voip.VoIPService.8
                @Override // java.lang.Runnable
                public void run() {
                    if (VoIPService.this.tgVoip[0] != null) {
                        VoIPService voIPService = VoIPService.this;
                        voIPService.updateTrafficStats(voIPService.tgVoip[0], null);
                        org.telegram.messenger.g0.i3(this, 5000L);
                    }
                }
            }, 5000L);
        }
        z12 = true;
        if (z11) {
            z13 = false;
            boolean z1622 = r2.a;
            String d1122 = n1.d("voip" + this.privateCall.id);
            String e1122 = n1.e("" + this.privateCall.id);
            TL_phone.PhoneCall phoneCall22 = this.privateCall;
            boolean z1722 = phoneCall22.p2p_allowed;
            boolean z1822 = globalServerConfig.enableStunMarking;
            int i1322 = phoneCall22.protocol.max_layer;
            tL_dataJSON = phoneCall22.custom_parameters;
            if (tL_dataJSON == null) {
            }
            Instance.Config config22 = new Instance.Config(d, d10, convertDataSavingMode, z1722, z12, z13, true, false, z1822, d1122, e1122, i1322, str);
            this.lastLogFilePath = d1122;
            String absolutePath22 = new File(org.telegram.messenger.t0.b.getCacheDir(), "voip_persistent_state.json").getAbsolutePath();
            boolean z1922 = e12.getBoolean("dbg_force_tcp_in_calls", false);
            if (!z1922) {
            }
            size = this.privateCall.connections.size();
            Instance.Endpoint[] endpointArr22 = new Instance.Endpoint[size];
            arrayList = new ArrayList();
            i10 = 0;
            while (i10 < size) {
            }
            z14 = z1922;
            i11 = i12;
            int i1722 = i3;
            if (!arrayList.isEmpty()) {
            }
            if (z14) {
            }
            Instance.EncryptionKey encryptionKey22 = new Instance.EncryptionKey(this.authKey, this.isOutgoing);
            if ("2.7.7".compareTo(this.privateCall.protocol.library_versions.get(i11)) > 0) {
            }
            j10 = this.captureDevice[i11];
            if (j10 != 0) {
            }
            if (!this.isOutgoing) {
            }
            this.tgVoip[0] = Instance.makeInstance(this.privateCall.protocol.library_versions.get(0), config22, absolutePath22, endpointArr22, null, getNetworkType(), encryptionKey22, this.remoteSink[0], this.captureDevice[0], new g0(this));
            this.tgVoip[0].setOnStateUpdatedListener(new g0(this));
            this.tgVoip[0].setOnSignalBarsUpdatedListener(new g0(this));
            this.tgVoip[0].setOnSignalDataListener(new g0(this));
            this.tgVoip[0].setOnRemoteMediaStateUpdatedListener(new g0(this));
            this.tgVoip[0].setMuteMicrophone(this.micMute);
            if (z15 != this.isVideoAvailable) {
            }
            this.destroyCaptureDevice[0] = false;
            org.telegram.messenger.g0.i3(new Runnable() { // from class: org.telegram.messenger.voip.VoIPService.8
                @Override // java.lang.Runnable
                public void run() {
                    if (VoIPService.this.tgVoip[0] != null) {
                        VoIPService voIPService = VoIPService.this;
                        voIPService.updateTrafficStats(voIPService.tgVoip[0], null);
                        org.telegram.messenger.g0.i3(this, 5000L);
                    }
                }
            }, 5000L);
        }
        z13 = true;
        boolean z16222 = r2.a;
        String d11222 = n1.d("voip" + this.privateCall.id);
        String e11222 = n1.e("" + this.privateCall.id);
        TL_phone.PhoneCall phoneCall222 = this.privateCall;
        boolean z17222 = phoneCall222.p2p_allowed;
        boolean z18222 = globalServerConfig.enableStunMarking;
        int i13222 = phoneCall222.protocol.max_layer;
        tL_dataJSON = phoneCall222.custom_parameters;
        if (tL_dataJSON == null) {
        }
        Instance.Config config222 = new Instance.Config(d, d10, convertDataSavingMode, z17222, z12, z13, true, false, z18222, d11222, e11222, i13222, str);
        this.lastLogFilePath = d11222;
        String absolutePath222 = new File(org.telegram.messenger.t0.b.getCacheDir(), "voip_persistent_state.json").getAbsolutePath();
        boolean z19222 = e12.getBoolean("dbg_force_tcp_in_calls", false);
        if (!z19222) {
        }
        size = this.privateCall.connections.size();
        Instance.Endpoint[] endpointArr222 = new Instance.Endpoint[size];
        arrayList = new ArrayList();
        i10 = 0;
        while (i10 < size) {
        }
        z14 = z19222;
        i11 = i12;
        int i17222 = i3;
        if (!arrayList.isEmpty()) {
        }
        if (z14) {
        }
        Instance.EncryptionKey encryptionKey222 = new Instance.EncryptionKey(this.authKey, this.isOutgoing);
        if ("2.7.7".compareTo(this.privateCall.protocol.library_versions.get(i11)) > 0) {
        }
        j10 = this.captureDevice[i11];
        if (j10 != 0) {
        }
        if (!this.isOutgoing) {
        }
        this.tgVoip[0] = Instance.makeInstance(this.privateCall.protocol.library_versions.get(0), config222, absolutePath222, endpointArr222, null, getNetworkType(), encryptionKey222, this.remoteSink[0], this.captureDevice[0], new g0(this));
        this.tgVoip[0].setOnStateUpdatedListener(new g0(this));
        this.tgVoip[0].setOnSignalBarsUpdatedListener(new g0(this));
        this.tgVoip[0].setOnSignalDataListener(new g0(this));
        this.tgVoip[0].setOnRemoteMediaStateUpdatedListener(new g0(this));
        this.tgVoip[0].setMuteMicrophone(this.micMute);
        if (z15 != this.isVideoAvailable) {
        }
        this.destroyCaptureDevice[0] = false;
        org.telegram.messenger.g0.i3(new Runnable() { // from class: org.telegram.messenger.voip.VoIPService.8
            @Override // java.lang.Runnable
            public void run() {
                if (VoIPService.this.tgVoip[0] != null) {
                    VoIPService voIPService = VoIPService.this;
                    voIPService.updateTrafficStats(voIPService.tgVoip[0], null);
                    org.telegram.messenger.g0.i3(this, 5000L);
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
        int i3 = this.currentState;
        return i3 == 11 || i3 == 4;
    }

    private boolean isRinging() {
        return this.currentState == 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$acceptIncomingCall$100() {
        hs.e().k(hs.v2, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$acceptIncomingCall$101(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            if (r2.a) {
                a8.d("Error on phone.acceptCall: " + tL_error);
            }
            callFailed();
            return;
        }
        if (r2.a) {
            a8.l("accept call ok! " + tLObject);
        }
        TL_phone.PhoneCall phoneCall = ((TL_phone.TL_phone_phoneCall) tLObject).phone_call;
        this.privateCall = phoneCall;
        if (phoneCall instanceof TL_phone.TL_phoneCallDiscarded) {
            onCallUpdated(phoneCall);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$acceptIncomingCall$102(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new z(2, this, tLObject, tL_error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$acceptIncomingCall$103(qr qrVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            callFailed();
            return;
        }
        TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
        if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
            byte[] bArr = messages_dhconfig.p;
            int i3 = messages_dhconfig.g;
            Pattern pattern = Utilities.a;
            if (!ConnectionsManager.native_isGoodPrime(bArr, i3)) {
                if (r2.a) {
                    a8.d("stopping VoIP service, bad prime");
                }
                callFailed();
                return;
            }
            byte[] bArr2 = messages_dhconfig.p;
            qrVar.H();
            qrVar.y = bArr2;
            int i10 = messages_dhconfig.g;
            qrVar.H();
            qrVar.E = i10;
            int i11 = messages_dhconfig.version;
            qrVar.H();
            qrVar.x = i11;
            qr a02 = qr.a0(this.currentAccount);
            qrVar.H();
            int i12 = qrVar.x;
            qrVar.H();
            int i13 = qrVar.E;
            qrVar.H();
            a02.a.c(new k2.a0(a02, i12, i13, qrVar.y, 7));
        }
        byte[] bArr3 = new byte[256];
        for (int i14 = 0; i14 < 256; i14++) {
            bArr3[i14] = (byte) (((byte) (Utilities.b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i14]);
        }
        if (this.privateCall == null) {
            if (r2.a) {
                a8.d("call is null");
            }
            callFailed();
            return;
        }
        this.a_or_b = bArr3;
        qrVar.H();
        BigInteger valueOf = BigInteger.valueOf(qrVar.E);
        qrVar.H();
        BigInteger modPow = valueOf.modPow(new BigInteger(1, bArr3), new BigInteger(1, qrVar.y));
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(acceptcall, new s(this, 8), 65536);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$acknowledgeCall$12(TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        if (sharedInstance == null) {
            return;
        }
        if (r2.a) {
            a8.l("receivedCall response = " + tLObject);
        }
        if (tL_error != null) {
            if (r2.a) {
                a8.d("error on receivedCall: " + tL_error);
            }
            stopSelf();
            return;
        }
        if (USE_CONNECTION_SERVICE) {
            g5 r5 = g5.r(this.currentAccount);
            TLRPC.User user = this.user;
            r5.g(user.id, user.first_name, user.last_name);
            ((TelecomManager) getSystemService("telecom")).addNewIncomingCall(addAccountToTelecomManager(), f1.k(1, "call_type"));
        }
        if (z10) {
            startRinging();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$acknowledgeCall$13(boolean z10, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new r0(this, tLObject, tL_error, z10, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callEnded$123() {
        dispatchStateChanged(11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callEnded$124() {
        int i3 = this.spPlayId;
        if (i3 != 0) {
            this.soundPool.stop(i3);
            this.spPlayId = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callEnded$125() {
        this.soundPool.play(this.spEndId, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callEnded$126() {
        this.soundPool.play(this.spVoiceChatEndId, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$callFailed$114(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (r2.a) {
                a8.d("error on phone.discardCall: " + tL_error);
                return;
            }
            return;
        }
        if (r2.a) {
            a8.b("phone.discardCall " + tLObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callFailed$115() {
        dispatchStateChanged(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$callFailed$116() {
        this.soundPool.play(this.spFailedID, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$configureDeviceForCall$110() {
        if (MediaController.B().H()) {
            return;
        }
        MediaController.B().R(MediaController.B().v0, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$configureDeviceForCall$111(AudioManager audioManager) {
        this.hasAudioFocus = audioManager.requestAudioFocus(this, 0, 2) == 1;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if (isBluetoothHeadsetConnected() && hasEarpiece()) {
            int i3 = this.audioRouteToSet;
            if (i3 == 0) {
                voipAudioManager.setBluetoothOn(false);
                voipAudioManager.setSpeakerphoneOn(false);
            } else if (i3 == 1) {
                voipAudioManager.setBluetoothOn(false);
                voipAudioManager.setSpeakerphoneOn(true);
            } else if (i3 == 2) {
                if (this.bluetoothScoActive) {
                    voipAudioManager.setBluetoothOn(true);
                    voipAudioManager.setSpeakerphoneOn(false);
                } else {
                    this.needSwitchToBluetoothAfterScoActivates = true;
                    try {
                        voipAudioManager.startBluetooth();
                    } catch (Throwable th2) {
                        a8.g(th2, true);
                    }
                }
            }
        } else if (isBluetoothHeadsetConnected()) {
            voipAudioManager.setBluetoothOn(this.speakerphoneStateToSet);
        } else {
            voipAudioManager.setSpeakerphoneOn(this.speakerphoneStateToSet);
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
        updateOutputGainControlState();
        this.audioConfigured = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$configureDeviceForCall$112(AudioManager audioManager) {
        try {
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (!hasRtmpStream()) {
            audioManager.setMode(3);
            org.telegram.messenger.g0.h3(new c0(this, audioManager, 0));
        } else {
            audioManager.setMode(0);
            VoipAudioManager.get().setBluetoothOn(false);
            org.telegram.messenger.g0.h3(new i(4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$convertToConferenceCall$30() {
        startConferenceGroupCall(true, 0, null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createGroupInstance$66(int i3, boolean[] zArr, int i10, String str) {
        if (i3 != 0) {
            startScreenCapture(i10, str);
            return;
        }
        if (this.conference != null) {
            startConferenceGroupCall(false, i10, str, !zArr[0]);
        } else {
            startGroupCall(i10, str, true);
        }
        zArr[0] = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$createGroupInstance$68(int i3, int[] iArr, float[] fArr, boolean[] zArr) {
        r3 r3Var;
        boolean z10;
        int i10;
        int i11;
        TLRPC.GroupCallParticipant groupCallParticipant;
        long j10;
        long j11;
        boolean z11;
        if (sharedInstance == null || (r3Var = this.groupCall) == null || i3 != 0) {
            return;
        }
        p3 p3Var = r3Var.Q;
        a0.h hVar = r3Var.P;
        int currentTime = ConnectionsManager.getInstance(r3Var.C.a).getCurrentTime();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long uptimeMillis = SystemClock.uptimeMillis();
        int i12 = 1;
        int i13 = 0;
        hs.f(r3Var.C.a).k(hs.B2, Long.valueOf(elapsedRealtime));
        boolean z12 = false;
        boolean z13 = false;
        ArrayList arrayList = null;
        while (true) {
            z10 = z12;
            if (i13 >= iArr.length) {
                break;
            }
            int i14 = iArr[i13];
            if (i14 == 0) {
                i11 = i13;
                groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(r3Var.h());
            } else {
                i11 = i13;
                groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.p.get(i14);
            }
            if (groupCallParticipant != null) {
                boolean z14 = zArr[i11];
                groupCallParticipant.hasVoice = z14;
                z11 = z13;
                if (z14 || elapsedRealtime - groupCallParticipant.lastVoiceUpdateTime > 500) {
                    groupCallParticipant.hasVoiceDelayed = z14;
                    groupCallParticipant.lastVoiceUpdateTime = elapsedRealtime;
                }
                long C1 = zi.C1(groupCallParticipant.peer);
                float f10 = fArr[i11];
                j10 = elapsedRealtime;
                if (f10 > 0.1f) {
                    if (zArr[i11] && groupCallParticipant.lastTypingDate + 1 < currentTime) {
                        if (j10 != groupCallParticipant.lastVisibleDate) {
                            groupCallParticipant.active_date = currentTime;
                        }
                        groupCallParticipant.lastTypingDate = currentTime;
                        z10 = true;
                    }
                    groupCallParticipant.lastSpeakTime = uptimeMillis;
                    groupCallParticipant.amplitude = f10;
                    if (hVar.g(null, C1) == null) {
                        if (C1 > 0) {
                            TLRPC.User a22 = hp.s1(r3Var.C.a).a2(Long.valueOf(C1));
                            StringBuilder t10 = a1.g.t(C1, "add to current speaking ", " ");
                            t10.append(a22 == null ? null : a22.first_name);
                            Log.d("GroupCall", t10.toString());
                            j11 = uptimeMillis;
                        } else {
                            j11 = uptimeMillis;
                            TLRPC.Chat M0 = hp.s1(r3Var.C.a).M0(Long.valueOf(-C1));
                            StringBuilder t11 = a1.g.t(C1, "add to current speaking ", " ");
                            t11.append(M0 == null ? null : M0.title);
                            Log.d("GroupCall", t11.toString());
                        }
                        hVar.k(groupCallParticipant, C1);
                        z11 = true;
                    } else {
                        j11 = uptimeMillis;
                    }
                } else {
                    j11 = uptimeMillis;
                    if (j11 - groupCallParticipant.lastSpeakTime >= 500 && hVar.g(null, C1) != null) {
                        hVar.l(C1);
                        if (C1 > 0) {
                            TLRPC.User a23 = hp.s1(r3Var.C.a).a2(Long.valueOf(C1));
                            StringBuilder t12 = a1.g.t(C1, "remove from speaking ", " ");
                            t12.append(a23 == null ? null : a23.first_name);
                            Log.d("GroupCall", t12.toString());
                        } else {
                            TLRPC.Chat M02 = hp.s1(r3Var.C.a).M0(Long.valueOf(-C1));
                            StringBuilder t13 = a1.g.t(C1, "remove from speaking ", " ");
                            t13.append(M02 == null ? null : M02.title);
                            Log.d("GroupCall", t13.toString());
                        }
                        z11 = true;
                    }
                    groupCallParticipant.amplitude = 0.0f;
                }
            } else {
                j10 = elapsedRealtime;
                j11 = uptimeMillis;
                z11 = z13;
                ArrayList arrayList2 = arrayList;
                if (iArr[i11] != 0) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Long.valueOf(iArr[i11]));
                    arrayList = arrayList2;
                }
            }
            z12 = z10;
            z13 = z11;
            i13 = i11 + 1;
            elapsedRealtime = j10;
            uptimeMillis = j11;
        }
        boolean z15 = z13;
        ArrayList arrayList3 = arrayList;
        if (arrayList3 != null) {
            r3Var.l(arrayList3, false, null);
        }
        if (z10) {
            r3Var.z();
            hs.f(r3Var.C.a).k(hs.w2, Long.valueOf(r3Var.c), Long.valueOf(r3Var.b.id), Boolean.FALSE);
        }
        if (z15) {
            if (hVar.m() > 0) {
                org.telegram.messenger.g0.r(p3Var);
                org.telegram.messenger.g0.i3(p3Var, 550L);
            }
            hs.f(r3Var.C.a).k(hs.y2, Long.valueOf(r3Var.c), Long.valueOf(r3Var.b.id), Boolean.FALSE);
        }
        float f11 = 0.0f;
        boolean z16 = false;
        int i15 = 0;
        while (i15 < iArr.length) {
            if (iArr[i15] == 0) {
                if (this.chat == null || this.lastTypingTimeSend >= SystemClock.uptimeMillis() - 5000 || fArr[i15] <= 0.1f || !zArr[i15]) {
                    i10 = i12;
                } else {
                    this.lastTypingTimeSend = SystemClock.uptimeMillis();
                    TLRPC.TL_messages_setTyping tL_messages_setTyping = new TLRPC.TL_messages_setTyping();
                    tL_messages_setTyping.action = new TLRPC.TL_speakingInGroupCallAction();
                    tL_messages_setTyping.peer = hp.l1(this.chat);
                    i10 = i12;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_setTyping, new y(i10));
                }
                hs e10 = hs.e();
                Object[] objArr = new Object[i10];
                objArr[0] = Float.valueOf(fArr[i15]);
                e10.k(hs.N4, objArr);
            } else {
                f11 = Math.max(f11, fArr[i15]);
                z16 = true;
            }
            i15++;
            i12 = 1;
        }
        if (z16) {
            hs.e().k(hs.O4, Float.valueOf(f11));
            NativeInstance.AudioLevelsCallback audioLevelsCallback2 = audioLevelsCallback;
            if (audioLevelsCallback2 != null) {
                audioLevelsCallback2.run(iArr, fArr, zArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createGroupInstance$69(long j10, int[] iArr, ArrayList arrayList) {
        if (sharedInstance == null || this.groupCall == null) {
            return;
        }
        broadcastUnknownParticipants(j10, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$createGroupInstance$70(int i3, long j10, int[] iArr) {
        r3 r3Var;
        if (sharedInstance == null || (r3Var = this.groupCall) == null || i3 != 0) {
            return;
        }
        ci.i iVar = new ci.i(this, j10, iArr, 3);
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (r3Var.p.get(iArr[i10]) == null && r3Var.q.get(iArr[i10]) == null && r3Var.r.get(iArr[i10]) == null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(Long.valueOf(iArr[i10]));
            }
        }
        if (arrayList != null) {
            r3Var.l(arrayList, false, iVar);
        } else {
            ((VoIPService) iVar.c).lambda$createGroupInstance$69(iVar.b, (int[]) iVar.d, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createGroupInstance$71(String str) {
        this.currentStreamRequestTimestamp.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createGroupInstance$72(int i3) {
        createGroupInstance(i3, false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createGroupInstance$73(String str, int i3, long j10, int i10, int i11, TLObject tLObject, TLRPC.TL_error tL_error, long j11) {
        org.telegram.messenger.g0.h3(new m2.s(28, this, str));
        NativeInstance nativeInstance = this.tgVoip[i3];
        if (nativeInstance == null) {
            return;
        }
        if (tLObject != null) {
            NativeByteBuffer nativeByteBuffer = ((TLRPC.TL_upload_file) tLObject).bytes;
            nativeInstance.onStreamPartAvailable(j10, nativeByteBuffer.buffer, nativeByteBuffer.limit(), j11, i10, i11);
        } else if ("GROUPCALL_JOIN_MISSING".equals(tL_error.text)) {
            org.telegram.messenger.g0.h3(new x(this, i3, 4));
        } else {
            this.tgVoip[i3].onStreamPartAvailable(j10, null, ("TIME_TOO_BIG".equals(tL_error.text) || tL_error.text.startsWith("FLOOD_WAIT")) ? 0 : -1, j11, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createGroupInstance$74(String str, int i3) {
        this.currentStreamRequestTimestamp.put(str, Integer.valueOf(i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$createGroupInstance$75(final int i3, final long j10, long j11, final int i10, final int i11) {
        String str;
        if (i3 != 0) {
            return;
        }
        TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
        tL_upload_getFile.limit = 131072;
        TLRPC.TL_inputGroupCallStream tL_inputGroupCallStream = new TLRPC.TL_inputGroupCallStream();
        r3 r3Var = this.groupCall;
        tL_inputGroupCallStream.call = r3Var.g(r3Var.a);
        tL_inputGroupCallStream.time_ms = j10;
        if (j11 == 500) {
            tL_inputGroupCallStream.scale = 1;
        }
        if (i10 != 0) {
            tL_inputGroupCallStream.flags |= 1;
            tL_inputGroupCallStream.video_channel = i10;
            tL_inputGroupCallStream.video_quality = i11;
        }
        tL_upload_getFile.location = tL_inputGroupCallStream;
        if (i10 == 0) {
            str = a1.g.p(j10, "");
        } else {
            str = i10 + "_" + j10 + "_" + i11;
        }
        final String str2 = str;
        org.telegram.messenger.g0.h3(new e3(this, str2, ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.currentAccount).a).sendRequest(tL_upload_getFile, new RequestDelegateTimestamp() { // from class: org.telegram.messenger.voip.d0
            @Override // org.telegram.tgnet.RequestDelegateTimestamp
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j12) {
                VoIPService.this.lambda$createGroupInstance$73(str2, i3, j10, i10, i11, tLObject, tL_error, j12);
            }
        }, 65536, 2, this.groupCall.b.stream_dc_id), 25));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$createGroupInstance$76(int i3, long j10, int i10) {
        String str;
        if (i3 == 0) {
            str = a1.g.p(j10, "");
        } else {
            str = i3 + "_" + j10 + "_" + i10;
        }
        Integer num = this.currentStreamRequestTimestamp.get(str);
        if (num != null) {
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.currentAccount).a).cancelRequest(num.intValue(), true);
            this.currentStreamRequestTimestamp.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createGroupInstance$77(int i3, long j10, long j11, int i10, int i11) {
        if (i3 != 0) {
            return;
        }
        org.telegram.messenger.g0.h3(new d1(i10, i11, 3, j10, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createGroupInstance$78(int i3, long j10, TLObject tLObject, TLRPC.TL_error tL_error, long j11) {
        if (tL_error == null) {
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            r7 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            r3 r3Var = this.groupCall;
            if (!r3Var.B) {
                r3Var.f(groupcallstreamchannels.channels);
                this.groupCall.B = true;
            }
        }
        NativeInstance nativeInstance = this.tgVoip[i3];
        if (nativeInstance != null) {
            nativeInstance.onRequestTimeComplete(j10, r7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$createGroupInstance$79(int i3, long j10) {
        TLRPC.GroupCall groupCall;
        r3 r3Var = this.groupCall;
        if (r3Var == null || (groupCall = r3Var.b) == null || !groupCall.rtmp_stream) {
            NativeInstance nativeInstance = this.tgVoip[i3];
            if (nativeInstance != null) {
                nativeInstance.onRequestTimeComplete(j10, ConnectionsManager.getInstance(this.currentAccount).getCurrentTimeMillis());
                return;
            }
            return;
        }
        TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
        r3 r3Var2 = this.groupCall;
        getgroupcallstreamchannels.call = r3Var2.g(r3Var2.a);
        r3 r3Var3 = this.groupCall;
        if (r3Var3 != null && r3Var3.b != null && this.tgVoip[i3] != null) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamchannels, new b4.o(this, i3, j10, 4), 65536, 2, this.groupCall.b.stream_dc_id);
            return;
        }
        NativeInstance nativeInstance2 = this.tgVoip[i3];
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(j10, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$declineIncomingCall$104() {
        if (this.currentState == 10) {
            callEnded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$declineIncomingCall$105(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (r2.a) {
                a8.d("error on phone.discardCall: " + tL_error);
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_updates) {
            hp.s1(this.currentAccount).O3((TLRPC.TL_updates) tLObject, false);
        }
        if (r2.a) {
            a8.b("phone.discardCall " + tLObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$editCallMember$90(int i3, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            hp.s1(org.telegram.messenger.c.a(i3).a).O3((TLRPC.Updates) tLObject, false);
        } else if (tL_error != null && "GROUPCALL_VIDEO_TOO_MUCH".equals(tL_error.text)) {
            this.groupCall.s();
        }
        if (runnable != null) {
            org.telegram.messenger.g0.h3(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$endConnectionServiceCall$127() {
        CallConnection callConnection = this.systemCallConnection;
        if (callConnection != null) {
            int i3 = this.callDiscardReason;
            if (i3 == 1) {
                callConnection.setDisconnected(new DisconnectCause(this.isOutgoing ? 2 : 6));
            } else if (i3 != 2) {
                if (i3 == 3) {
                    callConnection.setDisconnected(new DisconnectCause(this.isOutgoing ? 4 : 5));
                } else if (i3 != 4) {
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
    public /* synthetic */ void lambda$getConnectionAndStartCall$106() {
        this.delayedStartOutgoingCall = null;
        startOutgoingCall();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hangUp$4(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_updates) {
            hp.s1(this.currentAccount).O3((TLRPC.TL_updates) tLObject, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hangUp$5(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_updates) {
            hp.s1(this.currentAccount).O3((TLRPC.TL_updates) tLObject, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initiateActualEncryptedCall$84() {
        Toast.makeText(this, "This call uses TCP which will degrade its quality.", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initiateActualEncryptedCall$85(int[] iArr, float[] fArr, boolean[] zArr) {
        if (sharedInstance == null || this.privateCall == null) {
            return;
        }
        hs.e().k(hs.N4, Float.valueOf(fArr[0]));
        hs.e().k(hs.O4, Float.valueOf(fArr[1]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initiateActualEncryptedCall$86(int i3, int i10) {
        this.remoteAudioState = i3;
        this.remoteVideoState = i10;
        checkIsNear();
        for (int i11 = 0; i11 < this.stateListeners.size(); i11++) {
            this.stateListeners.get(i11).onMediaStateUpdated(i3, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initiateActualEncryptedCall$87(int i3, int i10) {
        org.telegram.messenger.g0.h3(new k2.u(this, i3, i10, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadResources$109() {
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
    public /* synthetic */ void lambda$onCallUpdated$16() {
        this.soundPool.play(this.spBusyId, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCallUpdated$17() {
        int i3 = this.spPlayId;
        if (i3 != 0) {
            this.soundPool.stop(i3);
        }
        this.spPlayId = this.soundPool.play(this.spRingbackID, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCallUpdated$18() {
        this.timeoutRunnable = null;
        declineIncomingCall(3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnectionStateChanged$117() {
        int i3 = this.spPlayId;
        if (i3 != 0) {
            this.soundPool.stop(i3);
            this.spPlayId = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnectionStateChanged$118() {
        int i3 = this.spPlayId;
        if (i3 != 0) {
            this.soundPool.stop(i3);
        }
        this.spPlayId = this.soundPool.play(this.groupCall != null ? this.spVoiceChatConnecting : this.spConnectingId, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onConnectionStateChanged$119(int i3) {
        if (this.convertingVoip != null) {
            return;
        }
        if (i3 == 3 && this.callStartTime == 0) {
            this.callStartTime = SystemClock.elapsedRealtime();
        }
        if (i3 == 4) {
            callFailed();
            return;
        }
        if (i3 == 3) {
            Runnable runnable = this.connectingSoundRunnable;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                this.connectingSoundRunnable = null;
            }
            Utilities.e.c(new q(this, 28));
            if (this.groupCall == null && !this.wasEstablished) {
                this.wasEstablished = true;
                if (!this.isProximityNear && !this.privateCall.video) {
                    try {
                        LaunchActivity.Q().getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                org.telegram.messenger.g0.i3(new Runnable() { // from class: org.telegram.messenger.voip.VoIPService.11
                    @Override // java.lang.Runnable
                    public void run() {
                        if (VoIPService.this.tgVoip[0] != null) {
                            bz e10 = bz.e(VoIPService.this.currentAccount);
                            int statsNetworkType = VoIPService.this.getStatsNetworkType();
                            int[] iArr = e10.n;
                            iArr[statsNetworkType] = iArr[statsNetworkType] + 5;
                            e10.m();
                            org.telegram.messenger.g0.i3(this, 5000L);
                        }
                    }
                }, 5000L);
                if (this.isOutgoing) {
                    bz.e(this.currentAccount).k(getStatsNetworkType(), 0, 1);
                } else {
                    bz.e(this.currentAccount).i(getStatsNetworkType(), 0, 1);
                }
            }
        }
        if (i3 == 5 && !this.isCallEnded) {
            Utilities.e.c(new n0(this, 2));
        }
        dispatchStateChanged(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$108(AudioDeviceInfo audioDeviceInfo) {
        int i3 = 0;
        this.bluetoothScoConnecting = false;
        boolean isBluetoothDevice = VoipAudioManager.isBluetoothDevice(audioDeviceInfo);
        this.bluetoothScoActive = isBluetoothDevice;
        if (isBluetoothDevice) {
            this.needSwitchToBluetoothAfterScoActivates = false;
            this.currentBluetoothDeviceName = audioDeviceInfo.getProductName().toString();
        }
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        while (i3 < size) {
            StateListener stateListener = arrayList.get(i3);
            i3++;
            stateListener.onAudioSettingsChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onDestroy$97() {
        hs.e().k(hs.D2, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onDestroy$98(AudioManager audioManager) {
        synchronized (sync) {
            try {
                if (setModeRunnable == null) {
                    return;
                }
                setModeRunnable = null;
                try {
                    audioManager.setMode(0);
                } catch (SecurityException e10) {
                    if (r2.a) {
                        a8.e("Error setting audio more to normal", e10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDestroy$99() {
        SoundPool soundPool = this.soundPool;
        if (soundPool != null) {
            soundPool.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSignalBarCountChanged$122(int i3) {
        this.signalBarCount = i3;
        for (int i10 = 0; i10 < this.stateListeners.size(); i10++) {
            this.stateListeners.get(i10).onSignalBarsCountChanged(i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartCommand$1(Boolean bool) {
        if (sharedInstance != null && bool.booleanValue()) {
            setMicMute(false, false, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartCommand$2() {
        this.delayedStartOutgoingCall = null;
        startOutgoingCall();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartCommand$3() {
        hs.f(this.currentAccount).k(hs.M4, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playAllowTalkSound$121() {
        this.soundPool.play(this.spAllowTalkId, 0.5f, 0.5f, 0, 0, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playConnectedSound$88() {
        this.soundPool.play(this.spVoiceChatStartId, 1.0f, 1.0f, 0, 0, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playStartRecordSound$120() {
        this.soundPool.play(this.spStartRecordId, 0.5f, 0.5f, 0, 0, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processAcceptedCall$19(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            callFailed();
        } else {
            this.privateCall = ((TL_phone.TL_phone_phoneCall) tLObject).phone_call;
            initiateActualEncryptedCall();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processAcceptedCall$20(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new z(1, this, tLObject, tL_error));
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
    public void lambda$startConferenceGroupCall$31(TLObject tLObject, org.telegram.messenger.c cVar, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.Updates)) {
            if (!(tLObject instanceof TL_phone.groupCall)) {
                hs.f(this.currentAccount).k(hs.M0, 6, tL_error.text);
                hangUp(0);
                return;
            }
            try {
                this.groupCallBottomSheetLatch.await(800L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                a8.g(e10, true);
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            this.groupCall.u(cVar, 0L, groupcall);
            this.groupCall.k(true);
            hp.s1(this.currentAccount).W3(0L, this.groupCall);
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
                    r3 r3Var = this.groupCall;
                    if (r3Var != null) {
                        r3Var.a(longValue);
                    }
                }
            }
            zb1 zb1Var = zb1.o1;
            if (zb1Var != null) {
                zb1Var.f();
            }
            x30.e1(LaunchActivity.K1, org.telegram.messenger.c.a(this.currentAccount), null, null, false, null);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        hp.s1(this.currentAccount).Y3(updates.users, false);
        hp.s1(this.currentAccount).S3(updates.chats, false);
        ArrayList z02 = hp.z0(updates, TL_update.TL_updateGroupCall.class);
        int size = z02.size();
        TLRPC.GroupCall groupCall2 = null;
        int i3 = 0;
        while (i3 < size) {
            Object obj = z02.get(i3);
            i3++;
            groupCall2 = ((TL_update.TL_updateGroupCall) obj).call;
        }
        if (groupCall2 == null) {
            return;
        }
        try {
            this.groupCallBottomSheetLatch.await(800L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e11) {
            a8.g(e11, true);
        }
        this.groupCall.v(cVar, groupCall2);
        this.groupCall.k(true);
        hp.s1(this.currentAccount).W3(0L, this.groupCall);
        this.conference.inputGroupCall = new TLRPC.TL_inputGroupCall();
        ConferenceCall conferenceCall2 = this.conference;
        TLRPC.InputGroupCall inputGroupCall2 = conferenceCall2.inputGroupCall;
        inputGroupCall2.id = groupCall2.id;
        inputGroupCall2.access_hash = groupCall2.access_hash;
        dg.d.a(conferenceCall2.groupCall, groupCall2);
        conferenceCall2.groupCall = groupCall2;
        startConferenceGroupCall(false, 0, null, false);
        HashSet<Long> hashSet2 = this.inviteUsersToConference;
        if (hashSet2 != null) {
            Iterator<Long> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                long longValue2 = it2.next().longValue();
                r3 r3Var2 = this.groupCall;
                if (r3Var2 != null) {
                    r3Var2.a(longValue2);
                }
            }
        }
        zb1 zb1Var2 = zb1.o1;
        if (zb1Var2 != null) {
            zb1Var2.f();
        }
        x30.e1(LaunchActivity.K1, org.telegram.messenger.c.a(this.currentAccount), null, null, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$32(org.telegram.messenger.c cVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new k(this, tLObject, cVar, tL_error, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$33(TLObject tLObject, int i3, String str, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TL_phone.groupCall)) {
            if (tL_error != null) {
                hs.f(this.currentAccount).k(hs.M0, 6, tL_error.text);
                hangUp(0);
                return;
            }
            return;
        }
        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
        hp.s1(this.currentAccount).Y3(groupcall.users, false);
        hp.s1(this.currentAccount).S3(groupcall.chats, false);
        this.groupCall.u(org.telegram.messenger.c.a(this.currentAccount), 0L, groupcall);
        ConferenceCall conferenceCall = this.conference;
        conferenceCall.groupCall = groupcall.call;
        conferenceCall.inputGroupCall = this.joinConference;
        startConferenceGroupCall(false, i3, str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$34(int i3, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new ai.p1(this, tLObject, i3, str, tL_error, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startConferenceGroupCall$35() {
        hs.e().k(hs.v2, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$36(int i3) {
        this.mySource[0] = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$37(TLRPC.GroupCallParticipant groupCallParticipant) {
        this.mySource[0] = groupCallParticipant.source;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startConferenceGroupCall$38(TLRPC.Updates updates, long j10) {
        int i3;
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
            if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                i3 = message.id;
            }
            i3 = 0;
        } else if (update instanceof TL_update.TL_updateMessageID) {
            i3 = ((TL_update.TL_updateMessageID) update).id;
        } else {
            if (updates.updates != null) {
                for (int i10 = 0; i10 < updates.updates.size(); i10++) {
                    TLRPC.Update update2 = updates.updates.get(i10);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                        if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                            i3 = message2.id;
                            break;
                        }
                    } else {
                        if (update2 instanceof TL_update.TL_updateMessageID) {
                            i3 = ((TL_update.TL_updateMessageID) update2).id;
                            break;
                        }
                    }
                }
            }
            i3 = 0;
        }
        r3 r3Var = this.groupCall;
        if (r3Var == null || i3 == 0) {
            return;
        }
        HashMap hashMap = r3Var.k;
        Long valueOf = Long.valueOf(j10);
        q3 q3Var = new q3();
        q3Var.a = i3;
        q3Var.b = true;
        q3Var.c = System.currentTimeMillis();
        hashMap.put(valueOf, q3Var);
        hs.f(this.currentAccount).k(hs.w2, 0L, Long.valueOf(this.groupCall.b.id), Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$39(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        d2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        vg.i0 i0Var = new vg.i0(34, this.currentAccount, T.getContext(), T, new ei.k0());
        i0Var.C1(null, arrayList, arrayList2, arrayList3, str);
        i0Var.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startConferenceGroupCall$40(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            for (int i3 = 0; i3 < Math.min(arrayList.size(), vector.objects.size()); i3++) {
                if (vector.objects.get(i3) instanceof TL_account.requirementToContactPremium) {
                    arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i3)).id));
                }
            }
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startConferenceGroupCall$41(ArrayList arrayList, ArrayList arrayList2, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new p(tLObject, arrayList, arrayList2, runnable, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startConferenceGroupCall$42(HashSet hashSet, String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            r3 r3Var = this.groupCall;
            if (r3Var != null) {
                r3Var.t(longValue);
            }
            arrayList.add(hp.s1(this.currentAccount).a2(l10));
            ArrayList<TLRPC.InputUser> arrayList4 = getrequirementstocontact.id;
            hp s12 = hp.s1(this.currentAccount);
            arrayList4.add(s12.q1(s12.a2(l10)));
        }
        v vVar = new v(this, arrayList, arrayList2, arrayList3, str, 1);
        if (h10.i(this.currentAccount).q()) {
            vVar.run();
        } else {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getrequirementstocontact, new m(arrayList, arrayList2, vVar, 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$43(long j10, HashSet hashSet, AtomicInteger atomicInteger, int i3, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            hp.s1(this.currentAccount).O3(updates, false);
            org.telegram.messenger.g0.h3(new t(this, updates, j10, 0));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j10));
        }
        if (atomicInteger.incrementAndGet() != i3 || hashSet.isEmpty()) {
            return;
        }
        org.telegram.messenger.g0.h3(new u(this, hashSet, str, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startConferenceGroupCall$44(TLObject tLObject, TL_phone.PhoneCall phoneCall, TL_phone.exportGroupCallInvite exportgroupcallinvite) {
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            TL_phone.exportedGroupCallInvite exportedgroupcallinvite = (TL_phone.exportedGroupCallInvite) tLObject;
            Uri parse = Uri.parse(exportedgroupcallinvite.link);
            boolean z10 = true;
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
                hp s12 = hp.s1(this.currentAccount);
                inviteconferencecallparticipant.user_id = s12.q1(s12.a2(next));
                inviteconferencecallparticipant.call = exportgroupcallinvite.call;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(inviteconferencecallparticipant, new w(this, longValue, hashSet, atomicInteger, size, str2, 1));
                z10 = z10;
            }
            this.privateCall = null;
            hs f10 = hs.f(this.currentAccount);
            Long valueOf = Long.valueOf(this.groupCall.b.id);
            Object[] objArr = new Object[3];
            objArr[0] = 0L;
            objArr[z10 ? 1 : 0] = valueOf;
            objArr[2] = Boolean.FALSE;
            f10.k(hs.w2, objArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$45(TL_phone.PhoneCall phoneCall, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new k(this, tLObject, phoneCall, exportgroupcallinvite, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startConferenceGroupCall$46(TLRPC.Updates updates, long j10) {
        int i3;
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
            if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                i3 = message.id;
            }
            i3 = 0;
        } else if (update instanceof TL_update.TL_updateMessageID) {
            i3 = ((TL_update.TL_updateMessageID) update).id;
        } else {
            if (updates.updates != null) {
                for (int i10 = 0; i10 < updates.updates.size(); i10++) {
                    TLRPC.Update update2 = updates.updates.get(i10);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                        if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                            i3 = message2.id;
                            break;
                        }
                    } else {
                        if (update2 instanceof TL_update.TL_updateMessageID) {
                            i3 = ((TL_update.TL_updateMessageID) update2).id;
                            break;
                        }
                    }
                }
            }
            i3 = 0;
        }
        r3 r3Var = this.groupCall;
        if (r3Var == null || i3 == 0) {
            return;
        }
        HashMap hashMap = r3Var.k;
        Long valueOf = Long.valueOf(j10);
        q3 q3Var = new q3();
        q3Var.a = i3;
        q3Var.b = true;
        q3Var.c = System.currentTimeMillis();
        hashMap.put(valueOf, q3Var);
        hs.f(this.currentAccount).k(hs.w2, 0L, Long.valueOf(this.groupCall.b.id), Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$47(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        d2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        vg.i0 i0Var = new vg.i0(34, this.currentAccount, T.getContext(), T, new ei.k0());
        i0Var.C1(null, arrayList, arrayList2, arrayList3, str);
        i0Var.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startConferenceGroupCall$48(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            for (int i3 = 0; i3 < Math.min(arrayList.size(), vector.objects.size()); i3++) {
                if (vector.objects.get(i3) instanceof TL_account.requirementToContactPremium) {
                    arrayList2.add(Long.valueOf(((TLRPC.User) arrayList.get(i3)).id));
                }
            }
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startConferenceGroupCall$49(ArrayList arrayList, ArrayList arrayList2, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new p(tLObject, arrayList, arrayList2, runnable, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startConferenceGroupCall$50(HashSet hashSet, String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            r3 r3Var = this.groupCall;
            if (r3Var != null) {
                r3Var.t(longValue);
            }
            arrayList.add(hp.s1(this.currentAccount).a2(l10));
            ArrayList<TLRPC.InputUser> arrayList4 = getrequirementstocontact.id;
            hp s12 = hp.s1(this.currentAccount);
            arrayList4.add(s12.q1(s12.a2(l10)));
        }
        v vVar = new v(this, arrayList, arrayList2, arrayList3, str, 0);
        if (h10.i(this.currentAccount).q()) {
            vVar.run();
        } else {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getrequirementstocontact, new m(arrayList, arrayList2, vVar, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$51(long j10, HashSet hashSet, AtomicInteger atomicInteger, int i3, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            hp.s1(this.currentAccount).O3(updates, false);
            org.telegram.messenger.g0.h3(new t(this, updates, j10, 1));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j10));
        }
        if (atomicInteger.incrementAndGet() != i3 || hashSet.isEmpty()) {
            return;
        }
        org.telegram.messenger.g0.h3(new u(this, hashSet, str, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startConferenceGroupCall$52(ArrayList arrayList, boolean z10) {
        boolean z11;
        TL_phone.PhoneCall phoneCall;
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall == null) {
            return;
        }
        conferenceCall.joined();
        int size = arrayList.size();
        boolean z12 = false;
        int i3 = 0;
        while (true) {
            z11 = true;
            if (i3 >= size) {
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
            this.conference.applyUpdate(0, (TL_update.TL_updateGroupCallChainBlocks) obj, true, null);
        }
        this.conference.forcePoll();
        this.groupCall.k(z10);
        startGroupCheckShortpoll();
        long j10 = 0;
        if (this.captureDevice[1] != 0) {
            createGroupInstance(1, false, true);
        }
        for (int i10 = 0; i10 < 2; i10++) {
            NativeInstance nativeInstance = this.tgVoip[i10];
            if (nativeInstance != null) {
                nativeInstance.setConferenceCallId(this.conference.getCallId());
            }
        }
        org.telegram.messenger.g0.i3(this.destroyConvertingRunnable, 5000L);
        int i11 = 3;
        if (this.inviteUsersToConference != null && (phoneCall = this.privateCall) != null && this.groupCall != null) {
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.groupCall.b;
            tL_inputGroupCall.id = groupCall.id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new m(this, phoneCall, exportgroupcallinvite, i11));
        }
        long[] jArr = this.inviteUsers;
        if (jArr != null) {
            String str = this.groupCall.b.invite_link;
            int length = jArr.length;
            AtomicInteger atomicInteger = new AtomicInteger(0);
            HashSet hashSet = new HashSet();
            long[] jArr2 = this.inviteUsers;
            int length2 = jArr2.length;
            int i12 = 0;
            while (i12 < length2) {
                boolean z13 = z11;
                long j11 = jArr2[i12];
                this.groupCall.a(j11);
                TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                r3 r3Var = this.groupCall;
                inviteconferencecallparticipant.call = r3Var.g(r3Var.a);
                inviteconferencecallparticipant.user_id = hp.s1(this.currentAccount).o1(j11);
                inviteconferencecallparticipant.video = this.videoCall;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(inviteconferencecallparticipant, new w(this, j11, hashSet, atomicInteger, length, str, 0));
                i12++;
                j10 = j10;
                length2 = length2;
                z11 = z13;
                z12 = z12;
                jArr2 = jArr2;
            }
            this.inviteUsers = null;
            hs f10 = hs.f(this.currentAccount);
            Long valueOf = Long.valueOf(j10);
            Long valueOf2 = Long.valueOf(this.groupCall.b.id);
            Object[] objArr = new Object[3];
            objArr[z12 ? 1 : 0] = valueOf;
            objArr[z11 ? 1 : 0] = valueOf2;
            objArr[2] = Boolean.FALSE;
            f10.k(hs.w2, objArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startConferenceGroupCall$53(TLRPC.TL_error tL_error, String str) {
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
            hs.f(this.currentAccount).k(hs.M0, 6, tL_error.text);
            hangUp(0);
        } else {
            d2 T = LaunchActivity.T();
            if (T != null) {
                fc.a0(T).Q(R.raw.linkbroken, 36, bd.M0(2131751822, null)).j().r = false;
            }
            hangUp(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$54(int i3, boolean z10, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject == null) {
            org.telegram.messenger.g0.h3(new l(this, tL_error, str, 1));
            return;
        }
        org.telegram.messenger.g0.h3(new x(this, i3, 2));
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        long selfId = getSelfId();
        ArrayList z02 = hp.z0(updates, TL_update.TL_updateGroupCallChainBlocks.class);
        ArrayList y02 = hp.y0(updates, TL_update.TL_updateGroupCall.class);
        int size = y02.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = y02.get(i10);
            i10++;
            TLRPC.GroupCall groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            r3 r3Var = this.groupCall;
            if (r3Var != null) {
                r3Var.v(org.telegram.messenger.c.a(this.currentAccount), groupCall);
            }
            ConferenceCall conferenceCall = this.conference;
            if (conferenceCall != null) {
                dg.d.a(conferenceCall.groupCall, groupCall);
                conferenceCall.groupCall = groupCall;
            }
        }
        ArrayList y03 = hp.y0(updates, TL_update.TL_updateGroupCallParticipants.class);
        int size2 = y03.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = y03.get(i11);
            i11++;
            TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) obj2;
            int size3 = tL_updateGroupCallParticipants.participants.size();
            int i12 = 0;
            while (true) {
                if (i12 < size3) {
                    TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i12);
                    if (zi.C1(groupCallParticipant.peer) == selfId) {
                        org.telegram.messenger.g0.h3(new b0(this, groupCallParticipant, 0));
                        if (r2.a) {
                            p1.q(groupCallParticipant.source, new StringBuilder("join source = "));
                        }
                    } else {
                        i12++;
                    }
                }
            }
        }
        ArrayList y04 = hp.y0(updates, TL_update.TL_updateGroupCallConnection.class);
        int size4 = y04.size();
        int i13 = 0;
        while (i13 < size4) {
            Object obj3 = y04.get(i13);
            i13++;
            TL_update.TL_updateGroupCallConnection tL_updateGroupCallConnection = (TL_update.TL_updateGroupCallConnection) obj3;
            if (!tL_updateGroupCallConnection.presentation) {
                this.myParams = tL_updateGroupCallConnection.params;
            }
        }
        hp.s1(this.currentAccount).O3(updates, false);
        org.telegram.messenger.g0.h3(new v6(this, z02, z10, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startConferenceGroupCall$55(String str, int i3, boolean z10) {
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
            r3 r3Var = this.groupCall;
            if (r3Var != null) {
                joingroupcall.call = r3Var.g(r3Var.a);
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
            tL_inputPeerUser.user_id = h10.i(org.telegram.messenger.c.a(this.currentAccount).a).e();
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(joingroupcall, new i0(i3, str, this, z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConferenceGroupCall$56(Runnable runnable) {
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall == null) {
            return;
        }
        conferenceCall.generateAddSelfBlock();
        runnable.run();
        for (int i3 = 0; i3 < 2; i3++) {
            NativeInstance nativeInstance = this.tgVoip[i3];
            if (nativeInstance != null) {
                nativeInstance.setConferenceCallId(this.conference.getCallId());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startConnectingSound$89() {
        int i3 = this.spPlayId;
        if (i3 != 0) {
            this.soundPool.stop(i3);
        }
        int play = this.soundPool.play(this.spConnectingId, 1.0f, 1.0f, 0, -1, 1.0f);
        this.spPlayId = play;
        if (play == 0) {
            9 r02 = new 9();
            this.connectingSoundRunnable = r02;
            org.telegram.messenger.g0.i3(r02, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGroupCall$21(TL_update.TL_updateGroupCall tL_updateGroupCall) {
        if (sharedInstance == null) {
            return;
        }
        TLRPC.GroupCall groupCall = this.groupCall.b;
        TLRPC.GroupCall groupCall2 = tL_updateGroupCall.call;
        groupCall.access_hash = groupCall2.access_hash;
        groupCall.id = groupCall2.id;
        hp s12 = hp.s1(this.currentAccount);
        r3 r3Var = this.groupCall;
        s12.W3(r3Var.c, r3Var);
        startGroupCall(0, null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGroupCall$22(TLRPC.TL_error tL_error) {
        hs.f(this.currentAccount).k(hs.M0, 6, tL_error.text);
        hangUp(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startGroupCall$23(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject == null) {
            org.telegram.messenger.g0.h3(new e0(this, tL_error, 1));
            return;
        }
        try {
            this.groupCallBottomSheetLatch.await(800L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            a8.g(e10, true);
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        int i3 = 0;
        while (true) {
            if (i3 >= updates.updates.size()) {
                break;
            }
            TLRPC.Update update = updates.updates.get(i3);
            if (update instanceof TL_update.TL_updateGroupCall) {
                org.telegram.messenger.g0.h3(new m2.s(27, this, (TL_update.TL_updateGroupCall) update));
                break;
            }
            i3++;
        }
        hp.s1(this.currentAccount).O3(updates, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startGroupCall$24() {
        hs.e().k(hs.v2, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGroupCall$25(int i3) {
        this.mySource[0] = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGroupCall$26(TLRPC.GroupCallParticipant groupCallParticipant) {
        this.mySource[0] = groupCallParticipant.source;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGroupCall$27(boolean z10) {
        this.groupCall.k(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startGroupCall$28(TLRPC.TL_error tL_error) {
        TLRPC.ChatFull N0;
        if ("JOIN_AS_PEER_INVALID".equals(tL_error.text)) {
            if (this.chat != null && (N0 = hp.s1(this.currentAccount).N0(this.chat.id)) != null) {
                if (N0 instanceof TLRPC.TL_chatFull) {
                    N0.flags &= -32769;
                } else {
                    N0.flags &= -67108865;
                }
                N0.groupcall_default_join_as = null;
                o60.A1 = null;
            }
            hangUp(2);
            return;
        }
        if ("GROUPCALL_SSRC_DUPLICATE_MUCH".equals(tL_error.text)) {
            createGroupInstance(0, false, false);
            return;
        }
        if ("GROUPCALL_INVALID".equals(tL_error.text) && this.chat != null) {
            hp.s1(this.currentAccount).V2(0, this.chat.id, true);
        }
        hs.f(this.currentAccount).k(hs.M0, 6, tL_error.text);
        hangUp(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGroupCall$29(int i3, boolean z10, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject == null) {
            org.telegram.messenger.g0.h3(new e0(this, tL_error, 0));
            return;
        }
        org.telegram.messenger.g0.h3(new x(this, i3, 3));
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        long selfId = getSelfId();
        int size = updates.updates.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.Update update = updates.updates.get(i10);
            if (update instanceof TL_update.TL_updateGroupCallParticipants) {
                TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) update;
                int size2 = tL_updateGroupCallParticipants.participants.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i11);
                        if (zi.C1(groupCallParticipant.peer) == selfId) {
                            org.telegram.messenger.g0.h3(new b0(this, groupCallParticipant, 1));
                            if (r2.a) {
                                p1.q(groupCallParticipant.source, new StringBuilder("join source = "));
                            }
                        } else {
                            i11++;
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
        hp.s1(this.currentAccount).O3(updates, false);
        org.telegram.messenger.g0.h3(new e1(15, this, z10));
        startGroupCheckShortpoll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGroupCheckShortpoll$61(TLObject tLObject, TLRPC.TL_error tL_error) {
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
        hp.s1(this.currentAccount).Y3(groupcall.users, false);
        hp.s1(this.currentAccount).S3(groupcall.chats, false);
        this.groupCall.v(org.telegram.messenger.c.a(this.currentAccount), groupcall.call);
        this.groupCall.k(true);
        this.shortPollRunnable = null;
        this.checkRequestId = 0;
        startGroupCheckShortpoll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGroupCheckShortpoll$62(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new z(this, tLObject, tL_error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGroupCheckShortpoll$63(TLRPC.TL_error tL_error, TLObject tLObject, TL_phone.checkGroupCall checkgroupcall) {
        boolean z10;
        boolean z11;
        TLRPC.GroupCall groupCall;
        if (this.shortPollRunnable == null || sharedInstance == null || this.groupCall == null) {
            return;
        }
        if (this.conference != null && tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text) && this.groupCall.g(true) != null && this.groupCall.g(false) != null) {
            TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
            getgroupcall.call = this.groupCall.g(false);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcall, new s(this, 3));
            return;
        }
        this.shortPollRunnable = null;
        this.checkRequestId = 0;
        if (tLObject instanceof Vector) {
            ArrayList<Integer> intArray = ((Vector) tLObject).toIntArray();
            int i3 = this.mySource[0];
            z11 = (i3 == 0 || !checkgroupcall.sources.contains(Integer.valueOf(i3)) || intArray.contains(Integer.valueOf(this.mySource[0]))) ? false : true;
            int i10 = this.mySource[1];
            if (i10 != 0 && checkgroupcall.sources.contains(Integer.valueOf(i10)) && !intArray.contains(Integer.valueOf(this.mySource[1]))) {
                z10 = true;
            }
            z10 = false;
        } else {
            if (tL_error == null || tL_error.code != 400) {
                z10 = false;
            } else {
                int i11 = this.mySource[1];
                if (i11 == 0 || !checkgroupcall.sources.contains(Integer.valueOf(i11))) {
                    z11 = true;
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            z11 = z10;
        }
        if (z11) {
            createGroupInstance(0, false, false);
        }
        if (z10) {
            createGroupInstance(1, false, false);
        }
        int[] iArr = this.mySource;
        if (iArr[1] == 0 && iArr[0] == 0 && ((groupCall = this.groupCall.b) == null || !groupCall.rtmp_stream)) {
            return;
        }
        startGroupCheckShortpoll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGroupCheckShortpoll$64(TL_phone.checkGroupCall checkgroupcall, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new k(this, tL_error, tLObject, checkgroupcall, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGroupCheckShortpoll$65() {
        r3 r3Var;
        TLRPC.GroupCall groupCall;
        if (this.shortPollRunnable == null || sharedInstance == null || (r3Var = this.groupCall) == null) {
            return;
        }
        int[] iArr = this.mySource;
        int i3 = 0;
        if (iArr[0] == 0 && iArr[1] == 0 && ((groupCall = r3Var.b) == null || !groupCall.rtmp_stream)) {
            return;
        }
        TL_phone.checkGroupCall checkgroupcall = new TL_phone.checkGroupCall();
        if (this.groupCall.g(true) != null) {
            checkgroupcall.call = this.groupCall.g(true);
        } else {
            checkgroupcall.call = this.groupCall.g(false);
        }
        while (true) {
            int[] iArr2 = this.mySource;
            if (i3 >= iArr2.length) {
                this.checkRequestId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(checkgroupcall, new f3(26, this, checkgroupcall));
                return;
            }
            int i10 = iArr2[i3];
            if (i10 != 0) {
                checkgroupcall.sources.add(Integer.valueOf(i10));
            }
            i3++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startOutgoingCall$10(byte[] bArr, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new k(this, tL_error, tLObject, bArr, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startOutgoingCall$11(qr qrVar, TLObject tLObject, TLRPC.TL_error tL_error) {
        qr qrVar2;
        this.callReqId = 0;
        if (this.endCallAfterRequest) {
            callEnded();
            return;
        }
        if (tL_error != null) {
            if (r2.a) {
                a8.d("Error on getDhConfig " + tL_error);
            }
            callFailed();
            return;
        }
        TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
        if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
            byte[] bArr = messages_dhconfig.p;
            int i3 = messages_dhconfig.g;
            Pattern pattern = Utilities.a;
            if (!ConnectionsManager.native_isGoodPrime(bArr, i3)) {
                callFailed();
                return;
            }
            byte[] bArr2 = messages_dhconfig.p;
            qrVar.H();
            qrVar.y = bArr2;
            int i10 = messages_dhconfig.g;
            qrVar.H();
            qrVar.E = i10;
            int i11 = messages_dhconfig.version;
            qrVar.H();
            qrVar.x = i11;
            qrVar.H();
            int i12 = qrVar.x;
            qrVar.H();
            int i13 = qrVar.E;
            qrVar.H();
            qrVar2 = qrVar;
            qrVar.a.c(new k2.a0(qrVar2, i12, i13, qrVar.y, 7));
        } else {
            qrVar2 = qrVar;
        }
        byte[] bArr3 = new byte[256];
        for (int i14 = 0; i14 < 256; i14++) {
            bArr3[i14] = (byte) (((byte) (Utilities.b.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i14]);
        }
        qrVar2.H();
        BigInteger valueOf = BigInteger.valueOf(qrVar2.E);
        BigInteger bigInteger = new BigInteger(1, bArr3);
        qrVar2.H();
        byte[] byteArray = valueOf.modPow(bigInteger, new BigInteger(1, qrVar2.y)).toByteArray();
        if (byteArray.length > 256) {
            byte[] bArr4 = new byte[256];
            System.arraycopy(byteArray, 1, bArr4, 0, 256);
            byteArray = bArr4;
        }
        TL_phone.requestCall requestcall = new TL_phone.requestCall();
        requestcall.user_id = hp.s1(this.currentAccount).q1(this.user);
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(requestcall, new f3(27, this, bArr3), 65536);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startOutgoingCall$6() {
        hs.e().k(hs.v2, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startOutgoingCall$7(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (r2.a) {
            if (tL_error != null) {
                a8.d("error on phone.discardCall: " + tL_error);
            } else {
                a8.b("phone.discardCall " + tLObject);
            }
        }
        org.telegram.messenger.g0.h3(new q(this, 25));
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
        a8.d("discardCall " + discardcall.reason);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardcall, new s(this, 2), 65536);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startOutgoingCall$9(TLRPC.TL_error tL_error, TLObject tLObject, byte[] bArr) {
        if (tL_error != null) {
            if (tL_error.code == 400 && "PARTICIPANT_VERSION_OUTDATED".equals(tL_error.text)) {
                callFailed(Instance.ERROR_PEER_OUTDATED);
                return;
            }
            int i3 = tL_error.code;
            if (i3 == 403) {
                callFailed(Instance.ERROR_PRIVACY);
                return;
            }
            if (i3 == 406) {
                callFailed(Instance.ERROR_LOCALIZED);
                return;
            }
            if (r2.a) {
                a8.d("Error on phone.requestCall: " + tL_error);
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
            int i10 = 0;
            while (i10 < size) {
                TL_phone.PhoneCall phoneCall = arrayList.get(i10);
                i10++;
                onCallUpdated(phoneCall);
            }
            this.pendingUpdates.clear();
        }
        q qVar = new q(this, 21);
        this.timeoutRunnable = qVar;
        org.telegram.messenger.g0.i3(qVar, hp.s1(this.currentAccount).h3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startRingtoneAndVibration$96(MediaPlayer mediaPlayer) {
        try {
            this.ringtonePlayer.start();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startScreenCapture$57(int i3) {
        this.mySource[1] = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startScreenCapture$58(TLRPC.Updates updates) {
        if (this.tgVoip[1] != null) {
            long selfId = getSelfId();
            int size = updates.updates.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.Update update = updates.updates.get(i3);
                if (update instanceof TL_update.TL_updateGroupCallConnection) {
                    TL_update.TL_updateGroupCallConnection tL_updateGroupCallConnection = (TL_update.TL_updateGroupCallConnection) update;
                    if (tL_updateGroupCallConnection.presentation) {
                        this.tgVoip[1].setJoinResponsePayload(tL_updateGroupCallConnection.params.data);
                    }
                } else if (update instanceof TL_update.TL_updateGroupCallParticipants) {
                    TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) update;
                    int size2 = tL_updateGroupCallParticipants.participants.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i10);
                            if (zi.C1(groupCallParticipant.peer) == selfId) {
                                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.presentation;
                                if (tL_groupCallParticipantVideo != null) {
                                    if ((tL_groupCallParticipantVideo.flags & 2) != 0) {
                                        this.mySource[1] = tL_groupCallParticipantVideo.audio_source;
                                    } else {
                                        int size3 = tL_groupCallParticipantVideo.source_groups.size();
                                        for (int i11 = 0; i11 < size3; i11++) {
                                            TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = groupCallParticipant.presentation.source_groups.get(i11);
                                            if (tL_groupCallParticipantVideoSourceGroup.sources.size() > 0) {
                                                this.mySource[1] = tL_groupCallParticipantVideoSourceGroup.sources.get(0).intValue();
                                            }
                                        }
                                    }
                                }
                            } else {
                                i10++;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$startScreenCapture$59(TLRPC.TL_error tL_error) {
        TLRPC.ChatFull N0;
        if ("GROUPCALL_VIDEO_TOO_MUCH".equals(tL_error.text)) {
            this.groupCall.s();
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
                hp.s1(this.currentAccount).V2(0, this.chat.id, true);
                return;
            }
        }
        if (this.chat != null && (N0 = hp.s1(this.currentAccount).N0(this.chat.id)) != null) {
            if (N0 instanceof TLRPC.TL_chatFull) {
                N0.flags &= -32769;
            } else {
                N0.flags &= -67108865;
            }
            N0.groupcall_default_join_as = null;
            o60.A1 = null;
        }
        hangUp(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startScreenCapture$60(int i3, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject == null) {
            org.telegram.messenger.g0.h3(new e0(this, tL_error, 2));
            return;
        }
        org.telegram.messenger.g0.h3(new x(this, i3, 5));
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        org.telegram.messenger.g0.h3(new l0(0, this, updates));
        hp.s1(this.currentAccount).O3(updates, false);
        startGroupCheckShortpoll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopScreenCapture$15(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            hp.s1(this.currentAccount).O3((TLRPC.Updates) tLObject, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$switchToSpeaker$91(Boolean bool, Boolean bool2) {
        updateOutputGainControlState();
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            StateListener stateListener = arrayList.get(i3);
            i3++;
            stateListener.onAudioSettingsChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$switchToSpeaker$92() {
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if ((isBluetoothHeadsetConnected() && hasEarpiece()) || this.isHeadsetPlugged || isSpeakerphoneOn()) {
            return;
        }
        voipAudioManager.setSpeakerphoneOn(true);
        voipAudioManager.isBluetoothAndSpeakerOnAsync(new r(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleSpeakerphoneOrShowRouteSheet$93(DialogInterface dialogInterface, int i3) {
        if (getSharedInstance() == null) {
            return;
        }
        setAudioOutput(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$toggleSpeakerphoneOrShowRouteSheet$94(t2 t2Var, Integer num, DialogInterface dialogInterface) {
        for (int i3 = 0; i3 < t2Var.x0.size(); i3++) {
            int i10 = k6.j5;
            t2Var.C0(i3, k6.x0(null, i10, false), k6.x0(null, i10, false));
        }
        if (num != null) {
            int x02 = k6.x0(null, k6.k5, false);
            t2Var.C0(num.intValue(), x02, x02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleSpeakerphoneOrShowRouteSheet$95(Boolean bool, Boolean bool2) {
        updateOutputGainControlState();
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            StateListener stateListener = arrayList.get(i3);
            i3++;
            stateListener.onAudioSettingsChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateBluetoothHeadsetState$113(VoipAudioManager voipAudioManager) {
        try {
            voipAudioManager.startBluetooth();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateConnectionState$81(int i3) {
        if (this.switchingStreamTimeoutRunnable == null) {
            return;
        }
        this.switchingStream = false;
        lambda$createGroupInstance$80(i3, 0, true);
        this.switchingStreamTimeoutRunnable = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateConnectionState$82() {
        int i3 = this.spPlayId;
        if (i3 != 0) {
            this.soundPool.stop(i3);
        }
        this.spPlayId = this.soundPool.play(this.spVoiceChatConnecting, 1.0f, 1.0f, 0, -1, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateConnectionState$83() {
        int i3 = this.spPlayId;
        if (i3 != 0) {
            this.soundPool.stop(i3);
            this.spPlayId = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateServerConfig$107(SharedPreferences sharedPreferences, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            String str = ((TLRPC.TL_dataJSON) tLObject).data;
            Instance.setGlobalServerConfig(str);
            sharedPreferences.edit().putString("voip_server_config", str).commit();
        }
    }

    private void loadResources() {
        WebRtcAudioTrack.setAudioTrackUsageAttribute(2);
        Utilities.e.c(new q(this, 19));
    }

    private void onTgVoipStop(Instance.FinalState finalState) {
        if (this.user == null || this.privateCall == null || finalState == null) {
            return;
        }
        if (TextUtils.isEmpty(finalState.debugLog)) {
            try {
                finalState.debugLog = getStringFromFile(n1.e("" + this.privateCall.id));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        hp s12 = hp.s1(this.currentAccount);
        if (s12.p1 == null) {
            s12.p1 = new VoIPDebugToSend(this.currentAccount);
        }
        VoIPDebugToSend voIPDebugToSend = s12.p1;
        TL_phone.PhoneCall phoneCall = this.privateCall;
        voIPDebugToSend.push(phoneCall.id, phoneCall.access_hash, finalState, this.lastLogFilePath);
        this.lastLogFilePath = null;
        boolean z10 = this.needSendDebugLog;
        if (z10) {
            s12.p1.done(this.privateCall.id, z10);
            this.needSendDebugLog = false;
        }
    }

    private void processAcceptedCall() {
        byte[] bArr;
        dispatchStateChanged(12);
        qr a02 = qr.a0(this.currentAccount);
        a02.H();
        BigInteger bigInteger = new BigInteger(1, a02.y);
        BigInteger bigInteger2 = new BigInteger(1, this.privateCall.g_b);
        if (!Utilities.w(bigInteger2, bigInteger)) {
            if (r2.a) {
                a8.l("stopping VoIP service, bad Ga and Gb");
            }
            callFailed();
            return;
        }
        byte[] byteArray = bigInteger2.modPow(new BigInteger(1, this.a_or_b), bigInteger).toByteArray();
        if (byteArray.length <= 256) {
            if (byteArray.length < 256) {
                bArr = new byte[256];
                System.arraycopy(byteArray, 0, bArr, 256 - byteArray.length, byteArray.length);
                for (int i3 = 0; i3 < 256 - byteArray.length; i3++) {
                    bArr[i3] = 0;
                }
            }
            byte[] n4 = Utilities.n(byteArray);
            byte[] bArr2 = new byte[8];
            System.arraycopy(n4, n4.length - 8, bArr2, 0, 8);
            long g7 = Utilities.g(bArr2);
            this.authKey = byteArray;
            this.keyFingerprint = g7;
            TL_phone.confirmCall confirmcall = new TL_phone.confirmCall();
            confirmcall.g_a = this.g_a;
            confirmcall.key_fingerprint = g7;
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmcall, new s(this, 5));
        }
        bArr = new byte[256];
        System.arraycopy(byteArray, byteArray.length - 256, bArr, 0, 256);
        byteArray = bArr;
        byte[] n42 = Utilities.n(byteArray);
        byte[] bArr22 = new byte[8];
        System.arraycopy(n42, n42.length - 8, bArr22, 0, 8);
        long g72 = Utilities.g(bArr22);
        this.authKey = byteArray;
        this.keyFingerprint = g72;
        TL_phone.confirmCall confirmcall2 = new TL_phone.confirmCall();
        confirmcall2.g_a = this.g_a;
        confirmcall2.key_fingerprint = g72;
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmcall2, new s(this, 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00db  */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void showIncomingNotification(String str, TLObject tLObject, boolean z10, int i3) {
        int i10;
        int i11;
        Notification notification;
        boolean z11;
        Intent intent = new Intent(this, (Class<?>) LaunchActivity.class);
        intent.setAction("voip");
        Notification.Builder contentIntent = new Notification.Builder(this).setContentTitle(z10 ? bd.M0(2131743307, null) : bd.M0(2131743310, null)).setSmallIcon(R.drawable.call).setContentIntent(PendingIntent.getActivity(this, 0, intent, 33554432));
        if (Build.VERSION.SDK_INT >= 26) {
            SharedPreferences f12 = hp.f1();
            int i12 = f12.getInt("calls_notification_channel", 0);
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("incoming_calls2" + i12);
            if (notificationChannel != null) {
                notificationManager.deleteNotificationChannel(notificationChannel.getId());
            }
            NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel("incoming_calls3" + i12);
            if (notificationChannel2 != null) {
                notificationManager.deleteNotificationChannel(notificationChannel2.getId());
            }
            NotificationChannel notificationChannel3 = notificationManager.getNotificationChannel("incoming_calls4" + i12);
            if (notificationChannel3 != null) {
                if (notificationChannel3.getImportance() < 4 || notificationChannel3.getSound() != null) {
                    if (r2.a) {
                        a8.b("User messed up the notification channel; deleting it and creating a proper one");
                    }
                    notificationManager.deleteNotificationChannel("incoming_calls4" + i12);
                    i12++;
                    f12.edit().putInt("calls_notification_channel", i12).commit();
                } else {
                    z11 = false;
                    if (z11) {
                        AudioAttributes build = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(2).setUsage(2).build();
                        NotificationChannel notificationChannel4 = new NotificationChannel("incoming_calls4" + i12, bd.M0(2131749211, null), 4);
                        try {
                            notificationChannel4.setSound(null, build);
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                        notificationChannel4.setDescription(bd.M0(2131749210, null));
                        notificationChannel4.enableVibration(false);
                        notificationChannel4.enableLights(false);
                        notificationChannel4.setBypassDnd(true);
                        try {
                            notificationManager.createNotificationChannel(notificationChannel4);
                        } catch (Exception e11) {
                            a8.g(e11, true);
                            stopSelf();
                            return;
                        }
                    }
                    contentIntent.setChannelId("incoming_calls4" + i12);
                }
            }
            z11 = true;
            if (z11) {
            }
            contentIntent.setChannelId("incoming_calls4" + i12);
        } else {
            contentIntent.setSound(null);
        }
        Intent intent2 = new Intent(this, (Class<?>) VoIPActionsReceiver.class);
        intent2.setAction(getPackageName() + ".DECLINE_CALL");
        intent2.putExtra("call_id", getCallID());
        String M0 = bd.M0(2131743428, null);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 24 || i13 >= 31) {
            i10 = 0;
        } else {
            SpannableString spannableString = new SpannableString(M0);
            i10 = 0;
            spannableString.setSpan(new ForegroundColorSpan(-769226), 0, spannableString.length(), 0);
            M0 = spannableString;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(this, i10, intent2, 301989888);
        Intent intent3 = new Intent(this, (Class<?>) VoIPActionsReceiver.class);
        intent3.setAction(getPackageName() + ".ANSWER_CALL");
        String str2 = M0;
        intent3.putExtra("call_id", getCallID());
        String M02 = bd.M0(2131743514, null);
        if (i13 < 24 || i13 >= 31) {
            i11 = 0;
        } else {
            SpannableString spannableString2 = new SpannableString(M02);
            i11 = 0;
            spannableString2.setSpan(new ForegroundColorSpan(-16733696), 0, spannableString2.length(), 0);
            M02 = spannableString2;
        }
        PendingIntent broadcast2 = PendingIntent.getBroadcast(this, i11, intent3, 301989888);
        contentIntent.setPriority(2);
        contentIntent.setShowWhen(i11);
        contentIntent.setColor(-13851168);
        contentIntent.setVibrate(new long[i11]);
        contentIntent.setCategory("call");
        contentIntent.setFullScreenIntent(PendingIntent.getActivity(this, i11, intent, 33554432), true);
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            if (!TextUtils.isEmpty(user.phone)) {
                contentIntent.addPerson("tel:" + user.phone);
            }
        }
        if (i13 >= 31) {
            Bitmap roundAvatarBitmap = getRoundAvatarBitmap(this, this.currentAccount, tLObject);
            String o10 = g5.o(tLObject);
            if (TextUtils.isEmpty(o10)) {
                o10 = "___";
            }
            contentIntent.setStyle(Notification.CallStyle.forIncomingCall(new Person.Builder().setName(o10).setIcon(Icon.createWithAdaptiveBitmap(roundAvatarBitmap)).build(), broadcast, broadcast2));
            notification = contentIntent.build();
        } else {
            contentIntent.addAction(R.drawable.ic_call_end_white_24dp, str2, broadcast);
            contentIntent.addAction(R.drawable.call, M02, broadcast2);
            contentIntent.setContentText(str);
            RemoteViews remoteViews = new RemoteViews(getPackageName(), bd.a0 ? R.layout.call_notification_rtl : R.layout.call_notification);
            remoteViews.setTextViewText(R.id.name, str);
            remoteViews.setViewVisibility(R.id.subtitle, 8);
            if (h10.c() > 1) {
                TLRPC.User f10 = h10.i(this.currentAccount).f();
                remoteViews.setTextViewText(R.id.title, z10 ? bd.a0("VoipInVideoCallBrandingWithName", null, 2131743306, g5.m(0, f10.first_name, f10.last_name)) : bd.a0("VoipInCallBrandingWithName", null, 2131743309, g5.m(0, f10.first_name, f10.last_name)));
            } else {
                remoteViews.setTextViewText(R.id.title, bd.M0(z10 ? 2131743307 : 2131743310, null));
            }
            Bitmap roundAvatarBitmap2 = getRoundAvatarBitmap(this, this.currentAccount, tLObject);
            remoteViews.setTextViewText(R.id.answer_text, bd.M0(2131743514, null));
            remoteViews.setTextViewText(R.id.decline_text, bd.M0(2131743428, null));
            remoteViews.setImageViewBitmap(R.id.photo, roundAvatarBitmap2);
            remoteViews.setOnClickPendingIntent(R.id.answer_btn, broadcast2);
            remoteViews.setOnClickPendingIntent(R.id.decline_btn, broadcast);
            contentIntent.setLargeIcon(roundAvatarBitmap2);
            notification = contentIntent.getNotification();
            notification.bigContentView = remoteViews;
            notification.headsUpContentView = remoteViews;
        }
        this.foregroundStarted = true;
        if (i13 >= 33) {
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
        int i3 = R.drawable.voicechat_active;
        if (isConference) {
            contentIntent.setContentTitle(bd.M0(2131743436, null));
            if (isMicMute()) {
                i3 = R.drawable.voicechat_muted;
            }
            contentIntent.setSmallIcon(i3);
        } else if (this.groupCall != null) {
            contentIntent.setContentTitle(bd.M0(t3.W(this.chat) ? 2131743305 : 2131743229, null));
            if (isMicMute()) {
                i3 = R.drawable.voicechat_muted;
            }
            contentIntent.setSmallIcon(i3);
        } else {
            contentIntent.setContentTitle(bd.M0(2131743275, null));
            contentIntent.setSmallIcon(R.drawable.call);
            contentIntent.setOngoing(true);
        }
        int i10 = Build.VERSION.SDK_INT;
        Intent intent = new Intent(this, (Class<?>) VoIPActionsReceiver.class);
        intent.setAction(getPackageName() + ".END_CALL");
        if (isConference()) {
            contentIntent.addAction(R.drawable.ic_call_end_white_24dp, bd.M0(2131743433, null), PendingIntent.getBroadcast(this, 0, intent, 167772160));
        } else if (this.groupCall != null) {
            contentIntent.addAction(R.drawable.ic_call_end_white_24dp, bd.M0(t3.W(this.chat) ? 2131743481 : 2131743371, null), PendingIntent.getBroadcast(this, 0, intent, 167772160));
        } else {
            contentIntent.addAction(R.drawable.ic_call_end_white_24dp, bd.M0(2131743422, null), PendingIntent.getBroadcast(this, 0, intent, 167772160));
        }
        contentIntent.setPriority(2);
        contentIntent.setShowWhen(false);
        if (i10 >= 26) {
            contentIntent.setColor(-14143951);
            contentIntent.setColorized(true);
        } else {
            contentIntent.setColor(-13851168);
        }
        if (i10 >= 26) {
            us.i();
            contentIntent.setChannelId(us.k0);
        }
        if (!isConference() && bitmap != null) {
            contentIntent.setLargeIcon(bitmap);
        }
        try {
            if (this.foregroundStarted) {
                try {
                    stopForeground(true);
                } catch (Exception e10) {
                    a8.g(e10, true);
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
        } catch (Exception e11) {
            if (bitmap == null || !(e11 instanceof IllegalArgumentException)) {
                return;
            }
            showNotification(str, null);
        }
    }

    private void startConferenceGroupCall(boolean z10, int i3, String str, boolean z11) {
        if (sharedInstance == this) {
            if (this.groupCallPeer == null) {
                this.groupCallPeer = hp.n1(h10.i(this.currentAccount).f());
            }
            if (z10) {
                org.telegram.messenger.c a10 = org.telegram.messenger.c.a(this.currentAccount);
                this.conference = new ConferenceCall(this.currentAccount, h10.i(a10.a).e()) { // from class: org.telegram.messenger.voip.VoIPService.6
                    @Override // org.telegram.messenger.voip.ConferenceCall
                    public void gotCallId(long j10) {
                        for (int i10 = 0; i10 < 2; i10++) {
                            if (VoIPService.this.tgVoip[i10] != null) {
                                VoIPService.this.tgVoip[i10].setConferenceCallId(j10);
                            }
                        }
                    }
                };
                this.chat = null;
                r3 r3Var = new r3();
                this.groupCall = r3Var;
                r3Var.b = new TLRPC.TL_groupCall();
                r3 r3Var2 = this.groupCall;
                TLRPC.GroupCall groupCall = r3Var2.b;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                groupCall.rtmp_stream = this.isRtmpStream;
                r3Var2.c = 0L;
                r3Var2.C = org.telegram.messenger.c.a(this.currentAccount);
                this.groupCall.x(this.groupCallPeer);
                this.groupCall.e();
                dispatchStateChanged(6);
                TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
                createconferencecall.random_id = Utilities.b.nextInt();
                this.groupCallBottomSheetLatch = new CountDownLatch(1);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new f3(28, this, a10), 65536);
                return;
            }
            if (this.conference == null) {
                int i10 = this.currentAccount;
                ConferenceCall conferenceCall = new ConferenceCall(i10, h10.i(i10).e()) { // from class: org.telegram.messenger.voip.VoIPService.7
                    @Override // org.telegram.messenger.voip.ConferenceCall
                    public void gotCallId(long j10) {
                        for (int i11 = 0; i11 < 2; i11++) {
                            if (VoIPService.this.tgVoip[i11] != null) {
                                VoIPService.this.tgVoip[i11].setConferenceCallId(j10);
                            }
                        }
                    }
                };
                this.conference = conferenceCall;
                conferenceCall.inputGroupCall = this.joinConference;
            }
            if (this.groupCall == null) {
                r3 r3Var3 = new r3();
                this.groupCall = r3Var3;
                r3Var3.a = true;
                r3Var3.b = new TLRPC.TL_groupCall();
                TLRPC.GroupCall groupCall2 = this.groupCall.b;
                groupCall2.participants_count = 0;
                groupCall2.version = 1;
                groupCall2.can_start_video = true;
                groupCall2.can_change_join_muted = true;
                groupCall2.rtmp_stream = this.isRtmpStream;
                if (this.joinConference instanceof TLRPC.TL_inputGroupCallSlug) {
                    groupCall2.invite_link = "https://t.me/call/" + this.joinConference.slug;
                }
                r3 r3Var4 = this.groupCall;
                r3Var4.c = 0L;
                r3Var4.C = org.telegram.messenger.c.a(this.currentAccount);
                this.groupCall.x(this.groupCallPeer);
                this.groupCall.e();
                TLRPC.GroupCall groupCall3 = this.joinConferenceCall;
                if (groupCall3 != null) {
                    this.conference.groupCall = groupCall3;
                    this.groupCall.v(org.telegram.messenger.c.a(this.currentAccount), this.joinConferenceCall);
                    this.joinConferenceCall = null;
                }
            }
            if (this.conference.groupCall == null) {
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = this.joinConference;
                getgroupcall.limit = 10;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcall, new kg.t(this, i3, str, 1));
                return;
            }
            if (str == null) {
                configureDeviceForCall();
                showNotification();
                org.telegram.messenger.g0.h3(new i(5));
                if (this.convertingVoip != null && this.isPrivateScreencast) {
                    long[] jArr = this.captureDevice;
                    jArr[1] = jArr[0];
                    jArr[0] = 0;
                    boolean[] zArr = this.destroyCaptureDevice;
                    zArr[1] = true;
                    zArr[0] = true;
                    setVideoState(true, this.videoState[0]);
                    setVideoState(false, 0);
                    this.videoState[0] = 0;
                }
                createGroupInstance(0, false, true);
                long[] jArr2 = this.inviteUsers;
                if (jArr2 != null) {
                    for (long j10 : jArr2) {
                        this.groupCall.a(j10);
                    }
                }
                zb1 zb1Var = zb1.o1;
                if (zb1Var != null) {
                    zb1Var.f();
                }
                x30.e1(LaunchActivity.K1, org.telegram.messenger.c.a(h10.t0), null, null, false, null);
                return;
            }
            if (getSharedInstance() != null && (this.groupCall != null || this.conference != null)) {
                dispatchStateChanged(1);
                if (r2.a) {
                    a8.b("initital source = " + i3);
                }
                j0 j0Var = new j0(i3, 0, this, str, z10);
                if (z11) {
                    this.conference.reset();
                }
                this.conference.requestLastBlock(new m2.s(29, this, j0Var));
            }
        }
    }

    private void startConnectingSound() {
        Utilities.e.c(new q(this, 29));
    }

    private void startGroupCall(int i3, String str, boolean z10) {
        if (sharedInstance != this) {
            return;
        }
        if (this.createGroupCall) {
            r3 r3Var = new r3();
            this.groupCall = r3Var;
            r3Var.b = new TLRPC.TL_groupCall();
            r3 r3Var2 = this.groupCall;
            TLRPC.GroupCall groupCall = r3Var2.b;
            groupCall.participants_count = 0;
            groupCall.version = 1;
            groupCall.can_start_video = true;
            groupCall.can_change_join_muted = true;
            groupCall.rtmp_stream = this.isRtmpStream;
            r3Var2.c = this.chat.id;
            r3Var2.C = org.telegram.messenger.c.a(this.currentAccount);
            this.groupCall.x(this.groupCallPeer);
            this.groupCall.e();
            dispatchStateChanged(6);
            TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
            creategroupcall.peer = hp.l1(this.chat);
            creategroupcall.random_id = Utilities.b.nextInt();
            int i10 = this.scheduleDate;
            if (i10 != 0) {
                creategroupcall.schedule_date = i10;
                creategroupcall.flags |= 2;
            }
            if (this.isRtmpStream) {
                creategroupcall.flags |= 4;
            }
            this.groupCallBottomSheetLatch = new CountDownLatch(1);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(creategroupcall, new s(this, 6), 65536);
            this.createGroupCall = false;
            return;
        }
        if (str == null) {
            if (this.groupCall == null && this.chat != null) {
                r3 g12 = hp.s1(this.currentAccount).g1(this.chat.id, false, null);
                this.groupCall = g12;
                if (g12 != null) {
                    g12.x(this.groupCallPeer);
                }
            }
            configureDeviceForCall();
            showNotification();
            org.telegram.messenger.g0.h3(new i(7));
            createGroupInstance(0, false, true);
            return;
        }
        if (getSharedInstance() == null || this.groupCall == null) {
            return;
        }
        dispatchStateChanged(1);
        if (r2.a) {
            a8.b("initital source = " + i3);
        }
        TL_phone.joinGroupCall joingroupcall = new TL_phone.joinGroupCall();
        joingroupcall.muted = this.micMute;
        joingroupcall.video_stopped = this.videoState[0] != 2;
        r3 r3Var3 = this.groupCall;
        joingroupcall.call = r3Var3.g(r3Var3.a);
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
            tL_inputPeerUser.user_id = h10.i(org.telegram.messenger.c.a(this.currentAccount).a).e();
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(joingroupcall, new vc(this, i3, z10, 1));
    }

    private void startGroupCheckShortpoll() {
        r3 r3Var;
        TLRPC.GroupCall groupCall;
        if (this.shortPollRunnable != null || sharedInstance == null || (r3Var = this.groupCall) == null) {
            return;
        }
        int[] iArr = this.mySource;
        if (iArr[0] == 0 && iArr[1] == 0 && ((groupCall = r3Var.b) == null || !groupCall.rtmp_stream)) {
            return;
        }
        q qVar = new q(this, 26);
        this.shortPollRunnable = qVar;
        org.telegram.messenger.g0.i3(qVar, 4000L);
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
        org.telegram.messenger.g0.h3(new i(6));
        Utilities.b.nextBytes(new byte[256]);
        TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
        tL_messages_getDhConfig.random_length = 256;
        qr a02 = qr.a0(this.currentAccount);
        a02.H();
        tL_messages_getDhConfig.version = a02.x;
        this.callReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDhConfig, new a0(this, a02, 1), 65536);
    }

    private void startRatingActivity() {
        try {
            PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) VoIPFeedbackActivity.class).putExtra("call_id", this.privateCall.id).putExtra("call_access_hash", this.privateCall.access_hash).putExtra("call_video", this.privateCall.video).putExtra("account", this.currentAccount).addFlags(805306368), 33554432).send();
        } catch (Exception e10) {
            if (r2.a) {
                a8.e("Error starting incall activity", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startRinging() {
        CallConnection callConnection;
        if (this.currentState == 15) {
            return;
        }
        if (USE_CONNECTION_SERVICE && (callConnection = this.systemCallConnection) != null) {
            callConnection.setRinging();
        }
        if (r2.a) {
            p1.r(this.privateCall.id, new StringBuilder("starting ringing for call "));
        }
        dispatchStateChanged(15);
        if (!this.notificationsDisabled) {
            TLRPC.User user = this.user;
            showIncomingNotification(g5.m(0, user.first_name, user.last_name), this.user, this.privateCall.video, 0);
            if (r2.a) {
                a8.b("Showing incoming call notification");
                return;
            }
            return;
        }
        startRingtoneAndVibration(this.user.id);
        if (r2.a) {
            a8.b("Starting incall activity for incoming call");
        }
        try {
            PendingIntent.getActivity(this, 12345, new Intent(this, (Class<?>) LaunchActivity.class).setAction("voip"), 33554432).send();
        } catch (Exception e10) {
            if (r2.a) {
                a8.e("Error starting incall activity", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0 A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, Exception -> 0x0088, blocks: (B:8:0x0029, B:10:0x002d, B:13:0x0032, B:16:0x0050, B:18:0x0059, B:21:0x0062, B:25:0x0065, B:27:0x0077, B:29:0x0092, B:31:0x00b0, B:32:0x00de, B:34:0x00f0, B:38:0x010c, B:40:0x0112, B:42:0x0120, B:45:0x0137, B:46:0x0146, B:53:0x011a, B:55:0x0101, B:57:0x0098, B:59:0x009c, B:61:0x00a6, B:62:0x00ab, B:63:0x008a, B:66:0x00d2, B:68:0x00d9), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0101 A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, Exception -> 0x0088, blocks: (B:8:0x0029, B:10:0x002d, B:13:0x0032, B:16:0x0050, B:18:0x0059, B:21:0x0062, B:25:0x0065, B:27:0x0077, B:29:0x0092, B:31:0x00b0, B:32:0x00de, B:34:0x00f0, B:38:0x010c, B:40:0x0112, B:42:0x0120, B:45:0x0137, B:46:0x0146, B:53:0x011a, B:55:0x0101, B:57:0x0098, B:59:0x009c, B:61:0x00a6, B:62:0x00ab, B:63:0x008a, B:66:0x00d2, B:68:0x00d9), top: B:7:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void startRingtoneAndVibration(long j10) {
        int i3;
        String string;
        Uri parse;
        boolean z10;
        SharedPreferences sharedPreferences = hp.s1(this.currentAccount).d7;
        AudioManager audioManager = (AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (audioManager.getRingerMode() == 0 || this.ringtonePlayer != null) {
            return;
        }
        synchronized (sync) {
            try {
            } catch (Exception e10) {
                a8.g(e10, true);
                MediaPlayer mediaPlayer = this.ringtonePlayer;
                if (mediaPlayer != null) {
                    mediaPlayer.release();
                    this.ringtonePlayer = null;
                }
            } finally {
            }
            if (this.ringtonePlayer != null) {
                return;
            }
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            this.ringtonePlayer = mediaPlayer2;
            mediaPlayer2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: org.telegram.messenger.voip.h0
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer3) {
                    VoIPService.this.lambda$startRingtoneAndVibration$96(mediaPlayer3);
                }
            });
            this.ringtonePlayer.setLooping(true);
            int i10 = this.isHeadsetPlugged ? 0 : 2;
            this.ringtonePlayer.setAudioStreamType(i10);
            if (!USE_CONNECTION_SERVICE) {
                this.hasAudioFocus = audioManager.requestAudioFocus(this, i10, 2) == 1;
            }
            if (sharedPreferences.getBoolean("custom_" + j10, false)) {
                string = sharedPreferences.getString("ringtone_path_" + j10, null);
            } else {
                string = sharedPreferences.getString("CallsRingtonePath", null);
            }
            if (string == null) {
                parse = RingtoneManager.getDefaultUri(1);
            } else {
                Uri uri = Settings.System.DEFAULT_RINGTONE_URI;
                if (uri == null || !string.equalsIgnoreCase(uri.getPath())) {
                    parse = Uri.parse(string);
                    z10 = false;
                    a8.b("start ringtone with " + z10 + " " + parse);
                    this.ringtonePlayer.setDataSource(this, parse);
                    this.ringtonePlayer.prepareAsync();
                    if (sharedPreferences.getBoolean("custom_" + j10, false)) {
                        i3 = sharedPreferences.getInt("vibrate_calls", 0);
                    } else {
                        i3 = sharedPreferences.getInt("calls_vibrate_" + j10, 0);
                    }
                    if ((i3 != 2 && i3 != 4 && (audioManager.getRingerMode() == 1 || audioManager.getRingerMode() == 2)) || (i3 == 4 && audioManager.getRingerMode() == 1)) {
                        Vibrator vibrator = (Vibrator) getSystemService("vibrator");
                        this.vibrator = vibrator;
                        vibrator.vibrate(new long[]{0, i3 == 1 ? 350L : i3 == 3 ? 1400L : 700L, 500}, 0);
                    }
                }
                parse = RingtoneManager.getDefaultUri(1);
            }
            z10 = true;
            a8.b("start ringtone with " + z10 + " " + parse);
            this.ringtonePlayer.setDataSource(this, parse);
            this.ringtonePlayer.prepareAsync();
            if (sharedPreferences.getBoolean("custom_" + j10, false)) {
            }
            if (i3 != 2) {
                Vibrator vibrator2 = (Vibrator) getSystemService("vibrator");
                this.vibrator = vibrator2;
                vibrator2.vibrate(new long[]{0, i3 == 1 ? 350L : i3 == 3 ? 1400L : 700L, 500}, 0);
            }
            Vibrator vibrator22 = (Vibrator) getSystemService("vibrator");
            this.vibrator = vibrator22;
            vibrator22.vibrate(new long[]{0, i3 == 1 ? 350L : i3 == 3 ? 1400L : 700L, 500}, 0);
        }
    }

    private void startScreenCapture(int i3, String str) {
        if (getSharedInstance() == null || this.groupCall == null) {
            return;
        }
        this.mySource[1] = 0;
        TL_phone.joinGroupCallPresentation joingroupcallpresentation = new TL_phone.joinGroupCallPresentation();
        r3 r3Var = this.groupCall;
        joingroupcallpresentation.call = r3Var.g(r3Var.a);
        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
        joingroupcallpresentation.params = tL_dataJSON;
        tL_dataJSON.data = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(joingroupcallpresentation, new a2(this, i3, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateBluetoothHeadsetState(boolean z10) {
        if (z10 == this.isBtHeadsetConnected) {
            return;
        }
        if (r2.a) {
            a8.b("updateBluetoothHeadsetState: " + z10);
        }
        this.isBtHeadsetConnected = z10;
        AudioManager audioManager = (AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        int i3 = 0;
        if (!z10 || isRinging() || this.currentState == 0) {
            this.bluetoothScoActive = false;
            this.bluetoothScoConnecting = false;
            voipAudioManager.setBluetoothOn(false);
        } else if (this.bluetoothScoActive) {
            if (r2.a) {
                a8.b("SCO already active, setting audio routing");
            }
            if (!hasRtmpStream()) {
                audioManager.setSpeakerphoneOn(false);
                voipAudioManager.setBluetoothOn(true);
            }
        } else {
            if (r2.a) {
                a8.b("startBluetoothSco");
            }
            if (!hasRtmpStream()) {
                this.needSwitchToBluetoothAfterScoActivates = true;
                org.telegram.messenger.g0.i3(new p0(voipAudioManager, 4), 500L);
            }
        }
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        while (i3 < size) {
            StateListener stateListener = arrayList.get(i3);
            i3++;
            stateListener.onAudioSettingsChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateConnectionState, reason: merged with bridge method [inline-methods] */
    public void lambda$createGroupInstance$80(int i3, int i10, boolean z10) {
        if (i3 != 0) {
            return;
        }
        dispatchStateChanged((i10 == 1 || this.switchingStream) ? 3 : 5);
        if (this.switchingStream && (i10 == 0 || (i10 == 1 && z10))) {
            x xVar = new x(this, i3, 6);
            this.switchingStreamTimeoutRunnable = xVar;
            org.telegram.messenger.g0.i3(xVar, 3000L);
        }
        if (i10 == 0) {
            startGroupCheckShortpoll();
            if (!this.playedConnectedSound || this.spPlayId != 0 || this.switchingStream || this.switchingAccount) {
                return;
            }
            Utilities.e.c(new n0(this, 1));
            return;
        }
        cancelGroupCheckShortPoll();
        if (!z10) {
            this.switchingStream = false;
            this.switchingAccount = false;
        }
        Runnable runnable = this.switchingStreamTimeoutRunnable;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
            this.switchingStreamTimeoutRunnable = null;
        }
        if (this.playedConnectedSound) {
            Utilities.e.c(new q(this, 0));
            Runnable runnable2 = this.connectingSoundRunnable;
            if (runnable2 != null) {
                org.telegram.messenger.g0.r(runnable2);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNetworkType() {
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
        SharedPreferences sharedPreferences = hp.s1(this.currentAccount).e7;
        Instance.setGlobalServerConfig(sharedPreferences.getString("voip_server_config", "{}"));
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_phone.getCallConfig(), new s(sharedPreferences, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTrafficStats(NativeInstance nativeInstance, Instance.TrafficStats trafficStats) {
        if (nativeInstance == null) {
            return;
        }
        if (trafficStats == null) {
            trafficStats = nativeInstance.getTrafficStats();
        }
        if (trafficStats == null) {
            return;
        }
        long j10 = trafficStats.bytesSentWifi;
        Instance.TrafficStats trafficStats2 = this.prevTrafficStats;
        long j11 = j10 - (trafficStats2 != null ? trafficStats2.bytesSentWifi : 0L);
        long j12 = trafficStats.bytesReceivedWifi - (trafficStats2 != null ? trafficStats2.bytesReceivedWifi : 0L);
        long j13 = trafficStats.bytesSentMobile - (trafficStats2 != null ? trafficStats2.bytesSentMobile : 0L);
        long j14 = trafficStats.bytesReceivedMobile - (trafficStats2 != null ? trafficStats2.bytesReceivedMobile : 0L);
        this.prevTrafficStats = trafficStats;
        if (j11 > 0) {
            bz.e(this.currentAccount).j(1, 0, j11);
        }
        if (j12 > 0) {
            bz.e(this.currentAccount).h(1, 0, j12);
        }
        if (j13 > 0) {
            bz e10 = bz.e(this.currentAccount);
            NetworkInfo networkInfo = this.lastNetInfo;
            e10.j((networkInfo == null || !networkInfo.isRoaming()) ? 0 : 2, 0, j13);
        }
        if (j14 > 0) {
            bz e11 = bz.e(this.currentAccount);
            NetworkInfo networkInfo2 = this.lastNetInfo;
            e11.h((networkInfo2 == null || !networkInfo2.isRoaming()) ? 0 : 2, 0, j14);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPServiceState
    public void acceptIncomingCall() {
        updateCurrentForegroundType();
        hp.s1(this.currentAccount).g7 = false;
        stopRinging();
        showNotification();
        configureDeviceForCall();
        startConnectingSound();
        dispatchStateChanged(12);
        org.telegram.messenger.g0.h3(new i(3));
        qr a02 = qr.a0(this.currentAccount);
        TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
        tL_messages_getDhConfig.random_length = 256;
        a02.H();
        tL_messages_getDhConfig.version = a02.x;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getDhConfig, new a0(this, a02, 0));
    }

    public ProxyVideoSink addRemoteSink(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10, VideoSink videoSink, VideoSink videoSink2) {
        if (this.tgVoip[0] == null) {
            return null;
        }
        String str = z10 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint;
        if (str == null) {
            return null;
        }
        ProxyVideoSink proxyVideoSink = this.remoteSinks.get(str);
        if (proxyVideoSink != null && proxyVideoSink.target == videoSink) {
            return proxyVideoSink;
        }
        if (proxyVideoSink == null) {
            proxyVideoSink = this.proxyVideoSinkLruCache.remove(str);
        }
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
        proxyVideoSink2.nativeInstance = this.tgVoip[0].addIncomingVideoOutput(1, str, createSsrcGroups(z10 ? groupCallParticipant.presentation : groupCallParticipant.video), proxyVideoSink2, m5.o(groupCallParticipant.peer));
        return proxyVideoSink2;
    }

    public void callFailedFromConnectionService() {
        if (this.isOutgoing) {
            callFailed(Instance.ERROR_CONNECTION_SERVICE);
        } else {
            hangUp();
        }
    }

    public void checkVideoFrame(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10) {
        String str = z10 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint;
        if (str == null) {
            return;
        }
        if (!z10 || groupCallParticipant.hasPresentationFrame == 0) {
            if (z10 || groupCallParticipant.hasCameraFrame == 0) {
                if (this.proxyVideoSinkLruCache.get(str) != null || (this.remoteSinks.get(str) != null && this.waitingFrameParticipant.get(str) == null)) {
                    if (z10) {
                        groupCallParticipant.hasPresentationFrame = 2;
                        return;
                    } else {
                        groupCallParticipant.hasCameraFrame = 2;
                        return;
                    }
                }
                if (this.waitingFrameParticipant.containsKey(str)) {
                    this.waitingFrameParticipant.put(str, groupCallParticipant);
                    if (z10) {
                        groupCallParticipant.hasPresentationFrame = 1;
                        return;
                    } else {
                        groupCallParticipant.hasCameraFrame = 1;
                        return;
                    }
                }
                if (z10) {
                    groupCallParticipant.hasPresentationFrame = 1;
                } else {
                    groupCallParticipant.hasCameraFrame = 1;
                }
                this.waitingFrameParticipant.put(str, groupCallParticipant);
                addRemoteSink(groupCallParticipant, z10, new 5(str, z10), null);
            }
        }
    }

    public void clearCamera() {
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance != null) {
            nativeInstance.clearVideoCapturer();
        }
        long j10 = this.captureDevice[0];
        if (j10 != 0) {
            NativeInstance.destroyVideoCapturer(j10);
            this.captureDevice[0] = 0;
        }
    }

    public void clearRemoteSinks() {
        this.proxyVideoSinkLruCache.evictAll();
    }

    public void convertToConferenceCall(boolean z10, HashSet<Long> hashSet) {
        TLRPC.User user = this.user;
        this.convertingFromCallWithUserId = user != null ? user.id : 0L;
        this.inviteUsersToConferenceVideo = z10;
        this.inviteUsersToConference = hashSet;
        stopRinging();
        NativeInstance[] nativeInstanceArr = this.tgVoip;
        NativeInstance nativeInstance = nativeInstanceArr[0];
        if (nativeInstance != null) {
            this.prevTrafficStats = null;
            this.convertingVoip = nativeInstance;
            nativeInstanceArr[0] = null;
        }
        org.telegram.messenger.g0.h3(new q(this, 17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public void createCaptureDevice(boolean z10) {
        sb1 sb1Var;
        if (z10) {
            this.gotMediaProjection = true;
            updateCurrentForegroundType();
        }
        ?? r22 = z10 ? 2 : this.isFrontFaceCamera;
        if (this.groupCall == null) {
            if (!this.isPrivateScreencast && z10) {
                setVideoState(false, 0);
            }
            this.isPrivateScreencast = z10;
            NativeInstance nativeInstance = this.tgVoip[0];
            if (nativeInstance != null) {
                nativeInstance.clearVideoCapturer();
            }
            long j10 = this.captureDevice[0];
            if (j10 != 0) {
                NativeInstance.destroyVideoCapturer(j10);
                this.captureDevice[0] = 0;
            }
        }
        if (!z10) {
            long j11 = this.captureDevice[z10 ? 1 : 0];
            if (j11 != 0 || this.tgVoip[z10 ? 1 : 0] == null) {
                NativeInstance nativeInstance2 = this.tgVoip[z10 ? 1 : 0];
                if (nativeInstance2 != null && j11 != 0) {
                    nativeInstance2.activateVideoCapturer(j11);
                }
                if (this.captureDevice[z10 ? 1 : 0] != 0) {
                    return;
                }
            }
            this.captureDevice[z10 ? 1 : 0] = NativeInstance.createVideoCapturer(this.localSink[z10 ? 1 : 0], r22);
            return;
        }
        if (this.groupCall != null) {
            long[] jArr = this.captureDevice;
            if (jArr[z10 ? 1 : 0] != 0) {
                return;
            }
            jArr[z10 ? 1 : 0] = NativeInstance.createVideoCapturer(this.localSink[z10 ? 1 : 0], r22);
            createGroupInstance(1, false, true);
            setVideoState(true, 2);
            hs.f(org.telegram.messenger.c.a(this.currentAccount).a).k(hs.z2, new Object[0]);
            return;
        }
        requestVideoCall(true);
        setVideoState(true, 2);
        zb1 zb1Var = zb1.o1;
        if (zb1Var == null || (sb1Var = zb1Var.p0) == null) {
            return;
        }
        sb1Var.a(true, true);
    }

    public void declineIncomingCall(int i3, Runnable runnable) {
        if (this.groupCall != null) {
            stopScreenCapture();
        }
        stopRinging();
        this.callDiscardReason = i3;
        int i10 = this.currentState;
        if (i10 == 14) {
            Runnable runnable2 = this.delayedStartOutgoingCall;
            if (runnable2 != null) {
                org.telegram.messenger.g0.r(runnable2);
                callEnded();
                return;
            } else {
                dispatchStateChanged(10);
                this.endCallAfterRequest = true;
                org.telegram.messenger.g0.i3(new q(this, 24), 5000L);
                return;
            }
        }
        if (i10 == 10 || i10 == 11) {
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
        if (i3 == 2) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonDisconnect();
        } else if (i3 == 3) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonMissed();
        } else if (i3 == 4) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonBusy();
        } else if (i3 != 5) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonHangup();
        } else {
            TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall tL_phoneCallDiscardReasonMigrateConferenceCall = new TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall();
            discardcall.reason = tL_phoneCallDiscardReasonMigrateConferenceCall;
            tL_phoneCallDiscardReasonMigrateConferenceCall.slug = "";
        }
        a8.d("discardCall " + discardcall.reason);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardcall, new s(this, 4), 65536);
        this.onDestroyRunnable = runnable;
        callEnded();
    }

    @Override // org.telegram.messenger.cs
    public void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.I2) {
            callEnded();
        }
    }

    public void editCallMember(TLObject tLObject, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Runnable runnable) {
        TLRPC.InputPeer inputPeer;
        if (tLObject == null || this.groupCall == null) {
            return;
        }
        TL_phone.editGroupCallParticipant editgroupcallparticipant = new TL_phone.editGroupCallParticipant();
        r3 r3Var = this.groupCall;
        editgroupcallparticipant.call = r3Var.g(r3Var.a);
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            if (!l10.B(user) || (inputPeer = this.groupCallPeer) == null) {
                editgroupcallparticipant.participant = hp.n1(user);
                if (r2.a) {
                    StringBuilder sb2 = new StringBuilder("edit group call part id = ");
                    sb2.append(editgroupcallparticipant.participant.user_id);
                    sb2.append(" access_hash = ");
                    p1.r(editgroupcallparticipant.participant.user_id, sb2);
                }
            } else {
                editgroupcallparticipant.participant = inputPeer;
            }
        } else if (tLObject instanceof TLRPC.Chat) {
            editgroupcallparticipant.participant = hp.l1((TLRPC.Chat) tLObject);
            if (r2.a) {
                StringBuilder sb3 = new StringBuilder("edit group call part id = ");
                TLRPC.InputPeer inputPeer2 = editgroupcallparticipant.participant;
                long j10 = inputPeer2.chat_id;
                if (j10 == 0) {
                    j10 = inputPeer2.channel_id;
                }
                sb3.append(j10);
                sb3.append(" access_hash = ");
                p1.r(editgroupcallparticipant.participant.access_hash, sb3);
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
        if (r2.a) {
            p1.q(editgroupcallparticipant.flags, new StringBuilder("edit group call flags = "));
        }
        int i3 = this.currentAccount;
        ConnectionsManager.getInstance(org.telegram.messenger.c.a(i3).a).sendRequest(editgroupcallparticipant, new kg.t(this, i3, runnable, 2));
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
            if (r2.a) {
                a8.b("creating call connection");
            }
            CallConnection callConnection = new CallConnection();
            this.systemCallConnection = callConnection;
            callConnection.setInitializing();
            if (this.isOutgoing) {
                q qVar = new q(this, 4);
                this.delayedStartOutgoingCall = qVar;
                org.telegram.messenger.g0.i3(qVar, 2000L);
            }
            this.systemCallConnection.setAddress(Uri.fromParts("tel", "+99084" + this.user.id, null), 1);
            CallConnection callConnection2 = this.systemCallConnection;
            TLRPC.User user = this.user;
            callConnection2.setCallerDisplayName(g5.m(0, user.first_name, user.last_name), 1);
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
        r3 r3Var = this.groupCall;
        if (r3Var != null) {
            return r3Var.b;
        }
        return null;
    }

    public CountDownLatch getGroupCallBottomSheetLatch() {
        return this.groupCallBottomSheetLatch;
    }

    public long getGroupCallID() {
        TLRPC.GroupCall groupCall;
        r3 r3Var = this.groupCall;
        if (r3Var == null || (groupCall = r3Var.b) == null) {
            return 0L;
        }
        return groupCall.id;
    }

    public TLRPC.InputPeer getGroupCallPeer() {
        return this.groupCallPeer;
    }

    @Override // org.telegram.messenger.voip.VoIPServiceState
    public ArrayList<TLRPC.GroupCallParticipant> getGroupParticipants() {
        r3 r3Var = this.groupCall;
        if (r3Var != null) {
            return r3Var.e;
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
        return inputPeer == null ? h10.i(this.currentAccount).n : inputPeer instanceof TLRPC.TL_inputPeerUser ? inputPeer.user_id : inputPeer instanceof TLRPC.TL_inputPeerChannel ? -inputPeer.channel_id : -inputPeer.chat_id;
    }

    public String getTitle() {
        TLRPC.User user = this.user;
        if (user != null) {
            return g5.m(0, user.first_name, user.last_name);
        }
        TLRPC.Chat chat = this.chat;
        return chat != null ? chat.title : "";
    }

    @Override // org.telegram.messenger.voip.VoIPServiceState
    public TLRPC.User getUser() {
        return this.user;
    }

    public int getVideoState(boolean z10) {
        return this.videoState[z10 ? 1 : 0];
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

    public void hangUp(int i3, Runnable runnable) {
        TLRPC.ChatFull N0;
        int i10 = this.currentState;
        int i11 = 1;
        declineIncomingCall((i10 == 16 || (i10 == 13 && this.isOutgoing)) ? 3 : 1, runnable);
        if (this.groupCall == null || i3 == 2) {
            return;
        }
        int i12 = 0;
        if (i3 != 1) {
            TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
            r3 r3Var = this.groupCall;
            leavegroupcall.call = r3Var.g(r3Var.a);
            leavegroupcall.source = this.mySource[0];
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(leavegroupcall, new s(this, i11));
            return;
        }
        if (this.chat != null && (N0 = hp.s1(this.currentAccount).N0(this.chat.id)) != null) {
            N0.flags &= -2097153;
            N0.call = null;
            hs.f(this.currentAccount).k(hs.w2, Long.valueOf(this.chat.id), Long.valueOf(this.groupCall.b.id), Boolean.FALSE);
        }
        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
        r3 r3Var2 = this.groupCall;
        discardgroupcall.call = r3Var2.g(r3Var2.a);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardgroupcall, new s(this, i12));
    }

    public boolean hasEarpiece() {
        CallConnection callConnection;
        if (!USE_CONNECTION_SERVICE || (callConnection = this.systemCallConnection) == null || callConnection.getCallAudioState() == null) {
            if (((TelephonyManager) getSystemService("phone")).getPhoneType() == 0) {
                Boolean bool = this.mHasEarpiece;
                if (bool != null) {
                    return bool.booleanValue();
                }
                try {
                    AudioManager audioManager = (AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    Method method = AudioManager.class.getMethod("getDevicesForStream", Integer.TYPE);
                    int i3 = AudioManager.class.getField("DEVICE_OUT_EARPIECE").getInt(null);
                    if ((((Integer) method.invoke(audioManager, 0)).intValue() & i3) == i3) {
                        this.mHasEarpiece = Boolean.TRUE;
                    } else {
                        this.mHasEarpiece = Boolean.FALSE;
                    }
                } catch (Throwable th2) {
                    if (r2.a) {
                        a8.e("Error while checking earpiece! ", th2);
                    }
                    this.mHasEarpiece = Boolean.TRUE;
                }
                return this.mHasEarpiece.booleanValue();
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

    public boolean isFullscreen(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10) {
        if (this.currentBackgroundSink[z10 ? 1 : 0] != null) {
            return TextUtils.equals(this.currentBackgroundEndpointId[z10 ? 1 : 0], z10 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
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
        int i3 = this.currentState;
        return (i3 == 1 || i3 == 6) ? false : true;
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
        boolean z10 = USE_CONNECTION_SERVICE;
        if (z10 && (callConnection = this.systemCallConnection) != null && callConnection.getCallAudioState() != null) {
            int route = this.systemCallConnection.getCallAudioState().getRoute();
            return hasEarpiece() ? route == 8 : route == 2;
        }
        if (!this.audioConfigured || z10) {
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
        r3 r3Var = this.groupCall;
        if (r3Var == null) {
            return false;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(getSelfId());
        return (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || t3.w(14, this.chat)) ? false : true;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i3) {
        if (i3 == 1) {
            this.hasAudioFocus = true;
        } else {
            this.hasAudioFocus = false;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCallUpdated(TL_phone.PhoneCall phoneCall) {
        byte[] bArr;
        long g7;
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
            if (r2.a) {
                a8.l("onCallUpdated called with wrong call id (got " + phoneCall.id + ", expected " + this.privateCall.id + ")");
                return;
            }
            return;
        }
        if (phoneCall.access_hash == 0) {
            phoneCall.access_hash = phoneCall2.access_hash;
        }
        if (r2.a) {
            a8.b("Call updated: " + phoneCall);
        }
        long j10 = this.privateCall.key_fingerprint;
        this.privateCall = phoneCall;
        if (phoneCall instanceof TL_phone.TL_phoneCallDiscarded) {
            this.needSendDebugLog = phoneCall.need_debug;
            this.needRateCall = phoneCall.need_rating;
            if (r2.a) {
                a8.b("call discarded, stopping service");
            }
            VoIPDebugToSend voIPDebugToSend = hp.s1(this.currentAccount).p1;
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
                Utilities.e.c(new q(this, 11));
                org.telegram.messenger.g0.i3(this.afterSoundRunnable, 1500L);
                endConnectionServiceCall(1500L);
                stopSelf();
                return;
            }
            TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
            this.joinConference = tL_inputGroupCallSlug;
            tL_inputGroupCallSlug.slug = ((TLRPC.TL_phoneCallDiscardReasonMigrateConferenceCall) phoneCallDiscardReason).slug;
            stopRinging();
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
            if (this.currentState != 13 || phoneCall.receive_date == 0) {
                return;
            }
            dispatchStateChanged(16);
            if (r2.a) {
                a8.b("!!!!!! CALL RECEIVED");
            }
            Runnable runnable = this.connectingSoundRunnable;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
                this.connectingSoundRunnable = null;
            }
            Utilities.e.c(new q(this, 12));
            Runnable runnable2 = this.timeoutRunnable;
            if (runnable2 != null) {
                org.telegram.messenger.g0.r(runnable2);
                this.timeoutRunnable = null;
            }
            q qVar = new q(this, 13);
            this.timeoutRunnable = qVar;
            org.telegram.messenger.g0.i3(qVar, hp.s1(this.currentAccount).i3);
            return;
        }
        byte[] bArr2 = phoneCall.g_a_or_b;
        if (bArr2 == null) {
            if (r2.a) {
                a8.l("stopping VoIP service, Ga == null");
            }
            callFailed();
            return;
        }
        if (!Arrays.equals(this.g_a_hash, Utilities.o(bArr2.length, bArr2))) {
            if (r2.a) {
                a8.l("stopping VoIP service, Ga hash doesn't match");
            }
            callFailed();
            return;
        }
        this.g_a = phoneCall.g_a_or_b;
        BigInteger bigInteger = new BigInteger(1, phoneCall.g_a_or_b);
        qr a02 = qr.a0(this.currentAccount);
        a02.H();
        BigInteger bigInteger2 = new BigInteger(1, a02.y);
        if (!Utilities.w(bigInteger, bigInteger2)) {
            if (r2.a) {
                a8.l("stopping VoIP service, bad Ga and Gb (accepting)");
            }
            callFailed();
            return;
        }
        byte[] byteArray = bigInteger.modPow(new BigInteger(1, this.a_or_b), bigInteger2).toByteArray();
        if (byteArray.length <= 256) {
            if (byteArray.length < 256) {
                bArr = new byte[256];
                System.arraycopy(byteArray, 0, bArr, 256 - byteArray.length, byteArray.length);
                for (int i3 = 0; i3 < 256 - byteArray.length; i3++) {
                    bArr[i3] = 0;
                }
            }
            byte[] n4 = Utilities.n(byteArray);
            byte[] bArr3 = new byte[8];
            System.arraycopy(n4, n4.length - 8, bArr3, 0, 8);
            this.authKey = byteArray;
            g7 = Utilities.g(bArr3);
            this.keyFingerprint = g7;
            if (g7 != phoneCall.key_fingerprint) {
                initiateActualEncryptedCall();
                return;
            }
            if (r2.a) {
                a8.l("key fingerprints don't match");
            }
            callFailed();
            return;
        }
        bArr = new byte[256];
        System.arraycopy(byteArray, byteArray.length - 256, bArr, 0, 256);
        byteArray = bArr;
        byte[] n42 = Utilities.n(byteArray);
        byte[] bArr32 = new byte[8];
        System.arraycopy(n42, n42.length - 8, bArr32, 0, 8);
        this.authKey = byteArray;
        g7 = Utilities.g(bArr32);
        this.keyFingerprint = g7;
        if (g7 != phoneCall.key_fingerprint) {
        }
    }

    public void onCameraFirstFrameAvailable() {
        for (int i3 = 0; i3 < this.stateListeners.size(); i3++) {
            this.stateListeners.get(i3).onCameraFirstFrameAvailable();
        }
    }

    public void onConnectionStateChanged(int i3, boolean z10) {
        org.telegram.messenger.g0.h3(new x(this, i3, 1));
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (r2.a) {
            a8.b("=============== VoIPService STARTING ===============");
        }
        int i3 = 1;
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
                    this.audioDeviceCallback = new AudioDeviceCallback() { // from class: org.telegram.messenger.voip.VoIPService.10
                        @Override // android.media.AudioDeviceCallback
                        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                            VoIPService.this.checkUpdateBluetoothHeadset();
                        }

                        @Override // android.media.AudioDeviceCallback
                        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                            VoIPService.this.checkUpdateBluetoothHeadset();
                        }
                    };
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    this.audioDeviceCallback = null;
                }
            }
            AudioDeviceCallback audioDeviceCallback = this.audioDeviceCallback;
            if (audioDeviceCallback != null) {
                audioManager.registerAudioDeviceCallback(audioDeviceCallback, new Handler(Looper.getMainLooper()));
            }
            if (Build.VERSION.SDK_INT >= 31 && this.communicationDeviceListener == null) {
                AudioManager.OnCommunicationDeviceChangedListener onCommunicationDeviceChangedListener = new AudioManager.OnCommunicationDeviceChangedListener() { // from class: org.telegram.messenger.voip.k0
                    @Override // android.media.AudioManager.OnCommunicationDeviceChangedListener
                    public final void onCommunicationDeviceChanged(AudioDeviceInfo audioDeviceInfo) {
                        VoIPService.this.lambda$onCreate$108(audioDeviceInfo);
                    }
                };
                this.communicationDeviceListener = onCommunicationDeviceChangedListener;
                audioManager.addOnCommunicationDeviceChangedListener(new c3.b(i3), onCommunicationDeviceChangedListener);
            }
            audioManager.registerMediaButtonEventReceiver(new ComponentName(this, (Class<?>) VoIPMediaButtonReceiver.class));
            checkUpdateBluetoothHeadset();
        } catch (Exception e10) {
            if (r2.a) {
                a8.e("error initializing voip controller", e10);
            }
            callFailed();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            if (callIShouldHavePutIntoIntent == null) {
                us.i();
                Notification.Builder showWhen = new Notification.Builder(this, us.k0).setContentTitle(bd.M0(2131743500, null)).setShowWhen(false);
                showWhen.setSmallIcon(R.drawable.call);
                this.foregroundStarted = true;
                if (i10 < 33) {
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
            us.i();
            Notification.Builder showWhen2 = new Notification.Builder(this, us.k0).setContentTitle(bd.M0(2131743275, null)).setShowWhen(false);
            if (this.groupCall != null) {
                showWhen2.setSmallIcon(isMicMute() ? R.drawable.voicechat_muted : R.drawable.voicechat_active);
            } else {
                showWhen2.setSmallIcon(R.drawable.call);
            }
            this.foregroundStarted = true;
            if (i10 < 33) {
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
        if (r2.a) {
            a8.b("=============== VoIPService STOPPING ===============");
        }
        stopForeground(true);
        stopRinging();
        if (this.currentAccount >= 0) {
            if (org.telegram.messenger.t0.x || !org.telegram.messenger.t0.w) {
                hp.s1(this.currentAccount).g7 = false;
            }
            hs.f(this.currentAccount).n(this, hs.I2);
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
            org.telegram.messenger.g0.r(runnable);
            this.switchingStreamTimeoutRunnable = null;
        }
        unregisterReceiver(this.receiver);
        Runnable runnable2 = this.timeoutRunnable;
        if (runnable2 != null) {
            org.telegram.messenger.g0.r(runnable2);
            this.timeoutRunnable = null;
        }
        ConferenceCall conferenceCall = this.conference;
        if (conferenceCall != null) {
            conferenceCall.destroy();
        }
        super.onDestroy();
        sharedInstance = null;
        a8.d("(5) set sharedInstance = null");
        Arrays.fill(this.mySource, 0);
        cancelGroupCheckShortPoll();
        org.telegram.messenger.g0.h3(new i(8));
        if (this.tgVoip[0] != null) {
            bz e10 = bz.e(this.currentAccount);
            int statsNetworkType = getStatsNetworkType();
            int callDuration = ((int) (getCallDuration() / 1000)) % 5;
            int[] iArr = e10.n;
            iArr[statsNetworkType] = iArr[statsNetworkType] + callDuration;
            e10.m();
            onTgVoipPreStop();
            if (this.tgVoip[0].isGroup()) {
                NativeInstance nativeInstance = this.tgVoip[0];
                p5 p5Var = Utilities.e;
                Objects.requireNonNull(nativeInstance);
                p5Var.c(new p0(nativeInstance, 3));
                Iterator<Map.Entry<String, Integer>> it = this.currentStreamRequestTimestamp.entrySet().iterator();
                while (it.hasNext()) {
                    ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.currentAccount).a).cancelRequest(it.next().getValue().intValue(), true);
                }
                this.currentStreamRequestTimestamp.clear();
            } else {
                Instance.FinalState stop = this.tgVoip[0].stop();
                updateTrafficStats(this.tgVoip[0], stop.trafficStats);
                onTgVoipStop(stop);
            }
            this.prevTrafficStats = null;
            this.callStartTime = 0L;
            this.tgVoip[0] = null;
            Instance.destroyInstance();
        }
        destroyConverting();
        NativeInstance nativeInstance2 = this.tgVoip[1];
        if (nativeInstance2 != null) {
            Utilities.e.c(new p0(nativeInstance2, 3));
            this.tgVoip[1] = null;
        }
        int i3 = 0;
        while (true) {
            long[] jArr = this.captureDevice;
            if (i3 >= jArr.length) {
                break;
            }
            long j10 = jArr[i3];
            if (j10 != 0) {
                if (this.destroyCaptureDevice[i3]) {
                    NativeInstance.destroyVideoCapturer(j10);
                }
                this.captureDevice[i3] = 0;
            }
            i3++;
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
                    p5 p5Var2 = Utilities.e;
                    q0 q0Var = new q0(audioManager, 1);
                    setModeRunnable = q0Var;
                    p5Var2.c(q0Var);
                }
                audioManager.abandonAudioFocus(this);
            }
            try {
                audioManager.unregisterMediaButtonEventReceiver(new ComponentName(this, (Class<?>) VoIPMediaButtonReceiver.class));
            } catch (Exception e11) {
                a8.g(e11, true);
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
            Utilities.e.c(new q(this, 27));
        }
        if (this.hasAudioFocus) {
            audioManager.abandonAudioFocus(this);
        }
        if (USE_CONNECTION_SERVICE) {
            if (!this.didDeleteConnectionServiceContact) {
                g5.r(this.currentAccount).h();
            }
            CallConnection callConnection = this.systemCallConnection;
            if (callConnection != null && !this.playingSound) {
                callConnection.destroy();
            }
        }
        n1.a = SystemClock.elapsedRealtime();
        setSinks(null, null);
        Runnable runnable3 = this.onDestroyRunnable;
        if (runnable3 != null) {
            runnable3.run();
        }
        int i10 = this.currentAccount;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i10).setAppPaused(true, false);
            if (t3.T(this.chat)) {
                hp.s1(this.currentAccount).V4(this.chat, this.classGuid, true, null);
            }
        }
    }

    public void onGroupCallParticipantsUpdate(TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants) {
        r3 r3Var = this.groupCall;
        if (r3Var == null || r3Var.b.id != tL_updateGroupCallParticipants.call.id) {
            return;
        }
        r3Var.l.clear();
        this.groupCall.m.clear();
        if (this.conference != null) {
            this.groupCall.p(tL_updateGroupCallParticipants, false);
            this.conference.updateParticipants(this.groupCall.e, true);
            for (int i3 = 0; i3 < this.stateListeners.size(); i3++) {
                this.stateListeners.get(i3).onStateChanged(getCallState());
            }
            r3 r3Var2 = this.groupCall;
            r3Var2.l.addAll(this.conference.getShadyLeftParticipants(r3Var2.e));
            r3 r3Var3 = this.groupCall;
            r3Var3.m.addAll(this.conference.getShadyJoiningParticipants(r3Var3.e));
            hs.f(this.currentAccount).k(hs.w2, 0L, Long.valueOf(this.groupCall.b.id), Boolean.FALSE);
        }
        long selfId = getSelfId();
        int size = tL_updateGroupCallParticipants.participants.size();
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = tL_updateGroupCallParticipants.participants.get(i10);
            if (groupCallParticipant.left) {
                int i11 = groupCallParticipant.source;
                if (i11 != 0 && i11 == this.mySource[0]) {
                    int i12 = 0;
                    for (int i13 = 0; i13 < size; i13++) {
                        TLRPC.GroupCallParticipant groupCallParticipant2 = tL_updateGroupCallParticipants.participants.get(i13);
                        if (groupCallParticipant2.self || groupCallParticipant2.source == this.mySource[0]) {
                            i12++;
                        }
                    }
                    if (i12 > 1) {
                        hangUp(2);
                        return;
                    }
                }
            } else if (zi.C1(groupCallParticipant.peer) != selfId) {
                continue;
            } else {
                int i14 = groupCallParticipant.source;
                int i15 = this.mySource[0];
                if (i14 != i15 && i15 != 0 && i14 != 0) {
                    if (r2.a) {
                        StringBuilder sb2 = new StringBuilder("source mismatch my = ");
                        sb2.append(this.mySource[0]);
                        sb2.append(" psrc = ");
                        p1.q(groupCallParticipant.source, sb2);
                    }
                    hangUp(2);
                    return;
                }
                if (t3.T(this.chat) && this.currentGroupModeStreaming && groupCallParticipant.can_self_unmute) {
                    this.switchingStream = true;
                    createGroupInstance(0, false, true);
                }
                if (groupCallParticipant.muted) {
                    setMicMute(true, false, false);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onGroupCallUpdated(TLRPC.GroupCall groupCall) {
        boolean optBoolean;
        TLRPC.TL_dataJSON tL_dataJSON;
        NativeInstance nativeInstance;
        r3 r3Var = this.groupCall;
        if (r3Var != null) {
            TLRPC.GroupCall groupCall2 = r3Var.b;
            if (groupCall2.id == groupCall.id) {
                if (groupCall2 instanceof TLRPC.TL_groupCallDiscarded) {
                    hangUp(2);
                    return;
                }
                boolean z10 = false;
                if (this.myParams != null) {
                    try {
                        optBoolean = new JSONObject(this.myParams.data).optBoolean("stream");
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    if (this.conference != null) {
                        this.groupCall.o(groupCall);
                    }
                    if ((this.currentState == 1 && optBoolean == this.currentGroupModeStreaming) || (tL_dataJSON = this.myParams) == null) {
                        return;
                    }
                    nativeInstance = this.tgVoip[0];
                    if (nativeInstance != null) {
                        this.lastGroupCallUpdate = groupCall;
                        return;
                    }
                    if (this.playedConnectedSound && optBoolean != this.currentGroupModeStreaming) {
                        this.switchingStream = true;
                    }
                    this.currentGroupModeStreaming = optBoolean;
                    try {
                        if (optBoolean) {
                            TLRPC.GroupCall groupCall3 = this.groupCall.b;
                            if (groupCall3 != null && groupCall3.rtmp_stream) {
                                z10 = true;
                            }
                            nativeInstance.prepareForStream(z10);
                        } else {
                            nativeInstance.setJoinResponsePayload(tL_dataJSON.data);
                        }
                        dispatchStateChanged(2);
                        return;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                        return;
                    }
                }
                optBoolean = false;
                if (this.conference != null) {
                }
                if (this.currentState == 1) {
                }
                nativeInstance = this.tgVoip[0];
                if (nativeInstance != null) {
                }
            }
        }
        this.lastGroupCallUpdate = groupCall;
    }

    public void onMediaButtonEvent(KeyEvent keyEvent) {
        if (keyEvent == null) {
            return;
        }
        if ((keyEvent.getKeyCode() == 79 || keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 85) && keyEvent.getAction() == 1) {
            if (this.currentState == 15) {
                acceptIncomingCall();
            } else {
                setMicMute(!isMicMute(), false, true);
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
        boolean z10 = sensorEvent.values[0] < Math.min(sensorEvent.sensor.getMaximumRange(), 3.0f);
        checkIsNear(z10);
        hs.e().k(hs.G5, Boolean.valueOf(z10));
    }

    public void onSignalBarCountChanged(int i3) {
        org.telegram.messenger.g0.h3(new x(this, i3, 0));
    }

    public void onSignalingData(TL_update.TL_updatePhoneCallSignalingData tL_updatePhoneCallSignalingData) {
        NativeInstance nativeInstance;
        if (this.user == null || (nativeInstance = this.tgVoip[0]) == null || nativeInstance.isGroup() || getCallID() != tL_updatePhoneCallSignalingData.phone_call_id) {
            return;
        }
        this.tgVoip[0].onSignalingDataReceive(tL_updatePhoneCallSignalingData.data);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i3, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        if (sharedInstance != null) {
            if (r2.a) {
                a8.d("Tried to start the VoIP service when it's already started");
            }
            return 2;
        }
        int intExtra = intent.getIntExtra("account", -1);
        this.currentAccount = intExtra;
        if (intExtra == -1) {
            throw new IllegalStateException("No account specified when starting VoIP service");
        }
        this.classGuid = ConnectionsManager.generateClassGuid();
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
            this.user = hp.s1(this.currentAccount).a2(Long.valueOf(longExtra));
        }
        if (longExtra2 != 0) {
            TLRPC.Chat M0 = hp.s1(this.currentAccount).M0(Long.valueOf(longExtra2));
            this.chat = M0;
            if (t3.T(M0)) {
                hp.s1(this.currentAccount).V4(this.chat, this.classGuid, false, null);
            }
        }
        loadResources();
        int i12 = 0;
        while (true) {
            ProxyVideoSink[] proxyVideoSinkArr = this.localSink;
            if (i12 < proxyVideoSinkArr.length) {
                proxyVideoSinkArr[i12] = new ProxyVideoSink();
                this.remoteSink[i12] = new ProxyVideoSink();
                i12++;
            } else {
                try {
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
        this.isHeadsetPlugged = ((AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)).isWiredHeadsetOn();
        if (this.chat != null && !this.createGroupCall && hp.s1(this.currentAccount).g1(this.chat.id, false, null) == null) {
            a8.l("VoIPService: trying to open group call without call " + this.chat.id);
            stopSelf();
            return 2;
        }
        if (this.videoCall) {
            if (checkSelfPermission("android.permission.CAMERA") == 0) {
                i11 = 0;
                this.captureDevice[0] = NativeInstance.createVideoCapturer(this.localSink[0], this.isFrontFaceCamera ? 1 : 0);
                if (longExtra2 != 0) {
                    this.videoState[0] = 1;
                } else {
                    this.videoState[0] = 2;
                }
            } else {
                i11 = 0;
                this.videoState[0] = 1;
            }
            if (!this.isBtHeadsetConnected && !this.isHeadsetPlugged) {
                setAudioOutput(i11);
            }
        }
        if (this.user == null && this.chat == null && this.joinConference == null) {
            if (r2.a) {
                a8.l("VoIPService: user == null AND chat == null");
            }
            stopSelf();
            return 2;
        }
        sharedInstance = this;
        a8.d("(4) set sharedInstance = this");
        synchronized (sync) {
            try {
                if (setModeRunnable != null) {
                    Utilities.e.a(setModeRunnable);
                    setModeRunnable = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        VoIPGroupNotification.hide(this);
        if (this.joinConference != null) {
            if (!hp.e1().getBoolean("callmiconstart", true)) {
                this.micMute = true;
            } else if (!nf.d("android.permission.RECORD_AUDIO")) {
                this.micMute = true;
                nf.e(new String[]{"android.permission.RECORD_AUDIO"}, new lm(new u10() { // from class: org.telegram.messenger.voip.f0
                    @Override // org.telegram.messenger.u10
                    public final void a(Object obj) {
                        VoIPService.this.lambda$onStartCommand$1((Boolean) obj);
                    }
                }, 1));
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
                    g5 r5 = g5.r(this.currentAccount);
                    TLRPC.User user = this.user;
                    r5.g(user.id, user.first_name, user.last_name);
                    telecomManager.placeCall(Uri.fromParts("tel", "+99084" + this.user.id, null), bundle);
                } else {
                    q qVar = new q(this, 22);
                    this.delayedStartOutgoingCall = qVar;
                    org.telegram.messenger.g0.i3(qVar, 2000L);
                }
                z11 = false;
            } else {
                this.micMute = true;
                z11 = false;
                startGroupCall(0, null, false);
                if (!this.isBtHeadsetConnected && !this.isHeadsetPlugged) {
                    setAudioOutput(0);
                }
            }
            if (intent.getBooleanExtra("start_incall_activity", z11)) {
                Intent addFlags = new Intent(this, (Class<?>) LaunchActivity.class).setAction(this.user != null ? "voip" : "voip_chat").addFlags(TLObject.FLAG_28);
                if (this.chat != null) {
                    addFlags.putExtra("currentAccount", this.currentAccount);
                }
                startActivity(addFlags);
            }
        } else {
            hs.e().k(hs.E2, new Object[0]);
            TL_phone.PhoneCall phoneCall = callIShouldHavePutIntoIntent;
            this.privateCall = phoneCall;
            boolean z12 = phoneCall != null && phoneCall.video;
            this.videoCall = z12;
            if (z12) {
                this.isVideoAvailable = true;
            }
            if (!z12 || this.isBtHeadsetConnected || this.isHeadsetPlugged) {
                z10 = false;
            } else {
                z10 = false;
                setAudioOutput(0);
            }
            callIShouldHavePutIntoIntent = null;
            a8.d("(3) set VoIPService.callIShouldHavePutIntoIntent = null");
            if (this.instantAccept) {
                this.instantAccept = z10;
                acceptIncomingCall();
            } else if (USE_CONNECTION_SERVICE) {
                acknowledgeCall(z10);
                showNotification();
            } else {
                acknowledgeCall(true);
            }
            if (booleanExtra) {
                Activity W = org.telegram.messenger.g0.W(this);
                if (W == null) {
                    W = LaunchActivity.K1;
                }
                if (W == null) {
                    W = org.telegram.messenger.g0.W(org.telegram.messenger.t0.b);
                }
                if (W != null) {
                    zb1.v(W, this.currentAccount);
                }
            }
        }
        initializeAccountRelatedThings();
        org.telegram.messenger.g0.h3(new q(this, 23));
        return 2;
    }

    public void playAllowTalkSound() {
        Utilities.e.c(new q(this, 3));
    }

    public void playConnectedSound() {
        Utilities.e.c(new q(this, 1));
        this.playedConnectedSound = true;
    }

    public void playStartRecordSound() {
        Utilities.e.c(new q(this, 2));
    }

    public void processMessageUpdate(zi ziVar) {
        TLRPC.Message message;
        q3 q3Var;
        if (ziVar == null || (message = ziVar.k) == null || !(message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
            return;
        }
        long B0 = zi.B0(message);
        int f12 = ziVar.f1();
        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) ziVar.k.action;
        r3 r3Var = this.groupCall;
        if (r3Var == null || (q3Var = (q3) r3Var.k.get(Long.valueOf(B0))) == null || q3Var.a != f12) {
            return;
        }
        boolean z10 = (tL_messageActionConferenceCall.missed || tL_messageActionConferenceCall.active) ? false : true;
        if (q3Var.a() != z10) {
            q3Var.b = z10;
            this.groupCall.k.put(Long.valueOf(B0), q3Var);
            hs.f(this.currentAccount).k(hs.w2, 0L, Long.valueOf(this.groupCall.b.id), Boolean.FALSE);
        }
    }

    public void registerStateListener(StateListener stateListener) {
        if (this.stateListeners.contains(stateListener)) {
            return;
        }
        this.stateListeners.add(stateListener);
        int i3 = this.currentState;
        if (i3 != 0) {
            stateListener.onStateChanged(i3);
        }
        int i10 = this.signalBarCount;
        if (i10 != 0) {
            stateListener.onSignalBarsCountChanged(i10);
        }
    }

    public void removeRemoteSink(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10) {
        if (z10) {
            ProxyVideoSink remove = this.remoteSinks.remove(groupCallParticipant.presentationEndpoint);
            if (remove != null) {
                this.tgVoip[0].removeIncomingVideoOutput(remove.nativeInstance);
                return;
            }
            return;
        }
        ProxyVideoSink remove2 = this.remoteSinks.remove(groupCallParticipant.videoEndpoint);
        if (remove2 != null) {
            this.tgVoip[0].removeIncomingVideoOutput(remove2.nativeInstance);
        }
    }

    public void requestFullScreen(TLRPC.GroupCallParticipant groupCallParticipant, boolean z10, boolean z11) {
        String str = z11 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint;
        if (str == null) {
            return;
        }
        if (z10) {
            this.tgVoip[0].setVideoEndpointQuality(str, 2);
        } else {
            this.tgVoip[0].setVideoEndpointQuality(str, 1);
        }
    }

    public void requestVideoCall(boolean z10) {
        int i3 = 0;
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance == null) {
            return;
        }
        if (!z10) {
            long j10 = this.captureDevice[0];
            if (j10 != 0) {
                nativeInstance.setupOutgoingVideoCreated(j10);
                this.destroyCaptureDevice[0] = false;
                this.isPrivateScreencast = z10;
            }
        }
        ProxyVideoSink proxyVideoSink = this.localSink[0];
        if (z10) {
            i3 = 2;
        } else if (this.isFrontFaceCamera) {
            i3 = 1;
        }
        nativeInstance.setupOutgoingVideo(proxyVideoSink, i3);
        this.isPrivateScreencast = z10;
    }

    public void sendCallRating(int i3) {
        TL_phone.PhoneCall phoneCall = this.privateCall;
        long j10 = phoneCall.id;
        long j11 = phoneCall.access_hash;
        int i10 = this.currentAccount;
        int i11 = h10.t0;
        TL_phone.setCallRating setcallrating = new TL_phone.setCallRating();
        setcallrating.rating = i3;
        setcallrating.comment = "";
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        setcallrating.peer = tL_inputPhoneCall;
        tL_inputPhoneCall.access_hash = j11;
        tL_inputPhoneCall.id = j10;
        setcallrating.user_initiative = false;
        ConnectionsManager.getInstance(i10).sendRequest(setcallrating, new g2(i11, 4));
    }

    public void setAudioOutput(int i3) {
        CallConnection callConnection;
        if (r2.a) {
            a8.b("setAudioOutput " + i3);
        }
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        boolean z10 = USE_CONNECTION_SERVICE;
        int i10 = 0;
        if (!z10 || (callConnection = this.systemCallConnection) == null) {
            if (this.audioConfigured && !z10) {
                if (i3 == 0) {
                    this.needSwitchToBluetoothAfterScoActivates = false;
                    if (this.bluetoothScoActive || this.bluetoothScoConnecting) {
                        voipAudioManager.stopBluetooth();
                        this.bluetoothScoActive = false;
                        this.bluetoothScoConnecting = false;
                    }
                    voipAudioManager.setBluetoothOn(false);
                    voipAudioManager.setSpeakerphoneOn(true);
                    this.audioRouteToSet = 1;
                } else if (i3 == 1) {
                    this.needSwitchToBluetoothAfterScoActivates = false;
                    if (this.bluetoothScoActive || this.bluetoothScoConnecting) {
                        voipAudioManager.stopBluetooth();
                        this.bluetoothScoActive = false;
                        this.bluetoothScoConnecting = false;
                    }
                    voipAudioManager.setSpeakerphoneOn(false);
                    voipAudioManager.setBluetoothOn(false);
                    this.audioRouteToSet = 0;
                } else if (i3 == 2) {
                    if (this.bluetoothScoActive) {
                        voipAudioManager.setBluetoothOn(true);
                        voipAudioManager.setSpeakerphoneOn(false);
                    } else {
                        this.needSwitchToBluetoothAfterScoActivates = true;
                        try {
                            voipAudioManager.startBluetooth();
                        } catch (Throwable th2) {
                            a8.g(th2, true);
                        }
                    }
                    this.audioRouteToSet = 2;
                }
                updateOutputGainControlState();
            } else if (i3 == 0) {
                this.audioRouteToSet = 1;
                this.speakerphoneStateToSet = true;
            } else if (i3 == 1) {
                this.audioRouteToSet = 0;
                this.speakerphoneStateToSet = false;
            } else if (i3 == 2) {
                this.audioRouteToSet = 2;
                this.speakerphoneStateToSet = false;
            }
        } else if (i3 == 0) {
            callConnection.setAudioRoute(8);
        } else if (i3 == 1) {
            callConnection.setAudioRoute(5);
        } else if (i3 == 2) {
            callConnection.setAudioRoute(2);
        }
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        while (i10 < size) {
            StateListener stateListener = arrayList.get(i10);
            i10++;
            stateListener.onAudioSettingsChanged();
        }
    }

    public void setAudioRoute(int i3) {
        if (i3 == 1) {
            setAudioOutput(0);
        } else if (i3 == 0) {
            setAudioOutput(1);
        } else if (i3 == 2) {
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
        r3 r3Var = this.groupCall;
        if (r3Var == null) {
            return;
        }
        this.groupCallPeer = inputPeer;
        r3Var.x(inputPeer);
        TLRPC.ChatFull N0 = hp.s1(this.currentAccount).N0(this.groupCall.c);
        if (N0 != null) {
            TLRPC.Peer peer = this.groupCall.J;
            N0.groupcall_default_join_as = peer;
            if (peer != null) {
                if (N0 instanceof TLRPC.TL_chatFull) {
                    N0.flags |= 32768;
                } else {
                    N0.flags |= 67108864;
                }
            } else if (N0 instanceof TLRPC.TL_chatFull) {
                N0.flags &= -32769;
            } else {
                N0.flags &= -67108865;
            }
        }
        createGroupInstance(0, true, true);
        if (this.videoState[1] == 2) {
            createGroupInstance(1, true, true);
        }
    }

    public void setLocalSink(VideoSink videoSink, boolean z10) {
        if (z10) {
            return;
        }
        this.localSink[0].setTarget(videoSink);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[LOOP:0: B:24:0x0075->B:25:0x0077, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setMicMute(boolean z10, boolean z11, boolean z12) {
        VoIPService voIPService;
        int i3;
        NativeInstance nativeInstance;
        int size;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (this.micMute == z10 || this.micSwitching) {
            return;
        }
        this.micMute = z10;
        r3 r3Var = this.groupCall;
        if (r3Var != null) {
            if (!z12 && (groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(getSelfId())) != null && groupCallParticipant.muted && !groupCallParticipant.can_self_unmute) {
                z12 = true;
            }
            if (z12) {
                voIPService = this;
                voIPService.editCallMember(h10.i(this.currentAccount).f(), Boolean.valueOf(z10), null, null, null, null);
                p5 p5Var = Utilities.e;
                q qVar = new q(this, 14);
                voIPService.updateNotificationRunnable = qVar;
                p5Var.c(qVar);
                i3 = 0;
                voIPService.unmutedByHold = voIPService.micMute && z11;
                nativeInstance = voIPService.convertingVoip;
                if (nativeInstance == null) {
                    nativeInstance.setMuteMicrophone(z10);
                } else {
                    NativeInstance nativeInstance2 = voIPService.tgVoip[0];
                    if (nativeInstance2 != null) {
                        nativeInstance2.setMuteMicrophone(z10);
                    }
                }
                ArrayList<StateListener> arrayList = voIPService.stateListeners;
                size = arrayList.size();
                while (i3 < size) {
                    StateListener stateListener = arrayList.get(i3);
                    i3++;
                    stateListener.onAudioSettingsChanged();
                }
            }
        }
        voIPService = this;
        i3 = 0;
        voIPService.unmutedByHold = voIPService.micMute && z11;
        nativeInstance = voIPService.convertingVoip;
        if (nativeInstance == null) {
        }
        ArrayList<StateListener> arrayList2 = voIPService.stateListeners;
        size = arrayList2.size();
        while (i3 < size) {
        }
    }

    public void setNoiseSupressionEnabled(boolean z10) {
        NativeInstance nativeInstance = this.tgVoip[0];
        if (nativeInstance == null) {
            return;
        }
        nativeInstance.setNoiseSuppressionEnabled(z10);
    }

    public void setParticipantVolume(TLRPC.GroupCallParticipant groupCallParticipant, int i3) {
        int i10;
        double d = i3 / 10000.0d;
        this.tgVoip[0].setVolume(groupCallParticipant.source, d);
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.presentation;
        if (tL_groupCallParticipantVideo == null || (i10 = tL_groupCallParticipantVideo.audio_source) == 0) {
            return;
        }
        this.tgVoip[0].setVolume(i10, d);
    }

    public void setParticipantsVolume() {
        if (this.tgVoip[0] != null) {
            int m10 = this.groupCall.d.m();
            for (int i3 = 0; i3 < m10; i3++) {
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.groupCall.d.n(i3);
                if (!groupCallParticipant.self && groupCallParticipant.source != 0 && (groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
                    if (groupCallParticipant.muted_by_you) {
                        setParticipantVolume(groupCallParticipant, 0);
                    } else {
                        setParticipantVolume(groupCallParticipant, t3.H(groupCallParticipant));
                    }
                }
            }
        }
    }

    public void setRemoteSink(VideoSink videoSink, boolean z10) {
        this.remoteSink[z10 ? 1 : 0].setTarget(videoSink);
    }

    public void setSinks(VideoSink videoSink, VideoSink videoSink2) {
        setSinks(videoSink, false, videoSink2);
    }

    public void setSwitchingCamera(boolean z10, boolean z11) {
        this.switchingCamera = z10;
        if (z10) {
            return;
        }
        this.isFrontFaceCamera = z11;
        for (int i3 = 0; i3 < this.stateListeners.size(); i3++) {
            this.stateListeners.get(i3).onCameraSwitch(this.isFrontFaceCamera);
        }
    }

    public void setVideoState(boolean z10, int i3) {
        int i10;
        int i11 = 0;
        char c2 = this.groupCall != null ? z10 ? 1 : 0 : (char) 0;
        NativeInstance nativeInstance = this.tgVoip[c2];
        if (nativeInstance != null) {
            this.videoState[c2] = i3;
            nativeInstance.setVideoState(i3);
            long j10 = this.captureDevice[z10 ? 1 : 0];
            if (j10 != 0) {
                NativeInstance.setVideoStateCapturer(j10, this.videoState[c2]);
            }
            if (z10) {
                return;
            }
            if (this.groupCall != null) {
                editCallMember(h10.i(this.currentAccount).f(), null, Boolean.valueOf(this.videoState[0] != 2), null, null, null);
            }
            checkIsNear();
            return;
        }
        long[] jArr = this.captureDevice;
        long j11 = jArr[z10 ? 1 : 0];
        if (j11 != 0) {
            this.videoState[c2] = i3;
            NativeInstance.setVideoStateCapturer(j11, i3);
            return;
        }
        if (i3 != 2 || (i10 = this.currentState) == 17 || i10 == 11) {
            return;
        }
        ProxyVideoSink proxyVideoSink = this.localSink[c2];
        if (z10) {
            i11 = 2;
        } else if (this.isFrontFaceCamera) {
            i11 = 1;
        }
        jArr[z10 ? 1 : 0] = NativeInstance.createVideoCapturer(proxyVideoSink, i11);
        this.videoState[c2] = 2;
    }

    public void setupCaptureDevice(boolean z10, boolean z11) {
        NativeInstance nativeInstance;
        if (!z10) {
            long j10 = this.captureDevice[z10 ? 1 : 0];
            if (j10 == 0 || (nativeInstance = this.tgVoip[z10 ? 1 : 0]) == null) {
                return;
            }
            nativeInstance.setupOutgoingVideoCreated(j10);
            this.destroyCaptureDevice[z10 ? 1 : 0] = false;
            this.videoState[z10 ? 1 : 0] = 2;
        }
        if (this.micMute == z11) {
            setMicMute(!z11, false, false);
            this.micSwitching = true;
        }
        if (this.groupCall != null) {
            editCallMember(h10.i(this.currentAccount).f(), Boolean.valueOf(!z11), Boolean.valueOf(this.videoState[0] != 2), null, null, new q(this, 20));
        }
    }

    @Override // org.telegram.messenger.voip.VoIPServiceState
    public void stopRinging() {
        synchronized (sync) {
            try {
                MediaPlayer mediaPlayer = this.ringtonePlayer;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                    this.ringtonePlayer.release();
                    this.ringtonePlayer = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Vibrator vibrator = this.vibrator;
        if (vibrator != null) {
            vibrator.cancel();
            this.vibrator = null;
        }
    }

    public void stopScreenCapture() {
        if (this.groupCall == null || this.videoState[1] != 2) {
            return;
        }
        TL_phone.leaveGroupCallPresentation leavegroupcallpresentation = new TL_phone.leaveGroupCallPresentation();
        r3 r3Var = this.groupCall;
        leavegroupcallpresentation.call = r3Var.g(r3Var.a);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(leavegroupcallpresentation, new s(this, 7));
        NativeInstance nativeInstance = this.tgVoip[1];
        if (nativeInstance != null) {
            Utilities.e.c(new p0(nativeInstance, 3));
        }
        this.mySource[1] = 0;
        this.tgVoip[1] = null;
        this.destroyCaptureDevice[1] = true;
        this.captureDevice[1] = 0;
        this.videoState[1] = 0;
        hs.f(org.telegram.messenger.c.a(this.currentAccount).a).k(hs.z2, new Object[0]);
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
        long j10 = this.captureDevice[0];
        if (j10 == 0 || this.switchingCamera) {
            return;
        }
        NativeInstance.switchCameraCapturer(j10, !this.isFrontFaceCamera);
    }

    public void switchToSpeaker() {
        org.telegram.messenger.g0.i3(new q(this, 16), 500L);
    }

    public void toggleSpeakerphoneOrShowRouteSheet(Context context, boolean z10) {
        toggleSpeakerphoneOrShowRouteSheet(context, z10, null);
    }

    public void unregisterStateListener(StateListener stateListener) {
        this.stateListeners.remove(stateListener);
    }

    public void updateCurrentForegroundType() {
        if (this.lastForegroundType == getCurrentForegroundType() || !this.foregroundStarted) {
            return;
        }
        stopForeground(true);
        if (Build.VERSION.SDK_INT < 33) {
            startForeground(this.foregroundId, this.foregroundNotification);
            return;
        }
        int i3 = this.foregroundId;
        Notification notification = this.foregroundNotification;
        int currentForegroundType = getCurrentForegroundType();
        this.lastForegroundType = currentForegroundType;
        startForeground(i3, notification, currentForegroundType);
    }

    public void updateOutputGainControlState() {
        hasRtmpStream();
    }

    private void callFailed(String str) {
        CallConnection callConnection;
        if (this.privateCall != null) {
            if (r2.a) {
                a8.b("Discarding failed call");
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
            a8.d("discardCall " + discardcall.reason);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardcall, new y(0));
        }
        try {
            throw new Exception("Call " + getCallID() + " failed with error: " + str);
        } catch (Exception e10) {
            a8.g(e10, true);
            this.lastError = str;
            org.telegram.messenger.g0.h3(new q(this, 5));
            if (TextUtils.equals(str, Instance.ERROR_LOCALIZED) && this.soundPool != null) {
                this.playingSound = true;
                Utilities.e.c(new q(this, 6));
                org.telegram.messenger.g0.i3(this.afterSoundRunnable, 1000L);
            }
            if (USE_CONNECTION_SERVICE && (callConnection = this.systemCallConnection) != null) {
                callConnection.setDisconnected(new DisconnectCause(1));
                this.systemCallConnection.destroy();
                this.systemCallConnection = null;
            }
            stopSelf();
        }
    }

    private static int getCurrentForegroundType(ContextWrapper contextWrapper, boolean z10) {
        if (Build.VERSION.SDK_INT < 29) {
            return hs.D3;
        }
        int i3 = contextWrapper.checkSelfPermission("android.permission.CAMERA") == 0 ? 64 : 0;
        if (contextWrapper.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            i3 |= 128;
        }
        if (z10) {
            i3 |= 32;
        }
        return i3 | 2;
    }

    public void setSinks(VideoSink videoSink, boolean z10, VideoSink videoSink2) {
        ProxyVideoSink proxyVideoSink = this.localSink[z10 ? 1 : 0];
        ProxyVideoSink proxyVideoSink2 = this.remoteSink[z10 ? 1 : 0];
        if (proxyVideoSink != null) {
            proxyVideoSink.setTarget(videoSink);
        }
        if (proxyVideoSink2 != null) {
            proxyVideoSink2.setTarget(videoSink2);
        }
    }

    public void toggleSpeakerphoneOrShowRouteSheet(Context context, boolean z10, Integer num) {
        CallConnection callConnection;
        int i3 = 0;
        int i10 = 1;
        if (isBluetoothHeadsetConnected() && hasEarpiece()) {
            t2 l10 = k5.l(1, context, null, false);
            l10.P = bd.M0(2131743274, null);
            l10.Q = true;
            l10.Y = num;
            l10.X = num != null ? 4 : 0;
            String M0 = bd.M0(2131743509, null);
            String M02 = bd.M0(this.isHeadsetPlugged ? 2131743511 : 2131743512, null);
            String str = this.currentBluetoothDeviceName;
            if (str == null) {
                str = bd.M0(2131743513, null);
            }
            CharSequence[] charSequenceArr = {M0, M02, str};
            int[] iArr = {R.drawable.msg_call_speaker, this.isHeadsetPlugged ? R.drawable.calls_menu_headset : R.drawable.msg_call_earpiece, R.drawable.msg_call_bluetooth};
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.messenger.voip.o0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    VoIPService.this.lambda$toggleSpeakerphoneOrShowRouteSheet$93(dialogInterface, i11);
                }
            };
            l10.M = charSequenceArr;
            l10.N = iArr;
            l10.L = onClickListener;
            l10.setOnShowListener(new lg.o(i10, l10, num));
            if (z10) {
                if (Build.VERSION.SDK_INT >= 26) {
                    l10.getWindow().setType(2038);
                } else {
                    l10.getWindow().setType(2003);
                }
            }
            l10.show();
            return;
        }
        boolean z11 = USE_CONNECTION_SERVICE;
        if (z11 && (callConnection = this.systemCallConnection) != null && callConnection.getCallAudioState() != null) {
            if (hasEarpiece()) {
                CallConnection callConnection2 = this.systemCallConnection;
                callConnection2.setAudioRoute(callConnection2.getCallAudioState().getRoute() != 8 ? 8 : 5);
            } else {
                CallConnection callConnection3 = this.systemCallConnection;
                callConnection3.setAudioRoute(callConnection3.getCallAudioState().getRoute() == 2 ? 5 : 2);
            }
        } else {
            if (this.audioConfigured && !z11) {
                VoipAudioManager voipAudioManager = VoipAudioManager.get();
                if (hasEarpiece()) {
                    voipAudioManager.setSpeakerphoneOn(!voipAudioManager.isSpeakerphoneOn());
                } else {
                    voipAudioManager.setBluetoothOn(!voipAudioManager.isBluetoothOn());
                }
                voipAudioManager.isBluetoothAndSpeakerOnAsync(new r(this, i10));
                return;
            }
            this.speakerphoneStateToSet = !this.speakerphoneStateToSet;
        }
        ArrayList<StateListener> arrayList = this.stateListeners;
        int size = arrayList.size();
        while (i3 < size) {
            StateListener stateListener = arrayList.get(i3);
            i3++;
            stateListener.onAudioSettingsChanged();
        }
    }

    private void checkIsNear(boolean z10) {
        if (z10 != this.isProximityNear) {
            if (r2.a) {
                a8.b("proximity " + z10);
            }
            this.isProximityNear = z10;
            try {
                if (z10) {
                    this.proximityWakelock.acquire();
                } else {
                    this.proximityWakelock.release(1);
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
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

    public void hangUp() {
        hangUp(0, null);
    }

    private void onTgVoipPreStop() {
    }

    public void hangUp(int i3) {
        hangUp(i3, null);
    }

    public void hangUp(Runnable runnable) {
        hangUp(0, runnable);
    }

    @Override // org.telegram.messenger.voip.VoIPServiceState
    public void declineIncomingCall() {
        declineIncomingCall(1, null);
    }

    public void startRingtoneAndVibration() {
        if (this.startedRinging) {
            return;
        }
        startRingtoneAndVibration(this.user.id);
        this.startedRinging = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createGroupInstance$67(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i3) {
    }

    private void showNotification() {
        if (this.user != null) {
            showNotification(getTitle(), getRoundAvatarBitmap(this, this.currentAccount, this.user));
        } else {
            showNotification(getTitle(), getRoundAvatarBitmap(this, this.currentAccount, this.chat));
        }
    }
}
