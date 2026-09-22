package ai;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                f6 f6Var = (f6) this.c;
                f6Var.getClass();
                Bundle bundle = new Bundle();
                long j3 = this.b;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                f6Var.J0.H(new ProfileActivity(bundle, null));
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
                vc.A(uyVar, !isDialogMuted, null).j();
                uyVar.finishPreviewFragment();
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
                xh.q1 q1Var = (xh.q1) this.c;
                q1Var.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    q1Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.b));
                    break;
                }
                break;
        }
    }
}
