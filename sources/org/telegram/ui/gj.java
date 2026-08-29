package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gj extends org.telegram.ui.Components.xn {
    public final /* synthetic */ tn r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(tn tnVar, Context context, tn tnVar2, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, tnVar2, z10, c6Var);
        this.r0 = tnVar;
    }

    @Override // org.telegram.ui.Components.xn
    public final boolean a() {
        boolean z10;
        tn tnVar = this.r0;
        if (tnVar.Ka || tnVar.isInPreviewMode()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.o2) tnVar).inBubbleMode;
        if (z10 || tnVar.f0 == null || tnVar.o3) {
            return false;
        }
        return !tnVar.F9() || tnVar.d4;
    }

    @Override // org.telegram.ui.Components.xn
    public final boolean d() {
        tn tnVar = this.r0;
        TLRPC.User user = tnVar.f;
        if (user != null && user.linked_community_id != 0) {
            tnVar.showDialog(new qh.i0(tnVar, tnVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = tnVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        tnVar.showDialog(new qh.i0(tnVar, tnVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.xn
    public final void f() {
        tn tnVar = this.r0;
        tnVar.la(tnVar.E9() ? "" : null);
    }

    @Override // org.telegram.ui.Components.xn
    public final boolean o() {
        return this.r0.N3 == 3;
    }
}
