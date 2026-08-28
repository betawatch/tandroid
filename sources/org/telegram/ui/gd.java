package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gd extends RadialProgressView {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gd(org.telegram.ui.Components.d40 d40Var, Context context, int i9) {
        super(context, null);
        this.G = i9;
        this.H = d40Var;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.G) {
            case 3:
                super.invalidate();
                tt0 tt0Var = ((PhotoViewer) this.H).a0;
                if (tt0Var != null) {
                    tt0Var.invalidate();
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
                ((r60) this.H).e.invalidate();
                break;
            case 2:
                super.setAlpha(f10);
                ((qe0) this.H).h.invalidate();
                break;
            default:
                super.setAlpha(f10);
                tt0 tt0Var = ((PhotoViewer) this.H).a0;
                if (tt0Var != null) {
                    tt0Var.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.b6 b6Var) {
        super(contextThemeWrapper, b6Var);
        this.G = 3;
        this.H = photoViewer;
    }
}
