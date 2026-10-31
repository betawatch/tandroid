package org.telegram.messenger.voip;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import org.telegram.messenger.d20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.voip.m1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class VoIPPendingCall {
    private org.telegram.messenger.c accountInstance;
    private final Activity activity;
    private Handler handler;
    private zs notificationCenter;
    private final us observer;
    private final Runnable releaseRunnable;
    private boolean released;
    private final long userId;
    private final boolean video;

    private VoIPPendingCall(Activity activity, long j10, boolean z10, long j11, org.telegram.messenger.c cVar) {
        us usVar = new us() { // from class: org.telegram.messenger.voip.r
            @Override // org.telegram.messenger.us
            public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                VoIPPendingCall.this.lambda$new$0(i10, i11, objArr);
            }
        };
        this.observer = usVar;
        v0 v0Var = new v0(this, 2);
        this.releaseRunnable = v0Var;
        this.activity = activity;
        this.userId = j10;
        this.video = z10;
        this.accountInstance = cVar;
        if (onConnectionStateUpdated(false)) {
            return;
        }
        zs f7 = zs.f(d20.s0);
        this.notificationCenter = f7;
        f7.b(usVar, zs.T1);
        Handler handler = new Handler(Looper.myLooper());
        this.handler = handler;
        handler.postDelayed(v0Var, j11);
    }

    private boolean isAirplaneMode() {
        return Settings.System.getInt(this.activity.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    private boolean isConnected(org.telegram.messenger.c cVar) {
        return ConnectionsManager.getInstance(cVar.a).getConnectionState() == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i10, int i11, Object[] objArr) {
        if (i10 == zs.T1) {
            onConnectionStateUpdated(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        onConnectionStateUpdated(true);
    }

    private boolean onConnectionStateUpdated(boolean z10) {
        if (this.released || !(z10 || isConnected(this.accountInstance) || isAirplaneMode())) {
            return false;
        }
        vp r12 = vp.r1(this.accountInstance.a);
        TLRPC.User Z1 = r12.Z1(Long.valueOf(this.userId));
        if (Z1 != null) {
            TLRPC.UserFull a2 = r12.a2(Z1.id);
            m1.m(Z1, this.video, a2 != null && a2.video_calls_available, this.activity, a2, this.accountInstance);
        } else if (isAirplaneMode()) {
            m1.m(null, this.video, false, this.activity, null, this.accountInstance);
        }
        release();
        return true;
    }

    public static VoIPPendingCall startOrSchedule(Activity activity, long j10, boolean z10, org.telegram.messenger.c cVar) {
        return new VoIPPendingCall(activity, j10, z10, 1000L, cVar);
    }

    public void release() {
        if (this.released) {
            return;
        }
        zs zsVar = this.notificationCenter;
        if (zsVar != null) {
            zsVar.n(this.observer, zs.T1);
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this.releaseRunnable);
        }
        this.released = true;
    }
}
