// default package

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nm0 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ l01 c;

    public /* synthetic */ nm0(AtomicBoolean atomicBoolean, l01 l01Var, byte b) {
        this.a = b;
        this.b = atomicBoolean;
        this.c = l01Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        l01 l01Var = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (b) {
            case 0:
                if (!atomicBoolean.get()) {
                    l01Var.b();
                    break;
                }
                break;
            default:
                if (!atomicBoolean.get() && l01Var != null) {
                    l01Var.b();
                    break;
                }
                break;
        }
    }
}
