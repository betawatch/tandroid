package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public abstract class g1 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) h1.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
