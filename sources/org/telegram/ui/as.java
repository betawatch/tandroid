package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class as extends LinearLayout {
    public final Paint a;
    public final Paint b;
    public float c;
    public boolean d;
    public boolean e;
    public ds[] f;

    public as(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int i10, int i11) {
        int i12;
        int i13;
        ds[] dsVarArr = this.f;
        int i14 = 0;
        if (dsVarArr == null || dsVarArr.length != i10) {
            if (dsVarArr != null) {
                for (ds dsVar : dsVarArr) {
                    removeView(dsVar);
                }
            }
            this.f = new ds[i10];
            int i15 = 0;
            while (i15 < i10) {
                this.f[i15] = new yr(this, getContext(), i15, i10);
                this.f[i15].setImeOptions(268435461);
                this.f[i15].setTextSize(1, 20.0f);
                this.f[i15].setMaxLines(1);
                this.f[i15].setTypeface(AndroidUtilities.bold());
                this.f[i15].setPadding(0, 0, 0, 0);
                this.f[i15].setGravity(17);
                if (i11 == 3) {
                    this.f[i15].setEnabled(false);
                    this.f[i15].setInputType(0);
                    this.f[i15].setVisibility(8);
                } else {
                    this.f[i15].setInputType(3);
                }
                int i16 = 10;
                if (i11 == 10) {
                    i12 = 42;
                    i13 = 47;
                } else if (i11 == 11) {
                    i16 = 5;
                    i12 = 28;
                    i13 = 34;
                } else {
                    i16 = 7;
                    i12 = 34;
                    i13 = 42;
                }
                addView(this.f[i15], k7.b6.t(i12, i13, 1, 0, 0, i15 != i10 + (-1) ? i16 : 0, 0));
                this.f[i15].addTextChangedListener(new zr(this, i15, i10));
                this.f[i15].setOnEditorActionListener(new ja(this, 3));
                i15++;
            }
            return;
        }
        while (true) {
            ds[] dsVarArr2 = this.f;
            if (i14 >= dsVarArr2.length) {
                return;
            }
            dsVarArr2[i14].setText("");
            i14++;
        }
    }

    public final void c(String str, boolean z4) {
        if (this.f == null) {
            return;
        }
        int i10 = 0;
        if (z4) {
            int i11 = 0;
            while (true) {
                ds[] dsVarArr = this.f;
                if (i11 >= dsVarArr.length) {
                    break;
                }
                if (dsVarArr[i11].isFocused()) {
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
            if (childAt instanceof ds) {
                ds dsVar = (ds) childAt;
                if (!this.e) {
                    if (childAt.isFocused()) {
                        dsVar.j(1.0f);
                    } else if (!childAt.isFocused()) {
                        dsVar.j(0.0f);
                    }
                }
                float successProgress = dsVar.getSuccessProgress();
                int d = i0.a.d(successProgress, i0.a.d(dsVar.getErrorProgress(), i0.a.d(dsVar.getFocusedProgress(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.l6, false)), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false)), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i7, false));
                Paint paint = this.a;
                paint.setColor(d);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f10 = this.c;
                rectF.inset(f10, f10);
                if (successProgress != 0.0f) {
                    float f11 = -Math.max(0.0f, (dsVar.getSuccessScaleProgress() - 1.0f) * this.c);
                    rectF.inset(f11, f11);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!(view instanceof ds)) {
            return super.drawChild(canvas, view, j10);
        }
        ds dsVar = (ds) view;
        canvas.save();
        float f10 = dsVar.v;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
        float f11 = this.c;
        rectF.inset(f11, f11);
        canvas.clipRect(rectF);
        if (dsVar.x) {
            float f12 = (f10 * 0.5f) + 0.5f;
            view.setAlpha(f10);
            canvas.scale(f12, f12, (dsVar.getMeasuredWidth() / 2.0f) + dsVar.getX(), (dsVar.getMeasuredHeight() / 2.0f) + dsVar.getY());
        } else {
            view.setAlpha(1.0f);
            canvas.translate(0.0f, (1.0f - f10) * view.getMeasuredHeight());
        }
        super.drawChild(canvas, view, j10);
        canvas.restore();
        float f13 = dsVar.w;
        if (f13 >= 1.0f) {
            return true;
        }
        canvas.save();
        float f14 = 1.0f - f13;
        float f15 = (f14 * 0.5f) + 0.5f;
        canvas.scale(f15, f15, (dsVar.getMeasuredWidth() / 2.0f) + dsVar.getX(), (dsVar.getMeasuredHeight() / 2.0f) + dsVar.getY());
        Paint paint = this.b;
        paint.setAlpha((int) (f14 * 255.0f));
        canvas.drawBitmap(dsVar.y, dsVar.getX(), dsVar.getY(), paint);
        canvas.restore();
        return true;
    }

    public String getCode() {
        if (this.f == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        while (true) {
            ds[] dsVarArr = this.f;
            if (i10 >= dsVarArr.length) {
                return sb.toString();
            }
            sb.append(se.b.d(dsVarArr[i10].getText().toString(), false));
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
