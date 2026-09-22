package hg;

import org.telegram.ui.Components.jo;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class j extends jo {
    @Override // org.telegram.ui.Components.jo, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotX(getMeasuredWidth() / 2.0f);
        setPivotY(getMeasuredHeight());
    }
}
