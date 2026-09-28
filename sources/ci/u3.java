package ci;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final class u3 extends org.telegram.ui.Components.w9 {
    public final /* synthetic */ int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u3(Context context, int i10) {
        super(context);
        this.G = i10;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.G) {
            case 0:
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
            case 1:
                super.setAlpha(f7);
                setVisibility(f7 > 0.0f ? 0 : 4);
                break;
            default:
                super.setAlpha(f7);
                break;
        }
    }
}
