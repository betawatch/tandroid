// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ba3 implements b86, t69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ba3(uj ujVar, int i, cg8 cg8Var, cg8 cg8Var2) {
        this.b = ujVar;
        this.a = i;
    }

    @Override // t69
    public final boolean e(int i, View view) {
        h49 h49Var;
        i49 i49Var = (i49) this.b;
        if (this.a == 5 || (h49Var = i49Var.h0) == null || !(view instanceof g49)) {
            return false;
        }
        h49Var.e(i49Var, ((g49) view).e, true, false);
        return true;
    }

    @Override // b86
    public final void invoke(Object obj) {
        uj ujVar = (uj) this.b;
        vj vjVar = (vj) obj;
        vjVar.getClass();
        vjVar.y(ujVar, this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ba3(i49 i49Var, int i) {
        this.b = i49Var;
        this.a = i;
    }
}
