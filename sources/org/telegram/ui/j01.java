package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class j01 extends FrameLayout {
    public final Matrix A;
    public final Paint B;
    public int C;
    public int D;
    public final org.telegram.ui.Components.n5 E;
    public final org.telegram.ui.Components.d6 F;
    public boolean G;
    public boolean H;
    public final Rect I;
    public final /* synthetic */ ProfileActivity J;
    public int a;
    public final Paint b;
    public boolean c;
    public final org.telegram.ui.Components.d6 d;
    public int e;
    public int f;
    public final org.telegram.ui.Components.f5 h;
    public final org.telegram.ui.Components.f5 n;
    public int r;
    public int s;
    public int v;
    public float w;
    public float x;
    public RadialGradient y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.J = profileActivity;
        this.b = new Paint();
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        this.d = new org.telegram.ui.Components.d6(this, 350L, jrVar);
        this.h = new org.telegram.ui.Components.f5(this, 350L, jrVar);
        this.n = new org.telegram.ui.Components.f5(this, 350L, jrVar);
        this.A = new Matrix();
        this.B = new Paint(1);
        this.E = new org.telegram.ui.Components.n5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.F = new org.telegram.ui.Components.d6(this, 0L, 440L, jrVar);
        new org.telegram.ui.Components.d6(this, 0L, 440L, jrVar);
        this.I = new Rect();
        setWillNotDraw(false);
    }

    public final void a(MessagesController.PeerColor peerColor, boolean z10) {
        ProfileActivity profileActivity = this.J;
        if (peerColor != null) {
            this.c = true;
            this.e = peerColor.getBgColor1(org.telegram.ui.ActionBar.g6.I.q());
            int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.g6.I.q());
            this.f = bgColor2;
            profileActivity.Y0 = i0.a.d(0.25f, this.e, bgColor2);
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                this.C = i10;
                this.D = org.telegram.ui.ActionBar.g6.l1(0.45f, i10);
            } else {
                this.C = yo0.u0(this.e);
                this.D = org.telegram.ui.ActionBar.g6.l1(0.15f, yo0.u0(this.e));
            }
        } else {
            profileActivity.Y0 = this.a;
            this.c = false;
            int i11 = org.telegram.ui.ActionBar.g6.s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.v0)) > 0.8f) {
                this.C = -1;
                this.D = -1;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.v0)) < 0.2f) {
                this.C = org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.v0)));
                this.D = org.telegram.ui.ActionBar.g6.l1(0.35f, org.telegram.ui.ActionBar.g6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.v0)));
            } else {
                this.C = yo0.u0(org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.v0));
                this.D = org.telegram.ui.ActionBar.g6.l1(0.15f, yo0.u0(org.telegram.ui.ActionBar.g6.v0(i11, profileActivity.v0)));
            }
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.n.a(this.f, true);
        }
        invalidate();
    }

    public final void b(long j10, boolean z10) {
        org.telegram.ui.Components.n5 n5Var = this.E;
        boolean z11 = true;
        n5Var.j(j10, true);
        n5Var.k(Integer.valueOf(this.C));
        if (!this.G && (j10 == 0 || j10 == -1)) {
            z11 = false;
        }
        this.G = z11;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E.b();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        Canvas canvas2;
        Paint paint;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        Paint paint2;
        float f9;
        Object obj;
        org.telegram.ui.ActionBar.l actionBar;
        org.telegram.ui.ActionBar.a0 a0Var;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        lh.x2 x2Var;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.J;
        lVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        float f10 = currentActionBarHeight + (lVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + profileActivity.M1 + profileActivity.P1;
        int i10 = (int) ((1.0f - profileActivity.A5) * f10);
        Paint paint3 = this.b;
        if (i10 != 0) {
            paint3.setColor(this.a);
            int a2 = this.h.a(this.e, false);
            int a10 = this.n.a(this.f, false);
            org.telegram.ui.Components.zg0 zg0Var = profileActivity.W;
            if (zg0Var != null) {
                int i11 = this.D;
                boolean z10 = this.c;
                if (zg0Var.O == null || zg0Var.M != i11 || zg0Var.N != z10) {
                    zg0Var.M = i11;
                    zg0Var.N = z10;
                    zg0Var.g();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.y;
            Paint paint4 = this.B;
            if (radialGradient == null || this.r != a2 || this.s != a10 || this.v != width) {
                this.w = AndroidUtilities.dp(96.0f) * 2;
                lVar2 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                float currentActionBarHeight2 = (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (lVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f);
                lVar3 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                this.x = lVar3.getTranslationY() + currentActionBarHeight2;
                this.v = width;
                float f11 = this.x;
                float f12 = this.w;
                this.s = a10;
                this.r = a2;
                RadialGradient radialGradient2 = new RadialGradient(width, (f12 / 2.0f) + f11, f12, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.y = radialGradient2;
                radialGradient2.setLocalMatrix(this.A);
                paint4.setShader(this.y);
            }
            float e10 = this.d.e(this.c) * (profileActivity.F1 == 0 ? 1.0f : profileActivity.O1);
            if (e10 < 1.0f) {
                paint2 = paint3;
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i10, paint2);
            } else {
                paint2 = paint3;
            }
            if (e10 > 0.0f) {
                paint4.setAlpha((int) (e10 * 255.0f));
                paint = paint2;
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), i10, paint4);
            } else {
                canvas2 = canvas;
                paint = paint2;
            }
            if (this.G) {
                boolean z11 = this.H;
                org.telegram.ui.Components.n5 n5Var = this.E;
                boolean z12 = true;
                if (!z11) {
                    if (n5Var != null) {
                        Drawable drawable = n5Var.f[0];
                        if ((drawable instanceof org.telegram.ui.Components.p5) && (x2Var = ((org.telegram.ui.Components.p5) drawable).k) != null && x2Var.hasImageLoaded()) {
                            this.H = true;
                        }
                    }
                    z12 = false;
                }
                float e11 = this.F.e(z12);
                if ((!profileActivity.C1 || profileActivity.F1 != 2) && e11 > 0.0f && profileActivity.U != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i10);
                    lVar4 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                    float f13 = lVar4.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0.0f;
                    lVar5 = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                    float A = com.google.android.recaptcha.internal.a.A(lVar5.getHeight(), f13, 2.0f, profileActivity.U3() + f13);
                    int measuredWidth = getMeasuredWidth();
                    float y32 = profileActivity.y3();
                    n0 n0Var = profileActivity.U;
                    float[][] fArr = jh.x0.a;
                    RectF rectF = AndroidUtilities.rectTmp;
                    f9 = 1.0f;
                    rectF.set(n0Var.getX(), n0Var.getY(), (n0Var.getScaleX() * n0Var.getWidth()) + n0Var.getX(), (n0Var.getScaleY() * n0Var.getHeight()) + n0Var.getY());
                    jh.x0.c(canvas2, n5Var, measuredWidth, A, y32, rectF, 1.0f);
                    canvas2.restore();
                    obj = profileActivity.c5;
                    if (obj != null && (a0Var = (actionBar = ((org.telegram.ui.ActionBar.o2) obj).getActionBar()).A) != null) {
                        int save = canvas2.save();
                        canvas2.translate(a0Var.getX() + actionBar.getX(), a0Var.getY() + actionBar.getY());
                        canvas2.saveLayerAlpha(0.0f, 0.0f, a0Var.getMeasuredWidth(), a0Var.getMeasuredHeight(), (int) ((f9 - profileActivity.O1) * 255.0f), 31);
                        a0Var.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
            f9 = 1.0f;
            obj = profileActivity.c5;
            if (obj != null) {
                int save2 = canvas2.save();
                canvas2.translate(a0Var.getX() + actionBar.getX(), a0Var.getY() + actionBar.getY());
                canvas2.saveLayerAlpha(0.0f, 0.0f, a0Var.getMeasuredWidth(), a0Var.getMeasuredHeight(), (int) ((f9 - profileActivity.O1) * 255.0f), 31);
                a0Var.draw(canvas2);
                canvas2.restoreToCount(save2);
            }
        } else {
            canvas2 = canvas;
            paint = paint3;
        }
        if (i10 == f10 || profileActivity.C1) {
            return;
        }
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, profileActivity.v0));
        this.I.set(0, i10, getMeasuredWidth(), (int) f10);
        profileActivity.i5.J(canvas2, getY(), this.I, paint, true);
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
            this.J.Y0 = this.a;
        }
    }
}
