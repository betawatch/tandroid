package of;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import i2.g;
import java.lang.ref.WeakReference;
import java.net.IDN;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n7.z0;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.CustomTabsCopyReceiver;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.ShareBroadcastReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.ActionBar.o3;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hz;
import org.telegram.ui.i4;
import org.telegram.ui.m3;
import org.telegram.ui.z2;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class f {
    public static z0 a;
    public static o0.a b;
    public static a9.d c;
    public static String d;
    public static WeakReference e;
    public static Pattern f;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(String str) {
        boolean startsWith;
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e7) {
            FileLog.e(e7);
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
                    FileLog.e(e10);
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
            Matcher matcher = LaunchActivity.B1.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static z0 c() {
        o0.a aVar = b;
        z0 z0Var = null;
        if (aVar == null) {
            a = null;
        } else if (a == null) {
            ob.a aVar2 = new ob.a(16);
            vf.e eVar = (vf.e) aVar.b;
            vf.b bVar = new vf.b(aVar2);
            try {
                if (((vf.c) eVar).G0(bVar)) {
                    z0Var = new z0(20, bVar, (ComponentName) aVar.c);
                }
            } catch (RemoteException unused) {
            }
            a = z0Var;
            new WeakReference(z0Var);
        }
        return a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:5|6|7|(11:11|12|(5:16|(2:18|19)(1:21)|20|13|14)|22|23|24|25|(3:27|(4:30|(2:31|(1:1)(2:33|(3:36|37|38)(1:35)))|39|28)|41)(3:57|(6:60|(3:83|(2:79|80)(1:82)|81)|77|(0)(0)|81|58)|84)|42|(3:44|(3:47|48|45)|49)|(1:55)(1:54))|89|23|24|25|(0)(0)|42|(0)|(2:52|55)(1:56)) */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec A[Catch: Exception -> 0x00e5, TryCatch #2 {Exception -> 0x00e5, blocks: (B:25:0x005a, B:28:0x006e, B:31:0x0075, B:33:0x0078, B:37:0x008a, B:35:0x0090, B:39:0x0093, B:42:0x00f3, B:45:0x00f8, B:47:0x00fe, B:58:0x0096, B:60:0x009c, B:62:0x00ac, B:64:0x00b4, B:66:0x00bc, B:68:0x00c4, B:70:0x00cc, B:72:0x00d4, B:74:0x00dc, B:79:0x00ec, B:81:0x00f1), top: B:24:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(Context context, String str) {
        String[] strArr;
        boolean z10;
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
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("default browser name = " + strArr[i10]);
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
                    if (lowerCase == null || (!lowerCase.contains("browser") && !lowerCase.contains("chrome") && !lowerCase.contains("firefox") && !"com.microsoft.emmx".equals(lowerCase) && !"com.opera.mini.native".equals(lowerCase) && !"com.duckduckgo.mobile.android".equals(lowerCase) && !"com.UCMobile.intl".equals(lowerCase))) {
                        z10 = false;
                        if (!z10) {
                            list.remove(i13);
                            i13--;
                        }
                        i13++;
                    }
                    z10 = true;
                    if (!z10) {
                    }
                    i13++;
                }
            }
            if (BuildVars.LOGS_ENABLED) {
                for (int i14 = 0; i14 < list.size(); i14++) {
                    FileLog.d("device has " + list.get(i14).activityInfo.packageName + " to open " + str);
                }
            }
            return (list == null || list.isEmpty()) ? false : true;
        }
        strArr = null;
        list = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0);
        if (strArr == null) {
        }
        if (BuildVars.LOGS_ENABLED) {
        }
        if (list == null) {
            return false;
        }
    }

    public static boolean e() {
        hz sheetFragment;
        n2 U = LaunchActivity.U();
        if (U == null || !(U.getParentLayout() instanceof ActionBarLayout) || (sheetFragment = ((ActionBarLayout) U.getParentLayout()).getSheetFragment()) == null || sheetFragment.getArticleViewer() == null) {
            return (U == null || U.getArticleViewer() == null) ? false : true;
        }
        return true;
    }

    public static boolean f(Uri uri, boolean z10, boolean[] zArr) {
        String str;
        String str2;
        String hostAuthority = AndroidUtilities.getHostAuthority(uri);
        String lowerCase = hostAuthority != null ? hostAuthority.toLowerCase() : "";
        if (!MessagesController.getInstance(UserConfig.selectedAccount).authDomains.contains(lowerCase)) {
            Matcher matcher = LaunchActivity.B1.matcher(lowerCase);
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
                    List<ResolveInfo> queryIntentActivities = ApplicationLoader.applicationContext.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0);
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

    public static boolean g(String str) {
        try {
            return TextUtils.equals(AndroidUtilities.getHostAuthority(str), MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix);
        } catch (Exception e7) {
            FileLog.e(e7);
            return false;
        }
    }

    public static boolean h(String str, boolean z10, boolean z11) {
        if (z10) {
            return str.equals("telegra.ph") || str.equals("te.legra.ph") || str.equals("graph.org");
        }
        StringBuilder sb2 = new StringBuilder("^(https");
        sb2.append(z11 ? "" : "?");
        sb2.append("://)?(te\\.?legra\\.ph|graph\\.org)(/.*|$)");
        return str.matches(sb2.toString());
    }

    public static boolean i(String str) {
        String hostAuthority = AndroidUtilities.getHostAuthority(str, true);
        if (hostAuthority != null && (hostAuthority.endsWith(".ton") || hostAuthority.endsWith(".adnl"))) {
            return true;
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("tonsite");
    }

    public static boolean j(String str) {
        boolean matches;
        if (f == null) {
            f = Pattern.compile("^[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9\\-\\_]+$");
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str, true);
        if (hostAuthority == null || !(hostAuthority.endsWith(".ton") || hostAuthority.endsWith(".adnl"))) {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() == null || !parse.getScheme().equalsIgnoreCase("tonsite")) {
                return false;
            }
            matches = f.matcher(parse.getScheme()).matches();
        } else {
            matches = f.matcher(hostAuthority).matches();
        }
        return !matches;
    }

    public static boolean k(Context context, String str, boolean z10, boolean z11, e eVar) {
        LaunchActivity launchActivity;
        if (str == null) {
            return false;
        }
        if (AndroidUtilities.findActivity(context) instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) AndroidUtilities.findActivity(context);
        } else {
            launchActivity = LaunchActivity.G1;
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
        launchActivity.e0(intent, eVar);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081 A[Catch: Exception -> 0x0025, ActivityNotFoundException -> 0x0028, TryCatch #2 {ActivityNotFoundException -> 0x0028, Exception -> 0x0025, blocks: (B:6:0x0005, B:8:0x000b, B:11:0x0018, B:14:0x002f, B:16:0x0035, B:17:0x0042, B:20:0x0053, B:22:0x0064, B:24:0x006a, B:32:0x0081, B:34:0x0093, B:36:0x0099, B:37:0x00b7, B:41:0x00b0, B:44:0x008a, B:46:0x004f, B:47:0x003e, B:48:0x002b), top: B:5:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a A[Catch: Exception -> 0x0025, ActivityNotFoundException -> 0x0028, TryCatch #2 {ActivityNotFoundException -> 0x0028, Exception -> 0x0025, blocks: (B:6:0x0005, B:8:0x000b, B:11:0x0018, B:14:0x002f, B:16:0x0035, B:17:0x0042, B:20:0x0053, B:22:0x0064, B:24:0x006a, B:32:0x0081, B:34:0x0093, B:36:0x0099, B:37:0x00b7, B:41:0x00b0, B:44:0x008a, B:46:0x004f, B:47:0x003e, B:48:0x002b), top: B:5:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean l(Context context, String str, boolean z10) {
        boolean z11;
        if (str != null) {
            try {
                if (!i(str) && !f(Uri.parse(str), false, null)) {
                    Uri parse = Uri.parse(str);
                    String v = v(parse, parse.getScheme() == null ? "https" : parse.getScheme(), null, parse.getHost() != null ? parse.getHost().toLowerCase() : parse.getHost(), TextUtils.isEmpty(parse.getPath()) ? "/" : parse.getPath());
                    Uri parse2 = Uri.parse(v);
                    if (!v.startsWith("intent://") && (parse2.getScheme() == null || !parse2.getScheme().equalsIgnoreCase("intent"))) {
                        z11 = false;
                        if (z11 || z10) {
                            Intent parseUri = !z11 ? Intent.parseUri(parse2.toString(), 1) : new Intent("android.intent.action.VIEW", parse2);
                            if (z11 && Build.VERSION.SDK_INT >= 30) {
                                parseUri.addCategory("android.intent.category.BROWSABLE");
                                parseUri.addCategory("android.intent.category.DEFAULT");
                                parseUri.addFlags(TLObject.FLAG_28);
                                parseUri.addFlags(1024);
                            } else if (!z11 && !d(context, v)) {
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
                FileLog.e((Throwable) e7, false);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        return false;
    }

    public static boolean m(Context context, String str, boolean z10, String str2) {
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
                FileLog.e(e7);
                return false;
            }
        }
        return false;
    }

    public static void n(String str) {
        o3 P;
        n3 n3Var;
        m3[] m3VarArr;
        m3 m3Var;
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && (P = launchActivity.P()) != null) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<n3> tabs = P.getTabs();
                for (int i10 = 0; i10 < tabs.size(); i10++) {
                    n3Var = tabs.get(i10);
                    i4 i4Var = n3Var.J;
                    if (i4Var != null && !i4Var.d0.isEmpty()) {
                        Object h = g.h(1, n3Var.J.d0);
                        if (h instanceof z2) {
                            org.telegram.ui.web.z0 z0Var = ((z2) h).b;
                            if (z0Var == null && (m3VarArr = n3Var.J.u0) != null && (m3Var = m3VarArr[0]) != null) {
                                z0Var = m3Var.getWebView();
                            }
                            if (z0Var != null) {
                                if (TextUtils.equals(o3.p(z0Var.canGoBack() ? z0Var.getUrl() : z0Var.getOpenURL()), o3.p(str))) {
                                    P.e(n3Var);
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
            n3Var = null;
            if (n3Var != null) {
                return;
            }
        }
        n2 U = LaunchActivity.U();
        if (U != null && U.getArticleViewer() != null) {
            U.getArticleViewer().N(null, null, null, str);
            return;
        }
        if (U != null && (U.getParentLayout() instanceof ActionBarLayout)) {
            U = ((ActionBarLayout) U.getParentLayout()).getSheetFragment();
        }
        if (U == null) {
            return;
        }
        U.createArticleViewer(false).N(null, null, null, str);
    }

    public static void o(Activity activity, String str, boolean z10) {
        if (activity == null || str == null) {
            return;
        }
        p(activity, Uri.parse(str), z10, true);
    }

    public static void p(Context context, Uri uri, boolean z10, boolean z11) {
        r(context, uri, z10, z11, false, null, null, false, true, false);
    }

    public static void q(Context context, Uri uri, boolean z10, boolean z11, e eVar) {
        r(context, uri, z10, z11, false, eVar, null, false, true, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:4|(30:176|177|244|(1:8)(1:175)|(3:138|139|(7:141|(10:143|144|145|(2:147|(2:149|(2:151|(1:153))))|170|11|12|(2:134|135)(1:14)|15|(19:21|(1:23)|127|128|129|26|27|(1:29)|(3:(2:32|(1:34))|35|(3:50|51|(2:53|54)(9:55|(1:57)|58|(1:60)(1:119)|61|62|63|64|66)))|120|(3:98|99|(2:(1:102)|114))|70|(5:97|73|74|(1:76)|(1:(2:83|(4:85|(2:89|(1:91))|92|93)(1:94))(2:95|96))(2:80|81))|72|73|74|(0)|(1:78)|(0)(0))(1:19))(1:172)|154|155|156|157|(2:159|160)(5:161|162|163|164|165)))|10|11|12|(0)(0)|15|(1:17)|21|(0)|127|128|129|26|27|(0)|(0)|120|(0)|70|(0)|72|73|74|(0)|(0)|(0)(0))|6|(0)(0)|(0)|10|11|12|(0)(0)|15|(0)|21|(0)|127|128|129|26|27|(0)|(0)|120|(0)|70|(0)|72|73|74|(0)|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x041b, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r22).isWebBrowserOpenInApp(r3.toString()) != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0427, code lost:
    
        if (android.text.TextUtils.isEmpty(r21) == false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x042d, code lost:
    
        if (r3.getScheme() != null) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0437, code lost:
    
        if ("https".equals(r3.getScheme()) == false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0441, code lost:
    
        if ("http".equals(r3.getScheme()) == false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x044e, code lost:
    
        if ("tonsite".equals(r3.getScheme()) == false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0421, code lost:
    
        if (e() != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02bd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x027a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x027b, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0400, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0401, code lost:
    
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0272, code lost:
    
        if ("https".equals(r2) != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x027e, code lost:
    
        r3 = r20;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0249 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x025e A[Catch: Exception -> 0x0253, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x0253, blocks: (B:135:0x0249, B:17:0x025e, B:23:0x026e), top: B:134:0x0249 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x026e A[Catch: Exception -> 0x0253, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x0253, blocks: (B:135:0x0249, B:17:0x025e, B:23:0x026e), top: B:134:0x0249 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x029c A[Catch: Exception -> 0x02bd, TryCatch #4 {Exception -> 0x02bd, blocks: (B:27:0x0280, B:29:0x029c, B:32:0x02c3, B:35:0x02d5, B:37:0x02db, B:40:0x02e7, B:42:0x02f0, B:44:0x02fa, B:46:0x02fe, B:48:0x0309, B:50:0x0313, B:53:0x0323, B:55:0x0332, B:57:0x035d, B:58:0x0368, B:61:0x0377, B:119:0x0373), top: B:26:0x0280 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0465 A[Catch: Exception -> 0x04c6, TRY_ENTER, TryCatch #7 {Exception -> 0x04c6, blocks: (B:99:0x0409, B:102:0x040f, B:104:0x0423, B:106:0x0429, B:108:0x042f, B:110:0x0439, B:112:0x0443, B:73:0x045d, B:76:0x0465, B:78:0x046f, B:80:0x0473, B:83:0x0481, B:85:0x048b, B:87:0x0491, B:89:0x049b, B:91:0x04b0, B:92:0x04b4, B:95:0x04bc, B:114:0x041d, B:70:0x0450), top: B:98:0x0409 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x046f A[Catch: Exception -> 0x04c6, TryCatch #7 {Exception -> 0x04c6, blocks: (B:99:0x0409, B:102:0x040f, B:104:0x0423, B:106:0x0429, B:108:0x042f, B:110:0x0439, B:112:0x0443, B:73:0x045d, B:76:0x0465, B:78:0x046f, B:80:0x0473, B:83:0x0481, B:85:0x048b, B:87:0x0491, B:89:0x049b, B:91:0x04b0, B:92:0x04b4, B:95:0x04bc, B:114:0x041d, B:70:0x0450), top: B:98:0x0409 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0481 A[Catch: Exception -> 0x04c6, TryCatch #7 {Exception -> 0x04c6, blocks: (B:99:0x0409, B:102:0x040f, B:104:0x0423, B:106:0x0429, B:108:0x042f, B:110:0x0439, B:112:0x0443, B:73:0x045d, B:76:0x0465, B:78:0x046f, B:80:0x0473, B:83:0x0481, B:85:0x048b, B:87:0x0491, B:89:0x049b, B:91:0x04b0, B:92:0x04b4, B:95:0x04bc, B:114:0x041d, B:70:0x0450), top: B:98:0x0409 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04bc A[Catch: Exception -> 0x04c6, TRY_LEAVE, TryCatch #7 {Exception -> 0x04c6, blocks: (B:99:0x0409, B:102:0x040f, B:104:0x0423, B:106:0x0429, B:108:0x042f, B:110:0x0439, B:112:0x0443, B:73:0x045d, B:76:0x0465, B:78:0x046f, B:80:0x0473, B:83:0x0481, B:85:0x048b, B:87:0x0491, B:89:0x049b, B:91:0x04b0, B:92:0x04b4, B:95:0x04bc, B:114:0x041d, B:70:0x0450), top: B:98:0x0409 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0409 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r(Context context, Uri uri, boolean z10, boolean z11, boolean z12, e eVar, String str, boolean z13, boolean z14, boolean z15) {
        String str2;
        String str3;
        boolean z16;
        boolean z17;
        String hostAuthority;
        char c10;
        e eVar2;
        int i10;
        String str4;
        boolean z18;
        Uri uri2;
        boolean z19;
        LaunchActivity launchActivity;
        String lowerCase;
        String str5;
        String hostAuthority2;
        if (context == null || uri == null) {
            return;
        }
        int i11 = UserConfig.selectedAccount;
        boolean[] zArr = {false};
        boolean f7 = f(uri, false, zArr);
        int i12 = 13;
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
                    hostAuthority = AndroidUtilities.getHostAuthority(uri);
                } catch (Exception unused) {
                }
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser() != null) {
                    if (h(hostAuthority, true, false)) {
                        c10 = 0;
                    } else {
                        c10 = 0;
                        try {
                            if ("telegram.org".equalsIgnoreCase(hostAuthority)) {
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
                        z18 = z16;
                        if (uri.getScheme() != null) {
                            try {
                                lowerCase = uri.getScheme().toLowerCase();
                            } catch (Exception e7) {
                                e = e7;
                                uri2 = uri;
                                FileLog.e(e);
                                if (z14) {
                                }
                                if (!i(uri2.toString())) {
                                }
                                z19 = true;
                                if (uri2.getScheme() != null) {
                                }
                                if (!f7) {
                                }
                                if (z19) {
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
                        hostAuthority2 = AndroidUtilities.getHostAuthority(uri2.toString().toLowerCase());
                        if (AccountInstance.getInstance(i10).getMessagesController().autologinDomains.contains(hostAuthority2)) {
                            uri2 = uri2.buildUpon().appendQueryParameter("autologin_token", URLEncoder.encode(AccountInstance.getInstance(UserConfig.selectedAccount).getMessagesController().autologinToken, "UTF-8")).build();
                        }
                        if (z18) {
                            if (uri2 == null) {
                                if (!MessagesController.getInstance(i10).isWebBrowserOpenInApp(uri2.toString())) {
                                }
                            }
                            if (!e() && MessagesController.getInstance(i10).isWebBrowserUseCustomTabs() && !f7 && !str5.equals("tel") && !i(uri2.toString()) && (zArr[c10] || !l(context, uri2.toString(), false) || !d(context, uri2.toString()))) {
                                if (MessagesController.getInstance(i10).authDomains.contains(hostAuthority2)) {
                                    Intent intent = new Intent("android.intent.action.VIEW", uri2);
                                    intent.addFlags(TLObject.FLAG_28);
                                    ApplicationLoader.applicationContext.startActivity(intent);
                                    return;
                                }
                                Intent intent2 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShareBroadcastReceiver.class);
                                intent2.setAction("android.intent.action.SEND");
                                PendingIntent broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, new Intent(ApplicationLoader.applicationContext, (Class<?>) CustomTabsCopyReceiver.class), 167772160);
                                z0 c11 = c();
                                Intent intent3 = new Intent("android.intent.action.VIEW");
                                if (c11 != null) {
                                    intent3.setPackage(((ComponentName) c11.c).getPackageName());
                                }
                                Bundle bundle = new Bundle();
                                bundle.putBinder("android.support.customtabs.extra.SESSION", c11 == null ? null : (vf.b) c11.b);
                                intent3.putExtras(bundle);
                                String string = LocaleController.getString(R.string.CopyLink);
                                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", string);
                                bundle2.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast);
                                arrayList.add(bundle2);
                                intent3.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", j6.w0(null, j6.S8, false));
                                intent3.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.msg_filled_shareout);
                                String string2 = LocaleController.getString(R.string.ShareFile);
                                try {
                                    PendingIntent broadcast2 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent2, 33554432);
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putInt("android.support.customtabs.customaction.ID", 0);
                                    bundle3.putParcelable("android.support.customtabs.customaction.ICON", decodeResource);
                                    bundle3.putString("android.support.customtabs.customaction.DESCRIPTION", string2);
                                    bundle3.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast2);
                                    intent3.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle3);
                                    intent3.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", true);
                                    intent3.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
                                    intent3.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                                    intent3.addFlags(TLObject.FLAG_28);
                                    intent3.setData(uri2);
                                    context.startActivity(intent3, null);
                                    return;
                                } catch (Exception e10) {
                                    e = e10;
                                    FileLog.e(e);
                                    if (z14) {
                                    }
                                    if (!i(uri2.toString())) {
                                    }
                                    z19 = true;
                                    if (uri2.getScheme() != null) {
                                    }
                                    if (!f7) {
                                    }
                                    if (z19) {
                                    }
                                }
                            }
                        }
                        if (z14) {
                            try {
                                if (BubbleActivity.a0 == null) {
                                    if (uri2 != null) {
                                    }
                                }
                            } catch (Exception e11) {
                                FileLog.e(e11);
                                return;
                            }
                        }
                        if (!i(uri2.toString())) {
                            z19 = false;
                            if (uri2.getScheme() != null) {
                                uri2.getScheme().equalsIgnoreCase("intent");
                            }
                            if (!f7 && (launchActivity = LaunchActivity.G1) != null) {
                                k(launchActivity, uri2.toString(), z12, z15, eVar2);
                                return;
                            }
                            if (z19) {
                                m(context, uri2.toString(), z13, str4);
                                return;
                            }
                            if (l(context, uri2.toString(), z13)) {
                                return;
                            }
                            if (uri2.getScheme() != null && uri2.getScheme().equalsIgnoreCase("intent")) {
                                String stringExtra = Intent.parseUri(uri2.toString(), 1).getStringExtra("browser_fallback_url");
                                if (!TextUtils.isEmpty(stringExtra)) {
                                    uri2 = Uri.parse(stringExtra);
                                }
                            }
                            n(uri2.toString());
                            return;
                        }
                        z19 = true;
                        if (uri2.getScheme() != null) {
                        }
                        if (!f7) {
                        }
                        if (z19) {
                        }
                    }
                    b2[] b2VarArr = new b2[1];
                    b2VarArr[c10] = new b2(context, 3, null);
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = uri.toString();
                    eVar2 = eVar;
                    str4 = str3;
                    z18 = z16;
                    try {
                        int sendRequest = ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(getwebpagepreview, new a(eVar2, b2VarArr, i11, uri, context, z18));
                        if (eVar2 != null) {
                            eVar2.d();
                            return;
                        } else {
                            i10 = i11;
                            try {
                                AndroidUtilities.runOnUIThread(new ah.g(b2VarArr, sendRequest, i12), 1000L);
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
            z18 = z16;
            c10 = 0;
            if (uri.getScheme() != null) {
            }
            str5 = lowerCase;
            if (str5 == null) {
            }
            if (!"http".equals(str5)) {
            }
            uri2 = uri.normalizeScheme();
            hostAuthority2 = AndroidUtilities.getHostAuthority(uri2.toString().toLowerCase());
            if (AccountInstance.getInstance(i10).getMessagesController().autologinDomains.contains(hostAuthority2)) {
            }
            if (z18) {
            }
            if (z14) {
            }
            if (!i(uri2.toString())) {
            }
            z19 = true;
            if (uri2.getScheme() != null) {
            }
            if (!f7) {
            }
            if (z19) {
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
        z18 = z16;
        c10 = 0;
        if (uri.getScheme() != null) {
        }
        str5 = lowerCase;
        if (str5 == null) {
        }
        if (!"http".equals(str5)) {
        }
        uri2 = uri.normalizeScheme();
        hostAuthority2 = AndroidUtilities.getHostAuthority(uri2.toString().toLowerCase());
        if (AccountInstance.getInstance(i10).getMessagesController().autologinDomains.contains(hostAuthority2)) {
        }
        if (z18) {
        }
        if (z14) {
        }
        if (!i(uri2.toString())) {
        }
        z19 = true;
        if (uri2.getScheme() != null) {
        }
        if (!f7) {
        }
        if (z19) {
        }
    }

    public static void s(Context context, String str) {
        if (str == null) {
            return;
        }
        p(context, Uri.parse(str), true, true);
    }

    public static void t(LaunchActivity launchActivity, Uri uri) {
        p(launchActivity, uri, true, true);
    }

    public static void u(Context context, String str) {
        if (str == null) {
            return;
        }
        r(context, Uri.parse(str), false, true, false, null, null, false, false, false);
    }

    public static String v(Uri uri, String str, String str2, String str3, String str4) {
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

    public static String w(Uri uri, String str) {
        return v(uri, null, null, str, null);
    }

    public static void x(Activity activity) {
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

    public static boolean y(String str) {
        return h(str, false, true) || str.matches("^(https://)?t\\.me/iv\\??(/.*|$)") || str.matches("^(https://)?telegram\\.org/(blog|tour)(/.*|$)") || str.matches("^(https://)?fragment\\.com(/.*|$)");
    }
}
