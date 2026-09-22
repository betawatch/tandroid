package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class kd extends RadialProgressView {
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kd(org.telegram.ui.Components.t40 t40Var, Context context, int i10) {
        super(context, null);
        this.K = i10;
        this.L = t40Var;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.K) {
            case 3:
                super.invalidate();
                vu0 vu0Var = ((PhotoViewer) this.L).e0;
                if (vu0Var != null) {
                    vu0Var.invalidate();
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
                ((l70) this.L).e.invalidate();
                break;
            case 2:
                super.setAlpha(f7);
                ((jf0) this.L).h.invalidate();
                break;
            default:
                super.setAlpha(f7);
                vu0 vu0Var = ((PhotoViewer) this.L).e0;
                if (vu0Var != null) {
                    vu0Var.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.f6 f6Var) {
        super(contextThemeWrapper, f6Var);
        this.K = 3;
        this.L = photoViewer;
    }
}
