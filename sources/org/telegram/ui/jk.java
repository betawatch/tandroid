package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class jk extends org.telegram.ui.Components.to {
    public final /* synthetic */ zn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(zn znVar, Context context) {
        super(context);
        this.f = znVar;
    }

    @Override // org.telegram.ui.Components.to
    public final void a(boolean z10) {
        zn znVar = this.f;
        znVar.t7();
        znVar.r7();
        znVar.u7();
        znVar.v7();
        bl blVar = znVar.ab;
        if (blVar != null) {
            blVar.setTranslationY(znVar.w9 + getCurrentHeight());
        }
        if (!z10) {
            znVar.o9();
        } else {
            znVar.D9 = true;
            znVar.jc();
        }
    }
}
