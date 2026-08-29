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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gc1 extends View {
    public org.telegram.ui.Components.zz0 a;
    public org.telegram.ui.Components.zz0 b;
    public boolean c;
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Cells.z e;
    public final ColorMatrixColorFilter f;
    public final Paint h;
    public final Paint n;
    public final /* synthetic */ qc1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc1(Context context, qc1 qc1Var) {
        super(context);
        this.r = qc1Var;
        this.d = new org.telegram.ui.Components.d6(this, 0L, 350L, org.telegram.ui.Components.jr.h);
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
        org.telegram.ui.Components.zz0 zz0Var = this.a;
        if (zz0Var != null) {
            return zz0Var.k();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        if (spannableStringBuilder != null) {
            this.b = new org.telegram.ui.Components.zz0(spannableStringBuilder, 12.0f, null);
        }
        boolean z11 = spannableStringBuilder != null;
        this.c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.a = new org.telegram.ui.Components.zz0(charSequence, 14.0f, AndroidUtilities.bold());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        qc1 qc1Var = this.r;
        fc1 fc1Var = qc1Var.t0;
        pb1 pb1Var = qc1Var.a;
        org.telegram.ui.ActionBar.g6.s(this, fc1Var, pb1Var);
        Paint G = pb1Var.G("paintChatActionBackground");
        ColorFilter colorFilter = G.getColorFilter();
        G.setColorFilter(this.f);
        canvas.drawRoundRect(rectF, height, height, G);
        G.setColorFilter(colorFilter);
        if (qc1Var.I1) {
            float f9 = qc1Var.j1;
            if (f9 > 0.0f) {
                int k9 = i0.a.k(-16777216, (int) (f9 * 255.0f * qc1Var.k1));
                Paint paint = this.n;
                paint.setColor(k9);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float e10 = this.d.e(this.c);
        org.telegram.ui.Components.zz0 zz0Var = this.a;
        if (zz0Var != null) {
            zz0Var.p = getWidth() - AndroidUtilities.dp(14.0f);
            zz0Var.c((getWidth() - this.a.l()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * e10), 1.0f, -1, canvas);
        }
        if (this.b != null) {
            canvas.save();
            canvas.scale(e10, e10, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
            org.telegram.ui.Components.zz0 zz0Var2 = this.b;
            zz0Var2.p = getWidth() - AndroidUtilities.dp(14.0f);
            zz0Var2.c((getWidth() - this.b.l()) / 2.0f, AndroidUtilities.dp(11.0f) + (0.0f * AndroidUtilities.dp(24.0f)) + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.g6.l1(0.75f, -1), canvas);
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
