package hi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class i extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public i(Context context, f6 f6Var, boolean z9) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i7 = k6.G6;
        r6.t(imageView, i7, f6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, ha.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ha.d(-1, -2.0f, 23, 64.0f, z9 ? 2.0f : 9.8f, 24.0f, z9 ? 4.0f : 9.8f));
        TextView textView = new TextView(context);
        this.b = textView;
        r6.V(textView, i7, f6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, ha.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.c = f10;
        r6.V(f10, k6.z6, f6Var);
        f10.setTextSize(1, 14.0f);
        linearLayout.addView(f10, ha.t(-1, -2, 55, 0, 0, 0, 0));
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
