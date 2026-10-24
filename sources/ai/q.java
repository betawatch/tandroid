package ai;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.m61;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0269, code lost:
    
        if (r1.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation") == false) goto L27;
     */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        Utilities.Callback callback;
        String str;
        int i10 = this.a;
        char c10 = 7;
        String str2 = null;
        int i11 = 8;
        int i12 = 0;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                x.Y((x) obj3, (ArrayList) obj);
                break;
            case 1:
                o0 o0Var = (o0) obj3;
                ArrayList arrayList = (ArrayList) obj;
                arrayList.add(m61.k(o0Var.Y));
                arrayList.add(m0.a(LocaleController.getString(R.string.ExplainStarsFeature1Title), LocaleController.getString(R.string.ExplainStarsFeature1Text), R.drawable.msg_gift_premium));
                arrayList.add(m0.a(LocaleController.getString(R.string.ExplainStarsFeature2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExplainStarsFeature2Text), new a3.d(o0Var, i11)), true), R.drawable.msg_bot));
                arrayList.add(m0.a(LocaleController.getString(R.string.ExplainStarsFeature3Title), LocaleController.getString(R.string.ExplainStarsFeature3Text), R.drawable.menu_unlock));
                arrayList.add(m0.a(LocaleController.getString(R.string.ExplainStarsFeature4Title), LocaleController.getString(R.string.ExplainStarsFeature4Text), R.drawable.menu_feature_paid));
                arrayList.add(m61.C(AndroidUtilities.dp(68.0f)));
                break;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                m61 m61Var = ((b1) obj3).w0;
                if (m61Var != null) {
                    arrayList2.add(m61Var);
                    break;
                }
                break;
            case 3:
                a2 a2Var = (a2) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                ArrayList arrayList4 = a2Var.d0;
                boolean z10 = a2Var.x0;
                a aVar = a2Var.g0;
                ArrayList arrayList5 = a2Var.b0;
                ArrayList arrayList6 = a2Var.a0;
                a aVar2 = a2Var.f0;
                a aVar3 = a2Var.e0;
                ArrayList arrayList7 = a2Var.c0;
                if (arrayList7 != null && arrayList6 != null && arrayList5 != null) {
                    arrayList3.add(m61.C(AndroidUtilities.dp(315.0f)));
                    aVar3.b = 0;
                    aVar3.c();
                    aVar2.b = 0;
                    aVar2.c();
                    aVar.b = 0;
                    aVar.c();
                    int i13 = a2Var.j0.s;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 == 2) {
                                arrayList3.add(m61.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountSymbols", arrayList5.size()))));
                                int size = arrayList5.size();
                                while (i12 < size) {
                                    Object obj4 = arrayList5.get(i12);
                                    i12++;
                                    arrayList3.add(x1.a(i13, new v1((TL_stars.starGiftAttributeBackdrop) aVar3.c(), (TL_stars.starGiftAttributePattern) obj4, (TL_stars.starGiftAttributeModel) aVar.c())));
                                }
                                break;
                            }
                        } else {
                            arrayList3.add(m61.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountBackdrops", arrayList6.size()))));
                            int size2 = arrayList6.size();
                            while (i12 < size2) {
                                Object obj5 = arrayList6.get(i12);
                                i12++;
                                arrayList3.add(x1.a(i13, new v1((TL_stars.starGiftAttributeBackdrop) obj5, (TL_stars.starGiftAttributePattern) aVar2.c(), (TL_stars.starGiftAttributeModel) aVar.c())));
                            }
                            break;
                        }
                    } else {
                        arrayList3.add(m61.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z10 ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList7.size()))));
                        int size3 = arrayList7.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj6 = arrayList7.get(i14);
                            i14++;
                            arrayList3.add(x1.a(i13, new v1((TL_stars.starGiftAttributeBackdrop) aVar3.c(), (TL_stars.starGiftAttributePattern) aVar2.c(), (TL_stars.starGiftAttributeModel) obj6)));
                        }
                        if (!arrayList4.isEmpty()) {
                            arrayList3.add(m61.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z10 ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList7.size()))));
                            int size4 = arrayList4.size();
                            while (i12 < size4) {
                                Object obj7 = arrayList4.get(i12);
                                i12++;
                                arrayList3.add(x1.a(i13, new v1((TL_stars.starGiftAttributeBackdrop) aVar3.c(), (TL_stars.starGiftAttributePattern) aVar2.c(), (TL_stars.starGiftAttributeModel) obj7)));
                            }
                            break;
                        }
                    }
                }
                break;
            case 4:
                TextView textView = (TextView) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (wallettransaction != null) {
                    long j10 = wallettransaction.fee;
                    if (j10 > 0) {
                        textView.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, org.telegram.ui.Wallet.l0.r(j10, false)));
                        break;
                    }
                }
                textView.setVisibility(8);
                break;
            case 5:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj3;
                Long l4 = (Long) obj;
                Boolean bool = (Boolean) obj2;
                if (callback2 != null) {
                    callback2.run(l4, bool);
                    break;
                }
                break;
            case 6:
                ((nd) obj3).I0((ArrayList) obj, (b71) obj2);
                break;
            case 7:
                ((wc) obj3).R((ArrayList) obj, (b71) obj2);
                break;
            case 8:
                ((dd) obj3).R((ArrayList) obj, (b71) obj2);
                break;
            case 9:
                ((ed) obj3).R((ArrayList) obj, (b71) obj2);
                break;
            case 10:
                kd kdVar = (kd) obj3;
                ArrayList arrayList8 = (ArrayList) obj;
                int i15 = kdVar.c;
                int i16 = kdVar.d;
                long j11 = kdVar.f;
                if (j11 == 0) {
                    ha y3 = ha.y(i15, kdVar.e);
                    ArrayList arrayList9 = y3.q[i16];
                    int size5 = arrayList9.size();
                    int i17 = 0;
                    while (i17 < size5) {
                        Object obj8 = arrayList9.get(i17);
                        i17++;
                        int i18 = hd.a;
                        m61 J = m61.J(hd.class);
                        J.G = (TL_stars.StarsTransaction) obj8;
                        J.q = false;
                        arrayList8.add(J);
                    }
                    if (!y3.u[i16]) {
                        arrayList8.add(m61.o(arrayList8.size(), 7));
                        arrayList8.add(m61.o(arrayList8.size(), 7));
                        arrayList8.add(m61.o(arrayList8.size(), 7));
                        break;
                    }
                } else {
                    k0 g10 = k0.g(i15);
                    ArrayList arrayList10 = g10.k(j11).a[i16];
                    int size6 = arrayList10.size();
                    while (i12 < size6) {
                        Object obj9 = arrayList10.get(i12);
                        i12++;
                        int i19 = hd.a;
                        m61 J2 = m61.J(hd.class);
                        J2.G = (TL_stars.StarsTransaction) obj9;
                        J2.q = true;
                        arrayList8.add(J2);
                    }
                    if (!g10.k(j11).e[i16]) {
                        arrayList8.add(m61.o(arrayList8.size(), 7));
                        arrayList8.add(m61.o(arrayList8.size(), 7));
                        arrayList8.add(m61.o(arrayList8.size(), 7));
                        break;
                    }
                }
                break;
            case 11:
                ArrayList arrayList11 = (ArrayList) obj;
                ((di.u) obj3).getClass();
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                int size7 = languages.size();
                while (i12 < size7) {
                    TranslateController.Language language = languages.get(i12);
                    i12++;
                    int i20 = di.s.a;
                    m61 J3 = m61.J(di.s.class);
                    J3.G = language;
                    arrayList11.add(J3);
                }
                break;
            case 12:
                ei.m mVar = (ei.m) obj3;
                Canvas canvas = (Canvas) obj;
                Runnable runnable = (Runnable) obj2;
                Paint paint = mVar.I;
                RectF rectF = mVar.z0;
                ei.g gVar = mVar.f;
                if (!mVar.g()) {
                    Paint c11 = mVar.P.c(1.0f);
                    gVar.getEditText().setHintColor(c11 == null ? -2130706433 : -1);
                    if (c11 != null) {
                        iu editText = gVar.getEditText();
                        canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), 255, 31);
                        runnable.run();
                        canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), c11);
                        canvas.restore();
                        break;
                    } else {
                        runnable.run();
                        break;
                    }
                } else if (mVar.G != null) {
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
                } else {
                    runnable.run();
                    break;
                }
            case 13:
                ei.v1 v1Var = (ei.v1) obj3;
                String str3 = (String) obj;
                ei.n2 n2Var = v1Var.r;
                n2Var.b = str3;
                n2Var.c = ((Integer) obj2).intValue();
                v1Var.c.H(str3);
                break;
            case 14:
                ei.b2 b2Var = (ei.b2) obj3;
                String str4 = (String) obj;
                ei.n2 n2Var2 = b2Var.s;
                n2Var2.b = str4;
                n2Var2.c = ((Integer) obj2).intValue();
                b2Var.c.D(str4);
                break;
            case 15:
                ei.u3 u3Var = (ei.u3) obj3;
                if (obj == null) {
                    u3Var.getClass();
                    break;
                } else if (u3Var.e == null && (obj instanceof MediaController.PhotoEntry) && (callback = u3Var.f) != null) {
                    callback.run((MediaController.PhotoEntry) obj);
                    break;
                }
                break;
            case 16:
                ei.f6 f6Var = (ei.f6) obj3;
                f6Var.c0(f6Var.h0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
            case 17:
                ((ei.ub) obj3).Y((Bitmap) obj, ((Float) obj2).floatValue());
                break;
            case 18:
                ei.j8 j8Var = (ei.j8) obj3;
                ArrayList arrayList12 = (ArrayList) obj;
                if (j8Var.h0 || j8Var.g0 != null) {
                    TLRPC.WebPage webPage = j8Var.g0;
                    ei.b8 b8Var = new ei.b8(j8Var, 0);
                    int i21 = ei.h8.a;
                    m61 J4 = m61.J(ei.h8.class);
                    J4.G = webPage;
                    J4.D = b8Var;
                    arrayList12.add(J4);
                }
                arrayList12.add(m61.k(j8Var.Y));
                arrayList12.add(m61.A(1, null));
                m61 i22 = m61.i(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                i22.K(j8Var.m0);
                arrayList12.add(i22);
                if (j8Var.m0) {
                    arrayList12.add(m61.k(j8Var.Z));
                }
                arrayList12.add(m61.A(3, null));
                arrayList12.add(m61.k(j8Var.a0));
                break;
            case 19:
                ei.vb vbVar = (ei.vb) obj3;
                Float f7 = (Float) obj2;
                long duration = vbVar.X0.getDuration() < 100 ? vbVar.K1.h0 : vbVar.X0.getDuration();
                float floatValue = ((f7.floatValue() / 0.96f) * 0.04f) + f7.floatValue();
                ei.a8 a8Var = vbVar.K1;
                float f10 = a8Var.a0;
                float f11 = a8Var.Z;
                float f12 = (f10 - f11) * floatValue;
                float f13 = duration;
                long j12 = (long) (f12 * f13);
                ei.jb jbVar = vbVar.X0;
                long j13 = (long) ((f11 * f13) + j12);
                vbVar.M1 = j13;
                jbVar.m(j13);
                ei.xa xaVar = vbVar.v1;
                if (xaVar != null) {
                    xaVar.setCoverTime(vbVar.M1);
                }
                ei.a8 a8Var2 = vbVar.K1;
                if (a8Var2 != null && a8Var2.g) {
                    a8Var2.j = true;
                    break;
                }
                break;
            case 20:
                ((ei.yb) obj3).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 21:
                ((fi.g) obj3).D0((ArrayList) obj, (b71) obj2);
                break;
            case 22:
                fi.f fVar = (fi.f) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                arrayList13.add(m61.k(fVar.Y));
                arrayList13.add(m61.k(fVar.Z));
                break;
            case 23:
                ((gi.l) obj3).F0((ArrayList) obj, (b71) obj2);
                break;
            case 24:
                gi.t.U((gi.t) obj3, (ArrayList) obj);
                break;
            case 25:
                org.telegram.ui.Components.q6 q6Var = (org.telegram.ui.Components.q6) obj3;
                String str5 = (String) obj;
                Long l10 = (Long) obj2;
                StringBuilder sb2 = new StringBuilder();
                if (l10.longValue() > 0) {
                    sb2.append("~");
                    sb2.append(AndroidUtilities.formatFileSize(l10.longValue()));
                }
                if (str5 != null) {
                    if (!str5.isEmpty()) {
                        switch (str5.hashCode()) {
                            case -2008589971:
                                if (str5.equals("application/epub+zip")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1719571662:
                                if (str5.equals("application/vnd.oasis.opendocument.text")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1664118616:
                                if (str5.equals("video/3gpp")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1578389996:
                                if (str5.equals("application/vnd.ms-fontobject")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1348237359:
                                if (str5.equals("application/x-cdf")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1348236892:
                                if (str5.equals("application/x-csh")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1079884372:
                                if (str5.equals("video/x-msvideo")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1073633483:
                                break;
                            case -1071817359:
                                if (str5.equals("application/vnd.ms-powerpoint")) {
                                    c10 = '\b';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1050893613:
                                if (str5.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                                    c10 = '\t';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1007601745:
                                if (str5.equals("audio/x-midi")) {
                                    c10 = '\n';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -958424608:
                                if (str5.equals("text/calendar")) {
                                    c10 = 11;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -816908365:
                                if (str5.equals("application/x-httpd-php")) {
                                    c10 = '\f';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -648684635:
                                if (str5.equals("audio/3gpp2")) {
                                    c10 = '\r';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -433129473:
                                if (str5.equals("application/vnd.apple.installer+xml")) {
                                    c10 = 14;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -366307023:
                                if (str5.equals("application/vnd.ms-excel")) {
                                    c10 = 15;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -48069494:
                                if (str5.equals("video/3gpp2")) {
                                    c10 = 16;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -43923783:
                                if (str5.equals("application/gzip")) {
                                    c10 = 17;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -43491031:
                                if (str5.equals("application/x-sh")) {
                                    c10 = 18;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 187091926:
                                if (str5.equals("audio/ogg")) {
                                    c10 = 19;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 817335912:
                                if (str5.equals("text/plain")) {
                                    c10 = 20;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 859118878:
                                if (str5.equals("application/x-abiword")) {
                                    c10 = 21;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 886992732:
                                if (str5.equals("application/ld+json")) {
                                    c10 = 22;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 904647503:
                                if (str5.equals("application/msword")) {
                                    c10 = 23;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1154306387:
                                if (str5.equals("application/x-bzip")) {
                                    c10 = 24;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1154455342:
                                if (str5.equals("application/x-gzip")) {
                                    c10 = 25;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1178484637:
                                if (str5.equals("application/octet-stream")) {
                                    c10 = 26;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1423759679:
                                if (str5.equals("application/x-bzip2")) {
                                    c10 = 27;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1436962847:
                                if (str5.equals("application/vnd.oasis.opendocument.presentation")) {
                                    c10 = 28;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1454024983:
                                if (str5.equals("application/x-7z-compressed")) {
                                    c10 = 29;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1455492626:
                                if (str5.equals("application/x-freearc")) {
                                    c10 = 30;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1503095341:
                                if (str5.equals("audio/3gpp")) {
                                    c10 = 31;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1504831518:
                                if (str5.equals("audio/mpeg")) {
                                    c10 = ' ';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1509238306:
                                if (str5.equals("application/vnd.rar")) {
                                    c10 = '!';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1578362927:
                                if (str5.equals("image/vnd.microsoft.icon")) {
                                    c10 = '\"';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1643664935:
                                if (str5.equals("application/vnd.oasis.opendocument.spreadsheet")) {
                                    c10 = '#';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1672200517:
                                if (str5.equals("application/vnd.amazon.ebook")) {
                                    c10 = '$';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1993842850:
                                if (str5.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                                    c10 = '%';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2049276534:
                                if (str5.equals("application/java-archive")) {
                                    c10 = '&';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2132236175:
                                if (str5.equals("text/javascript")) {
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
                                if (str5.contains("/")) {
                                    str5 = str5.substring(str5.indexOf("/") + 1);
                                }
                                if (str5.contains("-")) {
                                    str5 = str5.substring(str5.indexOf("-") + 1);
                                }
                                if (str5.contains("+")) {
                                    str5 = str5.substring(0, str5.indexOf("+"));
                                }
                                str = str5.toLowerCase();
                                break;
                        }
                    } else {
                        str = "";
                    }
                    str2 = str.toUpperCase();
                }
                if (!TextUtils.isEmpty(str2)) {
                    if (sb2.length() > 0) {
                        sb2.append(" ");
                    }
                    sb2.append(str2.toUpperCase());
                }
                if (sb2.length() <= 0) {
                    sb2.append(LocaleController.getString(R.string.AttachDocument));
                }
                q6Var.setText(sb2);
                break;
            case 26:
                gi.l1 l1Var = (gi.l1) obj3;
                ArrayList arrayList14 = (ArrayList) obj;
                arrayList14.add(m61.j(-1, l1Var.a0));
                arrayList14.add(m61.B(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, l1Var.Y))));
                break;
            case 27:
                gi.d3 d3Var = (gi.d3) obj3;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) == null) {
                    gi.t4 t4Var = d3Var.w0;
                    if (t4Var != null) {
                        t4Var.a(tL_webViewResultUrl);
                        d3Var.o();
                        break;
                    }
                } else {
                    d3Var.getClass();
                    break;
                }
                break;
            case 28:
                ((gi.u3) obj3).G0((ArrayList) obj, (b71) obj2);
                break;
            default:
                ((gi.s4) obj3).U((ArrayList) obj, (b71) obj2);
                break;
        }
    }
}
