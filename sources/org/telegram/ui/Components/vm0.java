package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.xb1;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class vm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an0 b;

    public /* synthetic */ vm0(an0 an0Var, int i10) {
        this.a = i10;
        this.b = an0Var;
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
                an0 an0Var = this.b;
                xb1 xb1Var = an0Var.e;
                an0Var.b0 = false;
                an0Var.V = an0Var.getScrollX() + an0Var.W;
                tabSize = an0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                an0Var.U = ceil;
                an0Var.T = ceil;
                if (an0Var.e(ceil) && ceil >= 0 && ceil < xb1Var.getChildCount()) {
                    try {
                        an0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    an0Var.d0 = 0.0f;
                    an0Var.v = 0.0f;
                    View childAt = xb1Var.getChildAt(ceil);
                    an0Var.s = childAt;
                    an0Var.c0 = childAt.getX() - an0Var.getScrollX();
                    an0Var.s.invalidate();
                    xb1Var.invalidate();
                    an0Var.j();
                    an0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                an0 an0Var2 = this.b;
                long j3 = currentTimeMillis - an0Var2.r0;
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
