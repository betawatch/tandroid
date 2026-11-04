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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class rx extends FrameLayout implements org.telegram.ui.ActionBar.z5, qe.b {
    public ValueAnimator E;
    public gp F;
    public boolean G;
    public final /* synthetic */ ey H;
    public final qe.a a;
    public final int b;
    public final jl0 c;
    public final rp d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final qx r;
    public final ai.c0 s;
    public final View w;
    public float x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx(ey eyVar, Context context, int i3) {
        super(context);
        rp rpVar;
        ImageView.ScaleType scaleType;
        int i10;
        float f10;
        this.H = eyVar;
        this.a = new qe.a(0, this, xq.g, 200L, false);
        final int i11 = 0;
        this.y = false;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.a;
        this.b = i3;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int i12 = org.telegram.ui.ActionBar.k6.zf;
        org.telegram.ui.ActionBar.e6 e6Var = eyVar.a2;
        boolean z10 = eyVar.j2;
        org.telegram.ui.ActionBar.r6.i(i12, view, e6Var);
        addView(view, new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (eyVar.v0) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.wf, view2, e6Var);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, eyVar.c1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(18.0f), z10 ? eyVar.v(0.06f) : eyVar.z(org.telegram.ui.ActionBar.k6.xf)));
        frameLayout.setClipToOutline(true);
        float L = org.telegram.messenger.g0.L(18.0f);
        cg.p0 p0Var = cg.t0.a;
        frameLayout.setOutlineProvider(new cg.r0(0, L));
        int i13 = 2;
        if (i3 == 2) {
            addView(frameLayout, b8.mf.d(-1, 36.0f, org.telegram.messenger.hs.E1, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, b8.mf.d(-1, 36.0f, org.telegram.messenger.hs.E1, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        ai.c0 c0Var = new ai.c0(15, context, this);
        this.s = c0Var;
        frameLayout.addView(c0Var, b8.mf.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        jl0 jl0Var = new jl0();
        this.c = jl0Var;
        jl0Var.c(0, false, false);
        jl0Var.a(z10 ? eyVar.v(0.4f) : eyVar.z(org.telegram.ui.ActionBar.k6.yf));
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(jl0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ox
            public final /* synthetic */ rx b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        rx rxVar = this.b;
                        qx qxVar = rxVar.r;
                        rp rpVar2 = rxVar.d;
                        if (rxVar.c.k == 1) {
                            rpVar2.setText("");
                            rxVar.c(null, false);
                            if (qxVar != null) {
                                qxVar.G1();
                                qxVar.I1(null);
                                qxVar.J1(true, true);
                            }
                            rxVar.f(false);
                            rpVar2.clearAnimation();
                            rpVar2.animate().translationX(0.0f).setInterpolator(xq.h).start();
                            rxVar.d(false);
                            break;
                        }
                        break;
                    default:
                        rx rxVar2 = this.b;
                        rp rpVar3 = rxVar2.d;
                        rpVar3.setText("");
                        rxVar2.c(null, false);
                        qx qxVar2 = rxVar2.r;
                        if (qxVar2 != null) {
                            qxVar2.G1();
                            qxVar2.I1(null);
                            qxVar2.J1(true, true);
                        }
                        rxVar2.f(false);
                        rpVar3.clearAnimation();
                        rpVar3.animate().translationX(0.0f).setInterpolator(xq.h).start();
                        rxVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, b8.mf.e(36, 36, 51));
        rp rpVar2 = new rp(this, context, i3, i13);
        this.d = rpVar2;
        rpVar2.setTextSize(1, 16.0f);
        rpVar2.setHintTextColor(z10 ? eyVar.v(0.45f) : eyVar.z(org.telegram.ui.ActionBar.k6.yf));
        rpVar2.setTextColor(z10 ? eyVar.v(0.8f) : eyVar.z(org.telegram.ui.ActionBar.k6.G6));
        rpVar2.setBackgroundDrawable(null);
        rpVar2.setPadding(0, 0, 0, 0);
        rpVar2.setMaxLines(1);
        rpVar2.setLines(1);
        rpVar2.setSingleLine(true);
        rpVar2.setImeOptions(268435459);
        rpVar2.setHint(org.telegram.messenger.bd.M0(2131745846, null));
        org.telegram.ui.ActionBar.r6.m(rpVar2, 30, org.telegram.ui.ActionBar.k6.Ai, e6Var);
        rpVar2.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        rpVar2.setCursorWidth(1.5f);
        rpVar2.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        c0Var.addView(rpVar2, b8.mf.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        rpVar2.addTextChangedListener(new bh.h(this, 19));
        if (eyVar.v0) {
            View view3 = new View(context);
            this.w = view3;
            Drawable g7 = k2.p1.g(context, R.drawable.gradient_right);
            org.telegram.ui.ActionBar.n6 q10 = org.telegram.ui.ActionBar.r6.q(org.telegram.ui.ActionBar.k6.wf, org.telegram.ui.ActionBar.k6.xf);
            rpVar = rpVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
            org.telegram.ui.ActionBar.r6.l(this, g7, q10.a, q10.b, 4, 0.0f, e6Var, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(g7);
            view3.setAlpha(0.0f);
            c0Var.addView(view3, b8.mf.e(18, -1, 3));
        } else {
            rpVar = rpVar2;
            scaleType = scaleType2;
            i10 = 3;
            f10 = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new gi.b2(this));
        int i14 = org.telegram.ui.ActionBar.k6.i6;
        final int i15 = 1;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i14, e6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i14);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N, e6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ox
            public final /* synthetic */ rx b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i15) {
                    case 0:
                        rx rxVar = this.b;
                        qx qxVar = rxVar.r;
                        rp rpVar22 = rxVar.d;
                        if (rxVar.c.k == 1) {
                            rpVar22.setText("");
                            rxVar.c(null, false);
                            if (qxVar != null) {
                                qxVar.G1();
                                qxVar.I1(null);
                                qxVar.J1(true, true);
                            }
                            rxVar.f(false);
                            rpVar22.clearAnimation();
                            rpVar22.animate().translationX(0.0f).setInterpolator(xq.h).start();
                            rxVar.d(false);
                            break;
                        }
                        break;
                    default:
                        rx rxVar2 = this.b;
                        rp rpVar3 = rxVar2.d;
                        rpVar3.setText("");
                        rxVar2.c(null, false);
                        qx qxVar2 = rxVar2.r;
                        if (qxVar2 != null) {
                            qxVar2.G1();
                            qxVar2.I1(null);
                            qxVar2.J1(true, true);
                        }
                        rxVar2.f(false);
                        rpVar3.clearAnimation();
                        rpVar3.animate().translationX(0.0f).setInterpolator(xq.h).start();
                        rxVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, b8.mf.e(36, 36, 53));
        if (i3 != 1 || (eyVar.d2 && org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).q())) {
            qx qxVar = new qx(this, context, i3 == 0 ? i10 : 0, eyVar.a2, i3);
            this.r = qxVar;
            qxVar.E3 = z10;
            qxVar.setDontOccupyWidth(org.telegram.messenger.g0.L(f10) + ((int) rpVar.getPaint().measureText(((Object) rpVar.getHint()) + "")));
            if (eyVar.v0) {
                org.telegram.ui.ActionBar.r6.j(qxVar, org.telegram.ui.ActionBar.r6.q(org.telegram.ui.ActionBar.k6.wf, org.telegram.ui.ActionBar.k6.xf), e6Var);
            }
            final int i16 = 0;
            qxVar.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.u10(this) { // from class: org.telegram.ui.Components.px
                public final /* synthetic */ rx b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.u10
                public final void a(Object obj) {
                    switch (i16) {
                        case 0:
                            Integer num = (Integer) obj;
                            rx rxVar = this.b;
                            rxVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            rxVar.d(num.intValue() > 0);
                            rxVar.g(false);
                            break;
                        default:
                            tu0 tu0Var = (tu0) obj;
                            rx rxVar2 = this.b;
                            ey eyVar2 = rxVar2.H;
                            qx qxVar2 = rxVar2.r;
                            if (tu0Var != null) {
                                if (qxVar2.getSelectedCategory() != tu0Var) {
                                    rxVar2.c(tu0Var.a, false);
                                    qxVar2.I1(tu0Var);
                                    break;
                                } else {
                                    rxVar2.c(null, false);
                                    qxVar2.I1(null);
                                    break;
                                }
                            } else {
                                rxVar2.d(false);
                                qxVar2.I1(null);
                                eyVar2.p0.d.setText("");
                                eyVar2.j0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            qxVar.setOnTouchListener(new m.c2(this, 2));
            final int i17 = 1;
            qxVar.setOnCategoryClick(new org.telegram.messenger.u10(this) { // from class: org.telegram.ui.Components.px
                public final /* synthetic */ rx b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.u10
                public final void a(Object obj) {
                    switch (i17) {
                        case 0:
                            Integer num = (Integer) obj;
                            rx rxVar = this.b;
                            rxVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            rxVar.d(num.intValue() > 0);
                            rxVar.g(false);
                            break;
                        default:
                            tu0 tu0Var = (tu0) obj;
                            rx rxVar2 = this.b;
                            ey eyVar2 = rxVar2.H;
                            qx qxVar2 = rxVar2.r;
                            if (tu0Var != null) {
                                if (qxVar2.getSelectedCategory() != tu0Var) {
                                    rxVar2.c(tu0Var.a, false);
                                    qxVar2.I1(tu0Var);
                                    break;
                                } else {
                                    rxVar2.c(null, false);
                                    qxVar2.I1(null);
                                    break;
                                }
                            } else {
                                rxVar2.d(false);
                                qxVar2.I1(null);
                                eyVar2.p0.d.setText("");
                                eyVar2.j0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(qxVar, b8.mf.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public static void a(rx rxVar, boolean z10, boolean z11) {
        rxVar.a.a(z10, z11);
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 0) {
            View view = this.e;
            view.setAlpha(f10);
            view.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    public final void b() {
        org.telegram.messenger.g0.v1(this.d);
    }

    public final void c(String str, boolean z10) {
        ey eyVar = this.H;
        int i3 = this.b;
        if (i3 != 0) {
            if (i3 == 1) {
                eyVar.T.F(str, z10);
                return;
            } else {
                if (i3 == 2) {
                    eyVar.k0.G(str, z10);
                    return;
                }
                return;
            }
        }
        yx yxVar = eyVar.A0;
        xx xxVar = yxVar.P;
        ey eyVar2 = yxVar.R;
        rv rvVar = eyVar2.H0;
        ov ovVar = eyVar2.E0;
        if (yxVar.M != 0) {
            ConnectionsManager.getInstance(eyVar2.d1).cancelRequest(yxVar.M, true);
            yxVar.M = 0;
        }
        if (TextUtils.isEmpty(str)) {
            yxVar.O = null;
            yxVar.F.clear();
            yxVar.I.clear();
            yxVar.L = new ArrayList();
            u4.h0 adapter = ovVar.getAdapter();
            vx vxVar = eyVar2.z0;
            if (adapter != vxVar) {
                ovVar.setAdapter(vxVar);
            }
            yxVar.d = 0L;
            eyVar2.a.a(false, true);
            yxVar.f();
            rvVar.e(false);
        } else {
            yxVar.O = str.toLowerCase();
            rvVar.e(true);
        }
        org.telegram.messenger.g0.r(xxVar);
        org.telegram.messenger.g0.i3(xxVar, 300L);
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
        ofFloat.addUpdateListener(new c6(this, 22));
        this.E.setDuration(120L);
        this.E.setInterpolator(xq.h);
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
                gp gpVar = new gp(this, 14);
                this.F = gpVar;
                org.telegram.messenger.g0.i3(gpVar, 340L);
                return;
            }
            return;
        }
        gp gpVar2 = this.F;
        if (gpVar2 != null) {
            org.telegram.messenger.g0.r(gpVar2);
            this.F = null;
        }
        org.telegram.messenger.g0.V3(this.h, false, true);
    }

    public final void g(boolean z10) {
        boolean z11 = this.G;
        rp rpVar = this.d;
        qx qxVar = this.r;
        if (!z11 || ((rpVar.length() == 0 && (qxVar == null || qxVar.getSelectedCategory() == null)) || z10)) {
            this.c.b((rpVar.length() > 0 || (qxVar != null && qxVar.w3 > 0.5f && (qxVar.r3 || qxVar.getSelectedCategory() != null))) ? 1 : 0);
            this.G = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.d.setCursorColor(this.H.z(org.telegram.ui.ActionBar.k6.Ai));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }
}
