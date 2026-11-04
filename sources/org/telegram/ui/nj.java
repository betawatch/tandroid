package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nj extends org.telegram.ui.Components.wc {
    public final /* synthetic */ wm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj(wm wmVar, Context context) {
        super(context);
        this.d = wmVar;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        wm wmVar = this.d;
        mj mjVar = wmVar.a0;
        if (mjVar != null) {
            mjVar.invalidate();
        }
        if (getVisibility() != 8) {
            wmVar.E9(true);
            FrameLayout frameLayout = wmVar.R;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f10);
            }
            wmVar.K9();
            wmVar.M9();
            View view = wmVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i3) {
        FrameLayout frameLayout;
        super.setVisibility(i3);
        if (i3 != 8 || (frameLayout = this.d.R) == null) {
            return;
        }
        frameLayout.setTranslationY(0.0f);
    }
}
