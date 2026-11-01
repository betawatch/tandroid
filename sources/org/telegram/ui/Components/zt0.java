package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class zt0 {
    public final int a;
    public final int b;
    public final yt0 c;
    public final xt0 d;
    public final /* synthetic */ au0 e;

    public zt0(au0 au0Var, Context context, int i10) {
        this.e = au0Var;
        this.b = i10;
        int i11 = au0Var.n2;
        au0Var.n2 = i11 + 1;
        this.a = (i11 & 65535) | 65536;
        this.c = new yt0(this, context, i10);
        this.d = new xt0(au0Var, context, i10, false);
    }
}
