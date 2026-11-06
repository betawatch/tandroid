package org.telegram.messenger.voip;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.voip.y1;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class VoIPPendingCall {
    private org.telegram.messenger.c accountInstance;
    private final Activity activity;
    private Handler handler;
    private qs notificationCenter;
    private final ls observer;
    private final Runnable releaseRunnable;
    private boolean released;
    private final long userId;
    private final boolean video;

    private VoIPPendingCall(Activity activity, long j3, boolean z9, long j10, org.telegram.messenger.c cVar) {
        ls lsVar = new ls() { // from class: org.telegram.messenger.voip.o
            @Override // org.telegram.messenger.ls
            public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
                VoIPPendingCall.this.lambda$new$0(i7, i10, objArr);
            }
        };
        this.observer = lsVar;
        p0 p0Var = new p0(this, 2);
        this.releaseRunnable = p0Var;
        this.activity = activity;
        this.userId = j3;
        this.video = z9;
        this.accountInstance = cVar;
        if (onConnectionStateUpdated(false)) {
            return;
        }
        qs f10 = qs.f(p10.s0);
        this.notificationCenter = f10;
        f10.b(lsVar, qs.T1);
        Handler handler = new Handler(Looper.myLooper());
        this.handler = handler;
        handler.postDelayed(p0Var, j10);
    }

    private boolean isAirplaneMode() {
        return Settings.System.getInt(this.activity.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    private boolean isConnected(org.telegram.messenger.c cVar) {
        return ConnectionsManager.getInstance(cVar.a).getConnectionState() == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i7, int i10, Object[] objArr) {
        if (i7 == qs.T1) {
            onConnectionStateUpdated(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        onConnectionStateUpdated(true);
    }

    private boolean onConnectionStateUpdated(boolean z9) {
        if (this.released || !(z9 || isConnected(this.accountInstance) || isAirplaneMode())) {
            return false;
        }
        qp s12 = qp.s1(this.accountInstance.a);
        TLRPC.User a22 = s12.a2(Long.valueOf(this.userId));
        if (a22 != null) {
            TLRPC.UserFull b22 = s12.b2(a22.id);
            y1.m(a22, this.video, b22 != null && b22.video_calls_available, this.activity, b22, this.accountInstance);
        } else if (isAirplaneMode()) {
            y1.m(null, this.video, false, this.activity, null, this.accountInstance);
        }
        release();
        return true;
    }

    public static VoIPPendingCall startOrSchedule(Activity activity, long j3, boolean z9, org.telegram.messenger.c cVar) {
        return new VoIPPendingCall(activity, j3, z9, 1000L, cVar);
    }

    public void release() {
        if (this.released) {
            return;
        }
        qs qsVar = this.notificationCenter;
        if (qsVar != null) {
            qsVar.n(this.observer, qs.T1);
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this.releaseRunnable);
        }
        this.released = true;
    }
}
