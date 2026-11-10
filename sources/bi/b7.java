package bi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class b7 extends org.telegram.ui.Components.k9 {
    public final /* synthetic */ int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b7(Context context, int i7) {
        super(context);
        this.G = i7;
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.G) {
            case 1:
                int size = View.MeasureSpec.getSize(i7);
                setMeasuredDimension(size, size);
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.G) {
            case 0:
                super.setAlpha(f10);
                setVisibility(f10 > 0.0f ? 0 : 4);
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }
}
