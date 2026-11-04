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
import b8.mf;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class c2 extends FrameLayout {
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
    public org.telegram.ui.Cells.y O;
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

    public c2(Context context, float f10) {
        super(context);
        this.a = new Paint(1);
        this.b = true;
        this.c = true;
        this.e = new Drawable[2];
        this.h = new TextView[2];
        this.J = new Paint(1);
        this.K = new Paint(1);
        this.a0 = 1.0f;
        this.U = f10;
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout);
        for (int i3 = 0; i3 < 2; i3++) {
            TextView textView = new TextView(context);
            textView.setGravity(1);
            textView.setTextSize(1, 11.0f);
            textView.setTextColor(-1);
            textView.setImportantForAccessibility(2);
            this.f.addView(textView, mf.d(-1, -2.0f, 0, 0.0f, f10 + 6.0f, 0.0f, 0.0f));
            this.h[i3] = textView;
        }
        this.h[1].setVisibility(8);
        this.K.setColor(-16777216);
        this.K.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.K.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        this.J.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        this.J.setStrokeCap(Paint.Cap.ROUND);
    }

    public final void a(int i3, int i10) {
        this.S = i3;
        this.T = i10;
        this.n = i0.a.f(this.R, i3, i10);
        invalidate();
    }

    public final void b(boolean z10, boolean z11) {
        if (this.Q == z10) {
            return;
        }
        this.Q = z10;
        if (this.P) {
            if (!z11) {
                this.R = z10 ? 1.0f : 0.0f;
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
            ofFloat.addUpdateListener(new b2(this, 0));
            this.V.addListener(new w9(this, 17));
            this.V.setDuration(150L);
            this.V.start();
        }
    }

    public final void c(int i3, int i10, int i11, float f10, boolean z10, String str, boolean z11, boolean z12) {
        String str2;
        if (getVisibility() != 0) {
            setVisibility(0);
            z12 = false;
        }
        if (this.x == i3 && this.y == i10 && ((this.P || this.E == i11) && (str2 = this.F) != null && str2.equals(str) && z11 == this.M)) {
            return;
        }
        if (this.O == null || z10) {
            int alpha = Color.alpha(i11);
            float f11 = this.U;
            if (alpha != 255 || org.telegram.messenger.g0.B(i11) <= 0.5d) {
                org.telegram.ui.Cells.y j02 = k6.j0(org.telegram.messenger.g0.L(f11), 0, i0.a.o(-1, (int) (f10 * 76.5f)));
                this.O = j02;
                j02.setCallback(this);
            } else {
                org.telegram.ui.Cells.y j03 = k6.j0(org.telegram.messenger.g0.L(f11), 0, i0.a.o(-16777216, (int) (f10 * 25.5f)));
                this.O = j03;
                j03.setCallback(this);
            }
        }
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = this.E != i11;
        boolean z13 = this.x == i3;
        this.H = z13;
        if (z13) {
            this.I = this.y;
        }
        this.x = i3;
        this.y = i10;
        this.E = i11;
        this.F = str;
        this.M = z11;
        Drawable[] drawableArr = this.e;
        TextView[] textViewArr = this.h;
        if (!z12) {
            if (i3 != 0) {
                Drawable mutate = getContext().getDrawable(i3).mutate();
                drawableArr[0] = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
            }
            this.J.setColor(i10);
            if (!this.P) {
                this.n = i11;
            }
            textViewArr[0].setText(str);
            this.L = this.M ? 1.0f : 0.0f;
            this.H = false;
            this.s = 0.0f;
            invalidate();
            return;
        }
        if (!z13 && i3 != 0) {
            Drawable mutate2 = getContext().getDrawable(i3).mutate();
            drawableArr[1] = mutate2;
            mutate2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
        if (!this.P) {
            this.r = i11;
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
        ofFloat.addUpdateListener(new dh.u(9, this, z14));
        this.w.addListener(new s9(26, this, z14));
        this.w.setDuration(150L).start();
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
        org.telegram.ui.Cells.y yVar = this.O;
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
        org.telegram.ui.Cells.y yVar = this.O;
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
        float f11 = this.a0;
        float f12 = 2.0f;
        canvas.scale(f11, f11, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        boolean z10 = this.d;
        Paint paint = this.a;
        if (z10) {
            float f13 = this.s;
            if (f13 != 0.0f) {
                paint.setColor(i0.a.f(f13, this.n, this.r));
                float width = getWidth() / 2.0f;
                float f14 = this.U;
                float L = org.telegram.messenger.g0.L(f14) / 2.0f;
                float L2 = org.telegram.messenger.g0.L(f14) / 2.0f;
                if (this.b) {
                    canvas.drawCircle(width, L, L2, paint);
                }
                if (this.O == null) {
                    org.telegram.ui.Cells.y j02 = k6.j0(org.telegram.messenger.g0.L(f14), 0, -16777216);
                    this.O = j02;
                    j02.setCallback(this);
                }
                if (this.c) {
                    this.O.setBounds((int) (width - L2), (int) (L - L2), (int) (width + L2), (int) (L2 + L));
                    this.O.draw(canvas);
                }
                if (this.x != 0) {
                    boolean z11 = this.M;
                    Paint paint2 = this.J;
                    Drawable[] drawableArr = this.e;
                    if (!z11 && this.L == 0.0f) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= ((this.s == 0.0f || this.H) ? 1 : 2)) {
                                break;
                            }
                            if (drawableArr[i3] != null) {
                                canvas.save();
                                float f15 = this.s;
                                if (f15 == 0.0f || this.H || drawableArr[0] == null || drawableArr[1] == null) {
                                    if (this.H) {
                                        int f16 = i0.a.f(f15, this.I, this.y);
                                        drawableArr[i3].setColorFilter(new PorterDuffColorFilter(f16, PorterDuff.Mode.MULTIPLY));
                                        paint2.setColor(f16);
                                    }
                                    drawableArr[i3].setAlpha(hs.e4);
                                } else {
                                    if (i3 == 0) {
                                        f15 = 1.0f - f15;
                                    }
                                    canvas.scale(f15, f15, width, L);
                                    drawableArr[i3].setAlpha((int) (f15 * 255.0f));
                                }
                                f10 = f12;
                                drawableArr[i3].setBounds((int) (width - (r6.getIntrinsicWidth() / f12)), (int) (L - (drawableArr[i3].getIntrinsicHeight() / f12)), (int) ((drawableArr[i3].getIntrinsicWidth() / f12) + width), (int) ((drawableArr[i3].getIntrinsicHeight() / f10) + L));
                                drawableArr[i3].draw(canvas);
                                canvas.restore();
                            } else {
                                f10 = f12;
                            }
                            i3++;
                            f12 = f10;
                        }
                    } else {
                        if (this.H) {
                            int f17 = i0.a.f(this.s, this.I, this.y);
                            drawableArr[0].setColorFilter(new PorterDuffColorFilter(f17, PorterDuff.Mode.MULTIPLY));
                            paint2.setColor(f17);
                        }
                        drawableArr[0].setAlpha(hs.e4);
                        float f18 = this.s;
                        if (f18 != 0.0f && this.H) {
                            int f19 = i0.a.f(f18, this.I, this.y);
                            drawableArr[0].setColorFilter(new PorterDuffColorFilter(f19, PorterDuff.Mode.MULTIPLY));
                            paint2.setColor(f19);
                        }
                        drawableArr[0].setAlpha(hs.e4);
                        boolean z12 = this.M;
                        if (z12) {
                            float f20 = this.L;
                            if (f20 < 1.0f) {
                                float f21 = f20 + 0.08f;
                                this.L = f21;
                                if (f21 > 1.0f) {
                                    this.L = 1.0f;
                                } else {
                                    invalidate();
                                }
                                if (this.L <= 0.0f) {
                                    float N = org.telegram.messenger.g0.N(8.0f) + ((int) (width - (drawableArr[0].getIntrinsicWidth() / 2.0f))) + this.N;
                                    float N2 = org.telegram.messenger.g0.N(8.0f) + ((int) (L - (drawableArr[0].getIntrinsicHeight() / 2.0f)));
                                    float L3 = org.telegram.messenger.g0.L(17.0f);
                                    xq xqVar = xq.f;
                                    float interpolation = (xqVar.getInterpolation(this.L) * L3) + (N - org.telegram.messenger.g0.L(1.0f));
                                    float interpolation2 = (xqVar.getInterpolation(this.L) * org.telegram.messenger.g0.L(17.0f)) + N2;
                                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), hs.e4, 31);
                                    drawableArr[0].setBounds((int) (width - (r2.getIntrinsicWidth() / 2.0f)), (int) (L - (drawableArr[0].getIntrinsicHeight() / 2.0f)), (int) ((drawableArr[0].getIntrinsicWidth() / 2.0f) + width), (int) ((drawableArr[0].getIntrinsicHeight() / 2.0f) + L));
                                    drawableArr[0].draw(canvas);
                                    canvas.drawLine(N, N2 - org.telegram.messenger.g0.L(2.0f), interpolation, interpolation2 - org.telegram.messenger.g0.L(2.0f), this.K);
                                    canvas.drawLine(N, N2, interpolation, interpolation2, paint2);
                                    canvas.restore();
                                } else {
                                    drawableArr[0].setBounds((int) (width - (r2.getIntrinsicWidth() / 2.0f)), (int) (L - (drawableArr[0].getIntrinsicHeight() / 2.0f)), (int) ((drawableArr[0].getIntrinsicWidth() / 2.0f) + width), (int) ((drawableArr[0].getIntrinsicHeight() / 2.0f) + L));
                                    drawableArr[0].draw(canvas);
                                }
                            }
                        }
                        if (!z12) {
                            float f22 = this.L - 0.08f;
                            this.L = f22;
                            if (f22 < 0.0f) {
                                this.L = 0.0f;
                            } else {
                                invalidate();
                            }
                        }
                        if (this.L <= 0.0f) {
                        }
                    }
                }
                canvas.restore();
            }
        }
        paint.setColor(this.n);
        float width2 = getWidth() / 2.0f;
        float f142 = this.U;
        float L4 = org.telegram.messenger.g0.L(f142) / 2.0f;
        float L22 = org.telegram.messenger.g0.L(f142) / 2.0f;
        if (this.b) {
        }
        if (this.O == null) {
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
        accessibilityNodeInfo.setText(this.F);
        if (!this.P) {
            accessibilityNodeInfo.setClassName(Button.class.getName());
            return;
        }
        accessibilityNodeInfo.setClassName(ToggleButton.class.getName());
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.Q);
    }

    public void setCheckable(boolean z10) {
        this.P = z10;
    }

    public void setCrossOffset(float f10) {
        this.N = f10;
    }

    public void setDrawBackground(boolean z10) {
        this.b = z10;
    }

    public void setDrawRipple(boolean z10) {
        this.c = z10;
    }

    public void setPressedBtn(boolean z10) {
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, z10 ? 0.8f : 1.0f);
        this.W = ofFloat;
        ofFloat.addUpdateListener(new b2(this, 1));
        this.W.setDuration(150L);
        this.W.start();
    }

    public void setTextSize(int i3) {
        for (int i10 = 0; i10 < 2; i10++) {
            this.h[i10].setTextSize(1, i3);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.O == drawable || super.verifyDrawable(drawable);
    }
}
