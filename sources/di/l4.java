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
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.au;
import org.telegram.ui.d61;
import org.telegram.ui.js0;
import org.telegram.ui.lf0;
import org.telegram.ui.mf0;
import org.telegram.ui.ps0;
import org.telegram.ui.qc1;
import org.telegram.ui.uc1;
import org.telegram.ui.vh0;
import org.telegram.ui.vz;
import org.telegram.ui.wh0;
import org.telegram.ui.ws0;
import org.telegram.ui.xh0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class l4 extends bk0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l4(Object obj, int i7) {
        this.c = i7;
        this.d = obj;
    }

    @Override // org.telegram.ui.Components.bk0
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
        ql0 ql0Var = (ql0) this.d;
        int i10 = ql0Var.w;
        if (i7 >= i10 && i7 < ql0Var.x) {
            return (fj) ql0Var.e.get(i7 - i10);
        }
        int i11 = ql0Var.E;
        if (i7 < i11 || i7 >= ql0Var.F) {
            return null;
        }
        return (fj) ql0Var.f.get(i7 - i11);
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
                return ((ql0) this.d).r;
            case 4:
                return ((cm0) this.d).r.size();
            case 5:
                return ((f11) this.d).U.size();
            case 6:
                return ((au) this.d).c2.h() ? 1 : 3;
            case 7:
                return ((mf0) this.d).c.size();
            case 8:
                return ((xh0) this.d).h;
            case 9:
                return 12;
            case 10:
                return ((ug.i) this.d).d.size();
            default:
                return ((ug.i1) this.d).b2;
        }
    }

    @Override // v4.i0
    public long c(int i7) {
        vh0 vh0Var;
        switch (this.c) {
            case 8:
                xh0 xh0Var = (xh0) this.d;
                int i10 = xh0Var.E;
                if (i7 < i10 || i7 >= xh0Var.F) {
                    int i11 = xh0Var.n;
                    vh0Var = (i7 < i11 || i7 >= xh0Var.r) ? null : (vh0) xh0Var.a.get(i7 - i11);
                } else {
                    vh0Var = (vh0) xh0Var.b.get(i7 - i10);
                }
                if (vh0Var != null) {
                    return vh0Var.c;
                }
                xh0Var.getClass();
                if (i7 == 0) {
                    return 1L;
                }
                if (i7 == xh0Var.y) {
                    return 2L;
                }
                if (i7 == xh0Var.s) {
                    return 3L;
                }
                if (i7 == xh0Var.w) {
                    return 4L;
                }
                if (i7 == xh0Var.x) {
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
                ql0 ql0Var = (ql0) this.d;
                if (i7 == ql0Var.s || i7 == ql0Var.y) {
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
                xh0 xh0Var = (xh0) this.d;
                if (i7 >= xh0Var.E && i7 < xh0Var.F) {
                    return 0;
                }
                xh0Var.getClass();
                if (i7 == 0 || i7 == xh0Var.y) {
                    return 1;
                }
                if (i7 == xh0Var.s) {
                    return 2;
                }
                return (i7 == xh0Var.w || i7 == xh0Var.x) ? 3 : 0;
            case 10:
                return ((ug.g) ((ug.i) this.d).d.get(i7)).a;
            case 11:
                ug.i1 i1Var = (ug.i1) this.d;
                if (i7 != i1Var.c2) {
                    if (i7 >= i1Var.d2 && i7 < i1Var.e2) {
                        return i1Var.g1();
                    }
                    if (i7 >= i1Var.f2 && i7 < i1Var.g2) {
                        return 1;
                    }
                    if (i7 == i1Var.h2) {
                        return 2;
                    }
                    if (i7 == i1Var.i2) {
                        return 3;
                    }
                    if (i7 == 0) {
                        return 4;
                    }
                    if (i7 == i1Var.j2) {
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
        vh0 vh0Var = null;
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
                ql0 ql0Var = (ql0) obj;
                vz vzVar = ql0Var.K;
                int i12 = f1Var.f;
                View view = f1Var.a;
                if (i12 != 0) {
                    fj E = E(i7);
                    if (E != null) {
                        boolean z11 = ql0Var.J.V1() && i7 >= ql0Var.w && i7 < ql0Var.x;
                        if (i12 != 1) {
                            if (i12 == 2) {
                                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                                int e12 = g7Var.getMessage() == null ? 0 : g7Var.getMessage().e1();
                                g7Var.f(E, true);
                                int e13 = g7Var.getMessage().e1();
                                vzVar.a = fj.B0(g7Var.getMessage().k);
                                vzVar.b = e13;
                                g7Var.e(ql0Var.J.r0(vzVar), e12 == E.e1());
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
                            nl0 nl0Var = (nl0) view;
                            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, nl0Var, null);
                            org.telegram.ui.Cells.h7 h7Var = nl0Var.a;
                            int e14 = h7Var.getMessage() == null ? 0 : h7Var.getMessage().e1();
                            h7Var.c(E, true);
                            int e15 = h7Var.getMessage().e1();
                            vzVar.a = fj.B0(h7Var.getMessage().k);
                            vzVar.b = e15;
                            h7Var.b(ql0Var.J.r0(vzVar), e14 == E.e1());
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
                    org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
                    if (i7 != ql0Var.s) {
                        if (i7 == ql0Var.y) {
                            x3Var.b(gd.M0(2131746167, null), gd.M0(2131745300, null), new h70(this, 9));
                            break;
                        }
                    } else {
                        String M0 = gd.M0(2131751333, null);
                        if (!x3Var.getText().equals(M0)) {
                            x3Var.b(M0, ql0Var.I ? gd.M0(2131747240, null) : gd.M0(2131745858, null), new pl0(this));
                            break;
                        } else {
                            String M02 = ql0Var.I ? gd.M0(2131747240, null) : gd.M0(2131745858, null);
                            boolean z12 = ql0Var.I;
                            org.telegram.ui.Cells.w3 w3Var = x3Var.b;
                            w3Var.c(M02, true, z12);
                            w3Var.setVisibility(0);
                            break;
                        }
                    }
                }
                break;
            case 4:
                View view2 = f1Var.a;
                cm0 cm0Var = (cm0) obj;
                ArrayList arrayList = cm0Var.r;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    zl0 zl0Var = (zl0) arrayList.get(i7);
                    bm0 bm0Var = (bm0) view2;
                    ch.p0 p0Var = bm0Var.d;
                    boolean z13 = p0Var == null || !p0Var.equals(zl0Var.a);
                    if (z13) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = zl0Var.a.g();
                        tL_reactionCount.count = zl0Var.b;
                        cm0 cm0Var2 = bm0Var.s;
                        am0 am0Var = new am0(bm0Var, cm0Var2.a, bm0Var, tL_reactionCount, cm0Var2.c);
                        bm0Var.a = am0Var;
                        am0Var.E.d(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(100.0f));
                        am0 am0Var2 = bm0Var.a;
                        am0Var2.p = true;
                        am0Var2.R = true;
                    } else {
                        bm0Var.a.v = zl0Var.b;
                    }
                    bm0Var.d = zl0Var.a;
                    if (!z13) {
                        am0 am0Var3 = bm0Var.a;
                        am0Var3.e = am0Var3.z;
                    }
                    bm0Var.a.z = org.telegram.messenger.g0.L(44.33f);
                    bm0Var.a.t = !TextUtils.isEmpty(zl0Var.c);
                    am0 am0Var4 = bm0Var.a;
                    boolean z14 = am0Var4.t;
                    org.telegram.ui.Components.m6 m6Var = am0Var4.F;
                    if (z14) {
                        m6Var.t(org.telegram.messenger.j6.m(zl0Var.c, m6Var.a.getFontMetricsInt(), false, null, 0), !z13, true);
                    } else if (m6Var != null) {
                        m6Var.t("", !z13, true);
                    }
                    am0 am0Var5 = bm0Var.a;
                    Integer.toString(zl0Var.b);
                    am0Var5.getClass();
                    bm0Var.a.E.c(zl0Var.b, !z13);
                    am0 am0Var6 = bm0Var.a;
                    if (am0Var6.E != null && (am0Var6.v > 0 || am0Var6.t)) {
                        am0Var6.z = (int) (org.telegram.messenger.g0.L(bm0Var.a.t ? 4.0f : 0.0f) + ((int) Math.ceil(r6.m)) + bm0Var.a.F.d + am0Var6.z);
                    }
                    if (z13) {
                        am0 am0Var7 = bm0Var.a;
                        am0Var7.e = am0Var7.z;
                    }
                    bm0Var.a.A = org.telegram.messenger.g0.L(28.0f);
                    am0 am0Var8 = bm0Var.a;
                    am0Var8.o = bm0Var.e;
                    if (bm0Var.r) {
                        am0Var8.a();
                    }
                    if (!z13) {
                        bm0Var.requestLayout();
                    }
                    ((bm0) view2).a(zl0Var.a.h == cm0Var.h, false);
                    break;
                }
                break;
            case 5:
                d11 d11Var = (d11) f1Var.a;
                c11 c11Var = (c11) ((f11) obj).U.get(i7);
                f11 f11Var = d11Var.s;
                org.telegram.ui.Components.q9 q9Var = d11Var.a;
                c11 c11Var2 = d11Var.e;
                boolean z15 = c11Var2 != null && c11Var2.a == c11Var.a && Objects.equals(c11Var2.b, c11Var.b);
                if (f11Var.a0 >= 1.0f && f11Var.k0 == null) {
                    d11Var.setScaleX(1.0f);
                    d11Var.setScaleY(1.0f);
                    d11Var.setAlpha(1.0f);
                }
                d11Var.e = c11Var;
                if (!z15) {
                    q9Var.setAnimatedEmojiDrawable(null);
                    d11Var.h = null;
                    d11Var.n = 0;
                    if (c11Var.a != 0) {
                        d11Var.f = null;
                        q9Var.setVisibility(0);
                        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(3, f11Var.a, c11Var.a);
                        d11Var.h = o5Var;
                        q9Var.setAnimatedEmojiDrawable(o5Var);
                    } else {
                        d11Var.f = gd.M0(c11Var.b.booleanValue() ? 2131743754 : 2131743753, null);
                        q9Var.setVisibility(8);
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
                mf0 mf0Var = (mf0) obj;
                ((lf0) f1Var.a).a((TLObject) mf0Var.c.get(i7), ((Integer) mf0Var.b.get(i7)).intValue(), false);
                break;
            case 8:
                xh0 xh0Var = (xh0) obj;
                org.telegram.ui.ActionBar.i6 i6Var = xh0Var.f;
                int i13 = f1Var.f;
                View view3 = f1Var.a;
                if (i13 == 0) {
                    wh0 wh0Var = (wh0) view3;
                    int i14 = xh0Var.E;
                    if (i7 >= i14 && i7 < xh0Var.F) {
                        vh0Var = (vh0) xh0Var.b.get(i7 - i14);
                    }
                    int i15 = xh0Var.n;
                    if (i7 >= i15 && i7 < xh0Var.r) {
                        vh0Var = (vh0) xh0Var.a.get(i7 - i15);
                    }
                    if (vh0Var != null) {
                        boolean z16 = wh0Var.e == vh0Var;
                        boolean z17 = vh0Var == xh0Var.H;
                        boolean z18 = xh0Var.J.get(vh0Var.c) != null;
                        wh0Var.e = vh0Var;
                        wh0Var.a.setText(vh0Var.f);
                        wh0Var.d = i7 != xh0Var.F - 1;
                        wh0Var.b.a(z17, z16);
                        wh0Var.c.a(z18, z16);
                        break;
                    }
                } else if (i13 == 1) {
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view3;
                    if (i7 != 0) {
                        if (i7 == xh0Var.y) {
                            n4Var.setText(gd.M0(2131744054, null));
                            break;
                        }
                    } else {
                        n4Var.setText(gd.M0(2131743976, null));
                        break;
                    }
                } else if (i13 == 2) {
                    org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view3;
                    Drawable drawable = i2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable2 = i2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                    int i16 = org.telegram.ui.ActionBar.n6.N6;
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    org.telegram.ui.ActionBar.u6.x(i2Var, drawable, i16, i6Var, mode);
                    org.telegram.ui.ActionBar.u6.x(i2Var, drawable2, org.telegram.ui.ActionBar.n6.k7, i6Var, mode);
                    mq mqVar = new mq(drawable, drawable2);
                    i2Var.a.l(gd.M0(2131743566, null), false);
                    i2Var.b.setImageDrawable(mqVar);
                    i2Var.c = false;
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
                ug.i1 i1Var = (ug.i1) obj;
                int i17 = i1Var.f2;
                if (i7 >= i17 && i7 < i1Var.g2) {
                    ((js0) view4).a((ws0) i1Var.T1.get(i7 - i17), i7 != i1Var.g2 - 1);
                    break;
                } else if (i7 >= i1Var.d2 && i7 < i1Var.e2) {
                    i1Var.h1(view4);
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
                return new kj0(jaVar);
            case 1:
                jg.n0 n0Var = new jg.n0(viewGroup.getContext(), ((jg.q0) obj).o2);
                jg.p0 p0Var = new jg.p0(n0Var);
                p0Var.v = n0Var;
                n0Var.setLayoutParams(new v4.q0(-2, org.telegram.messenger.g0.L(30.0f)));
                return p0Var;
            case 2:
                return new kj0(((org.telegram.ui.Components.ka) obj).T1);
            case 3:
                if (i7 == 0) {
                    frameLayout = new org.telegram.ui.Cells.x3(viewGroup.getContext(), null);
                } else if (i7 == 1) {
                    Context context = viewGroup.getContext();
                    nl0 nl0Var = new nl0(context);
                    org.telegram.ui.Cells.h7 h7Var = new org.telegram.ui.Cells.h7(2, context, null);
                    nl0Var.a = h7Var;
                    h7Var.r.setVisibility(8);
                    nl0Var.addView(h7Var);
                    frameLayout = nl0Var;
                } else {
                    frameLayout = new ol0(viewGroup.getContext());
                }
                frameLayout.setLayoutParams(new v4.q0(-1, -2));
                return new kj0(frameLayout);
            case 4:
                cm0 cm0Var = (cm0) obj;
                return new kj0(new bm0(cm0Var, cm0Var.getContext()));
            case 5:
                d11 d11Var = new d11((f11) obj, viewGroup.getContext());
                d11Var.setLayoutParams(new v4.q0(-2, -1));
                return new kj0(d11Var);
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
                    org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(viewGroup.getContext());
                    z8Var.setFixedSize(12);
                    int i14 = org.telegram.ui.ActionBar.n6.a7;
                    ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.n6.x0(null, i14, false));
                    org.telegram.ui.ActionBar.u6.x(z8Var, colorDrawable, i14, null, PorterDuff.Mode.SRC_IN);
                    mq mqVar = new mq(colorDrawable, org.telegram.ui.ActionBar.n6.Y0(viewGroup.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.n6.b7));
                    mqVar.x = true;
                    z8Var.setBackgroundDrawable(mqVar);
                    view = z8Var;
                }
                return new kj0(view);
            case 7:
                lf0 lf0Var = new lf0(viewGroup.getContext());
                lf0Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(50.0f)));
                return new kj0(lf0Var);
            case 8:
                org.telegram.ui.ActionBar.i6 i6Var = ((xh0) obj).f;
                Context context2 = viewGroup.getContext();
                if (i7 == 0) {
                    wh0 wh0Var = new wh0(context2);
                    RadioButton radioButton = new RadioButton(context2);
                    wh0Var.b = radioButton;
                    radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
                    org.telegram.ui.ActionBar.u6.O(radioButton, org.telegram.ui.ActionBar.n6.g7, org.telegram.ui.ActionBar.n6.h7, i6Var);
                    boolean z10 = gd.a0;
                    wh0Var.addView(radioButton, c8.ma.d(22, 22.0f, (z10 ? 5 : 3) | 16, z10 ? 0 : 20, 0.0f, z10 ? 20 : 0, 0.0f));
                    mp mpVar = new mp(24, context2, i6Var);
                    wh0Var.c = mpVar;
                    int i15 = org.telegram.ui.ActionBar.n6.d6;
                    mpVar.b(-1, i15, org.telegram.ui.ActionBar.n6.k7);
                    mpVar.setDrawUnchecked(false);
                    mpVar.setDrawBackgroundAsArc(3);
                    boolean z11 = gd.a0;
                    wh0Var.addView(mpVar, c8.ma.d(26, 26.0f, (z11 ? 5 : 3) | 16, z11 ? 0 : 18, 0.0f, z11 ? 18 : 0, 0.0f));
                    mpVar.a(true, false);
                    TextView textView = new TextView(context2);
                    wh0Var.a = textView;
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
                    n10.q(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setGravity((gd.a0 ? 5 : 3) | 16);
                    boolean z12 = gd.a0;
                    wh0Var.addView(textView, c8.ma.d(-2, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 23 : 61, 0.0f, z12 ? 61 : 23, 0.0f));
                    org.telegram.ui.ActionBar.u6.h(i15, wh0Var, i6Var);
                    view2 = wh0Var;
                } else if (i7 == 2) {
                    org.telegram.ui.Cells.i2 i2Var = new org.telegram.ui.Cells.i2(70, context2, i6Var);
                    i2Var.d = 61;
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, i2Var, i6Var);
                    view2 = i2Var;
                } else if (i7 != 3) {
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context2, i6Var);
                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, n4Var, i6Var);
                    view2 = n4Var;
                } else {
                    view2 = new org.telegram.ui.Cells.y6(context2, (org.telegram.ui.Cells.c0) null);
                }
                return i5.c.q(view2, view2, -1, -2);
            case 9:
                uc1 uc1Var = (uc1) obj;
                return new kj0(new qc1(uc1Var.F, uc1Var.c));
            case 10:
                ug.i iVar = (ug.i) obj;
                org.telegram.ui.ActionBar.i6 i6Var2 = iVar.a;
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
                    hVar.addView(imageView, c8.ma.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context3);
                    hVar.a = textView2;
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.G6, i6Var2);
                    textView2.setTextSize(1, 14.0f);
                    hVar.addView(textView2, c8.ma.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView3 = new TextView(context3);
                    hVar.b = textView3;
                    org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.y6, i6Var2);
                    textView3.setTextSize(1, 14.0f);
                    hVar.addView(textView3, c8.ma.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view3 = hVar;
                }
                return i5.c.q(view3, view3, -1, -2);
            default:
                Context context4 = viewGroup.getContext();
                ug.i1 i1Var = (ug.i1) obj;
                View i16 = i1Var.i1(context4, i7);
                if (i16 != null) {
                    return i5.c.q(i16, i16, -1, -2);
                }
                if (i7 == 0) {
                    d61 d61Var = new d61(25, context4, this);
                    i1Var.o2 = d61Var;
                    d61Var.setOrientation(1);
                    View view6 = i1Var.x2;
                    if (view6 == null) {
                        i1Var.n2 = new bc(context4, 1, 0, 4);
                        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        int i17 = org.telegram.ui.ActionBar.n6.Dk;
                        canvas.drawColor(i0.a.f(0.5f, org.telegram.ui.ActionBar.n6.w0(i17, i1Var.J0), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.h5, i1Var.J0)));
                        i1Var.n2.setBackgroundBitmap(createBitmap);
                        vg.f fVar = i1Var.n2.b;
                        fVar.z = i17;
                        fVar.A = org.telegram.ui.ActionBar.n6.Ck;
                        fVar.b();
                        d61Var.addView(i1Var.n2, c8.ma.r(ks.q2, ks.q2, 1));
                    } else {
                        if (view6.getParent() != null) {
                            ((ViewGroup) i1Var.x2.getParent()).removeView(i1Var.x2);
                        }
                        i1Var.f1(d61Var);
                    }
                    if (i1Var.J2 == null) {
                        FrameLayout frameLayout2 = new FrameLayout(context4);
                        i1Var.J2 = frameLayout2;
                        frameLayout2.setClipChildren(false);
                        Integer num = i1Var.q2;
                        new PorterDuffColorFilter(num == null ? org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.v6, i1Var.J0) : num.intValue(), PorterDuff.Mode.SRC_IN);
                        i1Var.K2 = new k80[2];
                        int i18 = 0;
                        while (i18 < 2) {
                            i1Var.K2[i18] = new bi.q2(7, context4, i1Var.J0);
                            i1Var.K2[i18].setVisibility(i18 == 0 ? 0 : 8);
                            i1Var.K2[i18].setTextSize(1, 16.0f);
                            i1Var.K2[i18].setTypeface(org.telegram.messenger.g0.o());
                            i1Var.K2[i18].setGravity(1);
                            org.telegram.ui.ActionBar.u6.U(i1Var.K2[i18], org.telegram.ui.ActionBar.n6.G6, i1Var.J0);
                            org.telegram.ui.ActionBar.u6.G(i1Var.K2[i18], org.telegram.ui.ActionBar.n6.J6, i1Var.J0);
                            i1Var.J2.addView(i1Var.K2[i18], c8.ma.c(-2.0f, -1));
                            i18++;
                        }
                    }
                    if (i1Var.J2.getParent() != null) {
                        ((ViewGroup) i1Var.J2.getParent()).removeView(i1Var.J2);
                    }
                    d61Var.addView(i1Var.J2, c8.ma.q(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                    if (i1Var.L2 == null) {
                        k80 k80Var = new k80(i1Var.getContext(), i1Var.J0);
                        i1Var.L2 = k80Var;
                        k80Var.setTextSize(1, 14.0f);
                        i1Var.L2.setGravity(1);
                        org.telegram.ui.ActionBar.u6.U(i1Var.L2, org.telegram.ui.ActionBar.n6.G6, i1Var.J0);
                        org.telegram.ui.ActionBar.u6.G(i1Var.L2, org.telegram.ui.ActionBar.n6.J6, i1Var.J0);
                    }
                    if (i1Var.L2.getParent() != null) {
                        ((ViewGroup) i1Var.L2.getParent()).removeView(i1Var.L2);
                    }
                    d61Var.addView(i1Var.L2, c8.ma.q(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                    i1Var.k1(false);
                    i1Var.m2 = new ki.f(context4, 5);
                    w01 w01Var = new w01(12, context4, this);
                    w01Var.setClipChildren(false);
                    w01Var.addView(i1Var.m2);
                    w01Var.addView(d61Var);
                    bc bcVar = i1Var.n2;
                    view4 = w01Var;
                    if (bcVar != null) {
                        bcVar.setStarParticlesView(i1Var.m2);
                        view4 = w01Var;
                    }
                } else if (i7 == 2) {
                    int i19 = org.telegram.ui.ActionBar.n6.a7;
                    org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context4, org.telegram.ui.ActionBar.n6.w0(i19, i1Var.J0), 0);
                    org.telegram.ui.ActionBar.u6.h(i19, y6Var, i1Var.J0);
                    view4 = y6Var;
                } else if (i7 == 3) {
                    view4 = new zh.f(context4, i12);
                } else if (i7 == 4) {
                    view4 = new ai.r2(context4);
                } else if (i7 != 5) {
                    view4 = new ps0(this, context4, i1Var.J0);
                } else {
                    yg.d0 d0Var = new yg.d0(context4, i1Var.J0);
                    d0Var.setBackground(true);
                    String M0 = gd.M0(2131749490, "GiftPremiumPrivacyPolicyAndTerms");
                    int i20 = org.telegram.ui.ActionBar.n6.Xc;
                    d0Var.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.R2(M0, i20, 0, new Runnable(this) { // from class: ug.h1
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
                                    vf.c.t(((i1) l4Var.d).p2.getParentActivity(), gd.M0(2131743961, null));
                                    break;
                                default:
                                    vf.c.t(((i1) l4Var.d).p2.getParentActivity(), gd.M0(2131746588, null));
                                    break;
                            }
                        }
                    }, null), org.telegram.messenger.g0.R2(gd.M0(2131749491, "GiftPremiumPrivacyPolicy"), i20, 0, new Runnable(this) { // from class: ug.h1
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
                                    vf.c.t(((i1) l4Var.d).p2.getParentActivity(), gd.M0(2131743961, null));
                                    break;
                                default:
                                    vf.c.t(((i1) l4Var.d).p2.getParentActivity(), gd.M0(2131746588, null));
                                    break;
                            }
                        }
                    }, null), "%1$s"));
                    view4 = d0Var;
                }
                view4.setLayoutParams(new v4.q0(-1, -2));
                i1Var.e1(i7, view4);
                return new kj0(view4);
        }
    }

    @Override // v4.i0
    public void y(v4.f1 f1Var) {
        switch (this.c) {
            case 4:
                cm0 cm0Var = (cm0) this.d;
                ArrayList arrayList = cm0Var.r;
                int b10 = f1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((bm0) f1Var.a).a(((zl0) arrayList.get(b10)).a.h == cm0Var.h, false);
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
