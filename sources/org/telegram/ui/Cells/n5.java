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
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class n5 extends org.telegram.ui.Components.p9 {
    public final Paint H;
    public long I;
    public Drawable J;
    public Drawable K;
    public final /* synthetic */ r5 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(r5 r5Var, Context context) {
        super(context);
        this.L = r5Var;
        this.H = new Paint(1);
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
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
            imageReceiver.z0(0.0f, 0.0f, getWidth(), getHeight());
            this.b.z0(0.0f, 0.0f, getWidth(), getHeight());
        } else {
            float width = (getWidth() - this.c) / 2;
            int height = getHeight();
            imageReceiver.z0(width, (height - r5) / 2, this.c, this.d);
            ImageReceiver imageReceiver2 = this.b;
            float width2 = (getWidth() - this.c) / 2;
            int height2 = getHeight();
            imageReceiver2.z0(width2, (height2 - r6) / 2, this.c, this.d);
        }
        imageReceiver.h(canvas, null);
        r5 r5Var = this.L;
        if (r5Var.P) {
            Rect rect = r5.c0;
            this.b.h(canvas, null);
            if (r5Var.O == null) {
                if (r5Var.N == null) {
                    xh.f fVar = new xh.f();
                    r5Var.N = fVar;
                    fVar.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                }
                r5Var.N.setBounds(0, 0, getWidth(), getHeight());
                r5Var.N.draw(canvas);
            }
            invalidate();
        }
        float f10 = r5Var.V;
        if (f10 != 1.0f && r5Var.T != null) {
            int interpolation = (int) (kr.f.getInterpolation(1.0f - f10) * 255.0f);
            Paint paint = this.H;
            paint.setAlpha(interpolation);
            canvas.drawBitmap(r5Var.T, 0.0f, 0.0f, paint);
            long min = Math.min(16L, System.currentTimeMillis() - this.I);
            Float f11 = r5Var.U;
            r5Var.V = c0.f(min, f11 == null ? 250.0f : f11.floatValue(), r5Var.V, 1.0f);
            this.I = System.currentTimeMillis();
            invalidate();
            if (r5Var.O != null) {
                r5Var.b.invalidate();
            }
        } else if (f10 == 1.0f && (bitmap = r5Var.T) != null) {
            bitmap.recycle();
            r5Var.T = null;
            r5Var.U = null;
            invalidate();
        }
        if (r5Var.s) {
            p5 p5Var = r5Var.W;
            if ((p5Var == null || !((hm) ((org.telegram.ui.Components.b0) p5Var).b).s) && (efVar = r5Var.I) != null && efVar.i() && r5Var.I.d()) {
                if (r5Var.I.j()) {
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
        r5 r5Var = this.L;
        ef efVar = r5Var.I;
        r5Var.h(efVar != null && efVar.M);
    }
}
