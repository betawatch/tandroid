package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class o extends j7.w {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ s b;

    public o(p pVar, o oVar) {
        this.b = pVar;
    }

    @Override // j7.w
    public final View b(int i10) {
        switch (this.a) {
            case 0:
                Dialog dialog = ((p) this.b).s0;
                if (dialog != null) {
                    return dialog.findViewById(i10);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + this.b + " does not have a view");
        }
    }

    @Override // j7.w
    public final boolean c() {
        switch (this.a) {
            case 0:
                return ((p) this.b).w0;
            default:
                return false;
        }
    }

    public o(s sVar) {
        this.b = sVar;
    }
}
