package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class lw extends y9 {
    public final /* synthetic */ ow G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(ow owVar, Context context) {
        super(context);
        this.G = owVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (zg.d0.b(this)) {
            return;
        }
        super.invalidate();
        this.G.f();
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (zg.d0.b(this)) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
