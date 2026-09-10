package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class al extends org.telegram.ui.Components.rn0 {
    public final /* synthetic */ eo I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(eo eoVar, Context context, eo eoVar2, int i10, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, j3, context, eoVar2, f6Var);
        this.I = eoVar;
    }

    @Override // org.telegram.ui.Components.rn0
    public final void b(boolean z10) {
        eo eoVar = this.I;
        eoVar.t7();
        eoVar.r7();
        fl flVar = eoVar.bb;
        if (flVar != null) {
            flVar.setTranslationY(eoVar.w9 + getCurrentHeight());
        }
        if (z10) {
            eoVar.D9 = true;
            eoVar.jc();
        }
    }

    @Override // org.telegram.ui.Components.rn0
    public final boolean f(yg.p0 p0Var) {
        int i10;
        eo eoVar = this.I;
        eoVar.q3 = p0Var;
        eoVar.r3 = p0Var != null;
        if (p0Var == null) {
            eoVar.getMediaDataController().clearFoundMessageObjects();
            eoVar.kb(false);
            eoVar.Fc(0, 0, -1);
        }
        eoVar.Ic();
        eoVar.vc();
        eoVar.t3 = eoVar.j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = eoVar.getMediaDataController();
        String str = eoVar.t3;
        long j3 = eoVar.T5;
        long j10 = eoVar.L6;
        i10 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
        mediaDataController.searchMessagesInChat(str, j3, j10, i10, 0, eoVar.d4, false, eoVar.o3, eoVar.p3, (TextUtils.isEmpty(eoVar.t3) && eoVar.q3 == null) ? false : true, eoVar.q3);
        AndroidUtilities.hideKeyboard(eoVar.j0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.rn0
    public final void h(boolean z10) {
        super.h(z10);
        eo eoVar = this.I;
        org.telegram.ui.ActionBar.w0 w0Var = eoVar.j0;
        g(w0Var != null && w0Var.s() && a() && eoVar.u3 == null);
    }
}
