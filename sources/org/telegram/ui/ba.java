package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ba implements org.telegram.ui.Components.fj0 {
    public final /* synthetic */ ka a;

    public ba(ka kaVar) {
        this.a = kaVar;
    }

    @Override // org.telegram.ui.Components.fj0
    public final void f(int i3, View view) {
        boolean z10 = view instanceof ha;
        ka kaVar = this.a;
        if (!z10) {
            if (view instanceof fa) {
                kaVar.j0(true);
                return;
            }
            return;
        }
        ha haVar = (ha) view;
        TLRPC.TL_username tL_username = haVar.w;
        if (tL_username == null || haVar.r) {
            return;
        }
        if (tL_username.editable && kaVar.y == 0) {
            kaVar.b.y0(0);
            kaVar.j0(true);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, kaVar.getParentActivity(), kaVar.getResourceProvider());
        String M0 = org.telegram.messenger.bd.M0(tL_username.active ? 2131743674 : 2131743681, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(tL_username.active ? 2131743672 : 2131743679, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(tL_username.active ? 2131749333 : 2131745363, null), new cg.e0(this, tL_username, i3, view, 1));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new org.telegram.messenger.go(15));
        alertDialog$Builder.p();
    }
}
