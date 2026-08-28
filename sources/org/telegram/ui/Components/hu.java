package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hu extends View {
    public Utilities.Callback2 A;
    public int B;
    public boolean C;
    public long D;
    public boolean E;
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
    public final RectF v;
    public final y5 w;
    public final y5 x;
    public final org.telegram.ui.ActionBar.b6 y;

    public hu(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.a = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        this.b = new Drawable[11];
        this.n = new int[]{0, 0};
        this.r = new int[]{0, 0};
        this.s = new Paint(1);
        this.v = new RectF();
        gr grVar = gr.h;
        this.w = new y5(this, 125L, grVar);
        this.x = new y5(this, 125L, grVar);
        this.B = -1;
        this.C = true;
        this.y = b6Var;
        this.c = getResources().getDrawable(R.drawable.stickers_back_all);
        this.d = getResources().getDrawable(R.drawable.stickers_back_arrow);
        a();
    }

    public final void a() {
        int i9 = org.telegram.ui.ActionBar.f6.h5;
        org.telegram.ui.ActionBar.b6 b6Var = this.y;
        org.telegram.ui.ActionBar.f6.w1(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), this.c);
        org.telegram.ui.ActionBar.f6.w1(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), this.d);
        CompoundEmoji.setPlaceholderColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Me, b6Var));
    }

    public String getEmoji() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        hu huVar = this;
        int measuredWidth = huVar.getMeasuredWidth();
        int measuredHeight = huVar.getMeasuredHeight() - AndroidUtilities.dp(2.0f);
        Drawable drawable = huVar.c;
        boolean z10 = false;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int dp = huVar.h - AndroidUtilities.dp(9.0f);
        int measuredHeight2 = huVar.getMeasuredHeight() - AndroidUtilities.dp(6.34f);
        int dp2 = AndroidUtilities.dp(9.0f) + huVar.h;
        int measuredHeight3 = huVar.getMeasuredHeight();
        Drawable drawable2 = huVar.d;
        drawable2.setBounds(dp, measuredHeight2, dp2, measuredHeight3);
        drawable2.draw(canvas);
        if (huVar.e != null) {
            boolean z11 = huVar.f;
            org.telegram.ui.ActionBar.b6 b6Var = huVar.y;
            int[] iArr = huVar.n;
            y5 y5Var = huVar.w;
            Paint paint = huVar.s;
            Drawable[] drawableArr = huVar.b;
            RectF rectF = huVar.v;
            float f10 = 1.0f;
            int i9 = huVar.a;
            if (!z11) {
                float d = y5Var.d(iArr[0], false);
                int dp3 = AndroidUtilities.dp(5.0f);
                float f11 = dp3;
                rectF.set((int) ((i9 * d) + AndroidUtilities.dp((d * 4.0f) + 5.0f)), f11, r3 + i9, dp3 + i9);
                rectF.inset(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(-2.0f));
                paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                for (int i10 = 0; i10 < 6; i10++) {
                    Drawable drawable3 = drawableArr[i10];
                    if (drawable3 != null) {
                        int dp4 = AndroidUtilities.dp((i10 * 4) + 5) + (i9 * i10);
                        float min = ((1.0f - (Math.min(0.5f, Math.abs(i10 - d)) * 2.0f)) * 0.1f) + 0.9f;
                        canvas.save();
                        canvas.scale(min, min, (i9 / 2.0f) + dp4, (i9 / 2.0f) + f11);
                        drawable3.setBounds(dp4, dp3, dp4 + i9, dp3 + i9);
                        drawable3.draw(canvas);
                        canvas.restore();
                    }
                }
                return;
            }
            int i11 = 0;
            while (i11 < 2) {
                float d9 = (i11 == 0 ? y5Var : huVar.x).d(iArr[i11], z10);
                float max = Math.max(0.0f, Math.min(f10, -d9));
                rectF.set((int) ((i9 * (d9 + f10)) + AndroidUtilities.dp((r6 * 4.0f) + (Math.max(0.0f, Math.min(f10, r6)) * 3.0f) + 5.0f)), AndroidUtilities.lerp(((AndroidUtilities.dp(f10) + i9) * i11) + AndroidUtilities.dp(3.0f), (huVar.getMeasuredHeight() - i9) / 2, max), r6 + i9, r9 + i9);
                rectF.inset(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(max * (-2.0f)));
                paint.setColor(org.telegram.ui.ActionBar.f6.l1(AndroidUtilities.lerp(f10, 0.5f, max), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var)));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                int i12 = 0;
                while (i12 < 5) {
                    i12++;
                    int i13 = (i11 * 5) + i12;
                    int dp5 = AndroidUtilities.dp((i12 * 4) + 8) + (i9 * i12);
                    int dp6 = ((AndroidUtilities.dp(f10) + i9) * i11) + AndroidUtilities.dp(3.0f);
                    drawableArr[i13].setBounds(dp5, dp6, dp5 + i9, dp6 + i9);
                    drawableArr[i13].draw(canvas);
                    f10 = 1.0f;
                }
                i11++;
                f10 = 1.0f;
                z10 = false;
                huVar = this;
            }
            drawableArr[0].setBounds(AndroidUtilities.dp(5.0f), (getMeasuredHeight() - i9) / 2, AndroidUtilities.dp(5.0f) + i9, (getMeasuredHeight() + i9) / 2);
            drawableArr[0].draw(canvas);
            canvas.drawRect(AndroidUtilities.dp(8.45f) + i9, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.45f) + i9 + 1, getMeasuredHeight() - AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.f6.k0);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i9;
        int i10;
        int i11;
        if (this.E) {
            this.E = false;
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
            if (drawableArr[i12].getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) || ((i11 = this.B) != -1 && ((i12 == 0 || ((i11 == 0 && i12 >= 1 && i12 <= 5) || (i11 == 1 && i12 >= 6 && i12 <= 10))) && ((int) motionEvent.getX()) >= drawableArr[i12].getBounds().left && ((int) motionEvent.getX()) <= drawableArr[i12].getBounds().right))) {
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
            this.B = -1;
            this.D = System.currentTimeMillis();
            this.C = iArr[0] == iArr[1];
        }
        int i13 = iArr[0];
        int[] iArr2 = this.r;
        iArr2[0] = i13;
        iArr2[1] = iArr[1];
        boolean z10 = System.currentTimeMillis() - this.D > 300 && motionEvent.getAction() == 2;
        if (i12 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
        } else if (i12 >= 1 && i12 <= 5 && ((i10 = this.B) == -1 || i10 == 0)) {
            this.B = 0;
            int i14 = i12 - 1;
            iArr[0] = i14;
            if (iArr[1] == -1 || (this.C && z10)) {
                iArr[1] = i14;
            }
        } else if (i12 >= 6 && i12 <= 10 && ((i9 = this.B) == -1 || i9 == 1)) {
            this.B = 1;
            int i15 = i12 - 6;
            iArr[1] = i15;
            if (iArr[0] == -1 || (this.C && z10)) {
                iArr[0] = i15;
            }
        }
        if (iArr2[0] != iArr[0] || iArr2[1] != iArr[1]) {
            AndroidUtilities.vibrateCursor(this);
            Utilities.Callback2 callback2 = this.A;
            if (callback2 != null) {
                callback2.run(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
            }
        }
        invalidate();
        if (motionEvent.getAction() == 1) {
            this.B = -1;
        }
        return true;
    }

    public void setArrowX(int i9) {
        this.h = i9;
        invalidate();
    }

    public void setOnSelectionUpdateListener(Utilities.Callback2<Integer, Integer> callback2) {
        this.A = callback2;
    }
}
