package ai;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                r80.q((r80) this.c, this.b);
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
                xc.A(uyVar, !isDialogMuted, null).j();
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
