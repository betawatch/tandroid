// default package

import android.text.TextUtils;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class hu implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o b;
    public final /* synthetic */ String c;

    public /* synthetic */ hu(o oVar, String str, byte b) {
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
                vc vcVar = oVar.i0.c0;
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                vcVar.setText(str);
                vc vcVar2 = oVar.i0.c0;
                vcVar2.setSelection(vcVar2.getText().length());
                gm.E3(oVar.i0.c0);
                break;
            default:
                l11.o(oVar.M, str, false, null);
                break;
        }
    }
}
