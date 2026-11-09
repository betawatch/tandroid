package bi;

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
import bi.k5;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.r01;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.d61;
import org.telegram.ui.kf0;
import org.telegram.ui.ks0;
import org.telegram.ui.lf0;
import org.telegram.ui.qs0;
import org.telegram.ui.rc1;
import org.telegram.ui.sh0;
import org.telegram.ui.th0;
import org.telegram.ui.tz;
import org.telegram.ui.uh0;
import org.telegram.ui.vc1;
import org.telegram.ui.xs0;
import org.telegram.ui.yt;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class k5 extends pj0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k5(Object obj, int i7) {
        this.c = i7;
        this.d = obj;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        switch (this.c) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                int i7 = d1Var.f;
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
                int i10 = d1Var.f;
                return i10 == 0 || i10 == 2;
            case 9:
                return true;
            case 10:
                return false;
            default:
                return d1Var.f == 1;
        }
    }

    public ij E(int i7) {
        el0 el0Var = (el0) this.d;
        int i10 = el0Var.w;
        if (i7 >= i10 && i7 < el0Var.x) {
            return (ij) el0Var.e.get(i7 - i10);
        }
        int i11 = el0Var.D;
        if (i7 < i11 || i7 >= el0Var.E) {
            return null;
        }
        return (ij) el0Var.f.get(i7 - i11);
    }

    public void H(int i7, int i10) {
        int[] iArr = ((k7) this.d).K2;
        if (iArr[0] == i7 && iArr[1] == i10) {
            return;
        }
        iArr[0] = i7;
        iArr[1] = i10;
        f();
    }

    @Override // v4.g0
    public final int b() {
        switch (this.c) {
            case 0:
                return ((k7) this.d).K2.length;
            case 1:
                return ((jg.q0) this.d).e3.size();
            case 2:
                return 1;
            case 3:
                return ((el0) this.d).r;
            case 4:
                return ((rl0) this.d).r.size();
            case 5:
                return ((t01) this.d).R.size();
            case 6:
                return ((yt) this.d).Y1.h() ? 1 : 3;
            case 7:
                return ((lf0) this.d).c.size();
            case 8:
                return ((uh0) this.d).h;
            case 9:
                return 12;
            case 10:
                return ((ug.i) this.d).d.size();
            default:
                return ((ug.f1) this.d).X1;
        }
    }

    @Override // v4.g0
    public long c(int i7) {
        sh0 sh0Var;
        switch (this.c) {
            case 8:
                uh0 uh0Var = (uh0) this.d;
                int i10 = uh0Var.D;
                if (i7 < i10 || i7 >= uh0Var.E) {
                    int i11 = uh0Var.n;
                    sh0Var = (i7 < i11 || i7 >= uh0Var.r) ? null : (sh0) uh0Var.a.get(i7 - i11);
                } else {
                    sh0Var = (sh0) uh0Var.b.get(i7 - i10);
                }
                if (sh0Var != null) {
                    return sh0Var.c;
                }
                uh0Var.getClass();
                if (i7 == 0) {
                    return 1L;
                }
                if (i7 == uh0Var.y) {
                    return 2L;
                }
                if (i7 == uh0Var.s) {
                    return 3L;
                }
                if (i7 == uh0Var.w) {
                    return 4L;
                }
                if (i7 == uh0Var.x) {
                    return 5L;
                }
                throw new RuntimeException();
            default:
                return super.c(i7);
        }
    }

    @Override // v4.g0
    public int d(int i7) {
        switch (this.c) {
            case 2:
                return i7;
            case 3:
                el0 el0Var = (el0) this.d;
                if (i7 == el0Var.s || i7 == el0Var.y) {
                    return 0;
                }
                ij E = E(i7);
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
                uh0 uh0Var = (uh0) this.d;
                if (i7 >= uh0Var.D && i7 < uh0Var.E) {
                    return 0;
                }
                uh0Var.getClass();
                if (i7 == 0 || i7 == uh0Var.y) {
                    return 1;
                }
                if (i7 == uh0Var.s) {
                    return 2;
                }
                return (i7 == uh0Var.w || i7 == uh0Var.x) ? 3 : 0;
            case 10:
                return ((ug.g) ((ug.i) this.d).d.get(i7)).a;
            case 11:
                ug.f1 f1Var = (ug.f1) this.d;
                if (i7 != f1Var.Y1) {
                    if (i7 >= f1Var.Z1 && i7 < f1Var.a2) {
                        return f1Var.f1();
                    }
                    if (i7 >= f1Var.b2 && i7 < f1Var.c2) {
                        return 1;
                    }
                    if (i7 == f1Var.d2) {
                        return 2;
                    }
                    if (i7 == f1Var.e2) {
                        return 3;
                    }
                    if (i7 == 0) {
                        return 4;
                    }
                    if (i7 == f1Var.f2) {
                        return 5;
                    }
                }
                return 0;
        }
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        int i10 = this.c;
        sh0 sh0Var = null;
        Object obj = this.d;
        switch (i10) {
            case 0:
                int[] iArr = ((k7) obj).K2;
                int length = (iArr.length - 1) - i7;
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) d1Var.a;
                int i11 = iArr[length];
                if (faVar.a != i11) {
                    faVar.a = i11;
                    faVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ((jg.p0) d1Var).v.setData((jg.o0) ((jg.q0) obj).e3.get(i7));
                return;
            case 2:
                return;
            case 3:
                el0 el0Var = (el0) obj;
                tz tzVar = el0Var.J;
                int i12 = d1Var.f;
                View view = d1Var.a;
                if (i12 == 0) {
                    org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
                    if (i7 != el0Var.s) {
                        if (i7 == el0Var.y) {
                            x3Var.b(org.telegram.messenger.id.M0(2131746362, null), org.telegram.messenger.id.M0(2131745495, null), new ma0(this, 7));
                            return;
                        }
                        return;
                    }
                    String M0 = org.telegram.messenger.id.M0(2131751344, null);
                    if (!x3Var.getText().equals(M0)) {
                        x3Var.b(M0, el0Var.H ? org.telegram.messenger.id.M0(2131747433, null) : org.telegram.messenger.id.M0(2131746053, null), new dl0(this));
                        return;
                    }
                    String M02 = el0Var.H ? org.telegram.messenger.id.M0(2131747433, null) : org.telegram.messenger.id.M0(2131746053, null);
                    boolean z10 = el0Var.H;
                    org.telegram.ui.Cells.w3 w3Var = x3Var.b;
                    w3Var.c(M02, true, z10);
                    w3Var.setVisibility(0);
                    return;
                }
                ij E = E(i7);
                if (E != null) {
                    boolean z11 = el0Var.I.i() && i7 >= el0Var.w && i7 < el0Var.x;
                    if (i12 == 1) {
                        bl0 bl0Var = (bl0) view;
                        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, bl0Var, null);
                        org.telegram.ui.Cells.h7 h7Var = bl0Var.a;
                        int e12 = h7Var.getMessage() == null ? 0 : h7Var.getMessage().e1();
                        h7Var.c(E, true);
                        int e13 = h7Var.getMessage().e1();
                        tzVar.a = ij.B0(h7Var.getMessage().k);
                        tzVar.b = e13;
                        h7Var.b(el0Var.I.f(tzVar), e12 == E.e1());
                        z9 = e12 == E.e1();
                        if (h7Var.O == z11) {
                            return;
                        }
                        h7Var.O = z11;
                        if (!z9) {
                            h7Var.P = z11 ? 1.0f : 0.0f;
                        }
                        h7Var.invalidate();
                        return;
                    }
                    if (i12 == 2) {
                        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                        int e14 = g7Var.getMessage() == null ? 0 : g7Var.getMessage().e1();
                        g7Var.f(E, true);
                        int e15 = g7Var.getMessage().e1();
                        tzVar.a = ij.B0(g7Var.getMessage().k);
                        tzVar.b = e15;
                        g7Var.e(el0Var.I.f(tzVar), e14 == E.e1());
                        z9 = e14 == E.e1();
                        if (g7Var.d0 == z11) {
                            return;
                        }
                        g7Var.d0 = z11;
                        if (!z9) {
                            g7Var.e0 = z11 ? 1.0f : 0.0f;
                        }
                        g7Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                View view2 = d1Var.a;
                rl0 rl0Var = (rl0) obj;
                ArrayList arrayList = rl0Var.r;
                if (i7 < 0 || i7 >= arrayList.size()) {
                    return;
                }
                ol0 ol0Var = (ol0) arrayList.get(i7);
                ql0 ql0Var = (ql0) view2;
                ch.o0 o0Var = ql0Var.d;
                boolean z12 = o0Var == null || !o0Var.equals(ol0Var.a);
                if (z12) {
                    TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                    tL_reactionCount.reaction = ol0Var.a.g();
                    tL_reactionCount.count = ol0Var.b;
                    rl0 rl0Var2 = ql0Var.s;
                    pl0 pl0Var = new pl0(ql0Var, rl0Var2.a, ql0Var, tL_reactionCount, rl0Var2.c);
                    ql0Var.a = pl0Var;
                    pl0Var.E.d(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(100.0f));
                    pl0 pl0Var2 = ql0Var.a;
                    pl0Var2.p = true;
                    pl0Var2.R = true;
                } else {
                    ql0Var.a.v = ol0Var.b;
                }
                ql0Var.d = ol0Var.a;
                if (!z12) {
                    pl0 pl0Var3 = ql0Var.a;
                    pl0Var3.e = pl0Var3.z;
                }
                ql0Var.a.z = org.telegram.messenger.g0.L(44.33f);
                ql0Var.a.t = !TextUtils.isEmpty(ol0Var.c);
                pl0 pl0Var4 = ql0Var.a;
                boolean z13 = pl0Var4.t;
                org.telegram.ui.Components.i6 i6Var = pl0Var4.F;
                if (z13) {
                    i6Var.t(org.telegram.messenger.i6.m(ol0Var.c, i6Var.a.getFontMetricsInt(), false, null, 0), !z12, true);
                } else if (i6Var != null) {
                    i6Var.t("", !z12, true);
                }
                pl0 pl0Var5 = ql0Var.a;
                Integer.toString(ol0Var.b);
                pl0Var5.getClass();
                ql0Var.a.E.c(ol0Var.b, !z12);
                pl0 pl0Var6 = ql0Var.a;
                if (pl0Var6.E != null && (pl0Var6.v > 0 || pl0Var6.t)) {
                    pl0Var6.z = (int) (org.telegram.messenger.g0.L(ql0Var.a.t ? 4.0f : 0.0f) + ((int) Math.ceil(r3.m)) + ql0Var.a.F.d + pl0Var6.z);
                }
                if (z12) {
                    pl0 pl0Var7 = ql0Var.a;
                    pl0Var7.e = pl0Var7.z;
                }
                ql0Var.a.A = org.telegram.messenger.g0.L(28.0f);
                pl0 pl0Var8 = ql0Var.a;
                pl0Var8.o = ql0Var.e;
                if (ql0Var.r) {
                    pl0Var8.a();
                }
                if (!z12) {
                    ql0Var.requestLayout();
                }
                ((ql0) view2).a(ol0Var.a.h == rl0Var.h, false);
                return;
            case 5:
                r01 r01Var = (r01) d1Var.a;
                p01 p01Var = (p01) ((t01) obj).R.get(i7);
                r01Var.getClass();
                p01Var.getClass();
                throw null;
            case 6:
                return;
            case 7:
                lf0 lf0Var = (lf0) obj;
                ((kf0) d1Var.a).a((TLObject) lf0Var.c.get(i7), ((Integer) lf0Var.b.get(i7)).intValue(), false);
                return;
            case 8:
                uh0 uh0Var = (uh0) obj;
                org.telegram.ui.ActionBar.g6 g6Var = uh0Var.f;
                int i13 = d1Var.f;
                View view3 = d1Var.a;
                if (i13 == 0) {
                    th0 th0Var = (th0) view3;
                    int i14 = uh0Var.D;
                    if (i7 >= i14 && i7 < uh0Var.E) {
                        sh0Var = (sh0) uh0Var.b.get(i7 - i14);
                    }
                    int i15 = uh0Var.n;
                    if (i7 >= i15 && i7 < uh0Var.r) {
                        sh0Var = (sh0) uh0Var.a.get(i7 - i15);
                    }
                    if (sh0Var != null) {
                        boolean z14 = th0Var.e == sh0Var;
                        boolean z15 = sh0Var == uh0Var.G;
                        boolean z16 = uh0Var.I.get(sh0Var.c) != null;
                        th0Var.e = sh0Var;
                        th0Var.a.setText(sh0Var.f);
                        th0Var.d = i7 != uh0Var.E - 1;
                        th0Var.b.a(z15, z14);
                        th0Var.c.a(z16, z14);
                        return;
                    }
                    return;
                }
                if (i13 == 1) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view3;
                    if (i7 == 0) {
                        n4Var.setText(org.telegram.messenger.id.M0(2131744211, null));
                        return;
                    } else {
                        if (i7 == uh0Var.y) {
                            n4Var.setText(org.telegram.messenger.id.M0(2131744289, null));
                            return;
                        }
                        return;
                    }
                }
                if (i13 != 2) {
                    return;
                }
                org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view3;
                Drawable drawable = i2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = i2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                int i16 = org.telegram.ui.ActionBar.l6.N6;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.s6.x(i2Var, drawable, i16, g6Var, mode);
                org.telegram.ui.ActionBar.s6.x(i2Var, drawable2, org.telegram.ui.ActionBar.l6.k7, g6Var, mode);
                xp xpVar = new xp(drawable, drawable2);
                i2Var.a.l(org.telegram.messenger.id.M0(2131743803, null), false);
                i2Var.b.setImageDrawable(xpVar);
                i2Var.c = false;
                return;
            case 9:
                ((rc1) d1Var.a).a = WallpapersListActivity.i0[i7];
                return;
            case 10:
                ug.i iVar = (ug.i) obj;
                ArrayList arrayList2 = iVar.d;
                if (((ug.g) arrayList2.get(i7)).a == 1) {
                    ug.h hVar = (ug.h) d1Var.a;
                    hVar.c.setColorFilter(new PorterDuffColorFilter(iVar.e.getPixel(i7, 0), PorterDuff.Mode.MULTIPLY));
                    hVar.c.setImageDrawable(iVar.getContext().getDrawable(((ug.g) arrayList2.get(i7)).b));
                    hVar.a.setText(((ug.g) arrayList2.get(i7)).c);
                    hVar.b.setText(((ug.g) arrayList2.get(i7)).d);
                    return;
                }
                return;
            default:
                View view4 = d1Var.a;
                ug.f1 f1Var = (ug.f1) obj;
                int i17 = f1Var.b2;
                if (i7 >= i17 && i7 < f1Var.c2) {
                    ((ks0) view4).a((xs0) f1Var.P1.get(i7 - i17), i7 != f1Var.c2 - 1);
                    return;
                } else {
                    if (i7 < f1Var.Z1 || i7 >= f1Var.a2) {
                        return;
                    }
                    f1Var.g1(view4);
                    return;
                }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
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
                org.telegram.ui.Components.fa faVar = new org.telegram.ui.Components.fa(((k7) obj).getContext());
                faVar.a = 0;
                return new yi0(faVar);
            case 1:
                jg.n0 n0Var = new jg.n0(viewGroup.getContext(), ((jg.q0) obj).n2);
                jg.p0 p0Var = new jg.p0(n0Var);
                p0Var.v = n0Var;
                n0Var.setLayoutParams(new v4.o0(-2, org.telegram.messenger.g0.L(30.0f)));
                return p0Var;
            case 2:
                return new yi0(((org.telegram.ui.Components.ga) obj).P1);
            case 3:
                if (i7 == 0) {
                    frameLayout = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
                } else if (i7 == 1) {
                    Context context = viewGroup.getContext();
                    bl0 bl0Var = new bl0(context);
                    org.telegram.ui.Cells.h7 h7Var = new org.telegram.ui.Cells.h7(2, context, null);
                    bl0Var.a = h7Var;
                    h7Var.r.setVisibility(8);
                    bl0Var.addView(h7Var);
                    frameLayout = bl0Var;
                } else {
                    frameLayout = new cl0(viewGroup.getContext());
                }
                frameLayout.setLayoutParams(new v4.o0(-1, -2));
                return new yi0(frameLayout);
            case 4:
                rl0 rl0Var = (rl0) obj;
                return new yi0(new ql0(rl0Var, rl0Var.getContext()));
            case 5:
                r01 r01Var = new r01((t01) obj, viewGroup.getContext());
                r01Var.setLayoutParams(new v4.o0(-2, -1));
                return new yi0(r01Var);
            case 6:
                yt ytVar = (yt) obj;
                if (i7 == 0) {
                    view = ytVar.V1;
                } else if (i7 == 2) {
                    View view5 = ytVar.W1;
                    v4.o0 o0Var = new v4.o0(-1, -2);
                    int i13 = ytVar.t0;
                    ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = i13;
                    ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = i13;
                    view5.setLayoutParams(o0Var);
                    view = view5;
                } else {
                    org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(viewGroup.getContext());
                    z8Var.setFixedSize(12);
                    int i14 = org.telegram.ui.ActionBar.l6.a7;
                    ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.l6.x0(null, i14, false));
                    org.telegram.ui.ActionBar.s6.x(z8Var, colorDrawable, i14, null, PorterDuff.Mode.SRC_IN);
                    xp xpVar = new xp(colorDrawable, org.telegram.ui.ActionBar.l6.Y0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.l6.b7));
                    xpVar.x = true;
                    z8Var.setBackgroundDrawable(xpVar);
                    view = z8Var;
                }
                return new yi0(view);
            case 7:
                kf0 kf0Var = new kf0(viewGroup.getContext());
                kf0Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(50.0f)));
                return new yi0(kf0Var);
            case 8:
                org.telegram.ui.ActionBar.g6 g6Var = ((uh0) obj).f;
                Context context2 = viewGroup.getContext();
                if (i7 == 0) {
                    th0 th0Var = new th0(context2);
                    RadioButton radioButton = new RadioButton(context2);
                    th0Var.b = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.s6.O(radioButton, org.telegram.ui.ActionBar.l6.g7, org.telegram.ui.ActionBar.l6.h7, g6Var);
                    boolean z9 = org.telegram.messenger.id.a0;
                    th0Var.addView(radioButton, c8.ha.d(22, 22.0f, (z9 ? 5 : 3) | 16, z9 ? 0 : 20, 0.0f, z9 ? 20 : 0, 0.0f));
                    wo woVar = new wo(24, context2, g6Var);
                    th0Var.c = woVar;
                    int i15 = org.telegram.ui.ActionBar.l6.d6;
                    woVar.b(-1, i15, org.telegram.ui.ActionBar.l6.k7);
                    woVar.setDrawUnchecked(false);
                    woVar.setDrawBackgroundAsArc(3);
                    boolean z10 = org.telegram.messenger.id.a0;
                    th0Var.addView(woVar, c8.ha.d(26, 26.0f, (z10 ? 5 : 3) | 16, z10 ? 0 : 18, 0.0f, z10 ? 18 : 0, 0.0f));
                    woVar.a(true, false);
                    TextView textView = new TextView(context2);
                    th0Var.a = textView;
                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.G6, g6Var);
                    org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 16);
                    boolean z11 = org.telegram.messenger.id.a0;
                    th0Var.addView(textView, c8.ha.d(-2, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 23 : 61, 0.0f, z11 ? 61 : 23, 0.0f));
                    org.telegram.ui.ActionBar.s6.h(i15, th0Var, g6Var);
                    view2 = th0Var;
                } else if (i7 == 2) {
                    org.telegram.ui.Cells.i2 i2Var = new org.telegram.ui.Cells.i2(70, context2, g6Var);
                    i2Var.d = 61;
                    org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, i2Var, g6Var);
                    view2 = i2Var;
                } else if (i7 != 3) {
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context2, g6Var);
                    org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, n4Var, g6Var);
                    view2 = n4Var;
                } else {
                    view2 = new org.telegram.ui.Cells.y6(context2, (org.telegram.ui.Cells.f1) null);
                }
                return jg.g.r(view2, view2, -1, -2);
            case 9:
                vc1 vc1Var = (vc1) obj;
                return new yi0(new rc1(vc1Var.E, vc1Var.c));
            case 10:
                ug.i iVar = (ug.i) obj;
                org.telegram.ui.ActionBar.g6 g6Var2 = iVar.a;
                if (i7 == 0) {
                    view3 = new ug.f(iVar, iVar.getContext());
                } else if (i7 == 2) {
                    view3 = new org.telegram.ui.Cells.v3(iVar.getContext(), 16);
                } else {
                    Context context3 = iVar.getContext();
                    ug.h hVar = new ug.h(context3);
                    ImageView imageView = new ImageView(context3);
                    hVar.c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    hVar.addView(imageView, c8.ha.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context3);
                    hVar.a = textView2;
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.G6, g6Var2);
                    textView2.setTextSize(1, 14.0f);
                    hVar.addView(textView2, c8.ha.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    hVar.b = textView3;
                    org.telegram.ui.ActionBar.s6.U(textView3, org.telegram.ui.ActionBar.l6.y6, g6Var2);
                    textView3.setTextSize(1, 14.0f);
                    hVar.addView(textView3, c8.ha.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view3 = hVar;
                }
                return jg.g.r(view3, view3, -1, -2);
            default:
                Context context4 = viewGroup.getContext();
                ug.f1 f1Var = (ug.f1) obj;
                View h12 = f1Var.h1(context4, i7);
                if (h12 != null) {
                    return jg.g.r(h12, h12, -1, -2);
                }
                if (i7 == 0) {
                    d61 d61Var = new d61(24, context4, this);
                    f1Var.k2 = d61Var;
                    d61Var.setOrientation(1);
                    View view6 = f1Var.t2;
                    if (view6 == null) {
                        f1Var.j2 = new qd(context4, 1, 0, 4);
                        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        int i16 = org.telegram.ui.ActionBar.l6.Ak;
                        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.l6.w0(i16, f1Var.I0), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.h5, f1Var.I0)));
                        f1Var.j2.setBackgroundBitmap(createBitmap);
                        vg.f fVar = f1Var.j2.b;
                        fVar.z = i16;
                        fVar.A = org.telegram.ui.ActionBar.l6.zk;
                        fVar.b();
                        d61Var.addView(f1Var.j2, c8.ha.r(qs.q2, qs.q2, 1));
                    } else {
                        if (view6.getParent() != null) {
                            ((ViewGroup) f1Var.t2.getParent()).removeView(f1Var.t2);
                        }
                        f1Var.e1(d61Var);
                    }
                    if (f1Var.F2 == null) {
                        FrameLayout frameLayout2 = new FrameLayout(context4);
                        f1Var.F2 = frameLayout2;
                        frameLayout2.setClipChildren(false);
                        Integer num = f1Var.m2;
                        new PorterDuffColorFilter(num == null ? org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.v6, f1Var.I0) : num.intValue(), PorterDuff.Mode.SRC_IN);
                        f1Var.G2 = new x70[2];
                        int i17 = 0;
                        while (i17 < 2) {
                            f1Var.G2[i17] = new org.telegram.ui.Components.jb(4, context4, f1Var.I0);
                            f1Var.G2[i17].setVisibility(i17 == 0 ? 0 : 8);
                            f1Var.G2[i17].setTextSize(1, 16.0f);
                            f1Var.G2[i17].setTypeface(org.telegram.messenger.g0.o());
                            f1Var.G2[i17].setGravity(1);
                            org.telegram.ui.ActionBar.s6.U(f1Var.G2[i17], org.telegram.ui.ActionBar.l6.G6, f1Var.I0);
                            org.telegram.ui.ActionBar.s6.G(f1Var.G2[i17], org.telegram.ui.ActionBar.l6.J6, f1Var.I0);
                            f1Var.F2.addView(f1Var.G2[i17], c8.ha.c(-2.0f, -1));
                            i17++;
                        }
                    }
                    if (f1Var.F2.getParent() != null) {
                        ((ViewGroup) f1Var.F2.getParent()).removeView(f1Var.F2);
                    }
                    d61Var.addView(f1Var.F2, c8.ha.q(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                    if (f1Var.H2 == null) {
                        x70 x70Var = new x70(f1Var.getContext(), f1Var.I0);
                        f1Var.H2 = x70Var;
                        x70Var.setTextSize(1, 14.0f);
                        f1Var.H2.setGravity(1);
                        org.telegram.ui.ActionBar.s6.U(f1Var.H2, org.telegram.ui.ActionBar.l6.G6, f1Var.I0);
                        org.telegram.ui.ActionBar.s6.G(f1Var.H2, org.telegram.ui.ActionBar.l6.J6, f1Var.I0);
                    }
                    if (f1Var.H2.getParent() != null) {
                        ((ViewGroup) f1Var.H2.getParent()).removeView(f1Var.H2);
                    }
                    d61Var.addView(f1Var.H2, c8.ha.q(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                    f1Var.j1(false);
                    f1Var.i2 = new hi.e(context4, 5);
                    w41 w41Var = new w41(12, context4, this);
                    w41Var.setClipChildren(false);
                    w41Var.addView(f1Var.i2);
                    w41Var.addView(d61Var);
                    qd qdVar = f1Var.j2;
                    view4 = w41Var;
                    if (qdVar != null) {
                        qdVar.setStarParticlesView(f1Var.i2);
                        view4 = w41Var;
                    }
                } else if (i7 == 2) {
                    int i18 = org.telegram.ui.ActionBar.l6.a7;
                    org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context4, org.telegram.ui.ActionBar.l6.w0(i18, f1Var.I0), 0);
                    org.telegram.ui.ActionBar.s6.h(i18, y6Var, f1Var.I0);
                    view4 = y6Var;
                } else if (i7 == 3) {
                    view4 = new yh.g(context4, i12);
                } else if (i7 == 4) {
                    view4 = new t(context4);
                } else if (i7 != 5) {
                    view4 = new qs0(this, context4, f1Var.I0);
                } else {
                    yg.d0 d0Var = new yg.d0(context4, f1Var.I0);
                    d0Var.setBackground(true);
                    String M0 = org.telegram.messenger.id.M0(2131749662, "GiftPremiumPrivacyPolicyAndTerms");
                    int i19 = org.telegram.ui.ActionBar.l6.Uc;
                    d0Var.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.S2(M0, i19, 0, new Runnable(this) { // from class: ug.e1
                        public final /* synthetic */ k5 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i20 = i11;
                            k5 k5Var = this.b;
                            switch (i20) {
                                case 0:
                                    vf.c.t(((f1) k5Var.d).l2.getParentActivity(), id.M0(2131744196, null));
                                    break;
                                default:
                                    vf.c.t(((f1) k5Var.d).l2.getParentActivity(), id.M0(2131746781, null));
                                    break;
                            }
                        }
                    }, null), org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131749663, "GiftPremiumPrivacyPolicy"), i19, 0, new Runnable(this) { // from class: ug.e1
                        public final /* synthetic */ k5 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i20 = i12;
                            k5 k5Var = this.b;
                            switch (i20) {
                                case 0:
                                    vf.c.t(((f1) k5Var.d).l2.getParentActivity(), id.M0(2131744196, null));
                                    break;
                                default:
                                    vf.c.t(((f1) k5Var.d).l2.getParentActivity(), id.M0(2131746781, null));
                                    break;
                            }
                        }
                    }, null), "%1$s"));
                    view4 = d0Var;
                }
                view4.setLayoutParams(new v4.o0(-1, -2));
                f1Var.d1(i7, view4);
                return new yi0(view4);
        }
    }

    @Override // v4.g0
    public void y(v4.d1 d1Var) {
        switch (this.c) {
            case 4:
                rl0 rl0Var = (rl0) this.d;
                ArrayList arrayList = rl0Var.r;
                int b10 = d1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((ql0) d1Var.a).a(((ol0) arrayList.get(b10)).a.h == rl0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void F(v4.d1 d1Var, int i7) {
    }

    private final void G(v4.d1 d1Var, int i7) {
    }
}
