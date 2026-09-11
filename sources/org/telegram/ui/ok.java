package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ok extends org.telegram.ui.Components.pd {
    public final /* synthetic */ co d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(co coVar, Context context) {
        super(context);
        this.d = coVar;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        co coVar = this.d;
        mk mkVar = coVar.Y;
        if (mkVar != null) {
            mkVar.invalidate();
        }
        if (getVisibility() != 8) {
            coVar.h9(true);
            FrameLayout frameLayout = coVar.P;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            coVar.o9();
            coVar.r9();
            View view = coVar.fragmentView;
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
