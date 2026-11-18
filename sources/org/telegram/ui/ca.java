package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ca implements org.telegram.ui.Components.oj0 {
    public final /* synthetic */ la a;

    public ca(la laVar) {
        this.a = laVar;
    }

    @Override // org.telegram.ui.Components.oj0
    public final void c(int i7, View view) {
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
        String M0 = org.telegram.messenger.gd.M0(tL_username.active ? 2131743427 : 2131743434, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.gd.M0(tL_username.active ? 2131743425 : 2131743432, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(tL_username.active ? 2131749133 : 2131745158, null), new bg.g0(this, tL_username, i7, view, 1));
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new org.telegram.messenger.ed(23));
        alertDialog$Builder.p();
    }
}
