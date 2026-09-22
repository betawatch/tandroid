package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ kl0 h;

    public /* synthetic */ h60(kl0 kl0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.h = kl0Var;
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
                r60 r60Var = ((m60) this.h).c;
                Context context = r60Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.f3) r60Var).currentAccount;
                long j3 = -r60Var.g0;
                e6Var = ((org.telegram.ui.ActionBar.f3) r60Var).resourcesProvider;
                b01.b(context, i10, j3, this.b, this.c, this.d, this.e, this.f, e6Var);
                break;
            default:
                yu0 yu0Var = ((it0) this.h).f;
                b01.b(yu0Var.getContext(), yu0Var.v1.getCurrentAccount(), yu0Var.j1, this.b, this.c, this.d, this.e, this.f, yu0Var.F1);
                break;
        }
    }
}
