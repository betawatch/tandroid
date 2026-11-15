package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 c;
    public final /* synthetic */ AlertDialog$Builder d;

    public /* synthetic */ z0(TLRPC.User user, org.telegram.ui.ActionBar.e2 e2Var, AlertDialog$Builder alertDialog$Builder, int i7) {
        this.a = i7;
        this.b = user;
        this.c = e2Var;
        this.d = alertDialog$Builder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.b.id);
                org.telegram.ui.ActionBar.e2 e2Var = this.c;
                if (e2Var.getMessagesController().E(bundle, e2Var, null, null)) {
                    e2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.a.M0.run();
                break;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.b.id);
                org.telegram.ui.ActionBar.e2 e2Var2 = this.c;
                if (e2Var2.getMessagesController().E(bundle2, e2Var2, null, null)) {
                    e2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.a.M0.run();
                break;
        }
    }
}
