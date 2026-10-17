package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ik extends org.telegram.ui.Components.od {
    public final /* synthetic */ sn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik(sn snVar, Context context) {
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
        hk hkVar = snVar.Y;
        if (hkVar != null) {
            hkVar.invalidate();
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
