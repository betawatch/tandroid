package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class id extends RadialProgressView {
    public final /* synthetic */ int N;
    public final /* synthetic */ Object O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ id(org.telegram.ui.Components.a40 a40Var, Context context, int i10) {
        super(context, null);
        this.N = i10;
        this.O = a40Var;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.N) {
            case 3:
                super.invalidate();
                as0 as0Var = ((PhotoViewer) this.O).e0;
                if (as0Var != null) {
                    as0Var.invalidate();
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
                ((kd) this.O).h.invalidate();
                break;
            case 1:
                super.setAlpha(f7);
                ((c60) this.O).e.invalidate();
                break;
            case 2:
                super.setAlpha(f7);
                ((wd0) this.O).h.invalidate();
                break;
            default:
                super.setAlpha(f7);
                as0 as0Var = ((PhotoViewer) this.O).e0;
                if (as0Var != null) {
                    as0Var.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.p6 p6Var) {
        super(contextThemeWrapper, p6Var);
        this.N = 3;
        this.O = photoViewer;
    }
}
