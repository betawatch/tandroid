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
import org.telegram.ui.u91;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class gx implements org.telegram.messenger.x10, org.telegram.ui.ActionBar.q1, jg.y1, te.b, org.telegram.messenger.j9, s70, hd0, ij0, org.telegram.ui.sw, fi.a7, org.telegram.messenger.tr, y61, org.telegram.messenger.oc, vt0, org.telegram.messenger.kc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gx(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // te.b
    public void G(int i7, float f10, float f11, te.c cVar) {
        ((y80) this.b).c0();
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.messenger.kc
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        z51 z51Var;
        int i7;
        int i10;
        double ceil;
        a61 a61Var = (a61) this.b;
        ImageReceiver imageReceiver2 = a61Var.R;
        if (z10) {
            if (a61Var.O == null && a61Var.e0 == null) {
                return;
            }
            int L = org.telegram.messenger.g0.L(150.0f);
            org.telegram.ui.bq0 bq0Var = a61Var.O;
            if (bq0Var != null) {
                int i11 = (int) a61Var.P;
                ArrayList arrayList = bq0Var.w;
                int indexOf = arrayList.indexOf(bq0Var.c(i11));
                if (indexOf == -1) {
                    z13 = true;
                    i10 = 0;
                } else if (indexOf == arrayList.size() - 1) {
                    int videoDuration = bq0Var.getVideoDuration() / 1000;
                    if (videoDuration <= 100) {
                        z13 = true;
                        ceil = Math.ceil(videoDuration);
                    } else {
                        z13 = true;
                        ceil = videoDuration <= 250 ? Math.ceil(videoDuration / 2.0f) : videoDuration <= 500 ? Math.ceil(videoDuration / 4.0f) : videoDuration <= 1000 ? Math.ceil(videoDuration / 5.0f) : Math.ceil(videoDuration / 10.0f);
                    }
                    i10 = Math.min(25, (((int) ceil) - ((arrayList.size() - 1) * 25)) + 1);
                } else {
                    z13 = true;
                    i10 = 25;
                }
                float q10 = imageReceiver2.q() / Math.min(i10, 5);
                float o4 = imageReceiver2.o() / ((int) Math.ceil(i10 / 5.0f));
                org.telegram.ui.bq0 bq0Var2 = a61Var.O;
                int i12 = (int) a61Var.P;
                int videoDuration2 = bq0Var2.getVideoDuration() / 1000;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i12)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i12 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i12 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i12 / 5.0f)) % 25 : ((int) Math.ceil(i12 / 10.0f)) % 25, i10 - 1);
                a61Var.S = (int) ((min % 5) * q10);
                a61Var.T = (int) ((min / 5) * o4);
                a61Var.U = (int) q10;
                a61Var.V = (int) o4;
            } else {
                z13 = true;
                int i13 = 0;
                while (true) {
                    if (i13 >= a61Var.e0.size()) {
                        z51Var = null;
                        break;
                    }
                    z51Var = (z51) a61Var.e0.get(i13);
                    double d = i13 == 0 ? 0.0d : z51Var.a;
                    double d2 = i13 == a61Var.e0.size() + (-1) ? 9.9999999E7d : ((z51) a61Var.e0.get(i13 + 1)).a;
                    double d10 = a61Var.P;
                    if (d10 >= d && d10 <= d2) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (z51Var == null) {
                    return;
                }
                a61Var.S = z51Var.b;
                a61Var.T = z51Var.c;
                a61Var.U = a61Var.c0;
                a61Var.V = a61Var.d0;
            }
            a61Var.Q = z13;
            float f10 = a61Var.U / a61Var.V;
            if (f10 > 1.0f) {
                i7 = (int) (L / f10);
            } else {
                L = (int) (L * f10);
                i7 = L;
            }
            ViewGroup.LayoutParams layoutParams = a61Var.getLayoutParams();
            if (a61Var.getVisibility() == 0 && layoutParams.width == L && layoutParams.height == i7) {
                return;
            }
            layoutParams.width = L;
            layoutParams.height = i7;
            a61Var.setVisibility(0);
            a61Var.requestLayout();
        }
    }

    @Override // jg.y1
    public /* synthetic */ a0.h K() {
        return null;
    }

    @Override // org.telegram.ui.sw
    public /* synthetic */ boolean P(org.telegram.ui.yw ywVar) {
        return false;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h U() {
        return null;
    }

    @Override // org.telegram.messenger.tr
    public void a(String str) {
        fi.s6 storiesController;
        switch (this.a) {
            case 20:
                ys0 ys0Var = ((yp0) this.b).d;
                storiesController = ys0Var.getStoriesController();
                storiesController.r(ys0Var.m1, str, new vo0(ys0Var, 1));
                break;
            default:
                a31 a31Var = (a31) this.b;
                a31Var.a2 = str;
                a31Var.f2.O(true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        uh0 uh0Var;
        switch (this.a) {
            case 15:
                vh0 vh0Var = (vh0) this.b;
                ArrayList arrayList = vh0Var.n;
                if (vh0Var.f.d(i7) != 0 || (uh0Var = vh0Var.G) == null) {
                    return true;
                }
                uh0Var.a(org.telegram.messenger.gj.B1(((TLRPC.MessagePeerReaction) arrayList.get(i7)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i7));
                return true;
            default:
                il0 il0Var = (il0) this.b;
                di.i4 i4Var = il0Var.c;
                org.telegram.messenger.gj E = i4Var.E(i7);
                il0 il0Var2 = (il0) i4Var.d;
                if (E == null) {
                    return false;
                }
                if (!il0Var.J.g0()) {
                    il0Var.J.j();
                    i4Var.k(0, il0Var2.r);
                }
                if (il0Var.J.g0()) {
                    il0Var.J.M(E, view, 0);
                    if (!il0Var.J.g0()) {
                        i4Var.k(0, il0Var2.r);
                    }
                    org.telegram.ui.sz szVar = il0Var.K;
                    int e12 = E.e1();
                    szVar.a = org.telegram.messenger.gj.B0(E.k);
                    szVar.b = e12;
                }
                return true;
        }
    }

    @Override // fi.a7
    public void c(boolean z10) {
        fi.k6 k6Var = (fi.k6) this.b;
        if (z10) {
            k6Var.p(30, false);
        }
    }

    @Override // org.telegram.ui.Components.s70
    public void e() {
        ((nc0) this.b).K0(true);
    }

    @Override // jg.y1
    public /* synthetic */ boolean e0(int i7) {
        return true;
    }

    @Override // org.telegram.ui.Components.y61
    public void g(int i7, int i10) {
        st0 st0Var = (st0) this.b;
        st0Var.x = i7;
        st0Var.y = i10;
        bi.o2 o2Var = st0Var.M;
        if (o2Var != null) {
            o2Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(((dy) this.b).w.d1);
                b02.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new org.telegram.messenger.gh(b02, 1));
                break;
            case 3:
                ((org.telegram.ui.f0) this.b).run();
                break;
            case 4:
                ((h10) this.b).J0();
                break;
            case 6:
                a60 a60Var = (a60) this.b;
                a0.h hVar = a60Var.a2;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    arrayList.add(org.telegram.messenger.np.s1(a60Var.a).a2(Long.valueOf(hVar.j(i10))));
                }
                org.telegram.ui.r40 r40Var = a60Var.g2;
                if (r40Var != null) {
                    r40Var.i(0, arrayList);
                }
                a60Var.dismiss();
                break;
            case 22:
                dw0 dw0Var = (dw0) this.b;
                dw0Var.e.presentFragment(new StickersActivity(dw0Var.d, null));
                t1Var.dismiss();
                break;
            default:
                org.telegram.messenger.g0.v1((ew0) this.b);
                t1Var.dismiss();
                break;
        }
    }

    @Override // jg.y1
    public void i(int i7) {
        v50 v50Var = (v50) this.b;
        a60 a60Var = v50Var.n;
        a60Var.O0(v50Var.f - 1);
        if (v50Var.h == null && !v50Var.e.e() && v50Var.b() <= 2) {
            a60Var.u1.e(false, true);
        }
        v50Var.f();
    }

    @Override // org.telegram.ui.Components.hd0
    public void k(int i7, int i10) {
        td0 td0Var = (td0) ((org.telegram.ui.l4) this.b).e;
        if (i7 == td0Var.b) {
            td0Var.H = i10;
        } else if (i7 == td0Var.r) {
            td0Var.Q = i10;
        } else if (i7 == td0Var.d) {
            td0Var.J = i10;
        } else if (i7 == td0Var.c) {
            td0Var.I = i10;
        } else if (i7 == td0Var.f) {
            td0Var.K = i10;
        } else if (i7 == td0Var.e) {
            td0Var.L = i10;
        } else if (i7 == td0Var.w) {
            td0Var.S = i10;
        } else if (i7 == td0Var.s) {
            td0Var.R = i10;
        } else if (i7 == td0Var.x) {
            td0Var.T = i10;
        } else if (i7 == td0Var.y) {
            td0Var.V = i10;
        } else if (i7 == td0Var.h) {
            td0Var.M = i10;
        } else if (i7 == td0Var.n) {
            td0Var.N = i10;
        }
        wy wyVar = td0Var.m0;
        if (wyVar != null) {
            wyVar.c(true, false, false);
        }
        td0Var.e();
    }

    @Override // org.telegram.ui.Components.vt0
    public void l(int i7) {
        org.telegram.messenger.z10 z10Var = ((b41) this.b).C;
        if (z10Var != null) {
            z10Var.a(Integer.valueOf(i7));
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
    @Override // org.telegram.messenger.x10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
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
                lx lxVar = (lx) this.b;
                b41 b41Var = (b41) obj;
                View view = (View) obj2;
                hx hxVar = lxVar.c;
                ly lyVar = lxVar.G;
                Object obj3 = b41Var.G;
                if (obj3 instanceof TLRPC.StickerSetCovered) {
                    ex exVar = (ex) b41Var.H;
                    long j11 = lxVar.d;
                    stickerSet = ((TLRPC.StickerSetCovered) obj3).set;
                    long j12 = stickerSet.id;
                    if (j11 == j12) {
                        lxVar.d = 0L;
                        stickerSet = null;
                        childCount = hxVar.getChildCount();
                        for (i7 = 0; i7 < childCount; i7++) {
                            ph.b bVar = (ph.b) hxVar.getChildAt(i7);
                            if (bVar != view) {
                                bVar.a(false, true);
                            }
                        }
                        if (lxVar.d != 0 || lxVar.f.size() >= lxVar.e.count) {
                            j3 = 0;
                        } else {
                            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(lyVar.d1);
                            TLRPC.StickerSet stickerSet3 = lxVar.e;
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            j3 = 0;
                            tL_inputStickerSetID.id = stickerSet3.id;
                            tL_inputStickerSetID.access_hash = stickerSet3.access_hash;
                            TLRPC.TL_messages_stickerSet m0 = b02.m0(tL_inputStickerSetID, false);
                            if (m0 != null) {
                                lxVar.f = m0.documents;
                            }
                        }
                        TLObject tLObject = (TLObject) b41Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet4 = stickerSet;
                        ph.a aVar = lyVar.M;
                        te.a aVar2 = lyVar.b;
                        arrayList = lxVar.f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            document = (TLRPC.Document) lxVar.f.get(0);
                        }
                        lyVar.K(aVar, tLObject, stickerSet4, document, true, aVar2.e <= 0.0f);
                        ((ph.b) view).a(lxVar.d == j3, true);
                        aVar2.a(lxVar.d != j3, true);
                        lxVar.f();
                        lyVar.W.b();
                        if (lxVar.d == j3) {
                            hxVar.L1(view);
                            break;
                        }
                    } else {
                        lxVar.d = j12;
                        lxVar.f = exVar.d;
                        lxVar.e = stickerSet;
                        childCount = hxVar.getChildCount();
                        while (i7 < childCount) {
                        }
                        if (lxVar.d != 0) {
                        }
                        j3 = 0;
                        TLObject tLObject2 = (TLObject) b41Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet42 = stickerSet;
                        ph.a aVar3 = lyVar.M;
                        te.a aVar22 = lyVar.b;
                        arrayList = lxVar.f;
                        if (arrayList != null) {
                            document = (TLRPC.Document) lxVar.f.get(0);
                        }
                        lyVar.K(aVar3, tLObject2, stickerSet42, document, true, aVar22.e <= 0.0f);
                        ((ph.b) view).a(lxVar.d == j3, true);
                        aVar22.a(lxVar.d != j3, true);
                        lxVar.f();
                        lyVar.W.b();
                        if (lxVar.d == j3) {
                        }
                    }
                } else {
                    if (obj3 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
                        long j13 = lxVar.d;
                        TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet.set;
                        long j14 = stickerSet5.id;
                        if (j13 == j14) {
                            lxVar.d = 0L;
                        } else {
                            lxVar.d = j14;
                            lxVar.f = tL_messages_stickerSet.documents;
                            lxVar.e = stickerSet5;
                            stickerSet = stickerSet5;
                            childCount = hxVar.getChildCount();
                            while (i7 < childCount) {
                            }
                            if (lxVar.d != 0) {
                            }
                            j3 = 0;
                            TLObject tLObject22 = (TLObject) b41Var.G;
                            document = null;
                            TLRPC.StickerSet stickerSet422 = stickerSet;
                            ph.a aVar32 = lyVar.M;
                            te.a aVar222 = lyVar.b;
                            arrayList = lxVar.f;
                            if (arrayList != null) {
                            }
                            lyVar.K(aVar32, tLObject22, stickerSet422, document, true, aVar222.e <= 0.0f);
                            ((ph.b) view).a(lxVar.d == j3, true);
                            aVar222.a(lxVar.d != j3, true);
                            lxVar.f();
                            lyVar.W.b();
                            if (lxVar.d == j3) {
                            }
                        }
                    }
                    stickerSet = null;
                    childCount = hxVar.getChildCount();
                    while (i7 < childCount) {
                    }
                    if (lxVar.d != 0) {
                    }
                    j3 = 0;
                    TLObject tLObject222 = (TLObject) b41Var.G;
                    document = null;
                    TLRPC.StickerSet stickerSet4222 = stickerSet;
                    ph.a aVar322 = lyVar.M;
                    te.a aVar2222 = lyVar.b;
                    arrayList = lxVar.f;
                    if (arrayList != null) {
                    }
                    lyVar.K(aVar322, tLObject222, stickerSet4222, document, true, aVar2222.e <= 0.0f);
                    ((ph.b) view).a(lxVar.d == j3, true);
                    aVar2222.a(lxVar.d != j3, true);
                    lxVar.f();
                    lyVar.W.b();
                    if (lxVar.d == j3) {
                    }
                }
                break;
            case 2:
                gy gyVar = (gy) this.b;
                b41 b41Var2 = (b41) obj;
                View view2 = (View) obj2;
                hx hxVar2 = gyVar.c;
                ly lyVar2 = gyVar.R;
                Object obj4 = b41Var2.G;
                if (obj4 instanceof TLRPC.StickerSetCovered) {
                    ex exVar2 = (ex) b41Var2.H;
                    long j15 = gyVar.d;
                    stickerSet2 = ((TLRPC.StickerSetCovered) obj4).set;
                    long j16 = stickerSet2.id;
                    if (j15 == j16) {
                        gyVar.d = 0L;
                        stickerSet2 = null;
                        childCount2 = hxVar2.getChildCount();
                        for (i10 = 0; i10 < childCount2; i10++) {
                            ph.b bVar2 = (ph.b) hxVar2.getChildAt(i10);
                            if (bVar2 != view2) {
                                bVar2.a(false, true);
                            }
                        }
                        if (gyVar.d != 0 || gyVar.f.size() >= gyVar.e.count) {
                            j10 = 0;
                        } else {
                            org.telegram.messenger.si b03 = org.telegram.messenger.si.b0(lyVar2.d1);
                            TLRPC.StickerSet stickerSet6 = gyVar.e;
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            j10 = 0;
                            tL_inputStickerSetID2.id = stickerSet6.id;
                            tL_inputStickerSetID2.access_hash = stickerSet6.access_hash;
                            TLRPC.TL_messages_stickerSet m02 = b03.m0(tL_inputStickerSetID2, false);
                            if (m02 != null) {
                                gyVar.f = m02.documents;
                            }
                        }
                        TLObject tLObject3 = (TLObject) b41Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet7 = stickerSet2;
                        ph.a aVar4 = lyVar2.O;
                        te.a aVar5 = lyVar2.a;
                        arrayList2 = gyVar.f;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            document2 = (TLRPC.Document) gyVar.f.get(0);
                        }
                        lyVar2.K(aVar4, tLObject3, stickerSet7, document2, false, aVar5.e <= 0.0f);
                        ((ph.b) view2).a(gyVar.d == j10, true);
                        aVar5.a(gyVar.d != j10, true);
                        gyVar.f();
                        lyVar2.H0.b();
                        if (gyVar.d == j10) {
                            hxVar2.L1(view2);
                            break;
                        }
                    } else {
                        gyVar.d = j16;
                        gyVar.f = exVar2.d;
                        gyVar.e = stickerSet2;
                        childCount2 = hxVar2.getChildCount();
                        while (i10 < childCount2) {
                        }
                        if (gyVar.d != 0) {
                        }
                        j10 = 0;
                        TLObject tLObject32 = (TLObject) b41Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet72 = stickerSet2;
                        ph.a aVar42 = lyVar2.O;
                        te.a aVar52 = lyVar2.a;
                        arrayList2 = gyVar.f;
                        if (arrayList2 != null) {
                            document2 = (TLRPC.Document) gyVar.f.get(0);
                        }
                        lyVar2.K(aVar42, tLObject32, stickerSet72, document2, false, aVar52.e <= 0.0f);
                        ((ph.b) view2).a(gyVar.d == j10, true);
                        aVar52.a(gyVar.d != j10, true);
                        gyVar.f();
                        lyVar2.H0.b();
                        if (gyVar.d == j10) {
                        }
                    }
                } else {
                    if (obj4 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj4;
                        long j17 = gyVar.d;
                        TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet2.set;
                        long j18 = stickerSet8.id;
                        if (j17 == j18) {
                            gyVar.d = 0L;
                        } else {
                            gyVar.d = j18;
                            gyVar.f = tL_messages_stickerSet2.documents;
                            gyVar.e = stickerSet8;
                            stickerSet2 = stickerSet8;
                            childCount2 = hxVar2.getChildCount();
                            while (i10 < childCount2) {
                            }
                            if (gyVar.d != 0) {
                            }
                            j10 = 0;
                            TLObject tLObject322 = (TLObject) b41Var2.G;
                            document2 = null;
                            TLRPC.StickerSet stickerSet722 = stickerSet2;
                            ph.a aVar422 = lyVar2.O;
                            te.a aVar522 = lyVar2.a;
                            arrayList2 = gyVar.f;
                            if (arrayList2 != null) {
                            }
                            lyVar2.K(aVar422, tLObject322, stickerSet722, document2, false, aVar522.e <= 0.0f);
                            ((ph.b) view2).a(gyVar.d == j10, true);
                            aVar522.a(gyVar.d != j10, true);
                            gyVar.f();
                            lyVar2.H0.b();
                            if (gyVar.d == j10) {
                            }
                        }
                    }
                    stickerSet2 = null;
                    childCount2 = hxVar2.getChildCount();
                    while (i10 < childCount2) {
                    }
                    if (gyVar.d != 0) {
                    }
                    j10 = 0;
                    TLObject tLObject3222 = (TLObject) b41Var2.G;
                    document2 = null;
                    TLRPC.StickerSet stickerSet7222 = stickerSet2;
                    ph.a aVar4222 = lyVar2.O;
                    te.a aVar5222 = lyVar2.a;
                    arrayList2 = gyVar.f;
                    if (arrayList2 != null) {
                    }
                    lyVar2.K(aVar4222, tLObject3222, stickerSet7222, document2, false, aVar5222.e <= 0.0f);
                    ((ph.b) view2).a(gyVar.d == j10, true);
                    aVar5222.a(gyVar.d != j10, true);
                    gyVar.f();
                    lyVar2.H0.b();
                    if (gyVar.d == j10) {
                    }
                }
                break;
            case 12:
                cf0 cf0Var = (cf0) this.b;
                Object obj5 = ((b41) obj).G;
                if (obj5 instanceof org.telegram.messenger.gj) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj5;
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.gj.B0(gjVar.k) >= 0) {
                        bundle.putLong("user_id", org.telegram.messenger.gj.B0(gjVar.k));
                    } else {
                        bundle.putLong("chat_id", -org.telegram.messenger.gj.B0(gjVar.k));
                    }
                    bundle.putInt("message_id", gjVar.e1());
                    org.telegram.ui.an anVar = new org.telegram.ui.an(bundle);
                    org.telegram.ui.yw ywVar = cf0Var.a;
                    org.telegram.ui.yw.p4(anVar, gjVar);
                    ywVar.presentFragment(anVar);
                    break;
                }
                break;
            default:
                uj0 uj0Var = (uj0) this.b;
                Canvas canvas = (Canvas) obj;
                RectF rectF = (RectF) obj2;
                float floatValue = ((Float) number).floatValue();
                float floatValue2 = ((Float) serializable).floatValue();
                float floatValue3 = ((Float) serializable2).floatValue();
                org.telegram.ui.ActionBar.e6 e6Var = uj0Var.o2;
                Paint paint = uj0.c3;
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                paint.setColor(org.telegram.ui.ActionBar.j6.r1(floatValue3, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d6, e6Var)));
                if (floatValue > 0.0f || floatValue2 > 0.0f) {
                    if (floatValue == floatValue2) {
                        canvas.drawRoundRect(rectF, floatValue, floatValue, paint);
                        break;
                    } else {
                        Path path = uj0.d3;
                        path.rewind();
                        float[] fArr = uj0.e3;
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

    @Override // org.telegram.messenger.j9
    public Object o(Object obj) {
        return Float.valueOf(((r1.f) this.b).a / 100.0f);
    }

    @Override // org.telegram.ui.sw
    public boolean y(org.telegram.ui.yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        jm0 jm0Var = (jm0) this.b;
        int i11 = jm0Var.K0;
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = jm0Var.C0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((org.telegram.messenger.gj) hashMap.get((org.telegram.ui.sz) it.next()));
        }
        hashMap.clear();
        jm0Var.Q(false);
        boolean z12 = true;
        if (arrayList.size() > 1 || ((org.telegram.messenger.ur) arrayList.get(0)).a == org.telegram.messenger.m10.i(org.telegram.messenger.c.a(i11).a).e() || charSequence != null) {
            int i12 = 0;
            while (i12 < arrayList.size()) {
                long j3 = ((org.telegram.messenger.ur) arrayList.get(i12)).a;
                if (charSequence != null) {
                    org.telegram.messenger.ez.C(org.telegram.messenger.c.a(i11).a).r0(org.telegram.messenger.cz.b(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                org.telegram.messenger.ez.C(org.telegram.messenger.c.a(i11).a).q0(arrayList2, j3, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                i12++;
                z12 = z12;
            }
            boolean z13 = z12;
            ywVar.finishFragment();
            return z13;
        }
        long j10 = ((org.telegram.messenger.ur) arrayList.get(0)).a;
        Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
        if (org.telegram.messenger.m5.C(j10)) {
            k10.putInt("enc_id", (int) (4294967295L & j10));
        } else {
            if (org.telegram.messenger.m5.E(j10)) {
                k10.putLong("user_id", j10);
            } else {
                k10.putLong("chat_id", -j10);
            }
            if (!org.telegram.messenger.np.s1(org.telegram.messenger.c.a(i11).a).E(k10, ywVar, null, null)) {
                return true;
            }
        }
        org.telegram.ui.an anVar = new org.telegram.ui.an(k10);
        ywVar.presentFragment(anVar, true);
        anVar.hc(arrayList2);
        return true;
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void A(ImageReceiver imageReceiver) {
    }

    @Override // jg.y1
    public /* synthetic */ void l0(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.s70
    public /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.s70
    public /* synthetic */ void f() {
    }

    @Override // org.telegram.ui.Components.s70
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.vt0
    public /* synthetic */ void p() {
    }

    @Override // te.b
    public /* synthetic */ void E(float f10, int i7) {
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void O(int i7, Drawable drawable) {
    }
}
