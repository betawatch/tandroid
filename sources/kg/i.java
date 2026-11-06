package kg;

import org.telegram.ui.Components.pn;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class i extends pn {
    @Override // org.telegram.ui.Components.pn, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        setPivotX(getMeasuredWidth() / 2.0f);
        setPivotY(getMeasuredHeight());
    }
}
