package ji;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class m0 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public m0(Context context, n0 n0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = f6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.x5.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, w7.x5.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), w7.x5.o(0, -2, 1.0f, 119));
        addView(textView2, w7.x5.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(n0Var.a);
        textView.setText(n0Var.b);
        textView2.setText((CharSequence) n0Var.c.get(0));
        d();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN));
        this.c.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.75f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }
}
