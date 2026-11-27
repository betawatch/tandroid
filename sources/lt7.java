// default package

import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
                kf7 a0 = kf7.a0(i);
                a0.a.c(new t87(a0, str, (byte) 23));
                break;
        }
    }
}
