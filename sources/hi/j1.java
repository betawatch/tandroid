package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.n61;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class j1 extends n61 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ i2 c;

    public j1(i2 i2Var, boolean z10, Context context) {
        this.c = i2Var;
        this.a = z10;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.n61
    public final void b(View view, int i7, int i10) {
        u1 u1Var = (u1) view;
        if (this.a) {
            i7 = 1;
        }
        u1Var.a(i7);
    }

    @Override // org.telegram.ui.Components.n61
    public final View d(int i7) {
        Context context = this.b;
        i2 i2Var = this.c;
        return i7 == 1 ? new t1(i2Var, context) : new y1(i2Var, context);
    }

    @Override // org.telegram.ui.Components.n61
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.n61
    public final int h(int i7) {
        return (i7 == 0 || i7 == 1) ? 0 : 1;
    }
}
