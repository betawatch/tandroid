package bg;

import org.telegram.ui.ws0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ ws0 b;

    public /* synthetic */ p(ws0 ws0Var, int i10) {
        this.a = i10;
        this.b = ws0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                g1.Z(this.b, (Integer) obj);
                break;
            default:
                g1.c0(this.b, (Integer) obj);
                break;
        }
    }
}
