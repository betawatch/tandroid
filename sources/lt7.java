// default package

import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class lt7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ot7 b;

    public /* synthetic */ lt7(ot7 ot7Var, byte b) {
        this.a = b;
        this.b = ot7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ot7 ot7Var = this.b;
        switch (b) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = ot7Var.r1;
                editTextBoldCursor.requestFocus();
                hl.E3(editTextBoldCursor);
                break;
            case 1:
                jra jraVar = ot7Var.n1;
                if (jraVar != null) {
                    jraVar.run();
                }
                ot7Var.dismiss();
                break;
            default:
                int i = ot7Var.a;
                String str = ot7Var.l1.slug;
                HashMap hashMap = vs7.a;
                jf7 Y = jf7.Y(i);
                Y.a.c(new t87(Y, str, (byte) 23));
                break;
        }
    }
}
