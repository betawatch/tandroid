package fi;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class v1 extends FrameLayout {
    public org.telegram.ui.Components.k9 a;
    public int b;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) Math.max(org.telegram.messenger.g0.L(170.0f), (org.telegram.messenger.g0.q.y * 0.34999996f) - org.telegram.messenger.g0.L(142.0f)), TLObject.FLAG_30));
    }
}
