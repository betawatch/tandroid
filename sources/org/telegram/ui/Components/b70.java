package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b70 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ im0 h;

    public /* synthetic */ b70(im0 im0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.h = im0Var;
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
                l70 l70Var = ((g70) this.h).c;
                Context context = l70Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) l70Var).currentAccount;
                long j10 = -l70Var.g0;
                d6Var = ((org.telegram.ui.ActionBar.f3) l70Var).resourcesProvider;
                x01.b(context, i10, j10, this.b, this.c, this.d, this.e, this.f, d6Var);
                break;
            default:
                uv0 uv0Var = ((eu0) this.h).f;
                x01.b(uv0Var.getContext(), uv0Var.v1.getCurrentAccount(), uv0Var.j1, this.b, this.c, this.d, this.e, this.f, uv0Var.F1);
                break;
        }
    }
}
