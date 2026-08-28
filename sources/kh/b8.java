package kh;

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
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.z41;
import org.telegram.ui.ai1;
import org.telegram.ui.dy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b8 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b8(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    private final void a(Object obj, Object obj2) {
        pf.w0 w0Var = (pf.w0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        String string = LocaleController.getString(R.string.BusinessLocation);
        String string2 = LocaleController.getString(R.string.BusinessLocationInfo);
        int i9 = R.raw.biz_map;
        l41 l41Var = new l41(2);
        l41Var.l = string;
        l41Var.o = string2;
        l41Var.k = i9;
        arrayList.add(l41Var);
        arrayList.add(l41.k(w0Var.e));
        arrayList.add(l41.B(null));
        l41 i10 = l41.i(1, LocaleController.getString(R.string.BusinessLocationMap));
        boolean z10 = false;
        i10.K(w0Var.x != null);
        arrayList.add(i10);
        if (w0Var.x != null) {
            arrayList.add(l41.k(w0Var.h));
        }
        arrayList.add(l41.B(null));
        if (w0Var.w != null && (w0Var.x != null || !TextUtils.isEmpty(w0Var.y))) {
            z10 = true;
        }
        w0Var.C = z10;
        if (z10) {
            l41 e10 = l41.e(2, LocaleController.getString(R.string.BusinessLocationClear));
            e10.r = true;
            arrayList.add(e10);
            arrayList.add(l41.B(null));
        }
        w0Var.T(true);
    }

    private final void b(Object obj, Object obj2) {
        pf.a1 a1Var = (pf.a1) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = a1Var.b;
        String string = LocaleController.getString(R.string.BusinessHoursDayOpen);
        l41 l41Var = new l41(9);
        l41Var.d = -1;
        l41Var.l = string;
        l41Var.K(a1Var.r);
        arrayList.add(l41Var);
        arrayList.add(l41.B(null));
        if (a1Var.r) {
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                if (i9 > 0) {
                    arrayList.add(l41.B(null));
                }
                pf.x0 x0Var = (pf.x0) arrayList2.get(i9);
                if (!a1Var.T()) {
                    int i10 = i9 * 3;
                    arrayList.add(l41.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), pf.x0.a(x0Var.a), i10));
                    arrayList.add(l41.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), pf.x0.a(x0Var.b), i10 + 1));
                    l41 e10 = l41.e(i10 + 2, LocaleController.getString(R.string.Remove));
                    e10.r = true;
                    arrayList.add(e10);
                }
            }
            if (a1Var.U()) {
                arrayList.add(l41.B(null));
                l41 c10 = l41.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                c10.q = true;
                arrayList.add(c10);
            }
            org.telegram.ui.Cells.j2.y(R.string.BusinessHoursDayInfo, arrayList);
        }
    }

    private final void c(Object obj, Object obj2) {
        pf.t1.U((pf.t1) this.b, (ArrayList) obj, (z41) obj2);
    }

    private final void d(Object obj, Object obj2) {
        ph.a aVar = (ph.a) this.b;
        ArrayList arrayList = (ArrayList) obj;
        arrayList.add(l41.D(0, AndroidUtilities.dp(12.0f)));
        arrayList.add(l41.j(1, aVar.V));
        arrayList.add(l41.D(2, AndroidUtilities.dp(12.0f)));
        arrayList.add(l41.s(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
        aVar.Y = arrayList.size();
        String string = LocaleController.getString(R.string.CommunityChatVisibilityVisible);
        boolean z10 = aVar.X;
        l41 x10 = l41.x(151, string, LocaleController.getString(z10 ? R.string.CommunityChatVisibilityVisibleBotInfo : R.string.CommunityChatVisibilityVisibleInfo));
        x10.K(true ^ aVar.U);
        arrayList.add(x10);
        l41 x11 = l41.x(ImageReceiver.DEFAULT_CROSSFADE_DURATION, LocaleController.getString(R.string.CommunityChatVisibilityHidden), LocaleController.getString(z10 ? R.string.CommunityChatVisibilityHiddenBotInfo : R.string.CommunityChatVisibilityHiddenInfo));
        x11.K(aVar.U);
        arrayList.add(x11);
        arrayList.add(l41.A(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
    }

    private final void e(Object obj, Object obj2) {
        ((ArrayList) obj).add(l41.j(0, ((ph.b) this.b).T));
    }

    private final void f(Object obj, Object obj2) {
        Utilities.themeQueue.postRunnable(new ai1(19, (String[]) this.b, (Utilities.Callback2) obj2));
    }

    private final void g(Object obj, Object obj2) {
        qh.v vVar = (qh.v) this.b;
        ArrayList arrayList = (ArrayList) obj;
        arrayList.add(l41.j(1, vVar.W));
        arrayList.add(l41.j(3, vVar.Z));
        if (vVar.e0 != null) {
            arrayList.add(l41.j(2, vVar.X));
        }
    }

    private final void h(Object obj, Object obj2) {
        qh.o3.I1((qh.o3[]) this.b, (ArrayList) obj, (z41) obj2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014d  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        String upperCase;
        char c10;
        boolean z10;
        z41 z41Var;
        int i9;
        boolean z11;
        int i10;
        qh.b2 b2Var;
        int i11 = this.a;
        String str = "";
        int i12 = -1;
        final int i13 = 0;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                k8 k8Var = (k8) obj3;
                ArrayList arrayList = (ArrayList) obj;
                if (k8Var.d0 || k8Var.c0 != null) {
                    TLRPC.WebPage webPage = k8Var.c0;
                    c8 c8Var = new c8(k8Var, 0);
                    int i14 = i8.a;
                    l41 J = l41.J(i8.class);
                    J.G = webPage;
                    J.D = c8Var;
                    arrayList.add(J);
                }
                arrayList.add(l41.k(k8Var.U));
                arrayList.add(l41.A(1, null));
                l41 i15 = l41.i(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                i15.K(k8Var.i0);
                arrayList.add(i15);
                if (k8Var.i0) {
                    arrayList.add(l41.k(k8Var.V));
                }
                arrayList.add(l41.A(3, null));
                arrayList.add(l41.k(k8Var.W));
                break;
            case 1:
                wb wbVar = (wb) obj3;
                Float f10 = (Float) obj2;
                long duration = wbVar.T0.getDuration() < 100 ? wbVar.G1.h0 : wbVar.T0.getDuration();
                float floatValue = ((f10.floatValue() / 0.96f) * 0.04f) + f10.floatValue();
                a8 a8Var = wbVar.G1;
                float f11 = a8Var.a0;
                float f12 = a8Var.Z;
                float f13 = (f11 - f12) * floatValue;
                float f14 = duration;
                long j10 = (long) (f13 * f14);
                kb kbVar = wbVar.T0;
                long j11 = (long) ((f12 * f14) + j10);
                wbVar.I1 = j11;
                kbVar.m(j11);
                ya yaVar = wbVar.r1;
                if (yaVar != null) {
                    yaVar.setCoverTime(wbVar.I1);
                }
                a8 a8Var2 = wbVar.G1;
                if (a8Var2 != null && a8Var2.g) {
                    a8Var2.j = true;
                    break;
                }
                break;
            case 2:
                ((zb) obj3).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 3:
                ((lh.g) obj3).B0((ArrayList) obj, (z41) obj2);
                break;
            case 4:
                lh.f fVar = (lh.f) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(l41.k(fVar.U));
                arrayList2.add(l41.k(fVar.V));
                break;
            case 5:
                ((mh.l) obj3).D0((ArrayList) obj, (z41) obj2);
                break;
            case 6:
                mh.t.T((mh.t) obj3, (ArrayList) obj);
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
                mh.l1 l1Var = (mh.l1) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(l41.j(-1, l1Var.W));
                arrayList3.add(l41.B(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, l1Var.U))));
                break;
            case 9:
                mh.c3 c3Var = (mh.c3) obj3;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    c3Var.getClass();
                    break;
                } else {
                    mh.s4 s4Var = c3Var.r0;
                    if (s4Var != null) {
                        s4Var.a(tL_webViewResultUrl);
                        c3Var.n();
                        break;
                    }
                }
                break;
            case 10:
                ((mh.u3) obj3).E0((ArrayList) obj, (z41) obj2);
                break;
            case 11:
                ((mh.r4) obj3).T((ArrayList) obj, (z41) obj2);
                break;
            case 12:
                ((nh.r) obj3).v.c((ArrayList) obj);
                break;
            case 13:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                an0 an0Var = (an0) ((of.f0) obj3);
                dy dyVar = an0Var.E0;
                AndroidUtilities.hideKeyboard(dyVar.getParentActivity().getCurrentFocus());
                x60 I = x60.I(dyVar, (org.telegram.ui.Cells.h6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z10 = false;
                } else {
                    x60 J2 = I.J();
                    J2.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ib0(I, 24), false);
                    J2.k();
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                        J2.p(13, -1, tL_sponsoredPeer.sponsor_info);
                    }
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                        if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                            J2.k();
                        }
                        J2.p(13, -1, tL_sponsoredPeer.additional_info);
                    }
                    z10 = false;
                    I.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new fh.k3(I, J2, 7), false);
                }
                I.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new org.telegram.ui.k6(an0Var, dyVar, an0Var.F0, I, 28), z10);
                I.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new org.telegram.ui.k6(an0Var, dyVar, tL_sponsoredPeer, I, 29), z10);
                I.k();
                I.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new ue0(an0Var, dyVar, I, 3), z10);
                I.V(LocaleController.isRTL ? 3 : 5);
                I.Y = true;
                I.t = z10;
                I.Z();
                break;
            case 14:
                final org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.web.i iVar = kVar.y;
                ArrayList arrayList5 = kVar.x;
                if (!kVar.b && arrayList5.isEmpty()) {
                    arrayList4.add(l41.k(kVar.d));
                }
                SharedPreferences sharedPreferences = kVar.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList6 = new ArrayList();
                String string = sharedPreferences.getString("queries_json", null);
                if (string != null) {
                    try {
                        ArrayList arrayList7 = new ArrayList();
                        JSONArray jSONArray = new JSONArray(string);
                        for (int i16 = 0; i16 < jSONArray.length(); i16++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i16);
                            org.telegram.ui.web.j jVar = new org.telegram.ui.web.j(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                            jVar.c = jSONObject.optDouble("rank", 0.0d);
                            arrayList7.add(jVar);
                        }
                        Collections.sort(arrayList7, new jn0(19));
                        int size = arrayList7.size();
                        int i17 = 0;
                        while (i17 < size) {
                            Object obj4 = arrayList7.get(i17);
                            i17++;
                            org.telegram.ui.web.j jVar2 = (org.telegram.ui.web.j) obj4;
                            if (arrayList6.size() < 20) {
                                arrayList6.add(jVar2.a);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                arrayList5.size();
                arrayList6.size();
                if (!arrayList5.isEmpty()) {
                    arrayList4.add(l41.k(kVar.v));
                }
                int i18 = 0;
                while (i18 < arrayList5.size()) {
                    final String str3 = (String) arrayList5.get(i18);
                    boolean z12 = i18 == 0;
                    boolean z13 = i18 == arrayList5.size() - 1;
                    final int i19 = 0;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i19) {
                                case 0:
                                    org.telegram.ui.r rVar = kVar.I;
                                    if (rVar != null) {
                                        rVar.run(str3);
                                        break;
                                    }
                                    break;
                                default:
                                    org.telegram.ui.r rVar2 = kVar.I;
                                    if (rVar2 != null) {
                                        rVar2.run(str3);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    int i20 = org.telegram.ui.web.d.a;
                    l41 J3 = l41.J(org.telegram.ui.web.d.class);
                    J3.z = 1;
                    J3.l = str3;
                    J3.D = onClickListener;
                    J3.q = z12;
                    J3.r = z13;
                    J3.G = Boolean.TRUE;
                    J3.H = kVar;
                    arrayList4.add(J3);
                    i18++;
                }
                if (!arrayList6.isEmpty()) {
                    arrayList4.add(l41.r(LocaleController.getString(R.string.WebSectionRecent), LocaleController.getString(R.string.WebRecentClear), new x8(kVar, 16)));
                    int i21 = 0;
                    while (i21 < arrayList6.size()) {
                        final String str4 = (String) arrayList6.get(i21);
                        boolean z14 = i21 == 0;
                        final int i22 = 1;
                        boolean z15 = i21 == arrayList6.size() - 1;
                        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: org.telegram.ui.web.b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i22) {
                                    case 0:
                                        org.telegram.ui.r rVar = kVar.I;
                                        if (rVar != null) {
                                            rVar.run(str4);
                                            break;
                                        }
                                        break;
                                    default:
                                        org.telegram.ui.r rVar2 = kVar.I;
                                        if (rVar2 != null) {
                                            rVar2.run(str4);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        int i23 = org.telegram.ui.web.d.a;
                        l41 J4 = l41.J(org.telegram.ui.web.d.class);
                        J4.z = 0;
                        J4.l = str4;
                        J4.D = onClickListener2;
                        J4.q = z14;
                        J4.r = z15;
                        J4.G = Boolean.TRUE;
                        J4.H = kVar;
                        arrayList4.add(J4);
                        i21++;
                    }
                }
                if (iVar != null) {
                    ArrayList arrayList8 = iVar.a;
                    if (!arrayList8.isEmpty()) {
                        arrayList4.add(l41.q(LocaleController.getString(R.string.WebSectionBookmarks)));
                        for (int i24 = 0; i24 < arrayList8.size(); i24++) {
                            MessageObject messageObject = (MessageObject) arrayList8.get(i24);
                            if (!TextUtils.isEmpty(org.telegram.ui.web.k.a(messageObject))) {
                                int i25 = org.telegram.ui.web.g.a;
                                l41 J5 = l41.J(org.telegram.ui.web.g.class);
                                J5.z = 3;
                                J5.q = true;
                                J5.H = messageObject;
                                arrayList4.add(J5);
                            }
                        }
                        if (!iVar.f) {
                            arrayList4.add(l41.o(arrayList4.size(), 32));
                            arrayList4.add(l41.o(arrayList4.size(), 32));
                            arrayList4.add(l41.o(arrayList4.size(), 32));
                            break;
                        }
                    }
                }
                break;
            case 15:
                pf.d.T((pf.d) obj3, (ArrayList) obj, (z41) obj2);
                break;
            case 16:
                pf.l lVar = (pf.l) obj3;
                lVar.H.dismiss();
                lVar.y = (String) obj;
                lVar.A = (TLRPC.InputDocument) obj2;
                lVar.w = false;
                AndroidUtilities.cancelRunOnUIThread(lVar.d);
                lVar.n.setSticker(lVar.y);
                lVar.d0(true);
                c51 c51Var = lVar.a;
                if (c51Var != null && (z41Var = c51Var.U2) != null) {
                    z41Var.N(true);
                    break;
                }
                break;
            case 17:
                pf.g0 g0Var = (pf.g0) obj3;
                ArrayList arrayList9 = (ArrayList) obj;
                z41 z41Var2 = (z41) obj2;
                z41Var2.A = 1;
                LinearLayout linearLayout = g0Var.W;
                l41 l41Var = new l41(-4);
                l41Var.d = -5;
                l41Var.c = linearLayout;
                l41Var.z = -1;
                arrayList9.add(l41Var);
                TL_account.TL_connectedBot tL_connectedBot = g0Var.T;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        org.telegram.ui.Cells.j2.l(R.string.SessionBotConnectedFrom, arrayList9);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList9.add(l41.f(LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i9 = 2;
                            arrayList9.add(l41.f(LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location, 2));
                        } else {
                            i9 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i9)) {
                            arrayList9.add(l41.f(LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false), 3));
                        }
                        arrayList9.add(l41.B(null));
                    }
                    z41Var2.U();
                    org.telegram.ui.Cells.j2.l(R.string.BusinessBotChats2, arrayList9);
                    int i26 = pf.g0.c0;
                    l41 w8 = l41.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    w8.K(g0Var.a0);
                    arrayList9.add(w8);
                    int i27 = pf.g0.d0;
                    l41 w10 = l41.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    w10.K(!g0Var.a0);
                    arrayList9.add(w10);
                    z41Var2.T();
                    arrayList9.add(l41.B(null));
                    pf.x xVar = g0Var.V;
                    if (xVar != null) {
                        xVar.a(arrayList9, z41Var2, true);
                    }
                    org.telegram.ui.Cells.j2.y(R.string.BusinessBotChatsInfo2, arrayList9);
                    break;
                }
                break;
            case 18:
                final pf.m0 m0Var = (pf.m0) obj3;
                ArrayList arrayList10 = (ArrayList) obj;
                z41 z41Var3 = (z41) obj2;
                LongSparseArray longSparseArray = m0Var.J;
                String string2 = LocaleController.getString(R.string.BusinessBots2);
                String string3 = LocaleController.getString(R.string.BusinessBots2Info);
                l41 l41Var2 = new l41(2);
                l41Var2.l = string2;
                l41Var2.o = string3;
                l41Var2.m = AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2;
                l41Var2.n = "🤖🏝️";
                l41Var2.z = 120;
                arrayList10.add(l41Var2);
                if (m0Var.I != null) {
                    z41Var3.U();
                    long j12 = m0Var.I.id;
                    l41 l41Var3 = new l41(13);
                    l41Var3.x = j12;
                    l41Var3.K(true);
                    l41Var3.D = new View.OnClickListener() { // from class: pf.j0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    m0 m0Var2 = m0Var;
                                    m0Var2.I = null;
                                    m0Var2.c.U2.N(true);
                                    m0Var2.X(true);
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
                                    m0Var3.X(true);
                                    break;
                                case 2:
                                    m0 m0Var4 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = m0Var4.F;
                                    if (!tL_businessBotRights2.edit_name || !tL_businessBotRights2.edit_bio || !tL_businessBotRights2.edit_profile_photo || !tL_businessBotRights2.edit_username) {
                                        m0Var4.W(-14, true, new i0(m0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        m0Var4.c.U2.N(true);
                                        m0Var4.X(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    m0 m0Var5 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = m0Var5.F;
                                    if (!tL_businessBotRights3.view_gifts || !tL_businessBotRights3.sell_gifts || !tL_businessBotRights3.change_gift_settings || !tL_businessBotRights3.transfer_and_upgrade_gifts || !tL_businessBotRights3.transfer_stars) {
                                        m0Var5.W(-17, true, new i0(m0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        m0Var5.c.U2.N(true);
                                        m0Var5.X(true);
                                        break;
                                    }
                                    break;
                                default:
                                    m0 m0Var6 = m0Var;
                                    m0Var6.F.manage_stories = !r0.manage_stories;
                                    m0Var6.c.U2.N(true);
                                    m0Var6.X(true);
                                    break;
                            }
                        }
                    };
                    arrayList10.add(l41Var3);
                    z41Var3.T();
                } else {
                    z41Var3.U();
                    arrayList10.add(l41.k(m0Var.e));
                    longSparseArray.clear();
                    boolean z16 = false;
                    for (int i28 = 0; i28 < m0Var.d.d.size(); i28++) {
                        TLObject tLObject = (TLObject) m0Var.d.d.get(i28);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                long j13 = user.id;
                                String str5 = m0Var.y;
                                l41 l41Var4 = new l41(13);
                                l41Var4.x = j13;
                                l41Var4.n = str5;
                                arrayList10.add(l41Var4);
                                longSparseArray.put(user.id, user);
                                z16 = true;
                            }
                        }
                    }
                    for (int i29 = 0; i29 < m0Var.d.e.size(); i29++) {
                        TLObject tLObject2 = (TLObject) m0Var.d.e.get(i29);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j14 = user2.id;
                                String str6 = m0Var.y;
                                l41 l41Var5 = new l41(13);
                                l41Var5.x = j14;
                                l41Var5.n = str6;
                                arrayList10.add(l41Var5);
                                longSparseArray.put(user2.id, user2);
                                z16 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(m0Var.f.getText().toString()) || m0Var.d.e() || m0Var.x)) {
                        arrayList10.add(l41.k(m0Var.n));
                        z16 = true;
                    }
                    m0Var.h.setVisibility(z16 ? 0 : 8);
                    z41Var3.T();
                }
                arrayList10.add(l41.B(LocaleController.getString(R.string.BusinessBotLinkInfo2)));
                z41Var3.U();
                l41 t10 = l41.t(LocaleController.getString(R.string.BusinessBotChats2));
                t10.g = m0Var.I != null;
                arrayList10.add(t10);
                l41 w11 = l41.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                w11.K(m0Var.E);
                w11.g = m0Var.I != null;
                arrayList10.add(w11);
                l41 w12 = l41.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                w12.K(!m0Var.E);
                w12.g = m0Var.I != null;
                arrayList10.add(w12);
                z41Var3.T();
                arrayList10.add(l41.B(null));
                m0Var.v.a(arrayList10, z41Var3, m0Var.I != null);
                org.telegram.ui.Cells.j2.y(R.string.BusinessBotChatsInfo2, arrayList10);
                if (m0Var.I != null) {
                    z41Var3.U();
                    org.telegram.ui.Cells.j2.l(R.string.BusinessBotPermissions, arrayList10);
                    String string4 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = m0Var.F;
                    sb3.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb3.append("/5");
                    l41 m10 = l41.m(-4, string4, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = m0Var.F;
                    m10.K(tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages);
                    m10.f = !m0Var.L;
                    final int i30 = 1;
                    m10.D = new View.OnClickListener() { // from class: pf.j0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i30) {
                                case 0:
                                    m0 m0Var2 = m0Var;
                                    m0Var2.I = null;
                                    m0Var2.c.U2.N(true);
                                    m0Var2.X(true);
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
                                    m0Var3.X(true);
                                    break;
                                case 2:
                                    m0 m0Var4 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = m0Var4.F;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        m0Var4.W(-14, true, new i0(m0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        m0Var4.c.U2.N(true);
                                        m0Var4.X(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    m0 m0Var5 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = m0Var5.F;
                                    if (!tL_businessBotRights32.view_gifts || !tL_businessBotRights32.sell_gifts || !tL_businessBotRights32.change_gift_settings || !tL_businessBotRights32.transfer_and_upgrade_gifts || !tL_businessBotRights32.transfer_stars) {
                                        m0Var5.W(-17, true, new i0(m0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        m0Var5.c.U2.N(true);
                                        m0Var5.X(true);
                                        break;
                                    }
                                    break;
                                default:
                                    m0 m0Var6 = m0Var;
                                    m0Var6.F.manage_stories = !r0.manage_stories;
                                    m0Var6.c.U2.N(true);
                                    m0Var6.X(true);
                                    break;
                            }
                        }
                    };
                    arrayList10.add(m10);
                    if (m0Var.L) {
                        l41 y10 = l41.y(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        y10.K(true);
                        y10.g = false;
                        y10.i = 1;
                        arrayList10.add(y10);
                        l41 y11 = l41.y(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        y11.K(m0Var.F.reply);
                        y11.i = 1;
                        arrayList10.add(y11);
                        l41 y12 = l41.y(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        y12.K(m0Var.F.read_messages);
                        y12.i = 1;
                        arrayList10.add(y12);
                        l41 y13 = l41.y(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        y13.K(m0Var.F.delete_sent_messages);
                        y13.i = 1;
                        arrayList10.add(y13);
                        l41 y14 = l41.y(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        y14.K(m0Var.F.delete_received_messages);
                        y14.i = 1;
                        arrayList10.add(y14);
                    }
                    String string5 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = m0Var.F;
                    sb4.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb4.append("/4");
                    l41 m11 = l41.m(-10, string5, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = m0Var.F;
                    m11.K(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username);
                    m11.f = !m0Var.M;
                    final int i31 = 2;
                    m11.D = new View.OnClickListener() { // from class: pf.j0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i31) {
                                case 0:
                                    m0 m0Var2 = m0Var;
                                    m0Var2.I = null;
                                    m0Var2.c.U2.N(true);
                                    m0Var2.X(true);
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
                                    m0Var3.X(true);
                                    break;
                                case 2:
                                    m0 m0Var4 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = m0Var4.F;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        m0Var4.W(-14, true, new i0(m0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        m0Var4.c.U2.N(true);
                                        m0Var4.X(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    m0 m0Var5 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = m0Var5.F;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        m0Var5.W(-17, true, new i0(m0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        m0Var5.c.U2.N(true);
                                        m0Var5.X(true);
                                        break;
                                    }
                                    break;
                                default:
                                    m0 m0Var6 = m0Var;
                                    m0Var6.F.manage_stories = !r0.manage_stories;
                                    m0Var6.c.U2.N(true);
                                    m0Var6.X(true);
                                    break;
                            }
                        }
                    };
                    arrayList10.add(m11);
                    if (m0Var.M) {
                        l41 y15 = l41.y(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        y15.K(m0Var.F.edit_name);
                        y15.i = 1;
                        arrayList10.add(y15);
                        l41 y16 = l41.y(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        y16.K(m0Var.F.edit_bio);
                        y16.i = 1;
                        arrayList10.add(y16);
                        l41 y17 = l41.y(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        y17.K(m0Var.F.edit_profile_photo);
                        y17.i = 1;
                        arrayList10.add(y17);
                        l41 y18 = l41.y(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        y18.K(m0Var.F.edit_username);
                        y18.i = 1;
                        arrayList10.add(y18);
                    }
                    String string6 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb5 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = m0Var.F;
                    sb5.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb5.append("/5");
                    l41 m12 = l41.m(-15, string6, sb5.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = m0Var.F;
                    m12.K(tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars);
                    m12.f = !m0Var.N;
                    final int i32 = 3;
                    m12.D = new View.OnClickListener() { // from class: pf.j0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i32) {
                                case 0:
                                    m0 m0Var2 = m0Var;
                                    m0Var2.I = null;
                                    m0Var2.c.U2.N(true);
                                    m0Var2.X(true);
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
                                    m0Var3.X(true);
                                    break;
                                case 2:
                                    m0 m0Var4 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = m0Var4.F;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        m0Var4.W(-14, true, new i0(m0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        m0Var4.c.U2.N(true);
                                        m0Var4.X(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    m0 m0Var5 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = m0Var5.F;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        m0Var5.W(-17, true, new i0(m0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        m0Var5.c.U2.N(true);
                                        m0Var5.X(true);
                                        break;
                                    }
                                    break;
                                default:
                                    m0 m0Var6 = m0Var;
                                    m0Var6.F.manage_stories = !r0.manage_stories;
                                    m0Var6.c.U2.N(true);
                                    m0Var6.X(true);
                                    break;
                            }
                        }
                    };
                    arrayList10.add(m12);
                    if (m0Var.N) {
                        l41 y19 = l41.y(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        y19.K(m0Var.F.view_gifts);
                        y19.i = 1;
                        arrayList10.add(y19);
                        l41 y20 = l41.y(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        y20.K(m0Var.F.sell_gifts);
                        y20.i = 1;
                        arrayList10.add(y20);
                        l41 y21 = l41.y(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        y21.K(m0Var.F.change_gift_settings);
                        y21.i = 1;
                        arrayList10.add(y21);
                        l41 y22 = l41.y(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        y22.K(m0Var.F.transfer_and_upgrade_gifts);
                        y22.i = 1;
                        arrayList10.add(y22);
                        l41 y23 = l41.y(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        y23.K(m0Var.F.transfer_stars);
                        y23.i = 1;
                        arrayList10.add(y23);
                    }
                    l41 m13 = l41.m(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), "");
                    m13.K(m0Var.F.manage_stories);
                    final int i33 = 4;
                    m13.D = new View.OnClickListener() { // from class: pf.j0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i33) {
                                case 0:
                                    m0 m0Var2 = m0Var;
                                    m0Var2.I = null;
                                    m0Var2.c.U2.N(true);
                                    m0Var2.X(true);
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
                                    m0Var3.X(true);
                                    break;
                                case 2:
                                    m0 m0Var4 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = m0Var4.F;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        m0Var4.W(-14, true, new i0(m0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        m0Var4.c.U2.N(true);
                                        m0Var4.X(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    m0 m0Var5 = m0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = m0Var5.F;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        m0Var5.W(-17, true, new i0(m0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        m0Var5.c.U2.N(true);
                                        m0Var5.X(true);
                                        break;
                                    }
                                    break;
                                default:
                                    m0 m0Var6 = m0Var;
                                    m0Var6.F.manage_stories = !r0.manage_stories;
                                    m0Var6.c.U2.N(true);
                                    m0Var6.X(true);
                                    break;
                            }
                        }
                    };
                    arrayList10.add(m13);
                    z41Var3.T();
                    arrayList10.add(l41.A(-4, null));
                    arrayList10.add(l41.A(-5, null));
                    arrayList10.add(l41.A(-6, null));
                    arrayList10.add(l41.A(-7, null));
                    break;
                }
                break;
            case 19:
                pf.o0.T((pf.o0) obj3, (ArrayList) obj, (z41) obj2);
                break;
            case 20:
                a(obj, obj2);
                break;
            case 21:
                pf.y0.U((pf.y0) obj3, (ArrayList) obj);
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
                qh.o3 o3Var = (qh.o3) obj3;
                ((Integer) obj).getClass();
                ArrayList arrayList11 = (ArrayList) obj2;
                ArrayList arrayList12 = o3Var.h3;
                ArrayList arrayList13 = new ArrayList(arrayList11.size());
                int size2 = arrayList11.size();
                int i34 = 0;
                while (i34 < size2) {
                    Object obj5 = arrayList11.get(i34);
                    i34++;
                    Object obj6 = ((l41) obj5).G;
                    if (obj6 instanceof qh.a) {
                        arrayList13.add((qh.a) obj6);
                    }
                }
                if (arrayList13.size() >= 2) {
                    ArrayList arrayList14 = new ArrayList();
                    int size3 = arrayList13.size();
                    int i35 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i36 = 0;
                    int i37 = 0;
                    while (i37 < size3) {
                        Object obj7 = arrayList13.get(i37);
                        i37++;
                        qh.a aVar = (qh.a) obj7;
                        int indexOf = arrayList12.indexOf(aVar);
                        if (indexOf < 0) {
                            break;
                        } else {
                            int i38 = indexOf + 1;
                            if (qh.o3.x3(aVar) && !((TL_iv.pageBlockDetails) aVar.b).open) {
                                int P3 = o3Var.P3(indexOf);
                                i38 = P3 >= arrayList12.size() ? arrayList12.size() : P3 + 1;
                            }
                            arrayList14.add(new ArrayList(arrayList12.subList(indexOf, i38)));
                            i35 = Math.min(i35, indexOf);
                            i12 = Math.max(i12, i38);
                            i36 += i38 - indexOf;
                        }
                    }
                    if (i36 == i12 - i35) {
                        ArrayList arrayList15 = new ArrayList(i36);
                        int size4 = arrayList14.size();
                        int i39 = 0;
                        while (i39 < size4) {
                            Object obj8 = arrayList14.get(i39);
                            i39++;
                            arrayList15.addAll((ArrayList) obj8);
                        }
                        for (int i40 = 0; i40 < arrayList15.size(); i40++) {
                            if (arrayList12.get(i35 + i40) != arrayList15.get(i40)) {
                                qh.b2 b2Var2 = o3Var.F3;
                                if (b2Var2 != null) {
                                    b2Var2.d();
                                }
                                for (int i41 = 0; i41 < arrayList15.size(); i41++) {
                                    arrayList12.set(i35 + i41, (qh.a) arrayList15.get(i41));
                                }
                                qh.a aVar2 = o3Var.O3;
                                ArrayList arrayList16 = qh.o3.o4;
                                if (aVar2 != null) {
                                    ArrayList arrayList17 = aVar2.k;
                                    int indexOf2 = arrayList12.indexOf(aVar2);
                                    if (indexOf2 >= 0) {
                                        ArrayList arrayList18 = indexOf2 > 0 ? ((qh.a) arrayList12.get(indexOf2 - 1)).k : arrayList16;
                                        int i42 = indexOf2 + 1;
                                        if (i42 < arrayList12.size()) {
                                            arrayList16 = ((qh.a) arrayList12.get(i42)).k;
                                        }
                                        if (arrayList18.size() < arrayList16.size()) {
                                            arrayList18 = arrayList16;
                                        }
                                        if (!arrayList17.equals(arrayList18)) {
                                            arrayList17.clear();
                                            arrayList17.addAll(arrayList18);
                                            z11 = true;
                                            boolean x22 = o3Var.x2();
                                            i10 = 0;
                                            while (i10 < arrayList12.size()) {
                                                qh.a aVar3 = (qh.a) arrayList12.get(i10);
                                                if (!aVar3.i && !qh.o3.x3(aVar3)) {
                                                    qh.a aVar4 = i10 > 0 ? (qh.a) arrayList12.get(i10 - 1) : null;
                                                    int max = aVar4 != null ? Math.max(0, aVar4.c) : 0;
                                                    if (qh.o3.E3(aVar3.b)) {
                                                        aVar3.c = max;
                                                        if (max > 0) {
                                                            aVar3.d = aVar4.d > 0 ? 1 : 0;
                                                            aVar3.e = false;
                                                            aVar3.f = false;
                                                        }
                                                    } else {
                                                        int i43 = max + 1;
                                                        if (aVar3.c > i43) {
                                                            aVar3.c = i43;
                                                        }
                                                    }
                                                    if (aVar3.c <= 0) {
                                                        aVar3.c = 0;
                                                        aVar3.d = 0;
                                                        aVar3.e = false;
                                                        aVar3.f = false;
                                                    }
                                                }
                                                i10++;
                                            }
                                            o3Var.s4();
                                            o3Var.a2();
                                            if (!z11 || x22) {
                                                o3Var.U2.N(true);
                                                o3Var.x4();
                                            } else {
                                                o3Var.x4();
                                            }
                                            b2Var = o3Var.F3;
                                            if (b2Var == null) {
                                                b2Var.h();
                                                break;
                                            }
                                        }
                                    }
                                }
                                z11 = false;
                                boolean x222 = o3Var.x2();
                                i10 = 0;
                                while (i10 < arrayList12.size()) {
                                }
                                o3Var.s4();
                                o3Var.a2();
                                if (z11) {
                                }
                                o3Var.U2.N(true);
                                o3Var.x4();
                                b2Var = o3Var.F3;
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
