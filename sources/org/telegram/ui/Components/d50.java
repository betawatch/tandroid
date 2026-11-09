package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ pj0 h;

    public /* synthetic */ d50(pj0 pj0Var, TLRPC.User user, String str, boolean z9, boolean z10, boolean z11, int i7) {
        this.a = i7;
        this.h = pj0Var;
        this.b = user;
        this.c = str;
        this.d = z9;
        this.e = z10;
        this.f = z11;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                n50 n50Var = ((i50) this.h).c;
                fy0.b(n50Var.getContext(), n50Var.a, -n50Var.X1, this.b, this.c, this.d, this.e, this.f, n50Var.I0);
                break;
            default:
                zs0 zs0Var = ((mr0) this.h).f;
                fy0.b(zs0Var.getContext(), zs0Var.x1.getCurrentAccount(), zs0Var.l1, this.b, this.c, this.d, this.e, this.f, zs0Var.H1);
                break;
        }
    }
}
