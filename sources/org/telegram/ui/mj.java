package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class mj extends org.telegram.ui.Components.fo {
    public final /* synthetic */ xn v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj(xn xnVar, Context context, xn xnVar2, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, xnVar2, z10, d6Var);
        this.v0 = xnVar;
    }

    @Override // org.telegram.ui.Components.fo
    public final boolean a() {
        boolean z10;
        xn xnVar = this.v0;
        if (xnVar.Oa || xnVar.isInPreviewMode()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) xnVar).inBubbleMode;
        if (z10 || xnVar.j0 == null || xnVar.s3) {
            return false;
        }
        return !xnVar.F9() || xnVar.h4;
    }

    @Override // org.telegram.ui.Components.fo
    public final boolean d() {
        xn xnVar = this.v0;
        TLRPC.User user = xnVar.f;
        if (user != null && user.linked_community_id != 0) {
            xnVar.showDialog(new fi.k0(xnVar, xnVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = xnVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        xnVar.showDialog(new fi.k0(xnVar, xnVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.fo
    public final void f() {
        xn xnVar = this.v0;
        xnVar.la(xnVar.E9() ? "" : null);
    }

    @Override // org.telegram.ui.Components.fo
    public final boolean o() {
        return this.v0.R3 == 3;
    }
}
