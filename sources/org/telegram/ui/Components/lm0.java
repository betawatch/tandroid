package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.hb1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class lm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pm0 b;

    public /* synthetic */ lm0(pm0 pm0Var, int i10) {
        this.a = i10;
        this.b = pm0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r2.n0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r2.n0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r2.n0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
    
        r2.scrollBy(r0 * r5, 0);
        org.telegram.messenger.AndroidUtilities.runOnUIThread(r2.p0);
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
                pm0 pm0Var = this.b;
                hb1 hb1Var = pm0Var.e;
                pm0Var.V = false;
                pm0Var.S = pm0Var.getScrollX() + pm0Var.T;
                tabSize = pm0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                pm0Var.R = ceil;
                pm0Var.Q = ceil;
                if (pm0Var.e(ceil) && ceil >= 0 && ceil < hb1Var.getChildCount()) {
                    try {
                        pm0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    pm0Var.a0 = 0.0f;
                    pm0Var.v = 0.0f;
                    View childAt = hb1Var.getChildAt(ceil);
                    pm0Var.s = childAt;
                    pm0Var.W = childAt.getX() - pm0Var.getScrollX();
                    pm0Var.s.invalidate();
                    hb1Var.invalidate();
                    pm0Var.j();
                    pm0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                pm0 pm0Var2 = this.b;
                long j10 = currentTimeMillis - pm0Var2.o0;
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
