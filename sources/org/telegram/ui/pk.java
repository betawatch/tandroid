package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class pk extends org.telegram.ui.Components.sd {
    public final /* synthetic */ zn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(zn znVar, Context context) {
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
        ok okVar = znVar.Y;
        if (okVar != null) {
            okVar.invalidate();
        }
        if (getVisibility() != 8) {
            znVar.m9(true);
            FrameLayout frameLayout = znVar.P;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            znVar.t9();
            znVar.w9();
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
