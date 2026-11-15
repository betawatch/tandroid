package bi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import di.bb;
import di.cb;
import di.fb;
import di.ib;
import di.l8;
import di.lb;
import di.sa;
import di.u8;
import di.wa;
import di.xa;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c10;
import org.telegram.messenger.ff;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.r9;
import org.telegram.messenger.s10;
import org.telegram.messenger.v00;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.wp0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        ((gi.p) this.b).getClass();
        ArrayList n10 = c10.n();
        int size = n10.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj3 = n10.get(i7);
            i7++;
            int i10 = gi.n.b;
            b41 K = b41.K(gi.n.class);
            K.G = (v00) obj3;
            arrayList.add(K);
        }
    }

    private final void c(Object obj, Object obj2) {
        hi.m mVar = (hi.m) this.b;
        Canvas canvas = (Canvas) obj;
        Runnable runnable = (Runnable) obj2;
        Paint paint = mVar.J;
        RectF rectF = mVar.z0;
        hi.g gVar = mVar.f;
        if (!mVar.g()) {
            Paint c10 = mVar.Q.c(1.0f);
            gVar.getEditText().setHintColor(c10 != null ? -1 : -2130706433);
            if (c10 == null) {
                runnable.run();
                return;
            }
            ft editText = gVar.getEditText();
            canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), ns.e4, 31);
            runnable.run();
            canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), c10);
            canvas.restore();
            return;
        }
        if (mVar.H == null) {
            runnable.run();
            return;
        }
        canvas.translate(-gVar.getEditText().q0, 0.0f);
        canvas.saveLayerAlpha(0.0f, 0.0f, mVar.H.getWidth(), mVar.H.getHeight(), ns.e4, 31);
        rectF.set(0.0f, 1.0f, mVar.H.getWidth(), mVar.H.getHeight() - 1);
        mVar.h(mVar.Q, canvas, rectF, 0.0f, true, (-gVar.getX()) - r14.getPaddingLeft(), ((-gVar.getY()) - r14.getPaddingTop()) - r14.getExtendedPaddingTop(), true);
        canvas.save();
        paint.setAlpha(ns.v2);
        canvas.drawBitmap(mVar.H, 0.0f, 0.0f, paint);
        canvas.restore();
        canvas.restore();
    }

    private final void d(Object obj, Object obj2) {
        hi.y1 y1Var = (hi.y1) this.b;
        String str = (String) obj;
        hi.i2 i2Var = y1Var.s;
        i2Var.m1 = str;
        i2Var.n1 = ((Integer) obj2).intValue();
        y1Var.c.D(str);
    }

    private final void e(Object obj, Object obj2) {
        z10 z10Var;
        hi.h3 h3Var = (hi.h3) this.b;
        if (obj == null) {
            h3Var.getClass();
        } else if (h3Var.p1 == null && (obj instanceof ff) && (z10Var = h3Var.q1) != null) {
            z10Var.a((ff) obj);
        }
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        int i7;
        int i10;
        int i11;
        int i12 = this.a;
        int i13 = 7;
        char c10 = 3;
        int i14 = 0;
        Object obj3 = this.b;
        switch (i12) {
            case 0:
                e eVar = (e) obj3;
                ArrayList arrayList = (ArrayList) obj;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = eVar.T1;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        r9 r9Var = eVar.U1;
                        ai.v2 v2Var = new ai.v2(1, eVar, tL_StarGiftAuctionAcquiredGift);
                        int i15 = c.b;
                        b41 K = b41.K(c.class);
                        K.G = tL_StarGiftAuctionAcquiredGift;
                        K.H = r9Var;
                        K.D = v2Var;
                        arrayList.add(K);
                    }
                    arrayList.add(b41.D(org.telegram.messenger.g0.L(16.0f)));
                    break;
                }
                break;
            case 1:
                ((ArrayList) obj).add(((g) obj3).T1);
                break;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(((y) obj3).U1);
                arrayList2.add(b41.D(org.telegram.messenger.g0.L(16.0f)));
                break;
            case 3:
                ((ArrayList) obj).add(b41.j(-1, ((m0) obj3).V1));
                break;
            case 4:
                ((ArrayList) obj).add(b41.j(-1, ((t0) obj3).V1));
                break;
            case 5:
                ((s2) obj3).d1((ArrayList) obj, (p41) obj2);
                break;
            case 6:
                c4 c4Var = (c4) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                org.telegram.ui.ActionBar.e6 e6Var = c4Var.c;
                wp0 wp0Var = c4Var.a;
                l8 l8Var = c4Var.e;
                if (l8Var != null) {
                    if ((!l8Var.e || l8Var.g != 783) && l8Var.l.size() <= 0) {
                        l8 l8Var2 = c4Var.e;
                        if (l8Var2.j && !l8Var2.i) {
                        }
                    }
                    l8 l8Var3 = c4Var.e;
                    if (l8Var3 == null || (i11 = l8Var3.n) == 0) {
                        i7 = 3;
                        i10 = 3;
                    } else {
                        i7 = 3;
                        i10 = Math.min(3, i11);
                    }
                    int max = Math.max(1, i10);
                    l8 l8Var4 = c4Var.e;
                    if (l8Var4 != null) {
                        ArrayList arrayList4 = l8Var4.l;
                        int size = arrayList4.size();
                        int i16 = i7;
                        int i17 = 0;
                        while (i17 < size) {
                            Object obj4 = arrayList4.get(i17);
                            i17++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj4;
                            boolean z10 = c4Var.d;
                            int i18 = h2.b;
                            b41 K2 = b41.K(h2.class);
                            K2.u = 1;
                            K2.z = 0;
                            K2.G = savedStarGift;
                            K2.q = true;
                            K2.f = false;
                            K2.r = z10;
                            K2.h = c4Var.h && (c4Var.e != wp0Var.d || savedStarGift.pinned_to_top);
                            arrayList3.add(K2);
                            i16--;
                            if (i16 == 0) {
                                i16 = 3;
                            }
                        }
                        l8 l8Var5 = c4Var.e;
                        if (l8Var5.i || !l8Var5.j) {
                            int i19 = 0;
                            while (true) {
                                if (i19 < (i16 <= 0 ? 3 : i16)) {
                                    i19++;
                                    b41 q10 = b41.q(i19, 34);
                                    q10.u = 1;
                                    arrayList3.add(q10);
                                }
                            }
                        }
                    }
                    if (wp0Var.d == c4Var.e) {
                        arrayList3.add(b41.D(org.telegram.messenger.g0.L(20.0f)));
                        if (wp0Var.c == m10.i(c4Var.b).e()) {
                            int i20 = org.telegram.ui.ActionBar.j6.z6;
                            int w02 = org.telegram.ui.ActionBar.j6.w0(i20, e6Var);
                            String M0 = hd.M0(2131746671, null);
                            int L = org.telegram.messenger.g0.L(24.0f);
                            int i21 = d4.b;
                            b41 K3 = b41.K(d4.class);
                            K3.l = M0;
                            K3.z = 17;
                            K3.B = w02;
                            K3.A = 14.0f;
                            K3.i = L;
                            K3.k = 0;
                            K3.q = false;
                            K3.G = e6Var;
                            K3.H = Integer.valueOf(i20);
                            arrayList3.add(K3);
                        }
                        arrayList3.add(b41.D(org.telegram.messenger.g0.L(82.0f)));
                    } else if (!arrayList3.isEmpty()) {
                        arrayList3.add(b41.D(org.telegram.messenger.g0.L(82.0f)));
                    }
                    if (!arrayList3.isEmpty()) {
                        arrayList3.add(0, b41.D(org.telegram.messenger.g0.L(c4Var.I ? 42.0f : 12.0f)));
                    }
                    if (c4Var.f.getSpanCount() != max) {
                        org.telegram.messenger.g0.h3(new d3(c4Var, max, 1));
                    }
                    wp0Var.p();
                    wp0Var.post(new a3.f(wp0Var, 24));
                    break;
                }
                break;
            case 7:
                a6 a6Var = (a6) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                o5 o5Var = a6Var.d;
                ArrayList arrayList6 = o5Var.d;
                int size2 = arrayList6.size();
                int i22 = 0;
                while (i22 < size2) {
                    Object obj5 = arrayList6.get(i22);
                    i22++;
                    arrayList5.add(h2.i(0, (TL_stars.TL_starGiftUnique) obj5, false, false, false, true, false));
                }
                if (o5Var.t || !o5Var.u) {
                    b41 q11 = b41.q(-1, 34);
                    q11.u = 1;
                    arrayList5.add(q11);
                    b41 q12 = b41.q(-2, 34);
                    q12.u = 1;
                    arrayList5.add(q12);
                    b41 q13 = b41.q(-3, 34);
                    q13.u = 1;
                    arrayList5.add(q13);
                    if (o5Var.d.isEmpty()) {
                        b41 q14 = b41.q(-4, 34);
                        q14.u = 1;
                        arrayList5.add(q14);
                        b41 q15 = b41.q(-5, 34);
                        q15.u = 1;
                        arrayList5.add(q15);
                        b41 q16 = b41.q(-6, 34);
                        q16.u = 1;
                        arrayList5.add(q16);
                        b41 q17 = b41.q(-7, 34);
                        q17.u = 1;
                        arrayList5.add(q17);
                        b41 q18 = b41.q(-8, 34);
                        q18.u = 1;
                        arrayList5.add(q18);
                        b41 q19 = b41.q(-9, 34);
                        q19.u = 1;
                        arrayList5.add(q19);
                        b41 q20 = b41.q(-10, 34);
                        q20.u = 1;
                        arrayList5.add(q20);
                        b41 q21 = b41.q(-11, 34);
                        q21.u = 1;
                        arrayList5.add(q21);
                        b41 q22 = b41.q(-12, 34);
                        q22.u = 1;
                        arrayList5.add(q22);
                        b41 q23 = b41.q(-13, 34);
                        q23.u = 1;
                        arrayList5.add(q23);
                        b41 q24 = b41.q(-14, 34);
                        q24.u = 1;
                        arrayList5.add(q24);
                        b41 q25 = b41.q(-15, 34);
                        q25.u = 1;
                        arrayList5.add(q25);
                    }
                }
                boolean z11 = arrayList5.isEmpty() && !o5Var.t;
                if (a6Var.x != z11) {
                    a6Var.x = z11;
                    a6Var.w.setVisibility(0);
                    a6Var.w.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.95f).scaleY(z11 ? 1.0f : 0.95f).setInterpolator(er.h).setDuration(320L).setListener(new v4(0, a6Var, z11)).start();
                    break;
                }
                break;
            case 8:
                z5 z5Var = (z5) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                y5 y5Var = z5Var.U1;
                if (y5Var != null) {
                    l8 l8Var6 = y5Var.b;
                    o5 o5Var2 = y5Var.c;
                    if (l8Var6 != null && o5Var2 != null) {
                        int currentTime = ConnectionsManager.getInstance(z5Var.a).getCurrentTime();
                        arrayList7.add(b41.t(-1, hd.M0(2131749770, null)));
                        ArrayList arrayList8 = l8Var6.l;
                        int size3 = arrayList8.size();
                        boolean z12 = true;
                        int i23 = 0;
                        int i24 = 0;
                        while (i24 < size3) {
                            Object obj6 = arrayList8.get(i24);
                            i24++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj6;
                            char c11 = c10;
                            if (z5Var.c2.contains(Long.valueOf(savedStarGift2.gift.id))) {
                                c10 = c11;
                            } else {
                                boolean z13 = savedStarGift2.can_craft_at <= currentTime;
                                b41 i25 = h2.i(0, savedStarGift2.gift, false, true, false, false, true);
                                i25.g = z13;
                                arrayList7.add(i25);
                                i23++;
                                c10 = c11;
                                z12 = false;
                            }
                        }
                        if (l8Var6.i || !l8Var6.j) {
                            int i26 = i23 % 3;
                            int i27 = 6 - i26;
                            for (int i28 = 0; i28 < i27; i28++) {
                                b41 q26 = b41.q((i28 - i26) + 1, 35);
                                q26.u = 1;
                                arrayList7.add(q26);
                            }
                        } else if (z12) {
                            arrayList7.add(b41.g(hd.M0(2131749769, null)));
                        }
                        if (o5Var2.e > 0 || z5Var.f2) {
                            z5Var.f2 = true;
                            String M02 = hd.M0(2131749772, null);
                            b41 b41Var = new b41(42);
                            b41Var.d = -2;
                            b41Var.o = M02;
                            arrayList7.add(b41Var);
                            HorizontalScrollView horizontalScrollView = z5Var.V1;
                            if (horizontalScrollView != null) {
                                arrayList7.add(b41.j(-3, horizontalScrollView));
                            }
                            ArrayList arrayList9 = o5Var2.d;
                            int size4 = arrayList9.size();
                            int i29 = 0;
                            while (i29 < size4) {
                                Object obj7 = arrayList9.get(i29);
                                i29++;
                                arrayList7.add(h2.i(0, (TL_stars.TL_starGiftUnique) obj7, false, true, false, true, true));
                            }
                            if (o5Var2.t || !o5Var2.u) {
                                b41 q27 = b41.q(10, 35);
                                q27.u = 1;
                                arrayList7.add(q27);
                                b41 q28 = b41.q(11, 35);
                                q28.u = 1;
                                arrayList7.add(q28);
                                b41 q29 = b41.q(12, 35);
                                q29.u = 1;
                                arrayList7.add(q29);
                                b41 q30 = b41.q(13, 35);
                                q30.u = 1;
                                arrayList7.add(q30);
                                b41 q31 = b41.q(14, 35);
                                q31.u = 1;
                                arrayList7.add(q31);
                                b41 q32 = b41.q(15, 35);
                                q32.u = 1;
                                arrayList7.add(q32);
                                break;
                            }
                        }
                    }
                }
                break;
            case 9:
                e6 e6Var2 = (e6) obj3;
                ArrayList arrayList10 = (ArrayList) obj;
                l8 l8Var7 = e6Var2.U1;
                if (l8Var7 != null) {
                    ArrayList arrayList11 = l8Var7.l;
                    arrayList10.add(b41.D(org.telegram.messenger.g0.L(16.0f)));
                    if (l8Var7.i && arrayList11.isEmpty()) {
                        b41 q33 = b41.q(1, 34);
                        q33.u = 1;
                        arrayList10.add(q33);
                        b41 q34 = b41.q(2, 34);
                        q34.u = 1;
                        arrayList10.add(q34);
                        b41 q35 = b41.q(3, 34);
                        q35.u = 1;
                        arrayList10.add(q35);
                        b41 q36 = b41.q(4, 34);
                        q36.u = 1;
                        arrayList10.add(q36);
                        b41 q37 = b41.q(5, 34);
                        q37.u = 1;
                        arrayList10.add(q37);
                        b41 q38 = b41.q(6, 34);
                        q38.u = 1;
                        arrayList10.add(q38);
                        b41 q39 = b41.q(7, 34);
                        q39.u = 1;
                        arrayList10.add(q39);
                        b41 q40 = b41.q(8, 34);
                        q40.u = 1;
                        arrayList10.add(q40);
                        b41 q41 = b41.q(9, 34);
                        q41.u = 1;
                        arrayList10.add(q41);
                    } else {
                        int size5 = arrayList11.size();
                        int i30 = 3;
                        int i31 = 0;
                        while (i31 < size5) {
                            Object obj8 = arrayList11.get(i31);
                            i31++;
                            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj8;
                            if (!savedStarGift3.collection_id.contains(Integer.valueOf(e6Var2.T1))) {
                                int i32 = h2.b;
                                b41 K4 = b41.K(h2.class);
                                K4.u = 1;
                                K4.z = 0;
                                K4.G = savedStarGift3;
                                K4.q = true;
                                K4.f = true;
                                K4.r = false;
                                HashSet hashSet = e6Var2.V1;
                                int i33 = savedStarGift3.msg_id;
                                K4.L(hashSet.contains(Long.valueOf(i33 == 0 ? savedStarGift3.saved_id : i33)));
                                K4.u = 1;
                                arrayList10.add(K4);
                                i30--;
                                if (i30 == 0) {
                                    i30 = 3;
                                }
                            }
                        }
                        if (l8Var7.i || !l8Var7.j) {
                            int i34 = 0;
                            while (true) {
                                if (i34 < (i30 <= 0 ? 3 : i30)) {
                                    i34++;
                                    b41 q42 = b41.q(i34, 34);
                                    q42.u = 1;
                                    arrayList10.add(q42);
                                }
                            }
                        }
                    }
                    arrayList10.add(b41.D(org.telegram.messenger.g0.L(68.0f)));
                    break;
                }
                break;
            case 10:
                ch.o oVar = (ch.o) obj3;
                ArrayList arrayList12 = (ArrayList) obj;
                ArrayList arrayList13 = oVar.G;
                q8 q8Var = oVar.e;
                if (q8Var != null && oVar.f != null) {
                    arrayList12.add(b41.j(1, q8Var));
                    arrayList12.add(b41.l(2, oVar.f));
                    int i35 = oVar.Z;
                    if (i35 == 1 || i35 == 0 || oVar.a) {
                        for (int i36 = 0; i36 < arrayList13.size(); i36++) {
                            View view = (View) arrayList13.get(i36);
                            arrayList12.add(((Boolean) oVar.H.get(i36)).booleanValue() ? b41.l(i36 + 100, view) : b41.j(i36 + 100, view));
                        }
                        break;
                    }
                }
                break;
            case 11:
                ci.d dVar = (ci.d) obj3;
                TLRPC.ShareThemeBackdrops shareThemeBackdrops = (TLRPC.ShareThemeBackdrops) obj;
                ArrayList arrayList14 = dVar.e;
                dVar.c = false;
                if (shareThemeBackdrops instanceof TLRPC.TL_shareThemeBackdrops) {
                    TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = (TLRPC.TL_shareThemeBackdrops) shareThemeBackdrops;
                    dVar.b = tL_shareThemeBackdrops;
                    try {
                        SerializedData serializedData = new SerializedData(tL_shareThemeBackdrops.getObjectSize());
                        dVar.b.serializeToStream(serializedData);
                        np.s1(dVar.a).f7.edit().putString("qrBackdrops", Utilities.f(serializedData.toByteArray())).apply();
                        serializedData.cleanup();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                dVar.d = shareThemeBackdrops != null;
                ArrayList arrayList15 = new ArrayList(arrayList14);
                arrayList14.clear();
                int size6 = arrayList15.size();
                int i37 = 0;
                while (i37 < size6) {
                    Object obj9 = arrayList15.get(i37);
                    i37++;
                    ((Runnable) obj9).run();
                }
                break;
            case 12:
                di.t.e0((di.t) obj3, (ArrayList) obj);
                break;
            case 13:
                di.s sVar = (di.s) obj3;
                ArrayList arrayList16 = (ArrayList) obj;
                ArrayList arrayList17 = sVar.b;
                int size7 = arrayList17.size();
                int i38 = 0;
                while (i38 < size7) {
                    Object obj10 = arrayList17.get(i38);
                    i38++;
                    int i39 = fb.b;
                    b41 K5 = b41.K(fb.class);
                    K5.G = (TL_stars.StarsTransaction) obj10;
                    K5.q = true;
                    arrayList16.add(K5);
                }
                if (sVar.h) {
                    arrayList16.add(b41.e(-1, hd.M0(2131746052, null)));
                    break;
                } else if (!sVar.f) {
                    for (int i40 = 0; i40 < 3; i40++) {
                        arrayList16.add(b41.q(i40, 7));
                    }
                    break;
                }
                break;
            case 14:
                p20 p20Var = (p20) obj3;
                ArrayList arrayList18 = (ArrayList) obj;
                arrayList18.add(b41.k(p20Var.U1));
                arrayList18.add(di.g0.i(hd.M0(2131750867, null), hd.M0(2131750868, null), R.drawable.msg_gift_premium));
                arrayList18.add(di.g0.i(hd.M0(2131750865, null), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(hd.M0(2131750866, null), new ch.w(p20Var, i13)), true), R.drawable.msg_bot));
                arrayList18.add(di.g0.i(hd.M0(2131750863, null), hd.M0(2131750864, null), R.drawable.menu_unlock));
                arrayList18.add(di.g0.i(hd.M0(2131750861, null), hd.M0(2131750862, null), R.drawable.menu_feature_paid));
                arrayList18.add(b41.D(org.telegram.messenger.g0.L(68.0f)));
                break;
            case 15:
                ArrayList arrayList19 = (ArrayList) obj;
                b41 b41Var2 = ((di.p0) obj3).s2;
                if (b41Var2 != null) {
                    arrayList19.add(b41Var2);
                    break;
                }
                break;
            case 16:
                di.i1 i1Var = (di.i1) obj3;
                ArrayList arrayList20 = (ArrayList) obj;
                ArrayList arrayList21 = i1Var.Z1;
                boolean z14 = i1Var.q2;
                com.google.android.gms.common.api.internal.p pVar = i1Var.c2;
                ArrayList arrayList22 = i1Var.X1;
                ArrayList arrayList23 = i1Var.W1;
                com.google.android.gms.common.api.internal.p pVar2 = i1Var.b2;
                com.google.android.gms.common.api.internal.p pVar3 = i1Var.a2;
                ArrayList arrayList24 = i1Var.Y1;
                if (arrayList24 != null && arrayList23 != null && arrayList22 != null) {
                    arrayList20.add(b41.D(org.telegram.messenger.g0.L(315.0f)));
                    pVar3.a = 0;
                    pVar3.c();
                    pVar2.a = 0;
                    pVar2.c();
                    pVar.a = 0;
                    pVar.c();
                    int i41 = i1Var.f2.s;
                    if (i41 == 0) {
                        arrayList20.add(b41.g(org.telegram.messenger.g0.X2(hd.H(',', z14 ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList24.size()))));
                        int size8 = arrayList24.size();
                        int i42 = 0;
                        while (i42 < size8) {
                            Object obj11 = arrayList24.get(i42);
                            i42++;
                            arrayList20.add(di.f1.i(i41, new di.d1((TL_stars.starGiftAttributeBackdrop) pVar3.c(), (TL_stars.starGiftAttributePattern) pVar2.c(), (TL_stars.starGiftAttributeModel) obj11)));
                        }
                        if (!arrayList21.isEmpty()) {
                            arrayList20.add(b41.g(org.telegram.messenger.g0.X2(hd.H(',', z14 ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList24.size()))));
                            int size9 = arrayList21.size();
                            int i43 = 0;
                            while (i43 < size9) {
                                Object obj12 = arrayList21.get(i43);
                                i43++;
                                arrayList20.add(di.f1.i(i41, new di.d1((TL_stars.starGiftAttributeBackdrop) pVar3.c(), (TL_stars.starGiftAttributePattern) pVar2.c(), (TL_stars.starGiftAttributeModel) obj12)));
                            }
                            break;
                        }
                    } else if (i41 == 1) {
                        arrayList20.add(b41.g(org.telegram.messenger.g0.X2(hd.H(',', "GiftPreviewCountBackdrops", arrayList23.size()))));
                        int size10 = arrayList23.size();
                        int i44 = 0;
                        while (i44 < size10) {
                            Object obj13 = arrayList23.get(i44);
                            i44++;
                            arrayList20.add(di.f1.i(i41, new di.d1((TL_stars.starGiftAttributeBackdrop) obj13, (TL_stars.starGiftAttributePattern) pVar2.c(), (TL_stars.starGiftAttributeModel) pVar.c())));
                        }
                        break;
                    } else if (i41 == 2) {
                        arrayList20.add(b41.g(org.telegram.messenger.g0.X2(hd.H(',', "GiftPreviewCountSymbols", arrayList22.size()))));
                        int size11 = arrayList22.size();
                        int i45 = 0;
                        while (i45 < size11) {
                            Object obj14 = arrayList22.get(i45);
                            i45++;
                            arrayList20.add(di.f1.i(i41, new di.d1((TL_stars.starGiftAttributeBackdrop) pVar3.c(), (TL_stars.starGiftAttributePattern) obj14, (TL_stars.starGiftAttributeModel) pVar.c())));
                        }
                        break;
                    }
                }
                break;
            case 17:
                TextView textView = (TextView) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (wallettransaction != null) {
                    long j3 = wallettransaction.fee;
                    if (j3 > 0) {
                        textView.setText(hd.V(null, null, 2131743072, org.telegram.ui.Wallet.l0.s(j3, false)));
                        break;
                    }
                }
                textView.setVisibility(8);
                break;
            case 18:
                s10 s10Var = (s10) obj3;
                Long l10 = (Long) obj;
                Boolean bool = (Boolean) obj2;
                if (s10Var != null) {
                    s10Var.a(l10, bool);
                    break;
                }
                break;
            case 19:
                ((lb) obj3).K0((ArrayList) obj, (p41) obj2);
                break;
            case 20:
                wa waVar = (wa) obj3;
                ArrayList arrayList25 = (ArrayList) obj;
                arrayList25.add(b41.k(waVar.T1));
                arrayList25.add(b41.u(hd.M0(2131744214, null)));
                ArrayList u10 = u8.y(waVar.a, false).u();
                if (u10 == null || u10.isEmpty()) {
                    arrayList25.add(b41.p(31));
                    arrayList25.add(b41.p(31));
                    arrayList25.add(b41.p(31));
                } else {
                    int i46 = 1;
                    int i47 = 0;
                    for (int i48 = 0; i48 < u10.size(); i48++) {
                        TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i48);
                        if (waVar.Y1 || !tL_starsGiftOption.extended) {
                            int i49 = i46 + 1;
                            int i50 = xa.b;
                            b41 K6 = b41.K(xa.class);
                            K6.d = i48;
                            K6.z = i46;
                            long j10 = tL_starsGiftOption.stars;
                            K6.B = j10;
                            K6.l = hd.H(' ', "StarsCount", (int) j10);
                            K6.m = tL_starsGiftOption.loadingStorePrice ? null : org.telegram.messenger.r1.i().f(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                            K6.G = tL_starsGiftOption;
                            arrayList25.add(K6);
                            i46 = i49;
                        } else {
                            i47++;
                        }
                    }
                    boolean z15 = waVar.Y1;
                    if (!z15 && i47 > 0) {
                        String M03 = hd.M0(z15 ? 2131747845 : 2131747836, null);
                        boolean z16 = !waVar.Y1;
                        int i51 = sa.b;
                        b41 K7 = b41.K(sa.class);
                        K7.d = -1;
                        K7.l = M03;
                        K7.f = z16;
                        K7.q = true;
                        arrayList25.add(K7);
                    }
                }
                arrayList25.add(b41.k(waVar.U1));
                break;
            case 21:
                bb bbVar = (bb) obj3;
                ArrayList arrayList26 = (ArrayList) obj;
                long j11 = bbVar.T1;
                ah.a aVar = bbVar.U1;
                arrayList26.add(b41.m(aVar));
                boolean z17 = bbVar.Z1;
                if (z17) {
                    arrayList26.add(b41.u(hd.M0(2131744214, null)));
                }
                ArrayList z18 = u8.y(bbVar.a, false).z();
                if (z17) {
                    if (z18 == null || z18.isEmpty()) {
                        arrayList26.add(b41.p(31));
                        arrayList26.add(b41.p(31));
                        arrayList26.add(b41.p(31));
                    } else {
                        int i52 = 0;
                        int i53 = 0;
                        int i54 = 0;
                        boolean z19 = false;
                        int i55 = 1;
                        while (i52 < z18.size()) {
                            TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z18.get(i52);
                            ArrayList arrayList27 = z18;
                            if (tL_starsTopupOption.stars >= j11) {
                                if (tL_starsTopupOption.extended && !bbVar.b2 && z19) {
                                    i54++;
                                } else {
                                    arrayList26.add(xa.i(i52, i55, tL_starsTopupOption));
                                    i53++;
                                    i55++;
                                    z19 = true;
                                }
                            }
                            i52++;
                            z18 = arrayList27;
                        }
                        ArrayList arrayList28 = z18;
                        if (i53 < 3) {
                            arrayList26.clear();
                            arrayList26.add(b41.k(aVar));
                            arrayList26.add(b41.u(hd.M0(2131744214, null)));
                            int i56 = 0;
                            int i57 = 0;
                            while (i56 < arrayList28.size()) {
                                ArrayList arrayList29 = arrayList28;
                                TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList29.get(i56);
                                if (tL_starsTopupOption2.stars >= j11) {
                                    arrayList26.add(xa.i(i56, i55, tL_starsTopupOption2));
                                    i57++;
                                    i55++;
                                }
                                i56++;
                                arrayList28 = arrayList29;
                            }
                            ArrayList arrayList30 = arrayList28;
                            if (i57 == 0) {
                                int i58 = i55;
                                int i59 = 0;
                                while (i59 < arrayList30.size()) {
                                    arrayList26.add(xa.i(i59, i58, (TL_stars.TL_starsTopupOption) arrayList30.get(i59)));
                                    i59++;
                                    i58++;
                                }
                                boolean z20 = bbVar.b2;
                                if (!z20 && i54 > 0) {
                                    String M04 = hd.M0(z20 ? 2131747845 : 2131747836, null);
                                    boolean z21 = !bbVar.b2;
                                    int i60 = sa.b;
                                    b41 K8 = b41.K(sa.class);
                                    K8.d = -1;
                                    K8.l = M04;
                                    K8.f = z21;
                                    K8.q = true;
                                    arrayList26.add(K8);
                                }
                            } else {
                                bbVar.b2 = true;
                            }
                        } else if (i53 > 0) {
                            boolean z22 = bbVar.b2;
                            if (!z22 && i54 > 0) {
                                String M05 = hd.M0(z22 ? 2131747845 : 2131747836, null);
                                boolean z23 = !bbVar.b2;
                                int i61 = sa.b;
                                b41 K9 = b41.K(sa.class);
                                K9.d = -1;
                                K9.l = M05;
                                K9.f = z23;
                                K9.q = true;
                                arrayList26.add(K9);
                            }
                        } else {
                            int i62 = i55;
                            int i63 = 0;
                            while (i63 < arrayList28.size()) {
                                arrayList26.add(xa.i(i63, i62, (TL_stars.TL_starsTopupOption) arrayList28.get(i63)));
                                i63++;
                                i62++;
                            }
                        }
                    }
                }
                arrayList26.add(b41.k(bbVar.V1));
                break;
            case 22:
                cb cbVar = (cb) obj3;
                ArrayList arrayList31 = (ArrayList) obj;
                arrayList31.add(b41.u(hd.M0(2131744214, null)));
                ArrayList z24 = u8.y(cbVar.a, false).z();
                if (z24 == null || z24.isEmpty()) {
                    arrayList31.add(b41.p(31));
                    arrayList31.add(b41.p(31));
                    arrayList31.add(b41.p(31));
                    arrayList31.add(b41.p(31));
                    arrayList31.add(b41.p(31));
                } else {
                    int i64 = 0;
                    int i65 = 1;
                    while (i14 < z24.size()) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) z24.get(i14);
                        if (!tL_starsTopupOption3.extended || cbVar.V1) {
                            arrayList31.add(xa.i(i14, i65, tL_starsTopupOption3));
                            i65++;
                        } else {
                            i64++;
                        }
                        i14++;
                    }
                    boolean z25 = cbVar.V1;
                    if (!z25 && i64 > 0) {
                        String M06 = hd.M0(z25 ? 2131747845 : 2131747836, null);
                        boolean z26 = !cbVar.V1;
                        int i66 = sa.b;
                        b41 K10 = b41.K(sa.class);
                        K10.d = -1;
                        K10.l = M06;
                        K10.f = z26;
                        K10.q = true;
                        arrayList31.add(K10);
                    }
                }
                arrayList31.add(b41.k(cbVar.T1));
                break;
            case 23:
                ib ibVar = (ib) obj3;
                ArrayList arrayList32 = (ArrayList) obj;
                int i67 = ibVar.c;
                int i68 = ibVar.d;
                long j12 = ibVar.f;
                if (j12 != 0) {
                    di.e0 g10 = di.e0.g(i67);
                    ArrayList arrayList33 = g10.k(j12).a[i68];
                    int size12 = arrayList33.size();
                    while (i14 < size12) {
                        Object obj15 = arrayList33.get(i14);
                        i14++;
                        int i69 = fb.b;
                        b41 K11 = b41.K(fb.class);
                        K11.G = (TL_stars.StarsTransaction) obj15;
                        K11.q = true;
                        arrayList32.add(K11);
                    }
                    if (!g10.k(j12).e[i68]) {
                        arrayList32.add(b41.q(arrayList32.size(), 7));
                        arrayList32.add(b41.q(arrayList32.size(), 7));
                        arrayList32.add(b41.q(arrayList32.size(), 7));
                        break;
                    }
                } else {
                    u8 y10 = u8.y(i67, ibVar.e);
                    ArrayList arrayList34 = y10.q[i68];
                    int size13 = arrayList34.size();
                    int i70 = 0;
                    while (i70 < size13) {
                        Object obj16 = arrayList34.get(i70);
                        i70++;
                        int i71 = fb.b;
                        b41 K12 = b41.K(fb.class);
                        K12.G = (TL_stars.StarsTransaction) obj16;
                        K12.q = false;
                        arrayList32.add(K12);
                    }
                    if (!y10.u[i68]) {
                        arrayList32.add(b41.q(arrayList32.size(), 7));
                        arrayList32.add(b41.q(arrayList32.size(), 7));
                        arrayList32.add(b41.q(arrayList32.size(), 7));
                        break;
                    }
                }
                break;
            case 24:
                b(obj, obj2);
                break;
            case 25:
                c(obj, obj2);
                break;
            case 26:
                hi.t1 t1Var = (hi.t1) obj3;
                String str = (String) obj;
                hi.i2 i2Var = t1Var.r;
                i2Var.m1 = str;
                i2Var.n1 = ((Integer) obj2).intValue();
                t1Var.c.H(str);
                break;
            case 27:
                d(obj, obj2);
                break;
            case 28:
                e(obj, obj2);
                break;
            default:
                hi.m5 m5Var = (hi.m5) obj3;
                m5Var.b0(m5Var.g0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
        }
    }
}
