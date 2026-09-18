package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q01 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b11 b;

    public /* synthetic */ q01(b11 b11Var, int i10) {
        this.a = i10;
        this.b = b11Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                b11 b11Var = this.b;
                ProfileActivity profileActivity = b11Var.e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.e1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = b11Var.e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                break;
            default:
                ProfileActivity profileActivity3 = this.b.e;
                profileActivity3.O4 = !profileActivity3.O4;
                if (!profileActivity3.N4) {
                    profileActivity3.N4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.O3);
                int i10 = profileActivity3.U5;
                if (i10 >= 0) {
                    profileActivity3.c.h1(i10, profileActivity3.V5 - profileActivity3.a.getPaddingTop());
                    break;
                }
                break;
        }
    }
}
