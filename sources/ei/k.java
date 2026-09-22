package ei;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.vl;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class k extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public k(Context context, e6 e6Var, boolean z10) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = i6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(i6.v0(i10, e6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, x5.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, x5.d(-1, -2.0f, 23, 64.0f, z10 ? 2.0f : 9.8f, 24.0f, z10 ? 4.0f : 9.8f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(i6.v0(i10, e6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, x5.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.c = h;
        vl.o(i6.z6, e6Var, h, 1, 14.0f);
        linearLayout.addView(h, x5.t(-1, -2, 55, 0, 0, 0, 0));
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
