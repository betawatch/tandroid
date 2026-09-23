package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class i60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ll0 h;

    public /* synthetic */ i60(ll0 ll0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.h = ll0Var;
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
                s60 s60Var = ((n60) this.h).c;
                Context context = s60Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) s60Var).currentAccount;
                long j3 = -s60Var.g0;
                d6Var = ((org.telegram.ui.ActionBar.f3) s60Var).resourcesProvider;
                a01.b(context, i10, j3, this.b, this.c, this.d, this.e, this.f, d6Var);
                break;
            default:
                yu0 yu0Var = ((it0) this.h).f;
                a01.b(yu0Var.getContext(), yu0Var.v1.getCurrentAccount(), yu0Var.j1, this.b, this.c, this.d, this.e, this.f, yu0Var.F1);
                break;
        }
    }
}
