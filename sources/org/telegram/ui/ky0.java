package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ky0 extends FrameLayout {
    public RadialGradient D;
    public final Matrix E;
    public final Paint F;
    public int G;
    public int H;
    public final org.telegram.ui.Components.d5 I;
    public final org.telegram.ui.Components.t5 J;
    public boolean K;
    public boolean L;
    public final Paint M;
    public final RectF N;
    public boolean O;
    public final /* synthetic */ ProfileActivity P;
    public int a;
    public final Paint b;
    public boolean c;
    public final org.telegram.ui.Components.t5 d;
    public int e;
    public int f;
    public final org.telegram.ui.Components.w4 h;
    public final org.telegram.ui.Components.w4 n;
    public int r;
    public int s;
    public int w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.P = profileActivity;
        this.b = new Paint();
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.d = new org.telegram.ui.Components.t5(this, 350L, grVar);
        this.h = new org.telegram.ui.Components.w4(this, 350L, grVar);
        this.n = new org.telegram.ui.Components.w4(this, 350L, grVar);
        this.E = new Matrix();
        this.F = new Paint(1);
        this.I = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(20.0f), 13, this, false);
        this.J = new org.telegram.ui.Components.t5(this, 0L, 440L, grVar);
        new org.telegram.ui.Components.t5(this, 0L, 440L, grVar);
        this.M = new Paint();
        this.N = new RectF();
        setWillNotDraw(false);
    }

    public final void a(org.telegram.messenger.kp kpVar, boolean z10) {
        ProfileActivity profileActivity = this.P;
        if (kpVar != null) {
            this.c = true;
            this.e = kpVar.c(org.telegram.ui.ActionBar.t6.I.q());
            int d = kpVar.d(org.telegram.ui.ActionBar.t6.I.q());
            this.f = d;
            profileActivity.b1 = i0.b.f(0.25f, this.e, d);
            int i10 = kpVar.a;
            if (i10 != 0) {
                this.G = i10;
                this.H = org.telegram.ui.ActionBar.t6.r1(0.45f, i10);
            } else {
                this.G = tn0.A0(this.e);
                this.H = org.telegram.ui.ActionBar.t6.r1(0.15f, tn0.A0(this.e));
            }
        } else {
            profileActivity.b1 = this.a;
            this.c = false;
            int i11 = org.telegram.ui.ActionBar.t6.s8;
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i11, profileActivity.z0)) > 0.8f) {
                this.G = -1;
                this.H = -1;
            } else if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i11, profileActivity.z0)) < 0.2f) {
                this.G = org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.t6.w0(i11, profileActivity.z0)));
                this.H = org.telegram.ui.ActionBar.t6.r1(0.35f, org.telegram.ui.ActionBar.t6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.t6.w0(i11, profileActivity.z0)));
            } else {
                this.G = tn0.A0(org.telegram.ui.ActionBar.t6.w0(i11, profileActivity.z0));
                this.H = org.telegram.ui.ActionBar.t6.r1(0.15f, tn0.A0(org.telegram.ui.ActionBar.t6.w0(i11, profileActivity.z0)));
            }
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.n.a(this.f, true);
        }
        invalidate();
    }

    public final void b(long j10, boolean z10) {
        org.telegram.ui.Components.d5 d5Var = this.I;
        boolean z11 = true;
        d5Var.j(j10, true);
        d5Var.k(Integer.valueOf(this.G));
        if (!this.K && (j10 == 0 || j10 == -1)) {
            z11 = false;
        }
        this.K = z11;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.b();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        Canvas canvas2;
        float f7;
        ix0 ix0Var;
        float f10;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        float f11;
        float f12;
        float f13;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        ag.c2 c2Var;
        ei.r rVar;
        boolean z10 = this.O;
        ProfileActivity profileActivity = this.P;
        if (!z10) {
            rVar = ((org.telegram.ui.ActionBar.k2) profileActivity).glassEngine;
            rVar.g();
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        lVar = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
        float f14 = currentActionBarHeight + (lVar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0) + profileActivity.P1 + profileActivity.S1;
        int i10 = (int) ((1.0f - profileActivity.P5) * f14);
        boolean z11 = true;
        boolean z12 = profileActivity.A5 > 0.0f && i10 != 0;
        if (z12) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), i10, (int) ((1.0f - profileActivity.A5) * 255.0f));
        }
        if (i10 != 0) {
            int i11 = this.a;
            Paint paint = this.b;
            paint.setColor(i11);
            int a2 = this.h.a(this.e, false);
            int a10 = this.n.a(this.f, false);
            org.telegram.ui.Components.hg0 hg0Var = profileActivity.Z;
            if (hg0Var != null) {
                int i12 = this.H;
                boolean z13 = this.c;
                f10 = 1.0f;
                if (hg0Var.P == null || hg0Var.N != i12 || hg0Var.O != z13) {
                    hg0Var.N = i12;
                    hg0Var.O = z13;
                    hg0Var.g();
                }
            } else {
                f10 = 1.0f;
            }
            org.telegram.ui.Components.bh0 bh0Var = profileActivity.b0;
            if (bh0Var != null) {
                bh0Var.d(this.H, this.c);
            }
            org.telegram.ui.Components.kg0 kg0Var = profileActivity.I5;
            if (kg0Var != null) {
                int i13 = this.H;
                boolean z14 = this.c;
                if (kg0Var.i != i13 || kg0Var.j != z14) {
                    kg0Var.i = i13;
                    kg0Var.j = z14;
                    kg0Var.a();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.D;
            f7 = 0.0f;
            Paint paint2 = this.F;
            if (radialGradient != null && this.r == a2 && this.s == a10 && this.w == width) {
                f11 = 2.0f;
            } else {
                this.x = org.telegram.messenger.i0.L(96.0f) * 2;
                lVar2 = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
                float currentActionBarHeight2 = (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (lVar2.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0)) - (org.telegram.messenger.i0.p * 21.0f);
                lVar3 = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
                this.y = lVar3.getTranslationY() + currentActionBarHeight2;
                this.w = width;
                float f15 = this.y;
                f11 = 2.0f;
                float f16 = this.x;
                this.s = a10;
                this.r = a2;
                RadialGradient radialGradient2 = new RadialGradient(width, (f16 / 2.0f) + f15, f16, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.D = radialGradient2;
                radialGradient2.setLocalMatrix(this.E);
                paint2.setShader(this.D);
            }
            float d = this.d.d(this.c) * (profileActivity.I1 == 0 ? f10 : profileActivity.R1);
            if (d < f10) {
                f12 = 255.0f;
                f13 = f11;
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i10, paint);
            } else {
                f12 = 255.0f;
                f13 = f11;
            }
            if (d > 0.0f) {
                paint2.setAlpha((int) (d * f12));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), i10, paint2);
            } else {
                canvas2 = canvas;
            }
            if (this.K && !this.O) {
                boolean z15 = this.L;
                org.telegram.ui.Components.d5 d5Var = this.I;
                if (!z15) {
                    if (d5Var != null) {
                        Drawable drawable = d5Var.f[0];
                        if ((drawable instanceof org.telegram.ui.Components.f5) && (c2Var = ((org.telegram.ui.Components.f5) drawable).k) != null && c2Var.J()) {
                            this.L = true;
                        }
                    }
                    z11 = false;
                }
                float d10 = this.J.d(z11);
                if ((!profileActivity.F1 || profileActivity.I1 != 2) && d10 > 0.0f && profileActivity.X != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i10);
                    lVar4 = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
                    float f17 = lVar4.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0.0f;
                    lVar5 = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
                    float B = c3.i0.B(lVar5.getHeight(), f17, f13, profileActivity.j4() + f17);
                    int measuredWidth = getMeasuredWidth();
                    float K3 = profileActivity.K3();
                    l0 l0Var = profileActivity.X;
                    float[][] fArr = rh.j0.a;
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(l0Var.getX(), l0Var.getY(), (l0Var.getScaleX() * l0Var.getWidth()) + l0Var.getX(), (l0Var.getScaleY() * l0Var.getHeight()) + l0Var.getY());
                    canvas2 = canvas;
                    rh.j0.c(canvas2, d5Var, measuredWidth, B, K3, rectF, 1.0f);
                    canvas2.restore();
                }
            }
            Object obj = profileActivity.g5;
            if (obj != null) {
                org.telegram.ui.ActionBar.l actionBar = ((org.telegram.ui.ActionBar.k2) obj).getActionBar();
                org.telegram.ui.ActionBar.y yVar = actionBar.E;
                View view = (View) actionBar.getParent();
                if (yVar != null && view != null) {
                    RectF rectF2 = this.N;
                    if (zg.h.c(yVar, view, rectF2)) {
                        int save = canvas2.save();
                        canvas2.translate(rectF2.left, rectF2.top);
                        canvas2.saveLayerAlpha(0.0f, 0.0f, yVar.getMeasuredWidth(), yVar.getMeasuredHeight(), (int) ((f10 - profileActivity.R1) * f12), 31);
                        yVar.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
        } else {
            canvas2 = canvas;
            f7 = 0.0f;
        }
        if (z12) {
            canvas2.restore();
        }
        if (profileActivity.P5 > f7) {
            float f18 = i10;
            if (f18 >= f14 || (ix0Var = profileActivity.N) == null || !ix0Var.isAttachedToWindow()) {
                return;
            }
            float y3 = (profileActivity.N.getY() + profileActivity.a.getY()) - profileActivity.T5;
            if (y3 > f18) {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, profileActivity.z0);
                Paint paint3 = this.M;
                paint3.setColor(w02);
                canvas2.drawRect(0.0f, f18, getMeasuredWidth(), Math.min(f14, y3), paint3);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        if (i10 != this.a) {
            this.a = i10;
            this.b.setColor(i10);
            invalidate();
            if (this.c) {
                return;
            }
            this.P.b1 = this.a;
        }
    }
}
