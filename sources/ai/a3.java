package ai;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ry;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class a3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a3(Object obj, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                e6 e6Var = (e6) this.c;
                e6Var.getClass();
                Bundle bundle = new Bundle();
                long j3 = this.b;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                e6Var.J0.H(new ProfileActivity(bundle, null));
                break;
            case 1:
                h80.q((h80) this.c, this.b);
                break;
            case 2:
                ry ryVar = (ry) this.c;
                MessagesController messagesController = ryVar.getMessagesController();
                long j10 = this.b;
                boolean isDialogMuted = messagesController.isDialogMuted(j10, 0L);
                if (isDialogMuted) {
                    ryVar.getNotificationsController().setDialogNotificationsSettings(j10, 0L, 4);
                } else {
                    ryVar.getNotificationsController().setDialogNotificationsSettings(j10, 0L, 3);
                }
                xc.A(ryVar, !isDialogMuted, null).j();
                ryVar.finishPreviewFragment();
                break;
            case 3:
                Utilities.Callback callback = ((qh.p) this.c).f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.b));
                    break;
                }
                break;
            case 4:
                xh.m.P((xh.m) this.c, this.b);
                break;
            default:
                xh.r1 r1Var = (xh.r1) this.c;
                r1Var.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    r1Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.b));
                    break;
                }
                break;
        }
    }
}
