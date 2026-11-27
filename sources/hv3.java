// default package

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
