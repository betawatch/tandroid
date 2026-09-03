package m;

import java.util.WeakHashMap;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;

    public /* synthetic */ b2(e2 e2Var, int i10) {
        this.a = i10;
        this.b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        e2 e2Var = this.b;
        switch (i10) {
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
                    WeakHashMap weakHashMap = r0.j0.a;
                    if (s1Var2.isAttachedToWindow() && e2Var.c.getCount() > e2Var.c.getChildCount() && e2Var.c.getChildCount() <= e2Var.x) {
                        e2Var.L.setInputMethodMode(2);
                        e2Var.g();
                        break;
                    }
                }
                break;
        }
    }
}
