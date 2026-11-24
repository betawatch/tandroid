// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class dc9 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new dc9());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ec9 ec9Var = (ec9) view;
        lk0 lk0Var = (lk0) c4cVar.H;
        vd9 vd9Var = (vd9) c4cVar.I;
        ec9Var.a = lk0Var;
        ec9Var.w = vd9Var;
        ec9Var.x = k96.a0;
        ec9Var.c(lk0Var);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new ec9(context, wjbVar);
    }

    @Override // b4c
    public final boolean f() {
        return false;
    }
}
