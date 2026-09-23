package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class lk extends org.telegram.ui.Components.pd {
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
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        xn xnVar = this.d;
        jk jkVar = xnVar.Y;
        if (jkVar != null) {
            jkVar.invalidate();
        }
        if (getVisibility() != 8) {
            xnVar.h9(true);
            FrameLayout frameLayout = xnVar.P;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
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
        if (i10 != 8 || (frameLayout = this.d.P) == null) {
            return;
        }
        frameLayout.setTranslationY(0.0f);
    }
}
