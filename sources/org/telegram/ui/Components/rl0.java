package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ra1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vl0 b;

    public /* synthetic */ rl0(vl0 vl0Var, int i10) {
        this.a = i10;
        this.b = vl0Var;
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
                vl0 vl0Var = this.b;
                ra1 ra1Var = vl0Var.e;
                vl0Var.U = false;
                vl0Var.R = vl0Var.getScrollX() + vl0Var.S;
                tabSize = vl0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                vl0Var.Q = ceil;
                vl0Var.P = ceil;
                if (vl0Var.e(ceil) && ceil >= 0 && ceil < ra1Var.getChildCount()) {
                    try {
                        vl0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    vl0Var.W = 0.0f;
                    vl0Var.v = 0.0f;
                    View childAt = ra1Var.getChildAt(ceil);
                    vl0Var.s = childAt;
                    vl0Var.V = childAt.getX() - vl0Var.getScrollX();
                    vl0Var.s.invalidate();
                    ra1Var.invalidate();
                    vl0Var.j();
                    vl0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                vl0 vl0Var2 = this.b;
                long j10 = currentTimeMillis - vl0Var2.n0;
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
