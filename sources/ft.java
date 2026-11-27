// default package

import android.text.TextUtils;
import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ft implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o b;
    public final /* synthetic */ String c;

    public /* synthetic */ ft(o oVar, String str, byte b) {
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
                xs0 xs0Var = oVar.i0.c0;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                xs0Var.setText(str);
                xs0 xs0Var2 = oVar.i0.c0;
                xs0Var2.setSelection(xs0Var2.getText().length());
                hl.E3(oVar.i0.c0);
                break;
            default:
                m01.o(oVar.M, str, false, null);
                break;
        }
    }
}
