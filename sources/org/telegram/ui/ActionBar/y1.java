package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class y1 extends FrameLayout {
    public final TextView a;
    public final ImageView b;

    public y1(Context context, u6 u6Var) {
        super(context);
        int i10 = y6.I5;
        Drawable g02 = y6.g0(y6.w0(i10, u6Var), 2, -1);
        b7 N = f7.N(i10);
        setBackground(g02);
        f7.k(this, g02, null, N, u6Var);
        setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        f7.t(imageView, y6.J5, u6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, gb1.i(-2, 40, (LocaleController.isRTL ? 5 : 3) | 16));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f7.V(textView, y6.j5, u6Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, gb1.i(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
    }

    public final void a(int i10, CharSequence charSequence) {
        TextView textView = this.a;
        textView.setText(charSequence);
        ImageView imageView = this.b;
        if (i10 == 0) {
            imageView.setVisibility(4);
            textView.setPadding(0, 0, 0, 0);
        } else {
            imageView.setImageResource(i10);
            imageView.setVisibility(0);
            textView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(56.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(56.0f) : 0, 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }

    public void setGravity(int i10) {
        this.a.setGravity(i10);
    }

    public void setTextColor(int i10) {
        this.a.setTextColor(i10);
    }
}
