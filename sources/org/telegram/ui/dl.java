package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class dl extends org.telegram.ui.Components.ko0 {
    public final /* synthetic */ fo I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl(fo foVar, Context context, fo foVar2, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, j10, context, foVar2, c6Var);
        this.I = foVar;
    }

    @Override // org.telegram.ui.Components.ko0
    public final void b(boolean z10) {
        fo foVar = this.I;
        foVar.w7();
        foVar.u7();
        il ilVar = foVar.bb;
        if (ilVar != null) {
            ilVar.setTranslationY(foVar.w9 + getCurrentHeight());
        }
        if (z10) {
            foVar.D9 = true;
            foVar.nc();
        }
    }

    @Override // org.telegram.ui.Components.ko0
    public final boolean f(ah.i1 i1Var) {
        int i10;
        fo foVar = this.I;
        foVar.q3 = i1Var;
        foVar.r3 = i1Var != null;
        if (i1Var == null) {
            foVar.getMediaDataController().clearFoundMessageObjects();
            foVar.ob(false);
            foVar.Jc(0, 0, -1);
        }
        foVar.Mc();
        foVar.zc();
        foVar.t3 = foVar.j0.getSearchField().getText().toString();
        MediaDataController mediaDataController = foVar.getMediaDataController();
        String str = foVar.t3;
        long j10 = foVar.T5;
        long j11 = foVar.L6;
        i10 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
        mediaDataController.searchMessagesInChat(str, j10, j11, i10, 0, foVar.d4, false, foVar.o3, foVar.p3, (TextUtils.isEmpty(foVar.t3) && foVar.q3 == null) ? false : true, foVar.q3);
        AndroidUtilities.hideKeyboard(foVar.j0.getSearchField());
        return true;
    }

    @Override // org.telegram.ui.Components.ko0
    public final void h(boolean z10) {
        super.h(z10);
        fo foVar = this.I;
        org.telegram.ui.ActionBar.u0 u0Var = foVar.j0;
        g(u0Var != null && u0Var.s() && a() && foVar.u3 == null);
    }
}
