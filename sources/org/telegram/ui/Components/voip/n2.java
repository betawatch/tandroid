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
import c8.ha;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.xq;
import org.telegram.ui.va;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class n2 extends FrameLayout {
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

    public n2(Context context, float f10) {
        super(context);
        this.a = new Paint(1);
        this.b = true;
        this.c = true;
        this.e = new Drawable[2];
        this.h = new TextView[2];
        this.I = new Paint(1);
        this.J = new Paint(1);
        this.W = 1.0f;
        this.T = f10;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout);
        for (int i7 = 0; i7 < 2; i7++) {
            TextView textView = new TextView(context);
            textView.setGravity(1);
            textView.setTextSize(1, 11.0f);
            textView.setTextColor(-1);
            textView.setImportantForAccessibility(2);
            this.f.addView(textView, ha.d(-1, -2.0f, 0, 0.0f, f10 + 6.0f, 0.0f, 0.0f));
            this.h[i7] = textView;
        }
        this.h[1].setVisibility(8);
        this.J.setColor(-16777216);
        this.J.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.J.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        this.I.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        this.I.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a(int i7, int i10) {
        this.R = i7;
        this.S = i10;
        this.n = i0.a.f(this.Q, i7, i10);
        invalidate();
    }

    public final void b(boolean z9, boolean z10) {
        if (this.P == z9) {
            return;
        }
        this.P = z9;
        if (this.O) {
            if (!z10) {
                this.Q = z9 ? 1.0f : 0.0f;
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
            ofFloat.addUpdateListener(new m2(this, 0));
            this.U.addListener(new va(this, 17));
            this.U.setDuration(150L);
            this.U.start();
        }
    }

    public final void c(int i7, int i10, int i11, float f10, boolean z9, String str, boolean z10, boolean z11) {
        String str2;
        if (getVisibility() != 0) {
            setVisibility(0);
            z11 = false;
        }
        if (this.x == i7 && this.y == i10 && ((this.O || this.D == i11) && (str2 = this.E) != null && str2.equals(str) && z10 == this.L)) {
            return;
        }
        if (this.N == null || z9) {
            int alpha = Color.alpha(i11);
            float f11 = this.T;
            if (alpha != 255 || org.telegram.messenger.g0.B(i11) <= 0.5d) {
                org.telegram.ui.Cells.y j02 = k6.j0(org.telegram.messenger.g0.L(f11), 0, i0.a.o(-1, (int) (f10 * 76.5f)));
                this.N = j02;
                j02.setCallback(this);
            } else {
                org.telegram.ui.Cells.y j03 = k6.j0(org.telegram.messenger.g0.L(f11), 0, i0.a.o(-16777216, (int) (f10 * 25.5f)));
                this.N = j03;
                j03.setCallback(this);
            }
        }
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = this.D != i11;
        boolean z12 = this.x == i7;
        this.G = z12;
        if (z12) {
            this.H = this.y;
        }
        this.x = i7;
        this.y = i10;
        this.D = i11;
        this.E = str;
        this.L = z10;
        Drawable[] drawableArr = this.e;
        TextView[] textViewArr = this.h;
        if (!z11) {
            if (i7 != 0) {
                Drawable mutate = getContext().getDrawable(i7).mutate();
                drawableArr[0] = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
            }
            this.I.setColor(i10);
            if (!this.O) {
                this.n = i11;
            }
            textViewArr[0].setText(str);
            this.K = this.L ? 1.0f : 0.0f;
            this.G = false;
            this.s = 0.0f;
            invalidate();
            return;
        }
        if (!z12 && i7 != 0) {
            Drawable mutate2 = getContext().getDrawable(i7).mutate();
            drawableArr[1] = mutate2;
            mutate2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
        if (!this.O) {
            this.r = i11;
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
        this.w = ofFloat;
        ofFloat.addUpdateListener(new ch.u(9, this, z13));
        this.w.addListener(new t9(26, this, z13));
        this.w.setDuration(150L).start();
        invalidate();
    }

    public final void d(boolean z9, boolean z10) {
        FrameLayout frameLayout = this.f;
        if (!z10) {
            frameLayout.animate().cancel();
            frameLayout.setAlpha(z9 ? 1.0f : 0.0f);
        } else {
            float f10 = z9 ? 1.0f : 0.0f;
            if (frameLayout.getAlpha() != f10) {
                frameLayout.animate().alpha(f10).start();
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
        float f10;
        canvas.save();
        float f11 = this.W;
        float f12 = 2.0f;
        canvas.scale(f11, f11, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        boolean z9 = this.d;
        Paint paint = this.a;
        if (z9) {
            float f13 = this.s;
            if (f13 != 0.0f) {
                paint.setColor(i0.a.f(f13, this.n, this.r));
                float width = getWidth() / 2.0f;
                float f14 = this.T;
                float L = org.telegram.messenger.g0.L(f14) / 2.0f;
                float L2 = org.telegram.messenger.g0.L(f14) / 2.0f;
                if (this.b) {
                    canvas.drawCircle(width, L, L2, paint);
                }
                if (this.N == null) {
                    org.telegram.ui.Cells.y j02 = k6.j0(org.telegram.messenger.g0.L(f14), 0, -16777216);
                    this.N = j02;
                    j02.setCallback(this);
                }
                if (this.c) {
                    this.N.setBounds((int) (width - L2), (int) (L - L2), (int) (width + L2), (int) (L2 + L));
                    this.N.draw(canvas);
                }
                if (this.x != 0) {
                    boolean z10 = this.L;
                    Paint paint2 = this.I;
                    Drawable[] drawableArr = this.e;
                    if (!z10 && this.K == 0.0f) {
                        int i7 = 0;
                        while (true) {
                            if (i7 >= ((this.s == 0.0f || this.G) ? 1 : 2)) {
                                break;
                            }
                            if (drawableArr[i7] != null) {
                                canvas.save();
                                float f15 = this.s;
                                if (f15 == 0.0f || this.G || drawableArr[0] == null || drawableArr[1] == null) {
                                    if (this.G) {
                                        int f16 = i0.a.f(f15, this.H, this.y);
                                        drawableArr[i7].setColorFilter(new PorterDuffColorFilter(f16, PorterDuff.Mode.MULTIPLY));
                                        paint2.setColor(f16);
                                    }
                                    drawableArr[i7].setAlpha(qs.e4);
                                } else {
                                    if (i7 == 0) {
                                        f15 = 1.0f - f15;
                                    }
                                    canvas.scale(f15, f15, width, L);
                                    drawableArr[i7].setAlpha((int) (f15 * 255.0f));
                                }
                                f10 = f12;
                                drawableArr[i7].setBounds((int) (width - (r6.getIntrinsicWidth() / f12)), (int) (L - (drawableArr[i7].getIntrinsicHeight() / f12)), (int) ((drawableArr[i7].getIntrinsicWidth() / f12) + width), (int) ((drawableArr[i7].getIntrinsicHeight() / f10) + L));
                                drawableArr[i7].draw(canvas);
                                canvas.restore();
                            } else {
                                f10 = f12;
                            }
                            i7++;
                            f12 = f10;
                        }
                    } else {
                        if (this.G) {
                            int f17 = i0.a.f(this.s, this.H, this.y);
                            drawableArr[0].setColorFilter(new PorterDuffColorFilter(f17, PorterDuff.Mode.MULTIPLY));
                            paint2.setColor(f17);
                        }
                        drawableArr[0].setAlpha(qs.e4);
                        float f18 = this.s;
                        if (f18 != 0.0f && this.G) {
                            int f19 = i0.a.f(f18, this.H, this.y);
                            drawableArr[0].setColorFilter(new PorterDuffColorFilter(f19, PorterDuff.Mode.MULTIPLY));
                            paint2.setColor(f19);
                        }
                        drawableArr[0].setAlpha(qs.e4);
                        boolean z11 = this.L;
                        if (z11) {
                            float f20 = this.K;
                            if (f20 < 1.0f) {
                                float f21 = f20 + 0.08f;
                                this.K = f21;
                                if (f21 > 1.0f) {
                                    this.K = 1.0f;
                                } else {
                                    invalidate();
                                }
                                if (this.K <= 0.0f) {
                                    float N = org.telegram.messenger.g0.N(8.0f) + ((int) (width - (drawableArr[0].getIntrinsicWidth() / 2.0f))) + this.M;
                                    float N2 = org.telegram.messenger.g0.N(8.0f) + ((int) (L - (drawableArr[0].getIntrinsicHeight() / 2.0f)));
                                    float L3 = org.telegram.messenger.g0.L(17.0f);
                                    xq xqVar = xq.f;
                                    float interpolation = (xqVar.getInterpolation(this.K) * L3) + (N - org.telegram.messenger.g0.L(1.0f));
                                    float interpolation2 = (xqVar.getInterpolation(this.K) * org.telegram.messenger.g0.L(17.0f)) + N2;
                                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), qs.e4, 31);
                                    drawableArr[0].setBounds((int) (width - (r2.getIntrinsicWidth() / 2.0f)), (int) (L - (drawableArr[0].getIntrinsicHeight() / 2.0f)), (int) ((drawableArr[0].getIntrinsicWidth() / 2.0f) + width), (int) ((drawableArr[0].getIntrinsicHeight() / 2.0f) + L));
                                    drawableArr[0].draw(canvas);
                                    canvas.drawLine(N, N2 - org.telegram.messenger.g0.L(2.0f), interpolation, interpolation2 - org.telegram.messenger.g0.L(2.0f), this.J);
                                    canvas.drawLine(N, N2, interpolation, interpolation2, paint2);
                                    canvas.restore();
                                } else {
                                    drawableArr[0].setBounds((int) (width - (r2.getIntrinsicWidth() / 2.0f)), (int) (L - (drawableArr[0].getIntrinsicHeight() / 2.0f)), (int) ((drawableArr[0].getIntrinsicWidth() / 2.0f) + width), (int) ((drawableArr[0].getIntrinsicHeight() / 2.0f) + L));
                                    drawableArr[0].draw(canvas);
                                }
                            }
                        }
                        if (!z11) {
                            float f22 = this.K - 0.08f;
                            this.K = f22;
                            if (f22 < 0.0f) {
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
        float f142 = this.T;
        float L4 = org.telegram.messenger.g0.L(f142) / 2.0f;
        float L22 = org.telegram.messenger.g0.L(f142) / 2.0f;
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

    public void setCheckable(boolean z9) {
        this.O = z9;
    }

    public void setCrossOffset(float f10) {
        this.M = f10;
    }

    public void setDrawBackground(boolean z9) {
        this.b = z9;
    }

    public void setDrawRipple(boolean z9) {
        this.c = z9;
    }

    public void setPressedBtn(boolean z9) {
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W, z9 ? 0.8f : 1.0f);
        this.V = ofFloat;
        ofFloat.addUpdateListener(new m2(this, 1));
        this.V.setDuration(150L);
        this.V.start();
    }

    public void setTextSize(int i7) {
        for (int i10 = 0; i10 < 2; i10++) {
            this.h[i10].setTextSize(1, i7);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.N == drawable || super.verifyDrawable(drawable);
    }
}
