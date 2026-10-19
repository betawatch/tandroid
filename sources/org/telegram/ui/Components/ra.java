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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public abstract class ra extends View {
    public final org.telegram.ui.ActionBar.d6 a;
    public final qa[] b;
    public final Paint c;
    public float d;
    public int e;
    public boolean f;
    public final f6 h;
    public Utilities.Callback n;
    public boolean r;

    public ra(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.c = new Paint(1);
        this.h = new f6(this, 0L, 210L, bs.h);
        this.a = d6Var;
        va0 va0Var = (va0) this;
        this.b = new qa[]{new qa(va0Var, 0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new qa(va0Var, 1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        a(0.0f, false);
    }

    public final void a(float f7, boolean z10) {
        qa[] qaVarArr = this.b;
        float clamp = Utilities.clamp(f7, qaVarArr.length, 0.0f);
        this.d = clamp;
        this.e = Math.round(clamp);
        for (int i10 = 0; i10 < qaVarArr.length; i10++) {
            qa qaVar = qaVarArr[i10];
            boolean z11 = ((float) Math.abs(this.e - i10)) < (qaVarArr[i10].l ? 0.25f : 0.35f);
            int i11 = qaVar.k;
            int i12 = qaVar.j;
            uj0 uj0Var = qaVar.b;
            if (qaVar.l != z11) {
                if (qaVar.n.b[qaVar.a].j != 0) {
                    if (z11) {
                        uj0Var.P(i12);
                        if (uj0Var.a0 >= i11 - 2) {
                            uj0Var.N(0, false, false);
                        }
                        if (uj0Var.a0 <= i12) {
                            uj0Var.start();
                        } else {
                            uj0Var.M(i12);
                        }
                    } else if (uj0Var.a0 >= i12 - 1) {
                        uj0Var.P(i11 - 1);
                        uj0Var.start();
                    } else {
                        uj0Var.P(0);
                        uj0Var.M(0);
                    }
                } else if (z11) {
                    uj0Var.M(0);
                    if (z10) {
                        uj0Var.start();
                    }
                }
                qaVar.l = z11;
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        ra raVar = this;
        int i10 = org.telegram.ui.ActionBar.h6.d6;
        org.telegram.ui.ActionBar.d6 d6Var = raVar.a;
        canvas.drawColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        canvas.drawRect(0.0f, 0.0f, raVar.getWidth(), AndroidUtilities.getShadowHeight(), org.telegram.ui.ActionBar.h6.k0);
        int width = (raVar.getWidth() - raVar.getPaddingLeft()) - raVar.getPaddingRight();
        qa[] qaVarArr = raVar.b;
        int length = width / qaVarArr.length;
        int min = Math.min(AndroidUtilities.dp(64.0f), length);
        float e = raVar.h.e(raVar.f);
        float f12 = 16.0f;
        Paint paint = raVar.c;
        if (e > 0.0f) {
            f10 = 41.0f;
            f11 = 9.0f;
            paint.setColor(i0.a.o(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var), (int) (((Math.abs((Math.floor(raVar.d) + 0.5d) - raVar.d) * 1.2000000476837158d) + 0.4000000059604645d) * 18.0d * e)));
            float paddingLeft = raVar.getPaddingLeft();
            float f13 = length;
            float floor = ((float) Math.floor(raVar.d)) * f13;
            float f14 = f13 / 2.0f;
            f7 = 2.0f;
            float lerp = AndroidUtilities.lerp(floor + f14, (f13 * ((float) Math.ceil(raVar.d))) + f14, raVar.d - ((int) r13)) + paddingLeft;
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
        while (i11 < qaVarArr.length) {
            qa qaVar = qaVarArr[i11];
            int paddingLeft2 = (i11 * length) + raVar.getPaddingLeft();
            RectF rectF2 = qaVar.h;
            StaticLayout staticLayout = qaVar.e;
            org.telegram.ui.Cells.z zVar = qaVar.c;
            float f16 = f12;
            uj0 uj0Var = qaVar.b;
            int i12 = length;
            qa[] qaVarArr2 = qaVarArr;
            rectF2.set(paddingLeft2, 0.0f, paddingLeft2 + length, raVar.getHeight());
            float min2 = 1.0f - Math.min(1.0f, Math.abs(raVar.d - i11));
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.D6, d6Var);
            int i13 = org.telegram.ui.ActionBar.h6.G6;
            int f17 = i0.a.f(min2, w02, org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
            qaVar.d.setColor(f17);
            if (qaVar.m != f17) {
                qaVar.m = f17;
                uj0Var.setColorFilter(new PorterDuffColorFilter(f17, PorterDuff.Mode.SRC_IN));
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float f18 = min / f7;
            int i14 = min;
            rect.set((int) (rectF2.centerX() - f18), AndroidUtilities.dp(f11), (int) (rectF2.centerX() + f18), AndroidUtilities.dp(f10));
            float e7 = qaVar.i.e(min2 > 0.6f);
            if (e < 1.0f) {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.h6.w0(i13, d6Var), (int) ((1.0f - e) * e7 * 18.0f)));
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rect);
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(f16), AndroidUtilities.dp(f16), paint);
            }
            zVar.setBounds(rect);
            zVar.draw(canvas);
            float dp = AndroidUtilities.dp(29.0f) / f7;
            rect.set((int) (rectF2.centerX() - dp), (int) (AndroidUtilities.dpf2(24.66f) - dp), (int) (rectF2.centerX() + dp), (int) (AndroidUtilities.dpf2(24.66f) + dp));
            uj0Var.setBounds(rect);
            uj0Var.draw(canvas);
            canvas.save();
            canvas.translate((rectF2.centerX() - (qaVar.f / f7)) - qaVar.g, AndroidUtilities.dp(50.0f) - (staticLayout.getHeight() / f7));
            staticLayout.draw(canvas);
            canvas.restore();
            i11++;
            raVar = this;
            f12 = f16;
            length = i12;
            qaVarArr = qaVarArr2;
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
        qa[] qaVarArr = this.b;
        if (action == 1 || motionEvent.getAction() == 2) {
            float x10 = motionEvent.getX();
            int i10 = 0;
            while (true) {
                if (i10 >= qaVarArr.length) {
                    i10 = -1;
                    break;
                }
                RectF rectF = qaVarArr[i10].h;
                if (rectF.left >= x10 || rectF.right <= x10) {
                    i10++;
                } else if (motionEvent.getAction() != 1) {
                    if (this.r) {
                        qaVarArr[i10].c.setState(new int[0]);
                    }
                    qaVarArr[i10].c.setState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled});
                }
            }
            for (int i11 = 0; i11 < qaVarArr.length; i11++) {
                if (i11 != i10 || motionEvent.getAction() == 1) {
                    qaVarArr[i11].c.setState(new int[0]);
                }
            }
            if (i10 >= 0 && this.e != i10 && (callback = this.n) != null) {
                callback.run(Integer.valueOf(i10));
            }
            this.r = false;
        } else if (motionEvent.getAction() == 3) {
            for (qa qaVar : qaVarArr) {
                qaVar.c.setState(new int[0]);
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
            qa[] qaVarArr = this.b;
            if (i10 >= qaVarArr.length) {
                return super.verifyDrawable(drawable);
            }
            if (qaVarArr[i10].c == drawable) {
                return true;
            }
            i10++;
        }
    }
}
