package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class m00 extends s4.c0 {
    public final /* synthetic */ hg.i0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m00(hg.i0 i0Var, Context context) {
        super(context);
        this.r = i0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((org.telegram.messenger.AndroidUtilities.dp(21.0f) + r6.getRight()) > ((org.telegram.ui.Components.s00) r5.r.J).getMeasuredWidth()) goto L13;
     */
    @Override // s4.c0, s4.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, s4.w0 w0Var) {
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
            w0Var.b(-j10, -k10, max, this.j);
        }
    }
}
