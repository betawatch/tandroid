package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ dk0 h;

    public /* synthetic */ q50(dk0 dk0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i7) {
        this.a = i7;
        this.h = dk0Var;
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
                a60 a60Var = ((v50) this.h).c;
                py0.b(a60Var.getContext(), a60Var.a, -a60Var.b2, this.b, this.c, this.d, this.e, this.f, a60Var.J0);
                break;
            default:
                jt0 jt0Var = ((vr0) this.h).f;
                py0.b(jt0Var.getContext(), jt0Var.y1.getCurrentAccount(), jt0Var.m1, this.b, this.c, this.d, this.e, this.f, jt0Var.I1);
                break;
        }
    }
}
