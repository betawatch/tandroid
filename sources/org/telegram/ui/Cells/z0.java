package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class z0 extends ClickableSpan {
    public final TLRPC.User a;
    public final /* synthetic */ a1 b;

    public z0(a1 a1Var, TLRPC.User user) {
        this.b = a1Var;
        this.a = user;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        q1 q1Var = this.b.a;
        l1 l1Var = q1Var.Sa;
        if (l1Var != null) {
            l1Var.u0(q1Var, this.a, 0.0f, 0.0f);
        }
    }
}
