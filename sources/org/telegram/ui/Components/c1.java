package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 c;
    public final /* synthetic */ AlertDialog$Builder d;

    public /* synthetic */ c1(TLRPC.User user, org.telegram.ui.ActionBar.k2 k2Var, AlertDialog$Builder alertDialog$Builder, int i10) {
        this.a = i10;
        this.b = user;
        this.c = k2Var;
        this.d = alertDialog$Builder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.b.id);
                org.telegram.ui.ActionBar.k2 k2Var = this.c;
                if (k2Var.getMessagesController().E(bundle, k2Var, null, null)) {
                    k2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.a.N0.run();
                break;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.b.id);
                org.telegram.ui.ActionBar.k2 k2Var2 = this.c;
                if (k2Var2.getMessagesController().E(bundle2, k2Var2, null, null)) {
                    k2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.a.N0.run();
                break;
        }
    }
}
