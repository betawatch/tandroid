package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class jj extends org.telegram.ui.Components.oo {
    public final /* synthetic */ sn v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj(sn snVar, Context context, sn snVar2, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, snVar2, z10, d6Var);
        this.v0 = snVar;
    }

    @Override // org.telegram.ui.Components.oo
    public final boolean a() {
        boolean z10;
        sn snVar = this.v0;
        if (snVar.Pa || snVar.isInPreviewMode()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) snVar).inBubbleMode;
        if (z10 || snVar.j0 == null || snVar.s3) {
            return false;
        }
        return !snVar.K9() || snVar.h4;
    }

    @Override // org.telegram.ui.Components.oo
    public final boolean d() {
        sn snVar = this.v0;
        TLRPC.User user = snVar.f;
        if (user != null && user.linked_community_id != 0) {
            snVar.showDialog(new hi.k0(snVar, snVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = snVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        snVar.showDialog(new hi.k0(snVar, snVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.oo
    public final void f() {
        sn snVar = this.v0;
        snVar.qa(snVar.J9() ? "" : null);
    }

    @Override // org.telegram.ui.Components.oo
    public final boolean o() {
        return this.v0.R3 == 3;
    }
}
