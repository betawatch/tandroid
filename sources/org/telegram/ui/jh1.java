package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class jh1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ lh1 a;

    public jh1(lh1 lh1Var) {
        this.a = lh1Var;
    }

    public final void a() {
        lh1 lh1Var = this.a;
        if (lh1Var.l0 != 17) {
            if (Build.VERSION.SDK_INT >= 23 && lh1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                lh1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    lh1Var.r(new ky0(this, 26));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(lh1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", lh1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", lh1Var.Q0);
        intent.putExtra("can_video_call", lh1Var.Q0);
        intent.putExtra("account", lh1Var.a);
        try {
            lh1Var.b.startService(intent);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public final void b() {
        lh1 lh1Var = this.a;
        if (lh1Var.l0 == 17) {
            lh1Var.q0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            lh1Var.q0.b();
        }
    }
}
