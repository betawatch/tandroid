package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class ar extends LinearLayout {
    public final Paint a;
    public final Paint b;
    public float c;
    public boolean d;
    public boolean e;
    public dr[] f;

    public ar(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        dr[] drVarArr = this.f;
        int i14 = 0;
        if (drVarArr == null || drVarArr.length != i7) {
            if (drVarArr != null) {
                for (dr drVar : drVarArr) {
                    removeView(drVar);
                }
            }
            this.f = new dr[i7];
            int i15 = 0;
            while (i15 < i7) {
                this.f[i15] = new yq(this, getContext(), i15, i7);
                this.f[i15].setImeOptions(268435461);
                this.f[i15].setTextSize(1, 20.0f);
                this.f[i15].setMaxLines(1);
                this.f[i15].setTypeface(org.telegram.messenger.g0.o());
                this.f[i15].setPadding(0, 0, 0, 0);
                this.f[i15].setGravity(17);
                if (i10 == 3) {
                    this.f[i15].setEnabled(false);
                    this.f[i15].setInputType(0);
                    this.f[i15].setVisibility(8);
                } else {
                    this.f[i15].setInputType(3);
                }
                int i16 = 42;
                int i17 = 10;
                if (i10 == 10) {
                    i11 = 47;
                } else {
                    i11 = 34;
                    if (i10 == 11) {
                        i16 = 28;
                        i17 = 5;
                    } else {
                        i17 = 7;
                        i12 = 42;
                        i13 = 34;
                        addView(this.f[i15], c8.ha.t(i13, i12, 1, 0, 0, i15 == i7 + (-1) ? i17 : 0, 0));
                        this.f[i15].addTextChangedListener(new zq(this, i15, i7));
                        this.f[i15].setOnEditorActionListener(new fa(this, 3));
                        i15++;
                    }
                }
                i13 = i16;
                i12 = i11;
                addView(this.f[i15], c8.ha.t(i13, i12, 1, 0, 0, i15 == i7 + (-1) ? i17 : 0, 0));
                this.f[i15].addTextChangedListener(new zq(this, i15, i7));
                this.f[i15].setOnEditorActionListener(new fa(this, 3));
                i15++;
            }
            return;
        }
        while (true) {
            dr[] drVarArr2 = this.f;
            if (i14 >= drVarArr2.length) {
                return;
            }
            drVarArr2[i14].setText("");
            i14++;
        }
    }

    public final void c(String str, boolean z9) {
        if (this.f == null) {
            return;
        }
        int i7 = 0;
        if (z9) {
            int i10 = 0;
            while (true) {
                dr[] drVarArr = this.f;
                if (i10 >= drVarArr.length) {
                    break;
                }
                if (drVarArr[i10].isFocused()) {
                    i7 = i10;
                    break;
                }
                i10++;
            }
        }
        for (int i11 = i7; i11 < Math.min(this.f.length, str.length() + i7); i11++) {
            this.f[i11].setText(Character.toString(str.charAt(i11 - i7)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof dr) {
                dr drVar = (dr) childAt;
                if (!this.e) {
                    if (childAt.isFocused()) {
                        drVar.A(1.0f);
                    } else if (!childAt.isFocused()) {
                        drVar.A(0.0f);
                    }
                }
                float successProgress = drVar.getSuccessProgress();
                int f10 = i0.a.f(successProgress, i0.a.f(drVar.getErrorProgress(), i0.a.f(drVar.getFocusedProgress(), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.k6, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.l6, false)), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.q7, false)), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.i7, false));
                Paint paint = this.a;
                paint.setColor(f10);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f11 = this.c;
                rectF.inset(f11, f11);
                if (successProgress != 0.0f) {
                    float f12 = -Math.max(0.0f, (drVar.getSuccessScaleProgress() - 1.0f) * this.c);
                    rectF.inset(f12, f12);
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!(view instanceof dr)) {
            return super.drawChild(canvas, view, j3);
        }
        dr drVar = (dr) view;
        canvas.save();
        float f10 = drVar.P1;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
        float f11 = this.c;
        rectF.inset(f11, f11);
        canvas.clipRect(rectF);
        if (drVar.R1) {
            float f12 = (f10 * 0.5f) + 0.5f;
            view.setAlpha(f10);
            canvas.scale(f12, f12, (drVar.getMeasuredWidth() / 2.0f) + drVar.getX(), (drVar.getMeasuredHeight() / 2.0f) + drVar.getY());
        } else {
            view.setAlpha(1.0f);
            canvas.translate(0.0f, (1.0f - f10) * view.getMeasuredHeight());
        }
        super.drawChild(canvas, view, j3);
        canvas.restore();
        float f13 = drVar.Q1;
        if (f13 >= 1.0f) {
            return true;
        }
        canvas.save();
        float f14 = 1.0f - f13;
        float f15 = (f14 * 0.5f) + 0.5f;
        canvas.scale(f15, f15, (drVar.getMeasuredWidth() / 2.0f) + drVar.getX(), (drVar.getMeasuredHeight() / 2.0f) + drVar.getY());
        Paint paint = this.b;
        paint.setAlpha((int) (f14 * 255.0f));
        canvas.drawBitmap(drVar.S1, drVar.getX(), drVar.getY(), paint);
        canvas.restore();
        return true;
    }

    public String getCode() {
        if (this.f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i7 = 0;
        while (true) {
            dr[] drVarArr = this.f;
            if (i7 >= drVarArr.length) {
                return sb2.toString();
            }
            sb2.append(pf.b.d(drVarArr[i7].getText().toString(), false));
            i7++;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        float L = org.telegram.messenger.g0.L(1.5f);
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
