package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
