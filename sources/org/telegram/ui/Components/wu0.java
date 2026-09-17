package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
