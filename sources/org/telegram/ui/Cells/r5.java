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
import org.telegram.ui.Components.bm;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r5 extends org.telegram.ui.Components.g9 {
    public final Paint G;
    public long H;
    public Drawable I;
    public Drawable J;
    public final /* synthetic */ v5 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(v5 v5Var, Context context) {
        super(context);
        this.K = v5Var;
        this.G = new Paint(1);
    }

    @Override // org.telegram.ui.Components.g9, android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        ef efVar;
        Drawable drawable;
        org.telegram.ui.Components.f5 f5Var = this.e;
        ImageReceiver imageReceiver = f5Var != null ? f5Var.k : this.a;
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
        v5 v5Var = this.K;
        if (v5Var.N) {
            Rect rect = v5.a0;
            this.b.h(canvas, null);
            if (v5Var.M == null) {
                if (v5Var.L == null) {
                    nh.i iVar = new nh.i();
                    v5Var.L = iVar;
                    iVar.h(i0.b.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                }
                v5Var.L.setBounds(0, 0, getWidth(), getHeight());
                v5Var.L.draw(canvas);
            }
            invalidate();
        }
        float f7 = v5Var.T;
        if (f7 != 1.0f && v5Var.R != null) {
            int interpolation = (int) (gr.f.getInterpolation(1.0f - f7) * 255.0f);
            Paint paint = this.G;
            paint.setAlpha(interpolation);
            canvas.drawBitmap(v5Var.R, 0.0f, 0.0f, paint);
            long min = Math.min(16L, System.currentTimeMillis() - this.H);
            Float f10 = v5Var.S;
            v5Var.T = f1.e(min, f10 == null ? 250.0f : f10.floatValue(), v5Var.T, 1.0f);
            this.H = System.currentTimeMillis();
            invalidate();
            if (v5Var.M != null) {
                v5Var.b.invalidate();
            }
        } else if (f7 == 1.0f && (bitmap = v5Var.R) != null) {
            bitmap.recycle();
            v5Var.R = null;
            v5Var.S = null;
            invalidate();
        }
        if (v5Var.s) {
            t5 t5Var = v5Var.U;
            if ((t5Var == null || !((bm) ((org.telegram.ui.Components.t) t5Var).b).s) && (efVar = v5Var.G) != null && efVar.d()) {
                if (v5Var.G.i()) {
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
                drawable.setBounds((int) (imageReceiver.K0 + org.telegram.messenger.i0.L(8.0f)), (int) (imageReceiver.L0 + org.telegram.messenger.i0.L(8.0f)), (int) (imageReceiver.K0 + org.telegram.messenger.i0.L(30.0f)), (int) (imageReceiver.L0 + org.telegram.messenger.i0.L(26.0f)));
                drawable.draw(canvas);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        v5 v5Var = this.K;
        ef efVar = v5Var.G;
        v5Var.h(efVar != null && efVar.M);
    }
}
