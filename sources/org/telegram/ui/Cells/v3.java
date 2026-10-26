package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class v3 extends s61 {
    public static final /* synthetic */ int a = 0;

    static {
        s61.setup(new v3());
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        w3 w3Var = (w3) view;
        w3Var.w = z10;
        w3Var.b((MessageObject) t61Var.G, (ArrayList) t61Var.H);
        w3Var.invalidate();
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean contentsEquals(t61 t61Var, t61 t61Var2) {
        return t61Var.G == t61Var2.G && Objects.equals(t61Var.H, t61Var2.H) && t61Var.j == t61Var2.j;
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new w3(context, i10, u6Var);
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        return t61Var.d == t61Var2.d && t61Var.B == t61Var2.B;
    }
}
