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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class gp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gp(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.j20 j20Var;
        float f10;
        int i7;
        r1.g gVar;
        int i10 = this.a;
        Integer num = null;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((lp) obj).dismiss();
                break;
            case 1:
                ((a5.h) obj).a();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.v2) obj).dismiss();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    break;
                }
                break;
            case 3:
                oq oqVar = ((nq) obj).c;
                TLRPC.Peer peer = oqVar.V1;
                org.telegram.ui.ActionBar.f2 f2Var = oqVar.X1;
                tq tqVar = new tq(f2Var, peer, oqVar.Y1, oqVar.Q1.size() > 1, oqVar.P1);
                if (f2Var.getParentActivity() != null) {
                    f2Var.showDialog(tqVar);
                    break;
                } else {
                    tqVar.show();
                    break;
                }
            case 4:
                ((fi.d) obj).setLoading(true);
                break;
            case 5:
                nr nrVar = (nr) obj;
                nrVar.a.a(!r0.f, true);
                org.telegram.messenger.g0.i3(nrVar.f, 3000L);
                break;
            case 6:
                ((bm0) obj).W(false);
                break;
            case 7:
                ((ns) obj).a();
                break;
            case 8:
                ((mt) obj).getClass();
                break;
            case 9:
                vf.c.t(((wt) ((org.telegram.ui.n1) obj).b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 10:
                wt wtVar = ((vt) obj).a;
                wtVar.o1.setVisibility(4);
                wtVar.n1.setVisibility(4);
                ImageView imageView = wtVar.t1;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 11:
                ((nu) obj).a(true, true);
                break;
            case 12:
                fw fwVar = (fw) obj;
                if (fwVar.Z.getEmojiView() != null) {
                    hy emojiView = fwVar.Z.getEmojiView();
                    if (!emojiView.f0) {
                        try {
                            SparseIntArray sparseIntArray = emojiView.R.s;
                            char[] cArr = org.telegram.messenger.j6.a;
                            int i11 = sparseIntArray.get(8);
                            if (i11 > 0) {
                                emojiView.P.C0();
                                emojiView.U(i11);
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
            case 13:
                yw ywVar = (yw) obj;
                ywVar.x.f = true;
                ywVar.a(true);
                break;
            case 14:
                org.telegram.messenger.g0.V3(((ux) obj).h, true, true);
                break;
            case 15:
                ay ayVar = (ay) obj;
                ArrayList arrayList = ayVar.r;
                ArrayList arrayList2 = ayVar.h;
                cy cyVar = ayVar.x;
                int i12 = cyVar.M;
                hy hyVar = cyVar.Q;
                qv qvVar = hyVar.D0;
                if (i12 == ayVar.b) {
                    arrayList2.remove(arrayList);
                    cyVar.E = ayVar.c;
                    cyVar.F = ayVar.d;
                    cyVar.G = ayVar.e;
                    cyVar.H = ayVar.f;
                    cyVar.I = arrayList2;
                    cyVar.J = ayVar.n;
                    cyVar.K = new ArrayList(arrayList);
                    hyVar.G0.e(false);
                    v4.g0 adapter = qvVar.getAdapter();
                    cy cyVar2 = hyVar.z0;
                    if (adapter != cyVar2) {
                        qvVar.setAdapter(cyVar2);
                    }
                    cyVar.f();
                    break;
                }
                break;
            case 16:
                fz fzVar = (fz) ((ez) obj).f;
                ArrayList arrayList3 = fzVar.h;
                if (!org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q()) {
                    int i13 = 0;
                    while (i13 < arrayList3.size()) {
                        if (((cz) arrayList3.get(i13)).e && i13 != 0) {
                            org.telegram.ui.l4 l4Var = fzVar.I;
                            fz fzVar2 = (fz) l4Var.e;
                            ArrayList arrayList4 = fzVar2.h;
                            SparseIntArray sparseIntArray2 = fzVar2.k0;
                            int size = arrayList4.size();
                            if (i13 >= 0 && i13 < size) {
                                ArrayList T0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).T0();
                                int i14 = sparseIntArray2.get(i13);
                                int i15 = ((cz) arrayList4.get(i13)).a;
                                for (int i16 = i13 - 1; i16 >= 0; i16--) {
                                    sparseIntArray2.put(i16 + 1, sparseIntArray2.get(i16));
                                }
                                org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) T0.remove(i13);
                                voVar.f = 0;
                                T0.add(0, voVar);
                                sparseIntArray2.put(0, i14);
                                arrayList4.add(0, (cz) arrayList4.remove(i13));
                                ((cz) arrayList4.get(0)).a = i15;
                                for (int i17 = 0; i17 <= i13; i17++) {
                                    ((cz) arrayList4.get(i17)).a = i17;
                                    ((org.telegram.messenger.vo) T0.get(i17)).f = i17;
                                }
                                int i18 = 0;
                                while (i18 <= i13) {
                                    if (fzVar2.K == i18) {
                                        int i19 = i18 == i13 ? 0 : i18 + 1;
                                        fzVar2.L = i19;
                                        fzVar2.K = i19;
                                    }
                                    if (fzVar2.q0 == i18) {
                                        int i20 = i18 == i13 ? 0 : i18 + 1;
                                        fzVar2.r0 = i20;
                                        fzVar2.q0 = i20;
                                    }
                                    i18++;
                                }
                                l4Var.j(i13, 0);
                                bz bzVar = fzVar2.J;
                                int i21 = ((cz) arrayList4.get(i13)).a;
                                org.telegram.ui.pw pwVar = (org.telegram.ui.pw) bzVar;
                                int i22 = 0;
                                while (true) {
                                    org.telegram.ui.xw[] xwVarArr = pwVar.b.e0;
                                    if (i22 < xwVarArr.length) {
                                        org.telegram.ui.xw xwVar = xwVarArr[i22];
                                        int i23 = xwVar.h;
                                        if (i23 == i21) {
                                            xwVar.h = i15;
                                        } else if (i23 == i15) {
                                            xwVar.h = i21;
                                        }
                                        i22++;
                                    } else {
                                        fzVar2.j();
                                        fzVar2.D = true;
                                        fzVar2.F.setItemAnimator(fzVar2.s0);
                                    }
                                }
                            }
                            fzVar.F.v0(0);
                            org.telegram.ui.ow owVar = (org.telegram.ui.ow) fzVar;
                            org.telegram.ui.yw ywVar2 = owVar.B0;
                            if (!ywVar2.getMessagesController().D3()) {
                                try {
                                    owVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                cc J = hc.a0(ywVar2).J(R.raw.filter_reorder, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131748944, org.telegram.messenger.id.M0(2131750807, null))), org.telegram.messenger.id.M0(2131747033, null), 5000, false, new org.telegram.ui.dh(owVar, 24));
                                J.k(true);
                                ywVar2.p3 = J;
                                break;
                            }
                        } else {
                            i13++;
                        }
                    }
                    break;
                }
                break;
            case 17:
                kz kzVar = (kz) obj;
                if (!kzVar.c) {
                    kzVar.setLayerType(0, null);
                    break;
                }
                break;
            case 18:
                ((q10) obj).h(true);
                break;
            case 19:
                org.telegram.ui.hw hwVar = ((xl0) ((v20) obj)).e0;
                if (!hwVar.w0.canScrollVertically(-1)) {
                    hwVar.v0.h1(0, 0);
                    break;
                }
                break;
            case 20:
                ((x20) obj).b.a();
                break;
            case 21:
                m30 m30Var = (m30) obj;
                dh0 dh0Var = m30Var.m1;
                if (m30Var.o1) {
                    dh0Var.getAnimatedDrawable().K(0);
                    dh0Var.setAnimation(m30Var.p1);
                    dh0Var.d();
                    break;
                }
                break;
            case 22:
                p40 p40Var = (p40) ((fi.h2) obj).b;
                try {
                    u51 u51Var = p40Var.S;
                    if (u51Var != null && (j20Var = p40Var.R) != null) {
                        if (j20Var.b > 0) {
                            long S = u51Var.S();
                            org.telegram.messenger.j20 j20Var2 = p40Var.R;
                            if (S >= j20Var2.b) {
                                u51 u51Var2 = p40Var.S;
                                long j3 = j20Var2.a;
                                u51Var2.q0(j3 > 0 ? j3 : 0L, false);
                                break;
                            }
                        }
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            case 23:
                h80 h80Var = (h80) obj;
                h80Var.k = false;
                h80Var.c();
                break;
            case 24:
                p80 p80Var = (p80) obj;
                if (p80Var.d) {
                    p80Var.e = true;
                    p80Var.r = false;
                    p80Var.f = 0.0f;
                    p80Var.h = SystemClock.uptimeMillis();
                    p80Var.invalidate();
                    break;
                }
                break;
            case 25:
                final h90 h90Var = (h90) obj;
                boolean z9 = h90Var.I;
                boolean z10 = !z9;
                jg.o1 o1Var = h90Var.e;
                g90 g90Var = h90Var.b;
                if (g90Var == null || o1Var == null) {
                    h90Var.O = 0;
                    break;
                } else if (h90Var.L && (gVar = h90Var.K) != null && gVar.f && !z9) {
                    h90Var.O = 0;
                    break;
                } else {
                    boolean g10 = h90Var.g();
                    if (z9) {
                        int computeVerticalScrollRange = g90Var.computeVerticalScrollRange();
                        float f11 = (computeVerticalScrollRange - o1Var.h) + h90Var.s;
                        if (computeVerticalScrollRange <= 0 && h90Var.f.K() > 0 && (i7 = h90Var.O) < 3) {
                            h90Var.O = i7 + 1;
                            h90Var.o(true);
                            break;
                        } else {
                            f10 = f11;
                        }
                    } else {
                        f10 = (-h90Var.s) - org.telegram.messenger.g0.L(6.0f);
                    }
                    h90Var.O = 0;
                    float f12 = h90Var.w;
                    float max = g10 ? -Math.max(0.0f, f12 - f10) : Math.max(0.0f, f12 - f10) + (-f12);
                    if (!z9 && !g10) {
                        max += g90Var.computeVerticalScrollOffset();
                    }
                    final float f13 = max;
                    r1.g gVar2 = h90Var.K;
                    if (gVar2 != null) {
                        gVar2.d();
                    }
                    h90Var.L = z10;
                    final float translationY = g90Var.getTranslationY();
                    final float f14 = h90Var.M;
                    float f15 = z9 ? 0.0f : 1.0f;
                    if (translationY == f13) {
                        h90Var.K = null;
                        num = Integer.valueOf(z9 ? 0 : 8);
                        if (h90Var.N && !z9) {
                            h90Var.N = false;
                            g90Var.setLayoutManager(h90Var.getNeededLayoutManager());
                            h90Var.I = true;
                            h90Var.o(true);
                        }
                    } else {
                        r1.g gVar3 = new r1.g(new r1.f(translationY));
                        r1.h hVar = new r1.h(f13);
                        hVar.a(1.0f);
                        hVar.b(550.0f);
                        gVar3.m = hVar;
                        h90Var.K = gVar3;
                        final float f16 = f15;
                        r1.d dVar = new r1.d() { // from class: org.telegram.ui.Components.y80
                            @Override // r1.d
                            public final void a(r1.g gVar4, float f17, float f18) {
                                h90 h90Var2 = h90.this;
                                h90Var2.b.setTranslationY(f17);
                                h90Var2.i();
                                float f19 = translationY;
                                h90Var2.M = org.telegram.messenger.g0.T1(f14, f16, (f17 - f19) / (f13 - f19));
                            }
                        };
                        h90Var = h90Var;
                        gVar3.b(dVar);
                        if (!z9) {
                            h90Var.K.a(new fi.g4(h90Var, z10, 2));
                        }
                        h90Var.K.a(new z80());
                        h90Var.K.h();
                    }
                    if (num != null && h90Var.getVisibility() != num.intValue()) {
                        h90Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            case 26:
                ((da0) ((v90) obj).T).n.f();
                break;
            case 27:
                ((oa0) obj).a();
                break;
            case 28:
                ((fi.u) obj).invalidateSelf();
                break;
            default:
                ((xz) obj).invalidateSelf();
                break;
        }
    }

    public /* synthetic */ gp(mt mtVar, y70 y70Var, ClickableSpan clickableSpan) {
        this.a = 8;
        this.b = mtVar;
    }
}
