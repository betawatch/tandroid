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
import org.telegram.messenger.gf;
import org.telegram.ui.Components.tl;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class m5 extends org.telegram.ui.Components.l9 {
    public final Paint G;
    public long H;
    public Drawable I;
    public Drawable J;
    public final /* synthetic */ q5 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(q5 q5Var, Context context) {
        super(context);
        this.K = q5Var;
        this.G = new Paint(1);
    }

    @Override // org.telegram.ui.Components.l9, android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        gf gfVar;
        Drawable drawable;
        org.telegram.ui.Components.i5 i5Var = this.e;
        ImageReceiver imageReceiver = i5Var != null ? i5Var.k : this.a;
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
        q5 q5Var = this.K;
        if (q5Var.O) {
            Rect rect = q5.b0;
            this.b.h(canvas, null);
            if (q5Var.N == null) {
                if (q5Var.M == null) {
                    xh.f fVar = new xh.f();
                    q5Var.M = fVar;
                    fVar.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                }
                q5Var.M.setBounds(0, 0, getWidth(), getHeight());
                q5Var.M.draw(canvas);
            }
            invalidate();
        }
        float f10 = q5Var.U;
        if (f10 != 1.0f && q5Var.S != null) {
            int interpolation = (int) (xq.f.getInterpolation(1.0f - f10) * 255.0f);
            Paint paint = this.G;
            paint.setAlpha(interpolation);
            canvas.drawBitmap(q5Var.S, 0.0f, 0.0f, paint);
            long min = Math.min(16L, System.currentTimeMillis() - this.H);
            Float f11 = q5Var.T;
            q5Var.U = f1.e(min, f11 == null ? 250.0f : f11.floatValue(), q5Var.U, 1.0f);
            this.H = System.currentTimeMillis();
            invalidate();
            if (q5Var.N != null) {
                q5Var.b.invalidate();
            }
        } else if (f10 == 1.0f && (bitmap = q5Var.S) != null) {
            bitmap.recycle();
            q5Var.S = null;
            q5Var.T = null;
            invalidate();
        }
        if (q5Var.s) {
            o5 o5Var = q5Var.V;
            if ((o5Var == null || !((tl) ((org.telegram.ui.Components.u) o5Var).b).s) && (gfVar = q5Var.H) != null && gfVar.i() && q5Var.H.d()) {
                if (q5Var.H.j()) {
                    if (this.J == null) {
                        this.J = getContext().getResources().getDrawable(R.drawable.media_live_off).mutate();
                    }
                    drawable = this.J;
                } else {
                    if (this.I == null) {
                        this.I = getContext().getResources().getDrawable(R.drawable.media_live_on).mutate();
                    }
                    drawable = this.I;
                }
                drawable.setBounds((int) (imageReceiver.K0 + org.telegram.messenger.g0.L(8.0f)), (int) (imageReceiver.L0 + org.telegram.messenger.g0.L(8.0f)), (int) (imageReceiver.K0 + org.telegram.messenger.g0.L(30.0f)), (int) (imageReceiver.L0 + org.telegram.messenger.g0.L(26.0f)));
                drawable.draw(canvas);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        q5 q5Var = this.K;
        gf gfVar = q5Var.H;
        q5Var.h(gfVar != null && gfVar.M);
    }
}
