package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class gy extends FrameLayout implements org.telegram.ui.ActionBar.b6, te.b {
    public ValueAnimator E;
    public oo F;
    public boolean G;
    public final /* synthetic */ ty H;
    public final te.a a;
    public final int b;
    public final ul0 c;
    public final iq d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final fy r;
    public final ai.l0 s;
    public final View w;
    public float x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy(ty tyVar, Context context, int i7) {
        super(context);
        iq iqVar;
        ImageView.ScaleType scaleType;
        int i10;
        float f10;
        this.H = tyVar;
        this.a = new te.a(0, this, nr.g, 200L, false);
        final int i11 = 0;
        this.y = false;
        org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.a;
        this.b = i7;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int i12 = org.telegram.ui.ActionBar.m6.Cf;
        org.telegram.ui.ActionBar.h6 h6Var = tyVar.a2;
        boolean z10 = tyVar.j2;
        org.telegram.ui.ActionBar.t6.h(i12, view, h6Var);
        addView(view, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (tyVar.v0) {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.zf, view2, h6Var);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, tyVar.c1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(18.0f), z10 ? tyVar.v(0.06f) : tyVar.z(org.telegram.ui.ActionBar.m6.Af)));
        frameLayout.setClipToOutline(true);
        float L = org.telegram.messenger.g0.L(18.0f);
        bg.q0 q0Var = bg.u0.a;
        frameLayout.setOutlineProvider(new bg.s0(0, L));
        int i13 = 2;
        if (i7 == 2) {
            addView(frameLayout, c8.ma.d(-1, 36.0f, org.telegram.messenger.ls.E1, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, c8.ma.d(-1, 36.0f, org.telegram.messenger.ls.E1, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ai.l0 l0Var = new ai.l0(17, context, this);
        this.s = l0Var;
        frameLayout.addView(l0Var, c8.ma.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ul0 ul0Var = new ul0();
        this.c = ul0Var;
        ul0Var.c(0, false, false);
        ul0Var.a(z10 ? tyVar.v(0.4f) : tyVar.z(org.telegram.ui.ActionBar.m6.Bf));
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(ul0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dy
            public final /* synthetic */ gy b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        gy gyVar = this.b;
                        fy fyVar = gyVar.r;
                        iq iqVar2 = gyVar.d;
                        if (gyVar.c.k == 1) {
                            iqVar2.setText("");
                            gyVar.c(null, false);
                            if (fyVar != null) {
                                fyVar.G1();
                                fyVar.I1(null);
                                fyVar.J1(true, true);
                            }
                            gyVar.f(false);
                            iqVar2.clearAnimation();
                            iqVar2.animate().translationX(0.0f).setInterpolator(nr.h).start();
                            gyVar.d(false);
                            break;
                        }
                        break;
                    default:
                        gy gyVar2 = this.b;
                        iq iqVar3 = gyVar2.d;
                        iqVar3.setText("");
                        gyVar2.c(null, false);
                        fy fyVar2 = gyVar2.r;
                        if (fyVar2 != null) {
                            fyVar2.G1();
                            fyVar2.I1(null);
                            fyVar2.J1(true, true);
                        }
                        gyVar2.f(false);
                        iqVar3.clearAnimation();
                        iqVar3.animate().translationX(0.0f).setInterpolator(nr.h).start();
                        gyVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, c8.ma.e(36, 36, 51));
        iq iqVar2 = new iq(this, context, i7, i13);
        this.d = iqVar2;
        iqVar2.setTextSize(1, 16.0f);
        iqVar2.setHintTextColor(z10 ? tyVar.v(0.45f) : tyVar.z(org.telegram.ui.ActionBar.m6.Bf));
        iqVar2.setTextColor(z10 ? tyVar.v(0.8f) : tyVar.z(org.telegram.ui.ActionBar.m6.G6));
        iqVar2.setBackgroundDrawable(null);
        iqVar2.setPadding(0, 0, 0, 0);
        iqVar2.setMaxLines(1);
        iqVar2.setLines(1);
        iqVar2.setSingleLine(true);
        iqVar2.setImeOptions(268435459);
        iqVar2.setHint(org.telegram.messenger.hd.N0(2131745640, null));
        org.telegram.ui.ActionBar.t6.l(iqVar2, 30, org.telegram.ui.ActionBar.m6.Di, h6Var);
        iqVar2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        iqVar2.setCursorWidth(1.5f);
        iqVar2.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        l0Var.addView(iqVar2, c8.ma.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        iqVar2.addTextChangedListener(new ah.j(this, 22));
        if (tyVar.v0) {
            View view3 = new View(context);
            this.w = view3;
            Drawable g10 = i5.c.g(context, R.drawable.gradient_right);
            org.telegram.ui.ActionBar.p6 p10 = org.telegram.ui.ActionBar.t6.p(org.telegram.ui.ActionBar.m6.zf, org.telegram.ui.ActionBar.m6.Af);
            iqVar = iqVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
            org.telegram.ui.ActionBar.t6.k(this, g10, p10.a, p10.b, 4, 0.0f, h6Var, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(g10);
            view3.setAlpha(0.0f);
            l0Var.addView(view3, c8.ma.e(18, -1, 3));
        } else {
            iqVar = iqVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new hi.b2(this));
        int i14 = org.telegram.ui.ActionBar.m6.i6;
        final int i15 = 1;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i14, h6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView2, h02, null, M, h6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.dy
            public final /* synthetic */ gy b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i15) {
                    case 0:
                        gy gyVar = this.b;
                        fy fyVar = gyVar.r;
                        iq iqVar22 = gyVar.d;
                        if (gyVar.c.k == 1) {
                            iqVar22.setText("");
                            gyVar.c(null, false);
                            if (fyVar != null) {
                                fyVar.G1();
                                fyVar.I1(null);
                                fyVar.J1(true, true);
                            }
                            gyVar.f(false);
                            iqVar22.clearAnimation();
                            iqVar22.animate().translationX(0.0f).setInterpolator(nr.h).start();
                            gyVar.d(false);
                            break;
                        }
                        break;
                    default:
                        gy gyVar2 = this.b;
                        iq iqVar3 = gyVar2.d;
                        iqVar3.setText("");
                        gyVar2.c(null, false);
                        fy fyVar2 = gyVar2.r;
                        if (fyVar2 != null) {
                            fyVar2.G1();
                            fyVar2.I1(null);
                            fyVar2.J1(true, true);
                        }
                        gyVar2.f(false);
                        iqVar3.clearAnimation();
                        iqVar3.animate().translationX(0.0f).setInterpolator(nr.h).start();
                        gyVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, c8.ma.e(36, 36, 53));
        if (i7 != 1 || (tyVar.d2 && org.telegram.messenger.k10.i(org.telegram.messenger.k10.t0).q())) {
            fy fyVar = new fy(this, context, i7 == 0 ? i10 : 0, tyVar.a2, i7);
            this.r = fyVar;
            fyVar.E3 = z10;
            fyVar.setDontOccupyWidth(org.telegram.messenger.g0.L(f10) + ((int) iqVar.getPaint().measureText(((Object) iqVar.getHint()) + "")));
            if (tyVar.v0) {
                org.telegram.ui.ActionBar.t6.i(fyVar, org.telegram.ui.ActionBar.t6.p(org.telegram.ui.ActionBar.m6.zf, org.telegram.ui.ActionBar.m6.Af), h6Var);
            }
            final int i16 = 0;
            fyVar.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.y10(this) { // from class: org.telegram.ui.Components.ey
                public final /* synthetic */ gy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.y10
                public final void a(Object obj) {
                    switch (i16) {
                        case 0:
                            Integer num = (Integer) obj;
                            gy gyVar = this.b;
                            gyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            gyVar.d(num.intValue() > 0);
                            gyVar.g(false);
                            break;
                        default:
                            hv0 hv0Var = (hv0) obj;
                            gy gyVar2 = this.b;
                            ty tyVar2 = gyVar2.H;
                            fy fyVar2 = gyVar2.r;
                            if (hv0Var != null) {
                                if (fyVar2.getSelectedCategory() != hv0Var) {
                                    gyVar2.c(hv0Var.a, false);
                                    fyVar2.I1(hv0Var);
                                    break;
                                } else {
                                    gyVar2.c(null, false);
                                    fyVar2.I1(null);
                                    break;
                                }
                            } else {
                                gyVar2.d(false);
                                fyVar2.I1(null);
                                tyVar2.p0.d.setText("");
                                tyVar2.j0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            fyVar.setOnTouchListener(new m.c2(this, 2));
            final int i17 = 1;
            fyVar.setOnCategoryClick(new org.telegram.messenger.y10(this) { // from class: org.telegram.ui.Components.ey
                public final /* synthetic */ gy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.y10
                public final void a(Object obj) {
                    switch (i17) {
                        case 0:
                            Integer num = (Integer) obj;
                            gy gyVar = this.b;
                            gyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            gyVar.d(num.intValue() > 0);
                            gyVar.g(false);
                            break;
                        default:
                            hv0 hv0Var = (hv0) obj;
                            gy gyVar2 = this.b;
                            ty tyVar2 = gyVar2.H;
                            fy fyVar2 = gyVar2.r;
                            if (hv0Var != null) {
                                if (fyVar2.getSelectedCategory() != hv0Var) {
                                    gyVar2.c(hv0Var.a, false);
                                    fyVar2.I1(hv0Var);
                                    break;
                                } else {
                                    gyVar2.c(null, false);
                                    fyVar2.I1(null);
                                    break;
                                }
                            } else {
                                gyVar2.d(false);
                                fyVar2.I1(null);
                                tyVar2.p0.d.setText("");
                                tyVar2.j0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(fyVar, c8.ma.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public static void a(gy gyVar, boolean z10, boolean z11) {
        gyVar.a.a(z10, z11);
    }

    @Override // te.b
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            View view = this.e;
            view.setAlpha(f10);
            view.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    public final void b() {
        org.telegram.messenger.g0.v1(this.d);
    }

    public final void c(String str, boolean z10) {
        ty tyVar = this.H;
        int i7 = this.b;
        if (i7 != 0) {
            if (i7 == 1) {
                tyVar.T.F(str, z10);
                return;
            } else {
                if (i7 == 2) {
                    tyVar.k0.G(str, z10);
                    return;
                }
                return;
            }
        }
        oy oyVar = tyVar.A0;
        ny nyVar = oyVar.P;
        ty tyVar2 = oyVar.R;
        gw gwVar = tyVar2.H0;
        dw dwVar = tyVar2.E0;
        if (oyVar.M != 0) {
            ConnectionsManager.getInstance(tyVar2.d1).cancelRequest(oyVar.M, true);
            oyVar.M = 0;
        }
        if (TextUtils.isEmpty(str)) {
            oyVar.O = null;
            oyVar.F.clear();
            oyVar.I.clear();
            oyVar.L = new ArrayList();
            v4.i0 adapter = dwVar.getAdapter();
            ly lyVar = tyVar2.z0;
            if (adapter != lyVar) {
                dwVar.setAdapter(lyVar);
            }
            oyVar.d = 0L;
            tyVar2.a.a(false, true);
            oyVar.f();
            gwVar.e(false);
        } else {
            oyVar.O = str.toLowerCase();
            gwVar.e(true);
        }
        org.telegram.messenger.g0.r(nyVar);
        org.telegram.messenger.g0.h3(nyVar, 300L);
    }

    public final void d(boolean z10) {
        if (z10 == this.y) {
            return;
        }
        this.y = z10;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z10 ? 1.0f : 0.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new x(this, 23));
        this.E.setDuration(120L);
        this.E.setInterpolator(nr.h);
        this.E.start();
    }

    public final void e(boolean z10) {
        this.G = z10;
        if (z10) {
            this.c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.F == null) {
                oo ooVar = new oo(this, 16);
                this.F = ooVar;
                org.telegram.messenger.g0.h3(ooVar, 340L);
                return;
            }
            return;
        }
        oo ooVar2 = this.F;
        if (ooVar2 != null) {
            org.telegram.messenger.g0.r(ooVar2);
            this.F = null;
        }
        org.telegram.messenger.g0.T3(this.h, false, true);
    }

    public final void g(boolean z10) {
        boolean z11 = this.G;
        iq iqVar = this.d;
        fy fyVar = this.r;
        if (!z11 || ((iqVar.length() == 0 && (fyVar == null || fyVar.getSelectedCategory() == null)) || z10)) {
            this.c.b((iqVar.length() > 0 || (fyVar != null && fyVar.w3 > 0.5f && (fyVar.r3 || fyVar.getSelectedCategory() != null))) ? 1 : 0);
            this.G = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.d.setCursorColor(this.H.z(org.telegram.ui.ActionBar.m6.Di));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
