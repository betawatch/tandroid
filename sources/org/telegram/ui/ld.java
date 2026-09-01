package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ld extends RadialProgressView {
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld(org.telegram.ui.Components.x40 x40Var, Context context, int i10) {
        super(context, null);
        this.H = i10;
        this.I = x40Var;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.H) {
            case 3:
                super.invalidate();
                du0 du0Var = ((PhotoViewer) this.I).b0;
                if (du0Var != null) {
                    du0Var.invalidate();
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
                ((f70) this.I).e.invalidate();
                break;
            case 2:
                super.setAlpha(f10);
                ((af0) this.I).h.invalidate();
                break;
            default:
                super.setAlpha(f10);
                du0 du0Var = ((PhotoViewer) this.I).b0;
                if (du0Var != null) {
                    du0Var.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.g6 g6Var) {
        super(contextThemeWrapper, g6Var);
        this.H = 3;
        this.I = photoViewer;
    }
}
