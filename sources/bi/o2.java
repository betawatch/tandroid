package bi;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o2(Object obj, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                o5 o5Var = (o5) this.c;
                o5Var.getClass();
                Bundle bundle = new Bundle();
                long j3 = this.b;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                o5Var.J0.H(new ProfileActivity(bundle, null));
                break;
            case 1:
                g80.q((g80) this.c, this.b);
                break;
            case 2:
                uy uyVar = (uy) this.c;
                MessagesController messagesController = uyVar.getMessagesController();
                long j10 = this.b;
                boolean isDialogMuted = messagesController.isDialogMuted(j10, 0L);
                if (isDialogMuted) {
                    uyVar.getNotificationsController().setDialogNotificationsSettings(j10, 0L, 4);
                } else {
                    uyVar.getNotificationsController().setDialogNotificationsSettings(j10, 0L, 3);
                }
                yc.A(uyVar, !isDialogMuted, null).j();
                uyVar.finishPreviewFragment();
                break;
            case 3:
                Utilities.Callback callback = ((rh.p) this.c).f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.b));
                    break;
                }
                break;
            case 4:
                yh.m.P((yh.m) this.c, this.b);
                break;
            default:
                yh.p1 p1Var = (yh.p1) this.c;
                p1Var.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    p1Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.b));
                    break;
                }
                break;
        }
    }
}
