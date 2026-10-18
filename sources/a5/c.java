package a5;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import b5.m;
import b5.n;
import b5.o;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class c {
    public static final boolean a;
    public static final WeakHashMap b;

    static {
        Uri.parse("*");
        Uri.parse("");
        a = true;
        b = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set, b bVar) {
        if (!m.c.b()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        o c10 = c(webView);
        c10.a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new ue.a(new a6.m(bVar, 8)));
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static o c(WebView webView) {
        if (!m.e.b() || !a) {
            return new o(n.a.createWebView(webView));
        }
        WeakHashMap weakHashMap = b;
        o oVar = (o) weakHashMap.get(webView);
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(n.a.createWebView(webView));
        weakHashMap.put(webView, oVar2);
        return oVar2;
    }
}
