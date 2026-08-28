package fh;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.p70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(Object obj, long j10, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                x.O((x) this.c, this.b);
                break;
            case 1:
                p2 p2Var = (p2) this.c;
                p2Var.getClass();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    p2Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.b));
                    break;
                }
                break;
            case 2:
                ih.i4 i4Var = (ih.i4) this.c;
                i4Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                i4Var.F0.H(new ProfileActivity(bundle, null));
                break;
            case 3:
                p70.q((p70) this.c, this.b);
                break;
            case 4:
                dy dyVar = (dy) this.c;
                MessagesController messagesController = dyVar.getMessagesController();
                long j11 = this.b;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, 0L);
                if (isDialogMuted) {
                    dyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 4);
                } else {
                    dyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 3);
                }
                oc.A(dyVar, !isDialogMuted, null).j();
                dyVar.finishPreviewFragment();
                break;
            default:
                Utilities.Callback callback = ((yg.p) this.c).f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.b));
                    break;
                }
                break;
        }
    }
}
