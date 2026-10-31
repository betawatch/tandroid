package mg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b extends View {
    public final e6 a;
    public float b;
    public ValueAnimator c;
    public int d;
    public final Paint e;

    public b(Context context) {
        super(context);
        this.b = 1.0f;
        e6 e6Var = new e6(false, false, true);
        this.a = e6Var;
        e6Var.n(0.3f, 250L, gr.h);
        e6Var.setCallback(this);
        e6Var.w(org.telegram.messenger.i0.L(11.5f));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.u(-1);
        e6Var.t("", true, true);
        e6Var.b = 17;
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setColor(-6915073);
        setVisibility(8);
    }

    public final void a(int i10, boolean z10) {
        if (!k0.i()) {
            i10 = 0;
        }
        if (i10 > 0) {
            setVisibility(0);
        }
        e6 e6Var = this.a;
        if (z10) {
            e6Var.a();
        }
        if (z10 && i10 != this.d && i10 > 0) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.c = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.c = ofFloat;
            ofFloat.addUpdateListener(new bg.k(this, 13));
            this.c.addListener(new bg.e(this, 13));
            z20.j(2.0f, this.c);
            this.c.setDuration(200L);
            this.c.start();
        }
        this.d = i10;
        int length = e6Var.i.length();
        e6Var.t("x" + i10, z10, true);
        int length2 = e6Var.i.length();
        invalidate();
        if (length != length2) {
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
        Rect rect = org.telegram.messenger.i0.Q;
        int L = org.telegram.messenger.i0.L(8.0f);
        e6 e6Var = this.a;
        rect.set(0, 0, L + ((int) e6Var.c()), org.telegram.messenger.i0.L(20.0f));
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(rect);
        if (this.b != 1.0f) {
            canvas.save();
            float f7 = this.b;
            canvas.scale(f7, f7, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), this.e);
        rect.set(0, 0, (int) rectF.width(), org.telegram.messenger.i0.L(19.0f));
        e6Var.setBounds(rect);
        e6Var.draw(canvas);
        if (this.b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.a.e() + org.telegram.messenger.i0.L(15.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(26.0f), TLObject.FLAG_30));
    }
}
