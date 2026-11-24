// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class ob9 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new ob9());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        pb9 pb9Var = (pb9) view;
        lk0 lk0Var = (lk0) c4cVar.H;
        nb9 nb9Var = (nb9) c4cVar.I;
        pb9Var.a = lk0Var;
        pb9Var.F = nb9Var;
        pb9Var.c(lk0Var);
        pb9Var.h();
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        pb9 pb9Var = new pb9(i, wjbVar, context);
        pb9Var.setBackground(new ed9(bkb.v0(bkb.c6, wjbVar)));
        return pb9Var;
    }

    @Override // b4c
    public final boolean f() {
        return false;
    }
}
