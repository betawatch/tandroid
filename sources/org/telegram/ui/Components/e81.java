package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e81 extends f2.j0 {
    public final /* synthetic */ org.telegram.ui.dr r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e81(org.telegram.ui.dr drVar, Context context) {
        super(context);
        this.r = drVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((org.telegram.messenger.AndroidUtilities.dp(21.0f) + r6.getRight()) > ((org.telegram.ui.Components.k81) r5.r.J).getMeasuredWidth()) goto L13;
     */
    @Override // f2.j0, f2.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, f2.g1 g1Var) {
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
            g1Var.b(-j10, -k10, max, this.j);
        }
    }
}
