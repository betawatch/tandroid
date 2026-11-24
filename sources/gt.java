// default package

import android.text.TextUtils;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class gt implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o b;
    public final /* synthetic */ String c;

    public /* synthetic */ gt(o oVar, String str, byte b) {
        this.a = b;
        this.b = oVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.c;
        o oVar = this.b;
        switch (b) {
            case 0:
                ps0 ps0Var = oVar.i0.c0;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                ps0Var.setText(str);
                ps0 ps0Var2 = oVar.i0.c0;
                ps0Var2.setSelection(ps0Var2.getText().length());
                gl.E3(oVar.i0.c0);
                break;
            default:
                d01.n(oVar.M, str, false, null);
                break;
        }
    }
}
