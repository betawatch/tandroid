package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class mh1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ oh1 a;

    public mh1(oh1 oh1Var) {
        this.a = oh1Var;
    }

    public final void a() {
        oh1 oh1Var = this.a;
        if (oh1Var.l0 != 17) {
            if (Build.VERSION.SDK_INT >= 23 && oh1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                oh1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    oh1Var.r(new ky0(this, 26));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(oh1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", oh1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", oh1Var.Q0);
        intent.putExtra("can_video_call", oh1Var.Q0);
        intent.putExtra("account", oh1Var.a);
        try {
            oh1Var.b.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void b() {
        oh1 oh1Var = this.a;
        if (oh1Var.l0 == 17) {
            oh1Var.q0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            oh1Var.q0.b();
        }
    }
}
