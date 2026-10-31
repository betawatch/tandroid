package kg;

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
import java.util.ArrayList;
import jg.z2;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.messenger.k6;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.k7;
import org.telegram.ui.Cells.l7;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.aa;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.z9;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.eu0;
import org.telegram.ui.le1;
import org.telegram.ui.pe1;
import org.telegram.ui.qg0;
import org.telegram.ui.rg0;
import org.telegram.ui.s00;
import org.telegram.ui.st0;
import org.telegram.ui.u71;
import org.telegram.ui.wi0;
import org.telegram.ui.xi0;
import org.telegram.ui.yi0;
import org.telegram.ui.zu;
import rh.e4;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f extends sk0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f(Object obj, int i10) {
        this.c = i10;
        this.d = obj;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        switch (this.c) {
            case 0:
                return false;
            case 1:
                return c1Var.f == 1;
            case 2:
                return false;
            case 3:
                int i10 = c1Var.f;
                return i10 == 1 || i10 == 2;
            case 4:
                return true;
            case 5:
                return false;
            case 6:
                return true;
            case 7:
                int i11 = c1Var.f;
                return i11 == 0 || i11 == 2;
            case 8:
                return true;
            case 9:
                return false;
            default:
                return true;
        }
    }

    public jj E(int i10) {
        gm0 gm0Var = (gm0) this.d;
        int i11 = gm0Var.w;
        if (i10 >= i11 && i10 < gm0Var.x) {
            return (jj) gm0Var.e.get(i10 - i11);
        }
        int i12 = gm0Var.D;
        if (i10 < i12 || i10 >= gm0Var.E) {
            return null;
        }
        return (jj) gm0Var.f.get(i10 - i12);
    }

    public void H(int i10, int i11) {
        int[] iArr = ((e4) this.d).K2;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return;
        }
        iArr[0] = i10;
        iArr[1] = i11;
        f();
    }

    @Override // s4.g0
    public final int b() {
        switch (this.c) {
            case 0:
                return ((l) this.d).d.size();
            case 1:
                return ((v1) this.d).X1;
            case 2:
                return 1;
            case 3:
                return ((gm0) this.d).r;
            case 4:
                return ((rm0) this.d).r.size();
            case 5:
                return ((zu) this.d).Y1.h() ? 1 : 3;
            case 6:
                return ((rg0) this.d).c.size();
            case 7:
                return ((yi0) this.d).h;
            case 8:
                return 12;
            case 9:
                return ((e4) this.d).K2.length;
            default:
                return ((zf.g0) this.d).e3.size();
        }
    }

    @Override // s4.g0
    public long c(int i10) {
        wi0 wi0Var;
        switch (this.c) {
            case 7:
                yi0 yi0Var = (yi0) this.d;
                int i11 = yi0Var.D;
                if (i10 < i11 || i10 >= yi0Var.E) {
                    int i12 = yi0Var.n;
                    wi0Var = (i10 < i12 || i10 >= yi0Var.r) ? null : (wi0) yi0Var.a.get(i10 - i12);
                } else {
                    wi0Var = (wi0) yi0Var.b.get(i10 - i11);
                }
                if (wi0Var != null) {
                    return wi0Var.c;
                }
                yi0Var.getClass();
                if (i10 == 0) {
                    return 1L;
                }
                if (i10 == yi0Var.y) {
                    return 2L;
                }
                if (i10 == yi0Var.s) {
                    return 3L;
                }
                if (i10 == yi0Var.w) {
                    return 4L;
                }
                if (i10 == yi0Var.x) {
                    return 5L;
                }
                throw new RuntimeException();
            default:
                return super.c(i10);
        }
    }

    @Override // s4.g0
    public int d(int i10) {
        switch (this.c) {
            case 0:
                return ((j) ((l) this.d).d.get(i10)).a;
            case 1:
                v1 v1Var = (v1) this.d;
                if (i10 != v1Var.Y1) {
                    if (i10 >= v1Var.Z1 && i10 < v1Var.a2) {
                        return v1Var.f1();
                    }
                    if (i10 >= v1Var.b2 && i10 < v1Var.c2) {
                        return 1;
                    }
                    if (i10 == v1Var.d2) {
                        return 2;
                    }
                    if (i10 == v1Var.e2) {
                        return 3;
                    }
                    if (i10 == 0) {
                        return 4;
                    }
                    if (i10 == v1Var.f2) {
                        return 5;
                    }
                }
                return 0;
            case 2:
                return i10;
            case 3:
                gm0 gm0Var = (gm0) this.d;
                if (i10 == gm0Var.s || i10 == gm0Var.y) {
                    return 0;
                }
                jj E = E(i10);
                return (E != null && E.I3()) ? 2 : 1;
            case 4:
            case 6:
            default:
                return super.d(i10);
            case 5:
                return i10;
            case 7:
                yi0 yi0Var = (yi0) this.d;
                if (i10 >= yi0Var.D && i10 < yi0Var.E) {
                    return 0;
                }
                yi0Var.getClass();
                if (i10 == 0 || i10 == yi0Var.y) {
                    return 1;
                }
                if (i10 == yi0Var.s) {
                    return 2;
                }
                return (i10 == yi0Var.w || i10 == yi0Var.x) ? 3 : 0;
        }
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        int i11 = this.c;
        wi0 wi0Var = null;
        Object obj = this.d;
        switch (i11) {
            case 0:
                l lVar = (l) obj;
                ArrayList arrayList = lVar.d;
                if (((j) arrayList.get(i10)).a == 1) {
                    k kVar = (k) c1Var.a;
                    kVar.c.setColorFilter(new PorterDuffColorFilter(lVar.e.getPixel(i10, 0), PorterDuff.Mode.MULTIPLY));
                    kVar.c.setImageDrawable(lVar.getContext().getDrawable(((j) arrayList.get(i10)).b));
                    kVar.a.setText(((j) arrayList.get(i10)).c);
                    kVar.b.setText(((j) arrayList.get(i10)).d);
                    break;
                }
                break;
            case 1:
                View view = c1Var.a;
                v1 v1Var = (v1) obj;
                int i12 = v1Var.b2;
                if (i10 >= i12 && i10 < v1Var.c2) {
                    ((st0) view).a((eu0) v1Var.P1.get(i10 - i12), i10 != v1Var.c2 - 1);
                    break;
                } else if (i10 >= v1Var.Z1 && i10 < v1Var.a2) {
                    v1Var.g1(view);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                gm0 gm0Var = (gm0) obj;
                s00 s00Var = gm0Var.J;
                int i13 = c1Var.f;
                View view2 = c1Var.a;
                if (i13 != 0) {
                    jj E = E(i10);
                    if (E != null) {
                        boolean z11 = gm0Var.I.f() && i10 >= gm0Var.w && i10 < gm0Var.x;
                        if (i13 != 1) {
                            if (i13 == 2) {
                                k7 k7Var = (k7) view2;
                                int f12 = k7Var.getMessage() == null ? 0 : k7Var.getMessage().f1();
                                k7Var.f(E, true);
                                int f13 = k7Var.getMessage().f1();
                                s00Var.a = jj.B0(k7Var.getMessage().k);
                                s00Var.b = f13;
                                k7Var.e(gm0Var.I.b(s00Var), f12 == E.f1());
                                z10 = f12 == E.f1();
                                if (k7Var.d0 != z11) {
                                    k7Var.d0 = z11;
                                    if (!z10) {
                                        k7Var.e0 = z11 ? 1.0f : 0.0f;
                                    }
                                    k7Var.invalidate();
                                    break;
                                }
                            }
                        } else {
                            dm0 dm0Var = (dm0) view2;
                            a7.i(t6.d6, dm0Var, null);
                            l7 l7Var = dm0Var.a;
                            int f14 = l7Var.getMessage() == null ? 0 : l7Var.getMessage().f1();
                            l7Var.c(E, true);
                            int f15 = l7Var.getMessage().f1();
                            s00Var.a = jj.B0(l7Var.getMessage().k);
                            s00Var.b = f15;
                            l7Var.b(gm0Var.I.b(s00Var), f14 == E.f1());
                            z10 = f14 == E.f1();
                            if (l7Var.O != z11) {
                                l7Var.O = z11;
                                if (!z10) {
                                    l7Var.P = z11 ? 1.0f : 0.0f;
                                }
                                l7Var.invalidate();
                                break;
                            }
                        }
                    }
                } else {
                    z3 z3Var = (z3) view2;
                    if (i10 != gm0Var.s) {
                        if (i10 == gm0Var.y) {
                            z3Var.b(cd.L0(2131746377, null), cd.L0(2131745512, null), new db0(this, 8));
                            break;
                        }
                    } else {
                        String L0 = cd.L0(2131751345, null);
                        if (!z3Var.getText().equals(L0)) {
                            z3Var.b(L0, gm0Var.H ? cd.L0(2131747449, null) : cd.L0(2131746070, null), new fm0(this));
                            break;
                        } else {
                            String L02 = gm0Var.H ? cd.L0(2131747449, null) : cd.L0(2131746070, null);
                            boolean z12 = gm0Var.H;
                            y3 y3Var = z3Var.b;
                            y3Var.c(L02, true, z12);
                            y3Var.setVisibility(0);
                            break;
                        }
                    }
                }
                break;
            case 4:
                View view3 = c1Var.a;
                rm0 rm0Var = (rm0) obj;
                ArrayList arrayList2 = rm0Var.r;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    om0 om0Var = (om0) arrayList2.get(i10);
                    qm0 qm0Var = (qm0) view3;
                    sg.o0 o0Var = qm0Var.d;
                    boolean z13 = o0Var == null || !o0Var.equals(om0Var.a);
                    if (z13) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = om0Var.a.g();
                        tL_reactionCount.count = om0Var.b;
                        rm0 rm0Var2 = qm0Var.s;
                        pm0 pm0Var = new pm0(qm0Var, rm0Var2.a, qm0Var, tL_reactionCount, rm0Var2.c);
                        qm0Var.a = pm0Var;
                        pm0Var.E.d(org.telegram.messenger.i0.L(29.0f), org.telegram.messenger.i0.L(100.0f));
                        pm0 pm0Var2 = qm0Var.a;
                        pm0Var2.p = true;
                        pm0Var2.R = true;
                    } else {
                        qm0Var.a.v = om0Var.b;
                    }
                    qm0Var.d = om0Var.a;
                    if (!z13) {
                        pm0 pm0Var3 = qm0Var.a;
                        pm0Var3.e = pm0Var3.z;
                    }
                    qm0Var.a.z = org.telegram.messenger.i0.L(44.33f);
                    qm0Var.a.t = !TextUtils.isEmpty(om0Var.c);
                    pm0 pm0Var4 = qm0Var.a;
                    boolean z14 = pm0Var4.t;
                    e6 e6Var = pm0Var4.F;
                    if (z14) {
                        e6Var.t(k6.m(om0Var.c, e6Var.a.getFontMetricsInt(), false, null, 0), !z13, true);
                    } else if (e6Var != null) {
                        e6Var.t("", !z13, true);
                    }
                    pm0 pm0Var5 = qm0Var.a;
                    Integer.toString(om0Var.b);
                    pm0Var5.getClass();
                    qm0Var.a.E.c(om0Var.b, !z13);
                    pm0 pm0Var6 = qm0Var.a;
                    if (pm0Var6.E != null && (pm0Var6.v > 0 || pm0Var6.t)) {
                        pm0Var6.z = (int) (org.telegram.messenger.i0.L(qm0Var.a.t ? 4.0f : 0.0f) + ((int) Math.ceil(r3.m)) + qm0Var.a.F.d + pm0Var6.z);
                    }
                    if (z13) {
                        pm0 pm0Var7 = qm0Var.a;
                        pm0Var7.e = pm0Var7.z;
                    }
                    qm0Var.a.A = org.telegram.messenger.i0.L(28.0f);
                    pm0 pm0Var8 = qm0Var.a;
                    pm0Var8.o = qm0Var.e;
                    if (qm0Var.r) {
                        pm0Var8.a();
                    }
                    if (!z13) {
                        qm0Var.requestLayout();
                    }
                    ((qm0) view3).a(om0Var.a.h == rm0Var.h, false);
                    break;
                }
                break;
            case 5:
                break;
            case 6:
                rg0 rg0Var = (rg0) obj;
                ((qg0) c1Var.a).a((TLObject) rg0Var.c.get(i10), ((Integer) rg0Var.b.get(i10)).intValue(), false);
                break;
            case 7:
                yi0 yi0Var = (yi0) obj;
                p6 p6Var = yi0Var.f;
                int i14 = c1Var.f;
                View view4 = c1Var.a;
                if (i14 == 0) {
                    xi0 xi0Var = (xi0) view4;
                    int i15 = yi0Var.D;
                    if (i10 >= i15 && i10 < yi0Var.E) {
                        wi0Var = (wi0) yi0Var.b.get(i10 - i15);
                    }
                    int i16 = yi0Var.n;
                    if (i10 >= i16 && i10 < yi0Var.r) {
                        wi0Var = (wi0) yi0Var.a.get(i10 - i16);
                    }
                    if (wi0Var != null) {
                        boolean z15 = xi0Var.e == wi0Var;
                        boolean z16 = wi0Var == yi0Var.G;
                        boolean z17 = yi0Var.I.get(wi0Var.c) != null;
                        xi0Var.e = wi0Var;
                        xi0Var.a.setText(wi0Var.f);
                        xi0Var.d = i10 != yi0Var.E - 1;
                        xi0Var.b.a(z16, z15);
                        xi0Var.c.a(z17, z15);
                        break;
                    }
                } else if (i14 == 1) {
                    p4 p4Var = (p4) view4;
                    if (i10 != 0) {
                        if (i10 == yi0Var.y) {
                            p4Var.setText(cd.L0(2131744315, null));
                            break;
                        }
                    } else {
                        p4Var.setText(cd.L0(2131744236, null));
                        break;
                    }
                } else if (i14 == 2) {
                    org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view4;
                    Drawable drawable = i2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable2 = i2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                    int i17 = t6.N6;
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    a7.y(i2Var, drawable, i17, p6Var, mode);
                    a7.y(i2Var, drawable2, t6.k7, p6Var, mode);
                    eq eqVar = new eq(drawable, drawable2);
                    i2Var.a.l(cd.L0(2131743829, null), false);
                    i2Var.b.setImageDrawable(eqVar);
                    i2Var.c = false;
                    break;
                }
                break;
            case 8:
                ((le1) c1Var.a).a = WallpapersListActivity.i0[i10];
                break;
            case 9:
                int[] iArr = ((e4) obj).K2;
                int length = (iArr.length - 1) - i10;
                z9 z9Var = (z9) c1Var.a;
                int i18 = iArr[length];
                if (z9Var.a != i18) {
                    z9Var.a = i18;
                    z9Var.requestLayout();
                    break;
                }
                break;
            default:
                ((zf.f0) c1Var).v.setData((zf.e0) ((zf.g0) obj).e3.get(i10));
                break;
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        FrameLayout frameLayout;
        View view3;
        View view4;
        int i11 = this.c;
        final int i12 = 0;
        final int i13 = 1;
        Object obj = this.d;
        switch (i11) {
            case 0:
                l lVar = (l) obj;
                p6 p6Var = lVar.a;
                if (i10 == 0) {
                    view = new i(lVar, lVar.getContext());
                } else if (i10 == 2) {
                    view = new x3(lVar.getContext(), 16);
                } else {
                    Context context = lVar.getContext();
                    k kVar = new k(context);
                    ImageView imageView = new ImageView(context);
                    kVar.c = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    kVar.addView(imageView, b6.d(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
                    TextView textView = new TextView(context);
                    kVar.a = textView;
                    textView.setTypeface(org.telegram.messenger.i0.o());
                    a7.V(textView, t6.G6, p6Var);
                    textView.setTextSize(1, 14.0f);
                    kVar.addView(textView, b6.d(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    kVar.b = textView2;
                    a7.V(textView2, t6.y6, p6Var);
                    textView2.setTextSize(1, 14.0f);
                    kVar.addView(textView2, b6.d(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
                    view = kVar;
                }
                return sc.e.o(view, view, -1, -2);
            case 1:
                Context context2 = viewGroup.getContext();
                v1 v1Var = (v1) obj;
                View h12 = v1Var.h1(context2, i10);
                if (h12 != null) {
                    return sc.e.o(h12, h12, -1, -2);
                }
                if (i10 == 0) {
                    u71 u71Var = new u71(this, context2, 3);
                    v1Var.k2 = u71Var;
                    u71Var.setOrientation(1);
                    View view5 = v1Var.t2;
                    if (view5 == null) {
                        v1Var.j2 = new h(context2, 1, 0, 1);
                        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        int i14 = t6.Ak;
                        canvas.drawColor(i0.b.f(0.5f, t6.w0(i14, v1Var.I0), t6.w0(t6.h5, v1Var.I0)));
                        v1Var.j2.setBackgroundBitmap(createBitmap);
                        lg.h hVar = v1Var.j2.b;
                        hVar.z = i14;
                        hVar.A = t6.zk;
                        hVar.b();
                        u71Var.addView(v1Var.j2, b6.r(zs.q2, zs.q2, 1));
                    } else {
                        if (view5.getParent() != null) {
                            ((ViewGroup) v1Var.t2.getParent()).removeView(v1Var.t2);
                        }
                        v1Var.e1(u71Var);
                    }
                    if (v1Var.F2 == null) {
                        FrameLayout frameLayout2 = new FrameLayout(context2);
                        v1Var.F2 = frameLayout2;
                        frameLayout2.setClipChildren(false);
                        Integer num = v1Var.m2;
                        new PorterDuffColorFilter(num == null ? t6.w0(t6.v6, v1Var.I0) : num.intValue(), PorterDuff.Mode.SRC_IN);
                        v1Var.G2 = new p80[2];
                        int i15 = 0;
                        while (i15 < 2) {
                            v1Var.G2[i15] = new t1(0, context2, v1Var.I0);
                            v1Var.G2[i15].setVisibility(i15 == 0 ? 0 : 8);
                            v1Var.G2[i15].setTextSize(1, 16.0f);
                            v1Var.G2[i15].setTypeface(org.telegram.messenger.i0.o());
                            v1Var.G2[i15].setGravity(1);
                            a7.V(v1Var.G2[i15], t6.G6, v1Var.I0);
                            a7.H(v1Var.G2[i15], t6.J6, v1Var.I0);
                            v1Var.F2.addView(v1Var.G2[i15], b6.c(-2.0f, -1));
                            i15++;
                        }
                    }
                    if (v1Var.F2.getParent() != null) {
                        ((ViewGroup) v1Var.F2.getParent()).removeView(v1Var.F2);
                    }
                    u71Var.addView(v1Var.F2, b6.q(-2, -2, 0.0f, 1, 40, 0, 40, 0));
                    if (v1Var.H2 == null) {
                        p80 p80Var = new p80(v1Var.getContext(), v1Var.I0);
                        v1Var.H2 = p80Var;
                        p80Var.setTextSize(1, 14.0f);
                        v1Var.H2.setGravity(1);
                        a7.V(v1Var.H2, t6.G6, v1Var.I0);
                        a7.H(v1Var.H2, t6.J6, v1Var.I0);
                    }
                    if (v1Var.H2.getParent() != null) {
                        ((ViewGroup) v1Var.H2.getParent()).removeView(v1Var.H2);
                    }
                    u71Var.addView(v1Var.H2, b6.q(-1, -2, 0.0f, 0, 24, 9, 24, 20));
                    v1Var.j1(false);
                    v1Var.i2 = new g(context2, i13);
                    jg.l0 l0Var = new jg.l0(this, context2, 6);
                    l0Var.setClipChildren(false);
                    l0Var.addView(v1Var.i2);
                    l0Var.addView(u71Var);
                    h hVar2 = v1Var.j2;
                    view2 = l0Var;
                    if (hVar2 != null) {
                        hVar2.setStarParticlesView(v1Var.i2);
                        view2 = l0Var;
                    }
                } else if (i10 == 2) {
                    int i16 = t6.a7;
                    c7 c7Var = new c7(context2, t6.w0(i16, v1Var.I0), 0);
                    a7.i(i16, c7Var, v1Var.I0);
                    view2 = c7Var;
                } else if (i10 == 3) {
                    view2 = new bn(context2, 2);
                } else if (i10 == 4) {
                    view2 = new z2(context2);
                } else if (i10 != 5) {
                    view2 = new u1(this, context2, v1Var.I0);
                } else {
                    og.f0 f0Var = new og.f0(context2, v1Var.I0);
                    f0Var.setBackground(true);
                    String L0 = cd.L0(2131749671, "GiftPremiumPrivacyPolicyAndTerms");
                    int i17 = t6.Uc;
                    f0Var.setText(org.telegram.messenger.i0.J2(org.telegram.messenger.i0.R2(L0, i17, 0, new Runnable(this) { // from class: kg.s1
                        public final /* synthetic */ f b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i18 = i12;
                            f fVar = this.b;
                            switch (i18) {
                                case 0:
                                    gf.f.r(((v1) fVar.d).l2.getParentActivity(), cd.L0(2131744221, null));
                                    break;
                                default:
                                    gf.f.r(((v1) fVar.d).l2.getParentActivity(), cd.L0(2131746796, null));
                                    break;
                            }
                        }
                    }, null), org.telegram.messenger.i0.R2(cd.L0(2131749672, "GiftPremiumPrivacyPolicy"), i17, 0, new Runnable(this) { // from class: kg.s1
                        public final /* synthetic */ f b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i18 = i13;
                            f fVar = this.b;
                            switch (i18) {
                                case 0:
                                    gf.f.r(((v1) fVar.d).l2.getParentActivity(), cd.L0(2131744221, null));
                                    break;
                                default:
                                    gf.f.r(((v1) fVar.d).l2.getParentActivity(), cd.L0(2131746796, null));
                                    break;
                            }
                        }
                    }, null), "%1$s"));
                    view2 = f0Var;
                }
                view2.setLayoutParams(new s4.o0(-1, -2));
                v1Var.d1(i10, view2);
                return new ck0(view2);
            case 2:
                return new ck0(((aa) obj).P1);
            case 3:
                if (i10 == 0) {
                    frameLayout = new z3(viewGroup.getContext(), null);
                } else if (i10 == 1) {
                    Context context3 = viewGroup.getContext();
                    dm0 dm0Var = new dm0(context3);
                    l7 l7Var = new l7(2, context3, null);
                    dm0Var.a = l7Var;
                    l7Var.r.setVisibility(8);
                    dm0Var.addView(l7Var);
                    frameLayout = dm0Var;
                } else {
                    frameLayout = new em0(viewGroup.getContext());
                }
                frameLayout.setLayoutParams(new s4.o0(-1, -2));
                return new ck0(frameLayout);
            case 4:
                rm0 rm0Var = (rm0) obj;
                return new ck0(new qm0(rm0Var, rm0Var.getContext()));
            case 5:
                zu zuVar = (zu) obj;
                if (i10 == 0) {
                    view3 = zuVar.V1;
                } else if (i10 == 2) {
                    View view6 = zuVar.W1;
                    s4.o0 o0Var = new s4.o0(-1, -2);
                    int i18 = zuVar.t0;
                    ((ViewGroup.MarginLayoutParams) o0Var).leftMargin = i18;
                    ((ViewGroup.MarginLayoutParams) o0Var).rightMargin = i18;
                    view6.setLayoutParams(o0Var);
                    view3 = view6;
                } else {
                    b9 b9Var = new b9(viewGroup.getContext());
                    b9Var.setFixedSize(12);
                    int i19 = t6.a7;
                    ColorDrawable colorDrawable = new ColorDrawable(t6.x0(null, i19, false));
                    a7.y(b9Var, colorDrawable, i19, null, PorterDuff.Mode.SRC_IN);
                    eq eqVar = new eq(colorDrawable, t6.Y0(viewGroup.getContext(), R.drawable.greydivider_bottom, t6.b7));
                    eqVar.x = true;
                    b9Var.setBackgroundDrawable(eqVar);
                    view3 = b9Var;
                }
                return new ck0(view3);
            case 6:
                qg0 qg0Var = new qg0(viewGroup.getContext());
                qg0Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(50.0f)));
                return new ck0(qg0Var);
            case 7:
                p6 p6Var2 = ((yi0) obj).f;
                Context context4 = viewGroup.getContext();
                if (i10 == 0) {
                    xi0 xi0Var = new xi0(context4);
                    RadioButton radioButton = new RadioButton(context4);
                    xi0Var.b = radioButton;
                    radioButton.setSize(org.telegram.messenger.i0.L(20.0f));
                    a7.P(radioButton, t6.g7, t6.h7, p6Var2);
                    boolean z10 = cd.X;
                    xi0Var.addView(radioButton, b6.d(22, 22.0f, (z10 ? 5 : 3) | 16, z10 ? 0 : 20, 0.0f, z10 ? 20 : 0, 0.0f));
                    ep epVar = new ep(24, context4, p6Var2);
                    xi0Var.c = epVar;
                    int i20 = t6.d6;
                    epVar.b(-1, i20, t6.k7);
                    epVar.setDrawUnchecked(false);
                    epVar.setDrawBackgroundAsArc(3);
                    boolean z11 = cd.X;
                    xi0Var.addView(epVar, b6.d(26, 26.0f, (z11 ? 5 : 3) | 16, z11 ? 0 : 18, 0.0f, z11 ? 18 : 0, 0.0f));
                    epVar.a(true, false);
                    TextView textView3 = new TextView(context4);
                    xi0Var.a = textView3;
                    a7.V(textView3, t6.G6, p6Var2);
                    z20.o(textView3, 1, 16.0f, 1, 1);
                    textView3.setSingleLine(true);
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity((cd.X ? 5 : 3) | 16);
                    boolean z12 = cd.X;
                    xi0Var.addView(textView3, b6.d(-2, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 23 : 61, 0.0f, z12 ? 61 : 23, 0.0f));
                    a7.i(i20, xi0Var, p6Var2);
                    view4 = xi0Var;
                } else if (i10 == 2) {
                    org.telegram.ui.Cells.i2 i2Var = new org.telegram.ui.Cells.i2(70, context4, p6Var2);
                    i2Var.d = 61;
                    a7.i(t6.d6, i2Var, p6Var2);
                    view4 = i2Var;
                } else if (i10 != 3) {
                    p4 p4Var = new p4(context4, p6Var2);
                    a7.i(t6.d6, p4Var, p6Var2);
                    view4 = p4Var;
                } else {
                    view4 = new c7(context4, (org.telegram.ui.Cells.f1) null);
                }
                return sc.e.o(view4, view4, -1, -2);
            case 8:
                pe1 pe1Var = (pe1) obj;
                return new ck0(new le1(pe1Var.E, pe1Var.c));
            case 9:
                z9 z9Var = new z9(((e4) obj).getContext());
                z9Var.a = 0;
                return new ck0(z9Var);
            default:
                zf.d0 d0Var = new zf.d0(viewGroup.getContext(), ((zf.g0) obj).n2);
                zf.f0 f0Var2 = new zf.f0(d0Var);
                f0Var2.v = d0Var;
                d0Var.setLayoutParams(new s4.o0(-2, org.telegram.messenger.i0.L(30.0f)));
                return f0Var2;
        }
    }

    @Override // s4.g0
    public void y(s4.c1 c1Var) {
        switch (this.c) {
            case 4:
                rm0 rm0Var = (rm0) this.d;
                ArrayList arrayList = rm0Var.r;
                int b10 = c1Var.b();
                if (b10 >= 0 && b10 < arrayList.size()) {
                    ((qm0) c1Var.a).a(((om0) arrayList.get(b10)).a.h == rm0Var.h, false);
                    break;
                }
                break;
        }
    }

    private final void F(s4.c1 c1Var, int i10) {
    }

    private final void G(s4.c1 c1Var, int i10) {
    }
}
