package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ tk0 h;

    public /* synthetic */ s50(tk0 tk0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i10) {
        this.a = i10;
        this.h = tk0Var;
        this.b = user;
        this.c = str;
        this.d = z10;
        this.e = z11;
        this.f = z12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                c60 c60Var = ((x50) this.h).c;
                jz0.b(c60Var.getContext(), c60Var.a, -c60Var.X1, this.b, this.c, this.d, this.e, this.f, c60Var.I0);
                break;
            default:
                au0 au0Var = ((ls0) this.h).f;
                jz0.b(au0Var.getContext(), au0Var.x1.getCurrentAccount(), au0Var.l1, this.b, this.c, this.d, this.e, this.f, au0Var.H1);
                break;
        }
    }
}
