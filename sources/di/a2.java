package di;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cy;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a2(Object obj, long j10, int i10) {
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
                q4Var.y0.H(new ProfileActivity(bundle, null));
                break;
            case 1:
                c90.q((c90) this.c, this.b);
                break;
            case 2:
                cy cyVar = (cy) this.c;
                MessagesController messagesController = cyVar.getMessagesController();
                long j11 = this.b;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, 0L);
                if (isDialogMuted) {
                    cyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 4);
                } else {
                    cyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 3);
                }
                wc.A(cyVar, !isDialogMuted, null).j();
                cyVar.finishPreviewFragment();
                break;
            case 3:
                Utilities.Callback callback = ((sh.p) this.c).f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.b));
                    break;
                }
                break;
            case 4:
                zh.m.P((zh.m) this.c, this.b);
                break;
            default:
                zh.p1 p1Var = (zh.p1) this.c;
                p1Var.getClass();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    p1Var.dismiss();
                    U.presentFragment(ProfileActivity.t4(this.b));
                    break;
                }
                break;
        }
    }
}
