package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gu0 {
    public final int a;
    public final int b;
    public final fu0 c;
    public final eu0 d;
    public final /* synthetic */ hu0 e;

    public gu0(hu0 hu0Var, Context context, int i10) {
        this.e = hu0Var;
        this.b = i10;
        int i11 = hu0Var.W1;
        hu0Var.W1 = i11 + 1;
        this.a = (i11 & 65535) | 65536;
        this.c = new fu0(this, context, i10);
        this.d = new eu0(hu0Var, context, i10, false);
    }
}
