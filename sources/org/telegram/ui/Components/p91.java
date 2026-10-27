package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class p91 extends s4.d0 {
    public final /* synthetic */ ig.j0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p91(ig.j0 j0Var, Context context) {
        super(context);
        this.r = j0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((org.telegram.messenger.AndroidUtilities.dp(21.0f) + r6.getRight()) > ((org.telegram.ui.Components.u91) r5.r.J).getMeasuredWidth()) goto L13;
     */
    @Override // s4.d0, s4.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, s4.z0 z0Var) {
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
            z0Var.b(-j10, -k10, max, this.j);
        }
    }
}
