package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class jz extends v4.d0 {
    public final /* synthetic */ jg.i0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz(jg.i0 i0Var, Context context) {
        super(context);
        this.r = i0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((org.telegram.messenger.g0.L(21.0f) + r6.getRight()) > ((org.telegram.ui.Components.pz) r5.r.J).getMeasuredWidth()) goto L13;
     */
    @Override // v4.d0, v4.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, v4.a1 a1Var) {
        int j3 = j(o(), view);
        if (j3 > 0 || (j3 == 0 && view.getLeft() - org.telegram.messenger.g0.L(21.0f) < 0)) {
            j3 += org.telegram.messenger.g0.L(60.0f);
        } else {
            if (j3 >= 0) {
                if (j3 == 0) {
                }
            }
            j3 -= org.telegram.messenger.g0.L(60.0f);
        }
        int k10 = k(p(), view);
        int max = Math.max(org.telegram.messenger.ks.K2, m((int) Math.sqrt((k10 * k10) + (j3 * j3))));
        if (max > 0) {
            a1Var.b(-j3, -k10, max, this.j);
        }
    }
}
