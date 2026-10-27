package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ld extends RadialProgressView {
    public final /* synthetic */ int N;
    public final /* synthetic */ Object O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld(org.telegram.ui.Components.f50 f50Var, Context context, int i10) {
        super(context, null);
        this.N = i10;
        this.O = f50Var;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.N) {
            case 3:
                super.invalidate();
                ku0 ku0Var = ((PhotoViewer) this.O).e0;
                if (ku0Var != null) {
                    ku0Var.invalidate();
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
        switch (this.N) {
            case 0:
                super.setAlpha(f7);
                ((nd) this.O).h.invalidate();
                break;
            case 1:
                super.setAlpha(f7);
                ((z60) this.O).e.invalidate();
                break;
            case 2:
                super.setAlpha(f7);
                ((te0) this.O).h.invalidate();
                break;
            default:
                super.setAlpha(f7);
                ku0 ku0Var = ((PhotoViewer) this.O).e0;
                if (ku0Var != null) {
                    ku0Var.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.u6 u6Var) {
        super(contextThemeWrapper, u6Var);
        this.N = 3;
        this.O = photoViewer;
    }
}
