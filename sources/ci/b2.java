package ci;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ey;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b2(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                q4 q4Var = (q4) this.c;
                q4Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                q4Var.J0.H(new ProfileActivity(bundle, null));
                break;
            case 1:
                a90.r((a90) this.c, this.b);
                break;
            case 2:
                ey eyVar = (ey) this.c;
                MessagesController messagesController = eyVar.getMessagesController();
                long j11 = this.b;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, 0L);
                if (isDialogMuted) {
                    eyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 4);
                } else {
                    eyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 3);
                }
                xc.A(eyVar, !isDialogMuted, null).j();
                eyVar.finishPreviewFragment();
                break;
            case 3:
                Utilities.Callback callback = ((rh.p) this.c).f;
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
