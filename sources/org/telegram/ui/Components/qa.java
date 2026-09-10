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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class qa extends View {
    public final org.telegram.ui.ActionBar.f6 a;
    public final pa[] b;
    public final Paint c;
    public float d;
    public int e;
    public boolean f;
    public final d6 h;
    public Utilities.Callback n;
    public boolean r;

    public qa(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.c = new Paint(1);
        this.h = new d6(this, 0L, 210L, wr.h);
        this.a = f6Var;
        ka0 ka0Var = (ka0) this;
        this.b = new pa[]{new pa(ka0Var, 0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new pa(ka0Var, 1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        a(0.0f, false);
    }

    public final void a(float f7, boolean z10) {
        pa[] paVarArr = this.b;
        float clamp = Utilities.clamp(f7, paVarArr.length, 0.0f);
        this.d = clamp;
        this.e = Math.round(clamp);
        for (int i10 = 0; i10 < paVarArr.length; i10++) {
            pa paVar = paVarArr[i10];
            boolean z11 = ((float) Math.abs(this.e - i10)) < (paVarArr[i10].l ? 0.25f : 0.35f);
            int i11 = paVar.k;
            int i12 = paVar.j;
            hj0 hj0Var = paVar.b;
            if (paVar.l != z11) {
                if (paVar.n.b[paVar.a].j != 0) {
                    if (z11) {
                        hj0Var.P(i12);
                        if (hj0Var.b0 >= i11 - 2) {
                            hj0Var.N(0, false, false);
                        }
                        if (hj0Var.b0 <= i12) {
                            hj0Var.start();
                        } else {
                            hj0Var.M(i12);
                        }
                    } else if (hj0Var.b0 >= i12 - 1) {
                        hj0Var.P(i11 - 1);
                        hj0Var.start();
                    } else {
                        hj0Var.P(0);
                        hj0Var.M(0);
                    }
                } else if (z11) {
                    hj0Var.M(0);
                    if (z10) {
                        hj0Var.start();
                    }
                }
                paVar.l = z11;
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        float f7;
        float f10;
        float f11;
        float f12;
        qa qaVar = this;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        org.telegram.ui.ActionBar.f6 f6Var2 = qaVar.a;
        canvas.drawColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var2));
        canvas.drawRect(0.0f, 0.0f, qaVar.getWidth(), AndroidUtilities.getShadowHeight(), org.telegram.ui.ActionBar.j6.k0);
        int width = (qaVar.getWidth() - qaVar.getPaddingLeft()) - qaVar.getPaddingRight();
        pa[] paVarArr = qaVar.b;
        int length = width / paVarArr.length;
        int min = Math.min(AndroidUtilities.dp(64.0f), length);
        float e = qaVar.h.e(qaVar.f);
        Paint paint = qaVar.c;
        float f13 = 0.0f;
        if (e > 0.0f) {
            f7 = 9.0f;
            f10 = 16.0f;
            paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var2), (int) (((Math.abs((Math.floor(qaVar.d) + 0.5d) - qaVar.d) * 1.2000000476837158d) + 0.4000000059604645d) * 18.0d * e)));
            float f14 = length;
            float f15 = f14 / 2.0f;
            f6Var = f6Var2;
            f11 = 41.0f;
            float lerp = AndroidUtilities.lerp((((float) Math.floor(qaVar.d)) * f14) + f15, (f14 * ((float) Math.ceil(qaVar.d))) + f15, qaVar.d - ((int) r6)) + qaVar.getPaddingLeft();
            RectF rectF = AndroidUtilities.rectTmp;
            float f16 = min / 2.0f;
            rectF.set(lerp - f16, AndroidUtilities.dp(9.0f), lerp + f16, AndroidUtilities.dp(41.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
        } else {
            f6Var = f6Var2;
            f7 = 9.0f;
            f10 = 16.0f;
            f11 = 41.0f;
        }
        int i11 = 0;
        while (i11 < paVarArr.length) {
            pa paVar = paVarArr[i11];
            int paddingLeft = (i11 * length) + qaVar.getPaddingLeft();
            RectF rectF2 = paVar.h;
            StaticLayout staticLayout = paVar.e;
            org.telegram.ui.Cells.z zVar = paVar.c;
            hj0 hj0Var = paVar.b;
            int i12 = length;
            rectF2.set(paddingLeft, f13, paddingLeft + length, qaVar.getHeight());
            float min2 = 1.0f - Math.min(1.0f, Math.abs(qaVar.d - i11));
            org.telegram.ui.ActionBar.f6 f6Var3 = f6Var;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.D6, f6Var3);
            int i13 = org.telegram.ui.ActionBar.j6.G6;
            int d = i0.a.d(min2, v02, org.telegram.ui.ActionBar.j6.v0(i13, f6Var3));
            paVar.d.setColor(d);
            if (paVar.m != d) {
                paVar.m = d;
                f12 = min2;
                hj0Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            } else {
                f12 = min2;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float f17 = min / 2.0f;
            pa[] paVarArr2 = paVarArr;
            int i14 = min;
            rect.set((int) (rectF2.centerX() - f17), AndroidUtilities.dp(f7), (int) (rectF2.centerX() + f17), AndroidUtilities.dp(f11));
            float e7 = paVar.i.e(f12 > 0.6f);
            if (e < 1.0f) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(i13, f6Var3), (int) ((1.0f - e) * e7 * 18.0f)));
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rect);
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint);
            }
            zVar.setBounds(rect);
            zVar.draw(canvas);
            float dp = AndroidUtilities.dp(29.0f) / 2.0f;
            rect.set((int) (rectF2.centerX() - dp), (int) (AndroidUtilities.dpf2(24.66f) - dp), (int) (rectF2.centerX() + dp), (int) (AndroidUtilities.dpf2(24.66f) + dp));
            hj0Var.setBounds(rect);
            hj0Var.draw(canvas);
            canvas.save();
            canvas.translate((rectF2.centerX() - (paVar.f / 2.0f)) - paVar.g, AndroidUtilities.dp(50.0f) - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            i11++;
            qaVar = this;
            f6Var = f6Var3;
            length = i12;
            paVarArr = paVarArr2;
            min = i14;
            f13 = 0.0f;
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
        pa[] paVarArr = this.b;
        if (action == 1 || motionEvent.getAction() == 2) {
            float x10 = motionEvent.getX();
            int i10 = 0;
            while (true) {
                if (i10 >= paVarArr.length) {
                    i10 = -1;
                    break;
                }
                RectF rectF = paVarArr[i10].h;
                if (rectF.left >= x10 || rectF.right <= x10) {
                    i10++;
                } else if (motionEvent.getAction() != 1) {
                    if (this.r) {
                        paVarArr[i10].c.setState(new int[0]);
                    }
                    paVarArr[i10].c.setState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled});
                }
            }
            for (int i11 = 0; i11 < paVarArr.length; i11++) {
                if (i11 != i10 || motionEvent.getAction() == 1) {
                    paVarArr[i11].c.setState(new int[0]);
                }
            }
            if (i10 >= 0 && this.e != i10 && (callback = this.n) != null) {
                callback.run(Integer.valueOf(i10));
            }
            this.r = false;
        } else if (motionEvent.getAction() == 3) {
            for (pa paVar : paVarArr) {
                paVar.c.setState(new int[0]);
            }
            this.r = false;
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.n = callback;
    }

    public void setProgress(float f7) {
        a(f7, true);
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
            pa[] paVarArr = this.b;
            if (i10 >= paVarArr.length) {
                return super.verifyDrawable(drawable);
            }
            if (paVarArr[i10].c == drawable) {
                return true;
            }
            i10++;
        }
    }
}
