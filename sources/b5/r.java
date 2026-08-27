package b5;

import j4.i1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r {
    public final i1 a;
    public final int[] b;

    public r(int i10, i1 i1Var, int[] iArr) {
        if (iArr.length == 0) {
            d5.a.p("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = i1Var;
        this.b = iArr;
    }
}
