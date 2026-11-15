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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class fo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fo(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.messenger.g20 g20Var;
        float f10;
        int i7;
        r1.g gVar;
        int i10 = this.a;
        Integer num = null;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((ho) obj).u();
                break;
            case 1:
                ((jo) obj).setVisibility(8);
                break;
            case 2:
                ((tp) obj).dismiss();
                break;
            case 3:
                ((a5.h) obj).a();
                break;
            case 4:
                ((org.telegram.ui.ActionBar.u2) obj).dismiss();
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    break;
                }
                break;
            case 5:
                vq vqVar = ((uq) obj).c;
                TLRPC.Peer peer = vqVar.Z1;
                org.telegram.ui.ActionBar.e2 e2Var = vqVar.b2;
                ar arVar = new ar(e2Var, peer, vqVar.c2, vqVar.U1.size() > 1, vqVar.T1);
                if (e2Var.getParentActivity() != null) {
                    e2Var.showDialog(arVar);
                    break;
                } else {
                    arVar.show();
                    break;
                }
            case 6:
                ((hi.d) obj).setLoading(true);
                break;
            case 7:
                tr trVar = (tr) obj;
                trVar.a.a(!r0.f, true);
                org.telegram.messenger.g0.i3(trVar.f, 3000L);
                break;
            case 8:
                ((em0) obj).W(false);
                break;
            case 9:
                ((ts) obj).a();
                break;
            case 10:
                ((st) obj).getClass();
                break;
            case 11:
                vf.c.t(((bu) ((org.telegram.ui.n1) obj).b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 12:
                bu buVar = ((au) obj).a;
                buVar.s1.setVisibility(4);
                buVar.r1.setVisibility(4);
                ImageView imageView = buVar.x1;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 13:
                ((su) obj).a(true, true);
                break;
            case 14:
                kw kwVar = (kw) obj;
                if (kwVar.a0.getEmojiView() != null) {
                    ly emojiView = kwVar.a0.getEmojiView();
                    if (!emojiView.g0) {
                        try {
                            SparseIntArray sparseIntArray = emojiView.S.s;
                            char[] cArr = org.telegram.messenger.k6.a;
                            int i11 = sparseIntArray.get(8);
                            if (i11 > 0) {
                                emojiView.Q.C0();
                                emojiView.V(i11);
                                emojiView.H(i11, org.telegram.messenger.g0.L(-9.0f));
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
                dx dxVar = (dx) obj;
                dxVar.x.f = true;
                dxVar.a(true);
                break;
            case 16:
                org.telegram.messenger.g0.U3(((yx) obj).h, true, true);
                break;
            case 17:
                fy fyVar = (fy) obj;
                ArrayList arrayList = fyVar.r;
                ArrayList arrayList2 = fyVar.h;
                gy gyVar = fyVar.x;
                int i12 = gyVar.N;
                ly lyVar = gyVar.R;
                vv vvVar = lyVar.E0;
                if (i12 == fyVar.b) {
                    arrayList2.remove(arrayList);
                    gyVar.F = fyVar.c;
                    gyVar.G = fyVar.d;
                    gyVar.H = fyVar.e;
                    gyVar.I = fyVar.f;
                    gyVar.J = arrayList2;
                    gyVar.K = fyVar.n;
                    gyVar.L = new ArrayList(arrayList);
                    lyVar.H0.e(false);
                    v4.h0 adapter = vvVar.getAdapter();
                    gy gyVar2 = lyVar.A0;
                    if (adapter != gyVar2) {
                        vvVar.setAdapter(gyVar2);
                    }
                    gyVar.f();
                    break;
                }
                break;
            case 18:
                iz izVar = (iz) ((hz) obj).f;
                ArrayList arrayList3 = izVar.h;
                if (!org.telegram.messenger.m10.i(org.telegram.messenger.m10.t0).q()) {
                    int i13 = 0;
                    while (i13 < arrayList3.size()) {
                        if (((fz) arrayList3.get(i13)).e && i13 != 0) {
                            org.telegram.ui.l4 l4Var = izVar.J;
                            iz izVar2 = (iz) l4Var.e;
                            ArrayList arrayList4 = izVar2.h;
                            SparseIntArray sparseIntArray2 = izVar2.l0;
                            int size = arrayList4.size();
                            if (i13 >= 0 && i13 < size) {
                                ArrayList T0 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).T0();
                                int i14 = sparseIntArray2.get(i13);
                                int i15 = ((fz) arrayList4.get(i13)).a;
                                for (int i16 = i13 - 1; i16 >= 0; i16--) {
                                    sparseIntArray2.put(i16 + 1, sparseIntArray2.get(i16));
                                }
                                org.telegram.messenger.so soVar = (org.telegram.messenger.so) T0.remove(i13);
                                soVar.f = 0;
                                T0.add(0, soVar);
                                sparseIntArray2.put(0, i14);
                                arrayList4.add(0, (fz) arrayList4.remove(i13));
                                ((fz) arrayList4.get(0)).a = i15;
                                for (int i17 = 0; i17 <= i13; i17++) {
                                    ((fz) arrayList4.get(i17)).a = i17;
                                    ((org.telegram.messenger.so) T0.get(i17)).f = i17;
                                }
                                int i18 = 0;
                                while (i18 <= i13) {
                                    if (izVar2.L == i18) {
                                        int i19 = i18 == i13 ? 0 : i18 + 1;
                                        izVar2.M = i19;
                                        izVar2.L = i19;
                                    }
                                    if (izVar2.r0 == i18) {
                                        int i20 = i18 == i13 ? 0 : i18 + 1;
                                        izVar2.s0 = i20;
                                        izVar2.r0 = i20;
                                    }
                                    i18++;
                                }
                                l4Var.j(i13, 0);
                                ez ezVar = izVar2.K;
                                int i21 = ((fz) arrayList4.get(i13)).a;
                                org.telegram.ui.pw pwVar = (org.telegram.ui.pw) ezVar;
                                int i22 = 0;
                                while (true) {
                                    org.telegram.ui.xw[] xwVarArr = pwVar.b.f0;
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
                                        izVar2.j();
                                        izVar2.E = true;
                                        izVar2.G.setItemAnimator(izVar2.t0);
                                    }
                                }
                            }
                            izVar.G.v0(0);
                            org.telegram.ui.ow owVar = (org.telegram.ui.ow) izVar;
                            org.telegram.ui.yw ywVar = owVar.C0;
                            if (!ywVar.getMessagesController().D3()) {
                                try {
                                    owVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                xb J = cc.a0(ywVar).J(R.raw.filter_reorder, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131748944, org.telegram.messenger.hd.M0(2131750807, null))), org.telegram.messenger.hd.M0(2131747033, null), 5000, false, new org.telegram.ui.bh(owVar, 24));
                                J.k(true);
                                ywVar.q3 = J;
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
                nz nzVar = (nz) obj;
                if (!nzVar.c) {
                    nzVar.setLayerType(0, null);
                    break;
                }
                break;
            case 20:
                ((s10) obj).h(true);
                break;
            case 21:
                org.telegram.ui.hw hwVar = ((am0) ((x20) obj)).f0;
                if (!hwVar.x0.canScrollVertically(-1)) {
                    hwVar.w0.h1(0, 0);
                    break;
                }
                break;
            case 22:
                ((z20) obj).b.a();
                break;
            case 23:
                o30 o30Var = (o30) obj;
                fh0 fh0Var = o30Var.q1;
                if (o30Var.s1) {
                    fh0Var.getAnimatedDrawable().K(0);
                    fh0Var.setAnimation(o30Var.t1);
                    fh0Var.d();
                    break;
                }
                break;
            case 24:
                r40 r40Var = (r40) ((h6.r) obj).b;
                try {
                    u51 u51Var = r40Var.T;
                    if (u51Var != null && (g20Var = r40Var.S) != null) {
                        if (g20Var.b > 0) {
                            long S = u51Var.S();
                            org.telegram.messenger.g20 g20Var2 = r40Var.S;
                            if (S >= g20Var2.b) {
                                u51 u51Var2 = r40Var.T;
                                long j3 = g20Var2.a;
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
            case 25:
                j80 j80Var = (j80) obj;
                j80Var.k = false;
                j80Var.c();
                break;
            case 26:
                r80 r80Var = (r80) obj;
                if (r80Var.d) {
                    r80Var.e = true;
                    r80Var.r = false;
                    r80Var.f = 0.0f;
                    r80Var.h = SystemClock.uptimeMillis();
                    r80Var.invalidate();
                    break;
                }
                break;
            case 27:
                final i90 i90Var = (i90) obj;
                boolean z10 = i90Var.J;
                boolean z11 = !z10;
                jg.n1 n1Var = i90Var.e;
                h90 h90Var = i90Var.b;
                if (h90Var == null || n1Var == null) {
                    i90Var.P = 0;
                    break;
                } else if (i90Var.M && (gVar = i90Var.L) != null && gVar.f && !z10) {
                    i90Var.P = 0;
                    break;
                } else {
                    boolean g10 = i90Var.g();
                    if (z10) {
                        int computeVerticalScrollRange = h90Var.computeVerticalScrollRange();
                        float f11 = (computeVerticalScrollRange - n1Var.h) + i90Var.s;
                        if (computeVerticalScrollRange <= 0 && i90Var.f.K() > 0 && (i7 = i90Var.P) < 3) {
                            i90Var.P = i7 + 1;
                            i90Var.o(true);
                            break;
                        } else {
                            f10 = f11;
                        }
                    } else {
                        f10 = (-i90Var.s) - org.telegram.messenger.g0.L(6.0f);
                    }
                    i90Var.P = 0;
                    float f12 = i90Var.w;
                    float max = g10 ? -Math.max(0.0f, f12 - f10) : Math.max(0.0f, f12 - f10) + (-f12);
                    if (!z10 && !g10) {
                        max += h90Var.computeVerticalScrollOffset();
                    }
                    final float f13 = max;
                    r1.g gVar2 = i90Var.L;
                    if (gVar2 != null) {
                        gVar2.d();
                    }
                    i90Var.M = z11;
                    final float translationY = h90Var.getTranslationY();
                    final float f14 = i90Var.N;
                    float f15 = z10 ? 0.0f : 1.0f;
                    if (translationY == f13) {
                        i90Var.L = null;
                        num = Integer.valueOf(z10 ? 0 : 8);
                        if (i90Var.O && !z10) {
                            i90Var.O = false;
                            h90Var.setLayoutManager(i90Var.getNeededLayoutManager());
                            i90Var.J = true;
                            i90Var.o(true);
                        }
                    } else {
                        r1.g gVar3 = new r1.g(new r1.f(translationY));
                        r1.h hVar = new r1.h(f13);
                        hVar.a(1.0f);
                        hVar.b(550.0f);
                        gVar3.m = hVar;
                        i90Var.L = gVar3;
                        final float f16 = f15;
                        r1.d dVar = new r1.d() { // from class: org.telegram.ui.Components.z80
                            @Override // r1.d
                            public final void a(r1.g gVar4, float f17, float f18) {
                                i90 i90Var2 = i90.this;
                                i90Var2.b.setTranslationY(f17);
                                i90Var2.i();
                                float f19 = translationY;
                                i90Var2.N = org.telegram.messenger.g0.T1(f14, f16, (f17 - f19) / (f13 - f19));
                            }
                        };
                        i90Var = i90Var;
                        gVar3.b(dVar);
                        if (!z10) {
                            i90Var.L.a(new hi.c4(i90Var, z11, 2));
                        }
                        i90Var.L.a(new a90());
                        i90Var.L.h();
                    }
                    if (num != null && i90Var.getVisibility() != num.intValue()) {
                        i90Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            case 28:
                ((da0) ((v90) obj).T).n.f();
                break;
            default:
                ((oa0) obj).a();
                break;
        }
    }

    public /* synthetic */ fo(st stVar, a80 a80Var, ClickableSpan clickableSpan) {
        this.a = 10;
        this.b = stVar;
    }
}
