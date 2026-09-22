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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class pa extends View {
    public final org.telegram.ui.ActionBar.e6 a;
    public final oa[] b;
    public final Paint c;
    public float d;
    public int e;
    public boolean f;
    public final c6 h;
    public Utilities.Callback n;
    public boolean r;

    public pa(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.c = new Paint(1);
        this.h = new c6(this, 0L, 210L, qr.h);
        this.a = e6Var;
        aa0 aa0Var = (aa0) this;
        this.b = new oa[]{new oa(aa0Var, 0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new oa(aa0Var, 1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        a(0.0f, false);
    }

    public final void a(float f7, boolean z10) {
        oa[] oaVarArr = this.b;
        float clamp = Utilities.clamp(f7, oaVarArr.length, 0.0f);
        this.d = clamp;
        this.e = Math.round(clamp);
        for (int i10 = 0; i10 < oaVarArr.length; i10++) {
            oa oaVar = oaVarArr[i10];
            boolean z11 = ((float) Math.abs(this.e - i10)) < (oaVarArr[i10].l ? 0.25f : 0.35f);
            int i11 = oaVar.k;
            int i12 = oaVar.j;
            xi0 xi0Var = oaVar.b;
            if (oaVar.l != z11) {
                if (oaVar.n.b[oaVar.a].j != 0) {
                    if (z11) {
                        xi0Var.P(i12);
                        if (xi0Var.a0 >= i11 - 2) {
                            xi0Var.N(0, false, false);
                        }
                        if (xi0Var.a0 <= i12) {
                            xi0Var.start();
                        } else {
                            xi0Var.M(i12);
                        }
                    } else if (xi0Var.a0 >= i12 - 1) {
                        xi0Var.P(i11 - 1);
                        xi0Var.start();
                    } else {
                        xi0Var.P(0);
                        xi0Var.M(0);
                    }
                } else if (z11) {
                    xi0Var.M(0);
                    if (z10) {
                        xi0Var.start();
                    }
                }
                oaVar.l = z11;
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.e6 e6Var;
        float f7;
        float f10;
        float f11;
        float f12;
        pa paVar = this;
        int i10 = org.telegram.ui.ActionBar.i6.d6;
        org.telegram.ui.ActionBar.e6 e6Var2 = paVar.a;
        canvas.drawColor(org.telegram.ui.ActionBar.i6.v0(i10, e6Var2));
        canvas.drawRect(0.0f, 0.0f, paVar.getWidth(), AndroidUtilities.getShadowHeight(), org.telegram.ui.ActionBar.i6.k0);
        int width = (paVar.getWidth() - paVar.getPaddingLeft()) - paVar.getPaddingRight();
        oa[] oaVarArr = paVar.b;
        int length = width / oaVarArr.length;
        int min = Math.min(AndroidUtilities.dp(64.0f), length);
        float e = paVar.h.e(paVar.f);
        Paint paint = paVar.c;
        float f13 = 0.0f;
        if (e > 0.0f) {
            f7 = 9.0f;
            f10 = 16.0f;
            paint.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var2), (int) (((Math.abs((Math.floor(paVar.d) + 0.5d) - paVar.d) * 1.2000000476837158d) + 0.4000000059604645d) * 18.0d * e)));
            float f14 = length;
            float f15 = f14 / 2.0f;
            e6Var = e6Var2;
            f11 = 41.0f;
            float lerp = AndroidUtilities.lerp((((float) Math.floor(paVar.d)) * f14) + f15, (f14 * ((float) Math.ceil(paVar.d))) + f15, paVar.d - ((int) r6)) + paVar.getPaddingLeft();
            RectF rectF = AndroidUtilities.rectTmp;
            float f16 = min / 2.0f;
            rectF.set(lerp - f16, AndroidUtilities.dp(9.0f), lerp + f16, AndroidUtilities.dp(41.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
        } else {
            e6Var = e6Var2;
            f7 = 9.0f;
            f10 = 16.0f;
            f11 = 41.0f;
        }
        int i11 = 0;
        while (i11 < oaVarArr.length) {
            oa oaVar = oaVarArr[i11];
            int paddingLeft = (i11 * length) + paVar.getPaddingLeft();
            RectF rectF2 = oaVar.h;
            StaticLayout staticLayout = oaVar.e;
            org.telegram.ui.Cells.z zVar = oaVar.c;
            xi0 xi0Var = oaVar.b;
            int i12 = length;
            rectF2.set(paddingLeft, f13, paddingLeft + length, paVar.getHeight());
            float min2 = 1.0f - Math.min(1.0f, Math.abs(paVar.d - i11));
            org.telegram.ui.ActionBar.e6 e6Var3 = e6Var;
            int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.D6, e6Var3);
            int i13 = org.telegram.ui.ActionBar.i6.G6;
            int d = i0.a.d(min2, v02, org.telegram.ui.ActionBar.i6.v0(i13, e6Var3));
            oaVar.d.setColor(d);
            if (oaVar.m != d) {
                oaVar.m = d;
                f12 = min2;
                xi0Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            } else {
                f12 = min2;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float f17 = min / 2.0f;
            oa[] oaVarArr2 = oaVarArr;
            int i14 = min;
            rect.set((int) (rectF2.centerX() - f17), AndroidUtilities.dp(f7), (int) (rectF2.centerX() + f17), AndroidUtilities.dp(f11));
            float e7 = oaVar.i.e(f12 > 0.6f);
            if (e < 1.0f) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.v0(i13, e6Var3), (int) ((1.0f - e) * e7 * 18.0f)));
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
            canvas.translate((rectF2.centerX() - (oaVar.f / 2.0f)) - oaVar.g, AndroidUtilities.dp(50.0f) - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            i11++;
            paVar = this;
            e6Var = e6Var3;
            length = i12;
            oaVarArr = oaVarArr2;
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
        oa[] oaVarArr = this.b;
        if (action == 1 || motionEvent.getAction() == 2) {
            float x10 = motionEvent.getX();
            int i10 = 0;
            while (true) {
                if (i10 >= oaVarArr.length) {
                    i10 = -1;
                    break;
                }
                RectF rectF = oaVarArr[i10].h;
                if (rectF.left >= x10 || rectF.right <= x10) {
                    i10++;
                } else if (motionEvent.getAction() != 1) {
                    if (this.r) {
                        oaVarArr[i10].c.setState(new int[0]);
                    }
                    oaVarArr[i10].c.setState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled});
                }
            }
            for (int i11 = 0; i11 < oaVarArr.length; i11++) {
                if (i11 != i10 || motionEvent.getAction() == 1) {
                    oaVarArr[i11].c.setState(new int[0]);
                }
            }
            if (i10 >= 0 && this.e != i10 && (callback = this.n) != null) {
                callback.run(Integer.valueOf(i10));
            }
            this.r = false;
        } else if (motionEvent.getAction() == 3) {
            for (oa oaVar : oaVarArr) {
                oaVar.c.setState(new int[0]);
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
            oa[] oaVarArr = this.b;
            if (i10 >= oaVarArr.length) {
                return super.verifyDrawable(drawable);
            }
            if (oaVarArr[i10].c == drawable) {
                return true;
            }
            i10++;
        }
    }
}
