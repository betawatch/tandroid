package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class f70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ lm0 h;

    public /* synthetic */ f70(lm0 lm0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
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
        org.telegram.ui.ActionBar.c6 c6Var;
        switch (this.a) {
            case 0:
                p70 p70Var = ((k70) this.h).c;
                Context context = p70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.e3) p70Var).currentAccount;
                long j10 = -p70Var.g0;
                c6Var = ((org.telegram.ui.ActionBar.e3) p70Var).resourcesProvider;
                z01.b(context, i10, j10, this.b, this.c, this.d, this.e, this.f, c6Var);
                break;
            default:
                xv0 xv0Var = ((hu0) this.h).f;
                z01.b(xv0Var.getContext(), xv0Var.v1.getCurrentAccount(), xv0Var.j1, this.b, this.c, this.d, this.e, this.f, xv0Var.F1);
                break;
        }
    }
}
