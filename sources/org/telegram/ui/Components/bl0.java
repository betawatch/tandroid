package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class bl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gl0 b;

    public /* synthetic */ bl0(gl0 gl0Var, int i7) {
        this.a = i7;
        this.b = gl0Var;
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
                gl0 gl0Var = this.b;
                org.telegram.ui.b61 b61Var = gl0Var.e;
                gl0Var.c0 = false;
                gl0Var.W = gl0Var.getScrollX() + gl0Var.a0;
                tabSize = gl0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                gl0Var.V = ceil;
                gl0Var.U = ceil;
                if (gl0Var.e(ceil) && ceil >= 0 && ceil < b61Var.getChildCount()) {
                    try {
                        gl0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    gl0Var.e0 = 0.0f;
                    gl0Var.w = 0.0f;
                    View childAt = b61Var.getChildAt(ceil);
                    gl0Var.s = childAt;
                    gl0Var.d0 = childAt.getX() - gl0Var.getScrollX();
                    gl0Var.s.invalidate();
                    b61Var.invalidate();
                    gl0Var.j();
                    gl0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                gl0 gl0Var2 = this.b;
                long j3 = currentTimeMillis - gl0Var2.s0;
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
