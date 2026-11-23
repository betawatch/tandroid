package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
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
import org.telegram.ui.w91;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hy implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.u10, jg.y1, te.b, org.telegram.messenger.i9, c80, rd0, sj0, org.telegram.ui.vw, fi.x6, org.telegram.messenger.rr, m71, org.telegram.messenger.nc, fu0, hi.n7, hi.m7, org.telegram.messenger.jc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hy(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.vw
    public /* synthetic */ boolean F() {
        return false;
    }

    @Override // te.b
    public void K(int i7, float f10, float f11, te.c cVar) {
        ((h90) this.b).c0();
    }

    @Override // org.telegram.ui.vw
    public /* synthetic */ boolean O(org.telegram.ui.bx bxVar) {
        return false;
    }

    @Override // jg.y1
    public /* synthetic */ boolean W1(int i7) {
        return true;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h Y0() {
        return null;
    }

    @Override // org.telegram.messenger.rr
    public void a(String str) {
        fi.p6 storiesController;
        switch (this.a) {
            case 19:
                it0 it0Var = ((hq0) this.b).d;
                storiesController = it0Var.getStoriesController();
                storiesController.r(it0Var.m1, str, new fp0(it0Var, 1));
                break;
            default:
                l31 l31Var = (l31) this.b;
                l31Var.a2 = str;
                l31Var.f2.O(true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean b(int i7, View view) {
        fi0 fi0Var;
        switch (this.a) {
            case 14:
                gi0 gi0Var = (gi0) this.b;
                ArrayList arrayList = gi0Var.n;
                if (gi0Var.f.d(i7) != 0 || (fi0Var = gi0Var.G) == null) {
                    return true;
                }
                fi0Var.a(org.telegram.messenger.fj.B1(((TLRPC.MessagePeerReaction) arrayList.get(i7)).peer_id), (TLRPC.MessagePeerReaction) arrayList.get(i7));
                return true;
            default:
                sl0 sl0Var = (sl0) this.b;
                di.l4 l4Var = sl0Var.c;
                org.telegram.messenger.fj E = l4Var.E(i7);
                sl0 sl0Var2 = (sl0) l4Var.d;
                if (E == null) {
                    return false;
                }
                if (!sl0Var.J.i0()) {
                    sl0Var.J.h();
                    l4Var.k(0, sl0Var2.r);
                }
                if (sl0Var.J.i0()) {
                    sl0Var.J.S(E, view, 0);
                    if (!sl0Var.J.i0()) {
                        l4Var.k(0, sl0Var2.r);
                    }
                    org.telegram.ui.uz uzVar = sl0Var.K;
                    int e12 = E.e1();
                    uzVar.a = org.telegram.messenger.fj.B0(E.k);
                    uzVar.b = e12;
                }
                return true;
        }
    }

    @Override // fi.x6
    public void c(boolean z10) {
        fi.h6 h6Var = (fi.h6) this.b;
        if (z10) {
            h6Var.p(30, false);
        }
    }

    @Override // org.telegram.ui.Components.c80
    public void e() {
        ((wc0) this.b).L0(true);
    }

    @Override // org.telegram.ui.Components.m71
    public void f(int i7, int i10) {
        cu0 cu0Var = (cu0) this.b;
        cu0Var.x = i7;
        cu0Var.y = i10;
        bi.o3 o3Var = cu0Var.M;
        if (o3Var != null) {
            o3Var.invalidate();
        }
    }

    @Override // hi.n7, tg.b
    public long get() {
        h61 h61Var = ((org.telegram.ui.fo0) this.b).a.G2;
        if (h61Var != null) {
            return h61Var.S();
        }
        return 0L;
    }

    @Override // org.telegram.messenger.i9
    public Object h(Object obj) {
        return Float.valueOf(((r1.f) this.b).a / 100.0f);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(((iy) this.b).w.d1);
                d02.getConnectionsManager().sendRequest(new TLRPC.TL_messages_clearRecentStickers(), new org.telegram.messenger.ih(d02, 1));
                break;
            case 2:
                ((org.telegram.ui.f0) this.b).run();
                break;
            case 3:
                ((p10) this.b).K0();
                break;
            case 5:
                i60 i60Var = (i60) this.b;
                a0.h hVar = i60Var.a2;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    arrayList.add(org.telegram.messenger.mp.u1(i60Var.a).c2(Long.valueOf(hVar.j(i10))));
                }
                org.telegram.ui.t40 t40Var = i60Var.g2;
                if (t40Var != null) {
                    t40Var.g(0, arrayList);
                }
                i60Var.dismiss();
                break;
            case 21:
                lw0 lw0Var = (lw0) this.b;
                lw0Var.e.presentFragment(new StickersActivity(lw0Var.d, null));
                t1Var.dismiss();
                break;
            default:
                org.telegram.messenger.g0.v1((mw0) this.b);
                t1Var.dismiss();
                break;
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
    @Override // org.telegram.messenger.u10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        TLRPC.StickerSet stickerSet;
        int childCount;
        int i7;
        long j3;
        TLRPC.Document document;
        ArrayList arrayList;
        switch (this.a) {
            case 1:
                ly lyVar = (ly) this.b;
                n41 n41Var = (n41) obj;
                View view = (View) obj2;
                lx lxVar = lyVar.c;
                qy qyVar = lyVar.R;
                Object obj3 = n41Var.H;
                if (obj3 instanceof TLRPC.StickerSetCovered) {
                    jx jxVar = (jx) n41Var.I;
                    long j10 = lyVar.d;
                    stickerSet = ((TLRPC.StickerSetCovered) obj3).set;
                    long j11 = stickerSet.id;
                    if (j10 == j11) {
                        lyVar.d = 0L;
                        stickerSet = null;
                        childCount = lxVar.getChildCount();
                        for (i7 = 0; i7 < childCount; i7++) {
                            ph.b bVar = (ph.b) lxVar.getChildAt(i7);
                            if (bVar != view) {
                                bVar.a(false, true);
                            }
                        }
                        if (lyVar.d != 0 || lyVar.f.size() >= lyVar.e.count) {
                            j3 = 0;
                        } else {
                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(qyVar.d1);
                            TLRPC.StickerSet stickerSet2 = lyVar.e;
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            j3 = 0;
                            tL_inputStickerSetID.id = stickerSet2.id;
                            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                            TLRPC.TL_messages_stickerSet o02 = d02.o0(tL_inputStickerSetID, false);
                            if (o02 != null) {
                                lyVar.f = o02.documents;
                            }
                        }
                        TLObject tLObject = (TLObject) n41Var.H;
                        document = null;
                        TLRPC.StickerSet stickerSet3 = stickerSet;
                        ph.a aVar = qyVar.O;
                        te.a aVar2 = qyVar.a;
                        arrayList = lyVar.f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            document = (TLRPC.Document) lyVar.f.get(0);
                        }
                        qyVar.J(aVar, tLObject, stickerSet3, document, false, aVar2.e <= 0.0f);
                        ((ph.b) view).a(lyVar.d == j3, true);
                        aVar2.a(lyVar.d != j3, true);
                        lyVar.f();
                        qyVar.H0.b();
                        if (lyVar.d == j3) {
                            lxVar.L1(view);
                            break;
                        }
                    } else {
                        lyVar.d = j11;
                        lyVar.f = jxVar.d;
                        lyVar.e = stickerSet;
                        childCount = lxVar.getChildCount();
                        while (i7 < childCount) {
                        }
                        if (lyVar.d != 0) {
                        }
                        j3 = 0;
                        TLObject tLObject2 = (TLObject) n41Var.H;
                        document = null;
                        TLRPC.StickerSet stickerSet32 = stickerSet;
                        ph.a aVar3 = qyVar.O;
                        te.a aVar22 = qyVar.a;
                        arrayList = lyVar.f;
                        if (arrayList != null) {
                            document = (TLRPC.Document) lyVar.f.get(0);
                        }
                        qyVar.J(aVar3, tLObject2, stickerSet32, document, false, aVar22.e <= 0.0f);
                        ((ph.b) view).a(lyVar.d == j3, true);
                        aVar22.a(lyVar.d != j3, true);
                        lyVar.f();
                        qyVar.H0.b();
                        if (lyVar.d == j3) {
                        }
                    }
                } else {
                    if (obj3 instanceof TLRPC.TL_messages_stickerSet) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
                        long j12 = lyVar.d;
                        TLRPC.StickerSet stickerSet4 = tL_messages_stickerSet.set;
                        long j13 = stickerSet4.id;
                        if (j12 == j13) {
                            lyVar.d = 0L;
                        } else {
                            lyVar.d = j13;
                            lyVar.f = tL_messages_stickerSet.documents;
                            lyVar.e = stickerSet4;
                            stickerSet = stickerSet4;
                            childCount = lxVar.getChildCount();
                            while (i7 < childCount) {
                            }
                            if (lyVar.d != 0) {
                            }
                            j3 = 0;
                            TLObject tLObject22 = (TLObject) n41Var.H;
                            document = null;
                            TLRPC.StickerSet stickerSet322 = stickerSet;
                            ph.a aVar32 = qyVar.O;
                            te.a aVar222 = qyVar.a;
                            arrayList = lyVar.f;
                            if (arrayList != null) {
                            }
                            qyVar.J(aVar32, tLObject22, stickerSet322, document, false, aVar222.e <= 0.0f);
                            ((ph.b) view).a(lyVar.d == j3, true);
                            aVar222.a(lyVar.d != j3, true);
                            lyVar.f();
                            qyVar.H0.b();
                            if (lyVar.d == j3) {
                            }
                        }
                    }
                    stickerSet = null;
                    childCount = lxVar.getChildCount();
                    while (i7 < childCount) {
                    }
                    if (lyVar.d != 0) {
                    }
                    j3 = 0;
                    TLObject tLObject222 = (TLObject) n41Var.H;
                    document = null;
                    TLRPC.StickerSet stickerSet3222 = stickerSet;
                    ph.a aVar322 = qyVar.O;
                    te.a aVar2222 = qyVar.a;
                    arrayList = lyVar.f;
                    if (arrayList != null) {
                    }
                    qyVar.J(aVar322, tLObject222, stickerSet3222, document, false, aVar2222.e <= 0.0f);
                    ((ph.b) view).a(lyVar.d == j3, true);
                    aVar2222.a(lyVar.d != j3, true);
                    lyVar.f();
                    qyVar.H0.b();
                    if (lyVar.d == j3) {
                    }
                }
                break;
            case 11:
                nf0 nf0Var = (nf0) this.b;
                Object obj4 = ((n41) obj).H;
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
                    org.telegram.ui.bx bxVar = nf0Var.a;
                    org.telegram.ui.bx.r4(bnVar, fjVar);
                    bxVar.presentFragment(bnVar);
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
                org.telegram.ui.ActionBar.i6 i6Var = ek0Var.o2;
                Paint paint = ek0.c3;
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                paint.setColor(org.telegram.ui.ActionBar.n6.r1(floatValue3, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, i6Var)));
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

    @Override // org.telegram.ui.Components.rd0
    public void l(int i7, int i10) {
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
        bz bzVar = de0Var.m0;
        if (bzVar != null) {
            bzVar.c(true, false, false);
        }
        de0Var.d();
    }

    @Override // hi.m7
    public float m(CharSequence charSequence) {
        return ((TextPaint) this.b).measureText(charSequence, 0, charSequence.length());
    }

    @Override // org.telegram.ui.Components.fu0
    public void n(int i7) {
        org.telegram.messenger.w10 w10Var = ((n41) this.b).D;
        if (w10Var != null) {
            w10Var.a(Integer.valueOf(i7));
        }
    }

    @Override // jg.y1
    public /* synthetic */ a0.h u1() {
        return null;
    }

    @Override // jg.y1
    public void v(int i7) {
        d60 d60Var = (d60) this.b;
        i60 i60Var = d60Var.n;
        i60Var.P0(d60Var.f - 1);
        if (d60Var.h == null && !d60Var.e.e() && d60Var.b() <= 2) {
            i60Var.u1.e(false, true);
        }
        d60Var.f();
    }

    @Override // org.telegram.messenger.jc
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        o61 o61Var;
        int i7;
        int i10;
        double ceil;
        p61 p61Var = (p61) this.b;
        ImageReceiver imageReceiver2 = p61Var.R;
        if (z10) {
            if (p61Var.O == null && p61Var.e0 == null) {
                return;
            }
            int L = org.telegram.messenger.g0.L(150.0f);
            org.telegram.ui.dq0 dq0Var = p61Var.O;
            if (dq0Var != null) {
                int i11 = (int) p61Var.P;
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
                org.telegram.ui.dq0 dq0Var2 = p61Var.O;
                int i12 = (int) p61Var.P;
                int videoDuration2 = dq0Var2.getVideoDuration() / 1000;
                int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i12)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i12 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i12 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i12 / 5.0f)) % 25 : ((int) Math.ceil(i12 / 10.0f)) % 25, i10 - 1);
                p61Var.S = (int) ((min % 5) * q10);
                p61Var.T = (int) ((min / 5) * o4);
                p61Var.U = (int) q10;
                p61Var.V = (int) o4;
            } else {
                z13 = true;
                int i13 = 0;
                while (true) {
                    if (i13 >= p61Var.e0.size()) {
                        o61Var = null;
                        break;
                    }
                    o61Var = (o61) p61Var.e0.get(i13);
                    double d = i13 == 0 ? 0.0d : o61Var.a;
                    double d2 = i13 == p61Var.e0.size() + (-1) ? 9.9999999E7d : ((o61) p61Var.e0.get(i13 + 1)).a;
                    double d10 = p61Var.P;
                    if (d10 >= d && d10 <= d2) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (o61Var == null) {
                    return;
                }
                p61Var.S = o61Var.b;
                p61Var.T = o61Var.c;
                p61Var.U = p61Var.c0;
                p61Var.V = p61Var.d0;
            }
            p61Var.Q = z13;
            float f10 = p61Var.U / p61Var.V;
            if (f10 > 1.0f) {
                i7 = (int) (L / f10);
            } else {
                L = (int) (L * f10);
                i7 = L;
            }
            ViewGroup.LayoutParams layoutParams = p61Var.getLayoutParams();
            if (p61Var.getVisibility() == 0 && layoutParams.width == L && layoutParams.height == i7) {
                return;
            }
            layoutParams.width = L;
            layoutParams.height = i7;
            p61Var.setVisibility(0);
            p61Var.requestLayout();
        }
    }

    @Override // org.telegram.ui.vw
    public boolean z(org.telegram.ui.bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
        tm0 tm0Var = (tm0) this.b;
        int i11 = tm0Var.K0;
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = tm0Var.C0;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((org.telegram.messenger.fj) hashMap.get((org.telegram.ui.uz) it.next()));
        }
        hashMap.clear();
        tm0Var.P(false);
        boolean z12 = true;
        if (arrayList.size() > 1 || ((org.telegram.messenger.sr) arrayList.get(0)).a == org.telegram.messenger.i10.i(org.telegram.messenger.c.a(i11).a).e() || charSequence != null) {
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
            bxVar.finishFragment();
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
            if (!org.telegram.messenger.mp.u1(org.telegram.messenger.c.a(i11).a).E(k10, bxVar, null, null)) {
                return true;
            }
        }
        org.telegram.ui.bn bnVar = new org.telegram.ui.bn(k10);
        bxVar.presentFragment(bnVar, true);
        bnVar.hc(arrayList2);
        return true;
    }

    @Override // jg.y1
    public /* synthetic */ void m2(ArrayList arrayList) {
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void r(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.ui.Components.c80
    public /* synthetic */ void d() {
    }

    @Override // org.telegram.ui.Components.c80
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.c80
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.fu0
    public /* synthetic */ void o() {
    }

    @Override // te.b
    public /* synthetic */ void G(float f10, int i7) {
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void J(int i7, Drawable drawable) {
    }
}
