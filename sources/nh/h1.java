package nh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.q71;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class h1 extends q71 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ k2 c;

    public h1(k2 k2Var, boolean z10, Context context) {
        this.c = k2Var;
        this.a = z10;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.q71
    public final void b(View view, int i10, int i11) {
        u1 u1Var = (u1) view;
        if (this.a) {
            i10 = 1;
        }
        u1Var.a(i10);
    }

    @Override // org.telegram.ui.Components.q71
    public final View d(int i10) {
        Context context = this.b;
        k2 k2Var = this.c;
        return i10 == 1 ? new t1(k2Var, context) : new y1(k2Var, context);
    }

    @Override // org.telegram.ui.Components.q71
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.q71
    public final int h(int i10) {
        return (i10 == 0 || i10 == 1) ? 0 : 1;
    }
}
