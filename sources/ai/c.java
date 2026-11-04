package ai;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import ci.db;
import ci.e9;
import ci.hb;
import ci.ib;
import ci.mb;
import ci.nb;
import ci.qb;
import ci.tb;
import ci.v8;
import ci.wb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.m9;
import org.telegram.messenger.n10;
import org.telegram.messenger.q00;
import org.telegram.messenger.u10;
import org.telegram.messenger.x00;
import org.telegram.messenger.ye;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.i20;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        ((fi.p) this.b).getClass();
        ArrayList n4 = x00.n();
        int size = n4.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj3 = n4.get(i3);
            i3++;
            int i10 = fi.n.b;
            r31 K = r31.K(fi.n.class);
            K.G = (q00) obj3;
            arrayList.add(K);
        }
    }

    private final void c(Object obj, Object obj2) {
        gi.m mVar = (gi.m) this.b;
        Canvas canvas = (Canvas) obj;
        Runnable runnable = (Runnable) obj2;
        Paint paint = mVar.J;
        RectF rectF = mVar.z0;
        gi.g gVar = mVar.f;
        if (!mVar.g()) {
            Paint c2 = mVar.Q.c(1.0f);
            gVar.getEditText().setHintColor(c2 != null ? -1 : -2130706433);
            if (c2 == null) {
                runnable.run();
                return;
            }
            xs editText = gVar.getEditText();
            canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), hs.e4, 31);
            runnable.run();
            canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), c2);
            canvas.restore();
            return;
        }
        if (mVar.H == null) {
            runnable.run();
            return;
        }
        canvas.translate(-gVar.getEditText().q0, 0.0f);
        canvas.saveLayerAlpha(0.0f, 0.0f, mVar.H.getWidth(), mVar.H.getHeight(), hs.e4, 31);
        rectF.set(0.0f, 1.0f, mVar.H.getWidth(), mVar.H.getHeight() - 1);
        mVar.h(mVar.Q, canvas, rectF, 0.0f, true, (-gVar.getX()) - r14.getPaddingLeft(), ((-gVar.getY()) - r14.getPaddingTop()) - r14.getExtendedPaddingTop(), true);
        canvas.save();
        paint.setAlpha(hs.v2);
        canvas.drawBitmap(mVar.H, 0.0f, 0.0f, paint);
        canvas.restore();
        canvas.restore();
    }

    private final void d(Object obj, Object obj2) {
        gi.y1 y1Var = (gi.y1) this.b;
        String str = (String) obj;
        gi.i2 i2Var = y1Var.s;
        i2Var.j1 = str;
        i2Var.k1 = ((Integer) obj2).intValue();
        y1Var.c.D(str);
    }

    private final void e(Object obj, Object obj2) {
        u10 u10Var;
        gi.h3 h3Var = (gi.h3) this.b;
        if (obj == null) {
            h3Var.getClass();
        } else if (h3Var.m1 == null && (obj instanceof ye) && (u10Var = h3Var.n1) != null) {
            u10Var.a((ye) obj);
        }
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        int i3;
        int i10;
        int i11;
        int i12 = this.a;
        int i13 = 0;
        Object obj3 = this.b;
        switch (i12) {
            case 0:
                g gVar = (g) obj3;
                ArrayList arrayList = (ArrayList) obj;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = gVar.Q1;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        m9 m9Var = gVar.R1;
                        d dVar = new d(0, gVar, tL_StarGiftAuctionAcquiredGift);
                        int i14 = e.b;
                        r31 K = r31.K(e.class);
                        K.G = tL_StarGiftAuctionAcquiredGift;
                        K.H = m9Var;
                        K.D = dVar;
                        arrayList.add(K);
                    }
                    arrayList.add(r31.D(org.telegram.messenger.g0.L(16.0f)));
                    break;
                }
                break;
            case 1:
                ((ArrayList) obj).add(((j) obj3).Q1);
                break;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(((e0) obj3).R1);
                arrayList2.add(r31.D(org.telegram.messenger.g0.L(16.0f)));
                break;
            case 3:
                ((ArrayList) obj).add(r31.j(-1, ((s0) obj3).S1));
                break;
            case 4:
                ((ArrayList) obj).add(r31.j(-1, ((z0) obj3).S1));
                break;
            case 5:
                ((b3) obj3).d1((ArrayList) obj, (f41) obj2);
                break;
            case 6:
                o4 o4Var = (o4) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                org.telegram.ui.ActionBar.e6 e6Var = o4Var.c;
                vp0 vp0Var = o4Var.a;
                v8 v8Var = o4Var.e;
                if (v8Var != null) {
                    if ((!v8Var.e || v8Var.g != 783) && v8Var.l.size() <= 0) {
                        v8 v8Var2 = o4Var.e;
                        if (v8Var2.j && !v8Var2.i) {
                        }
                    }
                    v8 v8Var3 = o4Var.e;
                    if (v8Var3 == null || (i11 = v8Var3.n) == 0) {
                        i3 = 3;
                        i10 = 3;
                    } else {
                        i3 = 3;
                        i10 = Math.min(3, i11);
                    }
                    int max = Math.max(1, i10);
                    v8 v8Var4 = o4Var.e;
                    if (v8Var4 != null) {
                        ArrayList arrayList4 = v8Var4.l;
                        int size = arrayList4.size();
                        int i15 = i3;
                        int i16 = 0;
                        while (i16 < size) {
                            Object obj4 = arrayList4.get(i16);
                            i16++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj4;
                            boolean z10 = o4Var.d;
                            int i17 = p2.b;
                            r31 K2 = r31.K(p2.class);
                            K2.u = 1;
                            K2.z = 0;
                            K2.G = savedStarGift;
                            K2.q = true;
                            K2.f = false;
                            K2.r = z10;
                            K2.h = o4Var.h && (o4Var.e != vp0Var.d || savedStarGift.pinned_to_top);
                            arrayList3.add(K2);
                            i15--;
                            if (i15 == 0) {
                                i15 = 3;
                            }
                        }
                        v8 v8Var5 = o4Var.e;
                        if (v8Var5.i || !v8Var5.j) {
                            int i18 = 0;
                            while (true) {
                                if (i18 < (i15 <= 0 ? 3 : i15)) {
                                    i18++;
                                    r31 q10 = r31.q(i18, 34);
                                    q10.u = 1;
                                    arrayList3.add(q10);
                                }
                            }
                        }
                    }
                    if (vp0Var.d == o4Var.e) {
                        arrayList3.add(r31.D(org.telegram.messenger.g0.L(20.0f)));
                        if (vp0Var.c == h10.i(o4Var.b).e()) {
                            int i19 = org.telegram.ui.ActionBar.k6.z6;
                            int w02 = org.telegram.ui.ActionBar.k6.w0(i19, e6Var);
                            String M0 = bd.M0(2131746679, null);
                            int L = org.telegram.messenger.g0.L(24.0f);
                            int i20 = p4.b;
                            r31 K3 = r31.K(p4.class);
                            K3.l = M0;
                            K3.z = 17;
                            K3.B = w02;
                            K3.A = 14.0f;
                            K3.i = L;
                            K3.k = 0;
                            K3.q = false;
                            K3.G = e6Var;
                            K3.H = Integer.valueOf(i19);
                            arrayList3.add(K3);
                        }
                        arrayList3.add(r31.D(org.telegram.messenger.g0.L(82.0f)));
                    } else if (!arrayList3.isEmpty()) {
                        arrayList3.add(r31.D(org.telegram.messenger.g0.L(82.0f)));
                    }
                    if (!arrayList3.isEmpty()) {
                        arrayList3.add(0, r31.D(org.telegram.messenger.g0.L(o4Var.I ? 42.0f : 12.0f)));
                    }
                    if (o4Var.f.getSpanCount() != max) {
                        org.telegram.messenger.g0.h3(new o3(o4Var, max, 1));
                    }
                    vp0Var.p();
                    vp0Var.post(new s(vp0Var, 6));
                    break;
                }
                break;
            case 7:
                i6 i6Var = (i6) obj3;
                ArrayList arrayList5 = (ArrayList) obj;
                w5 w5Var = i6Var.d;
                ArrayList arrayList6 = w5Var.d;
                int size2 = arrayList6.size();
                int i21 = 0;
                while (i21 < size2) {
                    Object obj5 = arrayList6.get(i21);
                    i21++;
                    arrayList5.add(p2.i(0, (TL_stars.TL_starGiftUnique) obj5, false, false, false, true, false));
                }
                if (w5Var.t || !w5Var.u) {
                    r31 q11 = r31.q(-1, 34);
                    q11.u = 1;
                    arrayList5.add(q11);
                    r31 q12 = r31.q(-2, 34);
                    q12.u = 1;
                    arrayList5.add(q12);
                    r31 q13 = r31.q(-3, 34);
                    q13.u = 1;
                    arrayList5.add(q13);
                    if (w5Var.d.isEmpty()) {
                        r31 q14 = r31.q(-4, 34);
                        q14.u = 1;
                        arrayList5.add(q14);
                        r31 q15 = r31.q(-5, 34);
                        q15.u = 1;
                        arrayList5.add(q15);
                        r31 q16 = r31.q(-6, 34);
                        q16.u = 1;
                        arrayList5.add(q16);
                        r31 q17 = r31.q(-7, 34);
                        q17.u = 1;
                        arrayList5.add(q17);
                        r31 q18 = r31.q(-8, 34);
                        q18.u = 1;
                        arrayList5.add(q18);
                        r31 q19 = r31.q(-9, 34);
                        q19.u = 1;
                        arrayList5.add(q19);
                        r31 q20 = r31.q(-10, 34);
                        q20.u = 1;
                        arrayList5.add(q20);
                        r31 q21 = r31.q(-11, 34);
                        q21.u = 1;
                        arrayList5.add(q21);
                        r31 q22 = r31.q(-12, 34);
                        q22.u = 1;
                        arrayList5.add(q22);
                        r31 q23 = r31.q(-13, 34);
                        q23.u = 1;
                        arrayList5.add(q23);
                        r31 q24 = r31.q(-14, 34);
                        q24.u = 1;
                        arrayList5.add(q24);
                        r31 q25 = r31.q(-15, 34);
                        q25.u = 1;
                        arrayList5.add(q25);
                    }
                }
                boolean z11 = arrayList5.isEmpty() && !w5Var.t;
                if (i6Var.y != z11) {
                    i6Var.y = z11;
                    i6Var.x.setVisibility(0);
                    i6Var.x.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.95f).scaleY(z11 ? 1.0f : 0.95f).setInterpolator(xq.h).setDuration(320L).setListener(new e5(i6Var, z11, 1)).start();
                    break;
                }
                break;
            case 8:
                h6 h6Var = (h6) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                g6 g6Var = h6Var.R1;
                if (g6Var != null) {
                    v8 v8Var6 = g6Var.b;
                    w5 w5Var2 = g6Var.c;
                    if (v8Var6 != null && w5Var2 != null) {
                        int currentTime = ConnectionsManager.getInstance(h6Var.a).getCurrentTime();
                        arrayList7.add(r31.t(-1, bd.M0(2131749778, null)));
                        ArrayList arrayList8 = v8Var6.l;
                        int size3 = arrayList8.size();
                        boolean z12 = true;
                        int i22 = 0;
                        int i23 = 0;
                        while (i23 < size3) {
                            Object obj6 = arrayList8.get(i23);
                            i23++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj6;
                            if (!h6Var.Z1.contains(Long.valueOf(savedStarGift2.gift.id))) {
                                boolean z13 = savedStarGift2.can_craft_at <= currentTime;
                                r31 i24 = p2.i(0, savedStarGift2.gift, false, true, false, false, true);
                                i24.g = z13;
                                arrayList7.add(i24);
                                i22++;
                                z12 = false;
                            }
                        }
                        if (v8Var6.i || !v8Var6.j) {
                            int i25 = i22 % 3;
                            int i26 = 6 - i25;
                            for (int i27 = 0; i27 < i26; i27++) {
                                r31 q26 = r31.q((i27 - i25) + 1, 35);
                                q26.u = 1;
                                arrayList7.add(q26);
                            }
                        } else if (z12) {
                            arrayList7.add(r31.g(bd.M0(2131749777, null)));
                        }
                        if (w5Var2.e > 0 || h6Var.c2) {
                            h6Var.c2 = true;
                            String M02 = bd.M0(2131749780, null);
                            r31 r31Var = new r31(42);
                            r31Var.d = -2;
                            r31Var.o = M02;
                            arrayList7.add(r31Var);
                            HorizontalScrollView horizontalScrollView = h6Var.S1;
                            if (horizontalScrollView != null) {
                                arrayList7.add(r31.j(-3, horizontalScrollView));
                            }
                            ArrayList arrayList9 = w5Var2.d;
                            int size4 = arrayList9.size();
                            int i28 = 0;
                            while (i28 < size4) {
                                Object obj7 = arrayList9.get(i28);
                                i28++;
                                arrayList7.add(p2.i(0, (TL_stars.TL_starGiftUnique) obj7, false, true, false, true, true));
                            }
                            if (w5Var2.t || !w5Var2.u) {
                                r31 q27 = r31.q(10, 35);
                                q27.u = 1;
                                arrayList7.add(q27);
                                r31 q28 = r31.q(11, 35);
                                q28.u = 1;
                                arrayList7.add(q28);
                                r31 q29 = r31.q(12, 35);
                                q29.u = 1;
                                arrayList7.add(q29);
                                r31 q30 = r31.q(13, 35);
                                q30.u = 1;
                                arrayList7.add(q30);
                                r31 q31 = r31.q(14, 35);
                                q31.u = 1;
                                arrayList7.add(q31);
                                r31 q32 = r31.q(15, 35);
                                q32.u = 1;
                                arrayList7.add(q32);
                                break;
                            }
                        }
                    }
                }
                break;
            case 9:
                m6 m6Var = (m6) obj3;
                ArrayList arrayList10 = (ArrayList) obj;
                v8 v8Var7 = m6Var.R1;
                if (v8Var7 != null) {
                    ArrayList arrayList11 = v8Var7.l;
                    arrayList10.add(r31.D(org.telegram.messenger.g0.L(16.0f)));
                    if (v8Var7.i && arrayList11.isEmpty()) {
                        r31 q33 = r31.q(1, 34);
                        q33.u = 1;
                        arrayList10.add(q33);
                        r31 q34 = r31.q(2, 34);
                        q34.u = 1;
                        arrayList10.add(q34);
                        r31 q35 = r31.q(3, 34);
                        q35.u = 1;
                        arrayList10.add(q35);
                        r31 q36 = r31.q(4, 34);
                        q36.u = 1;
                        arrayList10.add(q36);
                        r31 q37 = r31.q(5, 34);
                        q37.u = 1;
                        arrayList10.add(q37);
                        r31 q38 = r31.q(6, 34);
                        q38.u = 1;
                        arrayList10.add(q38);
                        r31 q39 = r31.q(7, 34);
                        q39.u = 1;
                        arrayList10.add(q39);
                        r31 q40 = r31.q(8, 34);
                        q40.u = 1;
                        arrayList10.add(q40);
                        r31 q41 = r31.q(9, 34);
                        q41.u = 1;
                        arrayList10.add(q41);
                    } else {
                        int size5 = arrayList11.size();
                        int i29 = 0;
                        while (true) {
                            int i30 = 3;
                            while (i29 < size5) {
                                Object obj8 = arrayList11.get(i29);
                                i29++;
                                TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj8;
                                if (!savedStarGift3.collection_id.contains(Integer.valueOf(m6Var.Q1))) {
                                    int i31 = p2.b;
                                    r31 K4 = r31.K(p2.class);
                                    K4.u = 1;
                                    K4.z = 0;
                                    K4.G = savedStarGift3;
                                    K4.q = true;
                                    K4.f = true;
                                    K4.r = false;
                                    HashSet hashSet = m6Var.S1;
                                    int i32 = savedStarGift3.msg_id;
                                    K4.L(hashSet.contains(Long.valueOf(i32 == 0 ? savedStarGift3.saved_id : i32)));
                                    K4.u = 1;
                                    arrayList10.add(K4);
                                    i30--;
                                    if (i30 == 0) {
                                        break;
                                    }
                                }
                            }
                            if (v8Var7.i || !v8Var7.j) {
                                int i33 = 0;
                                while (true) {
                                    if (i33 < (i30 <= 0 ? 3 : i30)) {
                                        i33++;
                                        r31 q42 = r31.q(i33, 34);
                                        q42.u = 1;
                                        arrayList10.add(q42);
                                    }
                                }
                            }
                        }
                    }
                    arrayList10.add(r31.D(org.telegram.messenger.g0.L(68.0f)));
                    break;
                }
                break;
            case 10:
                bi.d dVar2 = (bi.d) obj3;
                TLRPC.ShareThemeBackdrops shareThemeBackdrops = (TLRPC.ShareThemeBackdrops) obj;
                ArrayList arrayList12 = dVar2.e;
                dVar2.c = false;
                if (shareThemeBackdrops instanceof TLRPC.TL_shareThemeBackdrops) {
                    TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = (TLRPC.TL_shareThemeBackdrops) shareThemeBackdrops;
                    dVar2.b = tL_shareThemeBackdrops;
                    try {
                        SerializedData serializedData = new SerializedData(tL_shareThemeBackdrops.getObjectSize());
                        dVar2.b.serializeToStream(serializedData);
                        hp.s1(dVar2.a).e7.edit().putString("qrBackdrops", Utilities.f(serializedData.toByteArray())).apply();
                        serializedData.cleanup();
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                dVar2.d = shareThemeBackdrops != null;
                ArrayList arrayList13 = new ArrayList(arrayList12);
                arrayList12.clear();
                int size6 = arrayList13.size();
                int i34 = 0;
                while (i34 < size6) {
                    Object obj9 = arrayList13.get(i34);
                    i34++;
                    ((Runnable) obj9).run();
                }
                break;
            case 11:
                ci.v.e0((ci.v) obj3, (ArrayList) obj);
                break;
            case 12:
                ci.u uVar = (ci.u) obj3;
                ArrayList arrayList14 = (ArrayList) obj;
                ArrayList arrayList15 = uVar.b;
                int size7 = arrayList15.size();
                int i35 = 0;
                while (i35 < size7) {
                    Object obj10 = arrayList15.get(i35);
                    i35++;
                    int i36 = qb.b;
                    r31 K5 = r31.K(qb.class);
                    K5.G = (TL_stars.StarsTransaction) obj10;
                    K5.q = true;
                    arrayList14.add(K5);
                }
                if (uVar.h) {
                    arrayList14.add(r31.e(-1, bd.M0(2131746062, null)));
                    break;
                } else if (!uVar.f) {
                    for (int i37 = 0; i37 < 3; i37++) {
                        arrayList14.add(r31.q(i37, 7));
                    }
                    break;
                }
                break;
            case 13:
                i20 i20Var = (i20) obj3;
                ArrayList arrayList16 = (ArrayList) obj;
                arrayList16.add(r31.k(i20Var.R1));
                arrayList16.add(ci.k0.i(bd.M0(2131750868, null), bd.M0(2131750869, null), R.drawable.msg_gift_premium));
                arrayList16.add(ci.k0.i(bd.M0(2131750866, null), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(bd.M0(2131750867, null), new s(i20Var, 26)), true), R.drawable.msg_bot));
                arrayList16.add(ci.k0.i(bd.M0(2131750864, null), bd.M0(2131750865, null), R.drawable.menu_unlock));
                arrayList16.add(ci.k0.i(bd.M0(2131750862, null), bd.M0(2131750863, null), R.drawable.menu_feature_paid));
                arrayList16.add(r31.D(org.telegram.messenger.g0.L(68.0f)));
                break;
            case 14:
                ArrayList arrayList17 = (ArrayList) obj;
                r31 r31Var2 = ((ci.t0) obj3).p2;
                if (r31Var2 != null) {
                    arrayList17.add(r31Var2);
                    break;
                }
                break;
            case 15:
                ci.p1 p1Var = (ci.p1) obj3;
                ArrayList arrayList18 = (ArrayList) obj;
                ArrayList arrayList19 = p1Var.W1;
                boolean z14 = p1Var.n2;
                ci.a aVar = p1Var.Z1;
                ArrayList arrayList20 = p1Var.U1;
                ArrayList arrayList21 = p1Var.T1;
                ci.a aVar2 = p1Var.Y1;
                ci.a aVar3 = p1Var.X1;
                ArrayList arrayList22 = p1Var.V1;
                if (arrayList22 != null && arrayList21 != null && arrayList20 != null) {
                    arrayList18.add(r31.D(org.telegram.messenger.g0.L(315.0f)));
                    aVar3.b = 0;
                    aVar3.c();
                    aVar2.b = 0;
                    aVar2.c();
                    aVar.b = 0;
                    aVar.c();
                    int i38 = p1Var.c2.s;
                    if (i38 == 0) {
                        arrayList18.add(r31.g(org.telegram.messenger.g0.X2(bd.H(',', z14 ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList22.size()))));
                        int size8 = arrayList22.size();
                        int i39 = 0;
                        while (i39 < size8) {
                            Object obj11 = arrayList22.get(i39);
                            i39++;
                            arrayList18.add(ci.m1.i(i38, new ci.k1((TL_stars.starGiftAttributeBackdrop) aVar3.c(), (TL_stars.starGiftAttributePattern) aVar2.c(), (TL_stars.starGiftAttributeModel) obj11)));
                        }
                        if (!arrayList19.isEmpty()) {
                            arrayList18.add(r31.g(org.telegram.messenger.g0.X2(bd.H(',', z14 ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList22.size()))));
                            int size9 = arrayList19.size();
                            int i40 = 0;
                            while (i40 < size9) {
                                Object obj12 = arrayList19.get(i40);
                                i40++;
                                arrayList18.add(ci.m1.i(i38, new ci.k1((TL_stars.starGiftAttributeBackdrop) aVar3.c(), (TL_stars.starGiftAttributePattern) aVar2.c(), (TL_stars.starGiftAttributeModel) obj12)));
                            }
                            break;
                        }
                    } else if (i38 == 1) {
                        arrayList18.add(r31.g(org.telegram.messenger.g0.X2(bd.H(',', "GiftPreviewCountBackdrops", arrayList21.size()))));
                        int size10 = arrayList21.size();
                        int i41 = 0;
                        while (i41 < size10) {
                            Object obj13 = arrayList21.get(i41);
                            i41++;
                            arrayList18.add(ci.m1.i(i38, new ci.k1((TL_stars.starGiftAttributeBackdrop) obj13, (TL_stars.starGiftAttributePattern) aVar2.c(), (TL_stars.starGiftAttributeModel) aVar.c())));
                        }
                        break;
                    } else if (i38 == 2) {
                        arrayList18.add(r31.g(org.telegram.messenger.g0.X2(bd.H(',', "GiftPreviewCountSymbols", arrayList20.size()))));
                        int size11 = arrayList20.size();
                        int i42 = 0;
                        while (i42 < size11) {
                            Object obj14 = arrayList20.get(i42);
                            i42++;
                            arrayList18.add(ci.m1.i(i38, new ci.k1((TL_stars.starGiftAttributeBackdrop) aVar3.c(), (TL_stars.starGiftAttributePattern) obj14, (TL_stars.starGiftAttributeModel) aVar.c())));
                        }
                        break;
                    }
                }
                break;
            case 16:
                TextView textView = (TextView) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (wallettransaction != null) {
                    long j10 = wallettransaction.fee;
                    if (j10 > 0) {
                        textView.setText(bd.V(null, null, 2131743082, org.telegram.ui.Wallet.k0.s(j10, false)));
                        break;
                    }
                }
                textView.setVisibility(8);
                break;
            case 17:
                n10 n10Var = (n10) obj3;
                Long l10 = (Long) obj;
                Boolean bool = (Boolean) obj2;
                if (n10Var != null) {
                    n10Var.a(l10, bool);
                    break;
                }
                break;
            case 18:
                ((wb) obj3).K0((ArrayList) obj, (f41) obj2);
                break;
            case 19:
                hb hbVar = (hb) obj3;
                ArrayList arrayList23 = (ArrayList) obj;
                arrayList23.add(r31.k(hbVar.Q1));
                arrayList23.add(r31.u(bd.M0(2131744224, null)));
                ArrayList u10 = e9.y(hbVar.a, false).u();
                if (u10 == null || u10.isEmpty()) {
                    arrayList23.add(r31.p(31));
                    arrayList23.add(r31.p(31));
                    arrayList23.add(r31.p(31));
                } else {
                    int i43 = 1;
                    int i44 = 0;
                    for (int i45 = 0; i45 < u10.size(); i45++) {
                        TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i45);
                        if (hbVar.V1 || !tL_starsGiftOption.extended) {
                            int i46 = i43 + 1;
                            int i47 = ib.b;
                            r31 K6 = r31.K(ib.class);
                            K6.d = i45;
                            K6.z = i43;
                            long j11 = tL_starsGiftOption.stars;
                            K6.B = j11;
                            K6.l = bd.H(' ', "StarsCount", (int) j11);
                            K6.m = tL_starsGiftOption.loadingStorePrice ? null : org.telegram.messenger.r1.i().f(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                            K6.G = tL_starsGiftOption;
                            arrayList23.add(K6);
                            i43 = i46;
                        } else {
                            i44++;
                        }
                    }
                    boolean z15 = hbVar.V1;
                    if (!z15 && i44 > 0) {
                        String M03 = bd.M0(z15 ? 2131747853 : 2131747844, null);
                        boolean z16 = !hbVar.V1;
                        int i48 = db.b;
                        r31 K7 = r31.K(db.class);
                        K7.d = -1;
                        K7.l = M03;
                        K7.f = z16;
                        K7.q = true;
                        arrayList23.add(K7);
                    }
                }
                arrayList23.add(r31.k(hbVar.R1));
                break;
            case 20:
                mb mbVar = (mb) obj3;
                ArrayList arrayList24 = (ArrayList) obj;
                long j12 = mbVar.Q1;
                bh.a aVar4 = mbVar.R1;
                arrayList24.add(r31.m(aVar4));
                boolean z17 = mbVar.W1;
                if (z17) {
                    arrayList24.add(r31.u(bd.M0(2131744224, null)));
                }
                ArrayList z18 = e9.y(mbVar.a, false).z();
                if (z17) {
                    if (z18 == null || z18.isEmpty()) {
                        arrayList24.add(r31.p(31));
                        arrayList24.add(r31.p(31));
                        arrayList24.add(r31.p(31));
                    } else {
                        int i49 = 0;
                        int i50 = 0;
                        int i51 = 0;
                        boolean z19 = false;
                        int i52 = 1;
                        while (i49 < z18.size()) {
                            TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z18.get(i49);
                            ArrayList arrayList25 = z18;
                            if (tL_starsTopupOption.stars >= j12) {
                                if (tL_starsTopupOption.extended && !mbVar.Y1 && z19) {
                                    i51++;
                                } else {
                                    arrayList24.add(ib.i(i49, i52, tL_starsTopupOption));
                                    i50++;
                                    i52++;
                                    z19 = true;
                                }
                            }
                            i49++;
                            z18 = arrayList25;
                        }
                        ArrayList arrayList26 = z18;
                        if (i50 < 3) {
                            arrayList24.clear();
                            arrayList24.add(r31.k(aVar4));
                            arrayList24.add(r31.u(bd.M0(2131744224, null)));
                            int i53 = 0;
                            int i54 = 0;
                            while (i53 < arrayList26.size()) {
                                ArrayList arrayList27 = arrayList26;
                                TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) arrayList27.get(i53);
                                if (tL_starsTopupOption2.stars >= j12) {
                                    arrayList24.add(ib.i(i53, i52, tL_starsTopupOption2));
                                    i54++;
                                    i52++;
                                }
                                i53++;
                                arrayList26 = arrayList27;
                            }
                            ArrayList arrayList28 = arrayList26;
                            if (i54 == 0) {
                                int i55 = i52;
                                int i56 = 0;
                                while (i56 < arrayList28.size()) {
                                    arrayList24.add(ib.i(i56, i55, (TL_stars.TL_starsTopupOption) arrayList28.get(i56)));
                                    i56++;
                                    i55++;
                                }
                                boolean z20 = mbVar.Y1;
                                if (!z20 && i51 > 0) {
                                    String M04 = bd.M0(z20 ? 2131747853 : 2131747844, null);
                                    boolean z21 = !mbVar.Y1;
                                    int i57 = db.b;
                                    r31 K8 = r31.K(db.class);
                                    K8.d = -1;
                                    K8.l = M04;
                                    K8.f = z21;
                                    K8.q = true;
                                    arrayList24.add(K8);
                                }
                            } else {
                                mbVar.Y1 = true;
                            }
                        } else if (i50 > 0) {
                            boolean z22 = mbVar.Y1;
                            if (!z22 && i51 > 0) {
                                String M05 = bd.M0(z22 ? 2131747853 : 2131747844, null);
                                boolean z23 = !mbVar.Y1;
                                int i58 = db.b;
                                r31 K9 = r31.K(db.class);
                                K9.d = -1;
                                K9.l = M05;
                                K9.f = z23;
                                K9.q = true;
                                arrayList24.add(K9);
                            }
                        } else {
                            int i59 = i52;
                            int i60 = 0;
                            while (i60 < arrayList26.size()) {
                                arrayList24.add(ib.i(i60, i59, (TL_stars.TL_starsTopupOption) arrayList26.get(i60)));
                                i60++;
                                i59++;
                            }
                        }
                    }
                }
                arrayList24.add(r31.k(mbVar.S1));
                break;
            case 21:
                nb nbVar = (nb) obj3;
                ArrayList arrayList29 = (ArrayList) obj;
                arrayList29.add(r31.u(bd.M0(2131744224, null)));
                ArrayList z24 = e9.y(nbVar.a, false).z();
                if (z24 == null || z24.isEmpty()) {
                    arrayList29.add(r31.p(31));
                    arrayList29.add(r31.p(31));
                    arrayList29.add(r31.p(31));
                    arrayList29.add(r31.p(31));
                    arrayList29.add(r31.p(31));
                } else {
                    int i61 = 1;
                    int i62 = 0;
                    while (i13 < z24.size()) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption3 = (TL_stars.TL_starsTopupOption) z24.get(i13);
                        if (!tL_starsTopupOption3.extended || nbVar.S1) {
                            arrayList29.add(ib.i(i13, i61, tL_starsTopupOption3));
                            i61++;
                        } else {
                            i62++;
                        }
                        i13++;
                    }
                    boolean z25 = nbVar.S1;
                    if (!z25 && i62 > 0) {
                        String M06 = bd.M0(z25 ? 2131747853 : 2131747844, null);
                        boolean z26 = !nbVar.S1;
                        int i63 = db.b;
                        r31 K10 = r31.K(db.class);
                        K10.d = -1;
                        K10.l = M06;
                        K10.f = z26;
                        K10.q = true;
                        arrayList29.add(K10);
                    }
                }
                arrayList29.add(r31.k(nbVar.Q1));
                break;
            case 22:
                tb tbVar = (tb) obj3;
                ArrayList arrayList30 = (ArrayList) obj;
                int i64 = tbVar.c;
                int i65 = tbVar.d;
                long j13 = tbVar.f;
                if (j13 != 0) {
                    ci.i0 g7 = ci.i0.g(i64);
                    ArrayList arrayList31 = g7.k(j13).a[i65];
                    int size12 = arrayList31.size();
                    while (i13 < size12) {
                        Object obj15 = arrayList31.get(i13);
                        i13++;
                        int i66 = qb.b;
                        r31 K11 = r31.K(qb.class);
                        K11.G = (TL_stars.StarsTransaction) obj15;
                        K11.q = true;
                        arrayList30.add(K11);
                    }
                    if (!g7.k(j13).e[i65]) {
                        arrayList30.add(r31.q(arrayList30.size(), 7));
                        arrayList30.add(r31.q(arrayList30.size(), 7));
                        arrayList30.add(r31.q(arrayList30.size(), 7));
                        break;
                    }
                } else {
                    e9 y9 = e9.y(i64, tbVar.e);
                    ArrayList arrayList32 = y9.q[i65];
                    int size13 = arrayList32.size();
                    int i67 = 0;
                    while (i67 < size13) {
                        Object obj16 = arrayList32.get(i67);
                        i67++;
                        int i68 = qb.b;
                        r31 K12 = r31.K(qb.class);
                        K12.G = (TL_stars.StarsTransaction) obj16;
                        K12.q = false;
                        arrayList30.add(K12);
                    }
                    if (!y9.u[i65]) {
                        arrayList30.add(r31.q(arrayList30.size(), 7));
                        arrayList30.add(r31.q(arrayList30.size(), 7));
                        arrayList30.add(r31.q(arrayList30.size(), 7));
                        break;
                    }
                }
                break;
            case 23:
                dh.o oVar = (dh.o) obj3;
                ArrayList arrayList33 = (ArrayList) obj;
                ArrayList arrayList34 = oVar.G;
                q8 q8Var = oVar.e;
                if (q8Var != null && oVar.f != null) {
                    arrayList33.add(r31.j(1, q8Var));
                    arrayList33.add(r31.l(2, oVar.f));
                    int i69 = oVar.Z;
                    if (i69 == 1 || i69 == 0 || oVar.a) {
                        while (i13 < arrayList34.size()) {
                            View view = (View) arrayList34.get(i13);
                            arrayList33.add(((Boolean) oVar.H.get(i13)).booleanValue() ? r31.l(i13 + 100, view) : r31.j(i13 + 100, view));
                            i13++;
                        }
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
                gi.t1 t1Var = (gi.t1) obj3;
                String str = (String) obj;
                gi.i2 i2Var = t1Var.r;
                i2Var.j1 = str;
                i2Var.k1 = ((Integer) obj2).intValue();
                t1Var.c.H(str);
                break;
            case 27:
                d(obj, obj2);
                break;
            case 28:
                e(obj, obj2);
                break;
            default:
                gi.m5 m5Var = (gi.m5) obj3;
                m5Var.b0(m5Var.g0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
        }
    }
}
