package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ vl0 h;

    public /* synthetic */ q60(vl0 vl0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.h = vl0Var;
        this.b = user;
        this.c = str;
        this.d = z10;
        this.e = z11;
        this.f = z12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        switch (this.a) {
            case 0:
                a70 a70Var = ((v60) this.h).c;
                Context context = a70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) a70Var).currentAccount;
                long j3 = -a70Var.g0;
                e6Var = ((org.telegram.ui.ActionBar.f3) a70Var).resourcesProvider;
                n01.b(context, i10, j3, this.b, this.c, this.d, this.e, this.f, e6Var);
                break;
            default:
                kv0 kv0Var = ((ut0) this.h).f;
                n01.b(kv0Var.getContext(), kv0Var.v1.getCurrentAccount(), kv0Var.j1, this.b, this.c, this.d, this.e, this.f, kv0Var.F1);
                break;
        }
    }
}
