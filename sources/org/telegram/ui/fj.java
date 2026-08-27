package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fj extends org.telegram.ui.Components.rn {
    public final /* synthetic */ rn r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(rn rnVar, Context context, rn rnVar2, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, rnVar2, z10, c6Var);
        this.r0 = rnVar;
    }

    @Override // org.telegram.ui.Components.rn
    public final boolean a() {
        boolean z10;
        rn rnVar = this.r0;
        if (rnVar.Ka || rnVar.isInPreviewMode()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) rnVar).inBubbleMode;
        if (z10 || rnVar.f0 == null || rnVar.o3) {
            return false;
        }
        return !rnVar.F9() || rnVar.d4;
    }

    @Override // org.telegram.ui.Components.rn
    public final boolean d() {
        rn rnVar = this.r0;
        TLRPC.User user = rnVar.f;
        if (user != null && user.linked_community_id != 0) {
            rnVar.showDialog(new oh.j0(rnVar, rnVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = rnVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        rnVar.showDialog(new oh.j0(rnVar, rnVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.rn
    public final void f() {
        rn rnVar = this.r0;
        rnVar.la(rnVar.E9() ? "" : null);
    }

    @Override // org.telegram.ui.Components.rn
    public final boolean p() {
        return this.r0.N3 == 3;
    }
}
