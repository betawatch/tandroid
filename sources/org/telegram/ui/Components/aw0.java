package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class aw0 {
    public final int a;
    public final int b;
    public final zv0 c;
    public final yv0 d;
    public final /* synthetic */ bw0 e;

    public aw0(bw0 bw0Var, Context context, int i10) {
        this.e = bw0Var;
        this.b = i10;
        int i11 = bw0Var.l2;
        bw0Var.l2 = i11 + 1;
        this.a = (i11 & 65535) | 65536;
        this.c = new zv0(this, context, i10);
        this.d = new yv0(bw0Var, context, i10, false);
    }
}
