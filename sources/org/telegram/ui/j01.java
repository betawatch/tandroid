package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class j01 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ Integer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j01(Context context, Integer num, int i7) {
        super(context);
        this.a = i7;
        this.b = num;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(i7, i10);
                if (this.b != null) {
                    setPivotX(r2.intValue());
                    break;
                }
                break;
            default:
                super.onMeasure(i7, i10);
                if (this.b != null) {
                    setPivotX(r2.intValue());
                    break;
                }
                break;
        }
    }
}
