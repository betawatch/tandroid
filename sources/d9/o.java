package d9;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class o implements n, he.b, ib.b, q5.b {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ o(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public static o b(Object obj) {
        if (obj != null) {
            return new o(obj, 2);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // d9.r
    public Object a() {
        return this.b;
    }

    @Override // fd.a
    public Object get() {
        switch (this.a) {
        }
        return this.b;
    }
}
