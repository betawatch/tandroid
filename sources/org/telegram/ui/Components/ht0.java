package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ht0 {
    public final int a;
    public final int b;
    public final gt0 c;
    public final ft0 d;
    public final /* synthetic */ it0 e;

    public ht0(it0 it0Var, Context context, int i7) {
        this.e = it0Var;
        this.b = i7;
        int i10 = it0Var.o2;
        it0Var.o2 = i10 + 1;
        this.a = (i10 & 65535) | 65536;
        this.c = new gt0(this, context, i7);
        this.d = new ft0(it0Var, context, i7, false);
    }
}
