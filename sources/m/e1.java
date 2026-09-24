package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
