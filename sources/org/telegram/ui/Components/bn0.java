package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.qa1;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class bn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gn0 b;

    public /* synthetic */ bn0(gn0 gn0Var, int i10) {
        this.a = i10;
        this.b = gn0Var;
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
                gn0 gn0Var = this.b;
                qa1 qa1Var = gn0Var.e;
                gn0Var.b0 = false;
                gn0Var.V = gn0Var.getScrollX() + gn0Var.W;
                tabSize = gn0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                gn0Var.U = ceil;
                gn0Var.T = ceil;
                if (gn0Var.e(ceil) && ceil >= 0 && ceil < qa1Var.getChildCount()) {
                    try {
                        gn0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    gn0Var.d0 = 0.0f;
                    gn0Var.v = 0.0f;
                    View childAt = qa1Var.getChildAt(ceil);
                    gn0Var.s = childAt;
                    gn0Var.c0 = childAt.getX() - gn0Var.getScrollX();
                    gn0Var.s.invalidate();
                    qa1Var.invalidate();
                    gn0Var.j();
                    gn0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                gn0 gn0Var2 = this.b;
                long j10 = currentTimeMillis - gn0Var2.r0;
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
