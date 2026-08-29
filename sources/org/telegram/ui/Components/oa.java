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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class oa extends View {
    public final org.telegram.ui.ActionBar.c6 a;
    public final na[] b;
    public final Paint c;
    public float d;
    public int e;
    public boolean f;
    public final d6 h;
    public Utilities.Callback n;
    public boolean r;

    public oa(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.c = new Paint(1);
        this.h = new d6(this, 0L, 210L, jr.h);
        this.a = c6Var;
        x90 x90Var = (x90) this;
        this.b = new na[]{new na(x90Var, 0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new na(x90Var, 1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        a(0.0f, false);
    }

    public final void a(float f9, boolean z10) {
        na[] naVarArr = this.b;
        float clamp = Utilities.clamp(f9, naVarArr.length, 0.0f);
        this.d = clamp;
        this.e = Math.round(clamp);
        for (int i10 = 0; i10 < naVarArr.length; i10++) {
            na naVar = naVarArr[i10];
            boolean z11 = ((float) Math.abs(this.e - i10)) < (naVarArr[i10].l ? 0.25f : 0.35f);
            int i11 = naVar.k;
            int i12 = naVar.j;
            xi0 xi0Var = naVar.b;
            if (naVar.l != z11) {
                if (naVar.n.b[naVar.a].j != 0) {
                    if (z11) {
                        xi0Var.N(i12);
                        if (xi0Var.X >= i11 - 2) {
                            xi0Var.L(0, false, false);
                        }
                        if (xi0Var.X <= i12) {
                            xi0Var.start();
                        } else {
                            xi0Var.K(i12);
                        }
                    } else if (xi0Var.X >= i12 - 1) {
                        xi0Var.N(i11 - 1);
                        xi0Var.start();
                    } else {
                        xi0Var.N(0);
                        xi0Var.K(0);
                    }
                } else if (z11) {
                    xi0Var.K(0);
                    if (z10) {
                        xi0Var.start();
                    }
                }
                naVar.l = z11;
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.c6 c6Var;
        float f9;
        float f10;
        float f11;
        float f12;
        oa oaVar = this;
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        org.telegram.ui.ActionBar.c6 c6Var2 = oaVar.a;
        canvas.drawColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var2));
        canvas.drawRect(0.0f, 0.0f, oaVar.getWidth(), AndroidUtilities.getShadowHeight(), org.telegram.ui.ActionBar.g6.k0);
        int width = (oaVar.getWidth() - oaVar.getPaddingLeft()) - oaVar.getPaddingRight();
        na[] naVarArr = oaVar.b;
        int length = width / naVarArr.length;
        int min = Math.min(AndroidUtilities.dp(64.0f), length);
        float e10 = oaVar.h.e(oaVar.f);
        Paint paint = oaVar.c;
        float f13 = 0.0f;
        if (e10 > 0.0f) {
            f9 = 9.0f;
            f10 = 16.0f;
            paint.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var2), (int) (((Math.abs((Math.floor(oaVar.d) + 0.5d) - oaVar.d) * 1.2000000476837158d) + 0.4000000059604645d) * 18.0d * e10)));
            float f14 = length;
            float f15 = f14 / 2.0f;
            c6Var = c6Var2;
            f11 = 41.0f;
            float lerp = AndroidUtilities.lerp((((float) Math.floor(oaVar.d)) * f14) + f15, (f14 * ((float) Math.ceil(oaVar.d))) + f15, oaVar.d - ((int) r6)) + oaVar.getPaddingLeft();
            RectF rectF = AndroidUtilities.rectTmp;
            float f16 = min / 2.0f;
            rectF.set(lerp - f16, AndroidUtilities.dp(9.0f), lerp + f16, AndroidUtilities.dp(41.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
        } else {
            c6Var = c6Var2;
            f9 = 9.0f;
            f10 = 16.0f;
            f11 = 41.0f;
        }
        int i11 = 0;
        while (i11 < naVarArr.length) {
            na naVar = naVarArr[i11];
            int paddingLeft = (i11 * length) + oaVar.getPaddingLeft();
            RectF rectF2 = naVar.h;
            StaticLayout staticLayout = naVar.e;
            org.telegram.ui.Cells.z zVar = naVar.c;
            xi0 xi0Var = naVar.b;
            int i12 = length;
            rectF2.set(paddingLeft, f13, paddingLeft + length, oaVar.getHeight());
            float min2 = 1.0f - Math.min(1.0f, Math.abs(oaVar.d - i11));
            org.telegram.ui.ActionBar.c6 c6Var3 = c6Var;
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.D6, c6Var3);
            int i13 = org.telegram.ui.ActionBar.g6.G6;
            int d = i0.a.d(min2, v02, org.telegram.ui.ActionBar.g6.v0(i13, c6Var3));
            naVar.d.setColor(d);
            if (naVar.m != d) {
                naVar.m = d;
                f12 = min2;
                xi0Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            } else {
                f12 = min2;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float f17 = min / 2.0f;
            na[] naVarArr2 = naVarArr;
            int i14 = min;
            rect.set((int) (rectF2.centerX() - f17), AndroidUtilities.dp(f9), (int) (rectF2.centerX() + f17), AndroidUtilities.dp(f11));
            float e11 = naVar.i.e(f12 > 0.6f);
            if (e10 < 1.0f) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.v0(i13, c6Var3), (int) ((1.0f - e10) * e11 * 18.0f)));
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rect);
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint);
            }
            zVar.setBounds(rect);
            zVar.draw(canvas);
            float dp = AndroidUtilities.dp(29.0f) / 2.0f;
            rect.set((int) (rectF2.centerX() - dp), (int) (AndroidUtilities.dpf2(24.66f) - dp), (int) (rectF2.centerX() + dp), (int) (AndroidUtilities.dpf2(24.66f) + dp));
            xi0Var.setBounds(rect);
            xi0Var.draw(canvas);
            canvas.save();
            canvas.translate((rectF2.centerX() - (naVar.f / 2.0f)) - naVar.g, AndroidUtilities.dp(50.0f) - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            i11++;
            oaVar = this;
            c6Var = c6Var3;
            length = i12;
            naVarArr = naVarArr2;
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
        na[] naVarArr = this.b;
        if (action == 1 || motionEvent.getAction() == 2) {
            float x4 = motionEvent.getX();
            int i10 = 0;
            while (true) {
                if (i10 >= naVarArr.length) {
                    i10 = -1;
                    break;
                }
                RectF rectF = naVarArr[i10].h;
                if (rectF.left >= x4 || rectF.right <= x4) {
                    i10++;
                } else if (motionEvent.getAction() != 1) {
                    if (this.r) {
                        naVarArr[i10].c.setState(new int[0]);
                    }
                    naVarArr[i10].c.setState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled});
                }
            }
            for (int i11 = 0; i11 < naVarArr.length; i11++) {
                if (i11 != i10 || motionEvent.getAction() == 1) {
                    naVarArr[i11].c.setState(new int[0]);
                }
            }
            if (i10 >= 0 && this.e != i10 && (callback = this.n) != null) {
                callback.run(Integer.valueOf(i10));
            }
            this.r = false;
        } else if (motionEvent.getAction() == 3) {
            for (na naVar : naVarArr) {
                naVar.c.setState(new int[0]);
            }
            this.r = false;
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.n = callback;
    }

    public void setProgress(float f9) {
        a(f9, true);
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
            na[] naVarArr = this.b;
            if (i10 >= naVarArr.length) {
                return super.verifyDrawable(drawable);
            }
            if (naVarArr[i10].c == drawable) {
                return true;
            }
            i10++;
        }
    }
}
