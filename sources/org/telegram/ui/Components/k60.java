package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ sl0 h;

    public /* synthetic */ k60(sl0 sl0Var, TLRPC.User user, String str, boolean z4, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.h = sl0Var;
        this.b = user;
        this.c = str;
        this.d = z4;
        this.e = z10;
        this.f = z11;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var;
        switch (this.a) {
            case 0:
                u60 u60Var = ((p60) this.h).c;
                Context context = u60Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.h3) u60Var).currentAccount;
                long j10 = -u60Var.d0;
                g6Var = ((org.telegram.ui.ActionBar.h3) u60Var).resourcesProvider;
                g01.b(context, i10, j10, this.b, this.c, this.d, this.e, this.f, g6Var);
                break;
            default:
                zu0 zu0Var = ((it0) this.h).f;
                g01.b(zu0Var.getContext(), zu0Var.s1.getCurrentAccount(), zu0Var.g1, this.b, this.c, this.d, this.e, this.f, zu0Var.C1);
                break;
        }
    }
}
