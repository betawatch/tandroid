package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class nk extends org.telegram.ui.Components.rc {
    public final /* synthetic */ un d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(un unVar, Context context) {
        super(context);
        this.d = unVar;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        un unVar = this.d;
        mk mkVar = unVar.Z;
        if (mkVar != null) {
            mkVar.invalidate();
        }
        if (getVisibility() != 8) {
            unVar.z9(true);
            FrameLayout frameLayout = unVar.Q;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            unVar.F9();
            unVar.H9();
            View view = unVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        FrameLayout frameLayout;
        super.setVisibility(i10);
        if (i10 != 8 || (frameLayout = this.d.Q) == null) {
            return;
        }
        frameLayout.setTranslationY(0.0f);
    }
}
