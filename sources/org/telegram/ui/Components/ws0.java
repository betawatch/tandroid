package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
