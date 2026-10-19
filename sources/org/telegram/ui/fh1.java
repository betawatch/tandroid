package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class fh1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ hh1 a;

    public fh1(hh1 hh1Var) {
        this.a = hh1Var;
    }

    public final void a() {
        hh1 hh1Var = this.a;
        if (hh1Var.p0 != 17) {
            if (hh1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                hh1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    hh1Var.q(new qy0(this, 25));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(hh1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", hh1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", hh1Var.U0);
        intent.putExtra("can_video_call", hh1Var.U0);
        intent.putExtra("account", hh1Var.a);
        try {
            hh1Var.b.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void b() {
        hh1 hh1Var = this.a;
        if (hh1Var.p0 == 17) {
            hh1Var.u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            hh1Var.u0.b();
        }
    }
}
