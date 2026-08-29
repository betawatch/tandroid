package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pu0 {
    public final int a;
    public final int b;
    public final ou0 c;
    public final nu0 d;
    public final /* synthetic */ qu0 e;

    public pu0(qu0 qu0Var, Context context, int i10) {
        this.e = qu0Var;
        this.b = i10;
        int i11 = qu0Var.W1;
        qu0Var.W1 = i11 + 1;
        this.a = (i11 & 65535) | 65536;
        this.c = new ou0(this, context, i10);
        this.d = new nu0(qu0Var, context, i10, false);
    }
}
