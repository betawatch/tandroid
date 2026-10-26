package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class lo0 extends FrameLayout {
    public final Paint a;
    public float b;
    public o1.j c;
    public final /* synthetic */ po0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo0(po0 po0Var, Context context) {
        super(context);
        this.d = po0Var;
        this.a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        o1.j jVar = this.c;
        if (jVar != null) {
            jVar.c();
        }
        float f7 = z10 ? 1.0f : 0.0f;
        if (!z11) {
            this.b = f7;
            TextView textView = this.d.U;
            if (textView != null) {
                textView.setAlpha((f7 * 0.2f) + 0.8f);
            }
            invalidate();
            return;
        }
        float f10 = this.b;
        if (f10 == f7) {
            return;
        }
        o1.j jVar2 = new o1.j(new ac.a(f10 * 100.0f));
        o1.k kVar = new o1.k(f7 * 100.0f);
        kVar.b(z10 ? 500.0f : 650.0f);
        kVar.a(1.0f);
        jVar2.u = kVar;
        this.c = jVar2;
        jVar2.b(new ad0(this, 1));
        this.c.a(new r9(this, 1));
        this.c.h();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i10 = org.telegram.ui.ActionBar.y6.O6;
        po0 po0Var = this.d;
        canvas.drawColor(po0Var.getThemedColor(i10));
        int themedColor = po0Var.getThemedColor(org.telegram.ui.ActionBar.y6.ei);
        Paint paint = this.a;
        paint.setColor(themedColor);
        canvas.drawCircle(LocaleController.isRTL ? getWidth() - AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(28.0f), -AndroidUtilities.dp(28.0f), Math.max(getWidth(), getHeight()) * this.b, paint);
    }
}
