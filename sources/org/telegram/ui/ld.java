package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ld extends RadialProgressView {
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld(org.telegram.ui.Components.v40 v40Var, Context context, int i10) {
        super(context, null);
        this.H = i10;
        this.I = v40Var;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.H) {
            case 3:
                super.invalidate();
                bu0 bu0Var = ((PhotoViewer) this.I).b0;
                if (bu0Var != null) {
                    bu0Var.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.RadialProgressView, android.view.View
    public final void setAlpha(float f10) {
        switch (this.H) {
            case 0:
                super.setAlpha(f10);
                ((nd) this.I).f.invalidate();
                break;
            case 1:
                super.setAlpha(f10);
                ((e70) this.I).e.invalidate();
                break;
            case 2:
                super.setAlpha(f10);
                ((ze0) this.I).h.invalidate();
                break;
            default:
                super.setAlpha(f10);
                bu0 bu0Var = ((PhotoViewer) this.I).b0;
                if (bu0Var != null) {
                    bu0Var.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.f6 f6Var) {
        super(contextThemeWrapper, f6Var);
        this.H = 3;
        this.I = photoViewer;
    }
}
