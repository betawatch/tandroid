package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ vl0 h;

    public /* synthetic */ s60(vl0 vl0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.h = vl0Var;
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
                c70 c70Var = ((x60) this.h).c;
                Context context = c70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.e3) c70Var).currentAccount;
                long j3 = -c70Var.g0;
                d6Var = ((org.telegram.ui.ActionBar.e3) c70Var).resourcesProvider;
                l01.b(context, i10, j3, this.b, this.c, this.d, this.e, this.f, d6Var);
                break;
            default:
                jv0 jv0Var = ((tt0) this.h).f;
                l01.b(jv0Var.getContext(), jv0Var.v1.getCurrentAccount(), jv0Var.j1, this.b, this.c, this.d, this.e, this.f, jv0Var.F1);
                break;
        }
    }
}
