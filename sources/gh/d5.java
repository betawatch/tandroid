package gh;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d5 extends org.telegram.ui.Components.o9 {
    public final /* synthetic */ int C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d5(Context context, int i9) {
        super(context);
        this.C = i9;
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.C) {
            case 1:
                int size = View.MeasureSpec.getSize(i9);
                setMeasuredDimension(size, size);
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        switch (this.C) {
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
