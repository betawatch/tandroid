package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ld extends RadialProgressView {
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld(org.telegram.ui.Components.t40 t40Var, Context context, int i10) {
        super(context, null);
        this.K = i10;
        this.L = t40Var;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.K) {
            case 3:
                super.invalidate();
                xu0 xu0Var = ((PhotoViewer) this.L).e0;
                if (xu0Var != null) {
                    xu0Var.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.RadialProgressView, android.view.View
    public final void setAlpha(float f7) {
        switch (this.K) {
            case 0:
                super.setAlpha(f7);
                ((nd) this.L).f.invalidate();
                break;
            case 1:
                super.setAlpha(f7);
                ((n70) this.L).e.invalidate();
                break;
            case 2:
                super.setAlpha(f7);
                ((jf0) this.L).h.invalidate();
                break;
            default:
                super.setAlpha(f7);
                xu0 xu0Var = ((PhotoViewer) this.L).e0;
                if (xu0Var != null) {
                    xu0Var.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.f6 f6Var) {
        super(contextThemeWrapper, f6Var);
        this.K = 3;
        this.L = photoViewer;
    }
}
