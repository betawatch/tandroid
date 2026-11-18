package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ bk0 h;

    public /* synthetic */ n50(bk0 bk0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i7) {
        this.a = i7;
        this.h = bk0Var;
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
                x50 x50Var = ((s50) this.h).c;
                ny0.b(x50Var.getContext(), x50Var.a, -x50Var.b2, this.b, this.c, this.d, this.e, this.f, x50Var.J0);
                break;
            default:
                gt0 gt0Var = ((tr0) this.h).f;
                ny0.b(gt0Var.getContext(), gt0Var.y1.getCurrentAccount(), gt0Var.m1, this.b, this.c, this.d, this.e, this.f, gt0Var.I1);
                break;
        }
    }
}
