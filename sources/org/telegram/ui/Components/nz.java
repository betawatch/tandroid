package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nz extends s4.b0 {
    public final /* synthetic */ org.telegram.ui.br r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz(org.telegram.ui.br brVar, Context context) {
        super(context);
        this.r = brVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((org.telegram.messenger.i0.L(21.0f) + r6.getRight()) > ((org.telegram.ui.Components.tz) r5.r.J).getMeasuredWidth()) goto L13;
     */
    @Override // s4.b0, s4.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, s4.x0 x0Var) {
        int j10 = j(o(), view);
        if (j10 > 0 || (j10 == 0 && view.getLeft() - org.telegram.messenger.i0.L(21.0f) < 0)) {
            j10 += org.telegram.messenger.i0.L(60.0f);
        } else {
            if (j10 >= 0) {
                if (j10 == 0) {
                }
            }
            j10 -= org.telegram.messenger.i0.L(60.0f);
        }
        int k10 = k(p(), view);
        int max = Math.max(org.telegram.messenger.zs.K2, m((int) Math.sqrt((k10 * k10) + (j10 * j10))));
        if (max > 0) {
            x0Var.b(-j10, -k10, max, this.j);
        }
    }
}
