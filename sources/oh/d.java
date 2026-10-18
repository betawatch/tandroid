package oh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.y5;
import w7.z5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class d extends FrameLayout implements y5 {
    public final d6 a;
    public final ImageView b;
    public final TextView c;

    public d(Context context, d6 d6Var) {
        super(context);
        this.a = d6Var;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_arrow_back);
        addView(imageView, z5.a(48.0f, 6.0f, 0.0f, 0.0f, 0.0f, 48, 8388627));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setText(LocaleController.getString(R.string.EmojiSearchBackToSearch));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, z5.a(-2.0f, 50.0f, 0.0f, 16.0f, 0.0f, -2, 8388627));
        d();
    }

    @Override // org.telegram.ui.ActionBar.y5
    public final void d() {
        int i10 = h6.Wk;
        d6 d6Var = this.a;
        int i11 = (int) 153.0f;
        this.c.setTextColor(i0.a.o(h6.w0(i10, d6Var), i11));
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0.a.o(h6.w0(i10, d6Var), i11), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.b;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(h6.g0(i0.a.o(h6.w0(i10, d6Var), (int) 25.5f), 1, -1));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }
}
