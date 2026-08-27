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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class dc1 extends View {
    public org.telegram.ui.Components.pz0 a;
    public org.telegram.ui.Components.pz0 b;
    public boolean c;
    public final org.telegram.ui.Components.y5 d;
    public final org.telegram.ui.Cells.z e;
    public final ColorMatrixColorFilter f;
    public final Paint h;
    public final Paint n;
    public final /* synthetic */ nc1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc1(Context context, nc1 nc1Var) {
        super(context);
        this.r = nc1Var;
        this.d = new org.telegram.ui.Components.y5(this, 0L, 350L, org.telegram.ui.Components.er.h);
        org.telegram.ui.Cells.z Y = org.telegram.ui.ActionBar.g6.Y(285212671, 8, 8);
        this.e = Y;
        this.h = new Paint(1);
        this.n = new Paint(1);
        Y.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
        this.f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.pz0 pz0Var = this.a;
        if (pz0Var != null) {
            return pz0Var.k();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        if (spannableStringBuilder != null) {
            this.b = new org.telegram.ui.Components.pz0(spannableStringBuilder, 12.0f, null);
        }
        boolean z11 = spannableStringBuilder != null;
        this.c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.a = new org.telegram.ui.Components.pz0(charSequence, 14.0f, AndroidUtilities.bold());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        nc1 nc1Var = this.r;
        cc1 cc1Var = nc1Var.t0;
        mb1 mb1Var = nc1Var.a;
        org.telegram.ui.ActionBar.g6.s(this, cc1Var, mb1Var);
        Paint N = mb1Var.N("paintChatActionBackground");
        ColorFilter colorFilter = N.getColorFilter();
        N.setColorFilter(this.f);
        canvas.drawRoundRect(rectF, height, height, N);
        N.setColorFilter(colorFilter);
        if (nc1Var.I1) {
            float f10 = nc1Var.j1;
            if (f10 > 0.0f) {
                int k10 = i0.b.k(-16777216, (int) (f10 * 255.0f * nc1Var.k1));
                Paint paint = this.n;
                paint.setColor(k10);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float e9 = this.d.e(this.c);
        org.telegram.ui.Components.pz0 pz0Var = this.a;
        if (pz0Var != null) {
            pz0Var.p = getWidth() - AndroidUtilities.dp(14.0f);
            pz0Var.c((getWidth() - this.a.l()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * e9), 1.0f, -1, canvas);
        }
        if (this.b != null) {
            canvas.save();
            canvas.scale(e9, e9, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
            org.telegram.ui.Components.pz0 pz0Var2 = this.b;
            pz0Var2.p = getWidth() - AndroidUtilities.dp(14.0f);
            pz0Var2.c((getWidth() - this.b.l()) / 2.0f, AndroidUtilities.dp(11.0f) + (0.0f * AndroidUtilities.dp(24.0f)) + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.g6.l1(0.75f, -1), canvas);
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
