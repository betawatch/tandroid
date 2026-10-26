package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ik extends org.telegram.ui.Components.pd {
    public final /* synthetic */ un d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik(un unVar, Context context) {
        super(context);
        this.d = unVar;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        un unVar = this.d;
        hk hkVar = unVar.Y;
        if (hkVar != null) {
            hkVar.invalidate();
        }
        if (getVisibility() != 8) {
            unVar.r9(true);
            FrameLayout frameLayout = unVar.P;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            unVar.x9();
            unVar.z9();
            View view = unVar.fragmentView;
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
