// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class jt9 {
    public boolean a;
    public boolean b;
    public long c = 104857600;

    public final boolean a() {
        return this.a || this.b;
    }

    public void b() {
        if (a()) {
            this.b = false;
            this.a = false;
        } else {
            this.a = true;
            this.b = true;
        }
    }
}
