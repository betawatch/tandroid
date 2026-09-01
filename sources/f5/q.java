package f5;

import o4.s0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
