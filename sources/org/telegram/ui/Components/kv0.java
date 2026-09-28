package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
