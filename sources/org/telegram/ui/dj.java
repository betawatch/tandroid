package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dj extends org.telegram.ui.Components.tn {
    public final /* synthetic */ qn r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(qn qnVar, Context context, qn qnVar2, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, qnVar2, z10, b6Var);
        this.r0 = qnVar;
    }

    @Override // org.telegram.ui.Components.tn
    public final boolean a() {
        boolean z10;
        qn qnVar = this.r0;
        if (qnVar.Ka || qnVar.isInPreviewMode()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.o2) qnVar).inBubbleMode;
        if (z10 || qnVar.f0 == null || qnVar.o3) {
            return false;
        }
        return !qnVar.F9() || qnVar.d4;
    }

    @Override // org.telegram.ui.Components.tn
    public final boolean d() {
        qn qnVar = this.r0;
        TLRPC.User user = qnVar.f;
        if (user != null && user.linked_community_id != 0) {
            qnVar.showDialog(new nh.j0(qnVar, qnVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = qnVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        qnVar.showDialog(new nh.j0(qnVar, qnVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.tn
    public final void f() {
        qn qnVar = this.r0;
        qnVar.la(qnVar.E9() ? "" : null);
    }

    @Override // org.telegram.ui.Components.tn
    public final boolean o() {
        return this.r0.N3 == 3;
    }
}
