package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.f61;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h1 extends f61 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ i2 c;

    public h1(i2 i2Var, boolean z10, Context context) {
        this.c = i2Var;
        this.a = z10;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.f61
    public final void b(View view, int i3, int i10) {
        u1 u1Var = (u1) view;
        if (this.a) {
            i3 = 1;
        }
        u1Var.a(i3);
    }

    @Override // org.telegram.ui.Components.f61
    public final View d(int i3) {
        Context context = this.b;
        i2 i2Var = this.c;
        return i3 == 1 ? new t1(i2Var, context) : new y1(i2Var, context);
    }

    @Override // org.telegram.ui.Components.f61
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.f61
    public final int h(int i3) {
        return (i3 == 0 || i3 == 1) ? 0 : 1;
    }
}
