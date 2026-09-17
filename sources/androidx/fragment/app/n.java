package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
