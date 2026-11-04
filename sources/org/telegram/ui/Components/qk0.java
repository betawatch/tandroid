package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vk0 b;

    public /* synthetic */ qk0(vk0 vk0Var, int i3) {
        this.a = i3;
        this.b = vk0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r2.r0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r2.r0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r2.r0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        r2.scrollBy(r0 * r4, 0);
        org.telegram.messenger.g0.h3(r2.t0);
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
                vk0 vk0Var = this.b;
                org.telegram.ui.s51 s51Var = vk0Var.e;
                vk0Var.c0 = false;
                vk0Var.W = vk0Var.getScrollX() + vk0Var.a0;
                tabSize = vk0Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                vk0Var.V = ceil;
                vk0Var.U = ceil;
                if (vk0Var.e(ceil) && ceil >= 0 && ceil < s51Var.getChildCount()) {
                    try {
                        vk0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    vk0Var.e0 = 0.0f;
                    vk0Var.w = 0.0f;
                    View childAt = s51Var.getChildAt(ceil);
                    vk0Var.s = childAt;
                    vk0Var.d0 = childAt.getX() - vk0Var.getScrollX();
                    vk0Var.s.invalidate();
                    s51Var.invalidate();
                    vk0Var.j();
                    vk0Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis();
                vk0 vk0Var2 = this.b;
                long j10 = currentTimeMillis - vk0Var2.s0;
                int i3 = -1;
                if (j10 >= 3000) {
                    if (j10 >= 5000) {
                        max = Math.max(1, org.telegram.messenger.g0.L(4.0f));
                        break;
                    } else {
                        max = Math.max(1, org.telegram.messenger.g0.L(2.0f));
                        break;
                    }
                } else {
                    max = Math.max(1, org.telegram.messenger.g0.L(1.0f));
                    break;
                }
        }
    }
}
