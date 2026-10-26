package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class nh1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ ph1 a;

    public nh1(ph1 ph1Var) {
        this.a = ph1Var;
    }

    public final void a() {
        ph1 ph1Var = this.a;
        if (ph1Var.p0 != 17) {
            if (ph1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                ph1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    ph1Var.q(new my0(this, 28));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(ph1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", ph1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", ph1Var.U0);
        intent.putExtra("can_video_call", ph1Var.U0);
        intent.putExtra("account", ph1Var.a);
        try {
            ph1Var.b.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void b() {
        ph1 ph1Var = this.a;
        if (ph1Var.p0 == 17) {
            ph1Var.u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            ph1Var.u0.b();
        }
    }
}
