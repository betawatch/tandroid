// default package

import java.util.WeakHashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class m56 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o56 b;

    public /* synthetic */ m56(o56 o56Var, byte b) {
        this.a = b;
        this.b = o56Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        o56 o56Var = this.b;
        switch (b) {
            case 0:
                er3 er3Var = o56Var.c;
                if (er3Var != null) {
                    er3Var.setListSelectionHidden(true);
                    er3Var.requestLayout();
                    break;
                }
                break;
            default:
                er3 er3Var2 = o56Var.c;
                if (er3Var2 != null) {
                    WeakHashMap weakHashMap = jdc.a;
                    if (er3Var2.isAttachedToWindow() && o56Var.c.getCount() > o56Var.c.getChildCount() && o56Var.c.getChildCount() <= o56Var.y) {
                        o56Var.P.setInputMethodMode(2);
                        o56Var.f();
                        break;
                    }
                }
                break;
        }
    }
}
