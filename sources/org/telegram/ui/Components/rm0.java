package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.dc1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class rm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm0 b;

    public /* synthetic */ rm0(wm0 wm0Var, int i10) {
        this.a = i10;
        this.b = wm0Var;
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
                wm0 wm0Var = this.b;
                dc1 dc1Var = wm0Var.e;
                wm0Var.b0 = false;
                wm0Var.V = wm0Var.getScrollX() + wm0Var.W;
                tabSize = wm0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                wm0Var.U = ceil;
                wm0Var.T = ceil;
                if (wm0Var.e(ceil) && ceil >= 0 && ceil < dc1Var.getChildCount()) {
                    try {
                        wm0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    wm0Var.d0 = 0.0f;
                    wm0Var.v = 0.0f;
                    View childAt = dc1Var.getChildAt(ceil);
                    wm0Var.s = childAt;
                    wm0Var.c0 = childAt.getX() - wm0Var.getScrollX();
                    wm0Var.s.invalidate();
                    dc1Var.invalidate();
                    wm0Var.j();
                    wm0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                wm0 wm0Var2 = this.b;
                long j3 = currentTimeMillis - wm0Var2.r0;
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
