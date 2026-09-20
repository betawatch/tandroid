package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class o extends v7.a0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ s b;

    public o(p pVar, o oVar) {
        this.b = pVar;
    }

    @Override // v7.a0
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

    @Override // v7.a0
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
