package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.gc1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class nm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sm0 b;

    public /* synthetic */ nm0(sm0 sm0Var, int i10) {
        this.a = i10;
        this.b = sm0Var;
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
                sm0 sm0Var = this.b;
                gc1 gc1Var = sm0Var.e;
                sm0Var.b0 = false;
                sm0Var.V = sm0Var.getScrollX() + sm0Var.W;
                tabSize = sm0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                sm0Var.U = ceil;
                sm0Var.T = ceil;
                if (sm0Var.e(ceil) && ceil >= 0 && ceil < gc1Var.getChildCount()) {
                    try {
                        sm0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    sm0Var.d0 = 0.0f;
                    sm0Var.v = 0.0f;
                    View childAt = gc1Var.getChildAt(ceil);
                    sm0Var.s = childAt;
                    sm0Var.c0 = childAt.getX() - sm0Var.getScrollX();
                    sm0Var.s.invalidate();
                    gc1Var.invalidate();
                    sm0Var.j();
                    sm0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                sm0 sm0Var2 = this.b;
                long j3 = currentTimeMillis - sm0Var2.r0;
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
