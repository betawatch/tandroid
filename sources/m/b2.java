package m;

import java.util.WeakHashMap;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class b2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;

    public /* synthetic */ b2(e2 e2Var, int i7) {
        this.a = i7;
        this.b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        e2 e2Var = this.b;
        switch (i7) {
            case 0:
                s1 s1Var = e2Var.c;
                if (s1Var != null) {
                    s1Var.setListSelectionHidden(true);
                    s1Var.requestLayout();
                    break;
                }
                break;
            default:
                s1 s1Var2 = e2Var.c;
                if (s1Var2 != null) {
                    WeakHashMap weakHashMap = r0.i0.a;
                    if (s1Var2.isAttachedToWindow() && e2Var.c.getCount() > e2Var.c.getChildCount() && e2Var.c.getChildCount() <= e2Var.y) {
                        e2Var.O.setInputMethodMode(2);
                        e2Var.g();
                        break;
                    }
                }
                break;
        }
    }
}
