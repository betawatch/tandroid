package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
