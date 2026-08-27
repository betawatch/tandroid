package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class u90 extends f2.w {
    public final /* synthetic */ aa0 c;

    public u90(aa0 aa0Var) {
        this.c = aa0Var;
    }

    @Override // f2.w
    public final int i(int i10) {
        aa0 aa0Var = this.c;
        pf.u0 u0Var = aa0Var.f;
        if (i10 == 0) {
            return 100;
        }
        int i11 = i10 - 1;
        Object J = u0Var.J(i11);
        if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
            return 100;
        }
        if (J instanceof TLRPC.Document) {
            return 20;
        }
        if (u0Var.I() != null || u0Var.Q != null) {
            i10 = i11;
        }
        t90 t90Var = aa0Var.d;
        t90Var.B1();
        return t90Var.R.get(i10);
    }
}
