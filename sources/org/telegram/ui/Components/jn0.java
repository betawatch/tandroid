package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.dc1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ on0 b;

    public /* synthetic */ jn0(on0 on0Var, int i10) {
        this.a = i10;
        this.b = on0Var;
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
                on0 on0Var = this.b;
                dc1 dc1Var = on0Var.e;
                on0Var.b0 = false;
                on0Var.V = on0Var.getScrollX() + on0Var.W;
                tabSize = on0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                on0Var.U = ceil;
                on0Var.T = ceil;
                if (on0Var.e(ceil) && ceil >= 0 && ceil < dc1Var.getChildCount()) {
                    try {
                        on0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    on0Var.d0 = 0.0f;
                    on0Var.v = 0.0f;
                    View childAt = dc1Var.getChildAt(ceil);
                    on0Var.s = childAt;
                    on0Var.c0 = childAt.getX() - on0Var.getScrollX();
                    on0Var.s.invalidate();
                    dc1Var.invalidate();
                    on0Var.j();
                    on0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                on0 on0Var2 = this.b;
                long j3 = currentTimeMillis - on0Var2.r0;
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
