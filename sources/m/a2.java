package m;

import java.util.WeakHashMap;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;

    public /* synthetic */ a2(d2 d2Var, int i10) {
        this.a = i10;
        this.b = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        d2 d2Var = this.b;
        switch (i10) {
            case 0:
                r1 r1Var = d2Var.c;
                if (r1Var != null) {
                    r1Var.setListSelectionHidden(true);
                    r1Var.requestLayout();
                    break;
                }
                break;
            default:
                r1 r1Var2 = d2Var.c;
                if (r1Var2 != null) {
                    WeakHashMap weakHashMap = r0.j0.a;
                    if (r1Var2.isAttachedToWindow() && d2Var.c.getCount() > d2Var.c.getChildCount() && d2Var.c.getChildCount() <= d2Var.x) {
                        d2Var.L.setInputMethodMode(2);
                        d2Var.g();
                        break;
                    }
                }
                break;
        }
    }
}
