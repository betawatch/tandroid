package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class l01 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ Integer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l01(Context context, Integer num, int i7) {
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
