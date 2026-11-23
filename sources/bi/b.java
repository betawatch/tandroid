package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import di.ab;
import di.bb;
import di.fb;
import di.gb;
import di.jb;
import di.mb;
import di.pb;
import di.wa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ef;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.messenger.q9;
import org.telegram.messenger.r00;
import org.telegram.messenger.w10;
import org.telegram.messenger.y00;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.x20;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void b(Object obj, Object obj2) {
        di.h1 h1Var = (di.h1) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = h1Var.Z1;
        boolean z10 = h1Var.q2;
        com.google.android.gms.common.api.internal.p pVar = h1Var.c2;
        ArrayList arrayList3 = h1Var.X1;
        ArrayList arrayList4 = h1Var.W1;
        com.google.android.gms.common.api.internal.p pVar2 = h1Var.b2;
        com.google.android.gms.common.api.internal.p pVar3 = h1Var.a2;
        ArrayList arrayList5 = h1Var.Y1;
        if (arrayList5 == null || arrayList4 == null || arrayList3 == null) {
            return;
        }
        arrayList.add(n41.D(org.telegram.messenger.g0.L(315.0f)));
        pVar3.a = 0;
        pVar3.c();
        pVar2.a = 0;
        pVar2.c();
        pVar.a = 0;
        pVar.c();
        int i7 = h1Var.f2.s;
        if (i7 == 0) {
            arrayList.add(n41.g(org.telegram.messenger.g0.W2(gd.H(',', z10 ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList5.size()))));
            int size = arrayList5.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj3 = arrayList5.get(i10);
                i10++;
                arrayList.add(di.e1.i(i7, new di.c1((TL_stars.starGiftAttributeBackdrop) pVar3.c(), (TL_stars.starGiftAttributePattern) pVar2.c(), (TL_stars.starGiftAttributeModel) obj3)));
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.add(n41.g(org.telegram.messenger.g0.W2(gd.H(',', z10 ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList5.size()))));
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj4 = arrayList2.get(i11);
                i11++;
                arrayList.add(di.e1.i(i7, new di.c1((TL_stars.starGiftAttributeBackdrop) pVar3.c(), (TL_stars.starGiftAttributePattern) pVar2.c(), (TL_stars.starGiftAttributeModel) obj4)));
            }
            return;
        }
        if (i7 == 1) {
            arrayList.add(n41.g(org.telegram.messenger.g0.W2(gd.H(',', "GiftPreviewCountBackdrops", arrayList4.size()))));
            int size3 = arrayList4.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj5 = arrayList4.get(i12);
                i12++;
                arrayList.add(di.e1.i(i7, new di.c1((TL_stars.starGiftAttributeBackdrop) obj5, (TL_stars.starGiftAttributePattern) pVar2.c(), (TL_stars.starGiftAttributeModel) pVar.c())));
            }
            return;
        }
        if (i7 == 2) {
            arrayList.add(n41.g(org.telegram.messenger.g0.W2(gd.H(',', "GiftPreviewCountSymbols", arrayList3.size()))));
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj6 = arrayList3.get(i13);
                i13++;
                arrayList.add(di.e1.i(i7, new di.c1((TL_stars.starGiftAttributeBackdrop) pVar3.c(), (TL_stars.starGiftAttributePattern) obj6, (TL_stars.starGiftAttributeModel) pVar.c())));
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        ab abVar = (ab) this.b;
        ArrayList arrayList = (ArrayList) obj;
        arrayList.add(n41.k(abVar.T1));
        arrayList.add(n41.u(gd.N0(2131743969, null)));
        ArrayList u10 = di.y8.y(abVar.a, false).u();
        if (u10 == null || u10.isEmpty()) {
            arrayList.add(n41.p(31));
            arrayList.add(n41.p(31));
            arrayList.add(n41.p(31));
        } else {
            int i7 = 0;
            int i10 = 1;
            for (int i11 = 0; i11 < u10.size(); i11++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i11);
                if (abVar.Y1 || !tL_starsGiftOption.extended) {
                    int i12 = i10 + 1;
                    int i13 = bb.b;
                    n41 K = n41.K(bb.class);
                    K.d = i11;
                    K.A = i10;
                    long j3 = tL_starsGiftOption.stars;
                    K.C = j3;
                    K.m = gd.H(' ', "StarsCount", (int) j3);
                    K.n = tL_starsGiftOption.loadingStorePrice ? null : org.telegram.messenger.r1.i().f(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    K.H = tL_starsGiftOption;
                    arrayList.add(K);
                    i10 = i12;
                } else {
                    i7++;
                }
            }
            boolean z10 = abVar.Y1;
            if (!z10 && i7 > 0) {
                String N0 = gd.N0(z10 ? 2131747651 : 2131747642, null);
                boolean z11 = !abVar.Y1;
                int i14 = wa.b;
                n41 K2 = n41.K(wa.class);
                K2.d = -1;
                K2.m = N0;
                K2.f = z11;
                K2.r = true;
                arrayList.add(K2);
            }
        }
        arrayList.add(n41.k(abVar.U1));
    }

    private final void d(Object obj, Object obj2) {
        fb fbVar = (fb) this.b;
        ArrayList arrayList = (ArrayList) obj;
        long j3 = fbVar.T1;
        ah.a aVar = fbVar.U1;
        arrayList.add(n41.m(aVar));
        boolean z10 = fbVar.Z1;
        if (z10) {
            i5.c.s(2131743969, null, arrayList);
        }
        ArrayList z11 = di.y8.y(fbVar.a, false).z();
        if (z10) {
            if (z11 == null || z11.isEmpty()) {
                arrayList.add(n41.p(31));
                arrayList.add(n41.p(31));
                arrayList.add(n41.p(31));
            } else {
                int i7 = 0;
                int i10 = 0;
                boolean z12 = false;
                int i11 = 1;
                for (int i12 = 0; i12 < z11.size(); i12++) {
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z11.get(i12);
                    if (tL_starsTopupOption.stars >= j3) {
                        if (tL_starsTopupOption.extended && !fbVar.b2 && z12) {
                            i10++;
                        } else {
                            arrayList.add(bb.i(i12, i11, tL_starsTopupOption));
                            i7++;
                            i11++;
                            z12 = true;
                        }
                    }
                }
                if (i7 < 3) {
                    arrayList.clear();
                    arrayList.add(n41.k(aVar));
                    arrayList.add(n41.u(gd.N0(2131743969, null)));
                    int i13 = 0;
                    for (int i14 = 0; i14 < z11.size(); i14++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i14);
                        if (tL_starsTopupOption2.stars >= j3) {
                            arrayList.add(bb.i(i14, i11, tL_starsTopupOption2));
                            i13++;
                            i11++;
                        }
                    }
                    if (i13 == 0) {
                        int i15 = 0;
                        while (i15 < z11.size()) {
                            arrayList.add(bb.i(i15, i11, (TL_stars.TL_starsTopupOption) z11.get(i15)));
                            i15++;
                            i11++;
                        }
                        boolean z13 = fbVar.b2;
                        if (!z13 && i10 > 0) {
                            String N0 = gd.N0(z13 ? 2131747651 : 2131747642, null);
                            boolean z14 = !fbVar.b2;
                            int i16 = wa.b;
                            n41 K = n41.K(wa.class);
                            K.d = -1;
                            K.m = N0;
                            K.f = z14;
                            K.r = true;
                            arrayList.add(K);
                        }
                    } else {
                        fbVar.b2 = true;
                    }
                } else if (i7 > 0) {
                    boolean z15 = fbVar.b2;
                    if (!z15 && i10 > 0) {
                        String N02 = gd.N0(z15 ? 2131747651 : 2131747642, null);
                        boolean z16 = !fbVar.b2;
                        int i17 = wa.b;
                        n41 K2 = n41.K(wa.class);
                        K2.d = -1;
                        K2.m = N02;
                        K2.f = z16;
                        K2.r = true;
                        arrayList.add(K2);
                    }
                } else {
                    int i18 = 0;
                    while (i18 < z11.size()) {
                        arrayList.add(bb.i(i18, i11, (TL_stars.TL_starsTopupOption) z11.get(i18)));
                        i18++;
                        i11++;
                    }
                }
            }
        }
        arrayList.add(n41.k(fbVar.V1));
    }

    private final void e(Object obj, Object obj2) {
        int i7;
        ArrayList arrayList;
        int i10;
        String str;
        mb mbVar = (mb) this.b;
        ArrayList arrayList2 = (ArrayList) obj;
        boolean z10 = mbVar.e;
        int i11 = mbVar.d;
        int i12 = mbVar.c;
        long j3 = mbVar.f;
        if (j3 != 0) {
            di.e0 g10 = di.e0.g(i12);
            ArrayList arrayList3 = g10.k(j3).a[i11];
            int size = arrayList3.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj3 = arrayList3.get(i13);
                i13++;
                int i14 = jb.b;
                n41 K = n41.K(jb.class);
                K.H = (TL_stars.StarsTransaction) obj3;
                K.r = true;
                arrayList2.add(K);
            }
            if (g10.k(j3).e[i11]) {
                return;
            }
            arrayList2.add(n41.q(arrayList2.size(), 7));
            arrayList2.add(n41.q(arrayList2.size(), 7));
            arrayList2.add(n41.q(arrayList2.size(), 7));
            return;
        }
        di.y8 y10 = di.y8.y(i12, z10);
        ArrayList[] arrayListArr = y10.q;
        if (z10 && ii.n.c(i12)) {
            if (mbVar.n == null) {
                mbVar.n = new org.telegram.ui.Wallet.f4();
            }
            mbVar.r = org.telegram.ui.Wallet.v0.D(i12).y();
            ArrayList arrayList4 = arrayListArr[i11];
            org.telegram.ui.Wallet.f4 f4Var = mbVar.n;
            ii.m mVar = ii.n.b[i12];
            String y11 = org.telegram.ui.Wallet.v0.D(i12).y();
            HashSet hashSet = f4Var.a;
            HashSet hashSet2 = f4Var.a;
            HashMap hashMap = f4Var.b;
            hashSet.clear();
            hashMap.clear();
            if (y11 != null && !y11.isEmpty()) {
                hashSet2.add(y11);
            }
            hashMap.clear();
            f4Var.b(4, new ArrayList(hashSet2));
            if (mVar != null && mVar.g == null && System.currentTimeMillis() - mVar.e <= 600000 && i11 != 1) {
                TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                wallettransaction.id = "earnings:" + mVar.b;
                wallettransaction.pending = true;
                wallettransaction.amount = mVar.c;
                wallettransaction.date = mVar.d;
                wallettransaction.peer = new org.telegram.ui.Wallet.c4(y11);
                arrayList2.add(org.telegram.ui.Wallet.e4.i(wallettransaction, f4Var));
            }
            HashSet e10 = ii.n.e(i12);
            int size2 = arrayList4.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj4 = arrayList4.get(i15);
                i15++;
                TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) obj4;
                String str2 = starsTransaction.id;
                if (str2 == null || ((!e10.contains(str2) && (mVar == null || !starsTransaction.id.equals(mVar.g))) || starsTransaction.amount == null)) {
                    arrayList = arrayList4;
                    i10 = i11;
                    int i16 = jb.b;
                    n41 K2 = n41.K(jb.class);
                    K2.H = starsTransaction;
                    K2.r = false;
                    arrayList2.add(K2);
                } else {
                    TL_wallet.walletTransaction wallettransaction2 = new TL_wallet.walletTransaction();
                    StringBuilder sb2 = new StringBuilder("earnings:");
                    if (mVar != null) {
                        arrayList = arrayList4;
                        if (starsTransaction.id.equals(mVar.g)) {
                            str = mVar.b;
                            sb2.append(str);
                            wallettransaction2.id = sb2.toString();
                            wallettransaction2.pending = (starsTransaction.pending || starsTransaction.failed) ? false : true;
                            wallettransaction2.failed = starsTransaction.failed;
                            i10 = i11;
                            wallettransaction2.amount = Math.abs(starsTransaction.amount.amount);
                            wallettransaction2.date = starsTransaction.date;
                            wallettransaction2.peer = new org.telegram.ui.Wallet.c4(y11);
                            arrayList2.add(org.telegram.ui.Wallet.e4.i(wallettransaction2, f4Var));
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    str = starsTransaction.id;
                    sb2.append(str);
                    wallettransaction2.id = sb2.toString();
                    wallettransaction2.pending = (starsTransaction.pending || starsTransaction.failed) ? false : true;
                    wallettransaction2.failed = starsTransaction.failed;
                    i10 = i11;
                    wallettransaction2.amount = Math.abs(starsTransaction.amount.amount);
                    wallettransaction2.date = starsTransaction.date;
                    wallettransaction2.peer = new org.telegram.ui.Wallet.c4(y11);
                    arrayList2.add(org.telegram.ui.Wallet.e4.i(wallettransaction2, f4Var));
                }
                i11 = i10;
                arrayList4 = arrayList;
            }
            i7 = i11;
        } else {
            i7 = i11;
            ArrayList arrayList5 = arrayListArr[i7];
            int size3 = arrayList5.size();
            int i17 = 0;
            while (i17 < size3) {
                Object obj5 = arrayList5.get(i17);
                i17++;
                int i18 = jb.b;
                n41 K3 = n41.K(jb.class);
                K3.H = (TL_stars.StarsTransaction) obj5;
                K3.r = false;
                arrayList2.add(K3);
            }
        }
        if (y10.u[i7]) {
            return;
        }
        arrayList2.add(n41.q(arrayList2.size(), 7));
        arrayList2.add(n41.q(arrayList2.size(), 7));
        arrayList2.add(n41.q(arrayList2.size(), 7));
    }

    private final void f(Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        ((gi.p) this.b).getClass();
        ArrayList n10 = y00.n();
        int size = n10.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj3 = n10.get(i7);
            i7++;
            int i10 = gi.n.b;
            n41 K = n41.K(gi.n.class);
            K.H = (r00) obj3;
            arrayList.add(K);
        }
    }

    private final void g(Object obj, Object obj2) {
        hi.n nVar = (hi.n) this.b;
        Canvas canvas = (Canvas) obj;
        Runnable runnable = (Runnable) obj2;
        Paint paint = nVar.J;
        RectF rectF = nVar.z0;
        hi.h hVar = nVar.f;
        if (!nVar.g()) {
            Paint c10 = nVar.Q.c(1.0f);
            hVar.getEditText().setHintColor(c10 != null ? -1 : -2130706433);
            if (c10 == null) {
                runnable.run();
                return;
            }
            mt editText = hVar.getEditText();
            canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), ks.e4, 31);
            runnable.run();
            canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), c10);
            canvas.restore();
            return;
        }
        if (nVar.H == null) {
            runnable.run();
            return;
        }
        canvas.translate(-hVar.getEditText().q0, 0.0f);
        canvas.saveLayerAlpha(0.0f, 0.0f, nVar.H.getWidth(), nVar.H.getHeight(), ks.e4, 31);
        rectF.set(0.0f, 1.0f, nVar.H.getWidth(), nVar.H.getHeight() - 1);
        nVar.h(nVar.Q, canvas, rectF, 0.0f, true, (-hVar.getX()) - r14.getPaddingLeft(), ((-hVar.getY()) - r14.getPaddingTop()) - r14.getExtendedPaddingTop(), true);
        canvas.save();
        paint.setAlpha(ks.v2);
        canvas.drawBitmap(nVar.H, 0.0f, 0.0f, paint);
        canvas.restore();
        canvas.restore();
    }

    private final void h(Object obj, Object obj2) {
        hi.g2 g2Var = (hi.g2) this.b;
        String str = (String) obj;
        hi.r2 r2Var = g2Var.s;
        r2Var.m1 = str;
        r2Var.n1 = ((Integer) obj2).intValue();
        g2Var.c.D(str);
    }

    private final void i(Object obj, Object obj2) {
        w10 w10Var;
        hi.q3 q3Var = (hi.q3) this.b;
        if (obj == null) {
            q3Var.getClass();
        } else if (q3Var.p1 == null && (obj instanceof ef) && (w10Var = q3Var.q1) != null) {
            w10Var.a((ef) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:305:0x07d2  */
    @Override // org.telegram.messenger.p10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        b2 b2Var;
        boolean z10;
        int i7;
        ArrayList arrayList;
        int g12;
        CharSequence charSequence;
        long j3;
        TLRPC.User c22;
        int i10;
        int L;
        boolean z11;
        int i11;
        int i12;
        int i13 = this.a;
        int i14 = 10;
        int i15 = 3;
        boolean z12 = false;
        int i16 = 0;
        char c10 = 1;
        Object obj3 = this.b;
        switch (i13) {
            case 0:
                e eVar = (e) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = eVar.T1;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        q9 q9Var = eVar.U1;
                        ai.p2 p2Var = new ai.p2(1, eVar, tL_StarGiftAuctionAcquiredGift);
                        int i17 = c.b;
                        n41 K = n41.K(c.class);
                        K.H = tL_StarGiftAuctionAcquiredGift;
                        K.I = q9Var;
                        K.E = p2Var;
                        arrayList2.add(K);
                    }
                    arrayList2.add(n41.D(org.telegram.messenger.g0.L(16.0f)));
                    break;
                }
                break;
            case 1:
                ((ArrayList) obj).add(((g) obj3).T1);
                break;
            case 2:
                ArrayList arrayList3 = (ArrayList) obj;
                arrayList3.add(((y) obj3).U1);
                arrayList3.add(n41.D(org.telegram.messenger.g0.L(16.0f)));
                break;
            case 3:
                ((ArrayList) obj).add(n41.j(-1, ((m0) obj3).V1));
                break;
            case 4:
                ((ArrayList) obj).add(n41.j(-1, ((t0) obj3).V1));
                break;
            case 5:
                f2 f2Var = (f2) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = f2Var.e2;
                LinkedHashMap linkedHashMap = f2Var.a2;
                b2 b2Var2 = f2Var.V1;
                boolean z13 = f2Var.T1;
                ArrayList arrayList6 = f2Var.h2;
                ArrayList arrayList7 = f2Var.g2;
                org.telegram.messenger.t1 t1Var = f2Var.U1;
                d2 d2Var = f2Var.W1;
                ((b51) obj2).G = 1;
                if (f2Var.k2) {
                    arrayList4.add(n41.D(org.telegram.messenger.g0.L(8.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
                    if (TextUtils.isEmpty(f2Var.l2)) {
                        TLRPC.UserFull d2 = mp.u1(f2Var.a).d2(i10.i(f2Var.a).e());
                        if (d2 == null) {
                            mp.u1(f2Var.a).c3(i10.i(f2Var.a).f(), 0, true, null);
                        }
                        if (d2Var != null) {
                            int size = arrayList4.size();
                            if (d2Var.b) {
                                if (f2Var.X1 == null) {
                                    f2Var.X1 = f2Var.h1(R.drawable.filled_gift_send, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, f2Var.J0));
                                }
                                lq lqVar = f2Var.X1;
                                String N0 = gd.N0(2131750090, null);
                                int i18 = c2.b;
                                n41 K2 = n41.K(c2.class);
                                b2Var = b2Var2;
                                K2.d = (int) (-97);
                                K2.l = lqVar;
                                K2.m = N0;
                                K2.n = null;
                                arrayList4.add(K2);
                            } else {
                                b2Var = b2Var2;
                            }
                            if (d2Var.c) {
                                int i19 = d2Var.a;
                                String G = i19 > 0 ? gd.G(i19, "Gift2ExportTONUnlocksIn", new Object[0]) : null;
                                if (((org.telegram.messenger.h0) mp.u1(f2Var.a).A7.p0.b).c) {
                                    if (f2Var.Y1 == null) {
                                        f2Var.Y1 = f2Var.h1(R.drawable.filled_wallet_move, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, f2Var.J0));
                                    }
                                    String y10 = org.telegram.ui.Wallet.v0.D(f2Var.a).y();
                                    if (G != null || y10 == null || y10.length() < 20) {
                                        i10 = size;
                                        z10 = z13;
                                    } else {
                                        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.r5, f2Var.J0);
                                        int length = y10.length();
                                        String substring = y10.substring(0, 4);
                                        String substring2 = y10.substring(4, 8);
                                        i10 = size;
                                        StringBuilder sb2 = new StringBuilder();
                                        z10 = z13;
                                        sb2.append(y10.substring(8, 10));
                                        int i20 = length - 8;
                                        sb2.append(y10.substring(length - 10, i20));
                                        int i21 = length - 4;
                                        String[] strArr = {substring, substring2, sb2.toString(), y10.substring(i20, i21), y10.substring(i21, length)};
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                        int i22 = 0;
                                        while (i22 < 5) {
                                            int length2 = spannableStringBuilder.length();
                                            spannableStringBuilder.append((CharSequence) strArr[i22]);
                                            spannableStringBuilder.setSpan(new y1(w02, i22 == 2), length2, spannableStringBuilder.length(), 33);
                                            i22++;
                                        }
                                        G = spannableStringBuilder;
                                    }
                                    lq lqVar2 = f2Var.Y1;
                                    String N02 = gd.N0(2131750087, null);
                                    int i23 = c2.b;
                                    n41 K3 = n41.K(c2.class);
                                    K3.d = (int) (-98);
                                    K3.l = lqVar2;
                                    K3.m = N02;
                                    K3.n = G;
                                    arrayList4.add(K3);
                                } else {
                                    i10 = size;
                                    z10 = z13;
                                    if (f2Var.Z1 == null) {
                                        f2Var.Z1 = f2Var.h1(R.drawable.fragment, -16777216);
                                    }
                                    lq lqVar3 = f2Var.Z1;
                                    String N03 = gd.N0(2131749973, null);
                                    int i24 = c2.b;
                                    n41 K4 = n41.K(c2.class);
                                    K4.d = (int) (-99);
                                    K4.l = lqVar3;
                                    K4.m = N03;
                                    K4.n = G;
                                    arrayList4.add(K4);
                                }
                            } else {
                                i10 = size;
                                z10 = z13;
                            }
                            i7 = org.telegram.messenger.g0.L(56.0f) * (arrayList4.size() - i10);
                        } else {
                            b2Var = b2Var2;
                            z10 = z13;
                            i7 = 0;
                        }
                        if (!z10 && b2Var == null && d2Var == null && d2 != null && d2.birthday == null) {
                            n41 c11 = n41.c(1, R.drawable.menu_birthday, gd.N0(2131749400, null));
                            c11.r = true;
                            arrayList4.add(c11);
                            i7 += org.telegram.messenger.g0.L(50.0f);
                        }
                        if (t1Var != null) {
                            arrayList = arrayList4;
                            i7 = i7 + f2Var.g1(arrayList4, 2, gd.N0(2131753708, null), t1Var.c, null) + f2Var.g1(arrayList4, 3, gd.N0(2131753701, null), t1Var.b, null) + f2Var.g1(arrayList, 4, gd.N0(2131753702, null), t1Var.d, null);
                        } else {
                            arrayList = arrayList4;
                        }
                        TLRPC.User f10 = i10.i(f2Var.a).f();
                        if (!z10 && b2Var == null && d2Var == null && f10 != null) {
                            ArrayList arrayList8 = new ArrayList(1);
                            arrayList8.add(f10);
                            i7 += f2Var.g1(arrayList, 5, gd.N0(2131750082, null), arrayList8, gd.N0(2131750083, null));
                        }
                        mp u12 = mp.u1(f2Var.a);
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = f2Var.f2;
                        int size2 = arrayList10.size();
                        int i25 = 0;
                        while (i25 < size2) {
                            Object obj4 = arrayList10.get(i25);
                            i25++;
                            TLRPC.User c23 = u12.c2(Long.valueOf(((TLRPC.TL_topPeer) obj4).peer.user_id));
                            if (c23 != null && !c23.self && !n10.y(c23)) {
                                long j10 = c23.id;
                                if (t1Var == null || !t1Var.a(j10)) {
                                    arrayList9.add(c23);
                                }
                            }
                        }
                        if (!linkedHashMap.isEmpty()) {
                            HashSet hashSet = new HashSet();
                            int size3 = arrayList9.size();
                            int i26 = 0;
                            while (i26 < size3) {
                                Object obj5 = arrayList9.get(i26);
                                i26++;
                                hashSet.add(Long.valueOf(((TLRPC.User) obj5).id));
                            }
                            ArrayList arrayList11 = f2Var.c2;
                            int size4 = arrayList11.size();
                            int i27 = 0;
                            while (i27 < size4) {
                                Object obj6 = arrayList11.get(i27);
                                i27++;
                                hashSet.add(Long.valueOf(((TLRPC.TL_contact) obj6).user_id));
                            }
                            ArrayList arrayList12 = new ArrayList();
                            for (TLRPC.User user : linkedHashMap.values()) {
                                if (!hashSet.contains(Long.valueOf(user.id))) {
                                    arrayList12.add(user);
                                }
                            }
                            i7 += f2Var.g1(arrayList, 7, null, arrayList12, null);
                        }
                        g12 = i7 + f2Var.g1(arrayList, 6, gd.N0(2131749499, null), arrayList9, null);
                        long e10 = i10.i(f2Var.a).e();
                        int i28 = 0;
                        while (i28 < arrayList5.size()) {
                            String str = (String) arrayList5.get(i28);
                            ArrayList arrayList13 = (ArrayList) f2Var.d2.get(str);
                            if (arrayList13 == null) {
                                j3 = e10;
                            } else {
                                arrayList9.clear();
                                int size5 = arrayList13.size();
                                int i29 = 0;
                                while (i29 < size5) {
                                    Object obj7 = arrayList13.get(i29);
                                    i29++;
                                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj7;
                                    long j11 = e10;
                                    long j12 = tL_contact.user_id;
                                    if (j12 != j11 && ((t1Var == null || !t1Var.a(j12)) && (c22 = u12.c2(Long.valueOf(tL_contact.user_id))) != null)) {
                                        arrayList9.add(c22);
                                    }
                                    e10 = j11;
                                }
                                j3 = e10;
                                g12 += f2Var.g1(arrayList, i28 + 8, str.toUpperCase(), arrayList9, null);
                            }
                            i28++;
                            e10 = j3;
                        }
                        charSequence = null;
                    } else if (arrayList7.isEmpty() && arrayList6.isEmpty()) {
                        if (f2Var.m2 >= 0) {
                            int o12 = f2.o1(null, arrayList4);
                            for (int i30 = 0; i30 < 3; i30++) {
                                arrayList4.add(n41.q(i30, 6));
                            }
                            L = org.telegram.messenger.g0.L(168.0f) + o12;
                        } else {
                            arrayList4.add(bj.i(gd.N0(2131745611, null), gd.N0(2131747974, null)));
                            L = org.telegram.messenger.g0.L(200.0f);
                        }
                        g12 = L;
                        charSequence = null;
                        arrayList = arrayList4;
                    } else {
                        int g13 = f2Var.g1(arrayList4, 1, null, arrayList7, null);
                        boolean isEmpty = arrayList7.isEmpty();
                        int i31 = 0;
                        for (int i32 = 0; i32 < arrayList6.size(); i32++) {
                            if (i32 == 0 && isEmpty) {
                                i31 += f2.o1(null, arrayList4);
                            }
                            TLRPC.Chat chat = (TLRPC.Chat) arrayList6.get(i32);
                            int i33 = z1.b;
                            n41 K5 = n41.K(z1.class);
                            K5.d = 1;
                            K5.y = -chat.id;
                            K5.H = chat;
                            arrayList4.add(K5);
                            i31 += org.telegram.messenger.g0.L(56.0f);
                        }
                        g12 = g13 + i31;
                        charSequence = null;
                        arrayList = arrayList4;
                    }
                    arrayList.add(n41.C(charSequence));
                    int L2 = org.telegram.messenger.g0.L(12.0f) + g12;
                    int measuredHeight = f2Var.o1.getMeasuredHeight();
                    if (measuredHeight <= 0) {
                        measuredHeight = org.telegram.messenger.g0.q.y;
                    }
                    arrayList.add(n41.D(Math.max(0, org.telegram.messenger.g0.L(2.0f) + (((measuredHeight - org.telegram.messenger.g0.m) - (org.telegram.messenger.g0.L(8.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) - L2))));
                    break;
                }
                break;
            case 6:
                ((p3) obj3).e1((ArrayList) obj, (b51) obj2);
                break;
            case 7:
                u3 u3Var = (u3) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                TextView textView = u3Var.b2;
                u3Var.f2 = null;
                if (wallettransaction != null) {
                    long j13 = wallettransaction.fee;
                    if (j13 > 0) {
                        u3Var.g2 = j13;
                        z11 = false;
                        textView.setText(gd.a0(null, null, 2131749615, a5.k(j13)));
                        if (!u3Var.l2) {
                            u3Var.l2 = z11;
                            org.telegram.messenger.g0.r(u3Var.m2);
                            u3Var.d2.setLoading(z11);
                            u3Var.g1();
                            break;
                        }
                    } else {
                        i11 = 8;
                        z11 = false;
                    }
                } else {
                    z11 = false;
                    i11 = 8;
                }
                textView.setVisibility(i11);
                if (!u3Var.l2) {
                }
                break;
            case 8:
                p6 p6Var = (p6) obj3;
                ArrayList arrayList14 = (ArrayList) obj;
                org.telegram.ui.ActionBar.i6 i6Var = p6Var.c;
                fq0 fq0Var = p6Var.a;
                di.p8 p8Var = p6Var.e;
                if (p8Var != null) {
                    if ((!p8Var.e || p8Var.g != 783) && p8Var.l.size() <= 0) {
                        di.p8 p8Var2 = p6Var.e;
                        if (p8Var2.j && !p8Var2.i) {
                        }
                    }
                    di.p8 p8Var3 = p6Var.e;
                    int max = Math.max(1, (p8Var3 == null || (i12 = p8Var3.n) == 0) ? 3 : Math.min(3, i12));
                    di.p8 p8Var4 = p6Var.e;
                    if (p8Var4 != null) {
                        ArrayList arrayList15 = p8Var4.l;
                        int size6 = arrayList15.size();
                        int i34 = 3;
                        int i35 = 0;
                        while (i35 < size6) {
                            Object obj8 = arrayList15.get(i35);
                            i35++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj8;
                            boolean z14 = p6Var.d;
                            int i36 = h3.b;
                            n41 K6 = n41.K(h3.class);
                            K6.v = 1;
                            K6.A = 0;
                            K6.H = savedStarGift;
                            K6.r = true;
                            K6.f = false;
                            K6.s = z14;
                            K6.h = p6Var.h && (p6Var.e != fq0Var.d || savedStarGift.pinned_to_top);
                            arrayList14.add(K6);
                            i34--;
                            if (i34 == 0) {
                                i34 = 3;
                            }
                        }
                        di.p8 p8Var5 = p6Var.e;
                        if (p8Var5.i || !p8Var5.j) {
                            int i37 = 0;
                            while (true) {
                                if (i37 < (i34 <= 0 ? 3 : i34)) {
                                    i37++;
                                    n41 q10 = n41.q(i37, 34);
                                    q10.v = 1;
                                    arrayList14.add(q10);
                                }
                            }
                        }
                    }
                    if (fq0Var.d == p6Var.e) {
                        arrayList14.add(n41.D(org.telegram.messenger.g0.L(20.0f)));
                        if (fq0Var.c == i10.i(p6Var.b).e()) {
                            int i38 = org.telegram.ui.ActionBar.n6.z6;
                            int w03 = org.telegram.ui.ActionBar.n6.w0(i38, i6Var);
                            String N04 = gd.N0(2131746475, null);
                            int L3 = org.telegram.messenger.g0.L(24.0f);
                            int i39 = q6.b;
                            n41 K7 = n41.K(q6.class);
                            K7.m = N04;
                            K7.A = 17;
                            K7.C = w03;
                            K7.B = 14.0f;
                            K7.i = L3;
                            K7.k = 0;
                            K7.r = false;
                            K7.H = i6Var;
                            K7.I = Integer.valueOf(i38);
                            arrayList14.add(K7);
                        }
                        arrayList14.add(n41.D(org.telegram.messenger.g0.L(82.0f)));
                    } else if (!arrayList14.isEmpty()) {
                        arrayList14.add(n41.D(org.telegram.messenger.g0.L(82.0f)));
                    }
                    if (!arrayList14.isEmpty()) {
                        arrayList14.add(0, n41.D(org.telegram.messenger.g0.L(p6Var.I ? 42.0f : 12.0f)));
                    }
                    if (p6Var.f.getSpanCount() != max) {
                        org.telegram.messenger.g0.g3(new q5(p6Var, max, c10 == true ? 1 : 0));
                    }
                    fq0Var.p();
                    fq0Var.post(new a3.f(fq0Var, 26));
                    break;
                }
                break;
            case 9:
                m8 m8Var = (m8) obj3;
                ArrayList arrayList16 = (ArrayList) obj;
                a8 a8Var = m8Var.d;
                ArrayList arrayList17 = a8Var.d;
                int size7 = arrayList17.size();
                int i40 = 0;
                while (i40 < size7) {
                    Object obj9 = arrayList17.get(i40);
                    i40++;
                    arrayList16.add(h3.i(0, (TL_stars.TL_starGiftUnique) obj9, false, false, false, true, false));
                }
                if (a8Var.y || !a8Var.z) {
                    n41 q11 = n41.q(-1, 34);
                    q11.v = 1;
                    arrayList16.add(q11);
                    n41 q12 = n41.q(-2, 34);
                    q12.v = 1;
                    arrayList16.add(q12);
                    n41 q13 = n41.q(-3, 34);
                    q13.v = 1;
                    arrayList16.add(q13);
                    if (a8Var.d.isEmpty()) {
                        n41 q14 = n41.q(-4, 34);
                        q14.v = 1;
                        arrayList16.add(q14);
                        n41 q15 = n41.q(-5, 34);
                        q15.v = 1;
                        arrayList16.add(q15);
                        n41 q16 = n41.q(-6, 34);
                        q16.v = 1;
                        arrayList16.add(q16);
                        n41 q17 = n41.q(-7, 34);
                        q17.v = 1;
                        arrayList16.add(q17);
                        n41 q18 = n41.q(-8, 34);
                        q18.v = 1;
                        arrayList16.add(q18);
                        n41 q19 = n41.q(-9, 34);
                        q19.v = 1;
                        arrayList16.add(q19);
                        n41 q20 = n41.q(-10, 34);
                        q20.v = 1;
                        arrayList16.add(q20);
                        n41 q21 = n41.q(-11, 34);
                        q21.v = 1;
                        arrayList16.add(q21);
                        n41 q22 = n41.q(-12, 34);
                        q22.v = 1;
                        arrayList16.add(q22);
                        n41 q23 = n41.q(-13, 34);
                        q23.v = 1;
                        arrayList16.add(q23);
                        n41 q24 = n41.q(-14, 34);
                        q24.v = 1;
                        arrayList16.add(q24);
                        n41 q25 = n41.q(-15, 34);
                        q25.v = 1;
                        arrayList16.add(q25);
                    }
                }
                m8Var.j0(arrayList16.isEmpty() && !a8Var.y);
                break;
            case 10:
                l8 l8Var = (l8) obj3;
                ArrayList arrayList18 = (ArrayList) obj;
                k8 k8Var = l8Var.U1;
                if (k8Var != null) {
                    di.p8 p8Var6 = k8Var.b;
                    a8 a8Var2 = k8Var.c;
                    if (p8Var6 != null && a8Var2 != null) {
                        int currentTime = ConnectionsManager.getInstance(l8Var.a).getCurrentTime();
                        arrayList18.add(n41.t(-1, gd.N0(2131749753, null)));
                        ArrayList arrayList19 = p8Var6.l;
                        int size8 = arrayList19.size();
                        boolean z15 = true;
                        int i41 = 0;
                        int i42 = 0;
                        while (i42 < size8) {
                            Object obj10 = arrayList19.get(i42);
                            i42++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj10;
                            l8 l8Var2 = l8Var;
                            if (l8Var.c2.contains(Long.valueOf(savedStarGift2.gift.id)) || a5.m(savedStarGift2.gift)) {
                                l8Var = l8Var2;
                            } else {
                                boolean z16 = savedStarGift2.can_craft_at <= currentTime;
                                n41 i43 = h3.i(0, savedStarGift2.gift, false, true, false, false, true);
                                i43.g = z16;
                                arrayList18.add(i43);
                                i41++;
                                l8Var = l8Var2;
                                z15 = false;
                            }
                        }
                        l8 l8Var3 = l8Var;
                        if (p8Var6.i || !p8Var6.j) {
                            int i44 = i41 % 3;
                            int i45 = 6 - i44;
                            for (int i46 = 0; i46 < i45; i46++) {
                                n41 q26 = n41.q((i46 - i44) + 1, 35);
                                q26.v = 1;
                                arrayList18.add(q26);
                            }
                        } else if (z15) {
                            arrayList18.add(n41.g(gd.N0(2131749752, null)));
                        }
                        if (a8Var2.e > 0 || l8Var3.f2) {
                            l8Var3.f2 = true;
                            String N05 = gd.N0(2131749755, null);
                            n41 n41Var = new n41(42);
                            n41Var.d = -2;
                            n41Var.p = N05;
                            arrayList18.add(n41Var);
                            HorizontalScrollView horizontalScrollView = l8Var3.V1;
                            if (horizontalScrollView != null) {
                                arrayList18.add(n41.j(-3, horizontalScrollView));
                            }
                            ArrayList arrayList20 = a8Var2.d;
                            int size9 = arrayList20.size();
                            int i47 = 0;
                            while (i47 < size9) {
                                Object obj11 = arrayList20.get(i47);
                                i47++;
                                arrayList18.add(h3.i(0, (TL_stars.TL_starGiftUnique) obj11, false, true, false, true, true));
                            }
                            if (a8Var2.y || !a8Var2.z) {
                                n41 q27 = n41.q(10, 35);
                                q27.v = 1;
                                arrayList18.add(q27);
                                n41 q28 = n41.q(11, 35);
                                q28.v = 1;
                                arrayList18.add(q28);
                                n41 q29 = n41.q(12, 35);
                                q29.v = 1;
                                arrayList18.add(q29);
                                n41 q30 = n41.q(13, 35);
                                q30.v = 1;
                                arrayList18.add(q30);
                                n41 q31 = n41.q(14, 35);
                                q31.v = 1;
                                arrayList18.add(q31);
                                n41 q32 = n41.q(15, 35);
                                q32.v = 1;
                                arrayList18.add(q32);
                                break;
                            }
                        }
                    }
                }
                break;
            case 11:
                q8 q8Var = (q8) obj3;
                ArrayList arrayList21 = (ArrayList) obj;
                di.p8 p8Var7 = q8Var.U1;
                if (p8Var7 != null) {
                    ArrayList arrayList22 = p8Var7.l;
                    arrayList21.add(n41.D(org.telegram.messenger.g0.L(16.0f)));
                    if (p8Var7.i && arrayList22.isEmpty()) {
                        n41 q33 = n41.q(1, 34);
                        q33.v = 1;
                        arrayList21.add(q33);
                        n41 q34 = n41.q(2, 34);
                        q34.v = 1;
                        arrayList21.add(q34);
                        n41 q35 = n41.q(3, 34);
                        q35.v = 1;
                        arrayList21.add(q35);
                        n41 q36 = n41.q(4, 34);
                        q36.v = 1;
                        arrayList21.add(q36);
                        n41 q37 = n41.q(5, 34);
                        q37.v = 1;
                        arrayList21.add(q37);
                        n41 q38 = n41.q(6, 34);
                        q38.v = 1;
                        arrayList21.add(q38);
                        n41 q39 = n41.q(7, 34);
                        q39.v = 1;
                        arrayList21.add(q39);
                        n41 q40 = n41.q(8, 34);
                        q40.v = 1;
                        arrayList21.add(q40);
                        n41 q41 = n41.q(9, 34);
                        q41.v = 1;
                        arrayList21.add(q41);
                    } else {
                        int size10 = arrayList22.size();
                        int i48 = 3;
                        int i49 = 0;
                        while (i49 < size10) {
                            Object obj12 = arrayList22.get(i49);
                            i49++;
                            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj12;
                            if (!savedStarGift3.collection_id.contains(Integer.valueOf(q8Var.T1))) {
                                int i50 = h3.b;
                                n41 K8 = n41.K(h3.class);
                                K8.v = 1;
                                K8.A = z12 ? 1 : 0;
                                K8.H = savedStarGift3;
                                K8.r = true;
                                K8.f = true;
                                K8.s = z12;
                                HashSet hashSet2 = q8Var.V1;
                                int i51 = savedStarGift3.msg_id;
                                int i52 = i15;
                                K8.L(hashSet2.contains(Long.valueOf(i51 == 0 ? savedStarGift3.saved_id : i51)));
                                K8.v = 1;
                                arrayList21.add(K8);
                                i48--;
                                if (i48 == 0) {
                                    i48 = i52;
                                }
                                i15 = i52;
                                z12 = false;
                            }
                        }
                        int i53 = i15;
                        if (p8Var7.i || !p8Var7.j) {
                            int i54 = 0;
                            while (true) {
                                if (i54 < (i48 <= 0 ? i53 : i48)) {
                                    i54++;
                                    n41 q42 = n41.q(i54, 34);
                                    q42.v = 1;
                                    arrayList21.add(q42);
                                }
                            }
                        }
                    }
                    arrayList21.add(n41.D(org.telegram.messenger.g0.L(68.0f)));
                    break;
                }
                break;
            case 12:
                ch.p pVar = (ch.p) obj3;
                ArrayList arrayList23 = (ArrayList) obj;
                ArrayList arrayList24 = pVar.G;
                org.telegram.ui.Cells.r8 r8Var = pVar.e;
                if (r8Var != null && pVar.f != null) {
                    arrayList23.add(n41.j(1, r8Var));
                    arrayList23.add(n41.l(2, pVar.f));
                    int i55 = pVar.Z;
                    if (i55 == 1 || i55 == 0 || pVar.a) {
                        for (int i56 = 0; i56 < arrayList24.size(); i56++) {
                            View view = (View) arrayList24.get(i56);
                            arrayList23.add(((Boolean) pVar.H.get(i56)).booleanValue() ? n41.l(i56 + 100, view) : n41.j(i56 + 100, view));
                        }
                        break;
                    }
                }
                break;
            case 13:
                ci.d dVar = (ci.d) obj3;
                TLRPC.ShareThemeBackdrops shareThemeBackdrops = (TLRPC.ShareThemeBackdrops) obj;
                ArrayList arrayList25 = dVar.e;
                dVar.c = false;
                if (shareThemeBackdrops instanceof TLRPC.TL_shareThemeBackdrops) {
                    TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = (TLRPC.TL_shareThemeBackdrops) shareThemeBackdrops;
                    dVar.b = tL_shareThemeBackdrops;
                    try {
                        SerializedData serializedData = new SerializedData(tL_shareThemeBackdrops.getObjectSize());
                        dVar.b.serializeToStream(serializedData);
                        mp.u1(dVar.a).h7.edit().putString("qrBackdrops", Utilities.f(serializedData.toByteArray())).apply();
                        serializedData.cleanup();
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                dVar.d = shareThemeBackdrops != null;
                ArrayList arrayList26 = new ArrayList(arrayList25);
                arrayList25.clear();
                int size11 = arrayList26.size();
                while (i16 < size11) {
                    Object obj13 = arrayList26.get(i16);
                    i16++;
                    ((Runnable) obj13).run();
                }
                break;
            case 14:
                di.s sVar = (di.s) obj3;
                ArrayList arrayList27 = (ArrayList) obj;
                ArrayList arrayList28 = sVar.b;
                int size12 = arrayList28.size();
                int i57 = 0;
                while (i57 < size12) {
                    Object obj14 = arrayList28.get(i57);
                    i57++;
                    int i58 = jb.b;
                    n41 K9 = n41.K(jb.class);
                    K9.H = (TL_stars.StarsTransaction) obj14;
                    K9.r = true;
                    arrayList27.add(K9);
                }
                if (sVar.h) {
                    arrayList27.add(n41.e(-1, gd.N0(2131745856, null)));
                    break;
                } else if (!sVar.f) {
                    for (int i59 = 0; i59 < 3; i59++) {
                        arrayList27.add(n41.q(i59, 7));
                    }
                    break;
                }
                break;
            case 15:
                x20 x20Var = (x20) obj3;
                ArrayList arrayList29 = (ArrayList) obj;
                arrayList29.add(n41.k(x20Var.U1));
                arrayList29.add(di.g0.i(gd.N0(2131750855, null), gd.N0(2131750856, null), R.drawable.msg_gift_premium));
                arrayList29.add(di.g0.i(gd.N0(2131750853, null), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(gd.N0(2131750854, null), new ca.r(x20Var, i14)), true), R.drawable.msg_bot));
                arrayList29.add(di.g0.i(gd.N0(2131750851, null), gd.N0(2131750852, null), R.drawable.menu_unlock));
                arrayList29.add(di.g0.i(gd.N0(2131750849, null), gd.N0(2131750850, null), R.drawable.menu_feature_paid));
                arrayList29.add(n41.D(org.telegram.messenger.g0.L(68.0f)));
                break;
            case 16:
                b(obj, obj2);
                break;
            case 17:
                p10 p10Var = (p10) obj3;
                Long l10 = (Long) obj;
                Boolean bool = (Boolean) obj2;
                if (p10Var != null) {
                    p10Var.a(l10, bool);
                    break;
                }
                break;
            case 18:
                ((pb) obj3).K0((ArrayList) obj, (b51) obj2);
                break;
            case 19:
                c(obj, obj2);
                break;
            case 20:
                d(obj, obj2);
                break;
            case 21:
                gb gbVar = (gb) obj3;
                ArrayList arrayList30 = (ArrayList) obj;
                i5.c.s(2131743969, null, arrayList30);
                ArrayList z17 = di.y8.y(gbVar.a, false).z();
                if (z17 == null || z17.isEmpty()) {
                    arrayList30.add(n41.p(31));
                    arrayList30.add(n41.p(31));
                    arrayList30.add(n41.p(31));
                    arrayList30.add(n41.p(31));
                    arrayList30.add(n41.p(31));
                } else {
                    int i60 = 0;
                    int i61 = 1;
                    for (int i62 = 0; i62 < z17.size(); i62++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z17.get(i62);
                        if (!tL_starsTopupOption.extended || gbVar.V1) {
                            arrayList30.add(bb.i(i62, i61, tL_starsTopupOption));
                            i61++;
                        } else {
                            i60++;
                        }
                    }
                    boolean z18 = gbVar.V1;
                    if (!z18 && i60 > 0) {
                        String N06 = gd.N0(z18 ? 2131747651 : 2131747642, null);
                        boolean z19 = !gbVar.V1;
                        int i63 = wa.b;
                        n41 K10 = n41.K(wa.class);
                        K10.d = -1;
                        K10.m = N06;
                        K10.f = z19;
                        K10.r = true;
                        arrayList30.add(K10);
                    }
                }
                arrayList30.add(n41.k(gbVar.T1));
                break;
            case 22:
                e(obj, obj2);
                break;
            case 23:
                f(obj, obj2);
                break;
            case 24:
                g(obj, obj2);
                break;
            case 25:
                hi.b2 b2Var3 = (hi.b2) obj3;
                String str2 = (String) obj;
                hi.r2 r2Var = b2Var3.r;
                r2Var.m1 = str2;
                r2Var.n1 = ((Integer) obj2).intValue();
                b2Var3.c.H(str2);
                break;
            case 26:
                h(obj, obj2);
                break;
            case 27:
                i(obj, obj2);
                break;
            case 28:
                hi.v5 v5Var = (hi.v5) obj3;
                v5Var.c0(v5Var.i0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
            default:
                ((hi.mb) obj3).X(((Float) obj2).floatValue(), (Bitmap) obj);
                break;
        }
    }
}
