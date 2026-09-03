package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                iu0 iu0Var = ((PhotoViewer) this.I).b0;
                if (iu0Var != null) {
                    iu0Var.invalidate();
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
                iu0 iu0Var = ((PhotoViewer) this.I).b0;
                if (iu0Var != null) {
                    iu0Var.invalidate();
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
