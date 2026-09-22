package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ok extends org.telegram.ui.Components.pd {
    public final /* synthetic */ zn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(zn znVar, Context context) {
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
        mk mkVar = znVar.Y;
        if (mkVar != null) {
            mkVar.invalidate();
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
