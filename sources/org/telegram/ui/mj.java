package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class mj extends org.telegram.ui.Components.fo {
    public final /* synthetic */ wn v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj(wn wnVar, Context context, wn wnVar2, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, wnVar2, z10, d6Var);
        this.v0 = wnVar;
    }

    @Override // org.telegram.ui.Components.fo
    public final boolean a() {
        boolean z10;
        wn wnVar = this.v0;
        if (wnVar.Oa || wnVar.isInPreviewMode()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.m2) wnVar).inBubbleMode;
        if (z10 || wnVar.j0 == null || wnVar.s3) {
            return false;
        }
        return !wnVar.F9() || wnVar.h4;
    }

    @Override // org.telegram.ui.Components.fo
    public final boolean d() {
        wn wnVar = this.v0;
        TLRPC.User user = wnVar.f;
        if (user != null && user.linked_community_id != 0) {
            wnVar.showDialog(new fi.k0(wnVar, wnVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = wnVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        wnVar.showDialog(new fi.k0(wnVar, wnVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.fo
    public final void f() {
        wn wnVar = this.v0;
        wnVar.la(wnVar.E9() ? "" : null);
    }

    @Override // org.telegram.ui.Components.fo
    public final boolean o() {
        return this.v0.R3 == 3;
    }
}
