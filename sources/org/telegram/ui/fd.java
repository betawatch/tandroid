package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fd extends RadialProgressView {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fd(org.telegram.ui.Components.r40 r40Var, Context context, int i10) {
        super(context, null);
        this.G = i10;
        this.H = r40Var;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.G) {
            case 3:
                super.invalidate();
                rt0 rt0Var = ((PhotoViewer) this.H).a0;
                if (rt0Var != null) {
                    rt0Var.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.RadialProgressView, android.view.View
    public final void setAlpha(float f9) {
        switch (this.G) {
            case 0:
                super.setAlpha(f9);
                ((hd) this.H).f.invalidate();
                break;
            case 1:
                super.setAlpha(f9);
                ((t60) this.H).e.invalidate();
                break;
            case 2:
                super.setAlpha(f9);
                ((pe0) this.H).h.invalidate();
                break;
            default:
                super.setAlpha(f9);
                rt0 rt0Var = ((PhotoViewer) this.H).a0;
                if (rt0Var != null) {
                    rt0Var.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.c6 c6Var) {
        super(contextThemeWrapper, c6Var);
        this.G = 3;
        this.H = photoViewer;
    }
}
