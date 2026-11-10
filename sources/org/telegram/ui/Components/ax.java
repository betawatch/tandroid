package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.z91;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ax implements org.telegram.messenger.a20, org.telegram.ui.ActionBar.r1, jg.y1, te.b, org.telegram.messenger.k9, p70, gd0, dj0, org.telegram.ui.tw, di.h7, org.telegram.messenger.wr, x61, org.telegram.messenger.pc, vt0, org.telegram.messenger.lc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ax(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.tw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.tw
    public /* synthetic */ boolean N(org.telegram.ui.zw zwVar) {
        return false;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h X0() {
        return null;
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        ((v80) this.b).c0();
    }

    @Override // org.telegram.messenger.wr
    public void a(String str) {
        di.z6 storiesController;
        switch (this.a) {
            case 20:
                ys0 ys0Var = ((xp0) this.b).d;
                storiesController = ys0Var.getStoriesController();
                storiesController.r(ys0Var.l1, str, new ro0(ys0Var, 1));
                break;
            default:
                v21 v21Var = (v21) this.b;
                v21Var.Z1 = str;
                v21Var.e2.O(true);
                break;
        }
    }

    @Override // di.h7
    public void b(boolean z9) {
        di.r6 r6Var = (di.r6) this.b;
        if (z9) {
            r6Var.p(30, false);
        }
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        qh0 qh0Var;
        switch (this.a) {
            case 15:
                rh0 rh0Var = (rh0) this.b;
                ArrayList arrayList = rh0Var.n;
                if (rh0Var.f.d(i7) != 0 || (qh0Var = rh0Var.F) == null) {
                    return true;
                }
                qh0Var.d(org.telegram.messenger.ij.B1(((TLRPC.MessagePeerReaction) arrayList.get(i7)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i7));
                return true;
            default:
                dl0 dl0Var = (dl0) this.b;
                bi.k5 k5Var = dl0Var.c;
                org.telegram.messenger.ij E = k5Var.E(i7);
                dl0 dl0Var2 = (dl0) k5Var.d;
                if (E == null) {
                    return false;
                }
                if (!dl0Var.I.i()) {
                    dl0Var.I.e();
                    k5Var.k(0, dl0Var2.r);
                }
                if (dl0Var.I.i()) {
                    dl0Var.I.h(E, view, 0);
                    if (!dl0Var.I.i()) {
                        k5Var.k(0, dl0Var2.r);
                    }
                    org.telegram.ui.uz uzVar = dl0Var.J;
                    int e12 = E.e1();
                    uzVar.a = org.telegram.messenger.ij.B0(E.k);
                    uzVar.b = e12;
                }
                return true;
        }
    }

    @Override // org.telegram.ui.Components.p70
    public void e() {
        ((mc0) this.b).K0(true);
    }

    @Override // org.telegram.messenger.lc
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        boolean z12;
        y51 y51Var;
        int i7;
        int i10;
        double ceil;
        z51 z51Var = (z51) this.b;
        ImageReceiver imageReceiver2 = z51Var.Q;
        if (z9) {
            if (z51Var.N == null && z51Var.d0 == null) {
                return;
            }
            int L = org.telegram.messenger.g0.L(150.0f);
            org.telegram.ui.fq0 fq0Var = z51Var.N;
            if (fq0Var != null) {
                int i11 = (int) z51Var.O;
                ArrayList arrayList = fq0Var.w;
                int indexOf = arrayList.indexOf(fq0Var.c(i11));
                if (indexOf == -1) {
                    z12 = true;
                    i10 = 0;
                } else if (indexOf == arrayList.size() - 1) {
                    int videoDuration = fq0Var.getVideoDuration() / 1000;
                    if (videoDuration <= 100) {
                        z12 = true;
                        ceil = Math.ceil(videoDuration);
                    } else {
                        z12 = true;
                        ceil = videoDuration <= 250 ? Math.ceil(videoDuration / 2.0f) : videoDuration <= 500 ? Math.ceil(videoDuration / 4.0f) : videoDuration <= 1000 ? Math.ceil(videoDuration / 5.0f) : Math.ceil(videoDuration / 10.0f);
                    }
                    i10 = Math.min(25, (((int) ceil) - ((arrayList.size() - 1) * 25)) + 1);
                } else {
                    z12 = true;
                    i10 = 25;
                }
                float q10 = imageReceiver2.q() / Math.min(i10, 5);
                float o4 = imageReceiver2.o() / ((int) Math.ceil(i10 / 5.0f));
                org.telegram.ui.fq0 fq0Var2 = z51Var.N;
                int i12 = (int) z51Var.O;
                int videoDuration2 = fq0Var2.getVideoDuration() / 1000;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i12)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i12 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i12 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i12 / 5.0f)) % 25 : ((int) Math.ceil(i12 / 10.0f)) % 25, i10 - 1);
                z51Var.R = (int) ((min % 5) * q10);
                z51Var.S = (int) ((min / 5) * o4);
                z51Var.T = (int) q10;
                z51Var.U = (int) o4;
            } else {
                z12 = true;
                int i13 = 0;
                while (true) {
                    if (i13 >= z51Var.d0.size()) {
                        y51Var = null;
                        break;
                    }
                    y51Var = (y51) z51Var.d0.get(i13);
                    double d = i13 == 0 ? 0.0d : y51Var.a;
                    double d2 = i13 == z51Var.d0.size() + (-1) ? 9.9999999E7d : ((y51) z51Var.d0.get(i13 + 1)).a;
                    double d10 = z51Var.O;
                    if (d10 >= d && d10 <= d2) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (y51Var == null) {
                    return;
                }
                z51Var.R = y51Var.b;
                z51Var.S = y51Var.c;
                z51Var.T = z51Var.b0;
                z51Var.U = z51Var.c0;
            }
            z51Var.P = z12;
            float f10 = z51Var.T / z51Var.U;
            if (f10 > 1.0f) {
                i7 = (int) (L / f10);
            } else {
                L = (int) (L * f10);
                i7 = L;
            }
            ViewGroup.LayoutParams layoutParams = z51Var.getLayoutParams();
            if (z51Var.getVisibility() == 0 && layoutParams.width == L && layoutParams.height == i7) {
                return;
            }
            layoutParams.width = L;
            layoutParams.height = i7;
            z51Var.setVisibility(0);
            z51Var.requestLayout();
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(((xx) this.b).w.c1);
                b02.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new org.telegram.messenger.ih(b02, 1));
                break;
            case 3:
                ((org.telegram.ui.q8) this.b).run();
                break;
            case 4:
                ((d10) this.b).J0();
                break;
            case 6:
                x50 x50Var = (x50) this.b;
                a0.h hVar = x50Var.Z1;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    arrayList.add(org.telegram.messenger.qp.s1(x50Var.a).a2(Long.valueOf(hVar.j(i10))));
                }
                org.telegram.ui.u40 u40Var = x50Var.f2;
                if (u40Var != null) {
                    u40Var.f(0, arrayList);
                }
                x50Var.dismiss();
                break;
            case 22:
                aw0 aw0Var = (aw0) this.b;
                aw0Var.e.presentFragment(new StickersActivity(aw0Var.d, null));
                u1Var.dismiss();
                break;
            default:
                org.telegram.messenger.g0.v1((bw0) this.b);
                u1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.x61
    public void h(int i7, int i10) {
        st0 st0Var = (st0) this.b;
        st0Var.x = i7;
        st0Var.y = i10;
        bi.ec ecVar = st0Var.L;
        if (ecVar != null) {
            ecVar.invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025d  */
    @Override // org.telegram.messenger.a20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        TLRPC.StickerSet stickerSet;
        int childCount;
        int i7;
        long j3;
        TLRPC.Document document;
        ArrayList arrayList;
        TLRPC.StickerSet stickerSet2;
        int childCount2;
        int i10;
        long j10;
        TLRPC.Document document2;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                gx gxVar = (gx) this.b;
                x31 x31Var = (x31) obj;
                View view = (View) obj2;
                bx bxVar = gxVar.c;
                gy gyVar = gxVar.F;
                Object obj3 = x31Var.G;
                if (obj3 instanceof TLRPC.StickerSetCovered) {
                    yw ywVar = (yw) x31Var.H;
                    long j11 = gxVar.d;
                    stickerSet = ((TLRPC.StickerSetCovered) obj3).set;
                    long j12 = stickerSet.id;
                    if (j11 == j12) {
                        gxVar.d = 0L;
                        stickerSet = null;
                        childCount = bxVar.getChildCount();
                        for (i7 = 0; i7 < childCount; i7++) {
                            ph.b bVar = (ph.b) bxVar.getChildAt(i7);
                            if (bVar != view) {
                                bVar.a(false, true);
                            }
                        }
                        if (gxVar.d != 0 || gxVar.f.size() >= gxVar.e.count) {
                            j3 = 0;
                        } else {
                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(gyVar.c1);
                            TLRPC.StickerSet stickerSet3 = gxVar.e;
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            j3 = 0;
                            tL_inputStickerSetID.id = stickerSet3.id;
                            tL_inputStickerSetID.access_hash = stickerSet3.access_hash;
                            TLRPC.TL_messages_stickerSet m0 = b02.m0(tL_inputStickerSetID, false);
                            if (m0 != null) {
                                gxVar.f = m0.documents;
                            }
                        }
                        TLObject tLObject = (TLObject) x31Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet4 = stickerSet;
                        ph.a aVar = gyVar.L;
                        te.a aVar2 = gyVar.b;
                        arrayList = gxVar.f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            document = (TLRPC.Document) gxVar.f.get(0);
                        }
                        gyVar.J(aVar, tLObject, stickerSet4, document, true, aVar2.e <= 0.0f);
                        ((ph.b) view).a(gxVar.d == j3, true);
                        aVar2.a(gxVar.d != j3, true);
                        gxVar.f();
                        gyVar.V.b();
                        if (gxVar.d == j3) {
                            bxVar.L1(view);
                            break;
                        }
                    } else {
                        gxVar.d = j12;
                        gxVar.f = ywVar.d;
                        gxVar.e = stickerSet;
                        childCount = bxVar.getChildCount();
                        while (i7 < childCount) {
                        }
                        if (gxVar.d != 0) {
                        }
                        j3 = 0;
                        TLObject tLObject2 = (TLObject) x31Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet42 = stickerSet;
                        ph.a aVar3 = gyVar.L;
                        te.a aVar22 = gyVar.b;
                        arrayList = gxVar.f;
                        if (arrayList != null) {
                            document = (TLRPC.Document) gxVar.f.get(0);
                        }
                        gyVar.J(aVar3, tLObject2, stickerSet42, document, true, aVar22.e <= 0.0f);
                        ((ph.b) view).a(gxVar.d == j3, true);
                        aVar22.a(gxVar.d != j3, true);
                        gxVar.f();
                        gyVar.V.b();
                        if (gxVar.d == j3) {
                        }
                    }
                } else {
                    if (obj3 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
                        long j13 = gxVar.d;
                        TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet.set;
                        long j14 = stickerSet5.id;
                        if (j13 == j14) {
                            gxVar.d = 0L;
                        } else {
                            gxVar.d = j14;
                            gxVar.f = tL_messages_stickerSet.documents;
                            gxVar.e = stickerSet5;
                            stickerSet = stickerSet5;
                            childCount = bxVar.getChildCount();
                            while (i7 < childCount) {
                            }
                            if (gxVar.d != 0) {
                            }
                            j3 = 0;
                            TLObject tLObject22 = (TLObject) x31Var.G;
                            document = null;
                            TLRPC.StickerSet stickerSet422 = stickerSet;
                            ph.a aVar32 = gyVar.L;
                            te.a aVar222 = gyVar.b;
                            arrayList = gxVar.f;
                            if (arrayList != null) {
                            }
                            gyVar.J(aVar32, tLObject22, stickerSet422, document, true, aVar222.e <= 0.0f);
                            ((ph.b) view).a(gxVar.d == j3, true);
                            aVar222.a(gxVar.d != j3, true);
                            gxVar.f();
                            gyVar.V.b();
                            if (gxVar.d == j3) {
                            }
                        }
                    }
                    stickerSet = null;
                    childCount = bxVar.getChildCount();
                    while (i7 < childCount) {
                    }
                    if (gxVar.d != 0) {
                    }
                    j3 = 0;
                    TLObject tLObject222 = (TLObject) x31Var.G;
                    document = null;
                    TLRPC.StickerSet stickerSet4222 = stickerSet;
                    ph.a aVar322 = gyVar.L;
                    te.a aVar2222 = gyVar.b;
                    arrayList = gxVar.f;
                    if (arrayList != null) {
                    }
                    gyVar.J(aVar322, tLObject222, stickerSet4222, document, true, aVar2222.e <= 0.0f);
                    ((ph.b) view).a(gxVar.d == j3, true);
                    aVar2222.a(gxVar.d != j3, true);
                    gxVar.f();
                    gyVar.V.b();
                    if (gxVar.d == j3) {
                    }
                }
                break;
            case 2:
                ay ayVar = (ay) this.b;
                x31 x31Var2 = (x31) obj;
                View view2 = (View) obj2;
                bx bxVar2 = ayVar.c;
                gy gyVar2 = ayVar.Q;
                Object obj4 = x31Var2.G;
                if (obj4 instanceof TLRPC.StickerSetCovered) {
                    yw ywVar2 = (yw) x31Var2.H;
                    long j15 = ayVar.d;
                    stickerSet2 = ((TLRPC.StickerSetCovered) obj4).set;
                    long j16 = stickerSet2.id;
                    if (j15 == j16) {
                        ayVar.d = 0L;
                        stickerSet2 = null;
                        childCount2 = bxVar2.getChildCount();
                        for (i10 = 0; i10 < childCount2; i10++) {
                            ph.b bVar2 = (ph.b) bxVar2.getChildAt(i10);
                            if (bVar2 != view2) {
                                bVar2.a(false, true);
                            }
                        }
                        if (ayVar.d != 0 || ayVar.f.size() >= ayVar.e.count) {
                            j10 = 0;
                        } else {
                            org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(gyVar2.c1);
                            TLRPC.StickerSet stickerSet6 = ayVar.e;
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            j10 = 0;
                            tL_inputStickerSetID2.id = stickerSet6.id;
                            tL_inputStickerSetID2.access_hash = stickerSet6.access_hash;
                            TLRPC.TL_messages_stickerSet m02 = b03.m0(tL_inputStickerSetID2, false);
                            if (m02 != null) {
                                ayVar.f = m02.documents;
                            }
                        }
                        TLObject tLObject3 = (TLObject) x31Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet7 = stickerSet2;
                        ph.a aVar4 = gyVar2.N;
                        te.a aVar5 = gyVar2.a;
                        arrayList2 = ayVar.f;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            document2 = (TLRPC.Document) ayVar.f.get(0);
                        }
                        gyVar2.J(aVar4, tLObject3, stickerSet7, document2, false, aVar5.e <= 0.0f);
                        ((ph.b) view2).a(ayVar.d == j10, true);
                        aVar5.a(ayVar.d != j10, true);
                        ayVar.f();
                        gyVar2.G0.b();
                        if (ayVar.d == j10) {
                            bxVar2.L1(view2);
                            break;
                        }
                    } else {
                        ayVar.d = j16;
                        ayVar.f = ywVar2.d;
                        ayVar.e = stickerSet2;
                        childCount2 = bxVar2.getChildCount();
                        while (i10 < childCount2) {
                        }
                        if (ayVar.d != 0) {
                        }
                        j10 = 0;
                        TLObject tLObject32 = (TLObject) x31Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet72 = stickerSet2;
                        ph.a aVar42 = gyVar2.N;
                        te.a aVar52 = gyVar2.a;
                        arrayList2 = ayVar.f;
                        if (arrayList2 != null) {
                            document2 = (TLRPC.Document) ayVar.f.get(0);
                        }
                        gyVar2.J(aVar42, tLObject32, stickerSet72, document2, false, aVar52.e <= 0.0f);
                        ((ph.b) view2).a(ayVar.d == j10, true);
                        aVar52.a(ayVar.d != j10, true);
                        ayVar.f();
                        gyVar2.G0.b();
                        if (ayVar.d == j10) {
                        }
                    }
                } else {
                    if (obj4 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj4;
                        long j17 = ayVar.d;
                        TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet2.set;
                        long j18 = stickerSet8.id;
                        if (j17 == j18) {
                            ayVar.d = 0L;
                        } else {
                            ayVar.d = j18;
                            ayVar.f = tL_messages_stickerSet2.documents;
                            ayVar.e = stickerSet8;
                            stickerSet2 = stickerSet8;
                            childCount2 = bxVar2.getChildCount();
                            while (i10 < childCount2) {
                            }
                            if (ayVar.d != 0) {
                            }
                            j10 = 0;
                            TLObject tLObject322 = (TLObject) x31Var2.G;
                            document2 = null;
                            TLRPC.StickerSet stickerSet722 = stickerSet2;
                            ph.a aVar422 = gyVar2.N;
                            te.a aVar522 = gyVar2.a;
                            arrayList2 = ayVar.f;
                            if (arrayList2 != null) {
                            }
                            gyVar2.J(aVar422, tLObject322, stickerSet722, document2, false, aVar522.e <= 0.0f);
                            ((ph.b) view2).a(ayVar.d == j10, true);
                            aVar522.a(ayVar.d != j10, true);
                            ayVar.f();
                            gyVar2.G0.b();
                            if (ayVar.d == j10) {
                            }
                        }
                    }
                    stickerSet2 = null;
                    childCount2 = bxVar2.getChildCount();
                    while (i10 < childCount2) {
                    }
                    if (ayVar.d != 0) {
                    }
                    j10 = 0;
                    TLObject tLObject3222 = (TLObject) x31Var2.G;
                    document2 = null;
                    TLRPC.StickerSet stickerSet7222 = stickerSet2;
                    ph.a aVar4222 = gyVar2.N;
                    te.a aVar5222 = gyVar2.a;
                    arrayList2 = ayVar.f;
                    if (arrayList2 != null) {
                    }
                    gyVar2.J(aVar4222, tLObject3222, stickerSet7222, document2, false, aVar5222.e <= 0.0f);
                    ((ph.b) view2).a(ayVar.d == j10, true);
                    aVar5222.a(ayVar.d != j10, true);
                    ayVar.f();
                    gyVar2.G0.b();
                    if (ayVar.d == j10) {
                    }
                }
                break;
            case 12:
                ze0 ze0Var = (ze0) this.b;
                Object obj5 = ((x31) obj).G;
                if (obj5 instanceof org.telegram.messenger.ij) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj5;
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.ij.B0(ijVar.k) >= 0) {
                        bundle.putLong("user_id", org.telegram.messenger.ij.B0(ijVar.k));
                    } else {
                        bundle.putLong("chat_id", -org.telegram.messenger.ij.B0(ijVar.k));
                    }
                    bundle.putInt("message_id", ijVar.e1());
                    org.telegram.ui.cn cnVar = new org.telegram.ui.cn(bundle);
                    org.telegram.ui.zw zwVar = ze0Var.a;
                    org.telegram.ui.zw.p4(cnVar, ijVar);
                    zwVar.presentFragment(cnVar);
                    break;
                }
                break;
            default:
                pj0 pj0Var = (pj0) this.b;
                Canvas canvas = (Canvas) obj;
                RectF rectF = (RectF) obj2;
                float floatValue = ((Float) number).floatValue();
                float floatValue2 = ((Float) serializable).floatValue();
                float floatValue3 = ((Float) serializable2).floatValue();
                org.telegram.ui.ActionBar.h6 h6Var = pj0Var.n2;
                Paint paint = pj0.b3;
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                paint.setColor(org.telegram.ui.ActionBar.m6.r1(floatValue3, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, h6Var)));
                if (floatValue > 0.0f || floatValue2 > 0.0f) {
                    if (floatValue == floatValue2) {
                        canvas.drawRoundRect(rectF, floatValue, floatValue, paint);
                        break;
                    } else {
                        Path path = pj0.c3;
                        path.rewind();
                        float[] fArr = pj0.d3;
                        fArr[3] = floatValue;
                        fArr[2] = floatValue;
                        fArr[1] = floatValue;
                        fArr[0] = floatValue;
                        fArr[7] = floatValue2;
                        fArr[6] = floatValue2;
                        fArr[5] = floatValue2;
                        fArr[4] = floatValue2;
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas.drawPath(path, paint);
                        break;
                    }
                } else {
                    canvas.drawRect(rectF, paint);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.k9
    public Object j(Object obj) {
        return Float.valueOf(((r1.f) this.b).a / 100.0f);
    }

    @Override // jg.y1
    public /* synthetic */ boolean k1(int i7) {
        return true;
    }

    @Override // org.telegram.ui.Components.gd0
    public void l(int i7, int i10) {
        sd0 sd0Var = (sd0) ((org.telegram.ui.l4) this.b).e;
        if (i7 == sd0Var.b) {
            sd0Var.G = i10;
        } else if (i7 == sd0Var.r) {
            sd0Var.P = i10;
        } else if (i7 == sd0Var.d) {
            sd0Var.I = i10;
        } else if (i7 == sd0Var.c) {
            sd0Var.H = i10;
        } else if (i7 == sd0Var.f) {
            sd0Var.J = i10;
        } else if (i7 == sd0Var.e) {
            sd0Var.K = i10;
        } else if (i7 == sd0Var.w) {
            sd0Var.R = i10;
        } else if (i7 == sd0Var.s) {
            sd0Var.Q = i10;
        } else if (i7 == sd0Var.x) {
            sd0Var.S = i10;
        } else if (i7 == sd0Var.y) {
            sd0Var.U = i10;
        } else if (i7 == sd0Var.h) {
            sd0Var.L = i10;
        } else if (i7 == sd0Var.n) {
            sd0Var.M = i10;
        }
        ry ryVar = sd0Var.l0;
        if (ryVar != null) {
            ryVar.c(true, false, false);
        }
        sd0Var.d();
    }

    @Override // org.telegram.ui.Components.vt0
    public void m(int i7) {
        org.telegram.messenger.c20 c20Var = ((x31) this.b).C;
        if (c20Var != null) {
            c20Var.a(Integer.valueOf(i7));
        }
    }

    @Override // jg.y1
    public void q(int i7) {
        s50 s50Var = (s50) this.b;
        x50 x50Var = s50Var.n;
        x50Var.O0(s50Var.f - 1);
        if (s50Var.h == null && !s50Var.e.e() && s50Var.b() <= 2) {
            x50Var.t1.e(false, true);
        }
        s50Var.f();
    }

    @Override // jg.y1
    public /* synthetic */ a0.h v0() {
        return null;
    }

    @Override // org.telegram.ui.tw
    public boolean y(org.telegram.ui.zw zwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, z91 z91Var) {
        fm0 fm0Var = (fm0) this.b;
        int i11 = fm0Var.J0;
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = fm0Var.B0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((org.telegram.messenger.ij) hashMap.get((org.telegram.ui.uz) it.next()));
        }
        hashMap.clear();
        fm0Var.R(false);
        boolean z11 = true;
        if (arrayList.size() > 1 || ((org.telegram.messenger.xr) arrayList.get(0)).a == org.telegram.messenger.p10.i(org.telegram.messenger.c.a(i11).a).e() || charSequence != null) {
            int i12 = 0;
            while (i12 < arrayList.size()) {
                long j3 = ((org.telegram.messenger.xr) arrayList.get(i12)).a;
                if (charSequence != null) {
                    org.telegram.messenger.gz.C(org.telegram.messenger.c.a(i11).a).r0(org.telegram.messenger.ez.b(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                org.telegram.messenger.gz.C(org.telegram.messenger.c.a(i11).a).q0(arrayList2, j3, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                i12++;
                z11 = z11;
            }
            boolean z12 = z11;
            zwVar.finishFragment();
            return z12;
        }
        long j10 = ((org.telegram.messenger.xr) arrayList.get(0)).a;
        Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
        if (org.telegram.messenger.m5.C(j10)) {
            k10.putInt("enc_id", (int) (4294967295L & j10));
        } else {
            if (org.telegram.messenger.m5.E(j10)) {
                k10.putLong("user_id", j10);
            } else {
                k10.putLong("chat_id", -j10);
            }
            if (!org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(i11).a).E(k10, zwVar, null, null)) {
                return true;
            }
        }
        org.telegram.ui.cn cnVar = new org.telegram.ui.cn(k10);
        zwVar.presentFragment(cnVar, true);
        cnVar.gc(arrayList2);
        return true;
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void O(ImageReceiver imageReceiver) {
    }

    @Override // jg.y1
    public /* synthetic */ void m1(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.p70
    public /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.p70
    public /* synthetic */ void f() {
    }

    @Override // org.telegram.ui.Components.p70
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Components.vt0
    public /* synthetic */ void n() {
    }

    @Override // te.b
    public /* synthetic */ void F(float f10, int i7) {
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void t0(int i7, Drawable drawable) {
    }
}
