package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class pk extends org.telegram.ui.Components.nd {
    public final /* synthetic */ bo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(bo boVar, Context context) {
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
        nk nkVar = boVar.Y;
        if (nkVar != null) {
            nkVar.invalidate();
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
