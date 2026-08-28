package org.telegram.ui;

import android.content.Intent;
import android.os.Build;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kh1 implements org.telegram.ui.Components.voip.d {
    public final /* synthetic */ mh1 a;

    public kh1(mh1 mh1Var) {
        this.a = mh1Var;
    }

    public final void a() {
        mh1 mh1Var = this.a;
        if (mh1Var.l0 != 17) {
            if (Build.VERSION.SDK_INT >= 23 && mh1Var.b.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                mh1Var.b.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
                return;
            } else {
                if (VoIPService.getSharedState() != null) {
                    mh1Var.r(new ky0(this, 26));
                    return;
                }
                return;
            }
        }
        Intent intent = new Intent(mh1Var.b, (Class<?>) VoIPService.class);
        intent.putExtra("user_id", mh1Var.d.id);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", false);
        intent.putExtra("video_call", mh1Var.Q0);
        intent.putExtra("can_video_call", mh1Var.Q0);
        intent.putExtra("account", mh1Var.a);
        try {
            mh1Var.b.startService(intent);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public final void b() {
        mh1 mh1Var = this.a;
        if (mh1Var.l0 == 17) {
            mh1Var.q0.b();
        } else if (VoIPService.getSharedState() != null) {
            VoIPService.getSharedState().declineIncomingCall();
        } else {
            mh1Var.q0.b();
        }
    }
}
