package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class gc1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ ic1 a;

    public gc1(ic1 ic1Var) {
        this.a = ic1Var;
    }

    public final void a() {
        ic1 ic1Var = this.a;
        if (ic1Var.o0 != 17) {
            if (ic1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                ic1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    ic1Var.i(new tu0(this, 27));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(ic1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", ic1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", ic1Var.T0);
        intent.putExtra("can_video_call", ic1Var.T0);
        intent.putExtra("account", ic1Var.a);
        try {
            ic1Var.b.startService(intent);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    public final void b() {
        ic1 ic1Var = this.a;
        if (ic1Var.o0 == 17) {
            ic1Var.t0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            ic1Var.t0.b();
        }
    }
}
