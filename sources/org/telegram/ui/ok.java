package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ok extends org.telegram.ui.Components.um0 {
    public final /* synthetic */ rn E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(rn rnVar, Context context, rn rnVar2, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, j10, context, rnVar2, c6Var);
        this.E = rnVar;
    }

    @Override // org.telegram.ui.Components.um0
    public final void b(boolean z10) {
        rn rnVar = this.E;
        rnVar.t7();
        rnVar.r7();
        tk tkVar = rnVar.Xa;
        if (tkVar != null) {
            tkVar.setTranslationY(rnVar.s9 + getCurrentHeight());
        }
        if (z10) {
            rnVar.z9 = true;
            rnVar.jc();
        }
    }

    @Override // org.telegram.ui.Components.um0
    public final boolean f(ig.q0 q0Var) {
        int i10;
        rn rnVar = this.E;
        rnVar.m3 = q0Var;
        rnVar.n3 = q0Var != null;
        if (q0Var == null) {
            rnVar.getMediaDataController().clearFoundMessageObjects();
            rnVar.kb(false);
            rnVar.Fc(0, 0, -1);
        }
        rnVar.Ic();
        rnVar.vc();
        rnVar.p3 = rnVar.f0.getSearchField().getText().toString();
        MediaDataController mediaDataController = rnVar.getMediaDataController();
        String str = rnVar.p3;
        long j10 = rnVar.P5;
        long j11 = rnVar.H6;
        i10 = ((org.telegram.ui.ActionBar.n2) rnVar).classGuid;
        mediaDataController.searchMessagesInChat(str, j10, j11, i10, 0, rnVar.Z3, false, rnVar.k3, rnVar.l3, (TextUtils.isEmpty(rnVar.p3) && rnVar.m3 == null) ? false : true, rnVar.m3);
        AndroidUtilities.hideKeyboard(rnVar.f0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.um0
    public final void h(boolean z10) {
        super.h(z10);
        rn rnVar = this.E;
        org.telegram.ui.ActionBar.v0 v0Var = rnVar.f0;
        g(v0Var != null && v0Var.s() && a() && rnVar.q3 == null);
    }
}
