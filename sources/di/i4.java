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
import di.i4;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.r01;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.z70;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.fs0;
import org.telegram.ui.if0;
import org.telegram.ui.jf0;
import org.telegram.ui.ls0;
import org.telegram.ui.nc1;
import org.telegram.ui.rc1;
import org.telegram.ui.sh0;
import org.telegram.ui.ss0;
import org.telegram.ui.sz;
import org.telegram.ui.th0;
import org.telegram.ui.uh0;
import org.telegram.ui.yt;
import org.telegram.ui.z51;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i4 extends tj0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i4(Object obj, int i7) {
        this.c = i7;
        this.d = obj;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        switch (this.c) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                int i7 = e1Var.f;
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
                int i10 = e1Var.f;
                return i10 == 0 || i10 == 2;
            case 9:
                return true;
            case 10:
                return false;
            default:
                return e1Var.f == 1;
        }
    }

    public gj E(int i7) {
        il0 il0Var = (il0) this.d;
        int i10 = il0Var.w;
        if (i7 >= i10 && i7 < il0Var.x) {
            return (gj) il0Var.e.get(i7 - i10);
        }
        int i11 = il0Var.E;
        if (i7 < i11 || i7 >= il0Var.F) {
            return null;
        }
        return (gj) il0Var.f.get(i7 - i11);
    }

    public void H(int i7, int i10) {
        int[] iArr = ((c6) this.d).O2;
        if (iArr[0] == i7 && iArr[1] == i10) {
            return;
        }
        iArr[0] = i7;
        iArr[1] = i10;
        f();
    }

    @Override // v4.h0
    public final int b() {
        switch (this.c) {
            case 0:
                return ((c6) this.d).O2.length;
            case 1:
                return ((jg.q0) this.d).f3.size();
            case 2:
                return 1;
            case 3:
                return ((il0) this.d).r;
            case 4:
                return ((ul0) this.d).r.size();
            case 5:
                return ((v01) this.d).S.size();
            case 6:
                return ((yt) this.d).c2.h() ? 1 : 3;
            case 7:
                return ((jf0) this.d).c.size();
            case 8:
                return ((uh0) this.d).h;
            case 9:
                return 12;
            case 10:
                return ((ug.i) this.d).d.size();
            default:
                return ((ug.g1) this.d).b2;
        }
    }

    @Override // v4.h0
    public long c(int i7) {
        sh0 sh0Var;
        switch (this.c) {
            case 8:
                uh0 uh0Var = (uh0) this.d;
                int i10 = uh0Var.E;
                if (i7 < i10 || i7 >= uh0Var.F) {
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

    @Override // v4.h0
    public int d(int i7) {
        switch (this.c) {
            case 2:
                return i7;
            case 3:
                il0 il0Var = (il0) this.d;
                if (i7 == il0Var.s || i7 == il0Var.y) {
                    return 0;
                }
                gj E = E(i7);
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
                if (i7 >= uh0Var.E && i7 < uh0Var.F) {
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
                ug.g1 g1Var = (ug.g1) this.d;
                if (i7 != g1Var.c2) {
                    if (i7 >= g1Var.d2 && i7 < g1Var.e2) {
                        return g1Var.f1();
                    }
                    if (i7 >= g1Var.f2 && i7 < g1Var.g2) {
                        return 1;
                    }
                    if (i7 == g1Var.h2) {
                        return 2;
                    }
                    if (i7 == g1Var.i2) {
                        return 3;
                    }
                    if (i7 == 0) {
                        return 4;
                    }
                    if (i7 == g1Var.j2) {
                        return 5;
                    }
                }
                return 0;
        }
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        int i10 = this.c;
        sh0 sh0Var = null;
        Object obj = this.d;
        switch (i10) {
            case 0:
                int[] iArr = ((c6) obj).O2;
                int length = (iArr.length - 1) - i7;
                org.telegram.ui.Components.ba baVar = (org.telegram.ui.Components.ba) e1Var.a;
                int i11 = iArr[length];
                if (baVar.a != i11) {
                    baVar.a = i11;
                    baVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ((jg.p0) e1Var).v.setData((jg.o0) ((jg.q0) obj).f3.get(i7));
                return;
            case 2:
                return;
            case 3:
                il0 il0Var = (il0) obj;
                sz szVar = il0Var.K;
                int i12 = e1Var.f;
                View view = e1Var.a;
                if (i12 == 0) {
                    org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
                    if (i7 != il0Var.s) {
                        if (i7 == il0Var.y) {
                            x3Var.b(hd.M0(2131746362, null), hd.M0(2131745495, null), new y60(this, 8));
                            return;
                        }
                        return;
                    }
                    String M0 = hd.M0(2131751344, null);
                    if (!x3Var.getText().equals(M0)) {
                        x3Var.b(M0, il0Var.I ? hd.M0(2131747433, null) : hd.M0(2131746053, null), new hl0(this));
                        return;
                    }
                    String M02 = il0Var.I ? hd.M0(2131747433, null) : hd.M0(2131746053, null);
                    boolean z11 = il0Var.I;
                    org.telegram.ui.Cells.w3 w3Var = x3Var.b;
                    w3Var.c(M02, true, z11);
                    w3Var.setVisibility(0);
                    return;
                }
                gj E = E(i7);
                if (E != null) {
                    boolean z12 = il0Var.J.g0() && i7 >= il0Var.w && i7 < il0Var.x;
                    if (i12 == 1) {
                        fl0 fl0Var = (fl0) view;
                        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, fl0Var, null);
                        org.telegram.ui.Cells.g7 g7Var = fl0Var.a;
                        int e12 = g7Var.getMessage() == null ? 0 : g7Var.getMessage().e1();
                        g7Var.c(E, true);
                        int e13 = g7Var.getMessage().e1();
                        szVar.a = gj.B0(g7Var.getMessage().k);
                        szVar.b = e13;
                        g7Var.b(il0Var.J.l(szVar), e12 == E.e1());
                        z10 = e12 == E.e1();
                        if (g7Var.P == z12) {
                            return;
                        }
                        g7Var.P = z12;
                        if (!z10) {
                            g7Var.Q = z12 ? 1.0f : 0.0f;
                        }
                        g7Var.invalidate();
                        return;
                    }
                    if (i12 == 2) {
                        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                        int e14 = f7Var.getMessage() == null ? 0 : f7Var.getMessage().e1();
                        f7Var.f(E, true);
                        int e15 = f7Var.getMessage().e1();
                        szVar.a = gj.B0(f7Var.getMessage().k);
                        szVar.b = e15;
                        f7Var.e(il0Var.J.l(szVar), e14 == E.e1());
                        z10 = e14 == E.e1();
                        if (f7Var.e0 == z12) {
                            return;
                        }
                        f7Var.e0 = z12;
                        if (!z10) {
                            f7Var.f0 = z12 ? 1.0f : 0.0f;
                        }
                        f7Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                View view2 = e1Var.a;
                ul0 ul0Var = (ul0) obj;
                ArrayList arrayList = ul0Var.r;
                if (i7 < 0 || i7 >= arrayList.size()) {
                    return;
                }
                rl0 rl0Var = (rl0) arrayList.get(i7);
                tl0 tl0Var = (tl0) view2;
                ch.p0 p0Var = tl0Var.d;
                boolean z13 = p0Var == null || !p0Var.equals(rl0Var.a);
                if (z13) {
                    TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                    tL_reactionCount.reaction = rl0Var.a.g();
                    tL_reactionCount.count = rl0Var.b;
                    ul0 ul0Var2 = tl0Var.s;
                    sl0 sl0Var = new sl0(tl0Var, ul0Var2.a, tl0Var, tL_reactionCount, ul0Var2.c);
                    tl0Var.a = sl0Var;
                    sl0Var.E.d(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(100.0f));
                    sl0 sl0Var2 = tl0Var.a;
                    sl0Var2.p = true;
                    sl0Var2.R = true;
                } else {
                    tl0Var.a.v = rl0Var.b;
                }
                tl0Var.d = rl0Var.a;
                if (!z13) {
                    sl0 sl0Var3 = tl0Var.a;
                    sl0Var3.e = sl0Var3.z;
                }
                tl0Var.a.z = org.telegram.messenger.g0.L(44.33f);
                tl0Var.a.t = !TextUtils.isEmpty(rl0Var.c);
                sl0 sl0Var4 = tl0Var.a;
                boolean z14 = sl0Var4.t;
                org.telegram.ui.Components.g6 g6Var = sl0Var4.F;
                if (z14) {
                    g6Var.t(org.telegram.messenger.j6.m(rl0Var.c, g6Var.a.getFontMetricsInt(), false, null, 0), !z13, true);
                } else if (g6Var != null) {
                    g6Var.t("", !z13, true);
                }
                sl0 sl0Var5 = tl0Var.a;
                Integer.toString(rl0Var.b);
                sl0Var5.getClass();
                tl0Var.a.E.c(rl0Var.b, !z13);
                sl0 sl0Var6 = tl0Var.a;
                if (sl0Var6.E != null && (sl0Var6.v > 0 || sl0Var6.t)) {
                    sl0Var6.z = (int) (org.telegram.messenger.g0.L(tl0Var.a.t ? 4.0f : 0.0f) + ((int) Math.ceil(r3.m)) + tl0Var.a.F.d + sl0Var6.z);
                }
                if (z13) {
                    sl0 sl0Var7 = tl0Var.a;
                    sl0Var7.e = sl0Var7.z;
                }
                tl0Var.a.A = org.telegram.messenger.g0.L(28.0f);
                sl0 sl0Var8 = tl0Var.a;
                sl0Var8.o = tl0Var.e;
                if (tl0Var.r) {
                    sl0Var8.a();
                }
                if (!z13) {
                    tl0Var.requestLayout();
                }
                ((tl0) view2).a(rl0Var.a.h == ul0Var.h, false);
                return;
            case 5:
                t01 t01Var = (t01) e1Var.a;
                r01 r01Var = (r01) ((v01) obj).S.get(i7);
                t01Var.getClass();
                r01Var.getClass();
                throw null;
            case 6:
                return;
            case 7:
                jf0 jf0Var = (jf0) obj;
                ((if0) e1Var.a).a((TLObject) jf0Var.c.get(i7), ((Integer) jf0Var.b.get(i7)).intValue(), false);
                return;
            case 8:
                uh0 uh0Var = (uh0) obj;
                org.telegram.ui.ActionBar.e6 e6Var = uh0Var.f;
                int i13 = e1Var.f;
                View view3 = e1Var.a;
                if (i13 == 0) {
                    th0 th0Var = (th0) view3;
                    int i14 = uh0Var.E;
                    if (i7 >= i14 && i7 < uh0Var.F) {
                        sh0Var = (sh0) uh0Var.b.get(i7 - i14);
                    }
                    int i15 = uh0Var.n;
                    if (i7 >= i15 && i7 < uh0Var.r) {
                        sh0Var = (sh0) uh0Var.a.get(i7 - i15);
                    }
                    if (sh0Var != null) {
                        boolean z15 = th0Var.e == sh0Var;
                        boolean z16 = sh0Var == uh0Var.H;
                        boolean z17 = uh0Var.J.get(sh0Var.c) != null;
                        th0Var.e = sh0Var;
                        th0Var.a.setText(sh0Var.f);
                        th0Var.d = i7 != uh0Var.F - 1;
                        th0Var.b.a(z16, z15);
                        th0Var.c.a(z17, z15);
                        return;
                    }
                    return;
                }
                if (i13 == 1) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view3;
                    if (i7 == 0) {
                        n4Var.setText(hd.M0(2131744211, null));
                        return;
                    } else {
                        if (i7 == uh0Var.y) {
                            n4Var.setText(hd.M0(2131744289, null));
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
                int i16 = org.telegram.ui.ActionBar.j6.N6;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                org.telegram.ui.ActionBar.q6.x(i2Var, drawable, i16, e6Var, mode);
                org.telegram.ui.ActionBar.q6.x(i2Var, drawable2, org.telegram.ui.ActionBar.j6.k7, e6Var, mode);
                fq fqVar = new fq(drawable, drawable2);
                i2Var.a.l(hd.M0(2131743803, null), false);
                i2Var.b.setImageDrawable(fqVar);
                i2Var.c = false;
                return;
            case 9:
                ((nc1) e1Var.a).a = WallpapersListActivity.j0[i7];
                return;
            case 10:
                ug.i iVar = (ug.i) obj;
                ArrayList arrayList2 = iVar.d;
                if (((ug.g) arrayList2.get(i7)).a == 1) {
                    ug.h hVar = (ug.h) e1Var.a;
                    hVar.c.setColorFilter(new PorterDuffColorFilter(iVar.e.getPixel(i7, 0), PorterDuff.Mode.MULTIPLY));
                    hVar.c.setImageDrawable(iVar.getContext().getDrawable(((ug.g) arrayList2.get(i7)).b));
                    hVar.a.setText(((ug.g) arrayList2.get(i7)).c);
                    hVar.b.setText(((ug.g) arrayList2.get(i7)).d);
                    return;
                }
                return;
            default:
                View view4 = e1Var.a;
                ug.g1 g1Var = (ug.g1) obj;
                int i17 = g1Var.f2;
                if (i7 >= i17 && i7 < g1Var.g2) {
                    ((fs0) view4).a((ss0) g1Var.T1.get(i7 - i17), i7 != g1Var.g2 - 1);
                    return;
                } else {
                    if (i7 < g1Var.d2 || i7 >= g1Var.e2) {
                        return;
                    }
                    g1Var.g1(view4);
                    return;
                }
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
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
                org.telegram.ui.Components.ba baVar = new org.telegram.ui.Components.ba(((c6) obj).getContext());
                baVar.a = 0;
                return new cj0(baVar);
            case 1:
                jg.n0 n0Var = new jg.n0(viewGroup.getContext(), ((jg.q0) obj).o2);
                jg.p0 p0Var = new jg.p0(n0Var);
                p0Var.v = n0Var;
                n0Var.setLayoutParams(new v4.p0(-2, org.telegram.messenger.g0.L(30.0f)));
                return p0Var;
            case 2:
                return new cj0(((org.telegram.ui.Components.ca) obj).T1);
            case 3:
                if (i7 == 0) {
                    frameLayout = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
                } else if (i7 == 1) {
                    Context context = viewGroup.getContext();
                    fl0 fl0Var = new fl0(context);
                    org.telegram.ui.Cells.g7 g7Var = new org.telegram.ui.Cells.g7(2, context, null);
                    fl0Var.a = g7Var;
                    g7Var.r.setVisibility(8);
                    fl0Var.addView(g7Var);
                    frameLayout = fl0Var;
                } else {
                    frameLayout = new gl0(viewGroup.getContext());
                }
                frameLayout.setLayoutParams(new v4.p0(-1, -2));
                return new cj0(frameLayout);
            case 4:
                ul0 ul0Var = (ul0) obj;
                return new cj0(new tl0(ul0Var, ul0Var.getContext()));
            case 5:
                t01 t01Var = new t01((v01) obj, viewGroup.getContext());
                t01Var.setLayoutParams(new v4.p0(-2, -1));
                return new cj0(t01Var);
            case 6:
                yt ytVar = (yt) obj;
                if (i7 == 0) {
                    view = ytVar.Z1;
                } else if (i7 == 2) {
                    View view5 = ytVar.a2;
                    v4.p0 p0Var2 = new v4.p0(-1, -2);
                    int i13 = ytVar.u0;
                    ((ViewGroup.MarginLayoutParams) p0Var2).leftMargin = i13;
                    ((ViewGroup.MarginLayoutParams) p0Var2).rightMargin = i13;
                    view5.setLayoutParams(p0Var2);
                    view = view5;
                } else {
                    org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(viewGroup.getContext());
                    y8Var.setFixedSize(12);
                    int i14 = org.telegram.ui.ActionBar.j6.a7;
                    ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.j6.x0(null, i14, false));
                    org.telegram.ui.ActionBar.q6.x(y8Var, colorDrawable, i14, null, PorterDuff.Mode.SRC_IN);
                    fq fqVar = new fq(colorDrawable, org.telegram.ui.ActionBar.j6.Y0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
                    fqVar.x = true;
                    y8Var.setBackgroundDrawable(fqVar);
                    view = y8Var;
                }
                return new cj0(view);
            case 7:
                if0 if0Var = new if0(viewGroup.getContext());
                if0Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(50.0f)));
                return new cj0(if0Var);
            case 8:
                org.telegram.ui.ActionBar.e6 e6Var = ((uh0) obj).f;
                Context context2 = viewGroup.getContext();
                if (i7 == 0) {
                    th0 th0Var = new th0(context2);
                    RadioButton radioButton = new RadioButton(context2);
                    th0Var.b = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.q6.O(radioButton, org.telegram.ui.ActionBar.j6.g7, org.telegram.ui.ActionBar.j6.h7, e6Var);
                    boolean z10 = hd.a0;
                    th0Var.addView(radioButton, c8.ja.d(22, 22.0f, (z10 ? 5 : 3) | 16, z10 ? 0 : 20, 0.0f, z10 ? 20 : 0, 0.0f));
                    fp fpVar = new fp(24, context2, e6Var);
                    th0Var.c = fpVar;
                    int i15 = org.telegram.ui.ActionBar.j6.d6;
                    fpVar.b(-1, i15, org.telegram.ui.ActionBar.j6.k7);
                    fpVar.setDrawUnchecked(false);
                    fpVar.setDrawBackgroundAsArc(3);
                    boolean z11 = hd.a0;
                    th0Var.addView(fpVar, c8.ja.d(26, 26.0f, (z11 ? 5 : 3) | 16, z11 ? 0 : 18, 0.0f, z11 ? 18 : 0, 0.0f));
                    fpVar.a(true, false);
                    TextView textView = new TextView(context2);
                    th0Var.a = textView;
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, e6Var);
                    i20.p(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setGravity((hd.a0 ? 5 : 3) | 16);
                    boolean z12 = hd.a0;
                    th0Var.addView(textView, c8.ja.d(-2, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 23 : 61, 0.0f, z12 ? 61 : 23, 0.0f));
                    org.telegram.ui.ActionBar.q6.h(i15, th0Var, e6Var);
                    view2 = th0Var;
                } else if (i7 == 2) {
                    org.telegram.ui.Cells.i2 i2Var = new org.telegram.ui.Cells.i2(70, context2, e6Var);
                    i2Var.d = 61;
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, i2Var, e6Var);
                    view2 = i2Var;
                } else if (i7 != 3) {
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context2, e6Var);
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, n4Var, e6Var);
                    view2 = n4Var;
                } else {
                    view2 = new org.telegram.ui.Cells.x6(context2, (org.telegram.ui.Cells.y0) null);
                }
                return i5.c.q(view2, view2, -1, -2);
            case 9:
                rc1 rc1Var = (rc1) obj;
                return new cj0(new nc1(rc1Var.F, rc1Var.c));
            case 10:
                ug.i iVar = (ug.i) obj;
                org.telegram.ui.ActionBar.e6 e6Var2 = iVar.a;
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
                    hVar.addView(imageView, c8.ja.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context3);
                    hVar.a = textView2;
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.G6, e6Var2);
                    textView2.setTextSize(1, 14.0f);
                    hVar.addView(textView2, c8.ja.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    hVar.b = textView3;
                    org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.y6, e6Var2);
                    textView3.setTextSize(1, 14.0f);
                    hVar.addView(textView3, c8.ja.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view3 = hVar;
                }
                return i5.c.q(view3, view3, -1, -2);
            default:
                Context context4 = viewGroup.getContext();
                ug.g1 g1Var = (ug.g1) obj;
                View h12 = g1Var.h1(context4, i7);
                if (h12 != null) {
                    return i5.c.q(h12, h12, -1, -2);
                }
                if (i7 == 0) {
                    z51 z51Var = new z51(26, context4, this);
                    g1Var.o2 = z51Var;
                    z51Var.setOrientation(1);
                    View view6 = g1Var.x2;
                    if (view6 == null) {
                        g1Var.n2 = new xb(context4, 1, 0, 4);
                        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        int i16 = org.telegram.ui.ActionBar.j6.Dk;
                        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.j6.w0(i16, g1Var.J0), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.h5, g1Var.J0)));
                        g1Var.n2.setBackgroundBitmap(createBitmap);
                        vg.f fVar = g1Var.n2.b;
                        fVar.z = i16;
                        fVar.A = org.telegram.ui.ActionBar.j6.Ck;
                        fVar.b();
                        z51Var.addView(g1Var.n2, c8.ja.r(ns.q2, ns.q2, 1));
                    } else {
                        if (view6.getParent() != null) {
                            ((ViewGroup) g1Var.x2.getParent()).removeView(g1Var.x2);
                        }
                        g1Var.e1(z51Var);
                    }
                    if (g1Var.J2 == null) {
                        FrameLayout frameLayout2 = new FrameLayout(context4);
                        g1Var.J2 = frameLayout2;
                        frameLayout2.setClipChildren(false);
                        Integer num = g1Var.q2;
                        new PorterDuffColorFilter(num == null ? org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.v6, g1Var.J0) : num.intValue(), PorterDuff.Mode.SRC_IN);
                        g1Var.K2 = new z70[2];
                        int i17 = 0;
                        while (i17 < 2) {
                            g1Var.K2[i17] = new bi.w1(7, context4, g1Var.J0);
                            g1Var.K2[i17].setVisibility(i17 == 0 ? 0 : 8);
                            g1Var.K2[i17].setTextSize(1, 16.0f);
                            g1Var.K2[i17].setTypeface(org.telegram.messenger.g0.o());
                            g1Var.K2[i17].setGravity(1);
                            org.telegram.ui.ActionBar.q6.U(g1Var.K2[i17], org.telegram.ui.ActionBar.j6.G6, g1Var.J0);
                            org.telegram.ui.ActionBar.q6.G(g1Var.K2[i17], org.telegram.ui.ActionBar.j6.J6, g1Var.J0);
                            g1Var.J2.addView(g1Var.K2[i17], c8.ja.c(-2.0f, -1));
                            i17++;
                        }
                    }
                    if (g1Var.J2.getParent() != null) {
                        ((ViewGroup) g1Var.J2.getParent()).removeView(g1Var.J2);
                    }
                    z51Var.addView(g1Var.J2, c8.ja.q(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                    if (g1Var.L2 == null) {
                        z70 z70Var = new z70(g1Var.getContext(), g1Var.J0);
                        g1Var.L2 = z70Var;
                        z70Var.setTextSize(1, 14.0f);
                        g1Var.L2.setGravity(1);
                        org.telegram.ui.ActionBar.q6.U(g1Var.L2, org.telegram.ui.ActionBar.j6.G6, g1Var.J0);
                        org.telegram.ui.ActionBar.q6.G(g1Var.L2, org.telegram.ui.ActionBar.j6.J6, g1Var.J0);
                    }
                    if (g1Var.L2.getParent() != null) {
                        ((ViewGroup) g1Var.L2.getParent()).removeView(g1Var.L2);
                    }
                    z51Var.addView(g1Var.L2, c8.ja.q(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                    g1Var.j1(false);
                    g1Var.m2 = new ki.f(context4, 5);
                    m01 m01Var = new m01(13, context4, this);
                    m01Var.setClipChildren(false);
                    m01Var.addView(g1Var.m2);
                    m01Var.addView(z51Var);
                    xb xbVar = g1Var.n2;
                    view4 = m01Var;
                    if (xbVar != null) {
                        xbVar.setStarParticlesView(g1Var.m2);
                        view4 = m01Var;
                    }
                } else if (i7 == 2) {
                    int i18 = org.telegram.ui.ActionBar.j6.a7;
                    org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context4, org.telegram.ui.ActionBar.j6.w0(i18, g1Var.J0), 0);
                    org.telegram.ui.ActionBar.q6.h(i18, x6Var, g1Var.J0);
                    view4 = x6Var;
                } else if (i7 == 3) {
                    view4 = new zh.f(context4, i12);
                } else if (i7 == 4) {
                    view4 = new ai.r2(context4);
                } else if (i7 != 5) {
                    view4 = new ls0(this, context4, g1Var.J0);
                } else {
                    yg.d0 d0Var = new yg.d0(context4, g1Var.J0);
                    d0Var.setBackground(true);
                    String M0 = hd.M0(2131749662, "GiftPremiumPrivacyPolicyAndTerms");
                    int i19 = org.telegram.ui.ActionBar.j6.Xc;
                    d0Var.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.S2(M0, i19, 0, new Runnable(this) { // from class: ug.f1
                        public final /* synthetic */ i4 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i20 = i11;
                            i4 i4Var = this.b;
                            switch (i20) {
                                case 0:
                                    vf.c.t(((g1) i4Var.d).p2.getParentActivity(), hd.M0(2131744196, null));
                                    break;
                                default:
                                    vf.c.t(((g1) i4Var.d).p2.getParentActivity(), hd.M0(2131746781, null));
                                    break;
                            }
                        }
                    }, null), org.telegram.messenger.g0.S2(hd.M0(2131749663, "GiftPremiumPrivacyPolicy"), i19, 0, new Runnable(this) { // from class: ug.f1
                        public final /* synthetic */ i4 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i20 = i12;
                            i4 i4Var = this.b;
                            switch (i20) {
                                case 0:
                                    vf.c.t(((g1) i4Var.d).p2.getParentActivity(), hd.M0(2131744196, null));
                                    break;
                                default:
                                    vf.c.t(((g1) i4Var.d).p2.getParentActivity(), hd.M0(2131746781, null));
                                    break;
                            }
                        }
                    }, null), "%1$s"));
                    view4 = d0Var;
                }
                view4.setLayoutParams(new v4.p0(-1, -2));
                g1Var.d1(i7, view4);
                return new cj0(view4);
        }
    }

    @Override // v4.h0
    public void y(v4.e1 e1Var) {
        switch (this.c) {
            case 4:
                ul0 ul0Var = (ul0) this.d;
                ArrayList arrayList = ul0Var.r;
                int b10 = e1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((tl0) e1Var.a).a(((rl0) arrayList.get(b10)).a.h == ul0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void F(v4.e1 e1Var, int i7) {
    }

    private final void G(v4.e1 e1Var, int i7) {
    }
}
