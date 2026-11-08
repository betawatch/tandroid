package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
