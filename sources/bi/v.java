package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.car.app.navigation.model.Maneuver;
import ci.a4;
import ci.e2;
import ci.kc;
import ci.l8;
import ci.lc;
import ci.m8;
import ci.nb;
import ci.oc;
import ci.q6;
import ci.s2;
import ci.s8;
import ci.u8;
import ci.z1;
import ci.zb;
import ei.e4;
import ei.e5;
import ei.f5;
import ei.k3;
import ei.m2;
import ei.p1;
import gg.i0;
import hg.c0;
import hg.f1;
import hg.g1;
import hg.h1;
import hg.j1;
import hg.m0;
import hg.v0;
import hg.x0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.ry;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        Utilities.Callback callback;
        char c10;
        String str;
        String upperCase;
        boolean z10;
        v51 v51Var;
        int i10;
        String str2;
        String str3;
        int i11 = this.a;
        String str4 = "";
        boolean z11 = false;
        z11 = false;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                ((y) obj3).getClass();
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                int size = languages.size();
                int i12 = 0;
                while (i12 < size) {
                    TranslateController.Language language = languages.get(i12);
                    i12++;
                    int i13 = w.a;
                    h51 J = h51.J(w.class);
                    J.G = language;
                    arrayList.add(J);
                }
                break;
            case 1:
                ci.m mVar = (ci.m) obj3;
                Canvas canvas = (Canvas) obj;
                Runnable runnable = (Runnable) obj2;
                Paint paint = mVar.I;
                RectF rectF = mVar.z0;
                ci.g gVar = mVar.f;
                if (mVar.g()) {
                    if (mVar.G == null) {
                        runnable.run();
                        break;
                    } else {
                        canvas.translate(-gVar.getEditText().hintLayoutX, 0.0f);
                        canvas.saveLayerAlpha(0.0f, 0.0f, mVar.G.getWidth(), mVar.G.getHeight(), 255, 31);
                        rectF.set(0.0f, 1.0f, mVar.G.getWidth(), mVar.G.getHeight() - 1);
                        mVar.h(mVar.P, canvas, rectF, 0.0f, true, (-gVar.getX()) - r1.getPaddingLeft(), ((-gVar.getY()) - r1.getPaddingTop()) - r1.getExtendedPaddingTop(), true);
                        canvas.save();
                        paint.setAlpha(165);
                        canvas.drawBitmap(mVar.G, 0.0f, 0.0f, paint);
                        canvas.restore();
                        canvas.restore();
                        break;
                    }
                } else {
                    Paint c11 = mVar.P.c(1.0f);
                    gVar.getEditText().setHintColor(c11 == null ? -2130706433 : -1);
                    if (c11 == null) {
                        runnable.run();
                        break;
                    } else {
                        cu editText = gVar.getEditText();
                        canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), 255, 31);
                        runnable.run();
                        canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), c11);
                        canvas.restore();
                        break;
                    }
                }
            case 2:
                z1 z1Var = (z1) obj3;
                String str5 = (String) obj;
                s2 s2Var = z1Var.r;
                s2Var.b = str5;
                s2Var.c = ((Integer) obj2).intValue();
                z1Var.c.H(str5);
                break;
            case 3:
                e2 e2Var = (e2) obj3;
                String str6 = (String) obj;
                s2 s2Var2 = e2Var.s;
                s2Var2.b = str6;
                s2Var2.c = ((Integer) obj2).intValue();
                e2Var.c.D(str6);
                break;
            case 4:
                a4 a4Var = (a4) obj3;
                if (obj != null) {
                    if (a4Var.e == null && (obj instanceof MediaController.PhotoEntry) && (callback = a4Var.f) != null) {
                        callback.run((MediaController.PhotoEntry) obj);
                        break;
                    }
                } else {
                    a4Var.getClass();
                    break;
                }
                break;
            case 5:
                q6 q6Var = (q6) obj3;
                q6Var.d0(q6Var.j0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
            case 6:
                ((kc) obj3).Z((Bitmap) obj, ((Float) obj2).floatValue());
                break;
            case 7:
                u8 u8Var = (u8) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                if (u8Var.h0 || u8Var.g0 != null) {
                    TLRPC.WebPage webPage = u8Var.g0;
                    m8 m8Var = new m8(u8Var, 0);
                    int i14 = s8.a;
                    h51 J2 = h51.J(s8.class);
                    J2.G = webPage;
                    J2.D = m8Var;
                    arrayList2.add(J2);
                }
                arrayList2.add(h51.k(u8Var.Y));
                arrayList2.add(h51.A(1, null));
                h51 i15 = h51.i(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                i15.K(u8Var.m0);
                arrayList2.add(i15);
                if (u8Var.m0) {
                    arrayList2.add(h51.k(u8Var.Z));
                }
                arrayList2.add(h51.A(3, null));
                arrayList2.add(h51.k(u8Var.a0));
                break;
            case 8:
                lc lcVar = (lc) obj3;
                Float f7 = (Float) obj2;
                long duration = lcVar.X0.getDuration() < 100 ? lcVar.K1.h0 : lcVar.X0.getDuration();
                float floatValue = ((f7.floatValue() / 0.96f) * 0.04f) + f7.floatValue();
                l8 l8Var = lcVar.K1;
                float f10 = l8Var.a0;
                float f11 = l8Var.Z;
                float f12 = (f10 - f11) * floatValue;
                float f13 = duration;
                long j3 = (long) (f12 * f13);
                zb zbVar = lcVar.X0;
                long j10 = (long) ((f11 * f13) + j3);
                lcVar.M1 = j10;
                zbVar.m(j10);
                nb nbVar = lcVar.v1;
                if (nbVar != null) {
                    nbVar.setCoverTime(lcVar.M1);
                }
                l8 l8Var2 = lcVar.K1;
                if (l8Var2 != null && l8Var2.g) {
                    l8Var2.j = true;
                    break;
                }
                break;
            case 9:
                ((oc) obj3).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 10:
                ((di.i) obj3).C0((ArrayList) obj, (v51) obj2);
                break;
            case 11:
                di.h hVar = (di.h) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(h51.k(hVar.Y));
                arrayList3.add(h51.k(hVar.Z));
                break;
            case 12:
                ((ei.l) obj3).E0((ArrayList) obj, (v51) obj2);
                break;
            case 13:
                ei.u.U((ei.u) obj3, (ArrayList) obj);
                break;
            case 14:
                p6 p6Var = (p6) obj3;
                String str7 = (String) obj;
                Long l4 = (Long) obj2;
                StringBuilder sb2 = new StringBuilder();
                if (l4.longValue() > 0) {
                    sb2.append("~");
                    sb2.append(AndroidUtilities.formatFileSize(l4.longValue()));
                }
                if (str7 == null) {
                    upperCase = null;
                } else {
                    if (!str7.isEmpty()) {
                        switch (str7.hashCode()) {
                            case -2008589971:
                                if (str7.equals("application/epub+zip")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1719571662:
                                if (str7.equals("application/vnd.oasis.opendocument.text")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1664118616:
                                if (str7.equals("video/3gpp")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1578389996:
                                if (str7.equals("application/vnd.ms-fontobject")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1348237359:
                                if (str7.equals("application/x-cdf")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1348236892:
                                if (str7.equals("application/x-csh")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1079884372:
                                if (str7.equals("video/x-msvideo")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1073633483:
                                if (str7.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                                    c10 = 7;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1071817359:
                                if (str7.equals("application/vnd.ms-powerpoint")) {
                                    c10 = '\b';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1050893613:
                                if (str7.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                                    c10 = '\t';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1007601745:
                                if (str7.equals("audio/x-midi")) {
                                    c10 = '\n';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -958424608:
                                if (str7.equals("text/calendar")) {
                                    c10 = 11;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -816908365:
                                if (str7.equals("application/x-httpd-php")) {
                                    c10 = '\f';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -648684635:
                                if (str7.equals("audio/3gpp2")) {
                                    c10 = '\r';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -433129473:
                                if (str7.equals("application/vnd.apple.installer+xml")) {
                                    c10 = 14;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -366307023:
                                if (str7.equals("application/vnd.ms-excel")) {
                                    c10 = 15;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -48069494:
                                if (str7.equals("video/3gpp2")) {
                                    c10 = 16;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -43923783:
                                if (str7.equals("application/gzip")) {
                                    c10 = 17;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -43491031:
                                if (str7.equals("application/x-sh")) {
                                    c10 = 18;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 187091926:
                                if (str7.equals("audio/ogg")) {
                                    c10 = 19;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 817335912:
                                if (str7.equals("text/plain")) {
                                    c10 = 20;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 859118878:
                                if (str7.equals("application/x-abiword")) {
                                    c10 = 21;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 886992732:
                                if (str7.equals("application/ld+json")) {
                                    c10 = 22;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 904647503:
                                if (str7.equals("application/msword")) {
                                    c10 = 23;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1154306387:
                                if (str7.equals("application/x-bzip")) {
                                    c10 = 24;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1154455342:
                                if (str7.equals("application/x-gzip")) {
                                    c10 = 25;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1178484637:
                                if (str7.equals("application/octet-stream")) {
                                    c10 = 26;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1423759679:
                                if (str7.equals("application/x-bzip2")) {
                                    c10 = 27;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1436962847:
                                if (str7.equals("application/vnd.oasis.opendocument.presentation")) {
                                    c10 = 28;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1454024983:
                                if (str7.equals("application/x-7z-compressed")) {
                                    c10 = 29;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1455492626:
                                if (str7.equals("application/x-freearc")) {
                                    c10 = 30;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1503095341:
                                if (str7.equals("audio/3gpp")) {
                                    c10 = 31;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1504831518:
                                if (str7.equals("audio/mpeg")) {
                                    c10 = ' ';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1509238306:
                                if (str7.equals("application/vnd.rar")) {
                                    c10 = '!';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1578362927:
                                if (str7.equals("image/vnd.microsoft.icon")) {
                                    c10 = '\"';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1643664935:
                                if (str7.equals("application/vnd.oasis.opendocument.spreadsheet")) {
                                    c10 = '#';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1672200517:
                                if (str7.equals("application/vnd.amazon.ebook")) {
                                    c10 = '$';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1993842850:
                                if (str7.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                                    c10 = '%';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2049276534:
                                if (str7.equals("application/java-archive")) {
                                    c10 = '&';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2132236175:
                                if (str7.equals("text/javascript")) {
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
                                if (str7.contains("/")) {
                                    str7 = str7.substring(str7.indexOf("/") + 1);
                                }
                                if (str7.contains("-")) {
                                    str7 = str7.substring(str7.indexOf("-") + 1);
                                }
                                if (str7.contains("+")) {
                                    str7 = str7.substring(0, str7.indexOf("+"));
                                }
                                str = str7.toLowerCase();
                                break;
                        }
                    } else {
                        str = "";
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
                p6Var.setText(sb2);
                break;
            case 15:
                p1 p1Var = (p1) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                arrayList4.add(h51.j(-1, p1Var.a0));
                arrayList4.add(h51.B(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, p1Var.Y))));
                break;
            case 16:
                k3 k3Var = (k3) obj3;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    k3Var.getClass();
                    break;
                } else {
                    f5 f5Var = k3Var.v0;
                    if (f5Var != null) {
                        f5Var.a(tL_webViewResultUrl);
                        k3Var.n();
                        break;
                    }
                }
                break;
            case 17:
                ((e4) obj3).F0((ArrayList) obj, (v51) obj2);
                break;
            case 18:
                ((e5) obj3).U((ArrayList) obj, (v51) obj2);
                break;
            case 19:
                ((fi.s) obj3).v.c((ArrayList) obj);
                break;
            case 20:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                rn0 rn0Var = (rn0) ((i0) obj3);
                ry ryVar = rn0Var.I0;
                AndroidUtilities.hideKeyboard(ryVar.getParentActivity().getCurrentFocus());
                o70 I = o70.I(ryVar, (i6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z10 = false;
                } else {
                    o70 J3 = I.J();
                    J3.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ac0(I, 24), false);
                    J3.k();
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                        J3.p(13, -1, tL_sponsoredPeer.sponsor_info);
                    }
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                        if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                            J3.k();
                        }
                        J3.p(13, -1, tL_sponsoredPeer.additional_info);
                    }
                    int i16 = R.drawable.msg_channel;
                    String string = LocaleController.getString(R.string.SponsoredMessageSponsorReportable);
                    m2 m2Var = new m2(I, J3, 8);
                    z10 = false;
                    I.c(i16, string, m2Var, false);
                }
                I.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new m5(rn0Var, ryVar, rn0Var.J0, I, 29), z10);
                I.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new jn0(rn0Var, ryVar, tL_sponsoredPeer, I, 0), z10);
                I.k();
                I.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new org.telegram.ui.ActionBar.p(rn0Var, ryVar, I, 28), z10);
                I.V(LocaleController.isRTL ? 3 : 5);
                I.Y = true;
                I.t = z10;
                I.Z();
                break;
            case 21:
                hg.d.U((hg.d) obj3, (ArrayList) obj, (v51) obj2);
                break;
            case 22:
                hg.n nVar = (hg.n) obj3;
                nVar.L.dismiss();
                nVar.y = (String) obj;
                nVar.E = (TLRPC.InputDocument) obj2;
                nVar.w = false;
                AndroidUtilities.cancelRunOnUIThread(nVar.d);
                nVar.n.setSticker(nVar.y);
                nVar.e0(true);
                x51 x51Var = nVar.a;
                if (x51Var != null && (v51Var = x51Var.Y2) != null) {
                    v51Var.N(true);
                    break;
                }
                break;
            case 23:
                m0 m0Var = (m0) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                v51 v51Var2 = (v51) obj2;
                v51Var2.E = 1;
                LinearLayout linearLayout = m0Var.a0;
                h51 h51Var = new h51(-4);
                h51Var.d = -5;
                h51Var.c = linearLayout;
                h51Var.z = -1;
                arrayList5.add(h51Var);
                TL_account.TL_connectedBot tL_connectedBot = m0Var.X;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        com.google.android.gms.internal.vision.e2.n(R.string.SessionBotConnectedFrom, arrayList5);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList5.add(h51.f(LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i10 = 2;
                            arrayList5.add(h51.f(LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location, 2));
                        } else {
                            i10 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i10)) {
                            arrayList5.add(h51.f(LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false), 3));
                        }
                        arrayList5.add(h51.B(null));
                    }
                    v51Var2.U();
                    com.google.android.gms.internal.vision.e2.n(R.string.BusinessBotChats2, arrayList5);
                    int i17 = m0.g0;
                    h51 w10 = h51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    w10.K(m0Var.e0);
                    arrayList5.add(w10);
                    int i18 = m0.h0;
                    h51 w11 = h51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    w11.K(!m0Var.e0);
                    arrayList5.add(w11);
                    v51Var2.T();
                    arrayList5.add(h51.B(null));
                    c0 c0Var = m0Var.Z;
                    if (c0Var != null) {
                        c0Var.a(arrayList5, v51Var2, true);
                    }
                    hg.c.p(R.string.BusinessBotChatsInfo2, arrayList5);
                    break;
                }
                break;
            case 24:
                final v0 v0Var = (v0) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                v51 v51Var3 = (v51) obj2;
                LongSparseArray longSparseArray = v0Var.N;
                String string2 = LocaleController.getString(R.string.BusinessBots2);
                String string3 = LocaleController.getString(R.string.BusinessBots2Info);
                h51 h51Var2 = new h51(2);
                h51Var2.l = string2;
                h51Var2.o = string3;
                h51Var2.m = AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2;
                h51Var2.n = "🤖🏝️";
                h51Var2.z = 120;
                arrayList6.add(h51Var2);
                if (v0Var.M != null) {
                    v51Var3.U();
                    long j11 = v0Var.M.id;
                    h51 h51Var3 = new h51(13);
                    h51Var3.x = j11;
                    h51Var3.K(true);
                    final int i19 = z11 ? 1 : 0;
                    h51Var3.D = new View.OnClickListener() { // from class: hg.q0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i19) {
                                case 0:
                                    v0 v0Var2 = v0Var;
                                    v0Var2.M = null;
                                    v0Var2.c.Y2.N(true);
                                    v0Var2.Y(true);
                                    break;
                                case 1:
                                    v0 v0Var3 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights = v0Var3.J;
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
                                    v0Var3.c.Y2.N(true);
                                    v0Var3.Y(true);
                                    break;
                                case 2:
                                    v0 v0Var4 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = v0Var4.J;
                                    if (!tL_businessBotRights2.edit_name || !tL_businessBotRights2.edit_bio || !tL_businessBotRights2.edit_profile_photo || !tL_businessBotRights2.edit_username) {
                                        v0Var4.X(-14, true, new o0(v0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        v0Var4.c.Y2.N(true);
                                        v0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    v0 v0Var5 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = v0Var5.J;
                                    if (!tL_businessBotRights3.view_gifts || !tL_businessBotRights3.sell_gifts || !tL_businessBotRights3.change_gift_settings || !tL_businessBotRights3.transfer_and_upgrade_gifts || !tL_businessBotRights3.transfer_stars) {
                                        v0Var5.X(-17, true, new o0(v0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        v0Var5.c.Y2.N(true);
                                        v0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    v0 v0Var6 = v0Var;
                                    v0Var6.J.manage_stories = !r0.manage_stories;
                                    v0Var6.c.Y2.N(true);
                                    v0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(h51Var3);
                    v51Var3.T();
                    str2 = "";
                } else {
                    v51Var3.U();
                    arrayList6.add(h51.k(v0Var.e));
                    longSparseArray.clear();
                    int i20 = 0;
                    boolean z12 = false;
                    while (i20 < v0Var.d.d.size()) {
                        TLObject tLObject = (TLObject) v0Var.d.d.get(i20);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                str3 = str4;
                                long j12 = user.id;
                                String str8 = v0Var.y;
                                h51 h51Var4 = new h51(13);
                                h51Var4.x = j12;
                                h51Var4.n = str8;
                                arrayList6.add(h51Var4);
                                longSparseArray.put(user.id, user);
                                z12 = true;
                                i20++;
                                str4 = str3;
                            }
                        }
                        str3 = str4;
                        i20++;
                        str4 = str3;
                    }
                    str2 = str4;
                    for (int i21 = 0; i21 < v0Var.d.e.size(); i21++) {
                        TLObject tLObject2 = (TLObject) v0Var.d.e.get(i21);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j13 = user2.id;
                                String str9 = v0Var.y;
                                h51 h51Var5 = new h51(13);
                                h51Var5.x = j13;
                                h51Var5.n = str9;
                                arrayList6.add(h51Var5);
                                longSparseArray.put(user2.id, user2);
                                z12 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(v0Var.f.getText().toString()) || v0Var.d.e() || v0Var.x)) {
                        arrayList6.add(h51.k(v0Var.n));
                        z12 = true;
                    }
                    v0Var.h.setVisibility(z12 ? 0 : 8);
                    v51Var3.T();
                }
                arrayList6.add(h51.B(LocaleController.getString(R.string.BusinessBotLinkInfo2)));
                v51Var3.U();
                h51 t10 = h51.t(LocaleController.getString(R.string.BusinessBotChats2));
                t10.g = v0Var.M != null;
                arrayList6.add(t10);
                h51 w12 = h51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                w12.K(v0Var.I);
                w12.g = v0Var.M != null;
                arrayList6.add(w12);
                h51 w13 = h51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                w13.K(!v0Var.I);
                w13.g = v0Var.M != null;
                arrayList6.add(w13);
                v51Var3.T();
                arrayList6.add(h51.B(null));
                v0Var.v.a(arrayList6, v51Var3, v0Var.M != null);
                hg.c.p(R.string.BusinessBotChatsInfo2, arrayList6);
                if (v0Var.M != null) {
                    v51Var3.U();
                    com.google.android.gms.internal.vision.e2.n(R.string.BusinessBotPermissions, arrayList6);
                    String string4 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = v0Var.J;
                    sb3.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb3.append("/5");
                    h51 m10 = h51.m(-4, string4, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = v0Var.J;
                    m10.K(tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages);
                    m10.f = !v0Var.P;
                    final int i22 = 1;
                    m10.D = new View.OnClickListener() { // from class: hg.q0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i22) {
                                case 0:
                                    v0 v0Var2 = v0Var;
                                    v0Var2.M = null;
                                    v0Var2.c.Y2.N(true);
                                    v0Var2.Y(true);
                                    break;
                                case 1:
                                    v0 v0Var3 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = v0Var3.J;
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
                                    v0Var3.c.Y2.N(true);
                                    v0Var3.Y(true);
                                    break;
                                case 2:
                                    v0 v0Var4 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = v0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        v0Var4.X(-14, true, new o0(v0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        v0Var4.c.Y2.N(true);
                                        v0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    v0 v0Var5 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = v0Var5.J;
                                    if (!tL_businessBotRights32.view_gifts || !tL_businessBotRights32.sell_gifts || !tL_businessBotRights32.change_gift_settings || !tL_businessBotRights32.transfer_and_upgrade_gifts || !tL_businessBotRights32.transfer_stars) {
                                        v0Var5.X(-17, true, new o0(v0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        v0Var5.c.Y2.N(true);
                                        v0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    v0 v0Var6 = v0Var;
                                    v0Var6.J.manage_stories = !r0.manage_stories;
                                    v0Var6.c.Y2.N(true);
                                    v0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(m10);
                    if (v0Var.P) {
                        h51 y3 = h51.y(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        y3.K(true);
                        y3.g = false;
                        y3.i = 1;
                        arrayList6.add(y3);
                        h51 y10 = h51.y(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        y10.K(v0Var.J.reply);
                        y10.i = 1;
                        arrayList6.add(y10);
                        h51 y11 = h51.y(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        y11.K(v0Var.J.read_messages);
                        y11.i = 1;
                        arrayList6.add(y11);
                        h51 y12 = h51.y(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        y12.K(v0Var.J.delete_sent_messages);
                        y12.i = 1;
                        arrayList6.add(y12);
                        h51 y13 = h51.y(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        y13.K(v0Var.J.delete_received_messages);
                        y13.i = 1;
                        arrayList6.add(y13);
                    }
                    String string5 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = v0Var.J;
                    sb4.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb4.append("/4");
                    h51 m11 = h51.m(-10, string5, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = v0Var.J;
                    m11.K(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username);
                    m11.f = !v0Var.Q;
                    final int i23 = 2;
                    m11.D = new View.OnClickListener() { // from class: hg.q0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i23) {
                                case 0:
                                    v0 v0Var2 = v0Var;
                                    v0Var2.M = null;
                                    v0Var2.c.Y2.N(true);
                                    v0Var2.Y(true);
                                    break;
                                case 1:
                                    v0 v0Var3 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = v0Var3.J;
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
                                    v0Var3.c.Y2.N(true);
                                    v0Var3.Y(true);
                                    break;
                                case 2:
                                    v0 v0Var4 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = v0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        v0Var4.X(-14, true, new o0(v0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        v0Var4.c.Y2.N(true);
                                        v0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    v0 v0Var5 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = v0Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        v0Var5.X(-17, true, new o0(v0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        v0Var5.c.Y2.N(true);
                                        v0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    v0 v0Var6 = v0Var;
                                    v0Var6.J.manage_stories = !r0.manage_stories;
                                    v0Var6.c.Y2.N(true);
                                    v0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(m11);
                    if (v0Var.Q) {
                        h51 y14 = h51.y(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        y14.K(v0Var.J.edit_name);
                        y14.i = 1;
                        arrayList6.add(y14);
                        h51 y15 = h51.y(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        y15.K(v0Var.J.edit_bio);
                        y15.i = 1;
                        arrayList6.add(y15);
                        h51 y16 = h51.y(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        y16.K(v0Var.J.edit_profile_photo);
                        y16.i = 1;
                        arrayList6.add(y16);
                        h51 y17 = h51.y(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        y17.K(v0Var.J.edit_username);
                        y17.i = 1;
                        arrayList6.add(y17);
                    }
                    String string6 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb5 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = v0Var.J;
                    sb5.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb5.append("/5");
                    h51 m12 = h51.m(-15, string6, sb5.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = v0Var.J;
                    m12.K(tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars);
                    m12.f = !v0Var.R;
                    final int i24 = 3;
                    m12.D = new View.OnClickListener() { // from class: hg.q0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i24) {
                                case 0:
                                    v0 v0Var2 = v0Var;
                                    v0Var2.M = null;
                                    v0Var2.c.Y2.N(true);
                                    v0Var2.Y(true);
                                    break;
                                case 1:
                                    v0 v0Var3 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = v0Var3.J;
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
                                    v0Var3.c.Y2.N(true);
                                    v0Var3.Y(true);
                                    break;
                                case 2:
                                    v0 v0Var4 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = v0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        v0Var4.X(-14, true, new o0(v0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        v0Var4.c.Y2.N(true);
                                        v0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    v0 v0Var5 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = v0Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        v0Var5.X(-17, true, new o0(v0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        v0Var5.c.Y2.N(true);
                                        v0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    v0 v0Var6 = v0Var;
                                    v0Var6.J.manage_stories = !r0.manage_stories;
                                    v0Var6.c.Y2.N(true);
                                    v0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(m12);
                    if (v0Var.R) {
                        h51 y18 = h51.y(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        y18.K(v0Var.J.view_gifts);
                        y18.i = 1;
                        arrayList6.add(y18);
                        h51 y19 = h51.y(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        y19.K(v0Var.J.sell_gifts);
                        y19.i = 1;
                        arrayList6.add(y19);
                        h51 y20 = h51.y(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        y20.K(v0Var.J.change_gift_settings);
                        y20.i = 1;
                        arrayList6.add(y20);
                        h51 y21 = h51.y(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        y21.K(v0Var.J.transfer_and_upgrade_gifts);
                        y21.i = 1;
                        arrayList6.add(y21);
                        h51 y22 = h51.y(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        y22.K(v0Var.J.transfer_stars);
                        y22.i = 1;
                        arrayList6.add(y22);
                    }
                    h51 m13 = h51.m(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), str2);
                    m13.K(v0Var.J.manage_stories);
                    final int i25 = 4;
                    m13.D = new View.OnClickListener() { // from class: hg.q0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i25) {
                                case 0:
                                    v0 v0Var2 = v0Var;
                                    v0Var2.M = null;
                                    v0Var2.c.Y2.N(true);
                                    v0Var2.Y(true);
                                    break;
                                case 1:
                                    v0 v0Var3 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = v0Var3.J;
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
                                    v0Var3.c.Y2.N(true);
                                    v0Var3.Y(true);
                                    break;
                                case 2:
                                    v0 v0Var4 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = v0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        v0Var4.X(-14, true, new o0(v0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        v0Var4.c.Y2.N(true);
                                        v0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    v0 v0Var5 = v0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = v0Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        v0Var5.X(-17, true, new o0(v0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        v0Var5.c.Y2.N(true);
                                        v0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    v0 v0Var6 = v0Var;
                                    v0Var6.J.manage_stories = !r0.manage_stories;
                                    v0Var6.c.Y2.N(true);
                                    v0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(m13);
                    v51Var3.T();
                    arrayList6.add(h51.A(-4, null));
                    arrayList6.add(h51.A(-5, null));
                    arrayList6.add(h51.A(-6, null));
                    arrayList6.add(h51.A(-7, null));
                    break;
                }
                break;
            case 25:
                x0.U((x0) obj3, (ArrayList) obj, (v51) obj2);
                break;
            case 26:
                f1 f1Var = (f1) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                String string7 = LocaleController.getString(R.string.BusinessLocation);
                String string8 = LocaleController.getString(R.string.BusinessLocationInfo);
                int i26 = R.raw.biz_map;
                h51 h51Var6 = new h51(2);
                h51Var6.l = string7;
                h51Var6.o = string8;
                h51Var6.k = i26;
                arrayList7.add(h51Var6);
                arrayList7.add(h51.k(f1Var.e));
                arrayList7.add(h51.B(null));
                h51 i27 = h51.i(1, LocaleController.getString(R.string.BusinessLocationMap));
                i27.K(f1Var.x != null);
                arrayList7.add(i27);
                if (f1Var.x != null) {
                    arrayList7.add(h51.k(f1Var.h));
                }
                arrayList7.add(h51.B(null));
                if (f1Var.w != null && (f1Var.x != null || !TextUtils.isEmpty(f1Var.y))) {
                    z11 = true;
                }
                f1Var.G = z11;
                if (z11) {
                    h51 e = h51.e(2, LocaleController.getString(R.string.BusinessLocationClear));
                    e.r = true;
                    arrayList7.add(e);
                    arrayList7.add(h51.B(null));
                }
                f1Var.U(true);
                break;
            case 27:
                h1.V((h1) obj3, (ArrayList) obj);
                break;
            default:
                j1 j1Var = (j1) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = j1Var.b;
                String string9 = LocaleController.getString(R.string.BusinessHoursDayOpen);
                h51 h51Var7 = new h51(9);
                h51Var7.d = -1;
                h51Var7.l = string9;
                h51Var7.K(j1Var.r);
                arrayList8.add(h51Var7);
                arrayList8.add(h51.B(null));
                if (j1Var.r) {
                    for (int i28 = 0; i28 < arrayList9.size(); i28++) {
                        if (i28 > 0) {
                            arrayList8.add(h51.B(null));
                        }
                        g1 g1Var = (g1) arrayList9.get(i28);
                        if (!j1Var.U()) {
                            int i29 = i28 * 3;
                            arrayList8.add(h51.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), g1.a(g1Var.a), i29));
                            arrayList8.add(h51.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), g1.a(g1Var.b), i29 + 1));
                            h51 e7 = h51.e(i29 + 2, LocaleController.getString(R.string.Remove));
                            e7.r = true;
                            arrayList8.add(e7);
                        }
                    }
                    if (j1Var.V()) {
                        arrayList8.add(h51.B(null));
                        h51 c12 = h51.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                        c12.q = true;
                        arrayList8.add(c12);
                    }
                    hg.c.p(R.string.BusinessHoursDayInfo, arrayList8);
                    break;
                }
                break;
        }
    }
}
