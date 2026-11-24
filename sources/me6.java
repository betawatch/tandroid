// default package

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class me6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zf6 b;

    public /* synthetic */ me6(zf6 zf6Var, byte b) {
        this.a = b;
        this.b = zf6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        zf6 zf6Var = this.b;
        switch (b) {
            case 0:
                zf6Var.N.m();
                break;
            case 1:
                zf6Var.O = null;
                zf6Var.P = null;
                zf6Var.o(true);
                zf6Var.e.m(null, null, zf6Var.f, null);
                cj1 cj1Var = zf6Var.n;
                p09 p09Var = zf6Var.K;
                cj1Var.setAnimation(p09Var);
                p09Var.H(0);
                zf6Var.M = true;
                break;
            case 2:
                zf6Var.M = true;
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = zf6Var.c;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    gm.E3(editTextBoldCursor);
                    break;
                }
                break;
        }
    }
}
