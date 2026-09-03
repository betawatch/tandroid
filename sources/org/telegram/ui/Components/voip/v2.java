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
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.m00;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class v2 extends FrameLayout {
    public String B;
    public int C;
    public boolean D;
    public int E;
    public final Paint F;
    public final Paint G;
    public float H;
    public boolean I;
    public float J;
    public org.telegram.ui.Cells.z K;
    public boolean L;
    public boolean M;
    public float N;
    public int O;
    public int P;
    public final float Q;
    public ValueAnimator R;
    public ValueAnimator S;
    public float T;
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

    public v2(Context context, float f10) {
        super(context);
        this.a = new Paint(1);
        this.b = true;
        this.c = true;
        this.e = new Drawable[2];
        this.h = new TextView[2];
        this.F = new Paint(1);
        this.G = new Paint(1);
        this.T = 1.0f;
        this.Q = f10;
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
            this.f.addView(textView, b6.d(-1, -2.0f, 0, 0.0f, f10 + 6.0f, 0.0f, 0.0f));
            this.h[i10] = textView;
        }
        this.h[1].setVisibility(8);
        this.G.setColor(-16777216);
        this.G.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.G.setStrokeWidth(AndroidUtilities.dp(3.0f));
        this.F.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.F.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a(int i10, int i11) {
        this.O = i10;
        this.P = i11;
        this.n = i0.a.d(this.N, i10, i11);
        invalidate();
    }

    public final void b(boolean z4, boolean z10) {
        if (this.M == z4) {
            return;
        }
        this.M = z4;
        if (this.L) {
            if (!z10) {
                this.N = z4 ? 1.0f : 0.0f;
                a(this.O, this.P);
                return;
            }
            ValueAnimator valueAnimator = this.R;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.R.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N, this.M ? 1.0f : 0.0f);
            this.R = ofFloat;
            ofFloat.addUpdateListener(new u2(this, 0));
            this.R.addListener(new f91(this, 8));
            this.R.setDuration(150L);
            this.R.start();
        }
    }

    public final void c(int i10, int i11, int i12, float f10, boolean z4, String str, boolean z10, boolean z11) {
        String str2;
        if (getVisibility() != 0) {
            setVisibility(0);
            z11 = false;
        }
        if (this.w == i10 && this.x == i11 && ((this.L || this.y == i12) && (str2 = this.B) != null && str2.equals(str) && z10 == this.I)) {
            return;
        }
        if (this.K == null || z4) {
            int alpha = Color.alpha(i12);
            float f11 = this.Q;
            if (alpha != 255 || AndroidUtilities.computePerceivedBrightness(i12) <= 0.5d) {
                org.telegram.ui.Cells.z h02 = j6.h0(AndroidUtilities.dp(f11), 0, i0.a.k(-1, (int) (f10 * 76.5f)));
                this.K = h02;
                h02.setCallback(this);
            } else {
                org.telegram.ui.Cells.z h03 = j6.h0(AndroidUtilities.dp(f11), 0, i0.a.k(-16777216, (int) (f10 * 25.5f)));
                this.K = h03;
                h03.setCallback(this);
            }
        }
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = this.y != i12;
        boolean z12 = this.w == i10;
        this.D = z12;
        if (z12) {
            this.E = this.x;
        }
        this.w = i10;
        this.x = i11;
        this.y = i12;
        this.B = str;
        this.I = z10;
        Drawable[] drawableArr = this.e;
        TextView[] textViewArr = this.h;
        if (!z11) {
            if (i10 != 0) {
                Drawable mutate = getContext().getDrawable(i10).mutate();
                drawableArr[0] = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
            }
            this.F.setColor(i11);
            if (!this.L) {
                this.n = i12;
            }
            textViewArr[0].setText(str);
            this.H = this.I ? 1.0f : 0.0f;
            this.D = false;
            this.s = 0.0f;
            invalidate();
            return;
        }
        if (!z12 && i10 != 0) {
            Drawable mutate2 = getContext().getDrawable(i10).mutate();
            drawableArr[1] = mutate2;
            mutate2.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        }
        if (!this.L) {
            this.r = i12;
        }
        boolean equals = textViewArr[0].getText().toString().equals(str);
        boolean z13 = !equals;
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
        ofFloat.addUpdateListener(new dg.b1(9, this, z13));
        this.v.addListener(new m00(17, this, z13));
        this.v.setDuration(150L).start();
        invalidate();
    }

    public final void d(boolean z4, boolean z10) {
        FrameLayout frameLayout = this.f;
        if (!z10) {
            frameLayout.animate().cancel();
            frameLayout.setAlpha(z4 ? 1.0f : 0.0f);
        } else {
            float f10 = z4 ? 1.0f : 0.0f;
            if (frameLayout.getAlpha() != f10) {
                frameLayout.animate().alpha(f10).start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.z zVar = this.K;
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
        org.telegram.ui.Cells.z zVar = this.K;
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
        float f10 = this.T;
        float f11 = 2.0f;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        boolean z4 = this.d;
        Paint paint = this.a;
        if (z4) {
            float f12 = this.s;
            if (f12 != 0.0f) {
                paint.setColor(i0.a.d(f12, this.n, this.r));
                float width = getWidth() / 2.0f;
                float f13 = this.Q;
                float dp = AndroidUtilities.dp(f13) / 2.0f;
                float dp2 = AndroidUtilities.dp(f13) / 2.0f;
                if (this.b) {
                    canvas.drawCircle(width, dp, dp2, paint);
                }
                if (this.K == null) {
                    org.telegram.ui.Cells.z h02 = j6.h0(AndroidUtilities.dp(f13), 0, -16777216);
                    this.K = h02;
                    h02.setCallback(this);
                }
                if (this.c) {
                    this.K.setBounds((int) (width - dp2), (int) (dp - dp2), (int) (width + dp2), (int) (dp2 + dp));
                    this.K.draw(canvas);
                }
                if (this.w != 0) {
                    boolean z10 = this.I;
                    Paint paint2 = this.F;
                    Drawable[] drawableArr = this.e;
                    if (!z10 && this.H == 0.0f) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= ((this.s == 0.0f || this.D) ? 1 : 2)) {
                                break;
                            }
                            if (drawableArr[i10] != null) {
                                canvas.save();
                                float f14 = this.s;
                                if (f14 == 0.0f || this.D || drawableArr[0] == null || drawableArr[1] == null) {
                                    if (this.D) {
                                        int d = i0.a.d(f14, this.E, this.x);
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
                        if (this.D) {
                            int d10 = i0.a.d(this.s, this.E, this.x);
                            drawableArr[0].setColorFilter(new PorterDuffColorFilter(d10, PorterDuff.Mode.MULTIPLY));
                            paint2.setColor(d10);
                        }
                        drawableArr[0].setAlpha(255);
                        float f15 = this.s;
                        if (f15 != 0.0f && this.D) {
                            int d11 = i0.a.d(f15, this.E, this.x);
                            drawableArr[0].setColorFilter(new PorterDuffColorFilter(d11, PorterDuff.Mode.MULTIPLY));
                            paint2.setColor(d11);
                        }
                        drawableArr[0].setAlpha(255);
                        boolean z11 = this.I;
                        if (z11) {
                            float f16 = this.H;
                            if (f16 < 1.0f) {
                                float f17 = f16 + 0.08f;
                                this.H = f17;
                                if (f17 > 1.0f) {
                                    this.H = 1.0f;
                                } else {
                                    invalidate();
                                }
                                if (this.H <= 0.0f) {
                                    float dpf2 = AndroidUtilities.dpf2(8.0f) + ((int) (width - (drawableArr[0].getIntrinsicWidth() / 2.0f))) + this.J;
                                    float dpf22 = AndroidUtilities.dpf2(8.0f) + ((int) (dp - (drawableArr[0].getIntrinsicHeight() / 2.0f)));
                                    float dp3 = AndroidUtilities.dp(17.0f);
                                    mr mrVar = mr.f;
                                    float interpolation = (mrVar.getInterpolation(this.H) * dp3) + (dpf2 - AndroidUtilities.dp(1.0f));
                                    float interpolation2 = (mrVar.getInterpolation(this.H) * AndroidUtilities.dp(17.0f)) + dpf22;
                                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                                    drawableArr[0].setBounds((int) (width - (r2.getIntrinsicWidth() / 2.0f)), (int) (dp - (drawableArr[0].getIntrinsicHeight() / 2.0f)), (int) ((drawableArr[0].getIntrinsicWidth() / 2.0f) + width), (int) ((drawableArr[0].getIntrinsicHeight() / 2.0f) + dp));
                                    drawableArr[0].draw(canvas);
                                    canvas.drawLine(dpf2, dpf22 - AndroidUtilities.dp(2.0f), interpolation, interpolation2 - AndroidUtilities.dp(2.0f), this.G);
                                    canvas.drawLine(dpf2, dpf22, interpolation, interpolation2, paint2);
                                    canvas.restore();
                                } else {
                                    drawableArr[0].setBounds((int) (width - (r2.getIntrinsicWidth() / 2.0f)), (int) (dp - (drawableArr[0].getIntrinsicHeight() / 2.0f)), (int) ((drawableArr[0].getIntrinsicWidth() / 2.0f) + width), (int) ((drawableArr[0].getIntrinsicHeight() / 2.0f) + dp));
                                    drawableArr[0].draw(canvas);
                                }
                            }
                        }
                        if (!z11) {
                            float f18 = this.H - 0.08f;
                            this.H = f18;
                            if (f18 < 0.0f) {
                                this.H = 0.0f;
                            } else {
                                invalidate();
                            }
                        }
                        if (this.H <= 0.0f) {
                        }
                    }
                }
                canvas.restore();
            }
        }
        paint.setColor(this.n);
        float width2 = getWidth() / 2.0f;
        float f132 = this.Q;
        float dp4 = AndroidUtilities.dp(f132) / 2.0f;
        float dp22 = AndroidUtilities.dp(f132) / 2.0f;
        if (this.b) {
        }
        if (this.K == null) {
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
        accessibilityNodeInfo.setText(this.B);
        if (!this.L) {
            accessibilityNodeInfo.setClassName(Button.class.getName());
            return;
        }
        accessibilityNodeInfo.setClassName(ToggleButton.class.getName());
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.M);
    }

    public void setCheckable(boolean z4) {
        this.L = z4;
    }

    public void setCrossOffset(float f10) {
        this.J = f10;
    }

    public void setDrawBackground(boolean z4) {
        this.b = z4;
    }

    public void setDrawRipple(boolean z4) {
        this.c = z4;
    }

    public void setPressedBtn(boolean z4) {
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T, z4 ? 0.8f : 1.0f);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new u2(this, 1));
        this.S.setDuration(150L);
        this.S.start();
    }

    public void setTextSize(int i10) {
        for (int i11 = 0; i11 < 2; i11++) {
            this.h[i11].setTextSize(1, i10);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.K == drawable || super.verifyDrawable(drawable);
    }
}
