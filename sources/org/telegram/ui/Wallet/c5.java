package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class c5 extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new c5());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        ((d5) view).a(u61Var.l, u61Var.m, u61Var.k);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new d5(context, u6Var);
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean isClickable() {
        return false;
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean isShadow() {
        return true;
    }
}
