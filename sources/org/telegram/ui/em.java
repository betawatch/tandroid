package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class em extends org.telegram.ui.Components.h6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ dm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em(dm dmVar, int i10) {
        super("p2", 0);
        this.b = i10;
        switch (i10) {
            case 1:
                this.c = dmVar;
                super("progress", 0);
                break;
            case 2:
                this.c = dmVar;
                super("alpha", 0);
                break;
            default:
                this.c = dmVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.h6
    public final void c(Object obj, float f7) {
        switch (this.b) {
            case 0:
                ((org.telegram.messenger.gj) obj).e = f7;
                View view = this.c.c.Q.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 1:
                ((org.telegram.messenger.gj) obj).g = f7;
                View view2 = this.c.c.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            default:
                ((org.telegram.messenger.gj) obj).f = f7;
                View view3 = this.c.c.Q.fragmentView;
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
                return Float.valueOf(((org.telegram.messenger.gj) obj).e);
            case 1:
                return Float.valueOf(((org.telegram.messenger.gj) obj).g);
            default:
                return Float.valueOf(((org.telegram.messenger.gj) obj).f);
        }
    }
}
