package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class s60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ xl0 h;

    public /* synthetic */ s60(xl0 xl0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.h = xl0Var;
        this.b = user;
        this.c = str;
        this.d = z10;
        this.e = z11;
        this.f = z12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.f6 f6Var;
        switch (this.a) {
            case 0:
                c70 c70Var = ((x60) this.h).c;
                Context context = c70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) c70Var).currentAccount;
                long j3 = -c70Var.g0;
                f6Var = ((org.telegram.ui.ActionBar.f3) c70Var).resourcesProvider;
                o01.b(context, i10, j3, this.b, this.c, this.d, this.e, this.f, f6Var);
                break;
            default:
                lv0 lv0Var = ((vt0) this.h).f;
                o01.b(lv0Var.getContext(), lv0Var.v1.getCurrentAccount(), lv0Var.j1, this.b, this.c, this.d, this.e, this.f, lv0Var.F1);
                break;
        }
    }
}
