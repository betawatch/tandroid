package gf;

import ag.d3;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.net.IDN;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.CustomTabsCopyReceiver;
import org.telegram.messenger.ShareBroadcastReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.v2;
import org.telegram.messenger.vp;
import org.telegram.messenger.w0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.i3;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h4;
import org.telegram.ui.l3;
import org.telegram.ui.web.v0;
import org.telegram.ui.x2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class f {
    public static m5.e a;
    public static m4.c b;
    public static a9.d c;
    public static String d;
    public static WeakReference e;
    public static Pattern f;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(String str) {
        boolean startsWith;
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        if (str != null) {
            String[] split = str.split("\\.");
            if (split.length > 0) {
                startsWith = split[split.length - 1].startsWith("xn--");
                if (startsWith) {
                    return str;
                }
                try {
                    return IDN.toUnicode(str, 1);
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return str;
                }
            }
        }
        startsWith = true;
        if (startsWith) {
        }
    }

    public static String b(String str) {
        if (str != null && !TextUtils.isEmpty(str)) {
            if (str.startsWith("@")) {
                return str.substring(1);
            }
            if (str.startsWith("t.me/")) {
                return str.substring(5);
            }
            if (str.startsWith("http://t.me/")) {
                return str.substring(12);
            }
            if (str.startsWith("https://t.me/")) {
                return str.substring(13);
            }
            Matcher matcher = LaunchActivity.D1.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static m5.e c() {
        m4.c cVar = b;
        m5.e eVar = null;
        if (cVar == null) {
            a = null;
        } else if (a == null) {
            jb.b bVar = new jb.b(8);
            pf.e eVar2 = (pf.e) cVar.b;
            pf.b bVar2 = new pf.b(bVar);
            try {
                if (((pf.c) eVar2).H0(bVar2)) {
                    eVar = new m5.e(18, bVar2, (ComponentName) cVar.c);
                }
            } catch (RemoteException unused) {
            }
            a = eVar;
            new WeakReference(eVar);
        }
        return a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:5|(2:6|7)|(11:11|12|(5:16|(2:18|19)(1:21)|20|13|14)|22|23|24|25|(3:27|(4:30|(2:31|(1:1)(2:33|(3:36|37|38)(1:35)))|39|28)|41)(3:58|(4:61|(2:79|80)|78|59)|82)|42|(3:44|(3:47|48|45)|49)|(1:56)(2:54|55))|87|23|24|25|(0)(0)|42|(0)|(2:52|56)(1:57)) */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(Context context, String str) {
        String[] strArr;
        List<ResolveInfo> queryIntentActivities;
        if (str == null) {
            return false;
        }
        List<ResolveInfo> list = null;
        try {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), 0);
        } catch (Exception unused) {
        }
        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
            strArr = new String[queryIntentActivities.size()];
            for (int i10 = 0; i10 < queryIntentActivities.size(); i10++) {
                try {
                    strArr[i10] = queryIntentActivities.get(i10).activityInfo.packageName;
                    if (v2.a) {
                        f8.b("default browser name = " + strArr[i10]);
                    }
                } catch (Exception unused2) {
                }
            }
            list = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0);
            if (strArr == null) {
                int i11 = 0;
                while (i11 < list.size()) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= strArr.length) {
                            break;
                        }
                        if (strArr[i12].equals(list.get(i11).activityInfo.packageName)) {
                            list.remove(i11);
                            i11--;
                            break;
                        }
                        i12++;
                    }
                    i11++;
                }
            } else {
                int i13 = 0;
                while (i13 < list.size()) {
                    String lowerCase = list.get(i13).activityInfo.packageName.toLowerCase();
                    if (lowerCase != null && (lowerCase.contains("browser") || lowerCase.contains("chrome") || lowerCase.contains("firefox") || "com.microsoft.emmx".equals(lowerCase) || "com.opera.mini.native".equals(lowerCase) || "com.duckduckgo.mobile.android".equals(lowerCase) || "com.UCMobile.intl".equals(lowerCase))) {
                        list.remove(i13);
                        i13--;
                    }
                    i13++;
                }
            }
            if (v2.a) {
                for (int i14 = 0; i14 < list.size(); i14++) {
                    f8.b("device has " + list.get(i14).activityInfo.packageName + " to open " + str);
                }
            }
            return (list == null || list.isEmpty()) ? false : true;
        }
        strArr = null;
        list = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0);
        if (strArr == null) {
        }
        if (v2.a) {
        }
        if (list == null) {
            return false;
        }
    }

    public static boolean e(Uri uri, boolean z10, boolean[] zArr) {
        String str;
        String str2;
        Typeface typeface = i0.a;
        String K0 = uri == null ? null : i0.K0(uri.toString(), false);
        String lowerCase = K0 != null ? K0.toLowerCase() : "";
        if (!vp.r1(d20.s0).g4.contains(lowerCase)) {
            Matcher matcher = LaunchActivity.D1.matcher(lowerCase);
            if (matcher.find()) {
                StringBuilder sb2 = new StringBuilder("https://t.me/");
                sb2.append(matcher.group(1));
                if (TextUtils.isEmpty(uri.getPath())) {
                    str = "";
                } else {
                    str = "/" + uri.getPath();
                }
                sb2.append(str);
                if (TextUtils.isEmpty(uri.getQuery())) {
                    str2 = "";
                } else {
                    str2 = "?" + uri.getQuery();
                }
                sb2.append(str2);
                uri = Uri.parse(sb2.toString());
                String host = uri.getHost();
                lowerCase = host != null ? host.toLowerCase() : "";
            }
            if ("ton".equals(uri.getScheme())) {
                try {
                    List<ResolveInfo> queryIntentActivities = w0.b.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0);
                    if (queryIntentActivities != null) {
                        if (queryIntentActivities.size() >= 1) {
                        }
                    }
                } catch (Exception unused) {
                }
                return true;
            }
            if (!"tg".equals(uri.getScheme())) {
                if ("telegram.dog".equals(lowerCase)) {
                    String path = uri.getPath();
                    if (path != null && path.length() > 1) {
                        if (!z10) {
                            String lowerCase2 = path.substring(1).toLowerCase();
                            if (lowerCase2.startsWith("blog") || lowerCase2.equals("iv") || lowerCase2.startsWith("faq") || lowerCase2.equals("apps") || lowerCase2.startsWith("s/")) {
                                if (zArr != null) {
                                    zArr[0] = true;
                                    return false;
                                }
                            }
                        }
                    }
                } else if ("telegram.me".equals(lowerCase) || "t.me".equals(lowerCase)) {
                    String path2 = uri.getPath();
                    if (path2 != null && path2.length() > 1) {
                        if (!z10) {
                            String lowerCase3 = path2.substring(1).toLowerCase();
                            if (lowerCase3.equals("iv") || lowerCase3.startsWith("s/")) {
                                if (zArr != null) {
                                    zArr[0] = true;
                                }
                            }
                        }
                    }
                } else if ((!"telegram.org".equals(lowerCase) || uri.getPath() == null || !uri.getPath().startsWith("/blog/")) && (!z10 || (!lowerCase.endsWith("telegram.org") && !lowerCase.endsWith("telegra.ph") && !lowerCase.endsWith("telesco.pe")))) {
                }
            }
            return true;
        }
        if (zArr != null) {
            zArr[0] = true;
            return false;
        }
        return false;
    }

    public static boolean f(String str) {
        try {
            return TextUtils.equals(i0.K0(str, false), vp.r1(d20.s0).U2);
        } catch (Exception e7) {
            f8.g(e7, true);
            return false;
        }
    }

    public static boolean g(String str, boolean z10, boolean z11) {
        if (z10) {
            return str.equals("telegra.ph") || str.equals("te.legra.ph") || str.equals("graph.org");
        }
        StringBuilder sb2 = new StringBuilder("^(https");
        sb2.append(z11 ? "" : "?");
        sb2.append("://)?(te\\.?legra\\.ph|graph\\.org)(/.*|$)");
        return str.matches(sb2.toString());
    }

    public static boolean h(String str) {
        String K0 = i0.K0(str, true);
        if (K0 != null && (K0.endsWith(".ton") || K0.endsWith(".adnl"))) {
            return true;
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("tonsite");
    }

    public static boolean i(String str) {
        boolean matches;
        if (f == null) {
            f = Pattern.compile("^[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9\\-\\_]+$");
        }
        String K0 = i0.K0(str, true);
        if (K0 == null || !(K0.endsWith(".ton") || K0.endsWith(".adnl"))) {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() == null || !parse.getScheme().equalsIgnoreCase("tonsite")) {
                return false;
            }
            matches = f.matcher(parse.getScheme()).matches();
        } else {
            matches = f.matcher(K0).matches();
        }
        return !matches;
    }

    public static boolean j(Context context, String str, boolean z10, boolean z11, e eVar) {
        LaunchActivity launchActivity;
        if (str == null) {
            return false;
        }
        if (i0.W(context) instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) i0.W(context);
        } else {
            launchActivity = LaunchActivity.I1;
            if (launchActivity == null) {
                return false;
            }
        }
        if (launchActivity == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setComponent(new ComponentName(context.getPackageName(), LaunchActivity.class.getName()));
        intent.putExtra("create_new_tab", true);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        intent.putExtra("force_not_internal_apps", z10);
        intent.putExtra("force_request", z11);
        launchActivity.f0(intent, eVar);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081 A[Catch: Exception -> 0x0026, ActivityNotFoundException -> 0x0029, TryCatch #2 {ActivityNotFoundException -> 0x0029, Exception -> 0x0026, blocks: (B:5:0x0006, B:7:0x000c, B:10:0x0019, B:13:0x0030, B:15:0x0036, B:16:0x0043, B:19:0x0054, B:21:0x0064, B:23:0x006a, B:31:0x0081, B:33:0x0093, B:35:0x0099, B:36:0x00b7, B:41:0x00b0, B:44:0x008a, B:46:0x0050, B:47:0x003f, B:48:0x002c), top: B:4:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a A[Catch: Exception -> 0x0026, ActivityNotFoundException -> 0x0029, TryCatch #2 {ActivityNotFoundException -> 0x0029, Exception -> 0x0026, blocks: (B:5:0x0006, B:7:0x000c, B:10:0x0019, B:13:0x0030, B:15:0x0036, B:16:0x0043, B:19:0x0054, B:21:0x0064, B:23:0x006a, B:31:0x0081, B:33:0x0093, B:35:0x0099, B:36:0x00b7, B:41:0x00b0, B:44:0x008a, B:46:0x0050, B:47:0x003f, B:48:0x002c), top: B:4:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean k(Context context, String str, boolean z10) {
        boolean z11;
        if (str != null) {
            try {
                if (!h(str) && !e(Uri.parse(str), false, null)) {
                    Uri parse = Uri.parse(str);
                    String u10 = u(parse, parse.getScheme() == null ? "https" : parse.getScheme(), null, parse.getHost() != null ? parse.getHost().toLowerCase() : parse.getHost(), TextUtils.isEmpty(parse.getPath()) ? "/" : parse.getPath());
                    Uri parse2 = Uri.parse(u10);
                    if (!u10.startsWith("intent://") && (parse2.getScheme() == null || !parse2.getScheme().equalsIgnoreCase("intent"))) {
                        z11 = false;
                        if (z11 || z10) {
                            Intent parseUri = !z11 ? Intent.parseUri(parse2.toString(), 1) : new Intent("android.intent.action.VIEW", parse2);
                            if (z11 && Build.VERSION.SDK_INT >= 30) {
                                parseUri.addCategory("android.intent.category.BROWSABLE");
                                parseUri.addCategory("android.intent.category.DEFAULT");
                                parseUri.addFlags(TLObject.FLAG_28);
                                parseUri.addFlags(1024);
                            } else if (!z11 && !d(context, u10)) {
                            }
                            context.startActivity(parseUri);
                            return true;
                        }
                    }
                    z11 = true;
                    if (z11) {
                    }
                    if (!z11) {
                    }
                    if (z11) {
                    }
                    if (!z11) {
                    }
                    context.startActivity(parseUri);
                    return true;
                }
            } catch (ActivityNotFoundException e7) {
                f8.g(e7, false);
            } catch (Exception e10) {
                f8.g(e10, true);
            }
        }
        return false;
    }

    public static boolean l(Context context, String str, boolean z10, String str2) {
        if (str != null) {
            try {
                Uri parse = Uri.parse(str);
                boolean z11 = parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent");
                if (!z11 || z10) {
                    Intent parseUri = z11 ? Intent.parseUri(parse.toString(), 1) : new Intent("android.intent.action.VIEW", parse);
                    if (!TextUtils.isEmpty(str2)) {
                        parseUri.setPackage(str2);
                    }
                    parseUri.putExtra("create_new_tab", true);
                    parseUri.putExtra("com.android.browser.application_id", context.getPackageName());
                    context.startActivity(parseUri);
                    return true;
                }
            } catch (Exception e7) {
                f8.g(e7, true);
                return false;
            }
        }
        return false;
    }

    public static void m(String str) {
        i3 O;
        h3 h3Var;
        l3[] l3VarArr;
        l3 l3Var;
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null && (O = launchActivity.O()) != null) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<h3> tabs = O.getTabs();
                for (int i10 = 0; i10 < tabs.size(); i10++) {
                    h3Var = tabs.get(i10);
                    h4 h4Var = h3Var.J;
                    if (h4Var != null && !h4Var.d0.isEmpty()) {
                        Object g10 = i0.a.g(1, h3Var.J.d0);
                        if (g10 instanceof x2) {
                            v0 v0Var = ((x2) g10).b;
                            if (v0Var == null && (l3VarArr = h3Var.J.u0) != null && (l3Var = l3VarArr[0]) != null) {
                                v0Var = l3Var.getWebView();
                            }
                            if (v0Var != null) {
                                if (TextUtils.equals(i3.p(v0Var.canGoBack() ? v0Var.getUrl() : v0Var.getOpenURL()), i3.p(str))) {
                                    O.e(h3Var);
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            h3Var = null;
            if (h3Var != null) {
                return;
            }
        }
        k2 T = LaunchActivity.T();
        if (T != null && T.getArticleViewer() != null) {
            T.getArticleViewer().L(null, null, null, str);
            return;
        }
        if (T != null && (T.getParentLayout() instanceof ActionBarLayout)) {
            T = ((ActionBarLayout) T.getParentLayout()).getSheetFragment();
        }
        if (T == null) {
            return;
        }
        T.createArticleViewer(false).L(null, null, null, str);
    }

    public static void n(Activity activity, String str, boolean z10) {
        if (activity == null || str == null) {
            return;
        }
        q(activity, Uri.parse(str), z10, true, false, null, null, false, true, false);
    }

    public static void o(Context context, Uri uri) {
        q(context, uri, true, true, false, null, null, false, true, false);
    }

    public static void p(Context context, Uri uri, boolean z10, boolean z11, e eVar) {
        q(context, uri, z10, z11, false, eVar, null, false, true, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:4|(36:208|209|276|(1:8)(1:207)|(3:170|171|(7:173|(11:175|176|177|(2:179|(2:181|(2:183|(1:185))))|202|11|12|13|(2:166|167)(1:15)|16|(14:22|(1:24)|158|159|160|27|28|29|30|31|32|33|(2:147|148)|(10:146|(3:90|91|(1:(2:94|(2:96|(7:98|(1:106)|64|65|66|(1:68)|(1:(2:75|(4:77|(2:81|(1:83))|84|85)(1:86))(2:87|88))(2:72|73))))))|62|(6:89|65|66|(0)|(1:70)|(0)(0))|64|65|66|(0)|(0)|(0)(0))(3:53|54|(2:56|111)(20:112|113|114|115|116|117|118|(1:120)|121|(1:123)(1:140)|124|125|126|127|128|129|130|131|132|134)))(1:20))(1:204)|186|187|188|189|(2:191|192)(5:193|194|195|196|197)))|10|11|12|13|(0)(0)|16|(1:18)|22|(0)|158|159|160|27|28|29|30|31|32|33|(0)|(1:37)|146|(0)|62|(0)|64|65|66|(0)|(0)|(0)(0))|6|(0)(0)|(0)|10|11|12|13|(0)(0)|16|(0)|22|(0)|158|159|160|27|28|29|30|31|32|33|(0)|(0)|146|(0)|62|(0)|64|65|66|(0)|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0401, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0405, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0406, code lost:
    
        r11 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x040f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0274, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0276, code lost:
    
        org.telegram.messenger.f8.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0412, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0413, code lost:
    
        r11 = r17;
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x026c, code lost:
    
        if ("https".equals(r2) != false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0279, code lost:
    
        r3 = r20;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x029b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0241 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x018d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0258 A[Catch: Exception -> 0x024b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x024b, blocks: (B:167:0x0241, B:18:0x0258, B:24:0x0268), top: B:166:0x0241 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0268 A[Catch: Exception -> 0x024b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x024b, blocks: (B:167:0x0241, B:18:0x0258, B:24:0x0268), top: B:166:0x0241 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0478 A[Catch: Exception -> 0x045f, TRY_ENTER, TryCatch #8 {Exception -> 0x045f, blocks: (B:91:0x041e, B:94:0x0424, B:96:0x0432, B:98:0x0438, B:100:0x043e, B:102:0x0448, B:104:0x0452, B:65:0x0470, B:68:0x0478, B:70:0x0482, B:72:0x0486, B:75:0x0494, B:77:0x049e, B:79:0x04a4, B:81:0x04ae, B:83:0x04c3, B:84:0x04c7, B:87:0x04cf, B:62:0x0463), top: B:90:0x041e }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0482 A[Catch: Exception -> 0x045f, TryCatch #8 {Exception -> 0x045f, blocks: (B:91:0x041e, B:94:0x0424, B:96:0x0432, B:98:0x0438, B:100:0x043e, B:102:0x0448, B:104:0x0452, B:65:0x0470, B:68:0x0478, B:70:0x0482, B:72:0x0486, B:75:0x0494, B:77:0x049e, B:79:0x04a4, B:81:0x04ae, B:83:0x04c3, B:84:0x04c7, B:87:0x04cf, B:62:0x0463), top: B:90:0x041e }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0494 A[Catch: Exception -> 0x045f, TryCatch #8 {Exception -> 0x045f, blocks: (B:91:0x041e, B:94:0x0424, B:96:0x0432, B:98:0x0438, B:100:0x043e, B:102:0x0448, B:104:0x0452, B:65:0x0470, B:68:0x0478, B:70:0x0482, B:72:0x0486, B:75:0x0494, B:77:0x049e, B:79:0x04a4, B:81:0x04ae, B:83:0x04c3, B:84:0x04c7, B:87:0x04cf, B:62:0x0463), top: B:90:0x041e }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04cf A[Catch: Exception -> 0x045f, TRY_LEAVE, TryCatch #8 {Exception -> 0x045f, blocks: (B:91:0x041e, B:94:0x0424, B:96:0x0432, B:98:0x0438, B:100:0x043e, B:102:0x0448, B:104:0x0452, B:65:0x0470, B:68:0x0478, B:70:0x0482, B:72:0x0486, B:75:0x0494, B:77:0x049e, B:79:0x04a4, B:81:0x04ae, B:83:0x04c3, B:84:0x04c7, B:87:0x04cf, B:62:0x0463), top: B:90:0x041e }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x041e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void q(Context context, Uri uri, boolean z10, boolean z11, boolean z12, e eVar, String str, boolean z13, boolean z14, boolean z15) {
        String str2;
        String str3;
        boolean z16;
        boolean z17;
        String K0;
        boolean z18;
        e eVar2;
        int i10;
        String str4;
        boolean z19;
        boolean z20;
        Uri uri2;
        boolean z21;
        boolean z22;
        LaunchActivity launchActivity;
        String lowerCase;
        String str5;
        String K02;
        PendingIntent broadcast;
        m5.e c10;
        Intent intent;
        ArrayList<? extends Parcelable> arrayList;
        Bitmap decodeResource;
        String L0;
        if (context == null || uri == null) {
            return;
        }
        int i11 = d20.s0;
        boolean[] zArr = {false};
        boolean e7 = e(uri, false, zArr);
        int i12 = 4;
        if (str != null) {
            switch (str) {
                case "brave-browser":
                case "brave":
                    str2 = "com.brave.browser";
                    str3 = str2;
                    break;
                case "google-chrome":
                case "chrome":
                    str2 = "com.android.chrome";
                    str3 = str2;
                    break;
                case "microsoft-edge":
                case "edge":
                    str2 = "com.microsoft.emmx";
                    str3 = str2;
                    break;
                case "tor-browser":
                case "tor":
                    str2 = "org.torproject.torbrowser";
                    str3 = str2;
                    break;
                case "duckduckgo-browser":
                case "duckduckgo":
                    str2 = "com.duckduckgo.mobile.android";
                    str3 = str2;
                    break;
                case "firefox":
                case "mozilla-firefox":
                    str2 = "org.mozilla.firefox";
                    str3 = str2;
                    break;
                case "samsung-browser":
                case "samsung":
                    str2 = "com.sec.android.app.sbrowser";
                    str3 = str2;
                    break;
                case "kiwi-browser":
                case "kiwi":
                    str2 = "com.kiwibrowser.browser";
                    str3 = str2;
                    break;
                case "opera-mini":
                    str2 = "com.opera.mini.native";
                    str3 = str2;
                    break;
                case "uc":
                case "uc-browser":
                    str2 = "com.UCMobile.intl";
                    str3 = str2;
                    break;
                case "opera":
                    str2 = "com.opera.browser";
                    str3 = str2;
                    break;
                case "vivaldi":
                case "vivaldi-browser":
                    str2 = "com.vivaldi.browser";
                    str3 = str2;
                    break;
            }
            if (str3 == null) {
                z17 = false;
                z16 = false;
            } else {
                z16 = z10;
                z17 = z11;
            }
            if (z17) {
                try {
                    Typeface typeface = i0.a;
                    K0 = i0.K0(uri.toString(), false);
                } catch (Exception unused) {
                }
                if (d20.i(d20.s0).f() != null) {
                    if (g(K0, true, false)) {
                        z18 = false;
                    } else {
                        z18 = false;
                        try {
                            if ("telegram.org".equalsIgnoreCase(K0)) {
                                if (!uri.toString().toLowerCase().contains("telegram.org/faq")) {
                                    if (!uri.toString().toLowerCase().contains("telegram.org/privacy")) {
                                        if (uri.toString().toLowerCase().contains("telegram.org/blog")) {
                                        }
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        eVar2 = eVar;
                        i10 = i11;
                        str4 = str3;
                        z19 = z16;
                        if (uri.getScheme() != null) {
                            try {
                                lowerCase = uri.getScheme().toLowerCase();
                            } catch (Exception e10) {
                                e = e10;
                                uri2 = uri;
                                z20 = z18;
                                z21 = true;
                                f8.g(e, z21);
                                if (z14) {
                                }
                                if (!h(uri2.toString())) {
                                }
                                z22 = true;
                                if (uri2.getScheme() != null) {
                                }
                                if (!e7) {
                                }
                                if (z22) {
                                }
                            }
                        } else {
                            lowerCase = "";
                        }
                        str5 = lowerCase;
                        if (str5 == null && str5.contains(".")) {
                            return;
                        }
                        if (!"http".equals(str5)) {
                        }
                        uri2 = uri.normalizeScheme();
                        boolean z23 = z18;
                        K02 = i0.K0(uri2.toString().toLowerCase(), z23);
                        if (vp.r1(org.telegram.messenger.c.a(i10).a).f4.contains(K02)) {
                            try {
                                uri2 = uri2.buildUpon().appendQueryParameter("autologin_token", URLEncoder.encode(vp.r1(org.telegram.messenger.c.a(d20.s0).a).h4, "UTF-8")).build();
                            } catch (Exception e11) {
                                e = e11;
                                z21 = true;
                                z20 = false;
                                f8.g(e, z21);
                                if (z14) {
                                }
                                if (!h(uri2.toString())) {
                                }
                                z22 = true;
                                if (uri2.getScheme() != null) {
                                }
                                if (!e7) {
                                }
                                if (z22) {
                                }
                            }
                        }
                        if (z19 || ((uri2 != null && vp.r1(i10).L2(uri2.toString())) || !vp.r1(i10).M2() || e7 || str5.equals("tel") || h(uri2.toString()) || (!zArr[0] && k(context, uri2.toString(), false) && d(context, uri2.toString())))) {
                            z20 = false;
                            if (z14) {
                                try {
                                    if (BubbleActivity.a0 == null) {
                                        if (uri2 != null) {
                                            if (vp.r1(i10).L2(uri2.toString())) {
                                                if (TextUtils.isEmpty(str4)) {
                                                    if (uri2.getScheme() != null && !"https".equals(uri2.getScheme()) && !"http".equals(uri2.getScheme()) && !"tonsite".equals(uri2.getScheme())) {
                                                    }
                                                    z22 = true;
                                                    if (uri2.getScheme() != null) {
                                                        uri2.getScheme().equalsIgnoreCase("intent");
                                                    }
                                                    if (!e7 && (launchActivity = LaunchActivity.I1) != null) {
                                                        j(launchActivity, uri2.toString(), z12, z15, eVar2);
                                                        return;
                                                    }
                                                    if (z22) {
                                                        l(context, uri2.toString(), z13, str4);
                                                        return;
                                                    }
                                                    if (k(context, uri2.toString(), z13)) {
                                                        return;
                                                    }
                                                    if (uri2.getScheme() != null && uri2.getScheme().equalsIgnoreCase("intent")) {
                                                        String stringExtra = Intent.parseUri(uri2.toString(), 1).getStringExtra("browser_fallback_url");
                                                        if (!TextUtils.isEmpty(stringExtra)) {
                                                            uri2 = Uri.parse(stringExtra);
                                                        }
                                                    }
                                                    m(uri2.toString());
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e12) {
                                    f8.g(e12, true);
                                    return;
                                }
                            }
                            if (!h(uri2.toString())) {
                                z22 = z20;
                                if (uri2.getScheme() != null) {
                                }
                                if (!e7) {
                                }
                                if (z22) {
                                }
                            }
                            z22 = true;
                            if (uri2.getScheme() != null) {
                            }
                            if (!e7) {
                            }
                            if (z22) {
                            }
                        } else {
                            if (vp.r1(i10).g4.contains(K02)) {
                                Intent intent2 = new Intent("android.intent.action.VIEW", uri2);
                                intent2.addFlags(TLObject.FLAG_28);
                                w0.b.startActivity(intent2);
                                return;
                            }
                            Intent intent3 = new Intent(w0.b, (Class<?>) ShareBroadcastReceiver.class);
                            intent3.setAction("android.intent.action.SEND");
                            try {
                                broadcast = PendingIntent.getBroadcast(w0.b, 0, new Intent(w0.b, (Class<?>) CustomTabsCopyReceiver.class), 167772160);
                                c10 = c();
                            } catch (Exception e13) {
                                e = e13;
                                z20 = false;
                            }
                            try {
                                intent = new Intent("android.intent.action.VIEW");
                                if (c10 != null) {
                                    intent.setPackage(((ComponentName) c10.c).getPackageName());
                                }
                                Bundle bundle = new Bundle();
                                bundle.putBinder("android.support.customtabs.extra.SESSION", c10 == null ? null : (pf.b) c10.b);
                                intent.putExtras(bundle);
                                String L02 = cd.L0(2131751762, null);
                                arrayList = new ArrayList<>();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", L02);
                                bundle2.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast);
                                arrayList.add(bundle2);
                                z23 = false;
                                intent.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", t6.x0(null, t6.S8, false));
                                intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                                decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.msg_filled_shareout);
                                L0 = cd.L0(2131745477, null);
                                z20 = false;
                            } catch (Exception e14) {
                                e = e14;
                                z20 = false;
                                z21 = true;
                                f8.g(e, z21);
                                if (z14) {
                                }
                                if (!h(uri2.toString())) {
                                }
                                z22 = true;
                                if (uri2.getScheme() != null) {
                                }
                                if (!e7) {
                                }
                                if (z22) {
                                }
                            }
                            try {
                                PendingIntent broadcast2 = PendingIntent.getBroadcast(w0.b, 0, intent3, 33554432);
                                Bundle bundle3 = new Bundle();
                                bundle3.putInt("android.support.customtabs.customaction.ID", 0);
                                bundle3.putParcelable("android.support.customtabs.customaction.ICON", decodeResource);
                                bundle3.putString("android.support.customtabs.customaction.DESCRIPTION", L0);
                                bundle3.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast2);
                                intent.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle3);
                                intent.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", true);
                                intent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
                                intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                                intent.addFlags(TLObject.FLAG_28);
                                intent.setData(uri2);
                                context.startActivity(intent, null);
                                return;
                            } catch (Exception e15) {
                                e = e15;
                                z21 = true;
                                f8.g(e, z21);
                                if (z14) {
                                }
                                if (!h(uri2.toString())) {
                                }
                                z22 = true;
                                if (uri2.getScheme() != null) {
                                }
                                if (!e7) {
                                }
                                if (z22) {
                                }
                            }
                        }
                    }
                    x1[] x1VarArr = new x1[1];
                    x1VarArr[z18 ? 1 : 0] = new x1(3, context, null);
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = uri.toString();
                    eVar2 = eVar;
                    str4 = str3;
                    z19 = z16;
                    try {
                        int sendRequest = ConnectionsManager.getInstance(d20.s0).sendRequest(getwebpagepreview, new a(eVar2, x1VarArr, i11, uri, context, z19));
                        if (eVar2 != null) {
                            eVar2.d();
                            return;
                        } else {
                            i10 = i11;
                            try {
                                i0.h3(new d3(x1VarArr, sendRequest, i12), 1000L);
                                return;
                            } catch (Exception unused3) {
                            }
                        }
                    } catch (Exception unused4) {
                        i10 = i11;
                    }
                }
            }
            eVar2 = eVar;
            i10 = i11;
            str4 = str3;
            z18 = false;
            z19 = z16;
            if (uri.getScheme() != null) {
            }
            str5 = lowerCase;
            if (str5 == null) {
            }
            if (!"http".equals(str5)) {
            }
            uri2 = uri.normalizeScheme();
            boolean z232 = z18;
            K02 = i0.K0(uri2.toString().toLowerCase(), z232);
            if (vp.r1(org.telegram.messenger.c.a(i10).a).f4.contains(K02)) {
            }
            if (z19) {
            }
            z20 = false;
            if (z14) {
            }
            if (!h(uri2.toString())) {
            }
            z22 = true;
            if (uri2.getScheme() != null) {
            }
            if (!e7) {
            }
            if (z22) {
            }
        }
        str3 = null;
        if (str3 == null) {
        }
        if (z17) {
        }
        eVar2 = eVar;
        i10 = i11;
        str4 = str3;
        z18 = false;
        z19 = z16;
        if (uri.getScheme() != null) {
        }
        str5 = lowerCase;
        if (str5 == null) {
        }
        if (!"http".equals(str5)) {
        }
        uri2 = uri.normalizeScheme();
        boolean z2322 = z18;
        K02 = i0.K0(uri2.toString().toLowerCase(), z2322);
        if (vp.r1(org.telegram.messenger.c.a(i10).a).f4.contains(K02)) {
        }
        if (z19) {
        }
        z20 = false;
        if (z14) {
        }
        if (!h(uri2.toString())) {
        }
        z22 = true;
        if (uri2.getScheme() != null) {
        }
        if (!e7) {
        }
        if (z22) {
        }
    }

    public static void r(Context context, String str) {
        if (str == null) {
            return;
        }
        q(context, Uri.parse(str), true, true, false, null, null, false, true, false);
    }

    public static void s(LaunchActivity launchActivity, Uri uri) {
        o(launchActivity, uri);
    }

    public static void t(Context context, String str) {
        if (str == null) {
            return;
        }
        q(context, Uri.parse(str), false, true, false, null, null, false, false, false);
    }

    public static String u(Uri uri, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = uri.getScheme();
        }
        if (str != null) {
            sb2.append(str);
            sb2.append("://");
        }
        if (str2 == null) {
            if (uri.getUserInfo() != null) {
                sb2.append(uri.getUserInfo());
                sb2.append("@");
            }
        } else if (!TextUtils.isEmpty(str2)) {
            sb2.append(str2);
            sb2.append("@");
        }
        if (str3 != null) {
            sb2.append(str3);
        } else if (uri.getHost() != null) {
            sb2.append(uri.getHost());
        }
        if (uri.getPort() != -1) {
            sb2.append(":");
            sb2.append(uri.getPort());
        }
        if (str4 != null) {
            sb2.append(str4);
        } else if (uri.getPath() != null) {
            sb2.append(uri.getPath());
        }
        if (uri.getQuery() != null) {
            sb2.append("?");
            sb2.append(uri.getQuery());
        }
        if (uri.getFragment() != null) {
            sb2.append("#");
            sb2.append(uri.getFragment());
        }
        return sb2.toString();
    }

    public static String v(Uri uri, String str) {
        return u(uri, null, null, str, null);
    }

    public static void w(Activity activity) {
        if (c == null) {
            return;
        }
        WeakReference weakReference = e;
        if ((weakReference == null ? null : (Activity) weakReference.get()) == activity) {
            e.clear();
        }
        try {
            activity.unbindService(c);
        } catch (Exception unused) {
        }
        b = null;
        a = null;
    }

    public static boolean x(String str) {
        return g(str, false, true) || str.matches("^(https://)?t\\.me/iv\\??(/.*|$)") || str.matches("^(https://)?telegram\\.org/(blog|tour)(/.*|$)") || str.matches("^(https://)?fragment\\.com(/.*|$)");
    }
}
