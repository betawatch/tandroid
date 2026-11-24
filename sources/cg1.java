// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class cg1 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new cg1());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        dg1 dg1Var = (dg1) view;
        CharSequence charSequence = c4cVar.m;
        CharSequence charSequence2 = c4cVar.n;
        dg1Var.setText(charSequence);
        dg1Var.r.setText(charSequence2);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new dg1(context, wjbVar);
    }

    @Override // b4c
    public final boolean f() {
        return false;
    }
}
