package ai;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.car.app.navigation.model.Maneuver;
import bi.ad;
import bi.ca;
import bi.dd;
import bi.nc;
import bi.tc;
import bi.uc;
import bi.x1;
import bi.xc;
import fi.d8;
import fi.e6;
import fi.f8;
import fi.gb;
import fi.l2;
import fi.rb;
import fi.s3;
import fi.sb;
import fi.ta;
import fi.vb;
import fi.w7;
import fi.x7;
import fi.z1;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01a3, code lost:
    
        if (r0.equals("application/x-sh") == false) goto L16;
     */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        Utilities.Callback callback;
        String str;
        int i10 = this.a;
        int i11 = 18;
        String str2 = null;
        int i12 = 0;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                f fVar = (f) obj3;
                TLRPC.ShareThemeBackdrops shareThemeBackdrops = (TLRPC.ShareThemeBackdrops) obj;
                ArrayList arrayList = fVar.e;
                fVar.c = false;
                if (shareThemeBackdrops instanceof TLRPC.TL_shareThemeBackdrops) {
                    TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = (TLRPC.TL_shareThemeBackdrops) shareThemeBackdrops;
                    fVar.b = tL_shareThemeBackdrops;
                    try {
                        SerializedData serializedData = new SerializedData(tL_shareThemeBackdrops.getObjectSize());
                        fVar.b.serializeToStream(serializedData);
                        MessagesController.getMainSettings(fVar.a).edit().putString("qrBackdrops", Utilities.bytesToHex(serializedData.toByteArray())).apply();
                        serializedData.cleanup();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                fVar.d = shareThemeBackdrops != null;
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                int size = arrayList2.size();
                while (i12 < size) {
                    Object obj4 = arrayList2.get(i12);
                    i12++;
                    ((Runnable) obj4).run();
                }
                break;
            case 1:
                bh.u uVar = (bh.u) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                ArrayList arrayList4 = uVar.F;
                a9 a9Var = uVar.e;
                if (a9Var != null && uVar.f != null) {
                    arrayList3.add(t61.j(1, a9Var));
                    arrayList3.add(t61.l(2, uVar.f));
                    int i13 = uVar.X;
                    if (i13 == 1 || i13 == 0 || uVar.a) {
                        while (i12 < arrayList4.size()) {
                            View view = (View) arrayList4.get(i12);
                            arrayList3.add(((Boolean) uVar.G.get(i12)).booleanValue() ? t61.l(i12 + 100, view) : t61.j(i12 + 100, view));
                            i12++;
                        }
                        break;
                    }
                }
                break;
            case 2:
                bi.y.a0((bi.y) obj3, (ArrayList) obj);
                break;
            case 3:
                bi.x xVar = (bi.x) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = xVar.b;
                int size2 = arrayList6.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj5 = arrayList6.get(i14);
                    i14++;
                    int i15 = xc.a;
                    t61 K = t61.K(xc.class);
                    K.G = (TL_stars.StarsTransaction) obj5;
                    K.q = true;
                    arrayList5.add(K);
                }
                if (!xVar.h) {
                    if (!xVar.f) {
                        while (i12 < 3) {
                            arrayList5.add(t61.q(i12, 7));
                            i12++;
                        }
                        break;
                    }
                } else {
                    arrayList5.add(t61.e(-1, LocaleController.getString(R.string.Retry)));
                    break;
                }
                break;
            case 4:
                bi.q0 q0Var = (bi.q0) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                arrayList7.add(t61.k(q0Var.Y));
                arrayList7.add(bi.o0.a(LocaleController.getString(R.string.ExplainStarsFeature1Title), LocaleController.getString(R.string.ExplainStarsFeature1Text), R.drawable.msg_gift_premium));
                arrayList7.add(bi.o0.a(LocaleController.getString(R.string.ExplainStarsFeature2Title), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExplainStarsFeature2Text), new a3.d(q0Var, i11)), true), R.drawable.msg_bot));
                arrayList7.add(bi.o0.a(LocaleController.getString(R.string.ExplainStarsFeature3Title), LocaleController.getString(R.string.ExplainStarsFeature3Text), R.drawable.menu_unlock));
                arrayList7.add(bi.o0.a(LocaleController.getString(R.string.ExplainStarsFeature4Title), LocaleController.getString(R.string.ExplainStarsFeature4Text), R.drawable.menu_feature_paid));
                arrayList7.add(t61.D(AndroidUtilities.dp(68.0f)));
                break;
            case 5:
                ArrayList arrayList8 = (ArrayList) obj;
                t61 t61Var = ((bi.b1) obj3).w0;
                if (t61Var != null) {
                    arrayList8.add(t61Var);
                    break;
                }
                break;
            case 6:
                x1 x1Var = (x1) obj3;
                ArrayList arrayList9 = (ArrayList) obj;
                ArrayList arrayList10 = x1Var.d0;
                boolean z10 = x1Var.u0;
                bi.a aVar = x1Var.g0;
                ArrayList arrayList11 = x1Var.b0;
                ArrayList arrayList12 = x1Var.a0;
                bi.a aVar2 = x1Var.f0;
                bi.a aVar3 = x1Var.e0;
                ArrayList arrayList13 = x1Var.c0;
                if (arrayList13 != null && arrayList12 != null && arrayList11 != null) {
                    arrayList9.add(t61.D(AndroidUtilities.dp(315.0f)));
                    aVar3.b = 0;
                    aVar3.c();
                    aVar2.b = 0;
                    aVar2.c();
                    aVar.b = 0;
                    aVar.c();
                    int i16 = x1Var.j0.s;
                    if (i16 != 0) {
                        if (i16 != 1) {
                            if (i16 == 2) {
                                arrayList9.add(t61.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountSymbols", arrayList11.size()))));
                                int size3 = arrayList11.size();
                                while (i12 < size3) {
                                    Object obj6 = arrayList11.get(i12);
                                    i12++;
                                    arrayList9.add(bi.u1.a(i16, new bi.s1((TL_stars.starGiftAttributeBackdrop) aVar3.c(), (TL_stars.starGiftAttributePattern) obj6, (TL_stars.starGiftAttributeModel) aVar.c())));
                                }
                                break;
                            }
                        } else {
                            arrayList9.add(t61.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountBackdrops", arrayList12.size()))));
                            int size4 = arrayList12.size();
                            while (i12 < size4) {
                                Object obj7 = arrayList12.get(i12);
                                i12++;
                                arrayList9.add(bi.u1.a(i16, new bi.s1((TL_stars.starGiftAttributeBackdrop) obj7, (TL_stars.starGiftAttributePattern) aVar2.c(), (TL_stars.starGiftAttributeModel) aVar.c())));
                            }
                            break;
                        }
                    } else {
                        arrayList9.add(t61.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z10 ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList13.size()))));
                        int size5 = arrayList13.size();
                        int i17 = 0;
                        while (i17 < size5) {
                            Object obj8 = arrayList13.get(i17);
                            i17++;
                            arrayList9.add(bi.u1.a(i16, new bi.s1((TL_stars.starGiftAttributeBackdrop) aVar3.c(), (TL_stars.starGiftAttributePattern) aVar2.c(), (TL_stars.starGiftAttributeModel) obj8)));
                        }
                        if (!arrayList10.isEmpty()) {
                            arrayList9.add(t61.g(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z10 ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList13.size()))));
                            int size6 = arrayList10.size();
                            while (i12 < size6) {
                                Object obj9 = arrayList10.get(i12);
                                i12++;
                                arrayList9.add(bi.u1.a(i16, new bi.s1((TL_stars.starGiftAttributeBackdrop) aVar3.c(), (TL_stars.starGiftAttributePattern) aVar2.c(), (TL_stars.starGiftAttributeModel) obj9)));
                            }
                            break;
                        }
                    }
                }
                break;
            case 7:
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
            case 8:
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj3;
                Long l4 = (Long) obj;
                Boolean bool = (Boolean) obj2;
                if (callback2 != null) {
                    callback2.run(l4, bool);
                    break;
                }
                break;
            case 9:
                ((dd) obj3).G0((ArrayList) obj, (j71) obj2);
                break;
            case 10:
                ((nc) obj3).R((ArrayList) obj, (j71) obj2);
                break;
            case 11:
                ((tc) obj3).R((ArrayList) obj, (j71) obj2);
                break;
            case 12:
                ((uc) obj3).R((ArrayList) obj, (j71) obj2);
                break;
            case 13:
                ad adVar = (ad) obj3;
                ArrayList arrayList14 = (ArrayList) obj;
                int i18 = adVar.c;
                int i19 = adVar.d;
                long j11 = adVar.f;
                if (j11 == 0) {
                    ca y3 = ca.y(i18, adVar.e);
                    ArrayList arrayList15 = y3.q[i19];
                    int size7 = arrayList15.size();
                    int i20 = 0;
                    while (i20 < size7) {
                        Object obj10 = arrayList15.get(i20);
                        i20++;
                        int i21 = xc.a;
                        t61 K2 = t61.K(xc.class);
                        K2.G = (TL_stars.StarsTransaction) obj10;
                        K2.q = false;
                        arrayList14.add(K2);
                    }
                    if (!y3.u[i19]) {
                        arrayList14.add(t61.q(arrayList14.size(), 7));
                        arrayList14.add(t61.q(arrayList14.size(), 7));
                        arrayList14.add(t61.q(arrayList14.size(), 7));
                        break;
                    }
                } else {
                    bi.m0 g7 = bi.m0.g(i18);
                    ArrayList arrayList16 = g7.k(j11).a[i19];
                    int size8 = arrayList16.size();
                    while (i12 < size8) {
                        Object obj11 = arrayList16.get(i12);
                        i12++;
                        int i22 = xc.a;
                        t61 K3 = t61.K(xc.class);
                        K3.G = (TL_stars.StarsTransaction) obj11;
                        K3.q = true;
                        arrayList14.add(K3);
                    }
                    if (!g7.k(j11).e[i19]) {
                        arrayList14.add(t61.q(arrayList14.size(), 7));
                        arrayList14.add(t61.q(arrayList14.size(), 7));
                        arrayList14.add(t61.q(arrayList14.size(), 7));
                        break;
                    }
                }
                break;
            case 14:
                ArrayList arrayList17 = (ArrayList) obj;
                ((ei.u) obj3).getClass();
                ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
                int size9 = languages.size();
                while (i12 < size9) {
                    TranslateController.Language language = languages.get(i12);
                    i12++;
                    int i23 = ei.s.a;
                    t61 K4 = t61.K(ei.s.class);
                    K4.G = language;
                    arrayList17.add(K4);
                }
                break;
            case 15:
                fi.m mVar = (fi.m) obj3;
                Canvas canvas = (Canvas) obj;
                Runnable runnable = (Runnable) obj2;
                Paint paint = mVar.I;
                RectF rectF = mVar.z0;
                fi.g gVar = mVar.f;
                if (!mVar.g()) {
                    Paint c10 = mVar.P.c(1.0f);
                    gVar.getEditText().setHintColor(c10 == null ? -2130706433 : -1);
                    if (c10 != null) {
                        ju editText = gVar.getEditText();
                        canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), 255, 31);
                        runnable.run();
                        canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), c10);
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
                    mVar.h(mVar.P, canvas, rectF, 0.0f, true, (-gVar.getX()) - r0.getPaddingLeft(), ((-gVar.getY()) - r0.getPaddingTop()) - r0.getExtendedPaddingTop(), true);
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
            case 16:
                fi.u1 u1Var = (fi.u1) obj3;
                String str3 = (String) obj;
                l2 l2Var = u1Var.r;
                l2Var.b = str3;
                l2Var.c = ((Integer) obj2).intValue();
                u1Var.c.H(str3);
                break;
            case 17:
                z1 z1Var = (z1) obj3;
                String str4 = (String) obj;
                l2 l2Var2 = z1Var.s;
                l2Var2.b = str4;
                l2Var2.c = ((Integer) obj2).intValue();
                z1Var.c.D(str4);
                break;
            case 18:
                s3 s3Var = (s3) obj3;
                if (obj == null) {
                    s3Var.getClass();
                    break;
                } else if (s3Var.e == null && (obj instanceof MediaController.PhotoEntry) && (callback = s3Var.f) != null) {
                    callback.run((MediaController.PhotoEntry) obj);
                    break;
                }
                break;
            case 19:
                e6 e6Var = (e6) obj3;
                e6Var.b0(e6Var.g0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
            case 20:
                ((rb) obj3).X((Bitmap) obj, ((Float) obj2).floatValue());
                break;
            case 21:
                f8 f8Var = (f8) obj3;
                ArrayList arrayList18 = (ArrayList) obj;
                if (f8Var.h0 || f8Var.g0 != null) {
                    TLRPC.WebPage webPage = f8Var.g0;
                    x7 x7Var = new x7(f8Var, 0);
                    int i24 = d8.a;
                    t61 K5 = t61.K(d8.class);
                    K5.G = webPage;
                    K5.D = x7Var;
                    arrayList18.add(K5);
                }
                arrayList18.add(t61.k(f8Var.Y));
                arrayList18.add(t61.B(1, null));
                t61 i25 = t61.i(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                i25.L(f8Var.m0);
                arrayList18.add(i25);
                if (f8Var.m0) {
                    arrayList18.add(t61.k(f8Var.Z));
                }
                arrayList18.add(t61.B(3, null));
                arrayList18.add(t61.k(f8Var.a0));
                break;
            case 22:
                sb sbVar = (sb) obj3;
                Float f7 = (Float) obj2;
                long duration = sbVar.X0.getDuration() < 100 ? sbVar.K1.h0 : sbVar.X0.getDuration();
                float floatValue = ((f7.floatValue() / 0.96f) * 0.04f) + f7.floatValue();
                w7 w7Var = sbVar.K1;
                float f10 = w7Var.a0;
                float f11 = w7Var.Z;
                float f12 = (f10 - f11) * floatValue;
                float f13 = duration;
                long j12 = (long) (f12 * f13);
                gb gbVar = sbVar.X0;
                long j13 = (long) ((f11 * f13) + j12);
                sbVar.M1 = j13;
                gbVar.m(j13);
                ta taVar = sbVar.v1;
                if (taVar != null) {
                    taVar.setCoverTime(sbVar.M1);
                }
                w7 w7Var2 = sbVar.K1;
                if (w7Var2 != null && w7Var2.g) {
                    w7Var2.j = true;
                    break;
                }
                break;
            case 23:
                ((vb) obj3).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 24:
                ((gi.h) obj3).B0((ArrayList) obj, (j71) obj2);
                break;
            case 25:
                gi.g gVar2 = (gi.g) obj3;
                ArrayList arrayList19 = (ArrayList) obj;
                arrayList19.add(t61.k(gVar2.Y));
                arrayList19.add(t61.k(gVar2.Z));
                break;
            case 26:
                ((hi.k) obj3).D0((ArrayList) obj, (j71) obj2);
                break;
            case 27:
                hi.a0.V((hi.a0) obj3, (ArrayList) obj);
                break;
            case 28:
                s6 s6Var = (s6) obj3;
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
                                    i11 = 0;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case -1719571662:
                                if (str5.equals("application/vnd.oasis.opendocument.text")) {
                                    i11 = 1;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case -1664118616:
                                if (str5.equals("video/3gpp")) {
                                    i11 = 2;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case -1578389996:
                                if (str5.equals("application/vnd.ms-fontobject")) {
                                    i11 = 3;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case -1348237359:
                                if (str5.equals("application/x-cdf")) {
                                    i11 = 4;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case -1348236892:
                                if (str5.equals("application/x-csh")) {
                                    i11 = 5;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case -1079884372:
                                if (str5.equals("video/x-msvideo")) {
                                    i11 = 6;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case -1073633483:
                                if (str5.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                                    i11 = 7;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case -1071817359:
                                if (str5.equals("application/vnd.ms-powerpoint")) {
                                    i11 = 8;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case -1050893613:
                                if (str5.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                                    i11 = 9;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case -1007601745:
                                if (str5.equals("audio/x-midi")) {
                                    i11 = 10;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case -958424608:
                                if (str5.equals("text/calendar")) {
                                    i11 = 11;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case -816908365:
                                if (str5.equals("application/x-httpd-php")) {
                                    i11 = 12;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case -648684635:
                                if (str5.equals("audio/3gpp2")) {
                                    i11 = 13;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case -433129473:
                                if (str5.equals("application/vnd.apple.installer+xml")) {
                                    i11 = 14;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case -366307023:
                                if (str5.equals("application/vnd.ms-excel")) {
                                    i11 = 15;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case -48069494:
                                if (str5.equals("video/3gpp2")) {
                                    i11 = 16;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case -43923783:
                                if (str5.equals("application/gzip")) {
                                    i11 = 17;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case -43491031:
                                break;
                            case 187091926:
                                if (str5.equals("audio/ogg")) {
                                    i11 = 19;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case 817335912:
                                if (str5.equals("text/plain")) {
                                    i11 = 20;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case 859118878:
                                if (str5.equals("application/x-abiword")) {
                                    i11 = 21;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case 886992732:
                                if (str5.equals("application/ld+json")) {
                                    i11 = 22;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case 904647503:
                                if (str5.equals("application/msword")) {
                                    i11 = 23;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case 1154306387:
                                if (str5.equals("application/x-bzip")) {
                                    i11 = 24;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case 1154455342:
                                if (str5.equals("application/x-gzip")) {
                                    i11 = 25;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case 1178484637:
                                if (str5.equals("application/octet-stream")) {
                                    i11 = 26;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case 1423759679:
                                if (str5.equals("application/x-bzip2")) {
                                    i11 = 27;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case 1436962847:
                                if (str5.equals("application/vnd.oasis.opendocument.presentation")) {
                                    i11 = 28;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case 1454024983:
                                if (str5.equals("application/x-7z-compressed")) {
                                    i11 = 29;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case 1455492626:
                                if (str5.equals("application/x-freearc")) {
                                    i11 = 30;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case 1503095341:
                                if (str5.equals("audio/3gpp")) {
                                    i11 = 31;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case 1504831518:
                                if (str5.equals("audio/mpeg")) {
                                    i11 = 32;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case 1509238306:
                                if (str5.equals("application/vnd.rar")) {
                                    i11 = 33;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case 1578362927:
                                if (str5.equals("image/vnd.microsoft.icon")) {
                                    i11 = 34;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case 1643664935:
                                if (str5.equals("application/vnd.oasis.opendocument.spreadsheet")) {
                                    i11 = 35;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case 1672200517:
                                if (str5.equals("application/vnd.amazon.ebook")) {
                                    i11 = 36;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case 1993842850:
                                if (str5.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                                    i11 = 37;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case 2049276534:
                                if (str5.equals("application/java-archive")) {
                                    i11 = 38;
                                    break;
                                }
                                i11 = -1;
                                break;
                            case 2132236175:
                                if (str5.equals("text/javascript")) {
                                    i11 = 39;
                                    break;
                                }
                                i11 = -1;
                                break;
                            default:
                                i11 = -1;
                                break;
                        }
                        switch (i11) {
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
                            case 8:
                                str = "ppt";
                                break;
                            case 9:
                                str = "docx";
                                break;
                            case 10:
                                str = "midi";
                                break;
                            case 11:
                                str = "ics";
                                break;
                            case 12:
                                str = "php";
                                break;
                            case 13:
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
                            case 32:
                                str = "mp3";
                                break;
                            case 33:
                                str = "rar";
                                break;
                            case 34:
                                str = "ico";
                                break;
                            case 35:
                                str = "ods";
                                break;
                            case 36:
                                str = "azw";
                                break;
                            case 37:
                                str = "xlsx";
                                break;
                            case 38:
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
                s6Var.setText(sb2);
                break;
            default:
                hi.s1 s1Var = (hi.s1) obj3;
                ArrayList arrayList20 = (ArrayList) obj;
                arrayList20.add(t61.j(-1, s1Var.a0));
                arrayList20.add(t61.C(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, s1Var.Y))));
                break;
        }
    }
}
