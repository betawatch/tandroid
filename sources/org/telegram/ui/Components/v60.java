package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class v60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ yl0 h;

    public /* synthetic */ v60(yl0 yl0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.h = yl0Var;
        this.b = user;
        this.c = str;
        this.d = z10;
        this.e = z11;
        this.f = z12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.a) {
            case 0:
                f70 f70Var = ((a70) this.h).c;
                Context context = f70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) f70Var).currentAccount;
                long j3 = -f70Var.g0;
                d6Var = ((org.telegram.ui.ActionBar.f3) f70Var).resourcesProvider;
                x01.b(context, i10, j3, this.b, this.c, this.d, this.e, this.f, d6Var);
                break;
            default:
                qv0 qv0Var = ((au0) this.h).f;
                x01.b(qv0Var.getContext(), qv0Var.v1.getCurrentAccount(), qv0Var.j1, this.b, this.c, this.d, this.e, this.f, qv0Var.F1);
                break;
        }
    }
}
