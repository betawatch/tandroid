package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class pj extends org.telegram.ui.Components.eo {
    public final /* synthetic */ zn v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj(zn znVar, Context context, zn znVar2, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, znVar2, z10, f6Var);
        this.v0 = znVar;
    }

    @Override // org.telegram.ui.Components.eo
    public final boolean a() {
        boolean z10;
        zn znVar = this.v0;
        if (znVar.Oa || znVar.isInPreviewMode()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) znVar).inBubbleMode;
        if (z10 || znVar.j0 == null || znVar.s3) {
            return false;
        }
        return !znVar.F9() || znVar.h4;
    }

    @Override // org.telegram.ui.Components.eo
    public final boolean d() {
        zn znVar = this.v0;
        TLRPC.User user = znVar.f;
        if (user != null && user.linked_community_id != 0) {
            znVar.showDialog(new fi.k0(znVar, znVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = znVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        znVar.showDialog(new fi.k0(znVar, znVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.eo
    public final void f() {
        zn znVar = this.v0;
        znVar.la(znVar.E9() ? "" : null);
    }

    @Override // org.telegram.ui.Components.eo
    public final boolean o() {
        return this.v0.R3 == 3;
    }
}
