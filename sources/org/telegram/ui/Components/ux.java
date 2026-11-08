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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class ux extends FrameLayout implements org.telegram.ui.ActionBar.a6, te.b {
    public ValueAnimator D;
    public gp E;
    public boolean F;
    public final /* synthetic */ hy G;
    public final te.a a;
    public final int b;
    public final fl0 c;
    public final rp d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final tx r;
    public final bi.x5 s;
    public final View w;
    public float x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux(hy hyVar, Context context, int i7) {
        super(context);
        rp rpVar;
        ImageView.ScaleType scaleType;
        int i10;
        float f10;
        this.G = hyVar;
        this.a = new te.a(0, this, xq.g, 200L, false);
        final int i11 = 0;
        this.y = false;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.a;
        this.b = i7;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int i12 = org.telegram.ui.ActionBar.k6.zf;
        org.telegram.ui.ActionBar.f6 f6Var = hyVar.Z1;
        boolean z9 = hyVar.i2;
        org.telegram.ui.ActionBar.r6.i(i12, view, f6Var);
        addView(view, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (hyVar.u0) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.wf, view2, f6Var);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, hyVar.b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(18.0f), z9 ? hyVar.v(0.06f) : hyVar.z(org.telegram.ui.ActionBar.k6.xf)));
        frameLayout.setClipToOutline(true);
        float L = org.telegram.messenger.g0.L(18.0f);
        bg.q0 q0Var = bg.u0.a;
        frameLayout.setOutlineProvider(new bg.s0(0, L));
        int i13 = 2;
        if (i7 == 2) {
            addView(frameLayout, c8.ha.d(-1, 36.0f, org.telegram.messenger.qs.E1, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, c8.ha.d(-1, 36.0f, org.telegram.messenger.qs.E1, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        bi.x5 x5Var = new bi.x5(14, context, this);
        this.s = x5Var;
        frameLayout.addView(x5Var, c8.ha.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        fl0 fl0Var = new fl0();
        this.c = fl0Var;
        fl0Var.c(0, false, false);
        fl0Var.a(z9 ? hyVar.v(0.4f) : hyVar.z(org.telegram.ui.ActionBar.k6.yf));
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(fl0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rx
            public final /* synthetic */ ux b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        ux uxVar = this.b;
                        tx txVar = uxVar.r;
                        rp rpVar2 = uxVar.d;
                        if (uxVar.c.k == 1) {
                            rpVar2.setText("");
                            uxVar.c(null, false);
                            if (txVar != null) {
                                txVar.G1();
                                txVar.I1(null);
                                txVar.J1(true, true);
                            }
                            uxVar.f(false);
                            rpVar2.clearAnimation();
                            rpVar2.animate().translationX(0.0f).setInterpolator(xq.h).start();
                            uxVar.d(false);
                            break;
                        }
                        break;
                    default:
                        ux uxVar2 = this.b;
                        rp rpVar3 = uxVar2.d;
                        rpVar3.setText("");
                        uxVar2.c(null, false);
                        tx txVar2 = uxVar2.r;
                        if (txVar2 != null) {
                            txVar2.G1();
                            txVar2.I1(null);
                            txVar2.J1(true, true);
                        }
                        uxVar2.f(false);
                        rpVar3.clearAnimation();
                        rpVar3.animate().translationX(0.0f).setInterpolator(xq.h).start();
                        uxVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, c8.ha.e(36, 36, 51));
        rp rpVar2 = new rp(this, context, i7, i13);
        this.d = rpVar2;
        rpVar2.setTextSize(1, 16.0f);
        rpVar2.setHintTextColor(z9 ? hyVar.v(0.45f) : hyVar.z(org.telegram.ui.ActionBar.k6.yf));
        rpVar2.setTextColor(z9 ? hyVar.v(0.8f) : hyVar.z(org.telegram.ui.ActionBar.k6.G6));
        rpVar2.setBackgroundDrawable(null);
        rpVar2.setPadding(0, 0, 0, 0);
        rpVar2.setMaxLines(1);
        rpVar2.setLines(1);
        rpVar2.setSingleLine(true);
        rpVar2.setImeOptions(268435459);
        rpVar2.setHint(org.telegram.messenger.id.M0(2131745839, null));
        org.telegram.ui.ActionBar.r6.m(rpVar2, 30, org.telegram.ui.ActionBar.k6.Ai, f6Var);
        rpVar2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        rpVar2.setCursorWidth(1.5f);
        rpVar2.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        x5Var.addView(rpVar2, c8.ha.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        rpVar2.addTextChangedListener(new ah.j(this, 19));
        if (hyVar.u0) {
            View view3 = new View(context);
            this.w = view3;
            Drawable h = jg.g.h(context, R.drawable.gradient_right);
            org.telegram.ui.ActionBar.n6 q10 = org.telegram.ui.ActionBar.r6.q(org.telegram.ui.ActionBar.k6.wf, org.telegram.ui.ActionBar.k6.xf);
            rpVar = rpVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
            org.telegram.ui.ActionBar.r6.l(this, h, q10.a, q10.b, 4, 0.0f, f6Var, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(h);
            view3.setAlpha(0.0f);
            x5Var.addView(view3, c8.ha.e(18, -1, 3));
        } else {
            rpVar = rpVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new fi.c2(this));
        int i14 = org.telegram.ui.ActionBar.k6.i6;
        final int i15 = 1;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, f6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N, f6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.rx
            public final /* synthetic */ ux b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i15) {
                    case 0:
                        ux uxVar = this.b;
                        tx txVar = uxVar.r;
                        rp rpVar22 = uxVar.d;
                        if (uxVar.c.k == 1) {
                            rpVar22.setText("");
                            uxVar.c(null, false);
                            if (txVar != null) {
                                txVar.G1();
                                txVar.I1(null);
                                txVar.J1(true, true);
                            }
                            uxVar.f(false);
                            rpVar22.clearAnimation();
                            rpVar22.animate().translationX(0.0f).setInterpolator(xq.h).start();
                            uxVar.d(false);
                            break;
                        }
                        break;
                    default:
                        ux uxVar2 = this.b;
                        rp rpVar3 = uxVar2.d;
                        rpVar3.setText("");
                        uxVar2.c(null, false);
                        tx txVar2 = uxVar2.r;
                        if (txVar2 != null) {
                            txVar2.G1();
                            txVar2.I1(null);
                            txVar2.J1(true, true);
                        }
                        uxVar2.f(false);
                        rpVar3.clearAnimation();
                        rpVar3.animate().translationX(0.0f).setInterpolator(xq.h).start();
                        uxVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, c8.ha.e(36, 36, 53));
        if (i7 != 1 || (hyVar.c2 && org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q())) {
            tx txVar = new tx(this, context, i7 == 0 ? i10 : 0, hyVar.Z1, i7);
            this.r = txVar;
            txVar.D3 = z9;
            txVar.setDontOccupyWidth(org.telegram.messenger.g0.L(f10) + ((int) rpVar.getPaint().measureText(((Object) rpVar.getHint()) + "")));
            if (hyVar.u0) {
                org.telegram.ui.ActionBar.r6.j(txVar, org.telegram.ui.ActionBar.r6.q(org.telegram.ui.ActionBar.k6.wf, org.telegram.ui.ActionBar.k6.xf), f6Var);
            }
            final int i16 = 0;
            txVar.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.Components.sx
                public final /* synthetic */ ux b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.c20
                public final void a(Object obj) {
                    switch (i16) {
                        case 0:
                            Integer num = (Integer) obj;
                            ux uxVar = this.b;
                            uxVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            uxVar.d(num.intValue() > 0);
                            uxVar.g(false);
                            break;
                        default:
                            uu0 uu0Var = (uu0) obj;
                            ux uxVar2 = this.b;
                            hy hyVar2 = uxVar2.G;
                            tx txVar2 = uxVar2.r;
                            if (uu0Var != null) {
                                if (txVar2.getSelectedCategory() != uu0Var) {
                                    uxVar2.c(uu0Var.a, false);
                                    txVar2.I1(uu0Var);
                                    break;
                                } else {
                                    uxVar2.c(null, false);
                                    txVar2.I1(null);
                                    break;
                                }
                            } else {
                                uxVar2.d(false);
                                txVar2.I1(null);
                                hyVar2.o0.d.setText("");
                                hyVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            txVar.setOnTouchListener(new m.d2(this, 2));
            final int i17 = 1;
            txVar.setOnCategoryClick(new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.Components.sx
                public final /* synthetic */ ux b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.c20
                public final void a(Object obj) {
                    switch (i17) {
                        case 0:
                            Integer num = (Integer) obj;
                            ux uxVar = this.b;
                            uxVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            uxVar.d(num.intValue() > 0);
                            uxVar.g(false);
                            break;
                        default:
                            uu0 uu0Var = (uu0) obj;
                            ux uxVar2 = this.b;
                            hy hyVar2 = uxVar2.G;
                            tx txVar2 = uxVar2.r;
                            if (uu0Var != null) {
                                if (txVar2.getSelectedCategory() != uu0Var) {
                                    uxVar2.c(uu0Var.a, false);
                                    txVar2.I1(uu0Var);
                                    break;
                                } else {
                                    uxVar2.c(null, false);
                                    txVar2.I1(null);
                                    break;
                                }
                            } else {
                                uxVar2.d(false);
                                txVar2.I1(null);
                                hyVar2.o0.d.setText("");
                                hyVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(txVar, c8.ha.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public static void a(ux uxVar, boolean z9, boolean z10) {
        uxVar.a.a(z9, z10);
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            View view = this.e;
            view.setAlpha(f10);
            view.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    public final void b() {
        org.telegram.messenger.g0.v1(this.d);
    }

    public final void c(String str, boolean z9) {
        hy hyVar = this.G;
        int i7 = this.b;
        if (i7 != 0) {
            if (i7 == 1) {
                hyVar.S.F(str, z9);
                return;
            } else {
                if (i7 == 2) {
                    hyVar.j0.G(str, z9);
                    return;
                }
                return;
            }
        }
        cy cyVar = hyVar.z0;
        ay ayVar = cyVar.O;
        hy hyVar2 = cyVar.Q;
        tv tvVar = hyVar2.G0;
        qv qvVar = hyVar2.D0;
        if (cyVar.L != 0) {
            ConnectionsManager.getInstance(hyVar2.c1).cancelRequest(cyVar.L, true);
            cyVar.L = 0;
        }
        if (TextUtils.isEmpty(str)) {
            cyVar.N = null;
            cyVar.E.clear();
            cyVar.H.clear();
            cyVar.K = new ArrayList();
            v4.g0 adapter = qvVar.getAdapter();
            yx yxVar = hyVar2.y0;
            if (adapter != yxVar) {
                qvVar.setAdapter(yxVar);
            }
            cyVar.d = 0L;
            hyVar2.a.a(false, true);
            cyVar.f();
            tvVar.e(false);
        } else {
            cyVar.N = str.toLowerCase();
            tvVar.e(true);
        }
        org.telegram.messenger.g0.r(ayVar);
        org.telegram.messenger.g0.i3(ayVar, 300L);
    }

    public final void d(boolean z9) {
        if (z9 == this.y) {
            return;
        }
        this.y = z9;
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z9 ? 1.0f : 0.0f);
        this.D = ofFloat;
        ofFloat.addUpdateListener(new e6(this, 22));
        this.D.setDuration(120L);
        this.D.setInterpolator(xq.h);
        this.D.start();
    }

    public final void e(boolean z9) {
        this.F = z9;
        if (z9) {
            this.c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z9) {
        if (z9) {
            if (this.E == null) {
                gp gpVar = new gp(this, 14);
                this.E = gpVar;
                org.telegram.messenger.g0.i3(gpVar, 340L);
                return;
            }
            return;
        }
        gp gpVar2 = this.E;
        if (gpVar2 != null) {
            org.telegram.messenger.g0.r(gpVar2);
            this.E = null;
        }
        org.telegram.messenger.g0.V3(this.h, false, true);
    }

    public final void g(boolean z9) {
        boolean z10 = this.F;
        rp rpVar = this.d;
        tx txVar = this.r;
        if (!z10 || ((rpVar.length() == 0 && (txVar == null || txVar.getSelectedCategory() == null)) || z9)) {
            this.c.b((rpVar.length() > 0 || (txVar != null && txVar.v3 > 0.5f && (txVar.q3 || txVar.getSelectedCategory() != null))) ? 1 : 0);
            this.F = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            this.d.setCursorColor(this.G.z(org.telegram.ui.ActionBar.k6.Ai));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }
}
