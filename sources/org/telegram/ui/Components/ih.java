package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ih extends bg {
    public final /* synthetic */ bi o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih(Context context, org.telegram.ui.ActionBar.e6 e6Var, bi biVar) {
        super(R.drawable.send_plane_24, context, e6Var, false);
        this.o0 = biVar;
    }

    @Override // org.telegram.ui.Components.bg
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.bg
    public final boolean c() {
        return !this.o0.P2;
    }

    @Override // org.telegram.ui.Components.bg
    public final boolean d() {
        return true;
    }

    @Override // org.telegram.ui.Components.bg
    public final int getFillColor() {
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.S5, this.o0.J0);
    }
}
