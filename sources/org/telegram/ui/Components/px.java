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
import org.telegram.ui.nb1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class px implements org.telegram.messenger.p20, org.telegram.ui.ActionBar.u1, zf.l1, fe.e, org.telegram.messenger.m9, i80, ce0, jk0, org.telegram.ui.tx, th.m5, org.telegram.messenger.gs, z71, org.telegram.messenger.rc, yu0, org.telegram.messenger.nc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ px(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.tx
    public /* synthetic */ boolean H() {
        return false;
    }

    @Override // zf.l1
    public /* synthetic */ a0.h M() {
        return null;
    }

    @Override // org.telegram.ui.tx
    public /* synthetic */ boolean O(org.telegram.ui.zx zxVar) {
        return false;
    }

    @Override // zf.l1
    public /* synthetic */ boolean Y(int i10) {
        return true;
    }

    @Override // org.telegram.messenger.gs
    public void a(String str) {
        th.e5 storiesController;
        switch (this.a) {
            case 20:
                au0 au0Var = ((zq0) this.b).d;
                storiesController = au0Var.getStoriesController();
                storiesController.r(au0Var.l1, str, new tq0(au0Var, 1));
                break;
            default:
                y31 y31Var = (y31) this.b;
                y31Var.W1 = str;
                y31Var.b2.O(true);
                break;
        }
    }

    @Override // th.m5
    public void c(boolean z10) {
        th.x4 x4Var = (th.x4) this.b;
        if (z10) {
            x4Var.p(30, false);
        }
    }

    @Override // org.telegram.ui.Components.i80
    public void d() {
        ((hd0) this.b).K0(true);
    }

    @Override // org.telegram.ui.Components.z71
    public void e(int i10, int i11) {
        vu0 vu0Var = (vu0) this.b;
        vu0Var.x = i10;
        vu0Var.y = i11;
        bi.t0 t0Var = vu0Var.L;
        if (t0Var != null) {
            t0Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean f(int i10, View view) {
        vi0 vi0Var;
        switch (this.a) {
            case 15:
                wi0 wi0Var = (wi0) this.b;
                ArrayList arrayList = wi0Var.n;
                if (wi0Var.f.d(i10) != 0 || (vi0Var = wi0Var.F) == null) {
                    return true;
                }
                vi0Var.c(org.telegram.messenger.kj.C1(((TLRPC.MessagePeerReaction) arrayList.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i10));
                return true;
            default:
                hm0 hm0Var = (hm0) this.b;
                kg.f fVar = hm0Var.c;
                org.telegram.messenger.kj E = fVar.E(i10);
                hm0 hm0Var2 = (hm0) fVar.d;
                if (E == null) {
                    return false;
                }
                if (!hm0Var.I.f()) {
                    hm0Var.I.a();
                    fVar.k(0, hm0Var2.r);
                }
                if (hm0Var.I.f()) {
                    hm0Var.I.e(E, view, 0);
                    if (!hm0Var.I.f()) {
                        fVar.k(0, hm0Var2.r);
                    }
                    org.telegram.ui.r00 r00Var = hm0Var.J;
                    int f12 = E.f1();
                    r00Var.a = org.telegram.messenger.kj.B0(E.k);
                    r00Var.b = f12;
                }
                return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 1:
                org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(((ny) this.b).w.c1);
                b02.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new org.telegram.messenger.hh(b02, 1));
                break;
            case 3:
                ((ag.o0) this.b).run();
                break;
            case 4:
                ((t10) this.b).J0();
                break;
            case 6:
                m60 m60Var = (m60) this.b;
                a0.h hVar = m60Var.W1;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < hVar.m(); i11++) {
                    arrayList.add(org.telegram.messenger.wp.r1(m60Var.a).Z1(Long.valueOf(hVar.j(i11))));
                }
                org.telegram.ui.p50 p50Var = m60Var.c2;
                if (p50Var != null) {
                    p50Var.g(0, arrayList);
                }
                m60Var.dismiss();
                break;
            case 22:
                fx0 fx0Var = (fx0) this.b;
                fx0Var.e.presentFragment(new StickersActivity(fx0Var.d, null));
                x1Var.dismiss();
                break;
            default:
                org.telegram.messenger.i0.v1((gx0) this.b);
                x1Var.dismiss();
                break;
        }
    }

    @Override // zf.l1
    public void i(int i10) {
        i60 i60Var = (i60) this.b;
        m60 m60Var = i60Var.n;
        m60Var.O0(i60Var.f - 1);
        if (i60Var.h == null && !i60Var.e.e() && i60Var.b() <= 2) {
            m60Var.q1.e(false, true);
        }
        i60Var.f();
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
    @Override // org.telegram.messenger.p20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        TLRPC.StickerSet stickerSet;
        int childCount;
        int i10;
        long j10;
        TLRPC.Document document;
        ArrayList arrayList;
        TLRPC.StickerSet stickerSet2;
        int childCount2;
        int i11;
        long j11;
        TLRPC.Document document2;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                ux uxVar = (ux) this.b;
                b51 b51Var = (b51) obj;
                View view = (View) obj2;
                qx qxVar = uxVar.c;
                vy vyVar = uxVar.F;
                Object obj3 = b51Var.G;
                if (obj3 instanceof TLRPC.StickerSetCovered) {
                    nx nxVar = (nx) b51Var.H;
                    long j12 = uxVar.d;
                    stickerSet = ((TLRPC.StickerSetCovered) obj3).set;
                    long j13 = stickerSet.id;
                    if (j12 == j13) {
                        uxVar.d = 0L;
                        stickerSet = null;
                        childCount = qxVar.getChildCount();
                        for (i10 = 0; i10 < childCount; i10++) {
                            fh.b bVar = (fh.b) qxVar.getChildAt(i10);
                            if (bVar != view) {
                                bVar.a(false, true);
                            }
                        }
                        if (uxVar.d != 0 || uxVar.f.size() >= uxVar.e.count) {
                            j10 = 0;
                        } else {
                            org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(vyVar.c1);
                            TLRPC.StickerSet stickerSet3 = uxVar.e;
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            j10 = 0;
                            tL_inputStickerSetID.id = stickerSet3.id;
                            tL_inputStickerSetID.access_hash = stickerSet3.access_hash;
                            TLRPC.TL_messages_stickerSet m0 = b02.m0(tL_inputStickerSetID, false);
                            if (m0 != null) {
                                uxVar.f = m0.documents;
                            }
                        }
                        TLObject tLObject = (TLObject) b51Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet4 = stickerSet;
                        fh.a aVar = vyVar.L;
                        fe.b bVar2 = vyVar.b;
                        arrayList = uxVar.f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            document = (TLRPC.Document) uxVar.f.get(0);
                        }
                        vyVar.K(aVar, tLObject, stickerSet4, document, true, bVar2.e <= 0.0f);
                        ((fh.b) view).a(uxVar.d == j10, true);
                        bVar2.a(uxVar.d != j10, true);
                        uxVar.f();
                        vyVar.V.b();
                        if (uxVar.d == j10) {
                            qxVar.L1(view);
                            break;
                        }
                    } else {
                        uxVar.d = j13;
                        uxVar.f = nxVar.d;
                        uxVar.e = stickerSet;
                        childCount = qxVar.getChildCount();
                        while (i10 < childCount) {
                        }
                        if (uxVar.d != 0) {
                        }
                        j10 = 0;
                        TLObject tLObject2 = (TLObject) b51Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet42 = stickerSet;
                        fh.a aVar2 = vyVar.L;
                        fe.b bVar22 = vyVar.b;
                        arrayList = uxVar.f;
                        if (arrayList != null) {
                            document = (TLRPC.Document) uxVar.f.get(0);
                        }
                        vyVar.K(aVar2, tLObject2, stickerSet42, document, true, bVar22.e <= 0.0f);
                        ((fh.b) view).a(uxVar.d == j10, true);
                        bVar22.a(uxVar.d != j10, true);
                        uxVar.f();
                        vyVar.V.b();
                        if (uxVar.d == j10) {
                        }
                    }
                } else {
                    if (obj3 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
                        long j14 = uxVar.d;
                        TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet.set;
                        long j15 = stickerSet5.id;
                        if (j14 == j15) {
                            uxVar.d = 0L;
                        } else {
                            uxVar.d = j15;
                            uxVar.f = tL_messages_stickerSet.documents;
                            uxVar.e = stickerSet5;
                            stickerSet = stickerSet5;
                            childCount = qxVar.getChildCount();
                            while (i10 < childCount) {
                            }
                            if (uxVar.d != 0) {
                            }
                            j10 = 0;
                            TLObject tLObject22 = (TLObject) b51Var.G;
                            document = null;
                            TLRPC.StickerSet stickerSet422 = stickerSet;
                            fh.a aVar22 = vyVar.L;
                            fe.b bVar222 = vyVar.b;
                            arrayList = uxVar.f;
                            if (arrayList != null) {
                            }
                            vyVar.K(aVar22, tLObject22, stickerSet422, document, true, bVar222.e <= 0.0f);
                            ((fh.b) view).a(uxVar.d == j10, true);
                            bVar222.a(uxVar.d != j10, true);
                            uxVar.f();
                            vyVar.V.b();
                            if (uxVar.d == j10) {
                            }
                        }
                    }
                    stickerSet = null;
                    childCount = qxVar.getChildCount();
                    while (i10 < childCount) {
                    }
                    if (uxVar.d != 0) {
                    }
                    j10 = 0;
                    TLObject tLObject222 = (TLObject) b51Var.G;
                    document = null;
                    TLRPC.StickerSet stickerSet4222 = stickerSet;
                    fh.a aVar222 = vyVar.L;
                    fe.b bVar2222 = vyVar.b;
                    arrayList = uxVar.f;
                    if (arrayList != null) {
                    }
                    vyVar.K(aVar222, tLObject222, stickerSet4222, document, true, bVar2222.e <= 0.0f);
                    ((fh.b) view).a(uxVar.d == j10, true);
                    bVar2222.a(uxVar.d != j10, true);
                    uxVar.f();
                    vyVar.V.b();
                    if (uxVar.d == j10) {
                    }
                }
                break;
            case 2:
                qy qyVar = (qy) this.b;
                b51 b51Var2 = (b51) obj;
                View view2 = (View) obj2;
                qx qxVar2 = qyVar.c;
                vy vyVar2 = qyVar.Q;
                Object obj4 = b51Var2.G;
                if (obj4 instanceof TLRPC.StickerSetCovered) {
                    nx nxVar2 = (nx) b51Var2.H;
                    long j16 = qyVar.d;
                    stickerSet2 = ((TLRPC.StickerSetCovered) obj4).set;
                    long j17 = stickerSet2.id;
                    if (j16 == j17) {
                        qyVar.d = 0L;
                        stickerSet2 = null;
                        childCount2 = qxVar2.getChildCount();
                        for (i11 = 0; i11 < childCount2; i11++) {
                            fh.b bVar3 = (fh.b) qxVar2.getChildAt(i11);
                            if (bVar3 != view2) {
                                bVar3.a(false, true);
                            }
                        }
                        if (qyVar.d != 0 || qyVar.f.size() >= qyVar.e.count) {
                            j11 = 0;
                        } else {
                            org.telegram.messenger.vi b03 = org.telegram.messenger.vi.b0(vyVar2.c1);
                            TLRPC.StickerSet stickerSet6 = qyVar.e;
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            j11 = 0;
                            tL_inputStickerSetID2.id = stickerSet6.id;
                            tL_inputStickerSetID2.access_hash = stickerSet6.access_hash;
                            TLRPC.TL_messages_stickerSet m02 = b03.m0(tL_inputStickerSetID2, false);
                            if (m02 != null) {
                                qyVar.f = m02.documents;
                            }
                        }
                        TLObject tLObject3 = (TLObject) b51Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet7 = stickerSet2;
                        fh.a aVar3 = vyVar2.N;
                        fe.b bVar4 = vyVar2.a;
                        arrayList2 = qyVar.f;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            document2 = (TLRPC.Document) qyVar.f.get(0);
                        }
                        vyVar2.K(aVar3, tLObject3, stickerSet7, document2, false, bVar4.e <= 0.0f);
                        ((fh.b) view2).a(qyVar.d == j11, true);
                        bVar4.a(qyVar.d != j11, true);
                        qyVar.f();
                        vyVar2.G0.b();
                        if (qyVar.d == j11) {
                            qxVar2.L1(view2);
                            break;
                        }
                    } else {
                        qyVar.d = j17;
                        qyVar.f = nxVar2.d;
                        qyVar.e = stickerSet2;
                        childCount2 = qxVar2.getChildCount();
                        while (i11 < childCount2) {
                        }
                        if (qyVar.d != 0) {
                        }
                        j11 = 0;
                        TLObject tLObject32 = (TLObject) b51Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet72 = stickerSet2;
                        fh.a aVar32 = vyVar2.N;
                        fe.b bVar42 = vyVar2.a;
                        arrayList2 = qyVar.f;
                        if (arrayList2 != null) {
                            document2 = (TLRPC.Document) qyVar.f.get(0);
                        }
                        vyVar2.K(aVar32, tLObject32, stickerSet72, document2, false, bVar42.e <= 0.0f);
                        ((fh.b) view2).a(qyVar.d == j11, true);
                        bVar42.a(qyVar.d != j11, true);
                        qyVar.f();
                        vyVar2.G0.b();
                        if (qyVar.d == j11) {
                        }
                    }
                } else {
                    if (obj4 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj4;
                        long j18 = qyVar.d;
                        TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet2.set;
                        long j19 = stickerSet8.id;
                        if (j18 == j19) {
                            qyVar.d = 0L;
                        } else {
                            qyVar.d = j19;
                            qyVar.f = tL_messages_stickerSet2.documents;
                            qyVar.e = stickerSet8;
                            stickerSet2 = stickerSet8;
                            childCount2 = qxVar2.getChildCount();
                            while (i11 < childCount2) {
                            }
                            if (qyVar.d != 0) {
                            }
                            j11 = 0;
                            TLObject tLObject322 = (TLObject) b51Var2.G;
                            document2 = null;
                            TLRPC.StickerSet stickerSet722 = stickerSet2;
                            fh.a aVar322 = vyVar2.N;
                            fe.b bVar422 = vyVar2.a;
                            arrayList2 = qyVar.f;
                            if (arrayList2 != null) {
                            }
                            vyVar2.K(aVar322, tLObject322, stickerSet722, document2, false, bVar422.e <= 0.0f);
                            ((fh.b) view2).a(qyVar.d == j11, true);
                            bVar422.a(qyVar.d != j11, true);
                            qyVar.f();
                            vyVar2.G0.b();
                            if (qyVar.d == j11) {
                            }
                        }
                    }
                    stickerSet2 = null;
                    childCount2 = qxVar2.getChildCount();
                    while (i11 < childCount2) {
                    }
                    if (qyVar.d != 0) {
                    }
                    j11 = 0;
                    TLObject tLObject3222 = (TLObject) b51Var2.G;
                    document2 = null;
                    TLRPC.StickerSet stickerSet7222 = stickerSet2;
                    fh.a aVar3222 = vyVar2.N;
                    fe.b bVar4222 = vyVar2.a;
                    arrayList2 = qyVar.f;
                    if (arrayList2 != null) {
                    }
                    vyVar2.K(aVar3222, tLObject3222, stickerSet7222, document2, false, bVar4222.e <= 0.0f);
                    ((fh.b) view2).a(qyVar.d == j11, true);
                    bVar4222.a(qyVar.d != j11, true);
                    qyVar.f();
                    vyVar2.G0.b();
                    if (qyVar.d == j11) {
                    }
                }
                break;
            case 12:
                cg0 cg0Var = (cg0) this.b;
                Object obj5 = ((b51) obj).G;
                if (obj5 instanceof org.telegram.messenger.kj) {
                    org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) obj5;
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.kj.B0(kjVar.k) >= 0) {
                        bundle.putLong("user_id", org.telegram.messenger.kj.B0(kjVar.k));
                    } else {
                        bundle.putLong("chat_id", -org.telegram.messenger.kj.B0(kjVar.k));
                    }
                    bundle.putInt("message_id", kjVar.f1());
                    org.telegram.ui.un unVar = new org.telegram.ui.un(bundle);
                    org.telegram.ui.zx zxVar = cg0Var.a;
                    org.telegram.ui.zx.p4(unVar, kjVar);
                    zxVar.presentFragment(unVar);
                    break;
                }
                break;
            default:
                uk0 uk0Var = (uk0) this.b;
                Canvas canvas = (Canvas) obj;
                RectF rectF = (RectF) obj2;
                float floatValue = ((Float) number).floatValue();
                float floatValue2 = ((Float) serializable).floatValue();
                float floatValue3 = ((Float) serializable2).floatValue();
                org.telegram.ui.ActionBar.p6 p6Var = uk0Var.n2;
                Paint paint = uk0.b3;
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                paint.setColor(org.telegram.ui.ActionBar.t6.r1(floatValue3, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var)));
                if (floatValue > 0.0f || floatValue2 > 0.0f) {
                    if (floatValue == floatValue2) {
                        canvas.drawRoundRect(rectF, floatValue, floatValue, paint);
                        break;
                    } else {
                        Path path = uk0.c3;
                        path.rewind();
                        float[] fArr = uk0.d3;
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

    @Override // org.telegram.messenger.m9
    public Object l(Object obj) {
        return Float.valueOf(((o1.i) this.b).a / 100.0f);
    }

    @Override // org.telegram.ui.Components.yu0
    public void m(int i10) {
        org.telegram.messenger.r20 r20Var = ((b51) this.b).C;
        if (r20Var != null) {
            r20Var.a(Integer.valueOf(i10));
        }
    }

    @Override // org.telegram.ui.Components.ce0
    public void o(int i10, int i11) {
        oe0 oe0Var = (oe0) ((fg.j) this.b).e;
        if (i10 == oe0Var.b) {
            oe0Var.G = i11;
        } else if (i10 == oe0Var.r) {
            oe0Var.P = i11;
        } else if (i10 == oe0Var.d) {
            oe0Var.I = i11;
        } else if (i10 == oe0Var.c) {
            oe0Var.H = i11;
        } else if (i10 == oe0Var.f) {
            oe0Var.J = i11;
        } else if (i10 == oe0Var.e) {
            oe0Var.K = i11;
        } else if (i10 == oe0Var.w) {
            oe0Var.R = i11;
        } else if (i10 == oe0Var.s) {
            oe0Var.Q = i11;
        } else if (i10 == oe0Var.x) {
            oe0Var.S = i11;
        } else if (i10 == oe0Var.y) {
            oe0Var.U = i11;
        } else if (i10 == oe0Var.h) {
            oe0Var.L = i11;
        } else if (i10 == oe0Var.n) {
            oe0Var.M = i11;
        }
        gz gzVar = oe0Var.l0;
        if (gzVar != null) {
            gzVar.c(true, false, false);
        }
        oe0Var.f();
    }

    @Override // org.telegram.messenger.nc
    public void q(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        b71 b71Var;
        int i10;
        int i11;
        double ceil;
        c71 c71Var = (c71) this.b;
        ImageReceiver imageReceiver2 = c71Var.Q;
        if (z10) {
            if (c71Var.N == null && c71Var.d0 == null) {
                return;
            }
            int L = org.telegram.messenger.i0.L(150.0f);
            org.telegram.ui.lr0 lr0Var = c71Var.N;
            if (lr0Var != null) {
                int i12 = (int) c71Var.O;
                ArrayList arrayList = lr0Var.w;
                int indexOf = arrayList.indexOf(lr0Var.c(i12));
                if (indexOf == -1) {
                    z13 = true;
                    i11 = 0;
                } else if (indexOf == arrayList.size() - 1) {
                    int videoDuration = lr0Var.getVideoDuration() / 1000;
                    if (videoDuration <= 100) {
                        z13 = true;
                        ceil = Math.ceil(videoDuration);
                    } else {
                        z13 = true;
                        ceil = videoDuration <= 250 ? Math.ceil(videoDuration / 2.0f) : videoDuration <= 500 ? Math.ceil(videoDuration / 4.0f) : videoDuration <= 1000 ? Math.ceil(videoDuration / 5.0f) : Math.ceil(videoDuration / 10.0f);
                    }
                    i11 = Math.min(25, (((int) ceil) - ((arrayList.size() - 1) * 25)) + 1);
                } else {
                    z13 = true;
                    i11 = 25;
                }
                float q6 = imageReceiver2.q() / Math.min(i11, 5);
                float o10 = imageReceiver2.o() / ((int) Math.ceil(i11 / 5.0f));
                org.telegram.ui.lr0 lr0Var2 = c71Var.N;
                int i13 = (int) c71Var.O;
                int videoDuration2 = lr0Var2.getVideoDuration() / 1000;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i13)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i13 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i13 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i13 / 5.0f)) % 25 : ((int) Math.ceil(i13 / 10.0f)) % 25, i11 - 1);
                c71Var.R = (int) ((min % 5) * q6);
                c71Var.S = (int) ((min / 5) * o10);
                c71Var.T = (int) q6;
                c71Var.U = (int) o10;
            } else {
                z13 = true;
                int i14 = 0;
                while (true) {
                    if (i14 >= c71Var.d0.size()) {
                        b71Var = null;
                        break;
                    }
                    b71Var = (b71) c71Var.d0.get(i14);
                    double d = i14 == 0 ? 0.0d : b71Var.a;
                    double d10 = i14 == c71Var.d0.size() + (-1) ? 9.9999999E7d : ((b71) c71Var.d0.get(i14 + 1)).a;
                    double d11 = c71Var.O;
                    if (d11 >= d && d11 <= d10) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (b71Var == null) {
                    return;
                }
                c71Var.R = b71Var.b;
                c71Var.S = b71Var.c;
                c71Var.T = c71Var.b0;
                c71Var.U = c71Var.c0;
            }
            c71Var.P = z13;
            float f7 = c71Var.T / c71Var.U;
            if (f7 > 1.0f) {
                i10 = (int) (L / f7);
            } else {
                L = (int) (L * f7);
                i10 = L;
            }
            ViewGroup.LayoutParams layoutParams = c71Var.getLayoutParams();
            if (c71Var.getVisibility() == 0 && layoutParams.width == L && layoutParams.height == i10) {
                return;
            }
            layoutParams.width = L;
            layoutParams.height = i10;
            c71Var.setVisibility(0);
            c71Var.requestLayout();
        }
    }

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        ((n90) this.b).c0();
    }

    @Override // zf.l1
    public /* synthetic */ a0.h x() {
        return null;
    }

    @Override // org.telegram.ui.tx
    public boolean z(org.telegram.ui.zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
        hn0 hn0Var = (hn0) this.b;
        int i12 = hn0Var.J0;
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = hn0Var.B0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((org.telegram.messenger.kj) hashMap.get((org.telegram.ui.r00) it.next()));
        }
        hashMap.clear();
        hn0Var.R(false);
        boolean z12 = true;
        if (arrayList.size() > 1 || ((org.telegram.messenger.hs) arrayList.get(0)).a == org.telegram.messenger.e20.i(org.telegram.messenger.c.a(i12).a).e() || charSequence != null) {
            int i13 = 0;
            while (i13 < arrayList.size()) {
                long j10 = ((org.telegram.messenger.hs) arrayList.get(i13)).a;
                if (charSequence != null) {
                    org.telegram.messenger.rz.C(org.telegram.messenger.c.a(i12).a).r0(org.telegram.messenger.pz.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                org.telegram.messenger.rz.C(org.telegram.messenger.c.a(i12).a).q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                i13++;
                z12 = z12;
            }
            boolean z13 = z12;
            zxVar.finishFragment();
            return z13;
        }
        long j11 = ((org.telegram.messenger.hs) arrayList.get(0)).a;
        Bundle g10 = a1.g.g("scrollToTopOnResume", true);
        if (org.telegram.messenger.o5.C(j11)) {
            g10.putInt("enc_id", (int) (4294967295L & j11));
        } else {
            if (org.telegram.messenger.o5.E(j11)) {
                g10.putLong("user_id", j11);
            } else {
                g10.putLong("chat_id", -j11);
            }
            if (!org.telegram.messenger.wp.r1(org.telegram.messenger.c.a(i12).a).E(g10, zxVar, null, null)) {
                return true;
            }
        }
        org.telegram.ui.un unVar = new org.telegram.ui.un(g10);
        zxVar.presentFragment(unVar, true);
        unVar.Yb(arrayList2);
        return true;
    }

    @Override // zf.l1
    public /* synthetic */ void c0(ArrayList arrayList) {
    }

    @Override // org.telegram.messenger.nc
    public /* synthetic */ void j(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.ui.Components.i80
    public /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.i80
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.i80
    public /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.yu0
    public /* synthetic */ void r() {
    }

    @Override // fe.e
    public /* synthetic */ void E(float f7, int i10) {
    }

    @Override // org.telegram.messenger.nc
    public /* synthetic */ void s(int i10, Drawable drawable) {
    }
}
