package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class bi extends tg {
    public final /* synthetic */ ti y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(Context context, org.telegram.ui.ActionBar.i6 i6Var, ti tiVar) {
        super(R.drawable.send_plane_24, context, i6Var, false);
        this.y0 = tiVar;
    }

    @Override // org.telegram.ui.Components.tg
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.tg
    public final boolean c() {
        return !this.y0.S2;
    }

    @Override // org.telegram.ui.Components.tg
    public final boolean d() {
        return true;
    }

    @Override // org.telegram.ui.Components.tg
    public final int getFillColor() {
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.S5, this.y0.J0);
    }
}
