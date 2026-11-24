// default package

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class nc6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ae6 b;

    public /* synthetic */ nc6(ae6 ae6Var, byte b) {
        this.a = b;
        this.b = ae6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ae6 ae6Var = this.b;
        switch (b) {
            case 0:
                ae6Var.N.m();
                break;
            case 1:
                ae6Var.O = null;
                ae6Var.P = null;
                ae6Var.o(true);
                ae6Var.e.m(null, null, ae6Var.f, null);
                vh1 vh1Var = ae6Var.n;
                oy8 oy8Var = ae6Var.K;
                vh1Var.setAnimation(oy8Var);
                oy8Var.H(0);
                ae6Var.M = true;
                break;
            case 2:
                ae6Var.M = true;
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = ae6Var.c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    gl.E3(editTextBoldCursor);
                    break;
                }
                break;
        }
    }
}
