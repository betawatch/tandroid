package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class h91 extends s4.e0 {
    public final /* synthetic */ gg.i0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h91(gg.i0 i0Var, Context context) {
        super(context);
        this.r = i0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((org.telegram.messenger.AndroidUtilities.dp(21.0f) + r6.getRight()) > ((org.telegram.ui.Components.n91) r5.r.J).getMeasuredWidth()) goto L13;
     */
    @Override // s4.e0, s4.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, s4.y0 y0Var) {
        int j3 = j(o(), view);
        if (j3 > 0 || (j3 == 0 && view.getLeft() - AndroidUtilities.dp(21.0f) < 0)) {
            j3 += AndroidUtilities.dp(60.0f);
        } else {
            if (j3 >= 0) {
                if (j3 == 0) {
                }
            }
            j3 -= AndroidUtilities.dp(60.0f);
        }
        int k10 = k(p(), view);
        int max = Math.max(180, m((int) Math.sqrt((k10 * k10) + (j3 * j3))));
        if (max > 0) {
            y0Var.b(-j3, -k10, max, this.j);
        }
    }
}
