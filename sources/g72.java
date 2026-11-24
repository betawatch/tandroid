// default package

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g72 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o72 b;

    public /* synthetic */ g72(o72 o72Var, byte b) {
        this.a = b;
        this.b = o72Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        o72 o72Var = this.b;
        switch (b) {
            case 0:
                AtomicReference atomicReference = o72Var.n;
                jia jiaVar = (jia) atomicReference.get();
                if (jiaVar != null) {
                    o72Var.removeView(jiaVar);
                    atomicReference.set(null);
                    break;
                }
                break;
            case 1:
                AtomicReference atomicReference2 = o72Var.w;
                jia jiaVar2 = (jia) atomicReference2.get();
                if (jiaVar2 != null) {
                    o72Var.removeView(jiaVar2);
                    atomicReference2.set(null);
                    if (!o72Var.b) {
                        o72Var.setClipChildren(true);
                        break;
                    }
                }
                break;
            default:
                o72Var.k0 = false;
                o72Var.i0.c(false);
                if (o72Var.a()) {
                    o72Var.f();
                    break;
                }
                break;
        }
    }
}
