package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class pv0 {
    public final int a;
    public final int b;
    public final ov0 c;
    public final nv0 d;
    public final /* synthetic */ qv0 e;

    public pv0(qv0 qv0Var, Context context, int i10) {
        this.e = qv0Var;
        this.b = i10;
        int i11 = qv0Var.a2;
        qv0Var.a2 = i11 + 1;
        this.a = (i11 & 65535) | 65536;
        this.c = new ov0(this, context, i10);
        this.d = new nv0(qv0Var, context, i10, false);
    }
}
