package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class il0 extends FrameLayout {
    public final Paint a;
    public float b;
    public r1.g c;
    public final /* synthetic */ ml0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il0(ml0 ml0Var, Context context) {
        super(context);
        this.d = ml0Var;
        this.a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        r1.g gVar = this.c;
        if (gVar != null) {
            gVar.d();
        }
        float f10 = z10 ? 1.0f : 0.0f;
        if (!z11) {
            this.b = f10;
            TextView textView = this.d.V;
            if (textView != null) {
                textView.setAlpha((f10 * 0.2f) + 0.8f);
            }
            invalidate();
            return;
        }
        float f11 = this.b;
        if (f11 == f10) {
            return;
        }
        r1.g gVar2 = new r1.g(new r1.f(f11 * 100.0f));
        r1.h hVar = new r1.h(f10 * 100.0f);
        hVar.b(z10 ? 500.0f : 650.0f);
        hVar.a(1.0f);
        gVar2.m = hVar;
        this.c = gVar2;
        gVar2.b(new bb0(this, 1));
        this.c.a(new m9(this, 1));
        this.c.h();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i7 = org.telegram.ui.ActionBar.m6.O6;
        ml0 ml0Var = this.d;
        canvas.drawColor(ml0Var.getThemedColor(i7));
        int themedColor = ml0Var.getThemedColor(org.telegram.ui.ActionBar.m6.Vi);
        Paint paint = this.a;
        paint.setColor(themedColor);
        canvas.drawCircle(org.telegram.messenger.gd.a0 ? getWidth() - org.telegram.messenger.g0.L(28.0f) : org.telegram.messenger.g0.L(28.0f), -org.telegram.messenger.g0.L(28.0f), Math.max(getWidth(), getHeight()) * this.b, paint);
    }
}
