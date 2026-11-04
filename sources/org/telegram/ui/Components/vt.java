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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vt extends View {
    public final org.telegram.ui.ActionBar.e6 E;
    public org.telegram.messenger.n10 F;
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
    public final u5 x;
    public final u5 y;

    public vt(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 40.0f : 32.0f);
        this.b = new Drawable[11];
        this.n = new int[]{0, 0};
        this.r = new int[]{0, 0};
        this.s = new Paint(1);
        this.w = new RectF();
        xq xqVar = xq.h;
        this.x = new u5(this, 125L, xqVar);
        this.y = new u5(this, 125L, xqVar);
        this.G = -1;
        this.H = true;
        this.E = e6Var;
        this.c = getResources().getDrawable(R.drawable.stickers_back_all);
        this.d = getResources().getDrawable(R.drawable.stickers_back_arrow);
        a();
    }

    public final void a() {
        int i3 = org.telegram.ui.ActionBar.k6.h5;
        org.telegram.ui.ActionBar.e6 e6Var = this.E;
        org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), this.c);
        org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(i3, e6Var), this.d);
        org.telegram.messenger.h4.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, e6Var), PorterDuff.Mode.SRC_IN));
    }

    public String getEmoji() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        vt vtVar = this;
        int measuredWidth = vtVar.getMeasuredWidth();
        int measuredHeight = vtVar.getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f);
        Drawable drawable = vtVar.c;
        boolean z10 = 0;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int L = vtVar.h - org.telegram.messenger.g0.L(9.0f);
        int measuredHeight2 = vtVar.getMeasuredHeight() - org.telegram.messenger.g0.L(6.34f);
        int L2 = org.telegram.messenger.g0.L(9.0f) + vtVar.h;
        int measuredHeight3 = vtVar.getMeasuredHeight();
        Drawable drawable2 = vtVar.d;
        drawable2.setBounds(L, measuredHeight2, L2, measuredHeight3);
        drawable2.draw(canvas);
        if (vtVar.e != null) {
            boolean z11 = vtVar.f;
            org.telegram.ui.ActionBar.e6 e6Var = vtVar.E;
            int[] iArr = vtVar.n;
            u5 u5Var = vtVar.x;
            Paint paint = vtVar.s;
            Drawable[] drawableArr = vtVar.b;
            RectF rectF = vtVar.w;
            float f10 = 1.0f;
            int i3 = vtVar.a;
            if (!z11) {
                float e10 = u5Var.e(false, iArr[0]);
                int L3 = org.telegram.messenger.g0.L(5.0f);
                float f11 = L3;
                rectF.set((int) ((i3 * e10) + org.telegram.messenger.g0.L((e10 * 4.0f) + 5.0f)), f11, r3 + i3, L3 + i3);
                rectF.inset(org.telegram.messenger.g0.L(-2.0f), org.telegram.messenger.g0.L(-2.0f));
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, e6Var));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                for (int i10 = 0; i10 < 6; i10++) {
                    Drawable drawable3 = drawableArr[i10];
                    if (drawable3 != null) {
                        int L4 = org.telegram.messenger.g0.L((i10 * 4) + 5) + (i3 * i10);
                        float min = ((1.0f - (Math.min(0.5f, Math.abs(i10 - e10)) * 2.0f)) * 0.1f) + 0.9f;
                        canvas.save();
                        canvas.scale(min, min, (i3 / 2.0f) + L4, (i3 / 2.0f) + f11);
                        drawable3.setBounds(L4, L3, L4 + i3, L3 + i3);
                        drawable3.draw(canvas);
                        canvas.restore();
                    }
                }
                return;
            }
            int i11 = 0;
            while (i11 < 2) {
                float e11 = (i11 == 0 ? u5Var : vtVar.y).e(z10, iArr[i11]);
                int i12 = z10;
                float max = Math.max(0.0f, Math.min(f10, -e11));
                rectF.set((int) ((i3 * (e11 + f10)) + org.telegram.messenger.g0.L((r6 * 4.0f) + (Math.max(0.0f, Math.min(f10, r6)) * 3.0f) + 5.0f)), org.telegram.messenger.g0.W1(max, ((org.telegram.messenger.g0.L(f10) + i3) * i11) + org.telegram.messenger.g0.L(3.0f), (vtVar.getMeasuredHeight() - i3) / 2), r6 + i3, r9 + i3);
                rectF.inset(org.telegram.messenger.g0.L(-2.0f), org.telegram.messenger.g0.L(max * (-2.0f)));
                paint.setColor(org.telegram.ui.ActionBar.k6.r1(org.telegram.messenger.g0.T1(f10, 0.5f, max), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, e6Var)));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                int i13 = i12;
                while (i13 < 5) {
                    i13++;
                    int i14 = (i11 * 5) + i13;
                    int L5 = org.telegram.messenger.g0.L((i13 * 4) + 8) + (i3 * i13);
                    int L6 = ((org.telegram.messenger.g0.L(f10) + i3) * i11) + org.telegram.messenger.g0.L(3.0f);
                    drawableArr[i14].setBounds(L5, L6, L5 + i3, L6 + i3);
                    drawableArr[i14].draw(canvas);
                    f10 = f10;
                }
                i11++;
                vtVar = this;
                z10 = i12;
            }
            char c2 = z10;
            drawableArr[c2].setBounds(org.telegram.messenger.g0.L(5.0f), (getMeasuredHeight() - i3) / 2, org.telegram.messenger.g0.L(5.0f) + i3, (getMeasuredHeight() + i3) / 2);
            drawableArr[c2].draw(canvas);
            canvas.drawRect(org.telegram.messenger.g0.L(8.45f) + i3, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(8.45f) + i3 + 1, getMeasuredHeight() - org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i3;
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
        } else if (i12 >= 6 && i12 <= 10 && ((i3 = this.G) == -1 || i3 == 1)) {
            this.G = 1;
            int i15 = i12 - 6;
            iArr[1] = i15;
            if (iArr[0] == -1 || (this.H && z10)) {
                iArr[0] = i15;
            }
        }
        if (iArr2[0] != iArr[0] || iArr2[1] != iArr[1]) {
            org.telegram.messenger.g0.c4(this);
            org.telegram.messenger.n10 n10Var = this.F;
            if (n10Var != null) {
                n10Var.a(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
            }
        }
        invalidate();
        if (motionEvent.getAction() == 1) {
            this.G = -1;
        }
        return true;
    }

    public void setArrowX(int i3) {
        this.h = i3;
        invalidate();
    }

    public void setOnSelectionUpdateListener(org.telegram.messenger.n10 n10Var) {
        this.F = n10Var;
    }
}
