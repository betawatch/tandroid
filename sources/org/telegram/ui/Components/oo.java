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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oo(Object obj, int i7) {
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
                ((qo) obj).s();
                break;
            case 1:
                ((so) obj).setVisibility(8);
                break;
            case 2:
                ((cq) obj).dismiss();
                break;
            case 3:
                ((a5.h) obj).a();
                break;
            case 4:
                ((org.telegram.ui.ActionBar.w2) obj).dismiss();
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    break;
                }
                break;
            case 5:
                er erVar = ((dr) obj).c;
                TLRPC.Peer peer = erVar.Z1;
                org.telegram.ui.ActionBar.g2 g2Var = erVar.b2;
                jr jrVar = new jr(g2Var, peer, erVar.c2, erVar.U1.size() > 1, erVar.T1);
                if (g2Var.getParentActivity() != null) {
                    g2Var.showDialog(jrVar);
                    break;
                } else {
                    jrVar.show();
                    break;
                }
            case 6:
                ((hi.e) obj).setLoading(true);
                break;
            case 7:
                cs csVar = (cs) obj;
                csVar.a.a(!r0.f, true);
                org.telegram.messenger.g0.h3(csVar.f, 3000L);
                break;
            case 8:
                ((pm0) obj).W(false);
                break;
            case 9:
                ((ct) obj).a();
                break;
            case 10:
                ((zt) obj).getClass();
                break;
            case 11:
                vf.c.t(((iu) ((org.telegram.ui.n1) obj).b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 12:
                iu iuVar = ((hu) obj).a;
                iuVar.s1.setVisibility(4);
                iuVar.r1.setVisibility(4);
                ImageView imageView = iuVar.x1;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 13:
                ((av) obj).a(true, true);
                break;
            case 14:
                sw swVar = (sw) obj;
                if (swVar.a0.getEmojiView() != null) {
                    ty emojiView = swVar.a0.getEmojiView();
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
                lx lxVar = (lx) obj;
                lxVar.x.f = true;
                lxVar.a(true);
                break;
            case 16:
                org.telegram.messenger.g0.T3(((gy) obj).h, true, true);
                break;
            case 17:
                ny nyVar = (ny) obj;
                ArrayList arrayList = nyVar.r;
                ArrayList arrayList2 = nyVar.h;
                oy oyVar = nyVar.x;
                int i12 = oyVar.N;
                ty tyVar = oyVar.R;
                dw dwVar = tyVar.E0;
                if (i12 == nyVar.b) {
                    arrayList2.remove(arrayList);
                    oyVar.F = nyVar.c;
                    oyVar.G = nyVar.d;
                    oyVar.H = nyVar.e;
                    oyVar.I = nyVar.f;
                    oyVar.J = arrayList2;
                    oyVar.K = nyVar.n;
                    oyVar.L = new ArrayList(arrayList);
                    tyVar.H0.e(false);
                    v4.i0 adapter = dwVar.getAdapter();
                    oy oyVar2 = tyVar.A0;
                    if (adapter != oyVar2) {
                        dwVar.setAdapter(oyVar2);
                    }
                    oyVar.f();
                    break;
                }
                break;
            case 18:
                rz rzVar = (rz) ((qz) obj).f;
                ArrayList arrayList3 = rzVar.h;
                if (!org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).q()) {
                    int i13 = 0;
                    while (i13 < arrayList3.size()) {
                        if (((oz) arrayList3.get(i13)).e && i13 != 0) {
                            org.telegram.ui.l4 l4Var = rzVar.J;
                            rz rzVar2 = (rz) l4Var.e;
                            ArrayList arrayList4 = rzVar2.h;
                            SparseIntArray sparseIntArray2 = rzVar2.l0;
                            int size = arrayList4.size();
                            if (i13 >= 0 && i13 < size) {
                                ArrayList V0 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).V0();
                                int i14 = sparseIntArray2.get(i13);
                                int i15 = ((oz) arrayList4.get(i13)).a;
                                for (int i16 = i13 - 1; i16 >= 0; i16--) {
                                    sparseIntArray2.put(i16 + 1, sparseIntArray2.get(i16));
                                }
                                org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) V0.remove(i13);
                                roVar.f = 0;
                                V0.add(0, roVar);
                                sparseIntArray2.put(0, i14);
                                arrayList4.add(0, (oz) arrayList4.remove(i13));
                                ((oz) arrayList4.get(0)).a = i15;
                                for (int i17 = 0; i17 <= i13; i17++) {
                                    ((oz) arrayList4.get(i17)).a = i17;
                                    ((org.telegram.messenger.ro) V0.get(i17)).f = i17;
                                }
                                int i18 = 0;
                                while (i18 <= i13) {
                                    if (rzVar2.L == i18) {
                                        int i19 = i18 == i13 ? 0 : i18 + 1;
                                        rzVar2.M = i19;
                                        rzVar2.L = i19;
                                    }
                                    if (rzVar2.r0 == i18) {
                                        int i20 = i18 == i13 ? 0 : i18 + 1;
                                        rzVar2.s0 = i20;
                                        rzVar2.r0 = i20;
                                    }
                                    i18++;
                                }
                                l4Var.j(i13, 0);
                                nz nzVar = rzVar2.K;
                                int i21 = ((oz) arrayList4.get(i13)).a;
                                org.telegram.ui.tw twVar = (org.telegram.ui.tw) nzVar;
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
                                        rzVar2.m();
                                        rzVar2.E = true;
                                        rzVar2.G.setItemAnimator(rzVar2.t0);
                                    }
                                }
                            }
                            rzVar.G.v0(0);
                            org.telegram.ui.rw rwVar = (org.telegram.ui.rw) rzVar;
                            org.telegram.ui.cx cxVar = rwVar.I0;
                            if (!cxVar.getMessagesController().K3()) {
                                try {
                                    rwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                gc J = lc.b0(cxVar).J(R.raw.filter_reorder, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131748751, org.telegram.messenger.gd.N0(2131750795, null))), org.telegram.messenger.gd.N0(2131746839, null), 5000, false, new org.telegram.ui.bh(rwVar, 24));
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
                wz wzVar = (wz) obj;
                if (!wzVar.c) {
                    wzVar.setLayerType(0, null);
                    break;
                }
                break;
            case 20:
                ((c20) obj).h(true);
                break;
            case 21:
                org.telegram.ui.kw kwVar = ((lm0) ((i30) obj)).f0;
                if (!kwVar.x0.canScrollVertically(-1)) {
                    kwVar.w0.h1(0, 0);
                    break;
                }
                break;
            case 22:
                ((k30) obj).b.a();
                break;
            case 23:
                z30 z30Var = (z30) obj;
                rh0 rh0Var = z30Var.q1;
                if (z30Var.s1) {
                    rh0Var.getAnimatedDrawable().K(0);
                    rh0Var.setAnimation(z30Var.t1);
                    rh0Var.d();
                    break;
                }
                break;
            case 24:
                c50 c50Var = (c50) ((h6.r) obj).b;
                try {
                    i61 i61Var = c50Var.T;
                    if (i61Var != null && (e20Var = c50Var.S) != null) {
                        if (e20Var.b > 0) {
                            long S = i61Var.S();
                            org.telegram.messenger.e20 e20Var2 = c50Var.S;
                            if (S >= e20Var2.b) {
                                i61 i61Var2 = c50Var.T;
                                long j3 = e20Var2.a;
                                i61Var2.q0(j3 > 0 ? j3 : 0L, false);
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
                w80 w80Var = (w80) obj;
                w80Var.k = false;
                w80Var.c();
                break;
            case 26:
                e90 e90Var = (e90) obj;
                if (e90Var.d) {
                    e90Var.e = true;
                    e90Var.r = false;
                    e90Var.f = 0.0f;
                    e90Var.h = SystemClock.uptimeMillis();
                    e90Var.invalidate();
                    break;
                }
                break;
            case 27:
                final v90 v90Var = (v90) obj;
                boolean z10 = v90Var.J;
                boolean z11 = !z10;
                jg.n1 n1Var = v90Var.e;
                u90 u90Var = v90Var.b;
                if (u90Var == null || n1Var == null) {
                    v90Var.P = 0;
                    break;
                } else if (v90Var.M && (gVar = v90Var.L) != null && gVar.f && !z10) {
                    v90Var.P = 0;
                    break;
                } else {
                    boolean g10 = v90Var.g();
                    if (z10) {
                        int computeVerticalScrollRange = u90Var.computeVerticalScrollRange();
                        float f11 = (computeVerticalScrollRange - n1Var.h) + v90Var.s;
                        if (computeVerticalScrollRange <= 0 && v90Var.f.K() > 0 && (i7 = v90Var.P) < 3) {
                            v90Var.P = i7 + 1;
                            v90Var.o(true);
                            break;
                        } else {
                            f10 = f11;
                        }
                    } else {
                        f10 = (-v90Var.s) - org.telegram.messenger.g0.L(6.0f);
                    }
                    v90Var.P = 0;
                    float f12 = v90Var.w;
                    float max = g10 ? -Math.max(0.0f, f12 - f10) : Math.max(0.0f, f12 - f10) + (-f12);
                    if (!z10 && !g10) {
                        max += u90Var.computeVerticalScrollOffset();
                    }
                    final float f13 = max;
                    r1.g gVar2 = v90Var.L;
                    if (gVar2 != null) {
                        gVar2.d();
                    }
                    v90Var.M = z11;
                    final float translationY = u90Var.getTranslationY();
                    final float f14 = v90Var.N;
                    float f15 = z10 ? 0.0f : 1.0f;
                    if (translationY == f13) {
                        v90Var.L = null;
                        num = Integer.valueOf(z10 ? 0 : 8);
                        if (v90Var.O && !z10) {
                            v90Var.O = false;
                            u90Var.setLayoutManager(v90Var.getNeededLayoutManager());
                            v90Var.J = true;
                            v90Var.o(true);
                        }
                    } else {
                        r1.g gVar3 = new r1.g(new r1.f(translationY));
                        r1.h hVar = new r1.h(f13);
                        hVar.a(1.0f);
                        hVar.b(550.0f);
                        gVar3.m = hVar;
                        v90Var.L = gVar3;
                        final float f16 = f15;
                        r1.d dVar = new r1.d() { // from class: org.telegram.ui.Components.m90
                            @Override // r1.d
                            public final void a(r1.g gVar4, float f17, float f18) {
                                v90 v90Var2 = v90.this;
                                v90Var2.b.setTranslationY(f17);
                                v90Var2.i();
                                float f19 = translationY;
                                v90Var2.N = org.telegram.messenger.g0.T1(f14, f16, (f17 - f19) / (f13 - f19));
                            }
                        };
                        v90Var = v90Var;
                        gVar3.b(dVar);
                        if (!z10) {
                            v90Var.L.a(new hi.b4(v90Var, z11, 2));
                        }
                        v90Var.L.a(new n90());
                        v90Var.L.h();
                    }
                    if (num != null && v90Var.getVisibility() != num.intValue()) {
                        v90Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            case 28:
                ((qa0) ((ia0) obj).T).n.f();
                break;
            default:
                ((za0) obj).a();
                break;
        }
    }

    public /* synthetic */ oo(zt ztVar, n80 n80Var, ClickableSpan clickableSpan) {
        this.a = 10;
        this.b = ztVar;
    }
}
