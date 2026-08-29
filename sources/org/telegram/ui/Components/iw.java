package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class iw extends ry {
    public final /* synthetic */ fz D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(fz fzVar, Context context) {
        super(fzVar, context, 2);
        this.D = fzVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f9) {
        if (getTranslationY() != f9) {
            super.setTranslationY(f9);
            this.D.c0.invalidate();
        }
    }
}
