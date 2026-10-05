package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class nj extends org.telegram.ui.Components.ho {
    public final /* synthetic */ yn v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(yn ynVar, Context context, yn ynVar2, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, ynVar2, z10, d6Var);
        this.v0 = ynVar;
    }

    @Override // org.telegram.ui.Components.ho
    public final boolean a() {
        boolean z10;
        yn ynVar = this.v0;
        if (ynVar.Ma || ynVar.isInPreviewMode()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) ynVar).inBubbleMode;
        if (z10 || ynVar.h0 == null || ynVar.q3) {
            return false;
        }
        return !ynVar.E9() || ynVar.f4;
    }

    @Override // org.telegram.ui.Components.ho
    public final boolean d() {
        yn ynVar = this.v0;
        TLRPC.User user = ynVar.f;
        if (user != null && user.linked_community_id != 0) {
            ynVar.showDialog(new fi.k0(ynVar, ynVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = ynVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        ynVar.showDialog(new fi.k0(ynVar, ynVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.ho
    public final void f() {
        yn ynVar = this.v0;
        ynVar.ka(ynVar.D9() ? "" : null);
    }

    @Override // org.telegram.ui.Components.ho
    public final boolean n() {
        return this.v0.P3 == 3;
    }
}
