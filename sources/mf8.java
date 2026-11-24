// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mf8 extends View {
    public final Drawable a;
    public final fn0 b;
    public final byte c;
    public nf8 d;

    /* JADX WARN: Multi-variable type inference failed */
    public mf8(Context context, int i) {
        super(context);
        this.b = new fn0(380L, this, d53.h);
        this.c = i;
        Drawable d = b10.d(context, R.drawable.outline_poll_attach_24);
        this.a = d;
        anb.x(this, d, cmb.n7, null, PorterDuff.Mode.SRC_IN);
    }

    public final void a(nf8 nf8Var, boolean z) {
        nf8 nf8Var2;
        nf8 nf8Var3;
        this.b.a(nf8Var != null, z);
        if (isAttachedToWindow() && (nf8Var3 = this.d) != null) {
            nf8Var3.b();
        }
        this.d = nf8Var;
        if (!isAttachedToWindow() || (nf8Var2 = this.d) == null) {
            return;
        }
        nf8Var2.a(this);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nf8 nf8Var = this.d;
        if (nf8Var != null) {
            nf8Var.a(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nf8 nf8Var = this.d;
        if (nf8Var != null) {
            nf8Var.b();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f = this.b.e;
        if (f < 1.0f) {
            canvas.save();
            float f2 = 1.0f - f;
            canvas.scale(f2, f2, width, height);
            this.a.draw(canvas);
            canvas.restore();
        }
        if (f > 0.0f) {
            float f3 = this.c;
            int L = gm.L(f3);
            int width2 = (getWidth() - L) / 2;
            int height2 = (getHeight() - L) / 2;
            canvas.save();
            canvas.translate(width2, height2);
            canvas.scale(f, f, gm.L(f3) / 2.0f, gm.L(f3) / 2.0f);
            nf8 nf8Var = this.d;
            if (nf8Var != null) {
                nf8Var.c(canvas, gm.L(f3), gm.L(f3));
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int L = gm.L(24.0f);
        int i5 = (i - L) / 2;
        int i6 = (i2 - L) / 2;
        this.a.setBounds(i5, i6, i5 + L, L + i6);
    }
}
