package androidx.fragment.app;

import a8.x6;
import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class n extends x6 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ r b;

    public n(o oVar, n nVar) {
        this.b = oVar;
    }

    @Override // a8.x6
    public final View b(int i7) {
        switch (this.a) {
            case 0:
                Dialog dialog = ((o) this.b).v0;
                if (dialog != null) {
                    return dialog.findViewById(i7);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + this.b + " does not have a view");
        }
    }

    @Override // a8.x6
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
