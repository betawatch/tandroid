// default package

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class hv3 {
    public final /* synthetic */ iv3 a;

    public hv3(iv3 iv3Var) {
        this.a = iv3Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            hl.c3(new zg3(this, (byte) 26));
        }
    }
}
