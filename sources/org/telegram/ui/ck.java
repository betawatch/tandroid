package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ck extends org.telegram.ui.Components.ed {
    public final /* synthetic */ qn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(qn qnVar, Context context) {
        super(context);
        this.d = qnVar;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        qn qnVar = this.d;
        ak akVar = qnVar.U;
        if (akVar != null) {
            akVar.invalidate();
        }
        if (getVisibility() != 8) {
            qnVar.h9(true);
            FrameLayout frameLayout = qnVar.L;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f10);
            }
            qnVar.o9();
            qnVar.r9();
            View view = qnVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i9) {
        FrameLayout frameLayout;
        super.setVisibility(i9);
        if (i9 != 8 || (frameLayout = this.d.L) == null) {
            return;
        }
        frameLayout.setTranslationY(0.0f);
    }
}
