package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ln0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn0 b;

    public /* synthetic */ ln0(qn0 qn0Var, int i10) {
        this.a = i10;
        this.b = qn0Var;
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
                qn0 qn0Var = this.b;
                org.telegram.ui.za1 za1Var = qn0Var.e;
                qn0Var.b0 = false;
                qn0Var.V = qn0Var.getScrollX() + qn0Var.W;
                tabSize = qn0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                qn0Var.U = ceil;
                qn0Var.T = ceil;
                if (qn0Var.e(ceil) && ceil >= 0 && ceil < za1Var.getChildCount()) {
                    try {
                        qn0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    qn0Var.d0 = 0.0f;
                    qn0Var.v = 0.0f;
                    View childAt = za1Var.getChildAt(ceil);
                    qn0Var.s = childAt;
                    qn0Var.c0 = childAt.getX() - qn0Var.getScrollX();
                    qn0Var.s.invalidate();
                    za1Var.invalidate();
                    qn0Var.j();
                    qn0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                qn0 qn0Var2 = this.b;
                long j10 = currentTimeMillis - qn0Var2.r0;
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
