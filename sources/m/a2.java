package m;

import java.util.WeakHashMap;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                    WeakHashMap weakHashMap = r0.h0.a;
                    if (r1Var2.isAttachedToWindow() && d2Var.c.getCount() > d2Var.c.getChildCount() && d2Var.c.getChildCount() <= d2Var.y) {
                        d2Var.O.setInputMethodMode(2);
                        d2Var.h();
                        break;
                    }
                }
                break;
        }
    }
}
