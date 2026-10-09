package org.telegram.ui;

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
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Wallet.WalletEngine2;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ec0 {
    public final LaunchActivity a;
    public final int b;
    public final of.e c;
    public final boolean d;
    public org.telegram.ui.ActionBar.b2 e;
    public boolean f;
    public boolean g;
    public int h = -1;
    public ei.l3 i;
    public boolean j;

    public ec0(LaunchActivity launchActivity, int i10, of.e eVar, boolean z10) {
        this.a = launchActivity;
        this.b = i10;
        this.c = eVar;
        this.d = z10;
    }

    public static org.telegram.ui.Components.ad d() {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        return U == null ? org.telegram.ui.Components.ad.X() : org.telegram.ui.Components.ad.a0(U);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        if (r2.equals("http") != false) goto L26;
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
            if (scheme != null && !uri.getRawSchemeSpecificPart().isEmpty()) {
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
            }
            return false;
        } catch (URISyntaxException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0144, code lost:
    
        if (r1.equals("joinchat") != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x003d, code lost:
    
        if (r2.equals("http") != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0154 A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:6:0x0004, B:9:0x000f, B:12:0x0016, B:20:0x002b, B:23:0x003f, B:26:0x0046, B:28:0x0060, B:30:0x0068, B:33:0x0072, B:36:0x0083, B:38:0x008f, B:39:0x0092, B:41:0x0098, B:43:0x009f, B:46:0x00aa, B:48:0x00b0, B:51:0x00bd, B:52:0x00c1, B:54:0x0147, B:57:0x0154, B:61:0x00c6, B:65:0x00d0, B:68:0x00da, B:71:0x00e4, B:74:0x00ed, B:77:0x00f6, B:80:0x00ff, B:83:0x0108, B:86:0x0111, B:89:0x011a, B:92:0x0123, B:95:0x012c, B:98:0x0135, B:101:0x013e, B:103:0x015e, B:105:0x0164, B:107:0x0037, B:109:0x0170, B:111:0x0178, B:113:0x0180, B:115:0x0188), top: B:5:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean q(String str) {
        Uri parse;
        String scheme;
        String path;
        String str2;
        if (str == null) {
            return false;
        }
        try {
            parse = Uri.parse(str);
            scheme = parse.getScheme();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (scheme == null || (path = parse.getPath()) == null) {
            return false;
        }
        int hashCode = scheme.hashCode();
        if (hashCode != 3699) {
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && scheme.equals("https")) {
                }
            }
            if (path.isEmpty()) {
                return false;
            }
            String lowerCase = parse.getHost().toLowerCase();
            boolean find = LaunchActivity.B1.matcher(lowerCase).find();
            if (lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog") || find) {
                ArrayList arrayList = new ArrayList(parse.getPathSegments());
                if (arrayList.size() > 0 && ((String) arrayList.get(0)).equals("s")) {
                    arrayList.remove(0);
                }
                if (arrayList.size() <= 0 || (arrayList.size() >= 3 && "s".equals(arrayList.get(1)))) {
                    return false;
                }
                if (arrayList.size() > 1) {
                    String str3 = (String) arrayList.get(0);
                    if (TextUtils.isEmpty(str3)) {
                        return false;
                    }
                    switch (str3.hashCode()) {
                        case -1401304190:
                            break;
                        case -1268966290:
                            if (str3.equals("folder")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2) && !str2.matches("^\\d+$")) {
                            }
                            break;
                        case -1230486459:
                            if (str3.equals("addemoji")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                                break;
                            }
                            break;
                        case -1216792120:
                            if (str3.equals("addtheme")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                        case -1147866945:
                            if (str3.equals("addlist")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                        case 99:
                            if (str3.equals("c")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                        case 108417:
                            if (str3.equals("msg")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                        case 93922211:
                            if (str3.equals("boost")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                        case 103149417:
                            if (str3.equals("login")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                        case 109400031:
                            if (str3.equals("share")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                        case 311086522:
                            if (str3.equals("setlanguage")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                        case 492791415:
                            if (str3.equals("addstickers")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                        case 951526432:
                            if (str3.equals("contact")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                        case 2112655022:
                            if (str3.equals("confirmphone")) {
                                break;
                            }
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                        default:
                            str2 = (String) arrayList.get(1);
                            if (!TextUtils.isEmpty(str2)) {
                            }
                            break;
                    }
                    return false;
                }
                if (arrayList.size() == 1) {
                    return !TextUtils.isEmpty(parse.getQueryParameter("startapp"));
                }
            }
        } else if (scheme.equals("tg") && (str.startsWith("tg:resolve") || str.startsWith("tg://resolve"))) {
            return !TextUtils.isEmpty(parse.getQueryParameter("appname"));
        }
        return false;
    }

    public static String r(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int i10 = 960;
        if (bytes.length <= 960) {
            return str;
        }
        while ((bytes[i10] & 192) == 128) {
            i10--;
        }
        return new String(bytes, 0, i10, StandardCharsets.UTF_8);
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
        return (launchActivity.isFinishing() || launchActivity.isDestroyed() || !LaunchActivity.E1 || SharedConfig.appLocked || SharedConfig.isWaitingForPasscodeEnter || UserConfig.selectedAccount != this.b) ? false : true;
    }

    public final void b() {
        this.j = true;
        ei.l3 l3Var = this.i;
        if (l3Var != null) {
            AndroidUtilities.cancelRunOnUIThread(l3Var);
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
        org.telegram.ui.ActionBar.b2 b2Var = this.e;
        if (b2Var != null) {
            b2Var.dismiss();
        }
        of.e eVar = this.c;
        if (eVar != null) {
            eVar.b();
        }
        this.g = true;
    }

    public final org.telegram.ui.ActionBar.d5 e() {
        return this.a.O();
    }

    public final UserConfig f() {
        return UserConfig.getInstance(this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [int] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r17v0, types: [org.telegram.ui.ec0] */
    /* JADX WARN: Type inference failed for: r4v21, types: [ci.db, ci.x8] */
    public final boolean g(Uri uri) {
        Uri s10;
        List<String> pathSegments;
        Long l4;
        Uri uri2 = uri;
        if (uri2 != null) {
            FileLog.d("link manager handle " + uri2);
            String scheme = uri2.getScheme();
            boolean equalsIgnoreCase = "tonsite".equalsIgnoreCase(scheme);
            LaunchActivity launchActivity = this.a;
            if (equalsIgnoreCase) {
                of.f.p(launchActivity, uri2, true, true);
                return true;
            }
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                String host = uri2.getHost();
                if (host != null) {
                    Matcher matcher = LaunchActivity.B1.matcher(host.toLowerCase());
                    boolean find = matcher.find();
                    if ("telegram.me".equalsIgnoreCase(host) || "t.me".equalsIgnoreCase(host) || "telegram.dog".equalsIgnoreCase(host) || find) {
                        if (find) {
                            StringBuilder sb2 = new StringBuilder("https://t.me/");
                            sb2.append(matcher.group(1));
                            String str = "";
                            sb2.append(TextUtils.isEmpty(uri2.getPath()) ? "" : uri2.getPath());
                            if (!TextUtils.isEmpty(uri2.getQuery())) {
                                str = "?" + uri2.getQuery();
                            }
                            sb2.append(str);
                            uri2 = Uri.parse(sb2.toString());
                        }
                        String path = uri2.getPath();
                        if (path != null && path.length() > 1) {
                            String substring = path.substring(1);
                            List<String> pathSegments2 = uri2.getPathSegments();
                            if (pathSegments2 != null && !pathSegments2.isEmpty()) {
                                String str2 = pathSegments2.get(0);
                                String str3 = pathSegments2.size() > 1 ? pathSegments2.get(1) : null;
                                if ("sendgrams".equalsIgnoreCase(str2)) {
                                    return l(uri2);
                                }
                                if ("$".equalsIgnoreCase(str2)) {
                                    return i(substring.substring(1));
                                }
                                if ("invoice".equalsIgnoreCase(str2)) {
                                    return i(str3);
                                }
                                if ("addstyle".equalsIgnoreCase(str2)) {
                                    return h(str3);
                                }
                                if ("oauth".equalsIgnoreCase(str2)) {
                                    return k(uri2, uri2.getQueryParameter("startapp"));
                                }
                                if ("newbot".equalsIgnoreCase(str2)) {
                                    if (pathSegments2.size() >= 2) {
                                        j(str3, pathSegments2.size() >= 3 ? pathSegments2.get(2) : null, uri2.getQueryParameter("name"));
                                        return true;
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else {
                boolean equalsIgnoreCase2 = "tg".equalsIgnoreCase(scheme);
                int i10 = this.b;
                if (equalsIgnoreCase2) {
                    Uri s11 = s(Uri.parse(uri2.toString().replaceFirst("(?i)^tg:(//)?sendgrams&", "tg://sendgrams?")));
                    List<String> pathSegments3 = s11.getPathSegments();
                    if (pathSegments3 != null) {
                        ArrayList arrayList = new ArrayList(pathSegments3);
                        String authority = s11.getAuthority();
                        if (!TextUtils.isEmpty(authority)) {
                            arrayList.add(0, authority);
                        }
                        if (!arrayList.isEmpty()) {
                            String str4 = (String) arrayList.get(0);
                            String str5 = arrayList.size() > 1 ? (String) arrayList.get(1) : null;
                            if ("sendgrams".equalsIgnoreCase(str4)) {
                                return l(s11);
                            }
                            if ("newbot".equalsIgnoreCase(str4)) {
                                j(s11.getQueryParameter("manager"), s11.getQueryParameter("username"), s11.getQueryParameter("name"));
                                return true;
                            }
                            if ("resolve".equalsIgnoreCase(str4)) {
                                List<String> pathSegments4 = s11.getPathSegments();
                                if (pathSegments4 != null) {
                                    ArrayList arrayList2 = new ArrayList(pathSegments4);
                                    String authority2 = s11.getAuthority();
                                    if (!TextUtils.isEmpty(authority2)) {
                                        arrayList2.add(0, authority2);
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        arrayList2.remove(0);
                                        String queryParameter = s11.getQueryParameter("domain");
                                        String queryParameter2 = s11.getQueryParameter("startapp");
                                        if ("sendgrams".equalsIgnoreCase(queryParameter)) {
                                            return l(s11);
                                        }
                                        if ("oauth".equalsIgnoreCase(queryParameter) && !TextUtils.isEmpty(queryParameter2)) {
                                            return k(s11, queryParameter2);
                                        }
                                    }
                                }
                            } else {
                                if ("invoice".equalsIgnoreCase(str4)) {
                                    return i(s11.getQueryParameter("slug"));
                                }
                                if ("oauth".equalsIgnoreCase(str4)) {
                                    return k(s11, s11.getQueryParameter("token"));
                                }
                                if ("settings".equalsIgnoreCase(str4)) {
                                    return m(arrayList.subList(1, arrayList.size()));
                                }
                                if ("chats".equalsIgnoreCase(str4)) {
                                    "search".equalsIgnoreCase(str5);
                                    "edit".equalsIgnoreCase(str5);
                                    "emoji-status".equalsIgnoreCase(str5);
                                }
                                if ("new".equalsIgnoreCase(str4)) {
                                    if ("group".equalsIgnoreCase(str5)) {
                                        u(new c70(new Bundle()), false);
                                        return true;
                                    }
                                    if ("contact".equalsIgnoreCase(str5)) {
                                        new dk0(launchActivity, LaunchActivity.U()).show();
                                        return true;
                                    }
                                    if (!"channel".equalsIgnoreCase(str5)) {
                                        u(new ContactsActivity(a1.g.i("destroyAfterSelect", true)), false);
                                        return true;
                                    }
                                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                                    if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                                        u(new md(org.telegram.ui.Cells.c1.f(0, "step")), false);
                                        return true;
                                    }
                                    u(new h(0), false);
                                    globalMainSettings.edit().putBoolean("channel_intro", true).commit();
                                    return true;
                                }
                                if ("post".equalsIgnoreCase(str4)) {
                                    ?? r02 = MediaStreamTrack.VIDEO_TRACK_KIND.equalsIgnoreCase(str5);
                                    if ("live".equalsIgnoreCase(str5)) {
                                        r02 = -1;
                                    }
                                    ci.lc D = ci.lc.D(launchActivity, i10);
                                    if (D.O1 != r02) {
                                        D.O1 = r02;
                                        ?? r42 = D.Q0;
                                        if (r42 != 0) {
                                            r42.a(r02);
                                        }
                                        D.h0(r02 == 1, true);
                                        ci.y yVar = D.I0;
                                        if (yVar != null) {
                                            yVar.a(false, true);
                                        }
                                        D.l0(false);
                                    }
                                    D.Q(null);
                                    return true;
                                }
                                if ("contacts".equalsIgnoreCase(str4)) {
                                    if ("new".equalsIgnoreCase(str5)) {
                                        new dk0(launchActivity, LaunchActivity.U()).show();
                                        return true;
                                    }
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("needPhonebook", true);
                                    bundle.putBoolean("needFinishFragment", true);
                                    u(new ContactsActivity(bundle), false);
                                    "search".equalsIgnoreCase(str5);
                                    "sort".equalsIgnoreCase(str5);
                                    if ("invite".equalsIgnoreCase(str5)) {
                                        x("phonebookRow");
                                        return true;
                                    }
                                    return true;
                                }
                                if ("addstyle".equalsIgnoreCase(str4)) {
                                    return h(s11.getQueryParameter("slug"));
                                }
                            }
                        }
                    }
                } else if ("ton".equalsIgnoreCase(scheme)) {
                    if (MessagesController.getInstance(i10).config.walletAvailable.get() && (pathSegments = (s10 = s(uri2)).getPathSegments()) != null) {
                        ArrayList arrayList3 = new ArrayList(pathSegments);
                        String authority3 = s10.getAuthority();
                        if (!TextUtils.isEmpty(authority3)) {
                            arrayList3.add(0, authority3);
                        }
                        if (!arrayList3.isEmpty()) {
                            String str6 = (String) arrayList3.get(0);
                            String str7 = arrayList3.size() > 1 ? (String) arrayList3.get(1) : null;
                            if (!"transfer".equalsIgnoreCase(str6)) {
                                return false;
                            }
                            if (arrayList3.size() == 2 && WalletEngine2.isValidRecipientAddress(str7)) {
                                try {
                                    l4 = Long.valueOf(Long.parseLong(s10.getQueryParameter("amount")));
                                } catch (Throwable unused) {
                                    l4 = null;
                                }
                                String queryParameter3 = s10.getQueryParameter("text");
                                if (TextUtils.isEmpty(queryParameter3)) {
                                    queryParameter3 = s10.getQueryParameter("comment");
                                }
                                String r10 = r(queryParameter3);
                                boolean booleanQueryParameter = s10.getBooleanQueryParameter("encrypted", false);
                                try {
                                    org.telegram.ui.Wallet.j8 j8Var = new org.telegram.ui.Wallet.j8(str7);
                                    if (l4 != null && l4.longValue() > 0) {
                                        j8Var.r = l4.longValue();
                                    }
                                    if (!TextUtils.isEmpty(r10)) {
                                        j8Var.d0 = r10;
                                        j8Var.e0 = booleanQueryParameter;
                                    }
                                    j8Var.c0 = true;
                                    u(j8Var, false);
                                    return true;
                                } catch (Throwable th2) {
                                    FileLog.e(th2);
                                    return false;
                                }
                            }
                            return true;
                        }
                    }
                } else if ("tc".equalsIgnoreCase(scheme)) {
                    return n(uri);
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
        ConnectionsManager.getInstance(this.b).sendRequestTyped(gettone, new org.telegram.messenger.a(), new b5(this, 14));
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
        this.h = ConnectionsManager.getInstance(this.b).sendRequest(tL_payments_getPaymentForm, new ba((Object) this, (TLObject) tL_inputInvoiceSlug, str, 18));
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
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null || U.getContext() == null) {
            return;
        }
        o();
        TLRPC.User[] userArr = {null};
        MessagesController.getInstance(this.b).getUserNameResolver().resolve(str, new z(this, userArr, new org.telegram.ui.Components.oo0(this, U, userArr, tL_requestPeerTypeCreateBot, 16), 10));
    }

    public final boolean k(Uri uri, String str) {
        if (!this.d) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        o();
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
        tL_messages_requestUrlAuth.flags |= 4;
        tL_messages_requestUrlAuth.url = uri.toString();
        ConnectionsManager.getInstance(this.b).sendRequestTyped(tL_messages_requestUrlAuth, new org.telegram.messenger.a(), new ai.m0(15, this, tL_messages_requestUrlAuth));
        return true;
    }

    public final boolean l(Uri uri) {
        Uri uri2;
        long j3;
        int i10 = this.b;
        if (!MessagesController.getInstance(i10).config.walletAvailable.get()) {
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
        String r10 = r(queryParameter4);
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("encrypted", false);
        if (queryParameter3 != null) {
            if (!TextUtils.isEmpty(queryParameter2) && queryParameter3.matches("[0-9]+(?:\\.[0-9]+)?")) {
                try {
                    j3 = new BigDecimal(queryParameter3).movePointRight(9).longValueExact();
                } catch (ArithmeticException | NumberFormatException unused) {
                }
            }
            return true;
        }
        j3 = 0;
        long j10 = j3;
        if (TextUtils.isEmpty(queryParameter2)) {
            u(new org.telegram.ui.Wallet.a5(), false);
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
                this.h = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new org.telegram.messenger.y9(this, j10, r10, booleanQueryParameter));
                return true;
            }
        } else if (WalletEngine2.isValidRecipientAddress(queryParameter2)) {
            org.telegram.ui.Wallet.j8 j8Var = new org.telegram.ui.Wallet.j8(queryParameter2);
            j8Var.r = j10;
            j8Var.d0 = r10;
            j8Var.e0 = booleanQueryParameter;
            j8Var.c0 = true;
            u(j8Var, false);
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:605:0x0a8a  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0a97  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0aa4  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0abc  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0ac9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(List list) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.n2 U;
        fh0 fh0Var;
        ApplicationLoader applicationLoader;
        org.telegram.ui.ActionBar.n2 openSettings;
        if (list == null) {
            return false;
        }
        boolean z11 = true;
        if (list.isEmpty()) {
            t(new i91());
            return true;
        }
        String str = (String) list.get(0);
        String str2 = list.size() > 1 ? (String) list.get(1) : null;
        String str3 = list.size() > 2 ? (String) list.get(2) : null;
        String str4 = list.size() > 3 ? (String) list.get(3) : null;
        String str5 = list.size() > 4 ? (String) list.get(4) : null;
        if ("theme".equalsIgnoreCase(str) || "themes".equalsIgnoreCase(str)) {
            t(new ThemeActivity(0));
            return true;
        }
        if ("devices".equalsIgnoreCase(str)) {
            SessionsActivity sessionsActivity = new SessionsActivity(0);
            if ("link-desktop".equalsIgnoreCase(str2)) {
                sessionsActivity.l0();
            }
            t(sessionsActivity);
            if ("terminate-sessions".equalsIgnoreCase(str2)) {
                x("terminateAllSessionsRow");
            }
            if ("auto-terminate".equalsIgnoreCase(str2)) {
                x("ttlRow");
                return true;
            }
        } else if ("folders".equalsIgnoreCase(str)) {
            FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
            t(new FiltersSetupActivity());
            if ("create".equalsIgnoreCase(str2)) {
                AndroidUtilities.runOnUIThread(new m70(18, this, filtersSetupActivity), 300L);
            }
            if ("show-tags".equalsIgnoreCase(str2)) {
                x("showTagsRow");
                return true;
            }
        } else {
            if ("change_number".equalsIgnoreCase(str)) {
                u(new h(3), true);
                return true;
            }
            if (!"language".equalsIgnoreCase(str)) {
                if ("auto_delete".equalsIgnoreCase(str)) {
                    t(new p4());
                    return true;
                }
                if ("phone_privacy".equalsIgnoreCase(str)) {
                    t(new PrivacyControlActivity(6));
                    return true;
                }
                if ("premium_sms".equalsIgnoreCase(str) && (applicationLoader = ApplicationLoader.applicationLoaderInstance) != null && (openSettings = applicationLoader.openSettings(13)) != null) {
                    t(openSettings);
                    return true;
                }
                boolean equalsIgnoreCase = "login_email".equalsIgnoreCase(str);
                int i13 = this.b;
                if (equalsIgnoreCase) {
                    o();
                    this.h = ConnectionsManager.getInstance(i13).sendRequest(new TL_account.getPassword(), new m(this, 10), 10);
                    return true;
                }
                if ("chats".equalsIgnoreCase(str)) {
                    org.telegram.ui.ActionBar.d5 e7 = e();
                    int size = e7.getFragmentStack().size() - 1;
                    while (true) {
                        z10 = z11;
                        if (size < 0) {
                            fh0Var = null;
                            break;
                        }
                        if (e7.getFragmentStack().get(size) instanceof fh0) {
                            fh0Var = (fh0) e7.getFragmentStack().get(size);
                            break;
                        }
                        if (size > 0) {
                            ((ActionBarLayout) e7).Y(size);
                        }
                        size++;
                        z11 = z10;
                    }
                    if (fh0Var != null && "search".equalsIgnoreCase(str2)) {
                        fh0Var.c.D(2);
                        return z10;
                    }
                } else {
                    z10 = true;
                }
                if ("saved-messages".equalsIgnoreCase(str)) {
                    t(zn.W9(f().getClientUserId()));
                    return z10;
                }
                if ("calls".equalsIgnoreCase(str)) {
                    if ("start-call".equalsIgnoreCase(str2)) {
                        boolean z12 = z10;
                        t(new bc0(this, a1.g.i("isCall", z12)));
                        return z12;
                    }
                    boolean z13 = z10;
                    t(new j9());
                    return z13;
                }
                if ("qr-code".equalsIgnoreCase(str)) {
                    if ("scan".equalsIgnoreCase(str2) && (U = LaunchActivity.U()) != null) {
                        e31.e0(U);
                        return z10;
                    }
                    if ("share".equalsIgnoreCase(str2)) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", f().getClientUserId());
                        t(new cc0(bundle));
                        return true;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", f().getClientUserId());
                    t(new e31(bundle2));
                    return true;
                }
                if (!"chat".equalsIgnoreCase(str) || !"browser".equalsIgnoreCase(str2)) {
                    String str6 = str5;
                    if (!"edit".equalsIgnoreCase(str)) {
                        if ("my-profile".equalsIgnoreCase(str)) {
                            if ("edit".equalsIgnoreCase(str2)) {
                                t(new UserInfoActivity());
                                return true;
                            }
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("user_id", f().getClientUserId());
                            bundle3.putBoolean("my_profile", true);
                            if ("gifts".equalsIgnoreCase(str2)) {
                                bundle3.putBoolean("open_gifts", true);
                            }
                            ProfileActivity profileActivity = new ProfileActivity(bundle3);
                            if ("gifts".equalsIgnoreCase(str2)) {
                                profileActivity.whenFullyVisible(new xb0(profileActivity, 2));
                            }
                            if ("posts".equalsIgnoreCase(str2)) {
                                profileActivity.whenFullyVisible(new xb0(profileActivity, 3));
                            }
                            t(profileActivity);
                            return true;
                        }
                        String str7 = str3;
                        if ("notifications".equalsIgnoreCase(str)) {
                            if (!TextUtils.isEmpty(str7) && ("private-chats".equalsIgnoreCase(str2) || "groups".equalsIgnoreCase(str2) || "channels".equalsIgnoreCase(str2) || "stories".equalsIgnoreCase(str2) || "reactions".equalsIgnoreCase(str2))) {
                                if ("private-chats".equalsIgnoreCase(str2)) {
                                    i12 = 1;
                                } else {
                                    if (!"groups".equalsIgnoreCase(str2)) {
                                        if ("channels".equalsIgnoreCase(str2)) {
                                            i12 = 2;
                                        } else if ("stories".equalsIgnoreCase(str2)) {
                                            i12 = 3;
                                        } else if ("reactions".equalsIgnoreCase(str2)) {
                                            i12 = 4;
                                        }
                                    }
                                    i12 = 0;
                                }
                                NotificationsSettingsActivity notificationsSettingsActivity = new NotificationsSettingsActivity();
                                o();
                                notificationsSettingsActivity.A0(new org.telegram.ui.Components.x21(this, notificationsSettingsActivity, i12, str7, 4));
                                return true;
                            }
                            t(new NotificationsSettingsActivity());
                            if ("accounts".equalsIgnoreCase(str2)) {
                                x("accountsAllRow");
                            }
                            if ("private-chats".equalsIgnoreCase(str2)) {
                                x("privateRow");
                            }
                            if ("groups".equalsIgnoreCase(str2)) {
                                x("groupRow");
                            }
                            if ("channels".equalsIgnoreCase(str2)) {
                                x("channelsRow");
                            }
                            if ("stories".equalsIgnoreCase(str2)) {
                                x("storiesRow");
                            }
                            if ("reactions".equalsIgnoreCase(str2)) {
                                x("reactionsRow");
                            }
                            if ("in-app-sounds".equalsIgnoreCase(str2)) {
                                x("inappSoundRow");
                            }
                            if ("in-app-vibrate".equalsIgnoreCase(str2)) {
                                x("inappVibrateRow");
                            }
                            if ("in-app-preview".equalsIgnoreCase(str2)) {
                                x("inappPreviewRow");
                            }
                            if ("in-chat-sounds".equalsIgnoreCase(str2)) {
                                x("inchatSoundRow");
                            }
                            if ("in-app-popup".equalsIgnoreCase(str2)) {
                                x("inappPriorityRow");
                            }
                            if ("show-badge-icon".equalsIgnoreCase(str2)) {
                                x("badgeNumberShowRow");
                            }
                            if ("include-muted-chats".equalsIgnoreCase(str2)) {
                                x("badgeNumberMutedRow");
                            }
                            if ("count-unread-messages".equalsIgnoreCase(str2)) {
                                x("badgeNumberMessagesRow");
                            }
                            if ("new-contacts".equalsIgnoreCase(str2)) {
                                x("contactJoinedRow");
                            }
                            if ("pinned-messages".equalsIgnoreCase(str2)) {
                                x("pinnedMessageRow");
                            }
                            if ("reset".equalsIgnoreCase(str2)) {
                                x("resetNotificationsRow");
                                return true;
                            }
                        } else if ("privacy".equalsIgnoreCase(str)) {
                            if ("data-settings".equalsIgnoreCase(str2) && "delete-cloud-drafts".equalsIgnoreCase(str7)) {
                                t(new DataSettingsActivity());
                                x("clearDraftsRow");
                                return true;
                            }
                            if (!TextUtils.isEmpty(str7) && "blocked".equalsIgnoreCase(str2)) {
                                t(new gy0());
                                return true;
                            }
                            if (!TextUtils.isEmpty(str7) && "active-websites".equalsIgnoreCase(str2)) {
                                t(new SessionsActivity(1));
                                if (!"disconnect-all".equalsIgnoreCase(str7)) {
                                    return true;
                                }
                                x("terminateAllSessionsRow");
                                return true;
                            }
                            if (!TextUtils.isEmpty(str7) && "passcode".equalsIgnoreCase(str2)) {
                                zb0 zb0Var = new zb0(this, str7, 3);
                                org.telegram.ui.ActionBar.n2 e02 = PasscodeActivity.e0();
                                t(e02);
                                if (e02 instanceof h) {
                                    ((h) e02).Z(zb0Var);
                                    return true;
                                }
                                if (e02 instanceof PasscodeActivity) {
                                    ((PasscodeActivity) e02).m0(zb0Var);
                                    return true;
                                }
                            } else {
                                if (!TextUtils.isEmpty(str7) && "2sv".equalsIgnoreCase(str2)) {
                                    o();
                                    this.h = ConnectionsManager.getInstance(i13).sendRequest(new TL_account.getPassword(), new oo(28, this, str7), 10);
                                    return true;
                                }
                                if (!TextUtils.isEmpty(str7) && "passkey".equalsIgnoreCase(str2) && Build.VERSION.SDK_INT >= 28) {
                                    o();
                                    this.h = ConnectionsManager.getInstance(i13).sendRequestTyped(new TL_account.getPasskeys(), new a3.b(1), new wb0(this, str7, 0));
                                    return true;
                                }
                                if (!TextUtils.isEmpty(str7) && "auto-delete".equalsIgnoreCase(str2) && f().getGlobalTTl() >= 0) {
                                    t(new p4());
                                    return true;
                                }
                                if (!TextUtils.isEmpty(str7) && ("phone-number".equalsIgnoreCase(str2) || "last-seen".equalsIgnoreCase(str2) || "profile-photos".equalsIgnoreCase(str2) || "bio".equalsIgnoreCase(str2) || "gifts".equalsIgnoreCase(str2) || "birthday".equalsIgnoreCase(str2) || "saved-music".equalsIgnoreCase(str2) || "forwards".equalsIgnoreCase(str2) || "calls".equalsIgnoreCase(str2) || "voice".equalsIgnoreCase(str2) || "messages".equalsIgnoreCase(str2) || "invites".equalsIgnoreCase(str2))) {
                                    if ("phone-number".equalsIgnoreCase(str2)) {
                                        i11 = 6;
                                    } else {
                                        if (!"last-seen".equalsIgnoreCase(str2)) {
                                            if ("profile-photos".equalsIgnoreCase(str2)) {
                                                i11 = 4;
                                            } else if ("bio".equalsIgnoreCase(str2)) {
                                                i11 = 9;
                                            } else if ("gifts".equalsIgnoreCase(str2)) {
                                                i11 = 12;
                                            } else if ("birthday".equalsIgnoreCase(str2)) {
                                                i11 = 11;
                                            } else if ("saved-music".equalsIgnoreCase(str2)) {
                                                i11 = 14;
                                            } else if ("forwards".equalsIgnoreCase(str2)) {
                                                i11 = 5;
                                            } else if ("calls".equalsIgnoreCase(str2)) {
                                                i11 = "p2p".equalsIgnoreCase(str7) ? 3 : 2;
                                            } else if ("voice".equalsIgnoreCase(str2)) {
                                                i11 = 8;
                                            } else if ("messages".equalsIgnoreCase(str2)) {
                                                i11 = 10;
                                            } else if ("invites".equalsIgnoreCase(str2)) {
                                                i11 = 1;
                                            }
                                        }
                                        i11 = 0;
                                    }
                                    t(new PrivacyControlActivity(i11));
                                    if ("birthday".equalsIgnoreCase(str2) && "add".equalsIgnoreCase(str7)) {
                                        x("setBirthdayRow");
                                    }
                                    if ("always-share".equalsIgnoreCase(str7) || "always-share".equalsIgnoreCase(str4) || "always".equalsIgnoreCase(str7) || "always".equalsIgnoreCase(str4)) {
                                        x("everybodyRow");
                                    }
                                    if ("never-share".equalsIgnoreCase(str7) || "never-share".equalsIgnoreCase(str4) || "never".equalsIgnoreCase(str7) || "never".equalsIgnoreCase(str4)) {
                                        x("nobodyRow");
                                    }
                                    if ("gifts".equalsIgnoreCase(str2) && "show-icon".equalsIgnoreCase(str7)) {
                                        x("showGiftIconRow");
                                    }
                                    if ("gifts".equalsIgnoreCase(str2) && "accepted-types".equalsIgnoreCase(str7)) {
                                        x("giftTypesHeaderRow");
                                    }
                                    if ("messages".equalsIgnoreCase(str2) && "set-price".equalsIgnoreCase(str7)) {
                                        x("priceRow");
                                    }
                                    if ("messages".equalsIgnoreCase(str2) && "remove-fee".equalsIgnoreCase(str7)) {
                                        x("alwaysShareRow");
                                    }
                                    if ("last-seen".equalsIgnoreCase(str2) && "hide-read-time".equalsIgnoreCase(str7)) {
                                        x("readRow");
                                    }
                                    if ("profile-photos".equalsIgnoreCase(str2)) {
                                        if ("set-public".equalsIgnoreCase(str7)) {
                                            x("photoForRestRow");
                                        }
                                        if ("update-public".equalsIgnoreCase(str7)) {
                                            x("photoForRestRow");
                                        }
                                        if ("remove-public".equalsIgnoreCase(str7)) {
                                            x("currentPhotoForRestRow");
                                            return true;
                                        }
                                    }
                                } else if (MessagesController.getInstance(i13).autoarchiveAvailable || !"archive-and-mute".equalsIgnoreCase(str2)) {
                                    t(new PrivacySettingsActivity());
                                    if ("blocked".equalsIgnoreCase(str2)) {
                                        x("blockedRow");
                                    }
                                    if ("active-websites".equalsIgnoreCase(str2)) {
                                        x("webSessionsRow");
                                    }
                                    if ("passcode".equalsIgnoreCase(str2)) {
                                        x("passcodeRow");
                                    }
                                    if ("2sv".equalsIgnoreCase(str2)) {
                                        x("passwordRow");
                                    }
                                    if ("passkey".equalsIgnoreCase(str2)) {
                                        x("passkeysRow");
                                    }
                                    if ("auto-delete".equalsIgnoreCase(str2)) {
                                        x("autoDeleteMesages");
                                    }
                                    if ("login-email".equalsIgnoreCase(str2)) {
                                        x("emailLoginRow");
                                    }
                                    if ("phone-number".equalsIgnoreCase(str2)) {
                                        x("phoneNumberRow");
                                    }
                                    if ("last-seen".equalsIgnoreCase(str2)) {
                                        x("lastSeenRow");
                                    }
                                    if ("profile-photos".equalsIgnoreCase(str2)) {
                                        x("profilePhotoRow");
                                    }
                                    if ("bio".equalsIgnoreCase(str2)) {
                                        x("bioRow");
                                    }
                                    if ("gifts".equalsIgnoreCase(str2)) {
                                        x("giftsRow");
                                    }
                                    if ("birthday".equalsIgnoreCase(str2)) {
                                        x("birthdayRow");
                                    }
                                    if ("saved-music".equalsIgnoreCase(str2)) {
                                        x("musicRow");
                                    }
                                    if ("forwards".equalsIgnoreCase(str2)) {
                                        x("forwardsRow");
                                    }
                                    if ("calls".equalsIgnoreCase(str2)) {
                                        x("callsRow");
                                    }
                                    if ("voice".equalsIgnoreCase(str2)) {
                                        x("voicesRow");
                                    }
                                    if ("messages".equalsIgnoreCase(str2)) {
                                        x("noncontactsRow");
                                    }
                                    if ("invites".equalsIgnoreCase(str2)) {
                                        x("groupsRow");
                                    }
                                    if ("self-destruct".equalsIgnoreCase(str2)) {
                                        x("deleteAccountRow");
                                    }
                                    if ("archive-and-mute".equalsIgnoreCase(str2)) {
                                        x("newChatsRow");
                                    }
                                    if ("data-settings".equalsIgnoreCase(str2)) {
                                        if ("sync-contacts".equalsIgnoreCase(str7)) {
                                            x("contactsSyncRow");
                                        }
                                        if ("delete-synced".equalsIgnoreCase(str7)) {
                                            x("contactsDeleteRow");
                                        }
                                        if ("suggest-contacts".equalsIgnoreCase(str7)) {
                                            x("contactsSuggestRow");
                                        }
                                        if ("clear-payment-info".equalsIgnoreCase(str7)) {
                                            x("paymentsClearRow");
                                        }
                                        if ("link-previews".equalsIgnoreCase(str7)) {
                                            x("secretWebpageRow");
                                        }
                                        if ("map-provider".equalsIgnoreCase(str7)) {
                                            x("secretMapRow");
                                            return true;
                                        }
                                    }
                                }
                            }
                        } else if ("data".equalsIgnoreCase(str)) {
                            if ("storage".equalsIgnoreCase(str2)) {
                                "clear-cache".equalsIgnoreCase(str7);
                                t(new y6());
                                return true;
                            }
                            if ("usage".equalsIgnoreCase(str2)) {
                                yu yuVar = new yu();
                                t(yuVar);
                                if ("mobile".equalsIgnoreCase(str7)) {
                                    yuVar.b.d(1, 1);
                                }
                                if ("wifi".equalsIgnoreCase(str7)) {
                                    yuVar.b.d(2, 2);
                                }
                                if ("roaming".equalsIgnoreCase(str7)) {
                                    yuVar.b.d(3, 3);
                                }
                                if ("reset".equalsIgnoreCase(str7)) {
                                    yuVar.r0();
                                    return true;
                                }
                            } else {
                                if ("auto-download".equalsIgnoreCase(str2)) {
                                    if ("mobile".equalsIgnoreCase(str7) || "wifi".equalsIgnoreCase(str7) || "roaming".equalsIgnoreCase(str7)) {
                                        if (!"mobile".equalsIgnoreCase(str7)) {
                                            if ("wifi".equalsIgnoreCase(str7)) {
                                                i10 = 1;
                                            } else if ("roaming".equalsIgnoreCase(str7)) {
                                                i10 = 2;
                                            }
                                            t(new DataAutoDownloadActivity(i10));
                                            if ("enable".equalsIgnoreCase(str4)) {
                                                x("autoDownloadRow");
                                            }
                                            if ("usage".equalsIgnoreCase(str4)) {
                                                x("usageProgressRow");
                                            }
                                            if ("photos".equalsIgnoreCase(str4)) {
                                                x("photosRow");
                                            }
                                            if ("stories".equalsIgnoreCase(str4)) {
                                                x("storiesRow");
                                            }
                                            if ("videos".equalsIgnoreCase(str4)) {
                                                x("videosRow");
                                            }
                                            if ("files".equalsIgnoreCase(str4)) {
                                                x("filesRow");
                                                return true;
                                            }
                                        }
                                        i10 = 0;
                                        t(new DataAutoDownloadActivity(i10));
                                        if ("enable".equalsIgnoreCase(str4)) {
                                        }
                                        if ("usage".equalsIgnoreCase(str4)) {
                                        }
                                        if ("photos".equalsIgnoreCase(str4)) {
                                        }
                                        if ("stories".equalsIgnoreCase(str4)) {
                                        }
                                        if ("videos".equalsIgnoreCase(str4)) {
                                        }
                                        if ("files".equalsIgnoreCase(str4)) {
                                        }
                                    } else if ("reset".equalsIgnoreCase(str7)) {
                                        t(new DataSettingsActivity());
                                        x("resetDownloadRow");
                                        return true;
                                    }
                                }
                                if (!TextUtils.isEmpty(str4) && "save-to-photos".equalsIgnoreCase(str2)) {
                                    t(new SaveToGallerySettingsActivity(org.telegram.ui.Cells.c1.f("groups".equalsIgnoreCase(str7) ? 2 : "channels".equalsIgnoreCase(str7) ? 4 : 1, TeXSymbolParser.TYPE_ATTR)));
                                    if ("max-video-size".equalsIgnoreCase(str4)) {
                                        x("maxVideoSizeRow");
                                    }
                                    if ("add-exception".equalsIgnoreCase(str4)) {
                                        x("addExceptionRow");
                                    }
                                    if ("delete-all".equalsIgnoreCase(str4)) {
                                        x("deleteAllExceptionsRow");
                                        return true;
                                    }
                                } else if (!TextUtils.isEmpty(str7) && "proxy".equalsIgnoreCase(str2)) {
                                    t(new ProxyListActivity());
                                    if ("use-proxy".equalsIgnoreCase(str7)) {
                                        x("useProxyRow");
                                    }
                                    if ("add-proxy".equalsIgnoreCase(str7)) {
                                        x("proxyAddRow");
                                        return true;
                                    }
                                } else {
                                    if ("pause-music".equalsIgnoreCase(str2)) {
                                        t(new ThemeActivity(0));
                                        x("pauseOnMediaRow");
                                        return true;
                                    }
                                    if ("pause-music-on-record".equalsIgnoreCase(str2)) {
                                        t(new ThemeActivity(0));
                                        x("pauseOnRecordRow");
                                        return true;
                                    }
                                    if ("raise-to-listen".equalsIgnoreCase(str2)) {
                                        t(new ThemeActivity(0));
                                        x("raiseToListenRow");
                                        return true;
                                    }
                                    if ("raise-to-speak".equalsIgnoreCase(str2)) {
                                        t(new ThemeActivity(0));
                                        x("raiseToSpeakRow");
                                        return true;
                                    }
                                    if ("show-18-contnet".equalsIgnoreCase(str2)) {
                                        t(new ThemeActivity(0));
                                        x("sensitiveContentRow");
                                        return true;
                                    }
                                    t(new DataSettingsActivity());
                                    if ("save-to-photos".equalsIgnoreCase(str2)) {
                                        if ("chats".equalsIgnoreCase(str7)) {
                                            x("saveToGalleryPeerRow");
                                        }
                                        if ("groups".equalsIgnoreCase(str7)) {
                                            x("saveToGalleryGroupsRow");
                                        }
                                        if ("channels".equalsIgnoreCase(str7)) {
                                            x("saveToGalleryChannelsRow");
                                        }
                                    }
                                    if ("use-less-data".equalsIgnoreCase(str2)) {
                                        x("useLessDataForCallsRow");
                                    }
                                    if ("proxy".equalsIgnoreCase(str2)) {
                                        x("proxyRow");
                                        return true;
                                    }
                                }
                            }
                        } else if ("appearance".equalsIgnoreCase(str)) {
                            if ("themes".equalsIgnoreCase(str2) || "theme".equalsIgnoreCase(str2)) {
                                t(new ThemeActivity(3));
                                if ("create".equalsIgnoreCase(str7)) {
                                    x("createNewThemeRow");
                                    return true;
                                }
                            } else if (!TextUtils.isEmpty(str7) && ("wallpaper".equalsIgnoreCase(str2) || "wallpapers".equalsIgnoreCase(str2))) {
                                t(new WallpapersListActivity(0));
                                if ("set".equalsIgnoreCase(str7) || "choose-photo".equalsIgnoreCase(str7)) {
                                    x("uploadImageRow");
                                    return true;
                                }
                            } else {
                                if (!TextUtils.isEmpty(str7) && ("your-color".equalsIgnoreCase(str2) || "color".equalsIgnoreCase(str2))) {
                                    t(new aq0());
                                    return true;
                                }
                                if (TextUtils.isEmpty(str7) || !"stickers-and-emoji".equalsIgnoreCase(str2)) {
                                    t(new ThemeActivity(0));
                                    if ("wallpaper".equalsIgnoreCase(str2) || "wallpapers".equalsIgnoreCase(str2)) {
                                        x("backgroundRow");
                                    }
                                    if ("your-color".equalsIgnoreCase(str2) || "color".equalsIgnoreCase(str2)) {
                                        x("changeUserColor");
                                    }
                                    if ("auto-night-mode".equalsIgnoreCase(str2)) {
                                        x("nightThemeRow");
                                    }
                                    if ("text-size".equalsIgnoreCase(str2)) {
                                        x("textSizeRow");
                                    }
                                    if ("message-corners".equalsIgnoreCase(str2)) {
                                        x("bubbleRadiusRow");
                                    }
                                    if ("animations".equalsIgnoreCase(str2)) {
                                        x("liteModeRow");
                                    }
                                    if ("stickers-and-emoji".equalsIgnoreCase(str2)) {
                                        x("stickersRow");
                                    }
                                    if ("app-icon".equalsIgnoreCase(str2)) {
                                        x("appIconSelectorRow");
                                    }
                                    if (!"tap-for-next-media".equalsIgnoreCase(str2)) {
                                        return true;
                                    }
                                    x("nextMediaTapRow");
                                    return true;
                                }
                                if (!TextUtils.isEmpty(str4) && "archived".equalsIgnoreCase(str7)) {
                                    t(new q(0));
                                    return true;
                                }
                                if (!"emoji".equalsIgnoreCase(str7) || TextUtils.isEmpty(str4) || "large".equalsIgnoreCase(str4) || "dynamic-order".equalsIgnoreCase(str4)) {
                                    t(new StickersActivity(0, null));
                                    if ("trending".equalsIgnoreCase(str7)) {
                                        x("featuredRow");
                                    }
                                    if ("archived".equalsIgnoreCase(str7)) {
                                        x("archivedRow");
                                    }
                                    if ("emoji".equalsIgnoreCase(str7) && "large".equalsIgnoreCase(str4)) {
                                        x("largeEmojiRow");
                                        return true;
                                    }
                                    if ("emoji".equalsIgnoreCase(str7) && "dynamic-order".equalsIgnoreCase(str4)) {
                                        x("dynamicPackOrder");
                                        return true;
                                    }
                                    if ("emoji".equalsIgnoreCase(str7)) {
                                        x("emojiPacksRow");
                                        return true;
                                    }
                                } else {
                                    if (!TextUtils.isEmpty(str6) && "archived".equalsIgnoreCase(str4)) {
                                        t(new q(5));
                                        return true;
                                    }
                                    t(new StickersActivity(5, null));
                                    if ("suggest".equalsIgnoreCase(str4)) {
                                        x("suggestRow");
                                        return true;
                                    }
                                }
                            }
                        } else {
                            if (!"power-saving".equalsIgnoreCase(str)) {
                                boolean equalsIgnoreCase2 = "stars".equalsIgnoreCase(str);
                                LaunchActivity launchActivity = this.a;
                                if (equalsIgnoreCase2) {
                                    if ("top-up".equalsIgnoreCase(str2)) {
                                        new yh.f7(launchActivity, null).show();
                                        return true;
                                    }
                                    if ("stats".equalsIgnoreCase(str2)) {
                                        t(new yh.g(0, f().getClientUserId()));
                                        return true;
                                    }
                                    if ("gift".equalsIgnoreCase(str2)) {
                                        yh.m5.w(i13).u();
                                        tg.m1.f0(1, BirthdayController.getInstance(i13).getState());
                                        return true;
                                    }
                                    if ("earn".equalsIgnoreCase(str2)) {
                                        t(new ei.e4(f().getClientUserId()));
                                        return true;
                                    }
                                    t(new yh.p7());
                                    return true;
                                }
                                if ("premium".equalsIgnoreCase(str)) {
                                    t(new PremiumPreviewFragment());
                                    return true;
                                }
                                if ("business".equalsIgnoreCase(str)) {
                                    t(new PremiumPreviewFragment(1, "link"));
                                    if (!"do-not-hide-ads".equalsIgnoreCase(str2)) {
                                        return true;
                                    }
                                    x("showAdsRow");
                                    return true;
                                }
                                if ("ton".equalsIgnoreCase(str)) {
                                    t(new di.i());
                                    return true;
                                }
                                if ("send-gift".equalsIgnoreCase(str)) {
                                    if ("self".equalsIgnoreCase(str2)) {
                                        new xh.r1(this.a, this.b, f().getClientUserId(), null, null).show();
                                        return true;
                                    }
                                    tg.m1.f0(0, BirthdayController.getInstance(i13).getState());
                                    return true;
                                }
                                if ("ask-question".equalsIgnoreCase(str) || "ask-a-question".equalsIgnoreCase(str)) {
                                    org.telegram.ui.Components.g5.T(LaunchActivity.U(), null).show();
                                    return true;
                                }
                                if ("faq".equalsIgnoreCase(str)) {
                                    of.f.s(launchActivity, LocaleController.getString(R.string.TelegramFaqUrl));
                                    return true;
                                }
                                if ("features".equalsIgnoreCase(str)) {
                                    of.f.s(launchActivity, LocaleController.getString(R.string.TelegramFeaturesUrl));
                                    return true;
                                }
                                if ("privacy-policy".equalsIgnoreCase(str)) {
                                    of.f.s(launchActivity, LocaleController.getString(R.string.PrivacyPolicyUrl));
                                    return true;
                                }
                                t(new i91());
                                return true;
                            }
                            mc0 mc0Var = new mc0();
                            t(mc0Var);
                            if ("videos".equalsIgnoreCase(str2)) {
                                mc0Var.V(1024);
                            }
                            if ("gifs".equalsIgnoreCase(str2)) {
                                mc0Var.V(2048);
                            }
                            if ("stickers".equalsIgnoreCase(str2)) {
                                mc0Var.V(3);
                            }
                            if ("emoji".equalsIgnoreCase(str2)) {
                                mc0Var.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            }
                            if ("effects".equalsIgnoreCase(str2)) {
                                mc0Var.V(LiteMode.FLAGS_CHAT);
                            }
                            if ("call-animations".equalsIgnoreCase(str2)) {
                                mc0Var.V(512);
                            }
                            if ("particles".equalsIgnoreCase(str2)) {
                                mc0Var.V(131072);
                            }
                            if ("transitions".equalsIgnoreCase(str2)) {
                                int i14 = 0;
                                while (true) {
                                    ArrayList arrayList = mc0Var.s;
                                    if (i14 >= arrayList.size()) {
                                        break;
                                    }
                                    if (((gc0) arrayList.get(i14)).f == 1) {
                                        mc0Var.b.e1(new i2.s(mc0Var, i14, 13), 700, true);
                                        return true;
                                    }
                                    i14++;
                                }
                            }
                        }
                        return true;
                    }
                    t(new UserInfoActivity());
                    if ("first-name".equalsIgnoreCase(str2)) {
                        x("firstNameRow");
                    }
                    if ("last-name".equalsIgnoreCase(str2)) {
                        x("lastNameRow");
                    }
                    if ("bio".equalsIgnoreCase(str2)) {
                        x("bioRow");
                    }
                    if ("birthday".equalsIgnoreCase(str2)) {
                        x("birthdayRow");
                    }
                    if ("change-number".equalsIgnoreCase(str2)) {
                        x("numberRow");
                    }
                    if ("username".equalsIgnoreCase(str2)) {
                        x("usernameRow");
                    }
                    if ("channel".equalsIgnoreCase(str2)) {
                        x("channelRow");
                    }
                    if ("add-account".equalsIgnoreCase(str2)) {
                        x("addAccountRow");
                    }
                    if ("log-out".equalsIgnoreCase(str2)) {
                        x("logoutRow");
                        return true;
                    }
                } else {
                    if (TextUtils.isEmpty(str3)) {
                        t(new ThemeActivity(0));
                        x("browserRow");
                        return true;
                    }
                    t(new org.telegram.ui.web.z1(null));
                    if ("enable-browser".equalsIgnoreCase(str3)) {
                        x("enableRow");
                    }
                    if ("clear-cookies".equalsIgnoreCase(str3)) {
                        x("clearCookiesRow");
                    }
                    if ("clear-cache".equalsIgnoreCase(str3)) {
                        x("clearCacheRow");
                    }
                    if ("history".equalsIgnoreCase(str3)) {
                        x("historyRow");
                    }
                    if ("clear-history".equalsIgnoreCase(str3)) {
                        x("clearHistoryRow");
                    }
                    if ("never-open".equalsIgnoreCase(str3)) {
                        x("neverOpenRow");
                    }
                    if ("clear-list".equalsIgnoreCase(str3)) {
                        x("clearListRow");
                    }
                    if ("search".equalsIgnoreCase(str3)) {
                        x("searchRow");
                        return true;
                    }
                }
                return true;
            }
            if ("do-not-translate".equalsIgnoreCase(str2)) {
                t(new f41());
                return true;
            }
            t(new LanguageSelectActivity());
            if ("show-button".equalsIgnoreCase(str2)) {
                x("manualTranslationPosition");
            }
            if ("translate-chats".equalsIgnoreCase(str2)) {
                x("autoTranslationPosition");
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[Catch: Exception -> 0x006b, TryCatch #0 {Exception -> 0x006b, blocks: (B:11:0x0033, B:14:0x0042, B:16:0x0062, B:21:0x0073, B:23:0x0079, B:26:0x0080, B:29:0x0089), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089 A[Catch: Exception -> 0x006b, TRY_LEAVE, TryCatch #0 {Exception -> 0x006b, blocks: (B:11:0x0033, B:14:0x0042, B:16:0x0062, B:21:0x0073, B:23:0x0079, B:26:0x0080, B:29:0x0089), top: B:10:0x0033 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(Uri uri) {
        Uri s10 = s(uri);
        List<String> pathSegments = s10.getPathSegments();
        if (pathSegments != null) {
            ArrayList arrayList = new ArrayList(pathSegments);
            String authority = s10.getAuthority();
            if (!TextUtils.isEmpty(authority)) {
                arrayList.add(0, authority);
            }
            if (arrayList.isEmpty() || "connect".equalsIgnoreCase((String) arrayList.get(0))) {
                try {
                    if ("2".equals(s10.getQueryParameter("v"))) {
                        String queryParameter = s10.getQueryParameter("id");
                        String queryParameter2 = s10.getQueryParameter("r");
                        String queryParameter3 = s10.getQueryParameter("trace_id");
                        String queryParameter4 = s10.getQueryParameter("e");
                        String queryParameter5 = s10.getQueryParameter("ret");
                        if (queryParameter5 != null) {
                            if (!p(queryParameter5)) {
                            }
                            String str = queryParameter5;
                            if (queryParameter2 == null) {
                                String string = new JSONObject(queryParameter2).getString("manifestUrl");
                                o();
                                org.telegram.ui.Wallet.k0 v = org.telegram.ui.Wallet.k0.v(this.b);
                                v.h0(new ii.k(this, v, queryParameter, string, queryParameter2, queryParameter3, queryParameter4, str, 2));
                                return false;
                            }
                            if (!TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter3)) {
                                o();
                                v(queryParameter, 0, queryParameter3, str);
                                return true;
                            }
                        }
                        queryParameter5 = "back";
                        String str2 = queryParameter5;
                        if (queryParameter2 == null) {
                        }
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
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
        of.e eVar = this.c;
        if (eVar == null) {
            if (this.e == null) {
                this.e = new org.telegram.ui.ActionBar.b2(this.a, 3, null);
            }
            this.e.setOnCancelListener(new pg(this, 3));
            this.e.q(300L);
        } else {
            eVar.b = new yb0(this, 0);
            eVar.d();
        }
        this.f = true;
    }

    public final void t(org.telegram.ui.ActionBar.n2 n2Var) {
        u(n2Var, false);
    }

    public final void u(org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        LaunchActivity launchActivity = this.a;
        launchActivity.q0(n2Var, z10, false);
        if (AndroidUtilities.isTablet()) {
            launchActivity.q0.U(true, true);
            launchActivity.s0.U(true, true);
        }
    }

    public final void v(String str, int i10, String str2, String str3) {
        if (!this.j) {
            LaunchActivity launchActivity = this.a;
            if (!launchActivity.isFinishing() && !launchActivity.isDestroyed()) {
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                tonconnectgetpending.dapp_client_id = str;
                this.h = ConnectionsManager.getInstance(this.b).sendRequestTyped(tonconnectgetpending, new org.telegram.messenger.a(), new org.telegram.messenger.jh(this, str, str2, str3, i10, 1));
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
            of.f.u(launchActivity, str);
        } else if (this.d) {
            launchActivity.moveTaskToBack(true);
        }
    }

    public final void x(String str) {
        AndroidUtilities.scrollToFragmentRow(this.a.O(), str);
    }
}
