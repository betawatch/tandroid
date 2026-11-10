package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class gn implements e8 {
    public final /* synthetic */ org.telegram.ui.ActionBar.g1[] a;
    public final /* synthetic */ jn b;

    public gn(jn jnVar, org.telegram.ui.ActionBar.g1[] g1VarArr) {
        this.b = jnVar;
        this.a = g1VarArr;
    }

    @Override // org.telegram.ui.Components.e8
    public final void X0(int i7, int i10) {
        org.telegram.ui.cn cnVar = this.b.G;
        if (cnVar == null) {
            return;
        }
        cnVar.getMessagesController().I4(i7, cnVar.a());
        TLRPC.ChatFull chatFull = cnVar.p8;
        TLRPC.UserFull userFull = cnVar.q8;
        if (userFull == null && chatFull == null) {
            return;
        }
        cnVar.g8();
        UndoView undoView = cnVar.M3;
        if (undoView != null) {
            undoView.k(cnVar.a(), i10, cnVar.j(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
        }
    }

    @Override // org.telegram.ui.Components.e8
    public final void dismiss() {
        org.telegram.ui.ActionBar.g1 g1Var = this.a[0];
        if (g1Var != null) {
            g1Var.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.e8
    public final /* synthetic */ void i1() {
    }
}
