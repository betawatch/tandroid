package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ lm0 h;

    public /* synthetic */ c70(lm0 lm0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.h = lm0Var;
        this.b = user;
        this.c = str;
        this.d = z10;
        this.e = z11;
        this.f = z12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var;
        switch (this.a) {
            case 0:
                m70 m70Var = ((h70) this.h).c;
                Context context = m70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.h3) m70Var).currentAccount;
                long j10 = -m70Var.g0;
                g6Var = ((org.telegram.ui.ActionBar.h3) m70Var).resourcesProvider;
                a11.b(context, i10, j10, this.b, this.c, this.d, this.e, this.f, g6Var);
                break;
            default:
                xv0 xv0Var = ((hu0) this.h).f;
                a11.b(xv0Var.getContext(), xv0Var.v1.getCurrentAccount(), xv0Var.j1, this.b, this.c, this.d, this.e, this.f, xv0Var.F1);
                break;
        }
    }
}
