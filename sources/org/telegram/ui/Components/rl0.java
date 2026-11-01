package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class rl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vl0 b;

    public /* synthetic */ rl0(vl0 vl0Var, int i10) {
        this.a = i10;
        this.b = vl0Var;
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
                vl0 vl0Var = this.b;
                org.telegram.ui.s71 s71Var = vl0Var.e;
                vl0Var.b0 = false;
                vl0Var.V = vl0Var.getScrollX() + vl0Var.W;
                tabSize = vl0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                vl0Var.U = ceil;
                vl0Var.T = ceil;
                if (vl0Var.e(ceil) && ceil >= 0 && ceil < s71Var.getChildCount()) {
                    try {
                        vl0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    vl0Var.d0 = 0.0f;
                    vl0Var.w = 0.0f;
                    View childAt = s71Var.getChildAt(ceil);
                    vl0Var.s = childAt;
                    vl0Var.c0 = childAt.getX() - vl0Var.getScrollX();
                    vl0Var.s.invalidate();
                    s71Var.invalidate();
                    vl0Var.j();
                    vl0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                vl0 vl0Var2 = this.b;
                long j10 = currentTimeMillis - vl0Var2.r0;
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
