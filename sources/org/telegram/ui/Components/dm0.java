package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cc1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class dm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ im0 b;

    public /* synthetic */ dm0(im0 im0Var, int i10) {
        this.a = i10;
        this.b = im0Var;
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
                im0 im0Var = this.b;
                cc1 cc1Var = im0Var.e;
                im0Var.b0 = false;
                im0Var.V = im0Var.getScrollX() + im0Var.W;
                tabSize = im0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                im0Var.U = ceil;
                im0Var.T = ceil;
                if (im0Var.e(ceil) && ceil >= 0 && ceil < cc1Var.getChildCount()) {
                    try {
                        im0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    im0Var.d0 = 0.0f;
                    im0Var.v = 0.0f;
                    View childAt = cc1Var.getChildAt(ceil);
                    im0Var.s = childAt;
                    im0Var.c0 = childAt.getX() - im0Var.getScrollX();
                    im0Var.s.invalidate();
                    cc1Var.invalidate();
                    im0Var.j();
                    im0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                im0 im0Var2 = this.b;
                long j3 = currentTimeMillis - im0Var2.r0;
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
