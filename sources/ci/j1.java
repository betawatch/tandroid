package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.z71;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class j1 extends z71 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ s2 c;

    public j1(s2 s2Var, boolean z10, Context context) {
        this.c = s2Var;
        this.a = z10;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.z71
    public final void b(View view, int i10, int i11) {
        a2 a2Var = (a2) view;
        if (this.a) {
            i10 = 1;
        }
        a2Var.a(i10);
    }

    @Override // org.telegram.ui.Components.z71
    public final View d(int i10) {
        Context context = this.b;
        s2 s2Var = this.c;
        return i10 == 1 ? new z1(s2Var, context) : new e2(s2Var, context);
    }

    @Override // org.telegram.ui.Components.z71
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.z71
    public final int h(int i10) {
        return (i10 == 0 || i10 == 1) ? 0 : 1;
    }
}
