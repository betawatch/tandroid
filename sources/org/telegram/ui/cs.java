package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class cs extends LinearLayout {
    public final Paint a;
    public final Paint b;
    public float c;
    public boolean d;
    public boolean e;
    public es[] f;

    public cs(Context context) {
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
    public final void b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        es[] esVarArr = this.f;
        int i15 = 0;
        if (esVarArr == null || esVarArr.length != i10) {
            if (esVarArr != null) {
                for (es esVar : esVarArr) {
                    removeView(esVar);
                }
            }
            this.f = new es[i10];
            int i16 = 0;
            while (i16 < i10) {
                this.f[i16] = new as(this, getContext(), i16, i10);
                this.f[i16].setImeOptions(268435461);
                this.f[i16].setTextSize(1, 20.0f);
                this.f[i16].setMaxLines(1);
                this.f[i16].setTypeface(AndroidUtilities.bold());
                this.f[i16].setPadding(0, 0, 0, 0);
                this.f[i16].setGravity(17);
                if (i11 == 3) {
                    this.f[i16].setEnabled(false);
                    this.f[i16].setInputType(0);
                    this.f[i16].setVisibility(8);
                } else {
                    this.f[i16].setInputType(3);
                }
                int i17 = 42;
                int i18 = 10;
                if (i11 == 10) {
                    i12 = 47;
                } else {
                    i12 = 34;
                    if (i11 == 11) {
                        i17 = 28;
                        i18 = 5;
                    } else {
                        i18 = 7;
                        i13 = 42;
                        i14 = 34;
                        addView(this.f[i16], w7.x5.t(i14, i13, 1, 0, 0, i16 == i10 + (-1) ? i18 : 0, 0));
                        this.f[i16].addTextChangedListener(new bs(this, i16, i10));
                        this.f[i16].setOnEditorActionListener(new ja(this, 3));
                        i16++;
                    }
                }
                i14 = i17;
                i13 = i12;
                addView(this.f[i16], w7.x5.t(i14, i13, 1, 0, 0, i16 == i10 + (-1) ? i18 : 0, 0));
                this.f[i16].addTextChangedListener(new bs(this, i16, i10));
                this.f[i16].setOnEditorActionListener(new ja(this, 3));
                i16++;
            }
            return;
        }
        while (true) {
            es[] esVarArr2 = this.f;
            if (i15 >= esVarArr2.length) {
                return;
            }
            esVarArr2[i15].setText("");
            i15++;
        }
    }

    public final void c(String str, boolean z10) {
        if (this.f == null) {
            return;
        }
        int i10 = 0;
        if (z10) {
            int i11 = 0;
            while (true) {
                es[] esVarArr = this.f;
                if (i11 >= esVarArr.length) {
                    break;
                }
                if (esVarArr[i11].isFocused()) {
                    i10 = i11;
                    break;
                }
                i11++;
            }
        }
        for (int i12 = i10; i12 < Math.min(this.f.length, str.length() + i10); i12++) {
            this.f[i12].setText(Character.toString(str.charAt(i12 - i10)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof es) {
                es esVar = (es) childAt;
                if (!this.e) {
                    if (childAt.isFocused()) {
                        esVar.j(1.0f);
                    } else if (!childAt.isFocused()) {
                        esVar.j(0.0f);
                    }
                }
                float successProgress = esVar.getSuccessProgress();
                int d = i0.a.d(successProgress, i0.a.d(esVar.getErrorProgress(), i0.a.d(esVar.getFocusedProgress(), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.k6, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.l6, false)), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false)), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.i7, false));
                Paint paint = this.a;
                paint.setColor(d);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f7 = this.c;
                rectF.inset(f7, f7);
                if (successProgress != 0.0f) {
                    float f10 = -Math.max(0.0f, (esVar.getSuccessScaleProgress() - 1.0f) * this.c);
                    rectF.inset(f10, f10);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!(view instanceof es)) {
            return super.drawChild(canvas, view, j3);
        }
        es esVar = (es) view;
        canvas.save();
        float f7 = esVar.v;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
        float f10 = this.c;
        rectF.inset(f10, f10);
        canvas.clipRect(rectF);
        if (esVar.x) {
            float f11 = (f7 * 0.5f) + 0.5f;
            view.setAlpha(f7);
            canvas.scale(f11, f11, (esVar.getMeasuredWidth() / 2.0f) + esVar.getX(), (esVar.getMeasuredHeight() / 2.0f) + esVar.getY());
        } else {
            view.setAlpha(1.0f);
            canvas.translate(0.0f, (1.0f - f7) * view.getMeasuredHeight());
        }
        super.drawChild(canvas, view, j3);
        canvas.restore();
        float f12 = esVar.w;
        if (f12 >= 1.0f) {
            return true;
        }
        canvas.save();
        float f13 = 1.0f - f12;
        float f14 = (f13 * 0.5f) + 0.5f;
        canvas.scale(f14, f14, (esVar.getMeasuredWidth() / 2.0f) + esVar.getX(), (esVar.getMeasuredHeight() / 2.0f) + esVar.getY());
        Paint paint = this.b;
        paint.setAlpha((int) (f13 * 255.0f));
        canvas.drawBitmap(esVar.y, esVar.getX(), esVar.getY(), paint);
        canvas.restore();
        return true;
    }

    public String getCode() {
        if (this.f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            es[] esVarArr = this.f;
            if (i10 >= esVarArr.length) {
                return sb2.toString();
            }
            sb2.append(hf.b.d(esVarArr[i10].getText().toString(), false));
            i10++;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float dp = AndroidUtilities.dp(1.5f);
        this.c = dp;
        this.a.setStrokeWidth(dp);
    }

    public void setCode(String str) {
        this.f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
