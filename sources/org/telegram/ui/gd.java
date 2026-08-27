package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class gd extends RadialProgressView {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gd(org.telegram.ui.Components.i40 i40Var, Context context, int i10) {
        super(context, null);
        this.G = i10;
        this.H = i40Var;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.G) {
            case 3:
                super.invalidate();
                ut0 ut0Var = ((PhotoViewer) this.H).a0;
                if (ut0Var != null) {
                    ut0Var.invalidate();
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
        switch (this.G) {
            case 0:
                super.setAlpha(f10);
                ((id) this.H).f.invalidate();
                break;
            case 1:
                super.setAlpha(f10);
                ((u60) this.H).e.invalidate();
                break;
            case 2:
                super.setAlpha(f10);
                ((te0) this.H).h.invalidate();
                break;
            default:
                super.setAlpha(f10);
                ut0 ut0Var = ((PhotoViewer) this.H).a0;
                if (ut0Var != null) {
                    ut0Var.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.c6 c6Var) {
        super(contextThemeWrapper, c6Var);
        this.G = 3;
        this.H = photoViewer;
    }
}
