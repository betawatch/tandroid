package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lj extends org.telegram.ui.Components.po {
    public final /* synthetic */ wn z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(wn wnVar, Context context, wn wnVar2, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, wnVar2, z10, u6Var);
        this.z0 = wnVar;
    }

    @Override // org.telegram.ui.Components.po
    public final boolean a() {
        boolean z10;
        wn wnVar = this.z0;
        if (wnVar.fb || wnVar.isInPreviewMode()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.r2) wnVar).inBubbleMode;
        if (z10 || wnVar.j0 == null || wnVar.E3) {
            return false;
        }
        return !wnVar.R9() || wnVar.t4;
    }

    @Override // org.telegram.ui.Components.po
    public final boolean d() {
        wn wnVar = this.z0;
        TLRPC.User user = wnVar.f;
        if (user != null && user.linked_community_id != 0) {
            wnVar.showDialog(new ii.j0(wnVar, wnVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = wnVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        wnVar.showDialog(new ii.j0(wnVar, wnVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.po
    public final void f() {
        wn wnVar = this.z0;
        wnVar.ya(wnVar.Q9() ? "" : null);
    }

    @Override // org.telegram.ui.Components.po
    public final boolean o() {
        return this.z0.d4 == 3;
    }
}
