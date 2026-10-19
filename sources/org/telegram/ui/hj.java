package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class hj extends org.telegram.ui.Components.oo {
    public final /* synthetic */ qn v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(qn qnVar, Context context, qn qnVar2, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, qnVar2, z10, d6Var);
        this.v0 = qnVar;
    }

    @Override // org.telegram.ui.Components.oo
    public final boolean a() {
        boolean z10;
        qn qnVar = this.v0;
        if (qnVar.Pa || qnVar.isInPreviewMode()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) qnVar).inBubbleMode;
        if (z10 || qnVar.j0 == null || qnVar.s3) {
            return false;
        }
        return !qnVar.K9() || qnVar.h4;
    }

    @Override // org.telegram.ui.Components.oo
    public final boolean d() {
        qn qnVar = this.v0;
        TLRPC.User user = qnVar.f;
        if (user != null && user.linked_community_id != 0) {
            qnVar.showDialog(new hi.k0(qnVar, qnVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = qnVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        qnVar.showDialog(new hi.k0(qnVar, qnVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.oo
    public final void f() {
        qn qnVar = this.v0;
        qnVar.qa(qnVar.J9() ? "" : null);
    }

    @Override // org.telegram.ui.Components.oo
    public final boolean o() {
        return this.v0.R3 == 3;
    }
}
