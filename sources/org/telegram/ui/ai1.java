package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ai1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ ci1 a;

    public ai1(ci1 ci1Var) {
        this.a = ci1Var;
    }

    public final void a() {
        ci1 ci1Var = this.a;
        if (ci1Var.m0 != 17) {
            if (Build.VERSION.SDK_INT >= 23 && ci1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                ci1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    ci1Var.r(new xy0(this, 25));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(ci1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", ci1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", ci1Var.R0);
        intent.putExtra("can_video_call", ci1Var.R0);
        intent.putExtra("account", ci1Var.a);
        try {
            ci1Var.b.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    public final void b() {
        ci1 ci1Var = this.a;
        if (ci1Var.m0 == 17) {
            ci1Var.r0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            ci1Var.r0.b();
        }
    }
}
