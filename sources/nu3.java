// default package

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class nu3 {
    public final /* synthetic */ ou3 a;

    public nu3(ou3 ou3Var) {
        this.a = ou3Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            gl.c3(new li3(this, (byte) 17));
        }
    }
}
