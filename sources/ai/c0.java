package ai;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.car.app.navigation.model.Maneuver;
import bi.aa;
import bi.ad;
import bi.be;
import bi.ce;
import bi.f3;
import bi.fe;
import bi.k2;
import bi.nd;
import bi.q2;
import bi.r7;
import bi.r9;
import bi.s9;
import bi.t4;
import bi.y9;
import com.google.android.gms.internal.vision.e2;
import di.h4;
import di.i5;
import di.j5;
import di.n3;
import di.p2;
import di.s1;
import fg.h0;
import gg.a1;
import gg.k1;
import gg.l1;
import gg.m1;
import gg.o1;
import gg.p0;
import gg.y0;
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
import org.telegram.ui.Cells.j6;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w70;
import org.telegram.ui.da;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c0(Object obj, int i10) {
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
        j61 j61Var;
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
                ((f0) obj3).getClass();
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                int size = languages.size();
                int i12 = 0;
                while (i12 < size) {
                    TranslateController.Language language = languages.get(i12);
                    i12++;
                    int i13 = d0.a;
                    v51 J = v51.J(d0.class);
                    J.G = language;
                    arrayList.add(J);
                }
                break;
            case 1:
                bi.o oVar = (bi.o) obj3;
                Canvas canvas = (Canvas) obj;
                Runnable runnable = (Runnable) obj2;
                Paint paint = oVar.I;
                RectF rectF = oVar.z0;
                bi.i iVar = oVar.f;
                if (oVar.g()) {
                    if (oVar.G == null) {
                        runnable.run();
                        break;
                    } else {
                        canvas.translate(-iVar.getEditText().hintLayoutX, 0.0f);
                        canvas.saveLayerAlpha(0.0f, 0.0f, oVar.G.getWidth(), oVar.G.getHeight(), 255, 31);
                        rectF.set(0.0f, 1.0f, oVar.G.getWidth(), oVar.G.getHeight() - 1);
                        oVar.h(oVar.P, canvas, rectF, 0.0f, true, (-iVar.getX()) - r1.getPaddingLeft(), ((-iVar.getY()) - r1.getPaddingTop()) - r1.getExtendedPaddingTop(), true);
                        canvas.save();
                        paint.setAlpha(165);
                        canvas.drawBitmap(oVar.G, 0.0f, 0.0f, paint);
                        canvas.restore();
                        canvas.restore();
                        break;
                    }
                } else {
                    Paint c11 = oVar.P.c(1.0f);
                    iVar.getEditText().setHintColor(c11 == null ? -2130706433 : -1);
                    if (c11 == null) {
                        runnable.run();
                        break;
                    } else {
                        fu editText = iVar.getEditText();
                        canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), 255, 31);
                        runnable.run();
                        canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), c11);
                        canvas.restore();
                        break;
                    }
                }
            case 2:
                k2 k2Var = (k2) obj3;
                String str5 = (String) obj;
                f3 f3Var = k2Var.r;
                f3Var.b = str5;
                f3Var.c = ((Integer) obj2).intValue();
                k2Var.c.H(str5);
                break;
            case 3:
                q2 q2Var = (q2) obj3;
                String str6 = (String) obj;
                f3 f3Var2 = q2Var.s;
                f3Var2.b = str6;
                f3Var2.c = ((Integer) obj2).intValue();
                q2Var.c.D(str6);
                break;
            case 4:
                t4 t4Var = (t4) obj3;
                if (obj != null) {
                    if (t4Var.e == null && (obj instanceof MediaController.PhotoEntry) && (callback = t4Var.f) != null) {
                        callback.run((MediaController.PhotoEntry) obj);
                        break;
                    }
                } else {
                    t4Var.getClass();
                    break;
                }
                break;
            case 5:
                r7 r7Var = (r7) obj3;
                r7Var.d0(r7Var.j0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
            case 6:
                ((be) obj3).Z((Bitmap) obj, ((Float) obj2).floatValue());
                break;
            case 7:
                aa aaVar = (aa) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                if (aaVar.h0 || aaVar.g0 != null) {
                    TLRPC.WebPage webPage = aaVar.g0;
                    s9 s9Var = new s9(aaVar, 0);
                    int i14 = y9.a;
                    v51 J2 = v51.J(y9.class);
                    J2.G = webPage;
                    J2.D = s9Var;
                    arrayList2.add(J2);
                }
                arrayList2.add(v51.k(aaVar.Y));
                arrayList2.add(v51.A(1, null));
                v51 i15 = v51.i(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                i15.K(aaVar.m0);
                arrayList2.add(i15);
                if (aaVar.m0) {
                    arrayList2.add(v51.k(aaVar.Z));
                }
                arrayList2.add(v51.A(3, null));
                arrayList2.add(v51.k(aaVar.a0));
                break;
            case 8:
                ce ceVar = (ce) obj3;
                Float f7 = (Float) obj2;
                long duration = ceVar.X0.getDuration() < 100 ? ceVar.K1.h0 : ceVar.X0.getDuration();
                float floatValue = ((f7.floatValue() / 0.96f) * 0.04f) + f7.floatValue();
                r9 r9Var = ceVar.K1;
                float f10 = r9Var.a0;
                float f11 = r9Var.Z;
                float f12 = (f10 - f11) * floatValue;
                float f13 = duration;
                long j3 = (long) (f12 * f13);
                nd ndVar = ceVar.X0;
                long j10 = (long) ((f11 * f13) + j3);
                ceVar.M1 = j10;
                ndVar.m(j10);
                ad adVar = ceVar.v1;
                if (adVar != null) {
                    adVar.setCoverTime(ceVar.M1);
                }
                r9 r9Var2 = ceVar.K1;
                if (r9Var2 != null && r9Var2.g) {
                    r9Var2.j = true;
                    break;
                }
                break;
            case 9:
                ((fe) obj3).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 10:
                ((ci.j) obj3).C0((ArrayList) obj, (j61) obj2);
                break;
            case 11:
                ci.i iVar2 = (ci.i) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(v51.k(iVar2.Y));
                arrayList3.add(v51.k(iVar2.Z));
                break;
            case 12:
                ((di.m) obj3).E0((ArrayList) obj, (j61) obj2);
                break;
            case 13:
                di.x.U((di.x) obj3, (ArrayList) obj);
                break;
            case 14:
                o6 o6Var = (o6) obj3;
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
                o6Var.setText(sb2);
                break;
            case 15:
                s1 s1Var = (s1) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                arrayList4.add(v51.j(-1, s1Var.a0));
                arrayList4.add(v51.B(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, s1Var.Y))));
                break;
            case 16:
                n3 n3Var = (n3) obj3;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    n3Var.getClass();
                    break;
                } else {
                    j5 j5Var = n3Var.v0;
                    if (j5Var != null) {
                        j5Var.a(tL_webViewResultUrl);
                        n3Var.n();
                        break;
                    }
                }
                break;
            case 17:
                ((h4) obj3).F0((ArrayList) obj, (j61) obj2);
                break;
            case 18:
                ((i5) obj3).U((ArrayList) obj, (j61) obj2);
                break;
            case 19:
                ((ei.s) obj3).v.c((ArrayList) obj);
                break;
            case 20:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                ao0 ao0Var = (ao0) ((h0) obj3);
                wy wyVar = ao0Var.I0;
                AndroidUtilities.hideKeyboard(wyVar.getParentActivity().getCurrentFocus());
                w70 I = w70.I(wyVar, (j6) obj);
                if (TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) && TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z10 = false;
                } else {
                    w70 J3 = I.J();
                    J3.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new kc0(I, 24), false);
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
                    p2 p2Var = new p2(I, J3, 8);
                    z10 = false;
                    I.c(i16, string, p2Var, false);
                }
                I.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new da(ao0Var, wyVar, ao0Var.J0, I, 25), z10);
                I.c(R.drawable.msg_block2, LocaleController.getString(R.string.ReportAd), new da(ao0Var, wyVar, tL_sponsoredPeer, I, 26), z10);
                I.k();
                I.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new gf(ao0Var, wyVar, I, 20), z10);
                I.V(LocaleController.isRTL ? 3 : 5);
                I.Y = true;
                I.t = z10;
                I.Z();
                break;
            case 21:
                gg.c.U((gg.c) obj3, (ArrayList) obj, (j61) obj2);
                break;
            case 22:
                gg.n nVar = (gg.n) obj3;
                nVar.L.dismiss();
                nVar.y = (String) obj;
                nVar.E = (TLRPC.InputDocument) obj2;
                nVar.w = false;
                AndroidUtilities.cancelRunOnUIThread(nVar.d);
                nVar.n.setSticker(nVar.y);
                nVar.e0(true);
                l61 l61Var = nVar.a;
                if (l61Var != null && (j61Var = l61Var.Y2) != null) {
                    j61Var.N(true);
                    break;
                }
                break;
            case 23:
                p0 p0Var = (p0) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                j61 j61Var2 = (j61) obj2;
                j61Var2.E = 1;
                LinearLayout linearLayout = p0Var.a0;
                v51 v51Var = new v51(-4);
                v51Var.d = -5;
                v51Var.c = linearLayout;
                v51Var.z = -1;
                arrayList5.add(v51Var);
                TL_account.TL_connectedBot tL_connectedBot = p0Var.X;
                if (tL_connectedBot != null) {
                    if (TLObject.hasFlag(tL_connectedBot.flags, 1) || TLObject.hasFlag(tL_connectedBot.flags, 2) || TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                        e2.m(R.string.SessionBotConnectedFrom, arrayList5);
                        if (TLObject.hasFlag(tL_connectedBot.flags, 1)) {
                            arrayList5.add(v51.f(LocaleController.getString(R.string.SessionBotDevice), tL_connectedBot.device, 1));
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, 4)) {
                            i10 = 2;
                            arrayList5.add(v51.f(LocaleController.getString(R.string.SessionBotLocation), tL_connectedBot.location, 2));
                        } else {
                            i10 = 2;
                        }
                        if (TLObject.hasFlag(tL_connectedBot.flags, i10)) {
                            arrayList5.add(v51.f(LocaleController.getString(R.string.SessionBotDate), LocaleController.formatDateTime(tL_connectedBot.date, false), 3));
                        }
                        arrayList5.add(v51.B(null));
                    }
                    j61Var2.U();
                    e2.m(R.string.BusinessBotChats2, arrayList5);
                    int i17 = p0.g0;
                    v51 w10 = v51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                    w10.K(p0Var.e0);
                    arrayList5.add(w10);
                    int i18 = p0.h0;
                    v51 w11 = v51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                    w11.K(!p0Var.e0);
                    arrayList5.add(w11);
                    j61Var2.T();
                    arrayList5.add(v51.B(null));
                    gg.e0 e0Var = p0Var.Z;
                    if (e0Var != null) {
                        e0Var.a(arrayList5, j61Var2, true);
                    }
                    e2.w(R.string.BusinessBotChatsInfo2, arrayList5);
                    break;
                }
                break;
            case 24:
                final y0 y0Var = (y0) obj3;
                ArrayList arrayList6 = (ArrayList) obj;
                j61 j61Var3 = (j61) obj2;
                LongSparseArray longSparseArray = y0Var.N;
                String string2 = LocaleController.getString(R.string.BusinessBots2);
                String string3 = LocaleController.getString(R.string.BusinessBots2Info);
                v51 v51Var2 = new v51(2);
                v51Var2.l = string2;
                v51Var2.o = string3;
                v51Var2.m = AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2;
                v51Var2.n = "🤖🏝️";
                v51Var2.z = 120;
                arrayList6.add(v51Var2);
                if (y0Var.M != null) {
                    j61Var3.U();
                    long j11 = y0Var.M.id;
                    v51 v51Var3 = new v51(13);
                    v51Var3.x = j11;
                    v51Var3.K(true);
                    final int i19 = z11 ? 1 : 0;
                    v51Var3.D = new View.OnClickListener() { // from class: gg.t0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i19) {
                                case 0:
                                    y0 y0Var2 = y0Var;
                                    y0Var2.M = null;
                                    y0Var2.c.Y2.N(true);
                                    y0Var2.Y(true);
                                    break;
                                case 1:
                                    y0 y0Var3 = y0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights = y0Var3.J;
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
                                    y0Var3.c.Y2.N(true);
                                    y0Var3.Y(true);
                                    break;
                                case 2:
                                    y0 y0Var4 = y0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights2 = y0Var4.J;
                                    if (!tL_businessBotRights2.edit_name || !tL_businessBotRights2.edit_bio || !tL_businessBotRights2.edit_profile_photo || !tL_businessBotRights2.edit_username) {
                                        y0Var4.X(-14, true, new r0(y0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights2.edit_username = false;
                                        tL_businessBotRights2.edit_profile_photo = false;
                                        tL_businessBotRights2.edit_bio = false;
                                        tL_businessBotRights2.edit_name = false;
                                        y0Var4.c.Y2.N(true);
                                        y0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    y0 y0Var5 = y0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = y0Var5.J;
                                    if (!tL_businessBotRights3.view_gifts || !tL_businessBotRights3.sell_gifts || !tL_businessBotRights3.change_gift_settings || !tL_businessBotRights3.transfer_and_upgrade_gifts || !tL_businessBotRights3.transfer_stars) {
                                        y0Var5.X(-17, true, new r0(y0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights3.transfer_stars = false;
                                        tL_businessBotRights3.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights3.change_gift_settings = false;
                                        tL_businessBotRights3.sell_gifts = false;
                                        tL_businessBotRights3.view_gifts = false;
                                        y0Var5.c.Y2.N(true);
                                        y0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    y0 y0Var6 = y0Var;
                                    y0Var6.J.manage_stories = !r0.manage_stories;
                                    y0Var6.c.Y2.N(true);
                                    y0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(v51Var3);
                    j61Var3.T();
                    str2 = "";
                } else {
                    j61Var3.U();
                    arrayList6.add(v51.k(y0Var.e));
                    longSparseArray.clear();
                    int i20 = 0;
                    boolean z12 = false;
                    while (i20 < y0Var.d.d.size()) {
                        TLObject tLObject = (TLObject) y0Var.d.d.get(i20);
                        if (tLObject instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            if (user.bot) {
                                str3 = str4;
                                long j12 = user.id;
                                String str8 = y0Var.y;
                                v51 v51Var4 = new v51(13);
                                v51Var4.x = j12;
                                v51Var4.n = str8;
                                arrayList6.add(v51Var4);
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
                    for (int i21 = 0; i21 < y0Var.d.e.size(); i21++) {
                        TLObject tLObject2 = (TLObject) y0Var.d.e.get(i21);
                        if (tLObject2 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) tLObject2;
                            if (user2.bot) {
                                long j13 = user2.id;
                                String str9 = y0Var.y;
                                v51 v51Var5 = new v51(13);
                                v51Var5.x = j13;
                                v51Var5.n = str9;
                                arrayList6.add(v51Var5);
                                longSparseArray.put(user2.id, user2);
                                z12 = true;
                            }
                        }
                    }
                    if (longSparseArray.size() <= 0 && (!TextUtils.isEmpty(y0Var.f.getText().toString()) || y0Var.d.e() || y0Var.x)) {
                        arrayList6.add(v51.k(y0Var.n));
                        z12 = true;
                    }
                    y0Var.h.setVisibility(z12 ? 0 : 8);
                    j61Var3.T();
                }
                arrayList6.add(v51.B(LocaleController.getString(R.string.BusinessBotLinkInfo2)));
                j61Var3.U();
                v51 t10 = v51.t(LocaleController.getString(R.string.BusinessBotChats2));
                t10.g = y0Var.M != null;
                arrayList6.add(t10);
                v51 w12 = v51.w(-1, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
                w12.K(y0Var.I);
                w12.g = y0Var.M != null;
                arrayList6.add(w12);
                v51 w13 = v51.w(-2, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
                w13.K(!y0Var.I);
                w13.g = y0Var.M != null;
                arrayList6.add(w13);
                j61Var3.T();
                arrayList6.add(v51.B(null));
                y0Var.v.a(arrayList6, j61Var3, y0Var.M != null);
                e2.w(R.string.BusinessBotChatsInfo2, arrayList6);
                if (y0Var.M != null) {
                    j61Var3.U();
                    e2.m(R.string.BusinessBotPermissions, arrayList6);
                    String string4 = LocaleController.getString(R.string.BusinessBotPermissionsMessagesSection);
                    StringBuilder sb3 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights = y0Var.J;
                    sb3.append((tL_businessBotRights.reply ? 1 : 0) + 1 + (tL_businessBotRights.read_messages ? 1 : 0) + (tL_businessBotRights.delete_sent_messages ? 1 : 0) + (tL_businessBotRights.delete_received_messages ? 1 : 0));
                    sb3.append("/5");
                    v51 m10 = v51.m(-4, string4, sb3.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights2 = y0Var.J;
                    m10.K(tL_businessBotRights2.reply && tL_businessBotRights2.read_messages && tL_businessBotRights2.delete_received_messages && tL_businessBotRights2.delete_sent_messages);
                    m10.f = !y0Var.P;
                    final int i22 = 1;
                    m10.D = new View.OnClickListener() { // from class: gg.t0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i22) {
                                case 0:
                                    y0 y0Var2 = y0Var;
                                    y0Var2.M = null;
                                    y0Var2.c.Y2.N(true);
                                    y0Var2.Y(true);
                                    break;
                                case 1:
                                    y0 y0Var3 = y0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights3 = y0Var3.J;
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
                                    y0Var3.c.Y2.N(true);
                                    y0Var3.Y(true);
                                    break;
                                case 2:
                                    y0 y0Var4 = y0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = y0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        y0Var4.X(-14, true, new r0(y0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        y0Var4.c.Y2.N(true);
                                        y0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    y0 y0Var5 = y0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = y0Var5.J;
                                    if (!tL_businessBotRights32.view_gifts || !tL_businessBotRights32.sell_gifts || !tL_businessBotRights32.change_gift_settings || !tL_businessBotRights32.transfer_and_upgrade_gifts || !tL_businessBotRights32.transfer_stars) {
                                        y0Var5.X(-17, true, new r0(y0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights32.transfer_stars = false;
                                        tL_businessBotRights32.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights32.change_gift_settings = false;
                                        tL_businessBotRights32.sell_gifts = false;
                                        tL_businessBotRights32.view_gifts = false;
                                        y0Var5.c.Y2.N(true);
                                        y0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    y0 y0Var6 = y0Var;
                                    y0Var6.J.manage_stories = !r0.manage_stories;
                                    y0Var6.c.Y2.N(true);
                                    y0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(m10);
                    if (y0Var.P) {
                        v51 y3 = v51.y(-5, LocaleController.getString(R.string.BusinessBotPermissionsMessagesRead));
                        y3.K(true);
                        y3.g = false;
                        y3.i = 1;
                        arrayList6.add(y3);
                        v51 y10 = v51.y(-6, LocaleController.getString(R.string.BusinessBotPermissionsMessagesReply));
                        y10.K(y0Var.J.reply);
                        y10.i = 1;
                        arrayList6.add(y10);
                        v51 y11 = v51.y(-7, LocaleController.getString(R.string.BusinessBotPermissionsMessagesMarkAsRead));
                        y11.K(y0Var.J.read_messages);
                        y11.i = 1;
                        arrayList6.add(y11);
                        v51 y12 = v51.y(-8, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteSent));
                        y12.K(y0Var.J.delete_sent_messages);
                        y12.i = 1;
                        arrayList6.add(y12);
                        v51 y13 = v51.y(-9, LocaleController.getString(R.string.BusinessBotPermissionsMessagesDeleteReceived));
                        y13.K(y0Var.J.delete_received_messages);
                        y13.i = 1;
                        arrayList6.add(y13);
                    }
                    String string5 = LocaleController.getString(R.string.BusinessBotPermissionsProfileSection);
                    StringBuilder sb4 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights3 = y0Var.J;
                    sb4.append((tL_businessBotRights3.edit_name ? 1 : 0) + (tL_businessBotRights3.edit_bio ? 1 : 0) + (tL_businessBotRights3.edit_profile_photo ? 1 : 0) + (tL_businessBotRights3.edit_username ? 1 : 0));
                    sb4.append("/4");
                    v51 m11 = v51.m(-10, string5, sb4.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights4 = y0Var.J;
                    m11.K(tL_businessBotRights4.edit_name && tL_businessBotRights4.edit_bio && tL_businessBotRights4.edit_profile_photo && tL_businessBotRights4.edit_username);
                    m11.f = !y0Var.Q;
                    final int i23 = 2;
                    m11.D = new View.OnClickListener() { // from class: gg.t0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i23) {
                                case 0:
                                    y0 y0Var2 = y0Var;
                                    y0Var2.M = null;
                                    y0Var2.c.Y2.N(true);
                                    y0Var2.Y(true);
                                    break;
                                case 1:
                                    y0 y0Var3 = y0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = y0Var3.J;
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
                                    y0Var3.c.Y2.N(true);
                                    y0Var3.Y(true);
                                    break;
                                case 2:
                                    y0 y0Var4 = y0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = y0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        y0Var4.X(-14, true, new r0(y0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        y0Var4.c.Y2.N(true);
                                        y0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    y0 y0Var5 = y0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = y0Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        y0Var5.X(-17, true, new r0(y0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        y0Var5.c.Y2.N(true);
                                        y0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    y0 y0Var6 = y0Var;
                                    y0Var6.J.manage_stories = !r0.manage_stories;
                                    y0Var6.c.Y2.N(true);
                                    y0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(m11);
                    if (y0Var.Q) {
                        v51 y14 = v51.y(-11, LocaleController.getString(R.string.BusinessBotPermissionsProfileName));
                        y14.K(y0Var.J.edit_name);
                        y14.i = 1;
                        arrayList6.add(y14);
                        v51 y15 = v51.y(-12, LocaleController.getString(R.string.BusinessBotPermissionsProfileBio));
                        y15.K(y0Var.J.edit_bio);
                        y15.i = 1;
                        arrayList6.add(y15);
                        v51 y16 = v51.y(-13, LocaleController.getString(R.string.BusinessBotPermissionsProfilePicture));
                        y16.K(y0Var.J.edit_profile_photo);
                        y16.i = 1;
                        arrayList6.add(y16);
                        v51 y17 = v51.y(-14, LocaleController.getString(R.string.BusinessBotPermissionsProfileUsername));
                        y17.K(y0Var.J.edit_username);
                        y17.i = 1;
                        arrayList6.add(y17);
                    }
                    String string6 = LocaleController.getString(R.string.BusinessBotPermissionsGiftsSection);
                    StringBuilder sb5 = new StringBuilder();
                    TL_account.TL_businessBotRights tL_businessBotRights5 = y0Var.J;
                    sb5.append((tL_businessBotRights5.view_gifts ? 1 : 0) + (tL_businessBotRights5.sell_gifts ? 1 : 0) + (tL_businessBotRights5.change_gift_settings ? 1 : 0) + (tL_businessBotRights5.transfer_and_upgrade_gifts ? 1 : 0) + (tL_businessBotRights5.transfer_stars ? 1 : 0));
                    sb5.append("/5");
                    v51 m12 = v51.m(-15, string6, sb5.toString());
                    TL_account.TL_businessBotRights tL_businessBotRights6 = y0Var.J;
                    m12.K(tL_businessBotRights6.view_gifts && tL_businessBotRights6.sell_gifts && tL_businessBotRights6.change_gift_settings && tL_businessBotRights6.transfer_and_upgrade_gifts && tL_businessBotRights6.transfer_stars);
                    m12.f = !y0Var.R;
                    final int i24 = 3;
                    m12.D = new View.OnClickListener() { // from class: gg.t0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i24) {
                                case 0:
                                    y0 y0Var2 = y0Var;
                                    y0Var2.M = null;
                                    y0Var2.c.Y2.N(true);
                                    y0Var2.Y(true);
                                    break;
                                case 1:
                                    y0 y0Var3 = y0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = y0Var3.J;
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
                                    y0Var3.c.Y2.N(true);
                                    y0Var3.Y(true);
                                    break;
                                case 2:
                                    y0 y0Var4 = y0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = y0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        y0Var4.X(-14, true, new r0(y0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        y0Var4.c.Y2.N(true);
                                        y0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    y0 y0Var5 = y0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = y0Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        y0Var5.X(-17, true, new r0(y0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        y0Var5.c.Y2.N(true);
                                        y0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    y0 y0Var6 = y0Var;
                                    y0Var6.J.manage_stories = !r0.manage_stories;
                                    y0Var6.c.Y2.N(true);
                                    y0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(m12);
                    if (y0Var.R) {
                        v51 y18 = v51.y(-16, LocaleController.getString(R.string.BusinessBotPermissionsGiftsView));
                        y18.K(y0Var.J.view_gifts);
                        y18.i = 1;
                        arrayList6.add(y18);
                        v51 y19 = v51.y(-17, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSell));
                        y19.K(y0Var.J.sell_gifts);
                        y19.i = 1;
                        arrayList6.add(y19);
                        v51 y20 = v51.y(-18, LocaleController.getString(R.string.BusinessBotPermissionsGiftsSettings));
                        y20.K(y0Var.J.change_gift_settings);
                        y20.i = 1;
                        arrayList6.add(y20);
                        v51 y21 = v51.y(-19, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransfer));
                        y21.K(y0Var.J.transfer_and_upgrade_gifts);
                        y21.i = 1;
                        arrayList6.add(y21);
                        v51 y22 = v51.y(-20, LocaleController.getString(R.string.BusinessBotPermissionsGiftsTransferStars));
                        y22.K(y0Var.J.transfer_stars);
                        y22.i = 1;
                        arrayList6.add(y22);
                    }
                    v51 m13 = v51.m(-21, LocaleController.getString(R.string.BusinessBotPermissionsStories), str2);
                    m13.K(y0Var.J.manage_stories);
                    final int i25 = 4;
                    m13.D = new View.OnClickListener() { // from class: gg.t0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i25) {
                                case 0:
                                    y0 y0Var2 = y0Var;
                                    y0Var2.M = null;
                                    y0Var2.c.Y2.N(true);
                                    y0Var2.Y(true);
                                    break;
                                case 1:
                                    y0 y0Var3 = y0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights32 = y0Var3.J;
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
                                    y0Var3.c.Y2.N(true);
                                    y0Var3.Y(true);
                                    break;
                                case 2:
                                    y0 y0Var4 = y0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights22 = y0Var4.J;
                                    if (!tL_businessBotRights22.edit_name || !tL_businessBotRights22.edit_bio || !tL_businessBotRights22.edit_profile_photo || !tL_businessBotRights22.edit_username) {
                                        y0Var4.X(-14, true, new r0(y0Var4, 2));
                                        break;
                                    } else {
                                        tL_businessBotRights22.edit_username = false;
                                        tL_businessBotRights22.edit_profile_photo = false;
                                        tL_businessBotRights22.edit_bio = false;
                                        tL_businessBotRights22.edit_name = false;
                                        y0Var4.c.Y2.N(true);
                                        y0Var4.Y(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    y0 y0Var5 = y0Var;
                                    TL_account.TL_businessBotRights tL_businessBotRights322 = y0Var5.J;
                                    if (!tL_businessBotRights322.view_gifts || !tL_businessBotRights322.sell_gifts || !tL_businessBotRights322.change_gift_settings || !tL_businessBotRights322.transfer_and_upgrade_gifts || !tL_businessBotRights322.transfer_stars) {
                                        y0Var5.X(-17, true, new r0(y0Var5, 1));
                                        break;
                                    } else {
                                        tL_businessBotRights322.transfer_stars = false;
                                        tL_businessBotRights322.transfer_and_upgrade_gifts = false;
                                        tL_businessBotRights322.change_gift_settings = false;
                                        tL_businessBotRights322.sell_gifts = false;
                                        tL_businessBotRights322.view_gifts = false;
                                        y0Var5.c.Y2.N(true);
                                        y0Var5.Y(true);
                                        break;
                                    }
                                    break;
                                default:
                                    y0 y0Var6 = y0Var;
                                    y0Var6.J.manage_stories = !r0.manage_stories;
                                    y0Var6.c.Y2.N(true);
                                    y0Var6.Y(true);
                                    break;
                            }
                        }
                    };
                    arrayList6.add(m13);
                    j61Var3.T();
                    arrayList6.add(v51.A(-4, null));
                    arrayList6.add(v51.A(-5, null));
                    arrayList6.add(v51.A(-6, null));
                    arrayList6.add(v51.A(-7, null));
                    break;
                }
                break;
            case 25:
                a1.U((a1) obj3, (ArrayList) obj, (j61) obj2);
                break;
            case 26:
                k1 k1Var = (k1) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                String string7 = LocaleController.getString(R.string.BusinessLocation);
                String string8 = LocaleController.getString(R.string.BusinessLocationInfo);
                int i26 = R.raw.biz_map;
                v51 v51Var6 = new v51(2);
                v51Var6.l = string7;
                v51Var6.o = string8;
                v51Var6.k = i26;
                arrayList7.add(v51Var6);
                arrayList7.add(v51.k(k1Var.e));
                arrayList7.add(v51.B(null));
                v51 i27 = v51.i(1, LocaleController.getString(R.string.BusinessLocationMap));
                i27.K(k1Var.x != null);
                arrayList7.add(i27);
                if (k1Var.x != null) {
                    arrayList7.add(v51.k(k1Var.h));
                }
                arrayList7.add(v51.B(null));
                if (k1Var.w != null && (k1Var.x != null || !TextUtils.isEmpty(k1Var.y))) {
                    z11 = true;
                }
                k1Var.G = z11;
                if (z11) {
                    v51 e = v51.e(2, LocaleController.getString(R.string.BusinessLocationClear));
                    e.r = true;
                    arrayList7.add(e);
                    arrayList7.add(v51.B(null));
                }
                k1Var.U(true);
                break;
            case 27:
                m1.V((m1) obj3, (ArrayList) obj);
                break;
            default:
                o1 o1Var = (o1) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = o1Var.b;
                String string9 = LocaleController.getString(R.string.BusinessHoursDayOpen);
                v51 v51Var7 = new v51(9);
                v51Var7.d = -1;
                v51Var7.l = string9;
                v51Var7.K(o1Var.r);
                arrayList8.add(v51Var7);
                arrayList8.add(v51.B(null));
                if (o1Var.r) {
                    for (int i28 = 0; i28 < arrayList9.size(); i28++) {
                        if (i28 > 0) {
                            arrayList8.add(v51.B(null));
                        }
                        l1 l1Var = (l1) arrayList9.get(i28);
                        if (!o1Var.U()) {
                            int i29 = i28 * 3;
                            arrayList8.add(v51.f(LocaleController.getString(R.string.BusinessHoursDayOpenHour), l1.a(l1Var.a), i29));
                            arrayList8.add(v51.f(LocaleController.getString(R.string.BusinessHoursDayCloseHour), l1.a(l1Var.b), i29 + 1));
                            v51 e7 = v51.e(i29 + 2, LocaleController.getString(R.string.Remove));
                            e7.r = true;
                            arrayList8.add(e7);
                        }
                    }
                    if (o1Var.V()) {
                        arrayList8.add(v51.B(null));
                        v51 c12 = v51.c(-2, R.drawable.menu_premium_clock_add, LocaleController.getString(R.string.BusinessHoursDayAdd));
                        c12.q = true;
                        arrayList8.add(c12);
                    }
                    e2.w(R.string.BusinessHoursDayInfo, arrayList8);
                    break;
                }
                break;
        }
    }
}
