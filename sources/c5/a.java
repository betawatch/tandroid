package c5;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.support.v4.media.c;
import android.webkit.WebView;
import d5.l;
import d5.m;
import d5.n;
import java.util.Set;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.e3;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class a {
    public static final boolean a;
    public static final WeakHashMap b;

    static {
        Uri.parse("*");
        Uri.parse("");
        a = true;
        b = new WeakHashMap();
    }

    public static void a(WebView webView, String str, Set set, e3 e3Var) {
        if (!l.c.b()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        n c2 = c(webView);
        c2.a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new xe.a(new c(e3Var, 12)));
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
