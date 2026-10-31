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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class iu extends View {
    public final org.telegram.ui.ActionBar.p6 D;
    public org.telegram.messenger.j20 E;
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
    public final t5 x;
    public final t5 y;

    public iu(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = org.telegram.messenger.i0.L(org.telegram.messenger.i0.Q1() ? 40.0f : 32.0f);
        this.b = new Drawable[11];
        this.n = new int[]{0, 0};
        this.r = new int[]{0, 0};
        this.s = new Paint(1);
        this.w = new RectF();
        gr grVar = gr.h;
        this.x = new t5(this, 125L, grVar);
        this.y = new t5(this, 125L, grVar);
        this.F = -1;
        this.G = true;
        this.D = p6Var;
        this.c = getResources().getDrawable(R.drawable.stickers_back_all);
        this.d = getResources().getDrawable(R.drawable.stickers_back_arrow);
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.t6.h5;
        org.telegram.ui.ActionBar.p6 p6Var = this.D;
        org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), this.c);
        org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), this.d);
        org.telegram.messenger.k4.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Bf, p6Var), PorterDuff.Mode.SRC_IN));
    }

    public String getEmoji() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        iu iuVar = this;
        int measuredWidth = iuVar.getMeasuredWidth();
        int measuredHeight = iuVar.getMeasuredHeight() - org.telegram.messenger.i0.L(2.0f);
        Drawable drawable = iuVar.c;
        boolean z10 = 0;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int L = iuVar.h - org.telegram.messenger.i0.L(9.0f);
        int measuredHeight2 = iuVar.getMeasuredHeight() - org.telegram.messenger.i0.L(6.34f);
        int L2 = org.telegram.messenger.i0.L(9.0f) + iuVar.h;
        int measuredHeight3 = iuVar.getMeasuredHeight();
        Drawable drawable2 = iuVar.d;
        drawable2.setBounds(L, measuredHeight2, L2, measuredHeight3);
        drawable2.draw(canvas);
        if (iuVar.e != null) {
            boolean z11 = iuVar.f;
            org.telegram.ui.ActionBar.p6 p6Var = iuVar.D;
            int[] iArr = iuVar.n;
            t5 t5Var = iuVar.x;
            Paint paint = iuVar.s;
            Drawable[] drawableArr = iuVar.b;
            RectF rectF = iuVar.w;
            float f7 = 1.0f;
            int i10 = iuVar.a;
            if (!z11) {
                float e = t5Var.e(false, iArr[0]);
                int L3 = org.telegram.messenger.i0.L(5.0f);
                float f10 = L3;
                rectF.set((int) ((i10 * e) + org.telegram.messenger.i0.L((e * 4.0f) + 5.0f)), f10, r3 + i10, L3 + i10);
                rectF.inset(org.telegram.messenger.i0.L(-2.0f), org.telegram.messenger.i0.L(-2.0f));
                paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, p6Var));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint);
                for (int i11 = 0; i11 < 6; i11++) {
                    Drawable drawable3 = drawableArr[i11];
                    if (drawable3 != null) {
                        int L4 = org.telegram.messenger.i0.L((i11 * 4) + 5) + (i10 * i11);
                        float min = ((1.0f - (Math.min(0.5f, Math.abs(i11 - e)) * 2.0f)) * 0.1f) + 0.9f;
                        canvas.save();
                        canvas.scale(min, min, (i10 / 2.0f) + L4, (i10 / 2.0f) + f10);
                        drawable3.setBounds(L4, L3, L4 + i10, L3 + i10);
                        drawable3.draw(canvas);
                        canvas.restore();
                    }
                }
                return;
            }
            int i12 = 0;
            while (i12 < 2) {
                float e7 = (i12 == 0 ? t5Var : iuVar.y).e(z10, iArr[i12]);
                int i13 = z10;
                float max = Math.max(0.0f, Math.min(f7, -e7));
                rectF.set((int) ((i10 * (e7 + f7)) + org.telegram.messenger.i0.L((r6 * 4.0f) + (Math.max(0.0f, Math.min(f7, r6)) * 3.0f) + 5.0f)), org.telegram.messenger.i0.W1(max, ((org.telegram.messenger.i0.L(f7) + i10) * i12) + org.telegram.messenger.i0.L(3.0f), (iuVar.getMeasuredHeight() - i10) / 2), r6 + i10, r9 + i10);
                rectF.inset(org.telegram.messenger.i0.L(-2.0f), org.telegram.messenger.i0.L(max * (-2.0f)));
                paint.setColor(org.telegram.ui.ActionBar.t6.r1(org.telegram.messenger.i0.T1(f7, 0.5f, max), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, p6Var)));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint);
                int i14 = i13;
                while (i14 < 5) {
                    i14++;
                    int i15 = (i12 * 5) + i14;
                    int L5 = org.telegram.messenger.i0.L((i14 * 4) + 8) + (i10 * i14);
                    int L6 = ((org.telegram.messenger.i0.L(f7) + i10) * i12) + org.telegram.messenger.i0.L(3.0f);
                    drawableArr[i15].setBounds(L5, L6, L5 + i10, L6 + i10);
                    drawableArr[i15].draw(canvas);
                    f7 = f7;
                }
                i12++;
                iuVar = this;
                z10 = i13;
            }
            char c10 = z10;
            drawableArr[c10].setBounds(org.telegram.messenger.i0.L(5.0f), (getMeasuredHeight() - i10) / 2, org.telegram.messenger.i0.L(5.0f) + i10, (getMeasuredHeight() + i10) / 2);
            drawableArr[c10].draw(canvas);
            canvas.drawRect(org.telegram.messenger.i0.L(8.45f) + i10, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(8.45f) + i10 + 1, getMeasuredHeight() - org.telegram.messenger.i0.L(6.0f), org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        int i11;
        int i12;
        if (this.I) {
            this.I = false;
            return false;
        }
        if (!this.f) {
            return super.onTouchEvent(motionEvent);
        }
        int i13 = 0;
        while (true) {
            Drawable[] drawableArr = this.b;
            if (i13 >= drawableArr.length) {
                i13 = -1;
                break;
            }
            if (drawableArr[i13].getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) || ((i12 = this.F) != -1 && ((i13 == 0 || ((i12 == 0 && i13 >= 1 && i13 <= 5) || (i12 == 1 && i13 >= 6 && i13 <= 10))) && ((int) motionEvent.getX()) >= drawableArr[i13].getBounds().left && ((int) motionEvent.getX()) <= drawableArr[i13].getBounds().right))) {
                break;
            }
            i13++;
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
        int i14 = iArr[0];
        int[] iArr2 = this.r;
        iArr2[0] = i14;
        iArr2[1] = iArr[1];
        boolean z10 = System.currentTimeMillis() - this.H > 300 && motionEvent.getAction() == 2;
        if (i13 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
        } else if (i13 >= 1 && i13 <= 5 && ((i11 = this.F) == -1 || i11 == 0)) {
            this.F = 0;
            int i15 = i13 - 1;
            iArr[0] = i15;
            if (iArr[1] == -1 || (this.G && z10)) {
                iArr[1] = i15;
            }
        } else if (i13 >= 6 && i13 <= 10 && ((i10 = this.F) == -1 || i10 == 1)) {
            this.F = 1;
            int i16 = i13 - 6;
            iArr[1] = i16;
            if (iArr[0] == -1 || (this.G && z10)) {
                iArr[0] = i16;
            }
        }
        if (iArr2[0] != iArr[0] || iArr2[1] != iArr[1]) {
            org.telegram.messenger.i0.b4(this);
            org.telegram.messenger.j20 j20Var = this.E;
            if (j20Var != null) {
                j20Var.a(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
            }
        }
        invalidate();
        if (motionEvent.getAction() == 1) {
            this.F = -1;
        }
        return true;
    }

    public void setArrowX(int i10) {
        this.h = i10;
        invalidate();
    }

    public void setOnSelectionUpdateListener(org.telegram.messenger.j20 j20Var) {
        this.E = j20Var;
    }
}
