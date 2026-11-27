// default package

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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class is8 extends FrameLayout {
    public static final /* synthetic */ int R = 0;
    public RadialGradient E;
    public final Matrix F;
    public final Paint G;
    public int H;
    public int I;
    public final ul J;
    public final mm K;
    public boolean L;
    public boolean M;
    public final Paint N;
    public final RectF O;
    public boolean P;
    public final /* synthetic */ ProfileActivity Q;
    public int a;
    public final Paint b;
    public boolean c;
    public final mm d;
    public int e;
    public int f;
    public final ll h;
    public final ll n;
    public int r;
    public int s;
    public int w;
    public float x;
    public float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is8(ProfileActivity profileActivity, Context context) {
        super(context);
        this.Q = profileActivity;
        this.b = new Paint();
        k43 k43Var = k43.h;
        this.d = new mm(350L, this, k43Var);
        this.h = new ll(this, 350L, k43Var);
        this.n = new ll(this, 350L, k43Var);
        this.F = new Matrix();
        this.G = new Paint(1);
        this.J = new ul(hl.L(20.0f), 13, this, false);
        this.K = new mm(this, 0L, 440L, k43Var);
        new mm(this, 0L, 440L, k43Var);
        this.N = new Paint();
        this.O = new RectF();
        setWillNotDraw(false);
    }

    public final void a(kc7 kc7Var, boolean z) {
        ProfileActivity profileActivity = this.Q;
        if (kc7Var != null) {
            this.c = true;
            this.e = kc7Var.c(aob.I.o());
            int d = kc7Var.d(aob.I.o());
            this.f = d;
            profileActivity.c1 = vm2.f(0.25f, this.e, d);
            int i = kc7Var.a;
            if (i != 0) {
                this.H = i;
                this.I = aob.p1(0.45f, i);
            } else {
                this.H = h48.z0(this.e);
                this.I = aob.p1(0.15f, h48.z0(this.e));
            }
        } else {
            profileActivity.c1 = this.a;
            this.c = false;
            int i2 = aob.s8;
            if (hl.B(aob.v0(i2, profileActivity.A0)) > 0.8f) {
                this.H = -1;
                this.I = -1;
            } else {
                float B = hl.B(aob.v0(i2, profileActivity.A0));
                vnb vnbVar = profileActivity.A0;
                if (B < 0.2f) {
                    this.H = aob.p1(0.5f, aob.a(0.02f, 0.25f, aob.v0(i2, vnbVar)));
                    this.I = aob.p1(0.35f, aob.a(0.02f, 0.25f, aob.v0(i2, profileActivity.A0)));
                } else {
                    this.H = h48.z0(aob.v0(i2, vnbVar));
                    this.I = aob.p1(0.15f, h48.z0(aob.v0(i2, profileActivity.A0)));
                }
            }
        }
        if (!z) {
            this.h.a(this.e, true);
            this.n.a(this.f, true);
        }
        invalidate();
    }

    public final void b(long j, boolean z) {
        ul ulVar = this.J;
        boolean z2 = true;
        ulVar.j(j, true);
        ulVar.k(Integer.valueOf(this.H));
        if (!this.L && (j == 0 || j == -1)) {
            z2 = false;
        }
        this.L = z2;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J.b();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        a aVar;
        Canvas canvas2;
        float f;
        gr8 gr8Var;
        float f2;
        a aVar2;
        a aVar3;
        float f3;
        float f4;
        float f5;
        a aVar4;
        a aVar5;
        nl nlVar;
        vy4 vy4Var;
        boolean z = this.P;
        ProfileActivity profileActivity = this.Q;
        if (!z) {
            vy4Var = ((e) profileActivity).glassEngine;
            vy4Var.g();
        }
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        aVar = ((e) profileActivity).actionBar;
        float f6 = currentActionBarHeight + (aVar.getOccupyStatusBar() ? hl.m : 0) + profileActivity.Q1 + profileActivity.U1;
        int i = (int) ((1.0f - profileActivity.W5) * f6);
        boolean z2 = true;
        boolean z3 = profileActivity.G5 > 0.0f && i != 0;
        if (z3) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), i, (int) ((1.0f - profileActivity.G5) * 255.0f));
        }
        if (i != 0) {
            int i2 = this.a;
            Paint paint = this.b;
            paint.setColor(i2);
            int a = this.h.a(this.e, false);
            int a2 = this.n.a(this.f, false);
            ap8 ap8Var = profileActivity.a0;
            if (ap8Var != null) {
                int i3 = this.I;
                boolean z4 = this.c;
                f2 = 1.0f;
                if (ap8Var.Q == null || ap8Var.O != i3 || ap8Var.P != z4) {
                    ap8Var.O = i3;
                    ap8Var.P = z4;
                    ap8Var.g();
                }
            } else {
                f2 = 1.0f;
            }
            tu8 tu8Var = profileActivity.c0;
            if (tu8Var != null) {
                tu8Var.d(this.I, this.c);
            }
            qs8 qs8Var = profileActivity.O5;
            if (qs8Var != null) {
                int i4 = this.I;
                boolean z5 = this.c;
                if (qs8Var.i != i4 || qs8Var.j != z5) {
                    qs8Var.i = i4;
                    qs8Var.j = z5;
                    qs8Var.a();
                }
            }
            int width = getWidth() / 2;
            RadialGradient radialGradient = this.E;
            f = 0.0f;
            Paint paint2 = this.G;
            if (radialGradient != null && this.r == a && this.s == a2 && this.w == width) {
                f3 = 2.0f;
            } else {
                this.x = hl.L(96.0f) << 1;
                aVar2 = ((e) profileActivity).actionBar;
                float currentActionBarHeight2 = (a.getCurrentActionBarHeight() + (aVar2.getOccupyStatusBar() ? hl.m : 0)) - (hl.p * 21.0f);
                aVar3 = ((e) profileActivity).actionBar;
                this.y = aVar3.getTranslationY() + currentActionBarHeight2;
                this.w = width;
                float f7 = this.y;
                f3 = 2.0f;
                float f8 = this.x;
                this.s = a2;
                this.r = a;
                RadialGradient radialGradient2 = new RadialGradient(width, (f8 / 2.0f) + f7, f8, new int[]{a2, a}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.E = radialGradient2;
                radialGradient2.setLocalMatrix(this.F);
                paint2.setShader(this.E);
            }
            float d = this.d.d(this.c) * (profileActivity.J1 == 0 ? f2 : profileActivity.T1);
            if (d < f2) {
                f4 = 255.0f;
                f5 = f3;
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i, paint);
            } else {
                f4 = 255.0f;
                f5 = f3;
            }
            if (d > 0.0f) {
                paint2.setAlpha((int) (d * f4));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), i, paint2);
            } else {
                canvas2 = canvas;
            }
            if (this.L && !this.P) {
                boolean z6 = this.M;
                ul ulVar = this.J;
                if (!z6) {
                    if (ulVar != null) {
                        Drawable drawable = ulVar.f[0];
                        if ((drawable instanceof wl) && (nlVar = ((wl) drawable).k) != null && nlVar.C()) {
                            this.M = true;
                        }
                    }
                    z2 = false;
                }
                float d2 = this.K.d(z2);
                if ((!profileActivity.G1 || profileActivity.J1 != 2) && d2 > 0.0f && profileActivity.Y != null) {
                    canvas2.save();
                    canvas2.clipRect(0, 0, getMeasuredWidth(), i);
                    aVar4 = ((e) profileActivity).actionBar;
                    float f9 = aVar4.getOccupyStatusBar() ? hl.m : 0.0f;
                    aVar5 = ((e) profileActivity).actionBar;
                    float z7 = bp1.z(aVar5.getHeight(), f9, f5, profileActivity.e2() + f9);
                    int measuredWidth = getMeasuredWidth();
                    float D1 = profileActivity.D1();
                    d26 d26Var = profileActivity.Y;
                    float[][] fArr = xqa.a;
                    RectF rectF = hl.P;
                    rectF.set(d26Var.getX(), d26Var.getY(), (d26Var.getScaleX() * d26Var.getWidth()) + d26Var.getX(), (d26Var.getScaleY() * d26Var.getHeight()) + d26Var.getY());
                    canvas2 = canvas;
                    xqa.c(canvas2, ulVar, measuredWidth, z7, D1, rectF, 1.0f);
                    canvas2.restore();
                }
            }
            Object obj = profileActivity.m5;
            if (obj != null) {
                a actionBar = ((e) obj).getActionBar();
                s6 s6Var = actionBar.F;
                View view = (View) actionBar.getParent();
                if (s6Var != null && view != null) {
                    RectF rectF2 = this.O;
                    if (yic.c(s6Var, view, rectF2)) {
                        int save = canvas2.save();
                        canvas2.translate(rectF2.left, rectF2.top);
                        canvas2.saveLayerAlpha(0.0f, 0.0f, s6Var.getMeasuredWidth(), s6Var.getMeasuredHeight(), (int) ((f2 - profileActivity.T1) * f4), 31);
                        s6Var.draw(canvas2);
                        canvas2.restoreToCount(save);
                    }
                }
            }
        } else {
            canvas2 = canvas;
            f = 0.0f;
        }
        if (z3) {
            canvas2.restore();
        }
        if (profileActivity.W5 > f) {
            float f10 = i;
            if (f10 >= f6 || (gr8Var = profileActivity.O) == null || !gr8Var.isAttachedToWindow()) {
                return;
            }
            float y = (profileActivity.O.getY() + profileActivity.a.getY()) - profileActivity.a6;
            if (y > f10) {
                int v0 = aob.v0(aob.a7, profileActivity.A0);
                Paint paint3 = this.N;
                paint3.setColor(v0);
                canvas.drawRect(0.0f, f10, getMeasuredWidth(), Math.min(f6, y), paint3);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (i != this.a) {
            this.a = i;
            this.b.setColor(i);
            invalidate();
            if (this.c) {
                return;
            }
            this.Q.c1 = this.a;
        }
    }
}
