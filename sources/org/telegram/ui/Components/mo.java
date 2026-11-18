package org.telegram.ui.Components;

import android.os.SystemClock;
import android.text.style.ClickableSpan;
import android.util.SparseIntArray;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mo(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.e20 e20Var;
        float f10;
        int i7;
        r1.g gVar;
        int i10 = this.a;
        Integer num = null;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((oo) obj).s();
                break;
            case 1:
                ((qo) obj).setVisibility(8);
                break;
            case 2:
                ((aq) obj).dismiss();
                break;
            case 3:
                ((a5.h) obj).a();
                break;
            case 4:
                ((org.telegram.ui.ActionBar.x2) obj).dismiss();
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    break;
                }
                break;
            case 5:
                cr crVar = ((br) obj).c;
                TLRPC.Peer peer = crVar.Z1;
                org.telegram.ui.ActionBar.h2 h2Var = crVar.b2;
                hr hrVar = new hr(h2Var, peer, crVar.c2, crVar.U1.size() > 1, crVar.T1);
                if (h2Var.getParentActivity() != null) {
                    h2Var.showDialog(hrVar);
                    break;
                } else {
                    hrVar.show();
                    break;
                }
            case 6:
                ((hi.d) obj).setLoading(true);
                break;
            case 7:
                as asVar = (as) obj;
                asVar.a.a(!r0.f, true);
                org.telegram.messenger.g0.h3(asVar.f, 3000L);
                break;
            case 8:
                ((mm0) obj).W(false);
                break;
            case 9:
                ((at) obj).a();
                break;
            case 10:
                ((xt) obj).getClass();
                break;
            case 11:
                vf.c.t(((gu) ((org.telegram.ui.n1) obj).b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 12:
                gu guVar = ((fu) obj).a;
                guVar.s1.setVisibility(4);
                guVar.r1.setVisibility(4);
                ImageView imageView = guVar.x1;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 13:
                ((xu) obj).a(true, true);
                break;
            case 14:
                qw qwVar = (qw) obj;
                if (qwVar.a0.getEmojiView() != null) {
                    ry emojiView = qwVar.a0.getEmojiView();
                    if (!emojiView.g0) {
                        try {
                            SparseIntArray sparseIntArray = emojiView.S.s;
                            char[] cArr = org.telegram.messenger.k6.a;
                            int i11 = sparseIntArray.get(8);
                            if (i11 > 0) {
                                emojiView.Q.C0();
                                emojiView.V(i11);
                                emojiView.G(i11, org.telegram.messenger.g0.L(-9.0f));
                                emojiView.n(0, null);
                                break;
                            }
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 15:
                jx jxVar = (jx) obj;
                jxVar.x.f = true;
                jxVar.a(true);
                break;
            case 16:
                org.telegram.messenger.g0.T3(((ey) obj).h, true, true);
                break;
            case 17:
                ly lyVar = (ly) obj;
                ArrayList arrayList = lyVar.r;
                ArrayList arrayList2 = lyVar.h;
                my myVar = lyVar.x;
                int i12 = myVar.N;
                ry ryVar = myVar.R;
                aw awVar = ryVar.E0;
                if (i12 == lyVar.b) {
                    arrayList2.remove(arrayList);
                    myVar.F = lyVar.c;
                    myVar.G = lyVar.d;
                    myVar.H = lyVar.e;
                    myVar.I = lyVar.f;
                    myVar.J = arrayList2;
                    myVar.K = lyVar.n;
                    myVar.L = new ArrayList(arrayList);
                    ryVar.H0.e(false);
                    v4.i0 adapter = awVar.getAdapter();
                    my myVar2 = ryVar.A0;
                    if (adapter != myVar2) {
                        awVar.setAdapter(myVar2);
                    }
                    myVar.f();
                    break;
                }
                break;
            case 18:
                pz pzVar = (pz) ((oz) obj).f;
                ArrayList arrayList3 = pzVar.h;
                if (!org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).q()) {
                    int i13 = 0;
                    while (i13 < arrayList3.size()) {
                        if (((mz) arrayList3.get(i13)).e && i13 != 0) {
                            org.telegram.ui.l4 l4Var = pzVar.J;
                            pz pzVar2 = (pz) l4Var.e;
                            ArrayList arrayList4 = pzVar2.h;
                            SparseIntArray sparseIntArray2 = pzVar2.l0;
                            int size = arrayList4.size();
                            if (i13 >= 0 && i13 < size) {
                                ArrayList V0 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).V0();
                                int i14 = sparseIntArray2.get(i13);
                                int i15 = ((mz) arrayList4.get(i13)).a;
                                for (int i16 = i13 - 1; i16 >= 0; i16--) {
                                    sparseIntArray2.put(i16 + 1, sparseIntArray2.get(i16));
                                }
                                org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) V0.remove(i13);
                                roVar.f = 0;
                                V0.add(0, roVar);
                                sparseIntArray2.put(0, i14);
                                arrayList4.add(0, (mz) arrayList4.remove(i13));
                                ((mz) arrayList4.get(0)).a = i15;
                                for (int i17 = 0; i17 <= i13; i17++) {
                                    ((mz) arrayList4.get(i17)).a = i17;
                                    ((org.telegram.messenger.ro) V0.get(i17)).f = i17;
                                }
                                int i18 = 0;
                                while (i18 <= i13) {
                                    if (pzVar2.L == i18) {
                                        int i19 = i18 == i13 ? 0 : i18 + 1;
                                        pzVar2.M = i19;
                                        pzVar2.L = i19;
                                    }
                                    if (pzVar2.r0 == i18) {
                                        int i20 = i18 == i13 ? 0 : i18 + 1;
                                        pzVar2.s0 = i20;
                                        pzVar2.r0 = i20;
                                    }
                                    i18++;
                                }
                                l4Var.j(i13, 0);
                                lz lzVar = pzVar2.K;
                                int i21 = ((mz) arrayList4.get(i13)).a;
                                org.telegram.ui.tw twVar = (org.telegram.ui.tw) lzVar;
                                int i22 = 0;
                                while (true) {
                                    org.telegram.ui.bx[] bxVarArr = twVar.b.f0;
                                    if (i22 < bxVarArr.length) {
                                        org.telegram.ui.bx bxVar = bxVarArr[i22];
                                        int i23 = bxVar.h;
                                        if (i23 == i21) {
                                            bxVar.h = i15;
                                        } else if (i23 == i15) {
                                            bxVar.h = i21;
                                        }
                                        i22++;
                                    } else {
                                        pzVar2.m();
                                        pzVar2.E = true;
                                        pzVar2.G.setItemAnimator(pzVar2.t0);
                                    }
                                }
                            }
                            pzVar.G.v0(0);
                            org.telegram.ui.rw rwVar = (org.telegram.ui.rw) pzVar;
                            org.telegram.ui.cx cxVar = rwVar.I0;
                            if (!cxVar.getMessagesController().K3()) {
                                try {
                                    rwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                gc J = lc.b0(cxVar).J(R.raw.filter_reorder, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131748752, org.telegram.messenger.gd.M0(2131750796, null))), org.telegram.messenger.gd.M0(2131746840, null), 5000, false, new org.telegram.ui.bh(rwVar, 24));
                                J.k(true);
                                cxVar.q3 = J;
                                break;
                            }
                        } else {
                            i13++;
                        }
                    }
                    break;
                }
                break;
            case 19:
                uz uzVar = (uz) obj;
                if (!uzVar.c) {
                    uzVar.setLayerType(0, null);
                    break;
                }
                break;
            case 20:
                ((z10) obj).h(true);
                break;
            case 21:
                org.telegram.ui.kw kwVar = ((im0) ((f30) obj)).f0;
                if (!kwVar.x0.canScrollVertically(-1)) {
                    kwVar.w0.h1(0, 0);
                    break;
                }
                break;
            case 22:
                ((h30) obj).b.a();
                break;
            case 23:
                w30 w30Var = (w30) obj;
                ph0 ph0Var = w30Var.q1;
                if (w30Var.s1) {
                    ph0Var.getAnimatedDrawable().K(0);
                    ph0Var.setAnimation(w30Var.t1);
                    ph0Var.d();
                    break;
                }
                break;
            case 24:
                z40 z40Var = (z40) ((h6.r) obj).b;
                try {
                    f61 f61Var = z40Var.T;
                    if (f61Var != null && (e20Var = z40Var.S) != null) {
                        if (e20Var.b > 0) {
                            long S = f61Var.S();
                            org.telegram.messenger.e20 e20Var2 = z40Var.S;
                            if (S >= e20Var2.b) {
                                f61 f61Var2 = z40Var.T;
                                long j3 = e20Var2.a;
                                f61Var2.q0(j3 > 0 ? j3 : 0L, false);
                                break;
                            }
                        }
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            case 25:
                u80 u80Var = (u80) obj;
                u80Var.k = false;
                u80Var.c();
                break;
            case 26:
                c90 c90Var = (c90) obj;
                if (c90Var.d) {
                    c90Var.e = true;
                    c90Var.r = false;
                    c90Var.f = 0.0f;
                    c90Var.h = SystemClock.uptimeMillis();
                    c90Var.invalidate();
                    break;
                }
                break;
            case 27:
                final t90 t90Var = (t90) obj;
                boolean z10 = t90Var.J;
                boolean z11 = !z10;
                jg.n1 n1Var = t90Var.e;
                s90 s90Var = t90Var.b;
                if (s90Var == null || n1Var == null) {
                    t90Var.P = 0;
                    break;
                } else if (t90Var.M && (gVar = t90Var.L) != null && gVar.f && !z10) {
                    t90Var.P = 0;
                    break;
                } else {
                    boolean g10 = t90Var.g();
                    if (z10) {
                        int computeVerticalScrollRange = s90Var.computeVerticalScrollRange();
                        float f11 = (computeVerticalScrollRange - n1Var.h) + t90Var.s;
                        if (computeVerticalScrollRange <= 0 && t90Var.f.K() > 0 && (i7 = t90Var.P) < 3) {
                            t90Var.P = i7 + 1;
                            t90Var.o(true);
                            break;
                        } else {
                            f10 = f11;
                        }
                    } else {
                        f10 = (-t90Var.s) - org.telegram.messenger.g0.L(6.0f);
                    }
                    t90Var.P = 0;
                    float f12 = t90Var.w;
                    float max = g10 ? -Math.max(0.0f, f12 - f10) : Math.max(0.0f, f12 - f10) + (-f12);
                    if (!z10 && !g10) {
                        max += s90Var.computeVerticalScrollOffset();
                    }
                    final float f13 = max;
                    r1.g gVar2 = t90Var.L;
                    if (gVar2 != null) {
                        gVar2.d();
                    }
                    t90Var.M = z11;
                    final float translationY = s90Var.getTranslationY();
                    final float f14 = t90Var.N;
                    float f15 = z10 ? 0.0f : 1.0f;
                    if (translationY == f13) {
                        t90Var.L = null;
                        num = Integer.valueOf(z10 ? 0 : 8);
                        if (t90Var.O && !z10) {
                            t90Var.O = false;
                            s90Var.setLayoutManager(t90Var.getNeededLayoutManager());
                            t90Var.J = true;
                            t90Var.o(true);
                        }
                    } else {
                        r1.g gVar3 = new r1.g(new r1.f(translationY));
                        r1.h hVar = new r1.h(f13);
                        hVar.a(1.0f);
                        hVar.b(550.0f);
                        gVar3.m = hVar;
                        t90Var.L = gVar3;
                        final float f16 = f15;
                        r1.d dVar = new r1.d() { // from class: org.telegram.ui.Components.k90
                            @Override // r1.d
                            public final void a(r1.g gVar4, float f17, float f18) {
                                t90 t90Var2 = t90.this;
                                t90Var2.b.setTranslationY(f17);
                                t90Var2.i();
                                float f19 = translationY;
                                t90Var2.N = org.telegram.messenger.g0.T1(f14, f16, (f17 - f19) / (f13 - f19));
                            }
                        };
                        t90Var = t90Var;
                        gVar3.b(dVar);
                        if (!z10) {
                            t90Var.L.a(new hi.c4(t90Var, z11, 2));
                        }
                        t90Var.L.a(new l90());
                        t90Var.L.h();
                    }
                    if (num != null && t90Var.getVisibility() != num.intValue()) {
                        t90Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            case 28:
                ((oa0) ((ga0) obj).T).n.f();
                break;
            default:
                ((ya0) obj).a();
                break;
        }
    }

    public /* synthetic */ mo(xt xtVar, l80 l80Var, ClickableSpan clickableSpan) {
        this.a = 10;
        this.b = xtVar;
    }
}
