// default package

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class kwc {
    public static final boolean a;
    public static final WeakHashMap b;

    static {
        Uri.parse("*");
        Uri.parse("");
        a = true;
        b = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set, jwc jwcVar) {
        if (!nwc.c.b()) {
            rjb.j("This method is not supported by the current version of the framework and the current WebView APK");
            return;
        }
        pwc c = c(webView);
        c.a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new nz0(new x59(jwcVar, (byte) 23)));
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static pwc c(WebView webView) {
        if (!nwc.e.b() || !a) {
            return new pwc(owc.a.createWebView(webView));
        }
        WeakHashMap weakHashMap = b;
        pwc pwcVar = (pwc) weakHashMap.get(webView);
        if (pwcVar != null) {
            return pwcVar;
        }
        pwc pwcVar2 = new pwc(owc.a.createWebView(webView));
        weakHashMap.put(webView, pwcVar2);
        return pwcVar2;
    }
}
