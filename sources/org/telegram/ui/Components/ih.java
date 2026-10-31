package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ih extends zf {
    public final /* synthetic */ bi n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(Context context, org.telegram.ui.ActionBar.p6 p6Var, bi biVar) {
        super(R.drawable.send_plane_24, context, p6Var, false);
        this.n0 = biVar;
    }

    @Override // org.telegram.ui.Components.zf
    public final boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Components.zf
    public final boolean e() {
        return !this.n0.O2;
    }

    @Override // org.telegram.ui.Components.zf
    public final boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.zf
    public final int getFillColor() {
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.S5, this.n0.I0);
    }
}
