package androidx.fragment.app;

import a8.a7;
import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class o extends a7 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ s b;

    public o(p pVar, o oVar) {
        this.b = pVar;
    }

    @Override // a8.a7
    public final View b(int i7) {
        switch (this.a) {
            case 0:
                Dialog dialog = ((p) this.b).w0;
                if (dialog != null) {
                    return dialog.findViewById(i7);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + this.b + " does not have a view");
        }
    }

    @Override // a8.a7
    public final boolean c() {
        switch (this.a) {
            case 0:
                return ((p) this.b).A0;
            default:
                return false;
        }
    }

    public o(s sVar) {
        this.b = sVar;
    }
}
