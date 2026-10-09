package of;

import ai.p8;
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
import java.lang.ref.WeakReference;
import java.net.IDN;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n6.t;
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
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gz;
import org.telegram.ui.i4;
import org.telegram.ui.web.y0;
import org.telegram.ui.z2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class f {
    public static b5 a;
    public static t b;
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

    public static b5 c() {
        t tVar = b;
        b5 b5Var = null;
        if (tVar == null) {
            a = null;
        } else if (a == null) {
            na.d dVar = new na.d(16);
            wf.e eVar = (wf.e) tVar.b;
            wf.b bVar = new wf.b(dVar);
            try {
                if (((wf.c) eVar).F0(bVar)) {
                    b5Var = new b5(bVar, (ComponentName) tVar.c, false, 23);
                }
            } catch (RemoteException unused) {
            }
            a = b5Var;
            new WeakReference(b5Var);
        }
        return a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:5|6|7|(11:11|12|(5:16|(2:18|19)(1:21)|20|13|14)|22|23|24|25|(3:27|(4:30|(2:31|(1:1)(2:33|(3:36|37|38)(1:35)))|39|28)|41)(3:58|(5:61|(1:83)(1:77)|(2:79|80)(1:82)|81|59)|84)|42|(3:44|(3:47|48|45)|49)|(1:56)(2:54|55))|89|23|24|25|(0)(0)|42|(0)|(2:52|56)(1:57)) */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
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
                    if (lowerCase != null && (lowerCase.contains("browser") || lowerCase.contains("chrome") || lowerCase.contains("firefox") || "com.microsoft.emmx".equals(lowerCase) || "com.opera.mini.native".equals(lowerCase) || "com.duckduckgo.mobile.android".equals(lowerCase) || "com.UCMobile.intl".equals(lowerCase))) {
                        list.remove(i13);
                        i13--;
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
        gz sheetFragment;
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
        n3 P;
        m3 m3Var;
        org.telegram.ui.m3[] m3VarArr;
        org.telegram.ui.m3 m3Var2;
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && (P = launchActivity.P()) != null) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<m3> tabs = P.getTabs();
                for (int i10 = 0; i10 < tabs.size(); i10++) {
                    m3Var = tabs.get(i10);
                    i4 i4Var = m3Var.J;
                    if (i4Var != null && !i4Var.d0.isEmpty()) {
                        Object g10 = hg.c.g(1, m3Var.J.d0);
                        if (g10 instanceof z2) {
                            y0 y0Var = ((z2) g10).b;
                            if (y0Var == null && (m3VarArr = m3Var.J.u0) != null && (m3Var2 = m3VarArr[0]) != null) {
                                y0Var = m3Var2.getWebView();
                            }
                            if (y0Var != null) {
                                if (TextUtils.equals(n3.p(y0Var.canGoBack() ? y0Var.getUrl() : y0Var.getOpenURL()), n3.p(str))) {
                                    P.e(m3Var);
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
            m3Var = null;
            if (m3Var != null) {
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

    /* JADX WARN: Can't wrap try/catch for region: R(31:4|(31:193|194|261|(1:8)(1:192)|(3:155|156|(7:158|(11:160|161|162|(2:164|(2:166|(2:168|(1:170))))|187|11|12|13|(2:151|152)(1:15)|16|(19:22|(1:24)|144|145|146|27|28|(1:30)|(3:(2:33|(1:35))|36|(5:45|(3:127|128|(10:133|(3:102|103|(2:(1:106)|118))|74|(5:101|77|78|(1:80)|(1:(2:87|(4:89|(2:93|(1:95))|96|97)(1:98))(2:99|100))(2:84|85))|76|77|78|(0)|(1:82)|(0)(0)))|47|48|(2:50|51)(16:52|53|54|55|56|(1:58)|59|(1:61)(1:124)|62|63|64|65|66|67|68|70)))|137|(0)|74|(0)|76|77|78|(0)|(0)|(0)(0))(1:20))(1:189)|171|172|173|174|(2:176|177)(5:178|179|180|181|182)))|10|11|12|13|(0)(0)|16|(1:18)|22|(0)|144|145|146|27|28|(0)|(0)|137|(0)|74|(0)|76|77|78|(0)|(0)|(0)(0))|6|(0)(0)|(0)|10|11|12|13|(0)(0)|16|(0)|22|(0)|144|145|146|27|28|(0)|(0)|137|(0)|74|(0)|76|77|78|(0)|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x042c, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r22).isWebBrowserOpenInApp(r3.toString()) != false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0438, code lost:
    
        if (android.text.TextUtils.isEmpty(r21) == false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x043e, code lost:
    
        if (r3.getScheme() != null) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0448, code lost:
    
        if ("https".equals(r3.getScheme()) == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0452, code lost:
    
        if ("http".equals(r3.getScheme()) == false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x045f, code lost:
    
        if ("tonsite".equals(r3.getScheme()) == false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0432, code lost:
    
        if (e() != false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02c0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x027d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x027e, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0410, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0411, code lost:
    
        r2 = r17;
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0275, code lost:
    
        if ("https".equals(r2) != false) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0281, code lost:
    
        r3 = r20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x041a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0199 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0261 A[Catch: Exception -> 0x0255, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x0255, blocks: (B:152:0x024b, B:18:0x0261, B:24:0x0271), top: B:151:0x024b }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0271 A[Catch: Exception -> 0x0255, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x0255, blocks: (B:152:0x024b, B:18:0x0261, B:24:0x0271), top: B:151:0x024b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x029f A[Catch: Exception -> 0x02c0, TryCatch #0 {Exception -> 0x02c0, blocks: (B:28:0x0283, B:30:0x029f, B:33:0x02c6, B:36:0x02d9, B:38:0x02df, B:41:0x02eb, B:43:0x02f4, B:45:0x02fe), top: B:27:0x0283 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0476 A[Catch: Exception -> 0x04d7, TRY_ENTER, TryCatch #7 {Exception -> 0x04d7, blocks: (B:103:0x041a, B:106:0x0420, B:108:0x0434, B:110:0x043a, B:112:0x0440, B:114:0x044a, B:116:0x0454, B:77:0x046e, B:80:0x0476, B:82:0x0480, B:84:0x0484, B:87:0x0492, B:89:0x049c, B:91:0x04a2, B:93:0x04ac, B:95:0x04c1, B:96:0x04c5, B:99:0x04cd, B:118:0x042e, B:74:0x0461), top: B:102:0x041a }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0480 A[Catch: Exception -> 0x04d7, TryCatch #7 {Exception -> 0x04d7, blocks: (B:103:0x041a, B:106:0x0420, B:108:0x0434, B:110:0x043a, B:112:0x0440, B:114:0x044a, B:116:0x0454, B:77:0x046e, B:80:0x0476, B:82:0x0480, B:84:0x0484, B:87:0x0492, B:89:0x049c, B:91:0x04a2, B:93:0x04ac, B:95:0x04c1, B:96:0x04c5, B:99:0x04cd, B:118:0x042e, B:74:0x0461), top: B:102:0x041a }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0492 A[Catch: Exception -> 0x04d7, TryCatch #7 {Exception -> 0x04d7, blocks: (B:103:0x041a, B:106:0x0420, B:108:0x0434, B:110:0x043a, B:112:0x0440, B:114:0x044a, B:116:0x0454, B:77:0x046e, B:80:0x0476, B:82:0x0480, B:84:0x0484, B:87:0x0492, B:89:0x049c, B:91:0x04a2, B:93:0x04ac, B:95:0x04c1, B:96:0x04c5, B:99:0x04cd, B:118:0x042e, B:74:0x0461), top: B:102:0x041a }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04cd A[Catch: Exception -> 0x04d7, TRY_LEAVE, TryCatch #7 {Exception -> 0x04d7, blocks: (B:103:0x041a, B:106:0x0420, B:108:0x0434, B:110:0x043a, B:112:0x0440, B:114:0x044a, B:116:0x0454, B:77:0x046e, B:80:0x0476, B:82:0x0480, B:84:0x0484, B:87:0x0492, B:89:0x049c, B:91:0x04a2, B:93:0x04ac, B:95:0x04c1, B:96:0x04c5, B:99:0x04cd, B:118:0x042e, B:74:0x0461), top: B:102:0x041a }] */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r(Context context, Uri uri, boolean z10, boolean z11, boolean z12, e eVar, String str, boolean z13, boolean z14, boolean z15) {
        String str2;
        String str3;
        boolean z16;
        boolean z17;
        String hostAuthority;
        boolean z18;
        e eVar2;
        int i10;
        String str4;
        boolean z19;
        boolean z20;
        Uri uri2;
        boolean z21;
        LaunchActivity launchActivity;
        String lowerCase;
        String str5;
        String hostAuthority2;
        Intent intent;
        ArrayList<? extends Parcelable> arrayList;
        Bitmap decodeResource;
        String string;
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
                        z18 = 0;
                    } else {
                        z18 = 0;
                        try {
                            if ("telegram.org".equalsIgnoreCase(hostAuthority)) {
                                z18 = z18;
                                if (!uri.toString().toLowerCase().contains("telegram.org/faq")) {
                                    z18 = z18;
                                    if (!uri.toString().toLowerCase().contains("telegram.org/privacy")) {
                                        if (uri.toString().toLowerCase().contains("telegram.org/blog")) {
                                            z18 = z18;
                                        }
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        eVar2 = eVar;
                        i10 = i11;
                        str4 = str3;
                        z18 = z18;
                        z19 = z16;
                        if (uri.getScheme() != null) {
                            try {
                                lowerCase = uri.getScheme().toLowerCase();
                            } catch (Exception e7) {
                                e = e7;
                                uri2 = uri;
                                z20 = z18;
                                FileLog.e(e);
                                if (z14) {
                                }
                                if (!i(uri2.toString())) {
                                }
                                z21 = true;
                                if (uri2.getScheme() != null) {
                                }
                                if (!f7) {
                                }
                                if (z21) {
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
                        if (z19) {
                            if (uri2 == null) {
                                if (!MessagesController.getInstance(i10).isWebBrowserOpenInApp(uri2.toString())) {
                                }
                            }
                            if (!e() && MessagesController.getInstance(i10).isWebBrowserUseCustomTabs() && !f7 && !str5.equals("tel") && !i(uri2.toString())) {
                                if (!zArr[z18]) {
                                    try {
                                    } catch (Exception e10) {
                                        e = e10;
                                        z20 = false;
                                        FileLog.e(e);
                                        if (z14) {
                                        }
                                        if (!i(uri2.toString())) {
                                        }
                                        z21 = true;
                                        if (uri2.getScheme() != null) {
                                        }
                                        if (!f7) {
                                        }
                                        if (z21) {
                                        }
                                    }
                                    if (l(context, uri2.toString(), z18) && d(context, uri2.toString())) {
                                        z20 = false;
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
                                            z21 = z20;
                                            if (uri2.getScheme() != null) {
                                                uri2.getScheme().equalsIgnoreCase("intent");
                                            }
                                            if (!f7 && (launchActivity = LaunchActivity.G1) != null) {
                                                k(launchActivity, uri2.toString(), z12, z15, eVar2);
                                                return;
                                            }
                                            if (z21) {
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
                                        z21 = true;
                                        if (uri2.getScheme() != null) {
                                        }
                                        if (!f7) {
                                        }
                                        if (z21) {
                                        }
                                    }
                                }
                                if (MessagesController.getInstance(i10).authDomains.contains(hostAuthority2)) {
                                    Intent intent2 = new Intent("android.intent.action.VIEW", uri2);
                                    intent2.addFlags(TLObject.FLAG_28);
                                    ApplicationLoader.applicationContext.startActivity(intent2);
                                    return;
                                }
                                Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) ShareBroadcastReceiver.class);
                                intent3.setAction("android.intent.action.SEND");
                                boolean z22 = false;
                                try {
                                    PendingIntent broadcast = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, new Intent(ApplicationLoader.applicationContext, (Class<?>) CustomTabsCopyReceiver.class), 167772160);
                                    b5 c10 = c();
                                    intent = new Intent("android.intent.action.VIEW");
                                    if (c10 != null) {
                                        intent.setPackage(((ComponentName) c10.c).getPackageName());
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putBinder("android.support.customtabs.extra.SESSION", c10 == null ? null : (wf.b) c10.b);
                                    intent.putExtras(bundle);
                                    String string2 = LocaleController.getString(R.string.CopyLink);
                                    arrayList = new ArrayList<>();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", string2);
                                    bundle2.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast);
                                    arrayList.add(bundle2);
                                    z22 = false;
                                    intent.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", i6.x0(null, i6.S8, false));
                                    intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                                    decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.msg_filled_shareout);
                                    string = LocaleController.getString(R.string.ShareFile);
                                    z20 = false;
                                } catch (Exception e12) {
                                    e = e12;
                                    z20 = z22;
                                }
                                try {
                                    PendingIntent broadcast2 = PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent3, 33554432);
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putInt("android.support.customtabs.customaction.ID", 0);
                                    bundle3.putParcelable("android.support.customtabs.customaction.ICON", decodeResource);
                                    bundle3.putString("android.support.customtabs.customaction.DESCRIPTION", string);
                                    bundle3.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast2);
                                    intent.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle3);
                                    intent.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", true);
                                    intent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
                                    intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                                    intent.addFlags(TLObject.FLAG_28);
                                    intent.setData(uri2);
                                    context.startActivity(intent, null);
                                    return;
                                } catch (Exception e13) {
                                    e = e13;
                                    FileLog.e(e);
                                    if (z14) {
                                    }
                                    if (!i(uri2.toString())) {
                                    }
                                    z21 = true;
                                    if (uri2.getScheme() != null) {
                                    }
                                    if (!f7) {
                                    }
                                    if (z21) {
                                    }
                                }
                            }
                        }
                        z20 = z18;
                        if (z14) {
                        }
                        if (!i(uri2.toString())) {
                        }
                        z21 = true;
                        if (uri2.getScheme() != null) {
                        }
                        if (!f7) {
                        }
                        if (z21) {
                        }
                    }
                    b2[] b2VarArr = new b2[1];
                    b2VarArr[z18 == true ? 1 : 0] = new b2(context, 3, null);
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = uri.toString();
                    eVar2 = eVar;
                    str4 = str3;
                    z19 = z16;
                    try {
                        int sendRequest = ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(getwebpagepreview, new a(eVar2, b2VarArr, i11, uri, context, z19));
                        if (eVar2 != null) {
                            eVar2.d();
                            return;
                        } else {
                            i10 = i11;
                            try {
                                AndroidUtilities.runOnUIThread(new p8(b2VarArr, sendRequest, i12), 1000L);
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
            z18 = 0;
            z19 = z16;
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
            if (z19) {
            }
            z20 = z18;
            if (z14) {
            }
            if (!i(uri2.toString())) {
            }
            z21 = true;
            if (uri2.getScheme() != null) {
            }
            if (!f7) {
            }
            if (z21) {
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
        z18 = 0;
        z19 = z16;
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
        if (z19) {
        }
        z20 = z18;
        if (z14) {
        }
        if (!i(uri2.toString())) {
        }
        z21 = true;
        if (uri2.getScheme() != null) {
        }
        if (!f7) {
        }
        if (z21) {
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
