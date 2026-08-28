package kh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e71;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class k1 extends e71 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ n2 c;

    public k1(n2 n2Var, boolean z10, Context context) {
        this.c = n2Var;
        this.a = z10;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.e71
    public final void b(View view, int i9, int i10) {
        x1 x1Var = (x1) view;
        if (this.a) {
            i9 = 1;
        }
        x1Var.a(i9);
    }

    @Override // org.telegram.ui.Components.e71
    public final View d(int i9) {
        Context context = this.b;
        n2 n2Var = this.c;
        return i9 == 1 ? new w1(n2Var, context) : new b2(n2Var, context);
    }

    @Override // org.telegram.ui.Components.e71
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.e71
    public final int h(int i9) {
        return (i9 == 0 || i9 == 1) ? 0 : 1;
    }
}
