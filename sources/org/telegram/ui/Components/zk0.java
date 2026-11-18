package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class zk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ el0 b;

    public /* synthetic */ zk0(el0 el0Var, int i7) {
        this.a = i7;
        this.b = el0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r2.r0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r2.r0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r2.r0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        r2.scrollBy(r0 * r4, 0);
        org.telegram.messenger.g0.g3(r2.t0);
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
                el0 el0Var = this.b;
                org.telegram.ui.d61 d61Var = el0Var.e;
                el0Var.c0 = false;
                el0Var.W = el0Var.getScrollX() + el0Var.a0;
                tabSize = el0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                el0Var.V = ceil;
                el0Var.U = ceil;
                if (el0Var.e(ceil) && ceil >= 0 && ceil < d61Var.getChildCount()) {
                    try {
                        el0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    el0Var.e0 = 0.0f;
                    el0Var.w = 0.0f;
                    View childAt = d61Var.getChildAt(ceil);
                    el0Var.s = childAt;
                    el0Var.d0 = childAt.getX() - el0Var.getScrollX();
                    el0Var.s.invalidate();
                    d61Var.invalidate();
                    el0Var.j();
                    el0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                el0 el0Var2 = this.b;
                long j3 = currentTimeMillis - el0Var2.s0;
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
