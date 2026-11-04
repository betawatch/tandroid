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
import org.telegram.ui.m91;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zw implements org.telegram.messenger.s10, org.telegram.ui.ActionBar.p1, kg.u1, qe.b, org.telegram.messenger.e9, l70, bd0, hj0, org.telegram.ui.nw, ei.h7, org.telegram.messenger.or, p61, org.telegram.messenger.jc, tt0, org.telegram.messenger.ec {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zw(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // kg.u1
    public /* synthetic */ a0.h C0() {
        return null;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // kg.u1
    public /* synthetic */ boolean J1(int i3) {
        return true;
    }

    @Override // org.telegram.ui.nw
    public /* synthetic */ boolean N(org.telegram.ui.uw uwVar) {
        return false;
    }

    @Override // qe.b
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        ((r80) this.b).c0();
    }

    @Override // org.telegram.messenger.or
    public void a(String str) {
        ei.z6 storiesController;
        switch (this.a) {
            case 20:
                ws0 ws0Var = ((xp0) this.b).d;
                storiesController = ws0Var.getStoriesController();
                storiesController.r(ws0Var.m1, str, new to0(ws0Var, 1));
                break;
            default:
                q21 q21Var = (q21) this.b;
                q21Var.X1 = str;
                q21Var.c2.O(true);
                break;
        }
    }

    @Override // ei.h7
    public void c(boolean z10) {
        ei.r6 r6Var = (ei.r6) this.b;
        if (z10) {
            r6Var.p(30, false);
        }
    }

    @Override // org.telegram.ui.Components.l70
    public void d() {
        ((hc0) this.b).K0(true);
    }

    @Override // org.telegram.ui.Components.p61
    public void e(int i3, int i10) {
        qt0 qt0Var = (qt0) this.b;
        qt0Var.x = i3;
        qt0Var.y = i10;
        ai.x2 x2Var = qt0Var.M;
        if (x2Var != null) {
            x2Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        th0 th0Var;
        switch (this.a) {
            case 15:
                uh0 uh0Var = (uh0) this.b;
                ArrayList arrayList = uh0Var.n;
                if (uh0Var.f.d(i3) != 0 || (th0Var = uh0Var.G) == null) {
                    return true;
                }
                th0Var.f(org.telegram.messenger.zi.C1(((TLRPC.MessagePeerReaction) arrayList.get(i3)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i3));
                return true;
            default:
                hl0 hl0Var = (hl0) this.b;
                ci.r4 r4Var = hl0Var.c;
                org.telegram.messenger.zi E = r4Var.E(i3);
                hl0 hl0Var2 = (hl0) r4Var.d;
                if (E == null) {
                    return false;
                }
                if (!hl0Var.J.I()) {
                    hl0Var.J.h();
                    r4Var.k(0, hl0Var2.r);
                }
                if (hl0Var.J.I()) {
                    hl0Var.J.w(E, view, 0);
                    if (!hl0Var.J.I()) {
                        r4Var.k(0, hl0Var2.r);
                    }
                    org.telegram.ui.pz pzVar = hl0Var.K;
                    int f12 = E.f1();
                    pzVar.a = org.telegram.messenger.zi.B0(E.k);
                    pzVar.b = f12;
                }
                return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 1:
                org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(((vx) this.b).w.d1);
                b02.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new org.telegram.messenger.zg(b02, 1));
                break;
            case 3:
                ((org.telegram.ui.f4) this.b).run();
                break;
            case 4:
                ((a10) this.b).J0();
                break;
            case 6:
                t50 t50Var = (t50) this.b;
                a0.h hVar = t50Var.X1;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    arrayList.add(org.telegram.messenger.hp.s1(t50Var.a).a2(Long.valueOf(hVar.j(i10))));
                }
                org.telegram.ui.m40 m40Var = t50Var.d2;
                if (m40Var != null) {
                    m40Var.h(0, arrayList);
                }
                t50Var.dismiss();
                break;
            case 22:
                zv0 zv0Var = (zv0) this.b;
                zv0Var.e.presentFragment(new StickersActivity(zv0Var.d, null));
                s1Var.dismiss();
                break;
            default:
                org.telegram.messenger.g0.v1((aw0) this.b);
                s1Var.dismiss();
                break;
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
    @Override // org.telegram.messenger.s10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        TLRPC.StickerSet stickerSet;
        int childCount;
        int i3;
        long j10;
        TLRPC.Document document;
        ArrayList arrayList;
        TLRPC.StickerSet stickerSet2;
        int childCount2;
        int i10;
        long j11;
        TLRPC.Document document2;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                ex exVar = (ex) this.b;
                r31 r31Var = (r31) obj;
                View view = (View) obj2;
                ax axVar = exVar.c;
                ey eyVar = exVar.G;
                Object obj3 = r31Var.G;
                if (obj3 instanceof TLRPC.StickerSetCovered) {
                    xw xwVar = (xw) r31Var.H;
                    long j12 = exVar.d;
                    stickerSet = ((TLRPC.StickerSetCovered) obj3).set;
                    long j13 = stickerSet.id;
                    if (j12 == j13) {
                        exVar.d = 0L;
                        stickerSet = null;
                        childCount = axVar.getChildCount();
                        for (i3 = 0; i3 < childCount; i3++) {
                            qh.b bVar = (qh.b) axVar.getChildAt(i3);
                            if (bVar != view) {
                                bVar.a(false, true);
                            }
                        }
                        if (exVar.d != 0 || exVar.f.size() >= exVar.e.count) {
                            j10 = 0;
                        } else {
                            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(eyVar.d1);
                            TLRPC.StickerSet stickerSet3 = exVar.e;
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            j10 = 0;
                            tL_inputStickerSetID.id = stickerSet3.id;
                            tL_inputStickerSetID.access_hash = stickerSet3.access_hash;
                            TLRPC.TL_messages_stickerSet m0 = b02.m0(tL_inputStickerSetID, false);
                            if (m0 != null) {
                                exVar.f = m0.documents;
                            }
                        }
                        TLObject tLObject = (TLObject) r31Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet4 = stickerSet;
                        qh.a aVar = eyVar.M;
                        qe.a aVar2 = eyVar.b;
                        arrayList = exVar.f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            document = (TLRPC.Document) exVar.f.get(0);
                        }
                        eyVar.J(aVar, tLObject, stickerSet4, document, true, aVar2.e <= 0.0f);
                        ((qh.b) view).a(exVar.d == j10, true);
                        aVar2.a(exVar.d != j10, true);
                        exVar.f();
                        eyVar.W.b();
                        if (exVar.d == j10) {
                            axVar.L1(view);
                            break;
                        }
                    } else {
                        exVar.d = j13;
                        exVar.f = xwVar.d;
                        exVar.e = stickerSet;
                        childCount = axVar.getChildCount();
                        while (i3 < childCount) {
                        }
                        if (exVar.d != 0) {
                        }
                        j10 = 0;
                        TLObject tLObject2 = (TLObject) r31Var.G;
                        document = null;
                        TLRPC.StickerSet stickerSet42 = stickerSet;
                        qh.a aVar3 = eyVar.M;
                        qe.a aVar22 = eyVar.b;
                        arrayList = exVar.f;
                        if (arrayList != null) {
                            document = (TLRPC.Document) exVar.f.get(0);
                        }
                        eyVar.J(aVar3, tLObject2, stickerSet42, document, true, aVar22.e <= 0.0f);
                        ((qh.b) view).a(exVar.d == j10, true);
                        aVar22.a(exVar.d != j10, true);
                        exVar.f();
                        eyVar.W.b();
                        if (exVar.d == j10) {
                        }
                    }
                } else {
                    if (obj3 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
                        long j14 = exVar.d;
                        TLRPC.StickerSet stickerSet5 = tL_messages_stickerSet.set;
                        long j15 = stickerSet5.id;
                        if (j14 == j15) {
                            exVar.d = 0L;
                        } else {
                            exVar.d = j15;
                            exVar.f = tL_messages_stickerSet.documents;
                            exVar.e = stickerSet5;
                            stickerSet = stickerSet5;
                            childCount = axVar.getChildCount();
                            while (i3 < childCount) {
                            }
                            if (exVar.d != 0) {
                            }
                            j10 = 0;
                            TLObject tLObject22 = (TLObject) r31Var.G;
                            document = null;
                            TLRPC.StickerSet stickerSet422 = stickerSet;
                            qh.a aVar32 = eyVar.M;
                            qe.a aVar222 = eyVar.b;
                            arrayList = exVar.f;
                            if (arrayList != null) {
                            }
                            eyVar.J(aVar32, tLObject22, stickerSet422, document, true, aVar222.e <= 0.0f);
                            ((qh.b) view).a(exVar.d == j10, true);
                            aVar222.a(exVar.d != j10, true);
                            exVar.f();
                            eyVar.W.b();
                            if (exVar.d == j10) {
                            }
                        }
                    }
                    stickerSet = null;
                    childCount = axVar.getChildCount();
                    while (i3 < childCount) {
                    }
                    if (exVar.d != 0) {
                    }
                    j10 = 0;
                    TLObject tLObject222 = (TLObject) r31Var.G;
                    document = null;
                    TLRPC.StickerSet stickerSet4222 = stickerSet;
                    qh.a aVar322 = eyVar.M;
                    qe.a aVar2222 = eyVar.b;
                    arrayList = exVar.f;
                    if (arrayList != null) {
                    }
                    eyVar.J(aVar322, tLObject222, stickerSet4222, document, true, aVar2222.e <= 0.0f);
                    ((qh.b) view).a(exVar.d == j10, true);
                    aVar2222.a(exVar.d != j10, true);
                    exVar.f();
                    eyVar.W.b();
                    if (exVar.d == j10) {
                    }
                }
                break;
            case 2:
                yx yxVar = (yx) this.b;
                r31 r31Var2 = (r31) obj;
                View view2 = (View) obj2;
                ax axVar2 = yxVar.c;
                ey eyVar2 = yxVar.R;
                Object obj4 = r31Var2.G;
                if (obj4 instanceof TLRPC.StickerSetCovered) {
                    xw xwVar2 = (xw) r31Var2.H;
                    long j16 = yxVar.d;
                    stickerSet2 = ((TLRPC.StickerSetCovered) obj4).set;
                    long j17 = stickerSet2.id;
                    if (j16 == j17) {
                        yxVar.d = 0L;
                        stickerSet2 = null;
                        childCount2 = axVar2.getChildCount();
                        for (i10 = 0; i10 < childCount2; i10++) {
                            qh.b bVar2 = (qh.b) axVar2.getChildAt(i10);
                            if (bVar2 != view2) {
                                bVar2.a(false, true);
                            }
                        }
                        if (yxVar.d != 0 || yxVar.f.size() >= yxVar.e.count) {
                            j11 = 0;
                        } else {
                            org.telegram.messenger.li b03 = org.telegram.messenger.li.b0(eyVar2.d1);
                            TLRPC.StickerSet stickerSet6 = yxVar.e;
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
                            j11 = 0;
                            tL_inputStickerSetID2.id = stickerSet6.id;
                            tL_inputStickerSetID2.access_hash = stickerSet6.access_hash;
                            TLRPC.TL_messages_stickerSet m02 = b03.m0(tL_inputStickerSetID2, false);
                            if (m02 != null) {
                                yxVar.f = m02.documents;
                            }
                        }
                        TLObject tLObject3 = (TLObject) r31Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet7 = stickerSet2;
                        qh.a aVar4 = eyVar2.O;
                        qe.a aVar5 = eyVar2.a;
                        arrayList2 = yxVar.f;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            document2 = (TLRPC.Document) yxVar.f.get(0);
                        }
                        eyVar2.J(aVar4, tLObject3, stickerSet7, document2, false, aVar5.e <= 0.0f);
                        ((qh.b) view2).a(yxVar.d == j11, true);
                        aVar5.a(yxVar.d != j11, true);
                        yxVar.f();
                        eyVar2.H0.b();
                        if (yxVar.d == j11) {
                            axVar2.L1(view2);
                            break;
                        }
                    } else {
                        yxVar.d = j17;
                        yxVar.f = xwVar2.d;
                        yxVar.e = stickerSet2;
                        childCount2 = axVar2.getChildCount();
                        while (i10 < childCount2) {
                        }
                        if (yxVar.d != 0) {
                        }
                        j11 = 0;
                        TLObject tLObject32 = (TLObject) r31Var2.G;
                        document2 = null;
                        TLRPC.StickerSet stickerSet72 = stickerSet2;
                        qh.a aVar42 = eyVar2.O;
                        qe.a aVar52 = eyVar2.a;
                        arrayList2 = yxVar.f;
                        if (arrayList2 != null) {
                            document2 = (TLRPC.Document) yxVar.f.get(0);
                        }
                        eyVar2.J(aVar42, tLObject32, stickerSet72, document2, false, aVar52.e <= 0.0f);
                        ((qh.b) view2).a(yxVar.d == j11, true);
                        aVar52.a(yxVar.d != j11, true);
                        yxVar.f();
                        eyVar2.H0.b();
                        if (yxVar.d == j11) {
                        }
                    }
                } else {
                    if (obj4 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj4;
                        long j18 = yxVar.d;
                        TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet2.set;
                        long j19 = stickerSet8.id;
                        if (j18 == j19) {
                            yxVar.d = 0L;
                        } else {
                            yxVar.d = j19;
                            yxVar.f = tL_messages_stickerSet2.documents;
                            yxVar.e = stickerSet8;
                            stickerSet2 = stickerSet8;
                            childCount2 = axVar2.getChildCount();
                            while (i10 < childCount2) {
                            }
                            if (yxVar.d != 0) {
                            }
                            j11 = 0;
                            TLObject tLObject322 = (TLObject) r31Var2.G;
                            document2 = null;
                            TLRPC.StickerSet stickerSet722 = stickerSet2;
                            qh.a aVar422 = eyVar2.O;
                            qe.a aVar522 = eyVar2.a;
                            arrayList2 = yxVar.f;
                            if (arrayList2 != null) {
                            }
                            eyVar2.J(aVar422, tLObject322, stickerSet722, document2, false, aVar522.e <= 0.0f);
                            ((qh.b) view2).a(yxVar.d == j11, true);
                            aVar522.a(yxVar.d != j11, true);
                            yxVar.f();
                            eyVar2.H0.b();
                            if (yxVar.d == j11) {
                            }
                        }
                    }
                    stickerSet2 = null;
                    childCount2 = axVar2.getChildCount();
                    while (i10 < childCount2) {
                    }
                    if (yxVar.d != 0) {
                    }
                    j11 = 0;
                    TLObject tLObject3222 = (TLObject) r31Var2.G;
                    document2 = null;
                    TLRPC.StickerSet stickerSet7222 = stickerSet2;
                    qh.a aVar4222 = eyVar2.O;
                    qe.a aVar5222 = eyVar2.a;
                    arrayList2 = yxVar.f;
                    if (arrayList2 != null) {
                    }
                    eyVar2.J(aVar4222, tLObject3222, stickerSet7222, document2, false, aVar5222.e <= 0.0f);
                    ((qh.b) view2).a(yxVar.d == j11, true);
                    aVar5222.a(yxVar.d != j11, true);
                    yxVar.f();
                    eyVar2.H0.b();
                    if (yxVar.d == j11) {
                    }
                }
                break;
            case 12:
                bf0 bf0Var = (bf0) this.b;
                Object obj5 = ((r31) obj).G;
                if (obj5 instanceof org.telegram.messenger.zi) {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj5;
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.zi.B0(ziVar.k) >= 0) {
                        bundle.putLong("user_id", org.telegram.messenger.zi.B0(ziVar.k));
                    } else {
                        bundle.putLong("chat_id", -org.telegram.messenger.zi.B0(ziVar.k));
                    }
                    bundle.putInt("message_id", ziVar.f1());
                    org.telegram.ui.wm wmVar = new org.telegram.ui.wm(bundle);
                    org.telegram.ui.uw uwVar = bf0Var.a;
                    org.telegram.ui.uw.p4(wmVar, ziVar);
                    uwVar.presentFragment(wmVar);
                    break;
                }
                break;
            default:
                tj0 tj0Var = (tj0) this.b;
                Canvas canvas = (Canvas) obj;
                RectF rectF = (RectF) obj2;
                float floatValue = ((Float) number).floatValue();
                float floatValue2 = ((Float) serializable).floatValue();
                float floatValue3 = ((Float) serializable2).floatValue();
                org.telegram.ui.ActionBar.e6 e6Var = tj0Var.o2;
                Paint paint = tj0.c3;
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                paint.setColor(org.telegram.ui.ActionBar.k6.r1(floatValue3, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var)));
                if (floatValue > 0.0f || floatValue2 > 0.0f) {
                    if (floatValue == floatValue2) {
                        canvas.drawRoundRect(rectF, floatValue, floatValue, paint);
                        break;
                    } else {
                        Path path = tj0.d3;
                        path.rewind();
                        float[] fArr = tj0.e3;
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

    @Override // org.telegram.messenger.e9
    public Object k(Object obj) {
        return Float.valueOf(((q1.f) this.b).a / 100.0f);
    }

    @Override // kg.u1
    public /* synthetic */ a0.h k1() {
        return null;
    }

    @Override // org.telegram.ui.Components.tt0
    public void l(int i3) {
        org.telegram.messenger.u10 u10Var = ((r31) this.b).C;
        if (u10Var != null) {
            u10Var.a(Integer.valueOf(i3));
        }
    }

    @Override // org.telegram.messenger.ec
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        r51 r51Var;
        int i3;
        int i10;
        double ceil;
        s51 s51Var = (s51) this.b;
        ImageReceiver imageReceiver2 = s51Var.R;
        if (z10) {
            if (s51Var.O == null && s51Var.e0 == null) {
                return;
            }
            int L = org.telegram.messenger.g0.L(150.0f);
            org.telegram.ui.tp0 tp0Var = s51Var.O;
            if (tp0Var != null) {
                int i11 = (int) s51Var.P;
                ArrayList arrayList = tp0Var.w;
                int indexOf = arrayList.indexOf(tp0Var.c(i11));
                if (indexOf == -1) {
                    z13 = true;
                    i10 = 0;
                } else if (indexOf == arrayList.size() - 1) {
                    int videoDuration = tp0Var.getVideoDuration() / 1000;
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
                float o10 = imageReceiver2.o() / ((int) Math.ceil(i10 / 5.0f));
                org.telegram.ui.tp0 tp0Var2 = s51Var.O;
                int i12 = (int) s51Var.P;
                int videoDuration2 = tp0Var2.getVideoDuration() / 1000;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i12)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i12 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i12 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i12 / 5.0f)) % 25 : ((int) Math.ceil(i12 / 10.0f)) % 25, i10 - 1);
                s51Var.S = (int) ((min % 5) * q10);
                s51Var.T = (int) ((min / 5) * o10);
                s51Var.U = (int) q10;
                s51Var.V = (int) o10;
            } else {
                z13 = true;
                int i13 = 0;
                while (true) {
                    if (i13 >= s51Var.e0.size()) {
                        r51Var = null;
                        break;
                    }
                    r51Var = (r51) s51Var.e0.get(i13);
                    double d = i13 == 0 ? 0.0d : r51Var.a;
                    double d10 = i13 == s51Var.e0.size() + (-1) ? 9.9999999E7d : ((r51) s51Var.e0.get(i13 + 1)).a;
                    double d11 = s51Var.P;
                    if (d11 >= d && d11 <= d10) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (r51Var == null) {
                    return;
                }
                s51Var.S = r51Var.b;
                s51Var.T = r51Var.c;
                s51Var.U = s51Var.c0;
                s51Var.V = s51Var.d0;
            }
            s51Var.Q = z13;
            float f10 = s51Var.U / s51Var.V;
            if (f10 > 1.0f) {
                i3 = (int) (L / f10);
            } else {
                L = (int) (L * f10);
                i3 = L;
            }
            ViewGroup.LayoutParams layoutParams = s51Var.getLayoutParams();
            if (s51Var.getVisibility() == 0 && layoutParams.width == L && layoutParams.height == i3) {
                return;
            }
            layoutParams.width = L;
            layoutParams.height = i3;
            s51Var.setVisibility(0);
            s51Var.requestLayout();
        }
    }

    @Override // org.telegram.ui.Components.bd0
    public void m(int i3, int i10) {
        nd0 nd0Var = (nd0) ((org.telegram.ui.n4) this.b).e;
        if (i3 == nd0Var.b) {
            nd0Var.H = i10;
        } else if (i3 == nd0Var.r) {
            nd0Var.Q = i10;
        } else if (i3 == nd0Var.d) {
            nd0Var.J = i10;
        } else if (i3 == nd0Var.c) {
            nd0Var.I = i10;
        } else if (i3 == nd0Var.f) {
            nd0Var.K = i10;
        } else if (i3 == nd0Var.e) {
            nd0Var.L = i10;
        } else if (i3 == nd0Var.w) {
            nd0Var.S = i10;
        } else if (i3 == nd0Var.s) {
            nd0Var.R = i10;
        } else if (i3 == nd0Var.x) {
            nd0Var.T = i10;
        } else if (i3 == nd0Var.y) {
            nd0Var.V = i10;
        } else if (i3 == nd0Var.h) {
            nd0Var.M = i10;
        } else if (i3 == nd0Var.n) {
            nd0Var.N = i10;
        }
        py pyVar = nd0Var.m0;
        if (pyVar != null) {
            pyVar.c(true, false, false);
        }
        nd0Var.d();
    }

    @Override // kg.u1
    public void r(int i3) {
        p50 p50Var = (p50) this.b;
        t50 t50Var = p50Var.n;
        t50Var.O0(p50Var.f - 1);
        if (p50Var.h == null && !p50Var.e.e() && p50Var.b() <= 2) {
            t50Var.r1.e(false, true);
        }
        p50Var.f();
    }

    @Override // org.telegram.ui.nw
    public boolean y(org.telegram.ui.uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        im0 im0Var = (im0) this.b;
        int i11 = im0Var.K0;
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = im0Var.C0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((org.telegram.messenger.zi) hashMap.get((org.telegram.ui.pz) it.next()));
        }
        hashMap.clear();
        im0Var.R(false);
        boolean z12 = true;
        if (arrayList.size() > 1 || ((org.telegram.messenger.pr) arrayList.get(0)).a == org.telegram.messenger.h10.i(org.telegram.messenger.c.a(i11).a).e() || charSequence != null) {
            int i12 = 0;
            while (i12 < arrayList.size()) {
                long j10 = ((org.telegram.messenger.pr) arrayList.get(i12)).a;
                if (charSequence != null) {
                    org.telegram.messenger.yy.C(org.telegram.messenger.c.a(i11).a).r0(org.telegram.messenger.wy.b(charSequence.toString(), j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                org.telegram.messenger.yy.C(org.telegram.messenger.c.a(i11).a).q0(arrayList2, j10, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                i12++;
                z12 = z12;
            }
            boolean z13 = z12;
            uwVar.finishFragment();
            return z13;
        }
        long j11 = ((org.telegram.messenger.pr) arrayList.get(0)).a;
        Bundle k10 = a1.g.k("scrollToTopOnResume", true);
        if (org.telegram.messenger.m5.C(j11)) {
            k10.putInt("enc_id", (int) (4294967295L & j11));
        } else {
            if (org.telegram.messenger.m5.E(j11)) {
                k10.putLong("user_id", j11);
            } else {
                k10.putLong("chat_id", -j11);
            }
            if (!org.telegram.messenger.hp.s1(org.telegram.messenger.c.a(i11).a).E(k10, uwVar, null, null)) {
                return true;
            }
        }
        org.telegram.ui.wm wmVar = new org.telegram.ui.wm(k10);
        uwVar.presentFragment(wmVar, true);
        wmVar.dc(arrayList2);
        return true;
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void D(ImageReceiver imageReceiver) {
    }

    @Override // kg.u1
    public /* synthetic */ void b2(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.l70
    public /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.l70
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.l70
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.tt0
    public /* synthetic */ void p() {
    }

    @Override // qe.b
    public /* synthetic */ void F(float f10, int i3) {
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void F0(int i3, Drawable drawable) {
    }
}
