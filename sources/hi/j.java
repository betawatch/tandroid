package hi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class j extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public j(Context context, u6 u6Var, boolean z10) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = y6.G6;
        f7.t(imageView, i10, u6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, kb1.h(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, kb1.h(-1, -2.0f, 23, 64.0f, z10 ? 2.0f : 9.8f, 24.0f, z10 ? 4.0f : 9.8f));
        TextView textView = new TextView(context);
        this.b = textView;
        f7.V(textView, i10, u6Var);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        TextView e = wh.e(linearLayout, textView, kb1.x(-1, -2, 55, 0, 0, 0, 1), context);
        this.c = e;
        f7.V(e, y6.z6, u6Var);
        e.setTextSize(1, 14.0f);
        linearLayout.addView(e, kb1.x(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.a.setImageResource(i10);
        this.b.setText(charSequence);
        this.c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
