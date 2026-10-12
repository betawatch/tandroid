package bi;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class p2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p2(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                q5 q5Var = (q5) this.c;
                q5Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                q5Var.J0.H(new ProfileActivity(bundle, null));
                break;
            case 1:
                g90.s((g90) this.c, this.b);
                break;
            case 2:
                yy yyVar = (yy) this.c;
                MessagesController messagesController = yyVar.getMessagesController();
                long j11 = this.b;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, 0L);
                if (isDialogMuted) {
                    yyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 4);
                } else {
                    yyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 3);
                }
                zc.A(yyVar, !isDialogMuted, null).j();
                yyVar.finishPreviewFragment();
                break;
            case 3:
                Utilities.Callback callback = ((rh.q) this.c).f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.b));
                    break;
                }
                break;
            case 4:
                yh.n.Q((yh.n) this.c, this.b);
                break;
            default:
                yh.p1 p1Var = (yh.p1) this.c;
                p1Var.getClass();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    p1Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.b));
                    break;
                }
                break;
        }
    }
}
