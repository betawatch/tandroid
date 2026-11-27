// default package

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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class kmc extends FrameLayout {
    public int E;
    public String F;
    public int G;
    public boolean H;
    public int I;
    public final Paint J;
    public final Paint K;
    public float L;
    public boolean M;
    public float N;
    public hf0 O;
    public boolean P;
    public boolean Q;
    public float R;
    public int S;
    public int T;
    public final float U;
    public ValueAnimator V;
    public ValueAnimator W;
    public final Paint a;
    public float a0;
    public boolean b;
    public boolean c;
    public boolean d;
    public final Drawable[] e;
    public final FrameLayout f;
    public final TextView[] h;
    public int n;
    public int r;
    public float s;
    public ValueAnimator w;
    public int x;
    public int y;

    public kmc(Context context, float f) {
        super(context);
        this.a = new Paint(1);
        this.b = true;
        this.c = true;
        this.e = new Drawable[2];
        this.h = new TextView[2];
        this.J = new Paint(1);
        this.K = new Paint(1);
        this.a0 = 1.0f;
        this.U = f;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout);
        for (int i = 0; i < 2; i++) {
            TextView textView = new TextView(context);
            textView.setGravity(1);
            textView.setTextSize(1, 11.0f);
            textView.setTextColor(-1);
            textView.setImportantForAccessibility(2);
            this.f.addView(textView, tre.d(-1, -2.0f, 0, 0.0f, f + 6.0f, 0.0f, 0.0f));
            this.h[i] = textView;
        }
        this.h[1].setVisibility(8);
        this.K.setColor(-16777216);
        this.K.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.K.setStrokeWidth(hl.L(3.0f));
        this.J.setStrokeWidth(hl.L(2.0f));
        this.J.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a(int i, int i2) {
        this.S = i;
        this.T = i2;
        this.n = vm2.f(this.R, i, i2);
        invalidate();
    }

    public final void b(boolean z, boolean z2) {
        if (this.Q != z) {
            this.Q = z;
            if (this.P) {
                if (!z2) {
                    this.R = z ? 1.0f : 0.0f;
                    a(this.S, this.T);
                    return;
                }
                ValueAnimator valueAnimator = this.V;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.V.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R, this.Q ? 1.0f : 0.0f);
                this.V = ofFloat;
                ofFloat.addUpdateListener(new jmc(this, (byte) 0));
                this.V.addListener(new omb(this, (byte) 20));
                this.V.setDuration(150L);
                this.V.start();
            }
        }
    }

    public final void c(int i, int i2, int i3, float f, boolean z, String str, boolean z2, boolean z3) {
        String str2;
        if (getVisibility() != 0) {
            setVisibility(0);
            z3 = false;
        }
        if (this.x == i && this.y == i2 && ((this.P || this.E == i3) && (str2 = this.F) != null && str2.equals(str) && z2 == this.M)) {
            return;
        }
        if (this.O == null || z) {
            int alpha = Color.alpha(i3);
            float f2 = this.U;
            if (alpha != 255 || hl.B(i3) <= 0.5d) {
                hf0 h0 = aob.h0(hl.L(f2), 0, vm2.o(-1, (int) (f * 76.5f)));
                this.O = h0;
                h0.setCallback(this);
            } else {
                hf0 h02 = aob.h0(hl.L(f2), 0, vm2.o(-16777216, (int) (f * 25.5f)));
                this.O = h02;
                h02.setCallback(this);
            }
        }
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = this.E != i3;
        boolean z4 = this.x == i;
        this.H = z4;
        if (z4) {
            this.I = this.y;
        }
        this.x = i;
        this.y = i2;
        this.E = i3;
        this.F = str;
        this.M = z2;
        Drawable[] drawableArr = this.e;
        TextView[] textViewArr = this.h;
        if (!z3) {
            if (i != 0) {
                Drawable mutate = getContext().getDrawable(i).mutate();
                drawableArr[0] = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
            }
            this.J.setColor(i2);
            if (!this.P) {
                this.n = i3;
            }
            textViewArr[0].setText(str);
            this.L = this.M ? 1.0f : 0.0f;
            this.H = false;
            this.s = 0.0f;
            invalidate();
            return;
        }
        if (!z4 && i != 0) {
            Drawable mutate2 = getContext().getDrawable(i).mutate();
            drawableArr[1] = mutate2;
            mutate2.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        }
        if (!this.P) {
            this.r = i3;
        }
        boolean equals = textViewArr[0].getText().toString().equals(str);
        boolean z5 = !equals;
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
        this.w = ofFloat;
        ofFloat.addUpdateListener(new e20((byte) 11, this, z5));
        this.w.addListener(new i1a((byte) 15, this, z5));
        this.w.setDuration(150L).start();
        invalidate();
    }

    public final void d(boolean z, boolean z2) {
        FrameLayout frameLayout = this.f;
        if (!z2) {
            frameLayout.animate().cancel();
            frameLayout.setAlpha(z ? 1.0f : 0.0f);
        } else {
            float f = z ? 1.0f : 0.0f;
            if (frameLayout.getAlpha() != f) {
                frameLayout.animate().alpha(f).start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        hf0 hf0Var = this.O;
        if (hf0Var != null) {
            hf0Var.setState(getDrawableState());
        }
    }

    public View getTextView() {
        return this.h[0];
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        hf0 hf0Var = this.O;
        if (hf0Var != null) {
            hf0Var.jumpToCurrentState();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0052  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f2 = this.a0;
        float f3 = 2.0f;
        canvas2.scale(f2, f2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        boolean z = this.d;
        Paint paint = this.a;
        if (z) {
            float f4 = this.s;
            if (f4 != 0.0f) {
                paint.setColor(vm2.f(f4, this.n, this.r));
                float width = getWidth() / 2.0f;
                float f5 = this.U;
                float L = hl.L(f5) / 2.0f;
                float L2 = hl.L(f5) / 2.0f;
                if (this.b) {
                    canvas2.drawCircle(width, L, L2, paint);
                }
                if (this.O == null) {
                    hf0 h0 = aob.h0(hl.L(f5), 0, -16777216);
                    this.O = h0;
                    h0.setCallback(this);
                }
                if (this.c) {
                    this.O.setBounds((int) (width - L2), (int) (L - L2), (int) (width + L2), (int) (L2 + L));
                    this.O.draw(canvas2);
                }
                if (this.x != 0) {
                    boolean z2 = this.M;
                    Paint paint2 = this.J;
                    Drawable[] drawableArr = this.e;
                    if (!z2 && this.L == 0.0f) {
                        int i = 0;
                        while (true) {
                            if (i >= ((this.s == 0.0f || this.H) ? 1 : 2)) {
                                break;
                            }
                            if (drawableArr[i] != null) {
                                canvas2.save();
                                float f6 = this.s;
                                if (f6 == 0.0f || this.H || drawableArr[0] == null || drawableArr[1] == null) {
                                    if (this.H) {
                                        int f7 = vm2.f(f6, this.I, this.y);
                                        drawableArr[i].setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.MULTIPLY));
                                        paint2.setColor(f7);
                                    }
                                    drawableArr[i].setAlpha(jn7.d4);
                                } else {
                                    if (i == 0) {
                                        f6 = 1.0f - f6;
                                    }
                                    canvas2.scale(f6, f6, width, L);
                                    drawableArr[i].setAlpha((int) (f6 * 255.0f));
                                }
                                f = f3;
                                drawableArr[i].setBounds((int) (width - (r6.getIntrinsicWidth() / f3)), (int) (L - (drawableArr[i].getIntrinsicHeight() / f3)), (int) ((drawableArr[i].getIntrinsicWidth() / f3) + width), (int) ((drawableArr[i].getIntrinsicHeight() / f) + L));
                                drawableArr[i].draw(canvas2);
                                canvas2.restore();
                            } else {
                                f = f3;
                            }
                            i++;
                            f3 = f;
                        }
                    } else {
                        if (this.H) {
                            int f8 = vm2.f(this.s, this.I, this.y);
                            drawableArr[0].setColorFilter(new PorterDuffColorFilter(f8, PorterDuff.Mode.MULTIPLY));
                            paint2.setColor(f8);
                        }
                        drawableArr[0].setAlpha(jn7.d4);
                        float f9 = this.s;
                        if (f9 != 0.0f && this.H) {
                            int f10 = vm2.f(f9, this.I, this.y);
                            drawableArr[0].setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.MULTIPLY));
                            paint2.setColor(f10);
                        }
                        drawableArr[0].setAlpha(jn7.d4);
                        boolean z3 = this.M;
                        float f11 = this.L;
                        if (!z3) {
                            float f12 = f11 - 0.08f;
                            this.L = f12;
                            if (f12 < 0.0f) {
                                this.L = 0.0f;
                            } else {
                                invalidate();
                            }
                        } else if (f11 < 1.0f) {
                            float f13 = f11 + 0.08f;
                            this.L = f13;
                            if (f13 > 1.0f) {
                                this.L = 1.0f;
                            } else {
                                invalidate();
                            }
                        }
                        if (this.L > 0.0f) {
                            float N = hl.N(8.0f) + ((int) (width - (drawableArr[0].getIntrinsicWidth() / 2.0f))) + this.N;
                            float N2 = hl.N(8.0f) + ((int) (L - (drawableArr[0].getIntrinsicHeight() / 2.0f)));
                            float L3 = hl.L(17.0f);
                            k43 k43Var = k43.f;
                            float interpolation = (k43Var.getInterpolation(this.L) * L3) + (N - hl.L(1.0f));
                            float interpolation2 = (k43Var.getInterpolation(this.L) * hl.L(17.0f)) + N2;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), jn7.d4, 31);
                            drawableArr[0].setBounds((int) (width - (r2.getIntrinsicWidth() / 2.0f)), (int) (L - (drawableArr[0].getIntrinsicHeight() / 2.0f)), (int) ((drawableArr[0].getIntrinsicWidth() / 2.0f) + width), (int) ((drawableArr[0].getIntrinsicHeight() / 2.0f) + L));
                            drawableArr[0].draw(canvas2);
                            canvas2.drawLine(N, N2 - hl.L(2.0f), interpolation, interpolation2 - hl.L(2.0f), this.K);
                            canvas2.drawLine(N, N2, interpolation, interpolation2, paint2);
                            canvas2 = canvas2;
                            canvas2.restore();
                        } else {
                            drawableArr[0].setBounds((int) (width - (r0.getIntrinsicWidth() / 2.0f)), (int) (L - (drawableArr[0].getIntrinsicHeight() / 2.0f)), (int) ((drawableArr[0].getIntrinsicWidth() / 2.0f) + width), (int) ((drawableArr[0].getIntrinsicHeight() / 2.0f) + L));
                            drawableArr[0].draw(canvas2);
                        }
                    }
                }
                canvas2.restore();
            }
        }
        paint.setColor(this.n);
        float width2 = getWidth() / 2.0f;
        float f52 = this.U;
        float L4 = hl.L(f52) / 2.0f;
        float L22 = hl.L(f52) / 2.0f;
        if (this.b) {
        }
        if (this.O == null) {
        }
        if (this.c) {
        }
        if (this.x != 0) {
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.F);
        if (!this.P) {
            accessibilityNodeInfo.setClassName(Button.class.getName());
            return;
        }
        accessibilityNodeInfo.setClassName(ToggleButton.class.getName());
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.Q);
    }

    public void setCheckable(boolean z) {
        this.P = z;
    }

    public void setCrossOffset(float f) {
        this.N = f;
    }

    public void setDrawBackground(boolean z) {
        this.b = z;
    }

    public void setDrawRipple(boolean z) {
        this.c = z;
    }

    public void setPressedBtn(boolean z) {
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, z ? 0.8f : 1.0f);
        this.W = ofFloat;
        ofFloat.addUpdateListener(new jmc(this, (byte) 1));
        this.W.setDuration(150L);
        this.W.start();
    }

    public void setTextSize(int i) {
        for (int i2 = 0; i2 < 2; i2++) {
            this.h[i2].setTextSize(1, i);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.O == drawable || super.verifyDrawable(drawable);
    }
}
