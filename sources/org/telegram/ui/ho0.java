package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ho0 extends FrameLayout {
    public final Paint a;
    public float b;
    public o1.j c;
    public final /* synthetic */ lo0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho0(lo0 lo0Var, Context context) {
        super(context);
        this.d = lo0Var;
        this.a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z4, boolean z10) {
        o1.j jVar = this.c;
        if (jVar != null) {
            jVar.c();
        }
        float f10 = z4 ? 1.0f : 0.0f;
        if (!z10) {
            this.b = f10;
            TextView textView = this.d.R;
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
        o1.j jVar2 = new o1.j(new kb.a(f11 * 100.0f));
        o1.k kVar = new o1.k(f10 * 100.0f);
        kVar.b(z4 ? 500.0f : 650.0f);
        kVar.a(1.0f);
        jVar2.u = kVar;
        this.c = jVar2;
        jVar2.b(new nd0(this, 1));
        this.c.a(new q9(this, 1));
        this.c.f();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.j6.O6;
        lo0 lo0Var = this.d;
        canvas.drawColor(lo0Var.getThemedColor(i10));
        int themedColor = lo0Var.getThemedColor(org.telegram.ui.ActionBar.j6.ei);
        Paint paint = this.a;
        paint.setColor(themedColor);
        canvas.drawCircle(LocaleController.isRTL ? getWidth() - AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(28.0f), -AndroidUtilities.dp(28.0f), Math.max(getWidth(), getHeight()) * this.b, paint);
    }
}
