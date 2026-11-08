package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ws0 {
    public final int a;
    public final int b;
    public final vs0 c;
    public final us0 d;
    public final /* synthetic */ xs0 e;

    public ws0(xs0 xs0Var, Context context, int i7) {
        this.e = xs0Var;
        this.b = i7;
        int i10 = xs0Var.n2;
        xs0Var.n2 = i10 + 1;
        this.a = (i10 & 65535) | 65536;
        this.c = new vs0(this, context, i7);
        this.d = new us0(xs0Var, context, i7, false);
    }
}
