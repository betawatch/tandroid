package org.telegram.messenger;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class tt extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new tt());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        ut utVar = (ut) view;
        utVar.set((TL_iv.RichMessage) l41Var.H);
        utVar.setTranslationLoading(l41Var.e);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean c(l41 l41Var, l41 l41Var2) {
        return l41Var.d == l41Var2.d && l41Var.H == l41Var2.H && l41Var.e == l41Var2.e;
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        ut utVar = new ut(i7, context, i6Var);
        utVar.setPadding(g0.L(20.0f), 0, g0.L(20.0f), g0.L(16.0f));
        return utVar;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean e(l41 l41Var, l41 l41Var2) {
        return l41Var.d == l41Var2.d;
    }
}
