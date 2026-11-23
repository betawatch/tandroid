package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class it0 {
    public final int a;
    public final int b;
    public final ht0 c;
    public final gt0 d;
    public final /* synthetic */ jt0 e;

    public it0(jt0 jt0Var, Context context, int i7) {
        this.e = jt0Var;
        this.b = i7;
        int i10 = jt0Var.o2;
        jt0Var.o2 = i10 + 1;
        this.a = (i10 & 65535) | 65536;
        this.c = new ht0(this, context, i7);
        this.d = new gt0(jt0Var, context, i7, false);
    }
}
