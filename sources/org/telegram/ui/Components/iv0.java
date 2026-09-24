package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class iv0 {
    public final int a;
    public final int b;
    public final hv0 c;
    public final gv0 d;
    public final /* synthetic */ jv0 e;

    public iv0(jv0 jv0Var, Context context, int i10) {
        this.e = jv0Var;
        this.b = i10;
        int i11 = jv0Var.a2;
        jv0Var.a2 = i11 + 1;
        this.a = (i11 & 65535) | 65536;
        this.c = new hv0(this, context, i10);
        this.d = new gv0(jv0Var, context, i10, false);
    }
}
