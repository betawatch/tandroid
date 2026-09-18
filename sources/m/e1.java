package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
