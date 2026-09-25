package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ki1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ mi1 a;

    public ki1(mi1 mi1Var) {
        this.a = mi1Var;
    }

    public final void a() {
        mi1 mi1Var = this.a;
        if (mi1Var.p0 != 17) {
            if (Build.VERSION.SDK_INT >= 23 && mi1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                mi1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    mi1Var.r(new vz0(this, 24));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(mi1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", mi1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", mi1Var.U0);
        intent.putExtra("can_video_call", mi1Var.U0);
        intent.putExtra("account", mi1Var.a);
        try {
            mi1Var.b.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void b() {
        mi1 mi1Var = this.a;
        if (mi1Var.p0 == 17) {
            mi1Var.u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            mi1Var.u0.b();
        }
    }
}
