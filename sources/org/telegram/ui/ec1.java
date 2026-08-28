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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ec1 extends View {
    public org.telegram.ui.Components.nz0 a;
    public org.telegram.ui.Components.nz0 b;
    public boolean c;
    public final org.telegram.ui.Components.y5 d;
    public final org.telegram.ui.Cells.z e;
    public final ColorMatrixColorFilter f;
    public final Paint h;
    public final Paint n;
    public final /* synthetic */ oc1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec1(Context context, oc1 oc1Var) {
        super(context);
        this.r = oc1Var;
        this.d = new org.telegram.ui.Components.y5(this, 0L, 350L, org.telegram.ui.Components.gr.h);
        org.telegram.ui.Cells.z Y = org.telegram.ui.ActionBar.f6.Y(285212671, 8, 8);
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
        org.telegram.ui.Components.nz0 nz0Var = this.a;
        if (nz0Var != null) {
            return nz0Var.k();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        if (spannableStringBuilder != null) {
            this.b = new org.telegram.ui.Components.nz0(spannableStringBuilder, 12.0f, null);
        }
        boolean z11 = spannableStringBuilder != null;
        this.c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.a = new org.telegram.ui.Components.nz0(charSequence, 14.0f, AndroidUtilities.bold());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        oc1 oc1Var = this.r;
        dc1 dc1Var = oc1Var.t0;
        ob1 ob1Var = oc1Var.a;
        org.telegram.ui.ActionBar.f6.s(this, dc1Var, ob1Var);
        Paint O = ob1Var.O("paintChatActionBackground");
        ColorFilter colorFilter = O.getColorFilter();
        O.setColorFilter(this.f);
        canvas.drawRoundRect(rectF, height, height, O);
        O.setColorFilter(colorFilter);
        if (oc1Var.I1) {
            float f10 = oc1Var.j1;
            if (f10 > 0.0f) {
                int k10 = i0.a.k(-16777216, (int) (f10 * 255.0f * oc1Var.k1));
                Paint paint = this.n;
                paint.setColor(k10);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float e10 = this.d.e(this.c);
        org.telegram.ui.Components.nz0 nz0Var = this.a;
        if (nz0Var != null) {
            nz0Var.p = getWidth() - AndroidUtilities.dp(14.0f);
            nz0Var.c((getWidth() - this.a.l()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * e10), 1.0f, -1, canvas);
        }
        if (this.b != null) {
            canvas.save();
            canvas.scale(e10, e10, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
            org.telegram.ui.Components.nz0 nz0Var2 = this.b;
            nz0Var2.p = getWidth() - AndroidUtilities.dp(14.0f);
            nz0Var2.c((getWidth() - this.b.l()) / 2.0f, AndroidUtilities.dp(11.0f) + (0.0f * AndroidUtilities.dp(24.0f)) + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.f6.l1(0.75f, -1), canvas);
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
