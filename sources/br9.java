// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class br9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ er9 b;

    public /* synthetic */ br9(er9 er9Var, byte b) {
        this.a = b;
        this.b = er9Var;
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
        gl.d3(r8.t0);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int tabSize;
        int max;
        byte b = this.a;
        er9 er9Var = this.b;
        int i = 1;
        switch (b) {
            case 0:
                pkb pkbVar = er9Var.e;
                er9Var.c0 = false;
                er9Var.W = er9Var.getScrollX() + er9Var.a0;
                tabSize = er9Var.getTabSize();
                int ceil = ((int) Math.ceil(r3 / tabSize)) - 1;
                er9Var.V = ceil;
                er9Var.U = ceil;
                if (er9Var.e(ceil) && ceil >= 0 && ceil < pkbVar.getChildCount()) {
                    try {
                        er9Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    er9Var.e0 = 0.0f;
                    er9Var.w = 0.0f;
                    View childAt = pkbVar.getChildAt(ceil);
                    er9Var.s = childAt;
                    er9Var.d0 = childAt.getX() - er9Var.getScrollX();
                    er9Var.s.invalidate();
                    pkbVar.invalidate();
                    er9Var.j();
                    er9Var.invalidate();
                    break;
                }
                break;
            default:
                long currentTimeMillis = System.currentTimeMillis() - er9Var.s0;
                if (currentTimeMillis >= 3000) {
                    if (currentTimeMillis >= 5000) {
                        max = Math.max(1, gl.L(4.0f));
                        break;
                    } else {
                        max = Math.max(1, gl.L(2.0f));
                        break;
                    }
                } else {
                    max = Math.max(1, gl.L(1.0f));
                    break;
                }
        }
    }
}
