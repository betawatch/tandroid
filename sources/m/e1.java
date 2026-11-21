package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class e1 extends d1 {
    @Override // m.d1, m.f1
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // m.f1
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
