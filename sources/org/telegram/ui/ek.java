package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ek extends org.telegram.ui.Components.bd {
    public final /* synthetic */ rn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(rn rnVar, Context context) {
        super(context);
        this.d = rnVar;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        rn rnVar = this.d;
        ck ckVar = rnVar.U;
        if (ckVar != null) {
            ckVar.invalidate();
        }
        if (getVisibility() != 8) {
            rnVar.h9(true);
            FrameLayout frameLayout = rnVar.L;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f10);
            }
            rnVar.o9();
            rnVar.r9();
            View view = rnVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        FrameLayout frameLayout;
        super.setVisibility(i10);
        if (i10 != 8 || (frameLayout = this.d.L) == null) {
            return;
        }
        frameLayout.setTranslationY(0.0f);
    }
}
