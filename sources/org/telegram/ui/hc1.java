package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class hc1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ jc1 a;

    public hc1(jc1 jc1Var) {
        this.a = jc1Var;
    }

    public final void a() {
        jc1 jc1Var = this.a;
        if (jc1Var.o0 != 17) {
            if (jc1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                jc1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    jc1Var.i(new uu0(this, 27));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(jc1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", jc1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", jc1Var.T0);
        intent.putExtra("can_video_call", jc1Var.T0);
        intent.putExtra("account", jc1Var.a);
        try {
            jc1Var.b.startService(intent);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    public final void b() {
        jc1 jc1Var = this.a;
        if (jc1Var.o0 == 17) {
            jc1Var.t0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            jc1Var.t0.b();
        }
    }
}
