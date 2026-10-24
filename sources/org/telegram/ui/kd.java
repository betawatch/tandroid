package org.telegram.ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class kd extends RadialProgressView {
    public final /* synthetic */ int N;
    public final /* synthetic */ Object O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kd(org.telegram.ui.Components.d50 d50Var, Context context, int i10) {
        super(context, null);
        this.N = i10;
        this.O = d50Var;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.N) {
            case 3:
                super.invalidate();
                eu0 eu0Var = ((PhotoViewer) this.O).e0;
                if (eu0Var != null) {
                    eu0Var.invalidate();
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
                ((md) this.O).h.invalidate();
                break;
            case 1:
                super.setAlpha(f7);
                ((w60) this.O).e.invalidate();
                break;
            case 2:
                super.setAlpha(f7);
                ((ue0) this.O).h.invalidate();
                break;
            default:
                super.setAlpha(f7);
                eu0 eu0Var = ((PhotoViewer) this.O).e0;
                if (eu0Var != null) {
                    eu0Var.invalidate();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper, org.telegram.ui.ActionBar.g6 g6Var) {
        super(contextThemeWrapper, g6Var);
        this.N = 3;
        this.O = photoViewer;
    }
}
