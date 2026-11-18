package org.telegram.ui;

import android.content.Intent;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class fc1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ hc1 a;

    public fc1(hc1 hc1Var) {
        this.a = hc1Var;
    }

    public final void a() {
        hc1 hc1Var = this.a;
        if (hc1Var.p0 != 17) {
            if (hc1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                hc1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    hc1Var.i(new ru0(this, 27));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(hc1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", hc1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", hc1Var.U0);
        intent.putExtra("can_video_call", hc1Var.U0);
        intent.putExtra("account", hc1Var.a);
        try {
            hc1Var.b.startService(intent);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    public final void b() {
        hc1 hc1Var = this.a;
        if (hc1Var.p0 == 17) {
            hc1Var.u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            hc1Var.u0.b();
        }
    }
}
