package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vs0 {
    public final int a;
    public final int b;
    public final us0 c;
    public final ts0 d;
    public final /* synthetic */ ws0 e;

    public vs0(ws0 ws0Var, Context context, int i3) {
        this.e = ws0Var;
        this.b = i3;
        int i10 = ws0Var.o2;
        ws0Var.o2 = i10 + 1;
        this.a = (i10 & 65535) | 65536;
        this.c = new us0(this, context, i3);
        this.d = new ts0(ws0Var, context, i3, false);
    }
}
