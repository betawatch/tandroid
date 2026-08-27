package oh;

import android.view.View;
import org.telegram.ui.Components.g71;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class b0 extends g71 {
    public final /* synthetic */ j0 a;

    public b0(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // org.telegram.ui.Components.g71
    public final void b(View view, int i10, int i11) {
        ((g0) view).getClass();
    }

    @Override // org.telegram.ui.Components.g71
    public final View d(int i10) {
        j0 j0Var = this.a;
        return i10 == 2 ? j0Var.x : i10 == 0 ? j0Var.v : j0Var.w;
    }

    @Override // org.telegram.ui.Components.g71
    public final int e() {
        return this.a.J ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.g71
    public final int h(int i10) {
        if (this.a.J || i10 == 2) {
            return 2;
        }
        return i10 == 0 ? 0 : 1;
    }
}
