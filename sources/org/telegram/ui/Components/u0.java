package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 c;
    public final /* synthetic */ AlertDialog$Builder d;

    public /* synthetic */ u0(TLRPC.User user, org.telegram.ui.ActionBar.o2 o2Var, AlertDialog$Builder alertDialog$Builder, int i10) {
        this.a = i10;
        this.b = user;
        this.c = o2Var;
        this.d = alertDialog$Builder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", this.b.id);
                org.telegram.ui.ActionBar.o2 o2Var = this.c;
                if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var)) {
                    o2Var.presentFragment(new ProfileActivity(bundle, null));
                }
                this.d.a.L0.run();
                break;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.b.id);
                org.telegram.ui.ActionBar.o2 o2Var2 = this.c;
                if (o2Var2.getMessagesController().checkCanOpenChat(bundle2, o2Var2)) {
                    o2Var2.presentFragment(new ProfileActivity(bundle2, null));
                }
                this.d.a.L0.run();
                break;
        }
    }
}
