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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class ua extends View {
    public final org.telegram.ui.ActionBar.e6 a;
    public final ta[] b;
    public final Paint c;
    public float d;
    public int e;
    public boolean f;
    public final g6 h;
    public Utilities.Callback n;
    public boolean r;

    public ua(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.c = new Paint(1);
        this.h = new g6(this, 0L, 210L, hs.h);
        this.a = e6Var;
        cb0 cb0Var = (cb0) this;
        this.b = new ta[]{new ta(cb0Var, 0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new ta(cb0Var, 1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        a(0.0f, false);
    }

    public final void a(float f7, boolean z10) {
        ta[] taVarArr = this.b;
        float clamp = Utilities.clamp(f7, taVarArr.length, 0.0f);
        this.d = clamp;
        this.e = Math.round(clamp);
        for (int i10 = 0; i10 < taVarArr.length; i10++) {
            ta taVar = taVarArr[i10];
            boolean z11 = ((float) Math.abs(this.e - i10)) < (taVarArr[i10].l ? 0.25f : 0.35f);
            int i11 = taVar.k;
            int i12 = taVar.j;
            ck0 ck0Var = taVar.b;
            if (taVar.l != z11) {
                if (taVar.n.b[taVar.a].j != 0) {
                    if (z11) {
                        ck0Var.P(i12);
                        if (ck0Var.a0 >= i11 - 2) {
                            ck0Var.N(0, false, false);
                        }
                        if (ck0Var.a0 <= i12) {
                            ck0Var.start();
                        } else {
                            ck0Var.M(i12);
                        }
                    } else if (ck0Var.a0 >= i12 - 1) {
                        ck0Var.P(i11 - 1);
                        ck0Var.start();
                    } else {
                        ck0Var.P(0);
                        ck0Var.M(0);
                    }
                } else if (z11) {
                    ck0Var.M(0);
                    if (z10) {
                        ck0Var.start();
                    }
                }
                taVar.l = z11;
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        ua uaVar = this;
        int i10 = org.telegram.ui.ActionBar.i6.d6;
        org.telegram.ui.ActionBar.e6 e6Var = uaVar.a;
        canvas.drawColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        canvas.drawRect(0.0f, 0.0f, uaVar.getWidth(), AndroidUtilities.getShadowHeight(), org.telegram.ui.ActionBar.i6.k0);
        int width = (uaVar.getWidth() - uaVar.getPaddingLeft()) - uaVar.getPaddingRight();
        ta[] taVarArr = uaVar.b;
        int length = width / taVarArr.length;
        int min = Math.min(AndroidUtilities.dp(64.0f), length);
        float e7 = uaVar.h.e(uaVar.f);
        float f12 = 16.0f;
        Paint paint = uaVar.c;
        if (e7 > 0.0f) {
            f10 = 41.0f;
            f11 = 9.0f;
            paint.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var), (int) (((Math.abs((Math.floor(uaVar.d) + 0.5d) - uaVar.d) * 1.2000000476837158d) + 0.4000000059604645d) * 18.0d * e7)));
            float paddingLeft = uaVar.getPaddingLeft();
            float f13 = length;
            float floor = ((float) Math.floor(uaVar.d)) * f13;
            float f14 = f13 / 2.0f;
            f7 = 2.0f;
            float lerp = AndroidUtilities.lerp(floor + f14, (f13 * ((float) Math.ceil(uaVar.d))) + f14, uaVar.d - ((int) r13)) + paddingLeft;
            RectF rectF = AndroidUtilities.rectTmp;
            float f15 = min / 2.0f;
            rectF.set(lerp - f15, AndroidUtilities.dp(9.0f), lerp + f15, AndroidUtilities.dp(41.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
        } else {
            f7 = 2.0f;
            f10 = 41.0f;
            f11 = 9.0f;
        }
        int i11 = 0;
        while (i11 < taVarArr.length) {
            ta taVar = taVarArr[i11];
            int paddingLeft2 = (i11 * length) + uaVar.getPaddingLeft();
            RectF rectF2 = taVar.h;
            StaticLayout staticLayout = taVar.e;
            org.telegram.ui.Cells.z zVar = taVar.c;
            float f16 = f12;
            ck0 ck0Var = taVar.b;
            int i12 = length;
            ta[] taVarArr2 = taVarArr;
            rectF2.set(paddingLeft2, 0.0f, paddingLeft2 + length, uaVar.getHeight());
            float min2 = 1.0f - Math.min(1.0f, Math.abs(uaVar.d - i11));
            int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.D6, e6Var);
            int i13 = org.telegram.ui.ActionBar.i6.G6;
            int d = i0.a.d(min2, w02, org.telegram.ui.ActionBar.i6.w0(i13, e6Var));
            taVar.d.setColor(d);
            if (taVar.m != d) {
                taVar.m = d;
                ck0Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float f17 = min / f7;
            int i14 = min;
            rect.set((int) (rectF2.centerX() - f17), AndroidUtilities.dp(f11), (int) (rectF2.centerX() + f17), AndroidUtilities.dp(f10));
            float e10 = taVar.i.e(min2 > 0.6f);
            if (e7 < 1.0f) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.w0(i13, e6Var), (int) ((1.0f - e7) * e10 * 18.0f)));
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rect);
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(f16), AndroidUtilities.dp(f16), paint);
            }
            zVar.setBounds(rect);
            zVar.draw(canvas);
            float dp = AndroidUtilities.dp(29.0f) / f7;
            rect.set((int) (rectF2.centerX() - dp), (int) (AndroidUtilities.dpf2(24.66f) - dp), (int) (rectF2.centerX() + dp), (int) (AndroidUtilities.dpf2(24.66f) + dp));
            ck0Var.setBounds(rect);
            ck0Var.draw(canvas);
            canvas.save();
            canvas.translate((rectF2.centerX() - (taVar.f / f7)) - taVar.g, AndroidUtilities.dp(50.0f) - (staticLayout.getHeight() / f7));
            staticLayout.draw(canvas);
            canvas.restore();
            i11++;
            uaVar = this;
            f12 = f16;
            length = i12;
            taVarArr = taVarArr2;
            min = i14;
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
        ta[] taVarArr = this.b;
        if (action == 1 || motionEvent.getAction() == 2) {
            float x10 = motionEvent.getX();
            int i10 = 0;
            while (true) {
                if (i10 >= taVarArr.length) {
                    i10 = -1;
                    break;
                }
                RectF rectF = taVarArr[i10].h;
                if (rectF.left >= x10 || rectF.right <= x10) {
                    i10++;
                } else if (motionEvent.getAction() != 1) {
                    if (this.r) {
                        taVarArr[i10].c.setState(new int[0]);
                    }
                    taVarArr[i10].c.setState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled});
                }
            }
            for (int i11 = 0; i11 < taVarArr.length; i11++) {
                if (i11 != i10 || motionEvent.getAction() == 1) {
                    taVarArr[i11].c.setState(new int[0]);
                }
            }
            if (i10 >= 0 && this.e != i10 && (callback = this.n) != null) {
                callback.run(Integer.valueOf(i10));
            }
            this.r = false;
        } else if (motionEvent.getAction() == 3) {
            for (ta taVar : taVarArr) {
                taVar.c.setState(new int[0]);
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
            ta[] taVarArr = this.b;
            if (i10 >= taVarArr.length) {
                return super.verifyDrawable(drawable);
            }
            if (taVarArr[i10].c == drawable) {
                return true;
            }
            i10++;
        }
    }
}
