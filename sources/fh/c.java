package fh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c extends FrameLayout implements k6 {
    public final p6 a;
    public final ImageView b;
    public final TextView c;
    public int d;
    public boolean e;

    public c(Context context, p6 p6Var) {
        super(context);
        this.a = p6Var;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_arrow_back);
        addView(imageView, b6.d(48, 48.0f, 8388627, 6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setText(cd.L0(2131751167, null));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(i0.o());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, b6.d(-2, -2.0f, 8388627, 50.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    public final int a(float f7) {
        return i0.b.o(t6.w0(t6.Kl, this.a), (int) (f7 * 255.0f));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.Kl));
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        this.c.setTextColor(a(0.6f));
        int a2 = a(1.0f);
        if (this.e && a2 == this.d) {
            return;
        }
        this.e = true;
        this.d = a2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(a(0.6f), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.b;
        imageView.setColorFilter(porterDuffColorFilter);
        if (imageView.getBackground() != null) {
            t6.H1(imageView.getBackground(), a(0.1f), true);
        } else {
            imageView.setBackground(t6.h0(a(0.1f), 1, -1));
        }
    }
}
