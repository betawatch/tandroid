// default package

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class n14 implements Runnable {
    public final /* synthetic */ o14 a;

    public n14(o14 o14Var) {
        this.a = o14Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.w;
        vx3 vx3Var = new vx3(this, str, (byte) 5);
        if (pv3.d(str)) {
            t2b.G3.c(yac.t0, str, new rx1((Object) linkedHashSet, (Object) vx3Var, (byte) 17));
        } else {
            vx3Var.run();
        }
    }
}
