package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ys0 {
    public final int a;
    public final int b;
    public final xs0 c;
    public final ws0 d;
    public final /* synthetic */ zs0 e;

    public ys0(zs0 zs0Var, Context context, int i7) {
        this.e = zs0Var;
        this.b = i7;
        int i10 = zs0Var.n2;
        zs0Var.n2 = i10 + 1;
        this.a = (i10 & 65535) | 65536;
        this.c = new xs0(this, context, i7);
        this.d = new ws0(zs0Var, context, i7, false);
    }
}
