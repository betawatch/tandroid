package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public abstract class g1 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) h1.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
