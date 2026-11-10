package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class kh extends cg {
    public final /* synthetic */ ci n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh(Context context, org.telegram.ui.ActionBar.h6 h6Var, ci ciVar) {
        super(R.drawable.send_plane_24, context, h6Var, false);
        this.n0 = ciVar;
    }

    @Override // org.telegram.ui.Components.cg
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.cg
    public final boolean c() {
        return !this.n0.R2;
    }

    @Override // org.telegram.ui.Components.cg
    public final boolean d() {
        return true;
    }

    @Override // org.telegram.ui.Components.cg
    public final int getFillColor() {
        return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.S5, this.n0.I0);
    }
}
