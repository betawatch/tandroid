package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class p1 extends ClickableSpan {
    public final TLRPC.User a;
    public final /* synthetic */ q1 b;

    public p1(q1 q1Var, TLRPC.User user) {
        this.b = q1Var;
        this.a = user;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        t1 t1Var = this.b.d;
        k1 k1Var = t1Var.Jc;
        if (k1Var != null) {
            k1Var.s0(t1Var, this.a, 0.0f, 0.0f);
        }
    }
}
