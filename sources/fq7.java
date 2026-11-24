// default package

import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fq7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iq7 b;

    public /* synthetic */ fq7(iq7 iq7Var, byte b) {
        this.a = b;
        this.b = iq7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        iq7 iq7Var = this.b;
        switch (b) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = iq7Var.r1;
                editTextBoldCursor.requestFocus();
                gl.F3(editTextBoldCursor);
                break;
            case 1:
                nna nnaVar = iq7Var.n1;
                if (nnaVar != null) {
                    nnaVar.run();
                }
                iq7Var.dismiss();
                break;
            default:
                int i = iq7Var.a;
                String str = iq7Var.l1.slug;
                HashMap hashMap = vp7.a;
                ad7 Y = ad7.Y(i);
                Y.a.c(new t67(Y, str, (byte) 24));
                break;
        }
    }
}
