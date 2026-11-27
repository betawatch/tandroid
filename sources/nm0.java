// default package

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
