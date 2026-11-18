package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class o3 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.c2[] b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3(Context context, org.telegram.ui.Cells.c2[] c2VarArr, int i7) {
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
