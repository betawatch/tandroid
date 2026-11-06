package a3;

import e2.m1;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class t {
    public final m1 a;
    public final int[] b;

    public t(m1 m1Var, int... iArr) {
        if (iArr.length == 0) {
            h2.a.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = m1Var;
        this.b = iArr;
    }
}
