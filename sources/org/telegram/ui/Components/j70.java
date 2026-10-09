package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ pm0 h;

    public /* synthetic */ j70(pm0 pm0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.h = pm0Var;
        this.b = user;
        this.c = str;
        this.d = z10;
        this.e = z11;
        this.f = z12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        switch (this.a) {
            case 0:
                t70 t70Var = ((o70) this.h).c;
                Context context = t70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) t70Var).currentAccount;
                long j3 = -t70Var.g0;
                e6Var = ((org.telegram.ui.ActionBar.f3) t70Var).resourcesProvider;
                d11.b(context, i10, j3, this.b, this.c, this.d, this.e, this.f, e6Var);
                break;
            default:
                bw0 bw0Var = ((lu0) this.h).f;
                d11.b(bw0Var.getContext(), bw0Var.v1.getCurrentAccount(), bw0Var.j1, this.b, this.c, this.d, this.e, this.f, bw0Var.F1);
                break;
        }
    }
}
