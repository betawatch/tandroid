package n2;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import ja.c;
import java.util.Set;
import java.util.WeakHashMap;
import o2.l;
import o2.m;
import o2.n;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class b {
    public static final boolean a;
    public static final WeakHashMap b;

    static {
        Uri.parse("*");
        Uri.parse("");
        a = true;
        b = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set, a aVar) {
        if (!l.c.b()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        n c3 = c(webView);
        c3.a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new ee.a(new c(aVar, 23)));
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static n c(WebView webView) {
        if (!l.e.b() || !a) {
            return new n(m.a.createWebView(webView));
        }
        WeakHashMap weakHashMap = b;
        n nVar = (n) weakHashMap.get(webView);
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(m.a.createWebView(webView));
        weakHashMap.put(webView, nVar2);
        return nVar2;
    }
}
