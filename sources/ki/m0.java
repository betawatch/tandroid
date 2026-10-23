package ki;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class m0 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public m0(Context context, n0 n0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = g6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, w7.z5.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), w7.z5.o(0, -2, 1.0f, 119));
        addView(textView2, w7.z5.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(n0Var.a);
        textView.setText(n0Var.b);
        textView2.setText((CharSequence) n0Var.c.get(0));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.G6));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i10 = k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(k6.w0(i10, g6Var), PorterDuff.Mode.SRC_IN));
        this.c.setTextColor(k6.w0(i10, g6Var));
        this.d.setTextColor(k6.o1(0.75f, k6.w0(i10, g6Var)));
    }
}
