package org.telegram.messenger;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ku extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new ku());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        lu luVar = (lu) view;
        luVar.set((TL_iv.RichMessage) a51Var.G);
        luVar.setTranslationLoading(a51Var.e);
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean c(a51 a51Var, a51 a51Var2) {
        return a51Var.d == a51Var2.d && a51Var.G == a51Var2.G && a51Var.e == a51Var2.e;
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        lu luVar = new lu(i10, context, p6Var);
        luVar.setPadding(i0.L(20.0f), 0, i0.L(20.0f), i0.L(16.0f));
        return luVar;
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean e(a51 a51Var, a51 a51Var2) {
        return a51Var.d == a51Var2.d;
    }
}
