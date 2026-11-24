// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class g76 extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new g76());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        ((h76) view).set((j76) c4cVar.H);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new h76(context);
    }

    @Override // b4c
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        return c4cVar.H == c4cVar2.H;
    }
}
