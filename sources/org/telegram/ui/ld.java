package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ld extends RadialProgressView {
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld(org.telegram.ui.Components.x40 x40Var, Context context, int i10) {
        super(context, null);
        this.K = i10;
        this.L = x40Var;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.K) {
            case 3:
                super.invalidate();
                qu0 qu0Var = ((PhotoViewer) this.L).e0;
                if (qu0Var != null) {
                    qu0Var.invalidate();
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
                ((ff0) this.L).h.invalidate();
                break;
            default:
                super.setAlpha(f7);
                qu0 qu0Var = ((PhotoViewer) this.L).e0;
                if (qu0Var != null) {
                    qu0Var.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.d6 d6Var) {
        super(contextThemeWrapper, d6Var);
        this.K = 3;
        this.L = photoViewer;
    }
}
