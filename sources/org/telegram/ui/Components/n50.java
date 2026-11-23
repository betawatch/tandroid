package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ dk0 h;

    public /* synthetic */ n50(dk0 dk0Var, TLRPC.User user, String str, boolean z10, boolean z11, boolean z12, int i7) {
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
                x50 x50Var = ((s50) this.h).c;
                oy0.b(x50Var.getContext(), x50Var.a, -x50Var.b2, this.b, this.c, this.d, this.e, this.f, x50Var.J0);
                break;
            default:
                it0 it0Var = ((ur0) this.h).f;
                oy0.b(it0Var.getContext(), it0Var.y1.getCurrentAccount(), it0Var.m1, this.b, this.c, this.d, this.e, this.f, it0Var.I1);
                break;
        }
    }
}
