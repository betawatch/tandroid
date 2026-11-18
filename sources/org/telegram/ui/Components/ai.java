package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ai extends sg {
    public final /* synthetic */ si y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(Context context, org.telegram.ui.ActionBar.i6 i6Var, si siVar) {
        super(R.drawable.send_plane_24, context, i6Var, false);
        this.y0 = siVar;
    }

    @Override // org.telegram.ui.Components.sg
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.sg
    public final boolean c() {
        return !this.y0.S2;
    }

    @Override // org.telegram.ui.Components.sg
    public final boolean d() {
        return true;
    }

    @Override // org.telegram.ui.Components.sg
    public final int getFillColor() {
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.S5, this.y0.J0);
    }
}
