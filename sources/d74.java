// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class d74 {
    public final t1c a;
    public final int[] b;

    public d74(t1c t1cVar, int... iArr) {
        if (iArr.length == 0) {
            efd.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = t1cVar;
        this.b = iArr;
    }
}
