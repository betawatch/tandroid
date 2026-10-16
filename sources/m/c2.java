package m;

import java.util.WeakHashMap;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class c2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;

    public /* synthetic */ c2(f2 f2Var, int i10) {
        this.a = i10;
        this.b = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        f2 f2Var = this.b;
        switch (i10) {
            case 0:
                t1 t1Var = f2Var.c;
                if (t1Var != null) {
                    t1Var.setListSelectionHidden(true);
                    t1Var.requestLayout();
                    break;
                }
                break;
            default:
                t1 t1Var2 = f2Var.c;
                if (t1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.a;
                    if (t1Var2.isAttachedToWindow() && f2Var.c.getCount() > f2Var.c.getChildCount() && f2Var.c.getChildCount() <= f2Var.x) {
                        f2Var.O.setInputMethodMode(2);
                        f2Var.g();
                        break;
                    }
                }
                break;
        }
    }
}
