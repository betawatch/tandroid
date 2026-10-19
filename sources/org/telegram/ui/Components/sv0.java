package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class sv0 {
    public final int a;
    public final int b;
    public final rv0 c;
    public final qv0 d;
    public final /* synthetic */ tv0 e;

    public sv0(tv0 tv0Var, Context context, int i10) {
        this.e = tv0Var;
        this.b = i10;
        int i11 = tv0Var.a2;
        tv0Var.a2 = i11 + 1;
        this.a = (i11 & 65535) | 65536;
        this.c = new rv0(this, context, i10);
        this.d = new qv0(tv0Var, context, i10, false);
    }
}
