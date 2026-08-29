package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pk extends org.telegram.ui.Components.en0 {
    public final /* synthetic */ tn E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(tn tnVar, Context context, tn tnVar2, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, j10, context, tnVar2, c6Var);
        this.E = tnVar;
    }

    @Override // org.telegram.ui.Components.en0
    public final void b(boolean z10) {
        tn tnVar = this.E;
        tnVar.t7();
        tnVar.r7();
        uk ukVar = tnVar.Xa;
        if (ukVar != null) {
            ukVar.setTranslationY(tnVar.s9 + getCurrentHeight());
        }
        if (z10) {
            tnVar.z9 = true;
            tnVar.jc();
        }
    }

    @Override // org.telegram.ui.Components.en0
    public final boolean f(kg.q0 q0Var) {
        int i10;
        tn tnVar = this.E;
        tnVar.m3 = q0Var;
        tnVar.n3 = q0Var != null;
        if (q0Var == null) {
            tnVar.getMediaDataController().clearFoundMessageObjects();
            tnVar.kb(false);
            tnVar.Fc(0, 0, -1);
        }
        tnVar.Ic();
        tnVar.vc();
        tnVar.p3 = tnVar.f0.getSearchField().getText().toString();
        MediaDataController mediaDataController = tnVar.getMediaDataController();
        String str = tnVar.p3;
        long j10 = tnVar.P5;
        long j11 = tnVar.H6;
        i10 = ((org.telegram.ui.ActionBar.o2) tnVar).classGuid;
        mediaDataController.searchMessagesInChat(str, j10, j11, i10, 0, tnVar.Z3, false, tnVar.k3, tnVar.l3, (TextUtils.isEmpty(tnVar.p3) && tnVar.m3 == null) ? false : true, tnVar.m3);
        AndroidUtilities.hideKeyboard(tnVar.f0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.en0
    public final void h(boolean z10) {
        super.h(z10);
        tn tnVar = this.E;
        org.telegram.ui.ActionBar.w0 w0Var = tnVar.f0;
        g(w0Var != null && w0Var.s() && a() && tnVar.q3 == null);
    }
}
