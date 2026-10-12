package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class bj1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ dj1 a;

    public bj1(dj1 dj1Var) {
        this.a = dj1Var;
    }

    public final void a() {
        dj1 dj1Var = this.a;
        if (dj1Var.p0 != 17) {
            if (dj1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                dj1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    dj1Var.q(new uz0(this, 25));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(dj1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", dj1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", dj1Var.U0);
        intent.putExtra("can_video_call", dj1Var.U0);
        intent.putExtra("account", dj1Var.a);
        try {
            dj1Var.b.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void b() {
        dj1 dj1Var = this.a;
        if (dj1Var.p0 == 17) {
            dj1Var.u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            dj1Var.u0.b();
        }
    }
}
