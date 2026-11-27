// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class m01 {
    public static lh2 a;
    public static qx6 b;
    public static t8a c;
    public static String d;
    public static WeakReference e;
    public static Pattern f;

    public static boolean A(String str) {
        return j(str, false, true) || str.matches("^(https://)?t\\.me/iv\\??(/.*|$)") || str.matches("^(https://)?telegram\\.org/(blog|tour)(/.*|$)") || str.matches("^(https://)?fragment\\.com(/.*|$)");
    }

    public static String B(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        boolean z2 = false;
        for (String str2 : str.split("&", -1)) {
            int indexOf = str2.indexOf(61);
            String substring = indexOf < 0 ? str2 : str2.substring(0, indexOf);
            int i = 0;
            while (i < 4) {
                String decode = Uri.decode(substring);
                if (TextUtils.equals(decode, substring)) {
                    break;
                }
                i++;
                substring = decode;
            }
            while (substring.startsWith("?")) {
                substring = substring.substring(1);
            }
            String lowerCase = substring.toLowerCase();
            if (lowerCase.startsWith("tgwebauth") || lowerCase.equals("autologin_token")) {
                z2 = true;
            } else {
                if (!z) {
                    sb.append('&');
                }
                sb.append(str2);
                z = false;
            }
        }
        if (z2) {
            return sb.toString();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Uri C(Uri uri) {
        String str;
        if (uri == null) {
            return uri;
        }
        if (!"http".equalsIgnoreCase(uri.getScheme()) && !"https".equalsIgnoreCase(uri.getScheme())) {
            return uri;
        }
        String B = B(uri.getEncodedQuery());
        String encodedFragment = uri.getEncodedFragment();
        if (encodedFragment != null) {
            int indexOf = encodedFragment.indexOf(63);
            if (indexOf < 0) {
                str = B(encodedFragment);
            } else {
                String substring = encodedFragment.substring(0, indexOf);
                String substring2 = encodedFragment.substring(indexOf + 1);
                String B2 = B(substring);
                String B3 = B(substring2);
                if (B2 != null || B3 != null) {
                    if (B3 != null) {
                        substring2 = B3;
                    }
                    if (B2 != null) {
                        substring = B2;
                    }
                    str = substring.concat(substring2.isEmpty() ? "" : "?".concat(substring2));
                }
            }
            if (B != null && str == null) {
                return uri;
            }
            Uri.Builder buildUpon = uri.buildUpon();
            if (B != null) {
                if (B.isEmpty()) {
                    B = null;
                }
                buildUpon.encodedQuery(B);
            }
            if (str != null) {
                buildUpon.encodedFragment(str.isEmpty() ? null : str);
            }
            return buildUpon.build();
        }
        str = null;
        if (B != null) {
        }
        Uri.Builder buildUpon2 = uri.buildUpon();
        if (B != null) {
        }
        if (str != null) {
        }
        return buildUpon2.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(String str) {
        boolean z;
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        if (str != null) {
            String[] split = str.split("\\.");
            if (split.length > 0) {
                z = split[split.length - 1].startsWith("xn--");
                if (z) {
                    return str;
                }
                try {
                    return IDN.toUnicode(str, 1);
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    return str;
                }
            }
        }
        z = true;
        if (z) {
        }
    }

    public static String b(String str) {
        if (str.indexOf(37) >= 0) {
            String decode = Uri.decode(str);
            if (decode.indexOf(65533) < 0) {
                StringBuilder sb = new StringBuilder(decode.length());
                int i = 0;
                while (i < decode.length()) {
                    int codePointAt = decode.codePointAt(i);
                    int charCount = Character.charCount(codePointAt);
                    if (Character.isISOControl(codePointAt) || Character.getType(codePointAt) == 16) {
                        sb.append(Uri.encode(decode.substring(i, i + charCount)));
                    } else {
                        sb.append((CharSequence) decode, i, i + charCount);
                    }
                    i += charCount;
                }
                return sb.toString();
            }
        }
        return str;
    }

    public static String c(String str) {
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

    public static String d(String str, boolean z) {
        if (str == null) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse.getHost() == null) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            if (parse.getScheme() != null) {
                sb.append(parse.getScheme());
                sb.append("://");
            }
            if (parse.getEncodedUserInfo() != null) {
                sb.append(parse.getEncodedUserInfo());
                sb.append("@");
            }
            sb.append(z ? a(parse.getHost()) : parse.getHost());
            if (parse.getPort() != -1) {
                sb.append(":");
                sb.append(parse.getPort());
            }
            if (parse.getEncodedPath() != null) {
                sb.append(b(parse.getEncodedPath()));
            }
            if (parse.getEncodedQuery() != null) {
                sb.append("?");
                sb.append(b(parse.getEncodedQuery()));
            }
            if (parse.getEncodedFragment() != null) {
                sb.append("#");
                sb.append(b(parse.getEncodedFragment()));
            }
            return sb.toString();
        } catch (Exception e2) {
            cc4.g(e2, false);
            return str;
        }
    }

    public static lh2 e() {
        qx6 qx6Var = b;
        lh2 lh2Var = null;
        if (qx6Var == null) {
            a = null;
        } else if (a == null) {
            z3f z3fVar = new z3f((byte) 14);
            bj5 bj5Var = (bj5) qx6Var.b;
            p53 p53Var = new p53(z3fVar);
            try {
                if (((zi5) bj5Var).a(p53Var)) {
                    lh2Var = new lh2(p53Var, (ComponentName) qx6Var.c, (byte) 20);
                }
            } catch (RemoteException unused) {
            }
            a = lh2Var;
            new WeakReference(lh2Var);
        }
        return a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:5|(2:6|7)|(11:11|12|(5:16|(2:18|19)(1:21)|20|13|14)|22|23|24|25|(2:(4:29|(2:30|(1:1)(2:32|(3:35|36|37)(1:34)))|38|27)|40)(2:(4:59|(2:77|78)|76|57)|80)|41|(3:43|(3:46|47|44)|48)|(1:55)(2:53|54))|85|23|24|25|(0)(0)|41|(0)|(2:51|55)(1:56)) */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e A[Catch: Exception -> 0x011e, LOOP:1: B:27:0x006e->B:38:0x0093, LOOP_START, PHI: r8
      0x006e: PHI (r8v12 int) = (r8v3 int), (r8v14 int) binds: [B:26:0x006c, B:38:0x0093] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x011e, blocks: (B:25:0x005a, B:27:0x006e, B:30:0x0075, B:32:0x0078, B:36:0x008a, B:34:0x0090, B:38:0x0093, B:41:0x00ea, B:44:0x00ef, B:46:0x00f5, B:57:0x0095, B:59:0x009b, B:61:0x00ab, B:63:0x00b3, B:65:0x00bb, B:67:0x00c3, B:69:0x00cb, B:71:0x00d3, B:73:0x00db, B:77:0x00e3, B:76:0x00e8), top: B:24:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095 A[Catch: Exception -> 0x011e, LOOP:4: B:57:0x0095->B:76:0x00e8, LOOP_START, PHI: r8
      0x0095: PHI (r8v4 int) = (r8v3 int), (r8v6 int) binds: [B:26:0x006c, B:76:0x00e8] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x011e, blocks: (B:25:0x005a, B:27:0x006e, B:30:0x0075, B:32:0x0078, B:36:0x008a, B:34:0x0090, B:38:0x0093, B:41:0x00ea, B:44:0x00ef, B:46:0x00f5, B:57:0x0095, B:59:0x009b, B:61:0x00ab, B:63:0x00b3, B:65:0x00bb, B:67:0x00c3, B:69:0x00cb, B:71:0x00d3, B:73:0x00db, B:77:0x00e3, B:76:0x00e8), top: B:24:0x005a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean f(Context context, String str) {
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
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                try {
                    strArr[i] = queryIntentActivities.get(i).activityInfo.packageName;
                    if (f11.a) {
                        cc4.b("default browser name = " + strArr[i]);
                    }
                } catch (Exception unused2) {
                }
            }
            list = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0);
            int i2 = 0;
            if (strArr == null) {
                while (i2 < list.size()) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= strArr.length) {
                            break;
                        }
                        if (strArr[i3].equals(list.get(i2).activityInfo.packageName)) {
                            list.remove(i2);
                            i2--;
                            break;
                        }
                        i3++;
                    }
                    i2++;
                }
            } else {
                while (i2 < list.size()) {
                    String lowerCase = list.get(i2).activityInfo.packageName.toLowerCase();
                    if (lowerCase != null && (lowerCase.contains("browser") || lowerCase.contains("chrome") || lowerCase.contains("firefox") || "com.microsoft.emmx".equals(lowerCase) || "com.opera.mini.native".equals(lowerCase) || "com.duckduckgo.mobile.android".equals(lowerCase) || "com.UCMobile.intl".equals(lowerCase))) {
                        list.remove(i2);
                        i2--;
                    }
                    i2++;
                }
            }
            if (f11.a) {
                for (int i4 = 0; i4 < list.size(); i4++) {
                    cc4.b("device has " + list.get(i4).activityInfo.packageName + " to open " + str);
                }
            }
            return (list == null || list.isEmpty()) ? false : true;
        }
        strArr = null;
        list = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0);
        int i22 = 0;
        if (strArr == null) {
        }
        if (f11.a) {
        }
        if (list == null) {
            return false;
        }
    }

    public static boolean g(Uri uri, boolean z, boolean[] zArr) {
        String str;
        String str2;
        Typeface typeface = hl.a;
        String J0 = uri == null ? null : hl.J0(uri.toString(), false);
        String lowerCase = J0 != null ? J0.toLowerCase() : "";
        if (!uc7.s1(yac.t0).k4.J3.f.contains(lowerCase)) {
            Matcher matcher = LaunchActivity.D1.matcher(lowerCase);
            if (matcher.find()) {
                StringBuilder sb = new StringBuilder("https://t.me/");
                sb.append(matcher.group(1));
                if (TextUtils.isEmpty(uri.getPath())) {
                    str = "";
                } else {
                    str = "/" + uri.getPath();
                }
                sb.append(str);
                if (TextUtils.isEmpty(uri.getQuery())) {
                    str2 = "";
                } else {
                    str2 = "?" + uri.getQuery();
                }
                sb.append(str2);
                uri = Uri.parse(sb.toString());
                String host = uri.getHost();
                lowerCase = host != null ? host.toLowerCase() : "";
            }
            if ("ton".equals(uri.getScheme())) {
                try {
                    List<ResolveInfo> queryIntentActivities = a.b.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0);
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
                        if (!z) {
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
                        if (!z) {
                            String lowerCase3 = path2.substring(1).toLowerCase();
                            if (lowerCase3.equals("iv") || lowerCase3.startsWith("s/")) {
                                if (zArr != null) {
                                    zArr[0] = true;
                                }
                            }
                        }
                    }
                } else if ((!"telegram.org".equals(lowerCase) || uri.getPath() == null || !uri.getPath().startsWith("/blog/")) && (!z || (!lowerCase.endsWith("telegram.org") && !lowerCase.endsWith("telegra.ph") && !lowerCase.endsWith("telesco.pe")))) {
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

    public static boolean h(String str) {
        return g(Uri.parse(str), false, null);
    }

    public static boolean i(String str) {
        try {
            return TextUtils.equals(hl.J0(str, false), uc7.s1(yac.t0).N2);
        } catch (Exception e2) {
            cc4.g(e2, true);
            return false;
        }
    }

    public static boolean j(String str, boolean z, boolean z2) {
        if (z) {
            return str.equals("telegra.ph") || str.equals("te.legra.ph") || str.equals("graph.org");
        }
        StringBuilder sb = new StringBuilder("^(https");
        sb.append(z2 ? "" : "?");
        sb.append("://)?(te\\.?legra\\.ph|graph\\.org)(/.*|$)");
        return str.matches(sb.toString());
    }

    public static boolean k(String str) {
        String J0 = hl.J0(str, true);
        if (J0 != null && (J0.endsWith(".ton") || J0.endsWith(".adnl"))) {
            return true;
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("tonsite");
    }

    public static boolean l(String str) {
        boolean matches;
        if (f == null) {
            f = Pattern.compile("^[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9\\-\\_]+$");
        }
        String J0 = hl.J0(str, true);
        if (J0 == null || !(J0.endsWith(".ton") || J0.endsWith(".adnl"))) {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() == null || !parse.getScheme().equalsIgnoreCase("tonsite")) {
                return false;
            }
            matches = f.matcher(parse.getScheme()).matches();
        } else {
            matches = f.matcher(J0).matches();
        }
        return !matches;
    }

    public static boolean m(Context context, String str, boolean z, boolean z2, l01 l01Var) {
        LaunchActivity launchActivity;
        if (str == null) {
            return false;
        }
        if (hl.W(context) instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) hl.W(context);
        } else {
            launchActivity = LaunchActivity.H1;
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
        intent.putExtra("force_not_internal_apps", z);
        intent.putExtra("force_request", z2);
        launchActivity.f0(intent, l01Var);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
    
        if (f(r6, r7) != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean n(Context context, String str, boolean z) {
        Intent intent;
        if (str != null) {
            try {
                if (!k(str) && !h(str)) {
                    Uri parse = Uri.parse(str);
                    String x = x(parse, parse.getScheme() == null ? "https" : parse.getScheme(), null, parse.getHost() != null ? parse.getHost().toLowerCase() : parse.getHost(), TextUtils.isEmpty(parse.getEncodedPath()) ? "/" : parse.getEncodedPath());
                    Uri parse2 = Uri.parse(x);
                    boolean z2 = x.startsWith("intent://") || (parse2.getScheme() != null && parse2.getScheme().equalsIgnoreCase("intent"));
                    if (!z2) {
                        intent = new Intent("android.intent.action.VIEW", parse2);
                    } else if (z) {
                        intent = Intent.parseUri(parse2.toString(), 1);
                        intent.addCategory("android.intent.category.BROWSABLE");
                        intent.setComponent(null);
                        Intent selector = intent.getSelector();
                        if (selector != null) {
                            selector.addCategory("android.intent.category.BROWSABLE");
                            selector.setComponent(null);
                        }
                    }
                    if (!z2) {
                        if (Build.VERSION.SDK_INT >= 30) {
                            intent.addCategory("android.intent.category.BROWSABLE");
                            intent.addCategory("android.intent.category.DEFAULT");
                            intent.addFlags(TLObject.FLAG_28);
                            intent.addFlags(1024);
                        }
                    }
                    context.startActivity(intent);
                    return true;
                }
            } catch (ActivityNotFoundException e2) {
                cc4.g(e2, false);
            } catch (Exception e3) {
                cc4.g(e3, true);
            }
        }
        return false;
    }

    public static boolean o(Context context, String str, boolean z, String str2) {
        Intent intent;
        if (str != null) {
            ea4.g.G(str);
            try {
                Uri parse = Uri.parse(str);
                if (parse.getScheme() == null || !parse.getScheme().equalsIgnoreCase("intent")) {
                    intent = new Intent("android.intent.action.VIEW", parse);
                } else if (z) {
                    intent = Intent.parseUri(parse.toString(), 1);
                    intent.addCategory("android.intent.category.BROWSABLE");
                    intent.setComponent(null);
                    Intent selector = intent.getSelector();
                    if (selector != null) {
                        selector.addCategory("android.intent.category.BROWSABLE");
                        selector.setComponent(null);
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                    intent.setPackage(str2);
                }
                intent.putExtra("create_new_tab", true);
                intent.putExtra("com.android.browser.application_id", context.getPackageName());
                context.startActivity(intent);
                return true;
            } catch (Exception e2) {
                cc4.g(e2, true);
                return false;
            }
        }
        return false;
    }

    public static void p(String str) {
        yx0 O;
        xx0 xx0Var;
        m[] mVarArr;
        m mVar;
        ea4.g.G(str);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && (O = launchActivity.O()) != null) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<xx0> tabs = O.getTabs();
                for (int i = 0; i < tabs.size(); i++) {
                    xx0Var = tabs.get(i);
                    o oVar = xx0Var.J;
                    if (oVar != null && !oVar.e0.isEmpty()) {
                        Object g = c00.g(1, xx0Var.J.e0);
                        if (g instanceof aw) {
                            nv0 nv0Var = ((aw) g).b;
                            if (nv0Var == null && (mVarArr = xx0Var.J.v0) != null && (mVar = mVarArr[0]) != null) {
                                nv0Var = mVar.getWebView();
                            }
                            if (nv0Var != null) {
                                if (TextUtils.equals(yx0.p(nv0Var.canGoBack() ? nv0Var.getUrl() : nv0Var.getOpenURL()), yx0.p(str))) {
                                    O.e(xx0Var);
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
            xx0Var = null;
            if (xx0Var != null) {
                return;
            }
        }
        e S = LaunchActivity.S();
        if (S != null) {
            if (S.getArticleViewer() != null) {
                S.getArticleViewer().L(null, null, null, str);
                return;
            } else if (S.getParentLayout() instanceof ActionBarLayout) {
                S = ((ActionBarLayout) S.getParentLayout()).getSheetFragment();
            }
        }
        if (S == null) {
            return;
        }
        S.createArticleViewer(false).L(null, null, null, str);
    }

    public static void q(Activity activity, String str, boolean z) {
        if (activity == null || str == null) {
            return;
        }
        r(activity, Uri.parse(str), z, true);
    }

    public static void r(Context context, Uri uri, boolean z, boolean z2) {
        t(context, uri, z, z2, false, null, null, false, true, false, false);
    }

    public static void s(Context context, Uri uri, boolean z, boolean z2, l01 l01Var) {
        t(context, uri, z, z2, false, l01Var, null, false, true, false, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:4|(1:6)(1:280)|7|(35:9|10|77|(1:81)(1:267)|(5:226|227|(1:229)(1:265)|230|(7:232|(11:234|235|236|(2:238|(2:240|(2:242|(1:244))))|261|84|85|86|(1:88)(1:223)|89|(10:95|(3:216|217|218)|99|100|101|102|103|104|(2:209|210)|(10:208|(3:161|162|(1:(2:165|(2:167|(7:169|(2:171|(2:173|(1:175)))|135|136|137|(1:139)|(1:(2:146|(4:148|(2:152|(1:154))|155|156)(1:157))(2:158|159))(2:143|144))))))|133|(6:160|136|137|(0)|(1:141)|(0)(0))|135|136|137|(0)|(0)|(0)(0))(3:124|125|(2:127|180)(16:181|182|183|184|185|(1:187)|188|(1:190)(1:204)|191|192|193|194|195|196|197|199)))(1:93))(1:263)|245|246|247|248|(2:250|251)(5:252|253|254|255|256)))|83|84|85|86|(0)(0)|89|(1:91)|95|(1:97)|216|217|218|99|100|101|102|103|104|(0)|(1:108)|208|(0)|133|(0)|135|136|137|(0)|(0)|(0)(0))|279|(0)(0)|(0)|83|84|85|86|(0)(0)|89|(0)|95|(0)|216|217|218|99|100|101|102|103|104|(0)|(0)|208|(0)|133|(0)|135|136|137|(0)|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0436, code lost:
    
        if ("tonsite".equals(r4.getScheme()) != false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03e9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03ea, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03ec, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03ed, code lost:
    
        r11 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0253, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0255, code lost:
    
        cc4.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x03ef, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x03f0, code lost:
    
        r11 = r19;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x044d A[Catch: Exception -> 0x04ad, TRY_ENTER, TryCatch #2 {Exception -> 0x04ad, blocks: (B:162:0x03f8, B:165:0x03fe, B:167:0x040c, B:169:0x0412, B:171:0x0418, B:173:0x0422, B:175:0x042c, B:136:0x0445, B:139:0x044d, B:141:0x0456, B:143:0x045a, B:146:0x0468, B:148:0x0472, B:150:0x0478, B:152:0x0482, B:154:0x0497, B:155:0x049b, B:158:0x04a3, B:133:0x0438), top: B:161:0x03f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0456 A[Catch: Exception -> 0x04ad, TryCatch #2 {Exception -> 0x04ad, blocks: (B:162:0x03f8, B:165:0x03fe, B:167:0x040c, B:169:0x0412, B:171:0x0418, B:173:0x0422, B:175:0x042c, B:136:0x0445, B:139:0x044d, B:141:0x0456, B:143:0x045a, B:146:0x0468, B:148:0x0472, B:150:0x0478, B:152:0x0482, B:154:0x0497, B:155:0x049b, B:158:0x04a3, B:133:0x0438), top: B:161:0x03f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0468 A[Catch: Exception -> 0x04ad, TryCatch #2 {Exception -> 0x04ad, blocks: (B:162:0x03f8, B:165:0x03fe, B:167:0x040c, B:169:0x0412, B:171:0x0418, B:173:0x0422, B:175:0x042c, B:136:0x0445, B:139:0x044d, B:141:0x0456, B:143:0x045a, B:146:0x0468, B:148:0x0472, B:150:0x0478, B:152:0x0482, B:154:0x0497, B:155:0x049b, B:158:0x04a3, B:133:0x0438), top: B:161:0x03f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04a3 A[Catch: Exception -> 0x04ad, TRY_LEAVE, TryCatch #2 {Exception -> 0x04ad, blocks: (B:162:0x03f8, B:165:0x03fe, B:167:0x040c, B:169:0x0412, B:171:0x0418, B:173:0x0422, B:175:0x042c, B:136:0x0445, B:139:0x044d, B:141:0x0456, B:143:0x045a, B:146:0x0468, B:148:0x0472, B:150:0x0478, B:152:0x0482, B:154:0x0497, B:155:0x049b, B:158:0x04a3, B:133:0x0438), top: B:161:0x03f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x027c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0174 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022b A[Catch: Exception -> 0x03ef, TryCatch #1 {Exception -> 0x03ef, blocks: (B:86:0x0225, B:88:0x022b, B:91:0x0239, B:95:0x0241, B:97:0x0247, B:99:0x0258, B:222:0x0255, B:217:0x024d), top: B:85:0x0225, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0239 A[Catch: Exception -> 0x03ef, TryCatch #1 {Exception -> 0x03ef, blocks: (B:86:0x0225, B:88:0x022b, B:91:0x0239, B:95:0x0241, B:97:0x0247, B:99:0x0258, B:222:0x0255, B:217:0x024d), top: B:85:0x0225, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0247 A[Catch: Exception -> 0x03ef, TRY_LEAVE, TryCatch #1 {Exception -> 0x03ef, blocks: (B:86:0x0225, B:88:0x022b, B:91:0x0239, B:95:0x0241, B:97:0x0247, B:99:0x0258, B:222:0x0255, B:217:0x024d), top: B:85:0x0225, inners: #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void t(Context context, Uri uri, boolean z, boolean z2, boolean z3, l01 l01Var, String str, boolean z4, boolean z5, boolean z6, boolean z7) {
        String str2;
        boolean z8;
        boolean z9;
        String J0;
        boolean z10;
        l01 l01Var2;
        int i;
        String str3;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        LaunchActivity launchActivity;
        String lowerCase;
        String J02;
        Intent intent;
        ArrayList<? extends Parcelable> arrayList;
        Bitmap decodeResource;
        String M0;
        String str4;
        if (context == null || uri == null) {
            return;
        }
        ea4.g.G(uri.toString());
        Uri C = !z7 ? C(uri) : uri;
        int i2 = yac.t0;
        boolean[] zArr = {false};
        boolean g = g(C, false, zArr);
        byte b2 = 9;
        if (str != null) {
            switch (str) {
                case "brave-browser":
                case "brave":
                    str4 = "com.brave.browser";
                    str2 = str4;
                    break;
                case "google-chrome":
                case "chrome":
                    str4 = "com.android.chrome";
                    str2 = str4;
                    break;
                case "microsoft-edge":
                case "edge":
                    str4 = "com.microsoft.emmx";
                    str2 = str4;
                    break;
                case "tor-browser":
                case "tor":
                    str4 = "org.torproject.torbrowser";
                    str2 = str4;
                    break;
                case "duckduckgo-browser":
                case "duckduckgo":
                    str4 = "com.duckduckgo.mobile.android";
                    str2 = str4;
                    break;
                case "firefox":
                case "mozilla-firefox":
                    str4 = "org.mozilla.firefox";
                    str2 = str4;
                    break;
                case "samsung-browser":
                case "samsung":
                    str4 = "com.sec.android.app.sbrowser";
                    str2 = str4;
                    break;
                case "kiwi-browser":
                case "kiwi":
                    str4 = "com.kiwibrowser.browser";
                    str2 = str4;
                    break;
                case "opera-mini":
                    str4 = "com.opera.mini.native";
                    str2 = str4;
                    break;
                case "uc":
                case "uc-browser":
                    str4 = "com.UCMobile.intl";
                    str2 = str4;
                    break;
                case "opera":
                    str4 = "com.opera.browser";
                    str2 = str4;
                    break;
                case "vivaldi":
                case "vivaldi-browser":
                    str4 = "com.vivaldi.browser";
                    str2 = str4;
                    break;
            }
            if (str2 == null) {
                z9 = false;
                z8 = false;
            } else {
                z8 = z;
                z9 = z2;
            }
            if (z9) {
                try {
                    Typeface typeface = hl.a;
                    J0 = C == null ? null : hl.J0(C.toString(), false);
                } catch (Exception unused) {
                }
                if (yac.h(yac.t0).f() != null) {
                    if (j(J0, true, false)) {
                        z10 = false;
                    } else {
                        z10 = false;
                        try {
                            if ("telegram.org".equalsIgnoreCase(J0)) {
                                if (!C.toString().toLowerCase().contains("telegram.org/faq")) {
                                    if (!C.toString().toLowerCase().contains("telegram.org/privacy")) {
                                        if (C.toString().toLowerCase().contains("telegram.org/blog")) {
                                        }
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        l01Var2 = l01Var;
                        i = i2;
                        str3 = str2;
                        z11 = z8;
                        lowerCase = C.getScheme() != null ? C.getScheme().toLowerCase() : "";
                        if (lowerCase == null && lowerCase.contains(".")) {
                            return;
                        }
                        if (!"http".equals(lowerCase) || "https".equals(lowerCase)) {
                            C = C.normalizeScheme();
                        }
                        boolean z15 = z10;
                        J02 = hl.J0(C.toString().toLowerCase(), z15);
                        if (uc7.s1(k5.a(i).a).k4.K3.f.contains(J02)) {
                            try {
                                C = C.buildUpon().appendQueryParameter("autologin_token", URLEncoder.encode(uc7.s1(k5.a(yac.t0).a).z3, "UTF-8")).build();
                            } catch (Exception e2) {
                                e = e2;
                                z13 = true;
                                z12 = false;
                                cc4.g(e, z13);
                                if (z5) {
                                }
                                if (!k(C.toString())) {
                                }
                                z14 = true;
                                if (C.getScheme() != null) {
                                }
                                if (!g) {
                                }
                                if (!z14) {
                                }
                            }
                        }
                        if (z11 || ((C != null && uc7.s1(i).T2(C.toString())) || !uc7.s1(i).U2() || g || lowerCase.equals("tel") || k(C.toString()) || (!zArr[0] && n(context, C.toString(), false) && f(context, C.toString())))) {
                            z12 = false;
                            if (z5) {
                                try {
                                    if (BubbleActivity.b0 == null) {
                                        if (C != null) {
                                            if (uc7.s1(i).T2(C.toString())) {
                                                if (TextUtils.isEmpty(str3)) {
                                                    if (C.getScheme() != null) {
                                                        if (!"https".equals(C.getScheme())) {
                                                            if (!"http".equals(C.getScheme())) {
                                                            }
                                                        }
                                                    }
                                                    z14 = true;
                                                    if (C.getScheme() != null) {
                                                        C.getScheme().equalsIgnoreCase("intent");
                                                    }
                                                    if (!g && (launchActivity = LaunchActivity.H1) != null) {
                                                        m(launchActivity, C.toString(), z3, z6, l01Var2);
                                                        return;
                                                    }
                                                    if (!z14) {
                                                        o(context, C.toString(), z4, str3);
                                                        return;
                                                    }
                                                    if (n(context, C.toString(), z4)) {
                                                        return;
                                                    }
                                                    if (C.getScheme() != null && C.getScheme().equalsIgnoreCase("intent")) {
                                                        String stringExtra = Intent.parseUri(C.toString(), 1).getStringExtra("browser_fallback_url");
                                                        if (!TextUtils.isEmpty(stringExtra)) {
                                                            C = Uri.parse(stringExtra);
                                                        }
                                                    }
                                                    p(C.toString());
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception e3) {
                                    cc4.g(e3, true);
                                    return;
                                }
                            }
                            if (!k(C.toString())) {
                                z14 = z12;
                                if (C.getScheme() != null) {
                                }
                                if (!g) {
                                }
                                if (!z14) {
                                }
                            }
                            z14 = true;
                            if (C.getScheme() != null) {
                            }
                            if (!g) {
                            }
                            if (!z14) {
                            }
                        } else {
                            if (uc7.s1(i).k4.J3.f.contains(J02)) {
                                Intent intent2 = new Intent("android.intent.action.VIEW", C);
                                intent2.addFlags(TLObject.FLAG_28);
                                a.b.startActivity(intent2);
                                return;
                            }
                            Intent intent3 = new Intent(a.b, (Class<?>) ShareBroadcastReceiver.class);
                            intent3.setAction("android.intent.action.SEND");
                            try {
                                PendingIntent broadcast = PendingIntent.getBroadcast(a.b, 0, new Intent(a.b, (Class<?>) CustomTabsCopyReceiver.class), 167772160);
                                lh2 e4 = e();
                                intent = new Intent("android.intent.action.VIEW");
                                if (e4 != null) {
                                    intent.setPackage(((ComponentName) e4.c).getPackageName());
                                }
                                Bundle bundle = new Bundle();
                                bundle.putBinder("android.support.customtabs.extra.SESSION", e4 == null ? null : (p53) e4.b);
                                intent.putExtras(bundle);
                                String M02 = ob6.M0(2131751727, null);
                                arrayList = new ArrayList<>();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", M02);
                                bundle2.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast);
                                arrayList.add(bundle2);
                                z15 = false;
                                intent.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", aob.w0(null, aob.S8, false));
                                intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                                decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.msg_filled_shareout);
                                M0 = ob6.M0(2131745187, null);
                                z12 = false;
                            } catch (Exception e5) {
                                e = e5;
                                z12 = false;
                            }
                            try {
                                PendingIntent broadcast2 = PendingIntent.getBroadcast(a.b, 0, intent3, 33554432);
                                Bundle bundle3 = new Bundle();
                                bundle3.putInt("android.support.customtabs.customaction.ID", 0);
                                bundle3.putParcelable("android.support.customtabs.customaction.ICON", decodeResource);
                                bundle3.putString("android.support.customtabs.customaction.DESCRIPTION", M0);
                                bundle3.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast2);
                                intent.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle3);
                                intent.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", true);
                                intent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
                                intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                                intent.addFlags(TLObject.FLAG_28);
                                intent.setData(C);
                                context.startActivity(intent, null);
                                return;
                            } catch (Exception e6) {
                                e = e6;
                                z13 = true;
                                cc4.g(e, z13);
                                if (z5) {
                                }
                                if (!k(C.toString())) {
                                }
                                z14 = true;
                                if (C.getScheme() != null) {
                                }
                                if (!g) {
                                }
                                if (!z14) {
                                }
                            }
                        }
                    }
                    id[] idVarArr = new id[1];
                    idVarArr[z10 ? 1 : 0] = new id(3, null, context);
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = C.toString();
                    l01Var2 = l01Var;
                    str3 = str2;
                    z11 = z8;
                    try {
                        int sendRequest = ConnectionsManager.getInstance(yac.t0).sendRequest(getwebpagepreview, new ot(l01Var2, idVarArr, i2, C, context, z11));
                        if (l01Var2 != null) {
                            l01Var2.d();
                            return;
                        } else {
                            i = i2;
                            try {
                                hl.d3(new zd(idVarArr, sendRequest, b2), 1000L);
                                return;
                            } catch (Exception unused3) {
                            }
                        }
                    } catch (Exception unused4) {
                        i = i2;
                    }
                }
            }
            l01Var2 = l01Var;
            i = i2;
            str3 = str2;
            z10 = false;
            z11 = z8;
            lowerCase = C.getScheme() != null ? C.getScheme().toLowerCase() : "";
            if (lowerCase == null) {
            }
            if (!"http".equals(lowerCase)) {
            }
            C = C.normalizeScheme();
            boolean z152 = z10;
            J02 = hl.J0(C.toString().toLowerCase(), z152);
            if (uc7.s1(k5.a(i).a).k4.K3.f.contains(J02)) {
            }
            if (z11) {
            }
            z12 = false;
            if (z5) {
            }
            if (!k(C.toString())) {
            }
            z14 = true;
            if (C.getScheme() != null) {
            }
            if (!g) {
            }
            if (!z14) {
            }
        }
        str2 = null;
        if (str2 == null) {
        }
        if (z9) {
        }
        l01Var2 = l01Var;
        i = i2;
        str3 = str2;
        z10 = false;
        z11 = z8;
        lowerCase = C.getScheme() != null ? C.getScheme().toLowerCase() : "";
        if (lowerCase == null) {
        }
        if (!"http".equals(lowerCase)) {
        }
        C = C.normalizeScheme();
        boolean z1522 = z10;
        J02 = hl.J0(C.toString().toLowerCase(), z1522);
        if (uc7.s1(k5.a(i).a).k4.K3.f.contains(J02)) {
        }
        if (z11) {
        }
        z12 = false;
        if (z5) {
        }
        if (!k(C.toString())) {
        }
        z14 = true;
        if (C.getScheme() != null) {
        }
        if (!g) {
        }
        if (!z14) {
        }
    }

    public static void u(Context context, String str) {
        if (str == null) {
            return;
        }
        r(context, Uri.parse(str), true, true);
    }

    public static void v(LaunchActivity launchActivity, Uri uri) {
        r(launchActivity, uri, true, true);
    }

    public static void w(Context context, String str, boolean z) {
        if (str == null) {
            return;
        }
        t(context, Uri.parse(str), false, true, false, null, null, false, false, false, z);
    }

    public static String x(Uri uri, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = uri.getScheme();
        }
        if (str != null) {
            sb.append(str);
            sb.append("://");
        }
        if (str2 == null) {
            if (uri.getEncodedUserInfo() != null) {
                sb.append(uri.getEncodedUserInfo());
                sb.append("@");
            }
        } else if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
            sb.append("@");
        }
        if (str3 != null) {
            sb.append(str3);
        } else if (uri.getHost() != null) {
            sb.append(uri.getHost());
        }
        if (uri.getPort() != -1) {
            sb.append(":");
            sb.append(uri.getPort());
        }
        if (str4 != null) {
            sb.append(str4);
        } else if (uri.getEncodedPath() != null) {
            sb.append(uri.getEncodedPath());
        }
        if (uri.getEncodedQuery() != null) {
            sb.append("?");
            sb.append(uri.getEncodedQuery());
        }
        if (uri.getEncodedFragment() != null) {
            sb.append("#");
            sb.append(uri.getEncodedFragment());
        }
        return sb.toString();
    }

    public static String y(Uri uri, String str) {
        return x(uri, null, null, str, null);
    }

    public static void z(Activity activity) {
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
}
