package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class jd extends RadialProgressView {
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jd(org.telegram.ui.Components.u40 u40Var, Context context, int i10) {
        super(context, null);
        this.K = i10;
        this.L = u40Var;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.K) {
            case 3:
                super.invalidate();
                nu0 nu0Var = ((PhotoViewer) this.L).e0;
                if (nu0Var != null) {
                    nu0Var.invalidate();
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
                ((ld) this.L).f.invalidate();
                break;
            case 1:
                super.setAlpha(f7);
                ((g70) this.L).e.invalidate();
                break;
            case 2:
                super.setAlpha(f7);
                ((bf0) this.L).h.invalidate();
                break;
            default:
                super.setAlpha(f7);
                nu0 nu0Var = ((PhotoViewer) this.L).e0;
                if (nu0Var != null) {
                    nu0Var.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.d6 d6Var) {
        super(contextThemeWrapper, d6Var);
        this.K = 3;
        this.L = photoViewer;
    }
}
