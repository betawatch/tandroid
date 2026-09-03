package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class gi1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ ii1 a;

    public gi1(ii1 ii1Var) {
        this.a = ii1Var;
    }

    public final void a() {
        ii1 ii1Var = this.a;
        if (ii1Var.m0 != 17) {
            if (Build.VERSION.SDK_INT >= 23 && ii1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                ii1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    ii1Var.r(new sz0(this, 24));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(ii1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", ii1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", ii1Var.R0);
        intent.putExtra("can_video_call", ii1Var.R0);
        intent.putExtra("account", ii1Var.a);
        try {
            ii1Var.b.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void b() {
        ii1 ii1Var = this.a;
        if (ii1Var.m0 == 17) {
            ii1Var.r0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            ii1Var.r0.b();
        }
    }
}
