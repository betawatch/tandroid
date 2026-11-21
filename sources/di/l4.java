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
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.y01;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.au;
import org.telegram.ui.d61;
import org.telegram.ui.js0;
import org.telegram.ui.lf0;
import org.telegram.ui.mf0;
import org.telegram.ui.ps0;
import org.telegram.ui.qc1;
import org.telegram.ui.uc1;
import org.telegram.ui.vz;
import org.telegram.ui.wh0;
import org.telegram.ui.ws0;
import org.telegram.ui.xh0;
import org.telegram.ui.yh0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                return ((h11) this.d).U.size();
            case 6:
                return ((au) this.d).c2.h() ? 1 : 3;
            case 7:
                return ((mf0) this.d).c.size();
            case 8:
                return ((yh0) this.d).h;
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
        wh0 wh0Var;
        switch (this.c) {
            case 8:
                yh0 yh0Var = (yh0) this.d;
                int i10 = yh0Var.E;
                if (i7 < i10 || i7 >= yh0Var.F) {
                    int i11 = yh0Var.n;
                    wh0Var = (i7 < i11 || i7 >= yh0Var.r) ? null : (wh0) yh0Var.a.get(i7 - i11);
                } else {
                    wh0Var = (wh0) yh0Var.b.get(i7 - i10);
                }
                if (wh0Var != null) {
                    return wh0Var.c;
                }
                yh0Var.getClass();
                if (i7 == 0) {
                    return 1L;
                }
                if (i7 == yh0Var.y) {
                    return 2L;
                }
                if (i7 == yh0Var.s) {
                    return 3L;
                }
                if (i7 == yh0Var.w) {
                    return 4L;
                }
                if (i7 == yh0Var.x) {
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
                yh0 yh0Var = (yh0) this.d;
                if (i7 >= yh0Var.E && i7 < yh0Var.F) {
                    return 0;
                }
                yh0Var.getClass();
                if (i7 == 0 || i7 == yh0Var.y) {
                    return 1;
                }
                if (i7 == yh0Var.s) {
                    return 2;
                }
                return (i7 == yh0Var.w || i7 == yh0Var.x) ? 3 : 0;
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
        wh0 wh0Var = null;
        Object obj = this.d;
        switch (i10) {
            case 0:
                int[] iArr = ((f6) obj).O2;
                int length = (iArr.length - 1) - i7;
                org.telegram.ui.Components.ja jaVar = (org.telegram.ui.Components.ja) f1Var.a;
                int i11 = iArr[length];
                if (jaVar.a != i11) {
                    jaVar.a = i11;
                    jaVar.requestLayout();
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
                vz vzVar = sl0Var.K;
                int i12 = f1Var.f;
                View view = f1Var.a;
                if (i12 != 0) {
                    fj E = E(i7);
                    if (E != null) {
                        boolean z11 = sl0Var.J.V1() && i7 >= sl0Var.w && i7 < sl0Var.x;
                        if (i12 != 1) {
                            if (i12 == 2) {
                                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                                int e12 = h7Var.getMessage() == null ? 0 : h7Var.getMessage().e1();
                                h7Var.f(E, true);
                                int e13 = h7Var.getMessage().e1();
                                vzVar.a = fj.B0(h7Var.getMessage().k);
                                vzVar.b = e13;
                                h7Var.e(sl0Var.J.r0(vzVar), e12 == E.e1());
                                z10 = e12 == E.e1();
                                if (h7Var.e0 != z11) {
                                    h7Var.e0 = z11;
                                    if (!z10) {
                                        h7Var.f0 = z11 ? 1.0f : 0.0f;
                                    }
                                    h7Var.invalidate();
                                    break;
                                }
                            }
                        } else {
                            pl0 pl0Var = (pl0) view;
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, pl0Var, null);
                            org.telegram.ui.Cells.i7 i7Var = pl0Var.a;
                            int e14 = i7Var.getMessage() == null ? 0 : i7Var.getMessage().e1();
                            i7Var.c(E, true);
                            int e15 = i7Var.getMessage().e1();
                            vzVar.a = fj.B0(i7Var.getMessage().k);
                            vzVar.b = e15;
                            i7Var.b(sl0Var.J.r0(vzVar), e14 == E.e1());
                            z10 = e14 == E.e1();
                            if (i7Var.P != z11) {
                                i7Var.P = z11;
                                if (!z10) {
                                    i7Var.Q = z11 ? 1.0f : 0.0f;
                                }
                                i7Var.invalidate();
                                break;
                            }
                        }
                    }
                } else {
                    org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
                    if (i7 != sl0Var.s) {
                        if (i7 == sl0Var.y) {
                            y3Var.b(gd.N0(2131746166, null), gd.N0(2131745299, null), new j70(this, 10));
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
                    org.telegram.ui.Components.n6 n6Var = cm0Var4.F;
                    if (z14) {
                        n6Var.t(org.telegram.messenger.j6.m(bm0Var.c, n6Var.a.getFontMetricsInt(), false, null, 0), !z13, true);
                    } else if (n6Var != null) {
                        n6Var.t("", !z13, true);
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
                f11 f11Var = (f11) f1Var.a;
                e11 e11Var = (e11) ((h11) obj).U.get(i7);
                h11 h11Var = f11Var.s;
                org.telegram.ui.Components.q9 q9Var = f11Var.a;
                e11 e11Var2 = f11Var.e;
                boolean z15 = e11Var2 != null && e11Var2.a == e11Var.a && Objects.equals(e11Var2.b, e11Var.b);
                if (h11Var.a0 >= 1.0f && h11Var.k0 == null) {
                    f11Var.setScaleX(1.0f);
                    f11Var.setScaleY(1.0f);
                    f11Var.setAlpha(1.0f);
                }
                f11Var.e = e11Var;
                if (!z15) {
                    q9Var.setAnimatedEmojiDrawable(null);
                    f11Var.h = null;
                    f11Var.n = 0;
                    if (e11Var.a != 0) {
                        f11Var.f = null;
                        q9Var.setVisibility(0);
                        org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(3, h11Var.a, e11Var.a);
                        f11Var.h = p5Var;
                        q9Var.setAnimatedEmojiDrawable(p5Var);
                    } else {
                        f11Var.f = gd.N0(e11Var.b.booleanValue() ? 2131743748 : 2131743747, null);
                        q9Var.setVisibility(8);
                    }
                    f11Var.setContentDescription(f11Var.f);
                }
                f11Var.a(z15);
                f11Var.requestLayout();
                f11Var.invalidate();
                break;
            case 6:
                break;
            case 7:
                mf0 mf0Var = (mf0) obj;
                ((lf0) f1Var.a).a((TLObject) mf0Var.c.get(i7), ((Integer) mf0Var.b.get(i7)).intValue(), false);
                break;
            case 8:
                yh0 yh0Var = (yh0) obj;
                org.telegram.ui.ActionBar.h6 h6Var = yh0Var.f;
                int i13 = f1Var.f;
                View view3 = f1Var.a;
                if (i13 == 0) {
                    xh0 xh0Var = (xh0) view3;
                    int i14 = yh0Var.E;
                    if (i7 >= i14 && i7 < yh0Var.F) {
                        wh0Var = (wh0) yh0Var.b.get(i7 - i14);
                    }
                    int i15 = yh0Var.n;
                    if (i7 >= i15 && i7 < yh0Var.r) {
                        wh0Var = (wh0) yh0Var.a.get(i7 - i15);
                    }
                    if (wh0Var != null) {
                        boolean z16 = xh0Var.e == wh0Var;
                        boolean z17 = wh0Var == yh0Var.H;
                        boolean z18 = yh0Var.J.get(wh0Var.c) != null;
                        xh0Var.e = wh0Var;
                        xh0Var.a.setText(wh0Var.f);
                        xh0Var.d = i7 != yh0Var.F - 1;
                        xh0Var.b.a(z17, z16);
                        xh0Var.c.a(z18, z16);
                        break;
                    }
                } else if (i13 == 1) {
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view3;
                    if (i7 != 0) {
                        if (i7 == yh0Var.y) {
                            o4Var.setText(gd.N0(2131744048, null));
                            break;
                        }
                    } else {
                        o4Var.setText(gd.N0(2131743970, null));
                        break;
                    }
                } else if (i13 == 2) {
                    org.telegram.ui.Cells.j2 j2Var = (org.telegram.ui.Cells.j2) view3;
                    Drawable drawable = j2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable2 = j2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                    int i16 = org.telegram.ui.ActionBar.m6.N6;
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    org.telegram.ui.ActionBar.t6.x(j2Var, drawable, i16, h6Var, mode);
                    org.telegram.ui.ActionBar.t6.x(j2Var, drawable2, org.telegram.ui.ActionBar.m6.k7, h6Var, mode);
                    oq oqVar = new oq(drawable, drawable2);
                    j2Var.a.l(gd.N0(2131743560, null), false);
                    j2Var.b.setImageDrawable(oqVar);
                    j2Var.c = false;
                    break;
                }
                break;
            case 9:
                ((qc1) f1Var.a).a = WallpapersListActivity.j0[i7];
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
                    ((js0) view4).a((ws0) h1Var.T1.get(i7 - i17), i7 != h1Var.g2 - 1);
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
                org.telegram.ui.Components.ja jaVar = new org.telegram.ui.Components.ja(((f6) obj).getContext());
                jaVar.a = 0;
                return new mj0(jaVar);
            case 1:
                jg.n0 n0Var = new jg.n0(viewGroup.getContext(), ((jg.q0) obj).o2);
                jg.p0 p0Var = new jg.p0(n0Var);
                p0Var.v = n0Var;
                n0Var.setLayoutParams(new v4.q0(-2, org.telegram.messenger.g0.L(30.0f)));
                return p0Var;
            case 2:
                return new mj0(((org.telegram.ui.Components.ka) obj).T1);
            case 3:
                if (i7 == 0) {
                    frameLayout = new org.telegram.ui.Cells.y3(viewGroup.getContext(), null);
                } else if (i7 == 1) {
                    Context context = viewGroup.getContext();
                    pl0 pl0Var = new pl0(context);
                    org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(2, context, null);
                    pl0Var.a = i7Var;
                    i7Var.r.setVisibility(8);
                    pl0Var.addView(i7Var);
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
                f11 f11Var = new f11((h11) obj, viewGroup.getContext());
                f11Var.setLayoutParams(new v4.q0(-2, -1));
                return new mj0(f11Var);
            case 6:
                au auVar = (au) obj;
                if (i7 == 0) {
                    view = auVar.Z1;
                } else if (i7 == 2) {
                    View view5 = auVar.a2;
                    v4.q0 q0Var = new v4.q0(-1, -2);
                    int i13 = auVar.u0;
                    ((ViewGroup.MarginLayoutParams) q0Var).leftMargin = i13;
                    ((ViewGroup.MarginLayoutParams) q0Var).rightMargin = i13;
                    view5.setLayoutParams(q0Var);
                    view = view5;
                } else {
                    org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(viewGroup.getContext());
                    a9Var.setFixedSize(12);
                    int i14 = org.telegram.ui.ActionBar.m6.a7;
                    ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.m6.x0(null, i14, false));
                    org.telegram.ui.ActionBar.t6.x(a9Var, colorDrawable, i14, null, PorterDuff.Mode.SRC_IN);
                    oq oqVar = new oq(colorDrawable, org.telegram.ui.ActionBar.m6.Y0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.m6.b7));
                    oqVar.x = true;
                    a9Var.setBackgroundDrawable(oqVar);
                    view = a9Var;
                }
                return new mj0(view);
            case 7:
                lf0 lf0Var = new lf0(viewGroup.getContext());
                lf0Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(50.0f)));
                return new mj0(lf0Var);
            case 8:
                org.telegram.ui.ActionBar.h6 h6Var = ((yh0) obj).f;
                Context context2 = viewGroup.getContext();
                if (i7 == 0) {
                    xh0 xh0Var = new xh0(context2);
                    RadioButton radioButton = new RadioButton(context2);
                    xh0Var.b = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.t6.O(radioButton, org.telegram.ui.ActionBar.m6.g7, org.telegram.ui.ActionBar.m6.h7, h6Var);
                    boolean z10 = gd.a0;
                    xh0Var.addView(radioButton, c8.ma.d(22, 22.0f, (z10 ? 5 : 3) | 16, z10 ? 0 : 20, 0.0f, z10 ? 20 : 0, 0.0f));
                    op opVar = new op(24, context2, h6Var);
                    xh0Var.c = opVar;
                    int i15 = org.telegram.ui.ActionBar.m6.d6;
                    opVar.b(-1, i15, org.telegram.ui.ActionBar.m6.k7);
                    opVar.setDrawUnchecked(false);
                    opVar.setDrawBackgroundAsArc(3);
                    boolean z11 = gd.a0;
                    xh0Var.addView(opVar, c8.ma.d(26, 26.0f, (z11 ? 5 : 3) | 16, z11 ? 0 : 18, 0.0f, z11 ? 18 : 0, 0.0f));
                    opVar.a(true, false);
                    TextView textView = new TextView(context2);
                    xh0Var.a = textView;
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
                    n10.q(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setGravity((gd.a0 ? 5 : 3) | 16);
                    boolean z12 = gd.a0;
                    xh0Var.addView(textView, c8.ma.d(-2, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 23 : 61, 0.0f, z12 ? 61 : 23, 0.0f));
                    org.telegram.ui.ActionBar.t6.h(i15, xh0Var, h6Var);
                    view2 = xh0Var;
                } else if (i7 == 2) {
                    org.telegram.ui.Cells.j2 j2Var = new org.telegram.ui.Cells.j2(70, context2, h6Var);
                    j2Var.d = 61;
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, j2Var, h6Var);
                    view2 = j2Var;
                } else if (i7 != 3) {
                    org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context2, h6Var);
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, o4Var, h6Var);
                    view2 = o4Var;
                } else {
                    view2 = new org.telegram.ui.Cells.z6(context2, (org.telegram.ui.Cells.c0) null);
                }
                return i5.c.q(view2, view2, -1, -2);
            case 9:
                uc1 uc1Var = (uc1) obj;
                return new mj0(new qc1(uc1Var.F, uc1Var.c));
            case 10:
                ug.i iVar = (ug.i) obj;
                org.telegram.ui.ActionBar.h6 h6Var2 = iVar.a;
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
                    hVar.addView(imageView, c8.ma.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context3);
                    hVar.a = textView2;
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.G6, h6Var2);
                    textView2.setTextSize(1, 14.0f);
                    hVar.addView(textView2, c8.ma.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    hVar.b = textView3;
                    org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.y6, h6Var2);
                    textView3.setTextSize(1, 14.0f);
                    hVar.addView(textView3, c8.ma.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
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
                    d61 d61Var = new d61(25, context4, this);
                    h1Var.o2 = d61Var;
                    d61Var.setOrientation(1);
                    View view6 = h1Var.x2;
                    if (view6 == null) {
                        h1Var.n2 = new bc(context4, 1, 0, 4);
                        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        int i17 = org.telegram.ui.ActionBar.m6.Dk;
                        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.m6.w0(i17, h1Var.J0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, h1Var.J0)));
                        h1Var.n2.setBackgroundBitmap(createBitmap);
                        vg.f fVar = h1Var.n2.b;
                        fVar.z = i17;
                        fVar.A = org.telegram.ui.ActionBar.m6.Ck;
                        fVar.b();
                        d61Var.addView(h1Var.n2, c8.ma.r(ks.q2, ks.q2, 1));
                    } else {
                        if (view6.getParent() != null) {
                            ((ViewGroup) h1Var.x2.getParent()).removeView(h1Var.x2);
                        }
                        h1Var.f1(d61Var);
                    }
                    if (h1Var.J2 == null) {
                        FrameLayout frameLayout2 = new FrameLayout(context4);
                        h1Var.J2 = frameLayout2;
                        frameLayout2.setClipChildren(false);
                        Integer num = h1Var.q2;
                        new PorterDuffColorFilter(num == null ? org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.v6, h1Var.J0) : num.intValue(), PorterDuff.Mode.SRC_IN);
                        h1Var.K2 = new m80[2];
                        int i18 = 0;
                        while (i18 < 2) {
                            h1Var.K2[i18] = new bi.u2(7, context4, h1Var.J0);
                            h1Var.K2[i18].setVisibility(i18 == 0 ? 0 : 8);
                            h1Var.K2[i18].setTextSize(1, 16.0f);
                            h1Var.K2[i18].setTypeface(org.telegram.messenger.g0.o());
                            h1Var.K2[i18].setGravity(1);
                            org.telegram.ui.ActionBar.t6.U(h1Var.K2[i18], org.telegram.ui.ActionBar.m6.G6, h1Var.J0);
                            org.telegram.ui.ActionBar.t6.G(h1Var.K2[i18], org.telegram.ui.ActionBar.m6.J6, h1Var.J0);
                            h1Var.J2.addView(h1Var.K2[i18], c8.ma.c(-2.0f, -1));
                            i18++;
                        }
                    }
                    if (h1Var.J2.getParent() != null) {
                        ((ViewGroup) h1Var.J2.getParent()).removeView(h1Var.J2);
                    }
                    d61Var.addView(h1Var.J2, c8.ma.q(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                    if (h1Var.L2 == null) {
                        m80 m80Var = new m80(h1Var.getContext(), h1Var.J0);
                        h1Var.L2 = m80Var;
                        m80Var.setTextSize(1, 14.0f);
                        h1Var.L2.setGravity(1);
                        org.telegram.ui.ActionBar.t6.U(h1Var.L2, org.telegram.ui.ActionBar.m6.G6, h1Var.J0);
                        org.telegram.ui.ActionBar.t6.G(h1Var.L2, org.telegram.ui.ActionBar.m6.J6, h1Var.J0);
                    }
                    if (h1Var.L2.getParent() != null) {
                        ((ViewGroup) h1Var.L2.getParent()).removeView(h1Var.L2);
                    }
                    d61Var.addView(h1Var.L2, c8.ma.q(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                    h1Var.k1(false);
                    h1Var.m2 = new ki.e(context4, 5);
                    y01 y01Var = new y01(12, context4, this);
                    y01Var.setClipChildren(false);
                    y01Var.addView(h1Var.m2);
                    y01Var.addView(d61Var);
                    bc bcVar = h1Var.n2;
                    view4 = y01Var;
                    if (bcVar != null) {
                        bcVar.setStarParticlesView(h1Var.m2);
                        view4 = y01Var;
                    }
                } else if (i7 == 2) {
                    int i19 = org.telegram.ui.ActionBar.m6.a7;
                    org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context4, org.telegram.ui.ActionBar.m6.w0(i19, h1Var.J0), 0);
                    org.telegram.ui.ActionBar.t6.h(i19, z6Var, h1Var.J0);
                    view4 = z6Var;
                } else if (i7 == 3) {
                    view4 = new zh.f(context4, i12);
                } else if (i7 == 4) {
                    view4 = new ai.t2(context4);
                } else if (i7 != 5) {
                    view4 = new ps0(this, context4, h1Var.J0);
                } else {
                    yg.d0 d0Var = new yg.d0(context4, h1Var.J0);
                    d0Var.setBackground(true);
                    String N0 = gd.N0(2131749489, "GiftPremiumPrivacyPolicyAndTerms");
                    int i20 = org.telegram.ui.ActionBar.m6.Xc;
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
                                    vf.c.t(((h1) l4Var.d).p2.getParentActivity(), gd.N0(2131743955, null));
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
                                    vf.c.t(((h1) l4Var.d).p2.getParentActivity(), gd.N0(2131743955, null));
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
