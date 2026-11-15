package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ca implements org.telegram.ui.Components.gj0 {
    public final /* synthetic */ la a;

    public ca(la laVar) {
        this.a = laVar;
    }

    @Override // org.telegram.ui.Components.gj0
    public final void b(int i7, View view) {
        boolean z10 = view instanceof ia;
        la laVar = this.a;
        if (!z10) {
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
        String M0 = org.telegram.messenger.hd.M0(tL_username.active ? 2131743664 : 2131743671, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(tL_username.active ? 2131743662 : 2131743669, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(tL_username.active ? 2131749325 : 2131745353, null), new bg.f0(this, tL_username, i7, view, 1));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new org.telegram.messenger.fd(22));
        alertDialog$Builder.p();
    }
}
