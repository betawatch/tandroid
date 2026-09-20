package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class o61 extends s4.c0 {
    public final /* synthetic */ s61 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o61(s61 s61Var, int i10) {
        super(i10, false);
        this.I = s61Var;
    }

    @Override // s4.c0
    public final int W0(s4.z0 z0Var) {
        return this.I.a3 ? AndroidUtilities.displaySize.y : super.W0(z0Var);
    }
}
