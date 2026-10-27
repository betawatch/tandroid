package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class kk extends org.telegram.ui.Components.pd {
    public final /* synthetic */ wn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(wn wnVar, Context context) {
        super(context);
        this.d = wnVar;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        wn wnVar = this.d;
        jk jkVar = wnVar.Y;
        if (jkVar != null) {
            jkVar.invalidate();
        }
        if (getVisibility() != 8) {
            wnVar.u9(true);
            FrameLayout frameLayout = wnVar.P;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            wnVar.A9();
            wnVar.C9();
            View view = wnVar.fragmentView;
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
