package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class aj1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ cj1 a;

    public aj1(cj1 cj1Var) {
        this.a = cj1Var;
    }

    public final void a() {
        cj1 cj1Var = this.a;
        if (cj1Var.p0 != 17) {
            if (cj1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                cj1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    cj1Var.q(new tz0(this, 25));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(cj1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", cj1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", cj1Var.U0);
        intent.putExtra("can_video_call", cj1Var.U0);
        intent.putExtra("account", cj1Var.a);
        try {
            cj1Var.b.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void b() {
        cj1 cj1Var = this.a;
        if (cj1Var.p0 == 17) {
            cj1Var.u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            cj1Var.u0.b();
        }
    }
}
