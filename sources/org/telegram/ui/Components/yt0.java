package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yt0 {
    public final int a;
    public final int b;
    public final xt0 c;
    public final wt0 d;
    public final /* synthetic */ zt0 e;

    public yt0(zt0 zt0Var, Context context, int i10) {
        this.e = zt0Var;
        this.b = i10;
        int i11 = zt0Var.n2;
        zt0Var.n2 = i11 + 1;
        this.a = (i11 & 65535) | 65536;
        this.c = new xt0(this, context, i10);
        this.d = new wt0(zt0Var, context, i10, false);
    }
}
