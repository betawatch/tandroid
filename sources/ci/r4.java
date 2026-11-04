package ci;

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
import b8.mf;
import ci.r4;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xp;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.cf0;
import org.telegram.ui.df0;
import org.telegram.ui.es0;
import org.telegram.ui.jc1;
import org.telegram.ui.ls0;
import org.telegram.ui.nc1;
import org.telegram.ui.nh0;
import org.telegram.ui.oh0;
import org.telegram.ui.ph0;
import org.telegram.ui.pz;
import org.telegram.ui.s51;
import org.telegram.ui.ut;
import org.telegram.ui.yr0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r4 extends sj0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r4(Object obj, int i3) {
        this.c = i3;
        this.d = obj;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        switch (this.c) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                int i3 = d1Var.f;
                return i3 == 1 || i3 == 2;
            case 4:
                return true;
            case 5:
                return false;
            case 6:
                return true;
            case 7:
                int i10 = d1Var.f;
                return i10 == 0 || i10 == 2;
            case 8:
                return true;
            case 9:
                return false;
            default:
                return d1Var.f == 1;
        }
    }

    public zi E(int i3) {
        hl0 hl0Var = (hl0) this.d;
        int i10 = hl0Var.w;
        if (i3 >= i10 && i3 < hl0Var.x) {
            return (zi) hl0Var.e.get(i3 - i10);
        }
        int i11 = hl0Var.E;
        if (i3 < i11 || i3 >= hl0Var.F) {
            return null;
        }
        return (zi) hl0Var.f.get(i3 - i11);
    }

    public void H(int i3, int i10) {
        int[] iArr = ((l6) this.d).L2;
        if (iArr[0] == i3 && iArr[1] == i10) {
            return;
        }
        iArr[0] = i3;
        iArr[1] = i10;
        f();
    }

    @Override // u4.h0
    public final int b() {
        switch (this.c) {
            case 0:
                return ((l6) this.d).L2.length;
            case 1:
                return ((kg.n0) this.d).f3.size();
            case 2:
                return 1;
            case 3:
                return ((hl0) this.d).r;
            case 4:
                return ((tl0) this.d).r.size();
            case 5:
                return ((ut) this.d).Z1.h() ? 1 : 3;
            case 6:
                return ((df0) this.d).c.size();
            case 7:
                return ((ph0) this.d).h;
            case 8:
                return 12;
            case 9:
                return ((vg.i) this.d).d.size();
            default:
                return ((vg.h1) this.d).Y1;
        }
    }

    @Override // u4.h0
    public long c(int i3) {
        nh0 nh0Var;
        switch (this.c) {
            case 7:
                ph0 ph0Var = (ph0) this.d;
                int i10 = ph0Var.E;
                if (i3 < i10 || i3 >= ph0Var.F) {
                    int i11 = ph0Var.n;
                    nh0Var = (i3 < i11 || i3 >= ph0Var.r) ? null : (nh0) ph0Var.a.get(i3 - i11);
                } else {
                    nh0Var = (nh0) ph0Var.b.get(i3 - i10);
                }
                if (nh0Var != null) {
                    return nh0Var.c;
                }
                ph0Var.getClass();
                if (i3 == 0) {
                    return 1L;
                }
                if (i3 == ph0Var.y) {
                    return 2L;
                }
                if (i3 == ph0Var.s) {
                    return 3L;
                }
                if (i3 == ph0Var.w) {
                    return 4L;
                }
                if (i3 == ph0Var.x) {
                    return 5L;
                }
                throw new RuntimeException();
            default:
                return super.c(i3);
        }
    }

    @Override // u4.h0
    public int d(int i3) {
        switch (this.c) {
            case 2:
                return i3;
            case 3:
                hl0 hl0Var = (hl0) this.d;
                if (i3 == hl0Var.s || i3 == hl0Var.y) {
                    return 0;
                }
                zi E = E(i3);
                return (E != null && E.J3()) ? 2 : 1;
            case 4:
            case 6:
            case 8:
            default:
                return super.d(i3);
            case 5:
                return i3;
            case 7:
                ph0 ph0Var = (ph0) this.d;
                if (i3 >= ph0Var.E && i3 < ph0Var.F) {
                    return 0;
                }
                ph0Var.getClass();
                if (i3 == 0 || i3 == ph0Var.y) {
                    return 1;
                }
                if (i3 == ph0Var.s) {
                    return 2;
                }
                return (i3 == ph0Var.w || i3 == ph0Var.x) ? 3 : 0;
            case 9:
                return ((vg.g) ((vg.i) this.d).d.get(i3)).a;
            case 10:
                vg.h1 h1Var = (vg.h1) this.d;
                if (i3 != h1Var.Z1) {
                    if (i3 >= h1Var.a2 && i3 < h1Var.b2) {
                        return h1Var.f1();
                    }
                    if (i3 >= h1Var.c2 && i3 < h1Var.d2) {
                        return 1;
                    }
                    if (i3 == h1Var.e2) {
                        return 2;
                    }
                    if (i3 == h1Var.f2) {
                        return 3;
                    }
                    if (i3 == 0) {
                        return 4;
                    }
                    if (i3 == h1Var.g2) {
                        return 5;
                    }
                }
                return 0;
        }
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        int i10 = this.c;
        nh0 nh0Var = null;
        Object obj = this.d;
        switch (i10) {
            case 0:
                int[] iArr = ((l6) obj).L2;
                int length = (iArr.length - 1) - i3;
                org.telegram.ui.Components.ea eaVar = (org.telegram.ui.Components.ea) d1Var.a;
                int i11 = iArr[length];
                if (eaVar.a != i11) {
                    eaVar.a = i11;
                    eaVar.requestLayout();
                    break;
                }
                break;
            case 1:
                ((kg.m0) d1Var).v.setData((kg.l0) ((kg.n0) obj).f3.get(i3));
                break;
            case 2:
                break;
            case 3:
                hl0 hl0Var = (hl0) obj;
                pz pzVar = hl0Var.K;
                int i12 = d1Var.f;
                View view = d1Var.a;
                if (i12 != 0) {
                    zi E = E(i3);
                    if (E != null) {
                        boolean z11 = hl0Var.J.I() && i3 >= hl0Var.w && i3 < hl0Var.x;
                        if (i12 != 1) {
                            if (i12 == 2) {
                                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                                int f12 = f7Var.getMessage() == null ? 0 : f7Var.getMessage().f1();
                                f7Var.f(E, true);
                                int f13 = f7Var.getMessage().f1();
                                pzVar.a = zi.B0(f7Var.getMessage().k);
                                pzVar.b = f13;
                                f7Var.e(hl0Var.J.n(pzVar), f12 == E.f1());
                                z10 = f12 == E.f1();
                                if (f7Var.e0 != z11) {
                                    f7Var.e0 = z11;
                                    if (!z10) {
                                        f7Var.f0 = z11 ? 1.0f : 0.0f;
                                    }
                                    f7Var.invalidate();
                                    break;
                                }
                            }
                        } else {
                            el0 el0Var = (el0) view;
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, el0Var, null);
                            org.telegram.ui.Cells.g7 g7Var = el0Var.a;
                            int f14 = g7Var.getMessage() == null ? 0 : g7Var.getMessage().f1();
                            g7Var.c(E, true);
                            int f15 = g7Var.getMessage().f1();
                            pzVar.a = zi.B0(g7Var.getMessage().k);
                            pzVar.b = f15;
                            g7Var.b(hl0Var.J.n(pzVar), f14 == E.f1());
                            z10 = f14 == E.f1();
                            if (g7Var.P != z11) {
                                g7Var.P = z11;
                                if (!z10) {
                                    g7Var.Q = z11 ? 1.0f : 0.0f;
                                }
                                g7Var.invalidate();
                                break;
                            }
                        }
                    }
                } else {
                    org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
                    if (i3 != hl0Var.s) {
                        if (i3 == hl0Var.y) {
                            x3Var.b(bd.M0(2131746370, null), bd.M0(2131745505, null), new ga0(this, 8));
                            break;
                        }
                    } else {
                        String M0 = bd.M0(2131751345, null);
                        if (!x3Var.getText().equals(M0)) {
                            x3Var.b(M0, hl0Var.I ? bd.M0(2131747441, null) : bd.M0(2131746063, null), new gl0(this));
                            break;
                        } else {
                            String M02 = hl0Var.I ? bd.M0(2131747441, null) : bd.M0(2131746063, null);
                            boolean z12 = hl0Var.I;
                            org.telegram.ui.Cells.w3 w3Var = x3Var.b;
                            w3Var.c(M02, true, z12);
                            w3Var.setVisibility(0);
                            break;
                        }
                    }
                }
                break;
            case 4:
                View view2 = d1Var.a;
                tl0 tl0Var = (tl0) obj;
                ArrayList arrayList = tl0Var.r;
                if (i3 >= 0 && i3 < arrayList.size()) {
                    ql0 ql0Var = (ql0) arrayList.get(i3);
                    sl0 sl0Var = (sl0) view2;
                    dh.n0 n0Var = sl0Var.d;
                    boolean z13 = n0Var == null || !n0Var.equals(ql0Var.a);
                    if (z13) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = ql0Var.a.g();
                        tL_reactionCount.count = ql0Var.b;
                        tl0 tl0Var2 = sl0Var.s;
                        rl0 rl0Var = new rl0(sl0Var, tl0Var2.a, sl0Var, tL_reactionCount, tl0Var2.c);
                        sl0Var.a = rl0Var;
                        rl0Var.E.d(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(100.0f));
                        rl0 rl0Var2 = sl0Var.a;
                        rl0Var2.p = true;
                        rl0Var2.R = true;
                    } else {
                        sl0Var.a.v = ql0Var.b;
                    }
                    sl0Var.d = ql0Var.a;
                    if (!z13) {
                        rl0 rl0Var3 = sl0Var.a;
                        rl0Var3.e = rl0Var3.z;
                    }
                    sl0Var.a.z = org.telegram.messenger.g0.L(44.33f);
                    sl0Var.a.t = !TextUtils.isEmpty(ql0Var.c);
                    rl0 rl0Var4 = sl0Var.a;
                    boolean z14 = rl0Var4.t;
                    org.telegram.ui.Components.g6 g6Var = rl0Var4.F;
                    if (z14) {
                        g6Var.t(org.telegram.messenger.i6.m(ql0Var.c, g6Var.a.getFontMetricsInt(), false, null, 0), !z13, true);
                    } else if (g6Var != null) {
                        g6Var.t("", !z13, true);
                    }
                    rl0 rl0Var5 = sl0Var.a;
                    Integer.toString(ql0Var.b);
                    rl0Var5.getClass();
                    sl0Var.a.E.c(ql0Var.b, !z13);
                    rl0 rl0Var6 = sl0Var.a;
                    if (rl0Var6.E != null && (rl0Var6.v > 0 || rl0Var6.t)) {
                        rl0Var6.z = (int) (org.telegram.messenger.g0.L(sl0Var.a.t ? 4.0f : 0.0f) + ((int) Math.ceil(r3.m)) + sl0Var.a.F.d + rl0Var6.z);
                    }
                    if (z13) {
                        rl0 rl0Var7 = sl0Var.a;
                        rl0Var7.e = rl0Var7.z;
                    }
                    sl0Var.a.A = org.telegram.messenger.g0.L(28.0f);
                    rl0 rl0Var8 = sl0Var.a;
                    rl0Var8.o = sl0Var.e;
                    if (sl0Var.r) {
                        rl0Var8.a();
                    }
                    if (!z13) {
                        sl0Var.requestLayout();
                    }
                    ((sl0) view2).a(ql0Var.a.h == tl0Var.h, false);
                    break;
                }
                break;
            case 5:
                break;
            case 6:
                df0 df0Var = (df0) obj;
                ((cf0) d1Var.a).a((TLObject) df0Var.c.get(i3), ((Integer) df0Var.b.get(i3)).intValue(), false);
                break;
            case 7:
                ph0 ph0Var = (ph0) obj;
                org.telegram.ui.ActionBar.e6 e6Var = ph0Var.f;
                int i13 = d1Var.f;
                View view3 = d1Var.a;
                if (i13 == 0) {
                    oh0 oh0Var = (oh0) view3;
                    int i14 = ph0Var.E;
                    if (i3 >= i14 && i3 < ph0Var.F) {
                        nh0Var = (nh0) ph0Var.b.get(i3 - i14);
                    }
                    int i15 = ph0Var.n;
                    if (i3 >= i15 && i3 < ph0Var.r) {
                        nh0Var = (nh0) ph0Var.a.get(i3 - i15);
                    }
                    if (nh0Var != null) {
                        boolean z15 = oh0Var.e == nh0Var;
                        boolean z16 = nh0Var == ph0Var.H;
                        boolean z17 = ph0Var.J.get(nh0Var.c) != null;
                        oh0Var.e = nh0Var;
                        oh0Var.a.setText(nh0Var.f);
                        oh0Var.d = i3 != ph0Var.F - 1;
                        oh0Var.b.a(z16, z15);
                        oh0Var.c.a(z17, z15);
                        break;
                    }
                } else if (i13 == 1) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view3;
                    if (i3 != 0) {
                        if (i3 == ph0Var.y) {
                            n4Var.setText(bd.M0(2131744299, null));
                            break;
                        }
                    } else {
                        n4Var.setText(bd.M0(2131744221, null));
                        break;
                    }
                } else if (i13 == 2) {
                    org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view3;
                    Drawable drawable = i2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable2 = i2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                    int i16 = org.telegram.ui.ActionBar.k6.N6;
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    org.telegram.ui.ActionBar.r6.y(i2Var, drawable, i16, e6Var, mode);
                    org.telegram.ui.ActionBar.r6.y(i2Var, drawable2, org.telegram.ui.ActionBar.k6.k7, e6Var, mode);
                    xp xpVar = new xp(drawable, drawable2);
                    i2Var.a.l(bd.M0(2131743813, null), false);
                    i2Var.b.setImageDrawable(xpVar);
                    i2Var.c = false;
                    break;
                }
                break;
            case 8:
                ((jc1) d1Var.a).a = WallpapersListActivity.j0[i3];
                break;
            case 9:
                vg.i iVar = (vg.i) obj;
                ArrayList arrayList2 = iVar.d;
                if (((vg.g) arrayList2.get(i3)).a == 1) {
                    vg.h hVar = (vg.h) d1Var.a;
                    hVar.c.setColorFilter(new PorterDuffColorFilter(iVar.e.getPixel(i3, 0), PorterDuff.Mode.MULTIPLY));
                    hVar.c.setImageDrawable(iVar.getContext().getDrawable(((vg.g) arrayList2.get(i3)).b));
                    hVar.a.setText(((vg.g) arrayList2.get(i3)).c);
                    hVar.b.setText(((vg.g) arrayList2.get(i3)).d);
                    break;
                }
                break;
            default:
                View view4 = d1Var.a;
                vg.h1 h1Var = (vg.h1) obj;
                int i17 = h1Var.c2;
                if (i3 >= i17 && i3 < h1Var.d2) {
                    ((yr0) view4).a((ls0) h1Var.Q1.get(i3 - i17), i3 != h1Var.d2 - 1);
                    break;
                } else if (i3 >= h1Var.a2 && i3 < h1Var.b2) {
                    h1Var.g1(view4);
                    break;
                }
                break;
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout frameLayout;
        View view;
        View view2;
        View view3;
        View view4;
        int i10 = this.c;
        final int i11 = 1;
        final int i12 = 0;
        Object obj = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.ea eaVar = new org.telegram.ui.Components.ea(((l6) obj).getContext());
                eaVar.a = 0;
                return new bj0(eaVar);
            case 1:
                kg.k0 k0Var = new kg.k0(viewGroup.getContext(), ((kg.n0) obj).o2);
                kg.m0 m0Var = new kg.m0(k0Var);
                m0Var.v = k0Var;
                k0Var.setLayoutParams(new u4.p0(-2, org.telegram.messenger.g0.L(30.0f)));
                return m0Var;
            case 2:
                return new bj0(((org.telegram.ui.Components.fa) obj).Q1);
            case 3:
                if (i3 == 0) {
                    frameLayout = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
                } else if (i3 == 1) {
                    Context context = viewGroup.getContext();
                    el0 el0Var = new el0(context);
                    org.telegram.ui.Cells.g7 g7Var = new org.telegram.ui.Cells.g7(2, context, null);
                    el0Var.a = g7Var;
                    g7Var.r.setVisibility(8);
                    el0Var.addView(g7Var);
                    frameLayout = el0Var;
                } else {
                    frameLayout = new fl0(viewGroup.getContext());
                }
                frameLayout.setLayoutParams(new u4.p0(-1, -2));
                return new bj0(frameLayout);
            case 4:
                tl0 tl0Var = (tl0) obj;
                return new bj0(new sl0(tl0Var, tl0Var.getContext()));
            case 5:
                ut utVar = (ut) obj;
                if (i3 == 0) {
                    view = utVar.W1;
                } else if (i3 == 2) {
                    View view5 = utVar.X1;
                    u4.p0 p0Var = new u4.p0(-1, -2);
                    int i13 = utVar.u0;
                    ((ViewGroup.MarginLayoutParams) p0Var).leftMargin = i13;
                    ((ViewGroup.MarginLayoutParams) p0Var).rightMargin = i13;
                    view5.setLayoutParams(p0Var);
                    view = view5;
                } else {
                    org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(viewGroup.getContext());
                    y8Var.setFixedSize(12);
                    int i14 = org.telegram.ui.ActionBar.k6.a7;
                    ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, i14, false));
                    org.telegram.ui.ActionBar.r6.y(y8Var, colorDrawable, i14, null, PorterDuff.Mode.SRC_IN);
                    xp xpVar = new xp(colorDrawable, org.telegram.ui.ActionBar.k6.Y0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7));
                    xpVar.x = true;
                    y8Var.setBackgroundDrawable(xpVar);
                    view = y8Var;
                }
                return new bj0(view);
            case 6:
                cf0 cf0Var = new cf0(viewGroup.getContext());
                cf0Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(50.0f)));
                return new bj0(cf0Var);
            case 7:
                org.telegram.ui.ActionBar.e6 e6Var = ((ph0) obj).f;
                Context context2 = viewGroup.getContext();
                if (i3 == 0) {
                    oh0 oh0Var = new oh0(context2);
                    RadioButton radioButton = new RadioButton(context2);
                    oh0Var.b = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.r6.P(radioButton, org.telegram.ui.ActionBar.k6.g7, org.telegram.ui.ActionBar.k6.h7, e6Var);
                    boolean z10 = bd.a0;
                    oh0Var.addView(radioButton, mf.d(22, 22.0f, (z10 ? 5 : 3) | 16, z10 ? 0 : 20, 0.0f, z10 ? 20 : 0, 0.0f));
                    wo woVar = new wo(24, context2, e6Var);
                    oh0Var.c = woVar;
                    int i15 = org.telegram.ui.ActionBar.k6.d6;
                    woVar.b(-1, i15, org.telegram.ui.ActionBar.k6.k7);
                    woVar.setDrawUnchecked(false);
                    woVar.setDrawBackgroundAsArc(3);
                    boolean z11 = bd.a0;
                    oh0Var.addView(woVar, mf.d(26, 26.0f, (z11 ? 5 : 3) | 16, z11 ? 0 : 18, 0.0f, z11 ? 18 : 0, 0.0f));
                    woVar.a(true, false);
                    TextView textView = new TextView(context2);
                    oh0Var.a = textView;
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
                    org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setGravity((bd.a0 ? 5 : 3) | 16);
                    boolean z12 = bd.a0;
                    oh0Var.addView(textView, mf.d(-2, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 23 : 61, 0.0f, z12 ? 61 : 23, 0.0f));
                    org.telegram.ui.ActionBar.r6.i(i15, oh0Var, e6Var);
                    view2 = oh0Var;
                } else if (i3 == 2) {
                    org.telegram.ui.Cells.i2 i2Var = new org.telegram.ui.Cells.i2(70, context2, e6Var);
                    i2Var.d = 61;
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, i2Var, e6Var);
                    view2 = i2Var;
                } else if (i3 != 3) {
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context2, e6Var);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var, e6Var);
                    view2 = n4Var;
                } else {
                    view2 = new org.telegram.ui.Cells.x6(context2, (org.telegram.ui.Cells.f1) null);
                }
                return k2.p1.p(view2, view2, -1, -2);
            case 8:
                nc1 nc1Var = (nc1) obj;
                return new bj0(new jc1(nc1Var.F, nc1Var.c));
            case 9:
                vg.i iVar = (vg.i) obj;
                org.telegram.ui.ActionBar.e6 e6Var2 = iVar.a;
                if (i3 == 0) {
                    view3 = new vg.f(iVar, iVar.getContext());
                } else if (i3 == 2) {
                    view3 = new org.telegram.ui.Cells.v3(iVar.getContext(), 16);
                } else {
                    Context context3 = iVar.getContext();
                    vg.h hVar = new vg.h(context3);
                    ImageView imageView = new ImageView(context3);
                    hVar.c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    hVar.addView(imageView, mf.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context3);
                    hVar.a = textView2;
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.G6, e6Var2);
                    textView2.setTextSize(1, 14.0f);
                    hVar.addView(textView2, mf.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    hVar.b = textView3;
                    org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.y6, e6Var2);
                    textView3.setTextSize(1, 14.0f);
                    hVar.addView(textView3, mf.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view3 = hVar;
                }
                return k2.p1.p(view3, view3, -1, -2);
            default:
                Context context4 = viewGroup.getContext();
                vg.h1 h1Var = (vg.h1) obj;
                View h12 = h1Var.h1(context4, i3);
                if (h12 != null) {
                    return k2.p1.p(h12, h12, -1, -2);
                }
                if (i3 == 0) {
                    s51 s51Var = new s51(25, context4, this);
                    h1Var.l2 = s51Var;
                    s51Var.setOrientation(1);
                    View view6 = h1Var.u2;
                    if (view6 == null) {
                        h1Var.k2 = new ic(context4, 1, 0, 4);
                        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        int i16 = org.telegram.ui.ActionBar.k6.Ak;
                        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.w0(i16, h1Var.J0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, h1Var.J0)));
                        h1Var.k2.setBackgroundBitmap(createBitmap);
                        wg.f fVar = h1Var.k2.b;
                        fVar.z = i16;
                        fVar.A = org.telegram.ui.ActionBar.k6.zk;
                        fVar.b();
                        s51Var.addView(h1Var.k2, mf.r(hs.q2, hs.q2, 1));
                    } else {
                        if (view6.getParent() != null) {
                            ((ViewGroup) h1Var.u2.getParent()).removeView(h1Var.u2);
                        }
                        h1Var.e1(s51Var);
                    }
                    if (h1Var.G2 == null) {
                        FrameLayout frameLayout2 = new FrameLayout(context4);
                        h1Var.G2 = frameLayout2;
                        frameLayout2.setClipChildren(false);
                        Integer num = h1Var.n2;
                        new PorterDuffColorFilter(num == null ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, h1Var.J0) : num.intValue(), PorterDuff.Mode.SRC_IN);
                        h1Var.H2 = new s70[2];
                        int i17 = 0;
                        while (i17 < 2) {
                            h1Var.H2[i17] = new ai.e2(7, context4, h1Var.J0);
                            h1Var.H2[i17].setVisibility(i17 == 0 ? 0 : 8);
                            h1Var.H2[i17].setTextSize(1, 16.0f);
                            h1Var.H2[i17].setTypeface(org.telegram.messenger.g0.o());
                            h1Var.H2[i17].setGravity(1);
                            org.telegram.ui.ActionBar.r6.V(h1Var.H2[i17], org.telegram.ui.ActionBar.k6.G6, h1Var.J0);
                            org.telegram.ui.ActionBar.r6.H(h1Var.H2[i17], org.telegram.ui.ActionBar.k6.J6, h1Var.J0);
                            h1Var.G2.addView(h1Var.H2[i17], mf.c(-2.0f, -1));
                            i17++;
                        }
                    }
                    if (h1Var.G2.getParent() != null) {
                        ((ViewGroup) h1Var.G2.getParent()).removeView(h1Var.G2);
                    }
                    s51Var.addView(h1Var.G2, mf.q(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                    if (h1Var.I2 == null) {
                        s70 s70Var = new s70(h1Var.getContext(), h1Var.J0);
                        h1Var.I2 = s70Var;
                        s70Var.setTextSize(1, 14.0f);
                        h1Var.I2.setGravity(1);
                        org.telegram.ui.ActionBar.r6.V(h1Var.I2, org.telegram.ui.ActionBar.k6.G6, h1Var.J0);
                        org.telegram.ui.ActionBar.r6.H(h1Var.I2, org.telegram.ui.ActionBar.k6.J6, h1Var.J0);
                    }
                    if (h1Var.I2.getParent() != null) {
                        ((ViewGroup) h1Var.I2.getParent()).removeView(h1Var.I2);
                    }
                    s51Var.addView(h1Var.I2, mf.q(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                    h1Var.j1(false);
                    h1Var.j2 = new ii.f(context4, 5);
                    kw0 kw0Var = new kw0(13, context4, this);
                    kw0Var.setClipChildren(false);
                    kw0Var.addView(h1Var.j2);
                    kw0Var.addView(s51Var);
                    ic icVar = h1Var.k2;
                    view4 = kw0Var;
                    if (icVar != null) {
                        icVar.setStarParticlesView(h1Var.j2);
                        view4 = kw0Var;
                    }
                } else if (i3 == 2) {
                    int i18 = org.telegram.ui.ActionBar.k6.a7;
                    org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context4, org.telegram.ui.ActionBar.k6.w0(i18, h1Var.J0), 0);
                    org.telegram.ui.ActionBar.r6.i(i18, x6Var, h1Var.J0);
                    view4 = x6Var;
                } else if (i3 == 3) {
                    view4 = new vg.g1(context4, i12);
                } else if (i3 == 4) {
                    view4 = new q(context4);
                } else if (i3 != 5) {
                    view4 = new es0(this, context4, h1Var.J0);
                } else {
                    zg.d0 d0Var = new zg.d0(context4, h1Var.J0);
                    d0Var.setBackground(true);
                    String M0 = bd.M0(2131749670, "GiftPremiumPrivacyPolicyAndTerms");
                    int i19 = org.telegram.ui.ActionBar.k6.Uc;
                    d0Var.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.S2(M0, i19, 0, new Runnable(this) { // from class: vg.f1
                        public final /* synthetic */ r4 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i20 = i12;
                            r4 r4Var = this.b;
                            switch (i20) {
                                case 0:
                                    sf.c.t(((h1) r4Var.d).m2.getParentActivity(), bd.M0(2131744206, null));
                                    break;
                                default:
                                    sf.c.t(((h1) r4Var.d).m2.getParentActivity(), bd.M0(2131746789, null));
                                    break;
                            }
                        }
                    }, null), org.telegram.messenger.g0.S2(bd.M0(2131749671, "GiftPremiumPrivacyPolicy"), i19, 0, new Runnable(this) { // from class: vg.f1
                        public final /* synthetic */ r4 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i20 = i11;
                            r4 r4Var = this.b;
                            switch (i20) {
                                case 0:
                                    sf.c.t(((h1) r4Var.d).m2.getParentActivity(), bd.M0(2131744206, null));
                                    break;
                                default:
                                    sf.c.t(((h1) r4Var.d).m2.getParentActivity(), bd.M0(2131746789, null));
                                    break;
                            }
                        }
                    }, null), "%1$s"));
                    view4 = d0Var;
                }
                view4.setLayoutParams(new u4.p0(-1, -2));
                h1Var.d1(i3, view4);
                return new bj0(view4);
        }
    }

    @Override // u4.h0
    public void y(u4.d1 d1Var) {
        switch (this.c) {
            case 4:
                tl0 tl0Var = (tl0) this.d;
                ArrayList arrayList = tl0Var.r;
                int b10 = d1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((sl0) d1Var.a).a(((ql0) arrayList.get(b10)).a.h == tl0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void F(u4.d1 d1Var, int i3) {
    }

    private final void G(u4.d1 d1Var, int i3) {
    }
}
