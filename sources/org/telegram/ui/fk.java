package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fk extends org.telegram.ui.Components.id {
    public final /* synthetic */ tn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk(tn tnVar, Context context) {
        super(context);
        this.d = tnVar;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        tn tnVar = this.d;
        dk dkVar = tnVar.U;
        if (dkVar != null) {
            dkVar.invalidate();
        }
        if (getVisibility() != 8) {
            tnVar.h9(true);
            FrameLayout frameLayout = tnVar.L;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f9);
            }
            tnVar.o9();
            tnVar.r9();
            View view = tnVar.fragmentView;
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
