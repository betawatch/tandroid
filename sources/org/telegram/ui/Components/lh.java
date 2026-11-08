package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class lh extends dg {
    public final /* synthetic */ di n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh(Context context, org.telegram.ui.ActionBar.f6 f6Var, di diVar) {
        super(R.drawable.send_plane_24, context, f6Var, false);
        this.n0 = diVar;
    }

    @Override // org.telegram.ui.Components.dg
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.dg
    public final boolean c() {
        return !this.n0.O2;
    }

    @Override // org.telegram.ui.Components.dg
    public final boolean d() {
        return true;
    }

    @Override // org.telegram.ui.Components.dg
    public final int getFillColor() {
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.S5, this.n0.I0);
    }
}
