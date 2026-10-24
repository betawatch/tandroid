package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class hj extends org.telegram.ui.Components.oo {
    public final /* synthetic */ sn z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(sn snVar, Context context, sn snVar2, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, snVar2, z10, g6Var);
        this.z0 = snVar;
    }

    @Override // org.telegram.ui.Components.oo
    public final boolean a() {
        boolean z10;
        sn snVar = this.z0;
        if (snVar.bb || snVar.isInPreviewMode()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.o2) snVar).inBubbleMode;
        if (z10 || snVar.j0 == null || snVar.E3) {
            return false;
        }
        return !snVar.K9() || snVar.t4;
    }

    @Override // org.telegram.ui.Components.oo
    public final boolean d() {
        sn snVar = this.z0;
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
        sn snVar = this.z0;
        snVar.qa(snVar.J9() ? "" : null);
    }

    @Override // org.telegram.ui.Components.oo
    public final boolean p() {
        return this.z0.d4 == 3;
    }
}
