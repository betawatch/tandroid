package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class p81 extends s4.d0 {
    public final /* synthetic */ fg.i0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p81(fg.i0 i0Var, Context context) {
        super(context);
        this.r = i0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((org.telegram.messenger.AndroidUtilities.dp(21.0f) + r6.getRight()) > ((org.telegram.ui.Components.u81) r5.r.J).getMeasuredWidth()) goto L13;
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
