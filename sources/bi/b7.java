package bi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class b7 extends org.telegram.ui.Components.l9 {
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
