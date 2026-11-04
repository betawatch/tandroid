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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ut0 extends View {
    public float E;
    public int F;
    public String[] G;
    public int[] H;
    public Drawable[] I;
    public int J;
    public int K;
    public float L;
    public final u5 M;
    public final u5 N;
    public tt0 O;
    public final org.telegram.ui.ActionBar.e6 P;
    public final st0 a;
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

    public ut0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.s = -1;
        this.K = TLObject.FLAG_31;
        xq xqVar = xq.f;
        this.M = new u5(this, 120L, xqVar);
        this.N = new u5(this, 150L, xqVar);
        this.P = e6Var;
        this.b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        this.a = new st0(0, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOption(int i3) {
        if (this.J != i3) {
            org.telegram.messenger.g0.c4(this);
        }
        this.J = i3;
        tt0 tt0Var = this.O;
        if (tt0Var != null) {
            tt0Var.l(i3);
        }
        invalidate();
    }

    public final void b(int i3, Drawable[] drawableArr, String... strArr) {
        this.G = strArr;
        this.I = drawableArr;
        this.J = i3;
        this.H = new int[strArr.length];
        int i10 = 0;
        while (true) {
            if (i10 >= this.G.length) {
                break;
            }
            this.H[i10] = (int) Math.ceil(this.d.measureText(r7[i10]));
            i10++;
        }
        Drawable[] drawableArr2 = this.I;
        if (drawableArr2 != null) {
            for (Drawable drawable : drawableArr2) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
        }
        requestLayout();
    }

    public int getSelectedIndex() {
        return this.J;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i3;
        org.telegram.ui.ActionBar.e6 e6Var;
        float f10;
        float f11;
        int i10;
        Canvas canvas2 = canvas;
        boolean z10 = false;
        float e10 = this.M.e(false, this.J);
        float f12 = 0.0f;
        float f13 = 1.0f;
        float e11 = this.N.e(false, this.w ? 1.0f : 0.0f);
        int i11 = 2;
        int L = org.telegram.messenger.g0.L(11.0f) + (getMeasuredHeight() / 2);
        int i12 = 0;
        while (true) {
            int length = this.G.length;
            org.telegram.ui.ActionBar.e6 e6Var2 = this.P;
            Paint paint = this.b;
            if (i12 >= length) {
                float f14 = this.n;
                int i13 = (this.h * 2) + this.r;
                int i14 = this.f;
                float f15 = ((i13 + i14) * e10) + f14 + (i14 / 2);
                int i15 = org.telegram.ui.ActionBar.k6.N6;
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(i15, e6Var2), 80));
                float f16 = L;
                canvas2.drawCircle(f15, f16, org.telegram.messenger.g0.L(e11 * 12.0f), paint);
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(i15, e6Var2));
                canvas2.drawCircle(f15, f16, org.telegram.messenger.g0.L(6.0f), paint);
                return;
            }
            int i16 = this.n;
            int i17 = (this.h * i11) + this.r;
            int i18 = this.f;
            int i19 = (i18 / i11) + ((i17 + i18) * i12) + i16;
            float f17 = i12;
            float f18 = f17 - e10;
            boolean z11 = z10;
            float max = Math.max(f12, f13 - Math.abs(f18));
            float a10 = b8.be.a((e10 - f17) + f13, f12, f13);
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.M6, e6Var2);
            float f19 = f13;
            int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.N6, e6Var2);
            int i20 = this.K;
            int i21 = i11;
            int f20 = i0.a.f(a10, w02, org.telegram.ui.ActionBar.k6.r1((i20 == Integer.MIN_VALUE || i12 > i20) ? f19 : 0.5f, w03));
            paint.setColor(f20);
            Paint paint2 = this.c;
            paint2.setColor(f20);
            float f21 = L;
            canvas2.drawCircle(i19, f21, org.telegram.messenger.g0.W1(max, this.f / 2, org.telegram.messenger.g0.L(6.0f)), paint);
            if (i12 != 0) {
                f10 = 3.0f;
                int i22 = (i19 - (this.f / 2)) - this.h;
                int i23 = this.r;
                int i24 = i22 - i23;
                int i25 = this.s;
                if (i25 == -1 || i12 - 1 < i25) {
                    i3 = i19;
                    e6Var = e6Var2;
                    float f22 = f18 - f19;
                    float a11 = b8.be.a(f19 - Math.abs(f22), 0.0f, f19);
                    int L2 = (int) (i23 - (org.telegram.messenger.g0.L(3.0f) * b8.be.a(f19 - Math.min(Math.abs(f18), Math.abs(f22)), 0.0f, f19)));
                    f19 = 1.0f;
                    canvas2 = canvas;
                    canvas2.drawRect((int) ((org.telegram.messenger.g0.L(3.0f) * a11) + i24), L - org.telegram.messenger.g0.L(1.0f), L2 + r2, org.telegram.messenger.g0.L(1.0f) + L, paint);
                } else {
                    int L3 = org.telegram.messenger.g0.L(3.0f) + i24;
                    int L4 = (i23 - org.telegram.messenger.g0.L(3.0f)) / org.telegram.messenger.g0.L(13.0f);
                    if (this.e != L4) {
                        i10 = L3;
                        i3 = i19;
                        float[] fArr = new float[i21];
                        fArr[z11 ? 1 : 0] = org.telegram.messenger.g0.L(6.0f);
                        fArr[1] = org.telegram.messenger.camera.q.A(8.0f, L4, r12) / (L4 - 1);
                        paint2.setPathEffect(new DashPathEffect(fArr, 0.0f));
                        this.e = L4;
                    } else {
                        i10 = L3;
                        i3 = i19;
                    }
                    e6Var = e6Var2;
                    canvas2 = canvas;
                    canvas2.drawLine(org.telegram.messenger.g0.L(f19) + i10, f21, (i10 + r12) - org.telegram.messenger.g0.L(f19), f21, paint2);
                }
            } else {
                i3 = i19;
                e6Var = e6Var2;
                f10 = 3.0f;
            }
            int i26 = this.H[i12];
            String str = this.G[i12];
            int f23 = i0.a.f(max, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n6, e6Var));
            TextPaint textPaint = this.d;
            textPaint.setColor(f23);
            if (this.I != null) {
                canvas2.save();
                if (i12 == 0) {
                    canvas2.translate(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(15.5f));
                } else if (i12 == this.G.length - 1) {
                    canvas2.translate(((getMeasuredWidth() - i26) - org.telegram.messenger.g0.L(22.0f)) - org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(28.0f) - org.telegram.messenger.g0.L(12.5f));
                } else {
                    canvas2.translate((i3 - (i26 / 2)) - org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(28.0f) - org.telegram.messenger.g0.L(12.5f));
                }
                this.I[i12].setColorFilter(textPaint.getColor(), PorterDuff.Mode.MULTIPLY);
                this.I[i12].draw(canvas2);
                canvas2.restore();
                canvas2.save();
                f11 = 0.0f;
                canvas2.translate((this.I[i12].getIntrinsicWidth() / 2.0f) - org.telegram.messenger.g0.L(i12 == 0 ? f10 : 2.0f), 0.0f);
            } else {
                f11 = 0.0f;
            }
            if (i12 == 0) {
                canvas2.drawText(str, org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
            } else if (i12 == this.G.length - 1) {
                canvas2.drawText(str, (getMeasuredWidth() - i26) - org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
            } else {
                canvas2.drawText(str, i3 - (i26 / 2), org.telegram.messenger.g0.L(28.0f), textPaint);
            }
            if (this.I != null) {
                canvas2.restore();
            }
            i12++;
            f12 = f11;
            z10 = z11 ? 1 : 0;
            f13 = f19;
            i11 = 2;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.a.e(this, accessibilityNodeInfo);
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(74.0f), TLObject.FLAG_30));
        this.f = org.telegram.messenger.g0.L(6.0f);
        this.h = org.telegram.messenger.g0.L(2.0f);
        this.n = org.telegram.messenger.g0.L(22.0f);
        int measuredWidth = getMeasuredWidth();
        int i11 = this.f;
        String[] strArr = this.G;
        this.r = (((measuredWidth - (i11 * strArr.length)) - ((strArr.length - 1) * (this.h * 2))) - (this.n * 2)) / Math.max(1, strArr.length - 1);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        float a10 = b8.be.a(((this.f / 2.0f) + (x10 - this.n)) / (((this.h * 2) + this.r) + r3), 0.0f, this.G.length - 1);
        boolean z10 = Math.abs(a10 - ((float) Math.round(a10))) < 0.35f;
        if (z10) {
            a10 = Math.round(a10);
        }
        int i3 = this.K;
        if (i3 != Integer.MIN_VALUE) {
            a10 = Math.max(a10, i3);
        }
        if (motionEvent.getAction() == 0) {
            this.y = x10;
            this.E = y9;
            this.L = a10;
            this.F = this.J;
            this.x = true;
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 2) {
            if (!this.w && Math.abs(this.y - x10) > Math.abs(this.E - y9)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.x && Math.abs(this.y - x10) >= org.telegram.messenger.g0.e) {
                this.w = true;
                this.x = false;
            }
            if (this.w) {
                this.L = a10;
                invalidate();
                if (Math.round(this.L) != this.J && z10) {
                    setOption(Math.round(this.L));
                }
            }
            invalidate();
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        }
        if (this.w) {
            int i10 = this.J;
            if (i10 != this.F) {
                setOption(i10);
            }
        } else {
            this.L = a10;
            if (motionEvent.getAction() == 1 && Math.round(this.L) != this.J) {
                setOption(Math.round(this.L));
            }
        }
        tt0 tt0Var = this.O;
        if (tt0Var != null) {
            tt0Var.p();
        }
        this.x = false;
        this.w = false;
        invalidate();
        getParent().requestDisallowInterceptTouchEvent(false);
        return true;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        return super.performAccessibilityAction(i3, bundle) || this.a.g(this, i3, bundle);
    }

    public void setCallback(tt0 tt0Var) {
        this.O = tt0Var;
    }

    public void setDashedFrom(int i3) {
        this.s = i3;
    }

    public void setMinAllowedIndex(int i3) {
        String[] strArr;
        if (i3 != -1 && (strArr = this.G) != null) {
            i3 = Math.min(i3, strArr.length - 1);
        }
        if (this.K != i3) {
            this.K = i3;
            if (this.J < i3) {
                this.J = i3;
            }
            invalidate();
        }
    }
}
