package eh;

import android.os.Bundle;
import android.view.View;
import lh.g2;
import oh.f4;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.py;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Utilities.Callback callback = ((u) this.c).f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.b));
                    break;
                }
                break;
            case 1:
                lh.s.P((lh.s) this.c, this.b);
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
                f4 f4Var = (f4) this.c;
                f4Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                f4Var.G0.H(new ProfileActivity(bundle, null));
                break;
            case 4:
                j80.q((j80) this.c, this.b);
                break;
            default:
                py pyVar = (py) this.c;
                MessagesController messagesController = pyVar.getMessagesController();
                long j11 = this.b;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, 0L);
                if (isDialogMuted) {
                    pyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 4);
                } else {
                    pyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 3);
                }
                qc.A(pyVar, !isDialogMuted, null).j();
                pyVar.finishPreviewFragment();
                break;
        }
    }
}
