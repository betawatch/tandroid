package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ov0 {
    public final int a;
    public final int b;
    public final nv0 c;
    public final mv0 d;
    public final /* synthetic */ pv0 e;

    public ov0(pv0 pv0Var, Context context, int i10) {
        this.e = pv0Var;
        this.b = i10;
        int i11 = pv0Var.a2;
        pv0Var.a2 = i11 + 1;
        this.a = (i11 & 65535) | 65536;
        this.c = new nv0(this, context, i10);
        this.d = new mv0(pv0Var, context, i10, false);
    }
}
