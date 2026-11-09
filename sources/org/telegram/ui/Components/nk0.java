package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class nk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sk0 b;

    public /* synthetic */ nk0(sk0 sk0Var, int i7) {
        this.a = i7;
        this.b = sk0Var;
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
                sk0 sk0Var = this.b;
                org.telegram.ui.d61 d61Var = sk0Var.e;
                sk0Var.b0 = false;
                sk0Var.V = sk0Var.getScrollX() + sk0Var.W;
                tabSize = sk0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                sk0Var.U = ceil;
                sk0Var.T = ceil;
                if (sk0Var.e(ceil) && ceil >= 0 && ceil < d61Var.getChildCount()) {
                    try {
                        sk0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    sk0Var.d0 = 0.0f;
                    sk0Var.w = 0.0f;
                    View childAt = d61Var.getChildAt(ceil);
                    sk0Var.s = childAt;
                    sk0Var.c0 = childAt.getX() - sk0Var.getScrollX();
                    sk0Var.s.invalidate();
                    d61Var.invalidate();
                    sk0Var.j();
                    sk0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                sk0 sk0Var2 = this.b;
                long j3 = currentTimeMillis - sk0Var2.r0;
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
