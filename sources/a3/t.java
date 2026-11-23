package a3;

import e2.m1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
