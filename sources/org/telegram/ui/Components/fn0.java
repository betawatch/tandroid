package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.va1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class fn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kn0 b;

    public /* synthetic */ fn0(kn0 kn0Var, int i10) {
        this.a = i10;
        this.b = kn0Var;
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
                kn0 kn0Var = this.b;
                va1 va1Var = kn0Var.e;
                kn0Var.b0 = false;
                kn0Var.V = kn0Var.getScrollX() + kn0Var.W;
                tabSize = kn0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                kn0Var.U = ceil;
                kn0Var.T = ceil;
                if (kn0Var.e(ceil) && ceil >= 0 && ceil < va1Var.getChildCount()) {
                    try {
                        kn0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    kn0Var.d0 = 0.0f;
                    kn0Var.v = 0.0f;
                    View childAt = va1Var.getChildAt(ceil);
                    kn0Var.s = childAt;
                    kn0Var.c0 = childAt.getX() - kn0Var.getScrollX();
                    kn0Var.s.invalidate();
                    va1Var.invalidate();
                    kn0Var.j();
                    kn0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                kn0 kn0Var2 = this.b;
                long j10 = currentTimeMillis - kn0Var2.r0;
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
