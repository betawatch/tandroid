package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kz0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vz0 b;

    public /* synthetic */ kz0(vz0 vz0Var, int i10) {
        this.a = i10;
        this.b = vz0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                vz0 vz0Var = this.b;
                ProfileActivity profileActivity = vz0Var.e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.a1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = vz0Var.e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                break;
            default:
                ProfileActivity profileActivity3 = this.b.e;
                profileActivity3.K4 = !profileActivity3.K4;
                if (!profileActivity3.J4) {
                    profileActivity3.J4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.K3);
                int i10 = profileActivity3.Q5;
                if (i10 >= 0) {
                    profileActivity3.c.h1(i10, profileActivity3.R5 - profileActivity3.a.getPaddingTop());
                    break;
                }
                break;
        }
    }
}
