package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a01 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l01 b;

    public /* synthetic */ a01(l01 l01Var, int i10) {
        this.a = i10;
        this.b = l01Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        l01 l01Var = this.b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = l01Var.e;
                int i11 = ProfileActivity.R6;
                profileActivity.D4();
                break;
            case 1:
                ProfileActivity profileActivity2 = l01Var.e;
                TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.e1));
                MessagesController messagesController = profileActivity2.getMessagesController();
                ProfileActivity profileActivity3 = l01Var.e;
                messagesController.openApp(profileActivity3, user, null, profileActivity3.getClassGuid(), null);
                break;
            default:
                ProfileActivity profileActivity4 = l01Var.e;
                profileActivity4.U4 = !profileActivity4.U4;
                if (!profileActivity4.T4) {
                    profileActivity4.T4 = true;
                }
                profileActivity4.N4();
                view.requestLayout();
                profileActivity4.d.m(profileActivity4.O3);
                int i12 = profileActivity4.b6;
                if (i12 >= 0) {
                    profileActivity4.c.h1(i12, profileActivity4.c6 - profileActivity4.a.getPaddingTop());
                    break;
                }
                break;
        }
    }
}
