// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class j48 extends be0 {
    public final Paint H;
    public long I;
    public Drawable J;
    public Drawable K;
    public final /* synthetic */ o48 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j48(o48 o48Var, Context context) {
        super(context);
        this.L = o48Var;
        this.H = new Paint(1);
    }

    @Override // be0, android.view.View
    public final void onDraw(Canvas canvas) {
        jm6 jm6Var;
        Drawable drawable;
        vl vlVar = this.e;
        ImageReceiver imageReceiver = vlVar != null ? vlVar.k : this.a;
        if (imageReceiver != null) {
            if (this.c == -1 || this.d == -1) {
                imageReceiver.i0(0.0f, 0.0f, getWidth(), getHeight());
                this.b.i0(0.0f, 0.0f, getWidth(), getHeight());
            } else {
                float width = (getWidth() - this.c) / 2;
                int height = getHeight();
                imageReceiver.i0(width, (height - r5) / 2, this.c, this.d);
                ImageReceiver imageReceiver2 = this.b;
                float width2 = (getWidth() - this.c) / 2;
                int height2 = getHeight();
                imageReceiver2.i0(width2, (height2 - r6) / 2, this.c, this.d);
            }
            imageReceiver.h(canvas, null);
            o48 o48Var = this.L;
            if (o48Var.P) {
                this.b.h(canvas, null);
                if (o48Var.O == null) {
                    if (o48Var.N == null) {
                        qla qlaVar = new qla();
                        o48Var.N = qlaVar;
                        qlaVar.h(bm2.o(-1, 82));
                    }
                    o48Var.N.setBounds(0, 0, getWidth(), getHeight());
                    o48Var.N.draw(canvas);
                }
                invalidate();
            }
            float f = o48Var.V;
            Bitmap bitmap = o48Var.T;
            if (f != 1.0f) {
                if (bitmap != null) {
                    int interpolation = (int) (s33.f.getInterpolation(1.0f - f) * 255.0f);
                    Paint paint = this.H;
                    paint.setAlpha(interpolation);
                    canvas.drawBitmap(o48Var.T, 0.0f, 0.0f, paint);
                    long min = Math.min(16L, System.currentTimeMillis() - this.I);
                    Float f2 = o48Var.U;
                    o48Var.V = ls6.z(min, f2 == null ? 250.0f : f2.floatValue(), o48Var.V, 1.0f);
                    this.I = System.currentTimeMillis();
                    invalidate();
                    if (o48Var.O != null) {
                        o48Var.b.invalidate();
                    }
                }
            } else if (bitmap != null) {
                bitmap.recycle();
                o48Var.T = null;
                o48Var.U = null;
                invalidate();
            }
            if (o48Var.s) {
                m48 m48Var = o48Var.W;
                if ((m48Var == null || !((e52) ((rh1) m48Var).b).s) && (jm6Var = o48Var.I) != null && jm6Var.i() && o48Var.I.d()) {
                    if (o48Var.I.j()) {
                        drawable = this.K;
                        if (drawable == null) {
                            drawable = getContext().getResources().getDrawable(R.drawable.media_live_off).mutate();
                            this.K = drawable;
                        }
                    } else {
                        drawable = this.J;
                        if (drawable == null) {
                            drawable = getContext().getResources().getDrawable(R.drawable.media_live_on).mutate();
                            this.J = drawable;
                        }
                    }
                    drawable.setBounds((int) (imageReceiver.L0 + gl.L(8.0f)), (int) (imageReceiver.M0 + gl.L(8.0f)), (int) (imageReceiver.L0 + gl.L(30.0f)), (int) (imageReceiver.M0 + gl.L(26.0f)));
                    drawable.draw(canvas);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        o48 o48Var = this.L;
        jm6 jm6Var = o48Var.I;
        o48Var.h(jm6Var != null && jm6Var.M);
    }
}
