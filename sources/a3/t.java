package a3;

import e2.m1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
