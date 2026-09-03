package dh;

import android.os.Bundle;
import android.view.View;
import kh.g2;
import nh.d4;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qy;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                kh.s.P((kh.s) this.c, this.b);
                break;
            case 2:
                g2 g2Var = (g2) this.c;
                g2Var.getClass();
                p2 U = LaunchActivity.U();
                if (U != null) {
                    g2Var.dismiss();
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
                d4Var.G0.H(new ProfileActivity(bundle, null));
                break;
            case 4:
                i80.q((i80) this.c, this.b);
                break;
            default:
                qy qyVar = (qy) this.c;
                MessagesController messagesController = qyVar.getMessagesController();
                long j11 = this.b;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, 0L);
                if (isDialogMuted) {
                    qyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 4);
                } else {
                    qyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 3);
                }
                qc.A(qyVar, !isDialogMuted, null).j();
                qyVar.finishPreviewFragment();
                break;
        }
    }
}
