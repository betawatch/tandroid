package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class c81 extends s4.d0 {
    public final /* synthetic */ gg.j0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c81(gg.j0 j0Var, Context context) {
        super(context);
        this.r = j0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((org.telegram.messenger.AndroidUtilities.dp(21.0f) + r6.getRight()) > ((org.telegram.ui.Components.h81) r5.r.J).getMeasuredWidth()) goto L13;
     */
    @Override // s4.d0, s4.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, s4.x0 x0Var) {
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
            x0Var.b(-j3, -k10, max, this.j);
        }
    }
}
