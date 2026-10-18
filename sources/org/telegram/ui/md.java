package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class md extends RadialProgressView {
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ md(org.telegram.ui.Components.d50 d50Var, Context context, int i10) {
        super(context, null);
        this.K = i10;
        this.L = d50Var;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.K) {
            case 3:
                super.invalidate();
                du0 du0Var = ((PhotoViewer) this.L).e0;
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
    public final void setAlpha(float f7) {
        switch (this.K) {
            case 0:
                super.setAlpha(f7);
                ((od) this.L).f.invalidate();
                break;
            case 1:
                super.setAlpha(f7);
                ((u60) this.L).e.invalidate();
                break;
            case 2:
                super.setAlpha(f7);
                ((pe0) this.L).h.invalidate();
                break;
            default:
                super.setAlpha(f7);
                du0 du0Var = ((PhotoViewer) this.L).e0;
                if (du0Var != null) {
                    du0Var.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.d6 d6Var) {
        super(contextThemeWrapper, d6Var);
        this.K = 3;
        this.L = photoViewer;
    }
}
