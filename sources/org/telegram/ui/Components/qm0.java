package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.bc1;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class qm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vm0 b;

    public /* synthetic */ qm0(vm0 vm0Var, int i10) {
        this.a = i10;
        this.b = vm0Var;
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
                vm0 vm0Var = this.b;
                bc1 bc1Var = vm0Var.e;
                vm0Var.b0 = false;
                vm0Var.V = vm0Var.getScrollX() + vm0Var.W;
                tabSize = vm0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                vm0Var.U = ceil;
                vm0Var.T = ceil;
                if (vm0Var.e(ceil) && ceil >= 0 && ceil < bc1Var.getChildCount()) {
                    try {
                        vm0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    vm0Var.d0 = 0.0f;
                    vm0Var.v = 0.0f;
                    View childAt = bc1Var.getChildAt(ceil);
                    vm0Var.s = childAt;
                    vm0Var.c0 = childAt.getX() - vm0Var.getScrollX();
                    vm0Var.s.invalidate();
                    bc1Var.invalidate();
                    vm0Var.j();
                    vm0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                vm0 vm0Var2 = this.b;
                long j3 = currentTimeMillis - vm0Var2.r0;
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
