package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ca implements org.telegram.ui.Components.bj0 {
    public final /* synthetic */ la a;

    public ca(la laVar) {
        this.a = laVar;
    }

    @Override // org.telegram.ui.Components.bj0
    public final void c(int i7, View view) {
        boolean z9 = view instanceof ia;
        la laVar = this.a;
        if (!z9) {
            if (view instanceof ga) {
                laVar.j0(true);
                return;
            }
            return;
        }
        ia iaVar = (ia) view;
        TLRPC.TL_username tL_username = iaVar.w;
        if (tL_username == null || iaVar.r) {
            return;
        }
        if (tL_username.editable && laVar.y == 0) {
            laVar.b.y0(0);
            laVar.j0(true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, laVar.getParentActivity(), laVar.getResourceProvider());
        String M0 = org.telegram.messenger.hd.M0(tL_username.active ? 2131743665 : 2131743672, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(tL_username.active ? 2131743663 : 2131743670, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(tL_username.active ? 2131749324 : 2131745354, null), new bg.f0(this, tL_username, i7, view, 1));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.messenger.ch(18));
        alertDialog$Builder.p();
    }
}
