// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class kv5 extends iv5 {
    public final sv5 e;
    public final lv5 f;
    public final yg2 h;
    public final Object n;

    public kv5(sv5 sv5Var, lv5 lv5Var, yg2 yg2Var, Object obj) {
        this.e = sv5Var;
        this.f = lv5Var;
        this.h = yg2Var;
        this.n = obj;
    }

    @Override // iv5
    public final boolean k() {
        return false;
    }

    @Override // iv5
    public final void l(Throwable th) {
        yg2 yg2Var = this.h;
        yg2 E = sv5.E(yg2Var);
        sv5 sv5Var = this.e;
        lv5 lv5Var = this.f;
        Object obj = this.n;
        if (E == null || !sv5Var.O(lv5Var, E, obj)) {
            lv5Var.a.c(new g76(2), 2);
            yg2 E2 = sv5.E(yg2Var);
            if (E2 == null || !sv5Var.O(lv5Var, E2, obj)) {
                sv5Var.f(sv5Var.p(lv5Var, obj));
            }
        }
    }
}
