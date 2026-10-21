package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class gk extends org.telegram.ui.Components.od {
    public final /* synthetic */ qn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk(qn qnVar, Context context) {
        super(context);
        this.d = qnVar;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        qn qnVar = this.d;
        fk fkVar = qnVar.Y;
        if (fkVar != null) {
            fkVar.invalidate();
        }
        if (getVisibility() != 8) {
            qnVar.m9(true);
            FrameLayout frameLayout = qnVar.P;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            qnVar.t9();
            qnVar.w9();
            View view = qnVar.fragmentView;
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
