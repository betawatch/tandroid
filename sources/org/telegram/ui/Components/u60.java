package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ xl0 h;

    public /* synthetic */ u60(xl0 xl0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.h = xl0Var;
        this.b = user;
        this.c = str;
        this.d = z10;
        this.e = z11;
        this.f = z12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.a) {
            case 0:
                e70 e70Var = ((z60) this.h).c;
                Context context = e70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.e3) e70Var).currentAccount;
                long j3 = -e70Var.g0;
                d6Var = ((org.telegram.ui.ActionBar.e3) e70Var).resourcesProvider;
                n01.b(context, i10, j3, this.b, this.c, this.d, this.e, this.f, d6Var);
                break;
            default:
                lv0 lv0Var = ((vt0) this.h).f;
                n01.b(lv0Var.getContext(), lv0Var.v1.getCurrentAccount(), lv0Var.j1, this.b, this.c, this.d, this.e, this.f, lv0Var.F1);
                break;
        }
    }
}
