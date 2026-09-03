package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class nd extends RadialProgressView {
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nd(org.telegram.ui.Components.w40 w40Var, Context context, int i10) {
        super(context, null);
        this.H = i10;
        this.I = w40Var;
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
                ((pd) this.I).f.invalidate();
                break;
            case 1:
                super.setAlpha(f10);
                ((g70) this.I).e.invalidate();
                break;
            case 2:
                super.setAlpha(f10);
                ((bf0) this.I).h.invalidate();
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
    public nd(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.f6 f6Var) {
        super(contextThemeWrapper, f6Var);
        this.H = 3;
        this.I = photoViewer;
    }
}
