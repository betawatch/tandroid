// default package

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ce6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ de6 b;

    public /* synthetic */ ce6(de6 de6Var, byte b) {
        this.a = b;
        this.b = de6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        de6 de6Var = this.b;
        switch (b) {
            case 0:
                ry8 ry8Var = de6Var.h;
                ry8Var.getAnimatedDrawable().I(0, false, false);
                ry8Var.d();
                EditTextBoldCursor editTextBoldCursor = de6Var.b;
                editTextBoldCursor.requestFocus();
                gl.E3(editTextBoldCursor);
                break;
            default:
                de6Var.b.requestFocus();
                break;
        }
    }
}
