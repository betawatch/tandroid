package ki;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import org.telegram.messenger.i20;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class j extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public j(Context context, e6 e6Var, boolean z10) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i7 = j6.G6;
        q6.s(imageView, i7, e6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, ja.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ja.d(-1, -2.0f, 23, 64.0f, z10 ? 2.0f : 9.8f, 24.0f, z10 ? 4.0f : 9.8f));
        TextView textView = new TextView(context);
        this.b = textView;
        q6.U(textView, i7, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 14.0f);
        TextView f10 = i20.f(linearLayout, textView, ja.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.c = f10;
        q6.U(f10, j6.z6, e6Var);
        f10.setTextSize(1, 14.0f);
        linearLayout.addView(f10, ja.t(-1, -2, 55, 0, 0, 0, 0));
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
