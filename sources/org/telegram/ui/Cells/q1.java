package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class q1 extends ClickableSpan {
    public final TLRPC.User a;
    public final /* synthetic */ r1 b;

    public q1(r1 r1Var, TLRPC.User user) {
        this.b = r1Var;
        this.a = user;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        u1 u1Var = this.b.d;
        l1 l1Var = u1Var.Jc;
        if (l1Var != null) {
            l1Var.t0(u1Var, this.a, 0.0f, 0.0f);
        }
    }
}
