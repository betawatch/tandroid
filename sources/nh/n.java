package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.o9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class n extends FrameLayout implements w5 {
    public final o9 a;

    public n(Context context) {
        super(context);
        o9 o9Var = new o9(context);
        this.a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(o9Var, e6.d(72, 72.0f, 81, 0.0f, 0.0f, 0.0f, 28.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = f6.S0;
        o9 o9Var = this.a;
        ff.s.a(canvas, drawable, (o9Var.getWidth() / 2.0f) + o9Var.getLeft(), (o9Var.getHeight() / 2.0f) + o9Var.getTop(), o9Var.getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(136.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
    }
}
