package d9;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
