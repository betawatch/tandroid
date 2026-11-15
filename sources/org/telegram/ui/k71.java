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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class k71 extends View {
    public org.telegram.ui.Components.oy0 a;
    public org.telegram.ui.Components.oy0 b;
    public boolean c;
    public final org.telegram.ui.Components.u5 d;
    public final org.telegram.ui.Cells.y e;
    public final ColorMatrixColorFilter f;
    public final Paint h;
    public final Paint n;
    public final /* synthetic */ t71 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k71(Context context, t71 t71Var) {
        super(context);
        this.r = t71Var;
        this.d = new org.telegram.ui.Components.u5(this, 0L, 350L, org.telegram.ui.Components.er.h);
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(285212671, 8, 8);
        this.e = a02;
        this.h = new Paint(1);
        this.n = new Paint(1);
        a02.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.35f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
        this.f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.oy0 oy0Var = this.a;
        if (oy0Var != null) {
            return oy0Var.j();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        if (spannableStringBuilder != null) {
            this.b = new org.telegram.ui.Components.oy0(spannableStringBuilder, 12.0f, null);
        }
        boolean z11 = spannableStringBuilder != null;
        this.c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.a = new org.telegram.ui.Components.oy0(charSequence, 14.0f, org.telegram.messenger.g0.o());
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        t71 t71Var = this.r;
        j71 j71Var = t71Var.z0;
        s61 s61Var = t71Var.a;
        org.telegram.ui.ActionBar.j6.t(this, j71Var, s61Var);
        Paint d = s61Var.d("paintChatActionBackground");
        ColorFilter colorFilter = d.getColorFilter();
        d.setColorFilter(this.f);
        canvas.drawRoundRect(rectF, height, height, d);
        d.setColorFilter(colorFilter);
        if (t71Var.O1) {
            float f10 = t71Var.p1;
            if (f10 > 0.0f) {
                int o4 = i0.a.o(-16777216, (int) (f10 * 255.0f * t71Var.q1));
                Paint paint = this.n;
                paint.setColor(o4);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float d2 = this.d.d(this.c);
        org.telegram.ui.Components.oy0 oy0Var = this.a;
        if (oy0Var != null) {
            oy0Var.p = getWidth() - org.telegram.messenger.g0.L(14.0f);
            oy0Var.c((getWidth() - this.a.k()) / 2.0f, ((org.telegram.messenger.g0.L(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (org.telegram.messenger.g0.L(7.0f) * d2), 1.0f, -1, canvas);
        }
        if (this.b != null) {
            canvas.save();
            canvas.scale(d2, d2, getWidth() / 2.0f, (getHeight() / 2.0f) + org.telegram.messenger.g0.L(11.0f));
            org.telegram.ui.Components.oy0 oy0Var2 = this.b;
            oy0Var2.p = getWidth() - org.telegram.messenger.g0.L(14.0f);
            oy0Var2.c((getWidth() - this.b.k()) / 2.0f, org.telegram.messenger.g0.L(11.0f) + (0.0f * org.telegram.messenger.g0.L(24.0f)) + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.j6.r1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.y yVar = this.e;
        yVar.setBounds(0, 0, width, height2);
        yVar.draw(canvas);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.y yVar = this.e;
        if (action == 0) {
            yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
            yVar.setState(new int[]{R.attr.state_enabled, R.attr.state_pressed});
            z10 = true;
        } else {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                yVar.setState(StateSet.NOTHING);
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
