package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class kd extends RadialProgressView {
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kd(org.telegram.ui.Components.l50 l50Var, Context context, int i10) {
        super(context, null);
        this.K = i10;
        this.L = l50Var;
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
                ((md) this.L).f.invalidate();
                break;
            case 1:
                super.setAlpha(f7);
                ((j70) this.L).e.invalidate();
                break;
            case 2:
                super.setAlpha(f7);
                ((gf0) this.L).h.invalidate();
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
    public kd(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.e6 e6Var) {
        super(contextThemeWrapper, e6Var);
        this.K = 3;
        this.L = photoViewer;
    }
}
