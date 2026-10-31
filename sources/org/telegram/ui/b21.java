package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b21 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ Integer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b21(Context context, Integer num, int i10) {
        super(context);
        this.a = i10;
        this.b = num;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(i10, i11);
                if (this.b != null) {
                    setPivotX(r2.intValue());
                    break;
                }
                break;
            default:
                super.onMeasure(i10, i11);
                if (this.b != null) {
                    setPivotX(r2.intValue());
                    break;
                }
                break;
        }
    }
}
