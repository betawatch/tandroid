package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class dc1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ fc1 a;

    public dc1(fc1 fc1Var) {
        this.a = fc1Var;
    }

    public final void a() {
        fc1 fc1Var = this.a;
        if (fc1Var.o0 != 17) {
            if (fc1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                fc1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    fc1Var.i(new ru0(this, 27));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(fc1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", fc1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", fc1Var.T0);
        intent.putExtra("can_video_call", fc1Var.T0);
        intent.putExtra("account", fc1Var.a);
        try {
            fc1Var.b.startService(intent);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    public final void b() {
        fc1 fc1Var = this.a;
        if (fc1Var.o0 == 17) {
            fc1Var.t0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            fc1Var.t0.b();
        }
    }
}
