package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ib1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class mm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qm0 b;

    public /* synthetic */ mm0(qm0 qm0Var, int i10) {
        this.a = i10;
        this.b = qm0Var;
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
                qm0 qm0Var = this.b;
                ib1 ib1Var = qm0Var.e;
                qm0Var.V = false;
                qm0Var.S = qm0Var.getScrollX() + qm0Var.T;
                tabSize = qm0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                qm0Var.R = ceil;
                qm0Var.Q = ceil;
                if (qm0Var.e(ceil) && ceil >= 0 && ceil < ib1Var.getChildCount()) {
                    try {
                        qm0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    qm0Var.a0 = 0.0f;
                    qm0Var.v = 0.0f;
                    View childAt = ib1Var.getChildAt(ceil);
                    qm0Var.s = childAt;
                    qm0Var.W = childAt.getX() - qm0Var.getScrollX();
                    qm0Var.s.invalidate();
                    ib1Var.invalidate();
                    qm0Var.j();
                    qm0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                qm0 qm0Var2 = this.b;
                long j10 = currentTimeMillis - qm0Var2.o0;
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
