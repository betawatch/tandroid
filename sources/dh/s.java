package dh;

import android.os.Bundle;
import android.view.View;
import kh.h2;
import nh.d4;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.oy;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                h2 h2Var = (h2) this.c;
                h2Var.getClass();
                p2 U = LaunchActivity.U();
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
                d4Var.G0.H(new ProfileActivity(bundle, null));
                break;
            case 4:
                h80.q((h80) this.c, this.b);
                break;
            default:
                oy oyVar = (oy) this.c;
                MessagesController messagesController = oyVar.getMessagesController();
                long j11 = this.b;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, 0L);
                if (isDialogMuted) {
                    oyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 4);
                } else {
                    oyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 3);
                }
                qc.A(oyVar, !isDialogMuted, null).j();
                oyVar.finishPreviewFragment();
                break;
        }
    }
}
