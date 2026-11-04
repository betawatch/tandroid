package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class el extends org.telegram.ui.Components.j6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ dl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el(dl dlVar, int i3) {
        super("p2", 0);
        this.b = i3;
        switch (i3) {
            case 1:
                this.c = dlVar;
                super("progress", 0);
                break;
            case 2:
                this.c = dlVar;
                super("alpha", 0);
                break;
            default:
                this.c = dlVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.j6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((org.telegram.messenger.vi) obj).e = f10;
                View view = this.c.c.R.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 1:
                ((org.telegram.messenger.vi) obj).g = f10;
                View view2 = this.c.c.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            default:
                ((org.telegram.messenger.vi) obj).f = f10;
                View view3 = this.c.c.R.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(((org.telegram.messenger.vi) obj).e);
            case 1:
                return Float.valueOf(((org.telegram.messenger.vi) obj).g);
            default:
                return Float.valueOf(((org.telegram.messenger.vi) obj).f);
        }
    }
}
