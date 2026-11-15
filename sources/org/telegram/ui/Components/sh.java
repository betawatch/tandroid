package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class sh extends jg {
    public final /* synthetic */ ki w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh(Context context, org.telegram.ui.ActionBar.e6 e6Var, ki kiVar) {
        super(R.drawable.send_plane_24, context, e6Var, false);
        this.w0 = kiVar;
    }

    @Override // org.telegram.ui.Components.jg
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.jg
    public final boolean c() {
        return !this.w0.S2;
    }

    @Override // org.telegram.ui.Components.jg
    public final boolean d() {
        return true;
    }

    @Override // org.telegram.ui.Components.jg
    public final int getFillColor() {
        return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.S5, this.w0.J0);
    }
}
