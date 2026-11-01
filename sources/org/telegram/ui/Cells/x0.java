package org.telegram.ui.Cells;

import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class x0 extends ClickableSpan {
    public final TLRPC.User a;
    public final /* synthetic */ y0 b;

    public x0(y0 y0Var, TLRPC.User user) {
        this.b = y0Var;
        this.a = user;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        q1 q1Var = this.b.a;
        l1 l1Var = q1Var.Qa;
        if (l1Var != null) {
            l1Var.r0(q1Var, this.a, 0.0f, 0.0f);
        }
    }
}
