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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class hu extends View {
    public final org.telegram.ui.ActionBar.i6 E;
    public org.telegram.messenger.q10 F;
    public int G;
    public boolean H;
    public long I;
    public boolean J;
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
    public final c6 x;
    public final c6 y;

    public hu(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.a = org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 40.0f : 32.0f);
        this.b = new Drawable[11];
        this.n = new int[]{0, 0};
        this.r = new int[]{0, 0};
        this.s = new Paint(1);
        this.w = new RectF();
        lr lrVar = lr.h;
        this.x = new c6(this, 125L, lrVar);
        this.y = new c6(this, 125L, lrVar);
        this.G = -1;
        this.H = true;
        this.E = i6Var;
        this.c = getResources().getDrawable(R.drawable.stickers_back_all);
        this.d = getResources().getDrawable(R.drawable.stickers_back_arrow);
        a();
    }

    public final void a() {
        int i7 = org.telegram.ui.ActionBar.n6.h5;
        org.telegram.ui.ActionBar.i6 i6Var = this.E;
        org.telegram.ui.ActionBar.n6.C1(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), this.c);
        org.telegram.ui.ActionBar.n6.C1(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), this.d);
        org.telegram.messenger.j4.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ef, i6Var), PorterDuff.Mode.SRC_IN));
    }

    public String getEmoji() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        hu huVar = this;
        int measuredWidth = huVar.getMeasuredWidth();
        int measuredHeight = huVar.getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f);
        Drawable drawable = huVar.c;
        boolean z10 = 0;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int L = huVar.h - org.telegram.messenger.g0.L(9.0f);
        int measuredHeight2 = huVar.getMeasuredHeight() - org.telegram.messenger.g0.L(6.34f);
        int L2 = org.telegram.messenger.g0.L(9.0f) + huVar.h;
        int measuredHeight3 = huVar.getMeasuredHeight();
        Drawable drawable2 = huVar.d;
        drawable2.setBounds(L, measuredHeight2, L2, measuredHeight3);
        drawable2.draw(canvas);
        if (huVar.e != null) {
            boolean z11 = huVar.f;
            org.telegram.ui.ActionBar.i6 i6Var = huVar.E;
            int[] iArr = huVar.n;
            c6 c6Var = huVar.x;
            Paint paint = huVar.s;
            Drawable[] drawableArr = huVar.b;
            RectF rectF = huVar.w;
            float f10 = 1.0f;
            int i7 = huVar.a;
            if (!z11) {
                float e10 = c6Var.e(false, iArr[0]);
                int L3 = org.telegram.messenger.g0.L(5.0f);
                float f11 = L3;
                rectF.set((int) ((i7 * e10) + org.telegram.messenger.g0.L((e10 * 4.0f) + 5.0f)), f11, r3 + i7, L3 + i7);
                rectF.inset(org.telegram.messenger.g0.L(-2.0f), org.telegram.messenger.g0.L(-2.0f));
                paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i6, i6Var));
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
                float e11 = (i11 == 0 ? c6Var : huVar.y).e(z10, iArr[i11]);
                int i12 = z10;
                float max = Math.max(0.0f, Math.min(f10, -e11));
                rectF.set((int) ((i7 * (e11 + f10)) + org.telegram.messenger.g0.L((r6 * 4.0f) + (Math.max(0.0f, Math.min(f10, r6)) * 3.0f) + 5.0f)), org.telegram.messenger.g0.W1(max, ((org.telegram.messenger.g0.L(f10) + i7) * i11) + org.telegram.messenger.g0.L(3.0f), (huVar.getMeasuredHeight() - i7) / 2), r6 + i7, r9 + i7);
                rectF.inset(org.telegram.messenger.g0.L(-2.0f), org.telegram.messenger.g0.L(max * (-2.0f)));
                paint.setColor(org.telegram.ui.ActionBar.n6.r1(org.telegram.messenger.g0.T1(f10, 0.5f, max), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i6, i6Var)));
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
                huVar = this;
                z10 = i12;
            }
            char c10 = z10;
            drawableArr[c10].setBounds(org.telegram.messenger.g0.L(5.0f), (getMeasuredHeight() - i7) / 2, org.telegram.messenger.g0.L(5.0f) + i7, (getMeasuredHeight() + i7) / 2);
            drawableArr[c10].draw(canvas);
            canvas.drawRect(org.telegram.messenger.g0.L(8.45f) + i7, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(8.45f) + i7 + 1, getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.n6.k0);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        int i10;
        int i11;
        if (this.J) {
            this.J = false;
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
            if (drawableArr[i12].getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) || ((i11 = this.G) != -1 && ((i12 == 0 || ((i11 == 0 && i12 >= 1 && i12 <= 5) || (i11 == 1 && i12 >= 6 && i12 <= 10))) && ((int) motionEvent.getX()) >= drawableArr[i12].getBounds().left && ((int) motionEvent.getX()) <= drawableArr[i12].getBounds().right))) {
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
            this.G = -1;
            this.I = System.currentTimeMillis();
            this.H = iArr[0] == iArr[1];
        }
        int i13 = iArr[0];
        int[] iArr2 = this.r;
        iArr2[0] = i13;
        iArr2[1] = iArr[1];
        boolean z10 = System.currentTimeMillis() - this.I > 300 && motionEvent.getAction() == 2;
        if (i12 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
        } else if (i12 >= 1 && i12 <= 5 && ((i10 = this.G) == -1 || i10 == 0)) {
            this.G = 0;
            int i14 = i12 - 1;
            iArr[0] = i14;
            if (iArr[1] == -1 || (this.H && z10)) {
                iArr[1] = i14;
            }
        } else if (i12 >= 6 && i12 <= 10 && ((i7 = this.G) == -1 || i7 == 1)) {
            this.G = 1;
            int i15 = i12 - 6;
            iArr[1] = i15;
            if (iArr[0] == -1 || (this.H && z10)) {
                iArr[0] = i15;
            }
        }
        if (iArr2[0] != iArr[0] || iArr2[1] != iArr[1]) {
            org.telegram.messenger.g0.a4(this);
            org.telegram.messenger.q10 q10Var = this.F;
            if (q10Var != null) {
                q10Var.a(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
            }
        }
        invalidate();
        if (motionEvent.getAction() == 1) {
            this.G = -1;
        }
        return true;
    }

    public void setArrowX(int i7) {
        this.h = i7;
        invalidate();
    }

    public void setOnSelectionUpdateListener(org.telegram.messenger.q10 q10Var) {
        this.F = q10Var;
    }
}
