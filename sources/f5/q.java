package f5;

import o4.s0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class q {
    public final s0 a;
    public final int[] b;

    public q(int i10, s0 s0Var, int[] iArr) {
        if (iArr.length == 0) {
            h5.a.p("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = s0Var;
        this.b = iArr;
    }
}
