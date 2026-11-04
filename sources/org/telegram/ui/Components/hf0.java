package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hf0 extends cg0 {
    public final Drawable R;
    public final Drawable S;
    public final ly0 T;
    public ly0 U;
    public final Paint V;
    public final Path W;
    public float a0;
    public final DecimalFormat b0;

    public hf0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.V = paint;
        Path path = new Path();
        this.W = path;
        this.b0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        this.R = k2.p1.g(context, R.drawable.profile_balance_gram);
        this.S = k2.p1.g(context, R.drawable.profile_balance_gram_color);
        this.T = new ly0(org.telegram.messenger.bd.M0(2131745165, null) + ":", 11.0f, null);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.16f));
        path.moveTo(0.0f, -org.telegram.messenger.g0.N(3.33f));
        path.lineTo(org.telegram.messenger.g0.N(3.16f), 0.0f);
        path.lineTo(0.0f, org.telegram.messenger.g0.N(3.33f));
        setBalance(0L);
    }

    @Override // org.telegram.ui.Components.cg0
    public final void b(Canvas canvas, float f10) {
        float height = getHeight() / 2.0f;
        canvas.translate(0.0f, (-org.telegram.messenger.g0.L(20.0f)) * this.a0);
        float f11 = f10 * 0.85f;
        this.T.c(0.0f, height, f11, this.F, canvas);
        canvas.translate(this.T.k() + org.telegram.messenger.g0.L(4.0f), 0.0f);
        Drawable drawable = (this.G || this.H >= 0.8f) ? this.S : this.R;
        int L = org.telegram.messenger.g0.L(13.0f);
        int i3 = ((int) height) - (L / 2);
        drawable.setBounds(0, i3, L, i3 + L);
        drawable.setAlpha((int) (255.0f * f10));
        drawable.draw(canvas);
        canvas.translate(org.telegram.messenger.g0.L(2.0f) + L, 0.0f);
        this.U.c(0.0f, height, f10, this.F, canvas);
        canvas.translate(org.telegram.messenger.g0.N(4.8f) + this.U.k(), height);
        int r12 = org.telegram.ui.ActionBar.k6.r1(f11, this.F);
        Paint paint = this.V;
        paint.setColor(r12);
        canvas.drawPath(this.W, paint);
    }

    @Override // org.telegram.ui.Components.cg0
    public final float c(float f10) {
        ly0 ly0Var = this.T;
        ly0Var.p = -1.0f;
        this.U.p = -1.0f;
        float max = Math.max(0.0f, f10 - org.telegram.messenger.g0.L(43.0f));
        ly0Var.p = Math.max(0.0f, max - this.U.k());
        this.U.p = Math.max(0.0f, max - ly0Var.k());
        return this.U.k() + ly0Var.k() + org.telegram.messenger.g0.L(27.0f);
    }

    public void setBalance(long j10) {
        String format = this.b0.format(new BigDecimal(org.telegram.ui.Wallet.k0.p(j10, false)));
        this.U = new ly0(format, 11.0f, org.telegram.messenger.g0.o());
        setContentDescription(org.telegram.messenger.bd.M0(2131745165, null) + ": " + format);
        invalidate();
    }

    public void setEjectProgress(float f10) {
        if (this.a0 == f10) {
            return;
        }
        this.a0 = f10;
        invalidate();
    }
}
