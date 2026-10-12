package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class pk extends org.telegram.ui.Components.gp {
    public final /* synthetic */ fo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(fo foVar, Context context) {
        super(context);
        this.f = foVar;
    }

    @Override // org.telegram.ui.Components.gp
    public final void a(boolean z10) {
        fo foVar = this.f;
        foVar.w7();
        foVar.u7();
        foVar.x7();
        foVar.y7();
        il ilVar = foVar.bb;
        if (ilVar != null) {
            ilVar.setTranslationY(foVar.w9 + getCurrentHeight());
        }
        if (!z10) {
            foVar.t9();
        } else {
            foVar.D9 = true;
            foVar.nc();
        }
    }
}
