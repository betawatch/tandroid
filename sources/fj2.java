// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class fj2 extends LinearLayout {
    public final Paint a;
    public final Paint b;
    public float c;
    public boolean d;
    public boolean e;
    public sj2[] f;

    public fj2(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        sj2[] sj2VarArr = this.f;
        int i6 = 0;
        if (sj2VarArr != null) {
            if (sj2VarArr.length != i) {
                for (sj2 sj2Var : sj2VarArr) {
                    removeView(sj2Var);
                }
            } else {
                while (true) {
                    sj2[] sj2VarArr2 = this.f;
                    if (i6 >= sj2VarArr2.length) {
                        return;
                    }
                    sj2VarArr2[i6].setText("");
                    i6++;
                }
            }
        }
        this.f = new sj2[i];
        int i7 = 0;
        while (i7 < i) {
            this.f[i7] = new dj2(this, getContext(), i7, i);
            this.f[i7].setImeOptions(268435461);
            this.f[i7].setTextSize(1, 20.0f);
            this.f[i7].setMaxLines(1);
            this.f[i7].setTypeface(gl.o());
            this.f[i7].setPadding(0, 0, 0, 0);
            this.f[i7].setGravity(17);
            sj2[] sj2VarArr3 = this.f;
            if (i2 == 3) {
                sj2VarArr3[i7].setEnabled(false);
                this.f[i7].setInputType(0);
                this.f[i7].setVisibility(8);
            } else {
                sj2VarArr3[i7].setInputType(3);
            }
            int i8 = 42;
            int i9 = 10;
            if (i2 == 10) {
                i3 = 47;
            } else {
                i3 = 34;
                if (i2 == 11) {
                    i8 = 28;
                    i9 = 5;
                } else {
                    i9 = 7;
                    i4 = 42;
                    i5 = 34;
                    addView(this.f[i7], nme.t(i5, i4, 1, 0, 0, i7 == i + (-1) ? i9 : 0, 0));
                    this.f[i7].addTextChangedListener(new ej2(this, i7, i));
                    this.f[i7].setOnEditorActionListener(new j(this, (byte) 9));
                    i7++;
                }
            }
            i5 = i8;
            i4 = i3;
            addView(this.f[i7], nme.t(i5, i4, 1, 0, 0, i7 == i + (-1) ? i9 : 0, 0));
            this.f[i7].addTextChangedListener(new ej2(this, i7, i));
            this.f[i7].setOnEditorActionListener(new j(this, (byte) 9));
            i7++;
        }
    }

    public final void c(String str, boolean z) {
        if (this.f != null) {
            int i = 0;
            if (z) {
                int i2 = 0;
                while (true) {
                    sj2[] sj2VarArr = this.f;
                    if (i2 >= sj2VarArr.length) {
                        break;
                    }
                    if (sj2VarArr[i2].isFocused()) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
            }
            for (int i3 = i; i3 < Math.min(this.f.length, str.length() + i); i3++) {
                this.f[i3].setText(Character.toString(str.charAt(i3 - i)));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof sj2) {
                sj2 sj2Var = (sj2) childAt;
                if (!this.e) {
                    if (childAt.isFocused()) {
                        sj2Var.B(1.0f);
                    } else if (!childAt.isFocused()) {
                        sj2Var.B(0.0f);
                    }
                }
                float successProgress = sj2Var.getSuccessProgress();
                int f = bm2.f(successProgress, bm2.f(sj2Var.getErrorProgress(), bm2.f(sj2Var.getFocusedProgress(), bkb.w0(null, bkb.j6, false), bkb.w0(null, bkb.k6, false)), bkb.w0(null, bkb.p7, false)), bkb.w0(null, bkb.h7, false));
                Paint paint = this.a;
                paint.setColor(f);
                RectF rectF = gl.P;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f2 = this.c;
                rectF.inset(f2, f2);
                if (successProgress != 0.0f) {
                    float f3 = -Math.max(0.0f, (sj2Var.getSuccessScaleProgress() - 1.0f) * this.c);
                    rectF.inset(f3, f3);
                }
                canvas.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (!(view instanceof sj2)) {
            return super.drawChild(canvas, view, j);
        }
        sj2 sj2Var = (sj2) view;
        canvas.save();
        float f = sj2Var.V1;
        RectF rectF = gl.P;
        rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
        float f2 = this.c;
        rectF.inset(f2, f2);
        canvas.clipRect(rectF);
        if (sj2Var.X1) {
            float f3 = (f * 0.5f) + 0.5f;
            view.setAlpha(f);
            canvas.scale(f3, f3, (sj2Var.getMeasuredWidth() / 2.0f) + sj2Var.getX(), (sj2Var.getMeasuredHeight() / 2.0f) + sj2Var.getY());
        } else {
            view.setAlpha(1.0f);
            canvas.translate(0.0f, (1.0f - f) * view.getMeasuredHeight());
        }
        super.drawChild(canvas, view, j);
        canvas.restore();
        float f4 = sj2Var.W1;
        if (f4 >= 1.0f) {
            return true;
        }
        canvas.save();
        float f5 = 1.0f - f4;
        float f6 = (f5 * 0.5f) + 0.5f;
        canvas.scale(f6, f6, (sj2Var.getMeasuredWidth() / 2.0f) + sj2Var.getX(), (sj2Var.getMeasuredHeight() / 2.0f) + sj2Var.getY());
        Paint paint = this.b;
        paint.setAlpha((int) (f5 * 255.0f));
        canvas.drawBitmap(sj2Var.Y1, sj2Var.getX(), sj2Var.getY(), paint);
        canvas.restore();
        return true;
    }

    public String getCode() {
        if (this.f == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            sj2[] sj2VarArr = this.f;
            if (i >= sj2VarArr.length) {
                return sb.toString();
            }
            sb.append(p38.h(sj2VarArr[i].getText().toString(), false));
            i++;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float L = gl.L(1.5f);
        this.c = L;
        this.a.setStrokeWidth(L);
    }

    public void setCode(String str) {
        this.f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
