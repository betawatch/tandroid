package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class g1 extends f1 {
    @Override // m.f1, m.h1
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // m.h1
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
