package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class g50 extends o50 {
    public final /* synthetic */ b60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g50(b60 b60Var, Context context) {
        super(b60Var, context);
        this.d = b60Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.d.invalidate();
    }

    @Override // android.view.View
    public final void setRotationY(float f7) {
        super.setRotationY(f7);
        this.d.invalidate();
    }
}
