package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class rv0 {
    public final int a;
    public final int b;
    public final qv0 c;
    public final pv0 d;
    public final /* synthetic */ sv0 e;

    public rv0(sv0 sv0Var, Context context, int i10) {
        this.e = sv0Var;
        this.b = i10;
        int i11 = sv0Var.a2;
        sv0Var.a2 = i11 + 1;
        this.a = (i11 & 65535) | 65536;
        this.c = new qv0(this, context, i10);
        this.d = new pv0(sv0Var, context, i10, false);
    }
}
