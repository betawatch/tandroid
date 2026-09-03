package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class nj extends org.telegram.ui.Components.yn {
    public final /* synthetic */ zn s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(zn znVar, Context context, zn znVar2, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, znVar2, z4, f6Var);
        this.s0 = znVar;
    }

    @Override // org.telegram.ui.Components.yn
    public final boolean a() {
        boolean z4;
        zn znVar = this.s0;
        if (znVar.La || znVar.isInPreviewMode()) {
            return false;
        }
        z4 = ((org.telegram.ui.ActionBar.p2) znVar).inBubbleMode;
        if (z4 || znVar.g0 == null || znVar.p3) {
            return false;
        }
        return !znVar.F9() || znVar.e4;
    }

    @Override // org.telegram.ui.Components.yn
    public final boolean d() {
        zn znVar = this.s0;
        TLRPC.User user = znVar.f;
        if (user != null && user.linked_community_id != 0) {
            znVar.showDialog(new sh.i0(znVar, znVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = znVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        znVar.showDialog(new sh.i0(znVar, znVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.yn
    public final void f() {
        zn znVar = this.s0;
        znVar.la(znVar.E9() ? "" : null);
    }

    @Override // org.telegram.ui.Components.yn
    public final boolean o() {
        return this.s0.O3 == 3;
    }
}
