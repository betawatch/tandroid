// default package

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class juc {
    public static final boolean a;
    public static final WeakHashMap b;

    static {
        Uri.parse("*");
        Uri.parse("");
        a = true;
        b = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set, iuc iucVar) {
        if (!muc.c.b()) {
            fyb.i("This method is not supported by the current version of the framework and the current WebView APK");
            return;
        }
        ouc c = c(webView);
        c.a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new gy0(new u39(iucVar, (byte) 23)));
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static ouc c(WebView webView) {
        if (!muc.e.b() || !a) {
            return new ouc(nuc.a.createWebView(webView));
        }
        WeakHashMap weakHashMap = b;
        ouc oucVar = (ouc) weakHashMap.get(webView);
        if (oucVar != null) {
            return oucVar;
        }
        ouc oucVar2 = new ouc(nuc.a.createWebView(webView));
        weakHashMap.put(webView, oucVar2);
        return oucVar2;
    }
}
