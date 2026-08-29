package bh;

import android.os.Bundle;
import android.view.View;
import ih.h2;
import lh.d4;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fy;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Utilities.Callback callback = ((t) this.c).f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.b));
                    break;
                }
                break;
            case 1:
                ih.t.P((ih.t) this.c, this.b);
                break;
            case 2:
                h2 h2Var = (h2) this.c;
                h2Var.getClass();
                o2 U = LaunchActivity.U();
                if (U != null) {
                    h2Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.b));
                    break;
                }
                break;
            case 3:
                d4 d4Var = (d4) this.c;
                d4Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                d4Var.F0.H(new ProfileActivity(bundle, null));
                break;
            case 4:
                c80.q((c80) this.c, this.b);
                break;
            default:
                fy fyVar = (fy) this.c;
                MessagesController messagesController = fyVar.getMessagesController();
                long j11 = this.b;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, 0L);
                if (isDialogMuted) {
                    fyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 4);
                } else {
                    fyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 3);
                }
                tc.A(fyVar, !isDialogMuted, null).j();
                fyVar.finishPreviewFragment();
                break;
        }
    }
}
