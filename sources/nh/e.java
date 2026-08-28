package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.o9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class e extends FrameLayout implements w5 {
    public final o9 a;
    public final b6 b;
    public final TextView c;
    public final TextView d;

    public e(Context context, b6 b6Var) {
        super(context);
        this.b = b6Var;
        o9 o9Var = new o9(context);
        this.a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(o9Var, e6.d(72, 72.0f, 49, 0.0f, 36.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 20.0f);
        textView.setGravity(17);
        addView(textView, e6.d(-1, -2.0f, 49, 24.0f, 123.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView2, e6.d(-1, -2.0f, 49, 32.0f, 157.0f, 32.0f, 0.0f));
        d();
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        int i9 = f6.G6;
        b6 b6Var = this.b;
        this.c.setTextColor(f6.v0(i9, b6Var));
        this.d.setTextColor(f6.v0(f6.z6, b6Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        Drawable drawable = f6.S0;
        o9 o9Var = this.a;
        ff.s.a(canvas, drawable, (o9Var.getWidth() / 2.0f) + o9Var.getLeft(), (o9Var.getHeight() / 2.0f) + o9Var.getTop(), o9Var.getHeight());
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(218.0f), TLObject.FLAG_30));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
