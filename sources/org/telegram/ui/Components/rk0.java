package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class rk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wk0 b;

    public /* synthetic */ rk0(wk0 wk0Var, int i7) {
        this.a = i7;
        this.b = wk0Var;
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
        org.telegram.messenger.g0.h3(r2.t0);
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
                wk0 wk0Var = this.b;
                org.telegram.ui.z51 z51Var = wk0Var.e;
                wk0Var.c0 = false;
                wk0Var.W = wk0Var.getScrollX() + wk0Var.a0;
                tabSize = wk0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                wk0Var.V = ceil;
                wk0Var.U = ceil;
                if (wk0Var.e(ceil) && ceil >= 0 && ceil < z51Var.getChildCount()) {
                    try {
                        wk0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    wk0Var.e0 = 0.0f;
                    wk0Var.w = 0.0f;
                    View childAt = z51Var.getChildAt(ceil);
                    wk0Var.s = childAt;
                    wk0Var.d0 = childAt.getX() - wk0Var.getScrollX();
                    wk0Var.s.invalidate();
                    z51Var.invalidate();
                    wk0Var.j();
                    wk0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                wk0 wk0Var2 = this.b;
                long j3 = currentTimeMillis - wk0Var2.s0;
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
