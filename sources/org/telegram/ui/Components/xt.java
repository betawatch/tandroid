package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class xt extends View {
    public final org.telegram.ui.ActionBar.f6 D;
    public org.telegram.messenger.v10 E;
    public int F;
    public boolean G;
    public long H;
    public boolean I;
    public final int a;
    public final Drawable[] b;
    public final Drawable c;
    public final Drawable d;
    public String e;
    public boolean f;
    public int h;
    public final int[] n;
    public final int[] r;
    public final Paint s;
    public final RectF w;
    public final w5 x;
    public final w5 y;

    public xt(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 40.0f : 32.0f);
        this.b = new Drawable[11];
        this.n = new int[]{0, 0};
        this.r = new int[]{0, 0};
        this.s = new Paint(1);
        this.w = new RectF();
        xq xqVar = xq.h;
        this.x = new w5(this, 125L, xqVar);
        this.y = new w5(this, 125L, xqVar);
        this.F = -1;
        this.G = true;
        this.D = f6Var;
        this.c = getResources().getDrawable(R.drawable.stickers_back_all);
        this.d = getResources().getDrawable(R.drawable.stickers_back_arrow);
        a();
    }

    public final void a() {
        int i7 = org.telegram.ui.ActionBar.k6.h5;
        org.telegram.ui.ActionBar.f6 f6Var = this.D;
        org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(i7, f6Var), this.c);
        org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(i7, f6Var), this.d);
        org.telegram.messenger.h4.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, f6Var), PorterDuff.Mode.SRC_IN));
    }

    public String getEmoji() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        xt xtVar = this;
        int measuredWidth = xtVar.getMeasuredWidth();
        int measuredHeight = xtVar.getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f);
        Drawable drawable = xtVar.c;
        boolean z9 = 0;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int L = xtVar.h - org.telegram.messenger.g0.L(9.0f);
        int measuredHeight2 = xtVar.getMeasuredHeight() - org.telegram.messenger.g0.L(6.34f);
        int L2 = org.telegram.messenger.g0.L(9.0f) + xtVar.h;
        int measuredHeight3 = xtVar.getMeasuredHeight();
        Drawable drawable2 = xtVar.d;
        drawable2.setBounds(L, measuredHeight2, L2, measuredHeight3);
        drawable2.draw(canvas);
        if (xtVar.e != null) {
            boolean z10 = xtVar.f;
            org.telegram.ui.ActionBar.f6 f6Var = xtVar.D;
            int[] iArr = xtVar.n;
            w5 w5Var = xtVar.x;
            Paint paint = xtVar.s;
            Drawable[] drawableArr = xtVar.b;
            RectF rectF = xtVar.w;
            float f10 = 1.0f;
            int i7 = xtVar.a;
            if (!z10) {
                float e10 = w5Var.e(false, iArr[0]);
                int L3 = org.telegram.messenger.g0.L(5.0f);
                float f11 = L3;
                rectF.set((int) ((i7 * e10) + org.telegram.messenger.g0.L((e10 * 4.0f) + 5.0f)), f11, r3 + i7, L3 + i7);
                rectF.inset(org.telegram.messenger.g0.L(-2.0f), org.telegram.messenger.g0.L(-2.0f));
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, f6Var));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                for (int i10 = 0; i10 < 6; i10++) {
                    Drawable drawable3 = drawableArr[i10];
                    if (drawable3 != null) {
                        int L4 = org.telegram.messenger.g0.L((i10 * 4) + 5) + (i7 * i10);
                        float min = ((1.0f - (Math.min(0.5f, Math.abs(i10 - e10)) * 2.0f)) * 0.1f) + 0.9f;
                        canvas.save();
                        canvas.scale(min, min, (i7 / 2.0f) + L4, (i7 / 2.0f) + f11);
                        drawable3.setBounds(L4, L3, L4 + i7, L3 + i7);
                        drawable3.draw(canvas);
                        canvas.restore();
                    }
                }
                return;
            }
            int i11 = 0;
            while (i11 < 2) {
                float e11 = (i11 == 0 ? w5Var : xtVar.y).e(z9, iArr[i11]);
                int i12 = z9;
                float max = Math.max(0.0f, Math.min(f10, -e11));
                rectF.set((int) ((i7 * (e11 + f10)) + org.telegram.messenger.g0.L((r6 * 4.0f) + (Math.max(0.0f, Math.min(f10, r6)) * 3.0f) + 5.0f)), org.telegram.messenger.g0.W1(max, ((org.telegram.messenger.g0.L(f10) + i7) * i11) + org.telegram.messenger.g0.L(3.0f), (xtVar.getMeasuredHeight() - i7) / 2), r6 + i7, r9 + i7);
                rectF.inset(org.telegram.messenger.g0.L(-2.0f), org.telegram.messenger.g0.L(max * (-2.0f)));
                paint.setColor(org.telegram.ui.ActionBar.k6.r1(org.telegram.messenger.g0.T1(f10, 0.5f, max), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, f6Var)));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                int i13 = i12;
                while (i13 < 5) {
                    i13++;
                    int i14 = (i11 * 5) + i13;
                    int L5 = org.telegram.messenger.g0.L((i13 * 4) + 8) + (i7 * i13);
                    int L6 = ((org.telegram.messenger.g0.L(f10) + i7) * i11) + org.telegram.messenger.g0.L(3.0f);
                    drawableArr[i14].setBounds(L5, L6, L5 + i7, L6 + i7);
                    drawableArr[i14].draw(canvas);
                    f10 = f10;
                }
                i11++;
                xtVar = this;
                z9 = i12;
            }
            char c10 = z9;
            drawableArr[c10].setBounds(org.telegram.messenger.g0.L(5.0f), (getMeasuredHeight() - i7) / 2, org.telegram.messenger.g0.L(5.0f) + i7, (getMeasuredHeight() + i7) / 2);
            drawableArr[c10].draw(canvas);
            canvas.drawRect(org.telegram.messenger.g0.L(8.45f) + i7, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(8.45f) + i7 + 1, getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        int i10;
        int i11;
        if (this.I) {
            this.I = false;
            return false;
        }
        if (!this.f) {
            return super.onTouchEvent(motionEvent);
        }
        int i12 = 0;
        while (true) {
            Drawable[] drawableArr = this.b;
            if (i12 >= drawableArr.length) {
                i12 = -1;
                break;
            }
            if (drawableArr[i12].getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) || ((i11 = this.F) != -1 && ((i12 == 0 || ((i11 == 0 && i12 >= 1 && i12 <= 5) || (i11 == 1 && i12 >= 6 && i12 <= 10))) && ((int) motionEvent.getX()) >= drawableArr[i12].getBounds().left && ((int) motionEvent.getX()) <= drawableArr[i12].getBounds().right))) {
                break;
            }
            i12++;
        }
        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2 && motionEvent.getAction() != 1) {
            return false;
        }
        int action = motionEvent.getAction();
        int[] iArr = this.n;
        if (action == 0) {
            this.F = -1;
            this.H = System.currentTimeMillis();
            this.G = iArr[0] == iArr[1];
        }
        int i13 = iArr[0];
        int[] iArr2 = this.r;
        iArr2[0] = i13;
        iArr2[1] = iArr[1];
        boolean z9 = System.currentTimeMillis() - this.H > 300 && motionEvent.getAction() == 2;
        if (i12 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
        } else if (i12 >= 1 && i12 <= 5 && ((i10 = this.F) == -1 || i10 == 0)) {
            this.F = 0;
            int i14 = i12 - 1;
            iArr[0] = i14;
            if (iArr[1] == -1 || (this.G && z9)) {
                iArr[1] = i14;
            }
        } else if (i12 >= 6 && i12 <= 10 && ((i7 = this.F) == -1 || i7 == 1)) {
            this.F = 1;
            int i15 = i12 - 6;
            iArr[1] = i15;
            if (iArr[0] == -1 || (this.G && z9)) {
                iArr[0] = i15;
            }
        }
        if (iArr2[0] != iArr[0] || iArr2[1] != iArr[1]) {
            org.telegram.messenger.g0.c4(this);
            org.telegram.messenger.v10 v10Var = this.E;
            if (v10Var != null) {
                v10Var.a(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
            }
        }
        invalidate();
        if (motionEvent.getAction() == 1) {
            this.F = -1;
        }
        return true;
    }

    public void setArrowX(int i7) {
        this.h = i7;
        invalidate();
    }

    public void setOnSelectionUpdateListener(org.telegram.messenger.v10 v10Var) {
        this.E = v10Var;
    }
}
