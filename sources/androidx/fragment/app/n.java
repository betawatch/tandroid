package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class n extends v7.a0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ r b;

    public n(o oVar, n nVar) {
        this.b = oVar;
    }

    @Override // v7.a0
    public final View b(int i10) {
        switch (this.a) {
            case 0:
                Dialog dialog = ((o) this.b).v0;
                if (dialog != null) {
                    return dialog.findViewById(i10);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + this.b + " does not have a view");
        }
    }

    @Override // v7.a0
    public final boolean c() {
        switch (this.a) {
            case 0:
                return ((o) this.b).z0;
            default:
                return false;
        }
    }

    public n(r rVar) {
        this.b = rVar;
    }
}
