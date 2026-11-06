package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m61;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class h1 extends m61 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ k2 c;

    public h1(k2 k2Var, boolean z9, Context context) {
        this.c = k2Var;
        this.a = z9;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.m61
    public final void b(View view, int i7, int i10) {
        u1 u1Var = (u1) view;
        if (this.a) {
            i7 = 1;
        }
        u1Var.a(i7);
    }

    @Override // org.telegram.ui.Components.m61
    public final View d(int i7) {
        Context context = this.b;
        k2 k2Var = this.c;
        return i7 == 1 ? new t1(k2Var, context) : new z1(k2Var, context);
    }

    @Override // org.telegram.ui.Components.m61
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.m61
    public final int h(int i7) {
        return (i7 == 0 || i7 == 1) ? 0 : 1;
    }
}
