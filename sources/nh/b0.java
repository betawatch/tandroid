package nh;

import android.view.View;
import org.telegram.ui.Components.e71;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class b0 extends e71 {
    public final /* synthetic */ j0 a;

    public b0(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // org.telegram.ui.Components.e71
    public final void b(View view, int i9, int i10) {
        ((g0) view).getClass();
    }

    @Override // org.telegram.ui.Components.e71
    public final View d(int i9) {
        j0 j0Var = this.a;
        return i9 == 2 ? j0Var.x : i9 == 0 ? j0Var.v : j0Var.w;
    }

    @Override // org.telegram.ui.Components.e71
    public final int e() {
        return this.a.J ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.e71
    public final int h(int i9) {
        if (this.a.J || i9 == 2) {
            return 2;
        }
        return i9 == 0 ? 0 : 1;
    }
}
