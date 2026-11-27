// default package

import android.text.TextUtils;
import org.telegram.ui.o;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
