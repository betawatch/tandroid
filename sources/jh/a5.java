package jh;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class a5 extends org.telegram.ui.Components.t9 {
    public final /* synthetic */ int C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a5(Context context, int i10) {
        super(context);
        this.C = i10;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.C) {
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
    public void setAlpha(float f9) {
        switch (this.C) {
            case 0:
                super.setAlpha(f9);
                setVisibility(f9 > 0.0f ? 0 : 4);
                break;
            default:
                super.setAlpha(f9);
                break;
        }
    }
}
