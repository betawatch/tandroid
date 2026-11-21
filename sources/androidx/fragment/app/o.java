package androidx.fragment.app;

import a8.z6;
import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
