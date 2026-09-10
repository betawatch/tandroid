package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class m80 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m80(Object obj, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                q80.q((q80) this.c, this.b);
                break;
            case 1:
                org.telegram.ui.wy wyVar = (org.telegram.ui.wy) this.c;
                MessagesController messagesController = wyVar.getMessagesController();
                long j3 = this.b;
                boolean isDialogMuted = messagesController.isDialogMuted(j3, 0L);
                if (isDialogMuted) {
                    wyVar.getNotificationsController().setDialogNotificationsSettings(j3, 0L, 4);
                } else {
                    wyVar.getNotificationsController().setDialogNotificationsSettings(j3, 0L, 3);
                }
                wc.A(wyVar, !isDialogMuted, null).j();
                wyVar.finishPreviewFragment();
                break;
            case 2:
                Utilities.Callback callback = ((ph.p) this.c).f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.b));
                    break;
                }
                break;
            case 3:
                wh.m.P((wh.m) this.c, this.b);
                break;
            case 4:
                wh.p1 p1Var = (wh.p1) this.c;
                p1Var.getClass();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    p1Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.b));
                    break;
                }
                break;
            default:
                zh.a3 a3Var = (zh.a3) this.c;
                a3Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                a3Var.J0.H(new ProfileActivity(bundle, null));
                break;
        }
    }
}
