package ai;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import bi.ad;
import bi.dd;
import bi.ea;
import bi.jc;
import bi.oc;
import bi.pc;
import bi.r1;
import bi.t1;
import bi.tc;
import bi.uc;
import bi.w1;
import bi.xc;
import fi.e7;
import fi.f7;
import fi.j3;
import fi.ja;
import fi.k2;
import fi.k7;
import fi.m7;
import fi.o5;
import fi.ua;
import fi.va;
import fi.x9;
import fi.ya;
import fi.z1;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.f10;
import org.telegram.messenger.gf;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.messenger.y00;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.ys;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00e8, code lost:
    
        if (r0.equals("audio/mpeg") == false) goto L16;
     */
    @Override // org.telegram.messenger.v10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        boolean z9;
        c20 c20Var;
        String str;
        String upperCase;
        int i7 = this.a;
        char c10 = ' ';
        int i10 = 0;
        Object obj3 = this.b;
        switch (i7) {
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
                        qp.s1(fVar.a).e7.edit().putString("qrBackdrops", Utilities.f(serializedData.toByteArray())).apply();
                        serializedData.cleanup();
                    } catch (Exception e10) {
                        z9 = true;
                        a8.g(e10, true);
                    }
                }
                z9 = true;
                fVar.d = shareThemeBackdrops != null ? z9 : false;
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj4 = arrayList2.get(i11);
                    i11++;
                    ((Runnable) obj4).run();
                }
                break;
            case 1:
                bi.z.e0((bi.z) obj3, (ArrayList) obj);
                break;
            case 2:
                bi.y yVar = (bi.y) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                ArrayList arrayList4 = yVar.b;
                int size2 = arrayList4.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj5 = arrayList4.get(i12);
                    i12++;
                    int i13 = xc.b;
                    x31 K = x31.K(xc.class);
                    K.G = (TL_stars.StarsTransaction) obj5;
                    K.q = true;
                    arrayList3.add(K);
                }
                if (yVar.h) {
                    arrayList3.add(x31.e(-1, hd.M0(2131746053, null)));
                    break;
                } else if (!yVar.f) {
                    for (int i14 = 0; i14 < 3; i14++) {
                        arrayList3.add(x31.q(i14, 7));
                    }
                    break;
                }
                break;
            case 3:
                m20 m20Var = (m20) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                arrayList5.add(x31.k(m20Var.Q1));
                arrayList5.add(bi.p0.i(hd.M0(2131750868, null), hd.M0(2131750869, null), R.drawable.msg_gift_premium));
                arrayList5.add(bi.p0.i(hd.M0(2131750866, null), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(hd.M0(2131750867, null), new a3.f(m20Var, 16)), true), R.drawable.msg_bot));
                arrayList5.add(bi.p0.i(hd.M0(2131750864, null), hd.M0(2131750865, null), R.drawable.menu_unlock));
                arrayList5.add(bi.p0.i(hd.M0(2131750862, null), hd.M0(2131750863, null), R.drawable.menu_feature_paid));
                arrayList5.add(x31.D(org.telegram.messenger.g0.L(68.0f)));
                break;
            case 4:
                ArrayList arrayList6 = (ArrayList) obj;
                x31 x31Var = ((bi.a1) obj3).o2;
                if (x31Var != null) {
                    arrayList6.add(x31Var);
                    break;
                }
                break;
            case 5:
                w1 w1Var = (w1) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = w1Var.V1;
                boolean z10 = w1Var.m2;
                bi.a aVar = w1Var.Y1;
                ArrayList arrayList9 = w1Var.T1;
                ArrayList arrayList10 = w1Var.S1;
                bi.a aVar2 = w1Var.X1;
                bi.a aVar3 = w1Var.W1;
                ArrayList arrayList11 = w1Var.U1;
                if (arrayList11 != null && arrayList10 != null && arrayList9 != null) {
                    arrayList7.add(x31.D(org.telegram.messenger.g0.L(315.0f)));
                    aVar3.b = 0;
                    aVar3.c();
                    aVar2.b = 0;
                    aVar2.c();
                    aVar.b = 0;
                    aVar.c();
                    int i15 = w1Var.b2.s;
                    if (i15 == 0) {
                        arrayList7.add(x31.g(org.telegram.messenger.g0.X2(hd.H(',', z10 ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList11.size()))));
                        int size3 = arrayList11.size();
                        int i16 = 0;
                        while (i16 < size3) {
                            Object obj6 = arrayList11.get(i16);
                            i16++;
                            arrayList7.add(t1.i(i15, new r1((TL_stars.starGiftAttributeBackdrop) aVar3.c(), (TL_stars.starGiftAttributePattern) aVar2.c(), (TL_stars.starGiftAttributeModel) obj6)));
                        }
                        if (!arrayList8.isEmpty()) {
                            arrayList7.add(x31.g(org.telegram.messenger.g0.X2(hd.H(',', z10 ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList11.size()))));
                            int size4 = arrayList8.size();
                            int i17 = 0;
                            while (i17 < size4) {
                                Object obj7 = arrayList8.get(i17);
                                i17++;
                                arrayList7.add(t1.i(i15, new r1((TL_stars.starGiftAttributeBackdrop) aVar3.c(), (TL_stars.starGiftAttributePattern) aVar2.c(), (TL_stars.starGiftAttributeModel) obj7)));
                            }
                            break;
                        }
                    } else if (i15 == 1) {
                        arrayList7.add(x31.g(org.telegram.messenger.g0.X2(hd.H(',', "GiftPreviewCountBackdrops", arrayList10.size()))));
                        int size5 = arrayList10.size();
                        int i18 = 0;
                        while (i18 < size5) {
                            Object obj8 = arrayList10.get(i18);
                            i18++;
                            arrayList7.add(t1.i(i15, new r1((TL_stars.starGiftAttributeBackdrop) obj8, (TL_stars.starGiftAttributePattern) aVar2.c(), (TL_stars.starGiftAttributeModel) aVar.c())));
                        }
                        break;
                    } else if (i15 == 2) {
                        arrayList7.add(x31.g(org.telegram.messenger.g0.X2(hd.H(',', "GiftPreviewCountSymbols", arrayList9.size()))));
                        int size6 = arrayList9.size();
                        int i19 = 0;
                        while (i19 < size6) {
                            Object obj9 = arrayList9.get(i19);
                            i19++;
                            arrayList7.add(t1.i(i15, new r1((TL_stars.starGiftAttributeBackdrop) aVar3.c(), (TL_stars.starGiftAttributePattern) obj9, (TL_stars.starGiftAttributeModel) aVar.c())));
                        }
                        break;
                    }
                }
                break;
            case 6:
                TextView textView = (TextView) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (wallettransaction != null) {
                    long j3 = wallettransaction.fee;
                    if (j3 > 0) {
                        textView.setText(hd.V(null, null, 2131743073, org.telegram.ui.Wallet.n0.s(j3, false)));
                        break;
                    }
                }
                textView.setVisibility(8);
                break;
            case 7:
                v10 v10Var = (v10) obj3;
                Long l10 = (Long) obj;
                Boolean bool = (Boolean) obj2;
                if (v10Var != null) {
                    v10Var.a(l10, bool);
                    break;
                }
                break;
            case 8:
                ((dd) obj3).K0((ArrayList) obj, (l41) obj2);
                break;
            case 9:
                oc ocVar = (oc) obj3;
                ArrayList arrayList12 = (ArrayList) obj;
                arrayList12.add(x31.k(ocVar.P1));
                arrayList12.add(x31.u(hd.M0(2131744215, null)));
                ArrayList u10 = ea.y(ocVar.a, false).u();
                if (u10 == null || u10.isEmpty()) {
                    arrayList12.add(x31.p(31));
                    arrayList12.add(x31.p(31));
                    arrayList12.add(x31.p(31));
                } else {
                    int i20 = 1;
                    int i21 = 0;
                    for (int i22 = 0; i22 < u10.size(); i22++) {
                        TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i22);
                        if (ocVar.U1 || !tL_starsGiftOption.extended) {
                            int i23 = i20 + 1;
                            int i24 = pc.b;
                            x31 K2 = x31.K(pc.class);
                            K2.d = i22;
                            K2.z = i20;
                            long j10 = tL_starsGiftOption.stars;
                            K2.B = j10;
                            K2.l = hd.H(' ', "StarsCount", (int) j10);
                            K2.m = tL_starsGiftOption.loadingStorePrice ? null : org.telegram.messenger.r1.i().f(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                            K2.G = tL_starsGiftOption;
                            arrayList12.add(K2);
                            i20 = i23;
                        } else {
                            i21++;
                        }
                    }
                    boolean z11 = ocVar.U1;
                    if (!z11 && i21 > 0) {
                        String M0 = hd.M0(z11 ? 2131747844 : 2131747835, null);
                        boolean z12 = !ocVar.U1;
                        int i25 = jc.b;
                        x31 K3 = x31.K(jc.class);
                        K3.d = -1;
                        K3.l = M0;
                        K3.f = z12;
                        K3.q = true;
                        arrayList12.add(K3);
                    }
                }
                arrayList12.add(x31.k(ocVar.Q1));
                break;
            case 10:
                tc tcVar = (tc) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                long j11 = tcVar.P1;
                ah.a aVar4 = tcVar.Q1;
                arrayList13.add(x31.m(aVar4));
                boolean z13 = tcVar.V1;
                if (z13) {
                    arrayList13.add(x31.u(hd.M0(2131744215, null)));
                }
                ArrayList z14 = ea.y(tcVar.a, false).z();
                if (z13) {
                    if (z14 == null || z14.isEmpty()) {
                        arrayList13.add(x31.p(31));
                        arrayList13.add(x31.p(31));
                        arrayList13.add(x31.p(31));
                    } else {
                        int i26 = 0;
                        int i27 = 0;
                        boolean z15 = false;
                        int i28 = 1;
                        for (int i29 = 0; i29 < z14.size(); i29++) {
                            TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z14.get(i29);
                            if (tL_starsTopupOption.stars >= j11) {
                                if (tL_starsTopupOption.extended && !tcVar.X1 && z15) {
                                    i27++;
                                } else {
                                    arrayList13.add(pc.i(i29, i28, tL_starsTopupOption));
                                    i26++;
                                    i28++;
                                    z15 = true;
                                }
                            }
                        }
                        if (i26 < 3) {
                            arrayList13.clear();
                            arrayList13.add(x31.k(aVar4));
                            arrayList13.add(x31.u(hd.M0(2131744215, null)));
                            int i30 = 0;
                            for (int i31 = 0; i31 < z14.size(); i31++) {
                                TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z14.get(i31);
                                if (tL_starsTopupOption2.stars >= j11) {
                                    arrayList13.add(pc.i(i31, i28, tL_starsTopupOption2));
                                    i30++;
                                    i28++;
                                }
                            }
                            if (i30 == 0) {
                                int i32 = i28;
                                int i33 = 0;
                                while (i33 < z14.size()) {
                                    arrayList13.add(pc.i(i33, i32, (TL_stars.TL_starsTopupOption) z14.get(i33)));
                                    i33++;
                                    i32++;
                                }
                                boolean z16 = tcVar.X1;
                                if (!z16 && i27 > 0) {
                                    String M02 = hd.M0(z16 ? 2131747844 : 2131747835, null);
                                    boolean z17 = !tcVar.X1;
                                    int i34 = jc.b;
                                    x31 K4 = x31.K(jc.class);
                                    K4.d = -1;
                                    K4.l = M02;
                                    K4.f = z17;
                                    K4.q = true;
                                    arrayList13.add(K4);
                                }
                            } else {
                                tcVar.X1 = true;
                            }
                        } else if (i26 > 0) {
                            boolean z18 = tcVar.X1;
                            if (!z18 && i27 > 0) {
                                String M03 = hd.M0(z18 ? 2131747844 : 2131747835, null);
                                boolean z19 = !tcVar.X1;
                                int i35 = jc.b;
                                x31 K5 = x31.K(jc.class);
                                K5.d = -1;
                                K5.l = M03;
                                K5.f = z19;
                                K5.q = true;
                                arrayList13.add(K5);
                            }
                        } else {
                            int i36 = i28;
                            int i37 = 0;
                            while (i37 < z14.size()) {
                                arrayList13.add(pc.i(i37, i36, (TL_stars.TL_starsTopupOption) z14.get(i37)));
                                i37++;
                                i36++;
                            }
                        }
                    }
                }
                arrayList13.add(x31.k(tcVar.R1));
                break;
            case 11:
                uc ucVar = (uc) obj3;
                ArrayList arrayList14 = (ArrayList) obj;
                arrayList14.add(x31.u(hd.M0(2131744215, null)));
                ArrayList z20 = ea.y(ucVar.a, false).z();
                if (z20 == null || z20.isEmpty()) {
                    arrayList14.add(x31.p(31));
                    arrayList14.add(x31.p(31));
                    arrayList14.add(x31.p(31));
                    arrayList14.add(x31.p(31));
                    arrayList14.add(x31.p(31));
                } else {
                    int i38 = 0;
                    int i39 = 1;
                    while (i10 < z20.size()) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) z20.get(i10);
                        if (!tL_starsTopupOption3.extended || ucVar.R1) {
                            arrayList14.add(pc.i(i10, i39, tL_starsTopupOption3));
                            i39++;
                        } else {
                            i38++;
                        }
                        i10++;
                    }
                    boolean z21 = ucVar.R1;
                    if (!z21 && i38 > 0) {
                        String M04 = hd.M0(z21 ? 2131747844 : 2131747835, null);
                        boolean z22 = !ucVar.R1;
                        int i40 = jc.b;
                        x31 K6 = x31.K(jc.class);
                        K6.d = -1;
                        K6.l = M04;
                        K6.f = z22;
                        K6.q = true;
                        arrayList14.add(K6);
                    }
                }
                arrayList14.add(x31.k(ucVar.P1));
                break;
            case 12:
                ad adVar = (ad) obj3;
                ArrayList arrayList15 = (ArrayList) obj;
                int i41 = adVar.c;
                int i42 = adVar.d;
                long j12 = adVar.f;
                if (j12 != 0) {
                    bi.n0 g10 = bi.n0.g(i41);
                    ArrayList arrayList16 = g10.k(j12).a[i42];
                    int size7 = arrayList16.size();
                    while (i10 < size7) {
                        Object obj10 = arrayList16.get(i10);
                        i10++;
                        int i43 = xc.b;
                        x31 K7 = x31.K(xc.class);
                        K7.G = (TL_stars.StarsTransaction) obj10;
                        K7.q = true;
                        arrayList15.add(K7);
                    }
                    if (!g10.k(j12).e[i42]) {
                        arrayList15.add(x31.q(arrayList15.size(), 7));
                        arrayList15.add(x31.q(arrayList15.size(), 7));
                        arrayList15.add(x31.q(arrayList15.size(), 7));
                        break;
                    }
                } else {
                    ea y10 = ea.y(i41, adVar.e);
                    ArrayList arrayList17 = y10.q[i42];
                    int size8 = arrayList17.size();
                    int i44 = 0;
                    while (i44 < size8) {
                        Object obj11 = arrayList17.get(i44);
                        i44++;
                        int i45 = xc.b;
                        x31 K8 = x31.K(xc.class);
                        K8.G = (TL_stars.StarsTransaction) obj11;
                        K8.q = false;
                        arrayList15.add(K8);
                    }
                    if (!y10.u[i42]) {
                        arrayList15.add(x31.q(arrayList15.size(), 7));
                        arrayList15.add(x31.q(arrayList15.size(), 7));
                        arrayList15.add(x31.q(arrayList15.size(), 7));
                        break;
                    }
                }
                break;
            case 13:
                ch.o oVar = (ch.o) obj3;
                ArrayList arrayList18 = (ArrayList) obj;
                ArrayList arrayList19 = oVar.F;
                r8 r8Var = oVar.e;
                if (r8Var != null && oVar.f != null) {
                    arrayList18.add(x31.j(1, r8Var));
                    arrayList18.add(x31.l(2, oVar.f));
                    int i46 = oVar.Y;
                    if (i46 == 1 || i46 == 0 || oVar.a) {
                        while (i10 < arrayList19.size()) {
                            View view = (View) arrayList19.get(i10);
                            arrayList18.add(((Boolean) oVar.G.get(i10)).booleanValue() ? x31.l(i10 + 100, view) : x31.j(i10 + 100, view));
                            i10++;
                        }
                        break;
                    }
                }
                break;
            case 14:
                ArrayList arrayList20 = (ArrayList) obj;
                ((ei.q) obj3).getClass();
                ArrayList n10 = f10.n();
                int size9 = n10.size();
                while (i10 < size9) {
                    Object obj12 = n10.get(i10);
                    i10++;
                    int i47 = ei.o.b;
                    x31 K9 = x31.K(ei.o.class);
                    K9.G = (y00) obj12;
                    arrayList20.add(K9);
                }
                break;
            case 15:
                fi.m mVar = (fi.m) obj3;
                Canvas canvas = (Canvas) obj;
                Runnable runnable = (Runnable) obj2;
                Paint paint = mVar.I;
                RectF rectF = mVar.y0;
                fi.g gVar = mVar.f;
                if (mVar.g()) {
                    if (mVar.G == null) {
                        runnable.run();
                        break;
                    } else {
                        canvas.translate(-gVar.getEditText().p0, 0.0f);
                        canvas.saveLayerAlpha(0.0f, 0.0f, mVar.G.getWidth(), mVar.G.getHeight(), qs.e4, 31);
                        rectF.set(0.0f, 1.0f, mVar.G.getWidth(), mVar.G.getHeight() - 1);
                        mVar.h(mVar.P, canvas, rectF, 0.0f, true, (-gVar.getX()) - r0.getPaddingLeft(), ((-gVar.getY()) - r0.getPaddingTop()) - r0.getExtendedPaddingTop(), true);
                        canvas.save();
                        paint.setAlpha(qs.v2);
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
                        ys editText = gVar.getEditText();
                        canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), qs.e4, 31);
                        runnable.run();
                        canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), c11);
                        canvas.restore();
                        break;
                    }
                }
            case 16:
                fi.t1 t1Var = (fi.t1) obj3;
                String str2 = (String) obj;
                k2 k2Var = t1Var.r;
                k2Var.i1 = str2;
                k2Var.j1 = ((Integer) obj2).intValue();
                t1Var.c.H(str2);
                break;
            case 17:
                z1 z1Var = (z1) obj3;
                String str3 = (String) obj;
                k2 k2Var2 = z1Var.s;
                k2Var2.i1 = str3;
                k2Var2.j1 = ((Integer) obj2).intValue();
                z1Var.c.D(str3);
                break;
            case 18:
                j3 j3Var = (j3) obj3;
                if (obj != null) {
                    if (j3Var.l1 == null && (obj instanceof gf) && (c20Var = j3Var.m1) != null) {
                        c20Var.a((gf) obj);
                        break;
                    }
                } else {
                    j3Var.getClass();
                    break;
                }
                break;
            case 19:
                o5 o5Var = (o5) obj3;
                o5Var.b0(o5Var.g0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
            case 20:
                ((ua) obj3).X(((Float) obj2).floatValue(), (Bitmap) obj);
                break;
            case 21:
                m7 m7Var = (m7) obj3;
                ArrayList arrayList21 = (ArrayList) obj;
                if (m7Var.Z1 || m7Var.Y1 != null) {
                    TLRPC.WebPage webPage = m7Var.Y1;
                    f7 f7Var = new f7(m7Var, 0);
                    int i48 = k7.b;
                    x31 K10 = x31.K(k7.class);
                    K10.G = webPage;
                    K10.D = f7Var;
                    arrayList21.add(K10);
                }
                arrayList21.add(x31.k(m7Var.Q1));
                arrayList21.add(x31.B(1, null));
                x31 i49 = x31.i(2, hd.M0(2131744638, null));
                i49.L(m7Var.e2);
                arrayList21.add(i49);
                if (m7Var.e2) {
                    arrayList21.add(x31.k(m7Var.R1));
                }
                arrayList21.add(x31.B(3, null));
                arrayList21.add(x31.k(m7Var.S1));
                break;
            case 22:
                va vaVar = (va) obj3;
                Float f10 = (Float) obj2;
                long duration = vaVar.X0.getDuration() < 100 ? vaVar.K1.h0 : vaVar.X0.getDuration();
                float floatValue = ((f10.floatValue() / 0.96f) * 0.04f) + f10.floatValue();
                e7 e7Var = vaVar.K1;
                float f11 = e7Var.a0;
                float f12 = e7Var.Z;
                float f13 = (f11 - f12) * floatValue;
                float f14 = duration;
                long j13 = (long) (f13 * f14);
                ja jaVar = vaVar.X0;
                long j14 = (long) ((f12 * f14) + j13);
                vaVar.M1 = j14;
                jaVar.m(j14);
                x9 x9Var = vaVar.v1;
                if (x9Var != null) {
                    x9Var.setCoverTime(vaVar.M1);
                }
                e7 e7Var2 = vaVar.K1;
                if (e7Var2 != null && e7Var2.g) {
                    e7Var2.j = true;
                    break;
                }
                break;
            case 23:
                ((ya) obj3).b((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 24:
                ((gi.f) obj3).E0((ArrayList) obj, (l41) obj2);
                break;
            case 25:
                gi.e eVar = (gi.e) obj3;
                ArrayList arrayList22 = (ArrayList) obj;
                arrayList22.add(x31.k(eVar.Q1));
                arrayList22.add(x31.k(eVar.R1));
                break;
            case 26:
                ((hi.j) obj3).H0((ArrayList) obj, (l41) obj2);
                break;
            case 27:
                hi.q.Z((hi.q) obj3, (ArrayList) obj);
                break;
            case 28:
                j6 j6Var = (j6) obj3;
                String str4 = (String) obj;
                Long l11 = (Long) obj2;
                StringBuilder sb2 = new StringBuilder();
                if (l11.longValue() > 0) {
                    sb2.append("~");
                    sb2.append(org.telegram.messenger.g0.i0(l11.longValue(), false, false));
                }
                if (str4 == null) {
                    upperCase = null;
                } else {
                    if (!str4.isEmpty()) {
                        switch (str4.hashCode()) {
                            case -2008589971:
                                if (str4.equals("application/epub+zip")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1719571662:
                                if (str4.equals("application/vnd.oasis.opendocument.text")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1664118616:
                                if (str4.equals("video/3gpp")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1578389996:
                                if (str4.equals("application/vnd.ms-fontobject")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1348237359:
                                if (str4.equals("application/x-cdf")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1348236892:
                                if (str4.equals("application/x-csh")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1079884372:
                                if (str4.equals("video/x-msvideo")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1073633483:
                                if (str4.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                                    c10 = 7;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1071817359:
                                if (str4.equals("application/vnd.ms-powerpoint")) {
                                    c10 = '\b';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1050893613:
                                if (str4.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                                    c10 = '\t';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1007601745:
                                if (str4.equals("audio/x-midi")) {
                                    c10 = '\n';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -958424608:
                                if (str4.equals("text/calendar")) {
                                    c10 = 11;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -816908365:
                                if (str4.equals("application/x-httpd-php")) {
                                    c10 = '\f';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -648684635:
                                if (str4.equals("audio/3gpp2")) {
                                    c10 = '\r';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -433129473:
                                if (str4.equals("application/vnd.apple.installer+xml")) {
                                    c10 = 14;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -366307023:
                                if (str4.equals("application/vnd.ms-excel")) {
                                    c10 = 15;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -48069494:
                                if (str4.equals("video/3gpp2")) {
                                    c10 = 16;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -43923783:
                                if (str4.equals("application/gzip")) {
                                    c10 = 17;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -43491031:
                                if (str4.equals("application/x-sh")) {
                                    c10 = 18;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 187091926:
                                if (str4.equals("audio/ogg")) {
                                    c10 = 19;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 817335912:
                                if (str4.equals("text/plain")) {
                                    c10 = 20;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 859118878:
                                if (str4.equals("application/x-abiword")) {
                                    c10 = 21;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 886992732:
                                if (str4.equals("application/ld+json")) {
                                    c10 = 22;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 904647503:
                                if (str4.equals("application/msword")) {
                                    c10 = 23;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1154306387:
                                if (str4.equals("application/x-bzip")) {
                                    c10 = 24;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1154455342:
                                if (str4.equals("application/x-gzip")) {
                                    c10 = 25;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1178484637:
                                if (str4.equals("application/octet-stream")) {
                                    c10 = 26;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1423759679:
                                if (str4.equals("application/x-bzip2")) {
                                    c10 = 27;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1436962847:
                                if (str4.equals("application/vnd.oasis.opendocument.presentation")) {
                                    c10 = 28;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1454024983:
                                if (str4.equals("application/x-7z-compressed")) {
                                    c10 = 29;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1455492626:
                                if (str4.equals("application/x-freearc")) {
                                    c10 = 30;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1503095341:
                                if (str4.equals("audio/3gpp")) {
                                    c10 = 31;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1504831518:
                                break;
                            case 1509238306:
                                if (str4.equals("application/vnd.rar")) {
                                    c10 = '!';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1578362927:
                                if (str4.equals("image/vnd.microsoft.icon")) {
                                    c10 = '\"';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1643664935:
                                if (str4.equals("application/vnd.oasis.opendocument.spreadsheet")) {
                                    c10 = '#';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1672200517:
                                if (str4.equals("application/vnd.amazon.ebook")) {
                                    c10 = '$';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1993842850:
                                if (str4.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                                    c10 = '%';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2049276534:
                                if (str4.equals("application/java-archive")) {
                                    c10 = '&';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 2132236175:
                                if (str4.equals("text/javascript")) {
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
                            case qs.U /* 31 */:
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
                            case qs.T /* 30 */:
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
                            case '\'':
                                str = "js";
                                break;
                            default:
                                if (str4.contains("/")) {
                                    str4 = str4.substring(str4.indexOf("/") + 1);
                                }
                                if (str4.contains("-")) {
                                    str4 = str4.substring(str4.indexOf("-") + 1);
                                }
                                if (str4.contains("+")) {
                                    str4 = str4.substring(0, str4.indexOf("+"));
                                }
                                str = str4.toLowerCase();
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
                    sb2.append(hd.M0(2131753975, null));
                }
                j6Var.setText(sb2);
                break;
            default:
                hi.i1 i1Var = (hi.i1) obj3;
                ArrayList arrayList23 = (ArrayList) obj;
                arrayList23.add(x31.j(-1, i1Var.S1));
                arrayList23.add(x31.C(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131752980, i1Var.Q1))));
                break;
        }
    }
}
