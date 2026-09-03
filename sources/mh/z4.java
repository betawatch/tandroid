package mh;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class z4 extends org.telegram.ui.Components.p9 {
    public final /* synthetic */ int D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z4(Context context, int i10) {
        super(context);
        this.D = i10;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.D) {
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
    public void setAlpha(float f10) {
        switch (this.D) {
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
