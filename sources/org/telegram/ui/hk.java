package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class hk extends org.telegram.ui.Components.od {
    public final /* synthetic */ sn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(sn snVar, Context context) {
        super(context);
        this.d = snVar;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        sn snVar = this.d;
        gk gkVar = snVar.Y;
        if (gkVar != null) {
            gkVar.invalidate();
        }
        if (getVisibility() != 8) {
            snVar.m9(true);
            FrameLayout frameLayout = snVar.P;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            snVar.t9();
            snVar.w9();
            View view = snVar.fragmentView;
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
