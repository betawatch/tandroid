package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 c;
    public final /* synthetic */ AlertDialog$Builder d;

    public /* synthetic */ b1(TLRPC.User user, org.telegram.ui.ActionBar.d2 d2Var, AlertDialog$Builder alertDialog$Builder, int i3) {
        this.a = i3;
        this.b = user;
        this.c = d2Var;
        this.d = alertDialog$Builder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.b.id);
                org.telegram.ui.ActionBar.d2 d2Var = this.c;
                if (d2Var.getMessagesController().E(bundle, d2Var, null, null)) {
                    d2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.a.O0.run();
                break;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.b.id);
                org.telegram.ui.ActionBar.d2 d2Var2 = this.c;
                if (d2Var2.getMessagesController().E(bundle2, d2Var2, null, null)) {
                    d2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.a.O0.run();
                break;
        }
    }
}
