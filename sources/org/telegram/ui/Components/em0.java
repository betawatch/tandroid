package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ub1;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class em0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jm0 b;

    public /* synthetic */ em0(jm0 jm0Var, int i10) {
        this.a = i10;
        this.b = jm0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r2.q0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r2.q0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r2.q0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
    
        r2.scrollBy(r0 * r5, 0);
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
                jm0 jm0Var = this.b;
                ub1 ub1Var = jm0Var.e;
                jm0Var.b0 = false;
                jm0Var.V = jm0Var.getScrollX() + jm0Var.W;
                tabSize = jm0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                jm0Var.U = ceil;
                jm0Var.T = ceil;
                if (jm0Var.e(ceil) && ceil >= 0 && ceil < ub1Var.getChildCount()) {
                    try {
                        jm0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    jm0Var.d0 = 0.0f;
                    jm0Var.v = 0.0f;
                    View childAt = ub1Var.getChildAt(ceil);
                    jm0Var.s = childAt;
                    jm0Var.c0 = childAt.getX() - jm0Var.getScrollX();
                    jm0Var.s.invalidate();
                    ub1Var.invalidate();
                    jm0Var.j();
                    jm0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                jm0 jm0Var2 = this.b;
                long j3 = currentTimeMillis - jm0Var2.r0;
                int i10 = -1;
                if (j3 >= 3000) {
                    if (j3 >= 5000) {
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
