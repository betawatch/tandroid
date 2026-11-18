package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ef;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class o5 extends org.telegram.ui.Components.q9 {
    public final Paint H;
    public long I;
    public Drawable J;
    public Drawable K;
    public final /* synthetic */ s5 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(s5 s5Var, Context context) {
        super(context);
        this.L = s5Var;
        this.H = new Paint(1);
    }

    @Override // org.telegram.ui.Components.q9, android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        ef efVar;
        Drawable drawable;
        org.telegram.ui.Components.o5 o5Var = this.e;
        ImageReceiver imageReceiver = o5Var != null ? o5Var.k : this.a;
        if (imageReceiver == null) {
            return;
        }
        if (this.c == -1 || this.d == -1) {
            imageReceiver.y0(0.0f, 0.0f, getWidth(), getHeight());
            this.b.y0(0.0f, 0.0f, getWidth(), getHeight());
        } else {
            float width = (getWidth() - this.c) / 2;
            int height = getHeight();
            imageReceiver.y0(width, (height - r5) / 2, this.c, this.d);
            ImageReceiver imageReceiver2 = this.b;
            float width2 = (getWidth() - this.c) / 2;
            int height2 = getHeight();
            imageReceiver2.y0(width2, (height2 - r6) / 2, this.c, this.d);
        }
        imageReceiver.h(canvas, null);
        s5 s5Var = this.L;
        if (s5Var.P) {
            Rect rect = s5.c0;
            this.b.h(canvas, null);
            if (s5Var.O == null) {
                if (s5Var.N == null) {
                    xh.f fVar = new xh.f();
                    s5Var.N = fVar;
                    fVar.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                }
                s5Var.N.setBounds(0, 0, getWidth(), getHeight());
                s5Var.N.draw(canvas);
            }
            invalidate();
        }
        float f10 = s5Var.V;
        if (f10 != 1.0f && s5Var.T != null) {
            int interpolation = (int) (lr.f.getInterpolation(1.0f - f10) * 255.0f);
            Paint paint = this.H;
            paint.setAlpha(interpolation);
            canvas.drawBitmap(s5Var.T, 0.0f, 0.0f, paint);
            long min = Math.min(16L, System.currentTimeMillis() - this.I);
            Float f11 = s5Var.U;
            s5Var.V = c0.f(min, f11 == null ? 250.0f : f11.floatValue(), s5Var.V, 1.0f);
            this.I = System.currentTimeMillis();
            invalidate();
            if (s5Var.O != null) {
                s5Var.b.invalidate();
            }
        } else if (f10 == 1.0f && (bitmap = s5Var.T) != null) {
            bitmap.recycle();
            s5Var.T = null;
            s5Var.U = null;
            invalidate();
        }
        if (s5Var.s) {
            q5 q5Var = s5Var.W;
            if ((q5Var == null || !((hm) ((org.telegram.ui.Components.b0) q5Var).b).s) && (efVar = s5Var.I) != null && efVar.i() && s5Var.I.d()) {
                if (s5Var.I.j()) {
                    if (this.K == null) {
                        this.K = getContext().getResources().getDrawable(R.drawable.media_live_off).mutate();
                    }
                    drawable = this.K;
                } else {
                    if (this.J == null) {
                        this.J = getContext().getResources().getDrawable(R.drawable.media_live_on).mutate();
                    }
                    drawable = this.J;
                }
                drawable.setBounds((int) (imageReceiver.L0 + org.telegram.messenger.g0.L(8.0f)), (int) (imageReceiver.M0 + org.telegram.messenger.g0.L(8.0f)), (int) (imageReceiver.L0 + org.telegram.messenger.g0.L(30.0f)), (int) (imageReceiver.M0 + org.telegram.messenger.g0.L(26.0f)));
                drawable.draw(canvas);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        s5 s5Var = this.L;
        ef efVar = s5Var.I;
        s5Var.h(efVar != null && efVar.M);
    }
}
