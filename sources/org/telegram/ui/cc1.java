package org.telegram.ui;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class cc1 extends View {
    public org.telegram.ui.Components.d11 a;
    public org.telegram.ui.Components.d11 b;
    public boolean c;
    public final org.telegram.ui.Components.f6 d;
    public final org.telegram.ui.Cells.z e;
    public final ColorMatrixColorFilter f;
    public final Paint h;
    public final Paint n;
    public final /* synthetic */ mc1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc1(Context context, mc1 mc1Var) {
        super(context);
        this.r = mc1Var;
        this.d = new org.telegram.ui.Components.f6(this, 0L, 350L, org.telegram.ui.Components.bs.h);
        org.telegram.ui.Cells.z Z = org.telegram.ui.ActionBar.h6.Z(285212671, 8, 8);
        this.e = Z;
        this.h = new Paint(1);
        this.n = new Paint(1);
        Z.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
        this.f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.d11 d11Var = this.a;
        if (d11Var != null) {
            return d11Var.k();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        if (spannableStringBuilder != null) {
            this.b = new org.telegram.ui.Components.d11(spannableStringBuilder, 12.0f, null);
        }
        boolean z11 = spannableStringBuilder != null;
        this.c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.a = new org.telegram.ui.Components.d11(charSequence, 14.0f, AndroidUtilities.bold());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        mc1 mc1Var = this.r;
        bc1 bc1Var = mc1Var.x0;
        mb1 mb1Var = mc1Var.a;
        org.telegram.ui.ActionBar.h6.s(this, bc1Var, mb1Var);
        Paint n10 = mb1Var.n("paintChatActionBackground");
        ColorFilter colorFilter = n10.getColorFilter();
        n10.setColorFilter(this.f);
        canvas.drawRoundRect(rectF, height, height, n10);
        n10.setColorFilter(colorFilter);
        if (mc1Var.M1) {
            float f7 = mc1Var.n1;
            if (f7 > 0.0f) {
                int o10 = i0.a.o(-16777216, (int) (f7 * 255.0f * mc1Var.o1));
                Paint paint = this.n;
                paint.setColor(o10);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float e = this.d.e(this.c);
        org.telegram.ui.Components.d11 d11Var = this.a;
        if (d11Var != null) {
            d11Var.p = getWidth() - AndroidUtilities.dp(14.0f);
            d11Var.c((getWidth() - this.a.l()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * e), 1.0f, -1, canvas);
        }
        if (this.b != null) {
            canvas.save();
            canvas.scale(e, e, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
            org.telegram.ui.Components.d11 d11Var2 = this.b;
            d11Var2.p = getWidth() - AndroidUtilities.dp(14.0f);
            d11Var2.c((getWidth() - this.b.l()) / 2.0f, AndroidUtilities.dp(11.0f) + (0.0f * AndroidUtilities.dp(24.0f)) + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.h6.m1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.z zVar = this.e;
        zVar.setBounds(0, 0, width, height2);
        zVar.draw(canvas);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.e;
        if (action == 0) {
            zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
            zVar.setState(new int[]{R.attr.state_enabled, R.attr.state_pressed});
            z10 = true;
        } else {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                zVar.setState(StateSet.NOTHING);
            }
            z10 = false;
        }
        return super.onTouchEvent(motionEvent) || z10;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e || super.verifyDrawable(drawable);
    }
}
