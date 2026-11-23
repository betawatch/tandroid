package org.telegram.messenger;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class ut extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new ut());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        vt vtVar = (vt) view;
        vtVar.set((TL_iv.RichMessage) o41Var.H);
        vtVar.setTranslationLoading(o41Var.e);
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean c(o41 o41Var, o41 o41Var2) {
        return o41Var.d == o41Var2.d && o41Var.H == o41Var2.H && o41Var.e == o41Var2.e;
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        vt vtVar = new vt(i7, context, h6Var);
        vtVar.setPadding(g0.L(20.0f), 0, g0.L(20.0f), g0.L(16.0f));
        return vtVar;
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean e(o41 o41Var, o41 o41Var2) {
        return o41Var.d == o41Var2.d;
    }
}
