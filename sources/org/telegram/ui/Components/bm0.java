package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ua1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fm0 b;

    public /* synthetic */ bm0(fm0 fm0Var, int i10) {
        this.a = i10;
        this.b = fm0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r2.m0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r2.m0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r2.m0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
    
        r2.scrollBy(r0 * r5, 0);
        org.telegram.messenger.AndroidUtilities.runOnUIThread(r2.o0);
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
                fm0 fm0Var = this.b;
                ua1 ua1Var = fm0Var.e;
                fm0Var.U = false;
                fm0Var.R = fm0Var.getScrollX() + fm0Var.S;
                tabSize = fm0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                fm0Var.Q = ceil;
                fm0Var.P = ceil;
                if (fm0Var.e(ceil) && ceil >= 0 && ceil < ua1Var.getChildCount()) {
                    try {
                        fm0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    fm0Var.W = 0.0f;
                    fm0Var.v = 0.0f;
                    View childAt = ua1Var.getChildAt(ceil);
                    fm0Var.s = childAt;
                    fm0Var.V = childAt.getX() - fm0Var.getScrollX();
                    fm0Var.s.invalidate();
                    ua1Var.invalidate();
                    fm0Var.j();
                    fm0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                fm0 fm0Var2 = this.b;
                long j10 = currentTimeMillis - fm0Var2.n0;
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
