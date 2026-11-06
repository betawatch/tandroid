package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class cc1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ ec1 a;

    public cc1(ec1 ec1Var) {
        this.a = ec1Var;
    }

    public final void a() {
        ec1 ec1Var = this.a;
        if (ec1Var.o0 != 17) {
            if (ec1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                ec1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    ec1Var.i(new ru0(this, 27));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(ec1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", ec1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", ec1Var.T0);
        intent.putExtra("can_video_call", ec1Var.T0);
        intent.putExtra("account", ec1Var.a);
        try {
            ec1Var.b.startService(intent);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    public final void b() {
        ec1 ec1Var = this.a;
        if (ec1Var.o0 == 17) {
            ec1Var.t0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            ec1Var.t0.b();
        }
    }
}
