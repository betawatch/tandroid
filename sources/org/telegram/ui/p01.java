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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class p01 extends FrameLayout {
    public final Matrix E;
    public final Paint F;
    public int G;
    public int H;
    public final org.telegram.ui.Components.p5 I;
    public final org.telegram.ui.Components.f6 J;
    public boolean K;
    public boolean L;
    public final Rect M;
    public final /* synthetic */ ProfileActivity N;
    public int a;
    public final Paint b;
    public boolean c;
    public final org.telegram.ui.Components.f6 d;
    public int e;
    public int f;
    public final org.telegram.ui.Components.i5 h;
    public final org.telegram.ui.Components.i5 n;
    public int r;
    public int s;
    public int v;
    public float w;
    public float x;
    public RadialGradient y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.N = profileActivity;
        this.b = new Paint();
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        this.d = new org.telegram.ui.Components.f6(this, 350L, bsVar);
        this.h = new org.telegram.ui.Components.i5(this, 350L, bsVar);
        this.n = new org.telegram.ui.Components.i5(this, 350L, bsVar);
        this.E = new Matrix();
        this.F = new Paint(1);
        this.I = new org.telegram.ui.Components.p5(AndroidUtilities.dp(20.0f), 13, this, false);
        this.J = new org.telegram.ui.Components.f6(this, 0L, 440L, bsVar);
        new org.telegram.ui.Components.f6(this, 0L, 440L, bsVar);
        this.M = new Rect();
        setWillNotDraw(false);
    }

    public final void a(MessagesController.PeerColor peerColor, boolean z10) {
        ProfileActivity profileActivity = this.N;
        if (peerColor != null) {
            this.c = true;
            this.e = peerColor.getBgColor1(org.telegram.ui.ActionBar.h6.I.q());
            int bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.h6.I.q());
            this.f = bgColor2;
            profileActivity.d1 = i0.a.f(0.25f, this.e, bgColor2);
            int i10 = peerColor.patternColor;
            if (i10 != 0) {
                this.G = i10;
                this.H = org.telegram.ui.ActionBar.h6.m1(0.45f, i10);
            } else {
                this.G = ip0.w0(this.e);
                this.H = org.telegram.ui.ActionBar.h6.m1(0.15f, ip0.w0(this.e));
            }
        } else {
            profileActivity.d1 = this.a;
            this.c = false;
            int i11 = org.telegram.ui.ActionBar.h6.s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.A0)) > 0.8f) {
                this.G = -1;
                this.H = -1;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.A0)) < 0.2f) {
                this.G = org.telegram.ui.ActionBar.h6.m1(0.5f, org.telegram.ui.ActionBar.h6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.A0)));
                this.H = org.telegram.ui.ActionBar.h6.m1(0.35f, org.telegram.ui.ActionBar.h6.b(0.02f, 0.25f, org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.A0)));
            } else {
                this.G = ip0.w0(org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.A0));
                this.H = org.telegram.ui.ActionBar.h6.m1(0.15f, ip0.w0(org.telegram.ui.ActionBar.h6.w0(i11, profileActivity.A0)));
            }
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.n.a(this.f, true);
        }
        invalidate();
    }

    public final void b(long j10, boolean z10) {
        org.telegram.ui.Components.p5 p5Var = this.I;
        boolean z11 = true;
        p5Var.j(j10, true);
        p5Var.k(Integer.valueOf(this.G));
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
        org.telegram.ui.ActionBar.k kVar;
        Canvas canvas2;
        Paint paint;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        Paint paint2;
        float f7;
        Object obj;
        org.telegram.ui.ActionBar.k actionBar;
        org.telegram.ui.ActionBar.y yVar;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        ci.g3 g3Var;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ProfileActivity profileActivity = this.N;
        kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
        float f10 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + profileActivity.R1 + profileActivity.U1;
        int i10 = (int) ((1.0f - profileActivity.G5) * f10);
        Paint paint3 = this.b;
        if (i10 != 0) {
            paint3.setColor(this.a);
            int a2 = this.h.a(this.e, false);
            int a10 = this.n.a(this.f, false);
            org.telegram.ui.Components.zh0 zh0Var = profileActivity.a0;
            if (zh0Var != null) {
                int i11 = this.H;
                boolean z10 = this.c;
                if (zh0Var.S == null || zh0Var.Q != i11 || zh0Var.R != z10) {
                    zh0Var.Q = i11;
                    zh0Var.R = z10;
                    zh0Var.g();
                }
            }
            org.telegram.ui.Components.si0 si0Var = profileActivity.c0;
            if (si0Var != null) {
                si0Var.f(this.H, this.c);
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.y;
            Paint paint4 = this.F;
            if (radialGradient == null || this.r != a2 || this.s != a10 || this.v != width) {
                this.w = AndroidUtilities.dp(96.0f) * 2;
                kVar2 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
                float currentActionBarHeight2 = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (kVar2.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.density * 21.0f);
                kVar3 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
                this.x = kVar3.getTranslationY() + currentActionBarHeight2;
                this.v = width;
                float f11 = this.x;
                float f12 = this.w;
                this.s = a10;
                this.r = a2;
                RadialGradient radialGradient2 = new RadialGradient(width, (f12 / 2.0f) + f11, f12, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.y = radialGradient2;
                radialGradient2.setLocalMatrix(this.E);
                paint4.setShader(this.y);
            }
            float e = this.d.e(this.c) * (profileActivity.K1 == 0 ? 1.0f : profileActivity.T1);
            if (e < 1.0f) {
                paint2 = paint3;
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i10, paint2);
            } else {
                paint2 = paint3;
            }
            if (e > 0.0f) {
                paint4.setAlpha((int) (e * 255.0f));
                paint = paint2;
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), i10, paint4);
            } else {
                canvas2 = canvas;
                paint = paint2;
            }
            if (this.K) {
                boolean z11 = this.L;
                org.telegram.ui.Components.p5 p5Var = this.I;
                boolean z12 = true;
                if (!z11) {
                    if (p5Var != null) {
                        Drawable drawable = p5Var.f[0];
                        if ((drawable instanceof org.telegram.ui.Components.r5) && (g3Var = ((org.telegram.ui.Components.r5) drawable).k) != null && g3Var.hasImageLoaded()) {
                            this.L = true;
                        }
                    }
                    z12 = false;
                }
                float e7 = this.J.e(z12);
                if ((!profileActivity.H1 || profileActivity.K1 != 2) && e7 > 0.0f && profileActivity.Y != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i10);
                    kVar4 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
                    float f13 = kVar4.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0.0f;
                    kVar5 = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
                    float z13 = com.google.android.gms.internal.play_billing.k3.z(kVar5.getHeight(), f13, 2.0f, profileActivity.U3() + f13);
                    int measuredWidth = getMeasuredWidth();
                    float y3 = profileActivity.y3();
                    m0 m0Var = profileActivity.Y;
                    float[][] fArr = ai.m1.a;
                    RectF rectF = AndroidUtilities.rectTmp;
                    f7 = 1.0f;
                    rectF.set(m0Var.getX(), m0Var.getY(), (m0Var.getScaleX() * m0Var.getWidth()) + m0Var.getX(), (m0Var.getScaleY() * m0Var.getHeight()) + m0Var.getY());
                    ai.m1.c(canvas2, p5Var, measuredWidth, z13, y3, rectF, 1.0f);
                    canvas2.restore();
                    obj = profileActivity.i5;
                    if (obj != null && (yVar = (actionBar = ((org.telegram.ui.ActionBar.n2) obj).getActionBar()).E) != null) {
                        int save = canvas2.save();
                        canvas2.translate(yVar.getX() + actionBar.getX(), yVar.getY() + actionBar.getY());
                        canvas2.saveLayerAlpha(0.0f, 0.0f, yVar.getMeasuredWidth(), yVar.getMeasuredHeight(), (int) ((f7 - profileActivity.T1) * 255.0f), 31);
                        yVar.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
            f7 = 1.0f;
            obj = profileActivity.i5;
            if (obj != null) {
                int save2 = canvas2.save();
                canvas2.translate(yVar.getX() + actionBar.getX(), yVar.getY() + actionBar.getY());
                canvas2.saveLayerAlpha(0.0f, 0.0f, yVar.getMeasuredWidth(), yVar.getMeasuredHeight(), (int) ((f7 - profileActivity.T1) * 255.0f), 31);
                yVar.draw(canvas2);
                canvas2.restoreToCount(save2);
            }
        } else {
            canvas2 = canvas;
            paint = paint3;
        }
        if (i10 == f10 || profileActivity.H1) {
            return;
        }
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, profileActivity.A0));
        this.M.set(0, i10, getMeasuredWidth(), (int) f10);
        profileActivity.o5.J(canvas2, getY(), this.M, paint, true);
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
            this.N.d1 = this.a;
        }
    }
}
