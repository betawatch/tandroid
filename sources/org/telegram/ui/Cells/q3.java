package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class q3 extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new q3());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        r3 r3Var = (r3) view;
        r3Var.a((TLRPC.StickerSetCovered) o41Var.H, z10, o41Var.u, false);
        r3Var.f.a(o41Var.u, false);
        r3Var.setAddOnClickListener(o41Var.E);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new r3(context, h6Var);
    }
}
