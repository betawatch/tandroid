package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ il0 h;

    public /* synthetic */ d60(il0 il0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.h = il0Var;
        this.b = user;
        this.c = str;
        this.d = z10;
        this.e = z11;
        this.f = z12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var;
        switch (this.a) {
            case 0:
                n60 n60Var = ((i60) this.h).c;
                Context context = n60Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) n60Var).currentAccount;
                long j10 = -n60Var.c0;
                c6Var = ((org.telegram.ui.ActionBar.f3) n60Var).resourcesProvider;
                uz0.b(context, i10, j10, this.b, this.c, this.d, this.e, this.f, c6Var);
                break;
            default:
                qu0 qu0Var = ((zs0) this.h).f;
                uz0.b(qu0Var.getContext(), qu0Var.r1.getCurrentAccount(), qu0Var.f1, this.b, this.c, this.d, this.e, this.f, qu0Var.B1);
                break;
        }
    }
}
