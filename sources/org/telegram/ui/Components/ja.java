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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class ja extends View {
    public final org.telegram.ui.ActionBar.b6 a;
    public final ia[] b;
    public final Paint c;
    public float d;
    public int e;
    public boolean f;
    public final y5 h;
    public Utilities.Callback n;
    public boolean r;

    public ja(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.c = new Paint(1);
        this.h = new y5(this, 0L, 210L, gr.h);
        this.a = b6Var;
        j90 j90Var = (j90) this;
        this.b = new ia[]{new ia(j90Var, 0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new ia(j90Var, 1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        a(0.0f, false);
    }

    public final void a(float f10, boolean z10) {
        ia[] iaVarArr = this.b;
        float clamp = Utilities.clamp(f10, iaVarArr.length, 0.0f);
        this.d = clamp;
        this.e = Math.round(clamp);
        for (int i9 = 0; i9 < iaVarArr.length; i9++) {
            ia iaVar = iaVarArr[i9];
            boolean z11 = ((float) Math.abs(this.e - i9)) < (iaVarArr[i9].l ? 0.25f : 0.35f);
            int i10 = iaVar.k;
            int i11 = iaVar.j;
            mi0 mi0Var = iaVar.b;
            if (iaVar.l != z11) {
                if (iaVar.n.b[iaVar.a].j != 0) {
                    if (z11) {
                        mi0Var.N(i11);
                        if (mi0Var.X >= i10 - 2) {
                            mi0Var.L(0, false, false);
                        }
                        if (mi0Var.X <= i11) {
                            mi0Var.start();
                        } else {
                            mi0Var.K(i11);
                        }
                    } else if (mi0Var.X >= i11 - 1) {
                        mi0Var.N(i10 - 1);
                        mi0Var.start();
                    } else {
                        mi0Var.N(0);
                        mi0Var.K(0);
                    }
                } else if (z11) {
                    mi0Var.K(0);
                    if (z10) {
                        mi0Var.start();
                    }
                }
                iaVar.l = z11;
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.b6 b6Var;
        float f10;
        float f11;
        float f12;
        float f13;
        ja jaVar = this;
        int i9 = org.telegram.ui.ActionBar.f6.d6;
        org.telegram.ui.ActionBar.b6 b6Var2 = jaVar.a;
        canvas.drawColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var2));
        canvas.drawRect(0.0f, 0.0f, jaVar.getWidth(), AndroidUtilities.getShadowHeight(), org.telegram.ui.ActionBar.f6.k0);
        int width = (jaVar.getWidth() - jaVar.getPaddingLeft()) - jaVar.getPaddingRight();
        ia[] iaVarArr = jaVar.b;
        int length = width / iaVarArr.length;
        int min = Math.min(AndroidUtilities.dp(64.0f), length);
        float e10 = jaVar.h.e(jaVar.f);
        Paint paint = jaVar.c;
        float f14 = 0.0f;
        if (e10 > 0.0f) {
            f10 = 9.0f;
            f11 = 16.0f;
            paint.setColor(i0.a.k(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var2), (int) (((Math.abs((Math.floor(jaVar.d) + 0.5d) - jaVar.d) * 1.2000000476837158d) + 0.4000000059604645d) * 18.0d * e10)));
            float f15 = length;
            float f16 = f15 / 2.0f;
            b6Var = b6Var2;
            f12 = 41.0f;
            float lerp = AndroidUtilities.lerp((((float) Math.floor(jaVar.d)) * f15) + f16, (f15 * ((float) Math.ceil(jaVar.d))) + f16, jaVar.d - ((int) r6)) + jaVar.getPaddingLeft();
            RectF rectF = AndroidUtilities.rectTmp;
            float f17 = min / 2.0f;
            rectF.set(lerp - f17, AndroidUtilities.dp(9.0f), lerp + f17, AndroidUtilities.dp(41.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
        } else {
            b6Var = b6Var2;
            f10 = 9.0f;
            f11 = 16.0f;
            f12 = 41.0f;
        }
        int i10 = 0;
        while (i10 < iaVarArr.length) {
            ia iaVar = iaVarArr[i10];
            int paddingLeft = (i10 * length) + jaVar.getPaddingLeft();
            RectF rectF2 = iaVar.h;
            StaticLayout staticLayout = iaVar.e;
            org.telegram.ui.Cells.z zVar = iaVar.c;
            mi0 mi0Var = iaVar.b;
            int i11 = length;
            rectF2.set(paddingLeft, f14, paddingLeft + length, jaVar.getHeight());
            float min2 = 1.0f - Math.min(1.0f, Math.abs(jaVar.d - i10));
            org.telegram.ui.ActionBar.b6 b6Var3 = b6Var;
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.D6, b6Var3);
            int i12 = org.telegram.ui.ActionBar.f6.G6;
            int d = i0.a.d(min2, v02, org.telegram.ui.ActionBar.f6.v0(i12, b6Var3));
            iaVar.d.setColor(d);
            if (iaVar.m != d) {
                iaVar.m = d;
                f13 = min2;
                mi0Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            } else {
                f13 = min2;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float f18 = min / 2.0f;
            ia[] iaVarArr2 = iaVarArr;
            int i13 = min;
            rect.set((int) (rectF2.centerX() - f18), AndroidUtilities.dp(f10), (int) (rectF2.centerX() + f18), AndroidUtilities.dp(f12));
            float e11 = iaVar.i.e(f13 > 0.6f);
            if (e10 < 1.0f) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.f6.v0(i12, b6Var3), (int) ((1.0f - e10) * e11 * 18.0f)));
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rect);
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), paint);
            }
            zVar.setBounds(rect);
            zVar.draw(canvas);
            float dp = AndroidUtilities.dp(29.0f) / 2.0f;
            rect.set((int) (rectF2.centerX() - dp), (int) (AndroidUtilities.dpf2(24.66f) - dp), (int) (rectF2.centerX() + dp), (int) (AndroidUtilities.dpf2(24.66f) + dp));
            mi0Var.setBounds(rect);
            mi0Var.draw(canvas);
            canvas.save();
            canvas.translate((rectF2.centerX() - (iaVar.f / 2.0f)) - iaVar.g, AndroidUtilities.dp(50.0f) - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            i10++;
            jaVar = this;
            b6Var = b6Var3;
            length = i11;
            iaVarArr = iaVarArr2;
            min = i13;
            f14 = 0.0f;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.getShadowHeight() + AndroidUtilities.dp(64.0f));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            this.r = true;
            return true;
        }
        int action = motionEvent.getAction();
        ia[] iaVarArr = this.b;
        if (action == 1 || motionEvent.getAction() == 2) {
            float x10 = motionEvent.getX();
            int i9 = 0;
            while (true) {
                if (i9 >= iaVarArr.length) {
                    i9 = -1;
                    break;
                }
                RectF rectF = iaVarArr[i9].h;
                if (rectF.left >= x10 || rectF.right <= x10) {
                    i9++;
                } else if (motionEvent.getAction() != 1) {
                    if (this.r) {
                        iaVarArr[i9].c.setState(new int[0]);
                    }
                    iaVarArr[i9].c.setState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled});
                }
            }
            for (int i10 = 0; i10 < iaVarArr.length; i10++) {
                if (i10 != i9 || motionEvent.getAction() == 1) {
                    iaVarArr[i10].c.setState(new int[0]);
                }
            }
            if (i9 >= 0 && this.e != i9 && (callback = this.n) != null) {
                callback.run(Integer.valueOf(i9));
            }
            this.r = false;
        } else if (motionEvent.getAction() == 3) {
            for (ia iaVar : iaVarArr) {
                iaVar.c.setState(new int[0]);
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
        int i9 = 0;
        while (true) {
            ia[] iaVarArr = this.b;
            if (i9 >= iaVarArr.length) {
                return super.verifyDrawable(drawable);
            }
            if (iaVarArr[i9].c == drawable) {
                return true;
            }
            i9++;
        }
    }
}
