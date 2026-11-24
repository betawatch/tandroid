// default package

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class nu3 {
    public final /* synthetic */ ou3 a;

    public nu3(ou3 ou3Var) {
        this.a = ou3Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            gl.d3(new li3(this, (byte) 17));
        }
    }
}
