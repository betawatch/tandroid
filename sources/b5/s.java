package b5;

import j4.i1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s {
    public final i1 a;
    public final int[] b;

    public s(int i9, i1 i1Var, int[] iArr) {
        if (iArr.length == 0) {
            d5.a.p("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = i1Var;
        this.b = iArr;
    }
}
