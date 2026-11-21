package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ci extends ug {
    public final /* synthetic */ ui y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci(Context context, org.telegram.ui.ActionBar.h6 h6Var, ui uiVar) {
        super(R.drawable.send_plane_24, context, h6Var, false);
        this.y0 = uiVar;
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean b() {
        return false;
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean c() {
        return !this.y0.S2;
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean d() {
        return true;
    }

    @Override // org.telegram.ui.Components.ug
    public final int getFillColor() {
        return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.S5, this.y0.J0);
    }
}
