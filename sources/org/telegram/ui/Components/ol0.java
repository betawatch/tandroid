package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ol0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sl0 b;

    public /* synthetic */ ol0(sl0 sl0Var, int i9) {
        this.a = i9;
        this.b = sl0Var;
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
                sl0 sl0Var = this.b;
                ta1 ta1Var = sl0Var.e;
                sl0Var.U = false;
                sl0Var.R = sl0Var.getScrollX() + sl0Var.S;
                tabSize = sl0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                sl0Var.Q = ceil;
                sl0Var.P = ceil;
                if (sl0Var.e(ceil) && ceil >= 0 && ceil < ta1Var.getChildCount()) {
                    try {
                        sl0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    sl0Var.W = 0.0f;
                    sl0Var.v = 0.0f;
                    View childAt = ta1Var.getChildAt(ceil);
                    sl0Var.s = childAt;
                    sl0Var.V = childAt.getX() - sl0Var.getScrollX();
                    sl0Var.s.invalidate();
                    ta1Var.invalidate();
                    sl0Var.j();
                    sl0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                sl0 sl0Var2 = this.b;
                long j10 = currentTimeMillis - sl0Var2.n0;
                int i9 = -1;
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
