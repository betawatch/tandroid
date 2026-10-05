package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ii1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ ki1 a;

    public ii1(ki1 ki1Var) {
        this.a = ki1Var;
    }

    public final void a() {
        ki1 ki1Var = this.a;
        if (ki1Var.p0 != 17) {
            if (Build.VERSION.SDK_INT >= 23 && ki1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                ki1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    ki1Var.r(new hz0(this, 26));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(ki1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", ki1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", ki1Var.U0);
        intent.putExtra("can_video_call", ki1Var.U0);
        intent.putExtra("account", ki1Var.a);
        try {
            ki1Var.b.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void b() {
        ki1 ki1Var = this.a;
        if (ki1Var.p0 == 17) {
            ki1Var.u0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            ki1Var.u0.b();
        }
    }
}
