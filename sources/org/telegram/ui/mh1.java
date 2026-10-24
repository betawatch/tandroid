package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class mh1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ oh1 a;

    public mh1(oh1 oh1Var) {
        this.a = oh1Var;
    }

    public final void a() {
        oh1 oh1Var = this.a;
        if (oh1Var.p0 != 17) {
            if (oh1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                oh1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    oh1Var.q(new my0(this, 26));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(oh1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", oh1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", oh1Var.U0);
        intent.putExtra("can_video_call", oh1Var.U0);
        intent.putExtra("account", oh1Var.a);
        try {
            oh1Var.b.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void b() {
        oh1 oh1Var = this.a;
        if (oh1Var.p0 == 17) {
            oh1Var.u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            oh1Var.u0.b();
        }
    }
}
