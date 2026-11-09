package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class kl extends org.telegram.ui.Components.l6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ jl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl(jl jlVar, int i7) {
        super("p2", 0);
        this.b = i7;
        switch (i7) {
            case 1:
                this.c = jlVar;
                super("progress", 0);
                break;
            case 2:
                this.c = jlVar;
                super("alpha", 0);
                break;
            default:
                this.c = jlVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.l6
    public final void c(Object obj, float f10) {
        switch (this.b) {
            case 0:
                ((org.telegram.messenger.ej) obj).e = f10;
                View view = this.c.c.Q.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 1:
                ((org.telegram.messenger.ej) obj).g = f10;
                View view2 = this.c.c.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            default:
                ((org.telegram.messenger.ej) obj).f = f10;
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
                return Float.valueOf(((org.telegram.messenger.ej) obj).e);
            case 1:
                return Float.valueOf(((org.telegram.messenger.ej) obj).g);
            default:
                return Float.valueOf(((org.telegram.messenger.ej) obj).f);
        }
    }
}
