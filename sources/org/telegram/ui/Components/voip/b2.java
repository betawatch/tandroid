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
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.s9;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class b2 extends FrameLayout {
    public int D;
    public String E;
    public int F;
    public boolean G;
    public int H;
    public final Paint I;
    public final Paint J;
    public float K;
    public boolean L;
    public float M;
    public org.telegram.ui.Cells.y N;
    public boolean O;
    public boolean P;
    public float Q;
    public int R;
    public int S;
    public final float T;
    public ValueAnimator U;
    public ValueAnimator V;
    public float W;
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
    public ValueAnimator w;
    public int x;
    public int y;

    public b2(Context context, float f7) {
        super(context);
        this.a = new Paint(1);
        this.b = true;
        this.c = true;
        this.e = new Drawable[2];
        this.h = new TextView[2];
        this.I = new Paint(1);
        this.J = new Paint(1);
        this.W = 1.0f;
        this.T = f7;
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
            this.f.addView(textView, b6.d(-1, -2.0f, 0, 0.0f, f7 + 6.0f, 0.0f, 0.0f));
            this.h[i10] = textView;
        }
        this.h[1].setVisibility(8);
        this.J.setColor(-16777216);
        this.J.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.J.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
        this.I.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        this.I.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a(int i10, int i11) {
        this.R = i10;
        this.S = i11;
        this.n = i0.b.f(this.Q, i10, i11);
        invalidate();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.P == z10) {
            return;
        }
        this.P = z10;
        if (this.O) {
            if (!z11) {
                this.Q = z10 ? 1.0f : 0.0f;
                a(this.R, this.S);
                return;
            }
            ValueAnimator valueAnimator = this.U;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.U.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q, this.P ? 1.0f : 0.0f);
            this.U = ofFloat;
            ofFloat.addUpdateListener(new a2(this, 0));
            this.U.addListener(new s9(this, 28));
            this.U.setDuration(150L);
            this.U.start();
        }
    }

    public final void c(int i10, int i11, int i12, float f7, boolean z10, String str, boolean z11, boolean z12) {
        String str2;
        if (getVisibility() != 0) {
            setVisibility(0);
            z12 = false;
        }
        if (this.x == i10 && this.y == i11 && ((this.O || this.D == i12) && (str2 = this.E) != null && str2.equals(str) && z11 == this.L)) {
            return;
        }
        if (this.N == null || z10) {
            int alpha = Color.alpha(i12);
            float f10 = this.T;
            if (alpha != 255 || org.telegram.messenger.i0.B(i12) <= 0.5d) {
                org.telegram.ui.Cells.y j02 = t6.j0(org.telegram.messenger.i0.L(f10), 0, i0.b.o(-1, (int) (f7 * 76.5f)));
                this.N = j02;
                j02.setCallback(this);
            } else {
                org.telegram.ui.Cells.y j03 = t6.j0(org.telegram.messenger.i0.L(f10), 0, i0.b.o(-16777216, (int) (f7 * 25.5f)));
                this.N = j03;
                j03.setCallback(this);
            }
        }
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = this.D != i12;
        boolean z13 = this.x == i10;
        this.G = z13;
        if (z13) {
            this.H = this.y;
        }
        this.x = i10;
        this.y = i11;
        this.D = i12;
        this.E = str;
        this.L = z11;
        Drawable[] drawableArr = this.e;
        TextView[] textViewArr = this.h;
        if (!z12) {
            if (i10 != 0) {
                Drawable mutate = getContext().getDrawable(i10).mutate();
                drawableArr[0] = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
            }
            this.I.setColor(i11);
            if (!this.O) {
                this.n = i12;
            }
            textViewArr[0].setText(str);
            this.K = this.L ? 1.0f : 0.0f;
            this.G = false;
            this.s = 0.0f;
            invalidate();
            return;
        }
        if (!z13 && i10 != 0) {
            Drawable mutate2 = getContext().getDrawable(i10).mutate();
            drawableArr[1] = mutate2;
            mutate2.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
        }
        if (!this.O) {
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
        this.w = ofFloat;
        ofFloat.addUpdateListener(new jg.o0(7, this, z14));
        this.w.addListener(new ha0(12, this, z14));
        this.w.setDuration(150L).start();
        invalidate();
    }

    public final void d(boolean z10, boolean z11) {
        FrameLayout frameLayout = this.f;
        if (!z11) {
            frameLayout.animate().cancel();
            frameLayout.setAlpha(z10 ? 1.0f : 0.0f);
        } else {
            float f7 = z10 ? 1.0f : 0.0f;
            if (frameLayout.getAlpha() != f7) {
                frameLayout.animate().alpha(f7).start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.y yVar = this.N;
        if (yVar != null) {
            yVar.setState(getDrawableState());
        }
    }

    public View getTextView() {
        return this.h[0];
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.N;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0052  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f7;
        canvas.save();
        float f10 = this.W;
        float f11 = 2.0f;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        boolean z10 = this.d;
        Paint paint = this.a;
        if (z10) {
            float f12 = this.s;
            if (f12 != 0.0f) {
                paint.setColor(i0.b.f(f12, this.n, this.r));
                float width = getWidth() / 2.0f;
                float f13 = this.T;
                float L = org.telegram.messenger.i0.L(f13) / 2.0f;
                float L2 = org.telegram.messenger.i0.L(f13) / 2.0f;
                if (this.b) {
                    canvas.drawCircle(width, L, L2, paint);
                }
                if (this.N == null) {
                    org.telegram.ui.Cells.y j02 = t6.j0(org.telegram.messenger.i0.L(f13), 0, -16777216);
                    this.N = j02;
                    j02.setCallback(this);
                }
                if (this.c) {
                    this.N.setBounds((int) (width - L2), (int) (L - L2), (int) (width + L2), (int) (L2 + L));
                    this.N.draw(canvas);
                }
                if (this.x != 0) {
                    boolean z11 = this.L;
                    Paint paint2 = this.I;
                    Drawable[] drawableArr = this.e;
                    if (!z11 && this.K == 0.0f) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= ((this.s == 0.0f || this.G) ? 1 : 2)) {
                                break;
                            }
                            if (drawableArr[i10] != null) {
                                canvas.save();
                                float f14 = this.s;
                                if (f14 == 0.0f || this.G || drawableArr[0] == null || drawableArr[1] == null) {
                                    if (this.G) {
                                        int f15 = i0.b.f(f14, this.H, this.y);
                                        drawableArr[i10].setColorFilter(new PorterDuffColorFilter(f15, PorterDuff.Mode.MULTIPLY));
                                        paint2.setColor(f15);
                                    }
                                    drawableArr[i10].setAlpha(zs.e4);
                                } else {
                                    if (i10 == 0) {
                                        f14 = 1.0f - f14;
                                    }
                                    canvas.scale(f14, f14, width, L);
                                    drawableArr[i10].setAlpha((int) (f14 * 255.0f));
                                }
                                f7 = f11;
                                drawableArr[i10].setBounds((int) (width - (r6.getIntrinsicWidth() / f11)), (int) (L - (drawableArr[i10].getIntrinsicHeight() / f11)), (int) ((drawableArr[i10].getIntrinsicWidth() / f11) + width), (int) ((drawableArr[i10].getIntrinsicHeight() / f7) + L));
                                drawableArr[i10].draw(canvas);
                                canvas.restore();
                            } else {
                                f7 = f11;
                            }
                            i10++;
                            f11 = f7;
                        }
                    } else {
                        if (this.G) {
                            int f16 = i0.b.f(this.s, this.H, this.y);
                            drawableArr[0].setColorFilter(new PorterDuffColorFilter(f16, PorterDuff.Mode.MULTIPLY));
                            paint2.setColor(f16);
                        }
                        drawableArr[0].setAlpha(zs.e4);
                        float f17 = this.s;
                        if (f17 != 0.0f && this.G) {
                            int f18 = i0.b.f(f17, this.H, this.y);
                            drawableArr[0].setColorFilter(new PorterDuffColorFilter(f18, PorterDuff.Mode.MULTIPLY));
                            paint2.setColor(f18);
                        }
                        drawableArr[0].setAlpha(zs.e4);
                        boolean z12 = this.L;
                        if (z12) {
                            float f19 = this.K;
                            if (f19 < 1.0f) {
                                float f20 = f19 + 0.08f;
                                this.K = f20;
                                if (f20 > 1.0f) {
                                    this.K = 1.0f;
                                } else {
                                    invalidate();
                                }
                                if (this.K <= 0.0f) {
                                    float N = org.telegram.messenger.i0.N(8.0f) + ((int) (width - (drawableArr[0].getIntrinsicWidth() / 2.0f))) + this.M;
                                    float N2 = org.telegram.messenger.i0.N(8.0f) + ((int) (L - (drawableArr[0].getIntrinsicHeight() / 2.0f)));
                                    float L3 = org.telegram.messenger.i0.L(17.0f);
                                    gr grVar = gr.f;
                                    float interpolation = (grVar.getInterpolation(this.K) * L3) + (N - org.telegram.messenger.i0.L(1.0f));
                                    float interpolation2 = (grVar.getInterpolation(this.K) * org.telegram.messenger.i0.L(17.0f)) + N2;
                                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), zs.e4, 31);
                                    drawableArr[0].setBounds((int) (width - (r2.getIntrinsicWidth() / 2.0f)), (int) (L - (drawableArr[0].getIntrinsicHeight() / 2.0f)), (int) ((drawableArr[0].getIntrinsicWidth() / 2.0f) + width), (int) ((drawableArr[0].getIntrinsicHeight() / 2.0f) + L));
                                    drawableArr[0].draw(canvas);
                                    canvas.drawLine(N, N2 - org.telegram.messenger.i0.L(2.0f), interpolation, interpolation2 - org.telegram.messenger.i0.L(2.0f), this.J);
                                    canvas.drawLine(N, N2, interpolation, interpolation2, paint2);
                                    canvas.restore();
                                } else {
                                    drawableArr[0].setBounds((int) (width - (r2.getIntrinsicWidth() / 2.0f)), (int) (L - (drawableArr[0].getIntrinsicHeight() / 2.0f)), (int) ((drawableArr[0].getIntrinsicWidth() / 2.0f) + width), (int) ((drawableArr[0].getIntrinsicHeight() / 2.0f) + L));
                                    drawableArr[0].draw(canvas);
                                }
                            }
                        }
                        if (!z12) {
                            float f21 = this.K - 0.08f;
                            this.K = f21;
                            if (f21 < 0.0f) {
                                this.K = 0.0f;
                            } else {
                                invalidate();
                            }
                        }
                        if (this.K <= 0.0f) {
                        }
                    }
                }
                canvas.restore();
            }
        }
        paint.setColor(this.n);
        float width2 = getWidth() / 2.0f;
        float f132 = this.T;
        float L4 = org.telegram.messenger.i0.L(f132) / 2.0f;
        float L22 = org.telegram.messenger.i0.L(f132) / 2.0f;
        if (this.b) {
        }
        if (this.N == null) {
        }
        if (this.c) {
        }
        if (this.x != 0) {
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.E);
        if (!this.O) {
            accessibilityNodeInfo.setClassName(Button.class.getName());
            return;
        }
        accessibilityNodeInfo.setClassName(ToggleButton.class.getName());
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.P);
    }

    public void setCheckable(boolean z10) {
        this.O = z10;
    }

    public void setCrossOffset(float f7) {
        this.M = f7;
    }

    public void setDrawBackground(boolean z10) {
        this.b = z10;
    }

    public void setDrawRipple(boolean z10) {
        this.c = z10;
    }

    public void setPressedBtn(boolean z10) {
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W, z10 ? 0.8f : 1.0f);
        this.V = ofFloat;
        ofFloat.addUpdateListener(new a2(this, 1));
        this.V.setDuration(150L);
        this.V.start();
    }

    public void setTextSize(int i10) {
        for (int i11 = 0; i11 < 2; i11++) {
            this.h[i11].setTextSize(1, i10);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.N == drawable || super.verifyDrawable(drawable);
    }
}
