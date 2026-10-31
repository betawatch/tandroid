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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ho implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ho(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.x20 x20Var;
        float f7;
        int i10;
        final y90 y90Var;
        o1.j jVar;
        int i11 = this.a;
        Integer num = null;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((io) obj).setVisibility(8);
                break;
            case 1:
                ((gp) obj).b.a();
                break;
            case 2:
                ((sp) obj).dismiss();
                break;
            case 3:
                ((gq) obj).a();
                break;
            case 4:
                ((org.telegram.ui.ActionBar.z2) obj).dismiss();
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    break;
                }
                break;
            case 5:
                yq yqVar = ((xq) obj).c;
                TLRPC.Peer peer = yqVar.V1;
                org.telegram.ui.ActionBar.k2 k2Var = yqVar.X1;
                cr crVar = new cr(k2Var, peer, yqVar.Y1, yqVar.Q1.size() > 1, yqVar.P1);
                if (k2Var.getParentActivity() != null) {
                    k2Var.showDialog(crVar);
                    break;
                } else {
                    crVar.show();
                    break;
                }
            case 6:
                ((vh.d) obj).setLoading(true);
                break;
            case 7:
                xr xrVar = (xr) obj;
                xrVar.a.a(!r0.f, true);
                org.telegram.messenger.i0.h3(xrVar.f, 3000L);
                break;
            case 8:
                ((bn0) obj).W(false);
                break;
            case 9:
                ((ys) obj).a();
                break;
            case 10:
                ((xt) obj).getClass();
                break;
            case 11:
                gf.f.r(((hu) ((ji.i) obj).b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 12:
                hu huVar = ((gu) obj).a;
                huVar.o1.setVisibility(4);
                huVar.n1.setVisibility(4);
                ImageView imageView = huVar.t1;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 13:
                ((yu) obj).a(true, true);
                break;
            case 14:
                tw twVar = (tw) obj;
                if (twVar.Z.getEmojiView() != null) {
                    vy emojiView = twVar.Z.getEmojiView();
                    if (!emojiView.f0) {
                        try {
                            SparseIntArray sparseIntArray = emojiView.R.s;
                            char[] cArr = org.telegram.messenger.l6.a;
                            int i12 = sparseIntArray.get(8);
                            if (i12 > 0) {
                                emojiView.P.C0();
                                emojiView.V(i12);
                                emojiView.H(i12, org.telegram.messenger.i0.L(-9.0f));
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
                mx mxVar = (mx) obj;
                mxVar.x.f = true;
                mxVar.a(true);
                break;
            case 16:
                org.telegram.messenger.i0.U3(((iy) obj).h, true, true);
                break;
            case 17:
                py pyVar = (py) obj;
                ArrayList arrayList = pyVar.r;
                ArrayList arrayList2 = pyVar.h;
                qy qyVar = pyVar.x;
                int i13 = qyVar.M;
                vy vyVar = qyVar.Q;
                bw bwVar = vyVar.D0;
                if (i13 == pyVar.b) {
                    arrayList2.remove(arrayList);
                    qyVar.E = pyVar.c;
                    qyVar.F = pyVar.d;
                    qyVar.G = pyVar.e;
                    qyVar.H = pyVar.f;
                    qyVar.I = arrayList2;
                    qyVar.J = pyVar.n;
                    qyVar.K = new ArrayList(arrayList);
                    vyVar.G0.e(false);
                    s4.g0 adapter = bwVar.getAdapter();
                    qy qyVar2 = vyVar.z0;
                    if (adapter != qyVar2) {
                        bwVar.setAdapter(qyVar2);
                    }
                    qyVar.f();
                    break;
                }
                break;
            case 18:
                tz tzVar = (tz) ((sz) obj).f;
                ArrayList arrayList3 = tzVar.h;
                if (!org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).q()) {
                    int i14 = 0;
                    while (i14 < arrayList3.size()) {
                        if (((pz) arrayList3.get(i14)).e && i14 != 0) {
                            fg.j jVar2 = tzVar.I;
                            tz tzVar2 = (tz) jVar2.e;
                            ArrayList arrayList4 = tzVar2.h;
                            SparseIntArray sparseIntArray2 = tzVar2.k0;
                            int size = arrayList4.size();
                            if (i14 >= 0 && i14 < size) {
                                ArrayList S0 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).S0();
                                int i15 = sparseIntArray2.get(i14);
                                int i16 = ((pz) arrayList4.get(i14)).a;
                                for (int i17 = i14 - 1; i17 >= 0; i17--) {
                                    sparseIntArray2.put(i17 + 1, sparseIntArray2.get(i17));
                                }
                                org.telegram.messenger.ap apVar = (org.telegram.messenger.ap) S0.remove(i14);
                                apVar.f = 0;
                                S0.add(0, apVar);
                                sparseIntArray2.put(0, i15);
                                arrayList4.add(0, (pz) arrayList4.remove(i14));
                                ((pz) arrayList4.get(0)).a = i16;
                                for (int i18 = 0; i18 <= i14; i18++) {
                                    ((pz) arrayList4.get(i18)).a = i18;
                                    ((org.telegram.messenger.ap) S0.get(i18)).f = i18;
                                }
                                int i19 = 0;
                                while (i19 <= i14) {
                                    if (tzVar2.K == i19) {
                                        int i20 = i19 == i14 ? 0 : i19 + 1;
                                        tzVar2.L = i20;
                                        tzVar2.K = i20;
                                    }
                                    if (tzVar2.q0 == i19) {
                                        int i21 = i19 == i14 ? 0 : i19 + 1;
                                        tzVar2.r0 = i21;
                                        tzVar2.q0 = i21;
                                    }
                                    i19++;
                                }
                                jVar2.j(i14, 0);
                                oz ozVar = tzVar2.J;
                                int i22 = ((pz) arrayList4.get(i14)).a;
                                org.telegram.ui.rx rxVar = (org.telegram.ui.rx) ozVar;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.zx[] zxVarArr = rxVar.b.e0;
                                    if (i23 < zxVarArr.length) {
                                        org.telegram.ui.zx zxVar = zxVarArr[i23];
                                        int i24 = zxVar.h;
                                        if (i24 == i22) {
                                            zxVar.h = i16;
                                        } else if (i24 == i16) {
                                            zxVar.h = i22;
                                        }
                                        i23++;
                                    } else {
                                        tzVar2.j();
                                        tzVar2.D = true;
                                        tzVar2.F.setItemAnimator(tzVar2.s0);
                                    }
                                }
                            }
                            tzVar.F.v0(0);
                            org.telegram.ui.qx qxVar = (org.telegram.ui.qx) tzVar;
                            org.telegram.ui.ay ayVar = qxVar.B0;
                            if (!ayVar.getMessagesController().A3()) {
                                try {
                                    qxVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                wb J = cc.a0(ayVar).J(R.raw.filter_reorder, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131748954, org.telegram.messenger.cd.L0(2131750808, null))), org.telegram.messenger.cd.L0(2131747048, null), 5000, false, new org.telegram.ui.rh(qxVar, 25));
                                J.k(true);
                                ayVar.o3 = J;
                                break;
                            }
                        } else {
                            i14++;
                        }
                    }
                    break;
                }
                break;
            case 19:
                xz xzVar = (xz) obj;
                if (!xzVar.c) {
                    xzVar.setLayerType(0, null);
                    break;
                }
                break;
            case 20:
                ((g20) obj).g(true);
                break;
            case 21:
                org.telegram.ui.kx kxVar = ((xm0) ((m30) obj)).e0;
                if (!kxVar.w0.canScrollVertically(-1)) {
                    kxVar.v0.h1(0, 0);
                    break;
                }
                break;
            case 22:
                ((o30) obj).b.b(true);
                break;
            case 23:
                ((o30) obj).b.b(true);
                break;
            case 24:
                d40 d40Var = (d40) obj;
                ei0 ei0Var = d40Var.m1;
                if (d40Var.o1) {
                    ei0Var.getAnimatedDrawable().K(0);
                    ei0Var.setAnimation(d40Var.p1);
                    ei0Var.d();
                    break;
                }
                break;
            case 25:
                e50 e50Var = (e50) ((e6.r) obj).b;
                try {
                    u61 u61Var = e50Var.S;
                    if (u61Var != null && (x20Var = e50Var.R) != null) {
                        if (x20Var.b > 0) {
                            long S = u61Var.S();
                            org.telegram.messenger.x20 x20Var2 = e50Var.R;
                            if (S >= x20Var2.b) {
                                u61 u61Var2 = e50Var.S;
                                long j10 = x20Var2.a;
                                u61Var2.q0(j10 > 0 ? j10 : 0L, false);
                                break;
                            }
                        }
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
                break;
            case 26:
                z80 z80Var = (z80) obj;
                z80Var.k = false;
                z80Var.c();
                break;
            case 27:
                h90 h90Var = (h90) obj;
                if (h90Var.d) {
                    h90Var.e = true;
                    h90Var.r = false;
                    h90Var.f = 0.0f;
                    h90Var.h = SystemClock.uptimeMillis();
                    h90Var.invalidate();
                    break;
                }
                break;
            case 28:
                y90 y90Var2 = (y90) obj;
                boolean z10 = y90Var2.I;
                boolean z11 = !z10;
                zf.c1 c1Var = y90Var2.e;
                x90 x90Var = y90Var2.b;
                if (x90Var == null || c1Var == null) {
                    y90Var2.O = 0;
                    break;
                } else if (y90Var2.L && (jVar = y90Var2.K) != null && jVar.f && !z10) {
                    y90Var2.O = 0;
                    break;
                } else {
                    boolean g10 = y90Var2.g();
                    if (z10) {
                        int computeVerticalScrollRange = x90Var.computeVerticalScrollRange();
                        float f10 = (computeVerticalScrollRange - c1Var.h) + y90Var2.s;
                        if (computeVerticalScrollRange <= 0 && y90Var2.f.K() > 0 && (i10 = y90Var2.O) < 3) {
                            y90Var2.O = i10 + 1;
                            y90Var2.o(true);
                            break;
                        } else {
                            f7 = f10;
                        }
                    } else {
                        f7 = (-y90Var2.s) - org.telegram.messenger.i0.L(6.0f);
                    }
                    y90Var2.O = 0;
                    float f11 = y90Var2.w;
                    float max = g10 ? -Math.max(0.0f, f11 - f7) : Math.max(0.0f, f11 - f7) + (-f11);
                    if (!z10 && !g10) {
                        max += x90Var.computeVerticalScrollOffset();
                    }
                    final float f12 = max;
                    o1.j jVar3 = y90Var2.K;
                    if (jVar3 != null) {
                        jVar3.d();
                    }
                    y90Var2.L = z11;
                    final float translationY = x90Var.getTranslationY();
                    final float f13 = y90Var2.M;
                    float f14 = z10 ? 0.0f : 1.0f;
                    if (translationY == f12) {
                        y90Var2.K = null;
                        num = Integer.valueOf(z10 ? 0 : 8);
                        if (y90Var2.N && !z10) {
                            y90Var2.N = false;
                            x90Var.setLayoutManager(y90Var2.getNeededLayoutManager());
                            y90Var2.I = true;
                            y90Var2.o(true);
                        }
                        y90Var = y90Var2;
                    } else {
                        o1.j jVar4 = new o1.j(new o1.i(translationY));
                        o1.k kVar = new o1.k(f12);
                        kVar.a(1.0f);
                        kVar.b(550.0f);
                        jVar4.m = kVar;
                        y90Var2.K = jVar4;
                        y90Var = y90Var2;
                        final float f15 = f14;
                        jVar4.b(new o1.g() { // from class: org.telegram.ui.Components.p90
                            @Override // o1.g
                            public final void a(o1.j jVar5, float f16, float f17) {
                                y90 y90Var3 = y90.this;
                                y90Var3.b.setTranslationY(f16);
                                y90Var3.i();
                                float f18 = translationY;
                                y90Var3.M = org.telegram.messenger.i0.T1(f13, f15, (f16 - f18) / (f12 - f18));
                            }
                        });
                        if (!z10) {
                            y90Var.K.a(new jg.u(y90Var, z11, 2));
                        }
                        y90Var.K.a(new q90());
                        y90Var.K.h();
                    }
                    if (num != null && y90Var.getVisibility() != num.intValue()) {
                        y90Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            default:
                ((ua0) ((jg.g1) obj).T).n.f();
                break;
        }
    }

    public /* synthetic */ ho(xt xtVar, q80 q80Var, ClickableSpan clickableSpan) {
        this.a = 10;
        this.b = xtVar;
    }
}
