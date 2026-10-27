package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.n91;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class i1 extends n91 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ l2 c;

    public i1(l2 l2Var, boolean z10, Context context) {
        this.c = l2Var;
        this.a = z10;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.n91
    public final void b(View view, int i10, int i11) {
        v1 v1Var = (v1) view;
        if (this.a) {
            i10 = 1;
        }
        v1Var.a(i10);
    }

    @Override // org.telegram.ui.Components.n91
    public final View d(int i10) {
        Context context = this.b;
        l2 l2Var = this.c;
        return i10 == 1 ? new u1(l2Var, context) : new z1(l2Var, context);
    }

    @Override // org.telegram.ui.Components.n91
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.n91
    public final int h(int i10) {
        return (i10 == 0 || i10 == 1) ? 0 : 1;
    }
}
