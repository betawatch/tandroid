package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class em extends org.telegram.ui.Cells.b0 {
    public final /* synthetic */ lm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em(lm lmVar, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f = lmVar;
    }

    @Override // org.telegram.ui.Cells.b0
    public final int getSideMenuWidth() {
        zn znVar = this.f.Q;
        int i10 = zn.Gc;
        return znVar.R8();
    }
}
