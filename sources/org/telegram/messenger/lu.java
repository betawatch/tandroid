package org.telegram.messenger;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class lu extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new lu());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        mu muVar = (mu) view;
        muVar.set((TL_iv.RichMessage) b51Var.G);
        muVar.setTranslationLoading(b51Var.e);
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean c(b51 b51Var, b51 b51Var2) {
        return b51Var.d == b51Var2.d && b51Var.G == b51Var2.G && b51Var.e == b51Var2.e;
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        mu muVar = new mu(i10, context, p6Var);
        muVar.setPadding(i0.L(20.0f), 0, i0.L(20.0f), i0.L(16.0f));
        return muVar;
    }

    @Override // org.telegram.ui.Components.a51
    public final boolean e(b51 b51Var, b51 b51Var2) {
        return b51Var.d == b51Var2.d;
    }
}
