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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class Switch extends View {
    public int E;
    public Drawable F;
    public int G;
    public boolean H;
    public org.telegram.ui.Cells.z I;
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
    public final org.telegram.ui.ActionBar.e6 V;
    public int W;
    public final me.b a;
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

    public Switch(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = new me.b(0, new m4.w(this, 6), hs.h, 380L, true);
        this.v = 1.0f;
        this.w = org.telegram.ui.ActionBar.i6.r7;
        this.x = org.telegram.ui.ActionBar.i6.V6;
        int i10 = org.telegram.ui.ActionBar.i6.d6;
        this.y = i10;
        this.E = i10;
        this.J = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        this.V = e6Var;
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
                this.d.addListener(new vz0(this, 0));
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
                this.e.addListener(new vz0(this, 1));
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
        org.telegram.ui.ActionBar.e6 e6Var;
        Paint paint;
        Paint paint2;
        float f7;
        float f10;
        Paint paint3;
        Paint paint4;
        Canvas canvas2;
        int i10;
        int i11;
        int i12;
        Paint paint5;
        org.telegram.ui.Cells.z zVar;
        Drawable drawable;
        if (getVisibility() != 0) {
            return;
        }
        int dp = AndroidUtilities.dp(31.0f);
        AndroidUtilities.dp(20.0f);
        int i13 = 2;
        int measuredWidth = (getMeasuredWidth() - dp) / 2;
        float f11 = 14.0f;
        float f12 = 2.0f;
        float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dpf2(14.0f)) / 2.0f;
        float f13 = 7.0f;
        int dp2 = AndroidUtilities.dp(7.0f) + measuredWidth + ((int) (AndroidUtilities.dp(17.0f) * this.c));
        int measuredHeight2 = getMeasuredHeight() / 2;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            e6Var = this.V;
            paint = this.r;
            float f14 = 1.0f;
            paint2 = this.n;
            float f15 = f11;
            f7 = f12;
            if (i15 >= i13) {
                break;
            }
            float f16 = f13;
            if (i15 == 1 && this.W == 0) {
                i11 = dp;
                i12 = i14;
            } else {
                Canvas canvas3 = i15 == 0 ? canvas : this.N[i14];
                if (i15 == 1) {
                    this.M[i14].eraseColor(i14);
                    paint2.setColor(-16777216);
                    i12 = i14;
                    this.P.drawRect(0.0f, 0.0f, this.O.getWidth(), this.O.getHeight(), paint2);
                    paint5 = paint2;
                    i11 = dp;
                    this.P.drawCircle(this.Q - getX(), this.R - getY(), this.S, this.T);
                } else {
                    i11 = dp;
                    i12 = i14;
                    paint5 = paint2;
                }
                int i16 = this.W;
                if (i16 != 1) {
                    if (i16 != 2) {
                        f14 = this.c;
                    }
                    int a2 = a(org.telegram.ui.ActionBar.i6.w0(this.w, e6Var));
                    int a10 = a(org.telegram.ui.ActionBar.i6.w0(this.x, e6Var));
                    if (i15 == 0 && (drawable = this.F) != null) {
                        if (this.G != (this.h ? a10 : a2)) {
                            int i17 = this.h ? a10 : a2;
                            this.G = i17;
                            drawable.setColorFilter(new PorterDuffColorFilter(i17, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                    int red = Color.red(a2);
                    int red2 = Color.red(a10);
                    int green = Color.green(a2);
                    int green2 = Color.green(a10);
                    int blue = Color.blue(a2);
                    int blue2 = Color.blue(a10);
                    int alpha = (((int) (((blue2 - blue) * f14) + blue)) & 255) | ((((int) (((Color.alpha(a10) - r6) * f14) + Color.alpha(a2))) & 255) << 24) | ((((int) (((red2 - red) * f14) + red)) & 255) << 16) | ((((int) (((green2 - green) * f14) + green)) & 255) << 8);
                    paint5.setColor(alpha);
                    paint.setColor(alpha);
                    float dpf2 = AndroidUtilities.dpf2(f15) + measuredHeight;
                    RectF rectF = this.b;
                    rectF.set(measuredWidth, measuredHeight, measuredWidth + i11, dpf2);
                    canvas3.drawRoundRect(rectF, AndroidUtilities.dpf2(f16), AndroidUtilities.dpf2(f16), paint5);
                    canvas3.drawCircle(dp2, measuredHeight2, AndroidUtilities.dpf2(10.0f), paint5);
                    if (i15 == 0 && (zVar = this.I) != null) {
                        zVar.setBounds(dp2 - AndroidUtilities.dp(18.0f), measuredHeight2 - AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f) + dp2, AndroidUtilities.dp(18.0f) + measuredHeight2);
                        this.I.draw(canvas3);
                    } else if (i15 == 1) {
                        canvas3.drawBitmap(this.O, 0.0f, 0.0f, this.U);
                    }
                }
            }
            i15++;
            f11 = f15;
            dp = i11;
            f12 = f7;
            f13 = f16;
            i14 = i12;
            i13 = 2;
        }
        float f17 = f13;
        int i18 = i14;
        Paint paint6 = paint2;
        if (this.W != 0) {
            canvas.drawBitmap(this.M[i18], 0.0f, 0.0f, (Paint) null);
        }
        int i19 = i18;
        int i20 = 2;
        while (i19 < i20) {
            if (i19 == 1 && this.W == 0) {
                paint3 = paint6;
                paint4 = paint;
                i10 = 2;
            } else {
                Canvas canvas4 = i19 == 0 ? canvas : this.N[1];
                if (i19 == 1) {
                    this.M[1].eraseColor(i18);
                }
                int i21 = this.W;
                if (i21 != 1) {
                    if (i21 != 2) {
                        f10 = this.c;
                    }
                }
                int w02 = org.telegram.ui.ActionBar.i6.w0(this.y, e6Var);
                int a11 = a(org.telegram.ui.ActionBar.i6.w0(this.E, e6Var));
                int red3 = Color.red(w02);
                int red4 = Color.red(a11);
                int green3 = Color.green(w02);
                int green4 = Color.green(a11);
                int blue3 = Color.blue(w02);
                int blue4 = Color.blue(a11);
                float f18 = f10;
                int i22 = ((int) (((blue4 - blue3) * f18) + blue3)) & 255;
                paint6.setColor(i22 | ((((int) (((red4 - red3) * f18) + red3)) & 255) << 16) | ((((int) (((Color.alpha(a11) - r7) * f18) + Color.alpha(w02))) & 255) << 24) | ((((int) (((green4 - green3) * f18) + green3)) & 255) << 8));
                float f19 = dp2;
                float f20 = measuredHeight2;
                canvas4.drawCircle(f19, f20, AndroidUtilities.dp(8.0f), paint6);
                if (i19 == 0) {
                    if (this.F != null) {
                        float f21 = this.a.e;
                        if (f21 > 0.0f) {
                            boolean z10 = f21 < 1.0f;
                            if (z10) {
                                canvas.save();
                                canvas.scale(f21, f21, f19, f20);
                            }
                            Drawable drawable2 = this.F;
                            drawable2.setBounds(org.telegram.ui.Cells.c1.s(2, dp2, drawable2), org.telegram.ui.Cells.c1.c(2, measuredHeight2, this.F), org.telegram.ui.Cells.c1.w(2, dp2, this.F), org.telegram.ui.Cells.c1.v(2, measuredHeight2, this.F));
                            this.F.draw(canvas4);
                            if (z10) {
                                canvas.restore();
                            }
                        }
                    } else {
                        int i23 = this.s;
                        if (i23 == 1) {
                            dp2 = (int) (f19 - (AndroidUtilities.dp(10.8f) - (AndroidUtilities.dp(1.3f) * this.c)));
                            measuredHeight2 = (int) (f20 - (AndroidUtilities.dp(8.5f) - (AndroidUtilities.dp(0.5f) * this.c)));
                            int dpf22 = ((int) AndroidUtilities.dpf2(4.6f)) + dp2;
                            int dpf23 = (int) (AndroidUtilities.dpf2(9.5f) + measuredHeight2);
                            int dp3 = AndroidUtilities.dp(f7) + dpf22;
                            int dp4 = AndroidUtilities.dp(f7) + dpf23;
                            int dpf24 = ((int) AndroidUtilities.dpf2(7.5f)) + dp2;
                            int dpf25 = ((int) AndroidUtilities.dpf2(5.4f)) + measuredHeight2;
                            int dp5 = AndroidUtilities.dp(f17) + dpf24;
                            int dp6 = AndroidUtilities.dp(f17) + dpf25;
                            paint3 = paint6;
                            float f22 = this.c;
                            paint4 = paint;
                            canvas2 = canvas4;
                            canvas2.drawLine((int) (((dpf22 - dpf24) * f22) + dpf24), (int) (((dpf23 - dpf25) * f22) + dpf25), (int) (((dp3 - dp5) * f22) + dp5), (int) (((dp4 - dp6) * f22) + dp6), paint4);
                            canvas2.drawLine(((int) AndroidUtilities.dpf2(7.5f)) + dp2, ((int) AndroidUtilities.dpf2(12.5f)) + measuredHeight2, AndroidUtilities.dp(f17) + r3, r4 - AndroidUtilities.dp(f17), paint4);
                            i10 = 2;
                            if (i19 == 1) {
                                canvas2.drawBitmap(this.O, 0.0f, 0.0f, this.U);
                                i19++;
                                i20 = i10;
                                paint = paint4;
                                paint6 = paint3;
                                i18 = 0;
                            }
                        } else {
                            paint3 = paint6;
                            Paint paint7 = paint;
                            canvas2 = canvas4;
                            i10 = 2;
                            if (i23 == 2 || this.e != null) {
                                paint7.setAlpha((int) ((1.0f - this.v) * 255.0f));
                                paint4 = paint7;
                                canvas2.drawLine(f19, f20, f19, measuredHeight2 - AndroidUtilities.dp(5.0f), paint4);
                                canvas2.save();
                                canvas2.rotate(this.v * (-90.0f), f19, f20);
                                canvas2.drawLine(f19, f20, AndroidUtilities.dp(4.0f) + dp2, f20, paint4);
                                canvas2.restore();
                            } else {
                                paint4 = paint7;
                            }
                            if (i19 == 1) {
                            }
                        }
                    }
                }
                paint3 = paint6;
                paint4 = paint;
                canvas2 = canvas4;
                i10 = 2;
                if (i19 == 1) {
                }
            }
            i19++;
            i20 = i10;
            paint = paint4;
            paint6 = paint3;
            i18 = 0;
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
            new Paint(1).setColor(-1);
            org.telegram.ui.Cells.z zVar = new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{0}), null, null);
            this.I = zVar;
            zVar.setRadius(AndroidUtilities.dp(18.0f));
            this.I.setCallback(this);
        }
        boolean z11 = this.h;
        if ((z11 && this.K != 2) || (!z11 && this.K != 1)) {
            this.I.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{a(org.telegram.ui.ActionBar.i6.w0(z11 ? org.telegram.ui.ActionBar.i6.T6 : org.telegram.ui.ActionBar.i6.S6, this.V))}));
            this.K = this.h ? 2 : 1;
        }
        if (i10 >= 28 && z10) {
            this.I.setHotspot(this.h ? 0.0f : AndroidUtilities.dp(100.0f), AndroidUtilities.dp(18.0f));
        }
        this.I.setState(z10 ? this.J : StateSet.NOTHING);
        invalidate();
    }

    public void setIcon(int i10) {
        if (i10 != 0) {
            Drawable mutate = getResources().getDrawable(i10).mutate();
            this.F = mutate;
            if (mutate != null) {
                int w02 = org.telegram.ui.ActionBar.i6.w0(this.h ? this.x : this.w, this.V);
                this.G = w02;
                mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
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
        if (this.W == i10) {
            return;
        }
        if (this.M == null) {
            try {
                this.M = new Bitmap[2];
                this.N = new Canvas[2];
                for (int i11 = 0; i11 < 2; i11++) {
                    this.M[i11] = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    this.N[i11] = new Canvas(this.M[i11]);
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
            this.W = i10;
            this.Q = 0.0f;
            this.R = 0.0f;
            this.S = 0.0f;
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

    public void setOnCheckedChangeListener(wz0 wz0Var) {
    }
}
