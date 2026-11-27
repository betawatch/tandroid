// default package

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ej extends FrameLayout {
    public final /* synthetic */ sg2[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej(Context context, sg2[] sg2VarArr) {
        super(context);
        this.a = sg2VarArr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        sg2[] sg2VarArr = this.a;
        if (sg2VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), hl.L(7.0f) + sg2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
