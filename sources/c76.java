// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class c76 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new c76());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ((d76) view).set((i76) c4cVar.H);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        d76 d76Var = new d76(i, context, false);
        d76Var.setLayoutParams(new e49(-2, -2));
        return d76Var;
    }

    @Override // b4c
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        return c4cVar.H == c4cVar2.H;
    }
}
