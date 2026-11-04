package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jj extends org.telegram.ui.Components.bo {
    public final /* synthetic */ wm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj(wm wmVar, Context context) {
        super(context);
        this.f = wmVar;
    }

    @Override // org.telegram.ui.Components.bo
    public final void a(boolean z10) {
        wm wmVar = this.f;
        wmVar.H7();
        wmVar.F7();
        wmVar.I7();
        wmVar.J7();
        dk dkVar = wmVar.yb;
        if (dkVar != null) {
            dkVar.setTranslationY(wmVar.Q9 + getCurrentHeight());
        }
        if (!z10) {
            wmVar.K9();
        } else {
            wmVar.X9 = true;
            wmVar.Nc();
        }
    }
}
