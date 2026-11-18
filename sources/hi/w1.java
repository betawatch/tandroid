package hi;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class w1 extends FrameLayout {
    public org.telegram.ui.Components.q9 a;
    public int b;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.max(org.telegram.messenger.g0.L(170.0f), (org.telegram.messenger.g0.q.y * 0.34999996f) - org.telegram.messenger.g0.L(142.0f)), TLObject.FLAG_30));
    }
}
