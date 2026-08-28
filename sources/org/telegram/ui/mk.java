package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mk extends org.telegram.ui.Components.sm0 {
    public final /* synthetic */ qn E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(qn qnVar, Context context, qn qnVar2, int i9, long j10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(i9, j10, context, qnVar2, b6Var);
        this.E = qnVar;
    }

    @Override // org.telegram.ui.Components.sm0
    public final void b(boolean z10) {
        qn qnVar = this.E;
        qnVar.t7();
        qnVar.r7();
        rk rkVar = qnVar.Xa;
        if (rkVar != null) {
            rkVar.setTranslationY(qnVar.s9 + getCurrentHeight());
        }
        if (z10) {
            qnVar.z9 = true;
            qnVar.jc();
        }
    }

    @Override // org.telegram.ui.Components.sm0
    public final boolean f(hg.r0 r0Var) {
        int i9;
        qn qnVar = this.E;
        qnVar.m3 = r0Var;
        qnVar.n3 = r0Var != null;
        if (r0Var == null) {
            qnVar.getMediaDataController().clearFoundMessageObjects();
            qnVar.kb(false);
            qnVar.Fc(0, 0, -1);
        }
        qnVar.Ic();
        qnVar.vc();
        qnVar.p3 = qnVar.f0.getSearchField().getText().toString();
        MediaDataController mediaDataController = qnVar.getMediaDataController();
        String str = qnVar.p3;
        long j10 = qnVar.P5;
        long j11 = qnVar.H6;
        i9 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
        mediaDataController.searchMessagesInChat(str, j10, j11, i9, 0, qnVar.Z3, false, qnVar.k3, qnVar.l3, (TextUtils.isEmpty(qnVar.p3) && qnVar.m3 == null) ? false : true, qnVar.m3);
        AndroidUtilities.hideKeyboard(qnVar.f0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.sm0
    public final void h(boolean z10) {
        super.h(z10);
        qn qnVar = this.E;
        org.telegram.ui.ActionBar.w0 w0Var = qnVar.f0;
        g(w0Var != null && w0Var.s() && a() && qnVar.q3 == null);
    }
}
