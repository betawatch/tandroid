package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class r3 extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new r3());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        s3 s3Var = (s3) view;
        s3Var.a((TLRPC.StickerSetCovered) b51Var.G, z10, b51Var.t, false);
        s3Var.f.a(b51Var.t, false);
        s3Var.setAddOnClickListener(b51Var.D);
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new s3(context, p6Var);
    }
}
