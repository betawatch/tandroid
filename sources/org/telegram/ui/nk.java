package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class nk extends org.telegram.ui.Components.od {
    public final /* synthetic */ zn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(zn znVar, Context context) {
        super(context);
        this.d = znVar;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        zn znVar = this.d;
        lk lkVar = znVar.Y;
        if (lkVar != null) {
            lkVar.invalidate();
        }
        if (getVisibility() != 8) {
            znVar.h9(true);
            FrameLayout frameLayout = znVar.P;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            znVar.o9();
            znVar.r9();
            View view = znVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        FrameLayout frameLayout;
        super.setVisibility(i10);
        if (i10 != 8 || (frameLayout = this.d.P) == null) {
            return;
        }
        frameLayout.setTranslationY(0.0f);
    }
}
