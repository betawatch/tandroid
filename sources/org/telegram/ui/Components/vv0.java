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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class vv0 extends View {
    public int B;
    public String[] C;
    public int[] D;
    public Drawable[] E;
    public int F;
    public int G;
    public float H;
    public final z5 I;
    public final z5 J;
    public uv0 K;
    public final org.telegram.ui.ActionBar.g6 L;
    public final tv0 a;
    public final Paint b;
    public final Paint c;
    public final TextPaint d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public boolean v;
    public boolean w;
    public float x;
    public float y;

    public vv0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.s = -1;
        this.G = TLObject.FLAG_31;
        pr prVar = pr.f;
        this.I = new z5(this, 120L, prVar);
        this.J = new z5(this, 150L, prVar);
        this.L = g6Var;
        this.b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.a = new tv0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOption(int i10) {
        if (this.F != i10) {
            AndroidUtilities.vibrateCursor(this);
        }
        this.F = i10;
        uv0 uv0Var = this.K;
        if (uv0Var != null) {
            uv0Var.i(i10);
        }
        invalidate();
    }

    public final void b(int i10, Drawable[] drawableArr, String... strArr) {
        this.C = strArr;
        this.E = drawableArr;
        this.F = i10;
        this.D = new int[strArr.length];
        int i11 = 0;
        while (true) {
            if (i11 >= this.C.length) {
                break;
            }
            this.D[i11] = (int) Math.ceil(this.d.measureText(r7[i11]));
            i11++;
        }
        Drawable[] drawableArr2 = this.E;
        if (drawableArr2 != null) {
            for (Drawable drawable : drawableArr2) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
        }
        requestLayout();
    }

    public int getSelectedIndex() {
        return this.F;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i11;
        Canvas canvas2 = canvas;
        float d = this.I.d(this.F, false);
        float f10 = 0.0f;
        float f11 = 1.0f;
        float d10 = this.J.d(this.v ? 1.0f : 0.0f, false);
        int i12 = 2;
        int dp = AndroidUtilities.dp(11.0f) + (getMeasuredHeight() / 2);
        int i13 = 0;
        while (true) {
            int length = this.C.length;
            org.telegram.ui.ActionBar.g6 g6Var2 = this.L;
            Paint paint = this.b;
            if (i13 >= length) {
                float f12 = this.n;
                int i14 = (this.h * 2) + this.r;
                int i15 = this.f;
                float f13 = ((i14 + i15) * d) + f12 + (i15 / 2);
                int i16 = org.telegram.ui.ActionBar.k6.N6;
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.k6.v0(i16, g6Var2), 80));
                float f14 = dp;
                canvas2.drawCircle(f13, f14, AndroidUtilities.dp(d10 * 12.0f), paint);
                paint.setColor(org.telegram.ui.ActionBar.k6.v0(i16, g6Var2));
                canvas2.drawCircle(f13, f14, AndroidUtilities.dp(6.0f), paint);
                return;
            }
            int i17 = this.n;
            int i18 = (this.h * 2) + this.r;
            int i19 = this.f;
            int i20 = (i19 / i12) + ((i18 + i19) * i13) + i17;
            float f15 = i13;
            float f16 = f15 - d;
            float max = Math.max(f10, f11 - Math.abs(f16));
            float a2 = k7.o.a((d - f15) + f11, f10, f11);
            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.M6, g6Var2);
            int v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.N6, g6Var2);
            int i21 = this.G;
            int d11 = i0.a.d(a2, v02, org.telegram.ui.ActionBar.k6.l1((i21 == Integer.MIN_VALUE || i13 > i21) ? 1.0f : 0.5f, v03));
            paint.setColor(d11);
            Paint paint2 = this.c;
            paint2.setColor(d11);
            float f17 = dp;
            canvas2.drawCircle(i20, f17, AndroidUtilities.lerp(this.f / 2, AndroidUtilities.dp(6.0f), max), paint);
            if (i13 != 0) {
                int i22 = (i20 - (this.f / 2)) - this.h;
                int i23 = this.r;
                int i24 = i22 - i23;
                int i25 = this.s;
                if (i25 == -1 || i13 - 1 < i25) {
                    i10 = i20;
                    g6Var = g6Var2;
                    float f18 = f16 - 1.0f;
                    float a10 = k7.o.a(1.0f - Math.abs(f18), 0.0f, 1.0f);
                    int dp2 = (int) (i23 - (AndroidUtilities.dp(3.0f) * k7.o.a(1.0f - Math.min(Math.abs(f16), Math.abs(f18)), 0.0f, 1.0f)));
                    canvas2 = canvas;
                    canvas2.drawRect((int) ((AndroidUtilities.dp(3.0f) * a10) + i24), dp - AndroidUtilities.dp(1.0f), dp2 + r2, AndroidUtilities.dp(1.0f) + dp, paint);
                } else {
                    int dp3 = AndroidUtilities.dp(3.0f) + i24;
                    int dp4 = (i23 - AndroidUtilities.dp(3.0f)) / AndroidUtilities.dp(13.0f);
                    if (this.e != dp4) {
                        i11 = dp3;
                        i10 = i20;
                        paint2.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(6.0f), org.telegram.ui.b.z(8.0f, dp4, r12) / (dp4 - 1)}, 0.0f));
                        this.e = dp4;
                    } else {
                        i11 = dp3;
                        i10 = i20;
                    }
                    g6Var = g6Var2;
                    canvas2 = canvas;
                    canvas2.drawLine(AndroidUtilities.dp(1.0f) + i11, f17, (i11 + r12) - AndroidUtilities.dp(1.0f), f17, paint2);
                }
            } else {
                i10 = i20;
                g6Var = g6Var2;
            }
            int i26 = this.D[i13];
            String str = this.C[i13];
            int d12 = i0.a.d(max, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.y6, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.n6, g6Var));
            TextPaint textPaint = this.d;
            textPaint.setColor(d12);
            if (this.E != null) {
                canvas2.save();
                if (i13 == 0) {
                    canvas2.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(15.5f));
                } else if (i13 == this.C.length - 1) {
                    canvas2.translate(((getMeasuredWidth() - i26) - AndroidUtilities.dp(22.0f)) - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(28.0f) - AndroidUtilities.dp(12.5f));
                } else {
                    canvas2.translate((i10 - (i26 / 2)) - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(28.0f) - AndroidUtilities.dp(12.5f));
                }
                this.E[i13].setColorFilter(textPaint.getColor(), PorterDuff.Mode.MULTIPLY);
                this.E[i13].draw(canvas2);
                canvas2.restore();
                canvas2.save();
                canvas2.translate((this.E[i13].getIntrinsicWidth() / 2.0f) - AndroidUtilities.dp(i13 == 0 ? 3.0f : 2.0f), 0.0f);
            }
            if (i13 == 0) {
                canvas2.drawText(str, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(28.0f), textPaint);
            } else if (i13 == this.C.length - 1) {
                canvas2.drawText(str, (getMeasuredWidth() - i26) - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(28.0f), textPaint);
            } else {
                canvas2.drawText(str, i10 - (i26 / 2), AndroidUtilities.dp(28.0f), textPaint);
            }
            if (this.E != null) {
                canvas2.restore();
            }
            i13++;
            f10 = 0.0f;
            f11 = 1.0f;
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
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(74.0f), TLObject.FLAG_30));
        this.f = AndroidUtilities.dp(6.0f);
        this.h = AndroidUtilities.dp(2.0f);
        this.n = AndroidUtilities.dp(22.0f);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.f;
        String[] strArr = this.C;
        this.r = (((measuredWidth - (i12 * strArr.length)) - ((strArr.length - 1) * (this.h * 2))) - (this.n * 2)) / Math.max(1, strArr.length - 1);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        float a2 = k7.o.a(((this.f / 2.0f) + (x10 - this.n)) / (((this.h * 2) + this.r) + r3), 0.0f, this.C.length - 1);
        boolean z4 = Math.abs(a2 - ((float) Math.round(a2))) < 0.35f;
        if (z4) {
            a2 = Math.round(a2);
        }
        int i10 = this.G;
        if (i10 != Integer.MIN_VALUE) {
            a2 = Math.max(a2, i10);
        }
        if (motionEvent.getAction() == 0) {
            this.x = x10;
            this.y = y10;
            this.H = a2;
            this.B = this.F;
            this.w = true;
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 2) {
            if (!this.v && Math.abs(this.x - x10) > Math.abs(this.y - y10)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.w && Math.abs(this.x - x10) >= AndroidUtilities.touchSlop) {
                this.v = true;
                this.w = false;
            }
            if (this.v) {
                this.H = a2;
                invalidate();
                if (Math.round(this.H) != this.F && z4) {
                    setOption(Math.round(this.H));
                }
            }
            invalidate();
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        }
        if (this.v) {
            int i11 = this.F;
            if (i11 != this.B) {
                setOption(i11);
            }
        } else {
            this.H = a2;
            if (motionEvent.getAction() == 1 && Math.round(this.H) != this.F) {
                setOption(Math.round(this.H));
            }
        }
        uv0 uv0Var = this.K;
        if (uv0Var != null) {
            uv0Var.m();
        }
        this.w = false;
        this.v = false;
        invalidate();
        getParent().requestDisallowInterceptTouchEvent(false);
        return true;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return super.performAccessibilityAction(i10, bundle) || this.a.g(this, i10, bundle);
    }

    public void setCallback(uv0 uv0Var) {
        this.K = uv0Var;
    }

    public void setDashedFrom(int i10) {
        this.s = i10;
    }

    public void setMinAllowedIndex(int i10) {
        String[] strArr;
        if (i10 != -1 && (strArr = this.C) != null) {
            i10 = Math.min(i10, strArr.length - 1);
        }
        if (this.G != i10) {
            this.G = i10;
            if (this.F < i10) {
                this.F = i10;
            }
            invalidate();
        }
    }
}
