package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
