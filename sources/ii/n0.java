package ii;

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
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class n0 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public n0(Context context, o0 o0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = e6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.y5.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, w7.y5.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), w7.y5.o(0, -2, 1.0f, 119));
        addView(textView2, w7.y5.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(o0Var.a);
        textView.setText(o0Var.b);
        textView2.setText((CharSequence) o0Var.c.get(0));
        e();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
        int i10 = j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(j6.v0(i10, e6Var), PorterDuff.Mode.SRC_IN));
        this.c.setTextColor(j6.v0(i10, e6Var));
        this.d.setTextColor(j6.l1(0.75f, j6.v0(i10, e6Var)));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }
}
