package com.google.android.gms.wearable;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.ChannelClient;
import com.google.android.gms.wearable.internal.zzbc;
import java.util.List;

/* loaded from: classes.dex */
public abstract class WearableListenerService extends Service implements ChannelApi.ChannelListener {
    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    private ComponentName zza;
    private zzn zzb;
    private IBinder zzc;
    private Intent zzd;
    private Looper zze;
    private boolean zzg;
    private final Object zzf = new Object();
    private zzbc zzh = new zzbc(new zzk(this, null));

    public Looper getLooper() {
        if (this.zze == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.zze = handlerThread.getLooper();
        }
        return this.zze;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        String action;
        char c;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        switch (action.hashCode()) {
            case -1487371046:
                if (action.equals("com.google.android.gms.wearable.CAPABILITY_CHANGED")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1140095138:
                if (action.equals("com.google.android.gms.wearable.REQUEST_RECEIVED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -786751258:
                if (action.equals("com.google.android.gms.wearable.MESSAGE_RECEIVED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 915816236:
                if (action.equals("com.google.android.gms.wearable.DATA_CHANGED")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1003809169:
                if (action.equals("com.google.android.gms.wearable.CHANNEL_EVENT")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1460975593:
                if (action.equals(BIND_LISTENER_INTENT_ACTION)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1 || c == 2 || c == 3 || c == 4 || c == 5) {
            return this.zzc;
        }
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onBind: Provided bind intent (" + intent.toString() + ") is not allowed");
        }
        return null;
    }

    public void onCapabilityChanged(CapabilityInfo capabilityInfo) {
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public void onChannelClosed(Channel channel, int i, int i2) {
    }

    public void onChannelClosed(ChannelClient.Channel channel, int i, int i2) {
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public void onChannelOpened(Channel channel) {
    }

    public void onChannelOpened(ChannelClient.Channel channel) {
    }

    public void onConnectedNodes(List<Node> list) {
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.zza = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onCreate: ".concat(String.valueOf(this.zza)));
        }
        this.zzb = new zzn(this, getLooper());
        Intent intent = new Intent(BIND_LISTENER_INTENT_ACTION);
        this.zzd = intent;
        intent.setComponent(this.zza);
        this.zzc = new zzaa(this, null);
    }

    public void onDataChanged(DataEventBuffer dataEventBuffer) {
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onDestroy: ".concat(String.valueOf(this.zza)));
        }
        synchronized (this.zzf) {
            this.zzg = true;
            zzn zznVar = this.zzb;
            if (zznVar == null) {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=" + String.valueOf(this.zza));
            }
            zznVar.zzb();
        }
        super.onDestroy();
    }

    public void onEntityUpdate(zza zzaVar) {
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public void onInputClosed(Channel channel, int i, int i2) {
    }

    public void onInputClosed(ChannelClient.Channel channel, int i, int i2) {
    }

    public abstract void onMessageReceived(MessageEvent messageEvent);

    public void onNotificationReceived(zzb zzbVar) {
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public void onOutputClosed(Channel channel, int i, int i2) {
    }

    public void onOutputClosed(ChannelClient.Channel channel, int i, int i2) {
    }

    public void onPeerConnected(Node node) {
    }

    public void onPeerDisconnected(Node node) {
    }

    public Task<byte[]> onRequest(String str, String str2, byte[] bArr) {
        return null;
    }
}
