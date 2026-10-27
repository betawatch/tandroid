package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ph1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ rh1 a;

    public ph1(rh1 rh1Var) {
        this.a = rh1Var;
    }

    public final void a() {
        rh1 rh1Var = this.a;
        if (rh1Var.p0 != 17) {
            if (rh1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                rh1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    rh1Var.q(new oy0(this, 28));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(rh1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", rh1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", rh1Var.U0);
        intent.putExtra("can_video_call", rh1Var.U0);
        intent.putExtra("account", rh1Var.a);
        try {
            rh1Var.b.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void b() {
        rh1 rh1Var = this.a;
        if (rh1Var.p0 == 17) {
            rh1Var.u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            rh1Var.u0.b();
        }
    }
}
