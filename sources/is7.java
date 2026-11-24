// default package

import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class is7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ls7 b;

    public /* synthetic */ is7(ls7 ls7Var, byte b) {
        this.a = b;
        this.b = ls7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ls7 ls7Var = this.b;
        switch (b) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ls7Var.r1;
                editTextBoldCursor.requestFocus();
                gm.E3(editTextBoldCursor);
                break;
            case 1:
                npa npaVar = ls7Var.n1;
                if (npaVar != null) {
                    npaVar.run();
                }
                ls7Var.dismiss();
                break;
            default:
                int i = ls7Var.a;
                String str = ls7Var.l1.slug;
                HashMap hashMap = yr7.a;
                cf7 Y = cf7.Y(i);
                Y.a.c(new q87(Y, str, (byte) 25));
                break;
        }
    }
}
