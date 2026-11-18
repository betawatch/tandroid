package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class k01 extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ Integer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k01(Context context, Integer num, int i7) {
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
