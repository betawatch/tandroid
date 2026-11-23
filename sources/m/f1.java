package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public abstract class f1 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) g1.e("getHorizontallyScrolling", textView, Boolean.FALSE)).booleanValue();
    }
}
