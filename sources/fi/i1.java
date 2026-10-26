package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m91;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class i1 extends m91 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ l2 c;

    public i1(l2 l2Var, boolean z10, Context context) {
        this.c = l2Var;
        this.a = z10;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.m91
    public final void b(View view, int i10, int i11) {
        v1 v1Var = (v1) view;
        if (this.a) {
            i10 = 1;
        }
        v1Var.a(i10);
    }

    @Override // org.telegram.ui.Components.m91
    public final View d(int i10) {
        Context context = this.b;
        l2 l2Var = this.c;
        return i10 == 1 ? new u1(l2Var, context) : new z1(l2Var, context);
    }

    @Override // org.telegram.ui.Components.m91
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.m91
    public final int h(int i10) {
        return (i10 == 0 || i10 == 1) ? 0 : 1;
    }
}
