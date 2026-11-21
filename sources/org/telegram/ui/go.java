package org.telegram.ui;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class go implements org.telegram.ui.Components.qj0 {
    public final /* synthetic */ io a;

    public go(io ioVar) {
        this.a = ioVar;
    }

    @Override // org.telegram.ui.Components.qj0
    public final void c(int i7, View view) {
        TLRPC.TL_username tL_username;
        io ioVar = this.a;
        jo joVar = ioVar.i3;
        if (!(view instanceof ia) || (tL_username = ((ia) view).w) == null) {
            return;
        }
        if (tL_username.editable) {
            if (joVar.fragmentView instanceof ScrollView) {
                joVar.a.smoothScrollTo(0, joVar.E.getTop() - org.telegram.messenger.g0.L(128.0f));
            }
            joVar.b.requestFocus();
            org.telegram.messenger.g0.I3(joVar.b);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ioVar.getContext(), joVar.getResourceProvider());
        String N0 = org.telegram.messenger.gd.N0(tL_username.active ? 2131743421 : 2131743428, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(tL_username.active ? 2131743420 : 2131743427, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(tL_username.active ? 2131749132 : 2131745157, null), new z6(this, tL_username, view, 8));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new org.telegram.messenger.ed(28));
        alertDialog$Builder.p();
    }
}
