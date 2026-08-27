package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f11;
import org.telegram.ui.go;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class u2 extends FrameLayout {
    public String A;
    public int B;
    public boolean C;
    public int D;
    public final Paint E;
    public final Paint F;
    public float G;
    public boolean H;
    public float I;
    public org.telegram.ui.Cells.z J;
    public boolean K;
    public boolean L;
    public float M;
    public int N;
    public int O;
    public final float P;
    public ValueAnimator Q;
    public ValueAnimator R;
    public float S;
    public final Paint a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final Drawable[] e;
    public final FrameLayout f;
    public final TextView[] h;
    public int n;
    public int r;
    public float s;
    public ValueAnimator v;
    public int w;
    public int x;
    public int y;

    public u2(Context context, float f10) {
        super(context);
        this.a = new Paint(1);
        this.b = true;
        this.c = true;
        this.e = new Drawable[2];
        this.h = new TextView[2];
        this.E = new Paint(1);
        this.F = new Paint(1);
        this.S = 1.0f;
        this.P = f10;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout);
        for (int i10 = 0; i10 < 2; i10++) {
            TextView textView = new TextView(context);
            textView.setGravity(1);
            textView.setTextSize(1, 11.0f);
            textView.setTextColor(-1);
            textView.setImportantForAccessibility(2);
            this.f.addView(textView, z5.d(-1, -2.0f, 0, 0.0f, f10 + 6.0f, 0.0f, 0.0f));
            this.h[i10] = textView;
        }
        this.h[1].setVisibility(8);
        this.F.setColor(-16777216);
        this.F.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.F.setStrokeWidth(AndroidUtilities.dp(3.0f));
        this.E.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.E.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a(int i10, int i11) {
        this.N = i10;
        this.O = i11;
        this.n = i0.b.d(this.M, i10, i11);
        invalidate();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.L == z10) {
            return;
        }
        this.L = z10;
        if (this.K) {
            if (!z11) {
                this.M = z10 ? 1.0f : 0.0f;
                a(this.N, this.O);
                return;
            }
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.Q.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M, this.L ? 1.0f : 0.0f);
            this.Q = ofFloat;
            ofFloat.addUpdateListener(new t2(this, 0));
            this.Q.addListener(new f11(this, 17));
            this.Q.setDuration(150L);
            this.Q.start();
        }
    }

    public final void c(int i10, int i11, int i12, float f10, boolean z10, String str, boolean z11, boolean z12) {
        String str2;
        if (getVisibility() != 0) {
            setVisibility(0);
            z12 = false;
        }
        if (this.w == i10 && this.x == i11 && ((this.K || this.y == i12) && (str2 = this.A) != null && str2.equals(str) && z11 == this.H)) {
            return;
        }
        if (this.J == null || z10) {
            int alpha = Color.alpha(i12);
            float f11 = this.P;
            if (alpha != 255 || AndroidUtilities.computePerceivedBrightness(i12) <= 0.5d) {
                org.telegram.ui.Cells.z h02 = g6.h0(AndroidUtilities.dp(f11), 0, i0.b.k(-1, (int) (f10 * 76.5f)));
                this.J = h02;
                h02.setCallback(this);
            } else {
                org.telegram.ui.Cells.z h03 = g6.h0(AndroidUtilities.dp(f11), 0, i0.b.k(-16777216, (int) (f10 * 25.5f)));
                this.J = h03;
                h03.setCallback(this);
            }
        }
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = this.y != i12;
        boolean z13 = this.w == i10;
        this.C = z13;
        if (z13) {
            this.D = this.x;
        }
        this.w = i10;
        this.x = i11;
        this.y = i12;
        this.A = str;
        this.H = z11;
        Drawable[] drawableArr = this.e;
        TextView[] textViewArr = this.h;
        if (!z12) {
            if (i10 != 0) {
                Drawable mutate = getContext().getDrawable(i10).mutate();
                drawableArr[0] = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
            }
            this.E.setColor(i11);
            if (!this.K) {
                this.n = i12;
            }
            textViewArr[0].setText(str);
            this.G = this.H ? 1.0f : 0.0f;
            this.C = false;
            this.s = 0.0f;
            invalidate();
            return;
        }
        if (!z13 && i10 != 0) {
            Drawable mutate2 = getContext().getDrawable(i10).mutate();
            drawableArr[1] = mutate2;
            mutate2.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        }
        if (!this.K) {
            this.r = i12;
        }
        boolean equals = textViewArr[0].getText().toString().equals(str);
        boolean z14 = !equals;
        if (equals) {
            textViewArr[0].setText(str);
        } else {
            textViewArr[1].setText(str);
            textViewArr[1].setVisibility(0);
            textViewArr[1].setAlpha(0.0f);
            textViewArr[1].setScaleX(0.0f);
            textViewArr[1].setScaleY(0.0f);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.v = ofFloat;
        ofFloat.addUpdateListener(new ig.y(9, this, z14));
        this.v.addListener(new go(26, this, z14));
        this.v.setDuration(150L).start();
        invalidate();
    }

    public final void d(boolean z10, boolean z11) {
        FrameLayout frameLayout = this.f;
        if (!z11) {
            frameLayout.animate().cancel();
            frameLayout.setAlpha(z10 ? 1.0f : 0.0f);
        } else {
            float f10 = z10 ? 1.0f : 0.0f;
            if (frameLayout.getAlpha() != f10) {
                frameLayout.animate().alpha(f10).start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.z zVar = this.J;
        if (zVar != null) {
            zVar.setState(getDrawableState());
        }
    }

    public View getTextView() {
        return this.h[0];
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.J;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0052  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        canvas.save();
        float f10 = this.S;
        float f11 = 2.0f;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        boolean z10 = this.d;
        Paint paint = this.a;
        if (z10) {
            float f12 = this.s;
            if (f12 != 0.0f) {
                paint.setColor(i0.b.d(f12, this.n, this.r));
                float width = getWidth() / 2.0f;
                float f13 = this.P;
                float dp = AndroidUtilities.dp(f13) / 2.0f;
                float dp2 = AndroidUtilities.dp(f13) / 2.0f;
                if (this.b) {
                    canvas.drawCircle(width, dp, dp2, paint);
                }
                if (this.J == null) {
                    org.telegram.ui.Cells.z h02 = g6.h0(AndroidUtilities.dp(f13), 0, -16777216);
                    this.J = h02;
                    h02.setCallback(this);
                }
                if (this.c) {
                    this.J.setBounds((int) (width - dp2), (int) (dp - dp2), (int) (width + dp2), (int) (dp2 + dp));
                    this.J.draw(canvas);
                }
                if (this.w != 0) {
                    boolean z11 = this.H;
                    Paint paint2 = this.E;
                    Drawable[] drawableArr = this.e;
                    if (!z11 && this.G == 0.0f) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= ((this.s == 0.0f || this.C) ? 1 : 2)) {
                                break;
                            }
                            if (drawableArr[i10] != null) {
                                canvas.save();
                                float f14 = this.s;
                                if (f14 == 0.0f || this.C || drawableArr[0] == null || drawableArr[1] == null) {
                                    if (this.C) {
                                        int d = i0.b.d(f14, this.D, this.x);
                                        drawableArr[i10].setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.MULTIPLY));
                                        paint2.setColor(d);
                                    }
                                    drawableArr[i10].setAlpha(255);
                                } else {
                                    if (i10 == 0) {
                                        f14 = 1.0f - f14;
                                    }
                                    canvas.scale(f14, f14, width, dp);
                                    drawableArr[i10].setAlpha((int) (f14 * 255.0f));
                                }
                                drawableArr[i10].setBounds((int) (width - (r6.getIntrinsicWidth() / f11)), (int) (dp - (drawableArr[i10].getIntrinsicHeight() / f11)), (int) ((drawableArr[i10].getIntrinsicWidth() / f11) + width), (int) ((drawableArr[i10].getIntrinsicHeight() / 2.0f) + dp));
                                drawableArr[i10].draw(canvas);
                                canvas.restore();
                            }
                            i10++;
                            f11 = 2.0f;
                        }
                    } else {
                        if (this.C) {
                            int d10 = i0.b.d(this.s, this.D, this.x);
                            drawableArr[0].setColorFilter(new PorterDuffColorFilter(d10, PorterDuff.Mode.MULTIPLY));
                            paint2.setColor(d10);
                        }
                        drawableArr[0].setAlpha(255);
                        float f15 = this.s;
                        if (f15 != 0.0f && this.C) {
                            int d11 = i0.b.d(f15, this.D, this.x);
                            drawableArr[0].setColorFilter(new PorterDuffColorFilter(d11, PorterDuff.Mode.MULTIPLY));
                            paint2.setColor(d11);
                        }
                        drawableArr[0].setAlpha(255);
                        boolean z12 = this.H;
                        if (z12) {
                            float f16 = this.G;
                            if (f16 < 1.0f) {
                                float f17 = f16 + 0.08f;
                                this.G = f17;
                                if (f17 > 1.0f) {
                                    this.G = 1.0f;
                                } else {
                                    invalidate();
                                }
                                if (this.G <= 0.0f) {
                                    float dpf2 = AndroidUtilities.dpf2(8.0f) + ((int) (width - (drawableArr[0].getIntrinsicWidth() / 2.0f))) + this.I;
                                    float dpf22 = AndroidUtilities.dpf2(8.0f) + ((int) (dp - (drawableArr[0].getIntrinsicHeight() / 2.0f)));
                                    float dp3 = AndroidUtilities.dp(17.0f);
                                    er erVar = er.f;
                                    float interpolation = (erVar.getInterpolation(this.G) * dp3) + (dpf2 - AndroidUtilities.dp(1.0f));
                                    float interpolation2 = (erVar.getInterpolation(this.G) * AndroidUtilities.dp(17.0f)) + dpf22;
                                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                                    drawableArr[0].setBounds((int) (width - (r2.getIntrinsicWidth() / 2.0f)), (int) (dp - (drawableArr[0].getIntrinsicHeight() / 2.0f)), (int) ((drawableArr[0].getIntrinsicWidth() / 2.0f) + width), (int) ((drawableArr[0].getIntrinsicHeight() / 2.0f) + dp));
                                    drawableArr[0].draw(canvas);
                                    canvas.drawLine(dpf2, dpf22 - AndroidUtilities.dp(2.0f), interpolation, interpolation2 - AndroidUtilities.dp(2.0f), this.F);
                                    canvas.drawLine(dpf2, dpf22, interpolation, interpolation2, paint2);
                                    canvas.restore();
                                } else {
                                    drawableArr[0].setBounds((int) (width - (r2.getIntrinsicWidth() / 2.0f)), (int) (dp - (drawableArr[0].getIntrinsicHeight() / 2.0f)), (int) ((drawableArr[0].getIntrinsicWidth() / 2.0f) + width), (int) ((drawableArr[0].getIntrinsicHeight() / 2.0f) + dp));
                                    drawableArr[0].draw(canvas);
                                }
                            }
                        }
                        if (!z12) {
                            float f18 = this.G - 0.08f;
                            this.G = f18;
                            if (f18 < 0.0f) {
                                this.G = 0.0f;
                            } else {
                                invalidate();
                            }
                        }
                        if (this.G <= 0.0f) {
                        }
                    }
                }
                canvas.restore();
            }
        }
        paint.setColor(this.n);
        float width2 = getWidth() / 2.0f;
        float f132 = this.P;
        float dp4 = AndroidUtilities.dp(f132) / 2.0f;
        float dp22 = AndroidUtilities.dp(f132) / 2.0f;
        if (this.b) {
        }
        if (this.J == null) {
        }
        if (this.c) {
        }
        if (this.w != 0) {
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.A);
        if (!this.K) {
            accessibilityNodeInfo.setClassName(Button.class.getName());
            return;
        }
        accessibilityNodeInfo.setClassName(ToggleButton.class.getName());
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.L);
    }

    public void setCheckable(boolean z10) {
        this.K = z10;
    }

    public void setCrossOffset(float f10) {
        this.I = f10;
    }

    public void setDrawBackground(boolean z10) {
        this.b = z10;
    }

    public void setDrawRipple(boolean z10) {
        this.c = z10;
    }

    public void setPressedBtn(boolean z10) {
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S, z10 ? 0.8f : 1.0f);
        this.R = ofFloat;
        ofFloat.addUpdateListener(new t2(this, 1));
        this.R.setDuration(150L);
        this.R.start();
    }

    public void setTextSize(int i10) {
        for (int i11 = 0; i11 < 2; i11++) {
            this.h[i11].setTextSize(1, i10);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.J == drawable || super.verifyDrawable(drawable);
    }
}
