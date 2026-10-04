package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class lk extends org.telegram.ui.Components.qd {
    public final /* synthetic */ yn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(yn ynVar, Context context) {
        super(context);
        this.d = ynVar;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        yn ynVar = this.d;
        jk jkVar = ynVar.W;
        if (jkVar != null) {
            jkVar.invalidate();
        }
        if (getVisibility() != 8) {
            ynVar.i9(true);
            FrameLayout frameLayout = ynVar.N;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            ynVar.o9();
            ynVar.q9();
            View view = ynVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        FrameLayout frameLayout;
        super.setVisibility(i10);
        if (i10 != 8 || (frameLayout = this.d.N) == null) {
            return;
        }
        frameLayout.setTranslationY(0.0f);
    }
}
