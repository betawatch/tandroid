package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                ey0.b(m50Var.getContext(), m50Var.a, -m50Var.a2, this.b, this.c, this.d, this.e, this.f, m50Var.I0);
                break;
            default:
                ys0 ys0Var = ((lr0) this.h).f;
                ey0.b(ys0Var.getContext(), ys0Var.x1.getCurrentAccount(), ys0Var.l1, this.b, this.c, this.d, this.e, this.f, ys0Var.H1);
                break;
        }
    }
}
