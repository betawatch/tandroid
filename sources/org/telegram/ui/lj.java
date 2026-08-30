package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class lj extends org.telegram.ui.Components.zn {
    public final /* synthetic */ xn s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(xn xnVar, Context context, xn xnVar2, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, xnVar2, z4, f6Var);
        this.s0 = xnVar;
    }

    @Override // org.telegram.ui.Components.zn
    public final boolean a() {
        boolean z4;
        xn xnVar = this.s0;
        if (xnVar.La || xnVar.isInPreviewMode()) {
            return false;
        }
        z4 = ((org.telegram.ui.ActionBar.p2) xnVar).inBubbleMode;
        if (z4 || xnVar.g0 == null || xnVar.p3) {
            return false;
        }
        return !xnVar.F9() || xnVar.e4;
    }

    @Override // org.telegram.ui.Components.zn
    public final boolean d() {
        xn xnVar = this.s0;
        TLRPC.User user = xnVar.f;
        if (user != null && user.linked_community_id != 0) {
            xnVar.showDialog(new sh.i0(xnVar, xnVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = xnVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        xnVar.showDialog(new sh.i0(xnVar, xnVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.zn
    public final void f() {
        xn xnVar = this.s0;
        xnVar.la(xnVar.E9() ? "" : null);
    }

    @Override // org.telegram.ui.Components.zn
    public final boolean o() {
        return this.s0.O3 == 3;
    }
}
