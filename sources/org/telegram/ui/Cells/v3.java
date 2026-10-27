package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class v3 extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new v3());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        w3 w3Var = (w3) view;
        w3Var.w = z10;
        w3Var.b((MessageObject) u61Var.G, (ArrayList) u61Var.H);
        w3Var.invalidate();
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        return u61Var.G == u61Var2.G && Objects.equals(u61Var.H, u61Var2.H) && u61Var.j == u61Var2.j;
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new w3(context, i10, u6Var);
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        return u61Var.d == u61Var2.d && u61Var.B == u61Var2.B;
    }
}
