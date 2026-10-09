package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        int i11 = bw0Var.a2;
        bw0Var.a2 = i11 + 1;
        this.a = (i11 & 65535) | 65536;
        this.c = new zv0(this, context, i10);
        this.d = new yv0(bw0Var, context, i10, false);
    }
}
