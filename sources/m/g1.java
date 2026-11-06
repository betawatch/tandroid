package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class g1 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) h1.e("getHorizontallyScrolling", textView, Boolean.FALSE)).booleanValue();
    }
}
