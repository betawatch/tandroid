package di;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class t5 extends org.telegram.ui.Components.i9 {
    public final /* synthetic */ int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5(Context context, int i7) {
        super(context);
        this.H = i7;
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.H) {
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
        switch (this.H) {
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
