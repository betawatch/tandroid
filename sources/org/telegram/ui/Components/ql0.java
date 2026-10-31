package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ql0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ul0 b;

    public /* synthetic */ ql0(ul0 ul0Var, int i10) {
        this.a = i10;
        this.b = ul0Var;
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
        org.telegram.messenger.i0.g3(r2.s0);
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
                ul0 ul0Var = this.b;
                org.telegram.ui.u71 u71Var = ul0Var.e;
                ul0Var.b0 = false;
                ul0Var.V = ul0Var.getScrollX() + ul0Var.W;
                tabSize = ul0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                ul0Var.U = ceil;
                ul0Var.T = ceil;
                if (ul0Var.e(ceil) && ceil >= 0 && ceil < u71Var.getChildCount()) {
                    try {
                        ul0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ul0Var.d0 = 0.0f;
                    ul0Var.w = 0.0f;
                    View childAt = u71Var.getChildAt(ceil);
                    ul0Var.s = childAt;
                    ul0Var.c0 = childAt.getX() - ul0Var.getScrollX();
                    ul0Var.s.invalidate();
                    u71Var.invalidate();
                    ul0Var.j();
                    ul0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                ul0 ul0Var2 = this.b;
                long j10 = currentTimeMillis - ul0Var2.r0;
                int i10 = -1;
                if (j10 >= 3000) {
                    if (j10 >= 5000) {
                        max = Math.max(1, org.telegram.messenger.i0.L(4.0f));
                        break;
                    } else {
                        max = Math.max(1, org.telegram.messenger.i0.L(2.0f));
                        break;
                    }
                } else {
                    max = Math.max(1, org.telegram.messenger.i0.L(1.0f));
                    break;
                }
        }
    }
}
