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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class lo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lo(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.d20 d20Var;
        float f10;
        int i7;
        r1.g gVar;
        int i10 = this.a;
        Integer num = null;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((no) obj).v();
                break;
            case 1:
                ((po) obj).setVisibility(8);
                break;
            case 2:
                ((zp) obj).dismiss();
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
                br brVar = ((ar) obj).c;
                TLRPC.Peer peer = brVar.Z1;
                org.telegram.ui.ActionBar.g2 g2Var = brVar.b2;
                gr grVar = new gr(g2Var, peer, brVar.c2, brVar.U1.size() > 1, brVar.T1);
                if (g2Var.getParentActivity() != null) {
                    g2Var.showDialog(grVar);
                    break;
                } else {
                    grVar.show();
                    break;
                }
            case 6:
                ((hi.e) obj).setLoading(true);
                break;
            case 7:
                zr zrVar = (zr) obj;
                zrVar.a.a(!r0.f, true);
                org.telegram.messenger.g0.h3(zrVar.f, 3000L);
                break;
            case 8:
                ((om0) obj).W(false);
                break;
            case 9:
                ((zs) obj).a();
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
                pw pwVar = (pw) obj;
                if (pwVar.a0.getEmojiView() != null) {
                    qy emojiView = pwVar.a0.getEmojiView();
                    if (!emojiView.g0) {
                        try {
                            SparseIntArray sparseIntArray = emojiView.S.s;
                            char[] cArr = org.telegram.messenger.k6.a;
                            int i11 = sparseIntArray.get(8);
                            if (i11 > 0) {
                                emojiView.Q.C0();
                                emojiView.V(i11);
                                emojiView.F(i11, org.telegram.messenger.g0.L(-9.0f));
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
                ix ixVar = (ix) obj;
                ixVar.x.f = true;
                ixVar.a(true);
                break;
            case 16:
                org.telegram.messenger.g0.T3(((dy) obj).h, true, true);
                break;
            case 17:
                ky kyVar = (ky) obj;
                ArrayList arrayList = kyVar.r;
                ArrayList arrayList2 = kyVar.h;
                ly lyVar = kyVar.x;
                int i12 = lyVar.N;
                qy qyVar = lyVar.R;
                aw awVar = qyVar.E0;
                if (i12 == kyVar.b) {
                    arrayList2.remove(arrayList);
                    lyVar.F = kyVar.c;
                    lyVar.G = kyVar.d;
                    lyVar.H = kyVar.e;
                    lyVar.I = kyVar.f;
                    lyVar.J = arrayList2;
                    lyVar.K = kyVar.n;
                    lyVar.L = new ArrayList(arrayList);
                    qyVar.H0.e(false);
                    v4.i0 adapter = awVar.getAdapter();
                    ly lyVar2 = qyVar.A0;
                    if (adapter != lyVar2) {
                        awVar.setAdapter(lyVar2);
                    }
                    lyVar.f();
                    break;
                }
                break;
            case 18:
                oz ozVar = (oz) ((nz) obj).f;
                ArrayList arrayList3 = ozVar.h;
                if (!org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0).q()) {
                    int i13 = 0;
                    while (i13 < arrayList3.size()) {
                        if (((lz) arrayList3.get(i13)).e && i13 != 0) {
                            org.telegram.ui.l4 l4Var = ozVar.J;
                            oz ozVar2 = (oz) l4Var.e;
                            ArrayList arrayList4 = ozVar2.h;
                            SparseIntArray sparseIntArray2 = ozVar2.l0;
                            int size = arrayList4.size();
                            if (i13 >= 0 && i13 < size) {
                                ArrayList V0 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).V0();
                                int i14 = sparseIntArray2.get(i13);
                                int i15 = ((lz) arrayList4.get(i13)).a;
                                for (int i16 = i13 - 1; i16 >= 0; i16--) {
                                    sparseIntArray2.put(i16 + 1, sparseIntArray2.get(i16));
                                }
                                org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) V0.remove(i13);
                                roVar.f = 0;
                                V0.add(0, roVar);
                                sparseIntArray2.put(0, i14);
                                arrayList4.add(0, (lz) arrayList4.remove(i13));
                                ((lz) arrayList4.get(0)).a = i15;
                                for (int i17 = 0; i17 <= i13; i17++) {
                                    ((lz) arrayList4.get(i17)).a = i17;
                                    ((org.telegram.messenger.ro) V0.get(i17)).f = i17;
                                }
                                int i18 = 0;
                                while (i18 <= i13) {
                                    if (ozVar2.L == i18) {
                                        int i19 = i18 == i13 ? 0 : i18 + 1;
                                        ozVar2.M = i19;
                                        ozVar2.L = i19;
                                    }
                                    if (ozVar2.r0 == i18) {
                                        int i20 = i18 == i13 ? 0 : i18 + 1;
                                        ozVar2.s0 = i20;
                                        ozVar2.r0 = i20;
                                    }
                                    i18++;
                                }
                                l4Var.j(i13, 0);
                                kz kzVar = ozVar2.K;
                                int i21 = ((lz) arrayList4.get(i13)).a;
                                org.telegram.ui.sw swVar = (org.telegram.ui.sw) kzVar;
                                int i22 = 0;
                                while (true) {
                                    org.telegram.ui.ax[] axVarArr = swVar.b.f0;
                                    if (i22 < axVarArr.length) {
                                        org.telegram.ui.ax axVar = axVarArr[i22];
                                        int i23 = axVar.h;
                                        if (i23 == i21) {
                                            axVar.h = i15;
                                        } else if (i23 == i15) {
                                            axVar.h = i21;
                                        }
                                        i22++;
                                    } else {
                                        ozVar2.m();
                                        ozVar2.E = true;
                                        ozVar2.G.setItemAnimator(ozVar2.t0);
                                    }
                                }
                            }
                            ozVar.G.v0(0);
                            org.telegram.ui.qw qwVar = (org.telegram.ui.qw) ozVar;
                            org.telegram.ui.bx bxVar = qwVar.I0;
                            if (!bxVar.getMessagesController().K3()) {
                                try {
                                    qwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                fc J = kc.b0(bxVar).J(R.raw.filter_reorder, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131748751, org.telegram.messenger.gd.N0(2131750795, null))), org.telegram.messenger.gd.N0(2131746839, null), 5000, false, new org.telegram.ui.ch(qwVar, 24));
                                J.k(true);
                                bxVar.q3 = J;
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
                tz tzVar = (tz) obj;
                if (!tzVar.c) {
                    tzVar.setLayerType(0, null);
                    break;
                }
                break;
            case 20:
                ((a20) obj).h(true);
                break;
            case 21:
                org.telegram.ui.jw jwVar = ((km0) ((f30) obj)).f0;
                if (!jwVar.x0.canScrollVertically(-1)) {
                    jwVar.w0.h1(0, 0);
                    break;
                }
                break;
            case 22:
                ((h30) obj).b.a();
                break;
            case 23:
                w30 w30Var = (w30) obj;
                qh0 qh0Var = w30Var.q1;
                if (w30Var.s1) {
                    qh0Var.getAnimatedDrawable().K(0);
                    qh0Var.setAnimation(w30Var.t1);
                    qh0Var.d();
                    break;
                }
                break;
            case 24:
                z40 z40Var = (z40) ((h6.s) obj).b;
                try {
                    h61 h61Var = z40Var.T;
                    if (h61Var != null && (d20Var = z40Var.S) != null) {
                        if (d20Var.b > 0) {
                            long S = h61Var.S();
                            org.telegram.messenger.d20 d20Var2 = z40Var.S;
                            if (S >= d20Var2.b) {
                                h61 h61Var2 = z40Var.T;
                                long j3 = d20Var2.a;
                                h61Var2.q0(j3 > 0 ? j3 : 0L, false);
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
                t80 t80Var = (t80) obj;
                t80Var.k = false;
                t80Var.c();
                break;
            case 26:
                b90 b90Var = (b90) obj;
                if (b90Var.d) {
                    b90Var.e = true;
                    b90Var.r = false;
                    b90Var.f = 0.0f;
                    b90Var.h = SystemClock.uptimeMillis();
                    b90Var.invalidate();
                    break;
                }
                break;
            case 27:
                final s90 s90Var = (s90) obj;
                boolean z10 = s90Var.J;
                boolean z11 = !z10;
                jg.n1 n1Var = s90Var.e;
                r90 r90Var = s90Var.b;
                if (r90Var == null || n1Var == null) {
                    s90Var.P = 0;
                    break;
                } else if (s90Var.M && (gVar = s90Var.L) != null && gVar.f && !z10) {
                    s90Var.P = 0;
                    break;
                } else {
                    boolean g10 = s90Var.g();
                    if (z10) {
                        int computeVerticalScrollRange = r90Var.computeVerticalScrollRange();
                        float f11 = (computeVerticalScrollRange - n1Var.h) + s90Var.s;
                        if (computeVerticalScrollRange <= 0 && s90Var.f.K() > 0 && (i7 = s90Var.P) < 3) {
                            s90Var.P = i7 + 1;
                            s90Var.o(true);
                            break;
                        } else {
                            f10 = f11;
                        }
                    } else {
                        f10 = (-s90Var.s) - org.telegram.messenger.g0.L(6.0f);
                    }
                    s90Var.P = 0;
                    float f12 = s90Var.w;
                    float max = g10 ? -Math.max(0.0f, f12 - f10) : Math.max(0.0f, f12 - f10) + (-f12);
                    if (!z10 && !g10) {
                        max += r90Var.computeVerticalScrollOffset();
                    }
                    final float f13 = max;
                    r1.g gVar2 = s90Var.L;
                    if (gVar2 != null) {
                        gVar2.d();
                    }
                    s90Var.M = z11;
                    final float translationY = r90Var.getTranslationY();
                    final float f14 = s90Var.N;
                    float f15 = z10 ? 0.0f : 1.0f;
                    if (translationY == f13) {
                        s90Var.L = null;
                        num = Integer.valueOf(z10 ? 0 : 8);
                        if (s90Var.O && !z10) {
                            s90Var.O = false;
                            r90Var.setLayoutManager(s90Var.getNeededLayoutManager());
                            s90Var.J = true;
                            s90Var.o(true);
                        }
                    } else {
                        r1.g gVar3 = new r1.g(new r1.f(translationY));
                        r1.h hVar = new r1.h(f13);
                        hVar.a(1.0f);
                        hVar.b(550.0f);
                        gVar3.m = hVar;
                        s90Var.L = gVar3;
                        final float f16 = f15;
                        r1.d dVar = new r1.d() { // from class: org.telegram.ui.Components.j90
                            @Override // r1.d
                            public final void a(r1.g gVar4, float f17, float f18) {
                                s90 s90Var2 = s90.this;
                                s90Var2.b.setTranslationY(f17);
                                s90Var2.i();
                                float f19 = translationY;
                                s90Var2.N = org.telegram.messenger.g0.T1(f14, f16, (f17 - f19) / (f13 - f19));
                            }
                        };
                        s90Var = s90Var;
                        gVar3.b(dVar);
                        if (!z10) {
                            s90Var.L.a(new hi.l4(s90Var, z11, 2));
                        }
                        s90Var.L.a(new k90());
                        s90Var.L.h();
                    }
                    if (num != null && s90Var.getVisibility() != num.intValue()) {
                        s90Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            case 28:
                ((na0) ((fa0) obj).T).n.f();
                break;
            default:
                ((wa0) obj).a();
                break;
        }
    }

    public /* synthetic */ lo(xt xtVar, k80 k80Var, ClickableSpan clickableSpan) {
        this.a = 10;
        this.b = xtVar;
    }
}
