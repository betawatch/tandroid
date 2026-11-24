// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class k24 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new k24());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        l24 l24Var = (l24) view;
        l24Var.n = (p8c) c4cVar.H;
        l24Var.r = c4cVar;
        l24Var.b(c4cVar.A, false);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new l24(context, wjbVar);
    }
}
