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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ky implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.w10, jg.y1, te.b, org.telegram.messenger.j9, f80, sd0, sj0, org.telegram.ui.ww, fi.x6, org.telegram.messenger.sr, l71, org.telegram.messenger.oc, gu0, org.telegram.messenger.kc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ky(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        ((k90) this.b).c0();
    }

    @Override // jg.y1
    public /* synthetic */ a0.h K0() {
        return null;
    }

    @Override // org.telegram.ui.ww
    public /* synthetic */ boolean P(org.telegram.ui.cx cxVar) {
        return false;
    }

    @Override // org.telegram.messenger.sr
    public void a(String str) {
        fi.p6 storiesController;
        switch (this.a) {
            case 19:
                jt0 jt0Var = ((iq0) this.b).d;
                storiesController = jt0Var.getStoriesController();
                storiesController.r(jt0Var.m1, str, new gp0(jt0Var, 1));
                break;
            default:
                m31 m31Var = (m31) this.b;
                m31Var.a2 = str;
                m31Var.f2.O(true);
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

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        fi0 fi0Var;
        switch (this.a) {
            case 14:
                gi0 gi0Var = (gi0) this.b;
                ArrayList arrayList = gi0Var.n;
                if (gi0Var.f.d(i7) != 0 || (fi0Var = gi0Var.G) == null) {
                    return true;
                }
                fi0Var.a(org.telegram.messenger.gj.B1(((TLRPC.MessagePeerReaction) arrayList.get(i7)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i7));
                return true;
            default:
                sl0 sl0Var = (sl0) this.b;
                di.l4 l4Var = sl0Var.c;
                org.telegram.messenger.gj E = l4Var.E(i7);
                sl0 sl0Var2 = (sl0) l4Var.d;
                if (E == null) {
                    return false;
                }
                if (!sl0Var.J.V1()) {
                    sl0Var.J.n();
                    l4Var.k(0, sl0Var2.r);
                }
                if (sl0Var.J.V1()) {
                    sl0Var.J.Z0(E, view, 0);
                    if (!sl0Var.J.V1()) {
                        l4Var.k(0, sl0Var2.r);
                    }
                    org.telegram.ui.vz vzVar = sl0Var.K;
                    int e12 = E.e1();
                    vzVar.a = org.telegram.messenger.gj.B0(E.k);
                    vzVar.b = e12;
                }
                return true;
        }
    }

    @Override // jg.y1
    public /* synthetic */ a0.h d1() {
        return null;
    }

    @Override // org.telegram.ui.Components.f80
    public void e() {
        ((yc0) this.b).L0(true);
    }

    @Override // org.telegram.ui.Components.l71
    public void g(int i7, int i10) {
        du0 du0Var = (du0) this.b;
        du0Var.x = i7;
        du0Var.y = i10;
        bi.m3 m3Var = du0Var.M;
        if (m3Var != null) {
            m3Var.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(((ly) this.b).w.d1);
                d02.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new org.telegram.messenger.jh(d02, 1));
                break;
            case 2:
                ((org.telegram.ui.f0) this.b).run();
                break;
            case 3:
                ((r10) this.b).K0();
                break;
            case 5:
                l60 l60Var = (l60) this.b;
                a0.h hVar = l60Var.a2;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    arrayList.add(org.telegram.messenger.np.u1(l60Var.a).c2(Long.valueOf(hVar.j(i10))));
                }
                org.telegram.ui.u40 u40Var = l60Var.g2;
                if (u40Var != null) {
                    u40Var.i(0, arrayList);
                }
                l60Var.dismiss();
                break;
            case 21:
                mw0 mw0Var = (mw0) this.b;
                mw0Var.e.presentFragment(new StickersActivity(mw0Var.d, null));
                t1Var.dismiss();
                break;
            default:
                org.telegram.messenger.g0.v1((nw0) this.b);
                t1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.sd0
    public void j(int i7, int i10) {
        ee0 ee0Var = (ee0) ((org.telegram.ui.l4) this.b).e;
        if (i7 == ee0Var.b) {
            ee0Var.H = i10;
        } else if (i7 == ee0Var.r) {
            ee0Var.Q = i10;
        } else if (i7 == ee0Var.d) {
            ee0Var.J = i10;
        } else if (i7 == ee0Var.c) {
            ee0Var.I = i10;
        } else if (i7 == ee0Var.f) {
            ee0Var.K = i10;
        } else if (i7 == ee0Var.e) {
            ee0Var.L = i10;
        } else if (i7 == ee0Var.w) {
            ee0Var.S = i10;
        } else if (i7 == ee0Var.s) {
            ee0Var.R = i10;
        } else if (i7 == ee0Var.x) {
            ee0Var.T = i10;
        } else if (i7 == ee0Var.y) {
            ee0Var.V = i10;
        } else if (i7 == ee0Var.h) {
            ee0Var.M = i10;
        } else if (i7 == ee0Var.n) {
            ee0Var.N = i10;
        }
        ez ezVar = ee0Var.m0;
        if (ezVar != null) {
            ezVar.c(true, false, false);
        }
        ee0Var.d();
    }

    @Override // org.telegram.ui.Components.gu0
    public void k(int i7) {
        org.telegram.messenger.y10 y10Var = ((o41) this.b).D;
        if (y10Var != null) {
            y10Var.a(Integer.valueOf(i7));
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
    @Override // org.telegram.messenger.w10
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
                oy oyVar = (oy) this.b;
                o41 o41Var = (o41) obj;
                View view = (View) obj2;
                ox oxVar = oyVar.c;
                ty tyVar = oyVar.R;
                Object obj3 = o41Var.H;
                if (obj3 instanceof TLRPC.StickerSetCovered) {
                    mx mxVar = (mx) o41Var.I;
                    long j10 = oyVar.d;
                    stickerSet = ((TLRPC.StickerSetCovered) obj3).set;
                    long j11 = stickerSet.id;
                    if (j10 == j11) {
                        oyVar.d = 0L;
                        stickerSet = null;
                        childCount = oxVar.getChildCount();
                        for (i7 = 0; i7 < childCount; i7++) {
                            ph.b bVar = (ph.b) oxVar.getChildAt(i7);
                            if (bVar != view) {
                                bVar.a(false, true);
                            }
                        }
                        if (oyVar.d != 0 || oyVar.f.size() >= oyVar.e.count) {
                            j3 = 0;
                        } else {
                            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(tyVar.d1);
                            TLRPC.StickerSet stickerSet2 = oyVar.e;
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            j3 = 0;
                            tL_inputStickerSetID.id = stickerSet2.id;
                            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                            TLRPC.TL_messages_stickerSet o02 = d02.o0(tL_inputStickerSetID, false);
                            if (o02 != null) {
                                oyVar.f = o02.documents;
                            }
                        }
                        TLObject tLObject = (TLObject) o41Var.H;
                        document = null;
                        TLRPC.StickerSet stickerSet3 = stickerSet;
                        ph.a aVar = tyVar.O;
                        te.a aVar2 = tyVar.a;
                        arrayList = oyVar.f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            document = (TLRPC.Document) oyVar.f.get(0);
                        }
                        tyVar.K(aVar, tLObject, stickerSet3, document, false, aVar2.e <= 0.0f);
                        ((ph.b) view).a(oyVar.d == j3, true);
                        aVar2.a(oyVar.d != j3, true);
                        oyVar.f();
                        tyVar.H0.b();
                        if (oyVar.d == j3) {
                            oxVar.L1(view);
                            break;
                        }
                    } else {
                        oyVar.d = j11;
                        oyVar.f = mxVar.d;
                        oyVar.e = stickerSet;
                        childCount = oxVar.getChildCount();
                        while (i7 < childCount) {
                        }
                        if (oyVar.d != 0) {
                        }
                        j3 = 0;
                        TLObject tLObject2 = (TLObject) o41Var.H;
                        document = null;
                        TLRPC.StickerSet stickerSet32 = stickerSet;
                        ph.a aVar3 = tyVar.O;
                        te.a aVar22 = tyVar.a;
                        arrayList = oyVar.f;
                        if (arrayList != null) {
                            document = (TLRPC.Document) oyVar.f.get(0);
                        }
                        tyVar.K(aVar3, tLObject2, stickerSet32, document, false, aVar22.e <= 0.0f);
                        ((ph.b) view).a(oyVar.d == j3, true);
                        aVar22.a(oyVar.d != j3, true);
                        oyVar.f();
                        tyVar.H0.b();
                        if (oyVar.d == j3) {
                        }
                    }
                } else {
                    if (obj3 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
                        long j12 = oyVar.d;
                        TLRPC.StickerSet stickerSet4 = tL_messages_stickerSet.set;
                        long j13 = stickerSet4.id;
                        if (j12 == j13) {
                            oyVar.d = 0L;
                        } else {
                            oyVar.d = j13;
                            oyVar.f = tL_messages_stickerSet.documents;
                            oyVar.e = stickerSet4;
                            stickerSet = stickerSet4;
                            childCount = oxVar.getChildCount();
                            while (i7 < childCount) {
                            }
                            if (oyVar.d != 0) {
                            }
                            j3 = 0;
                            TLObject tLObject22 = (TLObject) o41Var.H;
                            document = null;
                            TLRPC.StickerSet stickerSet322 = stickerSet;
                            ph.a aVar32 = tyVar.O;
                            te.a aVar222 = tyVar.a;
                            arrayList = oyVar.f;
                            if (arrayList != null) {
                            }
                            tyVar.K(aVar32, tLObject22, stickerSet322, document, false, aVar222.e <= 0.0f);
                            ((ph.b) view).a(oyVar.d == j3, true);
                            aVar222.a(oyVar.d != j3, true);
                            oyVar.f();
                            tyVar.H0.b();
                            if (oyVar.d == j3) {
                            }
                        }
                    }
                    stickerSet = null;
                    childCount = oxVar.getChildCount();
                    while (i7 < childCount) {
                    }
                    if (oyVar.d != 0) {
                    }
                    j3 = 0;
                    TLObject tLObject222 = (TLObject) o41Var.H;
                    document = null;
                    TLRPC.StickerSet stickerSet3222 = stickerSet;
                    ph.a aVar322 = tyVar.O;
                    te.a aVar2222 = tyVar.a;
                    arrayList = oyVar.f;
                    if (arrayList != null) {
                    }
                    tyVar.K(aVar322, tLObject222, stickerSet3222, document, false, aVar2222.e <= 0.0f);
                    ((ph.b) view).a(oyVar.d == j3, true);
                    aVar2222.a(oyVar.d != j3, true);
                    oyVar.f();
                    tyVar.H0.b();
                    if (oyVar.d == j3) {
                    }
                }
                break;
            case 11:
                of0 of0Var = (of0) this.b;
                Object obj4 = ((o41) obj).H;
                if (obj4 instanceof org.telegram.messenger.gj) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj4;
                    Bundle bundle = new Bundle();
                    if (org.telegram.messenger.gj.B0(gjVar.k) >= 0) {
                        bundle.putLong("user_id", org.telegram.messenger.gj.B0(gjVar.k));
                    } else {
                        bundle.putLong("chat_id", -org.telegram.messenger.gj.B0(gjVar.k));
                    }
                    bundle.putInt("message_id", gjVar.e1());
                    org.telegram.ui.bn bnVar = new org.telegram.ui.bn(bundle);
                    org.telegram.ui.cx cxVar = of0Var.a;
                    org.telegram.ui.cx.r4(bnVar, gjVar);
                    cxVar.presentFragment(bnVar);
                    break;
                }
                break;
            default:
                ek0 ek0Var = (ek0) this.b;
                Canvas canvas = (Canvas) obj;
                RectF rectF = (RectF) obj2;
                float floatValue = ((Float) number).floatValue();
                float floatValue2 = ((Float) serializable).floatValue();
                float floatValue3 = ((Float) serializable2).floatValue();
                org.telegram.ui.ActionBar.h6 h6Var = ek0Var.o2;
                Paint paint = ek0.c3;
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                paint.setColor(org.telegram.ui.ActionBar.m6.r1(floatValue3, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, h6Var)));
                if (floatValue > 0.0f || floatValue2 > 0.0f) {
                    if (floatValue == floatValue2) {
                        canvas.drawRoundRect(rectF, floatValue, floatValue, paint);
                        break;
                    } else {
                        Path path = ek0.d3;
                        path.rewind();
                        float[] fArr = ek0.e3;
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
    public Object m(Object obj) {
        return Float.valueOf(((r1.f) this.b).a / 100.0f);
    }

    @Override // org.telegram.messenger.kc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        n61 n61Var;
        int i7;
        int i10;
        double ceil;
        o61 o61Var = (o61) this.b;
        ImageReceiver imageReceiver2 = o61Var.R;
        if (z10) {
            if (o61Var.O == null && o61Var.e0 == null) {
                return;
            }
            int L = org.telegram.messenger.g0.L(150.0f);
            org.telegram.ui.dq0 dq0Var = o61Var.O;
            if (dq0Var != null) {
                int i11 = (int) o61Var.P;
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
                org.telegram.ui.dq0 dq0Var2 = o61Var.O;
                int i12 = (int) o61Var.P;
                int videoDuration2 = dq0Var2.getVideoDuration() / 1000;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i12)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i12 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i12 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i12 / 5.0f)) % 25 : ((int) Math.ceil(i12 / 10.0f)) % 25, i10 - 1);
                o61Var.S = (int) ((min % 5) * q10);
                o61Var.T = (int) ((min / 5) * o4);
                o61Var.U = (int) q10;
                o61Var.V = (int) o4;
            } else {
                z13 = true;
                int i13 = 0;
                while (true) {
                    if (i13 >= o61Var.e0.size()) {
                        n61Var = null;
                        break;
                    }
                    n61Var = (n61) o61Var.e0.get(i13);
                    double d = i13 == 0 ? 0.0d : n61Var.a;
                    double d2 = i13 == o61Var.e0.size() + (-1) ? 9.9999999E7d : ((n61) o61Var.e0.get(i13 + 1)).a;
                    double d10 = o61Var.P;
                    if (d10 >= d && d10 <= d2) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (n61Var == null) {
                    return;
                }
                o61Var.S = n61Var.b;
                o61Var.T = n61Var.c;
                o61Var.U = o61Var.c0;
                o61Var.V = o61Var.d0;
            }
            o61Var.Q = z13;
            float f10 = o61Var.U / o61Var.V;
            if (f10 > 1.0f) {
                i7 = (int) (L / f10);
            } else {
                L = (int) (L * f10);
                i7 = L;
            }
            ViewGroup.LayoutParams layoutParams = o61Var.getLayoutParams();
            if (o61Var.getVisibility() == 0 && layoutParams.width == L && layoutParams.height == i7) {
                return;
            }
            layoutParams.width = L;
            layoutParams.height = i7;
            o61Var.setVisibility(0);
            o61Var.requestLayout();
        }
    }

    @Override // jg.y1
    public void r(int i7) {
        g60 g60Var = (g60) this.b;
        l60 l60Var = g60Var.n;
        l60Var.P0(g60Var.f - 1);
        if (g60Var.h == null && !g60Var.e.e() && g60Var.b() <= 2) {
            l60Var.u1.e(false, true);
        }
        g60Var.f();
    }

    @Override // jg.y1
    public /* synthetic */ boolean v1(int i7) {
        return true;
    }

    @Override // org.telegram.ui.ww
    public boolean y(org.telegram.ui.cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        um0 um0Var = (um0) this.b;
        int i11 = um0Var.K0;
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = um0Var.C0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((org.telegram.messenger.gj) hashMap.get((org.telegram.ui.vz) it.next()));
        }
        hashMap.clear();
        um0Var.N(false);
        boolean z12 = true;
        if (arrayList.size() > 1 || ((org.telegram.messenger.tr) arrayList.get(0)).a == org.telegram.messenger.k10.i(org.telegram.messenger.c.a(i11).a).e() || charSequence != null) {
            int i12 = 0;
            while (i12 < arrayList.size()) {
                long j3 = ((org.telegram.messenger.tr) arrayList.get(i12)).a;
                if (charSequence != null) {
                    org.telegram.messenger.az.C(org.telegram.messenger.c.a(i11).a).r0(org.telegram.messenger.yy.b(charSequence.toString(), j3, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                org.telegram.messenger.az.C(org.telegram.messenger.c.a(i11).a).q0(arrayList2, j3, false, false, true, 0, 0, null, -1, 0L, 0L, null);
                i12++;
                z12 = z12;
            }
            boolean z13 = z12;
            cxVar.finishFragment();
            return z13;
        }
        long j10 = ((org.telegram.messenger.tr) arrayList.get(0)).a;
        Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
        if (org.telegram.messenger.n5.C(j10)) {
            k10.putInt("enc_id", (int) (4294967295L & j10));
        } else {
            if (org.telegram.messenger.n5.E(j10)) {
                k10.putLong("user_id", j10);
            } else {
                k10.putLong("chat_id", -j10);
            }
            if (!org.telegram.messenger.np.u1(org.telegram.messenger.c.a(i11).a).E(k10, cxVar, null, null)) {
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

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void V(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.ui.Components.f80
    public /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.f80
    public /* synthetic */ void f() {
    }

    @Override // org.telegram.ui.Components.f80
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.gu0
    public /* synthetic */ void o() {
    }

    @Override // te.b
    public /* synthetic */ void D(float f10, int i7) {
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
    }
}
