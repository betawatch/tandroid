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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class ey extends FrameLayout implements org.telegram.ui.ActionBar.c6, te.b {
    public ValueAnimator E;
    public mo F;
    public boolean G;
    public final /* synthetic */ ry H;
    public final te.a a;
    public final int b;
    public final sl0 c;
    public final gq d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final dy r;
    public final ai.k0 s;
    public final View w;
    public float x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey(ry ryVar, Context context, int i7) {
        super(context);
        gq gqVar;
        ImageView.ScaleType scaleType;
        int i10;
        float f10;
        this.H = ryVar;
        this.a = new te.a(0, this, lr.g, 200L, false);
        final int i11 = 0;
        this.y = false;
        org.telegram.ui.ActionBar.t6 t6Var = org.telegram.ui.ActionBar.u6.a;
        this.b = i7;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int i12 = org.telegram.ui.ActionBar.n6.Cf;
        org.telegram.ui.ActionBar.i6 i6Var = ryVar.a2;
        boolean z10 = ryVar.j2;
        org.telegram.ui.ActionBar.u6.h(i12, view, i6Var);
        addView(view, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (ryVar.v0) {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.zf, view2, i6Var);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, ryVar.c1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(18.0f), z10 ? ryVar.v(0.06f) : ryVar.z(org.telegram.ui.ActionBar.n6.Af)));
        frameLayout.setClipToOutline(true);
        float L = org.telegram.messenger.g0.L(18.0f);
        bg.q0 q0Var = bg.u0.a;
        frameLayout.setOutlineProvider(new bg.s0(0, L));
        int i13 = 2;
        if (i7 == 2) {
            addView(frameLayout, c8.ma.d(-1, 36.0f, org.telegram.messenger.ks.E1, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, c8.ma.d(-1, 36.0f, org.telegram.messenger.ks.E1, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ai.k0 k0Var = new ai.k0(17, context, this);
        this.s = k0Var;
        frameLayout.addView(k0Var, c8.ma.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        sl0 sl0Var = new sl0();
        this.c = sl0Var;
        sl0Var.c(0, false, false);
        sl0Var.a(z10 ? ryVar.v(0.4f) : ryVar.z(org.telegram.ui.ActionBar.n6.Bf));
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(sl0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ay
            public final /* synthetic */ ey b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        ey eyVar = this.b;
                        dy dyVar = eyVar.r;
                        gq gqVar2 = eyVar.d;
                        if (eyVar.c.k == 1) {
                            gqVar2.setText("");
                            eyVar.c(null, false);
                            if (dyVar != null) {
                                dyVar.G1();
                                dyVar.I1(null);
                                dyVar.J1(true, true);
                            }
                            eyVar.f(false);
                            gqVar2.clearAnimation();
                            gqVar2.animate().translationX(0.0f).setInterpolator(lr.h).start();
                            eyVar.d(false);
                            break;
                        }
                        break;
                    default:
                        ey eyVar2 = this.b;
                        gq gqVar3 = eyVar2.d;
                        gqVar3.setText("");
                        eyVar2.c(null, false);
                        dy dyVar2 = eyVar2.r;
                        if (dyVar2 != null) {
                            dyVar2.G1();
                            dyVar2.I1(null);
                            dyVar2.J1(true, true);
                        }
                        eyVar2.f(false);
                        gqVar3.clearAnimation();
                        gqVar3.animate().translationX(0.0f).setInterpolator(lr.h).start();
                        eyVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, c8.ma.e(36, 36, 51));
        gq gqVar2 = new gq(this, context, i7, i13);
        this.d = gqVar2;
        gqVar2.setTextSize(1, 16.0f);
        gqVar2.setHintTextColor(z10 ? ryVar.v(0.45f) : ryVar.z(org.telegram.ui.ActionBar.n6.Bf));
        gqVar2.setTextColor(z10 ? ryVar.v(0.8f) : ryVar.z(org.telegram.ui.ActionBar.n6.G6));
        gqVar2.setBackgroundDrawable(null);
        gqVar2.setPadding(0, 0, 0, 0);
        gqVar2.setMaxLines(1);
        gqVar2.setLines(1);
        gqVar2.setSingleLine(true);
        gqVar2.setImeOptions(268435459);
        gqVar2.setHint(org.telegram.messenger.gd.M0(2131745641, null));
        org.telegram.ui.ActionBar.u6.l(gqVar2, 30, org.telegram.ui.ActionBar.n6.Di, i6Var);
        gqVar2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        gqVar2.setCursorWidth(1.5f);
        gqVar2.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        k0Var.addView(gqVar2, c8.ma.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        gqVar2.addTextChangedListener(new ah.j(this, 22));
        if (ryVar.v0) {
            View view3 = new View(context);
            this.w = view3;
            Drawable g10 = i5.c.g(context, R.drawable.gradient_right);
            org.telegram.ui.ActionBar.q6 p10 = org.telegram.ui.ActionBar.u6.p(org.telegram.ui.ActionBar.n6.zf, org.telegram.ui.ActionBar.n6.Af);
            gqVar = gqVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
            org.telegram.ui.ActionBar.u6.k(this, g10, p10.a, p10.b, 4, 0.0f, i6Var, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(g10);
            view3.setAlpha(0.0f);
            k0Var.addView(view3, c8.ma.e(18, -1, 3));
        } else {
            gqVar = gqVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new hi.c2(this));
        int i14 = org.telegram.ui.ActionBar.n6.i6;
        final int i15 = 1;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i14, i6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView2, h02, null, M, i6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ay
            public final /* synthetic */ ey b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i15) {
                    case 0:
                        ey eyVar = this.b;
                        dy dyVar = eyVar.r;
                        gq gqVar22 = eyVar.d;
                        if (eyVar.c.k == 1) {
                            gqVar22.setText("");
                            eyVar.c(null, false);
                            if (dyVar != null) {
                                dyVar.G1();
                                dyVar.I1(null);
                                dyVar.J1(true, true);
                            }
                            eyVar.f(false);
                            gqVar22.clearAnimation();
                            gqVar22.animate().translationX(0.0f).setInterpolator(lr.h).start();
                            eyVar.d(false);
                            break;
                        }
                        break;
                    default:
                        ey eyVar2 = this.b;
                        gq gqVar3 = eyVar2.d;
                        gqVar3.setText("");
                        eyVar2.c(null, false);
                        dy dyVar2 = eyVar2.r;
                        if (dyVar2 != null) {
                            dyVar2.G1();
                            dyVar2.I1(null);
                            dyVar2.J1(true, true);
                        }
                        eyVar2.f(false);
                        gqVar3.clearAnimation();
                        gqVar3.animate().translationX(0.0f).setInterpolator(lr.h).start();
                        eyVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, c8.ma.e(36, 36, 53));
        if (i7 != 1 || (ryVar.d2 && org.telegram.messenger.j10.i(org.telegram.messenger.j10.t0).q())) {
            dy dyVar = new dy(this, context, i7 == 0 ? i10 : 0, ryVar.a2, i7);
            this.r = dyVar;
            dyVar.E3 = z10;
            dyVar.setDontOccupyWidth(org.telegram.messenger.g0.L(f10) + ((int) gqVar.getPaint().measureText(((Object) gqVar.getHint()) + "")));
            if (ryVar.v0) {
                org.telegram.ui.ActionBar.u6.i(dyVar, org.telegram.ui.ActionBar.u6.p(org.telegram.ui.ActionBar.n6.zf, org.telegram.ui.ActionBar.n6.Af), i6Var);
            }
            final int i16 = 0;
            dyVar.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.x10(this) { // from class: org.telegram.ui.Components.cy
                public final /* synthetic */ ey b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.x10
                public final void a(Object obj) {
                    switch (i16) {
                        case 0:
                            Integer num = (Integer) obj;
                            ey eyVar = this.b;
                            eyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            eyVar.d(num.intValue() > 0);
                            eyVar.g(false);
                            break;
                        default:
                            ev0 ev0Var = (ev0) obj;
                            ey eyVar2 = this.b;
                            ry ryVar2 = eyVar2.H;
                            dy dyVar2 = eyVar2.r;
                            if (ev0Var != null) {
                                if (dyVar2.getSelectedCategory() != ev0Var) {
                                    eyVar2.c(ev0Var.a, false);
                                    dyVar2.I1(ev0Var);
                                    break;
                                } else {
                                    eyVar2.c(null, false);
                                    dyVar2.I1(null);
                                    break;
                                }
                            } else {
                                eyVar2.d(false);
                                dyVar2.I1(null);
                                ryVar2.p0.d.setText("");
                                ryVar2.j0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            dyVar.setOnTouchListener(new m.c2(this, 2));
            final int i17 = 1;
            dyVar.setOnCategoryClick(new org.telegram.messenger.x10(this) { // from class: org.telegram.ui.Components.cy
                public final /* synthetic */ ey b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.x10
                public final void a(Object obj) {
                    switch (i17) {
                        case 0:
                            Integer num = (Integer) obj;
                            ey eyVar = this.b;
                            eyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            eyVar.d(num.intValue() > 0);
                            eyVar.g(false);
                            break;
                        default:
                            ev0 ev0Var = (ev0) obj;
                            ey eyVar2 = this.b;
                            ry ryVar2 = eyVar2.H;
                            dy dyVar2 = eyVar2.r;
                            if (ev0Var != null) {
                                if (dyVar2.getSelectedCategory() != ev0Var) {
                                    eyVar2.c(ev0Var.a, false);
                                    dyVar2.I1(ev0Var);
                                    break;
                                } else {
                                    eyVar2.c(null, false);
                                    dyVar2.I1(null);
                                    break;
                                }
                            } else {
                                eyVar2.d(false);
                                dyVar2.I1(null);
                                ryVar2.p0.d.setText("");
                                ryVar2.j0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(dyVar, c8.ma.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public static void a(ey eyVar, boolean z10, boolean z11) {
        eyVar.a.a(z10, z11);
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
        ry ryVar = this.H;
        int i7 = this.b;
        if (i7 != 0) {
            if (i7 == 1) {
                ryVar.T.F(str, z10);
                return;
            } else {
                if (i7 == 2) {
                    ryVar.k0.G(str, z10);
                    return;
                }
                return;
            }
        }
        my myVar = ryVar.A0;
        ly lyVar = myVar.P;
        ry ryVar2 = myVar.R;
        ew ewVar = ryVar2.H0;
        aw awVar = ryVar2.E0;
        if (myVar.M != 0) {
            ConnectionsManager.getInstance(ryVar2.d1).cancelRequest(myVar.M, true);
            myVar.M = 0;
        }
        if (TextUtils.isEmpty(str)) {
            myVar.O = null;
            myVar.F.clear();
            myVar.I.clear();
            myVar.L = new ArrayList();
            v4.i0 adapter = awVar.getAdapter();
            jy jyVar = ryVar2.z0;
            if (adapter != jyVar) {
                awVar.setAdapter(jyVar);
            }
            myVar.d = 0L;
            ryVar2.a.a(false, true);
            myVar.f();
            ewVar.e(false);
        } else {
            myVar.O = str.toLowerCase();
            ewVar.e(true);
        }
        org.telegram.messenger.g0.r(lyVar);
        org.telegram.messenger.g0.h3(lyVar, 300L);
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
        ofFloat.addUpdateListener(new w(this, 23));
        this.E.setDuration(120L);
        this.E.setInterpolator(lr.h);
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
                mo moVar = new mo(this, 16);
                this.F = moVar;
                org.telegram.messenger.g0.h3(moVar, 340L);
                return;
            }
            return;
        }
        mo moVar2 = this.F;
        if (moVar2 != null) {
            org.telegram.messenger.g0.r(moVar2);
            this.F = null;
        }
        org.telegram.messenger.g0.T3(this.h, false, true);
    }

    public final void g(boolean z10) {
        boolean z11 = this.G;
        gq gqVar = this.d;
        dy dyVar = this.r;
        if (!z11 || ((gqVar.length() == 0 && (dyVar == null || dyVar.getSelectedCategory() == null)) || z10)) {
            this.c.b((gqVar.length() > 0 || (dyVar != null && dyVar.w3 > 0.5f && (dyVar.r3 || dyVar.getSelectedCategory() != null))) ? 1 : 0);
            this.G = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            this.d.setCursorColor(this.H.z(org.telegram.ui.ActionBar.n6.Di));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // te.b
    public final /* synthetic */ void D(float f10, int i7) {
    }
}
