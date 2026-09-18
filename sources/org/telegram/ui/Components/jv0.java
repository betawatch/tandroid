package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class jv0 {
    public final int a;
    public final int b;
    public final iv0 c;
    public final hv0 d;
    public final /* synthetic */ kv0 e;

    public jv0(kv0 kv0Var, Context context, int i10) {
        this.e = kv0Var;
        this.b = i10;
        int i11 = kv0Var.a2;
        kv0Var.a2 = i11 + 1;
        this.a = (i11 & 65535) | 65536;
        this.c = new iv0(this, context, i10);
        this.d = new hv0(kv0Var, context, i10, false);
    }
}
