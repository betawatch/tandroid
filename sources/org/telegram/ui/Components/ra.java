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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class ra extends View {
    public final org.telegram.ui.ActionBar.f6 a;
    public final qa[] b;
    public final Paint c;
    public float d;
    public int e;
    public boolean f;
    public final e6 h;
    public Utilities.Callback n;
    public boolean r;

    public ra(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.c = new Paint(1);
        this.h = new e6(this, 0L, 210L, pr.h);
        this.a = f6Var;
        ba0 ba0Var = (ba0) this;
        this.b = new qa[]{new qa(ba0Var, 0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new qa(ba0Var, 1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
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
            xi0 xi0Var = qaVar.b;
            if (qaVar.l != z11) {
                if (qaVar.n.b[qaVar.a].j != 0) {
                    if (z11) {
                        xi0Var.N(i12);
                        if (xi0Var.b0 >= i11 - 2) {
                            xi0Var.L(0, false, false);
                        }
                        if (xi0Var.b0 <= i12) {
                            xi0Var.start();
                        } else {
                            xi0Var.K(i12);
                        }
                    } else if (xi0Var.b0 >= i12 - 1) {
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
                qaVar.l = z11;
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
        ra raVar = this;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        org.telegram.ui.ActionBar.f6 f6Var2 = raVar.a;
        canvas.drawColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var2));
        canvas.drawRect(0.0f, 0.0f, raVar.getWidth(), AndroidUtilities.getShadowHeight(), org.telegram.ui.ActionBar.j6.k0);
        int width = (raVar.getWidth() - raVar.getPaddingLeft()) - raVar.getPaddingRight();
        qa[] qaVarArr = raVar.b;
        int length = width / qaVarArr.length;
        int min = Math.min(AndroidUtilities.dp(64.0f), length);
        float e7 = raVar.h.e(raVar.f);
        Paint paint = raVar.c;
        float f13 = 0.0f;
        if (e7 > 0.0f) {
            f7 = 9.0f;
            f10 = 16.0f;
            paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var2), (int) (((Math.abs((Math.floor(raVar.d) + 0.5d) - raVar.d) * 1.2000000476837158d) + 0.4000000059604645d) * 18.0d * e7)));
            float f14 = length;
            float f15 = f14 / 2.0f;
            f6Var = f6Var2;
            f11 = 41.0f;
            float lerp = AndroidUtilities.lerp((((float) Math.floor(raVar.d)) * f14) + f15, (f14 * ((float) Math.ceil(raVar.d))) + f15, raVar.d - ((int) r6)) + raVar.getPaddingLeft();
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
        while (i11 < qaVarArr.length) {
            qa qaVar = qaVarArr[i11];
            int paddingLeft = (i11 * length) + raVar.getPaddingLeft();
            RectF rectF2 = qaVar.h;
            StaticLayout staticLayout = qaVar.e;
            org.telegram.ui.Cells.z zVar = qaVar.c;
            xi0 xi0Var = qaVar.b;
            int i12 = length;
            rectF2.set(paddingLeft, f13, paddingLeft + length, raVar.getHeight());
            float min2 = 1.0f - Math.min(1.0f, Math.abs(raVar.d - i11));
            org.telegram.ui.ActionBar.f6 f6Var3 = f6Var;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.D6, f6Var3);
            int i13 = org.telegram.ui.ActionBar.j6.G6;
            int d = i0.a.d(min2, v02, org.telegram.ui.ActionBar.j6.v0(i13, f6Var3));
            qaVar.d.setColor(d);
            if (qaVar.m != d) {
                qaVar.m = d;
                f12 = min2;
                xi0Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            } else {
                f12 = min2;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float f17 = min / 2.0f;
            qa[] qaVarArr2 = qaVarArr;
            int i14 = min;
            rect.set((int) (rectF2.centerX() - f17), AndroidUtilities.dp(f7), (int) (rectF2.centerX() + f17), AndroidUtilities.dp(f11));
            float e10 = qaVar.i.e(f12 > 0.6f);
            if (e7 < 1.0f) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(i13, f6Var3), (int) ((1.0f - e7) * e10 * 18.0f)));
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
            canvas.translate((rectF2.centerX() - (qaVar.f / 2.0f)) - qaVar.g, AndroidUtilities.dp(50.0f) - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            i11++;
            raVar = this;
            f6Var = f6Var3;
            length = i12;
            qaVarArr = qaVarArr2;
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
