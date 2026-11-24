// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h93 implements x56, e39 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h93(tj tjVar, int i, nc8 nc8Var, nc8 nc8Var2) {
        this.b = tjVar;
        this.a = i;
    }

    @Override // e39
    public final boolean d(int i, View view) {
        s09 s09Var;
        t09 t09Var = (t09) this.b;
        if (this.a == 5 || (s09Var = t09Var.h0) == null || !(view instanceof r09)) {
            return false;
        }
        s09Var.q(t09Var, ((r09) view).e, true, false);
        return true;
    }

    @Override // x56
    public final void invoke(Object obj) {
        tj tjVar = (tj) this.b;
        uj ujVar = (uj) obj;
        ujVar.getClass();
        ujVar.y(tjVar, this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h93(t09 t09Var, int i) {
        this.b = t09Var;
        this.a = i;
    }
}
