package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class pj extends org.telegram.ui.Components.eo {
    public final /* synthetic */ bo v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj(bo boVar, Context context, bo boVar2, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, boVar2, z10, e6Var);
        this.v0 = boVar;
    }

    @Override // org.telegram.ui.Components.eo
    public final boolean a() {
        boolean z10;
        bo boVar = this.v0;
        if (boVar.Oa || boVar.isInPreviewMode()) {
            return false;
        }
        z10 = ((org.telegram.ui.ActionBar.n2) boVar).inBubbleMode;
        if (z10 || boVar.j0 == null || boVar.s3) {
            return false;
        }
        return !boVar.F9() || boVar.h4;
    }

    @Override // org.telegram.ui.Components.eo
    public final boolean d() {
        bo boVar = this.v0;
        TLRPC.User user = boVar.f;
        if (user != null && user.linked_community_id != 0) {
            boVar.showDialog(new fi.k0(boVar, boVar.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = boVar.e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        boVar.showDialog(new fi.k0(boVar, boVar.e.linked_community_id, null, null));
        return true;
    }

    @Override // org.telegram.ui.Components.eo
    public final void f() {
        bo boVar = this.v0;
        boVar.la(boVar.E9() ? "" : null);
    }

    @Override // org.telegram.ui.Components.eo
    public final boolean o() {
        return this.v0.R3 == 3;
    }
}
