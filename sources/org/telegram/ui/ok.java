package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ok extends org.telegram.ui.Components.nd {
    public final /* synthetic */ bo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(bo boVar, Context context) {
        super(context);
        this.d = boVar;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        bo boVar = this.d;
        mk mkVar = boVar.Y;
        if (mkVar != null) {
            mkVar.invalidate();
        }
        if (getVisibility() != 8) {
            boVar.h9(true);
            FrameLayout frameLayout = boVar.P;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            boVar.o9();
            boVar.r9();
            View view = boVar.fragmentView;
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
