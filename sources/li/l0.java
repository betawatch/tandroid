package li;

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
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class l0 extends LinearLayout implements p6 {
    public final u6 a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public l0(Context context, m0 m0Var, u6 u6Var) {
        super(context);
        this.a = u6Var;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, kb1.x(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, kb1.x(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), kb1.s(0, -2, 1.0f, 119));
        addView(textView2, kb1.x(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(m0Var.a);
        textView.setText(m0Var.b);
        textView2.setText((CharSequence) m0Var.c.get(0));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.G6));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int i10 = y6.G6;
        u6 u6Var = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(y6.w0(i10, u6Var), PorterDuff.Mode.SRC_IN));
        this.c.setTextColor(y6.w0(i10, u6Var));
        this.d.setTextColor(y6.o1(0.75f, y6.w0(i10, u6Var)));
    }
}
