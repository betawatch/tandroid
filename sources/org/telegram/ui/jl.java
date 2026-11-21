package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class jl extends org.telegram.ui.Components.q6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ il c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(il ilVar, int i7) {
        super("p2", 0);
        this.b = i7;
        switch (i7) {
            case 1:
                this.c = ilVar;
                super("progress", 0);
                break;
            case 2:
                this.c = ilVar;
                super("alpha", 0);
                break;
            default:
                this.c = ilVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.q6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((org.telegram.messenger.bj) obj).e = f10;
                View view = this.c.c.R.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 1:
                ((org.telegram.messenger.bj) obj).g = f10;
                View view2 = this.c.c.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            default:
                ((org.telegram.messenger.bj) obj).f = f10;
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
                return Float.valueOf(((org.telegram.messenger.bj) obj).e);
            case 1:
                return Float.valueOf(((org.telegram.messenger.bj) obj).g);
            default:
                return Float.valueOf(((org.telegram.messenger.bj) obj).f);
        }
    }
}
