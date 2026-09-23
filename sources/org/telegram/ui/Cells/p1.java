package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
            k1Var.t0(t1Var, this.a, 0.0f, 0.0f);
        }
    }
}
