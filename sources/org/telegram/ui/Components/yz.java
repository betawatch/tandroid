package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yz extends f2.k0 {
    public final /* synthetic */ org.telegram.ui.vq r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz(org.telegram.ui.vq vqVar, Context context) {
        super(context);
        this.r = vqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((org.telegram.messenger.AndroidUtilities.dp(21.0f) + r6.getRight()) > ((org.telegram.ui.Components.f00) r5.r.J).getMeasuredWidth()) goto L13;
     */
    @Override // f2.k0, f2.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(View view, f2.i1 i1Var) {
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
        int k9 = k(p(), view);
        int max = Math.max(180, m((int) Math.sqrt((k9 * k9) + (j10 * j10))));
        if (max > 0) {
            i1Var.b(-j10, -k9, max, this.j);
        }
    }
}
