package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class kn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pn0 b;

    public /* synthetic */ kn0(pn0 pn0Var, int i10) {
        this.a = i10;
        this.b = pn0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r2.q0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r2.q0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r2.q0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        r2.scrollBy(r0 * r4, 0);
        org.telegram.messenger.AndroidUtilities.runOnUIThread(r2.s0);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int tabSize;
        int max;
        switch (this.a) {
            case 0:
                pn0 pn0Var = this.b;
                org.telegram.ui.xa1 xa1Var = pn0Var.e;
                pn0Var.b0 = false;
                pn0Var.V = pn0Var.getScrollX() + pn0Var.W;
                tabSize = pn0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                pn0Var.U = ceil;
                pn0Var.T = ceil;
                if (pn0Var.e(ceil) && ceil >= 0 && ceil < xa1Var.getChildCount()) {
                    try {
                        pn0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    pn0Var.d0 = 0.0f;
                    pn0Var.v = 0.0f;
                    View childAt = xa1Var.getChildAt(ceil);
                    pn0Var.s = childAt;
                    pn0Var.c0 = childAt.getX() - pn0Var.getScrollX();
                    pn0Var.s.invalidate();
                    xa1Var.invalidate();
                    pn0Var.j();
                    pn0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                pn0 pn0Var2 = this.b;
                long j10 = currentTimeMillis - pn0Var2.r0;
                int i10 = -1;
                if (j10 >= 3000) {
                    if (j10 >= 5000) {
                        max = Math.max(1, AndroidUtilities.dp(4.0f));
                        break;
                    } else {
                        max = Math.max(1, AndroidUtilities.dp(2.0f));
                        break;
                    }
                } else {
                    max = Math.max(1, AndroidUtilities.dp(1.0f));
                    break;
                }
        }
    }
}
