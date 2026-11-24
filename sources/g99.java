// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class g99 extends b4c {
    static {
        b4c.h(new g99());
    }

    public static c4c i(String str) {
        c4c K = c4c.K(g99.class);
        K.m = str;
        return K;
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ((h99) view).set(c4cVar.m);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new h99(context, wjbVar);
    }
}
