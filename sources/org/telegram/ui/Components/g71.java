package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g71 extends f2.n0 {
    public final /* synthetic */ of.g0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g71(of.g0 g0Var, Context context) {
        super(context);
        this.r = g0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((org.telegram.messenger.AndroidUtilities.dp(21.0f) + r6.getRight()) > ((org.telegram.ui.Components.m71) r5.r.J).getMeasuredWidth()) goto L13;
     */
    @Override // f2.n0, f2.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, f2.l1 l1Var) {
        int j10 = j(o(), view);
        if (j10 > 0 || (j10 == 0 && view.getLeft() - AndroidUtilities.dp(21.0f) < 0)) {
            j10 += AndroidUtilities.dp(60.0f);
        } else {
            if (j10 >= 0) {
                if (j10 == 0) {
                }
            }
            j10 -= AndroidUtilities.dp(60.0f);
        }
        int k10 = k(p(), view);
        int max = Math.max(180, m((int) Math.sqrt((k10 * k10) + (j10 * j10))));
        if (max > 0) {
            l1Var.b(-j10, -k10, max, this.j);
        }
    }
}
