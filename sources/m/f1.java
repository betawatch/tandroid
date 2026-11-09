package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class f1 extends e1 {
    @Override // m.e1, m.g1
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // m.g1
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
