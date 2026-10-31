package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yu0 extends View {
    public float D;
    public int E;
    public String[] F;
    public int[] G;
    public Drawable[] H;
    public int I;
    public int J;
    public float K;
    public final t5 L;
    public final t5 M;
    public xu0 N;
    public final org.telegram.ui.ActionBar.p6 O;
    public final wu0 a;
    public final Paint b;
    public final Paint c;
    public final TextPaint d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public boolean w;
    public boolean x;
    public float y;

    public yu0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.s = -1;
        this.J = TLObject.FLAG_31;
        gr grVar = gr.f;
        this.L = new t5(this, 120L, grVar);
        this.M = new t5(this, 150L, grVar);
        this.O = p6Var;
        this.b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        this.a = new wu0(0, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOption(int i10) {
        if (this.I != i10) {
            org.telegram.messenger.i0.b4(this);
        }
        this.I = i10;
        xu0 xu0Var = this.N;
        if (xu0Var != null) {
            xu0Var.m(i10);
        }
        invalidate();
    }

    public final void b(int i10, Drawable[] drawableArr, String... strArr) {
        this.F = strArr;
        this.H = drawableArr;
        this.I = i10;
        this.G = new int[strArr.length];
        int i11 = 0;
        while (true) {
            if (i11 >= this.F.length) {
                break;
            }
            this.G[i11] = (int) Math.ceil(this.d.measureText(r7[i11]));
            i11++;
        }
        Drawable[] drawableArr2 = this.H;
        if (drawableArr2 != null) {
            for (Drawable drawable : drawableArr2) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
        }
        requestLayout();
    }

    public int getSelectedIndex() {
        return this.I;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        org.telegram.ui.ActionBar.p6 p6Var;
        float f7;
        float f10;
        int i11;
        Canvas canvas2 = canvas;
        boolean z10 = false;
        float e = this.L.e(false, this.I);
        float f11 = 0.0f;
        float f12 = 1.0f;
        float e7 = this.M.e(false, this.w ? 1.0f : 0.0f);
        int i12 = 2;
        int L = org.telegram.messenger.i0.L(11.0f) + (getMeasuredHeight() / 2);
        int i13 = 0;
        while (true) {
            int length = this.F.length;
            org.telegram.ui.ActionBar.p6 p6Var2 = this.O;
            Paint paint = this.b;
            if (i13 >= length) {
                float f13 = this.n;
                int i14 = (this.h * 2) + this.r;
                int i15 = this.f;
                float f14 = ((i14 + i15) * e) + f13 + (i15 / 2);
                int i16 = org.telegram.ui.ActionBar.t6.N6;
                paint.setColor(i0.b.o(org.telegram.ui.ActionBar.t6.w0(i16, p6Var2), 80));
                float f15 = L;
                canvas2.drawCircle(f14, f15, org.telegram.messenger.i0.L(e7 * 12.0f), paint);
                paint.setColor(org.telegram.ui.ActionBar.t6.w0(i16, p6Var2));
                canvas2.drawCircle(f14, f15, org.telegram.messenger.i0.L(6.0f), paint);
                return;
            }
            int i17 = this.n;
            int i18 = (this.h * i12) + this.r;
            int i19 = this.f;
            int i20 = (i19 / i12) + ((i18 + i19) * i13) + i17;
            float f16 = i13;
            float f17 = f16 - e;
            boolean z11 = z10;
            float max = Math.max(f11, f12 - Math.abs(f17));
            float a2 = w7.u.a((e - f16) + f12, f11, f12);
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.M6, p6Var2);
            float f18 = f12;
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.N6, p6Var2);
            int i21 = this.J;
            int i22 = i12;
            int f19 = i0.b.f(a2, w02, org.telegram.ui.ActionBar.t6.r1((i21 == Integer.MIN_VALUE || i13 > i21) ? f18 : 0.5f, w03));
            paint.setColor(f19);
            Paint paint2 = this.c;
            paint2.setColor(f19);
            float f20 = L;
            canvas2.drawCircle(i20, f20, org.telegram.messenger.i0.W1(max, this.f / 2, org.telegram.messenger.i0.L(6.0f)), paint);
            if (i13 != 0) {
                f7 = 3.0f;
                int i23 = (i20 - (this.f / 2)) - this.h;
                int i24 = this.r;
                int i25 = i23 - i24;
                int i26 = this.s;
                if (i26 == -1 || i13 - 1 < i26) {
                    i10 = i20;
                    p6Var = p6Var2;
                    float f21 = f17 - f18;
                    float a10 = w7.u.a(f18 - Math.abs(f21), 0.0f, f18);
                    int L2 = (int) (i24 - (org.telegram.messenger.i0.L(3.0f) * w7.u.a(f18 - Math.min(Math.abs(f17), Math.abs(f21)), 0.0f, f18)));
                    f18 = 1.0f;
                    canvas2 = canvas;
                    canvas2.drawRect((int) ((org.telegram.messenger.i0.L(3.0f) * a10) + i25), L - org.telegram.messenger.i0.L(1.0f), L2 + r2, org.telegram.messenger.i0.L(1.0f) + L, paint);
                } else {
                    int L3 = org.telegram.messenger.i0.L(3.0f) + i25;
                    int L4 = (i24 - org.telegram.messenger.i0.L(3.0f)) / org.telegram.messenger.i0.L(13.0f);
                    if (this.e != L4) {
                        i11 = L3;
                        i10 = i20;
                        float[] fArr = new float[i22];
                        fArr[z11 ? 1 : 0] = org.telegram.messenger.i0.L(6.0f);
                        fArr[1] = org.telegram.messenger.z20.A(8.0f, L4, r12) / (L4 - 1);
                        paint2.setPathEffect(new DashPathEffect(fArr, 0.0f));
                        this.e = L4;
                    } else {
                        i11 = L3;
                        i10 = i20;
                    }
                    p6Var = p6Var2;
                    canvas2 = canvas;
                    canvas2.drawLine(org.telegram.messenger.i0.L(f18) + i11, f20, (i11 + r12) - org.telegram.messenger.i0.L(f18), f20, paint2);
                }
            } else {
                i10 = i20;
                p6Var = p6Var2;
                f7 = 3.0f;
            }
            int i27 = this.G[i13];
            String str = this.F[i13];
            int f22 = i0.b.f(max, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.n6, p6Var));
            TextPaint textPaint = this.d;
            textPaint.setColor(f22);
            if (this.H != null) {
                canvas2.save();
                if (i13 == 0) {
                    canvas2.translate(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(15.5f));
                } else if (i13 == this.F.length - 1) {
                    canvas2.translate(((getMeasuredWidth() - i27) - org.telegram.messenger.i0.L(22.0f)) - org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(28.0f) - org.telegram.messenger.i0.L(12.5f));
                } else {
                    canvas2.translate((i10 - (i27 / 2)) - org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(28.0f) - org.telegram.messenger.i0.L(12.5f));
                }
                this.H[i13].setColorFilter(textPaint.getColor(), PorterDuff.Mode.MULTIPLY);
                this.H[i13].draw(canvas2);
                canvas2.restore();
                canvas2.save();
                f10 = 0.0f;
                canvas2.translate((this.H[i13].getIntrinsicWidth() / 2.0f) - org.telegram.messenger.i0.L(i13 == 0 ? f7 : 2.0f), 0.0f);
            } else {
                f10 = 0.0f;
            }
            if (i13 == 0) {
                canvas2.drawText(str, org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(28.0f), textPaint);
            } else if (i13 == this.F.length - 1) {
                canvas2.drawText(str, (getMeasuredWidth() - i27) - org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(28.0f), textPaint);
            } else {
                canvas2.drawText(str, i10 - (i27 / 2), org.telegram.messenger.i0.L(28.0f), textPaint);
            }
            if (this.H != null) {
                canvas2.restore();
            }
            i13++;
            f11 = f10;
            z10 = z11 ? 1 : 0;
            f12 = f18;
            i12 = 2;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.a.e(this, accessibilityNodeInfo);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(74.0f), TLObject.FLAG_30));
        this.f = org.telegram.messenger.i0.L(6.0f);
        this.h = org.telegram.messenger.i0.L(2.0f);
        this.n = org.telegram.messenger.i0.L(22.0f);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.f;
        String[] strArr = this.F;
        this.r = (((measuredWidth - (i12 * strArr.length)) - ((strArr.length - 1) * (this.h * 2))) - (this.n * 2)) / Math.max(1, strArr.length - 1);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        float a2 = w7.u.a(((this.f / 2.0f) + (x10 - this.n)) / (((this.h * 2) + this.r) + r3), 0.0f, this.F.length - 1);
        boolean z10 = Math.abs(a2 - ((float) Math.round(a2))) < 0.35f;
        if (z10) {
            a2 = Math.round(a2);
        }
        int i10 = this.J;
        if (i10 != Integer.MIN_VALUE) {
            a2 = Math.max(a2, i10);
        }
        if (motionEvent.getAction() == 0) {
            this.y = x10;
            this.D = y3;
            this.K = a2;
            this.E = this.I;
            this.x = true;
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 2) {
            if (!this.w && Math.abs(this.y - x10) > Math.abs(this.D - y3)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.x && Math.abs(this.y - x10) >= org.telegram.messenger.i0.e) {
                this.w = true;
                this.x = false;
            }
            if (this.w) {
                this.K = a2;
                invalidate();
                if (Math.round(this.K) != this.I && z10) {
                    setOption(Math.round(this.K));
                }
            }
            invalidate();
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        }
        if (this.w) {
            int i11 = this.I;
            if (i11 != this.E) {
                setOption(i11);
            }
        } else {
            this.K = a2;
            if (motionEvent.getAction() == 1 && Math.round(this.K) != this.I) {
                setOption(Math.round(this.K));
            }
        }
        xu0 xu0Var = this.N;
        if (xu0Var != null) {
            xu0Var.s();
        }
        this.x = false;
        this.w = false;
        invalidate();
        getParent().requestDisallowInterceptTouchEvent(false);
        return true;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return super.performAccessibilityAction(i10, bundle) || this.a.g(this, i10, bundle);
    }

    public void setCallback(xu0 xu0Var) {
        this.N = xu0Var;
    }

    public void setDashedFrom(int i10) {
        this.s = i10;
    }

    public void setMinAllowedIndex(int i10) {
        String[] strArr;
        if (i10 != -1 && (strArr = this.F) != null) {
            i10 = Math.min(i10, strArr.length - 1);
        }
        if (this.J != i10) {
            this.J = i10;
            if (this.I < i10) {
                this.I = i10;
            }
            invalidate();
        }
    }
}
