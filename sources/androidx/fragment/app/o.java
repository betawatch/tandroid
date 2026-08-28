package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o extends f7.a0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ s b;

    public o(p pVar, o oVar) {
        this.b = pVar;
    }

    @Override // f7.a0
    public final View b(int i9) {
        switch (this.a) {
            case 0:
                Dialog dialog = ((p) this.b).r0;
                if (dialog != null) {
                    return dialog.findViewById(i9);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + this.b + " does not have a view");
        }
    }

    @Override // f7.a0
    public final boolean c() {
        switch (this.a) {
            case 0:
                return ((p) this.b).v0;
            default:
                return false;
        }
    }

    public o(s sVar) {
        this.b = sVar;
    }
}
