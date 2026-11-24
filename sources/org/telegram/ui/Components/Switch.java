package org.telegram.ui.Components;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.StateSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class Switch extends View implements tjb {
    public int E;
    public int F;
    public Drawable G;
    public int H;
    public boolean I;
    public ff0 J;
    public final int[] K;
    public byte L;
    public boolean M;
    public Bitmap[] N;
    public Canvas[] O;
    public Bitmap P;
    public Canvas Q;
    public float R;
    public float S;
    public float T;
    public Paint U;
    public Paint V;
    public final wjb W;
    public final fm0 a;
    public int a0;
    public final RectF b;
    public float c;
    public ObjectAnimator d;
    public ObjectAnimator e;
    public boolean f;
    public boolean h;
    public final Paint n;
    public final Paint r;
    public int s;
    public float w;
    public int x;
    public int y;

    public Switch(Context context, wjb wjbVar) {
        super(context);
        this.a = new fm0(0, new sg0(this, (byte) 2), s33.h, 380L, true);
        this.w = 1.0f;
        this.x = bkb.q7;
        this.y = bkb.U6;
        int i = bkb.c6;
        this.E = i;
        this.F = i;
        this.K = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        this.W = wjbVar;
        this.b = new RectF();
        this.n = new Paint(1);
        Paint paint = new Paint(1);
        this.r = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(gl.L(2.0f));
        setHapticFeedbackEnabled(true);
    }

    public final void b(int i, boolean z, boolean z2) {
        if (z != this.h) {
            this.h = z;
            if (this.f && z2) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z ? 1.0f : 0.0f);
                this.d = ofFloat;
                ofFloat.setDuration(200L);
                this.d.addListener(new qcb(this, (byte) 0));
                this.d.start();
            } else {
                ObjectAnimator objectAnimator = this.d;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                    this.d = null;
                }
                setProgress(z ? 1.0f : 0.0f);
            }
        }
        if (this.s != i) {
            this.s = i;
            if (this.f && z2) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "iconProgress", i == 0 ? 1.0f : 0.0f);
                this.e = ofFloat2;
                ofFloat2.setDuration(200L);
                this.e.addListener(new qcb(this, (byte) 1));
                this.e.start();
                return;
            }
            ObjectAnimator objectAnimator2 = this.e;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
                this.e = null;
            }
            setIconProgress(i == 0 ? 1.0f : 0.0f);
        }
    }

    public final void c(boolean z, boolean z2) {
        b(this.s, z, z2);
    }

    public final void d(int i, int i2, int i3, int i4) {
        this.x = i;
        this.y = i2;
        this.E = i3;
        this.F = i4;
    }

    public float getIconProgress() {
        return this.w;
    }

    public float getProgress() {
        return this.c;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0208, code lost:
    
        r6 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0203, code lost:
    
        if (r2 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bb, code lost:
    
        if (r12 == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
    
        r20 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        if (r12 != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01fd, code lost:
    
        if (r2 == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0205, code lost:
    
        r6 = 1.0f;
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03e8 A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        wjb wjbVar;
        Paint paint;
        Paint paint2;
        float f;
        float f2;
        float f3;
        Paint paint3;
        Paint paint4;
        Canvas canvas2;
        int i;
        int i2;
        int i3;
        Paint paint5;
        ff0 ff0Var;
        Drawable drawable;
        if (getVisibility() == 0) {
            int L = gl.L(31.0f);
            int i4 = 2;
            int measuredWidth = (getMeasuredWidth() - L) / 2;
            float f4 = 14.0f;
            float f5 = 2.0f;
            float measuredHeight = (getMeasuredHeight() - gl.N(14.0f)) / 2.0f;
            float f6 = 7.0f;
            int L2 = gl.L(7.0f) + measuredWidth + ((int) (gl.L(17.0f) * this.c));
            int measuredHeight2 = getMeasuredHeight() / 2;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                wjbVar = this.W;
                paint = this.r;
                float f7 = 1.0f;
                paint2 = this.n;
                float f8 = f4;
                f = f5;
                f2 = f6;
                if (i6 >= i4) {
                    break;
                }
                if (i6 == 1 && this.a0 == 0) {
                    i2 = L;
                    i3 = i5;
                } else {
                    Canvas canvas3 = i6 == 0 ? canvas : this.O[i5];
                    if (i6 == 1) {
                        this.N[i5].eraseColor(i5);
                        paint2.setColor(-16777216);
                        i3 = i5;
                        this.Q.drawRect(0.0f, 0.0f, this.P.getWidth(), this.P.getHeight(), paint2);
                        paint5 = paint2;
                        i2 = L;
                        this.Q.drawCircle(this.R - getX(), this.S - getY(), this.T, this.U);
                    } else {
                        i2 = L;
                        i3 = i5;
                        paint5 = paint2;
                    }
                    int i7 = this.a0;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            f7 = this.c;
                        }
                        int a = a(bkb.v0(this.x, wjbVar));
                        int a2 = a(bkb.v0(this.y, wjbVar));
                        if (i6 == 0 && (drawable = this.G) != null) {
                            if (this.H != (this.h ? a2 : a)) {
                                int i8 = this.h ? a2 : a;
                                this.H = i8;
                                drawable.setColorFilter(new PorterDuffColorFilter(i8, PorterDuff.Mode.MULTIPLY));
                            }
                        }
                        int red = Color.red(a);
                        int red2 = Color.red(a2);
                        int green = Color.green(a);
                        int green2 = Color.green(a2);
                        int blue = Color.blue(a);
                        int blue2 = Color.blue(a2);
                        int alpha = ((((int) (((Color.alpha(a2) - r6) * f7) + Color.alpha(a))) & kk7.d4) << 24) | ((((int) (((red2 - red) * f7) + red)) & kk7.d4) << 16) | ((((int) (((green2 - green) * f7) + green)) & kk7.d4) << 8) | (((int) (((blue2 - blue) * f7) + blue)) & kk7.d4);
                        paint5.setColor(alpha);
                        paint.setColor(alpha);
                        float N = gl.N(f8) + measuredHeight;
                        RectF rectF = this.b;
                        rectF.set(measuredWidth, measuredHeight, measuredWidth + i2, N);
                        canvas3.drawRoundRect(rectF, gl.N(f2), gl.N(f2), paint5);
                        canvas3.drawCircle(L2, measuredHeight2, gl.N(10.0f), paint5);
                        if (i6 == 0 && (ff0Var = this.J) != null) {
                            ff0Var.setBounds(L2 - gl.L(18.0f), measuredHeight2 - gl.L(18.0f), gl.L(18.0f) + L2, gl.L(18.0f) + measuredHeight2);
                            this.J.draw(canvas3);
                        } else if (i6 == 1) {
                            canvas3.drawBitmap(this.P, 0.0f, 0.0f, this.V);
                        }
                    }
                }
                i6++;
                f4 = f8;
                L = i2;
                f5 = f;
                f6 = f2;
                i5 = i3;
                i4 = 2;
            }
            int i9 = i5;
            Paint paint6 = paint2;
            if (this.a0 != 0) {
                canvas.drawBitmap(this.N[i9], 0.0f, 0.0f, (Paint) null);
            }
            int i10 = i9;
            int i11 = 2;
            while (i10 < i11) {
                if (i10 == 1 && this.a0 == 0) {
                    paint3 = paint6;
                    paint4 = paint;
                    i = 2;
                } else {
                    Canvas canvas4 = i10 == 0 ? canvas : this.O[1];
                    if (i10 == 1) {
                        this.N[1].eraseColor(i9);
                    }
                    int i12 = this.a0;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            f3 = this.c;
                        }
                    }
                    int v0 = bkb.v0(this.E, wjbVar);
                    int a3 = a(bkb.v0(this.F, wjbVar));
                    int red3 = Color.red(v0);
                    int red4 = Color.red(a3);
                    int green3 = Color.green(v0);
                    int green4 = Color.green(a3);
                    int blue3 = Color.blue(v0);
                    int blue4 = Color.blue(a3);
                    float f9 = f3;
                    paint6.setColor(((((int) (((Color.alpha(a3) - r7) * f9) + Color.alpha(v0))) & kk7.d4) << 24) | ((((int) (((red4 - red3) * f9) + red3)) & kk7.d4) << 16) | ((((int) (((green4 - green3) * f9) + green3)) & kk7.d4) << 8) | (((int) (((blue4 - blue3) * f9) + blue3)) & kk7.d4));
                    float f10 = L2;
                    float f11 = measuredHeight2;
                    canvas4.drawCircle(f10, f11, gl.L(8.0f), paint6);
                    if (i10 == 0) {
                        if (this.G != null) {
                            float f12 = this.a.e;
                            if (f12 > 0.0f) {
                                boolean z = f12 < 1.0f;
                                if (z) {
                                    canvas.save();
                                    canvas.scale(f12, f12, f10, f11);
                                }
                                Drawable drawable2 = this.G;
                                drawable2.setBounds(oo1.A(2, L2, drawable2), oo1.y(2, measuredHeight2, this.G), oo1.w(2, L2, this.G), oo1.i(2, measuredHeight2, this.G));
                                this.G.draw(canvas4);
                                if (z) {
                                    canvas.restore();
                                }
                            }
                        } else {
                            int i13 = this.s;
                            if (i13 == 1) {
                                L2 = (int) (f10 - (gl.L(10.8f) - (gl.L(1.3f) * this.c)));
                                measuredHeight2 = (int) (f11 - (gl.L(8.5f) - (gl.L(0.5f) * this.c)));
                                int N2 = ((int) gl.N(4.6f)) + L2;
                                int N3 = (int) (gl.N(9.5f) + measuredHeight2);
                                int L3 = gl.L(f) + N2;
                                int L4 = gl.L(f) + N3;
                                int N4 = ((int) gl.N(7.5f)) + L2;
                                int N5 = ((int) gl.N(5.4f)) + measuredHeight2;
                                int L5 = gl.L(f2) + N4;
                                int L6 = gl.L(f2) + N5;
                                paint3 = paint6;
                                float f13 = this.c;
                                paint4 = paint;
                                canvas2 = canvas4;
                                canvas2.drawLine((int) (((N2 - N4) * f13) + N4), (int) (((N3 - N5) * f13) + N5), (int) (((L3 - L5) * f13) + L5), (int) (((L4 - L6) * f13) + L6), paint4);
                                canvas2.drawLine(((int) gl.N(7.5f)) + L2, ((int) gl.N(12.5f)) + measuredHeight2, gl.L(f2) + r3, r4 - gl.L(f2), paint4);
                                i = 2;
                                if (i10 == 1) {
                                    canvas2.drawBitmap(this.P, 0.0f, 0.0f, this.V);
                                }
                            } else {
                                paint3 = paint6;
                                Paint paint7 = paint;
                                canvas2 = canvas4;
                                i = 2;
                                if (i13 == 2 || this.e != null) {
                                    paint7.setAlpha((int) ((1.0f - this.w) * 255.0f));
                                    paint4 = paint7;
                                    canvas2.drawLine(f10, f11, f10, measuredHeight2 - gl.L(5.0f), paint4);
                                    canvas2.save();
                                    canvas2.rotate(this.w * (-90.0f), f10, f11);
                                    canvas2.drawLine(f10, f11, gl.L(4.0f) + L2, f11, paint4);
                                    canvas2.restore();
                                } else {
                                    paint4 = paint7;
                                }
                                if (i10 == 1) {
                                }
                            }
                        }
                    }
                    paint3 = paint6;
                    paint4 = paint;
                    canvas2 = canvas4;
                    i = 2;
                    if (i10 == 1) {
                    }
                }
                i10++;
                i11 = i;
                paint = paint4;
                paint6 = paint3;
                i9 = 0;
            }
            if (this.a0 != 0) {
                canvas.drawBitmap(this.N[1], 0.0f, 0.0f, (Paint) null);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.h);
    }

    public void setDrawIconType(int i) {
        this.s = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setDrawRipple(boolean z) {
        int i;
        if (z == this.I) {
            return;
        }
        this.I = z;
        if (this.J == null) {
            new Paint(1).setColor(-1);
            ff0 ff0Var = new ff0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{0}), null, null);
            this.J = ff0Var;
            ff0Var.setRadius(gl.L(18.0f));
            this.J.setCallback(this);
        }
        boolean z2 = this.h;
        byte b = this.L;
        if (!z2) {
            if (b != 1) {
                i = bkb.R6;
                this.J.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{a(bkb.v0(i, this.W))}));
                z2 = this.h;
                this.L = z2 ? (byte) 2 : (byte) 1;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                this.J.setHotspot(!z2 ? 0.0f : gl.L(100.0f), gl.L(18.0f));
            }
            this.J.setState(!z ? this.K : StateSet.NOTHING);
            invalidate();
        }
        if (b != 2) {
            i = bkb.S6;
            this.J.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{a(bkb.v0(i, this.W))}));
            z2 = this.h;
            this.L = z2 ? (byte) 2 : (byte) 1;
        }
        if (Build.VERSION.SDK_INT >= 28 && z) {
            this.J.setHotspot(!z2 ? 0.0f : gl.L(100.0f), gl.L(18.0f));
        }
        this.J.setState(!z ? this.K : StateSet.NOTHING);
        invalidate();
    }

    public void setIcon(int i) {
        if (i != 0) {
            Drawable mutate = getResources().getDrawable(i).mutate();
            this.G = mutate;
            if (mutate != null) {
                int v0 = bkb.v0(this.h ? this.y : this.x, this.W);
                this.H = v0;
                mutate.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
            }
        } else {
            this.G = null;
        }
        invalidate();
    }

    public void setIconProgress(float f) {
        if (this.w == f) {
            return;
        }
        this.w = f;
        invalidate();
    }

    public void setOverrideColor(int i) {
        if (this.a0 != i) {
            if (this.N == null) {
                try {
                    this.N = new Bitmap[2];
                    this.O = new Canvas[2];
                    for (int i2 = 0; i2 < 2; i2++) {
                        this.N[i2] = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                        this.O[i2] = new Canvas(this.N[i2]);
                    }
                    this.P = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    this.Q = new Canvas(this.P);
                    Paint paint = new Paint(1);
                    this.U = paint;
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    this.V = paint2;
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    this.M = true;
                } catch (Throwable unused) {
                    return;
                }
            }
            if (this.M) {
                this.a0 = i;
                this.R = 0.0f;
                this.S = 0.0f;
                this.T = 0.0f;
                invalidate();
            }
        }
    }

    public void setProgress(float f) {
        if (this.c == f) {
            return;
        }
        this.c = f;
        invalidate();
    }

    @Override // tjb
    public final void updateColors() {
        this.L = (byte) 0;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        ff0 ff0Var = this.J;
        return ff0Var != null && drawable == ff0Var;
    }

    public int a(int i) {
        return i;
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setOnCheckedChangeListener(rcb rcbVar) {
    }
}
