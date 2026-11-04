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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gp(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.b20 b20Var;
        float f10;
        int i3;
        q1.g gVar;
        int i10 = this.a;
        Integer num = null;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((lp) obj).dismiss();
                break;
            case 1:
                ((yp) obj).a();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.t2) obj).dismiss();
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    break;
                }
                break;
            case 3:
                oq oqVar = ((nq) obj).c;
                TLRPC.Peer peer = oqVar.W1;
                org.telegram.ui.ActionBar.d2 d2Var = oqVar.Y1;
                tq tqVar = new tq(d2Var, peer, oqVar.Z1, oqVar.R1.size() > 1, oqVar.Q1);
                if (d2Var.getParentActivity() != null) {
                    d2Var.showDialog(tqVar);
                    break;
                } else {
                    tqVar.show();
                    break;
                }
            case 4:
                ((gi.d) obj).setLoading(true);
                break;
            case 5:
                nr nrVar = (nr) obj;
                nrVar.a.a(!r0.f, true);
                org.telegram.messenger.g0.i3(nrVar.f, 3000L);
                break;
            case 6:
                ((dm0) obj).W(false);
                break;
            case 7:
                ((ns) obj).a();
                break;
            case 8:
                ((kt) obj).getClass();
                break;
            case 9:
                sf.c.t(((ut) ((org.telegram.ui.o1) obj).b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 10:
                ut utVar = ((tt) obj).a;
                utVar.p1.setVisibility(4);
                utVar.o1.setVisibility(4);
                ImageView imageView = utVar.u1;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 11:
                ((lu) obj).a(true, true);
                break;
            case 12:
                dw dwVar = (dw) obj;
                if (dwVar.a0.getEmojiView() != null) {
                    ey emojiView = dwVar.a0.getEmojiView();
                    if (!emojiView.g0) {
                        try {
                            SparseIntArray sparseIntArray = emojiView.S.s;
                            char[] cArr = org.telegram.messenger.j6.a;
                            int i11 = sparseIntArray.get(8);
                            if (i11 > 0) {
                                emojiView.Q.C0();
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
                ww wwVar = (ww) obj;
                wwVar.x.f = true;
                wwVar.a(true);
                break;
            case 14:
                org.telegram.messenger.g0.V3(((rx) obj).h, true, true);
                break;
            case 15:
                xx xxVar = (xx) obj;
                ArrayList arrayList = xxVar.r;
                ArrayList arrayList2 = xxVar.h;
                yx yxVar = xxVar.x;
                int i12 = yxVar.N;
                ey eyVar = yxVar.R;
                ov ovVar = eyVar.E0;
                if (i12 == xxVar.b) {
                    arrayList2.remove(arrayList);
                    yxVar.F = xxVar.c;
                    yxVar.G = xxVar.d;
                    yxVar.H = xxVar.e;
                    yxVar.I = xxVar.f;
                    yxVar.J = arrayList2;
                    yxVar.K = xxVar.n;
                    yxVar.L = new ArrayList(arrayList);
                    eyVar.H0.e(false);
                    u4.h0 adapter = ovVar.getAdapter();
                    yx yxVar2 = eyVar.A0;
                    if (adapter != yxVar2) {
                        ovVar.setAdapter(yxVar2);
                    }
                    yxVar.f();
                    break;
                }
                break;
            case 16:
                bz bzVar = (bz) ((az) obj).f;
                ArrayList arrayList3 = bzVar.h;
                if (!org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).q()) {
                    int i13 = 0;
                    while (i13 < arrayList3.size()) {
                        if (((yy) arrayList3.get(i13)).e && i13 != 0) {
                            org.telegram.ui.n4 n4Var = bzVar.J;
                            bz bzVar2 = (bz) n4Var.e;
                            ArrayList arrayList4 = bzVar2.h;
                            SparseIntArray sparseIntArray2 = bzVar2.l0;
                            int size = arrayList4.size();
                            if (i13 >= 0 && i13 < size) {
                                ArrayList T0 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).T0();
                                int i14 = sparseIntArray2.get(i13);
                                int i15 = ((yy) arrayList4.get(i13)).a;
                                for (int i16 = i13 - 1; i16 >= 0; i16--) {
                                    sparseIntArray2.put(i16 + 1, sparseIntArray2.get(i16));
                                }
                                org.telegram.messenger.mo moVar = (org.telegram.messenger.mo) T0.remove(i13);
                                moVar.f = 0;
                                T0.add(0, moVar);
                                sparseIntArray2.put(0, i14);
                                arrayList4.add(0, (yy) arrayList4.remove(i13));
                                ((yy) arrayList4.get(0)).a = i15;
                                for (int i17 = 0; i17 <= i13; i17++) {
                                    ((yy) arrayList4.get(i17)).a = i17;
                                    ((org.telegram.messenger.mo) T0.get(i17)).f = i17;
                                }
                                int i18 = 0;
                                while (i18 <= i13) {
                                    if (bzVar2.L == i18) {
                                        int i19 = i18 == i13 ? 0 : i18 + 1;
                                        bzVar2.M = i19;
                                        bzVar2.L = i19;
                                    }
                                    if (bzVar2.r0 == i18) {
                                        int i20 = i18 == i13 ? 0 : i18 + 1;
                                        bzVar2.s0 = i20;
                                        bzVar2.r0 = i20;
                                    }
                                    i18++;
                                }
                                n4Var.j(i13, 0);
                                xy xyVar = bzVar2.K;
                                int i21 = ((yy) arrayList4.get(i13)).a;
                                org.telegram.ui.kw kwVar = (org.telegram.ui.kw) xyVar;
                                int i22 = 0;
                                while (true) {
                                    org.telegram.ui.tw[] twVarArr = kwVar.b.f0;
                                    if (i22 < twVarArr.length) {
                                        org.telegram.ui.tw twVar = twVarArr[i22];
                                        int i23 = twVar.h;
                                        if (i23 == i21) {
                                            twVar.h = i15;
                                        } else if (i23 == i15) {
                                            twVar.h = i21;
                                        }
                                        i22++;
                                    } else {
                                        bzVar2.j();
                                        bzVar2.E = true;
                                        bzVar2.G.setItemAnimator(bzVar2.t0);
                                    }
                                }
                            }
                            bzVar.G.v0(0);
                            org.telegram.ui.jw jwVar = (org.telegram.ui.jw) bzVar;
                            org.telegram.ui.uw uwVar = jwVar.C0;
                            if (!uwVar.getMessagesController().D3()) {
                                try {
                                    jwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                ac J = fc.a0(uwVar).J(R.raw.filter_reorder, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131748952, org.telegram.messenger.bd.M0(2131750808, null))), org.telegram.messenger.bd.M0(2131747041, null), 5000, false, new org.telegram.ui.xg(jwVar, 24));
                                J.k(true);
                                uwVar.p3 = J;
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
                gz gzVar = (gz) obj;
                if (!gzVar.c) {
                    gzVar.setLayerType(0, null);
                    break;
                }
                break;
            case 18:
                ((l10) obj).g(true);
                break;
            case 19:
                org.telegram.ui.cw cwVar = ((zl0) ((q20) obj)).f0;
                if (!cwVar.x0.canScrollVertically(-1)) {
                    cwVar.w0.h1(0, 0);
                    break;
                }
                break;
            case 20:
                ((s20) obj).b.a();
                break;
            case 21:
                h30 h30Var = (h30) obj;
                fh0 fh0Var = h30Var.n1;
                if (h30Var.p1) {
                    fh0Var.getAnimatedDrawable().K(0);
                    fh0Var.setAnimation(h30Var.q1);
                    fh0Var.d();
                    break;
                }
                break;
            case 22:
                k40 k40Var = (k40) ((g6.q) obj).b;
                try {
                    m51 m51Var = k40Var.T;
                    if (m51Var != null && (b20Var = k40Var.S) != null) {
                        if (b20Var.b > 0) {
                            long S = m51Var.S();
                            org.telegram.messenger.b20 b20Var2 = k40Var.S;
                            if (S >= b20Var2.b) {
                                m51 m51Var2 = k40Var.T;
                                long j10 = b20Var2.a;
                                m51Var2.q0(j10 > 0 ? j10 : 0L, false);
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
                c80 c80Var = (c80) obj;
                c80Var.k = false;
                c80Var.c();
                break;
            case 24:
                l80 l80Var = (l80) obj;
                if (l80Var.d) {
                    l80Var.e = true;
                    l80Var.r = false;
                    l80Var.f = 0.0f;
                    l80Var.h = SystemClock.uptimeMillis();
                    l80Var.invalidate();
                    break;
                }
                break;
            case 25:
                final c90 c90Var = (c90) obj;
                boolean z10 = c90Var.J;
                boolean z11 = !z10;
                kg.k1 k1Var = c90Var.e;
                b90 b90Var = c90Var.b;
                if (b90Var == null || k1Var == null) {
                    c90Var.P = 0;
                    break;
                } else if (c90Var.M && (gVar = c90Var.L) != null && gVar.f && !z10) {
                    c90Var.P = 0;
                    break;
                } else {
                    boolean g7 = c90Var.g();
                    if (z10) {
                        int computeVerticalScrollRange = b90Var.computeVerticalScrollRange();
                        float f11 = (computeVerticalScrollRange - k1Var.h) + c90Var.s;
                        if (computeVerticalScrollRange <= 0 && c90Var.f.K() > 0 && (i3 = c90Var.P) < 3) {
                            c90Var.P = i3 + 1;
                            c90Var.o(true);
                            break;
                        } else {
                            f10 = f11;
                        }
                    } else {
                        f10 = (-c90Var.s) - org.telegram.messenger.g0.L(6.0f);
                    }
                    c90Var.P = 0;
                    float f12 = c90Var.w;
                    float max = g7 ? -Math.max(0.0f, f12 - f10) : Math.max(0.0f, f12 - f10) + (-f12);
                    if (!z10 && !g7) {
                        max += b90Var.computeVerticalScrollOffset();
                    }
                    final float f13 = max;
                    q1.g gVar2 = c90Var.L;
                    if (gVar2 != null) {
                        gVar2.d();
                    }
                    c90Var.M = z11;
                    final float translationY = b90Var.getTranslationY();
                    final float f14 = c90Var.N;
                    float f15 = z10 ? 0.0f : 1.0f;
                    if (translationY == f13) {
                        c90Var.L = null;
                        num = Integer.valueOf(z10 ? 0 : 8);
                        if (c90Var.O && !z10) {
                            c90Var.O = false;
                            b90Var.setLayoutManager(c90Var.getNeededLayoutManager());
                            c90Var.J = true;
                            c90Var.o(true);
                        }
                    } else {
                        q1.g gVar3 = new q1.g(new q1.f(translationY));
                        q1.h hVar = new q1.h(f13);
                        hVar.a(1.0f);
                        hVar.b(550.0f);
                        gVar3.m = hVar;
                        c90Var.L = gVar3;
                        final float f16 = f15;
                        q1.d dVar = new q1.d() { // from class: org.telegram.ui.Components.t80
                            @Override // q1.d
                            public final void a(q1.g gVar4, float f17, float f18) {
                                c90 c90Var2 = c90.this;
                                c90Var2.b.setTranslationY(f17);
                                c90Var2.i();
                                float f19 = translationY;
                                c90Var2.N = org.telegram.messenger.g0.T1(f14, f16, (f17 - f19) / (f13 - f19));
                            }
                        };
                        c90Var = c90Var;
                        gVar3.b(dVar);
                        if (!z10) {
                            c90Var.L.a(new gi.d4(c90Var, z11, 2));
                        }
                        c90Var.L.a(new u80());
                        c90Var.L.h();
                    }
                    if (num != null && c90Var.getVisibility() != num.intValue()) {
                        c90Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            case 26:
                ((x90) ((p90) obj).T).n.f();
                break;
            case 27:
                ((ia0) obj).a();
                break;
            case 28:
                ((gi.u) obj).invalidateSelf();
                break;
            default:
                ((sz) obj).invalidateSelf();
                break;
        }
    }

    public /* synthetic */ gp(kt ktVar, t70 t70Var, ClickableSpan clickableSpan) {
        this.a = 8;
        this.b = ktVar;
    }
}
