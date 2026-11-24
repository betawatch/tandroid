// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class bh7 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new bh7());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ch7 ch7Var = (ch7) view;
        ch7Var.a(c4cVar.d, c4cVar.A, (f4b) c4cVar.H);
        ch7Var.b(c4cVar.e, false);
        boolean z2 = c4cVar.f;
        if (ch7Var.h != z2) {
            ch7Var.h = z2;
            ch7Var.G.a(z2);
            ch7Var.invalidate();
        }
        ch7Var.setOnCheckboxClick(c4cVar.E);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new ch7(context, wjbVar);
    }
}
