package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class o extends v7.x {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ s b;

    public o(p pVar, o oVar) {
        this.b = pVar;
    }

    @Override // v7.x
    public final View b(int i10) {
        switch (this.a) {
            case 0:
                Dialog dialog = ((p) this.b).v0;
                if (dialog != null) {
                    return dialog.findViewById(i10);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + this.b + " does not have a view");
        }
    }

    @Override // v7.x
    public final boolean c() {
        switch (this.a) {
            case 0:
                return ((p) this.b).z0;
            default:
                return false;
        }
    }

    public o(s sVar) {
        this.b = sVar;
    }
}
