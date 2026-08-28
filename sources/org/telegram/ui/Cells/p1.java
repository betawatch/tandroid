package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        k1 k1Var = t1Var.Fc;
        if (k1Var != null) {
            k1Var.u0(t1Var, this.a, 0.0f, 0.0f);
        }
    }
}
