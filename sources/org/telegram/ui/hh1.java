package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class hh1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ jh1 a;

    public hh1(jh1 jh1Var) {
        this.a = jh1Var;
    }

    public final void a() {
        jh1 jh1Var = this.a;
        if (jh1Var.p0 != 17) {
            if (jh1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                jh1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    jh1Var.q(new sy0(this, 25));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(jh1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", jh1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", jh1Var.U0);
        intent.putExtra("can_video_call", jh1Var.U0);
        intent.putExtra("account", jh1Var.a);
        try {
            jh1Var.b.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void b() {
        jh1 jh1Var = this.a;
        if (jh1Var.p0 == 17) {
            jh1Var.u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            jh1Var.u0.b();
        }
    }
}
