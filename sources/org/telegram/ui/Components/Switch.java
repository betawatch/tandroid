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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class Switch extends View {
    public int A;
    public Drawable B;
    public int C;
    public boolean D;
    public org.telegram.ui.Cells.z E;
    public Paint F;
    public final int[] G;
    public int H;
    public boolean I;
    public Bitmap[] J;
    public Canvas[] K;
    public Bitmap L;
    public Canvas M;
    public float N;
    public float O;
    public float P;
    public Paint Q;
    public Paint R;
    public final org.telegram.ui.ActionBar.b6 S;
    public int T;
    public final td.a a;
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

    public Switch(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = new td.a(0, new t0.c(this, 1), gr.h, 380L, true);
        this.v = 1.0f;
        this.w = org.telegram.ui.ActionBar.f6.r7;
        this.x = org.telegram.ui.ActionBar.f6.V6;
        int i9 = org.telegram.ui.ActionBar.f6.d6;
        this.y = i9;
        this.A = i9;
        this.G = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        this.S = b6Var;
        this.b = new RectF();
        this.n = new Paint(1);
        Paint paint = new Paint(1);
        this.r = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setHapticFeedbackEnabled(true);
    }

    public final void b(int i9, boolean z10, boolean z11) {
        if (z10 != this.h) {
            this.h = z10;
            if (this.f && z11) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z10 ? 1.0f : 0.0f);
                this.d = ofFloat;
                ofFloat.setDuration(200L);
                this.d.addListener(new by0(this, 0));
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
        if (this.s != i9) {
            this.s = i9;
            if (this.f && z11) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "iconProgress", i9 == 0 ? 1.0f : 0.0f);
                this.e = ofFloat2;
                ofFloat2.setDuration(200L);
                this.e.addListener(new by0(this, 1));
                this.e.start();
                return;
            }
            ObjectAnimator objectAnimator2 = this.e;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
                this.e = null;
            }
            setIconProgress(i9 == 0 ? 1.0f : 0.0f);
        }
    }

    public final void c(boolean z10, boolean z11) {
        b(this.s, z10, z11);
    }

    public final void d(int i9, int i10, int i11, int i12) {
        this.w = i9;
        this.x = i10;
        this.y = i11;
        this.A = i12;
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
        org.telegram.ui.ActionBar.b6 b6Var;
        Paint paint;
        Paint paint2;
        float f10;
        Paint paint3;
        Paint paint4;
        Canvas canvas2;
        int i9;
        Paint paint5;
        org.telegram.ui.Cells.z zVar;
        Drawable drawable;
        if (getVisibility() != 0) {
            return;
        }
        int dp = AndroidUtilities.dp(31.0f);
        AndroidUtilities.dp(20.0f);
        int i10 = 2;
        int measuredWidth = (getMeasuredWidth() - dp) / 2;
        float measuredHeight = (getMeasuredHeight() - AndroidUtilities.dpf2(14.0f)) / 2.0f;
        int dp2 = AndroidUtilities.dp(7.0f) + measuredWidth + ((int) (AndroidUtilities.dp(17.0f) * this.c));
        int measuredHeight2 = getMeasuredHeight() / 2;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            b6Var = this.S;
            paint = this.r;
            float f11 = 1.0f;
            paint2 = this.n;
            if (i12 >= i10) {
                break;
            }
            if (i12 == 1 && this.T == 0) {
                i9 = dp;
            } else {
                Canvas canvas3 = i12 == 0 ? canvas : this.K[i11];
                if (i12 == 1) {
                    this.J[i11].eraseColor(i11);
                    paint2.setColor(-16777216);
                    this.M.drawRect(0.0f, 0.0f, this.L.getWidth(), this.L.getHeight(), paint2);
                    paint5 = paint2;
                    i9 = dp;
                    this.M.drawCircle(this.N - getX(), this.O - getY(), this.P, this.Q);
                } else {
                    i9 = dp;
                    paint5 = paint2;
                }
                int i13 = this.T;
                if (i13 != 1) {
                    if (i13 != 2) {
                        f11 = this.c;
                    }
                    int a2 = a(org.telegram.ui.ActionBar.f6.v0(this.w, b6Var));
                    int a3 = a(org.telegram.ui.ActionBar.f6.v0(this.x, b6Var));
                    if (i12 == 0 && (drawable = this.B) != null) {
                        if (this.C != (this.h ? a3 : a2)) {
                            int i14 = this.h ? a3 : a2;
                            this.C = i14;
                            drawable.setColorFilter(new PorterDuffColorFilter(i14, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                    int red = Color.red(a2);
                    int red2 = Color.red(a3);
                    int green = Color.green(a2);
                    int green2 = Color.green(a3);
                    int blue = Color.blue(a2);
                    int blue2 = Color.blue(a3);
                    int alpha = (((int) (((blue2 - blue) * f11) + blue)) & 255) | ((((int) (((Color.alpha(a3) - r6) * f11) + Color.alpha(a2))) & 255) << 24) | ((((int) (((red2 - red) * f11) + red)) & 255) << 16) | ((((int) (((green2 - green) * f11) + green)) & 255) << 8);
                    paint5.setColor(alpha);
                    paint.setColor(alpha);
                    float dpf2 = AndroidUtilities.dpf2(14.0f) + measuredHeight;
                    RectF rectF = this.b;
                    rectF.set(measuredWidth, measuredHeight, measuredWidth + i9, dpf2);
                    canvas3.drawRoundRect(rectF, AndroidUtilities.dpf2(7.0f), AndroidUtilities.dpf2(7.0f), paint5);
                    canvas3.drawCircle(dp2, measuredHeight2, AndroidUtilities.dpf2(10.0f), paint5);
                    if (i12 == 0 && (zVar = this.E) != null) {
                        zVar.setBounds(dp2 - AndroidUtilities.dp(18.0f), measuredHeight2 - AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f) + dp2, AndroidUtilities.dp(18.0f) + measuredHeight2);
                        this.E.draw(canvas3);
                    } else if (i12 == 1) {
                        canvas3.drawBitmap(this.L, 0.0f, 0.0f, this.R);
                    }
                }
            }
            i12++;
            dp = i9;
            i10 = 2;
            i11 = 0;
        }
        Paint paint6 = paint2;
        if (this.T != 0) {
            canvas.drawBitmap(this.J[0], 0.0f, 0.0f, (Paint) null);
        }
        int i15 = 0;
        while (i15 < 2) {
            if (i15 == 1 && this.T == 0) {
                paint3 = paint6;
                paint4 = paint;
            } else {
                Canvas canvas4 = i15 == 0 ? canvas : this.K[1];
                if (i15 == 1) {
                    this.J[1].eraseColor(0);
                }
                int i16 = this.T;
                if (i16 != 1) {
                    if (i16 != 2) {
                        f10 = this.c;
                    }
                }
                int v02 = org.telegram.ui.ActionBar.f6.v0(this.y, b6Var);
                int a10 = a(org.telegram.ui.ActionBar.f6.v0(this.A, b6Var));
                int red3 = Color.red(v02);
                int red4 = Color.red(a10);
                int green3 = Color.green(v02);
                int green4 = Color.green(a10);
                int blue3 = Color.blue(v02);
                int blue4 = Color.blue(a10);
                float f12 = f10;
                int i17 = ((int) (((blue4 - blue3) * f12) + blue3)) & 255;
                paint6.setColor(i17 | ((((int) (((red4 - red3) * f12) + red3)) & 255) << 16) | ((((int) (((Color.alpha(a10) - r7) * f12) + Color.alpha(v02))) & 255) << 24) | ((((int) (((green4 - green3) * f12) + green3)) & 255) << 8));
                float f13 = dp2;
                float f14 = measuredHeight2;
                canvas4.drawCircle(f13, f14, AndroidUtilities.dp(8.0f), paint6);
                if (i15 == 0) {
                    if (this.B != null) {
                        float f15 = this.a.e;
                        if (f15 > 0.0f) {
                            boolean z10 = f15 < 1.0f;
                            if (z10) {
                                canvas.save();
                                canvas.scale(f15, f15, f13, f14);
                            }
                            Drawable drawable2 = this.B;
                            drawable2.setBounds(org.telegram.messenger.ll.x(2, dp2, drawable2), org.telegram.messenger.ll.e(2, measuredHeight2, this.B), org.telegram.messenger.ll.B(2, dp2, this.B), org.telegram.messenger.ll.z(2, measuredHeight2, this.B));
                            this.B.draw(canvas4);
                            if (z10) {
                                canvas.restore();
                            }
                        }
                    } else {
                        int i18 = this.s;
                        if (i18 == 1) {
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
                            if (i15 == 1) {
                                canvas2.drawBitmap(this.L, 0.0f, 0.0f, this.R);
                                i15++;
                                paint = paint4;
                                paint6 = paint3;
                            }
                        } else {
                            paint3 = paint6;
                            Paint paint7 = paint;
                            canvas2 = canvas4;
                            if (i18 == 2 || this.e != null) {
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
                            if (i15 == 1) {
                            }
                        }
                    }
                }
                paint3 = paint6;
                paint4 = paint;
                canvas2 = canvas4;
                if (i15 == 1) {
                }
            }
            i15++;
            paint = paint4;
            paint6 = paint3;
        }
        if (this.T != 0) {
            canvas.drawBitmap(this.J[1], 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.h);
    }

    public void setDrawIconType(int i9) {
        this.s = i9;
    }

    public void setDrawRipple(boolean z10) {
        int i9 = Build.VERSION.SDK_INT;
        if (z10 == this.D) {
            return;
        }
        this.D = z10;
        if (this.E == null) {
            Paint paint = new Paint(1);
            this.F = paint;
            paint.setColor(-1);
            org.telegram.ui.Cells.z zVar = new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{0}), null, i9 >= 23 ? null : new kh.w3(this, 5));
            this.E = zVar;
            if (i9 >= 23) {
                zVar.setRadius(AndroidUtilities.dp(18.0f));
            }
            this.E.setCallback(this);
        }
        boolean z11 = this.h;
        if ((z11 && this.H != 2) || (!z11 && this.H != 1)) {
            this.E.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{a(org.telegram.ui.ActionBar.f6.v0(z11 ? org.telegram.ui.ActionBar.f6.T6 : org.telegram.ui.ActionBar.f6.S6, this.S))}));
            this.H = this.h ? 2 : 1;
        }
        if (i9 >= 28 && z10) {
            this.E.setHotspot(this.h ? 0.0f : AndroidUtilities.dp(100.0f), AndroidUtilities.dp(18.0f));
        }
        this.E.setState(z10 ? this.G : StateSet.NOTHING);
        invalidate();
    }

    public void setIcon(int i9) {
        if (i9 != 0) {
            Drawable mutate = getResources().getDrawable(i9).mutate();
            this.B = mutate;
            if (mutate != null) {
                int v02 = org.telegram.ui.ActionBar.f6.v0(this.h ? this.x : this.w, this.S);
                this.C = v02;
                mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
            }
        } else {
            this.B = null;
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

    public void setOverrideColor(int i9) {
        if (this.T == i9) {
            return;
        }
        if (this.J == null) {
            try {
                this.J = new Bitmap[2];
                this.K = new Canvas[2];
                for (int i10 = 0; i10 < 2; i10++) {
                    this.J[i10] = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    this.K[i10] = new Canvas(this.J[i10]);
                }
                this.L = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.M = new Canvas(this.L);
                Paint paint = new Paint(1);
                this.Q = paint;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                Paint paint2 = new Paint(1);
                this.R = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.I = true;
            } catch (Throwable unused) {
                return;
            }
        }
        if (this.I) {
            this.T = i9;
            this.N = 0.0f;
            this.O = 0.0f;
            this.P = 0.0f;
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
        org.telegram.ui.Cells.z zVar = this.E;
        return zVar != null && drawable == zVar;
    }

    public int a(int i9) {
        return i9;
    }

    public void setOnCheckedChangeListener(cy0 cy0Var) {
    }
}
