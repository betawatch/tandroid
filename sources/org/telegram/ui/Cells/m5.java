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
import org.telegram.messenger.ye;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m5 extends org.telegram.ui.Components.k9 {
    public final Paint H;
    public long I;
    public Drawable J;
    public Drawable K;
    public final /* synthetic */ q5 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(q5 q5Var, Context context) {
        super(context);
        this.L = q5Var;
        this.H = new Paint(1);
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        ye yeVar;
        Drawable drawable;
        org.telegram.ui.Components.g5 g5Var = this.e;
        ImageReceiver imageReceiver = g5Var != null ? g5Var.k : this.a;
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
        q5 q5Var = this.L;
        if (q5Var.P) {
            Rect rect = q5.c0;
            this.b.h(canvas, null);
            if (q5Var.O == null) {
                if (q5Var.N == null) {
                    yh.f fVar = new yh.f();
                    q5Var.N = fVar;
                    fVar.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                }
                q5Var.N.setBounds(0, 0, getWidth(), getHeight());
                q5Var.N.draw(canvas);
            }
            invalidate();
        }
        float f10 = q5Var.V;
        if (f10 != 1.0f && q5Var.T != null) {
            int interpolation = (int) (xq.f.getInterpolation(1.0f - f10) * 255.0f);
            Paint paint = this.H;
            paint.setAlpha(interpolation);
            canvas.drawBitmap(q5Var.T, 0.0f, 0.0f, paint);
            long min = Math.min(16L, System.currentTimeMillis() - this.I);
            Float f11 = q5Var.U;
            q5Var.V = f1.h(min, f11 == null ? 250.0f : f11.floatValue(), q5Var.V, 1.0f);
            this.I = System.currentTimeMillis();
            invalidate();
            if (q5Var.O != null) {
                q5Var.b.invalidate();
            }
        } else if (f10 == 1.0f && (bitmap = q5Var.T) != null) {
            bitmap.recycle();
            q5Var.T = null;
            q5Var.U = null;
            invalidate();
        }
        if (q5Var.s) {
            o5 o5Var = q5Var.W;
            if ((o5Var == null || !((sl) ((org.telegram.ui.Components.t) o5Var).b).s) && (yeVar = q5Var.I) != null && yeVar.i() && q5Var.I.d()) {
                if (q5Var.I.j()) {
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
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        q5 q5Var = this.L;
        ye yeVar = q5Var.I;
        q5Var.h(yeVar != null && yeVar.M);
    }
}
