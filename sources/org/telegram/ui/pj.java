package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class pj extends org.telegram.ui.Components.co {
    public final /* synthetic */ co v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj(co coVar, Context context, co coVar2, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, coVar2, z10, f6Var);
        this.v0 = coVar;
    }

    @Override // org.telegram.ui.Components.co
    public final boolean a() {
        boolean z10;
        co coVar = this.v0;
        if (coVar.Oa || coVar.isInPreviewMode()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) coVar).inBubbleMode;
        if (z10 || coVar.j0 == null || coVar.s3) {
            return false;
        }
        return !coVar.F9() || coVar.h4;
    }

    @Override // org.telegram.ui.Components.co
    public final boolean d() {
        co coVar = this.v0;
        TLRPC.User user = coVar.f;
        if (user != null && user.linked_community_id != 0) {
            coVar.showDialog(new gi.k0(coVar, coVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = coVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        coVar.showDialog(new gi.k0(coVar, coVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.co
    public final void f() {
        co coVar = this.v0;
        coVar.la(coVar.E9() ? "" : null);
    }

    @Override // org.telegram.ui.Components.co
    public final boolean o() {
        return this.v0.R3 == 3;
    }
}
