package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class tu extends l9 {
    public final /* synthetic */ wu G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu(wu wuVar, Context context) {
        super(context);
        this.G = wuVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (ch.e0.b(this)) {
            return;
        }
        super.invalidate();
        this.G.f();
    }

    @Override // android.view.View
    public final void invalidate(int i7, int i10, int i11, int i12) {
        if (ch.e0.b(this)) {
            return;
        }
        super.invalidate(i7, i10, i11, i12);
    }
}
