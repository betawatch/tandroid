package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class xs0 {
    public final int a;
    public final int b;
    public final ws0 c;
    public final vs0 d;
    public final /* synthetic */ ys0 e;

    public xs0(ys0 ys0Var, Context context, int i7) {
        this.e = ys0Var;
        this.b = i7;
        int i10 = ys0Var.n2;
        ys0Var.n2 = i10 + 1;
        this.a = (i10 & 65535) | 65536;
        this.c = new ws0(this, context, i7);
        this.d = new vs0(ys0Var, context, i7, false);
    }
}
