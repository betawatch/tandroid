package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
        int i11 = xv0Var.b2;
        xv0Var.b2 = i11 + 1;
        this.a = (i11 & 65535) | 65536;
        this.c = new vv0(this, context, i10);
        this.d = new uv0(xv0Var, context, i10, false);
    }
}
