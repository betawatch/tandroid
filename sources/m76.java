// default package

import java.util.WeakHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class m76 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o76 b;

    public /* synthetic */ m76(o76 o76Var, byte b) {
        this.a = b;
        this.b = o76Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        o76 o76Var = this.b;
        switch (b) {
            case 0:
                os3 os3Var = o76Var.c;
                if (os3Var != null) {
                    os3Var.setListSelectionHidden(true);
                    os3Var.requestLayout();
                    break;
                }
                break;
            default:
                os3 os3Var2 = o76Var.c;
                if (os3Var2 != null) {
                    WeakHashMap weakHashMap = kfc.a;
                    if (os3Var2.isAttachedToWindow() && o76Var.c.getCount() > o76Var.c.getChildCount() && o76Var.c.getChildCount() <= o76Var.y) {
                        o76Var.P.setInputMethodMode(2);
                        o76Var.f();
                        break;
                    }
                }
                break;
        }
    }
}
