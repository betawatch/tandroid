// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class iv6 {
    public final Object a;
    public final byte b;

    public iv6(Object obj) {
        this.a = obj;
        if (obj instanceof String) {
            this.b = (byte) 1;
        } else if (obj instanceof jw6) {
            this.b = (byte) 2;
        } else {
            iy8.d();
            throw null;
        }
    }
}
