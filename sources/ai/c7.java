package ai;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class c7 extends org.telegram.ui.Components.w9 {
    public final /* synthetic */ int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c7(Context context, int i10) {
        super(context);
        this.G = i10;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.G) {
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        switch (this.G) {
            case 0:
                super.setAlpha(f7);
                setVisibility(f7 > 0.0f ? 0 : 4);
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }
}
