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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class d01 {
    public static tg2 a;
    public static lv6 b;
    public static b5a c;
    public static String d;
    public static WeakReference e;
    public static Pattern f;

    public static String A(String str) {
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
            fa4.g(e2, true);
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
                    fa4.g(e3, true);
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
            fa4.g(e2, false);
            return str;
        }
    }

    public static tg2 e() {
        lv6 lv6Var = b;
        tg2 tg2Var = null;
        if (lv6Var == null) {
            a = null;
        } else if (a == null) {
            ize izeVar = new ize((byte) 14);
            zg5 zg5Var = (zg5) lv6Var.b;
            x43 x43Var = new x43(izeVar);
            try {
                if (((xg5) zg5Var).a(x43Var)) {
                    tg2Var = new tg2(x43Var, (ComponentName) lv6Var.c, (byte) 20);
                }
            } catch (RemoteException unused) {
            }
            a = tg2Var;
            new WeakReference(tg2Var);
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
                    if (w01.a) {
                        fa4.b("default browser name = " + strArr[i]);
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
            if (w01.a) {
                for (int i4 = 0; i4 < list.size(); i4++) {
                    fa4.b("device has " + list.get(i4).activityInfo.packageName + " to open " + str);
                }
            }
            return (list == null || list.isEmpty()) ? false : true;
        }
        strArr = null;
        list = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0);
        int i22 = 0;
        if (strArr == null) {
        }
        if (w01.a) {
        }
        if (list == null) {
            return false;
        }
    }

    public static boolean g(Uri uri, boolean z, boolean[] zArr) {
        String str;
        String str2;
        Typeface typeface = gl.a;
        String J0 = uri == null ? null : gl.J0(uri.toString(), false);
        String lowerCase = J0 != null ? J0.toLowerCase() : "";
        if (!na7.q1(y6c.t0).k4.B3.f.contains(lowerCase)) {
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
        try {
            return TextUtils.equals(gl.J0(str, false), na7.q1(y6c.t0).N2);
        } catch (Exception e2) {
            fa4.g(e2, true);
            return false;
        }
    }

    public static boolean i(String str, boolean z, boolean z2) {
        if (z) {
            return str.equals("telegra.ph") || str.equals("te.legra.ph") || str.equals("graph.org");
        }
        StringBuilder sb = new StringBuilder("^(https");
        sb.append(z2 ? "" : "?");
        sb.append("://)?(te\\.?legra\\.ph|graph\\.org)(/.*|$)");
        return str.matches(sb.toString());
    }

    public static boolean j(String str) {
        String J0 = gl.J0(str, true);
        if (J0 != null && (J0.endsWith(".ton") || J0.endsWith(".adnl"))) {
            return true;
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("tonsite");
    }

    public static boolean k(String str) {
        boolean matches;
        if (f == null) {
            f = Pattern.compile("^[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9\\-\\_]+$");
        }
        String J0 = gl.J0(str, true);
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

    public static boolean l(Context context, String str, boolean z, boolean z2, c01 c01Var) {
        LaunchActivity launchActivity;
        if (str == null) {
            return false;
        }
        if (gl.W(context) instanceof LaunchActivity) {
            launchActivity = (LaunchActivity) gl.W(context);
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
        launchActivity.f0(intent, c01Var);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b6, code lost:
    
        if (f(r6, r7) != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m(Context context, String str, boolean z) {
        Intent intent;
        if (str != null) {
            try {
                if (!j(str) && !g(Uri.parse(str), false, null)) {
                    Uri parse = Uri.parse(str);
                    String w = w(parse, parse.getScheme() == null ? "https" : parse.getScheme(), null, parse.getHost() != null ? parse.getHost().toLowerCase() : parse.getHost(), TextUtils.isEmpty(parse.getEncodedPath()) ? "/" : parse.getEncodedPath());
                    Uri parse2 = Uri.parse(w);
                    boolean z2 = w.startsWith("intent://") || (parse2.getScheme() != null && parse2.getScheme().equalsIgnoreCase("intent"));
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
                fa4.g(e2, false);
            } catch (Exception e3) {
                fa4.g(e3, true);
            }
        }
        return false;
    }

    public static boolean n(Context context, String str, boolean z, String str2) {
        Intent intent;
        if (str != null) {
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
                fa4.g(e2, true);
                return false;
            }
        }
        return false;
    }

    public static void o(String str) {
        qx0 O;
        px0 px0Var;
        m[] mVarArr;
        m mVar;
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && (O = launchActivity.O()) != null) {
            if (!TextUtils.isEmpty(str)) {
                ArrayList<px0> tabs = O.getTabs();
                for (int i = 0; i < tabs.size(); i++) {
                    px0Var = tabs.get(i);
                    o oVar = px0Var.J;
                    if (oVar != null && !oVar.e0.isEmpty()) {
                        Object f2 = b00.f(1, px0Var.J.e0);
                        if (f2 instanceof zv) {
                            cv0 cv0Var = ((zv) f2).b;
                            if (cv0Var == null && (mVarArr = px0Var.J.v0) != null && (mVar = mVarArr[0]) != null) {
                                cv0Var = mVar.getWebView();
                            }
                            if (cv0Var != null) {
                                if (TextUtils.equals(qx0.p(cv0Var.canGoBack() ? cv0Var.getUrl() : cv0Var.getOpenURL()), qx0.p(str))) {
                                    O.e(px0Var);
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
            px0Var = null;
            if (px0Var != null) {
                return;
            }
        }
        d S = LaunchActivity.S();
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

    public static void p(Activity activity, String str, boolean z) {
        if (activity == null || str == null) {
            return;
        }
        q(activity, Uri.parse(str), z, true);
    }

    public static void q(Context context, Uri uri, boolean z, boolean z2) {
        s(context, uri, z, z2, false, null, null, false, true, false, false);
    }

    public static void r(Context context, Uri uri, boolean z, boolean z2, c01 c01Var) {
        s(context, uri, z, z2, false, c01Var, null, false, true, false, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(34:4|(4:6|(9:257|(3:259|(1:261)(2:276|(5:(1:280)|(1:282)|283|(1:285)(1:287)|286))|(5:264|(3:266|(1:268)|269)|(3:271|(1:273)|274)|275|11))|288|(0)|264|(0)|(0)|275|11)|10|11)(1:289)|12|(10:14|15|82|(1:86)(1:244)|(5:215|216|(1:218)(1:242)|219|(5:231|232|233|234|(2:236|237)(2:238|239)))|88|89|90|(1:92)|(9:98|(3:206|207|208)|102|103|104|105|106|(1:108)|(10:204|(3:185|186|(1:(2:189|(2:191|(7:193|(2:195|(2:197|(1:199)))|159|160|161|(1:163)|(1:(2:170|(4:172|(2:176|(1:178))|179|180)(1:181))(2:182|183))(2:167|168))))))|157|(6:184|160|161|(0)|(1:165)|(0)(0))|159|160|161|(0)|(0)|(0)(0))(3:127|128|(2:130|131)(15:132|133|134|135|136|(1:138)|139|(1:141)(1:151)|142|143|144|145|146|147|149)))(1:96))|256|(0)(0)|(0)|88|89|90|(0)|(1:94)|98|(1:100)|206|207|208|102|103|104|105|106|(0)|(1:111)|204|(0)|157|(0)|159|160|161|(0)|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0491, code lost:
    
        if ("tonsite".equals(r4.getScheme()) != false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0448, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x02b5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x02b7, code lost:
    
        fa4.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x044b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0301, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02dd A[Catch: Exception -> 0x044b, TryCatch #0 {Exception -> 0x044b, blocks: (B:90:0x028b, B:92:0x0291, B:94:0x029b, B:98:0x02a3, B:100:0x02a9, B:102:0x02ba, B:106:0x02c7, B:108:0x02dd, B:111:0x0309, B:113:0x0317, B:116:0x0323, B:118:0x032b, B:123:0x033a, B:125:0x0344, B:127:0x034e, B:130:0x0362, B:132:0x0371, B:136:0x0391, B:138:0x039c, B:139:0x03a7, B:142:0x03b6, B:145:0x03e1, B:151:0x03b2, B:212:0x02b7, B:207:0x02af), top: B:89:0x028b, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04a8 A[Catch: Exception -> 0x0508, TRY_ENTER, TryCatch #2 {Exception -> 0x0508, blocks: (B:186:0x0453, B:189:0x0459, B:191:0x0467, B:193:0x046d, B:195:0x0473, B:197:0x047d, B:199:0x0487, B:160:0x04a0, B:163:0x04a8, B:165:0x04b1, B:167:0x04b5, B:170:0x04c3, B:172:0x04cd, B:174:0x04d3, B:176:0x04dd, B:178:0x04f2, B:179:0x04f6, B:182:0x04fe, B:157:0x0493), top: B:185:0x0453 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04b1 A[Catch: Exception -> 0x0508, TryCatch #2 {Exception -> 0x0508, blocks: (B:186:0x0453, B:189:0x0459, B:191:0x0467, B:193:0x046d, B:195:0x0473, B:197:0x047d, B:199:0x0487, B:160:0x04a0, B:163:0x04a8, B:165:0x04b1, B:167:0x04b5, B:170:0x04c3, B:172:0x04cd, B:174:0x04d3, B:176:0x04dd, B:178:0x04f2, B:179:0x04f6, B:182:0x04fe, B:157:0x0493), top: B:185:0x0453 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04c3 A[Catch: Exception -> 0x0508, TryCatch #2 {Exception -> 0x0508, blocks: (B:186:0x0453, B:189:0x0459, B:191:0x0467, B:193:0x046d, B:195:0x0473, B:197:0x047d, B:199:0x0487, B:160:0x04a0, B:163:0x04a8, B:165:0x04b1, B:167:0x04b5, B:170:0x04c3, B:172:0x04cd, B:174:0x04d3, B:176:0x04dd, B:178:0x04f2, B:179:0x04f6, B:182:0x04fe, B:157:0x0493), top: B:185:0x0453 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04fe A[Catch: Exception -> 0x0508, TRY_LEAVE, TryCatch #2 {Exception -> 0x0508, blocks: (B:186:0x0453, B:189:0x0459, B:191:0x0467, B:193:0x046d, B:195:0x0473, B:197:0x047d, B:199:0x0487, B:160:0x04a0, B:163:0x04a8, B:165:0x04b1, B:167:0x04b5, B:170:0x04c3, B:172:0x04cd, B:174:0x04d3, B:176:0x04dd, B:178:0x04f2, B:179:0x04f6, B:182:0x04fe, B:157:0x0493), top: B:185:0x0453 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0453 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0291 A[Catch: Exception -> 0x044b, TryCatch #0 {Exception -> 0x044b, blocks: (B:90:0x028b, B:92:0x0291, B:94:0x029b, B:98:0x02a3, B:100:0x02a9, B:102:0x02ba, B:106:0x02c7, B:108:0x02dd, B:111:0x0309, B:113:0x0317, B:116:0x0323, B:118:0x032b, B:123:0x033a, B:125:0x0344, B:127:0x034e, B:130:0x0362, B:132:0x0371, B:136:0x0391, B:138:0x039c, B:139:0x03a7, B:142:0x03b6, B:145:0x03e1, B:151:0x03b2, B:212:0x02b7, B:207:0x02af), top: B:89:0x028b, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void s(Context context, Uri uri, boolean z, boolean z2, boolean z3, c01 c01Var, String str, boolean z4, boolean z5, boolean z6, boolean z7) {
        Uri uri2;
        String str2;
        boolean z8;
        boolean z9;
        String str3;
        boolean z10;
        c01 c01Var2;
        boolean z11;
        boolean z12;
        LaunchActivity launchActivity;
        String lowerCase;
        String J0;
        String str4;
        String str5;
        Uri build;
        if (context == null || uri == null) {
            return;
        }
        if (z7) {
            uri2 = uri;
        } else {
            if ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme())) {
                String A = A(uri.getEncodedQuery());
                String encodedFragment = uri.getEncodedFragment();
                if (encodedFragment != null) {
                    int indexOf = encodedFragment.indexOf(63);
                    if (indexOf < 0) {
                        str5 = A(encodedFragment);
                    } else {
                        String substring = encodedFragment.substring(0, indexOf);
                        String substring2 = encodedFragment.substring(indexOf + 1);
                        String A2 = A(substring);
                        String A3 = A(substring2);
                        if (A2 != null || A3 != null) {
                            if (A3 != null) {
                                substring2 = A3;
                            }
                            if (A2 != null) {
                                substring = A2;
                            }
                            str5 = substring.concat(substring2.isEmpty() ? "" : "?".concat(substring2));
                        }
                    }
                    if (A == null || str5 != null) {
                        Uri.Builder buildUpon = uri.buildUpon();
                        if (A != null) {
                            if (A.isEmpty()) {
                                A = null;
                            }
                            buildUpon.encodedQuery(A);
                        }
                        if (str5 != null) {
                            if (str5.isEmpty()) {
                                str5 = null;
                            }
                            buildUpon.encodedFragment(str5);
                        }
                        build = buildUpon.build();
                        uri2 = build;
                    }
                }
                str5 = null;
                if (A == null) {
                }
                Uri.Builder buildUpon2 = uri.buildUpon();
                if (A != null) {
                }
                if (str5 != null) {
                }
                build = buildUpon2.build();
                uri2 = build;
            }
            build = uri;
            uri2 = build;
        }
        int i = y6c.t0;
        boolean[] zArr = {false};
        boolean g = g(uri2, false, zArr);
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
                    Typeface typeface = gl.a;
                    String J02 = uri2 == null ? null : gl.J0(uri2.toString(), false);
                    if (y6c.h(y6c.t0).f() != null && (i(J02, true, false) || ("telegram.org".equalsIgnoreCase(J02) && (uri2.toString().toLowerCase().contains("telegram.org/faq") || uri2.toString().toLowerCase().contains("telegram.org/privacy") || uri2.toString().toLowerCase().contains("telegram.org/blog"))))) {
                        hd[] hdVarArr = {new hd(3, null, context)};
                        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                        getwebpagepreview.message = uri2.toString();
                        str3 = str2;
                        z10 = z8;
                        byte b2 = 9;
                        c01Var2 = c01Var;
                        try {
                            int sendRequest = ConnectionsManager.getInstance(y6c.t0).sendRequest(getwebpagepreview, new rt(c01Var2, hdVarArr, i, uri2, context, z10));
                            if (c01Var2 != null) {
                                c01Var2.d();
                                return;
                            } else {
                                gl.d3(new eg(hdVarArr, sendRequest, b2), 1000L);
                                return;
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            c01Var2 = c01Var;
            str3 = str2;
            z10 = z8;
            lowerCase = uri2.getScheme() != null ? uri2.getScheme().toLowerCase() : "";
            if (lowerCase == null && lowerCase.contains(".")) {
                return;
            }
            if (!"http".equals(lowerCase) || "https".equals(lowerCase)) {
                uri2 = uri2.normalizeScheme();
            }
            z11 = false;
            J0 = gl.J0(uri2.toString().toLowerCase(), false);
            if (na7.q1(j5.a(i).a).k4.C3.f.contains(J0)) {
                uri2 = uri2.buildUpon().appendQueryParameter("autologin_token", URLEncoder.encode(na7.q1(j5.a(y6c.t0).a).z3, "UTF-8")).build();
            }
            if (z10 || ((uri2 != null && na7.q1(i).N2(uri2.toString())) || !na7.q1(i).O2() || g || lowerCase.equals("tel") || j(uri2.toString()) || (!zArr[0] && m(context, uri2.toString(), false) && f(context, uri2.toString())))) {
                z11 = false;
                if (z5) {
                    try {
                        if (BubbleActivity.b0 == null) {
                            if (uri2 != null) {
                                if (na7.q1(i).N2(uri2.toString())) {
                                    if (TextUtils.isEmpty(str3)) {
                                        if (uri2.getScheme() != null) {
                                            if (!"https".equals(uri2.getScheme())) {
                                                if (!"http".equals(uri2.getScheme())) {
                                                }
                                            }
                                        }
                                        z12 = true;
                                        if (uri2.getScheme() != null) {
                                            uri2.getScheme().equalsIgnoreCase("intent");
                                        }
                                        if (!g && (launchActivity = LaunchActivity.H1) != null) {
                                            l(launchActivity, uri2.toString(), z3, z6, c01Var2);
                                            return;
                                        }
                                        if (!z12) {
                                            n(context, uri2.toString(), z4, str3);
                                            return;
                                        }
                                        if (m(context, uri2.toString(), z4)) {
                                            return;
                                        }
                                        if (uri2.getScheme() != null && uri2.getScheme().equalsIgnoreCase("intent")) {
                                            String stringExtra = Intent.parseUri(uri2.toString(), 1).getStringExtra("browser_fallback_url");
                                            if (!TextUtils.isEmpty(stringExtra)) {
                                                uri2 = Uri.parse(stringExtra);
                                            }
                                        }
                                        o(uri2.toString());
                                        return;
                                    }
                                }
                            }
                        }
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                        return;
                    }
                }
                if (!j(uri2.toString())) {
                    z12 = z11;
                    if (uri2.getScheme() != null) {
                    }
                    if (!g) {
                    }
                    if (!z12) {
                    }
                }
                z12 = true;
                if (uri2.getScheme() != null) {
                }
                if (!g) {
                }
                if (!z12) {
                }
            } else {
                if (na7.q1(i).k4.B3.f.contains(J0)) {
                    Intent intent = new Intent("android.intent.action.VIEW", uri2);
                    intent.addFlags(TLObject.FLAG_28);
                    a.b.startActivity(intent);
                    return;
                }
                Intent intent2 = new Intent(a.b, (Class<?>) ShareBroadcastReceiver.class);
                intent2.setAction("android.intent.action.SEND");
                boolean z13 = false;
                try {
                    PendingIntent broadcast = PendingIntent.getBroadcast(a.b, 0, new Intent(a.b, (Class<?>) CustomTabsCopyReceiver.class), 167772160);
                    tg2 e3 = e();
                    Intent intent3 = new Intent("android.intent.action.VIEW");
                    if (e3 != null) {
                        intent3.setPackage(((ComponentName) e3.c).getPackageName());
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBinder("android.support.customtabs.extra.SESSION", e3 == null ? null : (x43) e3.b);
                    intent3.putExtras(bundle);
                    String M0 = k96.M0(2131751750, null);
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", M0);
                    bundle2.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast);
                    arrayList.add(bundle2);
                    z13 = false;
                    intent3.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", bkb.w0(null, bkb.R8, false));
                    intent3.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                    Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.msg_filled_shareout);
                    String M02 = k96.M0(2131745267, null);
                    z11 = false;
                    PendingIntent broadcast2 = PendingIntent.getBroadcast(a.b, 0, intent2, 33554432);
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("android.support.customtabs.customaction.ID", 0);
                    bundle3.putParcelable("android.support.customtabs.customaction.ICON", decodeResource);
                    bundle3.putString("android.support.customtabs.customaction.DESCRIPTION", M02);
                    bundle3.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", broadcast2);
                    intent3.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle3);
                    intent3.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", true);
                    intent3.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
                    intent3.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                    intent3.addFlags(TLObject.FLAG_28);
                    intent3.setData(uri2);
                    context.startActivity(intent3, null);
                    return;
                } catch (Exception e4) {
                    e = e4;
                    z11 = z13;
                    fa4.g(e, true);
                    if (z5) {
                    }
                    if (!j(uri2.toString())) {
                    }
                    z12 = true;
                    if (uri2.getScheme() != null) {
                    }
                    if (!g) {
                    }
                    if (!z12) {
                    }
                }
            }
        }
        str2 = null;
        if (str2 == null) {
        }
        if (z9) {
        }
        c01Var2 = c01Var;
        str3 = str2;
        z10 = z8;
        if (uri2.getScheme() != null) {
        }
        if (lowerCase == null) {
        }
        if (!"http".equals(lowerCase)) {
        }
        uri2 = uri2.normalizeScheme();
        z11 = false;
        J0 = gl.J0(uri2.toString().toLowerCase(), false);
        if (na7.q1(j5.a(i).a).k4.C3.f.contains(J0)) {
        }
        if (z10) {
        }
        z11 = false;
        if (z5) {
        }
        if (!j(uri2.toString())) {
        }
        z12 = true;
        if (uri2.getScheme() != null) {
        }
        if (!g) {
        }
        if (!z12) {
        }
    }

    public static void t(Context context, String str) {
        if (str == null) {
            return;
        }
        q(context, Uri.parse(str), true, true);
    }

    public static void u(LaunchActivity launchActivity, Uri uri) {
        q(launchActivity, uri, true, true);
    }

    public static void v(Context context, String str, boolean z) {
        if (str == null) {
            return;
        }
        s(context, Uri.parse(str), false, true, false, null, null, false, false, false, z);
    }

    public static String w(Uri uri, String str, String str2, String str3, String str4) {
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

    public static String x(Uri uri, String str) {
        return w(uri, null, null, str, null);
    }

    public static void y(Activity activity) {
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

    public static boolean z(String str) {
        return i(str, false, true) || str.matches("^(https://)?t\\.me/iv\\??(/.*|$)") || str.matches("^(https://)?telegram\\.org/(blog|tour)(/.*|$)") || str.matches("^(https://)?fragment\\.com(/.*|$)");
    }
}
