package org.telegram.messenger.voip;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class VoIPPendingCall {
    private k5 accountInstance;
    private final Activity activity;
    private Handler handler;
    private jn7 notificationCenter;
    private final fn7 observer;
    private final Runnable releaseRunnable;
    private boolean released;
    private final long userId;
    private final boolean video;

    private VoIPPendingCall(Activity activity, long j, boolean z, long j2, k5 k5Var) {
        nv2 nv2Var = new nv2(this, (byte) 5);
        this.observer = nv2Var;
        azb azbVar = new azb(this, (byte) 28);
        this.releaseRunnable = azbVar;
        this.activity = activity;
        this.userId = j;
        this.video = z;
        this.accountInstance = k5Var;
        if (onConnectionStateUpdated(false)) {
            return;
        }
        jn7 f = jn7.f(yac.t0);
        this.notificationCenter = f;
        f.a(nv2Var, jn7.T1);
        Handler handler = new Handler(Looper.myLooper());
        this.handler = handler;
        handler.postDelayed(azbVar, j2);
    }

    private boolean isAirplaneMode() {
        return Settings.System.getInt(this.activity.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    private boolean isConnected(k5 k5Var) {
        return ConnectionsManager.getInstance(k5Var.a).getConnectionState() == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i, int i2, Object[] objArr) {
        if (i == jn7.T1) {
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
        uc7 s1 = uc7.s1(this.accountInstance.a);
        TLRPC.User X1 = s1.X1(Long.valueOf(this.userId));
        if (X1 != null) {
            TLRPC.UserFull Y1 = s1.Y1(X1.id);
            xkc.m(X1, this.video, Y1 != null && Y1.video_calls_available, this.activity, Y1, this.accountInstance);
        } else if (isAirplaneMode()) {
            xkc.m(null, this.video, false, this.activity, null, this.accountInstance);
        }
        release();
        return true;
    }

    public static VoIPPendingCall startOrSchedule(Activity activity, long j, boolean z, k5 k5Var) {
        return new VoIPPendingCall(activity, j, z, 1000L, k5Var);
    }

    public void release() {
        if (this.released) {
            return;
        }
        jn7 jn7Var = this.notificationCenter;
        if (jn7Var != null) {
            jn7Var.n(this.observer, jn7.T1);
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this.releaseRunnable);
        }
        this.released = true;
    }
}
