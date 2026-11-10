package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class y0 extends ClickableSpan {
    public final TLRPC.User a;
    public final /* synthetic */ z0 b;

    public y0(z0 z0Var, TLRPC.User user) {
        this.b = z0Var;
        this.a = user;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        q1 q1Var = this.b.a;
        l1 l1Var = q1Var.Ra;
        if (l1Var != null) {
            l1Var.s0(q1Var, this.a, 0.0f, 0.0f);
        }
    }
}
