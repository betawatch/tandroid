package d5;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import cb.c;
import e5.k;
import e5.l;
import e5.m;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        if (!k.c.b()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        m c10 = c(webView);
        c10.a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new af.a(new c(aVar, 19)));
    }

    public static PackageInfo b() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static m c(WebView webView) {
        if (!k.e.b() || !a) {
            return new m(l.a.createWebView(webView));
        }
        WeakHashMap weakHashMap = b;
        m mVar = (m) weakHashMap.get(webView);
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(l.a.createWebView(webView));
        weakHashMap.put(webView, mVar2);
        return mVar2;
    }
}
