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
import hi.ra;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ef;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.q10;
import org.telegram.messenger.q9;
import org.telegram.messenger.s00;
import org.telegram.messenger.x10;
import org.telegram.messenger.z00;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.cj;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.ot;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements q10 {
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
        arrayList.add(o41.D(org.telegram.messenger.g0.L(315.0f)));
        pVar3.a = 0;
        pVar3.c();
        pVar2.a = 0;
        pVar2.c();
        pVar.a = 0;
        pVar.c();
        int i7 = h1Var.f2.s;
        if (i7 == 0) {
            arrayList.add(o41.g(org.telegram.messenger.g0.W2(gd.H(',', z10 ? "GiftPreviewCountModelsCrafting" : "GiftPreviewCountModels", arrayList5.size()))));
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
            arrayList.add(o41.g(org.telegram.messenger.g0.W2(gd.H(',', z10 ? "GiftPreviewCountModelsCrafting2" : "GiftPreviewCountModels", arrayList5.size()))));
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
            arrayList.add(o41.g(org.telegram.messenger.g0.W2(gd.H(',', "GiftPreviewCountBackdrops", arrayList4.size()))));
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
            arrayList.add(o41.g(org.telegram.messenger.g0.W2(gd.H(',', "GiftPreviewCountSymbols", arrayList3.size()))));
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
        arrayList.add(o41.k(abVar.T1));
        arrayList.add(o41.u(gd.N0(2131743973, null)));
        ArrayList u10 = di.y8.y(abVar.a, false).u();
        if (u10 == null || u10.isEmpty()) {
            arrayList.add(o41.p(31));
            arrayList.add(o41.p(31));
            arrayList.add(o41.p(31));
        } else {
            int i7 = 0;
            int i10 = 1;
            for (int i11 = 0; i11 < u10.size(); i11++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i11);
                if (abVar.Y1 || !tL_starsGiftOption.extended) {
                    int i12 = i10 + 1;
                    int i13 = bb.b;
                    o41 K = o41.K(bb.class);
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
                o41 K2 = o41.K(wa.class);
                K2.d = -1;
                K2.m = N0;
                K2.f = z11;
                K2.r = true;
                arrayList.add(K2);
            }
        }
        arrayList.add(o41.k(abVar.U1));
    }

    private final void d(Object obj, Object obj2) {
        fb fbVar = (fb) this.b;
        ArrayList arrayList = (ArrayList) obj;
        long j3 = fbVar.T1;
        ah.a aVar = fbVar.U1;
        arrayList.add(o41.m(aVar));
        boolean z10 = fbVar.Z1;
        if (z10) {
            i5.c.s(2131743973, null, arrayList);
        }
        ArrayList z11 = di.y8.y(fbVar.a, false).z();
        if (z10) {
            if (z11 == null || z11.isEmpty()) {
                arrayList.add(o41.p(31));
                arrayList.add(o41.p(31));
                arrayList.add(o41.p(31));
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
                    arrayList.add(o41.k(aVar));
                    arrayList.add(o41.u(gd.N0(2131743973, null)));
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
                            o41 K = o41.K(wa.class);
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
                        o41 K2 = o41.K(wa.class);
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
        arrayList.add(o41.k(fbVar.V1));
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
                o41 K = o41.K(jb.class);
                K.H = (TL_stars.StarsTransaction) obj3;
                K.r = true;
                arrayList2.add(K);
            }
            if (g10.k(j3).e[i11]) {
                return;
            }
            arrayList2.add(o41.q(arrayList2.size(), 7));
            arrayList2.add(o41.q(arrayList2.size(), 7));
            arrayList2.add(o41.q(arrayList2.size(), 7));
            return;
        }
        di.y8 y10 = di.y8.y(i12, z10);
        ArrayList[] arrayListArr = y10.q;
        if (z10 && ii.n.c(i12)) {
            if (mbVar.n == null) {
                mbVar.n = new org.telegram.ui.Wallet.e4();
            }
            mbVar.r = org.telegram.ui.Wallet.u0.D(i12).y();
            ArrayList arrayList4 = arrayListArr[i11];
            org.telegram.ui.Wallet.e4 e4Var = mbVar.n;
            ii.m mVar = ii.n.b[i12];
            String y11 = org.telegram.ui.Wallet.u0.D(i12).y();
            HashSet hashSet = e4Var.a;
            HashSet hashSet2 = e4Var.a;
            HashMap hashMap = e4Var.b;
            hashSet.clear();
            hashMap.clear();
            if (y11 != null && !y11.isEmpty()) {
                hashSet2.add(y11);
            }
            hashMap.clear();
            e4Var.b(4, new ArrayList(hashSet2));
            if (mVar != null && mVar.g == null && System.currentTimeMillis() - mVar.e <= 600000 && i11 != 1) {
                TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                wallettransaction.id = "earnings:" + mVar.b;
                wallettransaction.pending = true;
                wallettransaction.amount = mVar.c;
                wallettransaction.date = mVar.d;
                wallettransaction.peer = new org.telegram.ui.Wallet.b4(y11);
                arrayList2.add(org.telegram.ui.Wallet.d4.i(wallettransaction, e4Var));
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
                    o41 K2 = o41.K(jb.class);
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
                            wallettransaction2.peer = new org.telegram.ui.Wallet.b4(y11);
                            arrayList2.add(org.telegram.ui.Wallet.d4.i(wallettransaction2, e4Var));
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
                    wallettransaction2.peer = new org.telegram.ui.Wallet.b4(y11);
                    arrayList2.add(org.telegram.ui.Wallet.d4.i(wallettransaction2, e4Var));
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
                o41 K3 = o41.K(jb.class);
                K3.H = (TL_stars.StarsTransaction) obj5;
                K3.r = false;
                arrayList2.add(K3);
            }
        }
        if (y10.u[i7]) {
            return;
        }
        arrayList2.add(o41.q(arrayList2.size(), 7));
        arrayList2.add(o41.q(arrayList2.size(), 7));
        arrayList2.add(o41.q(arrayList2.size(), 7));
    }

    private final void f(Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        ((gi.p) this.b).getClass();
        ArrayList n10 = z00.n();
        int size = n10.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj3 = n10.get(i7);
            i7++;
            int i10 = gi.n.b;
            o41 K = o41.K(gi.n.class);
            K.H = (s00) obj3;
            arrayList.add(K);
        }
    }

    private final void g(Object obj, Object obj2) {
        hi.o oVar = (hi.o) this.b;
        Canvas canvas = (Canvas) obj;
        Runnable runnable = (Runnable) obj2;
        Paint paint = oVar.J;
        RectF rectF = oVar.z0;
        hi.h hVar = oVar.f;
        if (!oVar.g()) {
            Paint c10 = oVar.Q.c(1.0f);
            hVar.getEditText().setHintColor(c10 != null ? -1 : -2130706433);
            if (c10 == null) {
                runnable.run();
                return;
            }
            ot editText = hVar.getEditText();
            canvas.saveLayerAlpha(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), ks.e4, 31);
            runnable.run();
            canvas.drawRect(0.0f, 0.0f, editText.getWidth(), editText.getHeight(), c10);
            canvas.restore();
            return;
        }
        if (oVar.H == null) {
            runnable.run();
            return;
        }
        canvas.translate(-hVar.getEditText().q0, 0.0f);
        canvas.saveLayerAlpha(0.0f, 0.0f, oVar.H.getWidth(), oVar.H.getHeight(), ks.e4, 31);
        rectF.set(0.0f, 1.0f, oVar.H.getWidth(), oVar.H.getHeight() - 1);
        oVar.h(oVar.Q, canvas, rectF, 0.0f, true, (-hVar.getX()) - r14.getPaddingLeft(), ((-hVar.getY()) - r14.getPaddingTop()) - r14.getExtendedPaddingTop(), true);
        canvas.save();
        paint.setAlpha(ks.v2);
        canvas.drawBitmap(oVar.H, 0.0f, 0.0f, paint);
        canvas.restore();
        canvas.restore();
    }

    private final void h(Object obj, Object obj2) {
        hi.y1 y1Var = (hi.y1) this.b;
        String str = (String) obj;
        hi.i2 i2Var = y1Var.s;
        i2Var.m1 = str;
        i2Var.n1 = ((Integer) obj2).intValue();
        y1Var.c.D(str);
    }

    private final void i(Object obj, Object obj2) {
        x10 x10Var;
        hi.h3 h3Var = (hi.h3) this.b;
        if (obj == null) {
            h3Var.getClass();
        } else if (h3Var.p1 == null && (obj instanceof ef) && (x10Var = h3Var.q1) != null) {
            x10Var.a((ef) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:306:0x07e7  */
    @Override // org.telegram.messenger.q10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        float f10;
        c2 c2Var;
        org.telegram.messenger.t1 t1Var;
        int i7;
        org.telegram.messenger.t1 t1Var2;
        int i10;
        int i11;
        TLRPC.User c22;
        int i12;
        e2 e2Var;
        boolean z10;
        int i13;
        int i14;
        int i15 = this.a;
        int i16 = 11;
        int i17 = 3;
        boolean z11 = false;
        int i18 = 0;
        Object obj3 = this.b;
        switch (i15) {
            case 0:
                e eVar = (e) obj3;
                ArrayList arrayList = (ArrayList) obj;
                List<TL_stars.TL_StarGiftAuctionAcquiredGift> list = eVar.T1;
                if (list != null) {
                    for (TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift : list) {
                        q9 q9Var = eVar.U1;
                        ai.x2 x2Var = new ai.x2(1, eVar, tL_StarGiftAuctionAcquiredGift);
                        int i19 = c.b;
                        o41 K = o41.K(c.class);
                        K.H = tL_StarGiftAuctionAcquiredGift;
                        K.I = q9Var;
                        K.E = x2Var;
                        arrayList.add(K);
                    }
                    arrayList.add(o41.D(org.telegram.messenger.g0.L(16.0f)));
                    break;
                }
                break;
            case 1:
                ((ArrayList) obj).add(((g) obj3).T1);
                break;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(((y) obj3).U1);
                arrayList2.add(o41.D(org.telegram.messenger.g0.L(16.0f)));
                break;
            case 3:
                ((ArrayList) obj).add(o41.j(-1, ((m0) obj3).V1));
                break;
            case 4:
                ((ArrayList) obj).add(o41.j(-1, ((t0) obj3).V1));
                break;
            case 5:
                e2 e2Var2 = (e2) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                ArrayList arrayList4 = e2Var2.e2;
                LinkedHashMap linkedHashMap = e2Var2.a2;
                a2 a2Var = e2Var2.V1;
                boolean z12 = e2Var2.T1;
                ArrayList arrayList5 = e2Var2.h2;
                ArrayList arrayList6 = e2Var2.g2;
                org.telegram.messenger.t1 t1Var3 = e2Var2.U1;
                c2 c2Var2 = e2Var2.W1;
                ((c51) obj2).G = 1;
                if (e2Var2.k2) {
                    arrayList3.add(o41.D(org.telegram.messenger.g0.L(8.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
                    if (TextUtils.isEmpty(e2Var2.l2)) {
                        TLRPC.UserFull d2 = mp.u1(e2Var2.a).d2(j10.i(e2Var2.a).e());
                        if (d2 == null) {
                            f10 = 8.0f;
                            mp.u1(e2Var2.a).c3(j10.i(e2Var2.a).f(), 0, true, null);
                        } else {
                            f10 = 8.0f;
                        }
                        if (c2Var2 != null) {
                            int size = arrayList3.size();
                            if (c2Var2.b) {
                                if (e2Var2.X1 == null) {
                                    e2Var2.X1 = e2Var2.h1(R.drawable.filled_gift_send, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, e2Var2.J0));
                                }
                                oq oqVar = e2Var2.X1;
                                String N0 = gd.N0(2131750090, null);
                                int i20 = b2.b;
                                o41 K2 = o41.K(b2.class);
                                t1Var = t1Var3;
                                K2.d = (int) (-97);
                                K2.l = oqVar;
                                K2.m = N0;
                                K2.n = null;
                                arrayList3.add(K2);
                            } else {
                                t1Var = t1Var3;
                            }
                            if (c2Var2.c) {
                                int i21 = c2Var2.a;
                                String G = i21 > 0 ? gd.G(i21, "Gift2ExportTONUnlocksIn", new Object[0]) : null;
                                if (((org.telegram.messenger.h0) mp.u1(e2Var2.a).A7.p0.b).c) {
                                    if (e2Var2.Y1 == null) {
                                        e2Var2.Y1 = e2Var2.h1(R.drawable.filled_wallet_move, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, e2Var2.J0));
                                    }
                                    String y10 = org.telegram.ui.Wallet.u0.D(e2Var2.a).y();
                                    if (G != null || y10 == null || y10.length() < 20) {
                                        i12 = size;
                                        c2Var = c2Var2;
                                    } else {
                                        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.r5, e2Var2.J0);
                                        int length = y10.length();
                                        String substring = y10.substring(0, 4);
                                        String substring2 = y10.substring(4, 8);
                                        i12 = size;
                                        StringBuilder sb2 = new StringBuilder();
                                        c2Var = c2Var2;
                                        sb2.append(y10.substring(8, 10));
                                        int i22 = length - 8;
                                        sb2.append(y10.substring(length - 10, i22));
                                        int i23 = length - 4;
                                        String[] strArr = {substring, substring2, sb2.toString(), y10.substring(i22, i23), y10.substring(i23, length)};
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                        int i24 = 0;
                                        while (i24 < 5) {
                                            int length2 = spannableStringBuilder.length();
                                            spannableStringBuilder.append((CharSequence) strArr[i24]);
                                            spannableStringBuilder.setSpan(new x1(w02, i24 == 2), length2, spannableStringBuilder.length(), 33);
                                            i24++;
                                        }
                                        G = spannableStringBuilder;
                                    }
                                    oq oqVar2 = e2Var2.Y1;
                                    String N02 = gd.N0(2131750087, null);
                                    int i25 = b2.b;
                                    o41 K3 = o41.K(b2.class);
                                    K3.d = (int) (-98);
                                    K3.l = oqVar2;
                                    K3.m = N02;
                                    K3.n = G;
                                    arrayList3.add(K3);
                                } else {
                                    i12 = size;
                                    c2Var = c2Var2;
                                    if (e2Var2.Z1 == null) {
                                        e2Var2.Z1 = e2Var2.h1(R.drawable.fragment, -16777216);
                                    }
                                    oq oqVar3 = e2Var2.Z1;
                                    String N03 = gd.N0(2131749973, null);
                                    int i26 = b2.b;
                                    o41 K4 = o41.K(b2.class);
                                    K4.d = (int) (-99);
                                    K4.l = oqVar3;
                                    K4.m = N03;
                                    K4.n = G;
                                    arrayList3.add(K4);
                                }
                            } else {
                                i12 = size;
                                c2Var = c2Var2;
                            }
                            i7 = org.telegram.messenger.g0.L(56.0f) * (arrayList3.size() - i12);
                        } else {
                            c2Var = c2Var2;
                            t1Var = t1Var3;
                            i7 = 0;
                        }
                        if (!z12 && a2Var == null && c2Var == null && d2 != null && d2.birthday == null) {
                            o41 c10 = o41.c(1, R.drawable.menu_birthday, gd.N0(2131749400, null));
                            c10.r = true;
                            arrayList3.add(c10);
                            i7 += org.telegram.messenger.g0.L(50.0f);
                        }
                        if (t1Var != null) {
                            t1Var2 = t1Var;
                            i7 = i7 + e2Var2.g1(arrayList3, 2, gd.N0(2131753708, null), t1Var2.c, null) + e2Var2.g1(arrayList3, 3, gd.N0(2131753701, null), t1Var2.b, null) + e2Var2.g1(arrayList3, 4, gd.N0(2131753702, null), t1Var2.d, null);
                        } else {
                            t1Var2 = t1Var;
                        }
                        TLRPC.User f11 = j10.i(e2Var2.a).f();
                        if (!z12 && a2Var == null && c2Var == null && f11 != null) {
                            ArrayList arrayList7 = new ArrayList(1);
                            arrayList7.add(f11);
                            i7 += e2Var2.g1(arrayList3, 5, gd.N0(2131750082, null), arrayList7, gd.N0(2131750083, null));
                        }
                        mp u12 = mp.u1(e2Var2.a);
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = e2Var2.f2;
                        int size2 = arrayList9.size();
                        int i27 = 0;
                        while (i27 < size2) {
                            Object obj4 = arrayList9.get(i27);
                            i27++;
                            TLRPC.User c23 = u12.c2(Long.valueOf(((TLRPC.TL_topPeer) obj4).peer.user_id));
                            if (c23 != null && !c23.self && !o10.y(c23)) {
                                long j3 = c23.id;
                                if (t1Var2 == null || !t1Var2.a(j3)) {
                                    arrayList8.add(c23);
                                }
                            }
                        }
                        if (!linkedHashMap.isEmpty()) {
                            HashSet hashSet = new HashSet();
                            int size3 = arrayList8.size();
                            int i28 = 0;
                            while (i28 < size3) {
                                Object obj5 = arrayList8.get(i28);
                                i28++;
                                hashSet.add(Long.valueOf(((TLRPC.User) obj5).id));
                            }
                            ArrayList arrayList10 = e2Var2.c2;
                            int size4 = arrayList10.size();
                            int i29 = 0;
                            while (i29 < size4) {
                                Object obj6 = arrayList10.get(i29);
                                i29++;
                                hashSet.add(Long.valueOf(((TLRPC.TL_contact) obj6).user_id));
                            }
                            ArrayList arrayList11 = new ArrayList();
                            for (TLRPC.User user : linkedHashMap.values()) {
                                if (!hashSet.contains(Long.valueOf(user.id))) {
                                    arrayList11.add(user);
                                }
                            }
                            i7 += e2Var2.g1(arrayList3, 7, null, arrayList11, null);
                        }
                        int g12 = i7 + e2Var2.g1(arrayList3, 6, gd.N0(2131749499, null), arrayList8, null);
                        long e10 = j10.i(e2Var2.a).e();
                        int i30 = 0;
                        e2 e2Var3 = e2Var2;
                        while (i30 < arrayList4.size()) {
                            String str = (String) arrayList4.get(i30);
                            ArrayList arrayList12 = (ArrayList) e2Var3.d2.get(str);
                            if (arrayList12 == null) {
                                i11 = i30;
                            } else {
                                arrayList8.clear();
                                int size5 = arrayList12.size();
                                int i31 = 0;
                                e2Var3 = e2Var3;
                                while (i31 < size5) {
                                    Object obj7 = arrayList12.get(i31);
                                    i31++;
                                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj7;
                                    int i32 = i30;
                                    e2 e2Var4 = e2Var3;
                                    long j10 = tL_contact.user_id;
                                    if (j10 != e10 && ((t1Var2 == null || !t1Var2.a(j10)) && (c22 = u12.c2(Long.valueOf(tL_contact.user_id))) != null)) {
                                        arrayList8.add(c22);
                                    }
                                    e2Var3 = e2Var4;
                                    i30 = i32;
                                }
                                i11 = i30;
                                g12 += e2Var3.g1(arrayList3, i11 + 8, str.toUpperCase(), arrayList8, null);
                            }
                            i30 = i11 + 1;
                            e2Var3 = e2Var3;
                        }
                        i10 = g12;
                        e2Var = e2Var3;
                    } else {
                        if (!arrayList6.isEmpty() || !arrayList5.isEmpty()) {
                            int g13 = e2Var2.g1(arrayList3, 1, null, arrayList6, null);
                            boolean isEmpty = arrayList6.isEmpty();
                            int i33 = 0;
                            for (int i34 = 0; i34 < arrayList5.size(); i34++) {
                                if (i34 == 0 && isEmpty) {
                                    i33 += e2.o1(null, arrayList3);
                                }
                                TLRPC.Chat chat = (TLRPC.Chat) arrayList5.get(i34);
                                int i35 = y1.b;
                                o41 K5 = o41.K(y1.class);
                                K5.d = 1;
                                K5.y = -chat.id;
                                K5.H = chat;
                                arrayList3.add(K5);
                                i33 += org.telegram.messenger.g0.L(56.0f);
                            }
                            i10 = g13 + i33;
                        } else if (e2Var2.m2 >= 0) {
                            int o12 = e2.o1(null, arrayList3);
                            for (int i36 = 0; i36 < 3; i36++) {
                                arrayList3.add(o41.q(i36, 6));
                            }
                            i10 = org.telegram.messenger.g0.L(168.0f) + o12;
                        } else {
                            arrayList3.add(cj.i(gd.N0(2131745611, null), gd.N0(2131747974, null)));
                            i10 = org.telegram.messenger.g0.L(200.0f);
                        }
                        f10 = 8.0f;
                        e2Var = e2Var2;
                    }
                    arrayList3.add(o41.C(null));
                    int L = org.telegram.messenger.g0.L(12.0f) + i10;
                    int measuredHeight = e2Var.o1.getMeasuredHeight();
                    if (measuredHeight <= 0) {
                        measuredHeight = org.telegram.messenger.g0.q.y;
                    }
                    arrayList3.add(o41.D(Math.max(0, org.telegram.messenger.g0.L(2.0f) + (((measuredHeight - org.telegram.messenger.g0.m) - (org.telegram.messenger.g0.L(f10) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) - L))));
                    break;
                }
                break;
            case 6:
                ((n3) obj3).e1((ArrayList) obj, (c51) obj2);
                break;
            case 7:
                s3 s3Var = (s3) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                TextView textView = s3Var.b2;
                s3Var.f2 = null;
                if (wallettransaction != null) {
                    long j11 = wallettransaction.fee;
                    if (j11 > 0) {
                        s3Var.g2 = j11;
                        z10 = false;
                        textView.setText(gd.a0(null, null, 2131749615, y4.k(j11)));
                        if (!s3Var.l2) {
                            s3Var.l2 = z10;
                            org.telegram.messenger.g0.r(s3Var.m2);
                            s3Var.d2.setLoading(z10);
                            s3Var.g1();
                            break;
                        }
                    } else {
                        i13 = 8;
                        z10 = false;
                    }
                } else {
                    z10 = false;
                    i13 = 8;
                }
                textView.setVisibility(i13);
                if (!s3Var.l2) {
                }
                break;
            case 8:
                n6 n6Var = (n6) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                org.telegram.ui.ActionBar.h6 h6Var = n6Var.c;
                gq0 gq0Var = n6Var.a;
                di.p8 p8Var = n6Var.e;
                if (p8Var != null) {
                    if ((!p8Var.e || p8Var.g != 783) && p8Var.l.size() <= 0) {
                        di.p8 p8Var2 = n6Var.e;
                        if (p8Var2.j && !p8Var2.i) {
                        }
                    }
                    di.p8 p8Var3 = n6Var.e;
                    int max = Math.max(1, (p8Var3 == null || (i14 = p8Var3.n) == 0) ? 3 : Math.min(3, i14));
                    di.p8 p8Var4 = n6Var.e;
                    if (p8Var4 != null) {
                        ArrayList arrayList14 = p8Var4.l;
                        int size6 = arrayList14.size();
                        int i37 = 3;
                        int i38 = 0;
                        while (i38 < size6) {
                            Object obj8 = arrayList14.get(i38);
                            i38++;
                            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj8;
                            boolean z13 = n6Var.d;
                            int i39 = f3.b;
                            o41 K6 = o41.K(f3.class);
                            K6.v = 1;
                            K6.A = 0;
                            K6.H = savedStarGift;
                            K6.r = true;
                            K6.f = false;
                            K6.s = z13;
                            K6.h = n6Var.h && (n6Var.e != gq0Var.d || savedStarGift.pinned_to_top);
                            arrayList13.add(K6);
                            i37--;
                            if (i37 == 0) {
                                i37 = 3;
                            }
                        }
                        di.p8 p8Var5 = n6Var.e;
                        if (p8Var5.i || !p8Var5.j) {
                            int i40 = 0;
                            while (true) {
                                if (i40 < (i37 <= 0 ? 3 : i37)) {
                                    i40++;
                                    o41 q10 = o41.q(i40, 34);
                                    q10.v = 1;
                                    arrayList13.add(q10);
                                }
                            }
                        }
                    }
                    if (gq0Var.d == n6Var.e) {
                        arrayList13.add(o41.D(org.telegram.messenger.g0.L(20.0f)));
                        if (gq0Var.c == j10.i(n6Var.b).e()) {
                            int i41 = org.telegram.ui.ActionBar.m6.z6;
                            int w03 = org.telegram.ui.ActionBar.m6.w0(i41, h6Var);
                            String N04 = gd.N0(2131746475, null);
                            int L2 = org.telegram.messenger.g0.L(24.0f);
                            int i42 = o6.b;
                            o41 K7 = o41.K(o6.class);
                            K7.m = N04;
                            K7.A = 17;
                            K7.C = w03;
                            K7.B = 14.0f;
                            K7.i = L2;
                            K7.k = 0;
                            K7.r = false;
                            K7.H = h6Var;
                            K7.I = Integer.valueOf(i41);
                            arrayList13.add(K7);
                        }
                        arrayList13.add(o41.D(org.telegram.messenger.g0.L(82.0f)));
                    } else if (!arrayList13.isEmpty()) {
                        arrayList13.add(o41.D(org.telegram.messenger.g0.L(82.0f)));
                    }
                    if (!arrayList13.isEmpty()) {
                        arrayList13.add(0, o41.D(org.telegram.messenger.g0.L(n6Var.I ? 42.0f : 12.0f)));
                    }
                    if (n6Var.f.getSpanCount() != max) {
                        org.telegram.messenger.g0.g3(new o5(n6Var, max, 1));
                    }
                    gq0Var.p();
                    gq0Var.post(new a3.f(gq0Var, 27));
                    break;
                }
                break;
            case 9:
                k8 k8Var = (k8) obj3;
                ArrayList arrayList15 = (ArrayList) obj;
                y7 y7Var = k8Var.d;
                ArrayList arrayList16 = y7Var.d;
                int size7 = arrayList16.size();
                int i43 = 0;
                while (i43 < size7) {
                    Object obj9 = arrayList16.get(i43);
                    i43++;
                    arrayList15.add(f3.i(0, (TL_stars.TL_starGiftUnique) obj9, false, false, false, true, false));
                }
                if (y7Var.y || !y7Var.z) {
                    o41 q11 = o41.q(-1, 34);
                    q11.v = 1;
                    arrayList15.add(q11);
                    o41 q12 = o41.q(-2, 34);
                    q12.v = 1;
                    arrayList15.add(q12);
                    o41 q13 = o41.q(-3, 34);
                    q13.v = 1;
                    arrayList15.add(q13);
                    if (y7Var.d.isEmpty()) {
                        o41 q14 = o41.q(-4, 34);
                        q14.v = 1;
                        arrayList15.add(q14);
                        o41 q15 = o41.q(-5, 34);
                        q15.v = 1;
                        arrayList15.add(q15);
                        o41 q16 = o41.q(-6, 34);
                        q16.v = 1;
                        arrayList15.add(q16);
                        o41 q17 = o41.q(-7, 34);
                        q17.v = 1;
                        arrayList15.add(q17);
                        o41 q18 = o41.q(-8, 34);
                        q18.v = 1;
                        arrayList15.add(q18);
                        o41 q19 = o41.q(-9, 34);
                        q19.v = 1;
                        arrayList15.add(q19);
                        o41 q20 = o41.q(-10, 34);
                        q20.v = 1;
                        arrayList15.add(q20);
                        o41 q21 = o41.q(-11, 34);
                        q21.v = 1;
                        arrayList15.add(q21);
                        o41 q22 = o41.q(-12, 34);
                        q22.v = 1;
                        arrayList15.add(q22);
                        o41 q23 = o41.q(-13, 34);
                        q23.v = 1;
                        arrayList15.add(q23);
                        o41 q24 = o41.q(-14, 34);
                        q24.v = 1;
                        arrayList15.add(q24);
                        o41 q25 = o41.q(-15, 34);
                        q25.v = 1;
                        arrayList15.add(q25);
                    }
                }
                k8Var.j0(arrayList15.isEmpty() && !y7Var.y);
                break;
            case 10:
                j8 j8Var = (j8) obj3;
                ArrayList arrayList17 = (ArrayList) obj;
                i8 i8Var = j8Var.U1;
                if (i8Var != null) {
                    di.p8 p8Var6 = i8Var.b;
                    y7 y7Var2 = i8Var.c;
                    if (p8Var6 != null && y7Var2 != null) {
                        int currentTime = ConnectionsManager.getInstance(j8Var.a).getCurrentTime();
                        arrayList17.add(o41.t(-1, gd.N0(2131749753, null)));
                        ArrayList arrayList18 = p8Var6.l;
                        int size8 = arrayList18.size();
                        boolean z14 = true;
                        int i44 = 0;
                        int i45 = 0;
                        while (i45 < size8) {
                            Object obj10 = arrayList18.get(i45);
                            i45++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj10;
                            boolean z15 = r5;
                            int i46 = currentTime;
                            if (j8Var.c2.contains(Long.valueOf(savedStarGift2.gift.id)) || y4.m(savedStarGift2.gift)) {
                                currentTime = i46;
                                r5 = z15;
                            } else {
                                currentTime = i46;
                                boolean z16 = savedStarGift2.can_craft_at <= currentTime ? z15 : false;
                                o41 i47 = f3.i(0, savedStarGift2.gift, false, true, false, false, true);
                                i47.g = z16;
                                arrayList17.add(i47);
                                i44++;
                                r5 = z15;
                                z14 = false;
                            }
                        }
                        boolean z17 = r5;
                        if (p8Var6.i || !p8Var6.j) {
                            int i48 = i44 % 3;
                            int i49 = 6 - i48;
                            int i50 = 0;
                            while (i50 < i49) {
                                o41 q26 = o41.q((i50 - i48) + 1, 35);
                                q26.v = z17 ? 1 : 0;
                                arrayList17.add(q26);
                                i50++;
                                z17 = true;
                            }
                        } else if (z14) {
                            arrayList17.add(o41.g(gd.N0(2131749752, null)));
                        }
                        if (y7Var2.e > 0 || j8Var.f2) {
                            j8Var.f2 = true;
                            String N05 = gd.N0(2131749755, null);
                            o41 o41Var = new o41(42);
                            o41Var.d = -2;
                            o41Var.p = N05;
                            arrayList17.add(o41Var);
                            HorizontalScrollView horizontalScrollView = j8Var.V1;
                            if (horizontalScrollView != null) {
                                arrayList17.add(o41.j(-3, horizontalScrollView));
                            }
                            ArrayList arrayList19 = y7Var2.d;
                            int size9 = arrayList19.size();
                            int i51 = 0;
                            while (i51 < size9) {
                                Object obj11 = arrayList19.get(i51);
                                i51++;
                                arrayList17.add(f3.i(0, (TL_stars.TL_starGiftUnique) obj11, false, true, false, true, true));
                            }
                            if (y7Var2.y || !y7Var2.z) {
                                o41 q27 = o41.q(10, 35);
                                q27.v = 1;
                                arrayList17.add(q27);
                                o41 q28 = o41.q(11, 35);
                                q28.v = 1;
                                arrayList17.add(q28);
                                o41 q29 = o41.q(12, 35);
                                q29.v = 1;
                                arrayList17.add(q29);
                                o41 q30 = o41.q(13, 35);
                                q30.v = 1;
                                arrayList17.add(q30);
                                o41 q31 = o41.q(14, 35);
                                q31.v = 1;
                                arrayList17.add(q31);
                                o41 q32 = o41.q(15, 35);
                                q32.v = 1;
                                arrayList17.add(q32);
                                break;
                            }
                        }
                    }
                }
                break;
            case 11:
                o8 o8Var = (o8) obj3;
                ArrayList arrayList20 = (ArrayList) obj;
                di.p8 p8Var7 = o8Var.U1;
                if (p8Var7 != null) {
                    ArrayList arrayList21 = p8Var7.l;
                    arrayList20.add(o41.D(org.telegram.messenger.g0.L(16.0f)));
                    if (p8Var7.i && arrayList21.isEmpty()) {
                        o41 q33 = o41.q(1, 34);
                        q33.v = 1;
                        arrayList20.add(q33);
                        o41 q34 = o41.q(2, 34);
                        q34.v = 1;
                        arrayList20.add(q34);
                        o41 q35 = o41.q(3, 34);
                        q35.v = 1;
                        arrayList20.add(q35);
                        o41 q36 = o41.q(4, 34);
                        q36.v = 1;
                        arrayList20.add(q36);
                        o41 q37 = o41.q(5, 34);
                        q37.v = 1;
                        arrayList20.add(q37);
                        o41 q38 = o41.q(6, 34);
                        q38.v = 1;
                        arrayList20.add(q38);
                        o41 q39 = o41.q(7, 34);
                        q39.v = 1;
                        arrayList20.add(q39);
                        o41 q40 = o41.q(8, 34);
                        q40.v = 1;
                        arrayList20.add(q40);
                        o41 q41 = o41.q(9, 34);
                        q41.v = 1;
                        arrayList20.add(q41);
                    } else {
                        int size10 = arrayList21.size();
                        int i52 = 0;
                        int i53 = 3;
                        while (i52 < size10) {
                            Object obj12 = arrayList21.get(i52);
                            i52++;
                            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj12;
                            if (!savedStarGift3.collection_id.contains(Integer.valueOf(o8Var.T1))) {
                                int i54 = f3.b;
                                o41 K8 = o41.K(f3.class);
                                K8.v = 1;
                                K8.A = z11 ? 1 : 0;
                                K8.H = savedStarGift3;
                                K8.r = true;
                                K8.f = true;
                                K8.s = z11;
                                HashSet hashSet2 = o8Var.V1;
                                int i55 = savedStarGift3.msg_id;
                                int i56 = i17;
                                ArrayList arrayList22 = arrayList21;
                                K8.L(hashSet2.contains(Long.valueOf(i55 == 0 ? savedStarGift3.saved_id : i55)));
                                K8.v = 1;
                                arrayList20.add(K8);
                                i53--;
                                if (i53 == 0) {
                                    i53 = i56;
                                }
                                arrayList21 = arrayList22;
                                i17 = i56;
                                z11 = false;
                            }
                        }
                        int i57 = i17;
                        if (p8Var7.i || !p8Var7.j) {
                            int i58 = 0;
                            while (true) {
                                if (i58 < (i53 <= 0 ? i57 : i53)) {
                                    i58++;
                                    o41 q42 = o41.q(i58, 34);
                                    q42.v = 1;
                                    arrayList20.add(q42);
                                }
                            }
                        }
                    }
                    arrayList20.add(o41.D(org.telegram.messenger.g0.L(68.0f)));
                    break;
                }
                break;
            case 12:
                ch.p pVar = (ch.p) obj3;
                ArrayList arrayList23 = (ArrayList) obj;
                ArrayList arrayList24 = pVar.G;
                org.telegram.ui.Cells.s8 s8Var = pVar.e;
                if (s8Var != null && pVar.f != null) {
                    arrayList23.add(o41.j(1, s8Var));
                    arrayList23.add(o41.l(2, pVar.f));
                    int i59 = pVar.Z;
                    if (i59 == 1 || i59 == 0 || pVar.a) {
                        for (int i60 = 0; i60 < arrayList24.size(); i60++) {
                            View view = (View) arrayList24.get(i60);
                            arrayList23.add(((Boolean) pVar.H.get(i60)).booleanValue() ? o41.l(i60 + 100, view) : o41.j(i60 + 100, view));
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
                while (i18 < size11) {
                    Object obj13 = arrayList26.get(i18);
                    i18++;
                    ((Runnable) obj13).run();
                }
                break;
            case 14:
                di.s sVar = (di.s) obj3;
                ArrayList arrayList27 = (ArrayList) obj;
                ArrayList arrayList28 = sVar.b;
                int size12 = arrayList28.size();
                int i61 = 0;
                while (i61 < size12) {
                    Object obj14 = arrayList28.get(i61);
                    i61++;
                    int i62 = jb.b;
                    o41 K9 = o41.K(jb.class);
                    K9.H = (TL_stars.StarsTransaction) obj14;
                    K9.r = true;
                    arrayList27.add(K9);
                }
                if (sVar.h) {
                    arrayList27.add(o41.e(-1, gd.N0(2131745856, null)));
                    break;
                } else if (!sVar.f) {
                    for (int i63 = 0; i63 < 3; i63++) {
                        arrayList27.add(o41.q(i63, 7));
                    }
                    break;
                }
                break;
            case 15:
                a30 a30Var = (a30) obj3;
                ArrayList arrayList29 = (ArrayList) obj;
                arrayList29.add(o41.k(a30Var.U1));
                arrayList29.add(di.g0.i(gd.N0(2131750855, null), gd.N0(2131750856, null), R.drawable.msg_gift_premium));
                arrayList29.add(di.g0.i(gd.N0(2131750853, null), org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(gd.N0(2131750854, null), new ca.r(a30Var, i16)), true), R.drawable.msg_bot));
                arrayList29.add(di.g0.i(gd.N0(2131750851, null), gd.N0(2131750852, null), R.drawable.menu_unlock));
                arrayList29.add(di.g0.i(gd.N0(2131750849, null), gd.N0(2131750850, null), R.drawable.menu_feature_paid));
                arrayList29.add(o41.D(org.telegram.messenger.g0.L(68.0f)));
                break;
            case 16:
                b(obj, obj2);
                break;
            case 17:
                q10 q10Var = (q10) obj3;
                Long l10 = (Long) obj;
                Boolean bool = (Boolean) obj2;
                if (q10Var != null) {
                    q10Var.a(l10, bool);
                    break;
                }
                break;
            case 18:
                ((pb) obj3).K0((ArrayList) obj, (c51) obj2);
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
                i5.c.s(2131743973, null, arrayList30);
                ArrayList z18 = di.y8.y(gbVar.a, false).z();
                if (z18 == null || z18.isEmpty()) {
                    arrayList30.add(o41.p(31));
                    arrayList30.add(o41.p(31));
                    arrayList30.add(o41.p(31));
                    arrayList30.add(o41.p(31));
                    arrayList30.add(o41.p(31));
                } else {
                    int i64 = 0;
                    int i65 = 1;
                    for (int i66 = 0; i66 < z18.size(); i66++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z18.get(i66);
                        if (!tL_starsTopupOption.extended || gbVar.V1) {
                            arrayList30.add(bb.i(i66, i65, tL_starsTopupOption));
                            i65++;
                        } else {
                            i64++;
                        }
                    }
                    boolean z19 = gbVar.V1;
                    if (!z19 && i64 > 0) {
                        String N06 = gd.N0(z19 ? 2131747651 : 2131747642, null);
                        boolean z20 = !gbVar.V1;
                        int i67 = wa.b;
                        o41 K10 = o41.K(wa.class);
                        K10.d = -1;
                        K10.m = N06;
                        K10.f = z20;
                        K10.r = true;
                        arrayList30.add(K10);
                    }
                }
                arrayList30.add(o41.k(gbVar.T1));
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
                hi.t1 t1Var4 = (hi.t1) obj3;
                String str2 = (String) obj;
                hi.i2 i2Var = t1Var4.r;
                i2Var.m1 = str2;
                i2Var.n1 = ((Integer) obj2).intValue();
                t1Var4.c.H(str2);
                break;
            case 26:
                h(obj, obj2);
                break;
            case 27:
                i(obj, obj2);
                break;
            case 28:
                hi.k5 k5Var = (hi.k5) obj3;
                k5Var.b0(k5Var.g0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
            default:
                ((ra) obj3).X(((Float) obj2).floatValue(), (Bitmap) obj);
                break;
        }
    }
}
