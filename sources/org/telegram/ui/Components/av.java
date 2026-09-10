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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class av extends View {
    public Utilities.Callback2 E;
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
    public final RectF v;
    public final d6 w;
    public final d6 x;
    public final org.telegram.ui.ActionBar.f6 y;

    public av(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 32.0f);
        this.b = new Drawable[11];
        this.n = new int[]{0, 0};
        this.r = new int[]{0, 0};
        this.s = new Paint(1);
        this.v = new RectF();
        wr wrVar = wr.h;
        this.w = new d6(this, 125L, wrVar);
        this.x = new d6(this, 125L, wrVar);
        this.F = -1;
        this.G = true;
        this.y = f6Var;
        this.c = getResources().getDrawable(R.drawable.stickers_back_all);
        this.d = getResources().getDrawable(R.drawable.stickers_back_arrow);
        a();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.j6.h5;
        org.telegram.ui.ActionBar.f6 f6Var = this.y;
        org.telegram.ui.ActionBar.j6.w1(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), this.c);
        org.telegram.ui.ActionBar.j6.w1(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), this.d);
        CompoundEmoji.setPlaceholderColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Me, f6Var));
    }

    public String getEmoji() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        av avVar = this;
        int measuredWidth = avVar.getMeasuredWidth();
        int measuredHeight = avVar.getMeasuredHeight() - AndroidUtilities.dp(2.0f);
        Drawable drawable = avVar.c;
        boolean z10 = false;
        drawable.setBounds(0, 0, measuredWidth, measuredHeight);
        drawable.draw(canvas);
        int dp = avVar.h - AndroidUtilities.dp(9.0f);
        int measuredHeight2 = avVar.getMeasuredHeight() - AndroidUtilities.dp(6.34f);
        int dp2 = AndroidUtilities.dp(9.0f) + avVar.h;
        int measuredHeight3 = avVar.getMeasuredHeight();
        Drawable drawable2 = avVar.d;
        drawable2.setBounds(dp, measuredHeight2, dp2, measuredHeight3);
        drawable2.draw(canvas);
        if (avVar.e != null) {
            boolean z11 = avVar.f;
            org.telegram.ui.ActionBar.f6 f6Var = avVar.y;
            int[] iArr = avVar.n;
            d6 d6Var = avVar.w;
            Paint paint = avVar.s;
            Drawable[] drawableArr = avVar.b;
            RectF rectF = avVar.v;
            float f7 = 1.0f;
            int i10 = avVar.a;
            if (!z11) {
                float d = d6Var.d(iArr[0], false);
                int dp3 = AndroidUtilities.dp(5.0f);
                float f10 = dp3;
                rectF.set((int) ((i10 * d) + AndroidUtilities.dp((d * 4.0f) + 5.0f)), f10, r3 + i10, dp3 + i10);
                rectF.inset(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(-2.0f));
                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                for (int i11 = 0; i11 < 6; i11++) {
                    Drawable drawable3 = drawableArr[i11];
                    if (drawable3 != null) {
                        int dp4 = AndroidUtilities.dp((i11 * 4) + 5) + (i10 * i11);
                        float min = ((1.0f - (Math.min(0.5f, Math.abs(i11 - d)) * 2.0f)) * 0.1f) + 0.9f;
                        canvas.save();
                        canvas.scale(min, min, (i10 / 2.0f) + dp4, (i10 / 2.0f) + f10);
                        drawable3.setBounds(dp4, dp3, dp4 + i10, dp3 + i10);
                        drawable3.draw(canvas);
                        canvas.restore();
                    }
                }
                return;
            }
            int i12 = 0;
            while (i12 < 2) {
                float d10 = (i12 == 0 ? d6Var : avVar.x).d(iArr[i12], z10);
                float max = Math.max(0.0f, Math.min(f7, -d10));
                rectF.set((int) ((i10 * (d10 + f7)) + AndroidUtilities.dp((r6 * 4.0f) + (Math.max(0.0f, Math.min(f7, r6)) * 3.0f) + 5.0f)), AndroidUtilities.lerp(((AndroidUtilities.dp(f7) + i10) * i12) + AndroidUtilities.dp(3.0f), (avVar.getMeasuredHeight() - i10) / 2, max), r6 + i10, r9 + i10);
                rectF.inset(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(max * (-2.0f)));
                paint.setColor(org.telegram.ui.ActionBar.j6.l1(AndroidUtilities.lerp(f7, 0.5f, max), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var)));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                int i13 = 0;
                while (i13 < 5) {
                    i13++;
                    int i14 = (i12 * 5) + i13;
                    int dp5 = AndroidUtilities.dp((i13 * 4) + 8) + (i10 * i13);
                    int dp6 = ((AndroidUtilities.dp(f7) + i10) * i12) + AndroidUtilities.dp(3.0f);
                    drawableArr[i14].setBounds(dp5, dp6, dp5 + i10, dp6 + i10);
                    drawableArr[i14].draw(canvas);
                    f7 = 1.0f;
                }
                i12++;
                f7 = 1.0f;
                z10 = false;
                avVar = this;
            }
            drawableArr[0].setBounds(AndroidUtilities.dp(5.0f), (getMeasuredHeight() - i10) / 2, AndroidUtilities.dp(5.0f) + i10, (getMeasuredHeight() + i10) / 2);
            drawableArr[0].draw(canvas);
            canvas.drawRect(AndroidUtilities.dp(8.45f) + i10, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.45f) + i10 + 1, getMeasuredHeight() - AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.j6.k0);
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
            AndroidUtilities.vibrateCursor(this);
            Utilities.Callback2 callback2 = this.E;
            if (callback2 != null) {
                callback2.run(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
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

    public void setOnSelectionUpdateListener(Utilities.Callback2<Integer, Integer> callback2) {
        this.E = callback2;
    }
}
