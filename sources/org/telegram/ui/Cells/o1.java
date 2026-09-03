package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class o1 extends ClickableSpan {
    public final TLRPC.User a;
    public final /* synthetic */ p1 b;

    public o1(p1 p1Var, TLRPC.User user) {
        this.b = p1Var;
        this.a = user;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        s1 s1Var = this.b.d;
        j1 j1Var = s1Var.Gc;
        if (j1Var != null) {
            j1Var.y0(s1Var, this.a, 0.0f, 0.0f);
        }
    }
}
