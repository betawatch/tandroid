package hh;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class e extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new e());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        lg.c cVar = (lg.c) view;
        cVar.s = (TLRPC.TL_help_country) h51Var.G;
        cVar.f();
        cVar.setDivider(z4);
        cVar.c(h51Var.e, false);
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        return h51Var.H(h51Var2);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        lg.c cVar = new lg.c(context, g6Var);
        cVar.setBackground(null);
        return cVar;
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        return h51Var.I(h51Var2);
    }
}
