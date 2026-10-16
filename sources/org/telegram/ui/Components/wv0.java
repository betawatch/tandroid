package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class wv0 {
    public final int a;
    public final int b;
    public final vv0 c;
    public final uv0 d;
    public final /* synthetic */ xv0 e;

    public wv0(xv0 xv0Var, Context context, int i10) {
        this.e = xv0Var;
        this.b = i10;
        int i11 = xv0Var.a2;
        xv0Var.a2 = i11 + 1;
        this.a = (i11 & 65535) | 65536;
        this.c = new vv0(this, context, i10);
        this.d = new uv0(xv0Var, context, i10, false);
    }
}
