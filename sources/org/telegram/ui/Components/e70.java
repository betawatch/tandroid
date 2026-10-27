package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ mm0 h;

    public /* synthetic */ e70(mm0 mm0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.h = mm0Var;
        this.b = user;
        this.c = str;
        this.d = z10;
        this.e = z11;
        this.f = z12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var;
        switch (this.a) {
            case 0:
                o70 o70Var = ((j70) this.h).c;
                Context context = o70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.k3) o70Var).currentAccount;
                long j10 = -o70Var.g0;
                u6Var = ((org.telegram.ui.ActionBar.k3) o70Var).resourcesProvider;
                j11.b(context, i10, j10, this.b, this.c, this.d, this.e, this.f, u6Var);
                break;
            default:
                bw0 bw0Var = ((lu0) this.h).f;
                j11.b(bw0Var.getContext(), bw0Var.x1.getCurrentAccount(), bw0Var.l1, this.b, this.c, this.d, this.e, this.f, bw0Var.H1);
                break;
        }
    }
}
