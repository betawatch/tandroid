package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class hv0 {
    public final int a;
    public final int b;
    public final gv0 c;
    public final fv0 d;
    public final /* synthetic */ iv0 e;

    public hv0(iv0 iv0Var, Context context, int i10) {
        this.e = iv0Var;
        this.b = i10;
        int i11 = iv0Var.a2;
        iv0Var.a2 = i11 + 1;
        this.a = (i11 & 65535) | 65536;
        this.c = new gv0(this, context, i10);
        this.d = new fv0(iv0Var, context, i10, false);
    }
}
