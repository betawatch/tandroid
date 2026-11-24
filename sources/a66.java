// default package

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.WallpapersListActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a66 {
    public static final Pattern k = Pattern.compile("^[a-z0-9_]{1,32}$");
    public final LaunchActivity a;
    public final int b;
    public final k11 c;
    public final boolean d;
    public he e;
    public boolean f;
    public boolean g;
    public int h = -1;
    public i77 i;
    public boolean j;

    public a66(LaunchActivity launchActivity, int i, k11 k11Var, boolean z) {
        this.a = launchActivity;
        this.b = i;
        this.c = k11Var;
        this.d = z;
    }

    public static c41 d() {
        d S = LaunchActivity.S();
        return S == null ? c41.Y() : c41.b0(S);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        if (r2.equals("http") != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean p(String str) {
        if ("back".equals(str) || "none".equals(str)) {
            return true;
        }
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            if (scheme == null || uri.getRawSchemeSpecificPart().isEmpty()) {
                return false;
            }
            String lowerCase = scheme.toLowerCase(Locale.ROOT);
            switch (lowerCase.hashCode()) {
                case -1183762788:
                    if (lowerCase.equals("intent")) {
                        return false;
                    }
                    return true;
                case 3695:
                    if (lowerCase.equals("tc")) {
                        return false;
                    }
                    return true;
                case 3076010:
                    if (lowerCase.equals("data")) {
                        return false;
                    }
                    return true;
                case 3143036:
                    if (lowerCase.equals("file")) {
                        return false;
                    }
                    return true;
                case 3213448:
                    break;
                case 99617003:
                    if (lowerCase.equals("https")) {
                        if (uri.getHost() == null || uri.getRawUserInfo() != null) {
                            return false;
                        }
                    }
                    return true;
                case 188995949:
                    if (lowerCase.equals("javascript")) {
                        return false;
                    }
                    return true;
                case 951530617:
                    if (lowerCase.equals("content")) {
                        return false;
                    }
                    return true;
                default:
                    return true;
            }
        } catch (URISyntaxException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0140, code lost:
    
        if (r2.equals("joinchat") == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0035, code lost:
    
        if (r3.equals("http") != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014e A[Catch: Exception -> 0x018d, TryCatch #0 {Exception -> 0x018d, blocks: (B:5:0x0004, B:7:0x000e, B:9:0x0014, B:15:0x0026, B:18:0x0037, B:20:0x003d, B:22:0x0057, B:24:0x005f, B:27:0x0069, B:30:0x007a, B:32:0x0086, B:33:0x0089, B:35:0x008f, B:37:0x0096, B:39:0x00a0, B:41:0x00a6, B:43:0x00b2, B:44:0x00b6, B:46:0x0142, B:48:0x014e, B:52:0x00bb, B:55:0x00c5, B:58:0x00cf, B:61:0x00d9, B:64:0x00e3, B:67:0x00ed, B:70:0x00f7, B:73:0x0101, B:76:0x010b, B:79:0x0115, B:82:0x011f, B:85:0x0128, B:88:0x0131, B:91:0x013a, B:93:0x0157, B:95:0x015d, B:98:0x002f, B:100:0x0168, B:102:0x0170, B:104:0x0178, B:106:0x0180), top: B:4:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean q(String str) {
        String path;
        boolean isEmpty;
        String str2;
        if (str != null) {
            try {
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                if (scheme != null && (path = parse.getPath()) != null) {
                    int hashCode = scheme.hashCode();
                    if (hashCode != 3699) {
                        if (hashCode != 3213448) {
                            if (hashCode == 99617003 && scheme.equals("https")) {
                                if (!path.isEmpty()) {
                                    String lowerCase = parse.getHost().toLowerCase();
                                    boolean find = LaunchActivity.D1.matcher(lowerCase).find();
                                    if (lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog") || find) {
                                        ArrayList arrayList = new ArrayList(parse.getPathSegments());
                                        if (arrayList.size() > 0 && ((String) arrayList.get(0)).equals("s")) {
                                            arrayList.remove(0);
                                        }
                                        if (arrayList.size() > 0 && (arrayList.size() < 3 || !"s".equals(arrayList.get(1)))) {
                                            if (arrayList.size() > 1) {
                                                String str3 = (String) arrayList.get(0);
                                                if (!TextUtils.isEmpty(str3)) {
                                                    switch (str3.hashCode()) {
                                                        case -1401304190:
                                                            break;
                                                        case -1268966290:
                                                            if (str3.equals("folder")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2) && !str2.matches("^\\d+$")) {
                                                                return true;
                                                            }
                                                            break;
                                                        case -1230486459:
                                                            if (str3.equals("addemoji")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                                break;
                                                            }
                                                            break;
                                                        case -1216792120:
                                                            if (str3.equals("addtheme")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        case -1147866945:
                                                            if (str3.equals("addlist")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        case nm7.j1 /* 99 */:
                                                            if (str3.equals("c")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        case 108417:
                                                            if (str3.equals("msg")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        case 93922211:
                                                            if (str3.equals("boost")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        case 103149417:
                                                            if (str3.equals("login")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        case 109400031:
                                                            if (str3.equals("share")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        case 311086522:
                                                            if (str3.equals("setlanguage")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        case 492791415:
                                                            if (str3.equals("addstickers")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        case 951526432:
                                                            if (str3.equals("contact")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        case 2112655022:
                                                            if (str3.equals("confirmphone")) {
                                                                break;
                                                            }
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                        default:
                                                            str2 = (String) arrayList.get(1);
                                                            if (TextUtils.isEmpty(str2)) {
                                                            }
                                                            break;
                                                    }
                                                }
                                            } else if (arrayList.size() == 1) {
                                                isEmpty = TextUtils.isEmpty(parse.getQueryParameter("startapp"));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return !isEmpty;
                    }
                    if (scheme.equals("tg") && (str.startsWith("tg:resolve") || str.startsWith("tg://resolve"))) {
                        isEmpty = TextUtils.isEmpty(parse.getQueryParameter("appname"));
                        return !isEmpty;
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
                return false;
            }
        }
        return false;
    }

    public static String r(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int i = 960;
        if (bytes.length <= 960) {
            return str;
        }
        while ((bytes[i] & 192) == 128) {
            i--;
        }
        return new String(bytes, 0, i, StandardCharsets.UTF_8);
    }

    public static Uri s(Uri uri) {
        String schemeSpecificPart;
        if (uri == null || !uri.isOpaque()) {
            return uri;
        }
        String scheme = uri.getScheme();
        if (scheme == null || uri.getAuthority() != null || (schemeSpecificPart = uri.getSchemeSpecificPart()) == null) {
            return uri;
        }
        return Uri.parse(scheme + "://" + schemeSpecificPart);
    }

    public final boolean a() {
        if (this.j) {
            return false;
        }
        LaunchActivity launchActivity = this.a;
        return (launchActivity.isFinishing() || launchActivity.isDestroyed() || !LaunchActivity.G1 || gda.w || gda.B || z8c.t0 != this.b) ? false : true;
    }

    public final void b() {
        this.j = true;
        i77 i77Var = this.i;
        if (i77Var != null) {
            gm.r(i77Var);
        }
        if (this.h >= 0) {
            ConnectionsManager.getInstance(this.b).cancelRequest(this.h, true);
            this.h = -1;
        }
    }

    public final void c() {
        if (this.g) {
            return;
        }
        he heVar = this.e;
        if (heVar != null) {
            heVar.dismiss();
        }
        k11 k11Var = this.c;
        if (k11Var != null) {
            k11Var.b();
        }
        this.g = true;
    }

    public final tk5 e() {
        return this.a.N();
    }

    public final z8c f() {
        return z8c.h(this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v0, types: [a66, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [int] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r2v56, types: [a7b, s8b] */
    public final boolean g(Uri uri) {
        String str;
        Uri s;
        List<String> pathSegments;
        int i;
        Long l;
        boolean z;
        Uri uri2 = uri;
        if (uri2 != null) {
            fc4.b("link manager handle " + uri2);
            String scheme = uri2.getScheme();
            if ("tonsite".equalsIgnoreCase(scheme)) {
                l11.r(this.a, uri2, true, true);
                return true;
            }
            byte b = 22;
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                String host = uri2.getHost();
                if (host != null) {
                    Matcher matcher = LaunchActivity.D1.matcher(host.toLowerCase());
                    boolean find = matcher.find();
                    if ("telegram.me".equalsIgnoreCase(host) || "t.me".equalsIgnoreCase(host) || "telegram.dog".equalsIgnoreCase(host) || find) {
                        if (find) {
                            StringBuilder sb = new StringBuilder("https://t.me/");
                            sb.append(matcher.group(1));
                            String str2 = "";
                            sb.append(TextUtils.isEmpty(uri2.getPath()) ? "" : uri2.getPath());
                            if (!TextUtils.isEmpty(uri2.getQuery())) {
                                str2 = "?" + uri2.getQuery();
                            }
                            sb.append(str2);
                            uri2 = Uri.parse(sb.toString());
                        }
                        String path = uri2.getPath();
                        if (path != null && path.length() > 1) {
                            String substring = path.substring(1);
                            List<String> pathSegments2 = uri2.getPathSegments();
                            if (pathSegments2 != null && !pathSegments2.isEmpty()) {
                                String str3 = pathSegments2.get(0);
                                String str4 = pathSegments2.size() > 1 ? pathSegments2.get(1) : null;
                                if ("sendgrams".equalsIgnoreCase(str3)) {
                                    return l(uri2);
                                }
                                if ("getpremium".equalsIgnoreCase(str3)) {
                                    String queryParameter = uri2.getQueryParameter("ref");
                                    if (queryParameter != null) {
                                        String lowerCase = queryParameter.toLowerCase(Locale.ROOT);
                                        if (k.matcher(lowerCase).matches()) {
                                            str = b10.h("tme_getpremium_", lowerCase);
                                            u(new PremiumPreviewFragment(0, str), false);
                                            return true;
                                        }
                                    }
                                    str = "tme_getpremium";
                                    u(new PremiumPreviewFragment(0, str), false);
                                    return true;
                                }
                                if ("$".equalsIgnoreCase(str3)) {
                                    return i(substring.substring(1));
                                }
                                if ("invoice".equalsIgnoreCase(str3)) {
                                    return i(str4);
                                }
                                if ("addstyle".equalsIgnoreCase(str3)) {
                                    return h(str4);
                                }
                                if ("oauth".equalsIgnoreCase(str3)) {
                                    return k(uri2, uri2.getQueryParameter("startapp"));
                                }
                                if ("newbot".equalsIgnoreCase(str3)) {
                                    if (pathSegments2.size() >= 2) {
                                        j(str4, pathSegments2.size() >= 3 ? pathSegments2.get(2) : null, uri2.getQueryParameter("name"));
                                        return true;
                                    }
                                    return true;
                                }
                                if ("botinvite".equalsIgnoreCase(str3)) {
                                    if (pathSegments2.size() < 2 || TextUtils.isEmpty(str4)) {
                                        return true;
                                    }
                                    o();
                                    oc7.r1(this.b).Z1().a(str4, null, new sk3(this, b));
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }
            if (!"tg".equalsIgnoreCase(scheme)) {
                if ("ton".equalsIgnoreCase(scheme)) {
                    if (oc7.r1(this.b).l4.n0.f && (pathSegments = (s = s(uri2)).getPathSegments()) != null) {
                        ArrayList arrayList = new ArrayList(pathSegments);
                        String authority = s.getAuthority();
                        if (TextUtils.isEmpty(authority)) {
                            i = 0;
                        } else {
                            i = 0;
                            arrayList.add(0, authority);
                        }
                        if (!arrayList.isEmpty()) {
                            String str5 = (String) arrayList.get(i);
                            String str6 = arrayList.size() > 1 ? (String) arrayList.get(1) : null;
                            if ("transfer".equalsIgnoreCase(str5)) {
                                if (arrayList.size() == 2 && WalletEngine2.isValidRecipientAddress(str6)) {
                                    try {
                                        l = Long.valueOf(Long.parseLong(s.getQueryParameter("amount")));
                                    } catch (Throwable unused) {
                                        l = null;
                                    }
                                    String queryParameter2 = s.getQueryParameter("text");
                                    if (TextUtils.isEmpty(queryParameter2)) {
                                        queryParameter2 = s.getQueryParameter("comment");
                                    }
                                    String r = r(queryParameter2);
                                    boolean booleanQueryParameter = s.getBooleanQueryParameter("encrypted", false);
                                    try {
                                        rrc rrcVar = new rrc(str6);
                                        if (l != null && l.longValue() > 0) {
                                            rrcVar.s = l.longValue();
                                        }
                                        if (!TextUtils.isEmpty(r)) {
                                            rrcVar.h0 = r;
                                            rrcVar.i0 = booleanQueryParameter;
                                        }
                                        rrcVar.g0 = true;
                                        u(rrcVar, false);
                                        return true;
                                    } catch (Throwable th) {
                                        fc4.g(th, true);
                                    }
                                }
                                return true;
                            }
                            return false;
                        }
                        return i;
                    }
                } else if ("tc".equalsIgnoreCase(scheme)) {
                    return n(uri);
                }
                return false;
            }
            LaunchActivity launchActivity = this.a;
            Uri s2 = s(Uri.parse(uri2.toString().replaceFirst("(?i)^tg:(//)?sendgrams&", "tg://sendgrams?")));
            List<String> pathSegments3 = s2.getPathSegments();
            if (pathSegments3 != null) {
                ArrayList arrayList2 = new ArrayList(pathSegments3);
                String authority2 = s2.getAuthority();
                if (!TextUtils.isEmpty(authority2)) {
                    arrayList2.add(0, authority2);
                }
                if (!arrayList2.isEmpty()) {
                    String str7 = (String) arrayList2.get(0);
                    String str8 = arrayList2.size() > 1 ? (String) arrayList2.get(1) : null;
                    if ("sendgrams".equalsIgnoreCase(str7)) {
                        return l(s2);
                    }
                    if ("newbot".equalsIgnoreCase(str7)) {
                        j(s2.getQueryParameter("manager"), s2.getQueryParameter("username"), s2.getQueryParameter("name"));
                        return true;
                    }
                    if ("botinvite".equalsIgnoreCase(str7)) {
                        String queryParameter3 = s2.getQueryParameter("username");
                        if (TextUtils.isEmpty(queryParameter3)) {
                            return true;
                        }
                        o();
                        oc7.r1(this.b).Z1().a(queryParameter3, null, new sk3(this, b));
                        return true;
                    }
                    if ("resolve".equalsIgnoreCase(str7)) {
                        List<String> pathSegments4 = s2.getPathSegments();
                        if (pathSegments4 != null) {
                            ArrayList arrayList3 = new ArrayList(pathSegments4);
                            String authority3 = s2.getAuthority();
                            if (TextUtils.isEmpty(authority3)) {
                                i = 0;
                            } else {
                                i = 0;
                                arrayList3.add(0, authority3);
                            }
                            if (!arrayList3.isEmpty()) {
                                arrayList3.remove(i);
                                String queryParameter4 = s2.getQueryParameter("domain");
                                String queryParameter5 = s2.getQueryParameter("startapp");
                                if ("sendgrams".equalsIgnoreCase(queryParameter4)) {
                                    return l(s2);
                                }
                                if ("oauth".equalsIgnoreCase(queryParameter4) && !TextUtils.isEmpty(queryParameter5)) {
                                    return k(s2, queryParameter5);
                                }
                            }
                            return i;
                        }
                    } else {
                        if ("invoice".equalsIgnoreCase(str7)) {
                            return i(s2.getQueryParameter("slug"));
                        }
                        if ("oauth".equalsIgnoreCase(str7)) {
                            return k(s2, s2.getQueryParameter("token"));
                        }
                        if ("settings".equalsIgnoreCase(str7)) {
                            return m(arrayList2.subList(1, arrayList2.size()));
                        }
                        if ("chats".equalsIgnoreCase(str7)) {
                            "search".equalsIgnoreCase(str8);
                            "edit".equalsIgnoreCase(str8);
                            "emoji-status".equalsIgnoreCase(str8);
                        }
                        if ("new".equalsIgnoreCase(str7)) {
                            if ("group".equalsIgnoreCase(str8)) {
                                u(new oc5(new Bundle()), false);
                                return true;
                            }
                            if ("contact".equalsIgnoreCase(str8)) {
                                new ml7(LaunchActivity.S(), launchActivity).show();
                                return true;
                            }
                            if (!"channel".equalsIgnoreCase(str8)) {
                                u(new ContactsActivity(ts2.l("destroyAfterSelect", true)), false);
                                return true;
                            }
                            SharedPreferences d1 = oc7.d1();
                            boolean z2 = e21.a;
                            u(new u8(0), false);
                            d1.edit().putBoolean("channel_intro", true).commit();
                            return true;
                        }
                        if ("post".equalsIgnoreCase(str7)) {
                            ?? r1 = MediaStreamTrack.VIDEO_TRACK_KIND.equalsIgnoreCase(str8);
                            if ("live".equalsIgnoreCase(str8)) {
                                r1 = -1;
                            }
                            v9b C = v9b.C(launchActivity, this.b);
                            if (C.P1 == r1) {
                                z = true;
                            } else {
                                C.P1 = r1;
                                ?? r2 = C.R0;
                                if (r2 != 0) {
                                    r2.a(r1);
                                }
                                z = true;
                                C.h0(r1 == 1, true);
                                wl2 wl2Var = C.J0;
                                if (wl2Var != null) {
                                    wl2Var.a(false, true);
                                }
                                C.l0(false);
                            }
                            C.Q(null);
                            return z;
                        }
                        if ("contacts".equalsIgnoreCase(str7)) {
                            if ("new".equalsIgnoreCase(str8)) {
                                new ml7(LaunchActivity.S(), launchActivity).show();
                                return true;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("needPhonebook", true);
                            bundle.putBoolean("needFinishFragment", true);
                            u(new ContactsActivity(bundle), false);
                            "search".equalsIgnoreCase(str8);
                            "sort".equalsIgnoreCase(str8);
                            if ("invite".equalsIgnoreCase(str8)) {
                                x("phonebookRow");
                                return true;
                            }
                            return true;
                        }
                        if ("addstyle".equalsIgnoreCase(str7)) {
                            return h(s2.getQueryParameter("slug"));
                        }
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public final boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        TL_aicompose.getTone gettone = new TL_aicompose.getTone();
        TL_aicompose.inputAiComposeToneSlug inputaicomposetoneslug = new TL_aicompose.inputAiComposeToneSlug();
        inputaicomposetoneslug.slug = str;
        gettone.tone = inputaicomposetoneslug;
        o();
        ConnectionsManager.getInstance(this.b).sendRequestTyped(gettone, new kc((byte) 0), new vt4((Object) this, (byte) 13));
        return true;
    }

    public final boolean i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        o();
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
        tL_inputInvoiceSlug.slug = str;
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
        this.h = ConnectionsManager.getInstance(this.b).sendRequest(tL_payments_getPaymentForm, new i65(this, tL_inputInvoiceSlug, str, (byte) 5));
        return true;
    }

    public final void j(String str, String str2, String str3) {
        TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot = new TLRPC.TL_requestPeerTypeCreateBot();
        tL_requestPeerTypeCreateBot.bot_managed = true;
        if (!TextUtils.isEmpty(str3)) {
            tL_requestPeerTypeCreateBot.flags |= 2;
            tL_requestPeerTypeCreateBot.suggested_name = str3;
        }
        if (!TextUtils.isEmpty(str2)) {
            tL_requestPeerTypeCreateBot.flags |= 4;
            tL_requestPeerTypeCreateBot.suggested_username = str2;
        }
        d S = LaunchActivity.S();
        if (S == null || S.getContext() == null) {
            return;
        }
        o();
        TLRPC.User[] userArr = {null};
        oc7.r1(this.b).Z1().a(str, null, new iu(this, userArr, new d65(this, S, userArr, tL_requestPeerTypeCreateBot, (byte) 12), (byte) 25));
    }

    public final boolean k(Uri uri, String str) {
        if (!this.d) {
            return true;
        }
        byte b = 0;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        o();
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
        tL_messages_requestUrlAuth.flags |= 4;
        tL_messages_requestUrlAuth.url = uri.toString();
        ConnectionsManager.getInstance(this.b).sendRequestTyped(tL_messages_requestUrlAuth, new kc(b), new lf2((Object) this, (Object) tL_messages_requestUrlAuth, (byte) 28));
        return true;
    }

    public final boolean l(Uri uri) {
        Uri uri2;
        long j;
        if (!oc7.r1(this.b).l4.n0.f) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("startapp");
        if (queryParameter == null || !queryParameter.startsWith("tonconnect-")) {
            uri2 = null;
        } else {
            uri2 = Uri.parse("tc://connect?" + queryParameter.substring(11).replace("--", "%").replace("__", "=").replace("-", "&").replace("%5F", "_").replace("%2D", "-").replace("%2E", "."));
        }
        if (uri2 != null) {
            n(uri2);
            return true;
        }
        String queryParameter2 = uri.getQueryParameter("to");
        String queryParameter3 = uri.getQueryParameter("amount");
        String queryParameter4 = uri.getQueryParameter("text");
        if (TextUtils.isEmpty(queryParameter4)) {
            queryParameter4 = uri.getQueryParameter("comment");
        }
        String r = r(queryParameter4);
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("encrypted", false);
        if (queryParameter3 != null) {
            if (!TextUtils.isEmpty(queryParameter2) && queryParameter3.matches("[0-9]+(?:\\.[0-9]+)?")) {
                try {
                    j = new BigDecimal(queryParameter3).movePointRight(9).longValueExact();
                } catch (ArithmeticException | NumberFormatException unused) {
                }
            }
            return true;
        }
        j = 0;
        long j2 = j;
        if (TextUtils.isEmpty(queryParameter2)) {
            u(new goc(), false);
            return true;
        }
        if (queryParameter2.startsWith("@") || queryParameter2.matches("[a-zA-Z0-9_]{1,32}")) {
            if (queryParameter2.startsWith("@")) {
                queryParameter2 = queryParameter2.substring(1);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = queryParameter2;
                o();
                this.h = ConnectionsManager.getInstance(this.b).sendRequest(tL_contacts_resolveUsername, new j87(this, j2, r, booleanQueryParameter));
                return true;
            }
        } else if (WalletEngine2.isValidRecipientAddress(queryParameter2)) {
            rrc rrcVar = new rrc(queryParameter2);
            rrcVar.s = j2;
            rrcVar.h0 = r;
            rrcVar.i0 = booleanQueryParameter;
            rrcVar.g0 = true;
            u(rrcVar, false);
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:603:0x0a7e  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0a8b  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0a98  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0aa3  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0ab0  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0abd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(List list) {
        boolean z;
        int i;
        String str;
        String str2;
        int i2;
        int i3;
        d S;
        bj6 bj6Var;
        if (list == null) {
            return false;
        }
        boolean z2 = true;
        if (list.isEmpty()) {
            t(new daa());
            return true;
        }
        String str3 = (String) list.get(0);
        String str4 = list.size() > 1 ? (String) list.get(1) : null;
        String str5 = list.size() > 2 ? (String) list.get(2) : null;
        String str6 = list.size() > 3 ? (String) list.get(3) : null;
        String str7 = list.size() > 4 ? (String) list.get(4) : null;
        if ("theme".equalsIgnoreCase(str3) || "themes".equalsIgnoreCase(str3)) {
            t(new ThemeActivity(0));
            return true;
        }
        if ("devices".equalsIgnoreCase(str3)) {
            SessionsActivity sessionsActivity = new SessionsActivity(0);
            if ("link-desktop".equalsIgnoreCase(str4)) {
                sessionsActivity.q0();
            }
            t(sessionsActivity);
            if ("terminate-sessions".equalsIgnoreCase(str4)) {
                x("terminateAllSessionsRow");
            }
            if ("auto-terminate".equalsIgnoreCase(str4)) {
                x("ttlRow");
                return true;
            }
        } else {
            byte b = 5;
            if ("folders".equalsIgnoreCase(str3)) {
                FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
                t(new FiltersSetupActivity());
                if ("create".equalsIgnoreCase(str4)) {
                    gm.d3(new k16(this, filtersSetupActivity, b), 300L);
                }
                if ("show-tags".equalsIgnoreCase(str4)) {
                    x("showTagsRow");
                    return true;
                }
            } else {
                if ("change_number".equalsIgnoreCase(str3)) {
                    u(new u8(3), true);
                    return true;
                }
                if (!"language".equalsIgnoreCase(str3)) {
                    if ("auto_delete".equalsIgnoreCase(str3)) {
                        t(new v70());
                        return true;
                    }
                    byte b2 = 6;
                    if ("phone_privacy".equalsIgnoreCase(str3)) {
                        t(new PrivacyControlActivity(6));
                        return true;
                    }
                    if ("premium_sms".equalsIgnoreCase(str3)) {
                        a aVar = a.a;
                    }
                    boolean equalsIgnoreCase = "login_email".equalsIgnoreCase(str3);
                    int i4 = this.b;
                    if (equalsIgnoreCase) {
                        o();
                        this.h = ConnectionsManager.getInstance(i4).sendRequest(new TL_account.getPassword(), new r15(this, b2), 10);
                        return true;
                    }
                    if ("chats".equalsIgnoreCase(str3)) {
                        tk5 e = e();
                        int size = e.getFragmentStack().size() - 1;
                        while (true) {
                            z = z2;
                            if (size < 0) {
                                bj6Var = null;
                                break;
                            }
                            if (e.getFragmentStack().get(size) instanceof bj6) {
                                bj6Var = (bj6) e.getFragmentStack().get(size);
                                break;
                            }
                            if (size > 0) {
                                ((ActionBarLayout) e).a0(size);
                            }
                            size++;
                            z2 = z;
                        }
                        if (bj6Var != null && "search".equalsIgnoreCase(str4)) {
                            bj6Var.c.E(2);
                            return z;
                        }
                    } else {
                        z = true;
                    }
                    if ("saved-messages".equalsIgnoreCase(str3)) {
                        t(yv1.ga(f().e()));
                        return z;
                    }
                    if ("calls".equalsIgnoreCase(str3)) {
                        if ("start-call".equalsIgnoreCase(str4)) {
                            boolean z3 = z;
                            t(new x56(this, ts2.l("isCall", z3)));
                            return z3;
                        }
                        boolean z4 = z;
                        t(new ia1());
                        return z4;
                    }
                    if ("qr-code".equalsIgnoreCase(str3)) {
                        if ("scan".equalsIgnoreCase(str4) && (S = LaunchActivity.S()) != null) {
                            iy8.d0(S);
                            return z;
                        }
                        if ("share".equalsIgnoreCase(str4)) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", f().e());
                            t(new y56(bundle));
                            return true;
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", f().e());
                        t(new iy8(bundle2));
                        return true;
                    }
                    String str8 = str7;
                    if (!"chat".equalsIgnoreCase(str3) || !"browser".equalsIgnoreCase(str4)) {
                        String str9 = str5;
                        if ("edit".equalsIgnoreCase(str3)) {
                            t(new UserInfoActivity());
                            if ("first-name".equalsIgnoreCase(str4)) {
                                x("firstNameRow");
                            }
                            if ("last-name".equalsIgnoreCase(str4)) {
                                x("lastNameRow");
                            }
                            if ("bio".equalsIgnoreCase(str4)) {
                                x("bioRow");
                            }
                            if ("birthday".equalsIgnoreCase(str4)) {
                                x("birthdayRow");
                            }
                            if ("change-number".equalsIgnoreCase(str4)) {
                                x("numberRow");
                            }
                            if ("username".equalsIgnoreCase(str4)) {
                                x("usernameRow");
                            }
                            if ("channel".equalsIgnoreCase(str4)) {
                                x("channelRow");
                            }
                            if ("add-account".equalsIgnoreCase(str4)) {
                                x("addAccountRow");
                            }
                            if ("log-out".equalsIgnoreCase(str4)) {
                                x("logoutRow");
                                return true;
                            }
                        } else {
                            if ("my-profile".equalsIgnoreCase(str3)) {
                                if ("edit".equalsIgnoreCase(str4)) {
                                    t(new UserInfoActivity());
                                    return true;
                                }
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", f().e());
                                bundle3.putBoolean("my_profile", true);
                                if ("gifts".equalsIgnoreCase(str4)) {
                                    bundle3.putBoolean("open_gifts", true);
                                }
                                ProfileActivity profileActivity = new ProfileActivity(bundle3);
                                if ("gifts".equalsIgnoreCase(str4)) {
                                    profileActivity.whenFullyVisible(new v56(profileActivity, (byte) 2));
                                }
                                if ("posts".equalsIgnoreCase(str4)) {
                                    profileActivity.whenFullyVisible(new v56(profileActivity, (byte) 3));
                                }
                                t(profileActivity);
                                return true;
                            }
                            if ("notifications".equalsIgnoreCase(str3)) {
                                if (!TextUtils.isEmpty(str9) && ("private-chats".equalsIgnoreCase(str4) || "groups".equalsIgnoreCase(str4) || "channels".equalsIgnoreCase(str4) || "stories".equalsIgnoreCase(str4) || "reactions".equalsIgnoreCase(str4))) {
                                    if ("private-chats".equalsIgnoreCase(str4)) {
                                        i3 = 1;
                                    } else {
                                        if (!"groups".equalsIgnoreCase(str4)) {
                                            if ("channels".equalsIgnoreCase(str4)) {
                                                i3 = 2;
                                            } else if ("stories".equalsIgnoreCase(str4)) {
                                                i3 = 3;
                                            } else if ("reactions".equalsIgnoreCase(str4)) {
                                                i3 = 4;
                                            }
                                        }
                                        i3 = 0;
                                    }
                                    NotificationsSettingsActivity notificationsSettingsActivity = new NotificationsSettingsActivity();
                                    o();
                                    notificationsSettingsActivity.F0(new sv2(this, notificationsSettingsActivity, i3, str9, (byte) 2));
                                    return true;
                                }
                                t(new NotificationsSettingsActivity());
                                if ("accounts".equalsIgnoreCase(str4)) {
                                    x("accountsAllRow");
                                }
                                if ("private-chats".equalsIgnoreCase(str4)) {
                                    x("privateRow");
                                }
                                if ("groups".equalsIgnoreCase(str4)) {
                                    x("groupRow");
                                }
                                if ("channels".equalsIgnoreCase(str4)) {
                                    x("channelsRow");
                                }
                                if ("stories".equalsIgnoreCase(str4)) {
                                    x("storiesRow");
                                }
                                if ("reactions".equalsIgnoreCase(str4)) {
                                    x("reactionsRow");
                                }
                                if ("in-app-sounds".equalsIgnoreCase(str4)) {
                                    x("inappSoundRow");
                                }
                                if ("in-app-vibrate".equalsIgnoreCase(str4)) {
                                    x("inappVibrateRow");
                                }
                                if ("in-app-preview".equalsIgnoreCase(str4)) {
                                    x("inappPreviewRow");
                                }
                                if ("in-chat-sounds".equalsIgnoreCase(str4)) {
                                    x("inchatSoundRow");
                                }
                                if ("in-app-popup".equalsIgnoreCase(str4)) {
                                    x("inappPriorityRow");
                                }
                                if ("show-badge-icon".equalsIgnoreCase(str4)) {
                                    x("badgeNumberShowRow");
                                }
                                if ("include-muted-chats".equalsIgnoreCase(str4)) {
                                    x("badgeNumberMutedRow");
                                }
                                if ("count-unread-messages".equalsIgnoreCase(str4)) {
                                    x("badgeNumberMessagesRow");
                                }
                                if ("new-contacts".equalsIgnoreCase(str4)) {
                                    x("contactJoinedRow");
                                }
                                if ("pinned-messages".equalsIgnoreCase(str4)) {
                                    x("pinnedMessageRow");
                                }
                                if ("reset".equalsIgnoreCase(str4)) {
                                    x("resetNotificationsRow");
                                    return true;
                                }
                            } else if ("privacy".equalsIgnoreCase(str3)) {
                                if ("data-settings".equalsIgnoreCase(str4) && "delete-cloud-drafts".equalsIgnoreCase(str9)) {
                                    t(new DataSettingsActivity());
                                    x("clearDraftsRow");
                                    return true;
                                }
                                if (!TextUtils.isEmpty(str9) && "blocked".equalsIgnoreCase(str4)) {
                                    t(new km8());
                                    return true;
                                }
                                if (!TextUtils.isEmpty(str9) && "active-websites".equalsIgnoreCase(str4)) {
                                    t(new SessionsActivity(1));
                                    if (!"disconnect-all".equalsIgnoreCase(str9)) {
                                        return true;
                                    }
                                    x("terminateAllSessionsRow");
                                    return true;
                                }
                                if (!TextUtils.isEmpty(str9) && "passcode".equalsIgnoreCase(str4)) {
                                    t56 t56Var = new t56(this, str9, (byte) 0);
                                    d n0 = PasscodeActivity.n0();
                                    t(n0);
                                    if (n0 instanceof u8) {
                                        ((u8) n0).E = t56Var;
                                        return true;
                                    }
                                    if (n0 instanceof PasscodeActivity) {
                                        ((PasscodeActivity) n0).V = t56Var;
                                        return true;
                                    }
                                } else {
                                    if (!TextUtils.isEmpty(str9) && "2sv".equalsIgnoreCase(str4)) {
                                        o();
                                        this.h = ConnectionsManager.getInstance(i4).sendRequest(new TL_account.getPassword(), new cx3(this, str9, (byte) 16), 10);
                                        return true;
                                    }
                                    if (TextUtils.isEmpty(str9) || !"passkey".equalsIgnoreCase(str4)) {
                                        str = "data-settings";
                                        str2 = "birthdayRow";
                                    } else {
                                        str = "data-settings";
                                        str2 = "birthdayRow";
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            o();
                                            byte b3 = 0;
                                            this.h = ConnectionsManager.getInstance(i4).sendRequestTyped(new TL_account.getPasskeys(), new kc(b3), new u56(this, str9, b3));
                                            return true;
                                        }
                                    }
                                    if (!TextUtils.isEmpty(str9) && "auto-delete".equalsIgnoreCase(str4) && f().q0 >= 0) {
                                        t(new v70());
                                        return true;
                                    }
                                    if (!TextUtils.isEmpty(str9) && ("phone-number".equalsIgnoreCase(str4) || "last-seen".equalsIgnoreCase(str4) || "profile-photos".equalsIgnoreCase(str4) || "bio".equalsIgnoreCase(str4) || "gifts".equalsIgnoreCase(str4) || "birthday".equalsIgnoreCase(str4) || "saved-music".equalsIgnoreCase(str4) || "forwards".equalsIgnoreCase(str4) || "calls".equalsIgnoreCase(str4) || "voice".equalsIgnoreCase(str4) || "messages".equalsIgnoreCase(str4) || "invites".equalsIgnoreCase(str4))) {
                                        if ("phone-number".equalsIgnoreCase(str4)) {
                                            i2 = 6;
                                        } else {
                                            if (!"last-seen".equalsIgnoreCase(str4)) {
                                                if ("profile-photos".equalsIgnoreCase(str4)) {
                                                    i2 = 4;
                                                } else if ("bio".equalsIgnoreCase(str4)) {
                                                    i2 = 9;
                                                } else if ("gifts".equalsIgnoreCase(str4)) {
                                                    i2 = 12;
                                                } else if ("birthday".equalsIgnoreCase(str4)) {
                                                    i2 = 11;
                                                } else if ("saved-music".equalsIgnoreCase(str4)) {
                                                    i2 = 14;
                                                } else if ("forwards".equalsIgnoreCase(str4)) {
                                                    i2 = 5;
                                                } else if ("calls".equalsIgnoreCase(str4)) {
                                                    i2 = "p2p".equalsIgnoreCase(str9) ? 3 : 2;
                                                } else if ("voice".equalsIgnoreCase(str4)) {
                                                    i2 = 8;
                                                } else if ("messages".equalsIgnoreCase(str4)) {
                                                    i2 = 10;
                                                } else if ("invites".equalsIgnoreCase(str4)) {
                                                    i2 = 1;
                                                }
                                            }
                                            i2 = 0;
                                        }
                                        t(new PrivacyControlActivity(i2));
                                        if ("birthday".equalsIgnoreCase(str4) && "add".equalsIgnoreCase(str9)) {
                                            x("setBirthdayRow");
                                        }
                                        if ("always-share".equalsIgnoreCase(str9) || "always-share".equalsIgnoreCase(str6) || "always".equalsIgnoreCase(str9) || "always".equalsIgnoreCase(str6)) {
                                            x("everybodyRow");
                                        }
                                        if ("never-share".equalsIgnoreCase(str9) || "never-share".equalsIgnoreCase(str6) || "never".equalsIgnoreCase(str9) || "never".equalsIgnoreCase(str6)) {
                                            x("nobodyRow");
                                        }
                                        if ("gifts".equalsIgnoreCase(str4) && "show-icon".equalsIgnoreCase(str9)) {
                                            x("showGiftIconRow");
                                        }
                                        if ("gifts".equalsIgnoreCase(str4) && "accepted-types".equalsIgnoreCase(str9)) {
                                            x("giftTypesHeaderRow");
                                        }
                                        if ("messages".equalsIgnoreCase(str4) && "set-price".equalsIgnoreCase(str9)) {
                                            x("priceRow");
                                        }
                                        if ("messages".equalsIgnoreCase(str4) && "remove-fee".equalsIgnoreCase(str9)) {
                                            x("alwaysShareRow");
                                        }
                                        if ("last-seen".equalsIgnoreCase(str4) && "hide-read-time".equalsIgnoreCase(str9)) {
                                            x("readRow");
                                        }
                                        if ("profile-photos".equalsIgnoreCase(str4)) {
                                            if ("set-public".equalsIgnoreCase(str9)) {
                                                x("photoForRestRow");
                                            }
                                            if ("update-public".equalsIgnoreCase(str9)) {
                                                x("photoForRestRow");
                                            }
                                            if ("remove-public".equalsIgnoreCase(str9)) {
                                                x("currentPhotoForRestRow");
                                                return true;
                                            }
                                        }
                                    } else if (oc7.r1(i4).l4.L0.f() || !"archive-and-mute".equalsIgnoreCase(str4)) {
                                        t(new PrivacySettingsActivity());
                                        if ("blocked".equalsIgnoreCase(str4)) {
                                            x("blockedRow");
                                        }
                                        if ("active-websites".equalsIgnoreCase(str4)) {
                                            x("webSessionsRow");
                                        }
                                        if ("passcode".equalsIgnoreCase(str4)) {
                                            x("passcodeRow");
                                        }
                                        if ("2sv".equalsIgnoreCase(str4)) {
                                            x("passwordRow");
                                        }
                                        if ("passkey".equalsIgnoreCase(str4)) {
                                            x("passkeysRow");
                                        }
                                        if ("auto-delete".equalsIgnoreCase(str4)) {
                                            x("autoDeleteMesages");
                                        }
                                        if ("login-email".equalsIgnoreCase(str4)) {
                                            x("emailLoginRow");
                                        }
                                        if ("phone-number".equalsIgnoreCase(str4)) {
                                            x("phoneNumberRow");
                                        }
                                        if ("last-seen".equalsIgnoreCase(str4)) {
                                            x("lastSeenRow");
                                        }
                                        if ("profile-photos".equalsIgnoreCase(str4)) {
                                            x("profilePhotoRow");
                                        }
                                        if ("bio".equalsIgnoreCase(str4)) {
                                            x("bioRow");
                                        }
                                        if ("gifts".equalsIgnoreCase(str4)) {
                                            x("giftsRow");
                                        }
                                        if ("birthday".equalsIgnoreCase(str4)) {
                                            x(str2);
                                        }
                                        if ("saved-music".equalsIgnoreCase(str4)) {
                                            x("musicRow");
                                        }
                                        if ("forwards".equalsIgnoreCase(str4)) {
                                            x("forwardsRow");
                                        }
                                        if ("calls".equalsIgnoreCase(str4)) {
                                            x("callsRow");
                                        }
                                        if ("voice".equalsIgnoreCase(str4)) {
                                            x("voicesRow");
                                        }
                                        if ("messages".equalsIgnoreCase(str4)) {
                                            x("noncontactsRow");
                                        }
                                        if ("invites".equalsIgnoreCase(str4)) {
                                            x("groupsRow");
                                        }
                                        if ("self-destruct".equalsIgnoreCase(str4)) {
                                            x("deleteAccountRow");
                                        }
                                        if ("archive-and-mute".equalsIgnoreCase(str4)) {
                                            x("newChatsRow");
                                        }
                                        if (str.equalsIgnoreCase(str4)) {
                                            if ("sync-contacts".equalsIgnoreCase(str9)) {
                                                x("contactsSyncRow");
                                            }
                                            if ("delete-synced".equalsIgnoreCase(str9)) {
                                                x("contactsDeleteRow");
                                            }
                                            if ("suggest-contacts".equalsIgnoreCase(str9)) {
                                                x("contactsSuggestRow");
                                            }
                                            if ("clear-payment-info".equalsIgnoreCase(str9)) {
                                                x("paymentsClearRow");
                                            }
                                            if ("link-previews".equalsIgnoreCase(str9)) {
                                                x("secretWebpageRow");
                                            }
                                            if ("map-provider".equalsIgnoreCase(str9)) {
                                                x("secretMapRow");
                                                return true;
                                            }
                                        }
                                    }
                                }
                            } else if ("data".equalsIgnoreCase(str3)) {
                                if ("storage".equalsIgnoreCase(str4)) {
                                    "clear-cache".equalsIgnoreCase(str9);
                                    t(new y71());
                                    return true;
                                }
                                if ("usage".equalsIgnoreCase(str4)) {
                                    t93 t93Var = new t93();
                                    t(t93Var);
                                    if ("mobile".equalsIgnoreCase(str9)) {
                                        t93Var.b.e(1, 1);
                                    }
                                    if ("wifi".equalsIgnoreCase(str9)) {
                                        t93Var.b.e(2, 2);
                                    }
                                    if ("roaming".equalsIgnoreCase(str9)) {
                                        t93Var.b.e(3, 3);
                                    }
                                    if ("reset".equalsIgnoreCase(str9)) {
                                        t93Var.x0();
                                        return true;
                                    }
                                } else {
                                    if ("auto-download".equalsIgnoreCase(str4)) {
                                        if ("mobile".equalsIgnoreCase(str9) || "wifi".equalsIgnoreCase(str9) || "roaming".equalsIgnoreCase(str9)) {
                                            if (!"mobile".equalsIgnoreCase(str9)) {
                                                if ("wifi".equalsIgnoreCase(str9)) {
                                                    i = 1;
                                                } else if ("roaming".equalsIgnoreCase(str9)) {
                                                    i = 2;
                                                }
                                                t(new DataAutoDownloadActivity(i));
                                                if ("enable".equalsIgnoreCase(str6)) {
                                                    x("autoDownloadRow");
                                                }
                                                if ("usage".equalsIgnoreCase(str6)) {
                                                    x("usageProgressRow");
                                                }
                                                if ("photos".equalsIgnoreCase(str6)) {
                                                    x("photosRow");
                                                }
                                                if ("stories".equalsIgnoreCase(str6)) {
                                                    x("storiesRow");
                                                }
                                                if ("videos".equalsIgnoreCase(str6)) {
                                                    x("videosRow");
                                                }
                                                if ("files".equalsIgnoreCase(str6)) {
                                                    x("filesRow");
                                                    return true;
                                                }
                                            }
                                            i = 0;
                                            t(new DataAutoDownloadActivity(i));
                                            if ("enable".equalsIgnoreCase(str6)) {
                                            }
                                            if ("usage".equalsIgnoreCase(str6)) {
                                            }
                                            if ("photos".equalsIgnoreCase(str6)) {
                                            }
                                            if ("stories".equalsIgnoreCase(str6)) {
                                            }
                                            if ("videos".equalsIgnoreCase(str6)) {
                                            }
                                            if ("files".equalsIgnoreCase(str6)) {
                                            }
                                        } else if ("reset".equalsIgnoreCase(str9)) {
                                            t(new DataSettingsActivity());
                                            x("resetDownloadRow");
                                            return true;
                                        }
                                    }
                                    if (!TextUtils.isEmpty(str6) && "save-to-photos".equalsIgnoreCase(str4)) {
                                        t(new SaveToGallerySettingsActivity(kt6.j("groups".equalsIgnoreCase(str9) ? 2 : "channels".equalsIgnoreCase(str9) ? 4 : 1, TeXSymbolParser.TYPE_ATTR)));
                                        if ("max-video-size".equalsIgnoreCase(str6)) {
                                            x("maxVideoSizeRow");
                                        }
                                        if ("add-exception".equalsIgnoreCase(str6)) {
                                            x("addExceptionRow");
                                        }
                                        if ("delete-all".equalsIgnoreCase(str6)) {
                                            x("deleteAllExceptionsRow");
                                            return true;
                                        }
                                    } else if (!TextUtils.isEmpty(str9) && "proxy".equalsIgnoreCase(str4)) {
                                        t(new ProxyListActivity());
                                        if ("use-proxy".equalsIgnoreCase(str9)) {
                                            x("useProxyRow");
                                        }
                                        if ("add-proxy".equalsIgnoreCase(str9)) {
                                            x("proxyAddRow");
                                            return true;
                                        }
                                    } else {
                                        if ("pause-music".equalsIgnoreCase(str4)) {
                                            t(new ThemeActivity(0));
                                            x("pauseOnMediaRow");
                                            return true;
                                        }
                                        if ("pause-music-on-record".equalsIgnoreCase(str4)) {
                                            t(new ThemeActivity(0));
                                            x("pauseOnRecordRow");
                                            return true;
                                        }
                                        if ("raise-to-listen".equalsIgnoreCase(str4)) {
                                            t(new ThemeActivity(0));
                                            x("raiseToListenRow");
                                            return true;
                                        }
                                        if ("raise-to-speak".equalsIgnoreCase(str4)) {
                                            t(new ThemeActivity(0));
                                            x("raiseToSpeakRow");
                                            return true;
                                        }
                                        if ("show-18-contnet".equalsIgnoreCase(str4)) {
                                            t(new ThemeActivity(0));
                                            x("sensitiveContentRow");
                                            return true;
                                        }
                                        t(new DataSettingsActivity());
                                        if ("save-to-photos".equalsIgnoreCase(str4)) {
                                            if ("chats".equalsIgnoreCase(str9)) {
                                                x("saveToGalleryPeerRow");
                                            }
                                            if ("groups".equalsIgnoreCase(str9)) {
                                                x("saveToGalleryGroupsRow");
                                            }
                                            if ("channels".equalsIgnoreCase(str9)) {
                                                x("saveToGalleryChannelsRow");
                                            }
                                        }
                                        if ("use-less-data".equalsIgnoreCase(str4)) {
                                            x("useLessDataForCallsRow");
                                        }
                                        if ("proxy".equalsIgnoreCase(str4)) {
                                            x("proxyRow");
                                            return true;
                                        }
                                    }
                                }
                            } else if ("appearance".equalsIgnoreCase(str3)) {
                                if ("themes".equalsIgnoreCase(str4) || "theme".equalsIgnoreCase(str4)) {
                                    t(new ThemeActivity(3));
                                    if ("create".equalsIgnoreCase(str9)) {
                                        x("createNewThemeRow");
                                        return true;
                                    }
                                } else if (!TextUtils.isEmpty(str9) && ("wallpaper".equalsIgnoreCase(str4) || "wallpapers".equalsIgnoreCase(str4))) {
                                    t(new WallpapersListActivity(0));
                                    if ("set".equalsIgnoreCase(str9) || "choose-photo".equalsIgnoreCase(str9)) {
                                        x("uploadImageRow");
                                        return true;
                                    }
                                } else {
                                    if (!TextUtils.isEmpty(str9) && ("your-color".equalsIgnoreCase(str4) || "color".equalsIgnoreCase(str4))) {
                                        t(new d38());
                                        return true;
                                    }
                                    if (TextUtils.isEmpty(str9) || !"stickers-and-emoji".equalsIgnoreCase(str4)) {
                                        t(new ThemeActivity(0));
                                        if ("wallpaper".equalsIgnoreCase(str4) || "wallpapers".equalsIgnoreCase(str4)) {
                                            x("backgroundRow");
                                        }
                                        if ("your-color".equalsIgnoreCase(str4) || "color".equalsIgnoreCase(str4)) {
                                            x("changeUserColor");
                                        }
                                        if ("auto-night-mode".equalsIgnoreCase(str4)) {
                                            x("nightThemeRow");
                                        }
                                        if ("text-size".equalsIgnoreCase(str4)) {
                                            x("textSizeRow");
                                        }
                                        if ("message-corners".equalsIgnoreCase(str4)) {
                                            x("bubbleRadiusRow");
                                        }
                                        if ("animations".equalsIgnoreCase(str4)) {
                                            x("liteModeRow");
                                        }
                                        if ("stickers-and-emoji".equalsIgnoreCase(str4)) {
                                            x("stickersRow");
                                        }
                                        if ("app-icon".equalsIgnoreCase(str4)) {
                                            x("appIconSelectorRow");
                                        }
                                        if ("tap-for-next-media".equalsIgnoreCase(str4)) {
                                            x("nextMediaTapRow");
                                            return true;
                                        }
                                    } else {
                                        if (!TextUtils.isEmpty(str6) && "archived".equalsIgnoreCase(str9)) {
                                            t(new ht(0));
                                            return true;
                                        }
                                        if (!"emoji".equalsIgnoreCase(str9) || TextUtils.isEmpty(str6) || "large".equalsIgnoreCase(str6) || "dynamic-order".equalsIgnoreCase(str6)) {
                                            t(new StickersActivity(0, null));
                                            if ("trending".equalsIgnoreCase(str9)) {
                                                x("featuredRow");
                                            }
                                            if ("archived".equalsIgnoreCase(str9)) {
                                                x("archivedRow");
                                            }
                                            if ("emoji".equalsIgnoreCase(str9) && "large".equalsIgnoreCase(str6)) {
                                                x("largeEmojiRow");
                                                return true;
                                            }
                                            if ("emoji".equalsIgnoreCase(str9) && "dynamic-order".equalsIgnoreCase(str6)) {
                                                x("dynamicPackOrder");
                                                return true;
                                            }
                                            if ("emoji".equalsIgnoreCase(str9)) {
                                                x("emojiPacksRow");
                                                return true;
                                            }
                                        } else {
                                            if (!TextUtils.isEmpty(str8) && "archived".equalsIgnoreCase(str6)) {
                                                t(new ht(5));
                                                return true;
                                            }
                                            t(new StickersActivity(5, null));
                                            if ("suggest".equalsIgnoreCase(str6)) {
                                                x("suggestRow");
                                                return true;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (!"power-saving".equalsIgnoreCase(str3)) {
                                    boolean equalsIgnoreCase2 = "stars".equalsIgnoreCase(str3);
                                    LaunchActivity launchActivity = this.a;
                                    if (equalsIgnoreCase2) {
                                        if ("top-up".equalsIgnoreCase(str4)) {
                                            new exa(launchActivity, null).show();
                                            return true;
                                        }
                                        if ("stats".equalsIgnoreCase(str4)) {
                                            t(new au0(0, f().e()));
                                            return true;
                                        }
                                        if ("gift".equalsIgnoreCase(str4)) {
                                            jva.t(i4).r();
                                            yw4.g1(ok0.a(i4).b());
                                            return true;
                                        }
                                        if ("earn".equalsIgnoreCase(str4)) {
                                            t(new mh1(f().e()));
                                            return true;
                                        }
                                        t(new nxa());
                                        return true;
                                    }
                                    if ("premium".equalsIgnoreCase(str3)) {
                                        t(new PremiumPreviewFragment());
                                        return true;
                                    }
                                    if ("business".equalsIgnoreCase(str3)) {
                                        t(new PremiumPreviewFragment(1, "link"));
                                        if (!"do-not-hide-ads".equalsIgnoreCase(str4)) {
                                            return true;
                                        }
                                        x("showAdsRow");
                                        return true;
                                    }
                                    if ("ton".equalsIgnoreCase(str3)) {
                                        t(new yfb());
                                        return true;
                                    }
                                    if ("send-gift".equalsIgnoreCase(str3)) {
                                        if ("self".equalsIgnoreCase(str4)) {
                                            new ux4(this.a, this.b, f().e(), null, null).show();
                                            return true;
                                        }
                                        yw4.f1(false, ok0.a(i4).b());
                                        return true;
                                    }
                                    if ("ask-question".equalsIgnoreCase(str3) || "ask-a-question".equalsIgnoreCase(str3)) {
                                        ik.R(LaunchActivity.S(), null).show();
                                        return true;
                                    }
                                    if ("faq".equalsIgnoreCase(str3)) {
                                        l11.u(launchActivity, jb6.L0(2131743925));
                                        return true;
                                    }
                                    if ("features".equalsIgnoreCase(str3)) {
                                        l11.u(launchActivity, jb6.L0(2131743923));
                                        return true;
                                    }
                                    if ("privacy-policy".equalsIgnoreCase(str3)) {
                                        l11.u(launchActivity, jb6.L0(2131746516));
                                        return true;
                                    }
                                    t(new daa());
                                    return true;
                                }
                                m86 m86Var = new m86();
                                t(m86Var);
                                if ("videos".equalsIgnoreCase(str4)) {
                                    m86Var.a0(1024);
                                }
                                if ("gifs".equalsIgnoreCase(str4)) {
                                    m86Var.a0(2048);
                                }
                                if ("stickers".equalsIgnoreCase(str4)) {
                                    m86Var.a0(3);
                                }
                                if ("emoji".equalsIgnoreCase(str4)) {
                                    m86Var.a0(28700);
                                }
                                if ("effects".equalsIgnoreCase(str4)) {
                                    m86Var.a0(360928);
                                }
                                if ("call-animations".equalsIgnoreCase(str4)) {
                                    m86Var.a0(512);
                                }
                                if ("particles".equalsIgnoreCase(str4)) {
                                    m86Var.a0(131072);
                                }
                                if ("transitions".equalsIgnoreCase(str4)) {
                                    int i5 = 0;
                                    while (true) {
                                        ArrayList arrayList = m86Var.s;
                                        if (i5 >= arrayList.size()) {
                                            break;
                                        }
                                        if (((g86) arrayList.get(i5)).f) {
                                            m86Var.b.f1(new ji((Object) m86Var, i5, (byte) 11), 700, true);
                                            return true;
                                        }
                                        i5++;
                                    }
                                }
                            }
                        }
                        return true;
                    }
                    if (TextUtils.isEmpty(str5)) {
                        t(new ThemeActivity(0));
                        x("browserRow");
                        return true;
                    }
                    t(new uuc(null));
                    if ("enable-browser".equalsIgnoreCase(str5)) {
                        x("enableRow");
                    }
                    if ("clear-cookies".equalsIgnoreCase(str5)) {
                        x("clearCookiesRow");
                    }
                    if ("clear-cache".equalsIgnoreCase(str5)) {
                        x("clearCacheRow");
                    }
                    if ("history".equalsIgnoreCase(str5)) {
                        x("historyRow");
                    }
                    if ("clear-history".equalsIgnoreCase(str5)) {
                        x("clearHistoryRow");
                    }
                    if ("never-open".equalsIgnoreCase(str5)) {
                        x("neverOpenRow");
                    }
                    if ("clear-list".equalsIgnoreCase(str5)) {
                        x("clearListRow");
                    }
                    if ("search".equalsIgnoreCase(str5)) {
                        x("searchRow");
                        return true;
                    }
                    return true;
                }
                if ("do-not-translate".equalsIgnoreCase(str4)) {
                    t(new qc9());
                    return true;
                }
                t(new LanguageSelectActivity());
                if ("show-button".equalsIgnoreCase(str4)) {
                    x("manualTranslationPosition");
                }
                if ("translate-chats".equalsIgnoreCase(str4)) {
                    x("autoTranslationPosition");
                    return true;
                }
            }
        }
        return true;
    }

    public final boolean n(Uri uri) {
        Uri s = s(uri);
        List<String> pathSegments = s.getPathSegments();
        if (pathSegments != null) {
            ArrayList arrayList = new ArrayList(pathSegments);
            String authority = s.getAuthority();
            if (!TextUtils.isEmpty(authority)) {
                arrayList.add(0, authority);
            }
            if (arrayList.isEmpty() || "connect".equalsIgnoreCase((String) arrayList.get(0))) {
                try {
                    if ("2".equals(s.getQueryParameter("v"))) {
                        String queryParameter = s.getQueryParameter("id");
                        String queryParameter2 = s.getQueryParameter("r");
                        String queryParameter3 = s.getQueryParameter("trace_id");
                        String queryParameter4 = s.getQueryParameter("e");
                        String queryParameter5 = s.getQueryParameter("ret");
                        if (queryParameter5 == null || !p(queryParameter5)) {
                            queryParameter5 = "back";
                        }
                        String str = queryParameter5;
                        if (queryParameter2 != null) {
                            String string = new JSONObject(queryParameter2).getString("manifestUrl");
                            o();
                            c C = c.C(this.b);
                            C.x0(new lo0((Object) this, (Object) C, (Object) queryParameter, (Object) string, (Object) queryParameter2, (Object) queryParameter3, (Object) queryParameter4, (Object) str, (byte) 6));
                            return false;
                        }
                        if (!TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter3)) {
                            o();
                            v(queryParameter, 0, queryParameter3, str);
                            return true;
                        }
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                    return false;
                }
            }
        }
        return false;
    }

    public final void o() {
        if (this.f || this.g) {
            return;
        }
        k11 k11Var = this.c;
        if (k11Var == null) {
            he heVar = this.e;
            if (heVar == null) {
                heVar = new he(3, null, this.a);
                this.e = heVar;
            }
            heVar.setOnCancelListener(new ct0(this, (byte) 10));
            this.e.q(300L);
        } else {
            k11Var.b = new w56(this, (byte) 0);
            k11Var.d();
        }
        this.f = true;
    }

    public final void t(d dVar) {
        u(dVar, false);
    }

    public final void u(d dVar, boolean z) {
        LaunchActivity launchActivity = this.a;
        launchActivity.u0(dVar, z, false);
        if (gm.O1()) {
            launchActivity.p0.W(true, true);
            launchActivity.r0.W(true, true);
        }
    }

    public final void v(String str, int i, String str2, String str3) {
        if (!this.j) {
            LaunchActivity launchActivity = this.a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                tonconnectgetpending.dapp_client_id = str;
                this.h = ConnectionsManager.getInstance(this.b).sendRequestTyped(tonconnectgetpending, new kc((byte) 0), new v35(this, str, str2, str3, i));
                return;
            }
        }
        c();
    }

    public final void w(String str) {
        LaunchActivity launchActivity = this.a;
        if (launchActivity.isFinishing() || launchActivity.isDestroyed() || "none".equals(str)) {
            return;
        }
        if (!"back".equals(str)) {
            l11.w(launchActivity, str, false);
        } else if (this.d) {
            launchActivity.moveTaskToBack(true);
        }
    }

    public final void x(String str) {
        gm.f3(this.a.N(), str);
    }
}
