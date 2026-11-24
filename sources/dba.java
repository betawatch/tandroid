// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class dba extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new dba());
    }

    public static c4c i(yl6 yl6Var, q8c q8cVar) {
        c4c K = c4c.K(dba.class);
        K.H = yl6Var;
        K.I = q8cVar;
        return K;
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        eba ebaVar = (eba) view;
        Object obj = c4cVar.H;
        if (obj instanceof k27) {
            ebaVar.f((k27) obj, z);
        } else if (obj instanceof yl6) {
            yl6 yl6Var = (yl6) obj;
            ebaVar.setTag(yl6Var);
            ebaVar.f(yl6Var.e, z);
        }
        Object obj2 = c4cVar.I;
        if (obj2 instanceof q8c) {
            ebaVar.setNeedPlayMessageListener((q8c) obj2);
        }
        ebaVar.e(c4cVar.e, false);
    }

    @Override // b4c
    public final boolean c(c4c c4cVar, c4c c4cVar2) {
        return c4cVar.d == c4cVar2.d && c4cVar.H == c4cVar2.H;
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        eba ebaVar = new eba(0, wjbVar, context);
        ebaVar.setCheckForButtonPress(true);
        return ebaVar;
    }

    @Override // b4c
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        return c4cVar.d == c4cVar2.d && c4cVar.H == c4cVar2.H;
    }
}
