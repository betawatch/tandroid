package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class p3 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.d2[] b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p3(Context context, org.telegram.ui.Cells.d2[] d2VarArr, int i7) {
        super(context);
        this.a = i7;
        this.b = d2VarArr;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(i7, i10);
                org.telegram.ui.Cells.d2[] d2VarArr = this.b;
                if (d2VarArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), org.telegram.messenger.g0.L(7.0f) + d2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
                    break;
                }
                break;
            default:
                super.onMeasure(i7, i10);
                org.telegram.ui.Cells.d2[] d2VarArr2 = this.b;
                if (d2VarArr2[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), org.telegram.messenger.g0.L(7.0f) + d2VarArr2[0].getMeasuredHeight() + getMeasuredHeight());
                    break;
                }
                break;
        }
    }
}
