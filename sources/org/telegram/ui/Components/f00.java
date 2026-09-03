package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class f00 extends f2.k0 {
    public final /* synthetic */ org.telegram.ui.cr r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f00(org.telegram.ui.cr crVar, Context context) {
        super(context);
        this.r = crVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((org.telegram.messenger.AndroidUtilities.dp(21.0f) + r6.getRight()) > ((org.telegram.ui.Components.l00) r5.r.J).getMeasuredWidth()) goto L13;
     */
    @Override // f2.k0, f2.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, f2.h1 h1Var) {
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
            h1Var.b(-j10, -k10, max, this.j);
        }
    }
}
