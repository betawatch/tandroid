package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class q60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ul0 h;

    public /* synthetic */ q60(ul0 ul0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.h = ul0Var;
        this.b = user;
        this.c = str;
        this.d = z10;
        this.e = z11;
        this.f = z12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        switch (this.a) {
            case 0:
                a70 a70Var = ((v60) this.h).c;
                Context context = a70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.h3) a70Var).currentAccount;
                long j3 = -a70Var.g0;
                f6Var = ((org.telegram.ui.ActionBar.h3) a70Var).resourcesProvider;
                n01.b(context, i10, j3, this.b, this.c, this.d, this.e, this.f, f6Var);
                break;
            default:
                iv0 iv0Var = ((rt0) this.h).f;
                n01.b(iv0Var.getContext(), iv0Var.v1.getCurrentAccount(), iv0Var.j1, this.b, this.c, this.d, this.e, this.f, iv0Var.F1);
                break;
        }
    }
}
