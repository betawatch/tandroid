package lh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.g71;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class i1 extends g71 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ l2 c;

    public i1(l2 l2Var, boolean z10, Context context) {
        this.c = l2Var;
        this.a = z10;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.g71
    public final void b(View view, int i10, int i11) {
        v1 v1Var = (v1) view;
        if (this.a) {
            i10 = 1;
        }
        v1Var.a(i10);
    }

    @Override // org.telegram.ui.Components.g71
    public final View d(int i10) {
        Context context = this.b;
        l2 l2Var = this.c;
        return i10 == 1 ? new u1(l2Var, context) : new z1(l2Var, context);
    }

    @Override // org.telegram.ui.Components.g71
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.g71
    public final int h(int i10) {
        return (i10 == 0 || i10 == 1) ? 0 : 1;
    }
}
