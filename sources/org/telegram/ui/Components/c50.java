package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ oj0 h;

    public /* synthetic */ c50(oj0 oj0Var, TLRPC.User user, String str, boolean z9, boolean z10, boolean z11, int i7) {
        this.a = i7;
        this.h = oj0Var;
        this.b = user;
        this.c = str;
        this.d = z9;
        this.e = z10;
        this.f = z11;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                m50 m50Var = ((h50) this.h).c;
                ey0.b(m50Var.getContext(), m50Var.a, -m50Var.X1, this.b, this.c, this.d, this.e, this.f, m50Var.I0);
                break;
            default:
                xs0 xs0Var = ((kr0) this.h).f;
                ey0.b(xs0Var.getContext(), xs0Var.x1.getCurrentAccount(), xs0Var.l1, this.b, this.c, this.d, this.e, this.f, xs0Var.H1);
                break;
        }
    }
}
