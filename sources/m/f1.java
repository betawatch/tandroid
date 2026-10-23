package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
