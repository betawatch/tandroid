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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class dv0 extends View {
    public int A;
    public String[] B;
    public int[] C;
    public Drawable[] D;
    public int E;
    public int F;
    public float G;
    public final y5 H;
    public final y5 I;
    public cv0 J;
    public final org.telegram.ui.ActionBar.c6 K;
    public final bv0 a;
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

    public dv0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.s = -1;
        this.F = TLObject.FLAG_31;
        er erVar = er.f;
        this.H = new y5(this, 120L, erVar);
        this.I = new y5(this, 150L, erVar);
        this.K = c6Var;
        this.b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.a = new bv0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOption(int i10) {
        if (this.E != i10) {
            AndroidUtilities.vibrateCursor(this);
        }
        this.E = i10;
        cv0 cv0Var = this.J;
        if (cv0Var != null) {
            cv0Var.j(i10);
        }
        invalidate();
    }

    public final void b(int i10, Drawable[] drawableArr, String... strArr) {
        this.B = strArr;
        this.D = drawableArr;
        this.E = i10;
        this.C = new int[strArr.length];
        int i11 = 0;
        while (true) {
            if (i11 >= this.B.length) {
                break;
            }
            this.C[i11] = (int) Math.ceil(this.d.measureText(r7[i11]));
            i11++;
        }
        Drawable[] drawableArr2 = this.D;
        if (drawableArr2 != null) {
            for (Drawable drawable : drawableArr2) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
        }
        requestLayout();
    }

    public int getSelectedIndex() {
        return this.E;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i11;
        Canvas canvas2 = canvas;
        float d = this.H.d(this.E, false);
        float f10 = 0.0f;
        float f11 = 1.0f;
        float d10 = this.I.d(this.v ? 1.0f : 0.0f, false);
        int i12 = 2;
        int dp = AndroidUtilities.dp(11.0f) + (getMeasuredHeight() / 2);
        int i13 = 0;
        while (true) {
            int length = this.B.length;
            org.telegram.ui.ActionBar.c6 c6Var2 = this.K;
            Paint paint = this.b;
            if (i13 >= length) {
                float f12 = this.n;
                int i14 = (this.h * 2) + this.r;
                int i15 = this.f;
                float f13 = ((i14 + i15) * d) + f12 + (i15 / 2);
                int i16 = org.telegram.ui.ActionBar.g6.N6;
                paint.setColor(i0.b.k(org.telegram.ui.ActionBar.g6.v0(i16, c6Var2), 80));
                float f14 = dp;
                canvas2.drawCircle(f13, f14, AndroidUtilities.dp(d10 * 12.0f), paint);
                paint.setColor(org.telegram.ui.ActionBar.g6.v0(i16, c6Var2));
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
            float a2 = h7.n.a((d - f15) + f11, f10, f11);
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.M6, c6Var2);
            int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.N6, c6Var2);
            int i21 = this.F;
            int d11 = i0.b.d(a2, v02, org.telegram.ui.ActionBar.g6.l1((i21 == Integer.MIN_VALUE || i13 > i21) ? 1.0f : 0.5f, v03));
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
                    c6Var = c6Var2;
                    float f18 = f16 - 1.0f;
                    float a3 = h7.n.a(1.0f - Math.abs(f18), 0.0f, 1.0f);
                    int dp2 = (int) (i23 - (AndroidUtilities.dp(3.0f) * h7.n.a(1.0f - Math.min(Math.abs(f16), Math.abs(f18)), 0.0f, 1.0f)));
                    canvas2 = canvas;
                    canvas2.drawRect((int) ((AndroidUtilities.dp(3.0f) * a3) + i24), dp - AndroidUtilities.dp(1.0f), dp2 + r2, AndroidUtilities.dp(1.0f) + dp, paint);
                } else {
                    int dp3 = AndroidUtilities.dp(3.0f) + i24;
                    int dp4 = (i23 - AndroidUtilities.dp(3.0f)) / AndroidUtilities.dp(13.0f);
                    if (this.e != dp4) {
                        i11 = dp3;
                        i10 = i20;
                        paint2.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(6.0f), org.telegram.messenger.rl.z(8.0f, dp4, r12) / (dp4 - 1)}, 0.0f));
                        this.e = dp4;
                    } else {
                        i11 = dp3;
                        i10 = i20;
                    }
                    c6Var = c6Var2;
                    canvas2 = canvas;
                    canvas2.drawLine(AndroidUtilities.dp(1.0f) + i11, f17, (i11 + r12) - AndroidUtilities.dp(1.0f), f17, paint2);
                }
            } else {
                i10 = i20;
                c6Var = c6Var2;
            }
            int i26 = this.C[i13];
            String str = this.B[i13];
            int d12 = i0.b.d(max, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.n6, c6Var));
            TextPaint textPaint = this.d;
            textPaint.setColor(d12);
            if (this.D != null) {
                canvas2.save();
                if (i13 == 0) {
                    canvas2.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(15.5f));
                } else if (i13 == this.B.length - 1) {
                    canvas2.translate(((getMeasuredWidth() - i26) - AndroidUtilities.dp(22.0f)) - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(28.0f) - AndroidUtilities.dp(12.5f));
                } else {
                    canvas2.translate((i10 - (i26 / 2)) - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(28.0f) - AndroidUtilities.dp(12.5f));
                }
                this.D[i13].setColorFilter(textPaint.getColor(), PorterDuff.Mode.MULTIPLY);
                this.D[i13].draw(canvas2);
                canvas2.restore();
                canvas2.save();
                canvas2.translate((this.D[i13].getIntrinsicWidth() / 2.0f) - AndroidUtilities.dp(i13 == 0 ? 3.0f : 2.0f), 0.0f);
            }
            if (i13 == 0) {
                canvas2.drawText(str, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(28.0f), textPaint);
            } else if (i13 == this.B.length - 1) {
                canvas2.drawText(str, (getMeasuredWidth() - i26) - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(28.0f), textPaint);
            } else {
                canvas2.drawText(str, i10 - (i26 / 2), AndroidUtilities.dp(28.0f), textPaint);
            }
            if (this.D != null) {
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
        String[] strArr = this.B;
        this.r = (((measuredWidth - (i12 * strArr.length)) - ((strArr.length - 1) * (this.h * 2))) - (this.n * 2)) / Math.max(1, strArr.length - 1);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        float a2 = h7.n.a(((this.f / 2.0f) + (x8 - this.n)) / (((this.h * 2) + this.r) + r3), 0.0f, this.B.length - 1);
        boolean z10 = Math.abs(a2 - ((float) Math.round(a2))) < 0.35f;
        if (z10) {
            a2 = Math.round(a2);
        }
        int i10 = this.F;
        if (i10 != Integer.MIN_VALUE) {
            a2 = Math.max(a2, i10);
        }
        if (motionEvent.getAction() == 0) {
            this.x = x8;
            this.y = y10;
            this.G = a2;
            this.A = this.E;
            this.w = true;
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 2) {
            if (!this.v && Math.abs(this.x - x8) > Math.abs(this.y - y10)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.w && Math.abs(this.x - x8) >= AndroidUtilities.touchSlop) {
                this.v = true;
                this.w = false;
            }
            if (this.v) {
                this.G = a2;
                invalidate();
                if (Math.round(this.G) != this.E && z10) {
                    setOption(Math.round(this.G));
                }
            }
            invalidate();
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return true;
        }
        if (this.v) {
            int i11 = this.E;
            if (i11 != this.A) {
                setOption(i11);
            }
        } else {
            this.G = a2;
            if (motionEvent.getAction() == 1 && Math.round(this.G) != this.E) {
                setOption(Math.round(this.G));
            }
        }
        cv0 cv0Var = this.J;
        if (cv0Var != null) {
            cv0Var.m();
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

    public void setCallback(cv0 cv0Var) {
        this.J = cv0Var;
    }

    public void setDashedFrom(int i10) {
        this.s = i10;
    }

    public void setMinAllowedIndex(int i10) {
        String[] strArr;
        if (i10 != -1 && (strArr = this.B) != null) {
            i10 = Math.min(i10, strArr.length - 1);
        }
        if (this.F != i10) {
            this.F = i10;
            if (this.E < i10) {
                this.E = i10;
            }
            invalidate();
        }
    }
}
