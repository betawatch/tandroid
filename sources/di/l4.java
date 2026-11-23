package di;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import di.l4;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w01;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.b61;
import org.telegram.ui.is0;
import org.telegram.ui.kf0;
import org.telegram.ui.lf0;
import org.telegram.ui.oc1;
import org.telegram.ui.os0;
import org.telegram.ui.sc1;
import org.telegram.ui.uh0;
import org.telegram.ui.uz;
import org.telegram.ui.vh0;
import org.telegram.ui.vs0;
import org.telegram.ui.wh0;
import org.telegram.ui.zt;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class l4 extends dk0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l4(Object obj, int i7) {
        this.c = i7;
        this.d = obj;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        switch (this.c) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                int i7 = f1Var.f;
                return i7 == 1 || i7 == 2;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return false;
            case 7:
                return true;
            case 8:
                int i10 = f1Var.f;
                return i10 == 0 || i10 == 2;
            case 9:
                return true;
            case 10:
                return false;
            default:
                return f1Var.f == 1;
        }
    }

    public fj E(int i7) {
        sl0 sl0Var = (sl0) this.d;
        int i10 = sl0Var.w;
        if (i7 >= i10 && i7 < sl0Var.x) {
            return (fj) sl0Var.e.get(i7 - i10);
        }
        int i11 = sl0Var.E;
        if (i7 < i11 || i7 >= sl0Var.F) {
            return null;
        }
        return (fj) sl0Var.f.get(i7 - i11);
    }

    public void H(int i7, int i10) {
        int[] iArr = ((f6) this.d).O2;
        if (iArr[0] == i7 && iArr[1] == i10) {
            return;
        }
        iArr[0] = i7;
        iArr[1] = i10;
        f();
    }

    @Override // v4.i0
    public final int b() {
        switch (this.c) {
            case 0:
                return ((f6) this.d).O2.length;
            case 1:
                return ((jg.q0) this.d).f3.size();
            case 2:
                return 1;
            case 3:
                return ((sl0) this.d).r;
            case 4:
                return ((em0) this.d).r.size();
            case 5:
                return ((f11) this.d).U.size();
            case 6:
                return ((zt) this.d).c2.h() ? 1 : 3;
            case 7:
                return ((lf0) this.d).c.size();
            case 8:
                return ((wh0) this.d).h;
            case 9:
                return 12;
            case 10:
                return ((ug.i) this.d).d.size();
            default:
                return ((ug.h1) this.d).b2;
        }
    }

    @Override // v4.i0
    public long c(int i7) {
        uh0 uh0Var;
        switch (this.c) {
            case 8:
                wh0 wh0Var = (wh0) this.d;
                int i10 = wh0Var.E;
                if (i7 < i10 || i7 >= wh0Var.F) {
                    int i11 = wh0Var.n;
                    uh0Var = (i7 < i11 || i7 >= wh0Var.r) ? null : (uh0) wh0Var.a.get(i7 - i11);
                } else {
                    uh0Var = (uh0) wh0Var.b.get(i7 - i10);
                }
                if (uh0Var != null) {
                    return uh0Var.c;
                }
                wh0Var.getClass();
                if (i7 == 0) {
                    return 1L;
                }
                if (i7 == wh0Var.y) {
                    return 2L;
                }
                if (i7 == wh0Var.s) {
                    return 3L;
                }
                if (i7 == wh0Var.w) {
                    return 4L;
                }
                if (i7 == wh0Var.x) {
                    return 5L;
                }
                throw new RuntimeException();
            default:
                return super.c(i7);
        }
    }

    @Override // v4.i0
    public int d(int i7) {
        switch (this.c) {
            case 2:
                return i7;
            case 3:
                sl0 sl0Var = (sl0) this.d;
                if (i7 == sl0Var.s || i7 == sl0Var.y) {
                    return 0;
                }
                fj E = E(i7);
                return (E != null && E.I3()) ? 2 : 1;
            case 4:
            case 5:
            case 7:
            case 9:
            default:
                return super.d(i7);
            case 6:
                return i7;
            case 8:
                wh0 wh0Var = (wh0) this.d;
                if (i7 >= wh0Var.E && i7 < wh0Var.F) {
                    return 0;
                }
                wh0Var.getClass();
                if (i7 == 0 || i7 == wh0Var.y) {
                    return 1;
                }
                if (i7 == wh0Var.s) {
                    return 2;
                }
                return (i7 == wh0Var.w || i7 == wh0Var.x) ? 3 : 0;
            case 10:
                return ((ug.g) ((ug.i) this.d).d.get(i7)).a;
            case 11:
                ug.h1 h1Var = (ug.h1) this.d;
                if (i7 != h1Var.c2) {
                    if (i7 >= h1Var.d2 && i7 < h1Var.e2) {
                        return h1Var.g1();
                    }
                    if (i7 >= h1Var.f2 && i7 < h1Var.g2) {
                        return 1;
                    }
                    if (i7 == h1Var.h2) {
                        return 2;
                    }
                    if (i7 == h1Var.i2) {
                        return 3;
                    }
                    if (i7 == 0) {
                        return 4;
                    }
                    if (i7 == h1Var.j2) {
                        return 5;
                    }
                }
                return 0;
        }
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        int i10 = this.c;
        uh0 uh0Var = null;
        Object obj = this.d;
        switch (i10) {
            case 0:
                int[] iArr = ((f6) obj).O2;
                int length = (iArr.length - 1) - i7;
                org.telegram.ui.Components.ia iaVar = (org.telegram.ui.Components.ia) f1Var.a;
                int i11 = iArr[length];
                if (iaVar.a != i11) {
                    iaVar.a = i11;
                    iaVar.requestLayout();
                    break;
                }
                break;
            case 1:
                ((jg.p0) f1Var).v.setData((jg.o0) ((jg.q0) obj).f3.get(i7));
                break;
            case 2:
                break;
            case 3:
                sl0 sl0Var = (sl0) obj;
                uz uzVar = sl0Var.K;
                int i12 = f1Var.f;
                View view = f1Var.a;
                if (i12 != 0) {
                    fj E = E(i7);
                    if (E != null) {
                        boolean z11 = sl0Var.J.i0() && i7 >= sl0Var.w && i7 < sl0Var.x;
                        if (i12 != 1) {
                            if (i12 == 2) {
                                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                                int e12 = g7Var.getMessage() == null ? 0 : g7Var.getMessage().e1();
                                g7Var.f(E, true);
                                int e13 = g7Var.getMessage().e1();
                                uzVar.a = fj.B0(g7Var.getMessage().k);
                                uzVar.b = e13;
                                g7Var.e(sl0Var.J.j(uzVar), e12 == E.e1());
                                z10 = e12 == E.e1();
                                if (g7Var.e0 != z11) {
                                    g7Var.e0 = z11;
                                    if (!z10) {
                                        g7Var.f0 = z11 ? 1.0f : 0.0f;
                                    }
                                    g7Var.invalidate();
                                    break;
                                }
                            }
                        } else {
                            pl0 pl0Var = (pl0) view;
                            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, pl0Var, null);
                            org.telegram.ui.Cells.h7 h7Var = pl0Var.a;
                            int e14 = h7Var.getMessage() == null ? 0 : h7Var.getMessage().e1();
                            h7Var.c(E, true);
                            int e15 = h7Var.getMessage().e1();
                            uzVar.a = fj.B0(h7Var.getMessage().k);
                            uzVar.b = e15;
                            h7Var.b(sl0Var.J.j(uzVar), e14 == E.e1());
                            z10 = e14 == E.e1();
                            if (h7Var.P != z11) {
                                h7Var.P = z11;
                                if (!z10) {
                                    h7Var.Q = z11 ? 1.0f : 0.0f;
                                }
                                h7Var.invalidate();
                                break;
                            }
                        }
                    }
                } else {
                    org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
                    if (i7 != sl0Var.s) {
                        if (i7 == sl0Var.y) {
                            y3Var.b(gd.N0(2131746166, null), gd.N0(2131745299, null), new g70(this, 10));
                            break;
                        }
                    } else {
                        String N0 = gd.N0(2131751332, null);
                        if (!y3Var.getText().equals(N0)) {
                            y3Var.b(N0, sl0Var.I ? gd.N0(2131747239, null) : gd.N0(2131745857, null), new rl0(this));
                            break;
                        } else {
                            String N02 = sl0Var.I ? gd.N0(2131747239, null) : gd.N0(2131745857, null);
                            boolean z12 = sl0Var.I;
                            org.telegram.ui.Cells.x3 x3Var = y3Var.b;
                            x3Var.c(N02, true, z12);
                            x3Var.setVisibility(0);
                            break;
                        }
                    }
                }
                break;
            case 4:
                View view2 = f1Var.a;
                em0 em0Var = (em0) obj;
                ArrayList arrayList = em0Var.r;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    bm0 bm0Var = (bm0) arrayList.get(i7);
                    dm0 dm0Var = (dm0) view2;
                    ch.p0 p0Var = dm0Var.d;
                    boolean z13 = p0Var == null || !p0Var.equals(bm0Var.a);
                    if (z13) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = bm0Var.a.g();
                        tL_reactionCount.count = bm0Var.b;
                        em0 em0Var2 = dm0Var.s;
                        cm0 cm0Var = new cm0(dm0Var, em0Var2.a, dm0Var, tL_reactionCount, em0Var2.c);
                        dm0Var.a = cm0Var;
                        cm0Var.E.d(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(100.0f));
                        cm0 cm0Var2 = dm0Var.a;
                        cm0Var2.p = true;
                        cm0Var2.R = true;
                    } else {
                        dm0Var.a.v = bm0Var.b;
                    }
                    dm0Var.d = bm0Var.a;
                    if (!z13) {
                        cm0 cm0Var3 = dm0Var.a;
                        cm0Var3.e = cm0Var3.z;
                    }
                    dm0Var.a.z = org.telegram.messenger.g0.L(44.33f);
                    dm0Var.a.t = !TextUtils.isEmpty(bm0Var.c);
                    cm0 cm0Var4 = dm0Var.a;
                    boolean z14 = cm0Var4.t;
                    org.telegram.ui.Components.m6 m6Var = cm0Var4.F;
                    if (z14) {
                        m6Var.t(org.telegram.messenger.j6.m(bm0Var.c, m6Var.a.getFontMetricsInt(), false, null, 0), !z13, true);
                    } else if (m6Var != null) {
                        m6Var.t("", !z13, true);
                    }
                    cm0 cm0Var5 = dm0Var.a;
                    Integer.toString(bm0Var.b);
                    cm0Var5.getClass();
                    dm0Var.a.E.c(bm0Var.b, !z13);
                    cm0 cm0Var6 = dm0Var.a;
                    if (cm0Var6.E != null && (cm0Var6.v > 0 || cm0Var6.t)) {
                        cm0Var6.z = (int) (org.telegram.messenger.g0.L(dm0Var.a.t ? 4.0f : 0.0f) + ((int) Math.ceil(r6.m)) + dm0Var.a.F.d + cm0Var6.z);
                    }
                    if (z13) {
                        cm0 cm0Var7 = dm0Var.a;
                        cm0Var7.e = cm0Var7.z;
                    }
                    dm0Var.a.A = org.telegram.messenger.g0.L(28.0f);
                    cm0 cm0Var8 = dm0Var.a;
                    cm0Var8.o = dm0Var.e;
                    if (dm0Var.r) {
                        cm0Var8.a();
                    }
                    if (!z13) {
                        dm0Var.requestLayout();
                    }
                    ((dm0) view2).a(bm0Var.a.h == em0Var.h, false);
                    break;
                }
                break;
            case 5:
                d11 d11Var = (d11) f1Var.a;
                c11 c11Var = (c11) ((f11) obj).U.get(i7);
                f11 f11Var = d11Var.s;
                org.telegram.ui.Components.p9 p9Var = d11Var.a;
                c11 c11Var2 = d11Var.e;
                boolean z15 = c11Var2 != null && c11Var2.a == c11Var.a && Objects.equals(c11Var2.b, c11Var.b);
                if (f11Var.a0 >= 1.0f && f11Var.k0 == null) {
                    d11Var.setScaleX(1.0f);
                    d11Var.setScaleY(1.0f);
                    d11Var.setAlpha(1.0f);
                }
                d11Var.e = c11Var;
                if (!z15) {
                    p9Var.setAnimatedEmojiDrawable(null);
                    d11Var.h = null;
                    d11Var.n = 0;
                    if (c11Var.a != 0) {
                        d11Var.f = null;
                        p9Var.setVisibility(0);
                        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(3, f11Var.a, c11Var.a);
                        d11Var.h = o5Var;
                        p9Var.setAnimatedEmojiDrawable(o5Var);
                    } else {
                        d11Var.f = gd.N0(c11Var.b.booleanValue() ? 2131743744 : 2131743743, null);
                        p9Var.setVisibility(8);
                    }
                    d11Var.setContentDescription(d11Var.f);
                }
                d11Var.a(z15);
                d11Var.requestLayout();
                d11Var.invalidate();
                break;
            case 6:
                break;
            case 7:
                lf0 lf0Var = (lf0) obj;
                ((kf0) f1Var.a).a((TLObject) lf0Var.c.get(i7), ((Integer) lf0Var.b.get(i7)).intValue(), false);
                break;
            case 8:
                wh0 wh0Var = (wh0) obj;
                org.telegram.ui.ActionBar.i6 i6Var = wh0Var.f;
                int i13 = f1Var.f;
                View view3 = f1Var.a;
                if (i13 == 0) {
                    vh0 vh0Var = (vh0) view3;
                    int i14 = wh0Var.E;
                    if (i7 >= i14 && i7 < wh0Var.F) {
                        uh0Var = (uh0) wh0Var.b.get(i7 - i14);
                    }
                    int i15 = wh0Var.n;
                    if (i7 >= i15 && i7 < wh0Var.r) {
                        uh0Var = (uh0) wh0Var.a.get(i7 - i15);
                    }
                    if (uh0Var != null) {
                        boolean z16 = vh0Var.e == uh0Var;
                        boolean z17 = uh0Var == wh0Var.H;
                        boolean z18 = wh0Var.J.get(uh0Var.c) != null;
                        vh0Var.e = uh0Var;
                        vh0Var.a.setText(uh0Var.f);
                        vh0Var.d = i7 != wh0Var.F - 1;
                        vh0Var.b.a(z17, z16);
                        vh0Var.c.a(z18, z16);
                        break;
                    }
                } else if (i13 == 1) {
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view3;
                    if (i7 != 0) {
                        if (i7 == wh0Var.y) {
                            o4Var.setText(gd.N0(2131744044, null));
                            break;
                        }
                    } else {
                        o4Var.setText(gd.N0(2131743966, null));
                        break;
                    }
                } else if (i13 == 2) {
                    org.telegram.ui.Cells.j2 j2Var = (org.telegram.ui.Cells.j2) view3;
                    Drawable drawable = j2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable2 = j2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                    int i16 = org.telegram.ui.ActionBar.n6.N6;
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    org.telegram.ui.ActionBar.u6.x(j2Var, drawable, i16, i6Var, mode);
                    org.telegram.ui.ActionBar.u6.x(j2Var, drawable2, org.telegram.ui.ActionBar.n6.k7, i6Var, mode);
                    lq lqVar = new lq(drawable, drawable2);
                    j2Var.a.l(gd.N0(2131743556, null), false);
                    j2Var.b.setImageDrawable(lqVar);
                    j2Var.c = false;
                    break;
                }
                break;
            case 9:
                ((oc1) f1Var.a).a = WallpapersListActivity.j0[i7];
                break;
            case 10:
                ug.i iVar = (ug.i) obj;
                ArrayList arrayList2 = iVar.d;
                if (((ug.g) arrayList2.get(i7)).a == 1) {
                    ug.h hVar = (ug.h) f1Var.a;
                    hVar.c.setColorFilter(new PorterDuffColorFilter(iVar.e.getPixel(i7, 0), PorterDuff.Mode.MULTIPLY));
                    hVar.c.setImageDrawable(iVar.getContext().getDrawable(((ug.g) arrayList2.get(i7)).b));
                    hVar.a.setText(((ug.g) arrayList2.get(i7)).c);
                    hVar.b.setText(((ug.g) arrayList2.get(i7)).d);
                    break;
                }
                break;
            default:
                View view4 = f1Var.a;
                ug.h1 h1Var = (ug.h1) obj;
                int i17 = h1Var.f2;
                if (i7 >= i17 && i7 < h1Var.g2) {
                    ((is0) view4).a((vs0) h1Var.T1.get(i7 - i17), i7 != h1Var.g2 - 1);
                    break;
                } else if (i7 >= h1Var.d2 && i7 < h1Var.e2) {
                    h1Var.h1(view4);
                    break;
                }
                break;
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        View view;
        View view2;
        View view3;
        View view4;
        int i10 = this.c;
        final int i11 = 0;
        final int i12 = 1;
        Object obj = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.ia iaVar = new org.telegram.ui.Components.ia(((f6) obj).getContext());
                iaVar.a = 0;
                return new mj0(iaVar);
            case 1:
                jg.n0 n0Var = new jg.n0(viewGroup.getContext(), ((jg.q0) obj).o2);
                jg.p0 p0Var = new jg.p0(n0Var);
                p0Var.v = n0Var;
                n0Var.setLayoutParams(new v4.q0(-2, org.telegram.messenger.g0.L(30.0f)));
                return p0Var;
            case 2:
                return new mj0(((org.telegram.ui.Components.ja) obj).T1);
            case 3:
                if (i7 == 0) {
                    frameLayout = new org.telegram.ui.Cells.y3(viewGroup.getContext(), null);
                } else if (i7 == 1) {
                    Context context = viewGroup.getContext();
                    pl0 pl0Var = new pl0(context);
                    org.telegram.ui.Cells.h7 h7Var = new org.telegram.ui.Cells.h7(2, context, null);
                    pl0Var.a = h7Var;
                    h7Var.r.setVisibility(8);
                    pl0Var.addView(h7Var);
                    frameLayout = pl0Var;
                } else {
                    frameLayout = new ql0(viewGroup.getContext());
                }
                frameLayout.setLayoutParams(new v4.q0(-1, -2));
                return new mj0(frameLayout);
            case 4:
                em0 em0Var = (em0) obj;
                return new mj0(new dm0(em0Var, em0Var.getContext()));
            case 5:
                d11 d11Var = new d11((f11) obj, viewGroup.getContext());
                d11Var.setLayoutParams(new v4.q0(-2, -1));
                return new mj0(d11Var);
            case 6:
                zt ztVar = (zt) obj;
                if (i7 == 0) {
                    view = ztVar.Z1;
                } else if (i7 == 2) {
                    View view5 = ztVar.a2;
                    v4.q0 q0Var = new v4.q0(-1, -2);
                    int i13 = ztVar.u0;
                    ((ViewGroup.MarginLayoutParams) q0Var).leftMargin = i13;
                    ((ViewGroup.MarginLayoutParams) q0Var).rightMargin = i13;
                    view5.setLayoutParams(q0Var);
                    view = view5;
                } else {
                    org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(viewGroup.getContext());
                    z8Var.setFixedSize(12);
                    int i14 = org.telegram.ui.ActionBar.n6.a7;
                    ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.n6.x0(null, i14, false));
                    org.telegram.ui.ActionBar.u6.x(z8Var, colorDrawable, i14, null, PorterDuff.Mode.SRC_IN);
                    lq lqVar = new lq(colorDrawable, org.telegram.ui.ActionBar.n6.Y0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.n6.b7));
                    lqVar.x = true;
                    z8Var.setBackgroundDrawable(lqVar);
                    view = z8Var;
                }
                return new mj0(view);
            case 7:
                kf0 kf0Var = new kf0(viewGroup.getContext());
                kf0Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(50.0f)));
                return new mj0(kf0Var);
            case 8:
                org.telegram.ui.ActionBar.i6 i6Var = ((wh0) obj).f;
                Context context2 = viewGroup.getContext();
                if (i7 == 0) {
                    vh0 vh0Var = new vh0(context2);
                    RadioButton radioButton = new RadioButton(context2);
                    vh0Var.b = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.u6.O(radioButton, org.telegram.ui.ActionBar.n6.g7, org.telegram.ui.ActionBar.n6.h7, i6Var);
                    boolean z10 = gd.a0;
                    vh0Var.addView(radioButton, c8.na.d(22, 22.0f, (z10 ? 5 : 3) | 16, z10 ? 0 : 20, 0.0f, z10 ? 20 : 0, 0.0f));
                    lp lpVar = new lp(24, context2, i6Var);
                    vh0Var.c = lpVar;
                    int i15 = org.telegram.ui.ActionBar.n6.d6;
                    lpVar.b(-1, i15, org.telegram.ui.ActionBar.n6.k7);
                    lpVar.setDrawUnchecked(false);
                    lpVar.setDrawBackgroundAsArc(3);
                    boolean z11 = gd.a0;
                    vh0Var.addView(lpVar, c8.na.d(26, 26.0f, (z11 ? 5 : 3) | 16, z11 ? 0 : 18, 0.0f, z11 ? 18 : 0, 0.0f));
                    lpVar.a(true, false);
                    TextView textView = new TextView(context2);
                    vh0Var.a = textView;
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
                    m10.q(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setGravity((gd.a0 ? 5 : 3) | 16);
                    boolean z12 = gd.a0;
                    vh0Var.addView(textView, c8.na.d(-2, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 23 : 61, 0.0f, z12 ? 61 : 23, 0.0f));
                    org.telegram.ui.ActionBar.u6.h(i15, vh0Var, i6Var);
                    view2 = vh0Var;
                } else if (i7 == 2) {
                    org.telegram.ui.Cells.j2 j2Var = new org.telegram.ui.Cells.j2(70, context2, i6Var);
                    j2Var.d = 61;
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, j2Var, i6Var);
                    view2 = j2Var;
                } else if (i7 != 3) {
                    org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context2, i6Var);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, o4Var, i6Var);
                    view2 = o4Var;
                } else {
                    view2 = new org.telegram.ui.Cells.y6(context2, (org.telegram.ui.Cells.c0) null);
                }
                return i5.c.q(view2, view2, -1, -2);
            case 9:
                sc1 sc1Var = (sc1) obj;
                return new mj0(new oc1(sc1Var.F, sc1Var.c));
            case 10:
                ug.i iVar = (ug.i) obj;
                org.telegram.ui.ActionBar.i6 i6Var2 = iVar.a;
                if (i7 == 0) {
                    view3 = new ug.f(iVar, iVar.getContext());
                } else if (i7 == 2) {
                    view3 = new org.telegram.ui.Cells.w3(iVar.getContext(), 16);
                } else {
                    Context context3 = iVar.getContext();
                    ug.h hVar = new ug.h(context3);
                    ImageView imageView = new ImageView(context3);
                    hVar.c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    hVar.addView(imageView, c8.na.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context3);
                    hVar.a = textView2;
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.G6, i6Var2);
                    textView2.setTextSize(1, 14.0f);
                    hVar.addView(textView2, c8.na.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    hVar.b = textView3;
                    org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.y6, i6Var2);
                    textView3.setTextSize(1, 14.0f);
                    hVar.addView(textView3, c8.na.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view3 = hVar;
                }
                return i5.c.q(view3, view3, -1, -2);
            default:
                Context context4 = viewGroup.getContext();
                ug.h1 h1Var = (ug.h1) obj;
                View i16 = h1Var.i1(context4, i7);
                if (i16 != null) {
                    return i5.c.q(i16, i16, -1, -2);
                }
                if (i7 == 0) {
                    b61 b61Var = new b61(25, context4, this);
                    h1Var.o2 = b61Var;
                    b61Var.setOrientation(1);
                    View view6 = h1Var.x2;
                    if (view6 == null) {
                        h1Var.n2 = new bc(context4, 1, 0, 4);
                        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        int i17 = org.telegram.ui.ActionBar.n6.Dk;
                        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.n6.w0(i17, h1Var.J0), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, h1Var.J0)));
                        h1Var.n2.setBackgroundBitmap(createBitmap);
                        vg.f fVar = h1Var.n2.b;
                        fVar.z = i17;
                        fVar.A = org.telegram.ui.ActionBar.n6.Ck;
                        fVar.b();
                        b61Var.addView(h1Var.n2, c8.na.r(ks.q2, ks.q2, 1));
                    } else {
                        if (view6.getParent() != null) {
                            ((ViewGroup) h1Var.x2.getParent()).removeView(h1Var.x2);
                        }
                        h1Var.f1(b61Var);
                    }
                    if (h1Var.J2 == null) {
                        FrameLayout frameLayout2 = new FrameLayout(context4);
                        h1Var.J2 = frameLayout2;
                        frameLayout2.setClipChildren(false);
                        Integer num = h1Var.q2;
                        new PorterDuffColorFilter(num == null ? org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.v6, h1Var.J0) : num.intValue(), PorterDuff.Mode.SRC_IN);
                        h1Var.K2 = new j80[2];
                        int i18 = 0;
                        while (i18 < 2) {
                            h1Var.K2[i18] = new bi.w2(7, context4, h1Var.J0);
                            h1Var.K2[i18].setVisibility(i18 == 0 ? 0 : 8);
                            h1Var.K2[i18].setTextSize(1, 16.0f);
                            h1Var.K2[i18].setTypeface(org.telegram.messenger.g0.o());
                            h1Var.K2[i18].setGravity(1);
                            org.telegram.ui.ActionBar.u6.U(h1Var.K2[i18], org.telegram.ui.ActionBar.n6.G6, h1Var.J0);
                            org.telegram.ui.ActionBar.u6.G(h1Var.K2[i18], org.telegram.ui.ActionBar.n6.J6, h1Var.J0);
                            h1Var.J2.addView(h1Var.K2[i18], c8.na.c(-2.0f, -1));
                            i18++;
                        }
                    }
                    if (h1Var.J2.getParent() != null) {
                        ((ViewGroup) h1Var.J2.getParent()).removeView(h1Var.J2);
                    }
                    b61Var.addView(h1Var.J2, c8.na.q(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                    if (h1Var.L2 == null) {
                        j80 j80Var = new j80(h1Var.getContext(), h1Var.J0);
                        h1Var.L2 = j80Var;
                        j80Var.setTextSize(1, 14.0f);
                        h1Var.L2.setGravity(1);
                        org.telegram.ui.ActionBar.u6.U(h1Var.L2, org.telegram.ui.ActionBar.n6.G6, h1Var.J0);
                        org.telegram.ui.ActionBar.u6.G(h1Var.L2, org.telegram.ui.ActionBar.n6.J6, h1Var.J0);
                    }
                    if (h1Var.L2.getParent() != null) {
                        ((ViewGroup) h1Var.L2.getParent()).removeView(h1Var.L2);
                    }
                    b61Var.addView(h1Var.L2, c8.na.q(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                    h1Var.k1(false);
                    h1Var.m2 = new ki.e(context4, 5);
                    w01 w01Var = new w01(12, context4, this);
                    w01Var.setClipChildren(false);
                    w01Var.addView(h1Var.m2);
                    w01Var.addView(b61Var);
                    bc bcVar = h1Var.n2;
                    view4 = w01Var;
                    if (bcVar != null) {
                        bcVar.setStarParticlesView(h1Var.m2);
                        view4 = w01Var;
                    }
                } else if (i7 == 2) {
                    int i19 = org.telegram.ui.ActionBar.n6.a7;
                    org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context4, org.telegram.ui.ActionBar.n6.w0(i19, h1Var.J0), 0);
                    org.telegram.ui.ActionBar.u6.h(i19, y6Var, h1Var.J0);
                    view4 = y6Var;
                } else if (i7 == 3) {
                    view4 = new zh.f(context4, i12);
                } else if (i7 == 4) {
                    view4 = new ai.l2(context4);
                } else if (i7 != 5) {
                    view4 = new os0(this, context4, h1Var.J0);
                } else {
                    yg.d0 d0Var = new yg.d0(context4, h1Var.J0);
                    d0Var.setBackground(true);
                    String N0 = gd.N0(2131749489, "GiftPremiumPrivacyPolicyAndTerms");
                    int i20 = org.telegram.ui.ActionBar.n6.Xc;
                    d0Var.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.R2(N0, i20, 0, new Runnable(this) { // from class: ug.g1
                        public final /* synthetic */ l4 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i21 = i11;
                            l4 l4Var = this.b;
                            switch (i21) {
                                case 0:
                                    vf.c.t(((h1) l4Var.d).p2.getParentActivity(), gd.N0(2131743951, null));
                                    break;
                                default:
                                    vf.c.t(((h1) l4Var.d).p2.getParentActivity(), gd.N0(2131746587, null));
                                    break;
                            }
                        }
                    }, null), org.telegram.messenger.g0.R2(gd.N0(2131749490, "GiftPremiumPrivacyPolicy"), i20, 0, new Runnable(this) { // from class: ug.g1
                        public final /* synthetic */ l4 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i21 = i12;
                            l4 l4Var = this.b;
                            switch (i21) {
                                case 0:
                                    vf.c.t(((h1) l4Var.d).p2.getParentActivity(), gd.N0(2131743951, null));
                                    break;
                                default:
                                    vf.c.t(((h1) l4Var.d).p2.getParentActivity(), gd.N0(2131746587, null));
                                    break;
                            }
                        }
                    }, null), "%1$s"));
                    view4 = d0Var;
                }
                view4.setLayoutParams(new v4.q0(-1, -2));
                h1Var.e1(i7, view4);
                return new mj0(view4);
        }
    }

    @Override // v4.i0
    public void y(v4.f1 f1Var) {
        switch (this.c) {
            case 4:
                em0 em0Var = (em0) this.d;
                ArrayList arrayList = em0Var.r;
                int b10 = f1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((dm0) f1Var.a).a(((bm0) arrayList.get(b10)).a.h == em0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void F(v4.f1 f1Var, int i7) {
    }

    private final void G(v4.f1 f1Var, int i7) {
    }
}
