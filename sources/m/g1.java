package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public abstract class g1 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) h1.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
