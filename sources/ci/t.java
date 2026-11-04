package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.vj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t extends f61 {
    public final u[] a = new u[3];
    public final /* synthetic */ Context b;
    public final /* synthetic */ vj0 c;
    public final /* synthetic */ v d;

    public t(v vVar, Context context, vj0 vj0Var) {
        this.d = vVar;
        this.b = context;
        this.c = vj0Var;
    }

    @Override // org.telegram.ui.Components.f61
    public final void b(View view, int i3, int i10) {
        this.c.L(view);
    }

    @Override // org.telegram.ui.Components.f61
    public final View d(int i3) {
        u[] uVarArr = this.a;
        if (uVarArr[i3] == null) {
            uVarArr[i3] = new u(this.d, this.b, i3);
        }
        return uVarArr[i3];
    }

    @Override // org.telegram.ui.Components.f61
    public final int e() {
        return this.a.length;
    }

    @Override // org.telegram.ui.Components.f61
    public final CharSequence g(int i3) {
        return bd.M0(i3 == 1 ? 2131744929 : i3 == 2 ? 2131744928 : 2131744930, null);
    }

    @Override // org.telegram.ui.Components.f61
    public final int h(int i3) {
        return i3;
    }
}
