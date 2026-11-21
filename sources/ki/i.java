package ki;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class i extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public i(Context context, h6 h6Var, boolean z10) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i7 = m6.G6;
        t6.s(imageView, i7, h6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, ma.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ma.d(-1, -2.0f, 23, 64.0f, z10 ? 2.0f : 9.8f, 24.0f, z10 ? 4.0f : 9.8f));
        TextView textView = new TextView(context);
        this.b = textView;
        t6.U(textView, i7, h6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        TextView f10 = n10.f(linearLayout, textView, ma.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.c = f10;
        t6.U(f10, m6.z6, h6Var);
        f10.setTextSize(1, 14.0f);
        linearLayout.addView(f10, ma.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(int i7, CharSequence charSequence, CharSequence charSequence2) {
        this.a.setImageResource(i7);
        this.b.setText(charSequence);
        this.c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
