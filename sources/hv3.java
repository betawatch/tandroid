// default package

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
