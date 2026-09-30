package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class kv0 {
    public final int a;
    public final int b;
    public final jv0 c;
    public final iv0 d;
    public final /* synthetic */ lv0 e;

    public kv0(lv0 lv0Var, Context context, int i10) {
        this.e = lv0Var;
        this.b = i10;
        int i11 = lv0Var.a2;
        lv0Var.a2 = i11 + 1;
        this.a = (i11 & 65535) | 65536;
        this.c = new jv0(this, context, i10);
        this.d = new iv0(lv0Var, context, i10, false);
    }
}
