package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xu0 {
    public final int a;
    public final int b;
    public final wu0 c;
    public final vu0 d;
    public final /* synthetic */ yu0 e;

    public xu0(yu0 yu0Var, Context context, int i10) {
        this.e = yu0Var;
        this.b = i10;
        int i11 = yu0Var.X1;
        yu0Var.X1 = i11 + 1;
        this.a = (i11 & 65535) | 65536;
        this.c = new wu0(this, context, i10);
        this.d = new vu0(yu0Var, context, i10, false);
    }
}
