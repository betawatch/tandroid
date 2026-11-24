// default package

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bg6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cg6 b;

    public /* synthetic */ bg6(cg6 cg6Var, byte b) {
        this.a = b;
        this.b = cg6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cg6 cg6Var = this.b;
        switch (b) {
            case 0:
                s09 s09Var = cg6Var.h;
                s09Var.getAnimatedDrawable().I(0, false, false);
                s09Var.d();
                EditTextBoldCursor editTextBoldCursor = cg6Var.b;
                editTextBoldCursor.requestFocus();
                gm.E3(editTextBoldCursor);
                break;
            default:
                cg6Var.b.requestFocus();
                break;
        }
    }
}
