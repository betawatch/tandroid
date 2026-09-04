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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class Switch extends View {
    public int E;
    public Drawable F;
    public int G;
    public boolean H;
    public org.telegram.ui.Cells.z I;
    public Paint J;
    public final int[] K;
    public int L;
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
    public final org.telegram.ui.ActionBar.f6 W;
    public final le.b a;
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
    public float v;
    public int w;
    public int x;
    public int y;

    public Switch(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = new le.b(0, new ji.k5(this, 2), pr.h, 380L, true);
        this.v = 1.0f;
        this.w = org.telegram.ui.ActionBar.j6.r7;
        this.x = org.telegram.ui.ActionBar.j6.V6;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        this.y = i10;
        this.E = i10;
        this.K = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        this.W = f6Var;
        this.b = new RectF();
        this.n = new Paint(1);
        Paint paint = new Paint(1);
        this.r = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setHapticFeedbackEnabled(true);
    }

    public final void b(int i10, boolean z10, boolean z11) {
        if (z10 != this.h) {
            this.h = z10;
            if (this.f && z11) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z10 ? 1.0f : 0.0f);
                this.d = ofFloat;
                ofFloat.setDuration(200L);
                this.d.addListener(new ty0(this, 0));
                this.d.start();
            } else {
                ObjectAnimator objectAnimator = this.d;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                    this.d = null;
                }
                setProgress(z10 ? 1.0f : 0.0f);
            }
        }
        if (this.s != i10) {
            this.s = i10;
            if (this.f && z11) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "iconProgress", i10 == 0 ? 1.0f : 0.0f);
                this.e = ofFloat2;
                ofFloat2.setDuration(200L);
                this.e.addListener(new ty0(this, 1));
                this.e.start();
                return;
            }
            ObjectAnimator objectAnimator2 = this.e;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
                this.e = null;
            }
            setIconProgress(i10 == 0 ? 1.0f : 0.0f);
        }
    }

    public final void c(boolean z10, boolean z11) {
        b(this.s, z10, z11);
    }

    public final void d(int i10, int i11, int i12, int i13) {
        this.w = i10;
        this.x = i11;
        this.y = i12;
        this.E = i13;
    }

    public float getIconProgress() {
        return this.v;
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

    /* JADX WARN: Code restructure failed: missing block: B:105:0x020b, code lost:
    
        r6 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0211, code lost:
    
        if (r2 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c3, code lost:
    
        if (r12 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c5, code lost:
    
        r20 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
    
        if (r12 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0207, code lost:
    
        if (r2 == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0209, code lost:
    
        r6 = 0.0f;
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03ef  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        Paint paint;
        Paint paint2;
        float f7;
        Paint paint3;
        Paint paint4;
        Canvas canvas2;
        int i10;
        Paint paint5;
        org.telegram.ui.Cells.z zVar;
        Drawable drawable;
        if (getVisibility() != 0) {
            return;
        }
        int dp = AndroidUtilities.dp(31.0f);
        AndroidUtilities.dp(20.0f);
        int i11 = 2;
        int measuredWidth = (getMeasuredWidth() - dp) / 2;
        float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dpf2(14.0f)) / 2.0f;
        int dp2 = AndroidUtilities.dp(7.0f) + measuredWidth + ((int) (AndroidUtilities.dp(17.0f) * this.c));
        int measuredHeight2 = getMeasuredHeight() / 2;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            f6Var = this.W;
            paint = this.r;
            float f10 = 1.0f;
            paint2 = this.n;
            if (i13 >= i11) {
                break;
            }
            if (i13 == 1 && this.a0 == 0) {
                i10 = dp;
            } else {
                Canvas canvas3 = i13 == 0 ? canvas : this.O[i12];
                if (i13 == 1) {
                    this.N[i12].eraseColor(i12);
                    paint2.setColor(-16777216);
                    this.Q.drawRect(0.0f, 0.0f, this.P.getWidth(), this.P.getHeight(), paint2);
                    paint5 = paint2;
                    i10 = dp;
                    this.Q.drawCircle(this.R - getX(), this.S - getY(), this.T, this.U);
                } else {
                    i10 = dp;
                    paint5 = paint2;
                }
                int i14 = this.a0;
                if (i14 != 1) {
                    if (i14 != 2) {
                        f10 = this.c;
                    }
                    int a2 = a(org.telegram.ui.ActionBar.j6.v0(this.w, f6Var));
                    int a10 = a(org.telegram.ui.ActionBar.j6.v0(this.x, f6Var));
                    if (i13 == 0 && (drawable = this.F) != null) {
                        if (this.G != (this.h ? a10 : a2)) {
                            int i15 = this.h ? a10 : a2;
                            this.G = i15;
                            drawable.setColorFilter(new PorterDuffColorFilter(i15, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                    int red = Color.red(a2);
                    int red2 = Color.red(a10);
                    int green = Color.green(a2);
                    int green2 = Color.green(a10);
                    int blue = Color.blue(a2);
                    int blue2 = Color.blue(a10);
                    int alpha = (((int) (((blue2 - blue) * f10) + blue)) & 255) | ((((int) (((Color.alpha(a10) - r6) * f10) + Color.alpha(a2))) & 255) << 24) | ((((int) (((red2 - red) * f10) + red)) & 255) << 16) | ((((int) (((green2 - green) * f10) + green)) & 255) << 8);
                    paint5.setColor(alpha);
                    paint.setColor(alpha);
                    float dpf2 = AndroidUtilities.dpf2(14.0f) + measuredHeight;
                    RectF rectF = this.b;
                    rectF.set(measuredWidth, measuredHeight, measuredWidth + i10, dpf2);
                    canvas3.drawRoundRect(rectF, AndroidUtilities.dpf2(7.0f), AndroidUtilities.dpf2(7.0f), paint5);
                    canvas3.drawCircle(dp2, measuredHeight2, AndroidUtilities.dpf2(10.0f), paint5);
                    if (i13 == 0 && (zVar = this.I) != null) {
                        zVar.setBounds(dp2 - AndroidUtilities.dp(18.0f), measuredHeight2 - AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f) + dp2, AndroidUtilities.dp(18.0f) + measuredHeight2);
                        this.I.draw(canvas3);
                    } else if (i13 == 1) {
                        canvas3.drawBitmap(this.P, 0.0f, 0.0f, this.V);
                    }
                }
            }
            i13++;
            dp = i10;
            i11 = 2;
            i12 = 0;
        }
        Paint paint6 = paint2;
        if (this.a0 != 0) {
            canvas.drawBitmap(this.N[0], 0.0f, 0.0f, (Paint) null);
        }
        int i16 = 0;
        while (i16 < 2) {
            if (i16 == 1 && this.a0 == 0) {
                paint3 = paint6;
                paint4 = paint;
            } else {
                Canvas canvas4 = i16 == 0 ? canvas : this.O[1];
                if (i16 == 1) {
                    this.N[1].eraseColor(0);
                }
                int i17 = this.a0;
                if (i17 != 1) {
                    if (i17 != 2) {
                        f7 = this.c;
                    }
                }
                int v02 = org.telegram.ui.ActionBar.j6.v0(this.y, f6Var);
                int a11 = a(org.telegram.ui.ActionBar.j6.v0(this.E, f6Var));
                int red3 = Color.red(v02);
                int red4 = Color.red(a11);
                int green3 = Color.green(v02);
                int green4 = Color.green(a11);
                int blue3 = Color.blue(v02);
                int blue4 = Color.blue(a11);
                float f11 = f7;
                int i18 = ((int) (((blue4 - blue3) * f11) + blue3)) & 255;
                paint6.setColor(i18 | ((((int) (((red4 - red3) * f11) + red3)) & 255) << 16) | ((((int) (((Color.alpha(a11) - r7) * f11) + Color.alpha(v02))) & 255) << 24) | ((((int) (((green4 - green3) * f11) + green3)) & 255) << 8));
                float f12 = dp2;
                float f13 = measuredHeight2;
                canvas4.drawCircle(f12, f13, AndroidUtilities.dp(8.0f), paint6);
                if (i16 == 0) {
                    if (this.F != null) {
                        float f14 = this.a.e;
                        if (f14 > 0.0f) {
                            boolean z10 = f14 < 1.0f;
                            if (z10) {
                                canvas.save();
                                canvas.scale(f14, f14, f12, f13);
                            }
                            Drawable drawable2 = this.F;
                            drawable2.setBounds(org.telegram.messenger.wl.w(2, dp2, drawable2), org.telegram.messenger.wl.e(2, measuredHeight2, this.F), org.telegram.messenger.wl.B(2, dp2, this.F), org.telegram.messenger.wl.z(2, measuredHeight2, this.F));
                            this.F.draw(canvas4);
                            if (z10) {
                                canvas.restore();
                            }
                        }
                    } else {
                        int i19 = this.s;
                        if (i19 == 1) {
                            dp2 = (int) (f12 - (AndroidUtilities.dp(10.8f) - (AndroidUtilities.dp(1.3f) * this.c)));
                            measuredHeight2 = (int) (f13 - (AndroidUtilities.dp(8.5f) - (AndroidUtilities.dp(0.5f) * this.c)));
                            int dpf22 = ((int) AndroidUtilities.dpf2(4.6f)) + dp2;
                            int dpf23 = (int) (AndroidUtilities.dpf2(9.5f) + measuredHeight2);
                            int dp3 = AndroidUtilities.dp(2.0f) + dpf22;
                            int dp4 = AndroidUtilities.dp(2.0f) + dpf23;
                            int dpf24 = ((int) AndroidUtilities.dpf2(7.5f)) + dp2;
                            int dpf25 = ((int) AndroidUtilities.dpf2(5.4f)) + measuredHeight2;
                            int dp5 = AndroidUtilities.dp(7.0f) + dpf24;
                            int dp6 = AndroidUtilities.dp(7.0f) + dpf25;
                            paint3 = paint6;
                            float f15 = this.c;
                            paint4 = paint;
                            canvas2 = canvas4;
                            canvas2.drawLine((int) (((dpf22 - dpf24) * f15) + dpf24), (int) (((dpf23 - dpf25) * f15) + dpf25), (int) (((dp3 - dp5) * f15) + dp5), (int) (((dp4 - dp6) * f15) + dp6), paint4);
                            canvas2.drawLine(((int) AndroidUtilities.dpf2(7.5f)) + dp2, ((int) AndroidUtilities.dpf2(12.5f)) + measuredHeight2, AndroidUtilities.dp(7.0f) + r3, r4 - AndroidUtilities.dp(7.0f), paint4);
                            if (i16 == 1) {
                                canvas2.drawBitmap(this.P, 0.0f, 0.0f, this.V);
                                i16++;
                                paint = paint4;
                                paint6 = paint3;
                            }
                        } else {
                            paint3 = paint6;
                            Paint paint7 = paint;
                            canvas2 = canvas4;
                            if (i19 == 2 || this.e != null) {
                                paint7.setAlpha((int) ((1.0f - this.v) * 255.0f));
                                paint4 = paint7;
                                canvas2.drawLine(f12, f13, f12, measuredHeight2 - AndroidUtilities.dp(5.0f), paint4);
                                canvas2.save();
                                canvas2.rotate(this.v * (-90.0f), f12, f13);
                                canvas2.drawLine(f12, f13, AndroidUtilities.dp(4.0f) + dp2, f13, paint4);
                                canvas2.restore();
                            } else {
                                paint4 = paint7;
                            }
                            if (i16 == 1) {
                            }
                        }
                    }
                }
                paint3 = paint6;
                paint4 = paint;
                canvas2 = canvas4;
                if (i16 == 1) {
                }
            }
            i16++;
            paint = paint4;
            paint6 = paint3;
        }
        if (this.a0 != 0) {
            canvas.drawBitmap(this.N[1], 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.h);
    }

    public void setDrawIconType(int i10) {
        this.s = i10;
    }

    public void setDrawRipple(boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (z10 == this.H) {
            return;
        }
        this.H = z10;
        if (this.I == null) {
            Paint paint = new Paint(1);
            this.J = paint;
            paint.setColor(-1);
            org.telegram.ui.Cells.z zVar = new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{0}), null, i10 >= 23 ? null : new di.e4(this, 5));
            this.I = zVar;
            if (i10 >= 23) {
                zVar.setRadius(AndroidUtilities.dp(18.0f));
            }
            this.I.setCallback(this);
        }
        boolean z11 = this.h;
        if ((z11 && this.L != 2) || (!z11 && this.L != 1)) {
            this.I.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{a(org.telegram.ui.ActionBar.j6.v0(z11 ? org.telegram.ui.ActionBar.j6.T6 : org.telegram.ui.ActionBar.j6.S6, this.W))}));
            this.L = this.h ? 2 : 1;
        }
        if (i10 >= 28 && z10) {
            this.I.setHotspot(this.h ? 0.0f : AndroidUtilities.dp(100.0f), AndroidUtilities.dp(18.0f));
        }
        this.I.setState(z10 ? this.K : StateSet.NOTHING);
        invalidate();
    }

    public void setIcon(int i10) {
        if (i10 != 0) {
            Drawable mutate = getResources().getDrawable(i10).mutate();
            this.F = mutate;
            if (mutate != null) {
                int v02 = org.telegram.ui.ActionBar.j6.v0(this.h ? this.x : this.w, this.W);
                this.G = v02;
                mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
            }
        } else {
            this.F = null;
        }
        invalidate();
    }

    public void setIconProgress(float f7) {
        if (this.v == f7) {
            return;
        }
        this.v = f7;
        invalidate();
    }

    public void setOverrideColor(int i10) {
        if (this.a0 == i10) {
            return;
        }
        if (this.N == null) {
            try {
                this.N = new Bitmap[2];
                this.O = new Canvas[2];
                for (int i11 = 0; i11 < 2; i11++) {
                    this.N[i11] = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    this.O[i11] = new Canvas(this.N[i11]);
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
            this.a0 = i10;
            this.R = 0.0f;
            this.S = 0.0f;
            this.T = 0.0f;
            invalidate();
        }
    }

    public void setProgress(float f7) {
        if (this.c == f7) {
            return;
        }
        this.c = f7;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        org.telegram.ui.Cells.z zVar = this.I;
        return zVar != null && drawable == zVar;
    }

    public int a(int i10) {
        return i10;
    }

    public void setOnCheckedChangeListener(uy0 uy0Var) {
    }
}
