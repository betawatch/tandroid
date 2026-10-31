package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g3 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.c2[] b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g3(Context context, org.telegram.ui.Cells.c2[] c2VarArr, int i10) {
        super(context);
        this.a = i10;
        this.b = c2VarArr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(i10, i11);
                org.telegram.ui.Cells.c2[] c2VarArr = this.b;
                if (c2VarArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), org.telegram.messenger.i0.L(7.0f) + c2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
                    break;
                }
                break;
            default:
                super.onMeasure(i10, i11);
                org.telegram.ui.Cells.c2[] c2VarArr2 = this.b;
                if (c2VarArr2[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), org.telegram.messenger.i0.L(7.0f) + c2VarArr2[0].getMeasuredHeight() + getMeasuredHeight());
                    break;
                }
                break;
        }
    }
}
