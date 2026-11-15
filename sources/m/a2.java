package m;

import java.util.WeakHashMap;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class a2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;

    public /* synthetic */ a2(d2 d2Var, int i7) {
        this.a = i7;
        this.b = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        d2 d2Var = this.b;
        switch (i7) {
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
                    WeakHashMap weakHashMap = r0.i0.a;
                    if (r1Var2.isAttachedToWindow() && d2Var.c.getCount() > d2Var.c.getChildCount() && d2Var.c.getChildCount() <= d2Var.y) {
                        d2Var.P.setInputMethodMode(2);
                        d2Var.g();
                        break;
                    }
                }
                break;
        }
    }
}
