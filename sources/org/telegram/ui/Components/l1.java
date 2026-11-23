package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 c;
    public final /* synthetic */ AlertDialog$Builder d;

    public /* synthetic */ l1(TLRPC.User user, org.telegram.ui.ActionBar.g2 g2Var, AlertDialog$Builder alertDialog$Builder, int i7) {
        this.a = i7;
        this.b = user;
        this.c = g2Var;
        this.d = alertDialog$Builder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.b.id);
                org.telegram.ui.ActionBar.g2 g2Var = this.c;
                if (g2Var.getMessagesController().E(bundle, g2Var, null, null)) {
                    g2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.a.M0.run();
                break;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.b.id);
                org.telegram.ui.ActionBar.g2 g2Var2 = this.c;
                if (g2Var2.getMessagesController().E(bundle2, g2Var2, null, null)) {
                    g2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.a.M0.run();
                break;
        }
    }
}
