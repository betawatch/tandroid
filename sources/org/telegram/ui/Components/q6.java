package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class q6 extends View {
    public final ImageReceiver a;
    public final Drawable b;
    public final Paint c;
    public final Paint d;

    public q6(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        imageReceiver.setAlpha(0.0f);
        imageReceiver.g1 = new u(this, 12);
        this.b = context.getDrawable(R.drawable.input_attach).mutate().getConstantState().newDrawable();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.R();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), org.telegram.messenger.g0.L(10.0f) + getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), this.d);
        float L = org.telegram.messenger.g0.L(42.0f);
        float L2 = org.telegram.messenger.g0.L(42.0f);
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0((getWidth() / 2.0f) - org.telegram.messenger.g0.L(66.0f), (getHeight() / 2.0f) - (org.telegram.messenger.g0.L(42.0f) / 2.0f), L, L2);
        imageReceiver.h(canvas, null);
        Paint paint = this.c;
        canvas.drawLine((getWidth() / 2.0f) - org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, (getWidth() / 2.0f) + org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(getWidth() / 2.0f, (getHeight() / 2.0f) - org.telegram.messenger.g0.L(8.0f), getWidth() / 2.0f, org.telegram.messenger.g0.L(8.0f) + (getHeight() / 2.0f), paint);
        int L3 = org.telegram.messenger.g0.L(24.0f) + (getWidth() / 2);
        int height = (getHeight() / 2) - (org.telegram.messenger.g0.L(42.0f) / 2);
        int L4 = org.telegram.messenger.g0.L(66.0f) + (getWidth() / 2);
        int L5 = (org.telegram.messenger.g0.L(42.0f) / 2) + (getHeight() / 2);
        Drawable drawable = this.b;
        drawable.setBounds(L3, height, L4, L5);
        drawable.draw(canvas);
    }

    public void setAttachBot(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_attachMenuBotIcon k02 = org.telegram.messenger.ui.k0(tL_attachMenuBot);
        if (k02 != null) {
            this.a.q0(org.telegram.messenger.hc.b(k02.icon), "42_42", org.telegram.messenger.t5.f(k02.icon, org.telegram.ui.ActionBar.k6.q5, 1.0f, null), "svg", tL_attachMenuBot, 0);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        this.d.setColor(i7);
    }

    public void setColor(int i7) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.b.setColorFilter(i7, mode);
        this.c.setColor(i7);
        this.a.o1 = new PorterDuffColorFilter(i7, mode);
    }
}
