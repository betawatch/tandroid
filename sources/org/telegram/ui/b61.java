package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class b61 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ Integer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b61(Context context, Integer num, int i10) {
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
