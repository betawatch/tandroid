package m;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class a1 {
    public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i7, TextView textView, TextPaint textPaint) {
        return new StaticLayout(charSequence, textPaint, i7, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
    }

    public static int b(TextView textView) {
        return textView.getMaxLines();
    }
}
