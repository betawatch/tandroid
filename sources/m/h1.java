package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class h1 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) i1.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
