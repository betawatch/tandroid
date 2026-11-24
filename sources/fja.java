// default package

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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fja extends View {
    public float E;
    public int F;
    public String[] G;
    public int[] H;
    public Drawable[] I;
    public int J;
    public int K;
    public float L;
    public final lm M;
    public final lm N;
    public eja O;
    public final wjb P;
    public final i66 a;
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

    public fja(Context context, wjb wjbVar) {
        super(context);
        this.s = -1;
        this.K = TLObject.FLAG_31;
        s33 s33Var = s33.f;
        this.M = new lm(120L, this, s33Var);
        this.N = new lm(150L, this, s33Var);
        this.P = wjbVar;
        this.b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStrokeWidth(gl.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        textPaint.setTextSize(gl.L(13.0f));
        this.a = new i66(this, (byte) 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOption(int i) {
        if (this.J != i) {
            gl.X3(this);
        }
        this.J = i;
        eja ejaVar = this.O;
        if (ejaVar != null) {
            ejaVar.k(i);
        }
        invalidate();
    }

    public final void b(int i, Drawable[] drawableArr, String... strArr) {
        this.G = strArr;
        this.I = drawableArr;
        this.J = i;
        this.H = new int[strArr.length];
        int i2 = 0;
        while (true) {
            if (i2 >= this.G.length) {
                break;
            }
            this.H[i2] = (int) Math.ceil(this.d.measureText(r7[i2]));
            i2++;
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
        int i;
        float f;
        float f2;
        int i2;
        Canvas canvas2 = canvas;
        boolean z = false;
        float e = this.M.e(false, this.J);
        float f3 = 0.0f;
        float f4 = 1.0f;
        float e2 = this.N.e(false, this.w ? 1.0f : 0.0f);
        int i3 = 2;
        int L = gl.L(11.0f) + (getMeasuredHeight() / 2);
        int i4 = 0;
        while (true) {
            int length = this.G.length;
            int i5 = this.n;
            int i6 = this.r;
            wjb wjbVar = this.P;
            Paint paint = this.b;
            if (i4 >= length) {
                int i7 = i6 + (this.h << 1);
                int i8 = this.f;
                float f5 = ((i7 + i8) * e) + i5 + (i8 / 2);
                int i9 = bkb.M6;
                paint.setColor(bm2.o(bkb.v0(i9, wjbVar), 80));
                float f6 = L;
                canvas2.drawCircle(f5, f6, gl.L(e2 * 12.0f), paint);
                paint.setColor(bkb.v0(i9, wjbVar));
                canvas2.drawCircle(f5, f6, gl.L(6.0f), paint);
                return;
            }
            int i10 = i6 + (this.h << 1);
            int i11 = this.f;
            int i12 = (i11 / i3) + ((i10 + i11) * i4) + i5;
            float f7 = i4;
            float f8 = f7 - e;
            boolean z2 = z;
            float max = Math.max(f3, f4 - Math.abs(f8));
            float a = moe.a((e - f7) + f4, f3, f4);
            int v0 = bkb.v0(bkb.L6, wjbVar);
            float f9 = f4;
            int v02 = bkb.v0(bkb.M6, wjbVar);
            int i13 = this.K;
            int i14 = i3;
            int f10 = bm2.f(a, v0, bkb.p1((i13 == Integer.MIN_VALUE || i4 > i13) ? f9 : 0.5f, v02));
            paint.setColor(f10);
            Paint paint2 = this.c;
            paint2.setColor(f10);
            float f11 = L;
            canvas2.drawCircle(i12, f11, gl.U1(max, this.f / 2, gl.L(6.0f)), paint);
            if (i4 != 0) {
                int i15 = (i12 - (this.f / 2)) - this.h;
                int i16 = this.r;
                int i17 = i15 - i16;
                f = 3.0f;
                int i18 = this.s;
                if (i18 == -1 || i4 - 1 < i18) {
                    i = i12;
                    float f12 = f8 - f9;
                    float a2 = moe.a(f9 - Math.abs(f12), 0.0f, f9);
                    int L2 = (int) (i16 - (gl.L(3.0f) * moe.a(f9 - Math.min(Math.abs(f8), Math.abs(f12)), 0.0f, f9)));
                    f9 = 1.0f;
                    canvas2 = canvas;
                    canvas2.drawRect((int) ((gl.L(3.0f) * a2) + i17), L - gl.L(1.0f), L2 + r2, gl.L(1.0f) + L, paint);
                } else {
                    int L3 = gl.L(3.0f) + i17;
                    int L4 = (i16 - gl.L(3.0f)) / gl.L(13.0f);
                    if (this.e != L4) {
                        i2 = L3;
                        i = i12;
                        float[] fArr = new float[i14];
                        fArr[z2 ? 1 : 0] = gl.L(6.0f);
                        fArr[1] = (r15 - (gl.L(8.0f) * L4)) / (L4 - 1);
                        paint2.setPathEffect(new DashPathEffect(fArr, 0.0f));
                        this.e = L4;
                    } else {
                        i2 = L3;
                        i = i12;
                    }
                    canvas2 = canvas;
                    canvas2.drawLine(gl.L(f9) + i2, f11, (i2 + r15) - gl.L(f9), f11, paint2);
                }
            } else {
                i = i12;
                f = 3.0f;
            }
            int i19 = this.H[i4];
            String str = this.G[i4];
            int f13 = bm2.f(max, bkb.v0(bkb.x6, wjbVar), bkb.v0(bkb.m6, wjbVar));
            TextPaint textPaint = this.d;
            textPaint.setColor(f13);
            if (this.I != null) {
                canvas2.save();
                if (i4 == 0) {
                    canvas2.translate(gl.L(12.0f), gl.L(15.5f));
                } else if (i4 == this.G.length - 1) {
                    canvas2.translate(((getMeasuredWidth() - i19) - gl.L(22.0f)) - gl.L(10.0f), gl.L(28.0f) - gl.L(12.5f));
                } else {
                    canvas2.translate((i - (i19 / 2)) - gl.L(10.0f), gl.L(28.0f) - gl.L(12.5f));
                }
                this.I[i4].setColorFilter(textPaint.getColor(), PorterDuff.Mode.MULTIPLY);
                this.I[i4].draw(canvas2);
                canvas2.restore();
                canvas2.save();
                f2 = 0.0f;
                canvas2.translate((this.I[i4].getIntrinsicWidth() / 2.0f) - gl.L(i4 == 0 ? f : 2.0f), 0.0f);
            } else {
                f2 = 0.0f;
            }
            if (i4 == 0) {
                canvas2.drawText(str, gl.L(22.0f), gl.L(28.0f), textPaint);
            } else if (i4 == this.G.length - 1) {
                canvas2.drawText(str, (getMeasuredWidth() - i19) - gl.L(22.0f), gl.L(28.0f), textPaint);
            } else {
                canvas2.drawText(str, i - (i19 / 2), gl.L(28.0f), textPaint);
            }
            if (this.I != null) {
                canvas2.restore();
            }
            i4++;
            f3 = f2;
            z = z2 ? 1 : 0;
            f4 = f9;
            i3 = 2;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.a.e(this, accessibilityNodeInfo);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(74.0f), TLObject.FLAG_30));
        this.f = gl.L(6.0f);
        this.h = gl.L(2.0f);
        this.n = gl.L(22.0f);
        int measuredWidth = getMeasuredWidth();
        int i3 = this.f;
        String[] strArr = this.G;
        this.r = (((measuredWidth - (i3 * strArr.length)) - ((strArr.length - 1) * (this.h << 1))) - (this.n << 1)) / Math.max(1, strArr.length - 1);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float a = moe.a(((this.f / 2.0f) + (x - this.n)) / ((this.r + (this.h << 1)) + r3), 0.0f, this.G.length - 1);
        boolean z = Math.abs(a - ((float) Math.round(a))) < 0.35f;
        if (z) {
            a = Math.round(a);
        }
        int i = this.K;
        if (i != Integer.MIN_VALUE) {
            a = Math.max(a, i);
        }
        if (motionEvent.getAction() == 0) {
            this.y = x;
            this.E = y;
            this.L = a;
            this.F = this.J;
            this.x = true;
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 2) {
            if (!this.w && Math.abs(this.y - x) > Math.abs(this.E - y)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.x && Math.abs(this.y - x) >= gl.e) {
                this.w = true;
                this.x = false;
            }
            if (this.w) {
                this.L = a;
                invalidate();
                if (Math.round(this.L) != this.J && z) {
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
            int i2 = this.J;
            if (i2 != this.F) {
                setOption(i2);
            }
        } else {
            this.L = a;
            if (motionEvent.getAction() == 1 && Math.round(this.L) != this.J) {
                setOption(Math.round(this.L));
            }
        }
        eja ejaVar = this.O;
        if (ejaVar != null) {
            ejaVar.n();
        }
        this.x = false;
        this.w = false;
        invalidate();
        getParent().requestDisallowInterceptTouchEvent(false);
        return true;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        return super.performAccessibilityAction(i, bundle) || this.a.g(this, i, bundle);
    }

    public void setCallback(eja ejaVar) {
        this.O = ejaVar;
    }

    public void setDashedFrom(int i) {
        this.s = i;
    }

    public void setMinAllowedIndex(int i) {
        String[] strArr;
        if (i != -1 && (strArr = this.G) != null) {
            i = Math.min(i, strArr.length - 1);
        }
        if (this.K != i) {
            this.K = i;
            if (this.J < i) {
                this.J = i;
            }
            invalidate();
        }
    }
}
