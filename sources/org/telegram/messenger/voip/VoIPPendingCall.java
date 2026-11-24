package org.telegram.messenger.voip;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class VoIPPendingCall {
    private j5 accountInstance;
    private final Activity activity;
    private Handler handler;
    private nm7 notificationCenter;
    private final jm7 observer;
    private final Runnable releaseRunnable;
    private boolean released;
    private final long userId;
    private final boolean video;

    private VoIPPendingCall(Activity activity, long j, boolean z, long j2, j5 j5Var) {
        dw2 dw2Var = new dw2(this, (byte) 5);
        this.observer = dw2Var;
        f8c f8cVar = new f8c(this, (byte) 19);
        this.releaseRunnable = f8cVar;
        this.activity = activity;
        this.userId = j;
        this.video = z;
        this.accountInstance = j5Var;
        if (onConnectionStateUpdated(false)) {
            return;
        }
        nm7 f = nm7.f(z8c.t0);
        this.notificationCenter = f;
        f.a(dw2Var, nm7.T1);
        Handler handler = new Handler(Looper.myLooper());
        this.handler = handler;
        handler.postDelayed(f8cVar, j2);
    }

    private boolean isAirplaneMode() {
        return Settings.System.getInt(this.activity.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    private boolean isConnected(j5 j5Var) {
        return ConnectionsManager.getInstance(j5Var.a).getConnectionState() == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i, int i2, Object[] objArr) {
        if (i == nm7.T1) {
            onConnectionStateUpdated(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        onConnectionStateUpdated(true);
    }

    private boolean onConnectionStateUpdated(boolean z) {
        if (this.released || !(z || isConnected(this.accountInstance) || isAirplaneMode())) {
            return false;
        }
        oc7 r1 = oc7.r1(this.accountInstance.a);
        TLRPC.User W1 = r1.W1(Long.valueOf(this.userId));
        if (W1 != null) {
            TLRPC.UserFull X1 = r1.X1(W1.id);
            sic.m(W1, this.video, X1 != null && X1.video_calls_available, this.activity, X1, this.accountInstance);
        } else if (isAirplaneMode()) {
            sic.m(null, this.video, false, this.activity, null, this.accountInstance);
        }
        release();
        return true;
    }

    public static VoIPPendingCall startOrSchedule(Activity activity, long j, boolean z, j5 j5Var) {
        return new VoIPPendingCall(activity, j, z, 1000L, j5Var);
    }

    public void release() {
        if (this.released) {
            return;
        }
        nm7 nm7Var = this.notificationCenter;
        if (nm7Var != null) {
            nm7Var.n(this.observer, nm7.T1);
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this.releaseRunnable);
        }
        this.released = true;
    }
}
