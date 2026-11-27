// default package

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
