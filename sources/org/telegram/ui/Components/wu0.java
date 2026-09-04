package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class wu0 {
    public final int a;
    public final int b;
    public final vu0 c;
    public final uu0 d;
    public final /* synthetic */ xu0 e;

    public wu0(xu0 xu0Var, Context context, int i10) {
        this.e = xu0Var;
        this.b = i10;
        int i11 = xu0Var.a2;
        xu0Var.a2 = i11 + 1;
        this.a = (i11 & 65535) | 65536;
        this.c = new vu0(this, context, i10);
        this.d = new uu0(xu0Var, context, i10, false);
    }
}
