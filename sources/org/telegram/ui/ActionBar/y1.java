package org.telegram.ui.ActionBar;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y1 extends FrameLayout {
    public final TextView a;
    public final ImageView b;

    public y1(Context context, b6 b6Var) {
        super(context);
        setBackground(f6.f0(f6.v0(f6.I5, b6Var), 2, -1));
        setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.J5, b6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView, g7.e6.e(-2, 40, (LocaleController.isRTL ? 5 : 3) | 16));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        ll.n(f6.j5, b6Var, textView, 1, 16.0f);
        addView(textView, g7.e6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
    }

    public final void a(int i9, CharSequence charSequence) {
        TextView textView = this.a;
        textView.setText(charSequence);
        ImageView imageView = this.b;
        if (i9 == 0) {
            imageView.setVisibility(4);
            textView.setPadding(0, 0, 0, 0);
        } else {
            imageView.setImageResource(i9);
            imageView.setVisibility(0);
            textView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(56.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(56.0f) : 0, 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }

    public void setGravity(int i9) {
        this.a.setGravity(i9);
    }

    public void setTextColor(int i9) {
        this.a.setTextColor(i9);
    }
}
