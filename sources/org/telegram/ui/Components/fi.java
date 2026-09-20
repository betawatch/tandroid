package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class fi extends ug {
    public final /* synthetic */ vi l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, vi viVar) {
        super(i10, context, f6Var, false);
        this.l0 = viVar;
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean e() {
        return !this.l0.U0;
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.ug
    public final int getFillColor() {
        return this.l0.getThemedColor(org.telegram.ui.ActionBar.j6.S5);
    }
}
