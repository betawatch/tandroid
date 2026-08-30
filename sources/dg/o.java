package dg;

import org.telegram.ui.ft0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ ft0 b;

    public /* synthetic */ o(ft0 ft0Var, int i10) {
        this.a = i10;
        this.b = ft0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                e1.Z(this.b, (Integer) obj);
                break;
            default:
                e1.c0(this.b, (Integer) obj);
                break;
        }
    }
}
