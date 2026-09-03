package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.pb1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class km0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ om0 b;

    public /* synthetic */ km0(om0 om0Var, int i10) {
        this.a = i10;
        this.b = om0Var;
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
                om0 om0Var = this.b;
                pb1 pb1Var = om0Var.e;
                om0Var.V = false;
                om0Var.S = om0Var.getScrollX() + om0Var.T;
                tabSize = om0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                om0Var.R = ceil;
                om0Var.Q = ceil;
                if (om0Var.e(ceil) && ceil >= 0 && ceil < pb1Var.getChildCount()) {
                    try {
                        om0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    om0Var.a0 = 0.0f;
                    om0Var.v = 0.0f;
                    View childAt = pb1Var.getChildAt(ceil);
                    om0Var.s = childAt;
                    om0Var.W = childAt.getX() - om0Var.getScrollX();
                    om0Var.s.invalidate();
                    pb1Var.invalidate();
                    om0Var.j();
                    om0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                om0 om0Var2 = this.b;
                long j10 = currentTimeMillis - om0Var2.o0;
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
