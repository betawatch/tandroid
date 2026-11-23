package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c71;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class r1 extends c71 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ r2 c;

    public r1(r2 r2Var, boolean z10, Context context) {
        this.c = r2Var;
        this.a = z10;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.c71
    public final void b(View view, int i7, int i10) {
        c2 c2Var = (c2) view;
        if (this.a) {
            i7 = 1;
        }
        c2Var.a(i7);
    }

    @Override // org.telegram.ui.Components.c71
    public final View d(int i7) {
        Context context = this.b;
        r2 r2Var = this.c;
        return i7 == 1 ? new b2(r2Var, context) : new g2(r2Var, context);
    }

    @Override // org.telegram.ui.Components.c71
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.c71
    public final int h(int i7) {
        return (i7 == 0 || i7 == 1) ? 0 : 1;
    }
}
