package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class g1 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) h1.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
