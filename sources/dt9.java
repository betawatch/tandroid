// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dt9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gt9 b;

    public /* synthetic */ dt9(gt9 gt9Var, byte b) {
        this.a = b;
        this.b = gt9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r8.r0 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r8.r0 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r8.r0 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        r8.scrollBy(r0 * r2, 0);
        gm.c3(r8.t0);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int tabSize;
        int max;
        byte b = this.a;
        gt9 gt9Var = this.b;
        int i = 1;
        switch (b) {
            case 0:
                qmb qmbVar = gt9Var.e;
                gt9Var.c0 = false;
                gt9Var.W = gt9Var.getScrollX() + gt9Var.a0;
                tabSize = gt9Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                gt9Var.V = ceil;
                gt9Var.U = ceil;
                if (gt9Var.e(ceil) && ceil >= 0 && ceil < qmbVar.getChildCount()) {
                    try {
                        gt9Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    gt9Var.e0 = 0.0f;
                    gt9Var.w = 0.0f;
                    View childAt = qmbVar.getChildAt(ceil);
                    gt9Var.s = childAt;
                    gt9Var.d0 = childAt.getX() - gt9Var.getScrollX();
                    gt9Var.s.invalidate();
                    qmbVar.invalidate();
                    gt9Var.j();
                    gt9Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis() - gt9Var.s0;
                if (currentTimeMillis >= 3000) {
                    if (currentTimeMillis >= 5000) {
                        max = Math.max(1, gm.L(4.0f));
                        break;
                    } else {
                        max = Math.max(1, gm.L(2.0f));
                        break;
                    }
                } else {
                    max = Math.max(1, gm.L(1.0f));
                    break;
                }
        }
    }
}
