package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ yk0 h;

    public /* synthetic */ v50(yk0 yk0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.h = yk0Var;
        this.b = user;
        this.c = str;
        this.d = z10;
        this.e = z11;
        this.f = z12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var;
        switch (this.a) {
            case 0:
                f60 f60Var = ((a60) this.h).c;
                Context context = f60Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.e3) f60Var).currentAccount;
                long j10 = -f60Var.c0;
                c6Var = ((org.telegram.ui.ActionBar.e3) f60Var).resourcesProvider;
                kz0.b(context, i10, j10, this.b, this.c, this.d, this.e, this.f, c6Var);
                break;
            default:
                hu0 hu0Var = ((qs0) this.h).f;
                kz0.b(hu0Var.getContext(), hu0Var.r1.getCurrentAccount(), hu0Var.f1, this.b, this.c, this.d, this.e, this.f, hu0Var.B1);
                break;
        }
    }
}
