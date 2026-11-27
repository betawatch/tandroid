// default package

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
