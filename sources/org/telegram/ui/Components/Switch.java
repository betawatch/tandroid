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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class Switch extends View {
    public int B;
    public Drawable C;
    public int D;
    public boolean E;
    public org.telegram.ui.Cells.z F;
    public Paint G;
    public final int[] H;
    public int I;
    public boolean J;
    public Bitmap[] K;
    public Canvas[] L;
    public Bitmap M;
    public Canvas N;
    public float O;
    public float P;
    public float Q;
    public Paint R;
    public Paint S;
    public final org.telegram.ui.ActionBar.g6 T;
    public int U;
    public final xd.a a;
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

    public Switch(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = new xd.a(0, new sf.g(this, 21), pr.h, 380L, true);
        this.v = 1.0f;
        this.w = org.telegram.ui.ActionBar.k6.r7;
        this.x = org.telegram.ui.ActionBar.k6.V6;
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        this.y = i10;
        this.B = i10;
        this.H = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        this.T = g6Var;
        this.b = new RectF();
        this.n = new Paint(1);
        Paint paint = new Paint(1);
        this.r = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setHapticFeedbackEnabled(true);
    }

    public final void b(int i10, boolean z4, boolean z10) {
        if (z4 != this.h) {
            this.h = z4;
            if (this.f && z10) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z4 ? 1.0f : 0.0f);
                this.d = ofFloat;
                ofFloat.setDuration(200L);
                this.d.addListener(new yy0(this, 0));
                this.d.start();
            } else {
                ObjectAnimator objectAnimator = this.d;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                    this.d = null;
                }
                setProgress(z4 ? 1.0f : 0.0f);
            }
        }
        if (this.s != i10) {
            this.s = i10;
            if (this.f && z10) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "iconProgress", i10 == 0 ? 1.0f : 0.0f);
                this.e = ofFloat2;
                ofFloat2.setDuration(200L);
                this.e.addListener(new yy0(this, 1));
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

    public final void c(boolean z4, boolean z10) {
        b(this.s, z4, z10);
    }

    public final void d(int i10, int i11, int i12, int i13) {
        this.w = i10;
        this.x = i11;
        this.y = i12;
        this.B = i13;
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
        org.telegram.ui.ActionBar.g6 g6Var;
        Paint paint;
        Paint paint2;
        float f10;
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
            g6Var = this.T;
            paint = this.r;
            float f11 = 1.0f;
            paint2 = this.n;
            if (i13 >= i11) {
                break;
            }
            if (i13 == 1 && this.U == 0) {
                i10 = dp;
            } else {
                Canvas canvas3 = i13 == 0 ? canvas : this.L[i12];
                if (i13 == 1) {
                    this.K[i12].eraseColor(i12);
                    paint2.setColor(-16777216);
                    this.N.drawRect(0.0f, 0.0f, this.M.getWidth(), this.M.getHeight(), paint2);
                    paint5 = paint2;
                    i10 = dp;
                    this.N.drawCircle(this.O - getX(), this.P - getY(), this.Q, this.R);
                } else {
                    i10 = dp;
                    paint5 = paint2;
                }
                int i14 = this.U;
                if (i14 != 1) {
                    if (i14 != 2) {
                        f11 = this.c;
                    }
                    int a2 = a(org.telegram.ui.ActionBar.k6.v0(this.w, g6Var));
                    int a10 = a(org.telegram.ui.ActionBar.k6.v0(this.x, g6Var));
                    if (i13 == 0 && (drawable = this.C) != null) {
                        if (this.D != (this.h ? a10 : a2)) {
                            int i15 = this.h ? a10 : a2;
                            this.D = i15;
                            drawable.setColorFilter(new PorterDuffColorFilter(i15, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                    int red = Color.red(a2);
                    int red2 = Color.red(a10);
                    int green = Color.green(a2);
                    int green2 = Color.green(a10);
                    int blue = Color.blue(a2);
                    int blue2 = Color.blue(a10);
                    int alpha = (((int) (((blue2 - blue) * f11) + blue)) & 255) | ((((int) (((Color.alpha(a10) - r6) * f11) + Color.alpha(a2))) & 255) << 24) | ((((int) (((red2 - red) * f11) + red)) & 255) << 16) | ((((int) (((green2 - green) * f11) + green)) & 255) << 8);
                    paint5.setColor(alpha);
                    paint.setColor(alpha);
                    float dpf2 = AndroidUtilities.dpf2(14.0f) + measuredHeight;
                    RectF rectF = this.b;
                    rectF.set(measuredWidth, measuredHeight, measuredWidth + i10, dpf2);
                    canvas3.drawRoundRect(rectF, AndroidUtilities.dpf2(7.0f), AndroidUtilities.dpf2(7.0f), paint5);
                    canvas3.drawCircle(dp2, measuredHeight2, AndroidUtilities.dpf2(10.0f), paint5);
                    if (i13 == 0 && (zVar = this.F) != null) {
                        zVar.setBounds(dp2 - AndroidUtilities.dp(18.0f), measuredHeight2 - AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f) + dp2, AndroidUtilities.dp(18.0f) + measuredHeight2);
                        this.F.draw(canvas3);
                    } else if (i13 == 1) {
                        canvas3.drawBitmap(this.M, 0.0f, 0.0f, this.S);
                    }
                }
            }
            i13++;
            dp = i10;
            i11 = 2;
            i12 = 0;
        }
        Paint paint6 = paint2;
        if (this.U != 0) {
            canvas.drawBitmap(this.K[0], 0.0f, 0.0f, (Paint) null);
        }
        int i16 = 0;
        while (i16 < 2) {
            if (i16 == 1 && this.U == 0) {
                paint3 = paint6;
                paint4 = paint;
            } else {
                Canvas canvas4 = i16 == 0 ? canvas : this.L[1];
                if (i16 == 1) {
                    this.K[1].eraseColor(0);
                }
                int i17 = this.U;
                if (i17 != 1) {
                    if (i17 != 2) {
                        f10 = this.c;
                    }
                }
                int v02 = org.telegram.ui.ActionBar.k6.v0(this.y, g6Var);
                int a11 = a(org.telegram.ui.ActionBar.k6.v0(this.B, g6Var));
                int red3 = Color.red(v02);
                int red4 = Color.red(a11);
                int green3 = Color.green(v02);
                int green4 = Color.green(a11);
                int blue3 = Color.blue(v02);
                int blue4 = Color.blue(a11);
                float f12 = f10;
                int i18 = ((int) (((blue4 - blue3) * f12) + blue3)) & 255;
                paint6.setColor(i18 | ((((int) (((red4 - red3) * f12) + red3)) & 255) << 16) | ((((int) (((Color.alpha(a11) - r7) * f12) + Color.alpha(v02))) & 255) << 24) | ((((int) (((green4 - green3) * f12) + green3)) & 255) << 8));
                float f13 = dp2;
                float f14 = measuredHeight2;
                canvas4.drawCircle(f13, f14, AndroidUtilities.dp(8.0f), paint6);
                if (i16 == 0) {
                    if (this.C != null) {
                        float f15 = this.a.e;
                        if (f15 > 0.0f) {
                            boolean z4 = f15 < 1.0f;
                            if (z4) {
                                canvas.save();
                                canvas.scale(f15, f15, f13, f14);
                            }
                            Drawable drawable2 = this.C;
                            drawable2.setBounds(org.telegram.ui.b.u(2, dp2, drawable2), org.telegram.ui.b.f(2, measuredHeight2, this.C), org.telegram.ui.b.A(2, dp2, this.C), org.telegram.ui.b.y(2, measuredHeight2, this.C));
                            this.C.draw(canvas4);
                            if (z4) {
                                canvas.restore();
                            }
                        }
                    } else {
                        int i19 = this.s;
                        if (i19 == 1) {
                            dp2 = (int) (f13 - (AndroidUtilities.dp(10.8f) - (AndroidUtilities.dp(1.3f) * this.c)));
                            measuredHeight2 = (int) (f14 - (AndroidUtilities.dp(8.5f) - (AndroidUtilities.dp(0.5f) * this.c)));
                            int dpf22 = ((int) AndroidUtilities.dpf2(4.6f)) + dp2;
                            int dpf23 = (int) (AndroidUtilities.dpf2(9.5f) + measuredHeight2);
                            int dp3 = AndroidUtilities.dp(2.0f) + dpf22;
                            int dp4 = AndroidUtilities.dp(2.0f) + dpf23;
                            int dpf24 = ((int) AndroidUtilities.dpf2(7.5f)) + dp2;
                            int dpf25 = ((int) AndroidUtilities.dpf2(5.4f)) + measuredHeight2;
                            int dp5 = AndroidUtilities.dp(7.0f) + dpf24;
                            int dp6 = AndroidUtilities.dp(7.0f) + dpf25;
                            paint3 = paint6;
                            float f16 = this.c;
                            paint4 = paint;
                            canvas2 = canvas4;
                            canvas2.drawLine((int) (((dpf22 - dpf24) * f16) + dpf24), (int) (((dpf23 - dpf25) * f16) + dpf25), (int) (((dp3 - dp5) * f16) + dp5), (int) (((dp4 - dp6) * f16) + dp6), paint4);
                            canvas2.drawLine(((int) AndroidUtilities.dpf2(7.5f)) + dp2, ((int) AndroidUtilities.dpf2(12.5f)) + measuredHeight2, AndroidUtilities.dp(7.0f) + r3, r4 - AndroidUtilities.dp(7.0f), paint4);
                            if (i16 == 1) {
                                canvas2.drawBitmap(this.M, 0.0f, 0.0f, this.S);
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
                                canvas2.drawLine(f13, f14, f13, measuredHeight2 - AndroidUtilities.dp(5.0f), paint4);
                                canvas2.save();
                                canvas2.rotate(this.v * (-90.0f), f13, f14);
                                canvas2.drawLine(f13, f14, AndroidUtilities.dp(4.0f) + dp2, f14, paint4);
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
        if (this.U != 0) {
            canvas.drawBitmap(this.K[1], 0.0f, 0.0f, (Paint) null);
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

    public void setDrawRipple(boolean z4) {
        int i10 = Build.VERSION.SDK_INT;
        if (z4 == this.E) {
            return;
        }
        this.E = z4;
        if (this.F == null) {
            Paint paint = new Paint(1);
            this.G = paint;
            paint.setColor(-1);
            org.telegram.ui.Cells.z zVar = new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{0}), null, i10 >= 23 ? null : new eg.i1(this, 5));
            this.F = zVar;
            if (i10 >= 23) {
                zVar.setRadius(AndroidUtilities.dp(18.0f));
            }
            this.F.setCallback(this);
        }
        boolean z10 = this.h;
        if ((z10 && this.I != 2) || (!z10 && this.I != 1)) {
            this.F.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{a(org.telegram.ui.ActionBar.k6.v0(z10 ? org.telegram.ui.ActionBar.k6.T6 : org.telegram.ui.ActionBar.k6.S6, this.T))}));
            this.I = this.h ? 2 : 1;
        }
        if (i10 >= 28 && z4) {
            this.F.setHotspot(this.h ? 0.0f : AndroidUtilities.dp(100.0f), AndroidUtilities.dp(18.0f));
        }
        this.F.setState(z4 ? this.H : StateSet.NOTHING);
        invalidate();
    }

    public void setIcon(int i10) {
        if (i10 != 0) {
            Drawable mutate = getResources().getDrawable(i10).mutate();
            this.C = mutate;
            if (mutate != null) {
                int v02 = org.telegram.ui.ActionBar.k6.v0(this.h ? this.x : this.w, this.T);
                this.D = v02;
                mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
            }
        } else {
            this.C = null;
        }
        invalidate();
    }

    public void setIconProgress(float f10) {
        if (this.v == f10) {
            return;
        }
        this.v = f10;
        invalidate();
    }

    public void setOverrideColor(int i10) {
        if (this.U == i10) {
            return;
        }
        if (this.K == null) {
            try {
                this.K = new Bitmap[2];
                this.L = new Canvas[2];
                for (int i11 = 0; i11 < 2; i11++) {
                    this.K[i11] = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    this.L[i11] = new Canvas(this.K[i11]);
                }
                this.M = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.N = new Canvas(this.M);
                Paint paint = new Paint(1);
                this.R = paint;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                Paint paint2 = new Paint(1);
                this.S = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.J = true;
            } catch (Throwable unused) {
                return;
            }
        }
        if (this.J) {
            this.U = i10;
            this.O = 0.0f;
            this.P = 0.0f;
            this.Q = 0.0f;
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

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        org.telegram.ui.Cells.z zVar = this.F;
        return zVar != null && drawable == zVar;
    }

    public int a(int i10) {
        return i10;
    }

    public void setOnCheckedChangeListener(zy0 zy0Var) {
    }
}
