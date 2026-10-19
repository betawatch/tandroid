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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ow0 extends View {
    public int E;
    public String[] F;
    public int[] G;
    public Drawable[] H;
    public int I;
    public int J;
    public float K;
    public final f6 L;
    public final f6 M;
    public nw0 N;
    public final org.telegram.ui.ActionBar.d6 O;
    public final mw0 a;
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

    public ow0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.s = -1;
        this.J = TLObject.FLAG_31;
        bs bsVar = bs.f;
        this.L = new f6(this, 120L, bsVar);
        this.M = new f6(this, 150L, bsVar);
        this.O = d6Var;
        this.b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.a = new mw0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOption(int i10) {
        if (this.I != i10) {
            AndroidUtilities.vibrateCursor(this);
        }
        this.I = i10;
        nw0 nw0Var = this.N;
        if (nw0Var != null) {
            nw0Var.h(i10);
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
        org.telegram.ui.ActionBar.d6 d6Var;
        float f7;
        float f10;
        int i11;
        Canvas canvas2 = canvas;
        boolean z10 = false;
        float d = this.L.d(this.I, false);
        float f11 = 0.0f;
        float f12 = 1.0f;
        float d10 = this.M.d(this.v ? 1.0f : 0.0f, false);
        int i12 = 2;
        int dp = AndroidUtilities.dp(11.0f) + (getMeasuredHeight() / 2);
        int i13 = 0;
        while (true) {
            int length = this.F.length;
            org.telegram.ui.ActionBar.d6 d6Var2 = this.O;
            Paint paint = this.b;
            if (i13 >= length) {
                float f13 = this.n;
                int i14 = (this.h * 2) + this.r;
                int i15 = this.f;
                float f14 = ((i14 + i15) * d) + f13 + (i15 / 2);
                int i16 = org.telegram.ui.ActionBar.h6.N6;
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.h6.w0(i16, d6Var2), 80));
                float f15 = dp;
                canvas2.drawCircle(f14, f15, AndroidUtilities.dp(d10 * 12.0f), paint);
                paint.setColor(org.telegram.ui.ActionBar.h6.w0(i16, d6Var2));
                canvas2.drawCircle(f14, f15, AndroidUtilities.dp(6.0f), paint);
                return;
            }
            int i17 = this.n;
            int i18 = (this.h * i12) + this.r;
            int i19 = this.f;
            int i20 = (i19 / i12) + ((i18 + i19) * i13) + i17;
            float f16 = i13;
            float f17 = f16 - d;
            boolean z11 = z10;
            float max = Math.max(f11, f12 - Math.abs(f17));
            float a2 = w7.r.a((d - f16) + f12, f11, f12);
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.M6, d6Var2);
            float f18 = f12;
            int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.N6, d6Var2);
            int i21 = this.J;
            int i22 = i12;
            int f19 = i0.a.f(a2, w02, org.telegram.ui.ActionBar.h6.m1((i21 == Integer.MIN_VALUE || i13 > i21) ? f18 : 0.5f, w03));
            paint.setColor(f19);
            Paint paint2 = this.c;
            paint2.setColor(f19);
            float f20 = dp;
            canvas2.drawCircle(i20, f20, AndroidUtilities.lerp(this.f / 2, AndroidUtilities.dp(6.0f), max), paint);
            if (i13 != 0) {
                f7 = 3.0f;
                int i23 = (i20 - (this.f / 2)) - this.h;
                int i24 = this.r;
                int i25 = i23 - i24;
                int i26 = this.s;
                if (i26 == -1 || i13 - 1 < i26) {
                    i10 = i20;
                    d6Var = d6Var2;
                    float f21 = f17 - f18;
                    float a10 = w7.r.a(f18 - Math.abs(f21), 0.0f, f18);
                    int dp2 = (int) (i24 - (AndroidUtilities.dp(3.0f) * w7.r.a(f18 - Math.min(Math.abs(f17), Math.abs(f21)), 0.0f, f18)));
                    f18 = 1.0f;
                    canvas2 = canvas;
                    canvas2.drawRect((int) ((AndroidUtilities.dp(3.0f) * a10) + i25), dp - AndroidUtilities.dp(1.0f), dp2 + r2, AndroidUtilities.dp(1.0f) + dp, paint);
                } else {
                    int dp3 = AndroidUtilities.dp(3.0f) + i25;
                    int dp4 = (i24 - AndroidUtilities.dp(3.0f)) / AndroidUtilities.dp(13.0f);
                    if (this.e != dp4) {
                        i11 = dp3;
                        i10 = i20;
                        float[] fArr = new float[i22];
                        fArr[z11 ? 1 : 0] = AndroidUtilities.dp(6.0f);
                        fArr[1] = org.telegram.messenger.kk.B(8.0f, dp4, r12) / (dp4 - 1);
                        paint2.setPathEffect(new DashPathEffect(fArr, 0.0f));
                        this.e = dp4;
                    } else {
                        i11 = dp3;
                        i10 = i20;
                    }
                    d6Var = d6Var2;
                    canvas2 = canvas;
                    canvas2.drawLine(AndroidUtilities.dp(f18) + i11, f20, (i11 + r12) - AndroidUtilities.dp(f18), f20, paint2);
                }
            } else {
                i10 = i20;
                d6Var = d6Var2;
                f7 = 3.0f;
            }
            int i27 = this.G[i13];
            String str = this.F[i13];
            int f22 = i0.a.f(max, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.y6, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.n6, d6Var));
            TextPaint textPaint = this.d;
            textPaint.setColor(f22);
            if (this.H != null) {
                canvas2.save();
                if (i13 == 0) {
                    canvas2.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(15.5f));
                } else if (i13 == this.F.length - 1) {
                    canvas2.translate(((getMeasuredWidth() - i27) - AndroidUtilities.dp(22.0f)) - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(28.0f) - AndroidUtilities.dp(12.5f));
                } else {
                    canvas2.translate((i10 - (i27 / 2)) - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(28.0f) - AndroidUtilities.dp(12.5f));
                }
                this.H[i13].setColorFilter(textPaint.getColor(), PorterDuff.Mode.MULTIPLY);
                this.H[i13].draw(canvas2);
                canvas2.restore();
                canvas2.save();
                f10 = 0.0f;
                canvas2.translate((this.H[i13].getIntrinsicWidth() / 2.0f) - AndroidUtilities.dp(i13 == 0 ? f7 : 2.0f), 0.0f);
            } else {
                f10 = 0.0f;
            }
            if (i13 == 0) {
                canvas2.drawText(str, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(28.0f), textPaint);
            } else if (i13 == this.F.length - 1) {
                canvas2.drawText(str, (getMeasuredWidth() - i27) - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(28.0f), textPaint);
            } else {
                canvas2.drawText(str, i10 - (i27 / 2), AndroidUtilities.dp(28.0f), textPaint);
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
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(74.0f), TLObject.FLAG_30));
        this.f = AndroidUtilities.dp(6.0f);
        this.h = AndroidUtilities.dp(2.0f);
        this.n = AndroidUtilities.dp(22.0f);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.f;
        String[] strArr = this.F;
        this.r = (((measuredWidth - (i12 * strArr.length)) - ((strArr.length - 1) * (this.h * 2))) - (this.n * 2)) / Math.max(1, strArr.length - 1);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        float a2 = w7.r.a(((this.f / 2.0f) + (x10 - this.n)) / (((this.h * 2) + this.r) + r3), 0.0f, this.F.length - 1);
        boolean z10 = Math.abs(a2 - ((float) Math.round(a2))) < 0.35f;
        if (z10) {
            a2 = Math.round(a2);
        }
        int i10 = this.J;
        if (i10 != Integer.MIN_VALUE) {
            a2 = Math.max(a2, i10);
        }
        if (motionEvent.getAction() == 0) {
            this.x = x10;
            this.y = y3;
            this.K = a2;
            this.E = this.I;
            this.w = true;
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 2) {
            if (!this.v && Math.abs(this.x - x10) > Math.abs(this.y - y3)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.w && Math.abs(this.x - x10) >= AndroidUtilities.touchSlop) {
                this.v = true;
                this.w = false;
            }
            if (this.v) {
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
        if (this.v) {
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
        nw0 nw0Var = this.N;
        if (nw0Var != null) {
            nw0Var.m();
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

    public void setCallback(nw0 nw0Var) {
        this.N = nw0Var;
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
