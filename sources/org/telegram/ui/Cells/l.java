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
import org.telegram.messenger.hd;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class l extends FrameLayout {
    public final org.telegram.ui.Components.i6 a;
    public final Paint b;
    public final bg.q c;
    public final Drawable d;
    public final int e;
    public int f;

    public l(Context context, int i7) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new bg.q(new ca(this, 1));
        this.e = i7;
        this.d = jg.g.h(context, R.drawable.filled_gift_sell_24);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false);
        this.a = i6Var;
        i6Var.M = org.telegram.messenger.g0.q.x;
        i6Var.setCallback(this);
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.w(org.telegram.messenger.g0.L(14.0f));
        i6Var.u(-1);
        i6Var.b = 3;
        paint.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(72.0f), 0.0f, new int[]{-13460514, -10042885}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void a(int i7) {
        this.f = i7;
        if (isAttachedToWindow()) {
            long max = Math.max(0, i7 - ConnectionsManager.getInstance(this.e).getCurrentTime());
            this.c.a(max);
            b(max);
        }
    }

    public final void b(long j3) {
        org.telegram.ui.Components.i6 i6Var = this.a;
        if (j3 == 0) {
            i6Var.t(hd.M0(2131750335, null), true, true);
        } else {
            i6Var.t(j3 > 3600 ? org.telegram.messenger.g0.g0((int) j3, false, false) : org.telegram.messenger.g0.h0((int) j3, false), isAttachedToWindow(), true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(14.0f);
        org.telegram.ui.Components.i6 i6Var = this.a;
        int c10 = measuredWidth - ((int) i6Var.c());
        int L = c10 - org.telegram.messenger.g0.L(30.0f);
        canvas.save();
        canvas.translate(L, 0.0f);
        canvas.drawRoundRect(0.0f, 0.0f, getWidth() - L, getHeight(), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.b);
        canvas.restore();
        i6Var.setBounds(c10, 0, getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(1.0f));
        i6Var.draw(canvas);
        int L2 = org.telegram.messenger.g0.L(-22.0f) + c10;
        int L3 = org.telegram.messenger.g0.L(5.0f);
        int L4 = org.telegram.messenger.g0.L(-4.0f) + c10;
        int L5 = org.telegram.messenger.g0.L(23.0f);
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(qs.C2), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
