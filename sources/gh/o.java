package gh;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.t70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.gy;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                v.P((v) this.c, this.b);
                break;
            case 1:
                k2 k2Var = (k2) this.c;
                k2Var.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    k2Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.b));
                    break;
                }
                break;
            case 2:
                jh.e4 e4Var = (jh.e4) this.c;
                e4Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                e4Var.F0.H(new ProfileActivity(bundle, null));
                break;
            case 3:
                t70.r((t70) this.c, this.b);
                break;
            case 4:
                gy gyVar = (gy) this.c;
                MessagesController messagesController = gyVar.getMessagesController();
                long j11 = this.b;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, 0L);
                if (isDialogMuted) {
                    gyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 4);
                } else {
                    gyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 3);
                }
                mc.A(gyVar, !isDialogMuted, null).j();
                gyVar.finishPreviewFragment();
                break;
            default:
                Utilities.Callback callback = ((zg.q) this.c).f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.b));
                    break;
                }
                break;
        }
    }
}
