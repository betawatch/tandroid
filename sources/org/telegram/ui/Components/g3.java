package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class g3 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.c2[] b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g3(Context context, org.telegram.ui.Cells.c2[] c2VarArr, int i7) {
        super(context);
        this.a = i7;
        this.b = c2VarArr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(i7, i10);
                org.telegram.ui.Cells.c2[] c2VarArr = this.b;
                if (c2VarArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), org.telegram.messenger.g0.L(7.0f) + c2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
                    break;
                }
                break;
            default:
                super.onMeasure(i7, i10);
                org.telegram.ui.Cells.c2[] c2VarArr2 = this.b;
                if (c2VarArr2[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), org.telegram.messenger.g0.L(7.0f) + c2VarArr2[0].getMeasuredHeight() + getMeasuredHeight());
                    break;
                }
                break;
        }
    }
}
