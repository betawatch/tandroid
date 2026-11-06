package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class sv extends tx {
    public final /* synthetic */ gy H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv(gy gyVar, Context context) {
        super(gyVar, context, 0);
        this.H = gyVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.H.x0.invalidate();
        }
    }
}
