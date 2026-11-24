// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m68 extends bf0 {
    public final Paint H;
    public long I;
    public Drawable J;
    public Drawable K;
    public final /* synthetic */ q68 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m68(q68 q68Var, Context context) {
        super(context);
        this.L = q68Var;
        this.H = new Paint(1);
    }

    @Override // bf0, android.view.View
    public final void onDraw(Canvas canvas) {
        jo6 jo6Var;
        Drawable drawable;
        vm vmVar = this.e;
        ImageReceiver imageReceiver = vmVar != null ? vmVar.k : this.a;
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
            q68 q68Var = this.L;
            if (q68Var.P) {
                this.b.h(canvas, null);
                if (q68Var.O == null) {
                    if (q68Var.N == null) {
                        rna rnaVar = new rna();
                        q68Var.N = rnaVar;
                        rnaVar.h(on2.p(-1, 82));
                    }
                    q68Var.N.setBounds(0, 0, getWidth(), getHeight());
                    q68Var.N.draw(canvas);
                }
                invalidate();
            }
            float f = q68Var.V;
            Bitmap bitmap = q68Var.T;
            if (f != 1.0f) {
                if (bitmap != null) {
                    int interpolation = (int) (d53.f.getInterpolation(1.0f - f) * 255.0f);
                    Paint paint = this.H;
                    paint.setAlpha(interpolation);
                    canvas.drawBitmap(q68Var.T, 0.0f, 0.0f, paint);
                    long min = Math.min(16L, System.currentTimeMillis() - this.I);
                    Float f2 = q68Var.U;
                    q68Var.V = kt6.A(min, f2 == null ? 250.0f : f2.floatValue(), q68Var.V, 1.0f);
                    this.I = System.currentTimeMillis();
                    invalidate();
                    if (q68Var.O != null) {
                        q68Var.b.invalidate();
                    }
                }
            } else if (bitmap != null) {
                bitmap.recycle();
                q68Var.T = null;
                q68Var.U = null;
                invalidate();
            }
            if (q68Var.s) {
                o68 o68Var = q68Var.W;
                if ((o68Var == null || !((p62) ((cd1) o68Var).b).s) && (jo6Var = q68Var.I) != null && jo6Var.i() && q68Var.I.d()) {
                    if (q68Var.I.j()) {
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
                    drawable.setBounds((int) (imageReceiver.L0 + gm.L(8.0f)), (int) (imageReceiver.M0 + gm.L(8.0f)), (int) (imageReceiver.L0 + gm.L(30.0f)), (int) (imageReceiver.M0 + gm.L(26.0f)));
                    drawable.draw(canvas);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        q68 q68Var = this.L;
        jo6 jo6Var = q68Var.I;
        q68Var.h(jo6Var != null && jo6Var.M);
    }
}
