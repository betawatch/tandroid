package lh;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.gy;
import org.telegram.ui.yf;
import org.telegram.ui.zh1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a8 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(Object obj, Object obj2) {
        qf.w0 w0Var = (qf.w0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        String string = LocaleController.getString(R.string.BusinessLocation);
        String string2 = LocaleController.getString(R.string.BusinessLocationInfo);
        int i10 = R.raw.biz_map;
        n41 n41Var = new n41(2);
        n41Var.l = string;
        n41Var.o = string2;
        n41Var.k = i10;
        arrayList.add(n41Var);
        arrayList.add(n41.k(w0Var.e));
        arrayList.add(n41.B(null));
        n41 i11 = n41.i(1, LocaleController.getString(R.string.BusinessLocationMap));
        boolean z10 = false;
        i11.K(w0Var.x != null);
        arrayList.add(i11);
        if (w0Var.x != null) {
            arrayList.add(n41.k(w0Var.h));
        }
        arrayList.add(n41.B(null));
        if (w0Var.w != null && (w0Var.x != null || !TextUtils.isEmpty(w0Var.y))) {
            z10 = true;
        }
        w0Var.C = z10;
        if (z10) {
            n41 e9 = n41.e(2, LocaleController.getString(R.string.BusinessLocationClear));
            e9.r = true;
            arrayList.add(e9);
            arrayList.add(n41.B(null));
        }
        w0Var.U(true);
    }

    private final void b(Object obj, Object obj2) {
        qf.a1 a1Var = (qf.a1) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = a1Var.b;
        String string = LocaleController.getString(R.string.BusinessHoursDayOpen);
        n41 n41Var = new n41(9);
        n41Var.d = -1;
        n41Var.l = string;
        n41Var.K(a1Var.r);
        arrayList.add(n41Var);
        arrayList.add(n41.B(null));
        if (a1Var.r) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                if (i10 > 0) {
                    arrayList.add(n41.B(null));
                }
                qf.x0 x0Var = (qf.x0) arrayList2.get(i10);
                if (!a1Var.U()) {
                    int i11 = i10 * 3;
                    arrayList.add(n41.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), qf.x0.a(x0Var.a), i11));
                    arrayList.add(n41.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), qf.x0.a(x0Var.b), i11 + 1));
                    n41 e9 = n41.e(i11 + 2, LocaleController.getString(R.string.Remove));
                    e9.r = true;
                    arrayList.add(e9);
                }
            }
            if (a1Var.V()) {
                arrayList.add(n41.B(null));
                n41 c10 = n41.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                c10.q = true;
                arrayList.add(c10);
            }
            org.telegram.ui.Cells.pa.A(R.string.BusinessHoursDayInfo, arrayList);
        }
    }

    private final void c(Object obj, Object obj2) {
        qf.s1.V((qf.s1) this.b, (ArrayList) obj, (b51) obj2);
    }

    private final void d(Object obj, Object obj2) {
        qh.a aVar = (qh.a) this.b;
        ArrayList arrayList = (ArrayList) obj;
        arrayList.add(n41.D(0, AndroidUtilities.dp(12.0f)));
        arrayList.add(n41.j(1, aVar.V));
        arrayList.add(n41.D(2, AndroidUtilities.dp(12.0f)));
        arrayList.add(n41.s(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
        aVar.Y = arrayList.size();
        String string = LocaleController.getString(R.string.CommunityChatVisibilityVisible);
        boolean z10 = aVar.X;
        n41 x8 = n41.x(151, string, LocaleController.getString(z10 ? R.string.CommunityChatVisibilityVisibleBotInfo : R.string.CommunityChatVisibilityVisibleInfo));
        x8.K(true ^ aVar.U);
        arrayList.add(x8);
        n41 x10 = n41.x(ImageReceiver.DEFAULT_CROSSFADE_DURATION, LocaleController.getString(R.string.CommunityChatVisibilityHidden), LocaleController.getString(z10 ? R.string.CommunityChatVisibilityHiddenBotInfo : R.string.CommunityChatVisibilityHiddenInfo));
        x10.K(aVar.U);
        arrayList.add(x10);
        arrayList.add(n41.A(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
    }

    private final void e(Object obj, Object obj2) {
        ((ArrayList) obj).add(n41.j(0, ((qh.b) this.b).T));
    }

    private final void f(Object obj, Object obj2) {
        Utilities.themeQueue.postRunnable(new zh1(26, (String[]) this.b, (Utilities.Callback2) obj2));
    }

    private final void g(Object obj, Object obj2) {
        rh.v vVar = (rh.v) this.b;
        ArrayList arrayList = (ArrayList) obj;
        arrayList.add(n41.j(1, vVar.W));
        arrayList.add(n41.j(3, vVar.Z));
        if (vVar.e0 != null) {
            arrayList.add(n41.j(2, vVar.X));
        }
    }

    private final void h(Object obj, Object obj2) {
        rh.p3.I1((rh.p3[]) this.b, (ArrayList) obj, (b51) obj2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014c  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        String upperCase;
        char c10;
        boolean z10;
        b51 b51Var;
        int i10;
        boolean z11;
        int i11;
        rh.b2 b2Var;
        int i12 = this.a;
        int i13 = 24;
        String str = "";
        int i14 = -1;
        final int i15 = 0;
        final int i16 = 1;
        Object obj3 = this.b;
        switch (i12) {
            case 0:
                j8 j8Var = (j8) obj3;
                ArrayList arrayList = (ArrayList) obj;
                if (j8Var.d0 || j8Var.c0 != null) {
                    TLRPC.WebPage webPage = j8Var.c0;
                    b8 b8Var = new b8(j8Var, 0);
                    int i17 = h8.a;
                    n41 J = n41.J(h8.class);
                    J.G = webPage;
                    J.D = b8Var;
                    arrayList.add(J);
                }
                arrayList.add(n41.k(j8Var.U));
                arrayList.add(n41.A(1, null));
                n41 i18 = n41.i(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                i18.K(j8Var.i0);
                arrayList.add(i18);
                if (j8Var.i0) {
                    arrayList.add(n41.k(j8Var.V));
                }
                arrayList.add(n41.A(3, null));
                arrayList.add(n41.k(j8Var.W));
                break;
            case 1:
                sb sbVar = (sb) obj3;
                Float f10 = (Float) obj2;
                long duration = sbVar.T0.getDuration() < 100 ? sbVar.G1.h0 : sbVar.T0.getDuration();
                float floatValue = ((f10.floatValue() / 0.96f) * 0.04f) + f10.floatValue();
                z7 z7Var = sbVar.G1;
                float f11 = z7Var.a0;
                float f12 = z7Var.Z;
                float f13 = (f11 - f12) * floatValue;
                float f14 = duration;
                long j10 = (long) (f13 * f14);
                hb hbVar = sbVar.T0;
                long j11 = (long) ((f12 * f14) + j10);
                sbVar.I1 = j11;
                hbVar.m(j11);
                va vaVar = sbVar.r1;
                if (vaVar != null) {
                    vaVar.setCoverTime(sbVar.I1);
                }
                z7 z7Var2 = sbVar.G1;
                if (z7Var2 != null && z7Var2.g) {
                    z7Var2.j = true;
                    break;
                }
                break;
            case 2:
                ((vb) obj3).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 3:
                ((mh.g) obj3).C0((ArrayList) obj, (b51) obj2);
                break;
            case 4:
                mh.f fVar = (mh.f) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(n41.k(fVar.U));
                arrayList2.add(n41.k(fVar.V));
                break;
            case 5:
                ((nh.k) obj3).E0((ArrayList) obj, (b51) obj2);
                break;
            case 6:
                nh.s.U((nh.s) obj3, (ArrayList) obj);
                break;
            case 7:
                org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) obj3;
                String str2 = (String) obj;
                Long l10 = (Long) obj2;
                StringBuilder sb2 = new StringBuilder();
                if (l10.longValue() > 0) {
                    sb2.append("~");
                    sb2.append(AndroidUtilities.formatFileSize(l10.longValue()));
                }
                if (str2 == null) {
                    upperCase = null;
                } else {
                    if (!str2.isEmpty()) {
                        switch (str2.hashCode()) {
                            case -2008589971:
                                if (str2.equals("application/epub+zip")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1719571662:
                                if (str2.equals("application/vnd.oasis.opendocument.text")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1664118616:
                                if (str2.equals("video/3gpp")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1578389996:
                                if (str2.equals("application/vnd.ms-fontobject")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1348237359:
                                if (str2.equals("application/x-cdf")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1348236892:
                                if (str2.equals("application/x-csh")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1079884372:
                                if (str2.equals("video/x-msvideo")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1073633483:
                                if (str2.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                                    c10 = 7;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1071817359:
                                if (str2.equals("application/vnd.ms-powerpoint")) {
                                    c10 = '\b';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1050893613:
                                if (str2.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                                    c10 = '\t';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1007601745:
                                if (str2.equals("audio/x-midi")) {
                                    c10 = '\n';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -958424608:
                                if (str2.equals("text/calendar")) {
                                    c10 = 11;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -816908365:
                                if (str2.equals("application/x-httpd-php")) {
                                    c10 = '\f';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -648684635:
                                if (str2.equals("audio/3gpp2")) {
                                    c10 = '\r';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -433129473:
                                if (str2.equals("application/vnd.apple.installer+xml")) {
                                    c10 = 14;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -366307023:
                                if (str2.equals("application/vnd.ms-excel")) {
                                    c10 = 15;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -48069494:
                                if (str2.equals("video/3gpp2")) {
                                    c10 = 16;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -43923783:
                                if (str2.equals("application/gzip")) {
                                    c10 = 17;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -43491031:
                                if (str2.equals("application/x-sh")) {
                                    c10 = 18;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 187091926:
                                if (str2.equals("audio/ogg")) {
                                    c10 = 19;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 817335912:
                                if (str2.equals("text/plain")) {
                                    c10 = 20;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 859118878:
                                if (str2.equals("application/x-abiword")) {
                                    c10 = 21;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 886992732:
                                if (str2.equals("application/ld+json")) {
                                    c10 = 22;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 904647503:
                                if (str2.equals("application/msword")) {
                                    c10 = 23;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1154306387:
                                if (str2.equals("application/x-bzip")) {
                                    c10 = 24;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1154455342:
                                if (str2.equals("application/x-gzip")) {
                                    c10 = 25;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1178484637:
                                if (str2.equals("application/octet-stream")) {
                                    c10 = 26;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1423759679:
                                if (str2.equals("application/x-bzip2")) {
                                    c10 = 27;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1436962847:
                                if (str2.equals("application/vnd.oasis.opendocument.presentation")) {
                                    c10 = 28;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1454024983:
                                if (str2.equals("application/x-7z-compressed")) {
                                    c10 = 29;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1455492626:
                                if (str2.equals("application/x-freearc")) {
                                    c10 = 30;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1503095341:
                                if (str2.equals("audio/3gpp")) {
                                    c10 = 31;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1504831518:
                                if (str2.equals("audio/mpeg")) {
                                    c10 = ' ';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1509238306:
                                if (str2.equals("application/vnd.rar")) {
                                    c10 = '!';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1578362927:
                                if (str2.equals("image/vnd.microsoft.icon")) {
                                    c10 = '\"';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1643664935:
                                if (str2.equals("application/vnd.oasis.opendocument.spreadsheet")) {
                                    c10 = '#';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1672200517:
                                if (str2.equals("application/vnd.amazon.ebook")) {
                                    c10 = '$';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1993842850:
                                if (str2.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                                    c10 = '%';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2049276534:
                                if (str2.equals("application/java-archive")) {
                                    c10 = '&';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2132236175:
                                if (str2.equals("text/javascript")) {
                                    c10 = '\'';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                                str = "epub";
                                break;
                            case 1:
                                str = "odt";
                                break;
                            case 2:
                            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                                str = "3gp";
                                break;
                            case 3:
                                str = "eot";
                                break;
                            case 4:
                                str = "cda";
                                break;
                            case 5:
                                str = "csh";
                                break;
                            case 6:
                                str = "avi";
                                break;
                            case 7:
                                str = "pptx";
                                break;
                            case '\b':
                                str = "ppt";
                                break;
                            case '\t':
                                str = "docx";
                                break;
                            case '\n':
                                str = "midi";
                                break;
                            case 11:
                                str = "ics";
                                break;
                            case '\f':
                                str = "php";
                                break;
                            case '\r':
                            case 16:
                                str = "3g2";
                                break;
                            case 14:
                                str = "mpkg";
                                break;
                            case 15:
                                str = "xls";
                                break;
                            case 17:
                            case 25:
                                str = "gz";
                                break;
                            case 18:
                                str = "sh";
                                break;
                            case 19:
                                str = "opus";
                                break;
                            case 20:
                                str = "txt";
                                break;
                            case 21:
                                str = "abw";
                                break;
                            case 22:
                                str = "jsonld";
                                break;
                            case 23:
                                str = "doc";
                                break;
                            case 24:
                                str = "bz";
                                break;
                            case 26:
                                str = "bin";
                                break;
                            case 27:
                                str = "bz2";
                                break;
                            case 28:
                                str = "odp";
                                break;
                            case 29:
                                str = "7z";
                                break;
                            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                                str = "arc";
                                break;
                            case ' ':
                                str = "mp3";
                                break;
                            case '!':
                                str = "rar";
                                break;
                            case '\"':
                                str = "ico";
                                break;
                            case '#':
                                str = "ods";
                                break;
                            case '$':
                                str = "azw";
                                break;
                            case '%':
                                str = "xlsx";
                                break;
                            case '&':
                                str = "jar";
                                break;
                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                str = "js";
                                break;
                            default:
                                if (str2.contains("/")) {
                                    str2 = str2.substring(str2.indexOf("/") + 1);
                                }
                                if (str2.contains("-")) {
                                    str2 = str2.substring(str2.indexOf("-") + 1);
                                }
                                if (str2.contains("+")) {
                                    str2 = str2.substring(0, str2.indexOf("+"));
                                }
                                str = str2.toLowerCase();
                                break;
                        }
                    }
                    upperCase = str.toUpperCase();
                }
                if (!TextUtils.isEmpty(upperCase)) {
                    if (sb2.length() > 0) {
                        sb2.append(" ");
                    }
                    sb2.append(upperCase.toUpperCase());
                }
                if (sb2.length() <= 0) {
                    sb2.append(LocaleController.getString(R.string.AttachDocument));
                }
                j6Var.setText(sb2);
                break;
            case 8:
                nh.k1 k1Var = (nh.k1) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(n41.j(-1, k1Var.W));
                arrayList3.add(n41.B(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, k1Var.U))));
                break;
            case 9:
                nh.b3 b3Var = (nh.b3) obj3;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    b3Var.getClass();
                    break;
                } else {
                    nh.q4 q4Var = b3Var.r0;
                    if (q4Var != null) {
                        q4Var.a(tL_webViewResultUrl);
                        b3Var.n();
                        break;
                    }
                }
                break;
            case 10:
                ((nh.s3) obj3).F0((ArrayList) obj, (b51) obj2);
                break;
            case 11:
                ((nh.p4) obj3).U((ArrayList) obj, (b51) obj2);
                break;
            case 12:
                ((oh.r) obj3).v.c((ArrayList) obj);
                break;
            case 13:
                final org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.web.j jVar = lVar.y;
                ArrayList arrayList5 = lVar.x;
                if (!lVar.b && arrayList5.isEmpty()) {
                    arrayList4.add(n41.k(lVar.d));
                }
                SharedPreferences sharedPreferences = lVar.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList6 = new ArrayList();
                String string = sharedPreferences.getString("queries_json", null);
                if (string != null) {
                    try {
                        ArrayList arrayList7 = new ArrayList();
                        JSONArray jSONArray = new JSONArray(string);
                        for (int i19 = 0; i19 < jSONArray.length(); i19++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i19);
                            org.telegram.ui.web.k kVar = new org.telegram.ui.web.k(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                            kVar.c = jSONObject.optDouble("rank", 0.0d);
                            arrayList7.add(kVar);
                        }
                        Collections.sort(arrayList7, new lp0(17));
                        int size = arrayList7.size();
                        int i20 = 0;
                        while (i20 < size) {
                            Object obj4 = arrayList7.get(i20);
                            i20++;
                            org.telegram.ui.web.k kVar2 = (org.telegram.ui.web.k) obj4;
                            if (arrayList6.size() < 20) {
                                arrayList6.add(kVar2.a);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                arrayList5.size();
                arrayList6.size();
                if (!arrayList5.isEmpty()) {
                    arrayList4.add(n41.k(lVar.v));
                }
                int i21 = 0;
                while (i21 < arrayList5.size()) {
                    final String str3 = (String) arrayList5.get(i21);
                    boolean z12 = i21 == 0;
                    boolean z13 = i21 == arrayList5.size() - 1;
                    final int i22 = 0;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i22) {
                                case 0:
                                    org.telegram.ui.s sVar = lVar.I;
                                    if (sVar != null) {
                                        sVar.run(str3);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.s sVar2 = lVar.I;
                                    if (sVar2 != null) {
                                        sVar2.run(str3);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    int i23 = org.telegram.ui.web.e.a;
                    n41 J2 = n41.J(org.telegram.ui.web.e.class);
                    J2.z = 1;
                    J2.l = str3;
                    J2.D = onClickListener;
                    J2.q = z12;
                    J2.r = z13;
                    J2.G = Boolean.TRUE;
                    J2.H = lVar;
                    arrayList4.add(J2);
                    i21++;
                }
                if (!arrayList6.isEmpty()) {
                    arrayList4.add(n41.r(LocaleController.getString(R.string.WebSectionRecent), LocaleController.getString(R.string.WebRecentClear), new c5(lVar, 14)));
                    int i24 = 0;
                    while (i24 < arrayList6.size()) {
                        final String str4 = (String) arrayList6.get(i24);
                        boolean z14 = i24 == 0;
                        boolean z15 = i24 == arrayList6.size() - 1;
                        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i16) {
                                    case 0:
                                        org.telegram.ui.s sVar = lVar.I;
                                        if (sVar != null) {
                                            sVar.run(str4);
                                            break;
                                        }
                                        break;
                                    default:
                                        org.telegram.ui.s sVar2 = lVar.I;
                                        if (sVar2 != null) {
                                            sVar2.run(str4);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        int i25 = org.telegram.ui.web.e.a;
                        n41 J3 = n41.J(org.telegram.ui.web.e.class);
                        J3.z = 0;
                        J3.l = str4;
                        J3.D = onClickListener2;
                        J3.q = z14;
                        J3.r = z15;
                        J3.G = Boolean.TRUE;
                        J3.H = lVar;
                        arrayList4.add(J3);
                        i24++;
                    }
                }
                if (jVar != null) {
                    ArrayList arrayList8 = jVar.a;
                    if (!arrayList8.isEmpty()) {
                        arrayList4.add(n41.q(LocaleController.getString(R.string.WebSectionBookmarks)));
                        for (int i26 = 0; i26 < arrayList8.size(); i26++) {
                            MessageObject messageObject = (MessageObject) arrayList8.get(i26);
                            if (!TextUtils.isEmpty(org.telegram.ui.web.l.a(messageObject))) {
                                int i27 = org.telegram.ui.web.h.a;
                                n41 J4 = n41.J(org.telegram.ui.web.h.class);
                                J4.z = 3;
                                J4.q = true;
                                J4.H = messageObject;
                                arrayList4.add(J4);
                            }
                        }
                        if (!jVar.f) {
                            arrayList4.add(n41.o(arrayList4.size(), 32));
                            arrayList4.add(n41.o(arrayList4.size(), 32));
                            arrayList4.add(n41.o(arrayList4.size(), 32));
                            break;
                        }
                    }
                }
                break;
            case 14:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                cn0 cn0Var = (cn0) ((pf.z) obj3);
                gy gyVar = cn0Var.E0;
                AndroidUtilities.hideKeyboard(gyVar.getParentActivity().getCurrentFocus());
                b70 I = b70.I(gyVar, (org.telegram.ui.Cells.e6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z10 = false;
                } else {
                    b70 J5 = I.J();
                    J5.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new mb0(I, i13), false);
                    J5.k();
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                        J5.p(13, -1, tL_sponsoredPeer.sponsor_info);
                    }
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                        if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                            J5.k();
                        }
                        J5.p(13, -1, tL_sponsoredPeer.additional_info);
                    }
                    z10 = false;
                    I.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new gh.f3(I, J5, 7), false);
                }
                I.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new yf(cn0Var, gyVar, cn0Var.F0, I, 24), z10);
                I.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new yf(cn0Var, gyVar, tL_sponsoredPeer, I, 25), z10);
                I.k();
                I.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new org.telegram.ui.ActionBar.i3(cn0Var, gyVar, I, 27), z10);
                I.V(LocaleController.isRTL ? 3 : 5);
                I.Y = true;
                I.t = z10;
                I.Z();
                break;
            case 15:
                qf.e.U((qf.e) obj3, (ArrayList) obj, (b51) obj2);
                break;
            case 16:
                qf.m mVar = (qf.m) obj3;
                mVar.H.dismiss();
                mVar.y = (String) obj;
                mVar.A = (TLRPC.InputDocument) obj2;
                mVar.w = false;
                AndroidUtilities.cancelRunOnUIThread(mVar.d);
                mVar.n.setSticker(mVar.y);
                mVar.e0(true);
                e51 e51Var = mVar.a;
                if (e51Var != null && (b51Var = e51Var.U2) != null) {
                    b51Var.N(true);
                    break;
                }
                break;
            case 17:
                qf.g0 g0Var = (qf.g0) obj3;
                ArrayList arrayList9 = (ArrayList) obj;
                b51 b51Var2 = (b51) obj2;
                b51Var2.A = 1;
                LinearLayout linearLayout = g0Var.W;
                n41 n41Var = new n41(-4);
                n41Var.d = -5;
                n41Var.c = linearLayout;
                n41Var.z = -1;
                arrayList9.add(n41Var);
                TL_account.TL_connectedBot tL_connectedBot = g0Var.T;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        org.telegram.ui.Cells.pa.o(R.string.SessionBotConnectedFrom, arrayList9);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList9.add(n41.f(LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i10 = 2;
                            arrayList9.add(n41.f(LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location, 2));
                        } else {
                            i10 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i10)) {
                            arrayList9.add(n41.f(LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false), 3));
                        }
                        arrayList9.add(n41.B(null));
                    }
                    b51Var2.U();
                    org.telegram.ui.Cells.pa.o(R.string.BusinessBotChats2, arrayList9);
                    int i28 = qf.g0.c0;
                    n41 w10 = n41.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    w10.K(g0Var.a0);
                    arrayList9.add(w10);
                    int i29 = qf.g0.d0;
                    n41 w11 = n41.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    w11.K(!g0Var.a0);
                    arrayList9.add(w11);
                    b51Var2.T();
                    arrayList9.add(n41.B(null));
                    qf.x xVar = g0Var.V;
                    if (xVar != null) {
                        xVar.a(arrayList9, b51Var2, true);
                    }
                    org.telegram.ui.Cells.pa.A(R.string.BusinessBotChatsInfo2, arrayList9);
                    break;
                }
                break;
            case 18:
                final qf.m0 m0Var = (qf.m0) obj3;
                ArrayList arrayList10 = (ArrayList) obj;
                b51 b51Var3 = (b51) obj2;
                LongSparseArray longSparseArray = m0Var.J;
                String string2 = LocaleController.getString(R.string.BusinessBots2);
                String string3 = LocaleController.getString(R.string.BusinessBots2Info);
                n41 n41Var2 = new n41(2);
                n41Var2.l = string2;
                n41Var2.o = string3;
                n41Var2.m = AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2;
                n41Var2.n = "🤖🏝️";
                n41Var2.z = 120;
                arrayList10.add(n41Var2);
                if (m0Var.I != null) {
                    b51Var3.U();
                    long j12 = m0Var.I.id;
                    n41 n41Var3 = new n41(13);
                    n41Var3.x = j12;
                    n41Var3.K(true);
                    n41Var3.D = new View.OnClickListener() { // from class: qf.j0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i15) {
                                case 0:
                                    m0 m0Var2 = m0Var;
                                    m0Var2.I = null;
                                    m0Var2.c.U2.N(true);
                                    m0Var2.Y(true);
                                    break;
                                case 1:
                                    m0 m0Var3 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights = m0Var3.F;
                                    if (tL_businessBotRights.reply && tL_businessBotRights.read_messages && tL_businessBotRights.delete_received_messages && tL_businessBotRights.delete_sent_messages) {
                                        tL_businessBotRights.delete_sent_messages = false;
                                        tL_businessBotRights.delete_received_messages = false;
                                        tL_businessBotRights.read_messages = false;
                                        tL_businessBotRights.reply = false;
                                    } else {
                                        tL_businessBotRights.delete_sent_messages = true;
                                        tL_businessBotRights.delete_received_messages = true;
                                        tL_businessBotRights.read_messages = true;
                                        tL_businessBotRights.reply = true;
                                    }
                                    m0Var3.c.U2.N(true);
                                    m0Var3.Y(true);
                                    break;
                                case 2:
                                    m0 m0Var4 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = m0Var4.F;
                                    if (!tL_businessBotRights2.edit_name || !tL_businessBotRights2.edit_bio || !tL_businessBotRights2.edit_profile_photo || !tL_businessBotRights2.edit_username) {
                                        m0Var4.X(-14, true, new i0(m0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        m0Var4.c.U2.N(true);
                                        m0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    m0 m0Var5 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = m0Var5.F;
                                    if (!tL_businessBotRights3.view_gifts || !tL_businessBotRights3.sell_gifts || !tL_businessBotRights3.change_gift_settings || !tL_businessBotRights3.transfer_and_upgrade_gifts || !tL_businessBotRights3.transfer_stars) {
                                        m0Var5.X(-17, true, new i0(m0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        m0Var5.c.U2.N(true);
                                        m0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    m0 m0Var6 = m0Var;
                                    m0Var6.F.manage_stories = !r0.manage_stories;
                                    m0Var6.c.U2.N(true);
                                    m0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList10.add(n41Var3);
                    b51Var3.T();
                } else {
                    b51Var3.U();
                    arrayList10.add(n41.k(m0Var.e));
                    longSparseArray.clear();
                    boolean z16 = false;
                    for (int i30 = 0; i30 < m0Var.d.d.size(); i30++) {
                        TLObject tLObject = (TLObject) m0Var.d.d.get(i30);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                long j13 = user.id;
                                String str5 = m0Var.y;
                                n41 n41Var4 = new n41(13);
                                n41Var4.x = j13;
                                n41Var4.n = str5;
                                arrayList10.add(n41Var4);
                                longSparseArray.put(user.id, user);
                                z16 = true;
                            }
                        }
                    }
                    for (int i31 = 0; i31 < m0Var.d.e.size(); i31++) {
                        TLObject tLObject2 = (TLObject) m0Var.d.e.get(i31);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j14 = user2.id;
                                String str6 = m0Var.y;
                                n41 n41Var5 = new n41(13);
                                n41Var5.x = j14;
                                n41Var5.n = str6;
                                arrayList10.add(n41Var5);
                                longSparseArray.put(user2.id, user2);
                                z16 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(m0Var.f.getText().toString()) || m0Var.d.e() || m0Var.x)) {
                        arrayList10.add(n41.k(m0Var.n));
                        z16 = true;
                    }
                    m0Var.h.setVisibility(z16 ? 0 : 8);
                    b51Var3.T();
                }
                arrayList10.add(n41.B(LocaleController.getString(R.string.BusinessBotLinkInfo2)));
                b51Var3.U();
                n41 t10 = n41.t(LocaleController.getString(R.string.BusinessBotChats2));
                t10.g = m0Var.I != null;
                arrayList10.add(t10);
                n41 w12 = n41.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                w12.K(m0Var.E);
                w12.g = m0Var.I != null;
                arrayList10.add(w12);
                n41 w13 = n41.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                w13.K(!m0Var.E);
                w13.g = m0Var.I != null;
                arrayList10.add(w13);
                b51Var3.T();
                arrayList10.add(n41.B(null));
                m0Var.v.a(arrayList10, b51Var3, m0Var.I != null);
                org.telegram.ui.Cells.pa.A(R.string.BusinessBotChatsInfo2, arrayList10);
                if (m0Var.I != null) {
                    b51Var3.U();
                    org.telegram.ui.Cells.pa.o(R.string.BusinessBotPermissions, arrayList10);
                    String string4 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = m0Var.F;
                    sb3.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb3.append("/5");
                    n41 m10 = n41.m(-4, string4, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = m0Var.F;
                    m10.K(tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages);
                    m10.f = !m0Var.L;
                    m10.D = new View.OnClickListener() { // from class: qf.j0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i16) {
                                case 0:
                                    m0 m0Var2 = m0Var;
                                    m0Var2.I = null;
                                    m0Var2.c.U2.N(true);
                                    m0Var2.Y(true);
                                    break;
                                case 1:
                                    m0 m0Var3 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = m0Var3.F;
                                    if (tL_businessBotRights3.reply && tL_businessBotRights3.read_messages && tL_businessBotRights3.delete_received_messages && tL_businessBotRights3.delete_sent_messages) {
                                        tL_businessBotRights3.delete_sent_messages = false;
                                        tL_businessBotRights3.delete_received_messages = false;
                                        tL_businessBotRights3.read_messages = false;
                                        tL_businessBotRights3.reply = false;
                                    } else {
                                        tL_businessBotRights3.delete_sent_messages = true;
                                        tL_businessBotRights3.delete_received_messages = true;
                                        tL_businessBotRights3.read_messages = true;
                                        tL_businessBotRights3.reply = true;
                                    }
                                    m0Var3.c.U2.N(true);
                                    m0Var3.Y(true);
                                    break;
                                case 2:
                                    m0 m0Var4 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = m0Var4.F;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        m0Var4.X(-14, true, new i0(m0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        m0Var4.c.U2.N(true);
                                        m0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    m0 m0Var5 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = m0Var5.F;
                                    if (!tL_businessBotRights32.view_gifts || !tL_businessBotRights32.sell_gifts || !tL_businessBotRights32.change_gift_settings || !tL_businessBotRights32.transfer_and_upgrade_gifts || !tL_businessBotRights32.transfer_stars) {
                                        m0Var5.X(-17, true, new i0(m0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        m0Var5.c.U2.N(true);
                                        m0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    m0 m0Var6 = m0Var;
                                    m0Var6.F.manage_stories = !r0.manage_stories;
                                    m0Var6.c.U2.N(true);
                                    m0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList10.add(m10);
                    if (m0Var.L) {
                        n41 y10 = n41.y(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        y10.K(true);
                        y10.g = false;
                        y10.i = 1;
                        arrayList10.add(y10);
                        n41 y11 = n41.y(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        y11.K(m0Var.F.reply);
                        y11.i = 1;
                        arrayList10.add(y11);
                        n41 y12 = n41.y(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        y12.K(m0Var.F.read_messages);
                        y12.i = 1;
                        arrayList10.add(y12);
                        n41 y13 = n41.y(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        y13.K(m0Var.F.delete_sent_messages);
                        y13.i = 1;
                        arrayList10.add(y13);
                        n41 y14 = n41.y(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        y14.K(m0Var.F.delete_received_messages);
                        y14.i = 1;
                        arrayList10.add(y14);
                    }
                    String string5 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = m0Var.F;
                    sb4.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb4.append("/4");
                    n41 m11 = n41.m(-10, string5, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = m0Var.F;
                    m11.K(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username);
                    m11.f = !m0Var.M;
                    final int i32 = 2;
                    m11.D = new View.OnClickListener() { // from class: qf.j0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i32) {
                                case 0:
                                    m0 m0Var2 = m0Var;
                                    m0Var2.I = null;
                                    m0Var2.c.U2.N(true);
                                    m0Var2.Y(true);
                                    break;
                                case 1:
                                    m0 m0Var3 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = m0Var3.F;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    m0Var3.c.U2.N(true);
                                    m0Var3.Y(true);
                                    break;
                                case 2:
                                    m0 m0Var4 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = m0Var4.F;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        m0Var4.X(-14, true, new i0(m0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        m0Var4.c.U2.N(true);
                                        m0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    m0 m0Var5 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = m0Var5.F;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        m0Var5.X(-17, true, new i0(m0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        m0Var5.c.U2.N(true);
                                        m0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    m0 m0Var6 = m0Var;
                                    m0Var6.F.manage_stories = !r0.manage_stories;
                                    m0Var6.c.U2.N(true);
                                    m0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList10.add(m11);
                    if (m0Var.M) {
                        n41 y15 = n41.y(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        y15.K(m0Var.F.edit_name);
                        y15.i = 1;
                        arrayList10.add(y15);
                        n41 y16 = n41.y(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        y16.K(m0Var.F.edit_bio);
                        y16.i = 1;
                        arrayList10.add(y16);
                        n41 y17 = n41.y(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        y17.K(m0Var.F.edit_profile_photo);
                        y17.i = 1;
                        arrayList10.add(y17);
                        n41 y18 = n41.y(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        y18.K(m0Var.F.edit_username);
                        y18.i = 1;
                        arrayList10.add(y18);
                    }
                    String string6 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb5 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = m0Var.F;
                    sb5.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb5.append("/5");
                    n41 m12 = n41.m(-15, string6, sb5.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = m0Var.F;
                    m12.K(tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars);
                    m12.f = !m0Var.N;
                    final int i33 = 3;
                    m12.D = new View.OnClickListener() { // from class: qf.j0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i33) {
                                case 0:
                                    m0 m0Var2 = m0Var;
                                    m0Var2.I = null;
                                    m0Var2.c.U2.N(true);
                                    m0Var2.Y(true);
                                    break;
                                case 1:
                                    m0 m0Var3 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = m0Var3.F;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    m0Var3.c.U2.N(true);
                                    m0Var3.Y(true);
                                    break;
                                case 2:
                                    m0 m0Var4 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = m0Var4.F;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        m0Var4.X(-14, true, new i0(m0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        m0Var4.c.U2.N(true);
                                        m0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    m0 m0Var5 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = m0Var5.F;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        m0Var5.X(-17, true, new i0(m0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        m0Var5.c.U2.N(true);
                                        m0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    m0 m0Var6 = m0Var;
                                    m0Var6.F.manage_stories = !r0.manage_stories;
                                    m0Var6.c.U2.N(true);
                                    m0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList10.add(m12);
                    if (m0Var.N) {
                        n41 y19 = n41.y(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        y19.K(m0Var.F.view_gifts);
                        y19.i = 1;
                        arrayList10.add(y19);
                        n41 y20 = n41.y(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        y20.K(m0Var.F.sell_gifts);
                        y20.i = 1;
                        arrayList10.add(y20);
                        n41 y21 = n41.y(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        y21.K(m0Var.F.change_gift_settings);
                        y21.i = 1;
                        arrayList10.add(y21);
                        n41 y22 = n41.y(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        y22.K(m0Var.F.transfer_and_upgrade_gifts);
                        y22.i = 1;
                        arrayList10.add(y22);
                        n41 y23 = n41.y(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        y23.K(m0Var.F.transfer_stars);
                        y23.i = 1;
                        arrayList10.add(y23);
                    }
                    n41 m13 = n41.m(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), "");
                    m13.K(m0Var.F.manage_stories);
                    final int i34 = 4;
                    m13.D = new View.OnClickListener() { // from class: qf.j0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i34) {
                                case 0:
                                    m0 m0Var2 = m0Var;
                                    m0Var2.I = null;
                                    m0Var2.c.U2.N(true);
                                    m0Var2.Y(true);
                                    break;
                                case 1:
                                    m0 m0Var3 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = m0Var3.F;
                                    if (tL_businessBotRights32.reply && tL_businessBotRights32.read_messages && tL_businessBotRights32.delete_received_messages && tL_businessBotRights32.delete_sent_messages) {
                                        tL_businessBotRights32.delete_sent_messages = false;
                                        tL_businessBotRights32.delete_received_messages = false;
                                        tL_businessBotRights32.read_messages = false;
                                        tL_businessBotRights32.reply = false;
                                    } else {
                                        tL_businessBotRights32.delete_sent_messages = true;
                                        tL_businessBotRights32.delete_received_messages = true;
                                        tL_businessBotRights32.read_messages = true;
                                        tL_businessBotRights32.reply = true;
                                    }
                                    m0Var3.c.U2.N(true);
                                    m0Var3.Y(true);
                                    break;
                                case 2:
                                    m0 m0Var4 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = m0Var4.F;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        m0Var4.X(-14, true, new i0(m0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        m0Var4.c.U2.N(true);
                                        m0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    m0 m0Var5 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = m0Var5.F;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        m0Var5.X(-17, true, new i0(m0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        m0Var5.c.U2.N(true);
                                        m0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    m0 m0Var6 = m0Var;
                                    m0Var6.F.manage_stories = !r0.manage_stories;
                                    m0Var6.c.U2.N(true);
                                    m0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList10.add(m13);
                    b51Var3.T();
                    arrayList10.add(n41.A(-4, null));
                    arrayList10.add(n41.A(-5, null));
                    arrayList10.add(n41.A(-6, null));
                    arrayList10.add(n41.A(-7, null));
                    break;
                }
                break;
            case 19:
                qf.o0.U((qf.o0) obj3, (ArrayList) obj, (b51) obj2);
                break;
            case 20:
                a(obj, obj2);
                break;
            case 21:
                qf.y0.V((qf.y0) obj3, (ArrayList) obj);
                break;
            case 22:
                b(obj, obj2);
                break;
            case 23:
                c(obj, obj2);
                break;
            case 24:
                d(obj, obj2);
                break;
            case 25:
                e(obj, obj2);
                break;
            case 26:
                f(obj, obj2);
                break;
            case 27:
                g(obj, obj2);
                break;
            case 28:
                h(obj, obj2);
                break;
            default:
                rh.p3 p3Var = (rh.p3) obj3;
                ((Integer) obj).getClass();
                ArrayList arrayList11 = (ArrayList) obj2;
                ArrayList arrayList12 = p3Var.h3;
                ArrayList arrayList13 = new ArrayList(arrayList11.size());
                int size2 = arrayList11.size();
                int i35 = 0;
                while (i35 < size2) {
                    Object obj5 = arrayList11.get(i35);
                    i35++;
                    Object obj6 = ((n41) obj5).G;
                    if (obj6 instanceof rh.a) {
                        arrayList13.add((rh.a) obj6);
                    }
                }
                if (arrayList13.size() >= 2) {
                    ArrayList arrayList14 = new ArrayList();
                    int size3 = arrayList13.size();
                    int i36 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i37 = 0;
                    int i38 = 0;
                    while (i38 < size3) {
                        Object obj7 = arrayList13.get(i38);
                        i38++;
                        rh.a aVar = (rh.a) obj7;
                        int indexOf = arrayList12.indexOf(aVar);
                        if (indexOf < 0) {
                            break;
                        } else {
                            int i39 = indexOf + 1;
                            if (rh.p3.x3(aVar) && !((TL_iv.pageBlockDetails) aVar.b).open) {
                                int P3 = p3Var.P3(indexOf);
                                i39 = P3 >= arrayList12.size() ? arrayList12.size() : P3 + 1;
                            }
                            arrayList14.add(new ArrayList(arrayList12.subList(indexOf, i39)));
                            i36 = Math.min(i36, indexOf);
                            i14 = Math.max(i14, i39);
                            i37 += i39 - indexOf;
                        }
                    }
                    if (i37 == i14 - i36) {
                        ArrayList arrayList15 = new ArrayList(i37);
                        int size4 = arrayList14.size();
                        int i40 = 0;
                        while (i40 < size4) {
                            Object obj8 = arrayList14.get(i40);
                            i40++;
                            arrayList15.addAll((ArrayList) obj8);
                        }
                        for (int i41 = 0; i41 < arrayList15.size(); i41++) {
                            if (arrayList12.get(i36 + i41) != arrayList15.get(i41)) {
                                rh.b2 b2Var2 = p3Var.F3;
                                if (b2Var2 != null) {
                                    b2Var2.d();
                                }
                                for (int i42 = 0; i42 < arrayList15.size(); i42++) {
                                    arrayList12.set(i36 + i42, (rh.a) arrayList15.get(i42));
                                }
                                rh.a aVar2 = p3Var.O3;
                                ArrayList arrayList16 = rh.p3.o4;
                                if (aVar2 != null) {
                                    ArrayList arrayList17 = aVar2.k;
                                    int indexOf2 = arrayList12.indexOf(aVar2);
                                    if (indexOf2 >= 0) {
                                        ArrayList arrayList18 = indexOf2 > 0 ? ((rh.a) arrayList12.get(indexOf2 - 1)).k : arrayList16;
                                        int i43 = indexOf2 + 1;
                                        if (i43 < arrayList12.size()) {
                                            arrayList16 = ((rh.a) arrayList12.get(i43)).k;
                                        }
                                        if (arrayList18.size() < arrayList16.size()) {
                                            arrayList18 = arrayList16;
                                        }
                                        if (!arrayList17.equals(arrayList18)) {
                                            arrayList17.clear();
                                            arrayList17.addAll(arrayList18);
                                            z11 = true;
                                            boolean x22 = p3Var.x2();
                                            i11 = 0;
                                            while (i11 < arrayList12.size()) {
                                                rh.a aVar3 = (rh.a) arrayList12.get(i11);
                                                if (!aVar3.i && !rh.p3.x3(aVar3)) {
                                                    rh.a aVar4 = i11 > 0 ? (rh.a) arrayList12.get(i11 - 1) : null;
                                                    int max = aVar4 != null ? Math.max(0, aVar4.c) : 0;
                                                    if (rh.p3.E3(aVar3.b)) {
                                                        aVar3.c = max;
                                                        if (max > 0) {
                                                            aVar3.d = aVar4.d > 0 ? 1 : 0;
                                                            aVar3.e = false;
                                                            aVar3.f = false;
                                                        }
                                                    } else {
                                                        int i44 = max + 1;
                                                        if (aVar3.c > i44) {
                                                            aVar3.c = i44;
                                                        }
                                                    }
                                                    if (aVar3.c <= 0) {
                                                        aVar3.c = 0;
                                                        aVar3.d = 0;
                                                        aVar3.e = false;
                                                        aVar3.f = false;
                                                    }
                                                }
                                                i11++;
                                            }
                                            p3Var.s4();
                                            p3Var.a2();
                                            if (!z11 || x22) {
                                                p3Var.U2.N(true);
                                                p3Var.x4();
                                            } else {
                                                p3Var.x4();
                                            }
                                            b2Var = p3Var.F3;
                                            if (b2Var == null) {
                                                b2Var.h();
                                                break;
                                            }
                                        }
                                    }
                                }
                                z11 = false;
                                boolean x222 = p3Var.x2();
                                i11 = 0;
                                while (i11 < arrayList12.size()) {
                                }
                                p3Var.s4();
                                p3Var.a2();
                                if (z11) {
                                }
                                p3Var.U2.N(true);
                                p3Var.x4();
                                b2Var = p3Var.F3;
                                if (b2Var == null) {
                                }
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }
}
