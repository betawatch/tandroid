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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class iy extends FrameLayout implements org.telegram.ui.ActionBar.k6, fe.e {
    public ValueAnimator D;
    public ho E;
    public boolean F;
    public final /* synthetic */ vy G;
    public final fe.b a;
    public final int b;
    public final im0 c;
    public final yp d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final hy r;
    public final fg.i s;
    public final View w;
    public float x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy(vy vyVar, Context context, int i10) {
        super(context);
        yp ypVar;
        ImageView.ScaleType scaleType;
        int i11;
        float f7;
        this.G = vyVar;
        this.a = new fe.b(0, this, gr.g, 200L, false);
        final int i12 = 0;
        this.y = false;
        org.telegram.ui.ActionBar.z6 z6Var = org.telegram.ui.ActionBar.a7.a;
        this.b = i10;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int i13 = org.telegram.ui.ActionBar.t6.zf;
        org.telegram.ui.ActionBar.p6 p6Var = vyVar.Z1;
        boolean z10 = vyVar.i2;
        org.telegram.ui.ActionBar.a7.i(i13, view, p6Var);
        addView(view, new FrameLayout.LayoutParams(-1, org.telegram.messenger.i0.f1(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (vyVar.u0) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.wf, view2, p6Var);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, vyVar.b1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(18.0f), z10 ? vyVar.w(0.06f) : vyVar.A(org.telegram.ui.ActionBar.t6.xf)));
        frameLayout.setClipToOutline(true);
        float L = org.telegram.messenger.i0.L(18.0f);
        bi.d2 d2Var = rf.e0.a;
        frameLayout.setOutlineProvider(new rf.c0(0, L));
        int i14 = 2;
        if (i10 == 2) {
            addView(frameLayout, w7.b6.d(-1, 36.0f, org.telegram.messenger.zs.E1, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, w7.b6.d(-1, 36.0f, org.telegram.messenger.zs.E1, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        fg.i iVar = new fg.i(this, context, 12);
        this.s = iVar;
        frameLayout.addView(iVar, w7.b6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        im0 im0Var = new im0();
        this.c = im0Var;
        im0Var.c(0, false, false);
        im0Var.a(z10 ? vyVar.w(0.4f) : vyVar.A(org.telegram.ui.ActionBar.t6.yf));
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(im0Var);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fy
            public final /* synthetic */ iy b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i12) {
                    case 0:
                        iy iyVar = this.b;
                        hy hyVar = iyVar.r;
                        yp ypVar2 = iyVar.d;
                        if (iyVar.c.k == 1) {
                            ypVar2.setText("");
                            iyVar.c(null, false);
                            if (hyVar != null) {
                                hyVar.G1();
                                hyVar.I1(null);
                                hyVar.J1(true, true);
                            }
                            iyVar.f(false);
                            ypVar2.clearAnimation();
                            ypVar2.animate().translationX(0.0f).setInterpolator(gr.h).start();
                            iyVar.d(false);
                            break;
                        }
                        break;
                    default:
                        iy iyVar2 = this.b;
                        yp ypVar3 = iyVar2.d;
                        ypVar3.setText("");
                        iyVar2.c(null, false);
                        hy hyVar2 = iyVar2.r;
                        if (hyVar2 != null) {
                            hyVar2.G1();
                            hyVar2.I1(null);
                            hyVar2.J1(true, true);
                        }
                        iyVar2.f(false);
                        ypVar3.clearAnimation();
                        ypVar3.animate().translationX(0.0f).setInterpolator(gr.h).start();
                        iyVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView, w7.b6.e(36, 36, 51));
        yp ypVar2 = new yp(this, context, i10, i14);
        this.d = ypVar2;
        ypVar2.setTextSize(1, 16.0f);
        ypVar2.setHintTextColor(z10 ? vyVar.w(0.45f) : vyVar.A(org.telegram.ui.ActionBar.t6.yf));
        ypVar2.setTextColor(z10 ? vyVar.w(0.8f) : vyVar.A(org.telegram.ui.ActionBar.t6.G6));
        ypVar2.setBackgroundDrawable(null);
        ypVar2.setPadding(0, 0, 0, 0);
        ypVar2.setMaxLines(1);
        ypVar2.setLines(1);
        ypVar2.setSingleLine(true);
        ypVar2.setImeOptions(268435459);
        ypVar2.setHint(org.telegram.messenger.cd.L0(2131745853, null));
        org.telegram.ui.ActionBar.a7.m(ypVar2, 30, org.telegram.ui.ActionBar.t6.Ai, p6Var);
        ypVar2.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        ypVar2.setCursorWidth(1.5f);
        ypVar2.setTranslationY(org.telegram.messenger.i0.L(-2.0f));
        iVar.addView(ypVar2, w7.b6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        ypVar2.addTextChangedListener(new ag.a1(this, 14));
        if (vyVar.u0) {
            View view3 = new View(context);
            this.w = view3;
            Drawable f10 = i0.a.f(context, R.drawable.gradient_right);
            org.telegram.ui.ActionBar.w6 q6 = org.telegram.ui.ActionBar.a7.q(org.telegram.ui.ActionBar.t6.wf, org.telegram.ui.ActionBar.t6.xf);
            ypVar = ypVar2;
            scaleType = scaleType2;
            i11 = 3;
            f7 = 16.0f;
            org.telegram.ui.ActionBar.a7.l(this, f10, q6.a, q6.b, 4, 0.0f, p6Var, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(f10);
            view3.setAlpha(0.0f);
            iVar.addView(view3, w7.b6.e(18, -1, 3));
        } else {
            ypVar = ypVar2;
            scaleType = scaleType2;
            i11 = 3;
            f7 = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new org.telegram.ui.ActionBar.h0(this));
        int i15 = org.telegram.ui.ActionBar.t6.i6;
        final int i16 = 1;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i15, p6Var), 1, org.telegram.messenger.i0.L(15.0f));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i15);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView2, h02, null, N, p6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.fy
            public final /* synthetic */ iy b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i16) {
                    case 0:
                        iy iyVar = this.b;
                        hy hyVar = iyVar.r;
                        yp ypVar22 = iyVar.d;
                        if (iyVar.c.k == 1) {
                            ypVar22.setText("");
                            iyVar.c(null, false);
                            if (hyVar != null) {
                                hyVar.G1();
                                hyVar.I1(null);
                                hyVar.J1(true, true);
                            }
                            iyVar.f(false);
                            ypVar22.clearAnimation();
                            ypVar22.animate().translationX(0.0f).setInterpolator(gr.h).start();
                            iyVar.d(false);
                            break;
                        }
                        break;
                    default:
                        iy iyVar2 = this.b;
                        yp ypVar3 = iyVar2.d;
                        ypVar3.setText("");
                        iyVar2.c(null, false);
                        hy hyVar2 = iyVar2.r;
                        if (hyVar2 != null) {
                            hyVar2.G1();
                            hyVar2.I1(null);
                            hyVar2.J1(true, true);
                        }
                        iyVar2.f(false);
                        ypVar3.clearAnimation();
                        ypVar3.animate().translationX(0.0f).setInterpolator(gr.h).start();
                        iyVar2.d(false);
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, w7.b6.e(36, 36, 53));
        if (i10 != 1 || (vyVar.c2 && org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).q())) {
            hy hyVar = new hy(this, context, i10 == 0 ? i11 : 0, vyVar.Z1, i10);
            this.r = hyVar;
            hyVar.D3 = z10;
            hyVar.setDontOccupyWidth(org.telegram.messenger.i0.L(f7) + ((int) ypVar.getPaint().measureText(((Object) ypVar.getHint()) + "")));
            if (vyVar.u0) {
                org.telegram.ui.ActionBar.a7.j(hyVar, org.telegram.ui.ActionBar.a7.q(org.telegram.ui.ActionBar.t6.wf, org.telegram.ui.ActionBar.t6.xf), p6Var);
            }
            final int i17 = 0;
            hyVar.setOnScrollIntoOccupiedWidth(new org.telegram.messenger.q20(this) { // from class: org.telegram.ui.Components.gy
                public final /* synthetic */ iy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.q20
                public final void a(Object obj) {
                    switch (i17) {
                        case 0:
                            Integer num = (Integer) obj;
                            iy iyVar = this.b;
                            iyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            iyVar.d(num.intValue() > 0);
                            iyVar.g(false);
                            break;
                        default:
                            xv0 xv0Var = (xv0) obj;
                            iy iyVar2 = this.b;
                            vy vyVar2 = iyVar2.G;
                            hy hyVar2 = iyVar2.r;
                            if (xv0Var != null) {
                                if (hyVar2.getSelectedCategory() != xv0Var) {
                                    iyVar2.c(xv0Var.a, false);
                                    hyVar2.I1(xv0Var);
                                    break;
                                } else {
                                    iyVar2.c(null, false);
                                    hyVar2.I1(null);
                                    break;
                                }
                            } else {
                                iyVar2.d(false);
                                hyVar2.I1(null);
                                vyVar2.o0.d.setText("");
                                vyVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            hyVar.setOnTouchListener(new m.c2(this, 2));
            final int i18 = 1;
            hyVar.setOnCategoryClick(new org.telegram.messenger.q20(this) { // from class: org.telegram.ui.Components.gy
                public final /* synthetic */ iy b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.q20
                public final void a(Object obj) {
                    switch (i18) {
                        case 0:
                            Integer num = (Integer) obj;
                            iy iyVar = this.b;
                            iyVar.d.setTranslationX(-Math.max(0, num.intValue()));
                            iyVar.d(num.intValue() > 0);
                            iyVar.g(false);
                            break;
                        default:
                            xv0 xv0Var = (xv0) obj;
                            iy iyVar2 = this.b;
                            vy vyVar2 = iyVar2.G;
                            hy hyVar2 = iyVar2.r;
                            if (xv0Var != null) {
                                if (hyVar2.getSelectedCategory() != xv0Var) {
                                    iyVar2.c(xv0Var.a, false);
                                    hyVar2.I1(xv0Var);
                                    break;
                                } else {
                                    iyVar2.c(null, false);
                                    hyVar2.I1(null);
                                    break;
                                }
                            } else {
                                iyVar2.d(false);
                                hyVar2.I1(null);
                                vyVar2.o0.d.setText("");
                                vyVar2.i0.h1(0, 0);
                                break;
                            }
                    }
                }
            });
            frameLayout.addView(hyVar, w7.b6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public static void a(iy iyVar, boolean z10, boolean z11) {
        iyVar.a.a(z10, z11);
    }

    public final void b() {
        org.telegram.messenger.i0.v1(this.d);
    }

    public final void c(String str, boolean z10) {
        vy vyVar = this.G;
        int i10 = this.b;
        if (i10 != 0) {
            if (i10 == 1) {
                vyVar.S.F(str, z10);
                return;
            } else {
                if (i10 == 2) {
                    vyVar.j0.G(str, z10);
                    return;
                }
                return;
            }
        }
        qy qyVar = vyVar.z0;
        py pyVar = qyVar.O;
        vy vyVar2 = qyVar.Q;
        fw fwVar = vyVar2.G0;
        bw bwVar = vyVar2.D0;
        if (qyVar.L != 0) {
            ConnectionsManager.getInstance(vyVar2.c1).cancelRequest(qyVar.L, true);
            qyVar.L = 0;
        }
        if (TextUtils.isEmpty(str)) {
            qyVar.N = null;
            qyVar.E.clear();
            qyVar.H.clear();
            qyVar.K = new ArrayList();
            s4.g0 adapter = bwVar.getAdapter();
            ny nyVar = vyVar2.y0;
            if (adapter != nyVar) {
                bwVar.setAdapter(nyVar);
            }
            qyVar.d = 0L;
            vyVar2.a.a(false, true);
            qyVar.f();
            fwVar.e(false);
        } else {
            qyVar.N = str.toLowerCase();
            fwVar.e(true);
        }
        org.telegram.messenger.i0.r(pyVar);
        org.telegram.messenger.i0.h3(pyVar, 300L);
    }

    public final void d(boolean z10) {
        if (z10 == this.y) {
            return;
        }
        this.y = z10;
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, z10 ? 1.0f : 0.0f);
        this.D = ofFloat;
        ofFloat.addUpdateListener(new a6(this, 22));
        this.D.setDuration(120L);
        this.D.setInterpolator(gr.h);
        this.D.start();
    }

    public final void e(boolean z10) {
        this.F = z10;
        if (z10) {
            this.c.b(2);
        } else {
            g(true);
        }
    }

    public final void f(boolean z10) {
        if (z10) {
            if (this.E == null) {
                ho hoVar = new ho(this, 16);
                this.E = hoVar;
                org.telegram.messenger.i0.h3(hoVar, 340L);
                return;
            }
            return;
        }
        ho hoVar2 = this.E;
        if (hoVar2 != null) {
            org.telegram.messenger.i0.r(hoVar2);
            this.E = null;
        }
        org.telegram.messenger.i0.U3(this.h, false, true);
    }

    public final void g(boolean z10) {
        boolean z11 = this.F;
        yp ypVar = this.d;
        hy hyVar = this.r;
        if (!z11 || ((ypVar.length() == 0 && (hyVar == null || hyVar.getSelectedCategory() == null)) || z10)) {
            this.c.b((ypVar.length() > 0 || (hyVar != null && hyVar.v3 > 0.5f && (hyVar.q3 || hyVar.getSelectedCategory() != null))) ? 1 : 0);
            this.F = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.d.setCursorColor(this.G.A(org.telegram.ui.ActionBar.t6.Ai));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            View view = this.e;
            view.setAlpha(f7);
            view.setVisibility(f7 > 0.0f ? 0 : 4);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
