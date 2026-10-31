package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k extends FrameLayout {
    public final org.telegram.ui.Components.e6 a;
    public final Paint b;
    public final rf.m c;
    public final Drawable d;
    public final int e;
    public int f;

    public k(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new rf.m(new ca(this, 1));
        this.e = i10;
        this.d = i0.a.f(context, R.drawable.filled_gift_sell_24);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, false, false);
        this.a = e6Var;
        e6Var.M = org.telegram.messenger.i0.q.x;
        e6Var.setCallback(this);
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.w(org.telegram.messenger.i0.L(14.0f));
        e6Var.u(-1);
        e6Var.b = 3;
        paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(72.0f), 0.0f, new int[]{-13460514, -10042885}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void a(int i10) {
        this.f = i10;
        if (isAttachedToWindow()) {
            long max = Math.max(0, i10 - ConnectionsManager.getInstance(this.e).getCurrentTime());
            this.c.a(max);
            b(max);
        }
    }

    public final void b(long j10) {
        org.telegram.ui.Components.e6 e6Var = this.a;
        if (j10 == 0) {
            e6Var.t(cd.L0(2131750345, null), true, true);
        } else {
            e6Var.t(j10 > 3600 ? org.telegram.messenger.i0.g0((int) j10, false, false) : org.telegram.messenger.i0.h0((int) j10, false), isAttachedToWindow(), true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(14.0f);
        org.telegram.ui.Components.e6 e6Var = this.a;
        int c10 = measuredWidth - ((int) e6Var.c());
        int L = c10 - org.telegram.messenger.i0.L(30.0f);
        canvas.save();
        canvas.translate(L, 0.0f);
        canvas.drawRoundRect(0.0f, 0.0f, getWidth() - L, getHeight(), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), this.b);
        canvas.restore();
        e6Var.setBounds(c10, 0, getMeasuredWidth() - org.telegram.messenger.i0.L(8.0f), getMeasuredHeight() - org.telegram.messenger.i0.L(1.0f));
        e6Var.draw(canvas);
        int L2 = org.telegram.messenger.i0.L(-22.0f) + c10;
        int L3 = org.telegram.messenger.i0.L(5.0f);
        int L4 = org.telegram.messenger.i0.L(-4.0f) + c10;
        int L5 = org.telegram.messenger.i0.L(23.0f);
        Drawable drawable = this.d;
        drawable.setBounds(L2, L3, L4, L5);
        drawable.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(this.f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(zs.C2), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(28), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
