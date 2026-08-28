package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kz0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vz0 b;

    public /* synthetic */ kz0(vz0 vz0Var, int i9) {
        this.a = i9;
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
                int i9 = profileActivity3.Q5;
                if (i9 >= 0) {
                    profileActivity3.c.h1(i9, profileActivity3.R5 - profileActivity3.a.getPaddingTop());
                    break;
                }
                break;
        }
    }
}
