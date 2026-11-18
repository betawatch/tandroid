package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import di.ec;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class n0 extends LinearLayout {
    public ec a;
    public final Path b;
    public final Paint c;
    public long d;
    public final org.telegram.ui.Components.c6 e;
    public final /* synthetic */ q0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(q0 q0Var, Context context) {
        super(context);
        this.f = q0Var;
        this.b = new Path();
        this.c = new Paint(1);
        this.d = 0L;
        this.e = new org.telegram.ui.Components.c6(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.b;
        path.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        q0 q0Var = this.f;
        s0 s0Var = q0Var.f;
        if (s0Var != null) {
            int b10 = t.b(s0Var.a, s0Var.b(), 3);
            s0 s0Var2 = q0Var.f;
            int b11 = t.b(s0Var2.a, s0Var2.b(), 5);
            canvas.drawColor(b10);
            long j3 = this.d;
            s0 s0Var3 = q0Var.f;
            long j10 = s0Var3.b;
            org.telegram.ui.Components.c6 c6Var = this.e;
            if (j3 != j10) {
                c6Var.e(true, s0Var3.a());
            }
            float e10 = c6Var.e(false, q0Var.f.a());
            this.d = q0Var.f.b;
            Paint paint = this.c;
            paint.setColor(b11);
            paint.setAlpha(ks.L1);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * e10, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.a == null) {
            this.a = new ec(1, ks.Z3);
        }
        this.a.f(0, 0, getWidth(), getHeight());
        ec ecVar = this.a;
        ecVar.h = 30.0f;
        ecVar.d();
        this.a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
