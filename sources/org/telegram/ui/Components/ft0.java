package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ft0 {
    public final int a;
    public final int b;
    public final et0 c;
    public final dt0 d;
    public final /* synthetic */ gt0 e;

    public ft0(gt0 gt0Var, Context context, int i7) {
        this.e = gt0Var;
        this.b = i7;
        int i10 = gt0Var.o2;
        gt0Var.o2 = i10 + 1;
        this.a = (i10 & 65535) | 65536;
        this.c = new et0(this, context, i7);
        this.d = new dt0(gt0Var, context, i7, false);
    }
}
