package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class a1 extends ClickableSpan {
    public final TLRPC.User a;
    public final /* synthetic */ b1 b;

    public a1(b1 b1Var, TLRPC.User user) {
        this.b = b1Var;
        this.a = user;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        r1 r1Var = this.b.a;
        m1 m1Var = r1Var.Sa;
        if (m1Var != null) {
            m1Var.u0(r1Var, this.a, 0.0f, 0.0f);
        }
    }
}
