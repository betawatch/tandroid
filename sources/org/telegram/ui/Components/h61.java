package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h61 extends u4.c0 {
    public final /* synthetic */ kg.f0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h61(kg.f0 f0Var, Context context) {
        super(context);
        this.r = f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((org.telegram.messenger.g0.L(21.0f) + r6.getRight()) > ((org.telegram.ui.Components.m61) r5.r.J).getMeasuredWidth()) goto L13;
     */
    @Override // u4.c0, u4.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, u4.y0 y0Var) {
        int j10 = j(o(), view);
        if (j10 > 0 || (j10 == 0 && view.getLeft() - org.telegram.messenger.g0.L(21.0f) < 0)) {
            j10 += org.telegram.messenger.g0.L(60.0f);
        } else {
            if (j10 >= 0) {
                if (j10 == 0) {
                }
            }
            j10 -= org.telegram.messenger.g0.L(60.0f);
        }
        int k10 = k(p(), view);
        int max = Math.max(org.telegram.messenger.hs.K2, m((int) Math.sqrt((k10 * k10) + (j10 * j10))));
        if (max > 0) {
            y0Var.b(-j10, -k10, max, this.j);
        }
    }
}
