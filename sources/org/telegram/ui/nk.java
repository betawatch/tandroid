package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class nk extends org.telegram.ui.Components.fd {
    public final /* synthetic */ zn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(zn znVar, Context context) {
        super(context);
        this.d = znVar;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        zn znVar = this.d;
        lk lkVar = znVar.V;
        if (lkVar != null) {
            lkVar.invalidate();
        }
        if (getVisibility() != 8) {
            znVar.h9(true);
            FrameLayout frameLayout = znVar.M;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f10);
            }
            znVar.o9();
            znVar.r9();
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
        if (i10 != 8 || (frameLayout = this.d.M) == null) {
            return;
        }
        frameLayout.setTranslationY(0.0f);
    }
}
