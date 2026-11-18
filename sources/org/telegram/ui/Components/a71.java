package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class a71 extends v4.d0 {
    public final /* synthetic */ jg.i0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a71(jg.i0 i0Var, Context context) {
        super(context);
        this.r = i0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((org.telegram.messenger.g0.L(21.0f) + r6.getRight()) > ((org.telegram.ui.Components.f71) r5.r.J).getMeasuredWidth()) goto L13;
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
