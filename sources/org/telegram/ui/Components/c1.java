package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 c;
    public final /* synthetic */ AlertDialog$Builder d;

    public /* synthetic */ c1(TLRPC.User user, org.telegram.ui.ActionBar.f2 f2Var, AlertDialog$Builder alertDialog$Builder, int i7) {
        this.a = i7;
        this.b = user;
        this.c = f2Var;
        this.d = alertDialog$Builder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.b.id);
                org.telegram.ui.ActionBar.f2 f2Var = this.c;
                if (f2Var.getMessagesController().E(bundle, f2Var, null, null)) {
                    f2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.a.L0.run();
                break;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.b.id);
                org.telegram.ui.ActionBar.f2 f2Var2 = this.c;
                if (f2Var2.getMessagesController().E(bundle2, f2Var2, null, null)) {
                    f2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.a.L0.run();
                break;
        }
    }
}
