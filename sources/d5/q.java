package d5;

import l4.j1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q {
    public final j1 a;
    public final int[] b;

    public q(int i10, j1 j1Var, int[] iArr) {
        if (iArr.length == 0) {
            f5.a.p("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = j1Var;
        this.b = iArr;
    }
}
