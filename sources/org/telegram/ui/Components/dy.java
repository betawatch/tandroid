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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class dy extends FrameLayout implements org.telegram.ui.ActionBar.c6, te.b {
    public ValueAnimator E;
    public lo F;
    public boolean G;
    public final /* synthetic */ qy H;
    public final te.a a;
    public final int b;
    public final ul0 c;
    public final fq d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final cy r;
    public final ai.h0 s;
    public final View w;
    public float x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy(qy qyVar, Context context, int i7) {
        super(context);
        fq fqVar;
        ImageView.ScaleType scaleType;
        int i10;
        float f10;
        this.H = qyVar;
        this.a = new te.a(0, this, kr.g, 200L, false);
        final int i11 = 0;
        this.y = false;
        org.telegram.ui.ActionBar.t6 t6Var = org.telegram.ui.ActionBar.u6.a;
        this.b = i7;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int i12 = org.telegram.ui.ActionBar.n6.Cf;
        org.telegram.ui.ActionBar.i6 i6Var = qyVar.a2;
        boolean z10 = qyVar.j2;
        org.telegram.ui.ActionBar.u6.h(i12, view, i6Var);
        addView(view, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (qyVar.v0) {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.zf, view2, i6Var);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, qyVar.c1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(18.0f), z10 ? qyVar.v(0.06f) : qyVar.z(org.telegram.ui.ActionBar.n6.Af)));
        frameLayout.setClipToOutline(true);
        float L = org.telegram.messenger.g0.L(18.0f);
        bg.q0 q0Var = bg.u0.a;
        frameLayout.setOutlineProvider(new bg.s0(0, L));
        int i13 = 2;
        if (i7 == 2) {
            addView(frameLayout, c8.na.d(-1, 36.0f, org.telegram.messenger.ks.E1, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, c8.na.d(-1, 36.0f, org.telegram.messenger.ks.E1, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ai.h0 h0Var = new ai.h0(17, context, this);
        this.s = h0Var;
        frameLayout.addView(h0Var, c8.na.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ul0 ul0Var = new ul0();
        this.c = ul0Var;
        ul0Var.c(0, false, false);
        ul0Var.a(z10 ? qyVar.v(0.4f) : qyVar.z(org.telegram.ui.ActionBar.n6.Bf));
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(ul0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zx
            public final /* synthetic */ dy b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        dy dyVar = this.b;
                        cy cyVar = dyVar.r;
                        fq fqVar2 = dyVar.d;
                        if (dyVar.c.k == 1) {
                            fqVar2.setText("");
                            dyVar.c(null, false);
                            if (cyVar != null) {
                                cyVar.G1();
                                cyVar.I1(null);
                                cyVar.J1(true, true);
                            }
                            dyVar.f(false);
                            fqVar2.clearAnimation();
                            fqVar2.animate().translationX(0.0f).setInterpolator(kr.h).start();
                            dyVar.d(false);
                            break;
                        }
                        break;
                    default:
                        dy dyVar2 = this.b;
                        fq fqVar3 = dyVar2.d;
                        fqVar3.setText("");
                        dyVar2.c(null, false);
                        cy cyVar2 = dyVar2.r;
                        if (cyVar2 != null) {
                            cyVar2.G1();
                            cyVar2.I1(null);
                            cyVar2.J1(true, true);
                        }
                        dyVar2.f(false);
                        fqVar3.clearAnimation();
                        fqVar3.animate().translationX(0.0f).setInterpolator(kr.h).start();
                        dyVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, c8.na.e(36, 36, 51));
        fq fqVar2 = new fq(this, context, i7, i13);
        this.d = fqVar2;
        fqVar2.setTextSize(1, 16.0f);
        fqVar2.setHintTextColor(z10 ? qyVar.v(0.45f) : qyVar.z(org.telegram.ui.ActionBar.n6.Bf));
        fqVar2.setTextColor(z10 ? qyVar.v(0.8f) : qyVar.z(org.telegram.ui.ActionBar.n6.G6));
        fqVar2.setBackgroundDrawable(null);
        fqVar2.setPadding(0, 0, 0, 0);
        fqVar2.setMaxLines(1);
        fqVar2.setLines(1);
        fqVar2.setSingleLine(true);
        fqVar2.setImeOptions(268435459);
        fqVar2.setHint(org.telegram.messenger.gd.N0(2131745640, null));
        org.telegram.ui.ActionBar.u6.l(fqVar2, 30, org.telegram.ui.ActionBar.n6.Di, i6Var);
        fqVar2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        fqVar2.setCursorWidth(1.5f);
        fqVar2.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        h0Var.addView(fqVar2, c8.na.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        fqVar2.addTextChangedListener(new ah.j(this, 22));
        if (qyVar.v0) {
            View view3 = new View(context);
            this.w = view3;
            Drawable g10 = i5.c.g(context, R.drawable.gradient_right);
            org.telegram.ui.ActionBar.q6 p10 = org.telegram.ui.ActionBar.u6.p(org.telegram.ui.ActionBar.n6.zf, org.telegram.ui.ActionBar.n6.Af);
            fqVar = fqVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
            org.telegram.ui.ActionBar.u6.k(this, g10, p10.a, p10.b, 4, 0.0f, i6Var, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(g10);
            view3.setAlpha(0.0f);
            h0Var.addView(view3, c8.na.e(18, -1, 3));
        } else {
            fqVar = fqVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new hi.j2(this));
        int i14 = org.telegram.ui.ActionBar.n6.i6;
        final int i15 = 1;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i14, i6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView2, h02, null, M, i6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zx
            public final /* synthetic */ dy b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i15) {
                    case 0:
                        dy dyVar = this.b;
                        cy cyVar = dyVar.r;
                        fq fqVar22 = dyVar.d;
                        if (dyVar.c.k == 1) {
                            fqVar22.setText("");
                            dyVar.c(null, false);
                            if (cyVar != null) {
                                cyVar.G1();
                                cyVar.I1(null);
                                cyVar.J1(true, true);
                            }
                            dyVar.f(false);
                            fqVar22.clearAnimation();
                            fqVar22.animate().translationX(0.0f).setInterpolator(kr.h).start();
                            dyVar.d(false);
                            break;
                        }
                        break;
                    default:
                        dy dyVar2 = this.b;
                        fq fqVar3 = dyVar2.d;
                        fqVar3.setText("");
                        dyVar2.c(null, false);
                        cy cyVar2 = dyVar2.r;
                        if (cyVar2 != null) {
                            cyVar2.G1();
                            cyVar2.I1(null);
                            cyVar2.J1(true, true);
                        }
                        dyVar2.f(false);
                        fqVar3.clearAnimation();
                        fqVar3.animate().translationX(0.0f).setInterpolator(kr.h).start();
                        dyVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, c8.na.e(36, 36, 53));
        if (i7 != 1 || (qyVar.d2 && org.telegram.messenger.i10.i(org.telegram.messenger.i10.t0).q())) {
            cy cyVar = new cy(this, context, i7 == 0 ? i10 : 0, qyVar.a2, i7);
            this.r = cyVar;
            cyVar.E3 = z10;
            cyVar.setDontOccupyWidth(org.telegram.messenger.g0.L(f10) + ((int) fqVar.getPaint().measureText(((Object) fqVar.getHint()) + "")));
            if (qyVar.v0) {
                org.telegram.ui.ActionBar.u6.i(cyVar, org.telegram.ui.ActionBar.u6.p(org.telegram.ui.ActionBar.n6.zf, org.telegram.ui.ActionBar.n6.Af), i6Var);
            }
            final int i16 = 0;
            cyVar.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.w10(this) { // from class: org.telegram.ui.Components.ay
                public final /* synthetic */ dy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.w10
                public final void a(Object obj) {
                    switch (i16) {
                        case 0:
                            Integer num = (Integer) obj;
                            dy dyVar = this.b;
                            dyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            dyVar.d(num.intValue() > 0);
                            dyVar.g(false);
                            break;
                        default:
                            gv0 gv0Var = (gv0) obj;
                            dy dyVar2 = this.b;
                            qy qyVar2 = dyVar2.H;
                            cy cyVar2 = dyVar2.r;
                            if (gv0Var != null) {
                                if (cyVar2.getSelectedCategory() != gv0Var) {
                                    dyVar2.c(gv0Var.a, false);
                                    cyVar2.I1(gv0Var);
                                    break;
                                } else {
                                    dyVar2.c(null, false);
                                    cyVar2.I1(null);
                                    break;
                                }
                            } else {
                                dyVar2.d(false);
                                cyVar2.I1(null);
                                qyVar2.p0.d.setText("");
                                qyVar2.j0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            cyVar.setOnTouchListener(new m.c2(this, 2));
            final int i17 = 1;
            cyVar.setOnCategoryClick(new org.telegram.messenger.w10(this) { // from class: org.telegram.ui.Components.ay
                public final /* synthetic */ dy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.w10
                public final void a(Object obj) {
                    switch (i17) {
                        case 0:
                            Integer num = (Integer) obj;
                            dy dyVar = this.b;
                            dyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            dyVar.d(num.intValue() > 0);
                            dyVar.g(false);
                            break;
                        default:
                            gv0 gv0Var = (gv0) obj;
                            dy dyVar2 = this.b;
                            qy qyVar2 = dyVar2.H;
                            cy cyVar2 = dyVar2.r;
                            if (gv0Var != null) {
                                if (cyVar2.getSelectedCategory() != gv0Var) {
                                    dyVar2.c(gv0Var.a, false);
                                    cyVar2.I1(gv0Var);
                                    break;
                                } else {
                                    dyVar2.c(null, false);
                                    cyVar2.I1(null);
                                    break;
                                }
                            } else {
                                dyVar2.d(false);
                                cyVar2.I1(null);
                                qyVar2.p0.d.setText("");
                                qyVar2.j0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(cyVar, c8.na.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public static void a(dy dyVar, boolean z10, boolean z11) {
        dyVar.a.a(z10, z11);
    }

    @Override // te.b
    public final void K(int i7, float f10, float f11, te.c cVar) {
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
        qy qyVar = this.H;
        int i7 = this.b;
        if (i7 != 0) {
            if (i7 == 1) {
                qyVar.T.F(str, z10);
                return;
            } else {
                if (i7 == 2) {
                    qyVar.k0.G(str, z10);
                    return;
                }
                return;
            }
        }
        ly lyVar = qyVar.A0;
        ky kyVar = lyVar.P;
        qy qyVar2 = lyVar.R;
        dw dwVar = qyVar2.H0;
        aw awVar = qyVar2.E0;
        if (lyVar.M != 0) {
            ConnectionsManager.getInstance(qyVar2.d1).cancelRequest(lyVar.M, true);
            lyVar.M = 0;
        }
        if (TextUtils.isEmpty(str)) {
            lyVar.O = null;
            lyVar.F.clear();
            lyVar.I.clear();
            lyVar.L = new ArrayList();
            v4.i0 adapter = awVar.getAdapter();
            iy iyVar = qyVar2.z0;
            if (adapter != iyVar) {
                awVar.setAdapter(iyVar);
            }
            lyVar.d = 0L;
            qyVar2.a.a(false, true);
            lyVar.f();
            dwVar.e(false);
        } else {
            lyVar.O = str.toLowerCase();
            dwVar.e(true);
        }
        org.telegram.messenger.g0.r(kyVar);
        org.telegram.messenger.g0.h3(kyVar, 300L);
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
        this.E.setInterpolator(kr.h);
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
                lo loVar = new lo(this, 16);
                this.F = loVar;
                org.telegram.messenger.g0.h3(loVar, 340L);
                return;
            }
            return;
        }
        lo loVar2 = this.F;
        if (loVar2 != null) {
            org.telegram.messenger.g0.r(loVar2);
            this.F = null;
        }
        org.telegram.messenger.g0.T3(this.h, false, true);
    }

    public final void g(boolean z10) {
        boolean z11 = this.G;
        fq fqVar = this.d;
        cy cyVar = this.r;
        if (!z11 || ((fqVar.length() == 0 && (cyVar == null || cyVar.getSelectedCategory() == null)) || z10)) {
            this.c.b((fqVar.length() > 0 || (cyVar != null && cyVar.w3 > 0.5f && (cyVar.r3 || cyVar.getSelectedCategory() != null))) ? 1 : 0);
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
    public final /* synthetic */ void G(float f10, int i7) {
    }
}
