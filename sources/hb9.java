// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class hb9 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new hb9());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ((ib9) view).h((lk0) c4cVar.H, (se9) c4cVar.I);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        ib9 ib9Var = new ib9(i, wjbVar, context);
        ib9Var.setBackground(new ed9(bkb.v0(bkb.c6, wjbVar)));
        return ib9Var;
    }

    @Override // b4c
    public final boolean f() {
        return false;
    }
}
