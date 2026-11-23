package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b71;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class j1 extends b71 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ i2 c;

    public j1(i2 i2Var, boolean z10, Context context) {
        this.c = i2Var;
        this.a = z10;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.b71
    public final void b(View view, int i7, int i10) {
        u1 u1Var = (u1) view;
        if (this.a) {
            i7 = 1;
        }
        u1Var.a(i7);
    }

    @Override // org.telegram.ui.Components.b71
    public final View d(int i7) {
        Context context = this.b;
        i2 i2Var = this.c;
        return i7 == 1 ? new t1(i2Var, context) : new y1(i2Var, context);
    }

    @Override // org.telegram.ui.Components.b71
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.b71
    public final int h(int i7) {
        return (i7 == 0 || i7 == 1) ? 0 : 1;
    }
}
