package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public abstract class g1 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) h1.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
