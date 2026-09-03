package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c01 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n01 b;

    public /* synthetic */ c01(n01 n01Var, int i10) {
        this.a = i10;
        this.b = n01Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                n01 n01Var = this.b;
                ProfileActivity profileActivity = n01Var.e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.b1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = n01Var.e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                break;
            default:
                ProfileActivity profileActivity3 = this.b.e;
                profileActivity3.L4 = !profileActivity3.L4;
                if (!profileActivity3.K4) {
                    profileActivity3.K4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.L3);
                int i10 = profileActivity3.R5;
                if (i10 >= 0) {
                    profileActivity3.c.h1(i10, profileActivity3.S5 - profileActivity3.a.getPaddingTop());
                    break;
                }
                break;
        }
    }
}
