package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ub1;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class pm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ um0 b;

    public /* synthetic */ pm0(um0 um0Var, int i10) {
        this.a = i10;
        this.b = um0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r2.q0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r2.q0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r2.q0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
    
        r2.scrollBy(r0 * r5, 0);
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
                um0 um0Var = this.b;
                ub1 ub1Var = um0Var.e;
                um0Var.b0 = false;
                um0Var.V = um0Var.getScrollX() + um0Var.W;
                tabSize = um0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                um0Var.U = ceil;
                um0Var.T = ceil;
                if (um0Var.e(ceil) && ceil >= 0 && ceil < ub1Var.getChildCount()) {
                    try {
                        um0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    um0Var.d0 = 0.0f;
                    um0Var.v = 0.0f;
                    View childAt = ub1Var.getChildAt(ceil);
                    um0Var.s = childAt;
                    um0Var.c0 = childAt.getX() - um0Var.getScrollX();
                    um0Var.s.invalidate();
                    ub1Var.invalidate();
                    um0Var.j();
                    um0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                um0 um0Var2 = this.b;
                long j3 = currentTimeMillis - um0Var2.r0;
                int i10 = -1;
                if (j3 >= 3000) {
                    if (j3 >= 5000) {
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
