// default package

import android.text.TextUtils;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                gl.F3(oVar.i0.c0);
                break;
            default:
                d01.n(oVar.M, str, false, null);
                break;
        }
    }
}
