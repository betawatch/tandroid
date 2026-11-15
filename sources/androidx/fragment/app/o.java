package androidx.fragment.app;

import a8.z6;
import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class o extends z6 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ s b;

    public o(p pVar, o oVar) {
        this.b = pVar;
    }

    @Override // a8.z6
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

    @Override // a8.z6
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
