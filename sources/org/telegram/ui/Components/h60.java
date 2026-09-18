package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ll0 h;

    public /* synthetic */ h60(ll0 ll0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.h = ll0Var;
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
                r60 r60Var = ((m60) this.h).c;
                Context context = r60Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.g3) r60Var).currentAccount;
                long j3 = -r60Var.g0;
                f6Var = ((org.telegram.ui.ActionBar.g3) r60Var).resourcesProvider;
                c01.b(context, i10, j3, this.b, this.c, this.d, this.e, this.f, f6Var);
                break;
            default:
                zu0 zu0Var = ((jt0) this.h).f;
                c01.b(zu0Var.getContext(), zu0Var.v1.getCurrentAccount(), zu0Var.j1, this.b, this.c, this.d, this.e, this.f, zu0Var.F1);
                break;
        }
    }
}
