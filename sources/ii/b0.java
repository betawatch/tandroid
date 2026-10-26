package ii;

import android.view.View;
import org.telegram.ui.Components.m91;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class b0 extends m91 {
    public final /* synthetic */ j0 a;

    public b0(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // org.telegram.ui.Components.m91
    public final void b(View view, int i10, int i11) {
        ((g0) view).getClass();
    }

    @Override // org.telegram.ui.Components.m91
    public final View d(int i10) {
        j0 j0Var = this.a;
        return i10 == 2 ? j0Var.x : i10 == 0 ? j0Var.v : j0Var.w;
    }

    @Override // org.telegram.ui.Components.m91
    public final int e() {
        return this.a.N ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.m91
    public final int h(int i10) {
        if (this.a.N || i10 == 2) {
            return 2;
        }
        return i10 == 0 ? 0 : 1;
    }
}
