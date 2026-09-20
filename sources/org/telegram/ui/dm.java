package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class dm extends org.telegram.ui.Cells.h0 {
    public final /* synthetic */ lm L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm(lm lmVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.L = lmVar;
    }

    @Override // org.telegram.ui.Cells.h0
    public final int getSideMenuWidth() {
        zn znVar = this.L.Q;
        int i10 = zn.Gc;
        return znVar.R8();
    }
}
