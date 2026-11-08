package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class mk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rk0 b;

    public /* synthetic */ mk0(rk0 rk0Var, int i7) {
        this.a = i7;
        this.b = rk0Var;
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
        org.telegram.messenger.g0.h3(r2.s0);
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
                rk0 rk0Var = this.b;
                org.telegram.ui.c61 c61Var = rk0Var.e;
                rk0Var.b0 = false;
                rk0Var.V = rk0Var.getScrollX() + rk0Var.W;
                tabSize = rk0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                rk0Var.U = ceil;
                rk0Var.T = ceil;
                if (rk0Var.e(ceil) && ceil >= 0 && ceil < c61Var.getChildCount()) {
                    try {
                        rk0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    rk0Var.d0 = 0.0f;
                    rk0Var.w = 0.0f;
                    View childAt = c61Var.getChildAt(ceil);
                    rk0Var.s = childAt;
                    rk0Var.c0 = childAt.getX() - rk0Var.getScrollX();
                    rk0Var.s.invalidate();
                    c61Var.invalidate();
                    rk0Var.j();
                    rk0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                rk0 rk0Var2 = this.b;
                long j3 = currentTimeMillis - rk0Var2.r0;
                int i7 = -1;
                if (j3 >= 3000) {
                    if (j3 >= 5000) {
                        max = Math.max(1, org.telegram.messenger.g0.L(4.0f));
                        break;
                    } else {
                        max = Math.max(1, org.telegram.messenger.g0.L(2.0f));
                        break;
                    }
                } else {
                    max = Math.max(1, org.telegram.messenger.g0.L(1.0f));
                    break;
                }
        }
    }
}
