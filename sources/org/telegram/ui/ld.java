package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ld extends RadialProgressView {
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld(org.telegram.ui.Components.d50 d50Var, Context context, int i10) {
        super(context, null);
        this.K = i10;
        this.L = d50Var;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.K) {
            case 3:
                super.invalidate();
                wu0 wu0Var = ((PhotoViewer) this.L).e0;
                if (wu0Var != null) {
                    wu0Var.invalidate();
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
                ((k70) this.L).e.invalidate();
                break;
            case 2:
                super.setAlpha(f7);
                ((hf0) this.L).h.invalidate();
                break;
            default:
                super.setAlpha(f7);
                wu0 wu0Var = ((PhotoViewer) this.L).e0;
                if (wu0Var != null) {
                    wu0Var.invalidate();
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
