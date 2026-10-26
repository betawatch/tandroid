package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ lm0 h;

    public /* synthetic */ d70(lm0 lm0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.h = lm0Var;
        this.b = user;
        this.c = str;
        this.d = z10;
        this.e = z11;
        this.f = z12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var;
        switch (this.a) {
            case 0:
                n70 n70Var = ((i70) this.h).c;
                Context context = n70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.k3) n70Var).currentAccount;
                long j10 = -n70Var.g0;
                u6Var = ((org.telegram.ui.ActionBar.k3) n70Var).resourcesProvider;
                i11.b(context, i10, j10, this.b, this.c, this.d, this.e, this.f, u6Var);
                break;
            default:
                aw0 aw0Var = ((ku0) this.h).f;
                i11.b(aw0Var.getContext(), aw0Var.x1.getCurrentAccount(), aw0Var.l1, this.b, this.c, this.d, this.e, this.f, aw0Var.H1);
                break;
        }
    }
}
