package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class lk extends org.telegram.ui.Components.qd {
    public final /* synthetic */ wn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(wn wnVar, Context context) {
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
            wnVar.h9(true);
            FrameLayout frameLayout = wnVar.P;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            wnVar.o9();
            wnVar.r9();
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
