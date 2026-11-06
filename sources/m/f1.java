package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
