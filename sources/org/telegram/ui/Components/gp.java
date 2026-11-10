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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                ((org.telegram.ui.ActionBar.w2) obj).dismiss();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    break;
                }
                break;
            case 3:
                nq nqVar = ((mq) obj).c;
                TLRPC.Peer peer = nqVar.Y1;
                org.telegram.ui.ActionBar.f2 f2Var = nqVar.a2;
                sq sqVar = new sq(f2Var, peer, nqVar.b2, nqVar.T1.size() > 1, nqVar.S1);
                if (f2Var.getParentActivity() != null) {
                    f2Var.showDialog(sqVar);
                    break;
                } else {
                    sqVar.show();
                    break;
                }
            case 4:
                ((fi.d) obj).setLoading(true);
                break;
            case 5:
                mr mrVar = (mr) obj;
                mrVar.a.a(!r0.f, true);
                org.telegram.messenger.g0.i3(mrVar.f, 3000L);
                break;
            case 6:
                ((am0) obj).W(false);
                break;
            case 7:
                ((ms) obj).a();
                break;
            case 8:
                ((lt) obj).getClass();
                break;
            case 9:
                vf.c.t(((vt) ((org.telegram.ui.n1) obj).b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 10:
                vt vtVar = ((ut) obj).a;
                vtVar.r1.setVisibility(4);
                vtVar.q1.setVisibility(4);
                ImageView imageView = vtVar.w1;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 11:
                ((mu) obj).a(true, true);
                break;
            case 12:
                ew ewVar = (ew) obj;
                if (ewVar.Z.getEmojiView() != null) {
                    gy emojiView = ewVar.Z.getEmojiView();
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
                xw xwVar = (xw) obj;
                xwVar.x.f = true;
                xwVar.a(true);
                break;
            case 14:
                org.telegram.messenger.g0.V3(((tx) obj).h, true, true);
                break;
            case 15:
                zx zxVar = (zx) obj;
                ArrayList arrayList = zxVar.r;
                ArrayList arrayList2 = zxVar.h;
                ay ayVar = zxVar.x;
                int i12 = ayVar.M;
                gy gyVar = ayVar.Q;
                pv pvVar = gyVar.D0;
                if (i12 == zxVar.b) {
                    arrayList2.remove(arrayList);
                    ayVar.E = zxVar.c;
                    ayVar.F = zxVar.d;
                    ayVar.G = zxVar.e;
                    ayVar.H = zxVar.f;
                    ayVar.I = arrayList2;
                    ayVar.J = zxVar.n;
                    ayVar.K = new ArrayList(arrayList);
                    gyVar.G0.e(false);
                    v4.g0 adapter = pvVar.getAdapter();
                    ay ayVar2 = gyVar.z0;
                    if (adapter != ayVar2) {
                        pvVar.setAdapter(ayVar2);
                    }
                    ayVar.f();
                    break;
                }
                break;
            case 16:
                ez ezVar = (ez) ((dz) obj).f;
                ArrayList arrayList3 = ezVar.h;
                if (!org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q()) {
                    int i13 = 0;
                    while (i13 < arrayList3.size()) {
                        if (((bz) arrayList3.get(i13)).e && i13 != 0) {
                            org.telegram.ui.l4 l4Var = ezVar.I;
                            ez ezVar2 = (ez) l4Var.e;
                            ArrayList arrayList4 = ezVar2.h;
                            SparseIntArray sparseIntArray2 = ezVar2.k0;
                            int size = arrayList4.size();
                            if (i13 >= 0 && i13 < size) {
                                ArrayList T0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).T0();
                                int i14 = sparseIntArray2.get(i13);
                                int i15 = ((bz) arrayList4.get(i13)).a;
                                for (int i16 = i13 - 1; i16 >= 0; i16--) {
                                    sparseIntArray2.put(i16 + 1, sparseIntArray2.get(i16));
                                }
                                org.telegram.messenger.vo voVar = (org.telegram.messenger.vo) T0.remove(i13);
                                voVar.f = 0;
                                T0.add(0, voVar);
                                sparseIntArray2.put(0, i14);
                                arrayList4.add(0, (bz) arrayList4.remove(i13));
                                ((bz) arrayList4.get(0)).a = i15;
                                for (int i17 = 0; i17 <= i13; i17++) {
                                    ((bz) arrayList4.get(i17)).a = i17;
                                    ((org.telegram.messenger.vo) T0.get(i17)).f = i17;
                                }
                                int i18 = 0;
                                while (i18 <= i13) {
                                    if (ezVar2.K == i18) {
                                        int i19 = i18 == i13 ? 0 : i18 + 1;
                                        ezVar2.L = i19;
                                        ezVar2.K = i19;
                                    }
                                    if (ezVar2.q0 == i18) {
                                        int i20 = i18 == i13 ? 0 : i18 + 1;
                                        ezVar2.r0 = i20;
                                        ezVar2.q0 = i20;
                                    }
                                    i18++;
                                }
                                l4Var.j(i13, 0);
                                az azVar = ezVar2.J;
                                int i21 = ((bz) arrayList4.get(i13)).a;
                                org.telegram.ui.qw qwVar = (org.telegram.ui.qw) azVar;
                                int i22 = 0;
                                while (true) {
                                    org.telegram.ui.yw[] ywVarArr = qwVar.b.e0;
                                    if (i22 < ywVarArr.length) {
                                        org.telegram.ui.yw ywVar = ywVarArr[i22];
                                        int i23 = ywVar.h;
                                        if (i23 == i21) {
                                            ywVar.h = i15;
                                        } else if (i23 == i15) {
                                            ywVar.h = i21;
                                        }
                                        i22++;
                                    } else {
                                        ezVar2.j();
                                        ezVar2.D = true;
                                        ezVar2.F.setItemAnimator(ezVar2.s0);
                                    }
                                }
                            }
                            ezVar.F.v0(0);
                            org.telegram.ui.pw pwVar = (org.telegram.ui.pw) ezVar;
                            org.telegram.ui.zw zwVar = pwVar.B0;
                            if (!zwVar.getMessagesController().D3()) {
                                try {
                                    pwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                bc J = gc.a0(zwVar).J(R.raw.filter_reorder, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131748944, org.telegram.messenger.id.M0(2131750807, null))), org.telegram.messenger.id.M0(2131747033, null), 5000, false, new org.telegram.ui.dh(pwVar, 24));
                                J.k(true);
                                zwVar.p3 = J;
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
                jz jzVar = (jz) obj;
                if (!jzVar.c) {
                    jzVar.setLayerType(0, null);
                    break;
                }
                break;
            case 18:
                ((p10) obj).h(true);
                break;
            case 19:
                org.telegram.ui.iw iwVar = ((wl0) ((u20) obj)).e0;
                if (!iwVar.w0.canScrollVertically(-1)) {
                    iwVar.v0.h1(0, 0);
                    break;
                }
                break;
            case 20:
                ((w20) obj).b.a();
                break;
            case 21:
                l30 l30Var = (l30) obj;
                ch0 ch0Var = l30Var.p1;
                if (l30Var.r1) {
                    ch0Var.getAnimatedDrawable().K(0);
                    ch0Var.setAnimation(l30Var.s1);
                    ch0Var.d();
                    break;
                }
                break;
            case 22:
                o40 o40Var = (o40) ((fi.h2) obj).b;
                try {
                    t51 t51Var = o40Var.S;
                    if (t51Var != null && (j20Var = o40Var.R) != null) {
                        if (j20Var.b > 0) {
                            long S = t51Var.S();
                            org.telegram.messenger.j20 j20Var2 = o40Var.R;
                            if (S >= j20Var2.b) {
                                t51 t51Var2 = o40Var.S;
                                long j3 = j20Var2.a;
                                t51Var2.q0(j3 > 0 ? j3 : 0L, false);
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
                g80 g80Var = (g80) obj;
                g80Var.k = false;
                g80Var.c();
                break;
            case 24:
                o80 o80Var = (o80) obj;
                if (o80Var.d) {
                    o80Var.e = true;
                    o80Var.r = false;
                    o80Var.f = 0.0f;
                    o80Var.h = SystemClock.uptimeMillis();
                    o80Var.invalidate();
                    break;
                }
                break;
            case 25:
                final g90 g90Var = (g90) obj;
                boolean z9 = g90Var.I;
                boolean z10 = !z9;
                jg.o1 o1Var = g90Var.e;
                f90 f90Var = g90Var.b;
                if (f90Var == null || o1Var == null) {
                    g90Var.O = 0;
                    break;
                } else if (g90Var.L && (gVar = g90Var.K) != null && gVar.f && !z9) {
                    g90Var.O = 0;
                    break;
                } else {
                    boolean g10 = g90Var.g();
                    if (z9) {
                        int computeVerticalScrollRange = f90Var.computeVerticalScrollRange();
                        float f11 = (computeVerticalScrollRange - o1Var.h) + g90Var.s;
                        if (computeVerticalScrollRange <= 0 && g90Var.f.K() > 0 && (i7 = g90Var.O) < 3) {
                            g90Var.O = i7 + 1;
                            g90Var.o(true);
                            break;
                        } else {
                            f10 = f11;
                        }
                    } else {
                        f10 = (-g90Var.s) - org.telegram.messenger.g0.L(6.0f);
                    }
                    g90Var.O = 0;
                    float f12 = g90Var.w;
                    float max = g10 ? -Math.max(0.0f, f12 - f10) : Math.max(0.0f, f12 - f10) + (-f12);
                    if (!z9 && !g10) {
                        max += f90Var.computeVerticalScrollOffset();
                    }
                    final float f13 = max;
                    r1.g gVar2 = g90Var.K;
                    if (gVar2 != null) {
                        gVar2.d();
                    }
                    g90Var.L = z10;
                    final float translationY = f90Var.getTranslationY();
                    final float f14 = g90Var.M;
                    float f15 = z9 ? 0.0f : 1.0f;
                    if (translationY == f13) {
                        g90Var.K = null;
                        num = Integer.valueOf(z9 ? 0 : 8);
                        if (g90Var.N && !z9) {
                            g90Var.N = false;
                            f90Var.setLayoutManager(g90Var.getNeededLayoutManager());
                            g90Var.I = true;
                            g90Var.o(true);
                        }
                    } else {
                        r1.g gVar3 = new r1.g(new r1.f(translationY));
                        r1.h hVar = new r1.h(f13);
                        hVar.a(1.0f);
                        hVar.b(550.0f);
                        gVar3.m = hVar;
                        g90Var.K = gVar3;
                        final float f16 = f15;
                        r1.d dVar = new r1.d() { // from class: org.telegram.ui.Components.x80
                            @Override // r1.d
                            public final void a(r1.g gVar4, float f17, float f18) {
                                g90 g90Var2 = g90.this;
                                g90Var2.b.setTranslationY(f17);
                                g90Var2.i();
                                float f19 = translationY;
                                g90Var2.M = org.telegram.messenger.g0.T1(f14, f16, (f17 - f19) / (f13 - f19));
                            }
                        };
                        g90Var = g90Var;
                        gVar3.b(dVar);
                        if (!z9) {
                            g90Var.K.a(new fi.g4(g90Var, z10, 2));
                        }
                        g90Var.K.a(new y80());
                        g90Var.K.h();
                    }
                    if (num != null && g90Var.getVisibility() != num.intValue()) {
                        g90Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            case 26:
                ((ca0) ((u90) obj).T).n.f();
                break;
            case 27:
                ((na0) obj).a();
                break;
            case 28:
                ((fi.u) obj).invalidateSelf();
                break;
            default:
                ((wz) obj).invalidateSelf();
                break;
        }
    }

    public /* synthetic */ gp(lt ltVar, x70 x70Var, ClickableSpan clickableSpan) {
        this.a = 8;
        this.b = ltVar;
    }
}
