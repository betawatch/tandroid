package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
