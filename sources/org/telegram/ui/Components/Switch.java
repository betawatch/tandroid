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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class Switch extends View implements org.telegram.ui.ActionBar.a6 {
    public int D;
    public int E;
    public Drawable F;
    public int G;
    public boolean H;
    public org.telegram.ui.Cells.y I;
    public final int[] J;
    public int K;
    public boolean L;
    public Bitmap[] M;
    public Canvas[] N;
    public Bitmap O;
    public Canvas P;
    public float Q;
    public float R;
    public float S;
    public Paint T;
    public Paint U;
    public final org.telegram.ui.ActionBar.f6 V;
    public int W;
    public final te.a a;
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

    public Switch(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = new te.a(0, new org.telegram.ui.ActionBar.m3(this, 19), xq.h, 380L, true);
        this.w = 1.0f;
        this.x = org.telegram.ui.ActionBar.k6.r7;
        this.y = org.telegram.ui.ActionBar.k6.V6;
        int i7 = org.telegram.ui.ActionBar.k6.d6;
        this.D = i7;
        this.E = i7;
        this.J = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        this.V = f6Var;
        this.b = new RectF();
        this.n = new Paint(1);
        Paint paint = new Paint(1);
        this.r = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        setHapticFeedbackEnabled(true);
    }

    public final void b(int i7, boolean z9, boolean z10) {
        if (z9 != this.h) {
            this.h = z9;
            if (this.f && z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z9 ? 1.0f : 0.0f);
                this.d = ofFloat;
                ofFloat.setDuration(200L);
                this.d.addListener(new vw0(this, 0));
                this.d.start();
            } else {
                ObjectAnimator objectAnimator = this.d;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                    this.d = null;
                }
                setProgress(z9 ? 1.0f : 0.0f);
            }
        }
        if (this.s != i7) {
            this.s = i7;
            if (this.f && z10) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "iconProgress", i7 == 0 ? 1.0f : 0.0f);
                this.e = ofFloat2;
                ofFloat2.setDuration(200L);
                this.e.addListener(new vw0(this, 1));
                this.e.start();
                return;
            }
            ObjectAnimator objectAnimator2 = this.e;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
                this.e = null;
            }
            setIconProgress(i7 == 0 ? 1.0f : 0.0f);
        }
    }

    public final void c(boolean z9, boolean z10) {
        b(this.s, z9, z10);
    }

    public final void d(int i7, int i10, int i11, int i12) {
        this.x = i7;
        this.y = i10;
        this.D = i11;
        this.E = i12;
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

    /* JADX WARN: Code restructure failed: missing block: B:104:0x020e, code lost:
    
        r6 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0214, code lost:
    
        if (r2 == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c2, code lost:
    
        if (r12 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c4, code lost:
    
        r20 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ca, code lost:
    
        if (r12 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x020a, code lost:
    
        if (r2 == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x020c, code lost:
    
        r6 = 0.0f;
     */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03ed  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        Paint paint;
        Paint paint2;
        float f10;
        float f11;
        Paint paint3;
        Paint paint4;
        Canvas canvas2;
        int i7;
        int i10;
        int i11;
        Paint paint5;
        org.telegram.ui.Cells.y yVar;
        Drawable drawable;
        if (getVisibility() != 0) {
            return;
        }
        int L = org.telegram.messenger.g0.L(31.0f);
        org.telegram.messenger.g0.L(20.0f);
        int i12 = 2;
        int measuredWidth = (getMeasuredWidth() - L) / 2;
        float f12 = 14.0f;
        float f13 = 2.0f;
        float measuredHeight = (getMeasuredHeight() - org.telegram.messenger.g0.N(14.0f)) / 2.0f;
        float f14 = 7.0f;
        int L2 = org.telegram.messenger.g0.L(7.0f) + measuredWidth + ((int) (org.telegram.messenger.g0.L(17.0f) * this.c));
        int measuredHeight2 = getMeasuredHeight() / 2;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            f6Var = this.V;
            paint = this.r;
            float f15 = 1.0f;
            paint2 = this.n;
            float f16 = f12;
            f10 = f13;
            if (i14 >= i12) {
                break;
            }
            float f17 = f14;
            if (i14 == 1 && this.W == 0) {
                i10 = L;
                i11 = i13;
            } else {
                Canvas canvas3 = i14 == 0 ? canvas : this.N[i13];
                if (i14 == 1) {
                    this.M[i13].eraseColor(i13);
                    paint2.setColor(-16777216);
                    i11 = i13;
                    this.P.drawRect(0.0f, 0.0f, this.O.getWidth(), this.O.getHeight(), paint2);
                    paint5 = paint2;
                    i10 = L;
                    this.P.drawCircle(this.Q - getX(), this.R - getY(), this.S, this.T);
                } else {
                    i10 = L;
                    i11 = i13;
                    paint5 = paint2;
                }
                int i15 = this.W;
                if (i15 != 1) {
                    if (i15 != 2) {
                        f15 = this.c;
                    }
                    int a10 = a(org.telegram.ui.ActionBar.k6.w0(this.x, f6Var));
                    int a11 = a(org.telegram.ui.ActionBar.k6.w0(this.y, f6Var));
                    if (i14 == 0 && (drawable = this.F) != null) {
                        if (this.G != (this.h ? a11 : a10)) {
                            int i16 = this.h ? a11 : a10;
                            this.G = i16;
                            drawable.setColorFilter(new PorterDuffColorFilter(i16, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                    int red = Color.red(a10);
                    int red2 = Color.red(a11);
                    int green = Color.green(a10);
                    int green2 = Color.green(a11);
                    int blue = Color.blue(a10);
                    int blue2 = Color.blue(a11);
                    int alpha = (((int) (((blue2 - blue) * f15) + blue)) & org.telegram.messenger.qs.e4) | ((((int) (((Color.alpha(a11) - r6) * f15) + Color.alpha(a10))) & org.telegram.messenger.qs.e4) << 24) | ((((int) (((red2 - red) * f15) + red)) & org.telegram.messenger.qs.e4) << 16) | ((((int) (((green2 - green) * f15) + green)) & org.telegram.messenger.qs.e4) << 8);
                    paint5.setColor(alpha);
                    paint.setColor(alpha);
                    float N = org.telegram.messenger.g0.N(f16) + measuredHeight;
                    RectF rectF = this.b;
                    rectF.set(measuredWidth, measuredHeight, measuredWidth + i10, N);
                    canvas3.drawRoundRect(rectF, org.telegram.messenger.g0.N(f17), org.telegram.messenger.g0.N(f17), paint5);
                    canvas3.drawCircle(L2, measuredHeight2, org.telegram.messenger.g0.N(10.0f), paint5);
                    if (i14 == 0 && (yVar = this.I) != null) {
                        yVar.setBounds(L2 - org.telegram.messenger.g0.L(18.0f), measuredHeight2 - org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f) + L2, org.telegram.messenger.g0.L(18.0f) + measuredHeight2);
                        this.I.draw(canvas3);
                    } else if (i14 == 1) {
                        canvas3.drawBitmap(this.O, 0.0f, 0.0f, this.U);
                    }
                }
            }
            i14++;
            f12 = f16;
            L = i10;
            f13 = f10;
            f14 = f17;
            i13 = i11;
            i12 = 2;
        }
        float f18 = f14;
        int i17 = i13;
        Paint paint6 = paint2;
        if (this.W != 0) {
            canvas.drawBitmap(this.M[i17], 0.0f, 0.0f, (Paint) null);
        }
        int i18 = i17;
        int i19 = 2;
        while (i18 < i19) {
            if (i18 == 1 && this.W == 0) {
                paint3 = paint6;
                paint4 = paint;
                i7 = 2;
            } else {
                Canvas canvas4 = i18 == 0 ? canvas : this.N[1];
                if (i18 == 1) {
                    this.M[1].eraseColor(i17);
                }
                int i20 = this.W;
                if (i20 != 1) {
                    if (i20 != 2) {
                        f11 = this.c;
                    }
                }
                int w02 = org.telegram.ui.ActionBar.k6.w0(this.D, f6Var);
                int a12 = a(org.telegram.ui.ActionBar.k6.w0(this.E, f6Var));
                int red3 = Color.red(w02);
                int red4 = Color.red(a12);
                int green3 = Color.green(w02);
                int green4 = Color.green(a12);
                int blue3 = Color.blue(w02);
                int blue4 = Color.blue(a12);
                float f19 = f11;
                paint6.setColor((((int) (((blue4 - blue3) * f19) + blue3)) & org.telegram.messenger.qs.e4) | ((((int) (((red4 - red3) * f19) + red3)) & org.telegram.messenger.qs.e4) << 16) | ((((int) (((Color.alpha(a12) - r7) * f19) + Color.alpha(w02))) & org.telegram.messenger.qs.e4) << 24) | ((((int) (((green4 - green3) * f19) + green3)) & org.telegram.messenger.qs.e4) << 8));
                float f20 = L2;
                float f21 = measuredHeight2;
                canvas4.drawCircle(f20, f21, org.telegram.messenger.g0.L(8.0f), paint6);
                if (i18 == 0) {
                    if (this.F != null) {
                        float f22 = this.a.e;
                        if (f22 > 0.0f) {
                            boolean z9 = f22 < 1.0f;
                            if (z9) {
                                canvas.save();
                                canvas.scale(f22, f22, f20, f21);
                            }
                            Drawable drawable2 = this.F;
                            drawable2.setBounds(org.telegram.ui.Cells.f1.z(2, L2, drawable2), org.telegram.ui.Cells.f1.y(2, measuredHeight2, this.F), org.telegram.ui.Cells.f1.w(2, L2, this.F), org.telegram.ui.Cells.f1.f(2, measuredHeight2, this.F));
                            this.F.draw(canvas4);
                            if (z9) {
                                canvas.restore();
                            }
                        }
                    } else {
                        int i21 = this.s;
                        if (i21 == 1) {
                            L2 = (int) (f20 - (org.telegram.messenger.g0.L(10.8f) - (org.telegram.messenger.g0.L(1.3f) * this.c)));
                            measuredHeight2 = (int) (f21 - (org.telegram.messenger.g0.L(8.5f) - (org.telegram.messenger.g0.L(0.5f) * this.c)));
                            int N2 = ((int) org.telegram.messenger.g0.N(4.6f)) + L2;
                            int N3 = (int) (org.telegram.messenger.g0.N(9.5f) + measuredHeight2);
                            int L3 = org.telegram.messenger.g0.L(f10) + N2;
                            int L4 = org.telegram.messenger.g0.L(f10) + N3;
                            int N4 = ((int) org.telegram.messenger.g0.N(7.5f)) + L2;
                            int N5 = ((int) org.telegram.messenger.g0.N(5.4f)) + measuredHeight2;
                            int L5 = org.telegram.messenger.g0.L(f18) + N4;
                            int L6 = org.telegram.messenger.g0.L(f18) + N5;
                            paint3 = paint6;
                            float f23 = this.c;
                            paint4 = paint;
                            canvas2 = canvas4;
                            canvas2.drawLine((int) (((N2 - N4) * f23) + N4), (int) (((N3 - N5) * f23) + N5), (int) (((L3 - L5) * f23) + L5), (int) (((L4 - L6) * f23) + L6), paint4);
                            canvas2.drawLine(((int) org.telegram.messenger.g0.N(7.5f)) + L2, ((int) org.telegram.messenger.g0.N(12.5f)) + measuredHeight2, org.telegram.messenger.g0.L(f18) + r3, r4 - org.telegram.messenger.g0.L(f18), paint4);
                            i7 = 2;
                            if (i18 == 1) {
                                canvas2.drawBitmap(this.O, 0.0f, 0.0f, this.U);
                                i18++;
                                i19 = i7;
                                paint = paint4;
                                paint6 = paint3;
                                i17 = 0;
                            }
                        } else {
                            paint3 = paint6;
                            Paint paint7 = paint;
                            canvas2 = canvas4;
                            i7 = 2;
                            if (i21 == 2 || this.e != null) {
                                paint7.setAlpha((int) ((1.0f - this.w) * 255.0f));
                                paint4 = paint7;
                                canvas2.drawLine(f20, f21, f20, measuredHeight2 - org.telegram.messenger.g0.L(5.0f), paint4);
                                canvas2.save();
                                canvas2.rotate(this.w * (-90.0f), f20, f21);
                                canvas2.drawLine(f20, f21, org.telegram.messenger.g0.L(4.0f) + L2, f21, paint4);
                                canvas2.restore();
                            } else {
                                paint4 = paint7;
                            }
                            if (i18 == 1) {
                            }
                        }
                    }
                }
                paint3 = paint6;
                paint4 = paint;
                canvas2 = canvas4;
                i7 = 2;
                if (i18 == 1) {
                }
            }
            i18++;
            i19 = i7;
            paint = paint4;
            paint6 = paint3;
            i17 = 0;
        }
        if (this.W != 0) {
            canvas.drawBitmap(this.M[1], 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.h);
    }

    public void setDrawIconType(int i7) {
        this.s = i7;
    }

    public void setDrawRipple(boolean z9) {
        int i7 = Build.VERSION.SDK_INT;
        if (z9 == this.H) {
            return;
        }
        this.H = z9;
        if (this.I == null) {
            new Paint(1).setColor(-1);
            org.telegram.ui.Cells.y yVar = new org.telegram.ui.Cells.y(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{0}), null, null);
            this.I = yVar;
            yVar.setRadius(org.telegram.messenger.g0.L(18.0f));
            this.I.setCallback(this);
        }
        boolean z10 = this.h;
        if ((z10 && this.K != 2) || (!z10 && this.K != 1)) {
            this.I.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{a(org.telegram.ui.ActionBar.k6.w0(z10 ? org.telegram.ui.ActionBar.k6.T6 : org.telegram.ui.ActionBar.k6.S6, this.V))}));
            this.K = this.h ? 2 : 1;
        }
        if (i7 >= 28 && z9) {
            this.I.setHotspot(this.h ? 0.0f : org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(18.0f));
        }
        this.I.setState(z9 ? this.J : StateSet.NOTHING);
        invalidate();
    }

    public void setIcon(int i7) {
        if (i7 != 0) {
            Drawable mutate = getResources().getDrawable(i7).mutate();
            this.F = mutate;
            if (mutate != null) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(this.h ? this.y : this.x, this.V);
                this.G = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
        } else {
            this.F = null;
        }
        invalidate();
    }

    public void setIconProgress(float f10) {
        if (this.w == f10) {
            return;
        }
        this.w = f10;
        invalidate();
    }

    public void setOverrideColor(int i7) {
        if (this.W == i7) {
            return;
        }
        if (this.M == null) {
            try {
                this.M = new Bitmap[2];
                this.N = new Canvas[2];
                for (int i10 = 0; i10 < 2; i10++) {
                    this.M[i10] = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    this.N[i10] = new Canvas(this.M[i10]);
                }
                this.O = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.P = new Canvas(this.O);
                Paint paint = new Paint(1);
                this.T = paint;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                Paint paint2 = new Paint(1);
                this.U = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.L = true;
            } catch (Throwable unused) {
                return;
            }
        }
        if (this.L) {
            this.W = i7;
            this.Q = 0.0f;
            this.R = 0.0f;
            this.S = 0.0f;
            invalidate();
        }
    }

    public void setProgress(float f10) {
        if (this.c == f10) {
            return;
        }
        this.c = f10;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        this.K = 0;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        org.telegram.ui.Cells.y yVar = this.I;
        return yVar != null && drawable == yVar;
    }

    public int a(int i7) {
        return i7;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setOnCheckedChangeListener(ww0 ww0Var) {
    }
}
