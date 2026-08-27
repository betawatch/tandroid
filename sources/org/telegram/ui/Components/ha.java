package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class ha extends View {
    public final org.telegram.ui.ActionBar.c6 a;
    public final ga[] b;
    public final Paint c;
    public float d;
    public int e;
    public boolean f;
    public final y5 h;
    public Utilities.Callback n;
    public boolean r;

    public ha(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.c = new Paint(1);
        this.h = new y5(this, 0L, 210L, er.h);
        this.a = c6Var;
        n90 n90Var = (n90) this;
        this.b = new ga[]{new ga(n90Var, 0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new ga(n90Var, 1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        a(0.0f, false);
    }

    public final void a(float f10, boolean z10) {
        ga[] gaVarArr = this.b;
        float clamp = Utilities.clamp(f10, gaVarArr.length, 0.0f);
        this.d = clamp;
        this.e = Math.round(clamp);
        for (int i10 = 0; i10 < gaVarArr.length; i10++) {
            ga gaVar = gaVarArr[i10];
            boolean z11 = ((float) Math.abs(this.e - i10)) < (gaVarArr[i10].l ? 0.25f : 0.35f);
            int i11 = gaVar.k;
            int i12 = gaVar.j;
            oi0 oi0Var = gaVar.b;
            if (gaVar.l != z11) {
                if (gaVar.n.b[gaVar.a].j != 0) {
                    if (z11) {
                        oi0Var.N(i12);
                        if (oi0Var.X >= i11 - 2) {
                            oi0Var.L(0, false, false);
                        }
                        if (oi0Var.X <= i12) {
                            oi0Var.start();
                        } else {
                            oi0Var.K(i12);
                        }
                    } else if (oi0Var.X >= i12 - 1) {
                        oi0Var.N(i11 - 1);
                        oi0Var.start();
                    } else {
                        oi0Var.N(0);
                        oi0Var.K(0);
                    }
                } else if (z11) {
                    oi0Var.K(0);
                    if (z10) {
                        oi0Var.start();
                    }
                }
                gaVar.l = z11;
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.c6 c6Var;
        float f10;
        float f11;
        float f12;
        float f13;
        ha haVar = this;
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        org.telegram.ui.ActionBar.c6 c6Var2 = haVar.a;
        canvas.drawColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var2));
        canvas.drawRect(0.0f, 0.0f, haVar.getWidth(), AndroidUtilities.getShadowHeight(), org.telegram.ui.ActionBar.g6.k0);
        int width = (haVar.getWidth() - haVar.getPaddingLeft()) - haVar.getPaddingRight();
        ga[] gaVarArr = haVar.b;
        int length = width / gaVarArr.length;
        int min = Math.min(AndroidUtilities.dp(64.0f), length);
        float e9 = haVar.h.e(haVar.f);
        Paint paint = haVar.c;
        float f14 = 0.0f;
        if (e9 > 0.0f) {
            f10 = 9.0f;
            f11 = 16.0f;
            paint.setColor(i0.b.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var2), (int) (((Math.abs((Math.floor(haVar.d) + 0.5d) - haVar.d) * 1.2000000476837158d) + 0.4000000059604645d) * 18.0d * e9)));
            float f15 = length;
            float f16 = f15 / 2.0f;
            c6Var = c6Var2;
            f12 = 41.0f;
            float lerp = AndroidUtilities.lerp((((float) Math.floor(haVar.d)) * f15) + f16, (f15 * ((float) Math.ceil(haVar.d))) + f16, haVar.d - ((int) r6)) + haVar.getPaddingLeft();
            RectF rectF = AndroidUtilities.rectTmp;
            float f17 = min / 2.0f;
            rectF.set(lerp - f17, AndroidUtilities.dp(9.0f), lerp + f17, AndroidUtilities.dp(41.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
        } else {
            c6Var = c6Var2;
            f10 = 9.0f;
            f11 = 16.0f;
            f12 = 41.0f;
        }
        int i11 = 0;
        while (i11 < gaVarArr.length) {
            ga gaVar = gaVarArr[i11];
            int paddingLeft = (i11 * length) + haVar.getPaddingLeft();
            RectF rectF2 = gaVar.h;
            StaticLayout staticLayout = gaVar.e;
            org.telegram.ui.Cells.z zVar = gaVar.c;
            oi0 oi0Var = gaVar.b;
            int i12 = length;
            rectF2.set(paddingLeft, f14, paddingLeft + length, haVar.getHeight());
            float min2 = 1.0f - Math.min(1.0f, Math.abs(haVar.d - i11));
            org.telegram.ui.ActionBar.c6 c6Var3 = c6Var;
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.D6, c6Var3);
            int i13 = org.telegram.ui.ActionBar.g6.G6;
            int d = i0.b.d(min2, v02, org.telegram.ui.ActionBar.g6.v0(i13, c6Var3));
            gaVar.d.setColor(d);
            if (gaVar.m != d) {
                gaVar.m = d;
                f13 = min2;
                oi0Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            } else {
                f13 = min2;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float f18 = min / 2.0f;
            ga[] gaVarArr2 = gaVarArr;
            int i14 = min;
            rect.set((int) (rectF2.centerX() - f18), AndroidUtilities.dp(f10), (int) (rectF2.centerX() + f18), AndroidUtilities.dp(f12));
            float e10 = gaVar.i.e(f13 > 0.6f);
            if (e9 < 1.0f) {
                paint.setColor(i0.b.k(org.telegram.ui.ActionBar.g6.v0(i13, c6Var3), (int) ((1.0f - e9) * e10 * 18.0f)));
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rect);
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), paint);
            }
            zVar.setBounds(rect);
            zVar.draw(canvas);
            float dp = AndroidUtilities.dp(29.0f) / 2.0f;
            rect.set((int) (rectF2.centerX() - dp), (int) (AndroidUtilities.dpf2(24.66f) - dp), (int) (rectF2.centerX() + dp), (int) (AndroidUtilities.dpf2(24.66f) + dp));
            oi0Var.setBounds(rect);
            oi0Var.draw(canvas);
            canvas.save();
            canvas.translate((rectF2.centerX() - (gaVar.f / 2.0f)) - gaVar.g, AndroidUtilities.dp(50.0f) - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            i11++;
            haVar = this;
            c6Var = c6Var3;
            length = i12;
            gaVarArr = gaVarArr2;
            min = i14;
            f14 = 0.0f;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.getShadowHeight() + AndroidUtilities.dp(64.0f));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            this.r = true;
            return true;
        }
        int action = motionEvent.getAction();
        ga[] gaVarArr = this.b;
        if (action == 1 || motionEvent.getAction() == 2) {
            float x8 = motionEvent.getX();
            int i10 = 0;
            while (true) {
                if (i10 >= gaVarArr.length) {
                    i10 = -1;
                    break;
                }
                RectF rectF = gaVarArr[i10].h;
                if (rectF.left >= x8 || rectF.right <= x8) {
                    i10++;
                } else if (motionEvent.getAction() != 1) {
                    if (this.r) {
                        gaVarArr[i10].c.setState(new int[0]);
                    }
                    gaVarArr[i10].c.setState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled});
                }
            }
            for (int i11 = 0; i11 < gaVarArr.length; i11++) {
                if (i11 != i10 || motionEvent.getAction() == 1) {
                    gaVarArr[i11].c.setState(new int[0]);
                }
            }
            if (i10 >= 0 && this.e != i10 && (callback = this.n) != null) {
                callback.run(Integer.valueOf(i10));
            }
            this.r = false;
        } else if (motionEvent.getAction() == 3) {
            for (ga gaVar : gaVarArr) {
                gaVar.c.setState(new int[0]);
            }
            this.r = false;
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.n = callback;
    }

    public void setProgress(float f10) {
        a(f10, true);
    }

    public void setScrolling(boolean z10) {
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        int i10 = 0;
        while (true) {
            ga[] gaVarArr = this.b;
            if (i10 >= gaVarArr.length) {
                return super.verifyDrawable(drawable);
            }
            if (gaVarArr[i10].c == drawable) {
                return true;
            }
            i10++;
        }
    }
}
