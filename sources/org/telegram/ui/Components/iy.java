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
import org.telegram.ui.y91;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class iy implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.v10, jg.y1, te.b, org.telegram.messenger.i9, d80, rd0, qj0, org.telegram.ui.ww, fi.x6, org.telegram.messenger.rr, i71, org.telegram.messenger.nc, du0, org.telegram.messenger.jc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iy(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        ((i90) this.b).c0();
    }

    @Override // jg.y1
    public /* synthetic */ a0.h K0() {
        return null;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean P(org.telegram.ui.cx cxVar) {
        return false;
    }

    @Override // org.telegram.messenger.rr
    public void a(String str) {
        fi.p6 storiesController;
        switch (this.a) {
            case 19:
                gt0 gt0Var = ((gq0) this.b).d;
                storiesController = gt0Var.getStoriesController();
                storiesController.r(gt0Var.m1, str, new ep0(gt0Var, 1));
                break;
            default:
                k31 k31Var = (k31) this.b;
                k31Var.a2 = str;
                k31Var.f2.O(true);
                break;
        }
    }

    @Override // fi.x6
    public void b(boolean z10) {
        fi.h6 h6Var = (fi.h6) this.b;
        if (z10) {
            h6Var.p(30, false);
        }
    }

    @Override // org.telegram.ui.Components.qj0
    public boolean c(int i7, View view) {
        di0 di0Var;
        switch (this.a) {
            case 14:
                ei0 ei0Var = (ei0) this.b;
                ArrayList arrayList = ei0Var.n;
                if (ei0Var.f.d(i7) != 0 || (di0Var = ei0Var.G) == null) {
                    return true;
                }
                di0Var.a(org.telegram.messenger.fj.B1(((TLRPC.MessagePeerReaction) arrayList.get(i7)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i7));
                return true;
            default:
                ql0 ql0Var = (ql0) this.b;
                di.l4 l4Var = ql0Var.c;
                org.telegram.messenger.fj E = l4Var.E(i7);
                ql0 ql0Var2 = (ql0) l4Var.d;
                if (E == null) {
                    return false;
                }
                if (!ql0Var.J.V1()) {
                    ql0Var.J.n();
                    l4Var.k(0, ql0Var2.r);
                }
                if (ql0Var.J.V1()) {
                    ql0Var.J.Z0(E, view, 0);
                    if (!ql0Var.J.V1()) {
                        l4Var.k(0, ql0Var2.r);
                    }
                    org.telegram.ui.vz vzVar = ql0Var.K;
                    int e12 = E.e1();
                    vzVar.a = org.telegram.messenger.fj.B0(E.k);
                    vzVar.b = e12;
                }
                return true;
        }
    }

    @Override // jg.y1
    public /* synthetic */ a0.h d1() {
        return null;
    }

    @Override // org.telegram.ui.Components.d80
    public void e() {
        ((xc0) this.b).L0(true);
    }

    @Override // org.telegram.ui.Components.i71
    public void g(int i7, int i10) {
        au0 au0Var = (au0) this.b;
        au0Var.x = i7;
        au0Var.y = i10;
        bi.i3 i3Var = au0Var.M;
        if (i3Var != null) {
            i3Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(((jy) this.b).w.d1);
                d02.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new org.telegram.messenger.ih(d02, 1));
                break;
            case 2:
                ((org.telegram.ui.b0) this.b).run();
                break;
            case 3:
                ((o10) this.b).K0();
                break;
            case 5:
                j60 j60Var = (j60) this.b;
                a0.h hVar = j60Var.a2;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    arrayList.add(org.telegram.messenger.mp.u1(j60Var.a).c2(Long.valueOf(hVar.j(i10))));
                }
                org.telegram.ui.u40 u40Var = j60Var.g2;
                if (u40Var != null) {
                    u40Var.i(0, arrayList);
                }
                j60Var.dismiss();
                break;
            case 21:
                kw0 kw0Var = (kw0) this.b;
                kw0Var.e.presentFragment(new StickersActivity(kw0Var.d, null));
                u1Var.dismiss();
                break;
            default:
                org.telegram.messenger.g0.v1((lw0) this.b);
                u1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.rd0
    public void j(int i7, int i10) {
        de0 de0Var = (de0) ((org.telegram.ui.l4) this.b).e;
        if (i7 == de0Var.b) {
            de0Var.H = i10;
        } else if (i7 == de0Var.r) {
            de0Var.Q = i10;
        } else if (i7 == de0Var.d) {
            de0Var.J = i10;
        } else if (i7 == de0Var.c) {
            de0Var.I = i10;
        } else if (i7 == de0Var.f) {
            de0Var.K = i10;
        } else if (i7 == de0Var.e) {
            de0Var.L = i10;
        } else if (i7 == de0Var.w) {
            de0Var.S = i10;
        } else if (i7 == de0Var.s) {
            de0Var.R = i10;
        } else if (i7 == de0Var.x) {
            de0Var.T = i10;
        } else if (i7 == de0Var.y) {
            de0Var.V = i10;
        } else if (i7 == de0Var.h) {
            de0Var.M = i10;
        } else if (i7 == de0Var.n) {
            de0Var.N = i10;
        }
        cz czVar = de0Var.m0;
        if (czVar != null) {
            czVar.c(true, false, false);
        }
        de0Var.d();
    }

    @Override // org.telegram.ui.Components.du0
    public void k(int i7) {
        org.telegram.messenger.x10 x10Var = ((l41) this.b).D;
        if (x10Var != null) {
            x10Var.a(Integer.valueOf(i7));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b0  */
    @Override // org.telegram.messenger.v10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        TLRPC.StickerSet stickerSet;
        int childCount;
        int i7;
        long j3;
        TLRPC.Document document;
        ArrayList arrayList;
        switch (this.a) {
            case 1:
                my myVar = (my) this.b;
                l41 l41Var = (l41) obj;
                View view = (View) obj2;
                mx mxVar = myVar.c;
                ry ryVar = myVar.R;
                Object obj3 = l41Var.H;
                if (obj3 instanceof TLRPC.StickerSetCovered) {
                    kx kxVar = (kx) l41Var.I;
                    long j10 = myVar.d;
                    stickerSet = ((TLRPC.StickerSetCovered) obj3).set;
                    long j11 = stickerSet.id;
                    if (j10 == j11) {
                        myVar.d = 0L;
                        stickerSet = null;
                        childCount = mxVar.getChildCount();
                        for (i7 = 0; i7 < childCount; i7++) {
                            ph.b bVar = (ph.b) mxVar.getChildAt(i7);
                            if (bVar != view) {
                                bVar.a(false, true);
                            }
                        }
                        if (myVar.d != 0 || myVar.f.size() >= myVar.e.count) {
                            j3 = 0;
                        } else {
                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(ryVar.d1);
                            TLRPC.StickerSet stickerSet2 = myVar.e;
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            j3 = 0;
                            tL_inputStickerSetID.id = stickerSet2.id;
                            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                            TLRPC.TL_messages_stickerSet o02 = d02.o0(tL_inputStickerSetID, false);
                            if (o02 != null) {
                                myVar.f = o02.documents;
                            }
                        }
                        TLObject tLObject = (TLObject) l41Var.H;
                        document = null;
                        TLRPC.StickerSet stickerSet3 = stickerSet;
                        ph.a aVar = ryVar.O;
                        te.a aVar2 = ryVar.a;
                        arrayList = myVar.f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            document = (TLRPC.Document) myVar.f.get(0);
                        }
                        ryVar.K(aVar, tLObject, stickerSet3, document, false, aVar2.e <= 0.0f);
                        ((ph.b) view).a(myVar.d == j3, true);
                        aVar2.a(myVar.d != j3, true);
                        myVar.f();
                        ryVar.H0.b();
                        if (myVar.d == j3) {
                            mxVar.L1(view);
                            break;
                        }
                    } else {
                        myVar.d = j11;
                        myVar.f = kxVar.d;
                        myVar.e = stickerSet;
                        childCount = mxVar.getChildCount();
                        while (i7 < childCount) {
                        }
                        if (myVar.d != 0) {
                        }
                        j3 = 0;
                        TLObject tLObject2 = (TLObject) l41Var.H;
                        document = null;
                        TLRPC.StickerSet stickerSet32 = stickerSet;
                        ph.a aVar3 = ryVar.O;
                        te.a aVar22 = ryVar.a;
                        arrayList = myVar.f;
                        if (arrayList != null) {
                            document = (TLRPC.Document) myVar.f.get(0);
                        }
                        ryVar.K(aVar3, tLObject2, stickerSet32, document, false, aVar22.e <= 0.0f);
                        ((ph.b) view).a(myVar.d == j3, true);
                        aVar22.a(myVar.d != j3, true);
                        myVar.f();
                        ryVar.H0.b();
                        if (myVar.d == j3) {
                        }
                    }
                } else {
                    if (obj3 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
                        long j12 = myVar.d;
                        TLRPC.StickerSet stickerSet4 = tL_messages_stickerSet.set;
                        long j13 = stickerSet4.id;
                        if (j12 == j13) {
                            myVar.d = 0L;
                        } else {
                            myVar.d = j13;
                            myVar.f = tL_messages_stickerSet.documents;
                            myVar.e = stickerSet4;
                            stickerSet = stickerSet4;
                            childCount = mxVar.getChildCount();
                            while (i7 < childCount) {
                            }
                            if (myVar.d != 0) {
                            }
                            j3 = 0;
                            TLObject tLObject22 = (TLObject) l41Var.H;
                            document = null;
                            TLRPC.StickerSet stickerSet322 = stickerSet;
                            ph.a aVar32 = ryVar.O;
                            te.a aVar222 = ryVar.a;
                            arrayList = myVar.f;
                            if (arrayList != null) {
                            }
                            ryVar.K(aVar32, tLObject22, stickerSet322, document, false, aVar222.e <= 0.0f);
                            ((ph.b) view).a(myVar.d == j3, true);
                            aVar222.a(myVar.d != j3, true);
                            myVar.f();
                            ryVar.H0.b();
                            if (myVar.d == j3) {
                            }
                        }
                    }
                    stickerSet = null;
                    childCount = mxVar.getChildCount();
                    while (i7 < childCount) {
                    }
                    if (myVar.d != 0) {
                    }
                    j3 = 0;
                    TLObject tLObject222 = (TLObject) l41Var.H;
                    document = null;
                    TLRPC.StickerSet stickerSet3222 = stickerSet;
                    ph.a aVar322 = ryVar.O;
                    te.a aVar2222 = ryVar.a;
                    arrayList = myVar.f;
                    if (arrayList != null) {
                    }
                    ryVar.K(aVar322, tLObject222, stickerSet3222, document, false, aVar2222.e <= 0.0f);
                    ((ph.b) view).a(myVar.d == j3, true);
                    aVar2222.a(myVar.d != j3, true);
                    myVar.f();
                    ryVar.H0.b();
                    if (myVar.d == j3) {
                    }
                }
                break;
            case 11:
                mf0 mf0Var = (mf0) this.b;
                Object obj4 = ((l41) obj).H;
                if (obj4 instanceof org.telegram.messenger.fj) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj4;
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.fj.B0(fjVar.k) >= 0) {
                        bundle.putLong("user_id", org.telegram.messenger.fj.B0(fjVar.k));
                    } else {
                        bundle.putLong("chat_id", -org.telegram.messenger.fj.B0(fjVar.k));
                    }
                    bundle.putInt("message_id", fjVar.e1());
                    org.telegram.ui.bn bnVar = new org.telegram.ui.bn(bundle);
                    org.telegram.ui.cx cxVar = mf0Var.a;
                    org.telegram.ui.cx.r4(bnVar, fjVar);
                    cxVar.presentFragment(bnVar);
                    break;
                }
                break;
            default:
                ck0 ck0Var = (ck0) this.b;
                Canvas canvas = (Canvas) obj;
                RectF rectF = (RectF) obj2;
                float floatValue = ((Float) number).floatValue();
                float floatValue2 = ((Float) serializable).floatValue();
                float floatValue3 = ((Float) serializable2).floatValue();
                org.telegram.ui.ActionBar.i6 i6Var = ck0Var.o2;
                Paint paint = ck0.c3;
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                paint.setColor(org.telegram.ui.ActionBar.n6.r1(floatValue3, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, i6Var)));
                if (floatValue > 0.0f || floatValue2 > 0.0f) {
                    if (floatValue == floatValue2) {
                        canvas.drawRoundRect(rectF, floatValue, floatValue, paint);
                        break;
                    } else {
                        Path path = ck0.d3;
                        path.rewind();
                        float[] fArr = ck0.e3;
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

    @Override // org.telegram.messenger.i9
    public Object m(Object obj) {
        return Float.valueOf(((r1.f) this.b).a / 100.0f);
    }

    @Override // org.telegram.messenger.jc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        k61 k61Var;
        int i7;
        int i10;
        double ceil;
        l61 l61Var = (l61) this.b;
        ImageReceiver imageReceiver2 = l61Var.R;
        if (z10) {
            if (l61Var.O == null && l61Var.e0 == null) {
                return;
            }
            int L = org.telegram.messenger.g0.L(150.0f);
            org.telegram.ui.dq0 dq0Var = l61Var.O;
            if (dq0Var != null) {
                int i11 = (int) l61Var.P;
                ArrayList arrayList = dq0Var.w;
                int indexOf = arrayList.indexOf(dq0Var.c(i11));
                if (indexOf == -1) {
                    z13 = true;
                    i10 = 0;
                } else if (indexOf == arrayList.size() - 1) {
                    int videoDuration = dq0Var.getVideoDuration() / 1000;
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
                org.telegram.ui.dq0 dq0Var2 = l61Var.O;
                int i12 = (int) l61Var.P;
                int videoDuration2 = dq0Var2.getVideoDuration() / 1000;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i12)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i12 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i12 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i12 / 5.0f)) % 25 : ((int) Math.ceil(i12 / 10.0f)) % 25, i10 - 1);
                l61Var.S = (int) ((min % 5) * q10);
                l61Var.T = (int) ((min / 5) * o4);
                l61Var.U = (int) q10;
                l61Var.V = (int) o4;
            } else {
                z13 = true;
                int i13 = 0;
                while (true) {
                    if (i13 >= l61Var.e0.size()) {
                        k61Var = null;
                        break;
                    }
                    k61Var = (k61) l61Var.e0.get(i13);
                    double d = i13 == 0 ? 0.0d : k61Var.a;
                    double d2 = i13 == l61Var.e0.size() + (-1) ? 9.9999999E7d : ((k61) l61Var.e0.get(i13 + 1)).a;
                    double d10 = l61Var.P;
                    if (d10 >= d && d10 <= d2) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (k61Var == null) {
                    return;
                }
                l61Var.S = k61Var.b;
                l61Var.T = k61Var.c;
                l61Var.U = l61Var.c0;
                l61Var.V = l61Var.d0;
            }
            l61Var.Q = z13;
            float f10 = l61Var.U / l61Var.V;
            if (f10 > 1.0f) {
                i7 = (int) (L / f10);
            } else {
                L = (int) (L * f10);
                i7 = L;
            }
            ViewGroup.LayoutParams layoutParams = l61Var.getLayoutParams();
            if (l61Var.getVisibility() == 0 && layoutParams.width == L && layoutParams.height == i7) {
                return;
            }
            layoutParams.width = L;
            layoutParams.height = i7;
            l61Var.setVisibility(0);
            l61Var.requestLayout();
        }
    }

    @Override // jg.y1
    public void r(int i7) {
        d60 d60Var = (d60) this.b;
        j60 j60Var = d60Var.n;
        j60Var.P0(d60Var.f - 1);
        if (d60Var.h == null && !d60Var.e.e() && d60Var.b() <= 2) {
            j60Var.u1.e(false, true);
        }
        d60Var.f();
    }

    @Override // jg.y1
    public /* synthetic */ boolean v1(int i7) {
        return true;
    }

    @Override // org.telegram.ui.ww
    public boolean y(org.telegram.ui.cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        rm0 rm0Var = (rm0) this.b;
        int i11 = rm0Var.K0;
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = rm0Var.C0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((org.telegram.messenger.fj) hashMap.get((org.telegram.ui.vz) it.next()));
        }
        hashMap.clear();
        rm0Var.N(false);
        boolean z12 = true;
        if (arrayList.size() > 1 || ((org.telegram.messenger.sr) arrayList.get(0)).a == org.telegram.messenger.j10.i(org.telegram.messenger.c.a(i11).a).e() || charSequence != null) {
            int i12 = 0;
            while (i12 < arrayList.size()) {
                long j3 = ((org.telegram.messenger.sr) arrayList.get(i12)).a;
                if (charSequence != null) {
                    org.telegram.messenger.zy.C(org.telegram.messenger.c.a(i11).a).r0(org.telegram.messenger.xy.b(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                org.telegram.messenger.zy.C(org.telegram.messenger.c.a(i11).a).q0(arrayList2, j3, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                i12++;
                z12 = z12;
            }
            boolean z13 = z12;
            cxVar.finishFragment();
            return z13;
        }
        long j10 = ((org.telegram.messenger.sr) arrayList.get(0)).a;
        Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
        if (org.telegram.messenger.n5.C(j10)) {
            k10.putInt("enc_id", (int) (4294967295L & j10));
        } else {
            if (org.telegram.messenger.n5.E(j10)) {
                k10.putLong("user_id", j10);
            } else {
                k10.putLong("chat_id", -j10);
            }
            if (!org.telegram.messenger.mp.u1(org.telegram.messenger.c.a(i11).a).E(k10, cxVar, null, null)) {
                return true;
            }
        }
        org.telegram.ui.bn bnVar = new org.telegram.ui.bn(k10);
        cxVar.presentFragment(bnVar, true);
        bnVar.hc(arrayList2);
        return true;
    }

    @Override // jg.y1
    public /* synthetic */ void P1(ArrayList arrayList) {
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void V(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.ui.Components.d80
    public /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.d80
    public /* synthetic */ void f() {
    }

    @Override // org.telegram.ui.Components.d80
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.du0
    public /* synthetic */ void o() {
    }

    @Override // te.b
    public /* synthetic */ void D(float f10, int i7) {
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
    }
}
