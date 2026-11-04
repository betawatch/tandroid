package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y40 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ sj0 h;

    public /* synthetic */ y40(sj0 sj0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i3) {
        this.a = i3;
        this.h = sj0Var;
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
                i50 i50Var = ((d50) this.h).c;
                dy0.b(i50Var.getContext(), i50Var.a, -i50Var.Y1, this.b, this.c, this.d, this.e, this.f, i50Var.J0);
                break;
            default:
                ws0 ws0Var = ((jr0) this.h).f;
                dy0.b(ws0Var.getContext(), ws0Var.y1.getCurrentAccount(), ws0Var.m1, this.b, this.c, this.d, this.e, this.f, ws0Var.I1);
                break;
        }
    }
}
