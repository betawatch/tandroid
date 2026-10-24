package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class m3 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new m3());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        n3 n3Var = (n3) view;
        n3Var.a((TLRPC.StickerSetCovered) m61Var.G, z10, m61Var.t, false);
        n3Var.f.a(m61Var.t, false);
        n3Var.setAddOnClickListener(m61Var.D);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new n3(context, g6Var);
    }
}
