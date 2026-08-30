package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class lk extends org.telegram.ui.Components.fd {
    public final /* synthetic */ xn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(xn xnVar, Context context) {
        super(context);
        this.d = xnVar;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        xn xnVar = this.d;
        jk jkVar = xnVar.V;
        if (jkVar != null) {
            jkVar.invalidate();
        }
        if (getVisibility() != 8) {
            xnVar.h9(true);
            FrameLayout frameLayout = xnVar.M;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f10);
            }
            xnVar.o9();
            xnVar.r9();
            View view = xnVar.fragmentView;
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
